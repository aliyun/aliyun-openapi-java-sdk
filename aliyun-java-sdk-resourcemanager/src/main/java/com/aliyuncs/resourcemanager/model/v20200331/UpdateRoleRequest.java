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

package com.aliyuncs.resourcemanager.model.v20200331;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.resourcemanager.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateRoleRequest extends RpcAcsRequest<UpdateRoleResponse> {
	   

	private String newAssumeRolePolicyDocument;

	private String roleName;

	private Long newMaxSessionDuration;
	public UpdateRoleRequest() {
		super("ResourceManager", "2020-03-31", "UpdateRole", "resourcemanager");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNewAssumeRolePolicyDocument() {
		return this.newAssumeRolePolicyDocument;
	}

	public void setNewAssumeRolePolicyDocument(String newAssumeRolePolicyDocument) {
		this.newAssumeRolePolicyDocument = newAssumeRolePolicyDocument;
		if(newAssumeRolePolicyDocument != null){
			putQueryParameter("NewAssumeRolePolicyDocument", newAssumeRolePolicyDocument);
		}
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
		if(roleName != null){
			putQueryParameter("RoleName", roleName);
		}
	}

	public Long getNewMaxSessionDuration() {
		return this.newMaxSessionDuration;
	}

	public void setNewMaxSessionDuration(Long newMaxSessionDuration) {
		this.newMaxSessionDuration = newMaxSessionDuration;
		if(newMaxSessionDuration != null){
			putQueryParameter("NewMaxSessionDuration", newMaxSessionDuration.toString());
		}
	}

	@Override
	public Class<UpdateRoleResponse> getResponseClass() {
		return UpdateRoleResponse.class;
	}

}
