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
public class UpdateAuthenticatorAttributeRequest extends RpcAcsRequest<UpdateAuthenticatorAttributeResponse> {
	   

	private String userId;

	private String authenticatorName;

	private String authenticatorUuid;

	private String applicationExternalId;
	public UpdateAuthenticatorAttributeRequest() {
		super("idaas-doraemon", "2021-05-20", "UpdateAuthenticatorAttribute");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getAuthenticatorName() {
		return this.authenticatorName;
	}

	public void setAuthenticatorName(String authenticatorName) {
		this.authenticatorName = authenticatorName;
		if(authenticatorName != null){
			putQueryParameter("AuthenticatorName", authenticatorName);
		}
	}

	public String getAuthenticatorUuid() {
		return this.authenticatorUuid;
	}

	public void setAuthenticatorUuid(String authenticatorUuid) {
		this.authenticatorUuid = authenticatorUuid;
		if(authenticatorUuid != null){
			putQueryParameter("AuthenticatorUuid", authenticatorUuid);
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
	public Class<UpdateAuthenticatorAttributeResponse> getResponseClass() {
		return UpdateAuthenticatorAttributeResponse.class;
	}

}
