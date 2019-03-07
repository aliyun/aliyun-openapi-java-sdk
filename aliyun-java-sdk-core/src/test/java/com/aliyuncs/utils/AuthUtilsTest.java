package com.aliyuncs.utils;

import org.junit.Assert;
import org.junit.Test;


public class AuthUtilsTest {
    @Test
    public void getPrivateKeyTest(){
        new AuthUtils();
        AuthUtils.setPrivateKey(null);
        String path = AuthUtils.class.getClassLoader().getResource("project.properties").getPath();
        String privateKey = AuthUtils.getPrivateKey(path);
        Assert.assertNotNull(privateKey);
        Assert.assertEquals(privateKey , AuthUtils.getPrivateKey(path));
    }
}
