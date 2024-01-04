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
public class UpdateFlowTagRequest extends RoaAcsRequest<UpdateFlowTagResponse> {
	   

	private String color;

	private Long flowTagGroupId;

	private String organizationId;

	private String name;

	private Long id;
	public UpdateFlowTagRequest() {
		super("devops", "2021-06-25", "UpdateFlowTag");
		setUriPattern("/organization/[organizationId]/flow/tags/[id]");
		setMethod(MethodType.PUT);
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
		if(color != null){
			putQueryParameter("color", color);
		}
	}

	public Long getFlowTagGroupId() {
		return this.flowTagGroupId;
	}

	public void setFlowTagGroupId(Long flowTagGroupId) {
		this.flowTagGroupId = flowTagGroupId;
		if(flowTagGroupId != null){
			putQueryParameter("flowTagGroupId", flowTagGroupId.toString());
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
			putQueryParameter("name", name);
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
	public Class<UpdateFlowTagResponse> getResponseClass() {
		return UpdateFlowTagResponse.class;
	}

}
