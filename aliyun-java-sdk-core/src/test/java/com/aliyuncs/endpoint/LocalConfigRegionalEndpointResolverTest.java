package com.aliyuncs.endpoint;

import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

public class LocalConfigRegionalEndpointResolverTest {

    @Test
    public void testLocalConfigRegionalEndpointResolver() {
        LocalConfigRegionalEndpointResolver regional = new LocalConfigRegionalEndpointResolver();
        ResolveEndpointRequest request = new ResolveEndpointRequest("cn-shanghai", "arms", "",
                ResolveEndpointRequest.ENDPOINT_TYPE_INNER);

        Assert.assertNull(regional.resolve(request));
        request.endpointType = ResolveEndpointRequest.ENDPOINT_TYPE_OPEN;
        Assert.assertEquals("arms.cn-shanghai.aliyuncs.com", regional.resolve(request));
        request.productCode = "cloudapi";
        request.productCodeLower = "cloudapi";
        Assert.assertEquals("apigateway.cn-shanghai.aliyuncs.com", regional.resolve(request));

        Assert.assertTrue(regional.getValidRegionIdsByProduct("cloudapi") instanceof Set<?>);
        Assert.assertNull(regional.getValidRegionIdsByProduct("XXXX"));

        LocalConfigRegionalEndpointResolver regionalConstruct1 = new LocalConfigRegionalEndpointResolver(
                "{'regional_endpoints':{'cloudapi':{'test':'test'}}}");
        Assert.assertNull(regionalConstruct1.getValidRegionIdsByProduct("test"));
        Assert.assertTrue(regionalConstruct1.getValidRegionIdsByProduct("cloudapi") instanceof Set<?>);
        LocalConfigRegionalEndpointResolver regionalConstruct2 = new LocalConfigRegionalEndpointResolver(
                "{'regional_endpoint':{'cloudapi':{'test':'test'}}}");
        Assert.assertNull(regionalConstruct2.getValidRegionIdsByProduct("cloudapi"));

        request.regionId = "xxx";
        Assert.assertFalse(regional.isRegionIdValid(request));
        request.regionId = "cn-shanghai";

        Assert.assertTrue(regional.isProductCodeValid(request));
        request.productCode = "Xxx";
        request.productCodeLower = "xxx";
        Assert.assertFalse(regional.isProductCodeValid(request));
    }

}
