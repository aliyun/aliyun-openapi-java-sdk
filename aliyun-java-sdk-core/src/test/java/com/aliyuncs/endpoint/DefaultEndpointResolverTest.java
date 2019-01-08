package com.aliyuncs.endpoint;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test;

import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.exceptions.ClientException;

public class DefaultEndpointResolverTest {
    @Test
    public void testResolve() throws ClientException {
        DefaultAcsClient client = mock(DefaultAcsClient.class);
        ResolveEndpointRequest request = new ResolveEndpointRequest("cn-hangzhou", "ecs", null, null);
        DefaultEndpointResolver resolver = new DefaultEndpointResolver(client);

        assertEquals("ecs-cn-hangzhou.aliyuncs.com", resolver.resolve(request));
    }

    @Test
    public void testPutEndpointEntry() throws ClientException {
        DefaultAcsClient client = mock(DefaultAcsClient.class);
        DefaultProfile profile = mock(DefaultProfile.class);
        when(profile.isUsingVpcEndpoint()).thenReturn(false);
        when(profile.isUsingInternalLocationService()).thenReturn(true);
        DefaultEndpointResolver resolver = new DefaultEndpointResolver(client, profile);

        resolver.putEndpointEntry("cn-hangzhou", "ecs", "userCustomized-ecs.aliyuncs.com");
        ResolveEndpointRequest request = new ResolveEndpointRequest("cn-hangzhou", "ecs", null, null);
        assertEquals("userCustomized-ecs.aliyuncs.com", resolver.resolve(request));
    }

    @Test
    public void testConstructor() throws ClientException {
        DefaultAcsClient client = mock(DefaultAcsClient.class);
        DefaultProfile profile = mock(DefaultProfile.class);
        when(profile.isUsingVpcEndpoint()).thenReturn(false);
        when(profile.isUsingInternalLocationService()).thenReturn(true);
        DefaultEndpointResolver resolver = new DefaultEndpointResolver(
                client, "{'regional_endpoints':{'cloudapi':{'test':'test1'}}}", profile);

        ResolveEndpointRequest request = new ResolveEndpointRequest("test", "cloudapi", null, null);
        assertEquals("test1", resolver.resolve(request));

        profile = mock(DefaultProfile.class);
        when(profile.isUsingVpcEndpoint()).thenReturn(true);
        when(profile.isUsingInternalLocationService()).thenReturn(true);
        resolver = new DefaultEndpointResolver(client, null, profile);
        assertEquals("cloudapi-vpc.test.aliyuncs.com", resolver.resolve(request));
    }

}
