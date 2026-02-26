package com.aliyuncs.auth;

import org.junit.Assert;
import org.junit.Test;

public class IDTokenCredentialsTest {
    @Test
    public void constructorTest() {
        String token = "token";
        IDTokenCredentials credentials = new IDTokenCredentials(token);
        Assert.assertEquals(token, credentials.getIDToken());
        Assert.assertNull(credentials.getAccessKeyId());
        Assert.assertNull(credentials.getAccessKeySecret());
    }

    @Test
    public void setIDTokenTest() {
        String token = "token";
        IDTokenCredentials credentials = new IDTokenCredentials(token);
        Assert.assertEquals(token, credentials.getIDToken());
        String newToken = "new Token";
        credentials.setIDToken(newToken);
        Assert.assertEquals(newToken, credentials.getIDToken());
    }
}
