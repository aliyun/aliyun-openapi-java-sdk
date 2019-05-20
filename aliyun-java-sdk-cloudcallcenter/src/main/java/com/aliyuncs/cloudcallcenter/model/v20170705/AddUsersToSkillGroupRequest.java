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
public class AddUsersToSkillGroupRequest extends RpcAcsRequest<AddUsersToSkillGroupResponse> {
	
	public AddUsersToSkillGroupRequest() {
		super("CloudCallCenter", "2017-07-05", "AddUsersToSkillGroup", "CloudCallCenter", "innerAPI");
	}

	private List<Integer> skillLevels;

	private String instanceId;

	private String skillGroupId;

	private List<String> userIds;

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

	public String getSkillGroupId() {
		return this.skillGroupId;
	}

	public void setSkillGroupId(String skillGroupId) {
		this.skillGroupId = skillGroupId;
		if(skillGroupId != null){
			putQueryParameter("SkillGroupId", skillGroupId);
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
	public Class<AddUsersToSkillGroupResponse> getResponseClass() {
		return AddUsersToSkillGroupResponse.class;
	}

}
