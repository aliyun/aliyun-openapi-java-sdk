package com.aliyuncs.endpoint;

import org.junit.Assert;
import org.junit.Test;

public class ResolveEndpointRequestTest {

    @Test
    public void testResolveEndpointRequest() {
        ResolveEndpointRequest resolveEndpointRequest = new ResolveEndpointRequest("regionId", "productCode",
                "locationServiceCode", "");
        Assert.assertEquals("regionId", resolveEndpointRequest.regionId);
        Assert.assertEquals("productCode", resolveEndpointRequest.productCode);
        Assert.assertEquals("productcode", resolveEndpointRequest.productCodeLower);
        Assert.assertEquals("locationServiceCode", resolveEndpointRequest.locationServiceCode);
        Assert.assertTrue(resolveEndpointRequest.isOpenApiEndpoint());

        resolveEndpointRequest.endpointType = ResolveEndpointRequest.ENDPOINT_TYPE_INNER;
        Assert.assertFalse(resolveEndpointRequest.isOpenApiEndpoint());

    }

}
