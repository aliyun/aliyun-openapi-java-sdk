package com.aliyuncs.endpoint;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Assert;
import org.junit.Test;

import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.exceptions.ClientException;
import org.junit.function.ThrowingRunnable;

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

    @Test
    public void testConstructorWithCustomLocationService() throws ClientException {
        DefaultAcsClient client = mock(DefaultAcsClient.class);
        DefaultProfile profile = DefaultProfile.getProfile();
        profile.setLocationServiceEndpoint("location-readonly.aliyuncs.com");
        profile.setLocationServiceApiVersion("2015-12-25");
        final DefaultEndpointResolver resolver = new DefaultEndpointResolver(
                client, "{}", profile);

        final ResolveEndpointRequest request = new ResolveEndpointRequest("test", "cloudapi", null, null);
        ClientException ex = Assert.assertThrows(ClientException.class, new ThrowingRunnable() {
            @Override
            public void run() throws Throwable {
                resolver.resolve(request);
            }
        });
        Assert.assertEquals("SDK.EndpointResolvingError : No endpoint in the region 'test' for product 'cloudapi'.\n" +
                "You can set an endpoint for your request explicitly.\n" +
                "Or you can use the other available regions: cn-shenzhen cn-beijing ap-south-1 eu-west-1 ap-northeast-1 me-east-1 cn-qingdao cn-shanghai cn-hongkong ap-southeast-1 ap-southeast-2 ap-southeast-3 eu-central-1 cn-huhehaote ap-southeast-5 us-east-1 us-west-1 cn-zhangjiakou cn-hangzhou\n" +
                "See https://api.alibabacloud.com/product/cloudapi", ex.getMessage());
    }
}
