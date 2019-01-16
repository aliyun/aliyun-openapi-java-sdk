package com.aliyuncs.auth;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

public class CredentialTest {

    @SuppressWarnings("deprecation")
    @Test
    public void testConstructorWithNull() throws InterruptedException {
        Credential credential = new Credential();
        Assert.assertNull(credential.getAccessKeyId());
        Assert.assertNull(credential.getAccessSecret());
        Thread.sleep(100);
        Assert.assertTrue(credential.getRefreshDate().before(new Date()));
        Assert.assertNull(credential.getExpiredDate());
        Assert.assertNull(credential.getSecurityToken());
        Assert.assertFalse(credential.isExpired());

        credential.setAccessKeyId("accessKeyId");
        credential.setAccessSecret("accessSecret");
        credential.setSecurityToken("securityToken");
        Assert.assertEquals("accessKeyId", credential.getAccessKeyId());
        Assert.assertEquals("accessSecret", credential.getAccessSecret());
        Assert.assertEquals("securityToken", credential.getSecurityToken());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testConstructorWithAK() throws InterruptedException {
        Credential credential = new Credential("accessKeyId", "accessSecret");
        Assert.assertEquals("accessKeyId", credential.getAccessKeyId());
        Assert.assertEquals("accessSecret", credential.getAccessSecret());
        Thread.sleep(100);
        Assert.assertTrue(credential.getRefreshDate().before(new Date()));
        Assert.assertNull(credential.getExpiredDate());
        Assert.assertNull(credential.getSecurityToken());
        Assert.assertFalse(credential.isExpired());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testConstructorWithToken() throws InterruptedException {
        Credential credential = new Credential("accessKeyId", "accessSecret", "securityToken");
        Assert.assertEquals("accessKeyId", credential.getAccessKeyId());
        Assert.assertEquals("accessSecret", credential.getAccessSecret());
        Assert.assertEquals("securityToken", credential.getSecurityToken());
        Thread.sleep(100);
        Assert.assertTrue(credential.getRefreshDate().before(new Date()));
        Assert.assertNull(credential.getExpiredDate());
        Assert.assertFalse(credential.isExpired());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testConstructorWithExpiredHours() throws InterruptedException {
        Credential credential = new Credential("accessKeyId", "accessSecret", 1);
        Assert.assertEquals("accessKeyId", credential.getAccessKeyId());
        Assert.assertEquals("accessSecret", credential.getAccessSecret());
        Thread.sleep(100);
        Assert.assertTrue(credential.getRefreshDate().before(new Date()));
        Assert.assertTrue(credential.getExpiredDate().after(new Date()));
        Assert.assertFalse(credential.isExpired());
        Assert.assertNull(credential.getSecurityToken());

        credential = new Credential("accessKeyId", "accessSecret", 0);
        Assert.assertFalse(credential.isExpired());
        Assert.assertNull(credential.getExpiredDate());

        credential = new Credential("accessKeyId", "accessSecret", -1);
        Assert.assertFalse(credential.isExpired());
        Assert.assertNull(credential.getExpiredDate());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testConstructorWithTokenAndExpiredHours() throws InterruptedException {
        Credential credential = new Credential("accessKeyId", "accessSecret", "securityToken", 1);
        Assert.assertEquals("accessKeyId", credential.getAccessKeyId());
        Assert.assertEquals("accessSecret", credential.getAccessSecret());
        Assert.assertEquals("securityToken", credential.getSecurityToken());
        Assert.assertFalse(credential.isExpired());
        Thread.sleep(100);
        Assert.assertTrue(credential.getRefreshDate().before(new Date()));
        Assert.assertTrue(credential.getExpiredDate().after(new Date()));
    }

}
