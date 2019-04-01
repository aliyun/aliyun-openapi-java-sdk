package com.aliyuncs.auth;

import com.aliyuncs.AcsRequest;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.auth.sts.AssumeRoleRequest;
import com.aliyuncs.auth.sts.AssumeRoleResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.IClientProfile;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.lang.reflect.Field;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class STSAssumeRoleSessionCredentialsProviderTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructorNormalTest1() {
        AlibabaCloudCredentials credentials = mock(AlibabaCloudCredentials.class);
        String roleArn = "roleArn";
        IClientProfile clientProfile = mock(IClientProfile.class);
        STSAssumeRoleSessionCredentialsProvider provider = new STSAssumeRoleSessionCredentialsProvider(credentials,
                roleArn, clientProfile);
        Assert.assertNotNull(provider);
    }

    @Test
    public void policyCredentialTest() throws NoSuchFieldException, IllegalAccessException, ClientException {
        STSAssumeRoleSessionCredentialsProvider provider = new STSAssumeRoleSessionCredentialsProvider(
                "test", "test", "test", "test", "test",
                "test");
        IAcsClient client = mock(IAcsClient.class);
        AssumeRoleResponse response = mock(AssumeRoleResponse.class);
        AssumeRoleResponse.Credentials credentials = mock(AssumeRoleResponse.Credentials.class);
        when(credentials.getAccessKeyId()).thenReturn("ak");
        when(credentials.getAccessKeySecret()).thenReturn("sk");
        when(credentials.getSecurityToken()).thenReturn("token");
        when(response.getCredentials()).thenReturn(credentials);
        when(client.getAcsResponse(any(AcsRequest.class))).thenReturn(response);
        Class providerClass = provider.getClass();
        Field policy = providerClass.getDeclaredField("policy");
        Field stsClient = providerClass.getDeclaredField("stsClient");
        policy.setAccessible(true);
        stsClient.setAccessible(true);
        stsClient.set(provider, client);
        String policyResult = (String) policy.get(provider);
        Assert.assertEquals("test", policyResult);
        Assert.assertTrue(provider.getCredentials() instanceof BasicSessionCredentials);
    }

    @Test
    public void constructorNormalTest2() {
        AlibabaCloudCredentialsProvider mockProvider = mock(AlibabaCloudCredentialsProvider.class);
        String roleArn = "roleArn";
        IClientProfile clientProfile = mock(IClientProfile.class);
        STSAssumeRoleSessionCredentialsProvider provider = new STSAssumeRoleSessionCredentialsProvider(mockProvider,
                roleArn, clientProfile);
        Assert.assertNotNull(provider);
    }

    @Test
    public void constructorNormalTest3() {
        STSAssumeRoleSessionCredentialsProvider provider = new STSAssumeRoleSessionCredentialsProvider(
                "", "", "", "", "");
        Assert.assertNotNull(provider);
    }

    @Test
    public void constructorWillNullRoleArn() {
        thrown.expect(NullPointerException.class);
        AlibabaCloudCredentialsProvider mockProvider = mock(AlibabaCloudCredentialsProvider.class);
        String roleArn = null;
        IClientProfile clientProfile = mock(IClientProfile.class);
        STSAssumeRoleSessionCredentialsProvider provider = new STSAssumeRoleSessionCredentialsProvider(mockProvider,
                roleArn, clientProfile);
        Assert.assertNull(provider);
    }

    @Test
    public void getNewRoleSessionNameTest() {
        String roleSessionName = STSAssumeRoleSessionCredentialsProvider.getNewRoleSessionName();
        boolean res = roleSessionName.startsWith("aliyun-java-sdk-");
        Assert.assertTrue(res);
    }

    @Test
    public void withSTSClientTest() {
        IAcsClient acsClient = mock(IAcsClient.class);
        AlibabaCloudCredentials credentials = mock(AlibabaCloudCredentials.class);
        String roleArn = "roleArn";
        IClientProfile clientProfile = mock(IClientProfile.class);
        STSAssumeRoleSessionCredentialsProvider provider = new STSAssumeRoleSessionCredentialsProvider(credentials,
                roleArn, clientProfile);
        provider.withSTSClient(acsClient);
        Assert.assertNotNull(provider);
    }

    @Test
    public void withRoleSessionNameTest() {
        AlibabaCloudCredentials credentials = mock(AlibabaCloudCredentials.class);
        String roleArn = "roleArn";
        IClientProfile clientProfile = mock(IClientProfile.class);
        STSAssumeRoleSessionCredentialsProvider provider = new STSAssumeRoleSessionCredentialsProvider(credentials,
                roleArn, clientProfile);
        String roleSessionName = "roleSessionName";
        provider.withRoleSessionName(roleSessionName);
        Assert.assertNotNull(provider);
    }

    @Test
    public void withRoleSessionDurationSecondsSmallerThan900Seconds() {
        thrown.expect(IllegalArgumentException.class);
        long duration = 800;
        AlibabaCloudCredentials credentials = mock(AlibabaCloudCredentials.class);
        String roleArn = "roleArn";
        IClientProfile clientProfile = mock(IClientProfile.class);
        STSAssumeRoleSessionCredentialsProvider provider = new STSAssumeRoleSessionCredentialsProvider(credentials,
                roleArn, clientProfile);
        provider.withRoleSessionDurationSeconds(duration);

    }

    @Test
    public void withRoleSessionDurationSecondsLargerThan3600Seconds() {
        thrown.expect(IllegalArgumentException.class);
        long duration = 3601;
        AlibabaCloudCredentials credentials = mock(AlibabaCloudCredentials.class);
        String roleArn = "roleArn";
        IClientProfile clientProfile = mock(IClientProfile.class);
        STSAssumeRoleSessionCredentialsProvider provider = new STSAssumeRoleSessionCredentialsProvider(credentials,
                roleArn, clientProfile);
        provider.withRoleSessionDurationSeconds(duration);

    }

    @Test
    public void withRoleSessionDurationSecondsNormal() {
        long duration = 1800;
        AlibabaCloudCredentials credentials = mock(AlibabaCloudCredentials.class);
        String roleArn = "roleArn";
        IClientProfile clientProfile = mock(IClientProfile.class);
        STSAssumeRoleSessionCredentialsProvider provider = new STSAssumeRoleSessionCredentialsProvider(credentials,
                roleArn, clientProfile);
        provider.withRoleSessionDurationSeconds(duration);
        Assert.assertNotNull(provider);
    }

    @Test
    public void getCredentialsWithNullCredentials() throws ClientException {
        IAcsClient acsClient = mock(IAcsClient.class);
        AssumeRoleResponse roleResponse = mock(AssumeRoleResponse.class);
        AssumeRoleResponse.Credentials credentials = mock(AssumeRoleResponse.Credentials.class);
        when(credentials.getAccessKeyId()).thenReturn("ak");
        when(credentials.getAccessKeySecret()).thenReturn("sk");
        when(credentials.getSecurityToken()).thenReturn("token");
        when(roleResponse.getCredentials()).thenReturn(credentials);
        when(acsClient.getAcsResponse(any(AssumeRoleRequest.class))).thenReturn(roleResponse);
        AlibabaCloudCredentials credentials1 = mock(AlibabaCloudCredentials.class);
        String roleArn = "roleArn";
        IClientProfile clientProfile = mock(IClientProfile.class);
        STSAssumeRoleSessionCredentialsProvider provider = new STSAssumeRoleSessionCredentialsProvider(credentials1,
                roleArn, clientProfile);
        provider.withSTSClient(acsClient);
        AlibabaCloudCredentials credentials2 = provider.getCredentials();
        Assert.assertEquals("ak", credentials2.getAccessKeyId());
    }

    @Test
    public void getCredentialsReturnPreviousCredentials() throws ClientException {
        IAcsClient acsClient = mock(IAcsClient.class);
        AssumeRoleResponse roleResponse = mock(AssumeRoleResponse.class);
        AssumeRoleResponse.Credentials credentials = mock(AssumeRoleResponse.Credentials.class);
        when(credentials.getAccessKeyId()).thenReturn("ak");
        when(credentials.getAccessKeySecret()).thenReturn("sk");
        when(credentials.getSecurityToken()).thenReturn("token");
        when(roleResponse.getCredentials()).thenReturn(credentials);
        when(acsClient.getAcsResponse(any(AssumeRoleRequest.class))).thenReturn(roleResponse);
        AlibabaCloudCredentials credentials1 = mock(AlibabaCloudCredentials.class);
        String roleArn = "roleArn";
        IClientProfile clientProfile = mock(IClientProfile.class);
        STSAssumeRoleSessionCredentialsProvider provider = new STSAssumeRoleSessionCredentialsProvider(credentials1,
                roleArn, clientProfile);
        provider.withSTSClient(acsClient);
        AlibabaCloudCredentials credentials2 = provider.getCredentials();
        Assert.assertEquals("ak", credentials2.getAccessKeyId());

        AlibabaCloudCredentials credentials3 = provider.getCredentials();
        Assert.assertEquals(credentials2, credentials3);

    }
}
