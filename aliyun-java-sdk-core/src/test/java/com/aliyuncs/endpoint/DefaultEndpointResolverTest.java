package com.aliyuncs.endpoint;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.exceptions.ClientException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

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
        DefaultEndpointResolver resolver = new DefaultEndpointResolver(client, true);

        resolver.putEndpointEntry("cn-hangzhou", "ecs", "userCustomized-ecs.aliyuncs.com");
        ResolveEndpointRequest request = new ResolveEndpointRequest("cn-hangzhou", "ecs", null, null);
        assertEquals("userCustomized-ecs.aliyuncs.com", resolver.resolve(request));
    }

    @Test
    public void testConstructor() throws ClientException {
        DefaultAcsClient client = mock(DefaultAcsClient.class);
        DefaultEndpointResolver resolver = new DefaultEndpointResolver(
                client, "{'regional_endpoints':{'cloudapi':{'test':'test1'}}}", true);

        ResolveEndpointRequest request = new ResolveEndpointRequest("test", "cloudapi", null, null);
        assertEquals("test1", resolver.resolve(request));
    }

}
