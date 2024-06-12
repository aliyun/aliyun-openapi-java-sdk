package com.aliyuncs.auth;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.utils.AuthUtils;
import com.aliyuncs.utils.EnvHelper;

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
        EnvHelper.setenv("ALIBABA_CLOUD_ACCESS_KEY_ID", "accessKeyIdTest");
        Assert.assertNull(provider.getCredentials());

        EnvHelper.setenv("ALIBABA_CLOUD_ACCESS_KEY_SECRET", "accessKeyIdTest");
        AlibabaCloudCredentials credential = provider.getCredentials();
        String accessKeyId = credential.getAccessKeyId();
        String accessKeySecret = credential.getAccessKeySecret();
        Assert.assertEquals("accessKeyIdTest", accessKeyId);
        Assert.assertEquals("accessKeyIdTest", accessKeySecret);

        EnvHelper.setenv("ALIBABA_CLOUD_ACCESS_KEY_ID", null);
        Assert.assertNull(provider.getCredentials());
        EnvHelper.setenv("ALIBABA_CLOUD_ACCESS_KEY_ID", "");
        try {
            provider.getCredentials();
            Assert.fail();
        } catch (ClientException e){
            Assert.assertEquals("Environment variable accessKeyId cannot be empty", e.getMessage());
        }
        EnvHelper.setenv("ALIBABA_CLOUD_ACCESS_KEY_ID", "a");
        EnvHelper.setenv("ALIBABA_CLOUD_ACCESS_KEY_SECRET", "");
        try {
            provider.getCredentials();
            Assert.fail();
        } catch (ClientException e){
            Assert.assertEquals("Environment variable accessKeySecret cannot be empty", e.getMessage());
        }

        EnvHelper.setenv("ALIBABA_CLOUD_ACCESS_KEY_ID", null);
        EnvHelper.setenv("ALIBABA_CLOUD_ACCESS_KEY_SECRET", null);
    }
}
