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

package com.aliyuncs.quickbi_public.model.v20200803;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.quickbi_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddWorkspaceUsersRequest extends RpcAcsRequest<AddWorkspaceUsersResponse> {
	   

	private String userIds;

	private Long roleId;

	private String workspaceId;
	public AddWorkspaceUsersRequest() {
		super("quickbi-public", "2020-08-03", "AddWorkspaceUsers", "quickbi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUserIds() {
		return this.userIds;
	}

	public void setUserIds(String userIds) {
		this.userIds = userIds;
		if(userIds != null){
			putQueryParameter("UserIds", userIds);
		}
	}

	public Long getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
		if(roleId != null){
			putQueryParameter("RoleId", roleId.toString());
		}
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putQueryParameter("WorkspaceId", workspaceId);
		}
	}

	@Override
	public Class<AddWorkspaceUsersResponse> getResponseClass() {
		return AddWorkspaceUsersResponse.class;
	}

}
