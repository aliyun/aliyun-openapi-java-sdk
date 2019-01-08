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
        Assert.assertEquals("utf-8", request.getSysEncoding());
        Assert.assertTrue(FormatType.JSON == request.getHttpContentType());
        Assert.assertEquals("abc", new String(request.getHttpContent(), "utf-8"));

        request.setSysUriPattern("uri");
        Assert.assertEquals("uri", request.getSysUriPattern());

        request.setSysProduct("ecs");
        Assert.assertEquals("ecs", request.getSysProduct());

        request.setSysReadTimeout(50000);
        Assert.assertTrue(50000 == request.getSysReadTimeout());

        request.putBodyParameter("test", "test");
        Map<String, String> bodyMap = request.getSysBodyParameters();
        Assert.assertNotNull(bodyMap);
        Assert.assertEquals("test", bodyMap.get("test"));

        request.setSysMethod(MethodType.DELETE);
        Assert.assertTrue(MethodType.DELETE == request.getSysMethod());

        request.setSysAction("action");
        Assert.assertEquals("action", request.getSysAction());

        request.setSysConnectTimeout(5000);
        Assert.assertTrue(5000 == request.getSysConnectTimeout());

        request.setSysDomain("domian");
        Assert.assertEquals("domian", request.getSysDomain());

        request.setSysEndpointType("endPoint");
        Assert.assertEquals("endPoint", request.getSysEndpointType());

        request.setSysLocationProduct("test");
        Assert.assertEquals("test", request.getSysLocationProduct());

        request.setSysProtocol(ProtocolType.HTTP);
        Assert.assertTrue(ProtocolType.HTTP == request.getSysProtocol());

        request.setSysRegionId("hangzhou");
        Assert.assertEquals("hangzhou", request.getSysRegionId());

        request.setSysVersion("4");
        Assert.assertEquals("4", request.getSysVersion());

        request.putQueryParameter("test", "test");
        Map<String, String> queryMap = request.getSysQueryParameters();
        Assert.assertNotNull(queryMap);
        Assert.assertEquals("test", queryMap.get("test"));

        request.putHeadParameter("test", "test");
        Map<String, String> headMap = request.getSysHeadParameters();
        Assert.assertNotNull(headMap);
        Assert.assertEquals("test", headMap.get("test"));

        request.putPathParameter("test", "test");
        Map<String, String> pathMap = request.getSysPathParameters();
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
