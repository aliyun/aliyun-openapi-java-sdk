package com.aliyuncs;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;

import com.aliyuncs.ecs.model.v20140526.DescribeRegionsRequest;
import com.aliyuncs.ecs.model.v20140526.DescribeRegionsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.ft.model.TestRoaApiRequest;
import com.aliyuncs.ft.model.TestRpcApiRequest;
import com.aliyuncs.ft.model.TestRpcApiResponse;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class DefaultAcsClientTest extends BaseTest {

    @Test
    @Ignore
    public void getAcsResponse_ROA_Test() throws ServerException, ClientException, NoSuchAlgorithmException {
        DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", "Ft", "ft.aliyuncs.com");
        TestRoaApiRequest request = new TestRoaApiRequest();
        request.setBodyParam("BODY_PARAM_CONTENT");
        request.setHeaderParam("HEAD_PARAM_CONTENT");
        request.setQueryParam("QUERY_PARAM_CONTENT");
        request.setHttpContentType(FormatType.JSON);
        HttpResponse response = client.doAction(request, "cn-hangzhou", dailyEnvCredentail);
        Assert.assertNotNull(response);
        String responseContent = new String(response.getHttpContent());
        JsonObject responseJson = (new JsonParser()).parse(responseContent).getAsJsonObject();
        Assert.assertEquals("HEAD_PARAM_CONTENT", responseJson.get("Headers").getAsJsonObject().get("HeaderParam").getAsString());
        Assert.assertEquals("QUERY_PARAM_CONTENT", responseJson.get("Params").getAsJsonObject().get("QueryParam").getAsString());
        Assert.assertEquals("BODY_PARAM_CONTENT", responseJson.get("Params").getAsJsonObject().get("BodyParam").getAsString());
        Assert.assertEquals("normal", responseJson.get("Headers").getAsJsonObject().get("x-sdk-invoke-type").getAsString());
    }

    @Test
    @Ignore
    public void getAcsResponse_ROA_GET_Test() throws ServerException, ClientException, NoSuchAlgorithmException {
        DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", "Ft", "ft.aliyuncs.com");
        TestRoaApiRequest request = new TestRoaApiRequest();
        request.setMethod(MethodType.GET);
        request.setQueryParam("QUERY_PARAM_CONTENT");
        request.setHttpContentType(FormatType.JSON);
        HttpResponse response = client.doAction(request, "cn-hangzhou", dailyEnvCredentail);
        Assert.assertNotNull(response);
        String responseContent = new String(response.getHttpContent());
        JsonObject responseJson = (new JsonParser()).parse(responseContent).getAsJsonObject();
        Assert.assertEquals("QUERY_PARAM_CONTENT", responseJson.get("Params").getAsJsonObject().get("QueryParam").getAsString());
        Assert.assertEquals("normal", responseJson.get("Headers").getAsJsonObject().get("x-sdk-invoke-type").getAsString());
    }

    @Test
    public void getAcsResponse_RPC_Test() throws ServerException, ClientException, NoSuchAlgorithmException {
        DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", "Ecs", "ecs-cn-hangzhou.aliyuncs.com");
        DescribeRegionsRequest request = new DescribeRegionsRequest();
        request.setAcceptFormat(FormatType.JSON);
        request.setMethod(MethodType.POST);

        DescribeRegionsResponse response = client.getAcsResponse(request, "cn-hangzhou", dailyEnvCredentail);
        Assert.assertNotNull(response);
    }

    @Test
    public void readErrorTest() {
        try {
            HttpResponse httpResponse = new HttpResponse();
            String json
                = "{\"RequestId\":\"AFDB32E4-6CD3-402E-A5C5-695F05D3ED0A\",\"HostId\":\"ecs.aliyuncs.com\","
                + "\"Code\":\"MissingParameter\",\"Message\":\"An input parameter ImageId that is mandatory for "
                + "processing the request is not supplied.\"}";
            httpResponse.setHttpContent(json.getBytes(), "UTF-8", FormatType.JSON);
            Method method = DefaultAcsClient.class.getDeclaredMethod("readError", HttpResponse.class, FormatType.class);
            method.setAccessible(true);
            AcsError acsError = (AcsError)method.invoke(client, httpResponse, FormatType.JSON);
            Assert.assertEquals("AFDB32E4-6CD3-402E-A5C5-695F05D3ED0A", acsError.getRequestId());
            Assert.assertEquals("MissingParameter", acsError.getErrorCode());
            Assert.assertEquals(
                "An input parameter ImageId that is mandatory for processing the request is not supplied.",
                acsError.getErrorMessage());
        } catch (IllegalArgumentException e) {
            Assert.fail(e.toString());
        } catch (IllegalAccessException e) {
            Assert.fail(e.toString());
        } catch (InvocationTargetException e) {
            Assert.fail(e.toString());
        } catch (SecurityException e) {
            Assert.fail(e.toString());
        } catch (NoSuchMethodException e) {
            Assert.fail(e.toString());
        }
    }

    @Test
    public void parseAcsResponseTest() throws Exception {
        HttpResponse httpResponse = new HttpResponse();
        String json
            = "{\"RequestId\":\"AFDB32E4-6CD3-402E-A5C5-695F05D3ED0A\",\"HostId\":\"ecs.aliyuncs.com\","
            + "\"Code\":\"MissingParameter\",\"Message\":\"An input parameter ImageId that is mandatory for "
            + "processing the request is not supplied.\"}";
        httpResponse.setHttpContent(json.getBytes(), "UTF-8", FormatType.JSON);
        DescribeRegionsRequest describeRegionsRequest = new DescribeRegionsRequest();
        try {
            httpResponse.setStatus(310);
            Method method = DefaultAcsClient.class.getDeclaredMethod("parseAcsResponse", Class.class,
                HttpResponse.class);
            method.setAccessible(true);
            method.invoke(client, describeRegionsRequest.getResponseClass(), httpResponse);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof ClientException)) {
                Assert.fail(e.toString());
            }
        }
        try {
            httpResponse.setStatus(510);
            Method method = DefaultAcsClient.class.getDeclaredMethod("parseAcsResponse", Class.class,
                HttpResponse.class);
            method.setAccessible(true);
            method.invoke(client, describeRegionsRequest.getResponseClass(), httpResponse);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof ServerException)) {
                Assert.fail(e.toString());
            }
        }
    }

    @Test
    @Ignore
    public void getAcsResponse_RPC_V2_Test()
        throws ServerException, ClientException, NoSuchAlgorithmException, InterruptedException {

        TestRpcApiRequest request = new TestRpcApiRequest();
        request.setBodyParam("BODY_PARAM_CONTENT");
        request.setQueryParam("QUERY_PARAM_CONTENT");
        request.setAcceptFormat(FormatType.JSON);
        request.setMethod(MethodType.POST);

        TestRpcApiResponse response = clientV2.getAcsResponse(request);
        Assert.assertNotNull(response);
        Assert.assertNotNull(response.getParams());
        Assert.assertEquals("QUERY_PARAM_CONTENT", response.getParams().getQueryParam());
        Assert.assertEquals("BODY_PARAM_CONTENT", response.getParams().getBodyParam());
    }

    @Test
    @Ignore
    public void getAcsResponse_ROA_V2_Test() throws ServerException, ClientException, NoSuchAlgorithmException {
        DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", "Ft", "ft.aliyuncs.com");
        TestRoaApiRequest request = new TestRoaApiRequest();
        request.setBodyParam("BODY_PARAM_CONTENT");
        request.setHeaderParam("HEAD_PARAM_CONTENT");
        request.setQueryParam("QUERY_PARAM_CONTENT");
        request.setHttpContentType(FormatType.JSON);
        HttpResponse response = clientV2.doAction(request);
        Assert.assertNotNull(response);
        String responseContent = new String(response.getHttpContent());
        System.out.println(responseContent);
        JsonObject responseJson = (new JsonParser()).parse(responseContent).getAsJsonObject();
        Assert.assertEquals("HEAD_PARAM_CONTENT", responseJson.get("Headers").getAsJsonObject().get("HeaderParam").getAsString());
        Assert.assertEquals("QUERY_PARAM_CONTENT", responseJson.get("Params").getAsJsonObject().get("QueryParam").getAsString());
        Assert.assertEquals("BODY_PARAM_CONTENT", responseJson.get("Params").getAsJsonObject().get("BodyParam").getAsString());
        Assert.assertEquals("normal", responseJson.get("Headers").getAsJsonObject().get("x-sdk-invoke-type").getAsString());
    }


}
