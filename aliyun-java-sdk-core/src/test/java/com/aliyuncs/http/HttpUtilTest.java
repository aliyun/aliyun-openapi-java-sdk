package com.aliyuncs.http;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import com.aliyuncs.exceptions.ClientException;

public class HttpUtilTest {

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
        HttpRequest request = Mockito.mock(HttpRequest.class);
        Mockito.when(request.getSysMethod()).thenReturn(MethodType.GET);
        Mockito.when(request.getSysUrl()).thenReturn("http://test.domain");
        Map<String, String> requestHeaders = new HashMap<String, String>();
        Mockito.when(request.getHttpContentString()).thenReturn("request body");
        requestHeaders.put("test1", "test1");
        requestHeaders.put("test2", "test2");
        Mockito.when(request.getSysHeaders()).thenReturn(requestHeaders);
        String exceptString = "> GET HTTP/1.1\n> test2 : test2\n> test1 : test1\n> \nrequest body";

        HttpUtil.setIsHttpDebug(true);
        HttpUtil.setIsHttpContentDebug(true);
        Assert.assertEquals(HttpUtil.debugHttpRequest(request), exceptString);

        HttpUtil.setIsHttpContentDebug(false);
        exceptString = "> GET HTTP/1.1\n> test2 : test2\n> test1 : test1\n> ";
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
        HttpResponse response = Mockito.mock(HttpResponse.class);
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
}
