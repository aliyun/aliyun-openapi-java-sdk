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

import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.*;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;


public class DescribeApiResponseUnmarshaller {

	public static DescribeApiResponse unmarshall(DescribeApiResponse describeApiResponse, UnmarshallerContext context) {
		
		describeApiResponse.setRequestId(context.stringValue("DescribeApiResponse.RequestId"));
		describeApiResponse.setRegionId(context.stringValue("DescribeApiResponse.RegionId"));
		describeApiResponse.setApiId(context.stringValue("DescribeApiResponse.ApiId"));
		describeApiResponse.setApiName(context.stringValue("DescribeApiResponse.ApiName"));
		describeApiResponse.setGroupId(context.stringValue("DescribeApiResponse.GroupId"));
		describeApiResponse.setGroupName(context.stringValue("DescribeApiResponse.GroupName"));
		describeApiResponse.setVisibility(context.stringValue("DescribeApiResponse.Visibility"));
		describeApiResponse.setAuthType(context.stringValue("DescribeApiResponse.AuthType"));
		describeApiResponse.setForceNonceCheck(context.booleanValue("DescribeApiResponse.ForceNonceCheck"));
		describeApiResponse.setDisableInternet(context.booleanValue("DescribeApiResponse.DisableInternet"));

		describeApiResponse.setResultType(context.stringValue("DescribeApiResponse.ResultType"));
		describeApiResponse.setResultSample(context.stringValue("DescribeApiResponse.ResultSample"));
		describeApiResponse.setFailResultSample(context.stringValue("DescribeApiResponse.FailResultSample"));
		describeApiResponse.setCreatedTime(context.stringValue("DescribeApiResponse.CreatedTime"));
		describeApiResponse.setModifiedTime(context.stringValue("DescribeApiResponse.ModifiedTime"));
		describeApiResponse.setDescription(context.stringValue("DescribeApiResponse.Description"));
		describeApiResponse.setAllowSignatureMethod(context.stringValue("DescribeApiResponse.AllowSignatureMethod"));
		describeApiResponse.setResultBodyModel(context.stringValue("DescribeApiResponse.ResultBodyModel"));
		describeApiResponse.setWebSocketApiType(context.stringValue("DescribeApiResponse.WebSocketApiType"));

		RequestConfig requestConfig = new RequestConfig();
		requestConfig.setRequestProtocol(context.stringValue("DescribeApiResponse.RequestConfig.RequestProtocol"));
		requestConfig.setRequestHttpMethod(context.stringValue("DescribeApiResponse.RequestConfig.RequestHttpMethod"));
		requestConfig.setRequestPath(context.stringValue("DescribeApiResponse.RequestConfig.RequestPath"));
		requestConfig.setBodyFormat(context.stringValue("DescribeApiResponse.RequestConfig.BodyFormat"));
		requestConfig.setPostBodyDescription(context.stringValue("DescribeApiResponse.RequestConfig.PostBodyDescription"));
		requestConfig.setRequestMode(context.stringValue("DescribeApiResponse.RequestConfig.RequestMode"));
		requestConfig.setBodyModel(context.stringValue("DescribeApiResponse.RequestConfig.BodyModel"));
		describeApiResponse.setRequestConfig(requestConfig);

		ServiceConfig serviceConfig = new ServiceConfig();
		serviceConfig.setServiceProtocol(context.stringValue("DescribeApiResponse.ServiceConfig.ServiceProtocol"));
		serviceConfig.setServiceAddress(context.stringValue("DescribeApiResponse.ServiceConfig.ServiceAddress"));
		serviceConfig.setServiceHttpMethod(context.stringValue("DescribeApiResponse.ServiceConfig.ServiceHttpMethod"));
		serviceConfig.setServicePath(context.stringValue("DescribeApiResponse.ServiceConfig.ServicePath"));
		serviceConfig.setServiceTimeout(context.integerValue("DescribeApiResponse.ServiceConfig.ServiceTimeout"));
		serviceConfig.setMock(context.stringValue("DescribeApiResponse.ServiceConfig.Mock"));
		serviceConfig.setMockResult(context.stringValue("DescribeApiResponse.ServiceConfig.MockResult"));

		serviceConfig.setServiceVpcEnable(context.booleanValue("DescribeApiResponse.ServiceConfig.ServiceVpcEnable"));
		VpcConfig vpcConfig = new VpcConfig();
		vpcConfig.setVpcId(context.stringValue("DescribeApiResponse.ServiceConfig.VpcConfig.VpcId"));
		vpcConfig.setInstanceId(context.stringValue("DescribeApiResponse.ServiceConfig.VpcConfig.InstanceId"));
		vpcConfig.setPort(context.integerValue("DescribeApiResponse.ServiceConfig.VpcConfig.Port"));
		vpcConfig.setName(context.stringValue("DescribeApiResponse.ServiceConfig.VpcConfig.Name"));
		serviceConfig.setVpcConfig(vpcConfig);
		serviceConfig.setContentTypeCatagory(context.stringValue("DescribeApiResponse.ServiceConfig.ContentTypeCatagory"));
		serviceConfig.setContentTypeValue(context.stringValue("DescribeApiResponse.ServiceConfig.ContentTypeValue"));
		serviceConfig.setMockStatusCode(context.integerValue("DescribeApiResponse.ServiceConfig.MockStatusCode"));

		FunctionComputeConfig functionComputeConfig = new FunctionComputeConfig();
		functionComputeConfig.setFcRegionId("DescribeApiResponse.ServiceConfig.FunctionComputeConfig.RegionId");
		functionComputeConfig.setFunctionName("DescribeApiResponse.ServiceConfig.FunctionComputeConfig.FunctionName");
		functionComputeConfig.setServiceName("DescribeApiResponse.ServiceConfig.FunctionComputeConfig.ServiceName");
		functionComputeConfig.setRoleArn("DescribeApiResponse.ServiceConfig.FunctionComputeConfig.RoleArn");
		serviceConfig.setFunctionComputeConfig(functionComputeConfig);

		List<MockHeader> mockHeaders=new ArrayList<MockHeader>();
		for(int i=0;i<context.lengthValue("DescribeApiResponse.ServiceConfig.MockHeaders.Length");i++){
			MockHeader mockHeader=new MockHeader();
			mockHeader.setHeaderName(context.stringValue("DescribeApiResponse.ServiceConfig.MockHeaders["+ i +"]"
				+ ".HeaderName"));
			mockHeader.setHeaderValue(context.stringValue("DescribeApiResponse.ServiceConfig.MockHeaders["+ i +"]"
				+ ".HeaderValue"));
			mockHeaders.add(mockHeader);
		}
		serviceConfig.setMockHeaders(mockHeaders);

		describeApiResponse.setServiceConfig(serviceConfig);
		
		OpenIdConnectConfig openIdConnectConfig = new OpenIdConnectConfig();
		openIdConnectConfig.setIdTokenParamName(context.stringValue("DescribeApiResponse.OpenIdConnectConfig.IdTokenParamName"));
		openIdConnectConfig.setOpenIdApiType(context.stringValue("DescribeApiResponse.OpenIdConnectConfig.OpenIdApiType"));
		openIdConnectConfig.setPublicKey(context.stringValue("DescribeApiResponse.OpenIdConnectConfig.PublicKey"));
		openIdConnectConfig.setPublicKeyId(context.stringValue("DescribeApiResponse.OpenIdConnectConfig.PublicKeyId"));
		describeApiResponse.setOpenIdConnectConfig(openIdConnectConfig);

		List<SystemParameter> systemParameters = new ArrayList<SystemParameter>();
		for (int i = 0; i < context.lengthValue("DescribeApiResponse.SystemParameters.Length"); i++) {
			SystemParameter systemParameter = new SystemParameter();
			systemParameter.setParameterName(context.stringValue("DescribeApiResponse.SystemParameters["+ i +"].ParameterName"));
			systemParameter.setServiceParameterName(context.stringValue("DescribeApiResponse.SystemParameters["+ i +"].ServiceParameterName"));
			systemParameter.setLocation(context.stringValue("DescribeApiResponse.SystemParameters["+ i +"].Location"));
			systemParameter.setDemoValue(context.stringValue("DescribeApiResponse.SystemParameters["+ i +"].DemoValue"));
			systemParameter.setDescription(context.stringValue("DescribeApiResponse.SystemParameters["+ i +"].Description"));

			systemParameters.add(systemParameter);
		}
		describeApiResponse.setSystemParameters(systemParameters);
		
		List<SystemParameter> customSystemParameters = new ArrayList<SystemParameter>();
        for (int i = 0; i < context.lengthValue("DescribeApiResponse.CustomSystemParameters.Length"); i++) {
            SystemParameter customSystemParameter = new SystemParameter();
            customSystemParameter.setParameterName(context.stringValue("DescribeApiResponse.CustomSystemParameters["+ i +"].ParameterName"));
            customSystemParameter.setServiceParameterName(context.stringValue("DescribeApiResponse.CustomSystemParameters["+ i +"].ServiceParameterName"));
            customSystemParameter.setLocation(context.stringValue("DescribeApiResponse.CustomSystemParameters["+ i +"].Location"));
            customSystemParameter.setDemoValue(context.stringValue("DescribeApiResponse.CustomSystemParameters["+ i +"].DemoValue"));
            customSystemParameter.setDescription(context.stringValue("DescribeApiResponse.CustomSystemParameters["+ i +"].Description"));

            customSystemParameters.add(customSystemParameter);
        }
        describeApiResponse.setCustomSystemParameters(customSystemParameters);

		List<ConstantParameter> constantParameters = new ArrayList<ConstantParameter>();
		for (int i = 0; i < context.lengthValue("DescribeApiResponse.ConstantParameters.Length"); i++) {
			ConstantParameter constantParameter = new ConstantParameter();
			constantParameter.setServiceParameterName(context.stringValue("DescribeApiResponse.ConstantParameters["+ i +"].ServiceParameterName"));
			constantParameter.setConstantValue(context.stringValue("DescribeApiResponse.ConstantParameters["+ i +"].ConstantValue"));
			constantParameter.setLocation(context.stringValue("DescribeApiResponse.ConstantParameters["+ i +"].Location"));
			constantParameter.setDescription(context.stringValue("DescribeApiResponse.ConstantParameters["+ i +"].Description"));

			constantParameters.add(constantParameter);
		}
		describeApiResponse.setConstantParameters(constantParameters);

		List<RequestParameter> requestParameters = new ArrayList<RequestParameter>();
		for (int i = 0; i < context.lengthValue("DescribeApiResponse.RequestParameters.Length"); i++) {
			RequestParameter requestParameter = new RequestParameter();
			requestParameter.setApiParameterName(context.stringValue("DescribeApiResponse.RequestParameters["+ i +"].ApiParameterName"));
			requestParameter.setLocation(context.stringValue("DescribeApiResponse.RequestParameters["+ i +"].Location"));
			requestParameter.setParameterType(context.stringValue("DescribeApiResponse.RequestParameters["+ i +"].ParameterType"));
			requestParameter.setRequired(context.stringValue("DescribeApiResponse.RequestParameters["+ i +"].Required"));
			requestParameter.setDefaultValue(context.stringValue("DescribeApiResponse.RequestParameters["+ i +"].DefaultValue"));
			requestParameter.setDemoValue(context.stringValue("DescribeApiResponse.RequestParameters["+ i +"].DemoValue"));
			requestParameter.setMaxValue(context.longValue("DescribeApiResponse.RequestParameters["+ i +"].MaxValue"));
			requestParameter.setMinValue(context.longValue("DescribeApiResponse.RequestParameters["+ i +"].MinValue"));
			requestParameter.setMaxLength(context.longValue("DescribeApiResponse.RequestParameters["+ i +"].MaxLength"));
			requestParameter.setMinLength(context.longValue("DescribeApiResponse.RequestParameters["+ i +"].MinLength"));
			requestParameter.setRegularExpression(context.stringValue("DescribeApiResponse.RequestParameters["+ i +"].RegularExpression"));
			requestParameter.setJsonScheme(context.stringValue("DescribeApiResponse.RequestParameters["+ i +"].JsonScheme"));
			requestParameter.setEnumValue(context.stringValue("DescribeApiResponse.RequestParameters["+ i +"].EnumValue"));
			requestParameter.setDocShow(context.stringValue("DescribeApiResponse.RequestParameters["+ i +"].DocShow"));
			requestParameter.setDocOrder(context.integerValue("DescribeApiResponse.RequestParameters["+ i +"].DocOrder"));
			requestParameter.setDescription(context.stringValue("DescribeApiResponse.RequestParameters["+ i +"].Description"));

			requestParameters.add(requestParameter);
		}
		describeApiResponse.setRequestParameters(requestParameters);

		List<ServiceParameter> serviceParameters = new ArrayList<ServiceParameter>();
		for (int i = 0; i < context.lengthValue("DescribeApiResponse.ServiceParameters.Length"); i++) {
			ServiceParameter serviceParameter = new ServiceParameter();
			serviceParameter.setServiceParameterName(context.stringValue("DescribeApiResponse.ServiceParameters["+ i +"].ServiceParameterName"));
			serviceParameter.setLocation(context.stringValue("DescribeApiResponse.ServiceParameters["+ i +"].Location"));
			serviceParameter.setParameterType(context.stringValue("DescribeApiResponse.ServiceParameters["+ i +"].ParameterType"));

			serviceParameters.add(serviceParameter);
		}
		describeApiResponse.setServiceParameters(serviceParameters);

		List<ServiceParameterMap> serviceParametersMap = new ArrayList<ServiceParameterMap>();
		for (int i = 0; i < context.lengthValue("DescribeApiResponse.ServiceParametersMap.Length"); i++) {
			ServiceParameterMap serviceParameterMap = new ServiceParameterMap();
			serviceParameterMap.setServiceParameterName(context.stringValue("DescribeApiResponse.ServiceParametersMap["+ i +"].ServiceParameterName"));
			serviceParameterMap.setRequestParameterName(context.stringValue("DescribeApiResponse.ServiceParametersMap["+ i +"].RequestParameterName"));

			serviceParametersMap.add(serviceParameterMap);
		}
		describeApiResponse.setServiceParametersMap(serviceParametersMap);

		List<DeployedInfo> deployedInfos = new ArrayList<DeployedInfo>();
		for (int i = 0; i < context.lengthValue("DescribeApiResponse.DeployedInfos.Length"); i++) {
			DeployedInfo deployedInfo = new DeployedInfo();
			deployedInfo.setStageName(context.stringValue("DescribeApiResponse.DeployedInfos["+ i +"].StageName"));
			deployedInfo.setEffectiveVersion(context.stringValue("DescribeApiResponse.DeployedInfos["+ i +"].EffectiveVersion"));
			deployedInfo.setDeployedStatus(context.stringValue("DescribeApiResponse.DeployedInfos["+ i +"].DeployedStatus"));

			deployedInfos.add(deployedInfo);
		}
		describeApiResponse.setDeployedInfos(deployedInfos);
		
		List<ErrorCodeSample> errorCodeSamples = new ArrayList<ErrorCodeSample>();
		for (int i = 0; i < context.lengthValue("DescribeApiResponse.ErrorCodeSamples.Length"); i++) {
			ErrorCodeSample errorCodeSample = new ErrorCodeSample();
			errorCodeSample.setCode(context.stringValue("DescribeApiResponse.ErrorCodeSamples["+ i +"].Code"));
			errorCodeSample.setMessage(context.stringValue("DescribeApiResponse.ErrorCodeSamples["+ i +"].Message"));
			errorCodeSample.setDescription(context.stringValue("DescribeApiResponse.ErrorCodeSamples["+ i +"].Description"));
			errorCodeSample.setModel(context.stringValue("DescribeApiResponse.ErrorCodeSamples["+ i +"].Model"));

			errorCodeSamples.add(errorCodeSample);
		}
		describeApiResponse.setErrorCodeSamples(errorCodeSamples);
	 
	 	return describeApiResponse;
	}
}