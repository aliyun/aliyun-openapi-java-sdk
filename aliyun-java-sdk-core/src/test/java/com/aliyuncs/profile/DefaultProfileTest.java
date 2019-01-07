package com.aliyuncs.profile;

import com.aliyuncs.auth.Credential;
import com.aliyuncs.auth.ICredentialProvider;
import com.aliyuncs.auth.StaticCredentialsProvider;
import com.aliyuncs.http.HttpClientConfig;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class DefaultProfileTest {

    @Test
    public void testCredential() {

        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou");
        assertNull(profile.getCredential());
        StaticCredentialsProvider credentialsProvider = mock(StaticCredentialsProvider.class);
        profile.setCredentialsProvider(credentialsProvider);
        assertTrue(profile.getCredential() instanceof Credential);
        assertTrue(profile.getCredential() instanceof Credential);
    }

    @Test
    public void testGetSetCertPath() {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou");
        assertNull(profile.getCertPath());
        profile.setCertPath("certPath");
        assertEquals("certPath", profile.getCertPath());
    }

    @Test
    public void testIsUsingInternalLocationService() {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou");
        assertFalse(profile.isUsingInternalLocationService());
        profile.setUsingInternalLocationService();
        assertTrue(profile.isUsingInternalLocationService());
    }

    @Test
    public void testHttpClientConfig() {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou");
        assertTrue(profile.getHttpClientConfig() instanceof HttpClientConfig);
        profile.setHttpClientConfig(null);
        assertNull(profile.getHttpClientConfig());
    }

    @Test
    public void testProfileConstructor() {
        DefaultProfile profile1 = DefaultProfile.getProfile("cn-hangzhou");
        assertEquals("cn-hangzhou", profile1.getRegionId());
        assertNull(profile1.getCredential());

        ICredentialProvider icredential = mock(ICredentialProvider.class);
        DefaultProfile profile2 = DefaultProfile.getProfile("cn-shanghai", icredential);
        assertEquals("cn-shanghai", profile2.getRegionId());
        assertTrue(profile1 != profile2);

        DefaultProfile profile;
        profile = DefaultProfile.getProfile("cn-qingdao", "accessKeyId", "secret");
        assertEquals("cn-qingdao", profile.getRegionId());
        assertEquals("accessKeyId", profile.getCredential().getAccessKeyId());
        assertEquals("secret", profile.getCredential().getAccessSecret());

        profile = DefaultProfile.getProfile("cn-nanjing", "accessKeyId", "accessSecret", "stsToken");
        assertEquals("cn-nanjing", profile.getRegionId());
        assertEquals("accessKeyId", profile.getCredential().getAccessKeyId());
        assertEquals("accessSecret", profile.getCredential().getAccessSecret());
        assertEquals("stsToken", profile.getCredential().getSecurityToken());
    }

}
