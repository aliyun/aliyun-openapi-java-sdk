package com.aliyuncs.auth;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.utils.AuthUtils;
import org.junit.Assert;
import org.junit.Test;

public class EnvironmentVariableCredentialsProviderTest {

    @Test
    public void getCredentialsTest() throws ClientException {
        new AuthConstant();
        EnvironmentVariableCredentialsProvider provider = new EnvironmentVariableCredentialsProvider();
        AuthUtils.setClientType("aa");
        Assert.assertNull(provider.getCredentials());

        AuthUtils.setClientType("default");
        try {
            provider.getCredentials();
            Assert.fail();
        } catch (Exception e) {
            Assert.assertEquals("Environment variable accessKeyId cannot be empty.", e.getMessage());
        }

        AuthUtils.setEnvironmentAccessKeyId("accessKeyIdTest");
        try {
            provider.getCredentials();
            Assert.fail();
        } catch (Exception e) {
            Assert.assertEquals("Environment variable accessKeySecret cannot be empty.", e.getMessage());
        }

        AuthUtils.setEnvironmentAccessKeySecret("accessKeyIdTest");
        AlibabaCloudCredentials credential = provider.getCredentials();
        String accessKeyId = credential.getAccessKeyId();
        String accessKeySecret = credential.getAccessKeySecret();
        Assert.assertEquals("accessKeyIdTest", accessKeyId);
        Assert.assertEquals("accessKeyIdTest", accessKeySecret);

        AuthUtils.setEnvironmentAccessKeyId(null);
        try {
            provider.getCredentials();
            Assert.fail();
        } catch (Exception e) {
            Assert.assertEquals("Environment variable accessKeyId cannot be empty.", e.getMessage());
        }

        AuthUtils.setEnvironmentAccessKeyId("");
        try {
            provider.getCredentials();
            Assert.fail();
        } catch (ClientException e){
            Assert.assertEquals("Environment variable accessKeyId cannot be empty.", e.getMessage());
        }
        AuthUtils.setEnvironmentAccessKeyId("a");
        AuthUtils.setEnvironmentAccessKeySecret("");
        try {
            provider.getCredentials();
            Assert.fail();
        } catch (ClientException e){
            Assert.assertEquals("Environment variable accessKeySecret cannot be empty.", e.getMessage());
        }
        AuthUtils.setEnvironmentAccessKeySecret("secret");
        AuthUtils.setEnvironmentSecurityToken("token");
        BasicSessionCredentials basicSessionCredentials = (BasicSessionCredentials)provider.getCredentials();
        Assert.assertEquals("a", basicSessionCredentials.getAccessKeyId());
        Assert.assertEquals("secret", basicSessionCredentials.getAccessKeySecret());
        Assert.assertEquals("token", basicSessionCredentials.getSessionToken());

        AuthUtils.setEnvironmentAccessKeyId(null);
        AuthUtils.setEnvironmentAccessKeySecret(null);
        AuthUtils.setEnvironmentSecurityToken(null);
    }
}
