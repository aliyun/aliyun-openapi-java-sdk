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

/**
 * @author auto create
 * @version 
 */
public class CreateOrModifySystemSpecificationRequest extends RpcAcsRequest<CreateOrModifySystemSpecificationResponse> {
	
	public CreateOrModifySystemSpecificationRequest() {
		super("CloudCallCenter", "2017-07-05", "CreateOrModifySystemSpecification", "CloudCallCenter", "innerAPI");
	}

	private Integer maxAgents;

	private Integer maxContactFlows;

	private Integer maxOnlineAgents;

	private Integer maxRoles;

	private Integer maxSkillGroups;

	private Integer storageMaxDays;

	private Integer storageMaxSize;

	private Integer maxPhoneNumbers;

	private Integer maxInstances;

	public Integer getMaxAgents() {
		return this.maxAgents;
	}

	public void setMaxAgents(Integer maxAgents) {
		this.maxAgents = maxAgents;
		if(maxAgents != null){
			putQueryParameter("MaxAgents", maxAgents.toString());
		}
	}

	public Integer getMaxContactFlows() {
		return this.maxContactFlows;
	}

	public void setMaxContactFlows(Integer maxContactFlows) {
		this.maxContactFlows = maxContactFlows;
		if(maxContactFlows != null){
			putQueryParameter("MaxContactFlows", maxContactFlows.toString());
		}
	}

	public Integer getMaxOnlineAgents() {
		return this.maxOnlineAgents;
	}

	public void setMaxOnlineAgents(Integer maxOnlineAgents) {
		this.maxOnlineAgents = maxOnlineAgents;
		if(maxOnlineAgents != null){
			putQueryParameter("MaxOnlineAgents", maxOnlineAgents.toString());
		}
	}

	public Integer getMaxRoles() {
		return this.maxRoles;
	}

	public void setMaxRoles(Integer maxRoles) {
		this.maxRoles = maxRoles;
		if(maxRoles != null){
			putQueryParameter("MaxRoles", maxRoles.toString());
		}
	}

	public Integer getMaxSkillGroups() {
		return this.maxSkillGroups;
	}

	public void setMaxSkillGroups(Integer maxSkillGroups) {
		this.maxSkillGroups = maxSkillGroups;
		if(maxSkillGroups != null){
			putQueryParameter("MaxSkillGroups", maxSkillGroups.toString());
		}
	}

	public Integer getStorageMaxDays() {
		return this.storageMaxDays;
	}

	public void setStorageMaxDays(Integer storageMaxDays) {
		this.storageMaxDays = storageMaxDays;
		if(storageMaxDays != null){
			putQueryParameter("StorageMaxDays", storageMaxDays.toString());
		}
	}

	public Integer getStorageMaxSize() {
		return this.storageMaxSize;
	}

	public void setStorageMaxSize(Integer storageMaxSize) {
		this.storageMaxSize = storageMaxSize;
		if(storageMaxSize != null){
			putQueryParameter("StorageMaxSize", storageMaxSize.toString());
		}
	}

	public Integer getMaxPhoneNumbers() {
		return this.maxPhoneNumbers;
	}

	public void setMaxPhoneNumbers(Integer maxPhoneNumbers) {
		this.maxPhoneNumbers = maxPhoneNumbers;
		if(maxPhoneNumbers != null){
			putQueryParameter("MaxPhoneNumbers", maxPhoneNumbers.toString());
		}
	}

	public Integer getMaxInstances() {
		return this.maxInstances;
	}

	public void setMaxInstances(Integer maxInstances) {
		this.maxInstances = maxInstances;
		if(maxInstances != null){
			putQueryParameter("MaxInstances", maxInstances.toString());
		}
	}

	@Override
	public Class<CreateOrModifySystemSpecificationResponse> getResponseClass() {
		return CreateOrModifySystemSpecificationResponse.class;
	}

}
