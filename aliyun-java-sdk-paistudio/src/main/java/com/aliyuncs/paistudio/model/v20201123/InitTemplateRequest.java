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

package com.aliyuncs.paistudio.model.v20201123;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.paistudio.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class InitTemplateRequest extends RoaAcsRequest<InitTemplateResponse> {
	   

	private String name;

	private String description;

	private String source;

	private String templateId;

	private String workspaceId;
	public InitTemplateRequest() {
		super("PaiStudio", "2020-11-23", "InitTemplate");
		setUriPattern("/api/core/v1.0/templates/[TemplateId]/experiments");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
		if(source != null){
			putBodyParameter("Source", source);
		}
	}

	public String getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putPathParameter("TemplateId", templateId);
		}
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putBodyParameter("WorkspaceId", workspaceId);
		}
	}

	@Override
	public Class<InitTemplateResponse> getResponseClass() {
		return InitTemplateResponse.class;
	}

}
