package com.aliyuncs;

import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.http.ProtocolType;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Map;

public class CommonRequestTest {

    @Test
    public void CommonRoaRequestTest() {
        CommonRequest request = new CommonRequest();
        request.setUriPattern("uri");
        request.putPathParameter("test", "test");
        AcsRequest acsRequest = request.buildRequest();
        Assert.assertTrue(acsRequest instanceof CommonRoaRequest);
    }

    @Test
    public void CommonRequestGetSetTest() throws UnsupportedEncodingException {
        CommonRequest request = new CommonRequest();
        request.setHttpContent("abc".getBytes(), "utf-8", FormatType.JSON);
        Assert.assertEquals("utf-8", request.getEncoding());
        Assert.assertTrue(FormatType.JSON == request.getHttpContentType());
        Assert.assertEquals("abc", new String(request.getHttpContent(), "utf-8"));

        request.setUriPattern("uri");
        Assert.assertEquals("uri", request.getUriPattern());

        request.setProduct("ecs");
        Assert.assertEquals("ecs", request.getProduct());

        request.setReadTimeout(50000);
        Assert.assertTrue(50000 == request.getReadTimeout());

        request.putBodyParameter("test", "test");
        Map<String, String> bodyMap = request.getBodyParameters();
        Assert.assertNotNull(bodyMap);
        Assert.assertEquals("test", bodyMap.get("test"));

        request.setMethod(MethodType.DELETE);
        Assert.assertTrue(MethodType.DELETE == request.getMethod());

        request.setAction("action");
        Assert.assertEquals("action", request.getAction());

        request.setConnectTimeout(5000);
        Assert.assertTrue(5000 == request.getConnectTimeout());

        request.setDomain("domian");
        Assert.assertEquals("domian", request.getDomain());

        request.setEndpointType("endPoint");
        Assert.assertEquals("endPoint", request.getEndpointType());

        request.setLocationProduct("test");
        Assert.assertEquals("test", request.getLocationProduct());

        request.setProtocol(ProtocolType.HTTP);
        Assert.assertTrue(ProtocolType.HTTP == request.getProtocol());

        request.setRegionId("hangzhou");
        Assert.assertEquals("hangzhou", request.getRegionId());

        request.setVersion("4");
        Assert.assertEquals("4", request.getVersion());

        request.putQueryParameter("test", "test");
        Map<String, String> queryMap = request.getQueryParameters();
        Assert.assertNotNull(queryMap);
        Assert.assertEquals("test", queryMap.get("test"));

        request.putHeadParameter("test", "test");
        Map<String, String> headMap = request.getHeadParameters();
        Assert.assertNotNull(headMap);
        Assert.assertEquals("test", headMap.get("test"));

        request.putPathParameter("test", "test");
        Map<String, String> pathMap = request.getPathParameters();
        Assert.assertNotNull(pathMap);
        Assert.assertEquals("test", pathMap.get("test"));

        request.setHttpContent(null, null, null);
        request.putHeadParameter(null, null);

    }

    @Test
    public void CommonRpcRequestTest() {
        CommonRequest request = new CommonRequest();
        request.setHttpContent("abc".getBytes(), "utf-8", FormatType.JSON);
        request.setProduct("ecs");
        request.setReadTimeout(50000);
        request.putBodyParameter("test", "test");
        request.setMethod(MethodType.DELETE);
        request.setAction("action");
        request.setConnectTimeout(5000);
        request.setDomain("domian");
        request.setEndpointType("endPoint");
        request.setLocationProduct("test");
        request.setProtocol(ProtocolType.HTTP);
        request.setRegionId("hangzhou");
        request.setVersion("4.2.3");
        request.putQueryParameter("test", "test");
        request.putHeadParameter("test", "test");
        AcsRequest acsRequest = request.buildRequest();
        Assert.assertTrue(acsRequest instanceof CommonRpcRequest);
    }
}
