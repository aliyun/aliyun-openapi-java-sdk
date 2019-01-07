package com.aliyuncs.auth;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BasicSessionCredentialsTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorNormalTest1() {
        String ak = "ak";
        String sk = "sk";
        String token = "token";
        BasicSessionCredentials credentials = new BasicSessionCredentials(ak, sk, token);
        Assert.assertEquals(ak, credentials.getAccessKeyId());
        Assert.assertEquals(sk, credentials.getAccessKeySecret());
        Assert.assertEquals(token, credentials.getSessionToken());
        Assert.assertEquals(0, credentials.roleSessionDurationSeconds);
    }

    @Test
    public void constructorNormalTest2() {
        String ak = "ak";
        String sk = "sk";
        String token = "token";
        long durationSecond = 86400;
        BasicSessionCredentials credentials = new BasicSessionCredentials(ak, sk, token, durationSecond);
        Assert.assertEquals(ak, credentials.getAccessKeyId());
        Assert.assertEquals(sk, credentials.getAccessKeySecret());
        Assert.assertEquals(durationSecond, credentials.roleSessionDurationSeconds);
    }

    @Test
    public void constructorInvalidAK() {
        thrown.expect(IllegalArgumentException.class);
        String token = "token";
        long durationSecond = 86400;
        BasicSessionCredentials credentials = new BasicSessionCredentials(null, "sk", token, durationSecond);
        Assert.assertNull(credentials);
    }

    @Test
    public void constructorInvalidSK() {
        thrown.expect(IllegalArgumentException.class);
        String token = "token";
        long durationSecond = 86400;
        BasicSessionCredentials credentials = new BasicSessionCredentials("ak", null, token, durationSecond);
        Assert.assertNull(credentials);
    }

    @Test
    public void willSoonExpireFalseTest1() {
        BasicSessionCredentials credentials = new BasicSessionCredentials("ak", "sk", "token");
        Assert.assertFalse(credentials.willSoonExpire());
    }

    @Test
    public void willSoonExpireFalseTest2() {
        BasicSessionCredentials credentials = new BasicSessionCredentials("ak", "sk", "token", 86400L);
        Assert.assertFalse(credentials.willSoonExpire());
    }

    @Test
    public void willSoonExpireTrue() {
        BasicSessionCredentials credentials = new BasicSessionCredentials("ak", "sk", "token", 1L);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(credentials.willSoonExpire());
    }
}
