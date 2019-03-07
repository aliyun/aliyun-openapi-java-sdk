package com.aliyuncs.auth;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.auth.sts.GenerateSessionAccessKeyResponse;
import com.aliyuncs.auth.sts.GetSessionAccessKeyRequest;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.IClientProfile;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class STSGetSessionAccessKeyCredentialsProviderTest {
    @Test
    public void constructorTest() throws NoSuchFieldException, IllegalAccessException {
        KeyPairCredentials credentials = mock(KeyPairCredentials.class);
        IClientProfile clientProfile = mock(IClientProfile.class);
        STSGetSessionAccessKeyCredentialsProvider provider = new STSGetSessionAccessKeyCredentialsProvider(credentials,
                clientProfile);
        Class providerClass = provider.getClass();
        Field keyPairCredentials = providerClass.getDeclaredField("keyPairCredentials");
        Field stsClient = providerClass.getDeclaredField("stsClient");
        keyPairCredentials.setAccessible(true);
        stsClient.setAccessible(true);
        Assert.assertTrue(credentials == keyPairCredentials.get(provider));
        Assert.assertTrue(stsClient.get(provider) instanceof DefaultAcsClient);


        provider = new STSGetSessionAccessKeyCredentialsProvider("", "");
        Field publicKeyId = providerClass.getDeclaredField("publicKeyId");
        publicKeyId.setAccessible(true);
        Assert.assertTrue("".equals(publicKeyId.get(provider)));
        Assert.assertTrue(stsClient.get(provider) instanceof DefaultAcsClient);
    }

    @Test
    public void withDurationSecondsTest() throws NoSuchFieldException, IllegalAccessException {
        KeyPairCredentials credentials = mock(KeyPairCredentials.class);
        IClientProfile clientProfile = mock(IClientProfile.class);
        STSGetSessionAccessKeyCredentialsProvider provider = new STSGetSessionAccessKeyCredentialsProvider(credentials,
                clientProfile);
        Class providerClass = provider.getClass();
        Field keyPairCredentials = providerClass.getDeclaredField("keyPairCredentials");
        Field stsClient = providerClass.getDeclaredField("stsClient");
        keyPairCredentials.setAccessible(true);
        stsClient.setAccessible(true);
        Assert.assertTrue(credentials == keyPairCredentials.get(provider));
        Assert.assertTrue(stsClient.get(provider) instanceof DefaultAcsClient);

        provider = provider.withDurationSeconds(1800);
        Field sessionDurationSeconds = providerClass.getDeclaredField("sessionDurationSeconds");
        sessionDurationSeconds.setAccessible(true);
        Assert.assertEquals(1800L, sessionDurationSeconds.get(provider));
    }

    @Test
    public void withSTSClientTest() throws NoSuchFieldException, IllegalAccessException {
        KeyPairCredentials credentials = mock(KeyPairCredentials.class);
        IClientProfile clientProfile = mock(IClientProfile.class);
        STSGetSessionAccessKeyCredentialsProvider provider = new STSGetSessionAccessKeyCredentialsProvider(credentials,
                clientProfile);
        IAcsClient acsClient = mock(IAcsClient.class);
        provider.withSTSClient(acsClient);
        Class providerClass = provider.getClass();
        Field stsClient = providerClass.getDeclaredField("stsClient");
        stsClient.setAccessible(true);
        Assert.assertTrue(stsClient.get(provider) == acsClient);
    }

    @Test
    public void getCredentialsWithNullCredentials() throws ClientException {
        IAcsClient acsClient = mock(IAcsClient.class);
        GenerateSessionAccessKeyResponse akResponse = mock(GenerateSessionAccessKeyResponse.class);
        GenerateSessionAccessKeyResponse.SessionAccessKey sessionAccessKey = mock(
                GenerateSessionAccessKeyResponse.SessionAccessKey.class);
        when(sessionAccessKey.getSessionAccessKeyId()).thenReturn("ak");
        when(sessionAccessKey.getSessionAccessKeySecert()).thenReturn("sk");
        when(akResponse.getSessionAccessKey()).thenReturn(sessionAccessKey);
        when(acsClient.getAcsResponse(any(GetSessionAccessKeyRequest.class))).thenReturn(akResponse);
        STSGetSessionAccessKeyCredentialsProvider provider = new STSGetSessionAccessKeyCredentialsProvider(
                "ak", "ak");
        provider.withSTSClient(acsClient);
        AlibabaCloudCredentials credentials2 = provider.getCredentials();
        Assert.assertEquals("ak", credentials2.getAccessKeyId());
    }

    @Test
    public void getCredentialsWithPreviousCredentials() throws ClientException {
        IAcsClient acsClient = mock(IAcsClient.class);
        GenerateSessionAccessKeyResponse akResponse = mock(GenerateSessionAccessKeyResponse.class);
        GenerateSessionAccessKeyResponse.SessionAccessKey sessionAccessKey = mock(
                GenerateSessionAccessKeyResponse.SessionAccessKey.class);
        when(sessionAccessKey.getSessionAccessKeyId()).thenReturn("ak");
        when(sessionAccessKey.getSessionAccessKeySecert()).thenReturn("sk");
        when(akResponse.getSessionAccessKey()).thenReturn(sessionAccessKey);
        when(acsClient.getAcsResponse(any(GetSessionAccessKeyRequest.class))).thenReturn(akResponse);
        KeyPairCredentials credentials = mock(KeyPairCredentials.class);
        IClientProfile clientProfile = mock(IClientProfile.class);
        STSGetSessionAccessKeyCredentialsProvider provider = new STSGetSessionAccessKeyCredentialsProvider(credentials,
                clientProfile);

        provider.withSTSClient(acsClient);
        AlibabaCloudCredentials credentials2 = provider.getCredentials();
        Assert.assertEquals("ak", credentials2.getAccessKeyId());

        AlibabaCloudCredentials credentials3 = provider.getCredentials();
        Assert.assertEquals(credentials2, credentials3);
    }

}
