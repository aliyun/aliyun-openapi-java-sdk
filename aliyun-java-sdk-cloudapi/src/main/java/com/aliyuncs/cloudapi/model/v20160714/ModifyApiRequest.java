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
public class ModifyApiRequest extends RpcAcsRequest<ModifyApiResponse> {
	
	public ModifyApiRequest() {
		super("CloudAPI", "2016-07-14", "ModifyApi", "apigateway");
		setSysMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String webSocketApiType;

	private String errorCodeSamples;

	private String appCodeAuthType;

	private String description;

	private Boolean disableInternet;

	private String constantParameters;

	private String authType;

	private String allowSignatureMethod;

	private String serviceParameters;

	private String failResultSample;

	private String systemParameters;

	private String serviceParametersMap;

	private String securityToken;

	private String openIdConnectConfig;

	private String requestParameters;

	private String resultDescriptions;

	private String visibility;

	private String groupId;

	private String serviceConfig;

	private String resultType;

	private String apiName;

	private String resultSample;

	private Boolean forceNonceCheck;

	private String requestConfig;

	private String resultBodyModel;

	private String apiId;

	public String getWebSocketApiType() {
		return this.webSocketApiType;
	}

	public void setWebSocketApiType(String webSocketApiType) {
		this.webSocketApiType = webSocketApiType;
		if(webSocketApiType != null){
			putQueryParameter("WebSocketApiType", webSocketApiType);
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

	public String getConstantParameters() {
		return this.constantParameters;
	}

	public void setConstantParameters(String constantParameters) {
		this.constantParameters = constantParameters;
		if(constantParameters != null){
			putQueryParameter("ConstantParameters", constantParameters);
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

	public String getAllowSignatureMethod() {
		return this.allowSignatureMethod;
	}

	public void setAllowSignatureMethod(String allowSignatureMethod) {
		this.allowSignatureMethod = allowSignatureMethod;
		if(allowSignatureMethod != null){
			putQueryParameter("AllowSignatureMethod", allowSignatureMethod);
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

	public String getSystemParameters() {
		return this.systemParameters;
	}

	public void setSystemParameters(String systemParameters) {
		this.systemParameters = systemParameters;
		if(systemParameters != null){
			putQueryParameter("SystemParameters", systemParameters);
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

	public String getBizSecurityToken() {
		return this.securityToken;
	}

	public void setBizSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	/**
	 * @deprecated use getBizSecurityToken instead of this.
	 */
	@Deprecated
	public String getSecurityToken() {
		return this.securityToken;
	}

	/**
	 * @deprecated use setBizSecurityToken instead of this.
	 */
	@Deprecated
	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getOpenIdConnectConfig() {
		return this.openIdConnectConfig;
	}

	public void setOpenIdConnectConfig(String openIdConnectConfig) {
		this.openIdConnectConfig = openIdConnectConfig;
		if(openIdConnectConfig != null){
			putQueryParameter("OpenIdConnectConfig", openIdConnectConfig);
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

	public String getResultDescriptions() {
		return this.resultDescriptions;
	}

	public void setResultDescriptions(String resultDescriptions) {
		this.resultDescriptions = resultDescriptions;
		if(resultDescriptions != null){
			putQueryParameter("ResultDescriptions", resultDescriptions);
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

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public String getServiceConfig() {
		return this.serviceConfig;
	}

	public void setServiceConfig(String serviceConfig) {
		this.serviceConfig = serviceConfig;
		if(serviceConfig != null){
			putQueryParameter("ServiceConfig", serviceConfig);
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

	public String getApiName() {
		return this.apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
		if(apiName != null){
			putQueryParameter("ApiName", apiName);
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

	public Boolean getForceNonceCheck() {
		return this.forceNonceCheck;
	}

	public void setForceNonceCheck(Boolean forceNonceCheck) {
		this.forceNonceCheck = forceNonceCheck;
		if(forceNonceCheck != null){
			putQueryParameter("ForceNonceCheck", forceNonceCheck.toString());
		}
	}

	public String getRequestConfig() {
		return this.requestConfig;
	}

	public void setRequestConfig(String requestConfig) {
		this.requestConfig = requestConfig;
		if(requestConfig != null){
			putQueryParameter("RequestConfig", requestConfig);
		}
	}

	public String getResultBodyModel() {
		return this.resultBodyModel;
	}

	public void setResultBodyModel(String resultBodyModel) {
		this.resultBodyModel = resultBodyModel;
		if(resultBodyModel != null){
			putQueryParameter("ResultBodyModel", resultBodyModel);
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

	@Override
	public Class<ModifyApiResponse> getResponseClass() {
		return ModifyApiResponse.class;
	}

}
