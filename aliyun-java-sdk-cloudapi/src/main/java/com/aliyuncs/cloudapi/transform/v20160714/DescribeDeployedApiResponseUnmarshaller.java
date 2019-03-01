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

import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.*;
import com.aliyuncs.cloudapi.model.v20160714.DescribeDeployedApiResponse;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;


public class DescribeDeployedApiResponseUnmarshaller {

	public static DescribeDeployedApiResponse unmarshall(DescribeDeployedApiResponse describeDeployedApiResponse, UnmarshallerContext context) {
		
		describeDeployedApiResponse.setRequestId(context.stringValue("DescribeDeployedApiResponse.RequestId"));
		describeDeployedApiResponse.setRegionId(context.stringValue("DescribeDeployedApiResponse.RegionId"));
		describeDeployedApiResponse.setGroupId(context.stringValue("DescribeDeployedApiResponse.GroupId"));
		describeDeployedApiResponse.setGroupName(context.stringValue("DescribeDeployedApiResponse.GroupName"));
		describeDeployedApiResponse.setStageName(context.stringValue("DescribeDeployedApiResponse.StageName"));
		describeDeployedApiResponse.setApiId(context.stringValue("DescribeDeployedApiResponse.ApiId"));
		describeDeployedApiResponse.setApiName(context.stringValue("DescribeDeployedApiResponse.ApiName"));
		describeDeployedApiResponse.setDescription(context.stringValue("DescribeDeployedApiResponse.Description"));
		describeDeployedApiResponse.setVisibility(context.stringValue("DescribeDeployedApiResponse.Visibility"));
		describeDeployedApiResponse.setAuthType(context.stringValue("DescribeDeployedApiResponse.AuthType"));
		describeDeployedApiResponse.setDisableInternet(context.booleanValue("DescribeDeployedApiResponse.DisableInternet"));
		describeDeployedApiResponse.setForceNonceCheck(context.booleanValue("DescribeDeployedApiResponse.ForceNonceCheck"));

		describeDeployedApiResponse.setResultType(context.stringValue("DescribeDeployedApiResponse.ResultType"));
		describeDeployedApiResponse.setResultSample(context.stringValue("DescribeDeployedApiResponse.ResultSample"));
		describeDeployedApiResponse.setFailResultSample(context.stringValue("DescribeDeployedApiResponse.FailResultSample"));
		describeDeployedApiResponse.setDeployedTime(context.stringValue("DescribeDeployedApiResponse.DeployedTime"));
		describeDeployedApiResponse.setAllowSignatureMethod(context.stringValue("DescribeDeployedApiResponse.AllowSignatureMethod"));
		describeDeployedApiResponse.setResultBodyModel(context.stringValue("DescribeDeployedApiResponse.ResultBodyModel"));

		RequestConfig requestConfig = new RequestConfig();
		requestConfig.setRequestProtocol(context.stringValue("DescribeDeployedApiResponse.RequestConfig.RequestProtocol"));
		requestConfig.setRequestHttpMethod(context.stringValue("DescribeDeployedApiResponse.RequestConfig.RequestHttpMethod"));
		requestConfig.setRequestPath(context.stringValue("DescribeDeployedApiResponse.RequestConfig.RequestPath"));
		requestConfig.setBodyFormat(context.stringValue("DescribeDeployedApiResponse.RequestConfig.BodyFormat"));
		requestConfig.setPostBodyDescription(context.stringValue("DescribeDeployedApiResponse.RequestConfig.PostBodyDescription"));
		requestConfig.setRequestMode(context.stringValue("DescribeDeployedApiResponse.RequestConfig.RequestMode"));
		requestConfig.setBodyModel(context.stringValue("DescribeDeployedApiResponse.RequestConfig.BodyModel"));
		describeDeployedApiResponse.setRequestConfig(requestConfig);

		ServiceConfig serviceConfig = new ServiceConfig();
		serviceConfig.setServiceProtocol(context.stringValue("DescribeDeployedApiResponse.ServiceConfig.ServiceProtocol"));
		serviceConfig.setServiceAddress(context.stringValue("DescribeDeployedApiResponse.ServiceConfig.ServiceAddress"));
		serviceConfig.setServiceHttpMethod(context.stringValue("DescribeDeployedApiResponse.ServiceConfig.ServiceHttpMethod"));
		serviceConfig.setServicePath(context.stringValue("DescribeDeployedApiResponse.ServiceConfig.ServicePath"));
		serviceConfig.setServiceTimeout(context.integerValue("DescribeDeployedApiResponse.ServiceConfig.ServiceTimeout"));
		serviceConfig.setMock(context.stringValue("DescribeDeployedApiResponse.ServiceConfig.Mock"));
        serviceConfig.setMockResult(context.stringValue("DescribeDeployedApiResponse.ServiceConfig.MockResult"));
        serviceConfig.setServiceVpcEnable(context.booleanValue("DescribeDeployedApiResponse.ServiceConfig.ServiceVpcEnable"));
        VpcConfig vpcConfig = new VpcConfig();
        vpcConfig.setVpcId(context.stringValue("DescribeDeployedApiResponse.ServiceConfig.VpcConfig.VpcId"));
        vpcConfig.setInstanceId(context.stringValue("DescribeDeployedApiResponse.ServiceConfig.VpcConfig.InstanceId"));
        vpcConfig.setPort(context.integerValue("DescribeDeployedApiResponse.ServiceConfig.VpcConfig.Port"));
        serviceConfig.setVpcConfig(vpcConfig);
        FunctionComputeConfig functionComputeConfig = new FunctionComputeConfig();
        functionComputeConfig.setFcRegionId("DescribeDeployedApiResponse.ServiceConfig.FunctionComputeConfig.RegionId");
        functionComputeConfig.setFunctionName("DescribeDeployedApiResponse.ServiceConfig.FunctionComputeConfig.FunctionName");
        functionComputeConfig.setServiceName("DescribeDeployedApiResponse.ServiceConfig.FunctionComputeConfig.ServiceName");
        functionComputeConfig.setRoleArn("DescribeDeployedApiResponse.ServiceConfig.FunctionComputeConfig.RoleArn");
        serviceConfig.setFunctionComputeConfig(functionComputeConfig);

		serviceConfig.setMockStatusCode(context.integerValue("DescribeDeployedApiResponse.ServiceConfig.MockStatusCode"));

		List<MockHeader> mockHeaders=new ArrayList<MockHeader>();
		for(int i=0;i<context.lengthValue("DescribeDeployedApiResponse.ServiceConfig.MockHeaders.Length");i++){
			MockHeader mockHeader=new MockHeader();
			mockHeader.setHeaderName(context.stringValue("DescribeDeployedApiResponse.ServiceConfig.MockHeaders["+ i +"].HeaderName"));
			mockHeader.setHeaderValue(context.stringValue("DescribeDeployedApiResponse.ServiceConfig.MockHeaders["+ i +"].HeaderValue"));
			mockHeaders.add(mockHeader);
		}
		serviceConfig.setMockHeaders(mockHeaders);

		describeDeployedApiResponse.setServiceConfig(serviceConfig);
		
		OpenIdConnectConfig openIdConnectConfig = new OpenIdConnectConfig();
        openIdConnectConfig.setIdTokenParamName(context.stringValue("DescribeDeployedApiResponse.OpenIdConnectConfig.IdTokenParamName"));
        openIdConnectConfig.setOpenIdApiType(context.stringValue("DescribeDeployedApiResponse.OpenIdConnectConfig.OpenIdApiType"));
        openIdConnectConfig.setPublicKey(context.stringValue("DescribeDeployedApiResponse.OpenIdConnectConfig.PublicKey"));
        openIdConnectConfig.setPublicKeyId(context.stringValue("DescribeDeployedApiResponse.OpenIdConnectConfig.PublicKeyId"));
        describeDeployedApiResponse.setOpenIdConnectConfig(openIdConnectConfig);

		List<SystemParameter> systemParameters = new ArrayList<SystemParameter>();
		for (int i = 0; i < context.lengthValue("DescribeDeployedApiResponse.SystemParameters.Length"); i++) {
			SystemParameter systemParameter = new SystemParameter();
			systemParameter.setParameterName(context.stringValue("DescribeDeployedApiResponse.SystemParameters["+ i +"].ParameterName"));
			systemParameter.setServiceParameterName(context.stringValue("DescribeDeployedApiResponse.SystemParameters["+ i +"].ServiceParameterName"));
			systemParameter.setLocation(context.stringValue("DescribeDeployedApiResponse.SystemParameters["+ i +"].Location"));
			systemParameter.setDemoValue(context.stringValue("DescribeDeployedApiResponse.SystemParameters["+ i +"].DemoValue"));
			systemParameter.setDescription(context.stringValue("DescribeDeployedApiResponse.SystemParameters["+ i +"].Description"));

			systemParameters.add(systemParameter);
		}
		describeDeployedApiResponse.setSystemParameters(systemParameters);
		
		List<SystemParameter> customSystemParameters = new ArrayList<SystemParameter>();
        for (int i = 0; i < context.lengthValue("DescribeDeployedApiResponse.CustomSystemParameters.Length"); i++) {
            SystemParameter customSystemParameter = new SystemParameter();
            customSystemParameter.setParameterName(context.stringValue("DescribeDeployedApiResponse.CustomSystemParameters["+ i +"].ParameterName"));
            customSystemParameter.setServiceParameterName(context.stringValue("DescribeDeployedApiResponse.CustomSystemParameters["+ i +"].ServiceParameterName"));
            customSystemParameter.setLocation(context.stringValue("DescribeDeployedApiResponse.CustomSystemParameters["+ i +"].Location"));
            customSystemParameter.setDemoValue(context.stringValue("DescribeDeployedApiResponse.CustomSystemParameters["+ i +"].DemoValue"));
            customSystemParameter.setDescription(context.stringValue("DescribeDeployedApiResponse.CustomSystemParameters["+ i +"].Description"));

            customSystemParameters.add(customSystemParameter);
        }
        describeDeployedApiResponse.setCustomSystemParameters(customSystemParameters);

		List<ConstantParameter> constantParameters = new ArrayList<ConstantParameter>();
		for (int i = 0; i < context.lengthValue("DescribeDeployedApiResponse.ConstantParameters.Length"); i++) {
			ConstantParameter constantParameter = new ConstantParameter();
			constantParameter.setServiceParameterName(context.stringValue("DescribeDeployedApiResponse.ConstantParameters["+ i +"].ServiceParameterName"));
			constantParameter.setConstantValue(context.stringValue("DescribeDeployedApiResponse.ConstantParameters["+ i +"].ConstantValue"));
			constantParameter.setLocation(context.stringValue("DescribeDeployedApiResponse.ConstantParameters["+ i +"].Location"));
			constantParameter.setDescription(context.stringValue("DescribeDeployedApiResponse.ConstantParameters["+ i +"].Description"));

			constantParameters.add(constantParameter);
		}
		describeDeployedApiResponse.setConstantParameters(constantParameters);

		List<RequestParameter> requestParameters = new ArrayList<RequestParameter>();
		for (int i = 0; i < context.lengthValue("DescribeDeployedApiResponse.RequestParameters.Length"); i++) {
			RequestParameter requestParameter = new RequestParameter();
			requestParameter.setApiParameterName(context.stringValue("DescribeDeployedApiResponse.RequestParameters["+ i +"].ApiParameterName"));
			requestParameter.setLocation(context.stringValue("DescribeDeployedApiResponse.RequestParameters["+ i +"].Location"));
			requestParameter.setParameterType(context.stringValue("DescribeDeployedApiResponse.RequestParameters["+ i +"].ParameterType"));
			requestParameter.setRequired(context.stringValue("DescribeDeployedApiResponse.RequestParameters["+ i +"].Required"));
			requestParameter.setDefaultValue(context.stringValue("DescribeDeployedApiResponse.RequestParameters["+ i +"].DefaultValue"));
			requestParameter.setDemoValue(context.stringValue("DescribeDeployedApiResponse.RequestParameters["+ i +"].DemoValue"));
			requestParameter.setMaxValue(context.longValue("DescribeDeployedApiResponse.RequestParameters["+ i +"].MaxValue"));
			requestParameter.setMinValue(context.longValue("DescribeDeployedApiResponse.RequestParameters["+ i +"].MinValue"));
			requestParameter.setMaxLength(context.longValue("DescribeDeployedApiResponse.RequestParameters["+ i +"].MaxLength"));
			requestParameter.setMinLength(context.longValue("DescribeDeployedApiResponse.RequestParameters["+ i +"].MinLength"));
			requestParameter.setRegularExpression(context.stringValue("DescribeDeployedApiResponse.RequestParameters["+ i +"].RegularExpression"));
			requestParameter.setJsonScheme(context.stringValue("DescribeDeployedApiResponse.RequestParameters["+ i +"].JsonScheme"));
			requestParameter.setEnumValue(context.stringValue("DescribeDeployedApiResponse.RequestParameters["+ i +"].EnumValue"));
			requestParameter.setDocShow(context.stringValue("DescribeDeployedApiResponse.RequestParameters["+ i +"].DocShow"));
			requestParameter.setDocOrder(context.integerValue("DescribeDeployedApiResponse.RequestParameters["+ i +"].DocOrder"));
			requestParameter.setDescription(context.stringValue("DescribeDeployedApiResponse.RequestParameters["+ i +"].Description"));

			requestParameters.add(requestParameter);
		}
		describeDeployedApiResponse.setRequestParameters(requestParameters);

		List<ServiceParameter> serviceParameters = new ArrayList<ServiceParameter>();
		for (int i = 0; i < context.lengthValue("DescribeDeployedApiResponse.ServiceParameters.Length"); i++) {
			ServiceParameter serviceParameter = new ServiceParameter();
			serviceParameter.setServiceParameterName(context.stringValue("DescribeDeployedApiResponse.ServiceParameters["+ i +"].ServiceParameterName"));
			serviceParameter.setLocation(context.stringValue("DescribeDeployedApiResponse.ServiceParameters["+ i +"].Location"));
			serviceParameter.setParameterType(context.stringValue("DescribeDeployedApiResponse.ServiceParameters["+ i +"].ParameterType"));

			serviceParameters.add(serviceParameter);
		}
		describeDeployedApiResponse.setServiceParameters(serviceParameters);

		List<ServiceParameterMap> serviceParametersMap = new ArrayList<ServiceParameterMap>();
		for (int i = 0; i < context.lengthValue("DescribeDeployedApiResponse.ServiceParametersMap.Length"); i++) {
			ServiceParameterMap serviceParameterMap = new ServiceParameterMap();
			serviceParameterMap.setServiceParameterName(context.stringValue("DescribeDeployedApiResponse.ServiceParametersMap["+ i +"].ServiceParameterName"));
			serviceParameterMap.setRequestParameterName(context.stringValue("DescribeDeployedApiResponse.ServiceParametersMap["+ i +"].RequestParameterName"));

			serviceParametersMap.add(serviceParameterMap);
		}
		describeDeployedApiResponse.setServiceParametersMap(serviceParametersMap);
	 
		List<ErrorCodeSample> errorCodeSamples = new ArrayList<ErrorCodeSample>();
		for (int i = 0; i < context.lengthValue("DescribeDeployedApiResponse.ErrorCodeSamples.Length"); i++) {
			ErrorCodeSample errorCodeSample = new ErrorCodeSample();
			errorCodeSample.setCode(context.stringValue("DescribeDeployedApiResponse.ErrorCodeSamples["+ i +"].Code"));
			errorCodeSample.setMessage(context.stringValue("DescribeDeployedApiResponse.ErrorCodeSamples["+ i +"].Message"));
			errorCodeSample.setDescription(context.stringValue("DescribeDeployedApiResponse.ErrorCodeSamples["+ i +"].Description"));

			errorCodeSamples.add(errorCodeSample);
		}
		describeDeployedApiResponse.setErrorCodeSamples(errorCodeSamples);
		
	 	return describeDeployedApiResponse;
	}
}