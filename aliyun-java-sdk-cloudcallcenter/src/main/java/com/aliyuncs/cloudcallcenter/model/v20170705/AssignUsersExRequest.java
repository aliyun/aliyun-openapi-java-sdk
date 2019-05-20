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
public class AssignUsersExRequest extends RpcAcsRequest<AssignUsersExResponse> {
	
	public AssignUsersExRequest() {
		super("CloudCallCenter", "2017-07-05", "AssignUsersEx", "CloudCallCenter", "innerAPI");
	}

	private List<Integer> skillLevels;

	private String instanceId;

	private List<String> userRamInfos;

	private List<String> roleIds;

	private List<String> skillGroupIds;

	public List<Integer> getSkillLevels() {
		return this.skillLevels;
	}

	public void setSkillLevels(List<Integer> skillLevels) {
		this.skillLevels = skillLevels;	
		if (skillLevels != null) {
			for (int i = 0; i < skillLevels.size(); i++) {
				putQueryParameter("SkillLevel." + (i + 1) , skillLevels.get(i));
			}
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

	public List<String> getUserRamInfos() {
		return this.userRamInfos;
	}

	public void setUserRamInfos(List<String> userRamInfos) {
		this.userRamInfos = userRamInfos;	
		if (userRamInfos != null) {
			for (int i = 0; i < userRamInfos.size(); i++) {
				putQueryParameter("userRamInfo." + (i + 1) , userRamInfos.get(i));
			}
		}	
	}

	public List<String> getRoleIds() {
		return this.roleIds;
	}

	public void setRoleIds(List<String> roleIds) {
		this.roleIds = roleIds;	
		if (roleIds != null) {
			for (int i = 0; i < roleIds.size(); i++) {
				putQueryParameter("RoleId." + (i + 1) , roleIds.get(i));
			}
		}	
	}

	public List<String> getSkillGroupIds() {
		return this.skillGroupIds;
	}

	public void setSkillGroupIds(List<String> skillGroupIds) {
		this.skillGroupIds = skillGroupIds;	
		if (skillGroupIds != null) {
			for (int i = 0; i < skillGroupIds.size(); i++) {
				putQueryParameter("SkillGroupId." + (i + 1) , skillGroupIds.get(i));
			}
		}	
	}

	@Override
	public Class<AssignUsersExResponse> getResponseClass() {
		return AssignUsersExResponse.class;
	}

}
