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

package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyApiConfigurationRequest extends RpcAcsRequest<ModifyApiConfigurationResponse> {
	   

	private String contentTypeCategory;

	private String modelName;

	private String errorCodeSamples;

	private String appCodeAuthType;

	private String authType;

	private String httpConfig;

	private String serviceParameters;

	private String failResultSample;

	private String contentTypeValue;

	private String securityToken;

	private String visibility;

	private String requestProtocol;

	private String requestMode;

	private String backendName;

	private String requestPath;

	private String resultType;

	private String mockConfig;

	private String resultSample;

	private String bodyModel;

	private String vpcConfig;

	private String functionComputeConfig;

	private String apiId;

	private Boolean useBackendService;

	private String serviceProtocol;

	private String description;

	private Boolean disableInternet;

	private String postBodyDescription;

	private String allowSignatureMethod;

	private String requestHttpMethod;

	private String serviceParametersMap;

	private String requestParameters;

	private String bodyFormat;

	private String ossConfig;

	private String apiName;

	private Integer serviceTimeout;

	private Boolean forceNonceCheck;
	public ModifyApiConfigurationRequest() {
		super("CloudAPI", "2016-07-14", "ModifyApiConfiguration", "apigateway");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getContentTypeCategory() {
		return this.contentTypeCategory;
	}

	public void setContentTypeCategory(String contentTypeCategory) {
		this.contentTypeCategory = contentTypeCategory;
		if(contentTypeCategory != null){
			putQueryParameter("ContentTypeCategory", contentTypeCategory);
		}
	}

	public String getModelName() {
		return this.modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
		if(modelName != null){
			putQueryParameter("ModelName", modelName);
		}
	}

	public String getErrorCodeSamples() {
		return this.errorCodeSamples;
	}

	public void setErrorCodeSamples(String errorCodeSamples) {
		this.errorCodeSamples = errorCodeSamples;
		if(errorCodeSamples != null){
			putQueryParameter("ErrorCodeSamples", errorCodeSamples);
		}
	}

	public String getAppCodeAuthType() {
		return this.appCodeAuthType;
	}

	public void setAppCodeAuthType(String appCodeAuthType) {
		this.appCodeAuthType = appCodeAuthType;
		if(appCodeAuthType != null){
			putQueryParameter("AppCodeAuthType", appCodeAuthType);
		}
	}

	public String getAuthType() {
		return this.authType;
	}

	public void setAuthType(String authType) {
		this.authType = authType;
		if(authType != null){
			putQueryParameter("AuthType", authType);
		}
	}

	public String getHttpConfig() {
		return this.httpConfig;
	}

	public void setHttpConfig(String httpConfig) {
		this.httpConfig = httpConfig;
		if(httpConfig != null){
			putQueryParameter("HttpConfig", httpConfig);
		}
	}

	public String getServiceParameters() {
		return this.serviceParameters;
	}

	public void setServiceParameters(String serviceParameters) {
		this.serviceParameters = serviceParameters;
		if(serviceParameters != null){
			putQueryParameter("ServiceParameters", serviceParameters);
		}
	}

	public String getFailResultSample() {
		return this.failResultSample;
	}

	public void setFailResultSample(String failResultSample) {
		this.failResultSample = failResultSample;
		if(failResultSample != null){
			putQueryParameter("FailResultSample", failResultSample);
		}
	}

	public String getContentTypeValue() {
		return this.contentTypeValue;
	}

	public void setContentTypeValue(String contentTypeValue) {
		this.contentTypeValue = contentTypeValue;
		if(contentTypeValue != null){
			putQueryParameter("ContentTypeValue", contentTypeValue);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getVisibility() {
		return this.visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
		if(visibility != null){
			putQueryParameter("Visibility", visibility);
		}
	}

	public String getRequestProtocol() {
		return this.requestProtocol;
	}

	public void setRequestProtocol(String requestProtocol) {
		this.requestProtocol = requestProtocol;
		if(requestProtocol != null){
			putQueryParameter("RequestProtocol", requestProtocol);
		}
	}

	public String getRequestMode() {
		return this.requestMode;
	}

	public void setRequestMode(String requestMode) {
		this.requestMode = requestMode;
		if(requestMode != null){
			putQueryParameter("RequestMode", requestMode);
		}
	}

	public String getBackendName() {
		return this.backendName;
	}

	public void setBackendName(String backendName) {
		this.backendName = backendName;
		if(backendName != null){
			putQueryParameter("BackendName", backendName);
		}
	}

	public String getRequestPath() {
		return this.requestPath;
	}

	public void setRequestPath(String requestPath) {
		this.requestPath = requestPath;
		if(requestPath != null){
			putQueryParameter("RequestPath", requestPath);
		}
	}

	public String getResultType() {
		return this.resultType;
	}

	public void setResultType(String resultType) {
		this.resultType = resultType;
		if(resultType != null){
			putQueryParameter("ResultType", resultType);
		}
	}

	public String getMockConfig() {
		return this.mockConfig;
	}

	public void setMockConfig(String mockConfig) {
		this.mockConfig = mockConfig;
		if(mockConfig != null){
			putQueryParameter("MockConfig", mockConfig);
		}
	}

	public String getResultSample() {
		return this.resultSample;
	}

	public void setResultSample(String resultSample) {
		this.resultSample = resultSample;
		if(resultSample != null){
			putQueryParameter("ResultSample", resultSample);
		}
	}

	public String getBodyModel() {
		return this.bodyModel;
	}

	public void setBodyModel(String bodyModel) {
		this.bodyModel = bodyModel;
		if(bodyModel != null){
			putQueryParameter("BodyModel", bodyModel);
		}
	}

	public String getVpcConfig() {
		return this.vpcConfig;
	}

	public void setVpcConfig(String vpcConfig) {
		this.vpcConfig = vpcConfig;
		if(vpcConfig != null){
			putQueryParameter("VpcConfig", vpcConfig);
		}
	}

	public String getFunctionComputeConfig() {
		return this.functionComputeConfig;
	}

	public void setFunctionComputeConfig(String functionComputeConfig) {
		this.functionComputeConfig = functionComputeConfig;
		if(functionComputeConfig != null){
			putQueryParameter("FunctionComputeConfig", functionComputeConfig);
		}
	}

	public String getApiId() {
		return this.apiId;
	}

	public void setApiId(String apiId) {
		this.apiId = apiId;
		if(apiId != null){
			putQueryParameter("ApiId", apiId);
		}
	}

	public Boolean getUseBackendService() {
		return this.useBackendService;
	}

	public void setUseBackendService(Boolean useBackendService) {
		this.useBackendService = useBackendService;
		if(useBackendService != null){
			putQueryParameter("UseBackendService", useBackendService.toString());
		}
	}

	public String getServiceProtocol() {
		return this.serviceProtocol;
	}

	public void setServiceProtocol(String serviceProtocol) {
		this.serviceProtocol = serviceProtocol;
		if(serviceProtocol != null){
			putQueryParameter("ServiceProtocol", serviceProtocol);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Boolean getDisableInternet() {
		return this.disableInternet;
	}

	public void setDisableInternet(Boolean disableInternet) {
		this.disableInternet = disableInternet;
		if(disableInternet != null){
			putQueryParameter("DisableInternet", disableInternet.toString());
		}
	}

	public String getPostBodyDescription() {
		return this.postBodyDescription;
	}

	public void setPostBodyDescription(String postBodyDescription) {
		this.postBodyDescription = postBodyDescription;
		if(postBodyDescription != null){
			putQueryParameter("PostBodyDescription", postBodyDescription);
		}
	}

	public String getAllowSignatureMethod() {
		return this.allowSignatureMethod;
	}

	public void setAllowSignatureMethod(String allowSignatureMethod) {
		this.allowSignatureMethod = allowSignatureMethod;
		if(allowSignatureMethod != null){
			putQueryParameter("AllowSignatureMethod", allowSignatureMethod);
		}
	}

	public String getRequestHttpMethod() {
		return this.requestHttpMethod;
	}

	public void setRequestHttpMethod(String requestHttpMethod) {
		this.requestHttpMethod = requestHttpMethod;
		if(requestHttpMethod != null){
			putQueryParameter("RequestHttpMethod", requestHttpMethod);
		}
	}

	public String getServiceParametersMap() {
		return this.serviceParametersMap;
	}

	public void setServiceParametersMap(String serviceParametersMap) {
		this.serviceParametersMap = serviceParametersMap;
		if(serviceParametersMap != null){
			putQueryParameter("ServiceParametersMap", serviceParametersMap);
		}
	}

	public String getRequestParameters() {
		return this.requestParameters;
	}

	public void setRequestParameters(String requestParameters) {
		this.requestParameters = requestParameters;
		if(requestParameters != null){
			putQueryParameter("RequestParameters", requestParameters);
		}
	}

	public String getBodyFormat() {
		return this.bodyFormat;
	}

	public void setBodyFormat(String bodyFormat) {
		this.bodyFormat = bodyFormat;
		if(bodyFormat != null){
			putQueryParameter("BodyFormat", bodyFormat);
		}
	}

	public String getOssConfig() {
		return this.ossConfig;
	}

	public void setOssConfig(String ossConfig) {
		this.ossConfig = ossConfig;
		if(ossConfig != null){
			putQueryParameter("OssConfig", ossConfig);
		}
	}

	public String getApiName() {
		return this.apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
		if(apiName != null){
			putQueryParameter("ApiName", apiName);
		}
	}

	public Integer getServiceTimeout() {
		return this.serviceTimeout;
	}

	public void setServiceTimeout(Integer serviceTimeout) {
		this.serviceTimeout = serviceTimeout;
		if(serviceTimeout != null){
			putQueryParameter("ServiceTimeout", serviceTimeout.toString());
		}
	}

	public Boolean getForceNonceCheck() {
		return this.forceNonceCheck;
	}

	public void setForceNonceCheck(Boolean forceNonceCheck) {
		this.forceNonceCheck = forceNonceCheck;
		if(forceNonceCheck != null){
			putQueryParameter("ForceNonceCheck", forceNonceCheck.toString());
		}
	}

	@Override
	public Class<ModifyApiConfigurationResponse> getResponseClass() {
		return ModifyApiConfigurationResponse.class;
	}

}
