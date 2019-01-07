package com.aliyuncs.auth;

import org.junit.Assert;
import org.junit.Test;

public class BearerTokenCredentialsTest {
    @Test
    public void constructorTest() {
        String token = "token";
        BearerTokenCredentials credentials = new BearerTokenCredentials(token);
        Assert.assertEquals(token, credentials.getBearerToken());
        Assert.assertNull(credentials.getAccessKeyId());
        Assert.assertNull(credentials.getAccessKeySecret());
    }

    @Test
    public void setBearerTokenTest() {
        String token = "token";
        BearerTokenCredentials credentials = new BearerTokenCredentials(token);
        Assert.assertEquals(token, credentials.getBearerToken());
        String newToken = "new Token";
        credentials.setBearerToken(newToken);
        Assert.assertEquals(newToken, credentials.getBearerToken());
    }
}
