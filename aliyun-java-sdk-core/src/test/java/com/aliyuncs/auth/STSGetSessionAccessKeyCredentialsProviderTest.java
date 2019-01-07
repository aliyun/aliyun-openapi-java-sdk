package com.aliyuncs.auth;

import com.aliyuncs.IAcsClient;
import com.aliyuncs.auth.sts.GenerateSessionAccessKeyResponse;
import com.aliyuncs.auth.sts.GetSessionAccessKeyRequest;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.IClientProfile;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class STSGetSessionAccessKeyCredentialsProviderTest {
    @Test
    public void constructorTest() {
        KeyPairCredentials credentials = mock(KeyPairCredentials.class);
        IClientProfile clientProfile = mock(IClientProfile.class);
        STSGetSessionAccessKeyCredentialsProvider provider = new STSGetSessionAccessKeyCredentialsProvider(credentials, clientProfile);
        Assert.assertNotNull(provider);
    }

    @Test
    public void withDurationSecondsTest() {
        KeyPairCredentials credentials = mock(KeyPairCredentials.class);
        IClientProfile clientProfile = mock(IClientProfile.class);
        STSGetSessionAccessKeyCredentialsProvider provider = new STSGetSessionAccessKeyCredentialsProvider(credentials, clientProfile);
        Assert.assertNotNull(provider);

        provider = provider.withDurationSeconds(1800);
        Assert.assertNotNull(provider);
    }

    @Test
    public void withSTSClientTest() {
        KeyPairCredentials credentials = mock(KeyPairCredentials.class);
        IClientProfile clientProfile = mock(IClientProfile.class);
        STSGetSessionAccessKeyCredentialsProvider provider = new STSGetSessionAccessKeyCredentialsProvider(credentials, clientProfile);
        IAcsClient acsClient = mock(IAcsClient.class);
        provider.withSTSClient(acsClient);
        Assert.assertNotNull(provider);
    }

    @Test
    public void getCredentialsWithNullCredentials() throws ClientException {
        IAcsClient acsClient = mock(IAcsClient.class);
        GenerateSessionAccessKeyResponse akResponse = mock(GenerateSessionAccessKeyResponse.class);
        GenerateSessionAccessKeyResponse.SessionAccessKey sessionAccessKey = mock(GenerateSessionAccessKeyResponse.SessionAccessKey.class);
        when(sessionAccessKey.getSessionAccessKeyId()).thenReturn("ak");
        when(sessionAccessKey.getSessionAccessKeySecert()).thenReturn("sk");
        when(akResponse.getSessionAccessKey()).thenReturn(sessionAccessKey);
        when(acsClient.getAcsResponse(any(GetSessionAccessKeyRequest.class))).thenReturn(akResponse);
        KeyPairCredentials credentials = mock(KeyPairCredentials.class);
        IClientProfile clientProfile = mock(IClientProfile.class);
        STSGetSessionAccessKeyCredentialsProvider provider = new STSGetSessionAccessKeyCredentialsProvider(credentials, clientProfile);

        provider.withSTSClient(acsClient);
        AlibabaCloudCredentials credentials2 = provider.getCredentials();
        Assert.assertEquals("ak", credentials2.getAccessKeyId());
    }

    @Test
    public void getCredentialsWithPreviousCredentials() throws ClientException {
        IAcsClient acsClient = mock(IAcsClient.class);
        GenerateSessionAccessKeyResponse akResponse = mock(GenerateSessionAccessKeyResponse.class);
        GenerateSessionAccessKeyResponse.SessionAccessKey sessionAccessKey = mock(GenerateSessionAccessKeyResponse.SessionAccessKey.class);
        when(sessionAccessKey.getSessionAccessKeyId()).thenReturn("ak");
        when(sessionAccessKey.getSessionAccessKeySecert()).thenReturn("sk");
        when(akResponse.getSessionAccessKey()).thenReturn(sessionAccessKey);
        when(acsClient.getAcsResponse(any(GetSessionAccessKeyRequest.class))).thenReturn(akResponse);
        KeyPairCredentials credentials = mock(KeyPairCredentials.class);
        IClientProfile clientProfile = mock(IClientProfile.class);
        STSGetSessionAccessKeyCredentialsProvider provider = new STSGetSessionAccessKeyCredentialsProvider(credentials, clientProfile);

        provider.withSTSClient(acsClient);
        AlibabaCloudCredentials credentials2 = provider.getCredentials();
        Assert.assertEquals("ak", credentials2.getAccessKeyId());

        AlibabaCloudCredentials credentials3 = provider.getCredentials();
        Assert.assertEquals(credentials2, credentials3);
    }


}
