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
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiHistoryResponse.BackendConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiHistoryResponse.ConstantParameter;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiHistoryResponse.CustomSystemParameter;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiHistoryResponse.ErrorCodeSample;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiHistoryResponse.OpenIdConnectConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiHistoryResponse.RequestConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiHistoryResponse.RequestParameter;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiHistoryResponse.ResultDescription;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiHistoryResponse.ServiceConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiHistoryResponse.ServiceConfig.EventBridgeConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiHistoryResponse.ServiceConfig.FunctionComputeConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiHistoryResponse.ServiceConfig.MockHeader;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiHistoryResponse.ServiceConfig.OssConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiHistoryResponse.ServiceConfig.VpcConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiHistoryResponse.ServiceParameter;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiHistoryResponse.ServiceParameterMap;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiHistoryResponse.SystemParameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApiHistoryResponseUnmarshaller {

	public static DescribeApiHistoryResponse unmarshall(DescribeApiHistoryResponse describeApiHistoryResponse, UnmarshallerContext _ctx) {
		
		describeApiHistoryResponse.setRequestId(_ctx.stringValue("DescribeApiHistoryResponse.RequestId"));
		describeApiHistoryResponse.setStatus(_ctx.stringValue("DescribeApiHistoryResponse.Status"));
		describeApiHistoryResponse.setApiId(_ctx.stringValue("DescribeApiHistoryResponse.ApiId"));
		describeApiHistoryResponse.setResultType(_ctx.stringValue("DescribeApiHistoryResponse.ResultType"));
		describeApiHistoryResponse.setWebSocketApiType(_ctx.stringValue("DescribeApiHistoryResponse.WebSocketApiType"));
		describeApiHistoryResponse.setDisableInternet(_ctx.booleanValue("DescribeApiHistoryResponse.DisableInternet"));
		describeApiHistoryResponse.setResultBodyModel(_ctx.stringValue("DescribeApiHistoryResponse.ResultBodyModel"));
		describeApiHistoryResponse.setResultSample(_ctx.stringValue("DescribeApiHistoryResponse.ResultSample"));
		describeApiHistoryResponse.setAppCodeAuthType(_ctx.stringValue("DescribeApiHistoryResponse.AppCodeAuthType"));
		describeApiHistoryResponse.setAllowSignatureMethod(_ctx.stringValue("DescribeApiHistoryResponse.AllowSignatureMethod"));
		describeApiHistoryResponse.setRegionId(_ctx.stringValue("DescribeApiHistoryResponse.RegionId"));
		describeApiHistoryResponse.setForceNonceCheck(_ctx.booleanValue("DescribeApiHistoryResponse.ForceNonceCheck"));
		describeApiHistoryResponse.setVisibility(_ctx.stringValue("DescribeApiHistoryResponse.Visibility"));
		describeApiHistoryResponse.setFailResultSample(_ctx.stringValue("DescribeApiHistoryResponse.FailResultSample"));
		describeApiHistoryResponse.setAuthType(_ctx.stringValue("DescribeApiHistoryResponse.AuthType"));
		describeApiHistoryResponse.setDescription(_ctx.stringValue("DescribeApiHistoryResponse.Description"));
		describeApiHistoryResponse.setGroupName(_ctx.stringValue("DescribeApiHistoryResponse.GroupName"));
		describeApiHistoryResponse.setGroupId(_ctx.stringValue("DescribeApiHistoryResponse.GroupId"));
		describeApiHistoryResponse.setDeployedTime(_ctx.stringValue("DescribeApiHistoryResponse.DeployedTime"));
		describeApiHistoryResponse.setStageName(_ctx.stringValue("DescribeApiHistoryResponse.StageName"));
		describeApiHistoryResponse.setHistoryVersion(_ctx.stringValue("DescribeApiHistoryResponse.HistoryVersion"));
		describeApiHistoryResponse.setApiName(_ctx.stringValue("DescribeApiHistoryResponse.ApiName"));
		describeApiHistoryResponse.setBackendEnable(_ctx.booleanValue("DescribeApiHistoryResponse.BackendEnable"));

		BackendConfig backendConfig = new BackendConfig();
		backendConfig.setBackendId(_ctx.stringValue("DescribeApiHistoryResponse.BackendConfig.BackendId"));
		backendConfig.setBackendType(_ctx.stringValue("DescribeApiHistoryResponse.BackendConfig.BackendType"));
		backendConfig.setBackendName(_ctx.stringValue("DescribeApiHistoryResponse.BackendConfig.BackendName"));
		describeApiHistoryResponse.setBackendConfig(backendConfig);

		RequestConfig requestConfig = new RequestConfig();
		requestConfig.setBodyModel(_ctx.stringValue("DescribeApiHistoryResponse.RequestConfig.BodyModel"));
		requestConfig.setRequestPath(_ctx.stringValue("DescribeApiHistoryResponse.RequestConfig.RequestPath"));
		requestConfig.setRequestHttpMethod(_ctx.stringValue("DescribeApiHistoryResponse.RequestConfig.RequestHttpMethod"));
		requestConfig.setBodyFormat(_ctx.stringValue("DescribeApiHistoryResponse.RequestConfig.BodyFormat"));
		requestConfig.setRequestMode(_ctx.stringValue("DescribeApiHistoryResponse.RequestConfig.RequestMode"));
		requestConfig.setPostBodyDescription(_ctx.stringValue("DescribeApiHistoryResponse.RequestConfig.PostBodyDescription"));
		requestConfig.setRequestProtocol(_ctx.stringValue("DescribeApiHistoryResponse.RequestConfig.RequestProtocol"));
		describeApiHistoryResponse.setRequestConfig(requestConfig);

		ServiceConfig serviceConfig = new ServiceConfig();
		serviceConfig.setVpcId(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.VpcId"));
		serviceConfig.setMockStatusCode(_ctx.integerValue("DescribeApiHistoryResponse.ServiceConfig.MockStatusCode"));
		serviceConfig.setContentTypeValue(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.ContentTypeValue"));
		serviceConfig.setServiceProtocol(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.ServiceProtocol"));
		serviceConfig.setServicePath(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.ServicePath"));
		serviceConfig.setContentTypeCatagory(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.ContentTypeCatagory"));
		serviceConfig.setServiceAddress(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.ServiceAddress"));
		serviceConfig.setMock(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.Mock"));
		serviceConfig.setServiceVpcEnable(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.ServiceVpcEnable"));
		serviceConfig.setMockResult(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.MockResult"));
		serviceConfig.setServiceHttpMethod(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.ServiceHttpMethod"));
		serviceConfig.setServiceTimeout(_ctx.integerValue("DescribeApiHistoryResponse.ServiceConfig.ServiceTimeout"));

		VpcConfig vpcConfig = new VpcConfig();
		vpcConfig.setVpcId(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.VpcConfig.VpcId"));
		vpcConfig.setVpcScheme(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.VpcConfig.VpcScheme"));
		vpcConfig.setInstanceId(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.VpcConfig.InstanceId"));
		vpcConfig.setPort(_ctx.integerValue("DescribeApiHistoryResponse.ServiceConfig.VpcConfig.Port"));
		vpcConfig.setName(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.VpcConfig.Name"));
		serviceConfig.setVpcConfig(vpcConfig);

		FunctionComputeConfig functionComputeConfig = new FunctionComputeConfig();
		functionComputeConfig.setFcType(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.FunctionComputeConfig.FcType"));
		functionComputeConfig.setRoleArn(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.FunctionComputeConfig.RoleArn"));
		functionComputeConfig.setBizMethod(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.FunctionComputeConfig.Method"));
		functionComputeConfig.setFcBaseUrl(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.FunctionComputeConfig.FcBaseUrl"));
		functionComputeConfig.setContentTypeValue(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.FunctionComputeConfig.ContentTypeValue"));
		functionComputeConfig.setRegionId(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.FunctionComputeConfig.RegionId"));
		functionComputeConfig.setOnlyBusinessPath(_ctx.booleanValue("DescribeApiHistoryResponse.ServiceConfig.FunctionComputeConfig.OnlyBusinessPath"));
		functionComputeConfig.setFunctionName(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.FunctionComputeConfig.FunctionName"));
		functionComputeConfig.setContentTypeCatagory(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.FunctionComputeConfig.ContentTypeCatagory"));
		functionComputeConfig.setPath(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.FunctionComputeConfig.Path"));
		functionComputeConfig.setServiceName(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.FunctionComputeConfig.ServiceName"));
		functionComputeConfig.setQualifier(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.FunctionComputeConfig.Qualifier"));
		serviceConfig.setFunctionComputeConfig(functionComputeConfig);

		OssConfig ossConfig = new OssConfig();
		ossConfig.setKey(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.OssConfig.Key"));
		ossConfig.setAction(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.OssConfig.Action"));
		ossConfig.setOssRegionId(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.OssConfig.OssRegionId"));
		ossConfig.setBucketName(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.OssConfig.BucketName"));
		serviceConfig.setOssConfig(ossConfig);

		EventBridgeConfig eventBridgeConfig = new EventBridgeConfig();
		eventBridgeConfig.setEventBridgeRegionId(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.EventBridgeConfig.EventBridgeRegionId"));
		eventBridgeConfig.setEventBus(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.EventBridgeConfig.EventBus"));
		eventBridgeConfig.setEventSource(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.EventBridgeConfig.EventSource"));
		eventBridgeConfig.setRoleArn(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.EventBridgeConfig.RoleArn"));
		serviceConfig.setEventBridgeConfig(eventBridgeConfig);

		List<MockHeader> mockHeaders = new ArrayList<MockHeader>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiHistoryResponse.ServiceConfig.MockHeaders.Length"); i++) {
			MockHeader mockHeader = new MockHeader();
			mockHeader.setHeaderValue(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.MockHeaders["+ i +"].HeaderValue"));
			mockHeader.setHeaderName(_ctx.stringValue("DescribeApiHistoryResponse.ServiceConfig.MockHeaders["+ i +"].HeaderName"));

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
			resultDescription.setType(_ctx.stringValue("DescribeApiHistoryResponse.ResultDescriptions["+ i +"].Type"));
			resultDescription.setKey(_ctx.stringValue("DescribeApiHistoryResponse.ResultDescriptions["+ i +"].Key"));
			resultDescription.setHasChild(_ctx.booleanValue("DescribeApiHistoryResponse.ResultDescriptions["+ i +"].HasChild"));
			resultDescription.setDescription(_ctx.stringValue("DescribeApiHistoryResponse.ResultDescriptions["+ i +"].Description"));
			resultDescription.setPid(_ctx.stringValue("DescribeApiHistoryResponse.ResultDescriptions["+ i +"].Pid"));
			resultDescription.setMandatory(_ctx.booleanValue("DescribeApiHistoryResponse.ResultDescriptions["+ i +"].Mandatory"));
			resultDescription.setName(_ctx.stringValue("DescribeApiHistoryResponse.ResultDescriptions["+ i +"].Name"));
			resultDescription.setId(_ctx.stringValue("DescribeApiHistoryResponse.ResultDescriptions["+ i +"].Id"));

			resultDescriptions.add(resultDescription);
		}
		describeApiHistoryResponse.setResultDescriptions(resultDescriptions);

		List<SystemParameter> systemParameters = new ArrayList<SystemParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiHistoryResponse.SystemParameters.Length"); i++) {
			SystemParameter systemParameter = new SystemParameter();
			systemParameter.setDemoValue(_ctx.stringValue("DescribeApiHistoryResponse.SystemParameters["+ i +"].DemoValue"));
			systemParameter.setDescription(_ctx.stringValue("DescribeApiHistoryResponse.SystemParameters["+ i +"].Description"));
			systemParameter.setParameterName(_ctx.stringValue("DescribeApiHistoryResponse.SystemParameters["+ i +"].ParameterName"));
			systemParameter.setLocation(_ctx.stringValue("DescribeApiHistoryResponse.SystemParameters["+ i +"].Location"));
			systemParameter.setServiceParameterName(_ctx.stringValue("DescribeApiHistoryResponse.SystemParameters["+ i +"].ServiceParameterName"));

			systemParameters.add(systemParameter);
		}
		describeApiHistoryResponse.setSystemParameters(systemParameters);

		List<CustomSystemParameter> customSystemParameters = new ArrayList<CustomSystemParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiHistoryResponse.CustomSystemParameters.Length"); i++) {
			CustomSystemParameter customSystemParameter = new CustomSystemParameter();
			customSystemParameter.setDemoValue(_ctx.stringValue("DescribeApiHistoryResponse.CustomSystemParameters["+ i +"].DemoValue"));
			customSystemParameter.setDescription(_ctx.stringValue("DescribeApiHistoryResponse.CustomSystemParameters["+ i +"].Description"));
			customSystemParameter.setParameterName(_ctx.stringValue("DescribeApiHistoryResponse.CustomSystemParameters["+ i +"].ParameterName"));
			customSystemParameter.setLocation(_ctx.stringValue("DescribeApiHistoryResponse.CustomSystemParameters["+ i +"].Location"));
			customSystemParameter.setServiceParameterName(_ctx.stringValue("DescribeApiHistoryResponse.CustomSystemParameters["+ i +"].ServiceParameterName"));

			customSystemParameters.add(customSystemParameter);
		}
		describeApiHistoryResponse.setCustomSystemParameters(customSystemParameters);

		List<ConstantParameter> constantParameters = new ArrayList<ConstantParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiHistoryResponse.ConstantParameters.Length"); i++) {
			ConstantParameter constantParameter = new ConstantParameter();
			constantParameter.setDescription(_ctx.stringValue("DescribeApiHistoryResponse.ConstantParameters["+ i +"].Description"));
			constantParameter.setLocation(_ctx.stringValue("DescribeApiHistoryResponse.ConstantParameters["+ i +"].Location"));
			constantParameter.setServiceParameterName(_ctx.stringValue("DescribeApiHistoryResponse.ConstantParameters["+ i +"].ServiceParameterName"));
			constantParameter.setConstantValue(_ctx.stringValue("DescribeApiHistoryResponse.ConstantParameters["+ i +"].ConstantValue"));

			constantParameters.add(constantParameter);
		}
		describeApiHistoryResponse.setConstantParameters(constantParameters);

		List<RequestParameter> requestParameters = new ArrayList<RequestParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiHistoryResponse.RequestParameters.Length"); i++) {
			RequestParameter requestParameter = new RequestParameter();
			requestParameter.setJsonScheme(_ctx.stringValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].JsonScheme"));
			requestParameter.setMaxValue(_ctx.longValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].MaxValue"));
			requestParameter.setArrayItemsType(_ctx.stringValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].ArrayItemsType"));
			requestParameter.setMinValue(_ctx.longValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].MinValue"));
			requestParameter.setDocShow(_ctx.stringValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].DocShow"));
			requestParameter.setMaxLength(_ctx.longValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].MaxLength"));
			requestParameter.setDefaultValue(_ctx.stringValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].DefaultValue"));
			requestParameter.setApiParameterName(_ctx.stringValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].ApiParameterName"));
			requestParameter.setEnumValue(_ctx.stringValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].EnumValue"));
			requestParameter.setDemoValue(_ctx.stringValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].DemoValue"));
			requestParameter.setRequired(_ctx.stringValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].Required"));
			requestParameter.setDescription(_ctx.stringValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].Description"));
			requestParameter.setParameterType(_ctx.stringValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].ParameterType"));
			requestParameter.setRegularExpression(_ctx.stringValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].RegularExpression"));
			requestParameter.setMinLength(_ctx.longValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].MinLength"));
			requestParameter.setDocOrder(_ctx.integerValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].DocOrder"));
			requestParameter.setLocation(_ctx.stringValue("DescribeApiHistoryResponse.RequestParameters["+ i +"].Location"));

			requestParameters.add(requestParameter);
		}
		describeApiHistoryResponse.setRequestParameters(requestParameters);

		List<ServiceParameter> serviceParameters = new ArrayList<ServiceParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiHistoryResponse.ServiceParameters.Length"); i++) {
			ServiceParameter serviceParameter = new ServiceParameter();
			serviceParameter.setLocation(_ctx.stringValue("DescribeApiHistoryResponse.ServiceParameters["+ i +"].Location"));
			serviceParameter.setParameterType(_ctx.stringValue("DescribeApiHistoryResponse.ServiceParameters["+ i +"].ParameterType"));
			serviceParameter.setServiceParameterName(_ctx.stringValue("DescribeApiHistoryResponse.ServiceParameters["+ i +"].ServiceParameterName"));

			serviceParameters.add(serviceParameter);
		}
		describeApiHistoryResponse.setServiceParameters(serviceParameters);

		List<ServiceParameterMap> serviceParametersMap = new ArrayList<ServiceParameterMap>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiHistoryResponse.ServiceParametersMap.Length"); i++) {
			ServiceParameterMap serviceParameterMap = new ServiceParameterMap();
			serviceParameterMap.setRequestParameterName(_ctx.stringValue("DescribeApiHistoryResponse.ServiceParametersMap["+ i +"].RequestParameterName"));
			serviceParameterMap.setServiceParameterName(_ctx.stringValue("DescribeApiHistoryResponse.ServiceParametersMap["+ i +"].ServiceParameterName"));

			serviceParametersMap.add(serviceParameterMap);
		}
		describeApiHistoryResponse.setServiceParametersMap(serviceParametersMap);
	 
	 	return describeApiHistoryResponse;
	}
}