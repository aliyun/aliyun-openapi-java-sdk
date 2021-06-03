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

package com.aliyuncs.devops_rdc.model.v20200303;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateCommonGroupRequest extends RpcAcsRequest<UpdateCommonGroupResponse> {
	   

	private String description;

	private String commonGroupId;

	private String orgId;

	private String smartGroupId;

	private String name;

	private String projectId;
	public UpdateCommonGroupRequest() {
		super("devops-rdc", "2020-03-03", "UpdateCommonGroup", "1.9.6");
		setMethod(MethodType.POST);
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getCommonGroupId() {
		return this.commonGroupId;
	}

	public void setCommonGroupId(String commonGroupId) {
		this.commonGroupId = commonGroupId;
		if(commonGroupId != null){
			putBodyParameter("CommonGroupId", commonGroupId);
		}
	}

	public String getOrgId() {
		return this.orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
		if(orgId != null){
			putBodyParameter("OrgId", orgId);
		}
	}

	public String getSmartGroupId() {
		return this.smartGroupId;
	}

	public void setSmartGroupId(String smartGroupId) {
		this.smartGroupId = smartGroupId;
		if(smartGroupId != null){
			putBodyParameter("SmartGroupId", smartGroupId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId);
		}
	}

	@Override
	public Class<UpdateCommonGroupResponse> getResponseClass() {
		return UpdateCommonGroupResponse.class;
	}

}
