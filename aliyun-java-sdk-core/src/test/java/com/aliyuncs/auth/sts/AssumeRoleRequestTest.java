package com.aliyuncs.auth.sts;

import org.junit.Assert;
import org.junit.Test;

public class AssumeRoleRequestTest {

    @Test
    public void testAssumeRoleRequest() {
        AssumeRoleRequest request = new AssumeRoleRequest();
        Assert.assertEquals("Sts", request.getBizProduct());
        // duration seconds
        Assert.assertNull(request.getDurationSeconds());
        Assert.assertNull(request.getBizQueryParameters().get("DurationSeconds"));
        request.setDurationSeconds(100L);
        Assert.assertTrue(100L == request.getDurationSeconds());
        Assert.assertEquals("100", request.getBizQueryParameters().get("DurationSeconds"));
        // role arn
        Assert.assertNull(request.getRoleArn());
        Assert.assertNull(request.getBizQueryParameters().get("RoleArn"));
        request.setRoleArn("roleArn");
        Assert.assertEquals("roleArn", request.getRoleArn());
        Assert.assertEquals("roleArn", request.getBizQueryParameters().get("RoleArn"));
        // policy
        Assert.assertNull(request.getPolicy());
        Assert.assertNull(request.getBizQueryParameters().get("Policy"));
        request.setPolicy("policy");
        Assert.assertEquals("policy", request.getPolicy());
        Assert.assertEquals("policy", request.getBizQueryParameters().get("Policy"));
        // roleSessionName
        Assert.assertNull(request.getRoleSessionName());
        Assert.assertNull(request.getBizQueryParameters().get("RoleSessionName"));
        request.setRoleSessionName("roleSessionName");
        Assert.assertEquals("roleSessionName", request.getRoleSessionName());
        Assert.assertEquals("roleSessionName", request.getBizQueryParameters().get("RoleSessionName"));

        Assert.assertTrue(request.getResponseClass() == AssumeRoleResponse.class);
    }
}