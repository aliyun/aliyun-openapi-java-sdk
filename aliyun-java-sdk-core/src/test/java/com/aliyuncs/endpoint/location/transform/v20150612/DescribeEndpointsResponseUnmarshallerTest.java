package com.aliyuncs.endpoint.location.transform.v20150612;

import com.aliyuncs.endpoint.location.model.v20150612.DescribeEndpointsResponse;
import com.aliyuncs.endpoint.location.model.v20150612.DescribeEndpointsResponse.Endpoint;
import com.aliyuncs.transform.UnmarshallerContext;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class DescribeEndpointsResponseUnmarshallerTest {

    @Test
    public void testDescribeEndpointsResponseUnmarshaller() {
        new DescribeEndpointsResponseUnmarshaller();
    }

    @Test
    public void testUnmarshall() {
        DescribeEndpointsResponse response = new DescribeEndpointsResponse();
        UnmarshallerContext context = new UnmarshallerContext();
        Map<String, String> responseMap = new HashMap<String, String>();
        responseMap.put("DescribeEndpointsResponse.RequestId", "requestid");
        responseMap.put("DescribeEndpointsResponse.Endpoints.Length", "1");
        responseMap.put("DescribeEndpointsResponse.Endpoints[0].Endpoint", "endpoint");
        responseMap.put("DescribeEndpointsResponse.Endpoints[0].Protocols.Length", "1");
        responseMap.put("DescribeEndpointsResponse.Endpoints[0].Protocols[0]", "HTTP");

        context.setResponseMap(responseMap);
        DescribeEndpointsResponseUnmarshaller.unmarshall(response, context);
        Assert.assertEquals("requestid", response.getRequestId());
        Assert.assertEquals(1, response.getEndpoints().size());
        Endpoint item = response.getEndpoints().get(0);
        Assert.assertEquals("endpoint", item.getEndpoint());
        Assert.assertEquals(1, item.getProtocols().size());
        Assert.assertEquals("HTTP", item.getProtocols().get(0));
    }
}
