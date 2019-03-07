package com.aliyuncs.auth;

import org.junit.Assert;
import org.junit.Test;

public class CredentialsProviderFactoryTest {
    @Test
    public void createCredentialsProviderTest(){
        CredentialsProviderFactory factory = new CredentialsProviderFactory();
        SystemPropertiesCredentialsProvider provider = new SystemPropertiesCredentialsProvider();
        Assert.assertTrue(factory.createCredentialsProvider(provider) == provider);
    }
}
