package com.aliyuncs.auth;

import static org.mockito.Mockito.mock;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import com.aliyuncs.profile.IClientProfile;

public class StaticCredentialsProviderTest {

    @Test
    public void constructorNormal() {
        AlibabaCloudCredentials credentials = mock(AlibabaCloudCredentials.class);
        StaticCredentialsProvider provider = new StaticCredentialsProvider(credentials);
        Assert.assertEquals(credentials, provider.getCredentials());
    }

    @Test
    public void testConstructorLegacyCredentials() {
        Credential credential = mock(Credential.class);
        Mockito.when(credential.getSecurityToken()).thenReturn(null);
        IClientProfile profile = mock(IClientProfile.class);
        Mockito.when(profile.getCredential()).thenReturn(credential);

        StaticCredentialsProvider provider = new StaticCredentialsProvider(profile);
        Assert.assertTrue(provider.getCredentials() instanceof LegacyCredentials);

    }

    @Test
    public void testConstructorBasicSessionCredentials() {
        Credential credential = mock(Credential.class);
        Mockito.when(credential.getSecurityToken()).thenReturn("securityToken");
        Mockito.when(credential.getAccessKeyId()).thenReturn("accessKeyId");
        Mockito.when(credential.getAccessSecret()).thenReturn("accessSecret");
        IClientProfile profile = mock(IClientProfile.class);
        Mockito.when(profile.getCredential()).thenReturn(credential);

        StaticCredentialsProvider provider = new StaticCredentialsProvider(profile);
        Assert.assertTrue(provider.getCredentials() instanceof BasicSessionCredentials);
    }

}
