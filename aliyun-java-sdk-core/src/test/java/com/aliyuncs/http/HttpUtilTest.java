package com.aliyuncs.http;

import static org.mockito.Mockito.mock;

import java.net.Proxy;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpHost;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

import com.aliyuncs.exceptions.ClientException;

public class HttpUtilTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testHttpDebug() {
        HttpUtil httpUtil = new HttpUtil();
        Assert.assertEquals(HttpUtil.getIsHttpDebug(), "sdk".equalsIgnoreCase(System.getenv("DEBUG")));
        Assert.assertEquals(HttpUtil.getIsHttpContentDebug(), "sdk".equalsIgnoreCase(System.getenv("DEBUG")));
        if (HttpUtil.getIsHttpDebug()) {
            HttpUtil.setIsHttpDebug(false);
            Assert.assertFalse(HttpUtil.getIsHttpDebug());
        } else {
            HttpUtil.setIsHttpDebug(true);
            Assert.assertTrue(HttpUtil.getIsHttpDebug());
        }
        if (HttpUtil.getIsHttpContentDebug()) {
            HttpUtil.setIsHttpContentDebug(false);
            Assert.assertFalse(HttpUtil.getIsHttpContentDebug());
        } else {
            HttpUtil.setIsHttpContentDebug(true);
            Assert.assertTrue(HttpUtil.getIsHttpContentDebug());
        }
        HttpUtil.setIsHttpDebug("sdk".equalsIgnoreCase(System.getenv("DEBUG")));
        HttpUtil.setIsHttpContentDebug("sdk".equalsIgnoreCase(System.getenv("DEBUG")));
    }

    @Test
    public void testDebugHttpRequest() throws ClientException {
        HttpRequest request = mock(HttpRequest.class);
        Mockito.when(request.getSysMethod()).thenReturn(MethodType.GET);
        Mockito.when(request.getSysUrl()).thenReturn("http://test.domain");
        Map<String, String> requestHeaders = new HashMap<String, String>();
        Mockito.when(request.getHttpContentString()).thenReturn("request body");
        requestHeaders.put("test1", "test1");
        requestHeaders.put("test2", "test2");
        Mockito.when(request.getSysHeaders()).thenReturn(requestHeaders);
        String exceptString = "> GET HTTP/1.1\n> Host : test.domain\n> test2 : test2\n> test1 : test1\n> "
                + "Request URL : http://test.domain\n> \nrequest body";

        HttpUtil.setIsHttpDebug(true);
        HttpUtil.setIsHttpContentDebug(true);
        Assert.assertEquals(HttpUtil.debugHttpRequest(request), exceptString);

        HttpUtil.setIsHttpContentDebug(false);
        exceptString = "> GET HTTP/1.1\n> Host : test.domain\n> test2 : test2\n> test1 : test1\n> "
                + "Request URL : http://test.domain\n> ";
        Assert.assertEquals(HttpUtil.debugHttpRequest(request), exceptString);

        HttpUtil.setIsHttpDebug(false);
        Assert.assertNull(HttpUtil.debugHttpRequest(request));

        HttpUtil.setIsHttpContentDebug(true);
        Assert.assertNull(HttpUtil.debugHttpRequest(request));

        HttpUtil.setIsHttpDebug("sdk".equalsIgnoreCase(System.getenv("DEBUG")));
        HttpUtil.setIsHttpContentDebug("sdk".equalsIgnoreCase(System.getenv("DEBUG")));
    }

    @Test
    public void testDebugHttpResponse() throws ClientException {
        HttpResponse response = mock(HttpResponse.class);
        Mockito.when(response.getStatus()).thenReturn(200);
        Mockito.when(response.getSysUrl()).thenReturn("http://test.domain");
        Mockito.when(response.getHttpContentString()).thenReturn("response body");
        Map<String, String> reasponseHeaders = new HashMap<String, String>();
        reasponseHeaders.put("test1", "test1");
        reasponseHeaders.put("test2", "test2");
        Mockito.when(response.getSysHeaders()).thenReturn(reasponseHeaders);
        String exceptString = "< HTTP/1.1 200\n< test2 : test2\n< test1 : test1\n< \nresponse body";

        HttpUtil.setIsHttpDebug(true);
        HttpUtil.setIsHttpContentDebug(true);
        Assert.assertEquals(HttpUtil.debugHttpResponse(response), exceptString);

        HttpUtil.setIsHttpContentDebug(false);
        exceptString = "< HTTP/1.1 200\n< test2 : test2\n< test1 : test1\n< ";
        Assert.assertEquals(HttpUtil.debugHttpResponse(response), exceptString);

        HttpUtil.setIsHttpDebug(false);
        Assert.assertNull(HttpUtil.debugHttpResponse(response));

        HttpUtil.setIsHttpContentDebug(true);
        Assert.assertNull(HttpUtil.debugHttpResponse(response));

        HttpUtil.setIsHttpDebug("sdk".equalsIgnoreCase(System.getenv("DEBUG")));
        HttpUtil.setIsHttpContentDebug("sdk".equalsIgnoreCase(System.getenv("DEBUG")));
    }

    @Test
    public void testDebugHttpRquestException() throws ClientException {
        HttpRequest request = mock(HttpRequest.class);
        Mockito.when(request.getSysMethod()).thenReturn(MethodType.GET);
        Mockito.when(request.getSysUrl()).thenReturn("httpss://test.domain/jdj");
        Map<String, String> requestHeaders = new HashMap<String, String>();
        Mockito.when(request.getHttpContentString()).thenReturn("request body");
        requestHeaders.put("test1", "test1");
        requestHeaders.put("test2", "test2");
        Mockito.when(request.getSysHeaders()).thenReturn(requestHeaders);
        String exceptString = "> GET httpss://test.domain/jdj\n> Host : httpss://test.domain/jdj\n> "
                + "test2 : test2\n> test1 : test1\n> Request URL : httpss://test.domain/jdj\n> \nrequest body";
        HttpUtil.setIsHttpDebug(true);
        HttpUtil.setIsHttpContentDebug(true);
        Assert.assertEquals(HttpUtil.debugHttpRequest(request), exceptString);
        
        Mockito.when(request.getSysUrl()).thenReturn("http://test.domain/jdj");
        Mockito.doThrow(ClientException.class).when(request).getHttpContentString();
        Mockito.when(request.getSysEncoding()).thenReturn("HHH");
        exceptString = "> GET HTTP/1.1\n> Host : test.domain\n> "
                + "test2 : test2\n> test1 : test1\n> Request URL : http://test.domain/jdj\n> \n"
                + "Can not parse response due to unsupported encoding : HHH";
        Assert.assertEquals(HttpUtil.debugHttpRequest(request), exceptString);
        HttpUtil.setIsHttpDebug("sdk".equalsIgnoreCase(System.getenv("DEBUG")));
        HttpUtil.setIsHttpContentDebug("sdk".equalsIgnoreCase(System.getenv("DEBUG")));
    }

    @Test
    public void testDebugHttpResponseException() throws ClientException {
        HttpResponse response = mock(HttpResponse.class);
        Mockito.when(response.getStatus()).thenReturn(200);
        Mockito.doThrow(ClientException.class).when(response).getHttpContentString();
        Mockito.when(response.getSysEncoding()).thenReturn("HHH");
        Map<String, String> reasponseHeaders = new HashMap<String, String>();
        reasponseHeaders.put("test1", "test1");
        reasponseHeaders.put("test2", "test2");
        Mockito.when(response.getSysHeaders()).thenReturn(reasponseHeaders);
        String exceptString = "< HTTP/1.1 200\n< test2 : test2\n< test1 : test1\n< \n"
                + "Can not parse response due to unsupported encoding : HHH";
        HttpUtil.setIsHttpDebug(true);
        HttpUtil.setIsHttpContentDebug(true);
        Assert.assertEquals(HttpUtil.debugHttpResponse(response), exceptString);
        HttpUtil.setIsHttpDebug("sdk".equalsIgnoreCase(System.getenv("DEBUG")));
        HttpUtil.setIsHttpContentDebug("sdk".equalsIgnoreCase(System.getenv("DEBUG")));
    }

    @Test
    public void testGetJDKProxyException() throws ClientException {
        HttpRequest request = mock(HttpRequest.class);
        thrown.expect(ClientException.class);
        Proxy proxy = HttpUtil.getJDKProxy("http0://www.aliyun.com", null, request);
        Assert.assertNotNull(proxy);
    }

    @Test
    public void testGetJDKProxyEnvProxyHasUserInfo() throws ClientException {
        HttpRequest request = mock(HttpRequest.class);
        Proxy proxy = HttpUtil.getJDKProxy(null, "http://user:passwd@www.aliyun.com", request);
        Assert.assertNotNull(proxy);
    }

    @Test
    public void testGetJDKProxyEnvProxyNoUserInfo() throws ClientException {
        HttpRequest request = mock(HttpRequest.class);
        Proxy proxy = HttpUtil.getJDKProxy(null, "http://www.aliyun.com:80", request);
        Assert.assertNotNull(proxy);
    }

    @Test
    public void testGetApacheProxyException() throws ClientException {
        HttpRequest request = mock(HttpRequest.class);
        thrown.expect(ClientException.class);
        HttpHost proxy = HttpUtil.getApacheProxy("http0://www.aliyun.com", null, request);
        Assert.assertNotNull(proxy);
    }

    @Test
    public void testGetApacheProxyEnvProxyHasUserInfo() throws ClientException {
        HttpRequest request = mock(HttpRequest.class);
        HttpHost proxy = HttpUtil.getApacheProxy(null, "http://user:passwd@www.aliyun.com", request);
        Assert.assertNotNull(proxy);
    }

    @Test
    public void testGetApacheProxyEnvProxyNoUserInfo() throws ClientException {
        HttpRequest request = mock(HttpRequest.class);
        HttpHost proxy = HttpUtil.getApacheProxy(null, "http://www.aliyun.com:80", request);
        Assert.assertNotNull(proxy);
    }

    @Test
    public void testNeedProxyHasClientProxy() {
        boolean need = HttpUtil.needProxy("http://targethost.com", "http://www.aliyun.com", null);
        Assert.assertTrue(need);
    }

    @Test
    public void testNeedProxyHasEnvProxyList() {
        boolean need = HttpUtil.needProxy("http://targethost.com", "", "http://www.aliyun.com,http://targethost.com");
        Assert.assertFalse(need);
    }
}
