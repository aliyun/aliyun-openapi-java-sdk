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

import com.aliyuncs.auth.Credential;
import com.aliyuncs.ft.model.v20160101.TestRpcApiRequest;
import com.aliyuncs.ft.model.v20160101.TestRpcApiResponse;
import com.aliyuncs.ft.model.v20160102.TestRoaApiRequest;
import com.aliyuncs.ft.model.v20160102.TestRoaApiResponse;
import com.aliyuncs.http.HttpRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import org.junit.Assert;
import org.junit.Test;

import com.aliyuncs.batchcompute.model.Job;
import com.aliyuncs.batchcompute.model.ListJobsRequest;
import com.aliyuncs.batchcompute.model.ListJobsResponse;
import com.aliyuncs.ecs.v20140526.model.DescribeRegionsRequest;
import com.aliyuncs.ecs.v20140526.model.DescribeRegionsResponse;
import com.aliyuncs.ecs.v20140526.model.DescribeRegionsResponse.Region;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
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
            Assert.fail();
        } catch (IllegalAccessException e) {
            Assert.fail();
        } catch (InvocationTargetException e) {
            Assert.fail();
        } catch (SecurityException e) {
            Assert.fail();
        } catch (NoSuchMethodException e) {
            Assert.fail();
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
                Assert.fail();
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
                Assert.fail();
            }
        }
    }

    public void cmsTest() {
        HttpRequest request = new HttpRequest("");
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
