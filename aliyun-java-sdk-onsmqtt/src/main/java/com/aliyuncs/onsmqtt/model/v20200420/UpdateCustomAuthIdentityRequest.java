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

package com.aliyuncs.onsmqtt.model.v20200420;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.onsmqtt.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateCustomAuthIdentityRequest extends RpcAcsRequest<UpdateCustomAuthIdentityResponse> {
	   

	private String clientId;

	private String identityType;

	private String secret;

	private String instanceId;

	private String signMode;

	private String username;
	public UpdateCustomAuthIdentityRequest() {
		super("OnsMqtt", "2020-04-20", "UpdateCustomAuthIdentity", "onsmqtt");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
		if(clientId != null){
			putBodyParameter("ClientId", clientId);
		}
	}

	public String getIdentityType() {
		return this.identityType;
	}

	public void setIdentityType(String identityType) {
		this.identityType = identityType;
		if(identityType != null){
			putBodyParameter("IdentityType", identityType);
		}
	}

	public String getSecret() {
		return this.secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
		if(secret != null){
			putBodyParameter("Secret", secret);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getSignMode() {
		return this.signMode;
	}

	public void setSignMode(String signMode) {
		this.signMode = signMode;
		if(signMode != null){
			putBodyParameter("SignMode", signMode);
		}
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
		if(username != null){
			putBodyParameter("Username", username);
		}
	}

	@Override
	public Class<UpdateCustomAuthIdentityResponse> getResponseClass() {
		return UpdateCustomAuthIdentityResponse.class;
	}

}
