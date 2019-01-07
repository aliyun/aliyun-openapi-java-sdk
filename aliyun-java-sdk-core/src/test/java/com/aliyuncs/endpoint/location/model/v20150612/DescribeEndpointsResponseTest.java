package com.aliyuncs.endpoint.location.model.v20150612;

import com.aliyuncs.endpoint.location.model.v20150612.DescribeEndpointsResponse.Endpoint;
import com.aliyuncs.transform.UnmarshallerContext;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DescribeEndpointsResponseTest {
    @Test
    public void testDescribeEndpointsResponse() {
        DescribeEndpointsResponse response = new DescribeEndpointsResponse();
        // requestid
        Assert.assertEquals(null, response.getRequestId());
        response.setRequestId("requestId");
        Assert.assertEquals("requestId", response.getRequestId());
        // success
        Assert.assertEquals(null, response.getSuccess());
        response.setSuccess(true);
        Assert.assertEquals(true, response.getSuccess());
        // endpoints
        Assert.assertEquals(null, response.getEndpoints());
        response.setEndpoints(new ArrayList<Endpoint>());
        Assert.assertEquals(0, response.getEndpoints().size());
    }

    @Test
    public void testEndpoint() {
        Endpoint endpoint = new Endpoint();
        // id
        Assert.assertEquals(null, endpoint.getId());
        endpoint.setId("id");
        Assert.assertEquals("id", endpoint.getId());
        // endpoint
        Assert.assertEquals(null, endpoint.getEndpoint());
        endpoint.setEndpoint("endpoint");
        Assert.assertEquals("endpoint", endpoint.getEndpoint());
        // namespace
        Assert.assertEquals(null, endpoint.getNamespace());
        endpoint.setNamespace("namespace");
        Assert.assertEquals("namespace", endpoint.getNamespace());
        // serivceCode
        Assert.assertEquals(null, endpoint.getSerivceCode());
        endpoint.setSerivceCode("serviceCode");
        Assert.assertEquals("serviceCode", endpoint.getSerivceCode());
        // type
        Assert.assertEquals(null, endpoint.getType());
        endpoint.setType("type");
        Assert.assertEquals("type", endpoint.getType());
        // protocols
        Assert.assertEquals(null, endpoint.getProtocols());
        endpoint.setProtocols(new ArrayList<String>());
        Assert.assertEquals(0, endpoint.getProtocols().size());
    }

    @Test
    public void testGetInstance() {
        DescribeEndpointsResponse response = new DescribeEndpointsResponse();
        UnmarshallerContext context = new UnmarshallerContext();
        Map<String, String> responseMap = new HashMap<String, String>();
        responseMap.put("DescribeEndpointsResponse.RequestId", "requestid");
        context.setResponseMap(responseMap);
        response.getInstance(context);
        Assert.assertEquals("requestid", response.getRequestId());
    }
}