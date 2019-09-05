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
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.ConstantParameter;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.CustomSystemParameter;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.DeployedInfo;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.ErrorCodeSample;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.OpenIdConnectConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.RequestConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.RequestParameter;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.ResultDescription;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.ServiceConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.ServiceConfig.FunctionComputeConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.ServiceConfig.MockHeader;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.ServiceConfig.VpcConfig;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.ServiceParameter;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.ServiceParameterMap;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiResponse.SystemParameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApiResponseUnmarshaller {

	public static DescribeApiResponse unmarshall(DescribeApiResponse describeApiResponse, UnmarshallerContext _ctx) {
		
		describeApiResponse.setRequestId(_ctx.stringValue("DescribeApiResponse.RequestId"));
		describeApiResponse.setRegionId(_ctx.stringValue("DescribeApiResponse.RegionId"));
		describeApiResponse.setApiId(_ctx.stringValue("DescribeApiResponse.ApiId"));
		describeApiResponse.setApiName(_ctx.stringValue("DescribeApiResponse.ApiName"));
		describeApiResponse.setGroupId(_ctx.stringValue("DescribeApiResponse.GroupId"));
		describeApiResponse.setGroupName(_ctx.stringValue("DescribeApiResponse.GroupName"));
		describeApiResponse.setVisibility(_ctx.stringValue("DescribeApiResponse.Visibility"));
		describeApiResponse.setAuthType(_ctx.stringValue("DescribeApiResponse.AuthType"));
		describeApiResponse.setResultType(_ctx.stringValue("DescribeApiResponse.ResultType"));
		describeApiResponse.setResultSample(_ctx.stringValue("DescribeApiResponse.ResultSample"));
		describeApiResponse.setFailResultSample(_ctx.stringValue("DescribeApiResponse.FailResultSample"));
		describeApiResponse.setCreatedTime(_ctx.stringValue("DescribeApiResponse.CreatedTime"));
		describeApiResponse.setModifiedTime(_ctx.stringValue("DescribeApiResponse.ModifiedTime"));
		describeApiResponse.setDescription(_ctx.stringValue("DescribeApiResponse.Description"));
		describeApiResponse.setMock(_ctx.stringValue("DescribeApiResponse.Mock"));
		describeApiResponse.setMockResult(_ctx.stringValue("DescribeApiResponse.MockResult"));
		describeApiResponse.setAllowSignatureMethod(_ctx.stringValue("DescribeApiResponse.AllowSignatureMethod"));
		describeApiResponse.setWebSocketApiType(_ctx.stringValue("DescribeApiResponse.WebSocketApiType"));
		describeApiResponse.setResultBodyModel(_ctx.stringValue("DescribeApiResponse.ResultBodyModel"));
		describeApiResponse.setForceNonceCheck(_ctx.booleanValue("DescribeApiResponse.ForceNonceCheck"));
		describeApiResponse.setDisableInternet(_ctx.booleanValue("DescribeApiResponse.DisableInternet"));

		RequestConfig requestConfig = new RequestConfig();
		requestConfig.setRequestProtocol(_ctx.stringValue("DescribeApiResponse.RequestConfig.RequestProtocol"));
		requestConfig.setRequestHttpMethod(_ctx.stringValue("DescribeApiResponse.RequestConfig.RequestHttpMethod"));
		requestConfig.setRequestPath(_ctx.stringValue("DescribeApiResponse.RequestConfig.RequestPath"));
		requestConfig.setBodyFormat(_ctx.stringValue("DescribeApiResponse.RequestConfig.BodyFormat"));
		requestConfig.setPostBodyDescription(_ctx.stringValue("DescribeApiResponse.RequestConfig.PostBodyDescription"));
		requestConfig.setRequestMode(_ctx.stringValue("DescribeApiResponse.RequestConfig.RequestMode"));
		requestConfig.setBodyModel(_ctx.stringValue("DescribeApiResponse.RequestConfig.BodyModel"));
		describeApiResponse.setRequestConfig(requestConfig);

		ServiceConfig serviceConfig = new ServiceConfig();
		serviceConfig.setServiceProtocol(_ctx.stringValue("DescribeApiResponse.ServiceConfig.ServiceProtocol"));
		serviceConfig.setServiceAddress(_ctx.stringValue("DescribeApiResponse.ServiceConfig.ServiceAddress"));
		serviceConfig.setServiceHttpMethod(_ctx.stringValue("DescribeApiResponse.ServiceConfig.ServiceHttpMethod"));
		serviceConfig.setServicePath(_ctx.stringValue("DescribeApiResponse.ServiceConfig.ServicePath"));
		serviceConfig.setServiceTimeout(_ctx.integerValue("DescribeApiResponse.ServiceConfig.ServiceTimeout"));
		serviceConfig.setContentTypeCatagory(_ctx.stringValue("DescribeApiResponse.ServiceConfig.ContentTypeCatagory"));
		serviceConfig.setContentTypeValue(_ctx.stringValue("DescribeApiResponse.ServiceConfig.ContentTypeValue"));
		serviceConfig.setMock(_ctx.stringValue("DescribeApiResponse.ServiceConfig.Mock"));
		serviceConfig.setMockResult(_ctx.stringValue("DescribeApiResponse.ServiceConfig.MockResult"));
		serviceConfig.setServiceVpcEnable(_ctx.stringValue("DescribeApiResponse.ServiceConfig.ServiceVpcEnable"));
		serviceConfig.setAoneAppName(_ctx.stringValue("DescribeApiResponse.ServiceConfig.AoneAppName"));
		serviceConfig.setMockStatusCode(_ctx.integerValue("DescribeApiResponse.ServiceConfig.MockStatusCode"));

		VpcConfig vpcConfig = new VpcConfig();
		vpcConfig.setName(_ctx.stringValue("DescribeApiResponse.ServiceConfig.VpcConfig.Name"));
		vpcConfig.setVpcId(_ctx.stringValue("DescribeApiResponse.ServiceConfig.VpcConfig.VpcId"));
		vpcConfig.setInstanceId(_ctx.stringValue("DescribeApiResponse.ServiceConfig.VpcConfig.InstanceId"));
		vpcConfig.setPort(_ctx.integerValue("DescribeApiResponse.ServiceConfig.VpcConfig.Port"));
		serviceConfig.setVpcConfig(vpcConfig);

		FunctionComputeConfig functionComputeConfig = new FunctionComputeConfig();
		functionComputeConfig.setRegionId(_ctx.stringValue("DescribeApiResponse.ServiceConfig.FunctionComputeConfig.RegionId"));
		functionComputeConfig.setServiceName(_ctx.stringValue("DescribeApiResponse.ServiceConfig.FunctionComputeConfig.ServiceName"));
		functionComputeConfig.setFunctionName(_ctx.stringValue("DescribeApiResponse.ServiceConfig.FunctionComputeConfig.FunctionName"));
		functionComputeConfig.setRoleArn(_ctx.stringValue("DescribeApiResponse.ServiceConfig.FunctionComputeConfig.RoleArn"));
		serviceConfig.setFunctionComputeConfig(functionComputeConfig);

		List<MockHeader> mockHeaders = new ArrayList<MockHeader>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiResponse.ServiceConfig.MockHeaders.Length"); i++) {
			MockHeader mockHeader = new MockHeader();
			mockHeader.setHeaderName(_ctx.stringValue("DescribeApiResponse.ServiceConfig.MockHeaders["+ i +"].HeaderName"));
			mockHeader.setHeaderValue(_ctx.stringValue("DescribeApiResponse.ServiceConfig.MockHeaders["+ i +"].HeaderValue"));

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
			errorCodeSample.setMessage(_ctx.stringValue("DescribeApiResponse.ErrorCodeSamples["+ i +"].Message"));
			errorCodeSample.setDescription(_ctx.stringValue("DescribeApiResponse.ErrorCodeSamples["+ i +"].Description"));
			errorCodeSample.setModel(_ctx.stringValue("DescribeApiResponse.ErrorCodeSamples["+ i +"].Model"));

			errorCodeSamples.add(errorCodeSample);
		}
		describeApiResponse.setErrorCodeSamples(errorCodeSamples);

		List<ResultDescription> resultDescriptions = new ArrayList<ResultDescription>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiResponse.ResultDescriptions.Length"); i++) {
			ResultDescription resultDescription = new ResultDescription();
			resultDescription.setId(_ctx.stringValue("DescribeApiResponse.ResultDescriptions["+ i +"].Id"));
			resultDescription.setPid(_ctx.stringValue("DescribeApiResponse.ResultDescriptions["+ i +"].Pid"));
			resultDescription.setHasChild(_ctx.booleanValue("DescribeApiResponse.ResultDescriptions["+ i +"].HasChild"));
			resultDescription.setKey(_ctx.stringValue("DescribeApiResponse.ResultDescriptions["+ i +"].Key"));
			resultDescription.setName(_ctx.stringValue("DescribeApiResponse.ResultDescriptions["+ i +"].Name"));
			resultDescription.setMandatory(_ctx.booleanValue("DescribeApiResponse.ResultDescriptions["+ i +"].Mandatory"));
			resultDescription.setType(_ctx.stringValue("DescribeApiResponse.ResultDescriptions["+ i +"].Type"));
			resultDescription.setDescription(_ctx.stringValue("DescribeApiResponse.ResultDescriptions["+ i +"].Description"));

			resultDescriptions.add(resultDescription);
		}
		describeApiResponse.setResultDescriptions(resultDescriptions);

		List<SystemParameter> systemParameters = new ArrayList<SystemParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiResponse.SystemParameters.Length"); i++) {
			SystemParameter systemParameter = new SystemParameter();
			systemParameter.setParameterName(_ctx.stringValue("DescribeApiResponse.SystemParameters["+ i +"].ParameterName"));
			systemParameter.setServiceParameterName(_ctx.stringValue("DescribeApiResponse.SystemParameters["+ i +"].ServiceParameterName"));
			systemParameter.setLocation(_ctx.stringValue("DescribeApiResponse.SystemParameters["+ i +"].Location"));
			systemParameter.setDemoValue(_ctx.stringValue("DescribeApiResponse.SystemParameters["+ i +"].DemoValue"));
			systemParameter.setDescription(_ctx.stringValue("DescribeApiResponse.SystemParameters["+ i +"].Description"));

			systemParameters.add(systemParameter);
		}
		describeApiResponse.setSystemParameters(systemParameters);

		List<CustomSystemParameter> customSystemParameters = new ArrayList<CustomSystemParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiResponse.CustomSystemParameters.Length"); i++) {
			CustomSystemParameter customSystemParameter = new CustomSystemParameter();
			customSystemParameter.setParameterName(_ctx.stringValue("DescribeApiResponse.CustomSystemParameters["+ i +"].ParameterName"));
			customSystemParameter.setServiceParameterName(_ctx.stringValue("DescribeApiResponse.CustomSystemParameters["+ i +"].ServiceParameterName"));
			customSystemParameter.setLocation(_ctx.stringValue("DescribeApiResponse.CustomSystemParameters["+ i +"].Location"));
			customSystemParameter.setDemoValue(_ctx.stringValue("DescribeApiResponse.CustomSystemParameters["+ i +"].DemoValue"));
			customSystemParameter.setDescription(_ctx.stringValue("DescribeApiResponse.CustomSystemParameters["+ i +"].Description"));

			customSystemParameters.add(customSystemParameter);
		}
		describeApiResponse.setCustomSystemParameters(customSystemParameters);

		List<ConstantParameter> constantParameters = new ArrayList<ConstantParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiResponse.ConstantParameters.Length"); i++) {
			ConstantParameter constantParameter = new ConstantParameter();
			constantParameter.setServiceParameterName(_ctx.stringValue("DescribeApiResponse.ConstantParameters["+ i +"].ServiceParameterName"));
			constantParameter.setConstantValue(_ctx.stringValue("DescribeApiResponse.ConstantParameters["+ i +"].ConstantValue"));
			constantParameter.setLocation(_ctx.stringValue("DescribeApiResponse.ConstantParameters["+ i +"].Location"));
			constantParameter.setDescription(_ctx.stringValue("DescribeApiResponse.ConstantParameters["+ i +"].Description"));

			constantParameters.add(constantParameter);
		}
		describeApiResponse.setConstantParameters(constantParameters);

		List<RequestParameter> requestParameters = new ArrayList<RequestParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiResponse.RequestParameters.Length"); i++) {
			RequestParameter requestParameter = new RequestParameter();
			requestParameter.setApiParameterName(_ctx.stringValue("DescribeApiResponse.RequestParameters["+ i +"].ApiParameterName"));
			requestParameter.setLocation(_ctx.stringValue("DescribeApiResponse.RequestParameters["+ i +"].Location"));
			requestParameter.setParameterType(_ctx.stringValue("DescribeApiResponse.RequestParameters["+ i +"].ParameterType"));
			requestParameter.setRequired(_ctx.stringValue("DescribeApiResponse.RequestParameters["+ i +"].Required"));
			requestParameter.setDefaultValue(_ctx.stringValue("DescribeApiResponse.RequestParameters["+ i +"].DefaultValue"));
			requestParameter.setDemoValue(_ctx.stringValue("DescribeApiResponse.RequestParameters["+ i +"].DemoValue"));
			requestParameter.setMaxValue(_ctx.longValue("DescribeApiResponse.RequestParameters["+ i +"].MaxValue"));
			requestParameter.setMinValue(_ctx.longValue("DescribeApiResponse.RequestParameters["+ i +"].MinValue"));
			requestParameter.setMaxLength(_ctx.longValue("DescribeApiResponse.RequestParameters["+ i +"].MaxLength"));
			requestParameter.setMinLength(_ctx.longValue("DescribeApiResponse.RequestParameters["+ i +"].MinLength"));
			requestParameter.setRegularExpression(_ctx.stringValue("DescribeApiResponse.RequestParameters["+ i +"].RegularExpression"));
			requestParameter.setJsonScheme(_ctx.stringValue("DescribeApiResponse.RequestParameters["+ i +"].JsonScheme"));
			requestParameter.setEnumValue(_ctx.stringValue("DescribeApiResponse.RequestParameters["+ i +"].EnumValue"));
			requestParameter.setDocShow(_ctx.stringValue("DescribeApiResponse.RequestParameters["+ i +"].DocShow"));
			requestParameter.setDocOrder(_ctx.integerValue("DescribeApiResponse.RequestParameters["+ i +"].DocOrder"));
			requestParameter.setDescription(_ctx.stringValue("DescribeApiResponse.RequestParameters["+ i +"].Description"));

			requestParameters.add(requestParameter);
		}
		describeApiResponse.setRequestParameters(requestParameters);

		List<ServiceParameter> serviceParameters = new ArrayList<ServiceParameter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiResponse.ServiceParameters.Length"); i++) {
			ServiceParameter serviceParameter = new ServiceParameter();
			serviceParameter.setServiceParameterName(_ctx.stringValue("DescribeApiResponse.ServiceParameters["+ i +"].ServiceParameterName"));
			serviceParameter.setLocation(_ctx.stringValue("DescribeApiResponse.ServiceParameters["+ i +"].Location"));
			serviceParameter.setParameterType(_ctx.stringValue("DescribeApiResponse.ServiceParameters["+ i +"].ParameterType"));

			serviceParameters.add(serviceParameter);
		}
		describeApiResponse.setServiceParameters(serviceParameters);

		List<ServiceParameterMap> serviceParametersMap = new ArrayList<ServiceParameterMap>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiResponse.ServiceParametersMap.Length"); i++) {
			ServiceParameterMap serviceParameterMap = new ServiceParameterMap();
			serviceParameterMap.setServiceParameterName(_ctx.stringValue("DescribeApiResponse.ServiceParametersMap["+ i +"].ServiceParameterName"));
			serviceParameterMap.setRequestParameterName(_ctx.stringValue("DescribeApiResponse.ServiceParametersMap["+ i +"].RequestParameterName"));

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
	 
	 	return describeApiResponse;
	}
}