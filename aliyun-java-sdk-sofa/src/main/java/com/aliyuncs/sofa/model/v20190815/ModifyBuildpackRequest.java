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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyBuildpackRequest extends RpcAcsRequest<ModifyBuildpackResponse> {
	   

	private String description;

	private Boolean debugMode;

	private String id;

	private List<Long> supportedOsRepeatLists;

	private String fullVersion;

	private String contactInfo;

	private List<EnvParams> envParamss;

	private String buildCommand;
	public ModifyBuildpackRequest() {
		super("SOFA", "2019-08-15", "ModifyBuildpack", "ApplySidecarCert");
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

	public Boolean getDebugMode() {
		return this.debugMode;
	}

	public void setDebugMode(Boolean debugMode) {
		this.debugMode = debugMode;
		if(debugMode != null){
			putBodyParameter("DebugMode", debugMode.toString());
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	public List<Long> getSupportedOsRepeatLists() {
		return this.supportedOsRepeatLists;
	}

	public void setSupportedOsRepeatLists(List<Long> supportedOsRepeatLists) {
		this.supportedOsRepeatLists = supportedOsRepeatLists;	
		if (supportedOsRepeatLists != null) {
			for (int i = 0; i < supportedOsRepeatLists.size(); i++) {
				putBodyParameter("SupportedOsRepeatList." + (i + 1) , supportedOsRepeatLists.get(i));
			}
		}	
	}

	public String getFullVersion() {
		return this.fullVersion;
	}

	public void setFullVersion(String fullVersion) {
		this.fullVersion = fullVersion;
		if(fullVersion != null){
			putBodyParameter("FullVersion", fullVersion);
		}
	}

	public String getContactInfo() {
		return this.contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
		if(contactInfo != null){
			putBodyParameter("ContactInfo", contactInfo);
		}
	}

	public List<EnvParams> getEnvParamss() {
		return this.envParamss;
	}

	public void setEnvParamss(List<EnvParams> envParamss) {
		this.envParamss = envParamss;	
		if (envParamss != null) {
			for (int depth1 = 0; depth1 < envParamss.size(); depth1++) {
				putBodyParameter("EnvParams." + (depth1 + 1) + ".BuildpackId" , envParamss.get(depth1).getBuildpackId());
				putBodyParameter("EnvParams." + (depth1 + 1) + ".Readonly" , envParamss.get(depth1).getReadonly());
				putBodyParameter("EnvParams." + (depth1 + 1) + ".DefaultValue" , envParamss.get(depth1).getDefaultValue());
				putBodyParameter("EnvParams." + (depth1 + 1) + ".Description" , envParamss.get(depth1).getDescription());
				putBodyParameter("EnvParams." + (depth1 + 1) + ".Id" , envParamss.get(depth1).getId());
				putBodyParameter("EnvParams." + (depth1 + 1) + ".Key" , envParamss.get(depth1).getKey());
				putBodyParameter("EnvParams." + (depth1 + 1) + ".Required" , envParamss.get(depth1).getRequired());
			}
		}	
	}

	public String getBuildCommand() {
		return this.buildCommand;
	}

	public void setBuildCommand(String buildCommand) {
		this.buildCommand = buildCommand;
		if(buildCommand != null){
			putBodyParameter("BuildCommand", buildCommand);
		}
	}

	public static class EnvParams {

		private String buildpackId;

		private Boolean readonly;

		private String defaultValue;

		private String description;

		private String id;

		private String key;

		private Boolean required;

		public String getBuildpackId() {
			return this.buildpackId;
		}

		public void setBuildpackId(String buildpackId) {
			this.buildpackId = buildpackId;
		}

		public Boolean getReadonly() {
			return this.readonly;
		}

		public void setReadonly(Boolean readonly) {
			this.readonly = readonly;
		}

		public String getDefaultValue() {
			return this.defaultValue;
		}

		public void setDefaultValue(String defaultValue) {
			this.defaultValue = defaultValue;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public Boolean getRequired() {
			return this.required;
		}

		public void setRequired(Boolean required) {
			this.required = required;
		}
	}

	@Override
	public Class<ModifyBuildpackResponse> getResponseClass() {
		return ModifyBuildpackResponse.class;
	}

}
