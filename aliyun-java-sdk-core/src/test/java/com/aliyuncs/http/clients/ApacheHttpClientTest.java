package com.aliyuncs.http.clients;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.CallBack;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpClientConfig;
import com.aliyuncs.http.HttpRequest;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.http.MethodType;

@RunWith(PowerMockRunner.class)
@PrepareForTest(FormatType.class)
public class ApacheHttpClientTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

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

    @Test
    public void testApacheHttpClientConstructor() throws ClientException, IOException {
        HttpClientConfig config = this.getMockHttpClientConfigWithFalseIgnoreSSLCerts();
        ApacheHttpClient httpClient = new ApacheHttpClient(config);
        Assert.assertTrue(httpClient instanceof ApacheHttpClient);
        httpClient.close();
    }

    @Test
    public void testRestoreSSLCertificate() throws ClientException, IOException {
        HttpClientConfig config = this.getMockHttpClientConfigWithFalseIgnoreSSLCerts();
        ApacheHttpClient httpClient = new ApacheHttpClient(config);
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage("Apache httpclient does not support modify sslFactory after inited, "
                + "use HttpClientConfig.setIgnoreSSLCerts(true) while building client");
        httpClient.restoreSSLCertificate();
        httpClient.close();
    }

    @Test
    public void testIgnoreSSLCertificate() throws ClientException, IOException {
        HttpClientConfig config = this.getMockHttpClientConfigWithFalseIgnoreSSLCerts();
        ApacheHttpClient httpClient = new ApacheHttpClient(config);
        thrown.expect(IllegalStateException.class);
        thrown.expectMessage("Apache httpclient does not support modify sslFactory after inited, "
                + "use HttpClientConfig.setIgnoreSSLCerts(true) while building client");
        httpClient.ignoreSSLCertificate();
        httpClient.close();
    }

    private HttpRequest getMockHttpRequest() {
        HttpRequest apiRequest = Mockito.mock(HttpRequest.class);
        Mockito.when(apiRequest.getSysMethod()).thenReturn(MethodType.GET);
        Mockito.when(apiRequest.getSysUrl()).thenReturn("www.test.domain");
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
        ApacheHttpClient apacheHttpClient = new ApacheHttpClient(config);
        HttpRequest apiRequest = this.getMockHttpRequest();
        CloseableHttpResponse httpResponse = this.getMockHttpResponse();
        Field httpClientReflect = ApacheHttpClient.class.getDeclaredField("httpClient");
        httpClientReflect.setAccessible(true);
        CloseableHttpClient closeableHttpClient = Mockito.mock(CloseableHttpClient.class);
        httpClientReflect.set(apacheHttpClient, closeableHttpClient);
        Mockito.doReturn(httpResponse).when(closeableHttpClient).execute(Mockito.any(HttpUriRequest.class));
        Assert.assertTrue(apacheHttpClient.syncInvoke(apiRequest) instanceof HttpResponse);
        apacheHttpClient.close();
    }

    @Test
    public void testAsyncInvoke() throws ClientException, IOException, NoSuchFieldException, SecurityException,
            IllegalArgumentException, IllegalAccessException {
        HttpClientConfig config = this.getMockHttpClientConfigWithFalseIgnoreSSLCerts();
        ApacheHttpClient apacheHttpClient = new ApacheHttpClient(config);
        HttpRequest apiRequest = this.getMockHttpRequest();
        CloseableHttpResponse httpResponse = this.getMockHttpResponse();
        Field httpClientReflect = ApacheHttpClient.class.getDeclaredField("httpClient");
        httpClientReflect.setAccessible(true);
        CloseableHttpClient closeableHttpClient = Mockito.mock(CloseableHttpClient.class);
        httpClientReflect.set(apacheHttpClient, closeableHttpClient);
        Mockito.doReturn(httpResponse).when(closeableHttpClient).execute(Mockito.any(HttpUriRequest.class));
        CallBack callBack = Mockito.mock(CallBack.class);
        Assert.assertTrue(apacheHttpClient.asyncInvoke(apiRequest, callBack) instanceof Future);
        apacheHttpClient.close();
    }

}
