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
public class ModifyRoleRequest extends RpcAcsRequest<ModifyRoleResponse> {
	
	public ModifyRoleRequest() {
		super("CloudCallCenter", "2017-07-05", "ModifyRole", "CloudCallCenter", "innerAPI");
	}

	private String instanceId;

	private List<String> privilegeIds;

	private String roleId;

	private String name;

	private String description;

	private List<String> userIds;

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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
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

	public List<String> getUserIds() {
		return this.userIds;
	}

	public void setUserIds(List<String> userIds) {
		this.userIds = userIds;	
		if (userIds != null) {
			for (int i = 0; i < userIds.size(); i++) {
				putQueryParameter("UserId." + (i + 1) , userIds.get(i));
			}
		}	
	}

	@Override
	public Class<ModifyRoleResponse> getResponseClass() {
		return ModifyRoleResponse.class;
	}

}
