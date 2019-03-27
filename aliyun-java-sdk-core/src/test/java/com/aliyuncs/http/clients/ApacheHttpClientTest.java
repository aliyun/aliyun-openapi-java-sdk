package com.aliyuncs.http.clients;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.*;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

import javax.net.ssl.*;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import static org.mockito.ArgumentMatchers.isNotNull;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;

@RunWith(PowerMockRunner.class)
@PrepareForTest({FormatType.class, ContentType.class, HttpUtil.class, HttpHost.class})
@PowerMockIgnore({"javax.net.ssl.*"})
public class ApacheHttpClientTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void init() throws ClientException, IOException {
        ApacheHttpClient.getInstance().close();
    }

    private HttpClientConfig getMockHttpClientConfigWithFalseIgnoreSSLCerts() {
        HttpClientConfig config = Mockito.mock(HttpClientConfig.class);
        Mockito.when(config.getConnectionTimeoutMillis()).thenReturn(15000L);
        Mockito.when(config.getReadTimeoutMillis()).thenReturn(15000L);
        Mockito.when(config.getWriteTimeoutMillis()).thenReturn(15000L);

        Mockito.when(config.isIgnoreSSLCerts()).thenReturn(false);

        Mockito.when(config.getMaxRequests()).thenReturn(64);
        Mockito.when(config.getMaxRequestsPerHost()).thenReturn(5);
        Mockito.when(config.getMaxIdleTimeMillis()).thenReturn(60000L);
        Mockito.when(config.getKeepAliveDurationMillis()).thenReturn(5000L);
        return config;
    }

    private HttpClientConfig getMockHttpClientConfigWithTrueIgnoreSSLCerts() {
        HttpClientConfig config = Mockito.mock(HttpClientConfig.class);
        Mockito.when(config.getConnectionTimeoutMillis()).thenReturn(15000L);
        Mockito.when(config.getReadTimeoutMillis()).thenReturn(15000L);
        Mockito.when(config.getWriteTimeoutMillis()).thenReturn(15000L);

        Mockito.when(config.containsExtParam("apache.httpclient.builder")).thenReturn(true);
        Mockito.when(config.getExtParam("apache.httpclient.builder")).thenReturn(HttpClientBuilder.create());

        Mockito.when(config.isIgnoreSSLCerts()).thenReturn(true);
        Mockito.when(config.getMaxRequests()).thenReturn(64);
        Mockito.when(config.getMaxRequestsPerHost()).thenReturn(5);
        Mockito.when(config.getMaxIdleTimeMillis()).thenReturn(60000L);
        Mockito.when(config.getKeepAliveDurationMillis()).thenReturn(5000L);
        return config;
    }

    @Test
    public void testApacheHttpClientConstructorFalseIgnoreSSLCerts() throws ClientException, IOException {
        HttpClientConfig config = this.getMockHttpClientConfigWithFalseIgnoreSSLCerts();
        ApacheHttpClient httpClient = ApacheHttpClient.getInstance();
        httpClient.init(config);
        Assert.assertTrue(httpClient instanceof ApacheHttpClient);
        httpClient.close();
    }

    @Test
    public void testApacheHttpClientFalseIgnoreSSLCertsNotNullSslSocketFactory() throws ClientException, IOException {
        HttpClientConfig config = this.getMockHttpClientConfigWithFalseIgnoreSSLCerts();
        SSLSocketFactory sslSocketFactory = Mockito.mock(SSLSocketFactory.class);
        HostnameVerifier hostnameVerifier = Mockito.mock(HostnameVerifier.class);
        Mockito.when(config.getSslSocketFactory()).thenReturn(sslSocketFactory);
        Mockito.when(config.getHostnameVerifier()).thenReturn(hostnameVerifier);

        ApacheHttpClient httpClient = ApacheHttpClient.getInstance();
        httpClient.init(config);
        Assert.assertTrue(httpClient instanceof ApacheHttpClient);
        httpClient.close();
    }

    @Test
    public void testApacheHttpClientFalseIgnoreSSLCertsNotNullKeyManagers() throws ClientException, IOException {
        HttpClientConfig config = this.getMockHttpClientConfigWithFalseIgnoreSSLCerts();
        SecureRandom secureRandom = Mockito.mock(SecureRandom.class);
        Mockito.when(config.getSecureRandom()).thenReturn(secureRandom);

        ApacheHttpClient httpClient = ApacheHttpClient.getInstance();
        httpClient.init(config);
        Assert.assertTrue(httpClient instanceof ApacheHttpClient);
        httpClient.close();
    }

    @Test
    public void testApacheHttpClientNotNullExecutorService() throws ClientException, IOException {
        HttpClientConfig config = this.getMockHttpClientConfigWithFalseIgnoreSSLCerts();
        ExecutorService executorService = Mockito.mock(ExecutorService.class);
        Mockito.when(config.getExecutorService()).thenReturn(executorService);

        Mockito.when(config.getKeepAliveDurationMillis()).thenReturn(0L);

        ApacheHttpClient httpClient = ApacheHttpClient.getInstance();
        httpClient.init(config);
        Assert.assertTrue(httpClient instanceof ApacheHttpClient);
        httpClient.close();
    }

    @Test
    public void testApacheHttpClientConstructorIgnoreSSLCerts() throws ClientException, IOException {
        HttpClientConfig config = this.getMockHttpClientConfigWithTrueIgnoreSSLCerts();
        ApacheHttpClient httpClient = ApacheHttpClient.getInstance();
        httpClient.init(config);
        Assert.assertTrue(httpClient instanceof ApacheHttpClient);
        httpClient.close();
    }

    @Test
    public void testRestoreSSLCertificate() throws ClientException, IOException {
        ApacheHttpClient httpClient = ApacheHttpClient.getInstance();
        httpClient.close();
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage("Apache httpclient does not support modify sslFactory after inited, "
                + "use HttpClientConfig.setIgnoreSSLCerts(true) while building client");
        httpClient.restoreSSLCertificate();
    }

    @Test
    public void testIgnoreSSLCertificate() throws ClientException, IOException {
        HttpClientConfig config = this.getMockHttpClientConfigWithFalseIgnoreSSLCerts();
        ApacheHttpClient httpClient = ApacheHttpClient.getInstance();
        httpClient.init(config);
        httpClient.close();
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage("Apache httpclient does not support modify sslFactory after inited, "
                + "use HttpClientConfig.setIgnoreSSLCerts(true) while building client");
        httpClient.ignoreSSLCertificate();
    }

    private HttpRequest getMockHttpRequest() {
        HttpRequest apiRequest = Mockito.mock(HttpRequest.class);
        Mockito.when(apiRequest.getSysMethod()).thenReturn(MethodType.GET);
        Mockito.when(apiRequest.getSysUrl()).thenReturn("http://www.test.domain");
        Mockito.when(apiRequest.getHeaderValue(Mockito.anyString())).thenReturn("application/json");
        Mockito.when(apiRequest.getHttpContent()).thenReturn("httpContent".getBytes());
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Content-Length", "Content-Length");
        headers.put("test", "test");
        Mockito.when(apiRequest.getSysHeaders()).thenReturn(headers);

        return apiRequest;
    }

    private CloseableHttpResponse getMockHttpResponse() {
        CloseableHttpResponse httpResponse = Mockito.mock(CloseableHttpResponse.class);
        StatusLine statusLine = Mockito.mock(StatusLine.class);
        Mockito.when(statusLine.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getStatusLine()).thenReturn(statusLine);
        HttpEntity httpEntity = Mockito.mock(HttpEntity.class);
        Mockito.when(httpResponse.getEntity()).thenReturn(httpEntity);
        Header header = Mockito.mock(Header.class);
        Mockito.when(httpEntity.getContentType()).thenReturn(header);
        Mockito.when(header.getValue()).thenReturn("contentType");
        PowerMockito.mockStatic(FormatType.class);
        PowerMockito.when(FormatType.mapAcceptToFormat(Mockito.anyString())).thenReturn(FormatType.JSON);
        Header[] headers = new Header[2];
        Header header1 = Mockito.mock(Header.class);
        Mockito.when(header1.getName()).thenReturn("headerName1");
        Mockito.when(header1.getValue()).thenReturn("headervalue1");
        Header header2 = Mockito.mock(Header.class);
        Mockito.when(header2.getName()).thenReturn("headerName2");
        Mockito.when(header2.getValue()).thenReturn("headervalue2");
        headers[0] = header1;
        headers[1] = header2;
        Mockito.when(httpResponse.getAllHeaders()).thenReturn(headers);
        return httpResponse;
    }

    @Test
    public void testSyncInvoke() throws ClientException, IOException, NoSuchFieldException, SecurityException,
            IllegalArgumentException, IllegalAccessException {
        HttpClientConfig config = this.getMockHttpClientConfigWithFalseIgnoreSSLCerts();
        ApacheHttpClient apacheHttpClient = ApacheHttpClient.getInstance();
        apacheHttpClient.init(config);
        HttpRequest apiRequest = this.getMockHttpRequest();
        CloseableHttpResponse closeableHttpResponse = this.getMockHttpResponse();
        Field httpClientReflect = ApacheHttpClient.class.getDeclaredField("httpClient");
        httpClientReflect.setAccessible(true);
        CloseableHttpClient closeableHttpClient = Mockito.mock(CloseableHttpClient.class);
        httpClientReflect.set(apacheHttpClient, closeableHttpClient);
        Mockito.doReturn(closeableHttpResponse).when(closeableHttpClient).execute(Mockito.any(HttpUriRequest.class));
        Assert.assertTrue(apacheHttpClient.syncInvoke(apiRequest) instanceof HttpResponse);
        apacheHttpClient.close();
    }

    @Test
    public void testAsyncInvoke() throws ClientException, IOException, NoSuchFieldException, SecurityException,
            IllegalArgumentException, IllegalAccessException {
        HttpClientConfig config = this.getMockHttpClientConfigWithFalseIgnoreSSLCerts();
        ApacheHttpClient apacheHttpClient = ApacheHttpClient.getInstance();
        apacheHttpClient.init(config);
        HttpRequest apiRequest = this.getMockHttpRequest();

        CloseableHttpResponse closeableHttpResponse = this.getMockHttpResponse();

        Field httpClientReflect = ApacheHttpClient.class.getDeclaredField("httpClient");
        httpClientReflect.setAccessible(true);
        CloseableHttpClient closeableHttpClient = Mockito.mock(CloseableHttpClient.class);
        httpClientReflect.set(apacheHttpClient, closeableHttpClient);
        Mockito.doReturn(closeableHttpResponse).when(closeableHttpClient).execute(Mockito.any(HttpUriRequest.class));
        CallBack callBack = Mockito.mock(CallBack.class);
        Assert.assertTrue(apacheHttpClient.asyncInvoke(apiRequest, callBack) instanceof Future);
        apacheHttpClient.close();
    }

    @Test
    public void testSyncInvokeNullContentType() throws ClientException, IOException, NoSuchFieldException,
            SecurityException, IllegalArgumentException, IllegalAccessException {
        HttpClientConfig config = this.getMockHttpClientConfigWithFalseIgnoreSSLCerts();
        ApacheHttpClient apacheHttpClient = ApacheHttpClient.getInstance();
        apacheHttpClient.init(config);
        HttpRequest apiRequest = this.getMockHttpRequest();
        CloseableHttpResponse closeableHttpResponse = this.getMockHttpResponse();

        Mockito.when(apiRequest.getSysMethod()).thenReturn(MethodType.PUT);
        Mockito.when(apiRequest.getHeaderValue(Mockito.anyString())).thenReturn("");
        PowerMockito.mockStatic(ContentType.class);
        PowerMockito.when(ContentType.parse(Mockito.anyString())).thenReturn(ContentType.APPLICATION_ATOM_XML);

        Field httpClientReflect = ApacheHttpClient.class.getDeclaredField("httpClient");
        httpClientReflect.setAccessible(true);
        CloseableHttpClient closeableHttpClient = Mockito.mock(CloseableHttpClient.class);
        httpClientReflect.set(apacheHttpClient, closeableHttpClient);
        Mockito.doReturn(closeableHttpResponse).when(closeableHttpClient).execute(Mockito.any(HttpUriRequest.class));
        Assert.assertTrue(apacheHttpClient.syncInvoke(apiRequest) instanceof HttpResponse);
        apacheHttpClient.close();
    }

    @Test
    public void testSyncInvokeNullHttpRequestEntity() throws ClientException, IOException, NoSuchFieldException,
            SecurityException, IllegalArgumentException, IllegalAccessException {
        HttpClientConfig config = this.getMockHttpClientConfigWithFalseIgnoreSSLCerts();
        ApacheHttpClient apacheHttpClient = ApacheHttpClient.getInstance();
        apacheHttpClient.init(config);
        HttpRequest apiRequest = this.getMockHttpRequest();
        Mockito.when(apiRequest.getSysMethod()).thenReturn(MethodType.POST);
        Mockito.when(apiRequest.getHttpContent()).thenReturn(null);
        Mockito.when(apiRequest.getHeaderValue(Mockito.anyString())).thenReturn("contentType");
        CloseableHttpResponse closeableHttpResponse = this.getMockHttpResponse();

        Mockito.when(closeableHttpResponse.getEntity()).thenReturn(null);
        Header contentTypeHeader = Mockito.mock(Header.class);
        Mockito.when(contentTypeHeader.getValue()).thenReturn("value");
        Mockito.when(closeableHttpResponse.getFirstHeader(Mockito.anyString())).thenReturn(contentTypeHeader);

        Field httpClientReflect = ApacheHttpClient.class.getDeclaredField("httpClient");
        httpClientReflect.setAccessible(true);
        CloseableHttpClient closeableHttpClient = Mockito.mock(CloseableHttpClient.class);
        httpClientReflect.set(apacheHttpClient, closeableHttpClient);
        Mockito.doReturn(closeableHttpResponse).when(closeableHttpClient).execute(Mockito.any(HttpUriRequest.class));
        Assert.assertTrue(apacheHttpClient.syncInvoke(apiRequest) instanceof HttpResponse);
        apacheHttpClient.close();

        Mockito.when(closeableHttpResponse.getFirstHeader(Mockito.anyString())).thenReturn(null);
        Assert.assertTrue(apacheHttpClient.syncInvoke(apiRequest) instanceof HttpResponse);
    }

    @Test
    public void testSyncInvokeZeroHttpRequestEntity() throws ClientException, IOException, NoSuchFieldException,
            SecurityException, IllegalArgumentException, IllegalAccessException {
        HttpClientConfig config = this.getMockHttpClientConfigWithFalseIgnoreSSLCerts();
        ApacheHttpClient apacheHttpClient = ApacheHttpClient.getInstance();
        apacheHttpClient.init(config);
        HttpRequest apiRequest = this.getMockHttpRequest();
        Mockito.when(apiRequest.getSysMethod()).thenReturn(MethodType.POST);
        Mockito.when(apiRequest.getHttpContent()).thenReturn(new byte[0]);
        Mockito.when(apiRequest.getHeaderValue(Mockito.anyString())).thenReturn("contentType");
        CloseableHttpResponse closeableHttpResponse = this.getMockHttpResponse();

        Mockito.when(closeableHttpResponse.getEntity()).thenReturn(null);
        Header contentTypeHeader = Mockito.mock(Header.class);
        Mockito.when(contentTypeHeader.getValue()).thenReturn("value");
        Mockito.when(closeableHttpResponse.getFirstHeader(Mockito.anyString())).thenReturn(contentTypeHeader);

        Field httpClientReflect = ApacheHttpClient.class.getDeclaredField("httpClient");
        httpClientReflect.setAccessible(true);
        CloseableHttpClient closeableHttpClient = Mockito.mock(CloseableHttpClient.class);
        httpClientReflect.set(apacheHttpClient, closeableHttpClient);
        Mockito.doReturn(closeableHttpResponse).when(closeableHttpClient).execute(Mockito.any(HttpUriRequest.class));
        Assert.assertTrue(apacheHttpClient.syncInvoke(apiRequest) instanceof HttpResponse);
        apacheHttpClient.close();

        Mockito.when(closeableHttpResponse.getFirstHeader(Mockito.anyString())).thenReturn(null);
        Assert.assertTrue(apacheHttpClient.syncInvoke(apiRequest) instanceof HttpResponse);
    }

    @Test
    public void testSyncInvokeNotNullHttpRequestEntity() throws ClientException, IOException, NoSuchFieldException,
            SecurityException, IllegalArgumentException, IllegalAccessException {
        HttpClientConfig config = this.getMockHttpClientConfigWithFalseIgnoreSSLCerts();
        ApacheHttpClient apacheHttpClient = ApacheHttpClient.getInstance();
        apacheHttpClient.init(config);
        HttpRequest apiRequest = this.getMockHttpRequest();
        Mockito.when(apiRequest.getSysMethod()).thenReturn(MethodType.POST);
        Mockito.when(apiRequest.getHttpContent()).thenReturn(new byte[]{1, 2, 3});
        Mockito.when(apiRequest.getHeaderValue(Mockito.anyString())).thenReturn("contentType");
        CloseableHttpResponse closeableHttpResponse = this.getMockHttpResponse();

        Mockito.when(closeableHttpResponse.getEntity()).thenReturn(null);
        Header contentTypeHeader = Mockito.mock(Header.class);
        Mockito.when(contentTypeHeader.getValue()).thenReturn("value");
        Mockito.when(closeableHttpResponse.getFirstHeader(Mockito.anyString())).thenReturn(contentTypeHeader);

        Field httpClientReflect = ApacheHttpClient.class.getDeclaredField("httpClient");
        httpClientReflect.setAccessible(true);
        CloseableHttpClient closeableHttpClient = Mockito.mock(CloseableHttpClient.class);
        httpClientReflect.set(apacheHttpClient, closeableHttpClient);
        Mockito.doReturn(closeableHttpResponse).when(closeableHttpClient).execute(Mockito.any(HttpUriRequest.class));
        Assert.assertTrue(apacheHttpClient.syncInvoke(apiRequest) instanceof HttpResponse);
        apacheHttpClient.close();

        Mockito.when(closeableHttpResponse.getFirstHeader(Mockito.anyString())).thenReturn(null);
        Assert.assertTrue(apacheHttpClient.syncInvoke(apiRequest) instanceof HttpResponse);
    }

    @Test
    public void testSyncInvokeNullHttpResponseEntity() throws ClientException, IOException, NoSuchFieldException,
            SecurityException, IllegalArgumentException, IllegalAccessException {
        HttpClientConfig config = this.getMockHttpClientConfigWithFalseIgnoreSSLCerts();
        ApacheHttpClient apacheHttpClient = ApacheHttpClient.getInstance();
        apacheHttpClient.init(config);
        HttpRequest apiRequest = this.getMockHttpRequest();
        Mockito.when(apiRequest.getSysMethod()).thenReturn(MethodType.PUT);
        Mockito.when(apiRequest.getHeaderValue(Mockito.anyString())).thenReturn("contentType");
        CloseableHttpResponse closeableHttpResponse = this.getMockHttpResponse();

        Mockito.when(closeableHttpResponse.getEntity()).thenReturn(null);
        Header contentTypeHeader = Mockito.mock(Header.class);
        Mockito.when(contentTypeHeader.getValue()).thenReturn("value");
        Mockito.when(closeableHttpResponse.getFirstHeader(Mockito.anyString())).thenReturn(contentTypeHeader);

        Field httpClientReflect = ApacheHttpClient.class.getDeclaredField("httpClient");
        httpClientReflect.setAccessible(true);
        CloseableHttpClient closeableHttpClient = Mockito.mock(CloseableHttpClient.class);
        httpClientReflect.set(apacheHttpClient, closeableHttpClient);
        Mockito.doReturn(closeableHttpResponse).when(closeableHttpClient).execute(Mockito.any(HttpUriRequest.class));
        Assert.assertTrue(apacheHttpClient.syncInvoke(apiRequest) instanceof HttpResponse);
        apacheHttpClient.close();

        Mockito.when(closeableHttpResponse.getFirstHeader(Mockito.anyString())).thenReturn(null);
        Assert.assertTrue(apacheHttpClient.syncInvoke(apiRequest) instanceof HttpResponse);
        apacheHttpClient.close();
    }

    @Test
    public void testSyncInvokeNotNullHttpResponseEntityIsChunked() throws ClientException, IOException, NoSuchFieldException,
            SecurityException, IllegalArgumentException, IllegalAccessException {
        HttpClientConfig config = this.getMockHttpClientConfigWithFalseIgnoreSSLCerts();
        ApacheHttpClient apacheHttpClient = ApacheHttpClient.getInstance();
        apacheHttpClient.init(config);
        HttpRequest apiRequest = this.getMockHttpRequest();
        Mockito.when(apiRequest.getSysMethod()).thenReturn(MethodType.PUT);
        Mockito.when(apiRequest.getHeaderValue(Mockito.anyString())).thenReturn("contentType");
        CloseableHttpResponse closeableHttpResponse = this.getMockHttpResponse();
        Mockito.when(closeableHttpResponse.getEntity().isChunked()).thenReturn(true);
        Header contentTypeHeader = Mockito.mock(Header.class);
        Mockito.when(contentTypeHeader.getValue()).thenReturn("value");
        Mockito.when(closeableHttpResponse.getFirstHeader(Mockito.anyString())).thenReturn(contentTypeHeader);

        Field httpClientReflect = ApacheHttpClient.class.getDeclaredField("httpClient");
        httpClientReflect.setAccessible(true);
        CloseableHttpClient closeableHttpClient = Mockito.mock(CloseableHttpClient.class);
        httpClientReflect.set(apacheHttpClient, closeableHttpClient);
        Mockito.doReturn(closeableHttpResponse).when(closeableHttpClient).execute(Mockito.any(HttpUriRequest.class));
        Assert.assertTrue(apacheHttpClient.syncInvoke(apiRequest) instanceof HttpResponse);
        apacheHttpClient.close();
        Mockito.when(closeableHttpResponse.getFirstHeader(Mockito.anyString())).thenReturn(null);
        HttpResponse response = apacheHttpClient.syncInvoke(apiRequest);
        Assert.assertEquals(FormatType.JSON, response.getHttpContentType());
        Assert.assertEquals("utf-8", response.getSysEncoding());
        apacheHttpClient.close();
    }

    @Test
    public void testSyncInvokeNotNullHttpResponseEntity() throws ClientException, IOException, NoSuchFieldException,
            SecurityException, IllegalArgumentException, IllegalAccessException {
        HttpClientConfig config = this.getMockHttpClientConfigWithFalseIgnoreSSLCerts();
        ApacheHttpClient apacheHttpClient = ApacheHttpClient.getInstance();
        apacheHttpClient.init(config);
        HttpRequest apiRequest = this.getMockHttpRequest();
        Mockito.when(apiRequest.getSysMethod()).thenReturn(MethodType.PUT);
        Mockito.when(apiRequest.getHeaderValue(Mockito.anyString())).thenReturn("contentType");
        CloseableHttpResponse closeableHttpResponse = this.getMockHttpResponse();
        Mockito.when(closeableHttpResponse.getEntity().getContentLength()).thenReturn(1L);

        Header contentTypeHeader = Mockito.mock(Header.class);
        Mockito.when(contentTypeHeader.getValue()).thenReturn("value");
        Mockito.when(closeableHttpResponse.getFirstHeader(Mockito.anyString())).thenReturn(contentTypeHeader);
        PowerMockito.mockStatic(ContentType.class);
        PowerMockito.when(ContentType.parse(Mockito.anyString())).thenReturn(ContentType.APPLICATION_JSON);
        Field httpClientReflect = ApacheHttpClient.class.getDeclaredField("httpClient");
        httpClientReflect.setAccessible(true);
        CloseableHttpClient closeableHttpClient = Mockito.mock(CloseableHttpClient.class);
        httpClientReflect.set(apacheHttpClient, closeableHttpClient);
        Mockito.doReturn(closeableHttpResponse).when(closeableHttpClient).execute(Mockito.any(HttpUriRequest.class));
        Assert.assertTrue(apacheHttpClient.syncInvoke(apiRequest) instanceof HttpResponse);
        apacheHttpClient.close();

        Mockito.when(closeableHttpResponse.getFirstHeader(Mockito.anyString())).thenReturn(null);
        HttpResponse response = apacheHttpClient.syncInvoke(apiRequest);
        Assert.assertEquals(FormatType.JSON, response.getHttpContentType());
        Assert.assertEquals("UTF-8", response.getSysEncoding());
        apacheHttpClient.close();
    }

    @Test
    public void testClientTimeout() throws ClientException, IOException, NoSuchFieldException, SecurityException,
            IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        ApacheHttpClient.getInstance().close();
        HttpClientConfig config = HttpClientConfig.getDefault();
        ApacheHttpClient apacheHttpClient = ApacheHttpClient.getInstance();
        apacheHttpClient.init(config);
        Method declaredMethod = ApacheHttpClient.class.getDeclaredMethod("parseToHttpRequest", HttpRequest.class);
        declaredMethod.setAccessible(true);
        HttpRequest apiReq = new HttpRequest("http://test.com");
        apiReq.setSysMethod(MethodType.GET);
        HttpRequestBase httpRequest = (HttpRequestBase) declaredMethod.invoke(apacheHttpClient, apiReq);
        Assert.assertEquals(5000, httpRequest.getConfig().getConnectTimeout());
        Assert.assertEquals(10000, httpRequest.getConfig().getSocketTimeout());
        apacheHttpClient.close();

        config.setConnectionTimeoutMillis(5010);
        config.setReadTimeoutMillis(10010);
        apacheHttpClient = ApacheHttpClient.getInstance();
        apacheHttpClient.init(config);
        httpRequest = (HttpRequestBase) declaredMethod.invoke(apacheHttpClient, apiReq);
        Assert.assertEquals(5010, httpRequest.getConfig().getConnectTimeout());
        Assert.assertEquals(10010, httpRequest.getConfig().getSocketTimeout());
        apacheHttpClient.close();
    }

    @Test
    public void testRequestTimeout() throws ClientException, IOException, NoSuchFieldException, SecurityException,
            IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        ApacheHttpClient.getInstance().close();
        HttpClientConfig config = HttpClientConfig.getDefault();
        config.setConnectionTimeoutMillis(5020);
        config.setReadTimeoutMillis(10020);
        ApacheHttpClient apacheHttpClient = ApacheHttpClient.getInstance();
        apacheHttpClient.init(config);
        Method declaredMethod = ApacheHttpClient.class.getDeclaredMethod("parseToHttpRequest", HttpRequest.class);
        declaredMethod.setAccessible(true);
        HttpRequest apiReq = new HttpRequest("http://test.com");
        apiReq.setSysMethod(MethodType.GET);
        HttpRequestBase httpRequest = (HttpRequestBase) declaredMethod.invoke(apacheHttpClient, apiReq);
        Assert.assertEquals(5020, httpRequest.getConfig().getConnectTimeout());
        Assert.assertEquals(10020, httpRequest.getConfig().getSocketTimeout());

        apiReq.setSysConnectTimeout(5030);
        apiReq.setSysReadTimeout(10030);
        httpRequest = (HttpRequestBase) declaredMethod.invoke(apacheHttpClient, apiReq);
        Assert.assertEquals(5030, httpRequest.getConfig().getConnectTimeout());
        Assert.assertEquals(10030, httpRequest.getConfig().getSocketTimeout());
        apacheHttpClient.close();
    }

    @Test
    public void testCreateSSLSocketFactoryWithManagers() throws Exception {
        HttpClientConfig clientConfig = HttpClientConfig.getDefault();
        X509TrustManager trustManager = mock(X509TrustManager.class);
        KeyManager keyManager = mock(KeyManager.class);
        clientConfig.setX509TrustManagers(new X509TrustManager[]{trustManager});
        clientConfig.setKeyManagers(new KeyManager[]{keyManager});
        ApacheHttpClient client = ApacheHttpClient.getInstance();
        client.init(clientConfig);
        SSLConnectionSocketFactory sslSocketFactory = Whitebox.invokeMethod(client, "createSSLConnectionSocketFactory");
        Assert.assertNotNull(sslSocketFactory);
        client.close();
    }

    @Test
    public void testThrowSSLHandshakeException() throws ClientException, IOException {
        thrown.expect(SSLHandshakeException.class);
        HttpClientConfig clientConfig = HttpClientConfig.getDefault();
        ApacheHttpClient client = ApacheHttpClient.getInstance();
        client.init(clientConfig);
        HttpRequest request = new HttpRequest("https://self-signed.badssl.com");
        request.setSysMethod(MethodType.GET);
        client.syncInvoke(request);
        client.close();
    }

    @Test
    public void testIgnoreSSLCert() throws ClientException, IOException {
        try {
            HttpClientConfig clientConfig = HttpClientConfig.getDefault();
            clientConfig.setIgnoreSSLCerts(true);
            ApacheHttpClient client = ApacheHttpClient.getInstance();
            client.close();
            client = ApacheHttpClient.getInstance();
            client.init(clientConfig);
            HttpRequest request = new HttpRequest("https://self-signed.badssl.com");
            request.setSysMethod(MethodType.GET);
            client.syncInvoke(request);
            client.close();
        } catch (Exception e) {
            Assert.fail();
        }

    }

    @Test
    public void calcProxyNotNeedProxyTest() throws Exception {
        PowerMockito.mockStatic(HttpUtil.class);
        BDDMockito.given(HttpUtil.needProxy(anyString(), anyString(), anyString())).willReturn(false);
        HttpClientConfig config = this.getMockHttpClientConfigWithFalseIgnoreSSLCerts();
        ApacheHttpClient client = ApacheHttpClient.getInstance();
        client.init(config);
        HttpRequest httpRequest = mock(HttpRequest.class);
        Mockito.when(httpRequest.getSysUrl()).thenReturn("http://www.aliyun.com");
        HttpHost proxy = Whitebox.invokeMethod(client, "calcProxy", httpRequest);
        Assert.assertEquals(null, proxy);
    }

    @Test
    public void calcHttpProxyTest() throws Exception {
        PowerMockito.mockStatic(HttpUtil.class);
        BDDMockito.given(HttpUtil.needProxy((String) isNotNull(), (String) isNull(), (String) isNull())).willReturn(true);
        HttpHost proxy0 = mock(HttpHost.class);
        BDDMockito.given(HttpUtil.getApacheProxy((String) isNull(), (String) isNull(), (HttpRequest) isNotNull())).willReturn(proxy0);
        HttpClientConfig config = this.getMockHttpClientConfigWithFalseIgnoreSSLCerts();
        ApacheHttpClient client = ApacheHttpClient.getInstance();
        client.init(config);
        HttpRequest httpRequest = mock(HttpRequest.class);
        Mockito.when(httpRequest.getSysUrl()).thenReturn("http://www.aliyun.com");
        HttpHost proxy = Whitebox.invokeMethod(client, "calcProxy", httpRequest);
        Assert.assertEquals(proxy0, proxy);
    }

    @Test
    public void calcHttpsProxyTest() throws Exception {
        PowerMockito.mockStatic(HttpUtil.class);
        BDDMockito.given(HttpUtil.needProxy((String) isNotNull(), (String) isNull(), (String) isNull())).willReturn(true);
        HttpHost proxy0 = mock(HttpHost.class);
        BDDMockito.given(HttpUtil.getApacheProxy((String) isNull(), (String) isNull(), any(HttpRequest.class))).willReturn(proxy0);
        HttpClientConfig config = this.getMockHttpClientConfigWithFalseIgnoreSSLCerts();
        ApacheHttpClient client = ApacheHttpClient.getInstance();
        client.init(config);
        HttpRequest httpRequest = mock(HttpRequest.class);
        Mockito.when(httpRequest.getSysUrl()).thenReturn("https://www.aliyun.com");
        HttpHost proxy = Whitebox.invokeMethod(client, "calcProxy", httpRequest);
        Assert.assertEquals(proxy0, proxy);
    }

    @Test
    public void testExceptionConstructor() throws ClientException {
        thrown.expect(IllegalStateException.class);
        ApacheHttpClient.getInstance(HttpClientConfig.getDefault());
    }


}
