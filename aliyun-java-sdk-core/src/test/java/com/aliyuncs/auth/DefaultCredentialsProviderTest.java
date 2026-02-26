package com.aliyuncs.auth;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.utils.AuthUtils;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;

public class DefaultCredentialsProviderTest {
    static class CredentialsProviderForTest implements AlibabaCloudCredentialsProvider {
        @Override
        public AlibabaCloudCredentials getCredentials() {
            return new BasicCredentials("", "");
        }
    }

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
    public void getCredentialsTest() throws ClientException, NoSuchFieldException, IllegalAccessException {
        DefaultCredentialsProvider provider = DefaultCredentialsProvider.builder()
                .reuseLastProviderEnabled(false)
                .build();
        new DefaultCredentialsProvider();
        AuthUtils.setEnvironmentECSMetaData("");
        new DefaultCredentialsProvider();

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
        // Clear the contents of the global credentials.ini
        Field field = ProfileCredentialsProvider.class.getDeclaredField("ini");
        field.setAccessible(true);
        field.set(ProfileCredentialsProvider.class, null);
        try {
            provider.getCredentials();
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertTrue(e.getMessage().contains("Unable to load credentials from any of the providers in the chain"));
        }

        AuthUtils.setEnvironmentRoleArn("test");
        AuthUtils.setEnvironmentOIDCProviderArn("test");
        AuthUtils.setEnvironmentOIDCTokenFilePath("test");
        Assert.assertTrue(AuthUtils.environmentEnableOIDC());
        provider = new DefaultCredentialsProvider();
        try {
            provider.getCredentials();
            Assert.fail();
        } catch (Exception e) {
            Assert.assertTrue(e.getMessage().contains("Read OIDC token failed"));
        }
        AuthUtils.setEnvironmentRoleArn(null);
        AuthUtils.setEnvironmentOIDCProviderArn(null);
        AuthUtils.setEnvironmentOIDCTokenFilePath(null);
        Assert.assertFalse(AuthUtils.environmentEnableOIDC());

        AuthUtils.setEnvironmentCredentialsURI("http://test");
        provider = new DefaultCredentialsProvider();
        try {
            provider.getCredentials();
            Assert.fail();
        } catch (ClientException e) {
            Assert.assertTrue(e.getMessage().contains("Failed to connect Server"));
        }

        AuthUtils.setEnvironmentCredentialsURI(null);
        DefaultCredentialsProvider.clearCredentialsProvider();
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
    public void setClientTypeTest() {
        AuthUtils.setClientType("test");
        Assert.assertEquals("test", AuthUtils.getClientType());
        AuthUtils.setClientType("default");
    }

    @Test
    public void reuseLastProviderEnabledTest() throws NoSuchFieldException, IllegalAccessException, ClientException {
        AuthUtils.setEnvironmentAccessKeyId("test");
        AuthUtils.setEnvironmentAccessKeySecret("test");
        DefaultCredentialsProvider provider = new DefaultCredentialsProvider();
        BasicCredentials credential = (BasicCredentials) provider.getCredentials();
        Assert.assertEquals("test", credential.getAccessKeyId());
        Assert.assertEquals("test", credential.getAccessKeySecret());

        Field providerField = DefaultCredentialsProvider.class.getDeclaredField("lastUsedCredentialsProvider");
        providerField.setAccessible(true);
        Field reuseEnableField = DefaultCredentialsProvider.class.getDeclaredField("reuseLastProviderEnabled");
        reuseEnableField.setAccessible(true);

        Assert.assertTrue(providerField.get(provider) instanceof EnvironmentVariableCredentialsProvider);
        Assert.assertTrue((Boolean) reuseEnableField.get(provider));

        DefaultCredentialsProvider.addCredentialsProvider(new CredentialsProviderForTest());
        credential = (BasicCredentials) provider.getCredentials();
        Assert.assertEquals("test", credential.getAccessKeyId());
        Assert.assertEquals("test", credential.getAccessKeySecret());
        Assert.assertTrue(providerField.get(provider) instanceof EnvironmentVariableCredentialsProvider);
        Assert.assertTrue((Boolean) reuseEnableField.get(provider));

        DefaultCredentialsProvider.clearCredentialsProvider();
        provider = DefaultCredentialsProvider.builder()
                .reuseLastProviderEnabled(false)
                .build();
        credential = (BasicCredentials) provider.getCredentials();
        Assert.assertEquals("test", credential.getAccessKeyId());
        Assert.assertEquals("test", credential.getAccessKeySecret());
        Assert.assertTrue(providerField.get(provider) instanceof EnvironmentVariableCredentialsProvider);
        Assert.assertFalse((Boolean) reuseEnableField.get(provider));

        DefaultCredentialsProvider.addCredentialsProvider(new CredentialsProviderForTest());
        credential = (BasicCredentials) provider.getCredentials();
        Assert.assertEquals("", credential.getAccessKeyId());
        Assert.assertEquals("", credential.getAccessKeySecret());
        Assert.assertTrue(providerField.get(provider) instanceof CredentialsProviderForTest);
        Assert.assertFalse((Boolean) reuseEnableField.get(provider));

        AuthUtils.setEnvironmentAccessKeyId(null);
        AuthUtils.setEnvironmentAccessKeySecret(null);
        DefaultCredentialsProvider.clearCredentialsProvider();
    }
}
