package com.aliyuncs.auth.sts;

import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import com.aliyuncs.auth.sts.AssumeRoleResponse.AssumedRoleUser;
import com.aliyuncs.auth.sts.AssumeRoleResponse.Credentials;
import com.aliyuncs.transform.UnmarshallerContext;

public class AssumeRoleResponseTest {

    @Test
    public void testCredentials() {
        AssumeRoleResponse.Credentials credentials = new AssumeRoleResponse.Credentials();
        credentials.setAccessKeyId("accessKeyId");
        Assert.assertEquals("accessKeyId", credentials.getAccessKeyId());
        credentials.setAccessKeySecret("accessKeySecret");
        Assert.assertEquals("accessKeySecret", credentials.getAccessKeySecret());
        credentials.setExpiration("expiration");
        Assert.assertEquals("expiration", credentials.getExpiration());
        credentials.setSecurityToken("securityToken");
        Assert.assertEquals("securityToken", credentials.getSecurityToken());
    }

    @Test
    public void testAssumedRoleUser() {
        AssumeRoleResponse.AssumedRoleUser assumedRoleUser = new AssumeRoleResponse.AssumedRoleUser();
        assumedRoleUser.setArn("arn");
        Assert.assertEquals("arn", assumedRoleUser.getArn());
        assumedRoleUser.setAssumedRoleId("assumedRoleId");
        Assert.assertEquals("assumedRoleId", assumedRoleUser.getAssumedRoleId());
    }

    @Test
    public void testAssumeRoleResponse() {
        AssumeRoleResponse assumeRoleResponse = new AssumeRoleResponse();
        assumeRoleResponse.setAssumedRoleUser(new AssumedRoleUser());
        Assert.assertTrue(assumeRoleResponse.getAssumedRoleUser() instanceof AssumedRoleUser);
        assumeRoleResponse.setCredentials(new Credentials());
        Assert.assertTrue(assumeRoleResponse.getCredentials() instanceof Credentials);
        assumeRoleResponse.setRequestId("requestId");
        Assert.assertEquals("requestId", assumeRoleResponse.getRequestId());
        UnmarshallerContext unmarshallerContext = new UnmarshallerContext();
        Map<String, String> responseMap = new HashMap<String, String>();
        responseMap.put("key", "3");
        unmarshallerContext.setResponseMap(responseMap);
        Assert.assertTrue(assumeRoleResponse.getInstance(unmarshallerContext) instanceof AssumeRoleResponse);
    }
}
