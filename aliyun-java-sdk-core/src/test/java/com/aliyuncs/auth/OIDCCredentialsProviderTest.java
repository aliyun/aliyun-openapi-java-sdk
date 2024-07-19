package com.aliyuncs.auth;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Assert;
import org.junit.Test;
import org.junit.function.ThrowingRunnable;

import com.aliyuncs.exceptions.ClientException;

public class OIDCCredentialsProviderTest {
    @Test
    public void constructorOIDCCredentialsProvider() throws ClientException {
        String filePath = OIDCCredentialsProviderTest.class.getClassLoader().getResource("oidctoken").getPath();
        OIDCCredentialsProvider provider = new OIDCCredentialsProvider("roleArn", "providerArn", filePath, "sessionname", null);
        Assert.assertNotNull(provider);
        Assert.assertEquals("roleArn", provider.getRoleArn());
        provider.setRoleArn("new-role-arn");
        Assert.assertEquals("new-role-arn", provider.getRoleArn());

        Assert.assertEquals("providerArn", provider.getOidcProviderArn());
        provider.setOidcProviderArn("new-providerArn");
        Assert.assertEquals("new-providerArn", provider.getOidcProviderArn());

        Assert.assertTrue(provider.getOidcTokenFilePath().endsWith("target/test-classes/oidctoken"));
        provider.setOidcTokenFilePath("/tmp/oidctoken");
        Assert.assertEquals("/tmp/oidctoken", provider.getOidcTokenFilePath());

        Assert.assertEquals("sessionname", provider.getRoleSessionName());
        provider.setRoleSessionName("new-sessionname");
        Assert.assertEquals("new-sessionname", provider.getRoleSessionName());

        Assert.assertEquals(null, provider.getPolicy());
        provider.setPolicy("{}");
        Assert.assertEquals("{}", provider.getPolicy());
    }

    @Test
    public void emtptyRoleArnTest() throws ClientException {
        ClientException ex = Assert.assertThrows(ClientException.class, new ThrowingRunnable() {
            @Override
            public void run() throws Throwable {
                new OIDCCredentialsProvider(null, null, null, null, null);
            }
        });
        Assert.assertEquals("roleArn does not exist and env ALIBABA_CLOUD_ROLE_ARN is null.", ex.getMessage());

        ClientException ex2 = Assert.assertThrows(ClientException.class, new ThrowingRunnable() {
            @Override
            public void run() throws Throwable {
                new OIDCCredentialsProvider("roleArn", null, null, null, null);
            }
        });
        Assert.assertEquals("OIDCProviderArn does not exist and env ALIBABA_CLOUD_OIDC_PROVIDER_ARN is null.", ex2.getMessage());

        ClientException ex3 = Assert.assertThrows(ClientException.class, new ThrowingRunnable() {
            @Override
            public void run() throws Throwable {
                new OIDCCredentialsProvider("roleArn", "providerArn", null, null, null);
            }
        });
        Assert.assertEquals("OIDCTokenFilePath does not exist and env ALIBABA_CLOUD_OIDC_TOKEN_FILE is null.", ex3.getMessage());
    }

    @Test
    public void getCredentialsTest() throws ClientException {
        String filePath = OIDCCredentialsProviderTest.class.getClassLoader().getResource("oidctoken").getPath();
        final AlibabaCloudCredentialsProvider provider = new OIDCCredentialsProvider("roleArn", "providerArn", filePath, null, "us-west-1");
        Assert.assertNotNull(provider);
        ClientException ex = Assert.assertThrows(ClientException.class, new ThrowingRunnable() {
            @Override
            public void run() throws Throwable {
                provider.getCredentials();
            }
        });
        String message = ex.getMessage();
        Assert.assertTrue(message.contains("Parameter OIDCProviderArn is not valid"));
    }

    @Test
    public void parseCredentialsTest() throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
        final Method parseCredentials = OIDCCredentialsProvider.class.getDeclaredMethod("parseCredentials", String.class, long.class);
        parseCredentials.setAccessible(true);
        InvocationTargetException ex = Assert.assertThrows(InvocationTargetException.class, new ThrowingRunnable() {
            public void run() throws IllegalAccessException, InvocationTargetException {
                parseCredentials.invoke(null, "{}", 3600L);
            }
        });
        
        ClientException cause = (ClientException)ex.getCause();
        Assert.assertEquals("AssumeRoleWithOIDC failed: {}", cause.getMessage());
    }

    @Test
    public void parseCredentialsWithEmptyBodyTest() throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
        final Method parseCredentials = OIDCCredentialsProvider.class.getDeclaredMethod("parseCredentials", String.class, long.class);
        parseCredentials.setAccessible(true);
        InvocationTargetException ex = Assert.assertThrows(InvocationTargetException.class, new ThrowingRunnable() {
            public void run() throws IllegalAccessException, InvocationTargetException {
                parseCredentials.invoke(null, "", 3600L);
            }
        });
        
        ClientException cause = (ClientException)ex.getCause();
        Assert.assertEquals("Invalid JSON", cause.getMessage());
    }

    @Test
    public void parseCredentialsWithCredentialsTest() throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
        final Method parseCredentials = OIDCCredentialsProvider.class.getDeclaredMethod("parseCredentials", String.class, long.class);
        parseCredentials.setAccessible(true);
        BasicSessionCredentials c = (BasicSessionCredentials)parseCredentials.invoke(null, "{\"Credentials\": {\"AccessKeyId\": \"sts_ak_id\",\"AccessKeySecret\": \"sts_ak_secret\", \"SecurityToken\": \"securitytoken\",\"Expiration\": \"2021-10-20T04:27:09Z\"}}", 3600L);
        Assert.assertEquals("sts_ak_id", c.getAccessKeyId());
        Assert.assertEquals("sts_ak_secret", c.getAccessKeySecret());
        Assert.assertEquals("securitytoken", c.getSessionToken());
        Assert.assertFalse(c.willSoonExpire());
    }
}
