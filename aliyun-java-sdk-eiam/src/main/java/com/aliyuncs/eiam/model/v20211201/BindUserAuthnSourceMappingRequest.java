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

package com.aliyuncs.eiam.model.v20211201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class BindUserAuthnSourceMappingRequest extends RpcAcsRequest<BindUserAuthnSourceMappingResponse> {
	   

	private String userId;

	private String identityProviderId;

	private String userExternalId;

	private String instanceId;
	public BindUserAuthnSourceMappingRequest() {
		super("Eiam", "2021-12-01", "BindUserAuthnSourceMapping", "eiam");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
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

	public String getIdentityProviderId() {
		return this.identityProviderId;
	}

	public void setIdentityProviderId(String identityProviderId) {
		this.identityProviderId = identityProviderId;
		if(identityProviderId != null){
			putQueryParameter("IdentityProviderId", identityProviderId);
		}
	}

	public String getUserExternalId() {
		return this.userExternalId;
	}

	public void setUserExternalId(String userExternalId) {
		this.userExternalId = userExternalId;
		if(userExternalId != null){
			putQueryParameter("UserExternalId", userExternalId);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	@Override
	public Class<BindUserAuthnSourceMappingResponse> getResponseClass() {
		return BindUserAuthnSourceMappingResponse.class;
	}

}
