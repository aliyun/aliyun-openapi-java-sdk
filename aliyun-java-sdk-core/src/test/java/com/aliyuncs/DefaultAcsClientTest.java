/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;

import org.junit.Assert;
import org.junit.Test;

import com.aliyuncs.ecs.v20140526.model.DescribeRegionsRequest;
import com.aliyuncs.ecs.v20140526.model.DescribeRegionsResponse;
import com.aliyuncs.ecs.v20140526.model.DescribeRegionsResponse.Region;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.ft.model.RpcDubboApiRequest;
import com.aliyuncs.ft.model.TestRoaApiRequest;
import com.aliyuncs.ft.model.TestRpcApiRequest;
import com.aliyuncs.ft.model.TestRpcApiResponse;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpResponse;

public class DefaultAcsClientTest extends BaseTest {

    @Test
    public void getAcsResponse_RPC_JSON_Test() throws ServerException, ClientException {
        DescribeRegionsRequest describeRegionsRequest = new DescribeRegionsRequest();
        describeRegionsRequest.setAcceptFormat(FormatType.JSON);
        DescribeRegionsResponse describeRegionsResponse = client.getAcsResponse(describeRegionsRequest);
        Assert.assertNotNull(describeRegionsResponse.getRequestId());
        Assert.assertNotNull(describeRegionsResponse.getRegions());
        for (Region region : describeRegionsResponse.getRegions()) {
            Assert.assertNotNull(region.getRegionId());
            Assert.assertNotNull(region.getLocalName());
        }
    }

    @Test
    public void getAcsResponse_RPC_XML_Test() throws ServerException, ClientException {
        DescribeRegionsRequest describeRegionsRequest = new DescribeRegionsRequest();
        describeRegionsRequest.setAcceptFormat(FormatType.XML);
        DescribeRegionsResponse describeRegionsResponse = client.getAcsResponse(describeRegionsRequest);
        Assert.assertNotNull(describeRegionsResponse.getRequestId());
        Assert.assertNotNull(describeRegionsResponse.getRegions());
        for (Region region : describeRegionsResponse.getRegions()) {
            Assert.assertNotNull(region.getRegionId());
            Assert.assertNotNull(region.getLocalName());
        }
    }

    @Test
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
        JSONObject responseJson = JSON.parseObject(responseContent);
        Assert.assertEquals("HEAD_PARAM_CONTENT", responseJson.getJSONObject("Headers").getString("HeaderParam"));
        Assert.assertEquals("QUERY_PARAM_CONTENT", responseJson.getJSONObject("Params").getString("QueryParam"));
        Assert.assertEquals("BODY_PARAM_CONTENT", responseJson.getJSONObject("Params").getString("BodyParam"));
    }
    
    @Test
    public void getAcsResponse_ROA_GET_Test() throws ServerException, ClientException, NoSuchAlgorithmException {
        DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", "Ft", "ft.aliyuncs.com");
        TestRoaApiRequest request = new TestRoaApiRequest();
        request.setMethod(MethodType.GET);
        request.setQueryParam("QUERY_PARAM_CONTENT");
        request.setHttpContentType(FormatType.JSON);
        HttpResponse response = client.doAction(request, "cn-hangzhou", dailyEnvCredentail);
        Assert.assertNotNull(response);
        String responseContent = new String(response.getHttpContent());
        JSONObject responseJson = JSON.parseObject(responseContent);
        Assert.assertEquals("QUERY_PARAM_CONTENT", responseJson.getJSONObject("Params").getString("QueryParam"));
    }

    @Test
    public void getAcsResponse_RPC_Test() throws ServerException, ClientException, NoSuchAlgorithmException {
        DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", "Ft", "ft.aliyuncs.com");
        TestRpcApiRequest request = new TestRpcApiRequest();
        request.setBodyParam("BODY_PARAM_CONTENT");
        request.setQueryParam("QUERY_PARAM_CONTENT");
        request.setAcceptFormat(FormatType.JSON);
        request.setMethod(MethodType.POST);

        TestRpcApiResponse response = client.getAcsResponse(request, "cn-hangzhou", dailyEnvCredentail);
        Assert.assertNotNull(response);
        Assert.assertNotNull(response.getParams());
        Assert.assertEquals("QUERY_PARAM_CONTENT", response.getParams().getQueryParam());
        Assert.assertEquals("BODY_PARAM_CONTENT", response.getParams().getBodyParam());
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
    public void rpcDubboApiTest() {
        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", properties.getProperty("publicKeyId"),
                properties.getProperty("privateKey"));
        clientV2 = new DefaultAcsClient(profile);
        
        RpcDubboApiRequest rpcDubboApiRequest = new RpcDubboApiRequest();
        try {
            HttpResponse httpResponse = clientV2.doAction(rpcDubboApiRequest);
            Method method = DefaultAcsClient.class.getDeclaredMethod("getResponseContent", HttpResponse.class);
            method.setAccessible(true);
            String stringContent = (String) method.invoke(client, httpResponse);
            Assert.assertEquals(200, httpResponse.getStatus());
            Assert.assertNotNull(stringContent);
        } catch (ServerException e) {
            Assert.fail(e.toString());
        } catch (ClientException e) {
            Assert.fail(e.toString());
        } catch (SecurityException e) {
            Assert.fail(e.toString());
        } catch (NoSuchMethodException e) {
            Assert.fail(e.toString());
        } catch (IllegalArgumentException e) {
            Assert.fail(e.toString());
        } catch (IllegalAccessException e) {
            Assert.fail(e.toString());
        } catch (InvocationTargetException e) {
            Assert.fail(e.toString());
        }      
    }
    
    @Test
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
    public void getAcsResponse_RPC_V2_Location_Test()
        throws ServerException, ClientException, NoSuchAlgorithmException, InterruptedException {

        TestRpcApiRequest request = new TestRpcApiRequest();
        request.setLocationProduct("ft");
        request.setBodyParam("BODY_PARAM_CONTENT");
        request.setQueryParam("QUERY_PARAM_CONTENT");
        request.setAcceptFormat(FormatType.JSON);
        request.setMethod(MethodType.POST);
        request.setRegionId("cn-shanghai");

        try {
            TestRpcApiResponse response = clientV2.getAcsResponse(request);
            Assert.assertNotNull(response);
            Assert.assertNotNull(response.getParams());
            Assert.assertEquals("QUERY_PARAM_CONTENT", response.getParams().getQueryParam());
            Assert.assertEquals("BODY_PARAM_CONTENT", response.getParams().getBodyParam());
        } catch (ClientException e) {
            Assert.assertEquals("SDK.InvalidRegionId", e.getErrCode());
        }        
    }
    
    @Test
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
        JSONObject responseJson = JSON.parseObject(responseContent);
        Assert.assertEquals("HEAD_PARAM_CONTENT", responseJson.getJSONObject("Headers").getString("HeaderParam"));
        Assert.assertEquals("QUERY_PARAM_CONTENT", responseJson.getJSONObject("Params").getString("QueryParam"));
        Assert.assertEquals("BODY_PARAM_CONTENT", responseJson.getJSONObject("Params").getString("BodyParam"));
    }
    
    @Test
    public void getAcsResponse_RPC_V2_Bad_Sign_Test()
        throws ServerException, ClientException, NoSuchAlgorithmException, InterruptedException {

        TestRpcApiRequest request = new TestRpcApiRequest();
        request.setActionName("Test RpcApi");
        request.setBodyParam("BODY_PARAM_CONTENT");
        request.setQueryParam("QUERY_PARAM_CONTENT");
        request.setAcceptFormat(FormatType.JSON);
        request.setMethod(MethodType.POST);
      
        try {
            TestRpcApiResponse response = clientV2.getAcsResponse(request);
            Assert.assertNotNull(response);
            Assert.assertNotNull(response.getParams());
            Assert.assertEquals("QUERY_PARAM_CONTENT", response.getParams().getQueryParam());
            Assert.assertEquals("BODY_PARAM_CONTENT", response.getParams().getBodyParam());
        } catch (ClientException e) {
            Assert.assertEquals("InvalidAction.NotFound", e.getErrCode());
        }
        
        request.setActionName("Test测试RpcApi");
      
        try {
            TestRpcApiResponse response = clientV2.getAcsResponse(request);
            Assert.assertNotNull(response);
            Assert.assertNotNull(response.getParams());
            Assert.assertEquals("QUERY_PARAM_CONTENT", response.getParams().getQueryParam());
            Assert.assertEquals("BODY_PARAM_CONTENT", response.getParams().getBodyParam());
        } catch (ClientException e) {
            Assert.assertEquals("InvalidAction.NotFound", e.getErrCode());
        }
    }
    

    @Test
    public void getAcsResponse_RPC_JSON_V2_Test() throws ServerException, ClientException {
        DescribeRegionsRequest describeRegionsRequest = new DescribeRegionsRequest();
        describeRegionsRequest.setAcceptFormat(FormatType.JSON);
        DescribeRegionsResponse describeRegionsResponse = clientV2.getAcsResponse(describeRegionsRequest);
        Assert.assertNotNull(describeRegionsResponse.getRequestId());
        Assert.assertNotNull(describeRegionsResponse.getRegions());
        for (Region region : describeRegionsResponse.getRegions()) {
            Assert.assertNotNull(region.getRegionId());
            Assert.assertNotNull(region.getLocalName());
        }
    }
    
    private int appearNumber(String srcText, String findText) {
        int count = 0;
        int index = 0;
        while ((index = srcText.indexOf(findText, index)) != -1) {
            index = index + findText.length();
            count++;
        }
        return count;
    }

    //	@Test
    //	public void doAction_ExceptionTest () throws ServerException {
    //		IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou","testAccesskey", "testAccessSecret");
    //		client = new DefaultAcsClient(profile);
    //
    //		DescribeRegionsRequest describeRegionsRequest = new DescribeRegionsRequest();
    //		try {
    //			DescribeRegionsResponse describeRegionsResponse = client.getAcsResponse(describeRegionsRequest);
    //		} catch (ClientException e) {
    //			Assert.assertEquals("SDK.InvalidAccessSecret", e.getErrCode());
    //		}
    //	}

}
