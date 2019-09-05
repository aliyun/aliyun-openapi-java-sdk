/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cloudapi.transform.v20160714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.DescribeDeployedApiResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeDeployedApiResponse.ConstantParameter;
import com.aliyuncs.cloudapi.model.v20160714.DescribeDeployedApiResponse.CustomSystemParameter;
import com.aliyuncs.cloudapi.model.v20160714.DescribeDeployedApiResponse.ErrorCodeSample;
import com.aliyuncs.cloudapi.model.v20160714.DescribeDeployedApiResponse.OpenIdConnectConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeDeployedApiResponse.RequestConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeDeployedApiResponse.RequestParameter;
import com.aliyuncs.cloudapi.model.v20160714.DescribeDeployedApiResponse.ResultDescription;
import com.aliyuncs.cloudapi.model.v20160714.DescribeDeployedApiResponse.ServiceConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeDeployedApiResponse.ServiceConfig.FunctionComputeConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeDeployedApiResponse.ServiceConfig.MockHeader;
import com.aliyuncs.cloudapi.model.v20160714.DescribeDeployedApiResponse.ServiceConfig.VpcConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeDeployedApiResponse.ServiceParameter;
import com.aliyuncs.cloudapi.model.v20160714.DescribeDeployedApiResponse.ServiceParameterMap;
import com.aliyuncs.cloudapi.model.v20160714.DescribeDeployedApiResponse.SystemParameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDeployedApiResponseUnmarshaller {

	public static DescribeDeployedApiResponse unmarshall(DescribeDeployedApiResponse describeDeployedApiResponse, UnmarshallerContext _ctx) {
		
		describeDeployedApiResponse.setRequestId(_ctx.stringValue("DescribeDeployedApiResponse.RequestId"));
		describeDeployedApiResponse.setRegionId(_ctx.stringValue("DescribeDeployedApiResponse.RegionId"));
		describeDeployedApiResponse.setGroupId(_ctx.stringValue("DescribeDeployedApiResponse.GroupId"));
		describeDeployedApiResponse.setGroupName(_ctx.stringValue("DescribeDeployedApiResponse.GroupName"));
		describeDeployedApiResponse.setStageName(_ctx.stringValue("DescribeDeployedApiResponse.StageName"));
		describeDeployedApiResponse.setApiId(_ctx.stringValue("DescribeDeployedApiResponse.ApiId"));
		describeDeployedApiResponse.setApiName(_ctx.stringValue("DescribeDeployedApiResponse.ApiName"));
		describeDeployedApiResponse.setDescription(_ctx.stringValue("DescribeDeployedApiResponse.Description"));
		describeDeployedApiResponse.setVisibility(_ctx.stringValue("DescribeDeployedApiResponse.Visibility"));
		describeDeployedApiResponse.setAuthType(_ctx.stringValue("DescribeDeployedApiResponse.AuthType"));
		describeDeployedApiResponse.setResultType(_ctx.stringValue("DescribeDeployedApiResponse.ResultType"));
		describeDeployedApiResponse.setResultSample(_ctx.stringValue("DescribeDeployedApiResponse.ResultSample"));
		describeDeployedApiResponse.setFailResultSample(_ctx.stringValue("DescribeDeployedApiResponse.FailResultSample"));
		describeDeployedApiResponse.setDeployedTime(_ctx.stringValue("DescribeDeployedApiResponse.DeployedTime"));
		describeDeployedApiResponse.setAllowSignatureMethod(_ctx.stringValue("DescribeDeployedApiResponse.AllowSignatureMethod"));
		describeDeployedApiResponse.setResultBodyModel(_ctx.stringValue("DescribeDeployedApiResponse.ResultBodyModel"));
		describeDeployedApiResponse.setForceNonceCheck(_ctx.booleanValue("DescribeDeployedApiResponse.ForceNonceCheck"));
		describeDeployedApiResponse.setDisableInternet(_ctx.booleanValue("DescribeDeployedApiResponse.DisableInternet"));

		RequestConfig requestConfig = new RequestConfig();
		requestConfig.setRequestProtocol(_ctx.stringValue("DescribeDeployedApiResponse.RequestConfig.RequestProtocol"));
		requestConfig.setRequestHttpMethod(_ctx.stringValue("DescribeDeployedApiResponse.RequestConfig.RequestHttpMethod"));
		requestConfig.setRequestPath(_ctx.stringValue("DescribeDeployedApiResponse.RequestConfig.RequestPath"));
		requestConfig.setBodyFormat(_ctx.stringValue("DescribeDeployedApiResponse.RequestConfig.BodyFormat"));
		requestConfig.setPostBodyDescription(_ctx.stringValue("DescribeDeployedApiResponse.RequestConfig.PostBodyDescription"));
		requestConfig.setRequestMode(_ctx.stringValue("DescribeDeployedApiResponse.RequestConfig.RequestMode"));
		requestConfig.setBodyModel(_ctx.stringValue("DescribeDeployedApiResponse.RequestConfig.BodyModel"));
		describeDeployedApiResponse.setRequestConfig(requestConfig);

		ServiceConfig serviceConfig = new ServiceConfig();
		serviceConfig.setServiceProtocol(_ctx.stringValue("DescribeDeployedApiResponse.ServiceConfig.ServiceProtocol"));
		serviceConfig.setServiceAddress(_ctx.stringValue("DescribeDeployedApiResponse.ServiceConfig.ServiceAddress"));
		serviceConfig.setServiceHttpMethod(_ctx.stringValue("DescribeDeployedApiResponse.ServiceConfig.ServiceHttpMethod"));
		serviceConfig.setServicePath(_ctx.stringValue("DescribeDeployedApiResponse.ServiceConfig.ServicePath"));
		serviceConfig.setServiceTimeout(_ctx.integerValue("DescribeDeployedApiResponse.ServiceConfig.ServiceTimeout"));
		serviceConfig.setMock(_ctx.stringValue("DescribeDeployedApiResponse.ServiceConfig.Mock"));
		serviceConfig.setMockResult(_ctx.stringValue("DescribeDeployedApiResponse.ServiceConfig.MockResult"));
		serviceConfig.setServiceVpcEnable(_ctx.stringValue("DescribeDeployedApiResponse.ServiceConfig.ServiceVpcEnable"));
		serviceConfig.setMockStatusCode(_ctx.integerValue("DescribeDeployedApiResponse.ServiceConfig.MockStatusCode"));

		VpcConfig vpcConfig = new VpcConfig();
		vpcConfig.setName(_ctx.stringValue("DescribeDeployedApiResponse.ServiceConfig.VpcConfig.Name"));
		vpcConfig.setVpcId(_ctx.stringValue("DescribeDeployedApiResponse.ServiceConfig.VpcConfig.VpcId"));
		vpcConfig.setInstanceId(_ctx.stringValue("DescribeDeployedApiResponse.ServiceConfig.VpcConfig.InstanceId"));
		vpcConfig.setPort(_ctx.integerValue("DescribeDeployedApiResponse.ServiceConfig.VpcConfig.Port"));
		serviceConfig.setVpcConfig(vpcConfig);

		FunctionComputeConfig functionComputeConfig = new FunctionComputeConfig();
		functionComputeConfig.setRegionId(_ctx.stringValue("DescribeDeployedApiResponse.ServiceConfig.FunctionComputeConfig.RegionId"));
		functionComputeConfig.setServiceName(_ctx.stringValue("DescribeDeployedApiResponse.ServiceConfig.FunctionComputeConfig.ServiceName"));
		functionComputeConfig.setFunctionName(_ctx.stringValue("DescribeDeployedApiResponse.ServiceConfig.FunctionComputeConfig.FunctionName"));
		functionComputeConfig.setRoleArn(_ctx.stringValue("DescribeDeployedApiResponse.ServiceConfig.FunctionComputeConfig.RoleArn"));
		serviceConfig.setFunctionComputeConfig(functionComputeConfig);

		List<MockHeader> mockHeaders = new ArrayList<MockHeader>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDeployedApiResponse.ServiceConfig.MockHeaders.Length"); i++) {
			MockHeader mockHeader = new MockHeader();
			mockHeader.setHeaderName(_ctx.stringValue("DescribeDeployedApiResponse.ServiceConfig.MockHeaders["+ i +"].HeaderName"));
			mockHeader.setHeaderValue(_ctx.stringValue("DescribeDeployedApiResponse.ServiceConfig.MockHeaders["+ i +"].HeaderValue"));

			mockHeaders.add(mockHeader);
		}
		serviceConfig.setMockHeaders(mockHeaders);
		describeDeployedApiResponse.setServiceConfig(serviceConfig);

		OpenIdConnectConfig openIdConnectConfig = new OpenIdConnectConfig();
		openIdConnectConfig.setOpenIdApiType(_ctx.stringValue("DescribeDeployedApiResponse.OpenIdConnectConfig.OpenIdApiType"));
		openIdConnectConfig.setIdTokenParamName(_ctx.stringValue("DescribeDeployedApiResponse.OpenIdConnectConfig.IdTokenParamName"));
		openIdConnectConfig.setPublicKeyId(_ctx.stringValue("DescribeDeployedApiResponse.OpenIdConnectConfig.PublicKeyId"));
		openIdConnectConfig.setPublicKey(_ctx.stringValue("DescribeDeployedApiResponse.OpenIdConnectConfig.PublicKey"));
		describeDeployedApiResponse.setOpenIdConnectConfig(openIdConnectConfig);

		List<ErrorCodeSample> errorCodeSamples = new ArrayList<ErrorCodeSample>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDeployedApiResponse.ErrorCodeSamples.Length"); i++) {
			ErrorCodeSample errorCodeSample = new ErrorCodeSample();
			errorCodeSample.setCode(_ctx.stringValue("DescribeDeployedApiResponse.ErrorCodeSamples["+ i +"].Code"));
			errorCodeSample.setMessage(_ctx.stringValue("DescribeDeployedApiResponse.ErrorCodeSamples["+ i +"].Message"));
			errorCodeSample.setDescription(_ctx.stringValue("DescribeDeployedApiResponse.ErrorCodeSamples["+ i +"].Description"));

			errorCodeSamples.add(errorCodeSample);
		}
		describeDeployedApiResponse.setErrorCodeSamples(errorCodeSamples);

		List<ResultDescription> resultDescriptions = new ArrayList<ResultDescription>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDeployedApiResponse.ResultDescriptions.Length"); i++) {
			ResultDescription resultDescription = new ResultDescription();
			resultDescription.setId(_ctx.stringValue("DescribeDeployedApiResponse.ResultDescriptions["+ i +"].Id"));
			resultDescription.setPid(_ctx.stringValue("DescribeDeployedApiResponse.ResultDescriptions["+ i +"].Pid"));
			resultDescription.setHasChild(_ctx.booleanValue("DescribeDeployedApiResponse.ResultDescriptions["+ i +"].HasChild"));
			resultDescription.setKey(_ctx.stringValue("DescribeDeployedApiResponse.ResultDescriptions["+ i +"].Key"));
			resultDescription.setName(_ctx.stringValue("DescribeDeployedApiResponse.ResultDescriptions["+ i +"].Name"));
			resultDescription.setMandatory(_ctx.booleanValue("DescribeDeployedApiResponse.ResultDescriptions["+ i +"].Mandatory"));
			resultDescription.setType(_ctx.stringValue("DescribeDeployedApiResponse.ResultDescriptions["+ i +"].Type"));
			resultDescription.setDescription(_ctx.stringValue("DescribeDeployedApiResponse.ResultDescriptions["+ i +"].Description"));

			resultDescriptions.add(resultDescription);
		}
		describeDeployedApiResponse.setResultDescriptions(resultDescriptions);

		List<SystemParameter> systemParameters = new ArrayList<SystemParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDeployedApiResponse.SystemParameters.Length"); i++) {
			SystemParameter systemParameter = new SystemParameter();
			systemParameter.setParameterName(_ctx.stringValue("DescribeDeployedApiResponse.SystemParameters["+ i +"].ParameterName"));
			systemParameter.setServiceParameterName(_ctx.stringValue("DescribeDeployedApiResponse.SystemParameters["+ i +"].ServiceParameterName"));
			systemParameter.setLocation(_ctx.stringValue("DescribeDeployedApiResponse.SystemParameters["+ i +"].Location"));
			systemParameter.setDemoValue(_ctx.stringValue("DescribeDeployedApiResponse.SystemParameters["+ i +"].DemoValue"));
			systemParameter.setDescription(_ctx.stringValue("DescribeDeployedApiResponse.SystemParameters["+ i +"].Description"));

			systemParameters.add(systemParameter);
		}
		describeDeployedApiResponse.setSystemParameters(systemParameters);

		List<CustomSystemParameter> customSystemParameters = new ArrayList<CustomSystemParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDeployedApiResponse.CustomSystemParameters.Length"); i++) {
			CustomSystemParameter customSystemParameter = new CustomSystemParameter();
			customSystemParameter.setParameterName(_ctx.stringValue("DescribeDeployedApiResponse.CustomSystemParameters["+ i +"].ParameterName"));
			customSystemParameter.setServiceParameterName(_ctx.stringValue("DescribeDeployedApiResponse.CustomSystemParameters["+ i +"].ServiceParameterName"));
			customSystemParameter.setLocation(_ctx.stringValue("DescribeDeployedApiResponse.CustomSystemParameters["+ i +"].Location"));
			customSystemParameter.setDemoValue(_ctx.stringValue("DescribeDeployedApiResponse.CustomSystemParameters["+ i +"].DemoValue"));
			customSystemParameter.setDescription(_ctx.stringValue("DescribeDeployedApiResponse.CustomSystemParameters["+ i +"].Description"));

			customSystemParameters.add(customSystemParameter);
		}
		describeDeployedApiResponse.setCustomSystemParameters(customSystemParameters);

		List<ConstantParameter> constantParameters = new ArrayList<ConstantParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDeployedApiResponse.ConstantParameters.Length"); i++) {
			ConstantParameter constantParameter = new ConstantParameter();
			constantParameter.setServiceParameterName(_ctx.stringValue("DescribeDeployedApiResponse.ConstantParameters["+ i +"].ServiceParameterName"));
			constantParameter.setConstantValue(_ctx.stringValue("DescribeDeployedApiResponse.ConstantParameters["+ i +"].ConstantValue"));
			constantParameter.setLocation(_ctx.stringValue("DescribeDeployedApiResponse.ConstantParameters["+ i +"].Location"));
			constantParameter.setDescription(_ctx.stringValue("DescribeDeployedApiResponse.ConstantParameters["+ i +"].Description"));

			constantParameters.add(constantParameter);
		}
		describeDeployedApiResponse.setConstantParameters(constantParameters);

		List<RequestParameter> requestParameters = new ArrayList<RequestParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDeployedApiResponse.RequestParameters.Length"); i++) {
			RequestParameter requestParameter = new RequestParameter();
			requestParameter.setApiParameterName(_ctx.stringValue("DescribeDeployedApiResponse.RequestParameters["+ i +"].ApiParameterName"));
			requestParameter.setLocation(_ctx.stringValue("DescribeDeployedApiResponse.RequestParameters["+ i +"].Location"));
			requestParameter.setParameterType(_ctx.stringValue("DescribeDeployedApiResponse.RequestParameters["+ i +"].ParameterType"));
			requestParameter.setRequired(_ctx.stringValue("DescribeDeployedApiResponse.RequestParameters["+ i +"].Required"));
			requestParameter.setDefaultValue(_ctx.stringValue("DescribeDeployedApiResponse.RequestParameters["+ i +"].DefaultValue"));
			requestParameter.setDemoValue(_ctx.stringValue("DescribeDeployedApiResponse.RequestParameters["+ i +"].DemoValue"));
			requestParameter.setMaxValue(_ctx.longValue("DescribeDeployedApiResponse.RequestParameters["+ i +"].MaxValue"));
			requestParameter.setMinValue(_ctx.longValue("DescribeDeployedApiResponse.RequestParameters["+ i +"].MinValue"));
			requestParameter.setMaxLength(_ctx.longValue("DescribeDeployedApiResponse.RequestParameters["+ i +"].MaxLength"));
			requestParameter.setMinLength(_ctx.longValue("DescribeDeployedApiResponse.RequestParameters["+ i +"].MinLength"));
			requestParameter.setRegularExpression(_ctx.stringValue("DescribeDeployedApiResponse.RequestParameters["+ i +"].RegularExpression"));
			requestParameter.setJsonScheme(_ctx.stringValue("DescribeDeployedApiResponse.RequestParameters["+ i +"].JsonScheme"));
			requestParameter.setEnumValue(_ctx.stringValue("DescribeDeployedApiResponse.RequestParameters["+ i +"].EnumValue"));
			requestParameter.setDocShow(_ctx.stringValue("DescribeDeployedApiResponse.RequestParameters["+ i +"].DocShow"));
			requestParameter.setDocOrder(_ctx.integerValue("DescribeDeployedApiResponse.RequestParameters["+ i +"].DocOrder"));
			requestParameter.setDescription(_ctx.stringValue("DescribeDeployedApiResponse.RequestParameters["+ i +"].Description"));

			requestParameters.add(requestParameter);
		}
		describeDeployedApiResponse.setRequestParameters(requestParameters);

		List<ServiceParameter> serviceParameters = new ArrayList<ServiceParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDeployedApiResponse.ServiceParameters.Length"); i++) {
			ServiceParameter serviceParameter = new ServiceParameter();
			serviceParameter.setServiceParameterName(_ctx.stringValue("DescribeDeployedApiResponse.ServiceParameters["+ i +"].ServiceParameterName"));
			serviceParameter.setLocation(_ctx.stringValue("DescribeDeployedApiResponse.ServiceParameters["+ i +"].Location"));
			serviceParameter.setParameterType(_ctx.stringValue("DescribeDeployedApiResponse.ServiceParameters["+ i +"].ParameterType"));

			serviceParameters.add(serviceParameter);
		}
		describeDeployedApiResponse.setServiceParameters(serviceParameters);

		List<ServiceParameterMap> serviceParametersMap = new ArrayList<ServiceParameterMap>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDeployedApiResponse.ServiceParametersMap.Length"); i++) {
			ServiceParameterMap serviceParameterMap = new ServiceParameterMap();
			serviceParameterMap.setServiceParameterName(_ctx.stringValue("DescribeDeployedApiResponse.ServiceParametersMap["+ i +"].ServiceParameterName"));
			serviceParameterMap.setRequestParameterName(_ctx.stringValue("DescribeDeployedApiResponse.ServiceParametersMap["+ i +"].RequestParameterName"));

			serviceParametersMap.add(serviceParameterMap);
		}
		describeDeployedApiResponse.setServiceParametersMap(serviceParametersMap);
	 
	 	return describeDeployedApiResponse;
	}
}