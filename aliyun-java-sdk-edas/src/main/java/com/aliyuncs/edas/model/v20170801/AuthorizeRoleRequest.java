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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.edas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AuthorizeRoleRequest extends RoaAcsRequest<AuthorizeRoleResponse> {
	
	public AuthorizeRoleRequest() {
		super("Edas", "2017-08-01", "AuthorizeRole", "edas");
		setUriPattern("/pop/v5/account/authorize_role");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String roleIds;

	private String targetUserId;

	public String getRoleIds() {
		return this.roleIds;
	}

	public void setRoleIds(String roleIds) {
		this.roleIds = roleIds;
		if(roleIds != null){
			putQueryParameter("RoleIds", roleIds);
		}
	}

	public String getTargetUserId() {
		return this.targetUserId;
	}

	public void setTargetUserId(String targetUserId) {
		this.targetUserId = targetUserId;
		if(targetUserId != null){
			putQueryParameter("TargetUserId", targetUserId);
		}
	}

	@Override
	public Class<AuthorizeRoleResponse> getResponseClass() {
		return AuthorizeRoleResponse.class;
	}

}
