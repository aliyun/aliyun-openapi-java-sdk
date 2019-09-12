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

package com.aliyuncs.webplus.model.v20190320;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.webplus.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateConfigTemplateRequest extends RoaAcsRequest<CreateConfigTemplateResponse> {
	
	public CreateConfigTemplateRequest() {
		super("WebPlus", "2019-03-20", "CreateConfigTemplate");
		setUriPattern("/pop/v1/wam/configTemplate");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String optionSettings;

	private String sourceTemplateId;

	private String appId;

	private String stackId;

	private String profileName;

	private String templateName;

	private String sourceEnvId;

	private String pkgVersionId;

	private String templateDescription;

	public String getOptionSettings() {
		return this.optionSettings;
	}

	public void setOptionSettings(String optionSettings) {
		this.optionSettings = optionSettings;
		if(optionSettings != null){
			putBodyParameter("OptionSettings", optionSettings);
		}
	}

	public String getSourceTemplateId() {
		return this.sourceTemplateId;
	}

	public void setSourceTemplateId(String sourceTemplateId) {
		this.sourceTemplateId = sourceTemplateId;
		if(sourceTemplateId != null){
			putBodyParameter("SourceTemplateId", sourceTemplateId);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putBodyParameter("AppId", appId);
		}
	}

	public String getStackId() {
		return this.stackId;
	}

	public void setStackId(String stackId) {
		this.stackId = stackId;
		if(stackId != null){
			putBodyParameter("StackId", stackId);
		}
	}

	public String getProfileName() {
		return this.profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
		if(profileName != null){
			putBodyParameter("ProfileName", profileName);
		}
	}

	public String getTemplateName() {
		return this.templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
		if(templateName != null){
			putBodyParameter("TemplateName", templateName);
		}
	}

	public String getSourceEnvId() {
		return this.sourceEnvId;
	}

	public void setSourceEnvId(String sourceEnvId) {
		this.sourceEnvId = sourceEnvId;
		if(sourceEnvId != null){
			putBodyParameter("SourceEnvId", sourceEnvId);
		}
	}

	public String getPkgVersionId() {
		return this.pkgVersionId;
	}

	public void setPkgVersionId(String pkgVersionId) {
		this.pkgVersionId = pkgVersionId;
		if(pkgVersionId != null){
			putBodyParameter("PkgVersionId", pkgVersionId);
		}
	}

	public String getTemplateDescription() {
		return this.templateDescription;
	}

	public void setTemplateDescription(String templateDescription) {
		this.templateDescription = templateDescription;
		if(templateDescription != null){
			putBodyParameter("TemplateDescription", templateDescription);
		}
	}

	@Override
	public Class<CreateConfigTemplateResponse> getResponseClass() {
		return CreateConfigTemplateResponse.class;
	}

}
