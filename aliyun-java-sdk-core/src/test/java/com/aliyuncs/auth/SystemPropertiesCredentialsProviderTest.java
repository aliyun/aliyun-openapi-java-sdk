package com.aliyuncs.auth;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.utils.AuthUtils;
import org.junit.Assert;
import org.junit.Test;

public class SystemPropertiesCredentialsProviderTest {

    @Test
    public void getCredentialsTest() throws ClientException {
        System.setProperty(AuthConstant.SYSTEM_ACCESSKEYSECRET, "");
        System.setProperty(AuthConstant.SYSTEM_ACCESSKEYID, "");
        SystemPropertiesCredentialsProvider provider = new SystemPropertiesCredentialsProvider();
        AuthUtils.setClientType("aa");
        Assert.assertNull(provider.getCredentials());

        AuthUtils.setClientType("default");
        try {
            provider.getCredentials();
            Assert.fail();
        } catch (Exception e) {
            Assert.assertEquals("System property alibabacloud.accessKeyId cannot be empty.", e.getMessage());
        }

        System.setProperty(AuthConstant.SYSTEM_ACCESSKEYSECRET, "");
        System.setProperty(AuthConstant.SYSTEM_ACCESSKEYID, "accessKeyIdTest");
        try {
            provider.getCredentials();
            Assert.fail();
        } catch (Exception e) {
            Assert.assertEquals("System property alibabacloud.accessKeySecret cannot be empty.", e.getMessage());
        }

        System.setProperty(AuthConstant.SYSTEM_ACCESSKEY_SECRET, "accessKeyIdTest");
        AlibabaCloudCredentials credential = provider.getCredentials();
        String accessKeyId = credential.getAccessKeyId();
        String accessKeySecret = credential.getAccessKeySecret();
        Assert.assertEquals("accessKeyIdTest", accessKeyId);
        Assert.assertEquals("accessKeyIdTest", accessKeySecret);

        System.setProperty(AuthConstant.SYSTEM_ACCESSKEYSECRET, "accessKeySecretTest");
        credential = provider.getCredentials();
        accessKeyId = credential.getAccessKeyId();
        accessKeySecret = credential.getAccessKeySecret();
        Assert.assertEquals("accessKeyIdTest", accessKeyId);
        Assert.assertEquals("accessKeySecretTest", accessKeySecret);

        System.setProperty(AuthConstant.SYSTEM_SESSION_TOKEN, "sessionTokenTest");
        BasicSessionCredentials basicSessionCredentials = (BasicSessionCredentials) provider.getCredentials();
        Assert.assertEquals("accessKeyIdTest", basicSessionCredentials.getAccessKeyId());
        Assert.assertEquals("accessKeySecretTest", basicSessionCredentials.getAccessKeySecret());
        Assert.assertEquals("sessionTokenTest", basicSessionCredentials.getSessionToken());

        System.setProperty(AuthConstant.SYSTEM_ACCESSKEYID, "");
        System.setProperty(AuthConstant.SYSTEM_ACCESSKEY_SECRET, "");
        System.setProperty(AuthConstant.SYSTEM_ACCESSKEYSECRET, "");
        System.setProperty(AuthConstant.SYSTEM_SESSION_TOKEN, "");
    }
}
