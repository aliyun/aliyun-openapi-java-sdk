package com.aliyuncs.endpoint;

import org.junit.Assert;
import org.junit.Test;

public class LocalConfigGlobalEndpointResolverTest {

    @Test
    public void testLocalConfigGlobalEndpointResolver() {

        LocalConfigGlobalEndpointResolver global = new LocalConfigGlobalEndpointResolver();
        ResolveEndpointRequest request = new ResolveEndpointRequest("cn-hefei", "cds", "",
                ResolveEndpointRequest.ENDPOINT_TYPE_INNER);
        Assert.assertNull(global.resolve(request));
        request.endpointType = ResolveEndpointRequest.ENDPOINT_TYPE_OPEN;
        Assert.assertNull(global.resolve(request));
        request.regionId = "cn-qingdao";
        Assert.assertEquals("cds.cn-beijing.aliyuncs.com", global.resolve(request));
    }

}