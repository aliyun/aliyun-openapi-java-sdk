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
public class ModifyAppServiceEnvParamsRequest extends RpcAcsRequest<ModifyAppServiceEnvParamsResponse> {
	   

	private String appServiceId;

	private String buildpackId;

	private List<Params> paramss;
	public ModifyAppServiceEnvParamsRequest() {
		super("SOFA", "2019-08-15", "ModifyAppServiceEnvParams", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAppServiceId() {
		return this.appServiceId;
	}

	public void setAppServiceId(String appServiceId) {
		this.appServiceId = appServiceId;
		if(appServiceId != null){
			putBodyParameter("AppServiceId", appServiceId);
		}
	}

	public String getBuildpackId() {
		return this.buildpackId;
	}

	public void setBuildpackId(String buildpackId) {
		this.buildpackId = buildpackId;
		if(buildpackId != null){
			putBodyParameter("BuildpackId", buildpackId);
		}
	}

	public List<Params> getParamss() {
		return this.paramss;
	}

	public void setParamss(List<Params> paramss) {
		this.paramss = paramss;	
		if (paramss != null) {
			for (int depth1 = 0; depth1 < paramss.size(); depth1++) {
				putBodyParameter("Params." + (depth1 + 1) + ".OriginalDescription" , paramss.get(depth1).getOriginalDescription());
				putBodyParameter("Params." + (depth1 + 1) + ".AppServiceId" , paramss.get(depth1).getAppServiceId());
				putBodyParameter("Params." + (depth1 + 1) + ".ModificationTime" , paramss.get(depth1).getModificationTime());
				putBodyParameter("Params." + (depth1 + 1) + ".DefaultValue" , paramss.get(depth1).getDefaultValue());
				putBodyParameter("Params." + (depth1 + 1) + ".Description" , paramss.get(depth1).getDescription());
				putBodyParameter("Params." + (depth1 + 1) + ".Required" , paramss.get(depth1).getRequired());
				putBodyParameter("Params." + (depth1 + 1) + ".Readonly" , paramss.get(depth1).getReadonly());
				putBodyParameter("Params." + (depth1 + 1) + ".AppId" , paramss.get(depth1).getAppId());
				putBodyParameter("Params." + (depth1 + 1) + ".OriginalRequired" , paramss.get(depth1).getOriginalRequired());
				putBodyParameter("Params." + (depth1 + 1) + ".BaselineBuildpackId" , paramss.get(depth1).getBaselineBuildpackId());
				putBodyParameter("Params." + (depth1 + 1) + ".CreationTime" , paramss.get(depth1).getCreationTime());
				putBodyParameter("Params." + (depth1 + 1) + ".Id" , paramss.get(depth1).getId());
				putBodyParameter("Params." + (depth1 + 1) + ".OriginalReadonly" , paramss.get(depth1).getOriginalReadonly());
				putBodyParameter("Params." + (depth1 + 1) + ".Value" , paramss.get(depth1).getValue());
				putBodyParameter("Params." + (depth1 + 1) + ".Key" , paramss.get(depth1).getKey());
				putBodyParameter("Params." + (depth1 + 1) + ".OriginalDefaultValue" , paramss.get(depth1).getOriginalDefaultValue());
				putBodyParameter("Params." + (depth1 + 1) + ".Status" , paramss.get(depth1).getStatus());
				putBodyParameter("Params." + (depth1 + 1) + ".WorkspaceId" , paramss.get(depth1).getWorkspaceId());
			}
		}	
	}

	public static class Params {

		private String originalDescription;

		private String appServiceId;

		private String modificationTime;

		private String defaultValue;

		private String description;

		private Boolean required;

		private Boolean readonly;

		private String appId;

		private Boolean originalRequired;

		private String baselineBuildpackId;

		private String creationTime;

		private String id;

		private String originalReadonly;

		private String value;

		private String key;

		private String originalDefaultValue;

		private String status;

		private String workspaceId;

		public String getOriginalDescription() {
			return this.originalDescription;
		}

		public void setOriginalDescription(String originalDescription) {
			this.originalDescription = originalDescription;
		}

		public String getAppServiceId() {
			return this.appServiceId;
		}

		public void setAppServiceId(String appServiceId) {
			this.appServiceId = appServiceId;
		}

		public String getModificationTime() {
			return this.modificationTime;
		}

		public void setModificationTime(String modificationTime) {
			this.modificationTime = modificationTime;
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

		public Boolean getRequired() {
			return this.required;
		}

		public void setRequired(Boolean required) {
			this.required = required;
		}

		public Boolean getReadonly() {
			return this.readonly;
		}

		public void setReadonly(Boolean readonly) {
			this.readonly = readonly;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public Boolean getOriginalRequired() {
			return this.originalRequired;
		}

		public void setOriginalRequired(Boolean originalRequired) {
			this.originalRequired = originalRequired;
		}

		public String getBaselineBuildpackId() {
			return this.baselineBuildpackId;
		}

		public void setBaselineBuildpackId(String baselineBuildpackId) {
			this.baselineBuildpackId = baselineBuildpackId;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getOriginalReadonly() {
			return this.originalReadonly;
		}

		public void setOriginalReadonly(String originalReadonly) {
			this.originalReadonly = originalReadonly;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getOriginalDefaultValue() {
			return this.originalDefaultValue;
		}

		public void setOriginalDefaultValue(String originalDefaultValue) {
			this.originalDefaultValue = originalDefaultValue;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getWorkspaceId() {
			return this.workspaceId;
		}

		public void setWorkspaceId(String workspaceId) {
			this.workspaceId = workspaceId;
		}
	}

	@Override
	public Class<ModifyAppServiceEnvParamsResponse> getResponseClass() {
		return ModifyAppServiceEnvParamsResponse.class;
	}

}
