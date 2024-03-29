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
public class VerifyUserAuthenticationRequest extends RpcAcsRequest<VerifyUserAuthenticationResponse> {
	   

	private String logParams;

	private String clientExtendParamsJson;

	private String userId;

	private String logTag;

	private String serverExtendParamsJson;

	private String requireBindHashBase64;

	private String authenticationContext;

	private String requireChallengeBase64;

	private String authenticatorType;

	private String clientExtendParamsJsonSign;

	private String userSourceIp;

	private String applicationExternalId;
	public VerifyUserAuthenticationRequest() {
		super("idaas-doraemon", "2021-05-20", "VerifyUserAuthentication", "idaasauth");
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

	public String getLogTag() {
		return this.logTag;
	}

	public void setLogTag(String logTag) {
		this.logTag = logTag;
		if(logTag != null){
			putQueryParameter("LogTag", logTag);
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

	public String getRequireBindHashBase64() {
		return this.requireBindHashBase64;
	}

	public void setRequireBindHashBase64(String requireBindHashBase64) {
		this.requireBindHashBase64 = requireBindHashBase64;
		if(requireBindHashBase64 != null){
			putQueryParameter("RequireBindHashBase64", requireBindHashBase64);
		}
	}

	public String getAuthenticationContext() {
		return this.authenticationContext;
	}

	public void setAuthenticationContext(String authenticationContext) {
		this.authenticationContext = authenticationContext;
		if(authenticationContext != null){
			putQueryParameter("AuthenticationContext", authenticationContext);
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
	public Class<VerifyUserAuthenticationResponse> getResponseClass() {
		return VerifyUserAuthenticationResponse.class;
	}

}
