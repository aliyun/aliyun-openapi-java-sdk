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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class AssignPrivilegesToRoleRequest extends RpcAcsRequest<AssignPrivilegesToRoleResponse> {
	
	public AssignPrivilegesToRoleRequest() {
		super("CloudCallCenter", "2017-07-05", "AssignPrivilegesToRole", "CloudCallCenter", "innerAPI");
	}

	private String instanceId;

	private List<String> privilegeIds;

	private String roleId;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public List<String> getPrivilegeIds() {
		return this.privilegeIds;
	}

	public void setPrivilegeIds(List<String> privilegeIds) {
		this.privilegeIds = privilegeIds;	
		if (privilegeIds != null) {
			for (int i = 0; i < privilegeIds.size(); i++) {
				putQueryParameter("PrivilegeId." + (i + 1) , privilegeIds.get(i));
			}
		}	
	}

	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
		if(roleId != null){
			putQueryParameter("RoleId", roleId);
		}
	}

	@Override
	public Class<AssignPrivilegesToRoleResponse> getResponseClass() {
		return AssignPrivilegesToRoleResponse.class;
	}

}
