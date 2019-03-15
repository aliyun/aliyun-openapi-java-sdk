package com.aliyuncs.auth;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.utils.AuthUtils;
import org.junit.Assert;
import org.junit.Test;

public class SystemPropertiesCredentialsProviderTest {

    @Test
    public void getCredentialsTest() throws ClientException {
        SystemPropertiesCredentialsProvider provider = new SystemPropertiesCredentialsProvider();
        AuthUtils.setClientType("aa");
        Assert.assertNull(provider.getCredentials());

        AuthUtils.setClientType("default");
        System.setProperty(AuthConstant.SYSTEM_ACCESSKEYSECRET, "");
        System.setProperty(AuthConstant.SYSTEM_ACCESSKEYID, "accessKeyIdTest");
        Assert.assertNull(provider.getCredentials());

        System.setProperty(AuthConstant.SYSTEM_ACCESSKEYSECRET, "accessKeyIdTest");
        AlibabaCloudCredentials credential = provider.getCredentials();
        String accessKeyId = credential.getAccessKeyId();
        String accessKeySecret = credential.getAccessKeySecret();
        Assert.assertEquals("accessKeyIdTest", accessKeyId);
        Assert.assertEquals("accessKeyIdTest", accessKeySecret);

        System.setProperty(AuthConstant.SYSTEM_ACCESSKEYID, "");
        Assert.assertNull(provider.getCredentials());

        System.setProperty(AuthConstant.SYSTEM_ACCESSKEYSECRET, "");
    }
}
