package com.aliyuncs;

import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.utils.ParameterHelper;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.MethodType;

public class CommonTests extends BaseTest {

    @Test
    public void getCommonResponse_Rpc_Get_Test() throws ServerException, ClientException {
        CommonRequest request = new CommonRequest();
        request.setDomain("ft.aliyuncs.com");
        request.setVersion("2016-01-01");
        request.setAction("TestRpcApi");
        request.putQueryParameter("QueryParam", "QUERY_PARAM_CONTENT");
        
        CommonResponse response = client.getCommonResponse(request);
        
        JSONObject responseJson = JSON.parseObject(response.getData());
        Assert.assertEquals("QUERY_PARAM_CONTENT", responseJson.getJSONObject("Params").getString("QueryParam"));
    }
    
    @Test
    public void getCommonResponse_Rpc_Post_Test() throws ServerException, ClientException {
        CommonRequest request = new CommonRequest();
        request.setDomain("ft.aliyuncs.com");
        request.setVersion("2016-01-01");
        request.setAction("TestRpcApi");
        request.setMethod(MethodType.POST);
        request.putQueryParameter("QueryParam", "QUERY_PARAM_CONTENT");
        request.putBodyParameter("BodyParam", "BODY_PARAM_CONTENT");
        
        CommonResponse response = client.getCommonResponse(request);
        System.out.println(JSON.toJSONString(response));
        
        JSONObject responseJson = JSON.parseObject(response.getData());
        Assert.assertEquals("QUERY_PARAM_CONTENT", responseJson.getJSONObject("Params").getString("QueryParam"));
        Assert.assertEquals("BODY_PARAM_CONTENT", responseJson.getJSONObject("Params").getString("BodyParam"));
    }

    @Test
    public void getCommonResponse_Rpc_Https_Test() throws ServerException, ClientException {
        CommonRequest request = new CommonRequest();
        request.setDomain("ft.aliyuncs.com");
        request.setVersion("2016-01-01");
        request.setAction("TestRpcApi");
        request.setMethod(MethodType.POST);
        request.setProtocol(ProtocolType.HTTPS);
        request.putQueryParameter("QueryParam", "QUERY_PARAM_CONTENT");
        request.putBodyParameter("BodyParam", "BODY_PARAM_CONTENT");

        CommonResponse response = client.getCommonResponse(request);

        JSONObject responseJson = JSON.parseObject(response.getData());
        Assert.assertEquals("QUERY_PARAM_CONTENT", responseJson.getJSONObject("Params").getString("QueryParam"));
        Assert.assertEquals("BODY_PARAM_CONTENT", responseJson.getJSONObject("Params").getString("BodyParam"));
    }
    
    @Test
    public void getCommonResponse_Roa_Get_Test() throws ServerException, ClientException {
        CommonRequest request = new CommonRequest();
        request.setDomain("ft.aliyuncs.com");
        request.setVersion("2016-01-02");
        request.setAction("TestRoaApi");
        request.setUriPattern("/web/cloudapi");
        request.setMethod(MethodType.GET);
        request.putQueryParameter("QueryParam", "QUERY_PARAM_CONTENT");
        
        CommonResponse response = client.getCommonResponse(request);
        
        JSONObject responseJson = JSON.parseObject(response.getData());
        Assert.assertEquals("QUERY_PARAM_CONTENT", responseJson.getJSONObject("Params").getString("QueryParam"));
        Assert.assertEquals("common", responseJson.getJSONObject("Headers").getString("x-sdk-invoke-type")); 
    }
    
    @Test
    public void getCommonResponse_Roa_Post_Test() throws ServerException, ClientException {
        CommonRequest request = new CommonRequest();
        request.setDomain("ft.aliyuncs.com");
        request.setVersion("2016-01-02");
        request.setAction("TestRoaApi");
        request.setUriPattern("/web/cloudapi");
        request.setMethod(MethodType.POST);
        request.putQueryParameter("QueryParam", "QUERY_PARAM_CONTENT");
        request.putBodyParameter("BodyParam", "BODY_PARAM_CONTENT");
        request.putHeadParameter("HeadParam", "HEAD_PARAM_CONTENT");
        
        CommonResponse response = client.getCommonResponse(request);
        System.out.println(response.getData());
        
        JSONObject responseJson = JSON.parseObject(response.getData());
        Assert.assertEquals("QUERY_PARAM_CONTENT", responseJson.getJSONObject("Params").getString("QueryParam"));
        Assert.assertEquals("BODY_PARAM_CONTENT", responseJson.getJSONObject("Params").getString("BodyParam"));
        Assert.assertEquals("HEAD_PARAM_CONTENT", responseJson.getJSONObject("Headers").getString("HeadParam"));
        Assert.assertEquals("common", responseJson.getJSONObject("Headers").getString("x-sdk-invoke-type"));       
    }
    
    @Test
    public void getCommonResponse_Roa_Content_Test() throws ServerException, ClientException, UnsupportedEncodingException {
        CommonRequest request = new CommonRequest();
        request.setDomain("ft.aliyuncs.com");
        request.setVersion("2016-01-02");
        request.setAction("TestRoaApi");
        request.setUriPattern("/web/cloudapi");
        request.setMethod(MethodType.POST);
        Map<String, String> formParams = new HashMap<String, String>();
        formParams.put("BodyParam", "BODY_PARAM_CONTENT");
        byte[] data = ParameterHelper.getFormData(formParams);
        request.setHttpContent(data, "UTF-8", FormatType.FORM);
        request.putQueryParameter("QueryParam", "QUERY_PARAM_CONTENT");
        request.putHeadParameter("HeadParam", "HEAD_PARAM_CONTENT");
        
        CommonResponse response = client.getCommonResponse(request);
        System.out.println(response.getData());
        
        JSONObject responseJson = JSON.parseObject(response.getData());
        Assert.assertEquals("QUERY_PARAM_CONTENT", responseJson.getJSONObject("Params").getString("QueryParam"));
        Assert.assertEquals("BODY_PARAM_CONTENT", responseJson.getJSONObject("Params").getString("BodyParam"));
        Assert.assertEquals("HEAD_PARAM_CONTENT", responseJson.getJSONObject("Headers").getString("HeadParam"));
        Assert.assertEquals("common", responseJson.getJSONObject("Headers").getString("x-sdk-invoke-type")); 
    }
    
    @Test
    public void getCommonResponse_Roa_Content_Raw_Test() throws ServerException, ClientException, UnsupportedEncodingException {
        CommonRequest request = new CommonRequest();
        request.setDomain("ft.aliyuncs.com");
        request.setVersion("2016-01-02");
        request.setAction("TestRoaApi");
        request.setUriPattern("/web/cloudapi");
        request.setMethod(MethodType.POST);
        request.setHttpContent("BodyParam=BODY_PARAM_CONTENT".getBytes(), "UTF-8", FormatType.RAW);
        request.putQueryParameter("QueryParam", "QUERY_PARAM_CONTENT");
        request.putHeadParameter("HeadParam", "HEAD_PARAM_CONTENT");
        
        CommonResponse response = client.getCommonResponse(request);
        System.out.println(response.getData());
        
        JSONObject responseJson = JSON.parseObject(response.getData());
        Assert.assertEquals("QUERY_PARAM_CONTENT", responseJson.getJSONObject("Params").getString("QueryParam"));
        Assert.assertEquals("BodyParam=BODY_PARAM_CONTENT", responseJson.getString("Body"));
        Assert.assertEquals("HEAD_PARAM_CONTENT", responseJson.getJSONObject("Headers").getString("HeadParam"));
        Assert.assertEquals("common", responseJson.getJSONObject("Headers").getString("x-sdk-invoke-type")); 
    }
    
    @Test
    public void getCommonResponse_Roa_Put_Test() throws ServerException, ClientException {
        CommonRequest request = new CommonRequest();
        request.setDomain("ft.aliyuncs.com");
        request.setVersion("2016-01-02");
        request.setAction("TestRoaApi");
        request.setUriPattern("/web/cloudapi");
        request.setMethod(MethodType.PUT);
        request.putQueryParameter("QueryParam", "QUERY_PARAM_CONTENT");
        request.putBodyParameter("BodyParam", "BODY_PARAM_CONTENT");
        request.putHeadParameter("HeadParam", "HEAD_PARAM_CONTENT");
        
        CommonResponse response = client.getCommonResponse(request);
        //System.out.println(response.getData());
        
        JSONObject responseJson = JSON.parseObject(response.getData());
        Assert.assertEquals("QUERY_PARAM_CONTENT", responseJson.getJSONObject("Params").getString("QueryParam"));
        Assert.assertEquals("BODY_PARAM_CONTENT", responseJson.getJSONObject("Params").getString("BodyParam"));
        Assert.assertEquals("HEAD_PARAM_CONTENT", responseJson.getJSONObject("Headers").getString("HeadParam"));
        Assert.assertEquals("common", responseJson.getJSONObject("Headers").getString("x-sdk-invoke-type")); 
    }
    
    @Test
    public void getCommonResponse_Roa_Https_Test() throws ServerException, ClientException {
        CommonRequest request = new CommonRequest();
        request.setDomain("ft.aliyuncs.com");
        request.setVersion("2016-01-02");
        request.setAction("TestRoaApi");
        request.setUriPattern("/web/cloudapi");
        request.setMethod(MethodType.POST);
        request.setProtocol(ProtocolType.HTTPS);
        request.putQueryParameter("QueryParam", "QUERY_PARAM_CONTENT");
        request.putBodyParameter("BodyParam", "BODY_PARAM_CONTENT");
        request.putHeadParameter("HeadParam", "HEAD_PARAM_CONTENT");
        
        CommonResponse response = client.getCommonResponse(request);
        System.out.println(response.getData());
        
        JSONObject responseJson = JSON.parseObject(response.getData());
        Assert.assertEquals("QUERY_PARAM_CONTENT", responseJson.getJSONObject("Params").getString("QueryParam"));
        Assert.assertEquals("BODY_PARAM_CONTENT", responseJson.getJSONObject("Params").getString("BodyParam"));
        Assert.assertEquals("HEAD_PARAM_CONTENT", responseJson.getJSONObject("Headers").getString("HeadParam"));
        Assert.assertEquals("common", responseJson.getJSONObject("Headers").getString("x-sdk-invoke-type")); 
    }
    
    @Test
    public void getCommonResponse_Roa_Delete_Test() throws ServerException, ClientException {
        CommonRequest request = new CommonRequest();
        request.setDomain("ft.aliyuncs.com");
        request.setVersion("2016-01-02");
        request.setAction("TestRoaApi");
        request.setUriPattern("/web/cloudapi");
        request.setMethod(MethodType.DELETE);
        request.putQueryParameter("QueryParam", "QUERY_PARAM_CONTENT");
        request.putHeadParameter("HeadParam", "HEAD_PARAM_CONTENT");
        
        CommonResponse response = client.getCommonResponse(request);
        System.out.println(response.getData());
        
        JSONObject responseJson = JSON.parseObject(response.getData());
        Assert.assertEquals("QUERY_PARAM_CONTENT", responseJson.getJSONObject("Params").getString("QueryParam"));
        Assert.assertEquals("HEAD_PARAM_CONTENT", responseJson.getJSONObject("Headers").getString("HeadParam"));
        Assert.assertEquals("common", responseJson.getJSONObject("Headers").getString("x-sdk-invoke-type")); 
    }
    
    @Test
    public void getCommonResponse_Roa_Head_Test() throws ServerException, ClientException {
        CommonRequest request = new CommonRequest();
        request.setDomain("ft.aliyuncs.com");
        request.setVersion("2016-01-02");
        request.setAction("TestRoaApi");
        request.setUriPattern("/web/cloudapi");
        request.setMethod(MethodType.HEAD);
        request.putQueryParameter("QueryParam", "QUERY_PARAM_CONTENT");
        request.putHeadParameter("HeadParam", "HEAD_PARAM_CONTENT");
        
        CommonResponse response = client.getCommonResponse(request);
        System.out.println(JSON.toJSONString(response));
        
        Assert.assertEquals(200, response.getHttpStatus());
    }
    
    @Test
    public void getCommonResponse_Rpc_BearToken_Get_Test() throws ServerException, ClientException {
        CommonRequest request = new CommonRequest();
        request.setDomain("ft.aliyuncs.com:18082");
        request.setVersion("2016-01-01");
        request.setAction("TestRpcApi");
        request.putQueryParameter("QueryParam", "QUERY_PARAM_CONTENT");
        request.putHeadParameter("gateway_channel", "http");
        
        CommonResponse response = clientBearerToken.getCommonResponse(request);
        System.out.println(JSON.toJSONString(response.getData()));
        
        JSONObject responseJson = JSON.parseObject(response.getData());
        Assert.assertEquals("QUERY_PARAM_CONTENT", responseJson.getJSONObject("Params").getString("QueryParam"));
    }
    
    @Test
    public void getCommonResponse_Roa_BearerToken_Post_Test() throws ServerException, ClientException {
        CommonRequest request = new CommonRequest();
        request.setDomain("ft.aliyuncs.com:18082");
        request.setVersion("2016-01-02");
        request.setAction("TestRoaApi");
        request.setUriPattern("/web/cloudapi");
        request.setMethod(MethodType.POST);
        request.putQueryParameter("QueryParam", "QUERY_PARAM_CONTENT");
        request.putBodyParameter("BodyParam", "BODY_PARAM_CONTENT");
        request.putHeadParameter("HeadParam", "HEAD_PARAM_CONTENT");
        request.putHeadParameter("gateway_channel", "http");
        
        CommonResponse response = clientBearerToken.getCommonResponse(request);
        System.out.println(response.getData());
        
        JSONObject responseJson = JSON.parseObject(response.getData());
        Assert.assertEquals("QUERY_PARAM_CONTENT", responseJson.getJSONObject("Params").getString("QueryParam"));
        Assert.assertEquals("BODY_PARAM_CONTENT", responseJson.getJSONObject("Params").getString("BodyParam"));
        Assert.assertEquals("HEAD_PARAM_CONTENT", responseJson.getJSONObject("Headers").getString("HeadParam"));
        Assert.assertEquals("common", responseJson.getJSONObject("Headers").getString("x-sdk-invoke-type"));       
    }
}
