package com.aliyuncs.auth.sts;

import com.aliyuncs.auth.sts.AssumeRoleResponse.AssumedRoleUser;
import com.aliyuncs.auth.sts.AssumeRoleResponse.Credentials;
import com.aliyuncs.transform.UnmarshallerContext;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class AssumeRoleResponseTest {

    @Test
    public void testCredentials() {
        AssumeRoleResponse.Credentials credentials = new AssumeRoleResponse.Credentials();
        Assert.assertNull(credentials.getAccessKeyId());
        credentials.setAccessKeyId("accessKeyId");
        Assert.assertEquals("accessKeyId", credentials.getAccessKeyId());
        Assert.assertNull(credentials.getAccessKeySecret());
        credentials.setAccessKeySecret("accessKeySecret");
        Assert.assertEquals("accessKeySecret", credentials.getAccessKeySecret());
        Assert.assertNull(credentials.getExpiration());
        credentials.setExpiration("expiration");
        Assert.assertEquals("expiration", credentials.getExpiration());
        Assert.assertNull(credentials.getSecurityToken());
        credentials.setSecurityToken("securityToken");
        Assert.assertEquals("securityToken", credentials.getSecurityToken());
    }

    @Test
    public void testAssumedRoleUser() {
        AssumeRoleResponse.AssumedRoleUser assumedRoleUser = new AssumeRoleResponse.AssumedRoleUser();
        Assert.assertNull(assumedRoleUser.getArn());
        assumedRoleUser.setArn("arn");
        Assert.assertEquals("arn", assumedRoleUser.getArn());
        Assert.assertNull(assumedRoleUser.getAssumedRoleId());
        assumedRoleUser.setAssumedRoleId("assumedRoleId");
        Assert.assertEquals("assumedRoleId", assumedRoleUser.getAssumedRoleId());
    }

    @Test
    public void testAssumeRoleResponse() {
        AssumeRoleResponse assumeRoleResponse = new AssumeRoleResponse();
        Assert.assertNull(assumeRoleResponse.getAssumedRoleUser());
        assumeRoleResponse.setAssumedRoleUser(new AssumedRoleUser());
        Assert.assertTrue(assumeRoleResponse.getAssumedRoleUser() instanceof AssumedRoleUser);
        Assert.assertNull(assumeRoleResponse.getCredentials());
        assumeRoleResponse.setCredentials(new Credentials());
        Assert.assertTrue(assumeRoleResponse.getCredentials() instanceof Credentials);
        Assert.assertNull(assumeRoleResponse.getRequestId());
        assumeRoleResponse.setRequestId("requestId");
        Assert.assertEquals("requestId", assumeRoleResponse.getRequestId());
        UnmarshallerContext unmarshallerContext = new UnmarshallerContext();
        Map<String, String> responseMap = new HashMap<String, String>();
        responseMap.put("key", "3");
        unmarshallerContext.setResponseMap(responseMap);
        Assert.assertTrue(assumeRoleResponse.getInstance(unmarshallerContext) instanceof AssumeRoleResponse);
    }
}
