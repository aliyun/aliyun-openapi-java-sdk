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

package com.aliyuncs.devops.model.v20210625;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateVariableGroupRequest extends RoaAcsRequest<UpdateVariableGroupResponse> {
	   

	private String variables;

	private String description;

	private String organizationId;

	private String name;

	private Long id;
	public UpdateVariableGroupRequest() {
		super("devops", "2021-06-25", "UpdateVariableGroup");
		setUriPattern("/organization/[organizationId]/variableGroups/[id]");
		setMethod(MethodType.PUT);
	}

	public String getVariables() {
		return this.variables;
	}

	public void setVariables(String variables) {
		this.variables = variables;
		if(variables != null){
			putBodyParameter("variables", variables);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("description", description);
		}
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putPathParameter("organizationId", organizationId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("name", name);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putPathParameter("id", id.toString());
		}
	}

	@Override
	public Class<UpdateVariableGroupResponse> getResponseClass() {
		return UpdateVariableGroupResponse.class;
	}

}
