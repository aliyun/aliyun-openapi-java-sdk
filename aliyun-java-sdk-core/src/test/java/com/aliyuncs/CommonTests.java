package com.aliyuncs;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.utils.ParameterHelper;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.junit.Assert;
import org.junit.Test;

public class CommonTests extends BaseTest {

    @Test
    public void getCommonResponse_Rpc_Get_Test() throws ServerException, ClientException {
        CommonRequest request = new CommonRequest();
        request.setDomain("ft.aliyuncs.com");
        request.setVersion("2016-01-01");
        request.setAction("TestRpcApi");
        request.putQueryParameter("QueryParam", "QUERY_PARAM_CONTENT");

        CommonResponse response = client.getCommonResponse(request);

        JsonObject responseJson = (new JsonParser()).parse(response.getData()).getAsJsonObject();
        Assert.assertEquals("QUERY_PARAM_CONTENT", responseJson.get("Params").getAsJsonObject().get("QueryParam").getAsString());
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
        System.out.println((new Gson()).toJson(response));

        JsonObject responseJson = (new JsonParser()).parse(response.getData()).getAsJsonObject();
        Assert.assertEquals("QUERY_PARAM_CONTENT", responseJson.get("Params").getAsJsonObject().get("QueryParam").getAsString());
        Assert.assertEquals("BODY_PARAM_CONTENT", responseJson.get("Params").getAsJsonObject().get("BodyParam").getAsString());
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

        JsonObject responseJson = (new JsonParser()).parse(response.getData()).getAsJsonObject();
        ;
        Assert.assertEquals("QUERY_PARAM_CONTENT", responseJson.get("Params").getAsJsonObject().get("QueryParam").getAsString());
        Assert.assertEquals("BODY_PARAM_CONTENT", responseJson.get("Params").getAsJsonObject().get("BodyParam").getAsString());
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

        JsonObject responseJson = (new JsonParser()).parse(response.getData()).getAsJsonObject();
        ;
        Assert.assertEquals("QUERY_PARAM_CONTENT", responseJson.get("Params").getAsJsonObject().get("QueryParam").getAsString());
        Assert.assertEquals("common", responseJson.get("Headers").getAsJsonObject().get("x-sdk-invoke-type").getAsString());
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

        JsonObject responseJson = (new JsonParser()).parse(response.getData()).getAsJsonObject();
        ;
        Assert.assertEquals("QUERY_PARAM_CONTENT", responseJson.get("Params").getAsJsonObject().get("QueryParam").getAsString());
        Assert.assertEquals("BODY_PARAM_CONTENT", responseJson.get("Params").getAsJsonObject().get("BodyParam").getAsString());
        Assert.assertEquals("HEAD_PARAM_CONTENT", responseJson.get("Headers").getAsJsonObject().get("HeadParam").getAsString());
        Assert.assertEquals("common", responseJson.get("Headers").getAsJsonObject().get("x-sdk-invoke-type").getAsString());
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

        JsonObject responseJson = (new JsonParser()).parse(response.getData()).getAsJsonObject();
        ;
        Assert.assertEquals("QUERY_PARAM_CONTENT", responseJson.get("Params").getAsJsonObject().get("QueryParam").getAsString());
        Assert.assertEquals("BODY_PARAM_CONTENT", responseJson.get("Params").getAsJsonObject().get("BodyParam").getAsString());
        Assert.assertEquals("HEAD_PARAM_CONTENT", responseJson.get("Headers").getAsJsonObject().get("HeadParam").getAsString());
        Assert.assertEquals("common", responseJson.get("Headers").getAsJsonObject().get("x-sdk-invoke-type").getAsString());
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

        JsonObject responseJson = (new JsonParser()).parse(response.getData()).getAsJsonObject();
        ;
        Assert.assertEquals("QUERY_PARAM_CONTENT", responseJson.get("Params").getAsJsonObject().get("QueryParam").getAsString());
        Assert.assertEquals("BodyParam=BODY_PARAM_CONTENT", responseJson.get("Body").getAsString());
        Assert.assertEquals("HEAD_PARAM_CONTENT", responseJson.get("Headers").getAsJsonObject().get("HeadParam").getAsString());
        Assert.assertEquals("common", responseJson.get("Headers").getAsJsonObject().get("x-sdk-invoke-type").getAsString());
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

        JsonObject responseJson = (new JsonParser()).parse(response.getData()).getAsJsonObject();
        ;
        Assert.assertEquals("QUERY_PARAM_CONTENT", responseJson.get("Params").getAsJsonObject().get("QueryParam").getAsString());
        Assert.assertEquals("BODY_PARAM_CONTENT", responseJson.get("Params").getAsJsonObject().get("BodyParam").getAsString());
        Assert.assertEquals("HEAD_PARAM_CONTENT", responseJson.get("Headers").getAsJsonObject().get("HeadParam").getAsString());
        Assert.assertEquals("common", responseJson.get("Headers").getAsJsonObject().get("x-sdk-invoke-type").getAsString());
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

        JsonObject responseJson = (new JsonParser()).parse(response.getData()).getAsJsonObject();
        ;
        Assert.assertEquals("QUERY_PARAM_CONTENT", responseJson.get("Params").getAsJsonObject().get("QueryParam").getAsString());
        Assert.assertEquals("BODY_PARAM_CONTENT", responseJson.get("Params").getAsJsonObject().get("BodyParam").getAsString());
        Assert.assertEquals("HEAD_PARAM_CONTENT", responseJson.get("Headers").getAsJsonObject().get("HeadParam").getAsString());
        Assert.assertEquals("common", responseJson.get("Headers").getAsJsonObject().get("x-sdk-invoke-type").getAsString());
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

        JsonObject responseJson = (new JsonParser()).parse(response.getData()).getAsJsonObject();
        ;
        Assert.assertEquals("QUERY_PARAM_CONTENT", responseJson.get("Params").getAsJsonObject().get("QueryParam").getAsString());
        Assert.assertEquals("HEAD_PARAM_CONTENT", responseJson.get("Headers").getAsJsonObject().get("HeadParam").getAsString());
        Assert.assertEquals("common", responseJson.get("Headers").getAsJsonObject().get("x-sdk-invoke-type").getAsString());
    }

    //@Test
    //public void getCommonResponse_Roa_Head_Test() throws ServerException, ClientException {
    //    CommonRequest request = new CommonRequest();
    //    request.setDomain("ft.aliyuncs.com");
    //    request.setVersion("2016-01-02");
    //    request.setAction("TestRoaApi");
    //    request.setUriPattern("/web/cloudapi");
    //    request.setMethod(MethodType.HEAD);
    //    request.putQueryParameter("QueryParam", "QUERY_PARAM_CONTENT");
    //    request.putHeadParameter("HeadParam", "HEAD_PARAM_CONTENT");
    //
    //    CommonResponse response = client.getCommonResponse(request);
    //    System.out.println(JSON.toJSONString(response));
    //
    //    Assert.assertEquals(200, response.getHttpStatus());
    //}

    //@Test
    //public void getCommonResponse_Rpc_BearToken_Get_Test() throws ServerException, ClientException {
    //    CommonRequest request = new CommonRequest();
    //    request.setDomain("ft.aliyuncs.com:18082");
    //    request.setVersion("2016-01-01");
    //    request.setAction("TestRpcApi");
    //    request.putQueryParameter("QueryParam", "QUERY_PARAM_CONTENT");
    //    request.putHeadParameter("gateway_channel", "http");
    //
    //    CommonResponse response = clientBearerToken.getCommonResponse(request);
    //    System.out.println((new Gson()).toJson(response.getData()));
    //
    //    JsonObject responseJson = (new JsonParser()).parse(response.getData()).getAsJsonObject();
    //    Assert.assertEquals("QUERY_PARAM_CONTENT", responseJson.get("Params").getAsJsonObject().get("QueryParam").getAsString());
    //}

    //@Test
    //public void getCommonResponse_Roa_BearerToken_Post_Test() throws ServerException, ClientException {
    //    CommonRequest request = new CommonRequest();
    //    request.setDomain("ft.aliyuncs.com:18082");
    //    request.setVersion("2016-01-02");
    //    request.setAction("TestRoaApi");
    //    request.setUriPattern("/web/cloudapi");
    //    request.setMethod(MethodType.POST);
    //    request.putQueryParameter("QueryParam", "QUERY_PARAM_CONTENT");
    //    request.putBodyParameter("BodyParam", "BODY_PARAM_CONTENT");
    //    request.putHeadParameter("HeadParam", "HEAD_PARAM_CONTENT");
    //    request.putHeadParameter("gateway_channel", "http");
    //
    //    CommonResponse response = clientBearerToken.getCommonResponse(request);
    //    System.out.println(response.getData());
    //
    //    JsonObject responseJson = (new JsonParser()).parse(response.getData()).getAsJsonObject();
    //    Assert.assertEquals("QUERY_PARAM_CONTENT", responseJson.get("Params").getAsJsonObject().get("QueryParam").getAsString());
    //    Assert.assertEquals("BODY_PARAM_CONTENT", responseJson.get("Params").getAsJsonObject().get("BodyParam").getAsString());
    //    Assert.assertEquals("HEAD_PARAM_CONTENT", responseJson.get("Headers").getAsJsonObject().get("HeadParam").getAsString());
    //    Assert.assertEquals("common", responseJson.get("Headers").getAsJsonObject().get("x-sdk-invoke-type").getAsString());
    //}

}
