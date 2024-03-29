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
public class CreateAuthenticatorRegistrationRequest extends RpcAcsRequest<CreateAuthenticatorRegistrationResponse> {
	   

	private String clientExtendParamsJson;

	private String userId;

	private String userDisplayName;

	private String serverExtendParamsJson;

	private String registrationContext;

	private String authenticatorType;

	private String clientExtendParamsJsonSign;

	private String applicationExternalId;

	private String userName;
	public CreateAuthenticatorRegistrationRequest() {
		super("idaas-doraemon", "2021-05-20", "CreateAuthenticatorRegistration", "idaasauth");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getUserDisplayName() {
		return this.userDisplayName;
	}

	public void setUserDisplayName(String userDisplayName) {
		this.userDisplayName = userDisplayName;
		if(userDisplayName != null){
			putQueryParameter("UserDisplayName", userDisplayName);
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

	public String getApplicationExternalId() {
		return this.applicationExternalId;
	}

	public void setApplicationExternalId(String applicationExternalId) {
		this.applicationExternalId = applicationExternalId;
		if(applicationExternalId != null){
			putQueryParameter("ApplicationExternalId", applicationExternalId);
		}
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putQueryParameter("UserName", userName);
		}
	}

	@Override
	public Class<CreateAuthenticatorRegistrationResponse> getResponseClass() {
		return CreateAuthenticatorRegistrationResponse.class;
	}

}
