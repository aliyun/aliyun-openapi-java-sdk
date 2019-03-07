package com.aliyuncs.auth;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class InstanceProfileCredentialsTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorNormal() {
        String ak = "ak";
        String sk = "sk";
        String token = "token";
        String expiration = "2018-12-12 12:12:12";
        long duration = 600L;
        InstanceProfileCredentials credentials = new InstanceProfileCredentials(ak, sk, token, expiration, duration);
        Assert.assertNotNull(credentials);
    }

    @Test
    public void constructorInvalidDate() {
        thrown.expect(IllegalArgumentException.class);
        String ak = "ak";
        String sk = "sk";
        String token = "token";
        String expiration = "2018-12-12-12:12:12";
        long duration = 600L;
        InstanceProfileCredentials credentials = new InstanceProfileCredentials(ak, sk, token, expiration, duration);
        Assert.assertNull(credentials);
    }

    @Test
    public void willSoonExpireTrue() {

        // expire after 9 minutes
        long expirationLong = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        String expirationStr = sdf.format(new Date(expirationLong));
        String ak = "ak";
        String sk = "sk";
        String token = "token";
        long duration = 3600L;
        InstanceProfileCredentials credentials = new InstanceProfileCredentials(ak, sk, token, expirationStr, duration);
        Assert.assertTrue(credentials.willSoonExpire());
    }

    @Test
    public void willSoonExpireFalse() {

        // expire after 11 minutes
        long expirationLong = System.currentTimeMillis() + 1000 * 60 * 11;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        String expirationStr = sdf.format(new Date(expirationLong));
        String ak = "ak";
        String sk = "sk";
        String token = "token";
        long duration = 6000L;
        InstanceProfileCredentials credentials = new InstanceProfileCredentials(ak, sk, token, expirationStr, duration);
        Assert.assertFalse(credentials.willSoonExpire());
    }

    @Test
    public void isExpiredTrue() {
        // expire after 5 seconds
        long expirationLong = System.currentTimeMillis() + 1000 * 5;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        String expirationStr = sdf.format(new Date(expirationLong));
        String ak = "ak";
        String sk = "sk";
        String token = "token";
        long duration = 6000L;
        InstanceProfileCredentials credentials = new InstanceProfileCredentials(ak, sk, token, expirationStr, duration);
        Assert.assertTrue(credentials.isExpired());
    }

    @Test
    public void isExpiredFalse() {
        // expire after 15 seconds
        long expirationLong = System.currentTimeMillis() + 1000 * 15;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        String expirationStr = sdf.format(new Date(expirationLong));
        String ak = "ak";
        String sk = "sk";
        String token = "token";
        long duration = 6000L;
        InstanceProfileCredentials credentials = new InstanceProfileCredentials(ak, sk, token, expirationStr, duration);
        Assert.assertTrue(credentials.isExpired());

    }

    @Test
    public void shouldRefreshFalse() {
        // expire after 15 seconds
        long expirationLong = System.currentTimeMillis() + 1000 * 15;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        String expirationStr = sdf.format(new Date(expirationLong));
        String ak = "ak";
        String sk = "sk";
        String token = "token";
        long duration = 3600L;
        InstanceProfileCredentials credentials = new InstanceProfileCredentials(ak, sk, token, expirationStr, duration);
        credentials.setLastFailedRefreshTime();
        Assert.assertFalse(credentials.shouldRefresh());
    }

    @Test
    public void shouldRefreshTrue() {
        // expire after 15 seconds
        long expirationLong = System.currentTimeMillis() + 1000 * 15;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        String expirationStr = sdf.format(new Date(expirationLong));
        String ak = "ak";
        String sk = "sk";
        String token = "token";
        long duration = 3600L;
        InstanceProfileCredentials credentials = new InstanceProfileCredentials(ak, sk, token, expirationStr, duration);
        credentials.setLastFailedRefreshTime();
        Assert.assertFalse(credentials.shouldRefresh());
    }

}
