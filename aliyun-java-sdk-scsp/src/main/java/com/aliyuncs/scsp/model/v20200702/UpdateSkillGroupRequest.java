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

package com.aliyuncs.scsp.model.v20200702;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateSkillGroupRequest extends RpcAcsRequest<UpdateSkillGroupResponse> {
	   

	private String instanceId;

	private Long skillGroupId;

	private String displayName;

	private String skillGroupName;

	private String description;
	public UpdateSkillGroupRequest() {
		super("scsp", "2020-07-02", "UpdateSkillGroup", "scsp");
		setMethod(MethodType.POST);
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

	public Long getSkillGroupId() {
		return this.skillGroupId;
	}

	public void setSkillGroupId(Long skillGroupId) {
		this.skillGroupId = skillGroupId;
		if(skillGroupId != null){
			putQueryParameter("SkillGroupId", skillGroupId.toString());
		}
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
		if(displayName != null){
			putQueryParameter("DisplayName", displayName);
		}
	}

	public String getSkillGroupName() {
		return this.skillGroupName;
	}

	public void setSkillGroupName(String skillGroupName) {
		this.skillGroupName = skillGroupName;
		if(skillGroupName != null){
			putQueryParameter("SkillGroupName", skillGroupName);
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

	@Override
	public Class<UpdateSkillGroupResponse> getResponseClass() {
		return UpdateSkillGroupResponse.class;
	}

}
