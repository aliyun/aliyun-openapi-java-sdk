package com.aliyuncs.http;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.ConcurrentHashMap;

public class HttpRequestTest {
    @Test
    public void httpRequestTest() {
        HttpRequest request = new HttpRequest("test");
        Assert.assertEquals("test", request.getUrl());

        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();
        map.put("test", "test");
        HttpRequest httpRequest = new HttpRequest("test", map);
        Assert.assertEquals("test", httpRequest.getUrl());
        Assert.assertEquals("test", httpRequest.getHeaderValue("test"));
    }
}
