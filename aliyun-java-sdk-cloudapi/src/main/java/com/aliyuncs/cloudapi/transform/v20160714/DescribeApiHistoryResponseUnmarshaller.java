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

import com.aliyuncs.cloudapi.model.v20160714.DescribeApiHistoryResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiHistoryResponse.ConstantParameter;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiHistoryResponse.CustomSystemParameter;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiHistoryResponse.ErrorCodeSample;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiHistoryResponse.OpenIdConnectConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiHistoryResponse.RequestConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiHistoryResponse.RequestParameter;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiHistoryResponse.ResultDescription;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiHistoryResponse.ServiceConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiHistoryResponse.ServiceConfig.FunctionComputeConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiHistoryResponse.ServiceConfig.MockHeader;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiHistoryResponse.ServiceConfig.VpcConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiHistoryResponse.ServiceParameter;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiHistoryResponse.ServiceParameterMap;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiHistoryResponse.SystemParameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApiHistoryResponseUnmarshaller {

	public static DescribeApiHistoryResponse unmarshall(DescribeApiHistoryResponse describeApiHistoryResponse, UnmarshallerContext _ctx) {
		
		describeApiHistoryResponse.setRequestId(_ctx.stringValue("DescribeApiHistoryResponse.RequestId"));
		describeApiHistoryResponse.setRegionId(_ctx.stringValue("DescribeApiHistoryResponse.RegionId"));
		describeApiHistoryResponse.setGroupId(_ctx.stringValue("DescribeApiHistoryResponse.GroupId"));
		describeApiHistoryResponse.setGroupName(_ctx.stringValue("DescribeApiHistoryResponse.GroupName"));
		describeApiHistoryResponse.setStageName(_ctx.stringValue("DescribeApiHistoryResponse.StageName"));
		describeApiHistoryResponse.setApiId(_ctx.stringValue("DescribeApiHistoryResponse.ApiId"));
		describeApiHistoryResponse.setApiName(_ctx.stringValue("DescribeApiHistoryResponse.ApiName"));
		describeApiHistoryResponse.setDescription(_ctx.stringValue("DescribeApiHistoryResponse.Description"));
		describeApiHistoryResponse.setHistoryVersion(_ctx.stringValue("DescribeApiHistoryResponse.HistoryVersion"));
		describeApiHistoryResponse.setStatus(_ctx.stringValue("DescribeApiHistoryResponse.Status"));
		describeApiHistoryResponse.setVisibility(_ctx.stringValue("DescribeApiHistoryResponse.Visibility"));
		describeApiHistoryResponse.setAuthType(_ctx.stringValue("DescribeApiHistoryResponse.AuthType"));
		describeApiHistoryResponse.setResultType(_ctx.stringValue("DescribeApiHistoryResponse.ResultType"));
		describeApiHistoryResponse.setResultSample(_ctx.stringValue("DescribeApiHistoryResponse.ResultSample"));
		describeApiHistoryResponse.setFailResultSample(_ctx.stringValue("DescribeApiHistoryResponse.FailResultSample"));
		describeApiHistoryResponse.setDeployedTime(_ctx.stringValue("DescribeApiHistoryResponse.DeployedTime"));
		describeApiHistoryResponse.setAllowSignatureMethod(_ctx.stringValue("DescribeApiHistoryResponse.AllowSignatureMethod"));
		describeApiHistoryResponse.setResultBodyModel(_ctx.stringValue("DescribeApiHistoryResponse.ResultBodyModel"));
		describeApiHistoryResponse.setForceNonceCheck(_ctx.booleanValue("DescribeApiHistoryResponse.ForceNonceCheck"));
		describeApiHistoryResponse.setDisableInternet(_ctx.booleanValue("DescribeApiHistoryResponse.DisableInternet"));

		RequestConfig requestConfig = new RequestConfig();
		requestConfig.setRequestProtocol(_ctx.stringValue("DescribeApiHistoryResponse.RequestConfig.RequestProtocol"));
		requestConfig.setRequestHttpMethod(_ctx.stringValue("DescribeApiHistoryResponse.RequestConfig.RequestHttpMethod"));
		requestConfig.setRequestPath(_ctx.stringValue("DescribeApiHistoryResponse.RequestConfig.RequestPath"));
		requestConfig.setBodyFormat(_ctx.stringValue("DescribeApiHistoryResponse.RequestConfig.BodyFormat"));
		requestConfig.setPostBodyDescription(_ctx.stringValue("DescribeApiHistoryResponse.RequestConfig.PostBodyDescription"));
		requestConfig.setRequestMode(_ctx.stringValue("DescribeApiHistoryResponse.RequestConfig.RequestMode"));
		requestConfig.setBodyModel(_ctx.stringValue("DescribeApiHistoryResponse.RequestConfig.BodyModel"));
		describeApiHistoryResponse.setRequestConfig(requestConfig);

		ServiceConfig serviceConfig = new ServiceConfig();
		serviceConfig.setServiceProtocol(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.ServiceProtocol"));
		serviceConfig.setServiceAddress(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.ServiceAddress"));
		serviceConfig.setServiceHttpMethod(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.ServiceHttpMethod"));
		serviceConfig.setServicePath(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.ServicePath"));
		serviceConfig.setServiceTimeout(_ctx.integerValue("DescribeApiHistoryResponse.ServiceConfig.ServiceTimeout"));
		serviceConfig.setMock(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.Mock"));
		serviceConfig.setMockResult(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.MockResult"));
		serviceConfig.setServiceVpcEnable(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.ServiceVpcEnable"));
		serviceConfig.setMockStatusCode(_ctx.integerValue("DescribeApiHistoryResponse.ServiceConfig.MockStatusCode"));

		VpcConfig vpcConfig = new VpcConfig();
		vpcConfig.setName(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.VpcConfig.Name"));
		vpcConfig.setVpcId(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.VpcConfig.VpcId"));
		vpcConfig.setInstanceId(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.VpcConfig.InstanceId"));
		vpcConfig.setPort(_ctx.integerValue("DescribeApiHistoryResponse.ServiceConfig.VpcConfig.Port"));
		serviceConfig.setVpcConfig(vpcConfig);

		FunctionComputeConfig functionComputeConfig = new FunctionComputeConfig();
		functionComputeConfig.setRegionId(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.FunctionComputeConfig.RegionId"));
		functionComputeConfig.setServiceName(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.FunctionComputeConfig.ServiceName"));
		functionComputeConfig.setFunctionName(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.FunctionComputeConfig.FunctionName"));
		functionComputeConfig.setRoleArn(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.FunctionComputeConfig.RoleArn"));
		serviceConfig.setFunctionComputeConfig(functionComputeConfig);

		List<MockHeader> mockHeaders = new ArrayList<MockHeader>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiHistoryResponse.ServiceConfig.MockHeaders.Length"); i++) {
			MockHeader mockHeader = new MockHeader();
			mockHeader.setHeaderName(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.MockHeaders["+ i +"].HeaderName"));
			mockHeader.setHeaderValue(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.MockHeaders["+ i +"].HeaderValue"));

			mockHeaders.add(mockHeader);
		}
		serviceConfig.setMockHeaders(mockHeaders);
		describeApiHistoryResponse.setServiceConfig(serviceConfig);

		OpenIdConnectConfig openIdConnectConfig = new OpenIdConnectConfig();
		openIdConnectConfig.setOpenIdApiType(_ctx.stringValue("DescribeApiHistoryResponse.OpenIdConnectConfig.OpenIdApiType"));
		openIdConnectConfig.setIdTokenParamName(_ctx.stringValue("DescribeApiHistoryResponse.OpenIdConnectConfig.IdTokenParamName"));
		openIdConnectConfig.setPublicKeyId(_ctx.stringValue("DescribeApiHistoryResponse.OpenIdConnectConfig.PublicKeyId"));
		openIdConnectConfig.setPublicKey(_ctx.stringValue("DescribeApiHistoryResponse.OpenIdConnectConfig.PublicKey"));
		describeApiHistoryResponse.setOpenIdConnectConfig(openIdConnectConfig);

		List<ErrorCodeSample> errorCodeSamples = new ArrayList<ErrorCodeSample>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiHistoryResponse.ErrorCodeSamples.Length"); i++) {
			ErrorCodeSample errorCodeSample = new ErrorCodeSample();
			errorCodeSample.setCode(_ctx.stringValue("DescribeApiHistoryResponse.ErrorCodeSamples["+ i +"].Code"));
			errorCodeSample.setMessage(_ctx.stringValue("DescribeApiHistoryResponse.ErrorCodeSamples["+ i +"].Message"));
			errorCodeSample.setDescription(_ctx.stringValue("DescribeApiHistoryResponse.ErrorCodeSamples["+ i +"].Description"));

			errorCodeSamples.add(errorCodeSample);
		}
		describeApiHistoryResponse.setErrorCodeSamples(errorCodeSamples);

		List<ResultDescription> resultDescriptions = new ArrayList<ResultDescription>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiHistoryResponse.ResultDescriptions.Length"); i++) {
			ResultDescription resultDescription = new ResultDescription();
			resultDescription.setId(_ctx.stringValue("DescribeApiHistoryResponse.ResultDescriptions["+ i +"].Id"));
			resultDescription.setPid(_ctx.stringValue("DescribeApiHistoryResponse.ResultDescriptions["+ i +"].Pid"));
			resultDescription.setHasChild(_ctx.booleanValue("DescribeApiHistoryResponse.ResultDescriptions["+ i +"].HasChild"));
			resultDescription.setKey(_ctx.stringValue("DescribeApiHistoryResponse.ResultDescriptions["+ i +"].Key"));
			resultDescription.setName(_ctx.stringValue("DescribeApiHistoryResponse.ResultDescriptions["+ i +"].Name"));
			resultDescription.setMandatory(_ctx.booleanValue("DescribeApiHistoryResponse.ResultDescriptions["+ i +"].Mandatory"));
			resultDescription.setType(_ctx.stringValue("DescribeApiHistoryResponse.ResultDescriptions["+ i +"].Type"));
			resultDescription.setDescription(_ctx.stringValue("DescribeApiHistoryResponse.ResultDescriptions["+ i +"].Description"));

			resultDescriptions.add(resultDescription);
		}
		describeApiHistoryResponse.setResultDescriptions(resultDescriptions);

		List<SystemParameter> systemParameters = new ArrayList<SystemParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiHistoryResponse.SystemParameters.Length"); i++) {
			SystemParameter systemParameter = new SystemParameter();
			systemParameter.setParameterName(_ctx.stringValue("DescribeApiHistoryResponse.SystemParameters["+ i +"].ParameterName"));
			systemParameter.setServiceParameterName(_ctx.stringValue("DescribeApiHistoryResponse.SystemParameters["+ i +"].ServiceParameterName"));
			systemParameter.setLocation(_ctx.stringValue("DescribeApiHistoryResponse.SystemParameters["+ i +"].Location"));
			systemParameter.setDemoValue(_ctx.stringValue("DescribeApiHistoryResponse.SystemParameters["+ i +"].DemoValue"));
			systemParameter.setDescription(_ctx.stringValue("DescribeApiHistoryResponse.SystemParameters["+ i +"].Description"));

			systemParameters.add(systemParameter);
		}
		describeApiHistoryResponse.setSystemParameters(systemParameters);

		List<CustomSystemParameter> customSystemParameters = new ArrayList<CustomSystemParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiHistoryResponse.CustomSystemParameters.Length"); i++) {
			CustomSystemParameter customSystemParameter = new CustomSystemParameter();
			customSystemParameter.setParameterName(_ctx.stringValue("DescribeApiHistoryResponse.CustomSystemParameters["+ i +"].ParameterName"));
			customSystemParameter.setServiceParameterName(_ctx.stringValue("DescribeApiHistoryResponse.CustomSystemParameters["+ i +"].ServiceParameterName"));
			customSystemParameter.setLocation(_ctx.stringValue("DescribeApiHistoryResponse.CustomSystemParameters["+ i +"].Location"));
			customSystemParameter.setDemoValue(_ctx.stringValue("DescribeApiHistoryResponse.CustomSystemParameters["+ i +"].DemoValue"));
			customSystemParameter.setDescription(_ctx.stringValue("DescribeApiHistoryResponse.CustomSystemParameters["+ i +"].Description"));

			customSystemParameters.add(customSystemParameter);
		}
		describeApiHistoryResponse.setCustomSystemParameters(customSystemParameters);

		List<ConstantParameter> constantParameters = new ArrayList<ConstantParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiHistoryResponse.ConstantParameters.Length"); i++) {
			ConstantParameter constantParameter = new ConstantParameter();
			constantParameter.setServiceParameterName(_ctx.stringValue("DescribeApiHistoryResponse.ConstantParameters["+ i +"].ServiceParameterName"));
			constantParameter.setConstantValue(_ctx.stringValue("DescribeApiHistoryResponse.ConstantParameters["+ i +"].ConstantValue"));
			constantParameter.setLocation(_ctx.stringValue("DescribeApiHistoryResponse.ConstantParameters["+ i +"].Location"));
			constantParameter.setDescription(_ctx.stringValue("DescribeApiHistoryResponse.ConstantParameters["+ i +"].Description"));

			constantParameters.add(constantParameter);
		}
		describeApiHistoryResponse.setConstantParameters(constantParameters);

		List<RequestParameter> requestParameters = new ArrayList<RequestParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiHistoryResponse.RequestParameters.Length"); i++) {
			RequestParameter requestParameter = new RequestParameter();
			requestParameter.setApiParameterName(_ctx.stringValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].ApiParameterName"));
			requestParameter.setLocation(_ctx.stringValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].Location"));
			requestParameter.setParameterType(_ctx.stringValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].ParameterType"));
			requestParameter.setRequired(_ctx.stringValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].Required"));
			requestParameter.setDefaultValue(_ctx.stringValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].DefaultValue"));
			requestParameter.setDemoValue(_ctx.stringValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].DemoValue"));
			requestParameter.setMaxValue(_ctx.longValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].MaxValue"));
			requestParameter.setMinValue(_ctx.longValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].MinValue"));
			requestParameter.setMaxLength(_ctx.longValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].MaxLength"));
			requestParameter.setMinLength(_ctx.longValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].MinLength"));
			requestParameter.setRegularExpression(_ctx.stringValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].RegularExpression"));
			requestParameter.setJsonScheme(_ctx.stringValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].JsonScheme"));
			requestParameter.setEnumValue(_ctx.stringValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].EnumValue"));
			requestParameter.setDocShow(_ctx.stringValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].DocShow"));
			requestParameter.setDocOrder(_ctx.integerValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].DocOrder"));
			requestParameter.setDescription(_ctx.stringValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].Description"));

			requestParameters.add(requestParameter);
		}
		describeApiHistoryResponse.setRequestParameters(requestParameters);

		List<ServiceParameter> serviceParameters = new ArrayList<ServiceParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiHistoryResponse.ServiceParameters.Length"); i++) {
			ServiceParameter serviceParameter = new ServiceParameter();
			serviceParameter.setServiceParameterName(_ctx.stringValue("DescribeApiHistoryResponse.ServiceParameters["+ i +"].ServiceParameterName"));
			serviceParameter.setLocation(_ctx.stringValue("DescribeApiHistoryResponse.ServiceParameters["+ i +"].Location"));
			serviceParameter.setParameterType(_ctx.stringValue("DescribeApiHistoryResponse.ServiceParameters["+ i +"].ParameterType"));

			serviceParameters.add(serviceParameter);
		}
		describeApiHistoryResponse.setServiceParameters(serviceParameters);

		List<ServiceParameterMap> serviceParametersMap = new ArrayList<ServiceParameterMap>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiHistoryResponse.ServiceParametersMap.Length"); i++) {
			ServiceParameterMap serviceParameterMap = new ServiceParameterMap();
			serviceParameterMap.setServiceParameterName(_ctx.stringValue("DescribeApiHistoryResponse.ServiceParametersMap["+ i +"].ServiceParameterName"));
			serviceParameterMap.setRequestParameterName(_ctx.stringValue("DescribeApiHistoryResponse.ServiceParametersMap["+ i +"].RequestParameterName"));

			serviceParametersMap.add(serviceParameterMap);
		}
		describeApiHistoryResponse.setServiceParametersMap(serviceParametersMap);
	 
	 	return describeApiHistoryResponse;
	}
}