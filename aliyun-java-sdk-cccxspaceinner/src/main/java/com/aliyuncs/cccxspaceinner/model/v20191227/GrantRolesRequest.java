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

package com.aliyuncs.cccxspaceinner.model.v20191227;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GrantRolesRequest extends RpcAcsRequest<GrantRolesResponse> {
	   

	private String agentId;

	private String roleIds;

	private Long adminId;

	private String adminName;
	public GrantRolesRequest() {
		super("CCCXSpaceInner", "2019-12-27", "GrantRoles");
		setMethod(MethodType.POST);
	}

	public String getAgentId() {
		return this.agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
		if(agentId != null){
			putBodyParameter("AgentId", agentId);
		}
	}

	public String getRoleIds() {
		return this.roleIds;
	}

	public void setRoleIds(String roleIds) {
		this.roleIds = roleIds;
		if(roleIds != null){
			putBodyParameter("RoleIds", roleIds);
		}
	}

	public Long getAdminId() {
		return this.adminId;
	}

	public void setAdminId(Long adminId) {
		this.adminId = adminId;
		if(adminId != null){
			putBodyParameter("AdminId", adminId.toString());
		}
	}

	public String getAdminName() {
		return this.adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
		if(adminName != null){
			putBodyParameter("AdminName", adminName);
		}
	}

	@Override
	public Class<GrantRolesResponse> getResponseClass() {
		return GrantRolesResponse.class;
	}

}
