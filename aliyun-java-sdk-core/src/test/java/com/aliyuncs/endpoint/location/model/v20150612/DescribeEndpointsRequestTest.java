package com.aliyuncs.endpoint.location.model.v20150612;

import org.junit.Assert;
import org.junit.Test;

public class DescribeEndpointsRequestTest {

    @Test
    public void testDescribeEndpointsRequest() {
        DescribeEndpointsRequest request = new DescribeEndpointsRequest();
        Assert.assertEquals(DescribeEndpointsResponse.class, request.getResponseClass());
        // id
        Assert.assertEquals(null, request.getId());
        Assert.assertEquals(null, request.getQueryParameters().get("Id"));
        request.setId("id");
        Assert.assertEquals("id", request.getId());
        Assert.assertEquals("id", request.getQueryParameters().get("Id"));
        // service code
        Assert.assertEquals(null, request.getServiceCode());
        Assert.assertEquals(null, request.getQueryParameters().get("ServiceCode"));
        request.setServiceCode("servicecode");
        Assert.assertEquals("servicecode", request.getServiceCode());
        Assert.assertEquals("servicecode", request.getQueryParameters().get("ServiceCode"));
        // type
        Assert.assertEquals(null, request.getType());
        Assert.assertEquals(null, request.getQueryParameters().get("Type"));
        request.setType("type");
        Assert.assertEquals("type", request.getType());
        Assert.assertEquals("type", request.getQueryParameters().get("Type"));
    }
}