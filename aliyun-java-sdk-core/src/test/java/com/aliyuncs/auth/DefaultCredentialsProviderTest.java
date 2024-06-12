package com.aliyuncs.auth;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.utils.AuthUtils;
import com.aliyuncs.utils.EnvHelper;

import org.junit.Assert;
import org.junit.Test;

public class DefaultCredentialsProviderTest {
    @Test
    public void userConfigurationProvidersTest() {
        SystemPropertiesCredentialsProvider provider = new SystemPropertiesCredentialsProvider();
        DefaultCredentialsProvider.addCredentialsProvider(provider);
        Assert.assertTrue(DefaultCredentialsProvider.containsCredentialsProvider(provider));

        DefaultCredentialsProvider.removeCredentialsProvider(provider);
        Assert.assertFalse(DefaultCredentialsProvider.containsCredentialsProvider(provider));

        DefaultCredentialsProvider.addCredentialsProvider(provider);
        DefaultCredentialsProvider.clearCredentialsProvider();
        Assert.assertFalse(DefaultCredentialsProvider.containsCredentialsProvider(provider));
    }

    @Test
    public void getCredentialsTest() throws ClientException {
        DefaultCredentialsProvider provider = new DefaultCredentialsProvider();
        EnvHelper.setenv("ALIBABA_CLOUD_ECS_METADATA", "");
        try {
            new DefaultCredentialsProvider();
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals("Environment variable roleName('ALIBABA_CLOUD_ECS_METADATA') cannot be empty",
                    e.getMessage());
        }

        EnvHelper.setenv("ALIBABA_CLOUD_ACCESS_KEY_ID", "test");
        EnvHelper.setenv("ALIBABA_CLOUD_ACCESS_KEY_SECRET", "test");
        AlibabaCloudCredentials credential = provider.getCredentials();
        Assert.assertTrue(credential instanceof BasicCredentials);

        DefaultCredentialsProvider.addCredentialsProvider(new AlibabaCloudCredentialsProvider() {
            @Override
            public AlibabaCloudCredentials getCredentials() {
                return null;
            }
        });
        DefaultCredentialsProvider.addCredentialsProvider(new AlibabaCloudCredentialsProvider() {
            @Override
            public AlibabaCloudCredentials getCredentials() {
                return new BasicCredentials("", "");
            }
        });
        credential = provider.getCredentials();
        Assert.assertTrue(credential instanceof BasicCredentials);

        DefaultCredentialsProvider.clearCredentialsProvider();
        EnvHelper.setenv("ALIBABA_CLOUD_ECS_METADATA", null);
        EnvHelper.setenv("ALIBABA_CLOUD_ACCESS_KEY_ID", null);
        EnvHelper.setenv("ALIBABA_CLOUD_ACCESS_KEY_SECRET", null);
        System.setProperty(AuthConstant.SYSTEM_ACCESSKEYID, "");
        EnvHelper.setenv("ALIBABA_CLOUD_CREDENTIALS_FILE", null);
        try {
            provider.getCredentials();
        } catch (ClientException e) {
            Assert.assertEquals("not found credentials", e.getMessage());
        }
    }

    @Test
    public void defaultCredentialsProviderTest() throws ClientException {
        DefaultCredentialsProvider.clearCredentialsProvider();
        EnvHelper.setenv("ALIBABA_CLOUD_ECS_METADATA", "test");
        EnvHelper.setenv("ALIBABA_CLOUD_ACCESS_KEY_ID", "test");
        EnvHelper.setenv("ALIBABA_CLOUD_ACCESS_KEY_SECRET", "test");
        DefaultCredentialsProvider provider = new DefaultCredentialsProvider();
        DefaultCredentialsProvider.addCredentialsProvider(new SystemPropertiesCredentialsProvider());
        Assert.assertTrue(provider.getCredentials() instanceof BasicCredentials);
        EnvHelper.setenv("ALIBABA_CLOUD_ECS_METADATA", null);
        EnvHelper.setenv("ALIBABA_CLOUD_ACCESS_KEY_ID", null);
        EnvHelper.setenv("ALIBABA_CLOUD_ACCESS_KEY_SECRET", null);
        DefaultCredentialsProvider.clearCredentialsProvider();
    }

    @Test
    public void setClientTypeTest() {
        AuthUtils.setClientType("test");
        Assert.assertEquals("test", AuthUtils.getClientType());
        AuthUtils.setClientType("default");
    }
}
