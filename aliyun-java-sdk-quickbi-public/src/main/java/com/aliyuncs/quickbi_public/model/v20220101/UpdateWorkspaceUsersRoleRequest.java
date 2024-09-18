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

package com.aliyuncs.quickbi_public.model.v20220101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateWorkspaceUsersRoleRequest extends RpcAcsRequest<UpdateWorkspaceUsersRoleResponse> {
	   

	private Long roleId;

	private String userIds;

	private String workspaceId;
	public UpdateWorkspaceUsersRoleRequest() {
		super("quickbi-public", "2022-01-01", "UpdateWorkspaceUsersRole", "2.2.0");
		setMethod(MethodType.POST);
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

	public String getUserIds() {
		return this.userIds;
	}

	public void setUserIds(String userIds) {
		this.userIds = userIds;
		if(userIds != null){
			putQueryParameter("UserIds", userIds);
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
	public Class<UpdateWorkspaceUsersRoleResponse> getResponseClass() {
		return UpdateWorkspaceUsersRoleResponse.class;
	}

}
