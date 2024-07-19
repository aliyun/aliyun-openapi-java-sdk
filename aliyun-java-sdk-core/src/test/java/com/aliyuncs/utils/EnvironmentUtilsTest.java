package com.aliyuncs.utils;

import org.junit.Assert;
import org.junit.Test;

public class EnvironmentUtilsTest {

    @Test
    public void testConstructor() {
        Assert.assertNotNull(new EnvironmentUtils());
    }

    @Test
    public void testGetSetHttpProxy() {
        Assert.assertNull(EnvironmentUtils.getHttpProxy());
        EnvironmentUtils.setHttpProxy("http://www.aliyun.com");
        Assert.assertEquals("http://www.aliyun.com", EnvironmentUtils.getHttpProxy());
        // reset http proxy
        EnvironmentUtils.setHttpProxy(null);
    }

    @Test
    public void testGetSetHttpsProxy() {
        Assert.assertNull(EnvironmentUtils.getHttpsProxy());
        EnvironmentUtils.setHttpsProxy("https://www.aliyun.com");
        Assert.assertEquals("https://www.aliyun.com", EnvironmentUtils.getHttpsProxy());
        // reset https proxy
        EnvironmentUtils.setHttpsProxy(null);
    }

    @Test
    public void testGetSetNoProxy() {
        Assert.assertNull(EnvironmentUtils.getNoProxy());
        EnvironmentUtils.setNoProxy("https://www.aliyun.com");
        Assert.assertEquals("https://www.aliyun.com", EnvironmentUtils.getNoProxy());
        // reset no proxy
        EnvironmentUtils.setNoProxy(null);
    }
}
