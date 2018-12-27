package com.aliyuncs.auth.sts;

import org.junit.Assert;
import org.junit.Test;

/**
 * GetSessionAccessKeyRequestTest
 */
public class GetSessionAccessKeyRequestTest {

    @Test
    public void testGetSessionAccessKeyRequestTest() {
        GetSessionAccessKeyRequest request = new GetSessionAccessKeyRequest();
        Assert.assertEquals("Sts", request.getProduct());
        // duration seconds
        Assert.assertEquals(3600, request.getDurationSeconds());
        Assert.assertNull(request.getQueryParameters().get("DurationSeconds"));
        request.setDurationSeconds(100);
        Assert.assertTrue(100 == request.getDurationSeconds());
        Assert.assertEquals("100", request.getQueryParameters().get("DurationSeconds"));
        // public key id
        Assert.assertNull(request.getPublicKeyId());
        Assert.assertNull(request.getQueryParameters().get("PublicKeyId"));
        request.setPublicKeyId("publicKeyId");
        Assert.assertEquals("publicKeyId", request.getPublicKeyId());
        Assert.assertEquals("publicKeyId", request.getQueryParameters().get("PublicKeyId"));
        // policy
        // Assert.assertNull(request.getPolicy());
        // Assert.assertNull(request.getQueryParameters().get("Policy"));
        // request.setPolicy("policy");
        // Assert.assertEquals("policy", request.getPolicy());
        // Assert.assertEquals("policy", request.getQueryParameters().get("Policy"));
        // // roleSessionName
        // Assert.assertNull(request.getRoleSessionName());
        // Assert.assertNull(request.getQueryParameters().get("RoleSessionName"));
        // request.setRoleSessionName("roleSessionName");
        // Assert.assertEquals("roleSessionName", request());
        // Assert.assertEquals("roleSessionName",
        // request.getQueryParameters().get("RoleSessionName"));

        Assert.assertTrue(request.getResponseClass() == GenerateSessionAccessKeyResponse.class);
    }
}