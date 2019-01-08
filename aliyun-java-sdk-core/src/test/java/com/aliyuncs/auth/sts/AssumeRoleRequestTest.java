package com.aliyuncs.auth.sts;

import org.junit.Assert;
import org.junit.Test;

public class AssumeRoleRequestTest {

    @Test
    public void testAssumeRoleRequest() {
        AssumeRoleRequest request = new AssumeRoleRequest();
        Assert.assertEquals("Sts", request.getSysProduct());
        // duration seconds
        Assert.assertNull(request.getDurationSeconds());
        Assert.assertNull(request.getSysQueryParameters().get("DurationSeconds"));
        request.setDurationSeconds(100L);
        Assert.assertTrue(100L == request.getDurationSeconds());
        Assert.assertEquals("100", request.getSysQueryParameters().get("DurationSeconds"));
        // role arn
        Assert.assertNull(request.getRoleArn());
        Assert.assertNull(request.getSysQueryParameters().get("RoleArn"));
        request.setRoleArn("roleArn");
        Assert.assertEquals("roleArn", request.getRoleArn());
        Assert.assertEquals("roleArn", request.getSysQueryParameters().get("RoleArn"));
        // policy
        Assert.assertNull(request.getPolicy());
        Assert.assertNull(request.getSysQueryParameters().get("Policy"));
        request.setPolicy("policy");
        Assert.assertEquals("policy", request.getPolicy());
        Assert.assertEquals("policy", request.getSysQueryParameters().get("Policy"));
        // roleSessionName
        Assert.assertNull(request.getRoleSessionName());
        Assert.assertNull(request.getSysQueryParameters().get("RoleSessionName"));
        request.setRoleSessionName("roleSessionName");
        Assert.assertEquals("roleSessionName", request.getRoleSessionName());
        Assert.assertEquals("roleSessionName", request.getSysQueryParameters().get("RoleSessionName"));

        Assert.assertTrue(request.getResponseClass() == AssumeRoleResponse.class);
    }
}