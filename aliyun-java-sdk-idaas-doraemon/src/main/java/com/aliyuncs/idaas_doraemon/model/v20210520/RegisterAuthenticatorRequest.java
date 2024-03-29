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

package com.aliyuncs.idaas_doraemon.model.v20210520;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.idaas_doraemon.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RegisterAuthenticatorRequest extends RpcAcsRequest<RegisterAuthenticatorResponse> {
	   

	private String logParams;

	private String clientExtendParamsJson;

	private String userId;

	private String serverExtendParamsJson;

	private String registrationContext;

	private String authenticatorName;

	private String requireChallengeBase64;

	private String authenticatorType;

	private String clientExtendParamsJsonSign;

	private String userSourceIp;

	private String applicationExternalId;
	public RegisterAuthenticatorRequest() {
		super("idaas-doraemon", "2021-05-20", "RegisterAuthenticator", "idaasauth");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getLogParams() {
		return this.logParams;
	}

	public void setLogParams(String logParams) {
		this.logParams = logParams;
		if(logParams != null){
			putQueryParameter("LogParams", logParams);
		}
	}

	public String getClientExtendParamsJson() {
		return this.clientExtendParamsJson;
	}

	public void setClientExtendParamsJson(String clientExtendParamsJson) {
		this.clientExtendParamsJson = clientExtendParamsJson;
		if(clientExtendParamsJson != null){
			putQueryParameter("ClientExtendParamsJson", clientExtendParamsJson);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public String getServerExtendParamsJson() {
		return this.serverExtendParamsJson;
	}

	public void setServerExtendParamsJson(String serverExtendParamsJson) {
		this.serverExtendParamsJson = serverExtendParamsJson;
		if(serverExtendParamsJson != null){
			putQueryParameter("ServerExtendParamsJson", serverExtendParamsJson);
		}
	}

	public String getRegistrationContext() {
		return this.registrationContext;
	}

	public void setRegistrationContext(String registrationContext) {
		this.registrationContext = registrationContext;
		if(registrationContext != null){
			putQueryParameter("RegistrationContext", registrationContext);
		}
	}

	public String getAuthenticatorName() {
		return this.authenticatorName;
	}

	public void setAuthenticatorName(String authenticatorName) {
		this.authenticatorName = authenticatorName;
		if(authenticatorName != null){
			putQueryParameter("AuthenticatorName", authenticatorName);
		}
	}

	public String getRequireChallengeBase64() {
		return this.requireChallengeBase64;
	}

	public void setRequireChallengeBase64(String requireChallengeBase64) {
		this.requireChallengeBase64 = requireChallengeBase64;
		if(requireChallengeBase64 != null){
			putQueryParameter("RequireChallengeBase64", requireChallengeBase64);
		}
	}

	public String getAuthenticatorType() {
		return this.authenticatorType;
	}

	public void setAuthenticatorType(String authenticatorType) {
		this.authenticatorType = authenticatorType;
		if(authenticatorType != null){
			putQueryParameter("AuthenticatorType", authenticatorType);
		}
	}

	public String getClientExtendParamsJsonSign() {
		return this.clientExtendParamsJsonSign;
	}

	public void setClientExtendParamsJsonSign(String clientExtendParamsJsonSign) {
		this.clientExtendParamsJsonSign = clientExtendParamsJsonSign;
		if(clientExtendParamsJsonSign != null){
			putQueryParameter("ClientExtendParamsJsonSign", clientExtendParamsJsonSign);
		}
	}

	public String getUserSourceIp() {
		return this.userSourceIp;
	}

	public void setUserSourceIp(String userSourceIp) {
		this.userSourceIp = userSourceIp;
		if(userSourceIp != null){
			putQueryParameter("UserSourceIp", userSourceIp);
		}
	}

	public String getApplicationExternalId() {
		return this.applicationExternalId;
	}

	public void setApplicationExternalId(String applicationExternalId) {
		this.applicationExternalId = applicationExternalId;
		if(applicationExternalId != null){
			putQueryParameter("ApplicationExternalId", applicationExternalId);
		}
	}

	@Override
	public Class<RegisterAuthenticatorResponse> getResponseClass() {
		return RegisterAuthenticatorResponse.class;
	}

}
