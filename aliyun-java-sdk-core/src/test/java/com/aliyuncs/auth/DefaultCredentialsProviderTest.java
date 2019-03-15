package com.aliyuncs.auth;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.utils.AuthUtils;
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
        AuthUtils.setEnvironmentECSMetaData("");
        try {
            new DefaultCredentialsProvider();
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertEquals("Environment variable roleName('ALIBABA_CLOUD_ECS_METADATA') cannot be empty",
                    e.getMessage());
        }

        AuthUtils.setEnvironmentAccessKeyId("test");
        AuthUtils.setEnvironmentAccessKeySecret("test");
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
        AuthUtils.setEnvironmentECSMetaData(null);
        AuthUtils.setEnvironmentAccessKeyId(null);
        AuthUtils.setEnvironmentAccessKeySecret(null);
        System.setProperty(AuthConstant.SYSTEM_ACCESSKEYID, "");
        AuthUtils.setEnvironmentCredentialsFile(null);
        try{
            provider.getCredentials();
            Assert.fail();
        } catch (ClientException e){
            Assert.assertEquals("not found credentials", e.getMessage());
        }
    }

    @Test
    public void defaultCredentialsProviderTest() throws ClientException {
        DefaultCredentialsProvider.clearCredentialsProvider();
        AuthUtils.setEnvironmentECSMetaData("test");
        AuthUtils.setEnvironmentAccessKeyId("test");
        AuthUtils.setEnvironmentAccessKeySecret("test");
        DefaultCredentialsProvider provider = new DefaultCredentialsProvider();
        DefaultCredentialsProvider.addCredentialsProvider(new SystemPropertiesCredentialsProvider());
        Assert.assertTrue(provider.getCredentials() instanceof BasicCredentials);
        AuthUtils.setEnvironmentECSMetaData(null);
        AuthUtils.setEnvironmentAccessKeyId(null);
        AuthUtils.setEnvironmentAccessKeySecret(null);
        DefaultCredentialsProvider.clearCredentialsProvider();
    }

    @Test
    public void setClientTypeTest(){
        AuthUtils.setClientType("test");
        Assert.assertEquals("test", AuthUtils.getClientType());
        AuthUtils.setClientType("default");
    }
}
