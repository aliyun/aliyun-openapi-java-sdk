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
    public void commonRoaRequestTest() {
        CommonRequest request = new CommonRequest();
        request.setSysUriPattern("uri");
        request.putPathParameter("test", "test");
        AcsRequest acsRequest = request.buildRequest();
        Assert.assertTrue(acsRequest instanceof CommonRoaRequest);
    }

    @Test
    public void commonRequestGetSetTest() throws UnsupportedEncodingException {
        CommonRequest request = new CommonRequest();
        request.setHttpContent("abc".getBytes(), "utf-8", FormatType.JSON);
        Assert.assertEquals("utf-8", request.getBizEncoding());
        Assert.assertTrue(FormatType.JSON == request.getHttpContentType());
        Assert.assertEquals("abc", new String(request.getHttpContent(), "utf-8"));

        request.setSysUriPattern("uri");
        Assert.assertEquals("uri", request.getBizUriPattern());

        request.setSysProduct("ecs");
        Assert.assertEquals("ecs", request.getBizProduct());

        request.setSysReadTimeout(50000);
        Assert.assertTrue(50000 == request.getBizReadTimeout());

        request.putBodyParameter("test", "test");
        Map<String, String> bodyMap = request.getBizBodyParameters();
        Assert.assertNotNull(bodyMap);
        Assert.assertEquals("test", bodyMap.get("test"));

        request.setSysMethod(MethodType.DELETE);
        Assert.assertTrue(MethodType.DELETE == request.getBizMethod());

        request.setSysAction("action");
        Assert.assertEquals("action", request.getBizAction());

        request.setSysConnectTimeout(5000);
        Assert.assertTrue(5000 == request.getBizConnectTimeout());

        request.setSysDomain("domian");
        Assert.assertEquals("domian", request.getBizDomain());

        request.setSysEndpointType("endPoint");
        Assert.assertEquals("endPoint", request.getBizEndpointType());

        request.setSysLocationProduct("test");
        Assert.assertEquals("test", request.getBizLocationProduct());

        request.setSysProtocol(ProtocolType.HTTP);
        Assert.assertTrue(ProtocolType.HTTP == request.getBizProtocol());

        request.setSysRegionId("hangzhou");
        Assert.assertEquals("hangzhou", request.getBizRegionId());

        request.setSysVersion("4");
        Assert.assertEquals("4", request.getBizVersion());

        request.putQueryParameter("test", "test");
        Map<String, String> queryMap = request.getBizQueryParameters();
        Assert.assertNotNull(queryMap);
        Assert.assertEquals("test", queryMap.get("test"));

        request.putHeadParameter("test", "test");
        Map<String, String> headMap = request.getBizHeadParameters();
        Assert.assertNotNull(headMap);
        Assert.assertEquals("test", headMap.get("test"));

        request.putPathParameter("test", "test");
        Map<String, String> pathMap = request.getBizPathParameters();
        Assert.assertNotNull(pathMap);
        Assert.assertEquals("test", pathMap.get("test"));

        request.setHttpContent(null, null, null);
        request.putHeadParameter(null, null);

    }

    @Test
    public void commonRpcRequestTest() {
        CommonRequest request = new CommonRequest();
        request.setHttpContent("abc".getBytes(), "utf-8", FormatType.JSON);
        request.setSysProduct("ecs");
        request.setSysReadTimeout(50000);
        request.putBodyParameter("test", "test");
        request.setSysMethod(MethodType.DELETE);
        request.setSysAction("action");
        request.setSysConnectTimeout(5000);
        request.setSysDomain("domian");
        request.setSysEndpointType("endPoint");
        request.setSysLocationProduct("test");
        request.setSysProtocol(ProtocolType.HTTP);
        request.setSysRegionId("hangzhou");
        request.setSysVersion("4.2.3");
        request.putQueryParameter("test", "test");
        request.putHeadParameter("test", "test");
        AcsRequest acsRequest = request.buildRequest();
        Assert.assertTrue(acsRequest instanceof CommonRpcRequest);
    }
}
