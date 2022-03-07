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

package com.aliyuncs.ccc.model.v20200701;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AssignUsersRequest extends RpcAcsRequest<AssignUsersResponse> {
	   

	private String ramIdList;

	private String roleId;

	private String workMode;

	private String instanceId;

	private String skillLevelList;
	public AssignUsersRequest() {
		super("CCC", "2020-07-01", "AssignUsers", "CCC");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRamIdList() {
		return this.ramIdList;
	}

	public void setRamIdList(String ramIdList) {
		this.ramIdList = ramIdList;
		if(ramIdList != null){
			putQueryParameter("RamIdList", ramIdList);
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

	public String getWorkMode() {
		return this.workMode;
	}

	public void setWorkMode(String workMode) {
		this.workMode = workMode;
		if(workMode != null){
			putQueryParameter("WorkMode", workMode);
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

	public String getSkillLevelList() {
		return this.skillLevelList;
	}

	public void setSkillLevelList(String skillLevelList) {
		this.skillLevelList = skillLevelList;
		if(skillLevelList != null){
			putQueryParameter("SkillLevelList", skillLevelList);
		}
	}

	@Override
	public Class<AssignUsersResponse> getResponseClass() {
		return AssignUsersResponse.class;
	}

}
