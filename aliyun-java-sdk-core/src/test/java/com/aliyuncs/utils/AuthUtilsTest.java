package com.aliyuncs.utils;

import org.junit.Assert;
import org.junit.Test;


public class AuthUtilsTest {
    @Test
    public void getPrivateKeyTest(){
        new AuthUtils();
        String path = AuthUtils.class.getClassLoader().getResource("project.properties").getPath();
        String privateKey = AuthUtils.getPrivateKey(path);
        Assert.assertNotNull(privateKey);
    }

    @Test
    public void environmentTest() {
        Assert.assertNull(AuthUtils.getEnvironmentAccessKeyId());
        AuthUtils.setEnvironmentAccessKeyId("test");
        Assert.assertEquals("test", AuthUtils.getEnvironmentAccessKeyId());
        AuthUtils.setEnvironmentAccessKeyId(null);

        Assert.assertNull(AuthUtils.getEnvironmentAccessKeySecret());
        AuthUtils.setEnvironmentAccessKeySecret("test");
        Assert.assertEquals("test", AuthUtils.getEnvironmentAccessKeySecret());
        AuthUtils.setEnvironmentAccessKeySecret(null);

        AuthUtils.setEnvironmentCredentialsFile("test");
        Assert.assertEquals("test", AuthUtils.getEnvironmentCredentialsFile());
        AuthUtils.setEnvironmentCredentialsFile(null);
        Assert.assertNull(AuthUtils.getEnvironmentCredentialsFile());

        Assert.assertNull(AuthUtils.getEnvironmentECSMetaData());
        AuthUtils.setEnvironmentECSMetaData("test");
        Assert.assertEquals("test", AuthUtils.getEnvironmentECSMetaData());
        AuthUtils.setEnvironmentECSMetaData(null);
        Assert.assertFalse(AuthUtils.environmentEnableOIDC());

        Assert.assertFalse(AuthUtils.getDisableECSIMDSv1());
        AuthUtils.disableECSIMDSv1(true);
        Assert.assertTrue(AuthUtils.getDisableECSIMDSv1());
        AuthUtils.disableECSIMDSv1(false);
        Assert.assertFalse(AuthUtils.getDisableECSIMDSv1());

        Assert.assertNull(AuthUtils.getEnvironmentRoleArn());
        AuthUtils.setEnvironmentRoleArn("test");
        Assert.assertEquals("test", AuthUtils.getEnvironmentRoleArn());
        Assert.assertFalse(AuthUtils.environmentEnableOIDC());

        Assert.assertNull(AuthUtils.getEnvironmentOIDCProviderArn());
        AuthUtils.setEnvironmentOIDCProviderArn("test");
        Assert.assertEquals("test", AuthUtils.getEnvironmentOIDCProviderArn());
        Assert.assertFalse(AuthUtils.environmentEnableOIDC());

        Assert.assertNull(AuthUtils.getEnvironmentOIDCTokenFilePath());
        AuthUtils.setEnvironmentOIDCTokenFilePath("test");
        Assert.assertEquals("test", AuthUtils.getEnvironmentOIDCTokenFilePath());
        Assert.assertTrue(AuthUtils.environmentEnableOIDC());

        AuthUtils.setEnvironmentRoleArn(null);
        AuthUtils.setEnvironmentOIDCProviderArn(null);
        AuthUtils.setEnvironmentOIDCTokenFilePath(null);
        Assert.assertFalse(AuthUtils.environmentEnableOIDC());

        Assert.assertNull(AuthUtils.getEnvironmentRoleSessionName());
        AuthUtils.setEnvironmentRoleSessionName("test");
        Assert.assertEquals("test", AuthUtils.getEnvironmentRoleSessionName());
        AuthUtils.setEnvironmentRoleSessionName(null);

        Assert.assertNull(AuthUtils.getEnvironmentSTSRegion());
        AuthUtils.setEnvironmentSTSRegion("test");
        Assert.assertEquals("test", AuthUtils.getEnvironmentSTSRegion());
        AuthUtils.setEnvironmentSTSRegion(null);

        Assert.assertFalse(AuthUtils.isDisableECSMetaData());
        AuthUtils.disableECSMetaData(true);
        Assert.assertTrue(AuthUtils.isDisableECSMetaData());
        AuthUtils.disableECSMetaData(false);
        Assert.assertFalse(AuthUtils.isDisableECSMetaData());

        Assert.assertFalse(AuthUtils.isEnableVpcEndpoint());
        AuthUtils.enableVpcEndpoint(true);
        Assert.assertTrue(AuthUtils.isEnableVpcEndpoint());
        AuthUtils.enableVpcEndpoint(false);
        Assert.assertFalse(AuthUtils.isEnableVpcEndpoint());

        Assert.assertFalse(AuthUtils.isDisableCLIProfile());
        AuthUtils.disableCLIProfile(true);
        Assert.assertTrue(AuthUtils.isDisableCLIProfile());
        AuthUtils.disableCLIProfile(false);
        Assert.assertFalse(AuthUtils.isDisableCLIProfile());
    }

    @Test
    public void clientTypeTest() {
        AuthUtils.setClientType(null);
        Assert.assertEquals("default", AuthUtils.getClientType());
        AuthUtils.setClientType("test");
        Assert.assertEquals("test", AuthUtils.getClientType());
        AuthUtils.setClientType(null);
    }
}
