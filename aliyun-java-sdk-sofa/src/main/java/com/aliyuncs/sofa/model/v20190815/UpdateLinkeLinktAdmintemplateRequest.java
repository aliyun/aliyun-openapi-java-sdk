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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateLinkeLinktAdmintemplateRequest extends RpcAcsRequest<UpdateLinkeLinktAdmintemplateResponse> {
	   

	private String description;

	private String stamp;

	private String templateLabel;

	private Long type;

	private Long id;

	private String projectSign;

	private String defaultContent;

	private String name;
	public UpdateLinkeLinktAdmintemplateRequest() {
		super("SOFA", "2019-08-15", "UpdateLinkeLinktAdmintemplate", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getStamp() {
		return this.stamp;
	}

	public void setStamp(String stamp) {
		this.stamp = stamp;
		if(stamp != null){
			putBodyParameter("Stamp", stamp);
		}
	}

	public String getTemplateLabel() {
		return this.templateLabel;
	}

	public void setTemplateLabel(String templateLabel) {
		this.templateLabel = templateLabel;
		if(templateLabel != null){
			putBodyParameter("TemplateLabel", templateLabel);
		}
	}

	public Long getType() {
		return this.type;
	}

	public void setType(Long type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type.toString());
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id.toString());
		}
	}

	public String getProjectSign() {
		return this.projectSign;
	}

	public void setProjectSign(String projectSign) {
		this.projectSign = projectSign;
		if(projectSign != null){
			putBodyParameter("ProjectSign", projectSign);
		}
	}

	public String getDefaultContent() {
		return this.defaultContent;
	}

	public void setDefaultContent(String defaultContent) {
		this.defaultContent = defaultContent;
		if(defaultContent != null){
			putBodyParameter("DefaultContent", defaultContent);
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

	@Override
	public Class<UpdateLinkeLinktAdmintemplateResponse> getResponseClass() {
		return UpdateLinkeLinktAdmintemplateResponse.class;
	}

}
