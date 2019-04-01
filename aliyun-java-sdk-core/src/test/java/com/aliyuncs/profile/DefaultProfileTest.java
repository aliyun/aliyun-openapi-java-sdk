package com.aliyuncs.profile;

import com.aliyuncs.auth.Credential;
import com.aliyuncs.auth.ICredentialProvider;
import com.aliyuncs.auth.StaticCredentialsProvider;
import com.aliyuncs.endpoint.DefaultEndpointResolver;
import com.aliyuncs.endpoint.ResolveEndpointRequest;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.HttpClientConfig;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.slf4j.Logger;

import static com.aliyuncs.utils.LogUtils.DEFAULT_LOG_FORMAT;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class DefaultProfileTest {

    @Before
    public void testSingleDefaultProfile() {
        DefaultProfile profile1 = DefaultProfile.getProfile();
        DefaultProfile profile2 = DefaultProfile.getProfile();
        assertTrue(profile2 == profile1);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testGetCredential() {
        DefaultProfile profile = DefaultProfile.getProfile("regionId");
        assertNull(profile.getCredential());
        StaticCredentialsProvider credentialsProvider = mock(StaticCredentialsProvider.class);
        profile.setCredentialsProvider(credentialsProvider);
        assertTrue(profile.getCredential() instanceof Credential);

        ICredentialProvider iCredentialProvider = mock(ICredentialProvider.class);
        profile = DefaultProfile.getProfile("regionId", iCredentialProvider);
        Credential credential = mock(Credential.class);
        Mockito.when(iCredentialProvider.fresh()).thenReturn(credential);
        assertTrue(profile.getCredential() == credential);
        profile.setCredentialsProvider(credentialsProvider);
        assertTrue(profile.getCredential() == credential);
    }

    @Test
    public void getRegionId() {
        DefaultProfile profile = DefaultProfile.getProfile("regionId");
        assertEquals("regionId", profile.getRegionId());
    }

    @Test
    public void getFormat() {
        DefaultProfile profile = DefaultProfile.getProfile("regionId");
        assertNull(profile.getFormat());
    }

    @SuppressWarnings("deprecation")
    @Test
    public void testGetSigner() {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou");
        assertNull(profile.getSigner());
    }

    @Test
    public void testGetSetCertPath() {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou");
        assertNull(profile.getCertPath());
        profile.setCertPath("certPath");
        assertEquals("certPath", profile.getCertPath());

        profile.enableUsingVpcEndpoint();
        assertTrue(profile.isUsingVpcEndpoint());
    }

    @Test
    public void testGetSetLogger() {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou");
        assertNull(profile.getLogger());
        Logger logger = mock(Logger.class);
        profile.setLogger(logger);
        assertEquals(logger, profile.getLogger());
    }

    @Test
    public void testGetSetLogFormat() {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou");
        assertEquals(DEFAULT_LOG_FORMAT, profile.getLogFormat());
        profile.setLogFormat("{uri} {request}");
        assertEquals("{uri} {request}", profile.getLogFormat());
    }

    @Test
    public void testIsUsingInternalLocationService() {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou");
        assertFalse(profile.isUsingInternalLocationService());
        profile.enableUsingInternalLocationService();
        assertTrue(profile.isUsingInternalLocationService());
    }

    @Test
    public void testHttpClientConfig() {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou");
        assertTrue(profile.getHttpClientConfig() instanceof HttpClientConfig);
        profile.setHttpClientConfig(null);
        assertNull(profile.getHttpClientConfig());
    }

    @SuppressWarnings("deprecation")
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

    @Test
    public void deprecatedTest() {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou");
        profile.setUsingInternalLocationService();
        assertTrue(profile.isUsingInternalLocationService());

    }

    @SuppressWarnings("deprecation")
    @Test
    public void testAddEndpoint() throws ClientException {
        DefaultProfile.addEndpoint("endpointName", "regionId", "product", "domain");
        ResolveEndpointRequest request = mock(ResolveEndpointRequest.class);
        request.regionId = "regionId";
        assertTrue(DefaultEndpointResolver.predefinedEndpointResolver.isRegionIdValid(request));
    }

}
