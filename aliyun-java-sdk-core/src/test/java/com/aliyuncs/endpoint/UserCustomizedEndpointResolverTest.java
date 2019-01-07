package com.aliyuncs.endpoint;


import org.junit.Assert;
import org.junit.Test;

public class UserCustomizedEndpointResolverTest {

    @Test
    public void testUserCustomizedEndpointResolver() {
        UserCustomizedEndpointResolver resolver = new UserCustomizedEndpointResolver();
        ResolveEndpointRequest request = new ResolveEndpointRequest("cn-shanghai", "arms", null, null);
        Assert.assertNull(resolver.resolve(request));
        resolver.putEndpointEntry("cn-shanghai", "arms", "arms.cn-shanghai.aliyuncs.com");
        Assert.assertEquals("arms.cn-shanghai.aliyuncs.com", resolver.resolve(request));
        Assert.assertTrue(resolver.isRegionIdValid(request));
    }
}
