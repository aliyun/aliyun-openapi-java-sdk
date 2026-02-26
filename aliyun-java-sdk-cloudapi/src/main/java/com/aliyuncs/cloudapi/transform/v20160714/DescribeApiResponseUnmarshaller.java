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

import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.BackendConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.ConstantParameter;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.CustomSystemParameter;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.DeployedInfo;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.ErrorCodeSample;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.OpenIdConnectConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.RequestConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.RequestParameter;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.ResultDescription;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.ServiceConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.ServiceConfig.EventBridgeConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.ServiceConfig.FunctionComputeConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.ServiceConfig.MockHeader;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.ServiceConfig.OssConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.ServiceConfig.VpcConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.ServiceParameter;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.ServiceParameterMap;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.SystemParameter;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApiResponseUnmarshaller {

	public static DescribeApiResponse unmarshall(DescribeApiResponse describeApiResponse, UnmarshallerContext _ctx) {
		
		describeApiResponse.setRequestId(_ctx.stringValue("DescribeApiResponse.RequestId"));
		describeApiResponse.setApiId(_ctx.stringValue("DescribeApiResponse.ApiId"));
		describeApiResponse.setResultType(_ctx.stringValue("DescribeApiResponse.ResultType"));
		describeApiResponse.setWebSocketApiType(_ctx.stringValue("DescribeApiResponse.WebSocketApiType"));
		describeApiResponse.setDisableInternet(_ctx.booleanValue("DescribeApiResponse.DisableInternet"));
		describeApiResponse.setResultBodyModel(_ctx.stringValue("DescribeApiResponse.ResultBodyModel"));
		describeApiResponse.setResultSample(_ctx.stringValue("DescribeApiResponse.ResultSample"));
		describeApiResponse.setAppCodeAuthType(_ctx.stringValue("DescribeApiResponse.AppCodeAuthType"));
		describeApiResponse.setAllowSignatureMethod(_ctx.stringValue("DescribeApiResponse.AllowSignatureMethod"));
		describeApiResponse.setRegionId(_ctx.stringValue("DescribeApiResponse.RegionId"));
		describeApiResponse.setForceNonceCheck(_ctx.booleanValue("DescribeApiResponse.ForceNonceCheck"));
		describeApiResponse.setVisibility(_ctx.stringValue("DescribeApiResponse.Visibility"));
		describeApiResponse.setFailResultSample(_ctx.stringValue("DescribeApiResponse.FailResultSample"));
		describeApiResponse.setAuthType(_ctx.stringValue("DescribeApiResponse.AuthType"));
		describeApiResponse.setModifiedTime(_ctx.stringValue("DescribeApiResponse.ModifiedTime"));
		describeApiResponse.setDescription(_ctx.stringValue("DescribeApiResponse.Description"));
		describeApiResponse.setGroupName(_ctx.stringValue("DescribeApiResponse.GroupName"));
		describeApiResponse.setGroupId(_ctx.stringValue("DescribeApiResponse.GroupId"));
		describeApiResponse.setMock(_ctx.stringValue("DescribeApiResponse.Mock"));
		describeApiResponse.setMockResult(_ctx.stringValue("DescribeApiResponse.MockResult"));
		describeApiResponse.setCreatedTime(_ctx.stringValue("DescribeApiResponse.CreatedTime"));
		describeApiResponse.setApiName(_ctx.stringValue("DescribeApiResponse.ApiName"));
		describeApiResponse.setBackendEnable(_ctx.booleanValue("DescribeApiResponse.BackendEnable"));

		BackendConfig backendConfig = new BackendConfig();
		backendConfig.setBackendId(_ctx.stringValue("DescribeApiResponse.BackendConfig.BackendId"));
		backendConfig.setBackendType(_ctx.stringValue("DescribeApiResponse.BackendConfig.BackendType"));
		backendConfig.setBackendName(_ctx.stringValue("DescribeApiResponse.BackendConfig.BackendName"));
		describeApiResponse.setBackendConfig(backendConfig);

		RequestConfig requestConfig = new RequestConfig();
		requestConfig.setBodyModel(_ctx.stringValue("DescribeApiResponse.RequestConfig.BodyModel"));
		requestConfig.setRequestPath(_ctx.stringValue("DescribeApiResponse.RequestConfig.RequestPath"));
		requestConfig.setRequestHttpMethod(_ctx.stringValue("DescribeApiResponse.RequestConfig.RequestHttpMethod"));
		requestConfig.setBodyFormat(_ctx.stringValue("DescribeApiResponse.RequestConfig.BodyFormat"));
		requestConfig.setRequestMode(_ctx.stringValue("DescribeApiResponse.RequestConfig.RequestMode"));
		requestConfig.setPostBodyDescription(_ctx.stringValue("DescribeApiResponse.RequestConfig.PostBodyDescription"));
		requestConfig.setRequestProtocol(_ctx.stringValue("DescribeApiResponse.RequestConfig.RequestProtocol"));
		describeApiResponse.setRequestConfig(requestConfig);

		ServiceConfig serviceConfig = new ServiceConfig();
		serviceConfig.setAoneAppName(_ctx.stringValue("DescribeApiResponse.ServiceConfig.AoneAppName"));
		serviceConfig.setMockStatusCode(_ctx.integerValue("DescribeApiResponse.ServiceConfig.MockStatusCode"));
		serviceConfig.setContentTypeValue(_ctx.stringValue("DescribeApiResponse.ServiceConfig.ContentTypeValue"));
		serviceConfig.setServiceProtocol(_ctx.stringValue("DescribeApiResponse.ServiceConfig.ServiceProtocol"));
		serviceConfig.setServicePath(_ctx.stringValue("DescribeApiResponse.ServiceConfig.ServicePath"));
		serviceConfig.setContentTypeCatagory(_ctx.stringValue("DescribeApiResponse.ServiceConfig.ContentTypeCatagory"));
		serviceConfig.setServiceAddress(_ctx.stringValue("DescribeApiResponse.ServiceConfig.ServiceAddress"));
		serviceConfig.setMock(_ctx.stringValue("DescribeApiResponse.ServiceConfig.Mock"));
		serviceConfig.setServiceVpcEnable(_ctx.stringValue("DescribeApiResponse.ServiceConfig.ServiceVpcEnable"));
		serviceConfig.setMockResult(_ctx.stringValue("DescribeApiResponse.ServiceConfig.MockResult"));
		serviceConfig.setServiceHttpMethod(_ctx.stringValue("DescribeApiResponse.ServiceConfig.ServiceHttpMethod"));
		serviceConfig.setServiceTimeout(_ctx.integerValue("DescribeApiResponse.ServiceConfig.ServiceTimeout"));

		VpcConfig vpcConfig = new VpcConfig();
		vpcConfig.setVpcId(_ctx.stringValue("DescribeApiResponse.ServiceConfig.VpcConfig.VpcId"));
		vpcConfig.setVpcScheme(_ctx.stringValue("DescribeApiResponse.ServiceConfig.VpcConfig.VpcScheme"));
		vpcConfig.setInstanceId(_ctx.stringValue("DescribeApiResponse.ServiceConfig.VpcConfig.InstanceId"));
		vpcConfig.setPort(_ctx.integerValue("DescribeApiResponse.ServiceConfig.VpcConfig.Port"));
		vpcConfig.setName(_ctx.stringValue("DescribeApiResponse.ServiceConfig.VpcConfig.Name"));
		serviceConfig.setVpcConfig(vpcConfig);

		FunctionComputeConfig functionComputeConfig = new FunctionComputeConfig();
		functionComputeConfig.setFcType(_ctx.stringValue("DescribeApiResponse.ServiceConfig.FunctionComputeConfig.FcType"));
		functionComputeConfig.setRoleArn(_ctx.stringValue("DescribeApiResponse.ServiceConfig.FunctionComputeConfig.RoleArn"));
		functionComputeConfig.setBizMethod(_ctx.stringValue("DescribeApiResponse.ServiceConfig.FunctionComputeConfig.Method"));
		functionComputeConfig.setFcBaseUrl(_ctx.stringValue("DescribeApiResponse.ServiceConfig.FunctionComputeConfig.FcBaseUrl"));
		functionComputeConfig.setContentTypeValue(_ctx.stringValue("DescribeApiResponse.ServiceConfig.FunctionComputeConfig.ContentTypeValue"));
		functionComputeConfig.setRegionId(_ctx.stringValue("DescribeApiResponse.ServiceConfig.FunctionComputeConfig.RegionId"));
		functionComputeConfig.setOnlyBusinessPath(_ctx.booleanValue("DescribeApiResponse.ServiceConfig.FunctionComputeConfig.OnlyBusinessPath"));
		functionComputeConfig.setFunctionName(_ctx.stringValue("DescribeApiResponse.ServiceConfig.FunctionComputeConfig.FunctionName"));
		functionComputeConfig.setContentTypeCatagory(_ctx.stringValue("DescribeApiResponse.ServiceConfig.FunctionComputeConfig.ContentTypeCatagory"));
		functionComputeConfig.setPath(_ctx.stringValue("DescribeApiResponse.ServiceConfig.FunctionComputeConfig.Path"));
		functionComputeConfig.setServiceName(_ctx.stringValue("DescribeApiResponse.ServiceConfig.FunctionComputeConfig.ServiceName"));
		functionComputeConfig.setQualifier(_ctx.stringValue("DescribeApiResponse.ServiceConfig.FunctionComputeConfig.Qualifier"));
		serviceConfig.setFunctionComputeConfig(functionComputeConfig);

		OssConfig ossConfig = new OssConfig();
		ossConfig.setKey(_ctx.stringValue("DescribeApiResponse.ServiceConfig.OssConfig.Key"));
		ossConfig.setAction(_ctx.stringValue("DescribeApiResponse.ServiceConfig.OssConfig.Action"));
		ossConfig.setOssRegionId(_ctx.stringValue("DescribeApiResponse.ServiceConfig.OssConfig.OssRegionId"));
		ossConfig.setBucketName(_ctx.stringValue("DescribeApiResponse.ServiceConfig.OssConfig.BucketName"));
		serviceConfig.setOssConfig(ossConfig);

		EventBridgeConfig eventBridgeConfig = new EventBridgeConfig();
		eventBridgeConfig.setEventBus(_ctx.stringValue("DescribeApiResponse.ServiceConfig.EventBridgeConfig.EventBus"));
		eventBridgeConfig.setEventSource(_ctx.stringValue("DescribeApiResponse.ServiceConfig.EventBridgeConfig.EventSource"));
		eventBridgeConfig.setEventBridgeRegionId(_ctx.stringValue("DescribeApiResponse.ServiceConfig.EventBridgeConfig.EventBridgeRegionId"));
		eventBridgeConfig.setRoleArn(_ctx.stringValue("DescribeApiResponse.ServiceConfig.EventBridgeConfig.RoleArn"));
		serviceConfig.setEventBridgeConfig(eventBridgeConfig);

		List<MockHeader> mockHeaders = new ArrayList<MockHeader>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiResponse.ServiceConfig.MockHeaders.Length"); i++) {
			MockHeader mockHeader = new MockHeader();
			mockHeader.setHeaderValue(_ctx.stringValue("DescribeApiResponse.ServiceConfig.MockHeaders["+ i +"].HeaderValue"));
			mockHeader.setHeaderName(_ctx.stringValue("DescribeApiResponse.ServiceConfig.MockHeaders["+ i +"].HeaderName"));

			mockHeaders.add(mockHeader);
		}
		serviceConfig.setMockHeaders(mockHeaders);
		describeApiResponse.setServiceConfig(serviceConfig);

		OpenIdConnectConfig openIdConnectConfig = new OpenIdConnectConfig();
		openIdConnectConfig.setOpenIdApiType(_ctx.stringValue("DescribeApiResponse.OpenIdConnectConfig.OpenIdApiType"));
		openIdConnectConfig.setIdTokenParamName(_ctx.stringValue("DescribeApiResponse.OpenIdConnectConfig.IdTokenParamName"));
		openIdConnectConfig.setPublicKeyId(_ctx.stringValue("DescribeApiResponse.OpenIdConnectConfig.PublicKeyId"));
		openIdConnectConfig.setPublicKey(_ctx.stringValue("DescribeApiResponse.OpenIdConnectConfig.PublicKey"));
		describeApiResponse.setOpenIdConnectConfig(openIdConnectConfig);

		List<ErrorCodeSample> errorCodeSamples = new ArrayList<ErrorCodeSample>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiResponse.ErrorCodeSamples.Length"); i++) {
			ErrorCodeSample errorCodeSample = new ErrorCodeSample();
			errorCodeSample.setCode(_ctx.stringValue("DescribeApiResponse.ErrorCodeSamples["+ i +"].Code"));
			errorCodeSample.setModel(_ctx.stringValue("DescribeApiResponse.ErrorCodeSamples["+ i +"].Model"));
			errorCodeSample.setMessage(_ctx.stringValue("DescribeApiResponse.ErrorCodeSamples["+ i +"].Message"));
			errorCodeSample.setDescription(_ctx.stringValue("DescribeApiResponse.ErrorCodeSamples["+ i +"].Description"));

			errorCodeSamples.add(errorCodeSample);
		}
		describeApiResponse.setErrorCodeSamples(errorCodeSamples);

		List<ResultDescription> resultDescriptions = new ArrayList<ResultDescription>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiResponse.ResultDescriptions.Length"); i++) {
			ResultDescription resultDescription = new ResultDescription();
			resultDescription.setType(_ctx.stringValue("DescribeApiResponse.ResultDescriptions["+ i +"].Type"));
			resultDescription.setKey(_ctx.stringValue("DescribeApiResponse.ResultDescriptions["+ i +"].Key"));
			resultDescription.setHasChild(_ctx.booleanValue("DescribeApiResponse.ResultDescriptions["+ i +"].HasChild"));
			resultDescription.setDescription(_ctx.stringValue("DescribeApiResponse.ResultDescriptions["+ i +"].Description"));
			resultDescription.setPid(_ctx.stringValue("DescribeApiResponse.ResultDescriptions["+ i +"].Pid"));
			resultDescription.setMandatory(_ctx.booleanValue("DescribeApiResponse.ResultDescriptions["+ i +"].Mandatory"));
			resultDescription.setName(_ctx.stringValue("DescribeApiResponse.ResultDescriptions["+ i +"].Name"));
			resultDescription.setId(_ctx.stringValue("DescribeApiResponse.ResultDescriptions["+ i +"].Id"));

			resultDescriptions.add(resultDescription);
		}
		describeApiResponse.setResultDescriptions(resultDescriptions);

		List<SystemParameter> systemParameters = new ArrayList<SystemParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiResponse.SystemParameters.Length"); i++) {
			SystemParameter systemParameter = new SystemParameter();
			systemParameter.setDemoValue(_ctx.stringValue("DescribeApiResponse.SystemParameters["+ i +"].DemoValue"));
			systemParameter.setDescription(_ctx.stringValue("DescribeApiResponse.SystemParameters["+ i +"].Description"));
			systemParameter.setParameterName(_ctx.stringValue("DescribeApiResponse.SystemParameters["+ i +"].ParameterName"));
			systemParameter.setLocation(_ctx.stringValue("DescribeApiResponse.SystemParameters["+ i +"].Location"));
			systemParameter.setServiceParameterName(_ctx.stringValue("DescribeApiResponse.SystemParameters["+ i +"].ServiceParameterName"));

			systemParameters.add(systemParameter);
		}
		describeApiResponse.setSystemParameters(systemParameters);

		List<CustomSystemParameter> customSystemParameters = new ArrayList<CustomSystemParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiResponse.CustomSystemParameters.Length"); i++) {
			CustomSystemParameter customSystemParameter = new CustomSystemParameter();
			customSystemParameter.setDemoValue(_ctx.stringValue("DescribeApiResponse.CustomSystemParameters["+ i +"].DemoValue"));
			customSystemParameter.setDescription(_ctx.stringValue("DescribeApiResponse.CustomSystemParameters["+ i +"].Description"));
			customSystemParameter.setParameterName(_ctx.stringValue("DescribeApiResponse.CustomSystemParameters["+ i +"].ParameterName"));
			customSystemParameter.setLocation(_ctx.stringValue("DescribeApiResponse.CustomSystemParameters["+ i +"].Location"));
			customSystemParameter.setServiceParameterName(_ctx.stringValue("DescribeApiResponse.CustomSystemParameters["+ i +"].ServiceParameterName"));

			customSystemParameters.add(customSystemParameter);
		}
		describeApiResponse.setCustomSystemParameters(customSystemParameters);

		List<ConstantParameter> constantParameters = new ArrayList<ConstantParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiResponse.ConstantParameters.Length"); i++) {
			ConstantParameter constantParameter = new ConstantParameter();
			constantParameter.setDescription(_ctx.stringValue("DescribeApiResponse.ConstantParameters["+ i +"].Description"));
			constantParameter.setLocation(_ctx.stringValue("DescribeApiResponse.ConstantParameters["+ i +"].Location"));
			constantParameter.setServiceParameterName(_ctx.stringValue("DescribeApiResponse.ConstantParameters["+ i +"].ServiceParameterName"));
			constantParameter.setConstantValue(_ctx.stringValue("DescribeApiResponse.ConstantParameters["+ i +"].ConstantValue"));

			constantParameters.add(constantParameter);
		}
		describeApiResponse.setConstantParameters(constantParameters);

		List<RequestParameter> requestParameters = new ArrayList<RequestParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiResponse.RequestParameters.Length"); i++) {
			RequestParameter requestParameter = new RequestParameter();
			requestParameter.setJsonScheme(_ctx.stringValue("DescribeApiResponse.RequestParameters["+ i +"].JsonScheme"));
			requestParameter.setMaxValue(_ctx.longValue("DescribeApiResponse.RequestParameters["+ i +"].MaxValue"));
			requestParameter.setArrayItemsType(_ctx.stringValue("DescribeApiResponse.RequestParameters["+ i +"].ArrayItemsType"));
			requestParameter.setMinValue(_ctx.longValue("DescribeApiResponse.RequestParameters["+ i +"].MinValue"));
			requestParameter.setDocShow(_ctx.stringValue("DescribeApiResponse.RequestParameters["+ i +"].DocShow"));
			requestParameter.setMaxLength(_ctx.longValue("DescribeApiResponse.RequestParameters["+ i +"].MaxLength"));
			requestParameter.setDefaultValue(_ctx.stringValue("DescribeApiResponse.RequestParameters["+ i +"].DefaultValue"));
			requestParameter.setApiParameterName(_ctx.stringValue("DescribeApiResponse.RequestParameters["+ i +"].ApiParameterName"));
			requestParameter.setEnumValue(_ctx.stringValue("DescribeApiResponse.RequestParameters["+ i +"].EnumValue"));
			requestParameter.setDemoValue(_ctx.stringValue("DescribeApiResponse.RequestParameters["+ i +"].DemoValue"));
			requestParameter.setRequired(_ctx.stringValue("DescribeApiResponse.RequestParameters["+ i +"].Required"));
			requestParameter.setDescription(_ctx.stringValue("DescribeApiResponse.RequestParameters["+ i +"].Description"));
			requestParameter.setParameterType(_ctx.stringValue("DescribeApiResponse.RequestParameters["+ i +"].ParameterType"));
			requestParameter.setRegularExpression(_ctx.stringValue("DescribeApiResponse.RequestParameters["+ i +"].RegularExpression"));
			requestParameter.setMinLength(_ctx.longValue("DescribeApiResponse.RequestParameters["+ i +"].MinLength"));
			requestParameter.setDocOrder(_ctx.integerValue("DescribeApiResponse.RequestParameters["+ i +"].DocOrder"));
			requestParameter.setLocation(_ctx.stringValue("DescribeApiResponse.RequestParameters["+ i +"].Location"));

			requestParameters.add(requestParameter);
		}
		describeApiResponse.setRequestParameters(requestParameters);

		List<ServiceParameter> serviceParameters = new ArrayList<ServiceParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiResponse.ServiceParameters.Length"); i++) {
			ServiceParameter serviceParameter = new ServiceParameter();
			serviceParameter.setLocation(_ctx.stringValue("DescribeApiResponse.ServiceParameters["+ i +"].Location"));
			serviceParameter.setParameterType(_ctx.stringValue("DescribeApiResponse.ServiceParameters["+ i +"].ParameterType"));
			serviceParameter.setServiceParameterName(_ctx.stringValue("DescribeApiResponse.ServiceParameters["+ i +"].ServiceParameterName"));

			serviceParameters.add(serviceParameter);
		}
		describeApiResponse.setServiceParameters(serviceParameters);

		List<ServiceParameterMap> serviceParametersMap = new ArrayList<ServiceParameterMap>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiResponse.ServiceParametersMap.Length"); i++) {
			ServiceParameterMap serviceParameterMap = new ServiceParameterMap();
			serviceParameterMap.setRequestParameterName(_ctx.stringValue("DescribeApiResponse.ServiceParametersMap["+ i +"].RequestParameterName"));
			serviceParameterMap.setServiceParameterName(_ctx.stringValue("DescribeApiResponse.ServiceParametersMap["+ i +"].ServiceParameterName"));

			serviceParametersMap.add(serviceParameterMap);
		}
		describeApiResponse.setServiceParametersMap(serviceParametersMap);

		List<DeployedInfo> deployedInfos = new ArrayList<DeployedInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiResponse.DeployedInfos.Length"); i++) {
			DeployedInfo deployedInfo = new DeployedInfo();
			deployedInfo.setStageName(_ctx.stringValue("DescribeApiResponse.DeployedInfos["+ i +"].StageName"));
			deployedInfo.setEffectiveVersion(_ctx.stringValue("DescribeApiResponse.DeployedInfos["+ i +"].EffectiveVersion"));
			deployedInfo.setDeployedStatus(_ctx.stringValue("DescribeApiResponse.DeployedInfos["+ i +"].DeployedStatus"));

			deployedInfos.add(deployedInfo);
		}
		describeApiResponse.setDeployedInfos(deployedInfos);

		List<Tag> tagList = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiResponse.TagList.Length"); i++) {
			Tag tag = new Tag();
			tag.setTagKey(_ctx.stringValue("DescribeApiResponse.TagList["+ i +"].TagKey"));
			tag.setTagValue(_ctx.stringValue("DescribeApiResponse.TagList["+ i +"].TagValue"));

			tagList.add(tag);
		}
		describeApiResponse.setTagList(tagList);
	 
	 	return describeApiResponse;
	}
}