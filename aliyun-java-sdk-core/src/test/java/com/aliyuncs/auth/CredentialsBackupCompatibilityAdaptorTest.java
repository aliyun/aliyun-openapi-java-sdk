package com.aliyuncs.auth;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;

public class CredentialsBackupCompatibilityAdaptorTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testIsExpired() {
        AlibabaCloudCredentialsProvider provider = Mockito.mock(AlibabaCloudCredentialsProvider.class);
        CredentialsBackupCompatibilityAdaptor adaptor = new CredentialsBackupCompatibilityAdaptor(provider);
        Assert.assertFalse(adaptor.isExpired());
    }

    @Test
    public void testGetCredentials() throws InterruptedException, ServerException, ClientException {
        AlibabaCloudCredentialsProvider provider = Mockito.mock(AlibabaCloudCredentialsProvider.class);
        AlibabaCloudCredentials credentials = Mockito.mock(AlibabaCloudCredentials.class);
        Mockito.when(credentials.getAccessKeyId()).thenReturn("accessKeyId");
        Mockito.when(credentials.getAccessKeySecret()).thenReturn("accessKeySecret");
        CredentialsBackupCompatibilityAdaptor adaptor = new CredentialsBackupCompatibilityAdaptor(provider);
        Mockito.when(provider.getCredentials()).thenReturn(credentials);
        Assert.assertEquals("accessKeyId", adaptor.getAccessKeyId());
        Assert.assertEquals("accessKeySecret", adaptor.getAccessSecret());
    }

    @Test
    public void testGetCredentialsException() throws InterruptedException, ServerException, ClientException {
        AlibabaCloudCredentialsProvider provider = Mockito.mock(AlibabaCloudCredentialsProvider.class);
        CredentialsBackupCompatibilityAdaptor adaptor = new CredentialsBackupCompatibilityAdaptor(provider);
        ClientException clientException = new ClientException("error msg");
        Mockito.doThrow(clientException).when(provider).getCredentials();
        thrown.expect(RuntimeException.class);
        thrown.expectMessage(clientException.toString());
        adaptor.getAccessKeyId();
    }

    @Test
    public void testGetSecurityToken() throws ServerException, ClientException {
        AlibabaCloudCredentialsProvider provider = Mockito.mock(AlibabaCloudCredentialsProvider.class);
        AlibabaCloudCredentials credentials = Mockito.mock(LegacyCredentials.class);
        CredentialsBackupCompatibilityAdaptor adaptor = new CredentialsBackupCompatibilityAdaptor(provider);
        Mockito.when(provider.getCredentials()).thenReturn(credentials);
        Assert.assertNull(adaptor.getSecurityToken());
    }

    @Test
    public void testGetBasicSessionCredentialsSecurityToken() throws ServerException, ClientException {
        AlibabaCloudCredentialsProvider provider = Mockito.mock(AlibabaCloudCredentialsProvider.class);
        BasicSessionCredentials credentials = Mockito.mock(BasicSessionCredentials.class);
        Mockito.when(credentials.getSessionToken()).thenReturn("sessionToken");
        CredentialsBackupCompatibilityAdaptor adaptor = new CredentialsBackupCompatibilityAdaptor(provider);
        Mockito.when(provider.getCredentials()).thenReturn(credentials);
        Assert.assertEquals("sessionToken", adaptor.getSecurityToken());
    }

}
