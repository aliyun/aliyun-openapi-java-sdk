package com.aliyuncs.http;

import org.junit.Assert;
import org.junit.Test;

public class ProtocolTypeTest {
    @Test
    public void httpAndHttpsTest() {
        Assert.assertEquals("http", ProtocolType.HTTP.toString());

        Assert.assertEquals("https", ProtocolType.HTTPS.toString());
    }
}
