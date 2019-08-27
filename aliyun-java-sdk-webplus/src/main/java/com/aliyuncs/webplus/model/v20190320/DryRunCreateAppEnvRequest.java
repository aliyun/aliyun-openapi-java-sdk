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
public class DryRunCreateAppEnvRequest extends RoaAcsRequest<DryRunCreateAppEnvResponse> {
	
	public DryRunCreateAppEnvRequest() {
		super("WebPlus", "2019-03-20", "DryRunCreateAppEnv", "webx");
		setUriPattern("/pop/v1/wam/appEnv/dryRunCreate");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String optionSettings;

	private String stackId;

	private String profileName;

	private String sourceEnvId;

	private String templateId;

	public String getOptionSettings() {
		return this.optionSettings;
	}

	public void setOptionSettings(String optionSettings) {
		this.optionSettings = optionSettings;
		if(optionSettings != null){
			putBodyParameter("OptionSettings", optionSettings);
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

	public String getSourceEnvId() {
		return this.sourceEnvId;
	}

	public void setSourceEnvId(String sourceEnvId) {
		this.sourceEnvId = sourceEnvId;
		if(sourceEnvId != null){
			putBodyParameter("SourceEnvId", sourceEnvId);
		}
	}

	public String getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putBodyParameter("TemplateId", templateId);
		}
	}

	@Override
	public Class<DryRunCreateAppEnvResponse> getResponseClass() {
		return DryRunCreateAppEnvResponse.class;
	}

}
