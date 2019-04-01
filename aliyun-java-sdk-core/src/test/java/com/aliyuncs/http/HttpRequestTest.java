package com.aliyuncs.http;

import com.aliyuncs.exceptions.ClientException;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.concurrent.ConcurrentHashMap;

public class HttpRequestTest {
    @Test
    public void httpRequestTest() {
        HttpRequest request = new HttpRequest("test");
        Assert.assertEquals("test", request.getSysUrl());

        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();
        map.put("test", "test");
        HttpRequest httpRequest = new HttpRequest("test", map);
        Assert.assertEquals("test", httpRequest.getSysUrl());
        Assert.assertEquals("test", httpRequest.getHeaderValue("test"));

        httpRequest = new HttpRequest("test", null);
        Assert.assertEquals("test", httpRequest.getSysUrl());
        Assert.assertNotNull(request.getSysHeaders());
    }

    @Test
    public void setGetTest() {
        HttpRequest request = new HttpRequest("test");
        request.setSysUrl("otherTest");
        Assert.assertEquals("otherTest", request.getSysUrl());

        request.setHttpContentType(null);
        Assert.assertNull(request.getHeaderValue("Content-Type"));

        request.setHttpContent(null, null, null);
        Assert.assertNull(request.getHeaderValue("Content-MD5"));
        Assert.assertNull(request.getHeaderValue("Content-Type"));
        Assert.assertEquals("0", request.getHeaderValue("Content-Length"));
        Assert.assertNull(request.getHttpContent());
        Assert.assertNull(request.getHttpContentType());
        Assert.assertNull(request.getSysEncoding());
    }

    @Test
    public void getHttpContentStringTest() throws ClientException, UnsupportedEncodingException {
        HttpRequest request = new HttpRequest("test");
        request.setHttpContent("test".getBytes(), null, null);
        String content = request.getHttpContentString();
        Assert.assertEquals("test", content);

        request = new HttpRequest("test");
        request.setHttpContent("test".getBytes("UTF-8"), "UTF-8", null);
        content = request.getHttpContentString();
        Assert.assertEquals("test", content);

        try {
            request = new HttpRequest("test");
            request.setHttpContent(new byte[]{-1}, "hgbkjhkjh", null);
            request.getHttpContentString();
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals("SDK.UnsupportedEncoding", e.getErrCode());
            Assert.assertEquals("Can not parse response due to unsupported encoding.", e.getErrMsg());
        }

    }

    @Test
    public void toStringTest() {
        HttpRequest request = new HttpRequest("testURL");
        String res = request.toString();
        Assert.assertTrue(res.contains("testURL"));
    }
}
