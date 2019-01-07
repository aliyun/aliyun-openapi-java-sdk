package com.aliyuncs.auth;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class StaticCredentialsProviderTest {
    @Test
    public void constructorNormal() {
        AlibabaCloudCredentials credentials = mock(AlibabaCloudCredentials.class);
        StaticCredentialsProvider provider = new StaticCredentialsProvider(credentials);
        Assert.assertNotNull(provider);
    }

    @Test
    public void getCredentials() {
        AlibabaCloudCredentials credentials = mock(AlibabaCloudCredentials.class);
        StaticCredentialsProvider provider = new StaticCredentialsProvider(credentials);
        Assert.assertEquals(credentials, provider.getCredentials());
    }
}
