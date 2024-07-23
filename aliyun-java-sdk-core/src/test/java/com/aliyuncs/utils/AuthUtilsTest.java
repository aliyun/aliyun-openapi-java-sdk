package com.aliyuncs.utils;

import org.junit.Assert;
import org.junit.Test;


public class AuthUtilsTest {
    @Test
    public void getPrivateKeyTest(){
        new AuthUtils();
        String path = AuthUtils.class.getClassLoader().getResource("project.properties").getPath();
        String privateKey = AuthUtils.getPrivateKey(path);
        Assert.assertNotNull(privateKey);
    }
}
