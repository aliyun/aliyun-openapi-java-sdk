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
public class CreateBackendRequest extends RpcAcsRequest<CreateBackendResponse> {
	   

	private String description;

	private String backendName;

	private Boolean createEventBridgeServiceLinkedRole;

	private String securityToken;

	private String backendType;
	public CreateBackendRequest() {
		super("CloudAPI", "2016-07-14", "CreateBackend", "apigateway");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getBackendName() {
		return this.backendName;
	}

	public void setBackendName(String backendName) {
		this.backendName = backendName;
		if(backendName != null){
			putQueryParameter("BackendName", backendName);
		}
	}

	public Boolean getCreateEventBridgeServiceLinkedRole() {
		return this.createEventBridgeServiceLinkedRole;
	}

	public void setCreateEventBridgeServiceLinkedRole(Boolean createEventBridgeServiceLinkedRole) {
		this.createEventBridgeServiceLinkedRole = createEventBridgeServiceLinkedRole;
		if(createEventBridgeServiceLinkedRole != null){
			putQueryParameter("CreateEventBridgeServiceLinkedRole", createEventBridgeServiceLinkedRole.toString());
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

	public String getBackendType() {
		return this.backendType;
	}

	public void setBackendType(String backendType) {
		this.backendType = backendType;
		if(backendType != null){
			putQueryParameter("BackendType", backendType);
		}
	}

	@Override
	public Class<CreateBackendResponse> getResponseClass() {
		return CreateBackendResponse.class;
	}

}
