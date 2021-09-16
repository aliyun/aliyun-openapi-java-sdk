package com.aliyuncs.utils;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


public class AuthUtilsTest {
    @Test
    public void getPrivateKeyTest() {
        new AuthUtils();
        AuthUtils.setPrivateKey(null);
        String path = AuthUtils.class.getClassLoader().getResource("project.properties").getPath();
        String privateKey = AuthUtils.getPrivateKey(path);
        Assert.assertNotNull(privateKey);
        Assert.assertEquals(privateKey, AuthUtils.getPrivateKey(path));
    }

    @Test
    public void hexEncodeTest() {
        byte[] bytes = {11, 22, 33};
        String s = AuthUtils.hexEncode(bytes);
        Assert.assertEquals("0b1621", s);
    }

    @Test
    public void getCanonicalizedHeadersMapTest() {
        Map<String, String> map = new HashMap<String, String>();
        Map<String, String> canonicalizedHeadersMap = AuthUtils.getCanonicalizedHeadersMap(map);
        Assert.assertNotNull(canonicalizedHeadersMap);
    }

    @Test
    public void checkRSASecretTest() {
        String test = AuthUtils.checkRSASecret("test");
        Assert.assertEquals("test", test);
    }

    @Test
    public void hashTest() throws Exception {
        byte[] bytes = {33};
        byte[] tests = AuthUtils.hash(bytes, "test");
        Assert.assertEquals(null, tests);
    }
}
