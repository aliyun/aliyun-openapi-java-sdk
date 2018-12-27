package com.aliyuncs.http;

import org.junit.Assert;
import org.junit.Test;

public class HttpClientTypeTest {

    @Test
    public void getImplClassTest() {
        Assert.assertEquals("class com.aliyuncs.http.clients.ApacheHttpClient",
                HttpClientType.ApacheHttpClient.getImplClass().toString());

        Assert.assertEquals("class com.aliyuncs.http.clients.CompatibleUrlConnClient",
                HttpClientType.Compatible.getImplClass().toString());

        Assert.assertNull(HttpClientType.OkHttp.getImplClass());

        Assert.assertNull(HttpClientType.Custom.getImplClass());
    }
}
