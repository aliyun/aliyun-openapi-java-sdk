package com.aliyuncs.http.clients;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import javax.net.ssl.SSLContext;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.EntityBuilder;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLInitializationException;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultConnectionKeepAliveStrategy;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.protocol.HttpContext;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.TrustStrategy;
import org.apache.http.util.EntityUtils;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.CallBack;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpClientConfig;
import com.aliyuncs.http.HttpRequest;
import com.aliyuncs.http.IHttpClient;
import com.aliyuncs.utils.IOUtils;
import com.aliyuncs.utils.StringUtils;

public class ApacheHttpClient extends IHttpClient {

    protected static final String CONTENT_TYPE = "Content-Type";
    protected static final String ACCEPT_ENCODING = "Accept-Encoding";

    private static final String EXT_PARAM_KEY_BUILDER = "apache.httpclient.builder";
    private static final int DEFAULT_THREAD_KEEP_ALIVE_TIME = 60;

    private ExecutorService executorService;
    private CloseableHttpClient httpClient;
    private PoolingHttpClientConnectionManager connectionManager;

    private static volatile ApacheHttpClient client;

    public static ApacheHttpClient getInstance(HttpClientConfig config) throws ClientException {
        if (client == null) {
            synchronized (ApacheHttpClient.class) {
                if (client == null) {
                    client = new ApacheHttpClient(config);
                }
            }
        }
        return client;
    }

    private ApacheHttpClient(HttpClientConfig config) throws ClientException {
        super(config);
    }

    @Override
    protected void init(final HttpClientConfig config) throws ClientException {
        HttpClientBuilder builder;
        if (config.containsExtParam(EXT_PARAM_KEY_BUILDER)) {
            builder = (HttpClientBuilder) config.getExtParam(EXT_PARAM_KEY_BUILDER);
        } else {
            builder = HttpClientBuilder.create();
        }

        // default request config
        RequestConfig defaultConfig = RequestConfig.custom().setConnectTimeout((int) config
                .getConnectionTimeoutMillis()).setSocketTimeout((int) config.getReadTimeoutMillis())
                .setConnectionRequestTimeout((int) config.getWriteTimeoutMillis()).build();
        builder.setDefaultRequestConfig(defaultConfig);

        // http
        RegistryBuilder<ConnectionSocketFactory> socketFactoryRegistryBuilder = RegistryBuilder.create();
        socketFactoryRegistryBuilder.register("http", new PlainConnectionSocketFactory());

        // https
        // register default https connector(ignore untrusted cert)
        try {
            SSLContext sslContext = new SSLContextBuilder().loadTrustMaterial(null, new TrustStrategy() {
                // trust all
                @Override
                public boolean isTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                    return true;
                }
            }).build();

            SSLConnectionSocketFactory connectionFactory = new SSLConnectionSocketFactory(sslContext,
                    NoopHostnameVerifier.INSTANCE);

            socketFactoryRegistryBuilder.register("https", connectionFactory);

        } catch (Exception e) {
            throw new ClientException("SDK.InitFailed", "Init https with SSL certs ignore failed", e);
        }

        // override default https connector if possible
        if (!config.isIgnoreSSLCerts()) {
            if (config.getSslSocketFactory() != null) {
                SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(config
                        .getSslSocketFactory(), config.getHostnameVerifier());
                socketFactoryRegistryBuilder.register("https", sslConnectionSocketFactory);
            } else if (config.getKeyManagers() != null || config.getX509TrustManagers() != null || config
                    .getSecureRandom() != null) {
                try {
                    SSLContext sslContext = SSLContext.getInstance("TLS");
                    sslContext.init(config.getKeyManagers(), config.getX509TrustManagers(), config.getSecureRandom());
                    SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(sslContext);
                    socketFactoryRegistryBuilder.register("https", sslConnectionSocketFactory);
                } catch (NoSuchAlgorithmException e1) {
                    throw new SSLInitializationException(e1.getMessage(), e1);
                } catch (KeyManagementException e2) {
                    throw new SSLInitializationException(e2.getMessage(), e2);
                }
            }
        }

        // connPool
        connectionManager = new PoolingHttpClientConnectionManager(socketFactoryRegistryBuilder.build());
        connectionManager.setMaxTotal(config.getMaxRequests());
        connectionManager.setDefaultMaxPerRoute(config.getMaxRequestsPerHost());
        builder.setConnectionManager(connectionManager);
        ApacheIdleConnectionCleaner.registerConnectionManager(connectionManager, config.getMaxIdleTimeMillis());

        // async
        if (config.getExecutorService() == null) {
            executorService = new ThreadPoolExecutor(0, config.getMaxRequests(), DEFAULT_THREAD_KEEP_ALIVE_TIME,
                    TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), new DefaultAsyncThreadFactory());
        } else {
            executorService = config.getExecutorService();
        }

        // keepAlive
        if (config.getKeepAliveDurationMillis() > 0) {
            builder.setKeepAliveStrategy(new ConnectionKeepAliveStrategy() {
                @Override
                public long getKeepAliveDuration(HttpResponse response, HttpContext context) {
                    long duration = DefaultConnectionKeepAliveStrategy.INSTANCE.getKeepAliveDuration(response, context);

                    if (duration > 0 && duration < config.getKeepAliveDurationMillis()) {
                        return duration;
                    } else {
                        return config.getKeepAliveDurationMillis();
                    }
                }
            });
        }

        httpClient = builder.build();
    }

    private HttpUriRequest parseToHttpRequest(HttpRequest apiReq) throws IOException {
        RequestBuilder builder = RequestBuilder.create(apiReq.getSysMethod().name());

        builder.setUri(apiReq.getSysUrl());

        if (apiReq.getSysMethod().hasContent()) {
            EntityBuilder bodyBuilder = EntityBuilder.create();

            String contentType = apiReq.getHeaderValue(CONTENT_TYPE);
            if (StringUtils.isEmpty(contentType)) {
                contentType = apiReq.getContentTypeValue(apiReq.getHttpContentType(), apiReq.getSysEncoding());
            }
            bodyBuilder.setContentType(ContentType.parse(contentType));
            bodyBuilder.setBinary(apiReq.getHttpContent());
            builder.setEntity(bodyBuilder.build());
        }

        builder.addHeader(ACCEPT_ENCODING, "identity");

        for (Map.Entry<String, String> entry : apiReq.getSysHeaders().entrySet()) {
            if ("Content-Length".equalsIgnoreCase(entry.getKey())) {
                continue;
            }
            builder.addHeader(entry.getKey(), entry.getValue());
        }
        int connectTimeout;
        int readTimeout;
        if (null != apiReq.getSysConnectTimeout()) {
            connectTimeout = apiReq.getSysConnectTimeout();
        } else {
            connectTimeout = (int) clientConfig.getConnectionTimeoutMillis();
        }
        if (null != apiReq.getSysReadTimeout()) {
            readTimeout = apiReq.getSysReadTimeout();
        } else {
            readTimeout = (int) clientConfig.getReadTimeoutMillis();
        }
        RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(connectTimeout).setSocketTimeout(
                readTimeout).setConnectionRequestTimeout((int) clientConfig.getWriteTimeoutMillis()).build();
        builder.setConfig(requestConfig);
        return builder.build();
    }

    private com.aliyuncs.http.HttpResponse parseToHttpResponse(HttpResponse httpResponse) throws IOException {
        com.aliyuncs.http.HttpResponse result = new com.aliyuncs.http.HttpResponse();

        // status code
        result.setStatus(httpResponse.getStatusLine().getStatusCode());
        if ((httpResponse.getEntity() != null && (httpResponse.getEntity().getContentLength() > 0 || httpResponse
                .getEntity().isChunked()))) {
            // content type
            Header contentTypeHeader = httpResponse.getEntity().getContentType();
            ContentType contentType = ContentType.parse(contentTypeHeader.getValue());
            FormatType formatType = FormatType.mapAcceptToFormat(contentType.getMimeType());
            result.setHttpContentType(formatType);

            String charset = "utf-8";
            if (contentType.getCharset() != null) {
                charset = contentType.getCharset().toString();
            }

            // body
            result.setHttpContent(EntityUtils.toByteArray(httpResponse.getEntity()), charset, formatType);
        }

        // headers
        for (Header header : httpResponse.getAllHeaders()) {
            result.putHeaderParameter(header.getName(), header.getValue());
        }

        return result;
    }

    @Override
    public final com.aliyuncs.http.HttpResponse syncInvoke(HttpRequest apiRequest) throws IOException {
        HttpUriRequest httpRequest = parseToHttpRequest(apiRequest);
        CloseableHttpResponse httpResponse = null;
        try {
            httpResponse = httpClient.execute(httpRequest);
            return parseToHttpResponse(httpResponse);
        } finally {
            IOUtils.closeQuietly(httpResponse);
        }
    }

    @Override
    public final Future<com.aliyuncs.http.HttpResponse> asyncInvoke(final HttpRequest apiRequest,
            final CallBack callback) {
        return executorService.submit(new Callable<com.aliyuncs.http.HttpResponse>() {
            @Override
            public com.aliyuncs.http.HttpResponse call() throws Exception {
                com.aliyuncs.http.HttpResponse result;
                try {
                    result = syncInvoke(apiRequest);
                } catch (Exception e) {
                    if (callback != null) {
                        callback.onFailure(apiRequest, e);
                    }
                    throw e;
                }

                if (callback != null) {
                    callback.onResponse(apiRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public void ignoreSSLCertificate() {
        throw new IllegalStateException("Apache httpclient does not support modify sslFactory after inited, "
                + "use HttpClientConfig.setIgnoreSSLCerts(true) while building client");
    }

    @Override
    public void restoreSSLCertificate() {
        throw new IllegalStateException("Apache httpclient does not support modify sslFactory after inited, "
                + "use HttpClientConfig.setIgnoreSSLCerts(true) while building client");
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public void close() throws IOException {
        client = null;
        executorService.shutdown();
        ApacheIdleConnectionCleaner.removeConnectionManager(connectionManager);
        connectionManager.shutdown();
        IOUtils.closeQuietly(httpClient);
    }

    private class DefaultAsyncThreadFactory implements ThreadFactory {

        private AtomicInteger counter = new AtomicInteger(0);

        @Override
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "Aliyun_SDK_Async_ThreadPool_" + counter.incrementAndGet());
        }
    }

}
