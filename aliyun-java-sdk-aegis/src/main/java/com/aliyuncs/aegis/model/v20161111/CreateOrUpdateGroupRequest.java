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

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateOrUpdateGroupRequest extends RpcAcsRequest<CreateOrUpdateGroupResponse> {
	
	public CreateOrUpdateGroupRequest() {
		super("aegis", "2016-11-11", "CreateOrUpdateGroup", "vipaegis");
	}

	private String ruleIds;

	private String sourceIp;

	private String machineGroupIds;

	private String description;

	private Long id;

	private String lang;

	private String groupName;

	public String getRuleIds() {
		return this.ruleIds;
	}

	public void setRuleIds(String ruleIds) {
		this.ruleIds = ruleIds;
		if(ruleIds != null){
			putQueryParameter("RuleIds", ruleIds);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getMachineGroupIds() {
		return this.machineGroupIds;
	}

	public void setMachineGroupIds(String machineGroupIds) {
		this.machineGroupIds = machineGroupIds;
		if(machineGroupIds != null){
			putQueryParameter("MachineGroupIds", machineGroupIds);
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

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
		if(groupName != null){
			putQueryParameter("GroupName", groupName);
		}
	}

	@Override
	public Class<CreateOrUpdateGroupResponse> getResponseClass() {
		return CreateOrUpdateGroupResponse.class;
	}

}
