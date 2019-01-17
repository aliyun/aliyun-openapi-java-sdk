package com.aliyuncs;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.powermock.reflect.Whitebox;

import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.http.ProtocolType;

public class CommonRequestTest {

    @Test
    public void commonRoaRequestTest() {
        CommonRequest request = new CommonRequest();
        request.setSysUriPattern("uri");
        request.putPathParameter("test", "test");
        AcsRequest<CommonResponse> acsRequest = request.buildRequest();
        Assert.assertTrue(acsRequest instanceof CommonRoaRequest);
    }

    @Test
    public void commonRequestGetSetTest() throws UnsupportedEncodingException {
        CommonRequest request = new CommonRequest();
        request.setHttpContent("test".getBytes("UTF-8"), "test", null);
        request.setHttpContent(null, "test", null);
        request.setHttpContent("test".getBytes("UTF-8"), null, FormatType.JSON);
        Assert.assertNull(request.getSysEncoding());
        Assert.assertNull(request.getHttpContent());
        Assert.assertNull(request.getHttpContentType());

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

        request.putHeadParameter(null, null);
        request.putHeadParameter("test", "test");
        Map<String, String> headMap = request.getSysHeadParameters();
        Assert.assertNotNull(headMap);
        Assert.assertEquals("test", headMap.get("test"));

        request.putPathParameter("test", "test");
        Map<String, String> pathMap = request.getSysPathParameters();
        Assert.assertNotNull(pathMap);
        Assert.assertEquals("test", pathMap.get("test"));
    }

    @Test
    public void deprecatedGetSetTest() throws UnsupportedEncodingException {
        CommonRequest request = new CommonRequest();

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
        Assert.assertNull(request.getEncoding());
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

    @Test
    public void setParameterTest() throws Exception {
        CommonRequest request = new CommonRequest();
        Map<String, String> testMap = null;
        Whitebox.invokeMethod(request, "setParameter", testMap, null, null);
        Whitebox.invokeMethod(request, "setParameter", testMap, "", null);
        Whitebox.invokeMethod(request, "setParameter", testMap, "test", "test");
        testMap = new HashMap<String, String>();
        Whitebox.invokeMethod(request, "setParameter", testMap, null, "test");
        Whitebox.invokeMethod(request, "setParameter", testMap, "", null);
        Assert.assertNull(testMap.get("test"));
    }
}
