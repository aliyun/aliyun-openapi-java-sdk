package com.aliyuncs.http.clients;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.*;
import com.aliyuncs.utils.EnvironmentUtils;
import com.aliyuncs.utils.StringUtils;
import org.apache.http.conn.ssl.DefaultHostnameVerifier;
import org.apache.http.conn.ssl.NoopHostnameVerifier;

import javax.net.ssl.*;
import javax.xml.bind.DatatypeConverter;
import java.io.*;
import java.net.*;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Future;

public class CompatibleUrlConnClient extends IHttpClient {

    protected static final String CONTENT_TYPE = "Content-Type";
    protected static final String ACCEPT_ENCODING = "Accept-Encoding";

    public CompatibleUrlConnClient(HttpClientConfig clientConfig) throws ClientException {
        super(clientConfig);
    }

    public static HttpResponse compatibleGetResponse(HttpRequest request) throws IOException, ClientException {
        CompatibleUrlConnClient client = new CompatibleUrlConnClient(null);
        HttpResponse response = client.syncInvoke(request);
        client.close();
        return response;
    }

    @Override
    protected void init(HttpClientConfig clientConfig) {
    }

    @Override
    public HttpResponse syncInvoke(HttpRequest request) throws IOException, ClientException {
        InputStream content = null;
        HttpResponse response = null;
        HttpURLConnection httpConn = buildHttpConnection(request);
        OutputStream out = null;

        try {
            httpConn.connect();
            if (null != request.getHttpContent() && request.getHttpContent().length > 0) {
                out = httpConn.getOutputStream();
                if (request.getSysMethod().hasContent()) {
                    out.write(request.getHttpContent());
                }
                out.flush();

            }

            content = httpConn.getInputStream();
            response = new HttpResponse(httpConn.getURL().toString());
            parseHttpConn(response, httpConn, content);
            return response;
        } catch (IOException e) {
            content = httpConn.getErrorStream();
            response = new HttpResponse(httpConn.getURL().toString());
            parseHttpConn(response, httpConn, content);
            return response;
        } finally {
            if (content != null) {
                content.close();
            }
            httpConn.disconnect();
        }
    }

    @Override
    public Future<HttpResponse> asyncInvoke(HttpRequest apiRequest, CallBack callback) {
        throw new IllegalStateException("not supported");
    }

    private SSLSocketFactory createSSLSocketFactory(HttpRequest request) throws ClientException {
        try {
            boolean ignoreSSLCert = request.isIgnoreSSLCerts() ? request.isIgnoreSSLCerts() : clientConfig.isIgnoreSSLCerts();
            X509TrustManager[] trustManagers = null;
            KeyManager[] keyManagers = null;
            if (clientConfig.getX509TrustManagers() != null) {
                trustManagers = clientConfig.getX509TrustManagers();
            }
            if (request.getX509TrustManagers() != null) {
                trustManagers = request.getX509TrustManagers();
            }

            List<TrustManager> trustManagerList = new ArrayList<TrustManager>();
            if (null != trustManagers) {
                trustManagerList.addAll(Arrays.asList(trustManagers));
            }

            // get trustManager using default certification from jdk
            TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            tmf.init((KeyStore) null);
            trustManagerList.addAll(Arrays.asList(tmf.getTrustManagers()));

            final List<X509TrustManager> finalTrustManagerList = new ArrayList<X509TrustManager>();
            for (TrustManager tm : trustManagerList) {
                if (tm instanceof X509TrustManager) {
                    finalTrustManagerList.add((X509TrustManager) tm);
                }
            }
            CompositeX509TrustManager compositeX509TrustManager = new CompositeX509TrustManager(finalTrustManagerList);
            compositeX509TrustManager.setIgnoreSSLCert(ignoreSSLCert);

            if (clientConfig.getKeyManagers() != null) {
                keyManagers = clientConfig.getKeyManagers();
            }
            if (request.getKeyManagers() != null) {
                keyManagers = request.getKeyManagers();
            }

            SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(keyManagers, new TrustManager[]{compositeX509TrustManager}, clientConfig.getSecureRandom());
            return sslContext.getSocketFactory();
        } catch (Exception e) {
            throw new ClientException("SDK.InitFailed", "Init https with SSL socket failed", e);
        }

    }

    private HostnameVerifier createHostnameVerifier(HttpRequest request) {
        boolean ignoreSSLCert = request.isIgnoreSSLCerts() ? request.isIgnoreSSLCerts() : clientConfig.isIgnoreSSLCerts();
        if (ignoreSSLCert) {
            return new NoopHostnameVerifier();
        } else if (clientConfig.getHostnameVerifier() != null) {
            return clientConfig.getHostnameVerifier();
        } else {
            return new DefaultHostnameVerifier();
        }
    }

    private HttpURLConnection buildHttpConnection(HttpRequest request) throws IOException, ClientException {
        String strUrl = request.getSysUrl();

        if (null == strUrl) {
            throw new IllegalArgumentException("URL is null for HttpRequest.");
        }
        if (null == request.getSysMethod()) {
            throw new IllegalArgumentException("Method is not set for HttpRequest.");
        }
        URL url = null;
        String[] urlArray = null;
        if (MethodType.POST.equals(request.getSysMethod()) && null == request.getHttpContent()) {
            urlArray = strUrl.split("\\?");
            url = new URL(urlArray[0]);
        } else {
            url = new URL(strUrl);
        }
        System.setProperty("sun.net.http.allowRestrictedHeaders", "true");
        HttpURLConnection httpConn = null;
        if ("https".equalsIgnoreCase(url.getProtocol())) {
            SSLSocketFactory sslSocketFactory = createSSLSocketFactory(request);
            String httpsProxy = EnvironmentUtils.getHttpsProxy();
            Proxy proxy = getProxy(httpsProxy, request);
            HttpsURLConnection httpsConn = (HttpsURLConnection) url.openConnection(proxy);
            httpsConn.setSSLSocketFactory(sslSocketFactory);
            HostnameVerifier hostnameVerifier = createHostnameVerifier(request);
            httpsConn.setHostnameVerifier(hostnameVerifier);
            httpConn = httpsConn;
        }

        if (httpConn == null) {
            String httpProxy = EnvironmentUtils.getHttpProxy();
            Proxy proxy = getProxy(httpProxy, request);
            httpConn = (HttpURLConnection) url.openConnection(proxy);
        }

        httpConn.setRequestMethod(request.getSysMethod().toString());
        httpConn.setInstanceFollowRedirects(false);
        httpConn.setDoOutput(true);
        httpConn.setDoInput(true);
        httpConn.setUseCaches(false);

        if (request.getSysConnectTimeout() != null) {
            httpConn.setConnectTimeout(request.getSysConnectTimeout());
        } else {
            httpConn.setConnectTimeout((int) clientConfig.getConnectionTimeoutMillis());
        }

        if (request.getSysReadTimeout() != null) {
            httpConn.setReadTimeout(request.getSysReadTimeout());
        } else {
            httpConn.setReadTimeout((int) clientConfig.getReadTimeoutMillis());
        }

        Map<String, String> mappedHeaders = request.getSysHeaders();
        httpConn.setRequestProperty(ACCEPT_ENCODING, "identity");
        for (Entry<String, String> entry : mappedHeaders.entrySet()) {
            httpConn.setRequestProperty(entry.getKey(), entry.getValue());
        }

        if (null != request.getHeaderValue(CONTENT_TYPE)) {
            httpConn.setRequestProperty(CONTENT_TYPE, request.getHeaderValue(CONTENT_TYPE));
        } else {
            String contentTypeValue = request.getContentTypeValue(request.getHttpContentType(), request
                    .getSysEncoding());
            if (null != contentTypeValue) {
                httpConn.setRequestProperty(CONTENT_TYPE, contentTypeValue);
            }
        }

        if (MethodType.POST.equals(request.getSysMethod()) && null != urlArray && urlArray.length == 2) {
            httpConn.getOutputStream().write(urlArray[1].getBytes());
        }

        return httpConn;
    }

    private void parseHttpConn(HttpResponse response, HttpURLConnection httpConn, InputStream content)
            throws IOException {
        byte[] buff = readContent(content);
        response.setStatus(httpConn.getResponseCode());
        Map<String, List<String>> headers = httpConn.getHeaderFields();
        for (Entry<String, List<String>> entry : headers.entrySet()) {
            String key = entry.getKey();
            if (null == key) {
                continue;
            }
            List<String> values = entry.getValue();
            StringBuilder builder = new StringBuilder(values.get(0));
            for (int i = 1; i < values.size(); i++) {
                builder.append(",");
                builder.append(values.get(i));
            }
            response.putHeaderParameter(key, builder.toString());
        }
        String type = response.getHeaderValue("Content-Type");
        if (null != buff && null != type) {
            response.setSysEncoding("UTF-8");
            String[] split = type.split(";");
            response.setHttpContentType(FormatType.mapAcceptToFormat(split[0].trim()));
            if (split.length > 1 && split[1].contains("=")) {
                String[] codings = split[1].split("=");
                response.setSysEncoding(codings[1].trim().toUpperCase());
            }
        }
        response.setHttpContent(buff, response.getSysEncoding(), response.getHttpContentType());
    }

    private byte[] readContent(InputStream content) throws IOException {
        if (content == null) {
            return null;
        }
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] buff = new byte[1024];

        while (true) {
            final int read = content.read(buff);
            if (read == -1) {
                break;
            }
            outputStream.write(buff, 0, read);
        }

        return outputStream.toByteArray();
    }

    @Override
    public void ignoreSSLCertificate() {
        throw new IllegalStateException("use HttpClientConfig.setIgnoreSSLCerts(true) instead");
    }

    @Override
    public void restoreSSLCertificate() {
        throw new IllegalStateException("use HttpClientConfig.setIgnoreSSLCerts(false) instead");
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    @Override
    public void close() throws IOException {

    }

    private Proxy getProxy(String envProxy, HttpRequest request) throws MalformedURLException, UnsupportedEncodingException {
        Proxy proxy = Proxy.NO_PROXY;
        if (!StringUtils.isEmpty(envProxy)) {
            URL proxyUrl = new URL(envProxy);
            String userInfo = proxyUrl.getUserInfo();
            if (userInfo != null) {
                byte[] bytes = userInfo.getBytes("UTF-8");
                String auth = DatatypeConverter.printBase64Binary(bytes);
                request.putHeaderParameter("Proxy-Authorization", "Basic " + auth);
            }
            String hostname = proxyUrl.getHost();
            int port = proxyUrl.getPort();
            if (port == -1) {
                port = proxyUrl.getDefaultPort();
            }
            SocketAddress addr = new InetSocketAddress(hostname, port);
            proxy = new Proxy(Proxy.Type.HTTP, addr);
        }
        return proxy;
    }
}
