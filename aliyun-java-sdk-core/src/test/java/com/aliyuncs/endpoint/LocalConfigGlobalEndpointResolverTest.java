package com.aliyuncs.endpoint;

import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

public class LocalConfigGlobalEndpointResolverTest {

    @Test
    public void testLocalConfigGlobalEndpointResolver() {

        LocalConfigGlobalEndpointResolver global = new LocalConfigGlobalEndpointResolver();
        ResolveEndpointRequest request = new ResolveEndpointRequest("cn-qingdao", "cds",
                "", ResolveEndpointRequest.ENDPOINT_TYPE_INNER);

        Assert.assertNull(global.resolve(request));
        request.endpointType = ResolveEndpointRequest.ENDPOINT_TYPE_OPEN;
        Assert.assertEquals("cds.cn-beijing.aliyuncs.com", global.resolve(request));
        request.productCode = "Ecs";
        request.productCodeLower = "ecs";
        Assert.assertEquals("ecs-cn-hangzhou.aliyuncs.com", global.resolve(request));

        Assert.assertTrue(global.getValidRegionIdsByProduct("ecs") instanceof Set<?>);
    }
}