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
public class UpdateAppEnvRequest extends RoaAcsRequest<UpdateAppEnvResponse> {
	
	public UpdateAppEnvRequest() {
		super("WebPlus", "2019-03-20", "UpdateAppEnv");
		setUriPattern("/pop/v1/wam/appEnv");
		setMethod(MethodType.PUT);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String optionSettings;

	private Boolean dryRun;

	private String extraProperties;

	private String stackId;

	private String envDescription;

	private String envId;

	private String pkgVersionId;

	public String getOptionSettings() {
		return this.optionSettings;
	}

	public void setOptionSettings(String optionSettings) {
		this.optionSettings = optionSettings;
		if(optionSettings != null){
			putBodyParameter("OptionSettings", optionSettings);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putBodyParameter("DryRun", dryRun.toString());
		}
	}

	public String getExtraProperties() {
		return this.extraProperties;
	}

	public void setExtraProperties(String extraProperties) {
		this.extraProperties = extraProperties;
		if(extraProperties != null){
			putBodyParameter("ExtraProperties", extraProperties);
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

	public String getEnvDescription() {
		return this.envDescription;
	}

	public void setEnvDescription(String envDescription) {
		this.envDescription = envDescription;
		if(envDescription != null){
			putBodyParameter("EnvDescription", envDescription);
		}
	}

	public String getEnvId() {
		return this.envId;
	}

	public void setEnvId(String envId) {
		this.envId = envId;
		if(envId != null){
			putBodyParameter("EnvId", envId);
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

	@Override
	public Class<UpdateAppEnvResponse> getResponseClass() {
		return UpdateAppEnvResponse.class;
	}

}
