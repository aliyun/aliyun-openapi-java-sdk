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
package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.DescribeApiHistoryResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.*;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;


public class DescribeApiHistoryResponseUnmarshaller {

	public static DescribeApiHistoryResponse unmarshall(DescribeApiHistoryResponse describeApiHistoryResponse, UnmarshallerContext context) {
		
		describeApiHistoryResponse.setRequestId(context.stringValue("DescribeApiHistoryResponse.RequestId"));
		describeApiHistoryResponse.setRegionId(context.stringValue("DescribeApiHistoryResponse.RegionId"));
		describeApiHistoryResponse.setGroupId(context.stringValue("DescribeApiHistoryResponse.GroupId"));
		describeApiHistoryResponse.setGroupName(context.stringValue("DescribeApiHistoryResponse.GroupName"));
		describeApiHistoryResponse.setStageName(context.stringValue("DescribeApiHistoryResponse.StageName"));
		describeApiHistoryResponse.setApiId(context.stringValue("DescribeApiHistoryResponse.ApiId"));
		describeApiHistoryResponse.setApiName(context.stringValue("DescribeApiHistoryResponse.ApiName"));
		describeApiHistoryResponse.setDescription(context.stringValue("DescribeApiHistoryResponse.Description"));
		describeApiHistoryResponse.setHistoryVersion(context.stringValue("DescribeApiHistoryResponse.HistoryVersion"));
		describeApiHistoryResponse.setStatus(context.stringValue("DescribeApiHistoryResponse.Status"));
		describeApiHistoryResponse.setVisibility(context.stringValue("DescribeApiHistoryResponse.Visibility"));
		describeApiHistoryResponse.setAuthType(context.stringValue("DescribeApiHistoryResponse.AuthType"));
		describeApiHistoryResponse.setForceNonceCheck(context.booleanValue("DescribeApiHistoryResponse.ForceNonceCheck"));
		describeApiHistoryResponse.setDisableInternet(context.booleanValue("DescribeApiHistoryResponse.DisableInternet"));

		describeApiHistoryResponse.setResultType(context.stringValue("DescribeApiHistoryResponse.ResultType"));
		describeApiHistoryResponse.setResultSample(context.stringValue("DescribeApiHistoryResponse.ResultSample"));
		describeApiHistoryResponse.setFailResultSample(context.stringValue("DescribeApiHistoryResponse.FailResultSample"));
		describeApiHistoryResponse.setDeployedTime(context.stringValue("DescribeApiHistoryResponse.DeployedTime"));
		describeApiHistoryResponse.setAllowSignatureMethod(context.stringValue("DescribeApiHistoryResponse.AllowSignatureMethod"));
		describeApiHistoryResponse.setResultBodyModel(context.stringValue("DescribeApiHistoryResponse.ResultBodyModel"));

		RequestConfig requestConfig = new RequestConfig();
		requestConfig.setRequestProtocol(context.stringValue("DescribeApiHistoryResponse.RequestConfig.RequestProtocol"));
		requestConfig.setRequestHttpMethod(context.stringValue("DescribeApiHistoryResponse.RequestConfig.RequestHttpMethod"));
		requestConfig.setRequestPath(context.stringValue("DescribeApiHistoryResponse.RequestConfig.RequestPath"));
		requestConfig.setBodyFormat(context.stringValue("DescribeApiHistoryResponse.RequestConfig.BodyFormat"));
		requestConfig.setPostBodyDescription(context.stringValue("DescribeApiHistoryResponse.RequestConfig.PostBodyDescription"));
		requestConfig.setRequestMode(context.stringValue("DescribeApiHistoryResponse.RequestConfig.RequestMode"));
		requestConfig.setBodyModel(context.stringValue("DescribeApiHistoryResponse.RequestConfig.BodyModel"));
		describeApiHistoryResponse.setRequestConfig(requestConfig);

		ServiceConfig serviceConfig = new ServiceConfig();
		serviceConfig.setServiceProtocol(context.stringValue("DescribeApiHistoryResponse.ServiceConfig.ServiceProtocol"));
		serviceConfig.setServiceAddress(context.stringValue("DescribeApiHistoryResponse.ServiceConfig.ServiceAddress"));
		serviceConfig.setServiceHttpMethod(context.stringValue("DescribeApiHistoryResponse.ServiceConfig.ServiceHttpMethod"));
		serviceConfig.setServicePath(context.stringValue("DescribeApiHistoryResponse.ServiceConfig.ServicePath"));
		serviceConfig.setServiceTimeout(context.integerValue("DescribeApiHistoryResponse.ServiceConfig.ServiceTimeout"));
		serviceConfig.setMock(context.stringValue("DescribeApiHistoryResponse.ServiceConfig.Mock"));
        serviceConfig.setMockResult(context.stringValue("DescribeApiHistoryResponse.ServiceConfig.MockResult"));
        serviceConfig.setServiceVpcEnable(context.booleanValue("DescribeApiHistoryResponse.ServiceConfig.ServiceVpcEnable"));
        VpcConfig vpcConfig = new VpcConfig();
        vpcConfig.setVpcId(context.stringValue("DescribeApiHistoryResponse.ServiceConfig.VpcConfig.VpcId"));
        vpcConfig.setInstanceId(context.stringValue("DescribeApiHistoryResponse.ServiceConfig.VpcConfig.InstanceId"));
        vpcConfig.setPort(context.integerValue("DescribeApiHistoryResponse.ServiceConfig.VpcConfig.Port"));
        serviceConfig.setVpcConfig(vpcConfig);

        FunctionComputeConfig functionComputeConfig = new FunctionComputeConfig();
        functionComputeConfig.setFcRegionId("DescribeApiHistoryResponse.ServiceConfig.FunctionComputeConfig.RegionId");
        functionComputeConfig.setFunctionName("DescribeApiHistoryResponse.ServiceConfig.FunctionComputeConfig.FunctionName");
        functionComputeConfig.setRoleArn("DescribeApiHistoryResponse.ServiceConfig.FunctionComputeConfig.RoleArn");
        functionComputeConfig.setServiceName("DescribeApiHistoryResponse.ServiceConfig.FunctionComputeConfig.ServiceName");
        serviceConfig.setFunctionComputeConfig(functionComputeConfig);

		serviceConfig.setMockStatusCode(context.integerValue("DescribeApiHistoryResponse.ServiceConfig.MockStatusCode"));

		List<MockHeader> mockHeaders=new ArrayList<MockHeader>();
		for(int i=0;i<context.lengthValue("DescribeApiHistoryResponse.ServiceConfig.MockHeaders.Length");i++){
			MockHeader mockHeader=new MockHeader();
			mockHeader.setHeaderName(context.stringValue("DescribeApiHistoryResponse.ServiceConfig.MockHeaders["+ i +"].HeaderName"));
			mockHeader.setHeaderValue(context.stringValue("DescribeApiHistoryResponse.ServiceConfig.MockHeaders["+ i +"].HeaderValue"));
			mockHeaders.add(mockHeader);
		}
		serviceConfig.setMockHeaders(mockHeaders);

        describeApiHistoryResponse.setServiceConfig(serviceConfig);
		
		OpenIdConnectConfig openIdConnectConfig = new OpenIdConnectConfig();
        openIdConnectConfig.setIdTokenParamName(context.stringValue("DescribeApiHistoryResponse.OpenIdConnectConfig.IdTokenParamName"));
        openIdConnectConfig.setOpenIdApiType(context.stringValue("DescribeApiHistoryResponse.OpenIdConnectConfig.OpenIdApiType"));
        openIdConnectConfig.setPublicKey(context.stringValue("DescribeApiHistoryResponse.OpenIdConnectConfig.PublicKey"));
        openIdConnectConfig.setPublicKeyId(context.stringValue("DescribeApiHistoryResponse.OpenIdConnectConfig.PublicKeyId"));
        describeApiHistoryResponse.setOpenIdConnectConfig(openIdConnectConfig);

		List<SystemParameter> systemParameters = new ArrayList<SystemParameter>();
		for (int i = 0; i < context.lengthValue("DescribeApiHistoryResponse.SystemParameters.Length"); i++) {
			SystemParameter systemParameter = new SystemParameter();
			systemParameter.setParameterName(context.stringValue("DescribeApiHistoryResponse.SystemParameters["+ i +"].ParameterName"));
			systemParameter.setServiceParameterName(context.stringValue("DescribeApiHistoryResponse.SystemParameters["+ i +"].ServiceParameterName"));
			systemParameter.setLocation(context.stringValue("DescribeApiHistoryResponse.SystemParameters["+ i +"].Location"));
			systemParameter.setDemoValue(context.stringValue("DescribeApiHistoryResponse.SystemParameters["+ i +"].DemoValue"));
			systemParameter.setDescription(context.stringValue("DescribeApiHistoryResponse.SystemParameters["+ i +"].Description"));

			systemParameters.add(systemParameter);
		}
		describeApiHistoryResponse.setSystemParameters(systemParameters);
		
		List<SystemParameter> customSystemParameters = new ArrayList<SystemParameter>();
        for (int i = 0; i < context.lengthValue("DescribeApiHistoryResponse.CustomSystemParameters.Length"); i++) {
            SystemParameter customSystemParameter = new SystemParameter();
            customSystemParameter.setParameterName(context.stringValue("DescribeApiHistoryResponse.CustomSystemParameters["+ i +"].ParameterName"));
            customSystemParameter.setServiceParameterName(context.stringValue("DescribeApiHistoryResponse.CustomSystemParameters["+ i +"].ServiceParameterName"));
            customSystemParameter.setLocation(context.stringValue("DescribeApiHistoryResponse.CustomSystemParameters["+ i +"].Location"));
            customSystemParameter.setDemoValue(context.stringValue("DescribeApiHistoryResponse.CustomSystemParameters["+ i +"].DemoValue"));
            customSystemParameter.setDescription(context.stringValue("DescribeApiHistoryResponse.CustomSystemParameters["+ i +"].Description"));

            customSystemParameters.add(customSystemParameter);
        }
        describeApiHistoryResponse.setCustomSystemParameters(customSystemParameters);

		List<ConstantParameter> constantParameters = new ArrayList<ConstantParameter>();
		for (int i = 0; i < context.lengthValue("DescribeApiHistoryResponse.ConstantParameters.Length"); i++) {
			ConstantParameter constantParameter = new ConstantParameter();
			constantParameter.setServiceParameterName(context.stringValue("DescribeApiHistoryResponse.ConstantParameters["+ i +"].ServiceParameterName"));
			constantParameter.setConstantValue(context.stringValue("DescribeApiHistoryResponse.ConstantParameters["+ i +"].ConstantValue"));
			constantParameter.setLocation(context.stringValue("DescribeApiHistoryResponse.ConstantParameters["+ i +"].Location"));
			constantParameter.setDescription(context.stringValue("DescribeApiHistoryResponse.ConstantParameters["+ i +"].Description"));

			constantParameters.add(constantParameter);
		}
		describeApiHistoryResponse.setConstantParameters(constantParameters);

		List<RequestParameter> requestParameters = new ArrayList<RequestParameter>();
		for (int i = 0; i < context.lengthValue("DescribeApiHistoryResponse.RequestParameters.Length"); i++) {
			RequestParameter requestParameter = new RequestParameter();
			requestParameter.setApiParameterName(context.stringValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].ApiParameterName"));
			requestParameter.setLocation(context.stringValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].Location"));
			requestParameter.setParameterType(context.stringValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].ParameterType"));
			requestParameter.setRequired(context.stringValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].Required"));
			requestParameter.setDefaultValue(context.stringValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].DefaultValue"));
			requestParameter.setDemoValue(context.stringValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].DemoValue"));
			requestParameter.setMaxValue(context.longValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].MaxValue"));
			requestParameter.setMinValue(context.longValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].MinValue"));
			requestParameter.setMaxLength(context.longValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].MaxLength"));
			requestParameter.setMinLength(context.longValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].MinLength"));
			requestParameter.setRegularExpression(context.stringValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].RegularExpression"));
			requestParameter.setJsonScheme(context.stringValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].JsonScheme"));
			requestParameter.setEnumValue(context.stringValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].EnumValue"));
			requestParameter.setDocShow(context.stringValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].DocShow"));
			requestParameter.setDocOrder(context.integerValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].DocOrder"));
			requestParameter.setDescription(context.stringValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].Description"));

			requestParameters.add(requestParameter);
		}
		describeApiHistoryResponse.setRequestParameters(requestParameters);

		List<ServiceParameter> serviceParameters = new ArrayList<ServiceParameter>();
		for (int i = 0; i < context.lengthValue("DescribeApiHistoryResponse.ServiceParameters.Length"); i++) {
			ServiceParameter serviceParameter = new ServiceParameter();
			serviceParameter.setServiceParameterName(context.stringValue("DescribeApiHistoryResponse.ServiceParameters["+ i +"].ServiceParameterName"));
			serviceParameter.setLocation(context.stringValue("DescribeApiHistoryResponse.ServiceParameters["+ i +"].Location"));
			serviceParameter.setParameterType(context.stringValue("DescribeApiHistoryResponse.ServiceParameters["+ i +"].ParameterType"));

			serviceParameters.add(serviceParameter);
		}
		describeApiHistoryResponse.setServiceParameters(serviceParameters);

		List<ServiceParameterMap> serviceParametersMap = new ArrayList<ServiceParameterMap>();
		for (int i = 0; i < context.lengthValue("DescribeApiHistoryResponse.ServiceParametersMap.Length"); i++) {
			ServiceParameterMap serviceParameterMap = new ServiceParameterMap();
			serviceParameterMap.setServiceParameterName(context.stringValue("DescribeApiHistoryResponse.ServiceParametersMap["+ i +"].ServiceParameterName"));
			serviceParameterMap.setRequestParameterName(context.stringValue("DescribeApiHistoryResponse.ServiceParametersMap["+ i +"].RequestParameterName"));

			serviceParametersMap.add(serviceParameterMap);
		}
		describeApiHistoryResponse.setServiceParametersMap(serviceParametersMap);
	 
		List<ErrorCodeSample> errorCodeSamples = new ArrayList<ErrorCodeSample>();
		for (int i = 0; i < context.lengthValue("DescribeApiHistoryResponse.ErrorCodeSamples.Length"); i++) {
			ErrorCodeSample errorCodeSample = new ErrorCodeSample();
			errorCodeSample.setCode(context.stringValue("DescribeApiHistoryResponse.ErrorCodeSamples["+ i +"].Code"));
			errorCodeSample.setMessage(context.stringValue("DescribeApiHistoryResponse.ErrorCodeSamples["+ i +"].Message"));
			errorCodeSample.setDescription(context.stringValue("DescribeApiHistoryResponse.ErrorCodeSamples["+ i +"].Description"));

			errorCodeSamples.add(errorCodeSample);
		}
		describeApiHistoryResponse.setErrorCodeSamples(errorCodeSamples);
		
	 	return describeApiHistoryResponse;
	}
}