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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateClusterConfigsRequest extends RpcAcsRequest<UpdateClusterConfigsResponse> {
	   

	private String configType;

	private Long clusterId;

	@SerializedName("configValues")
	private List<ConfigValues> configValues;

	private Long projectId;
	public UpdateClusterConfigsRequest() {
		super("dataworks-public", "2020-05-18", "UpdateClusterConfigs");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getConfigType() {
		return this.configType;
	}

	public void setConfigType(String configType) {
		this.configType = configType;
		if(configType != null){
			putQueryParameter("ConfigType", configType);
		}
	}

	public Long getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(Long clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId.toString());
		}
	}

	public List<ConfigValues> getConfigValues() {
		return this.configValues;
	}

	public void setConfigValues(List<ConfigValues> configValues) {
		this.configValues = configValues;	
		if (configValues != null) {
			putBodyParameter("ConfigValues" , new Gson().toJson(configValues));
		}	
	}

	public Long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId.toString());
		}
	}

	public static class ConfigValues {

		@SerializedName("EnableOverwrite")
		private Boolean enableOverwrite;

		@SerializedName("ModuleName")
		private String moduleName;

		@SerializedName("ConfigValue")
		private String configValue;

		public Boolean getEnableOverwrite() {
			return this.enableOverwrite;
		}

		public void setEnableOverwrite(Boolean enableOverwrite) {
			this.enableOverwrite = enableOverwrite;
		}

		public String getModuleName() {
			return this.moduleName;
		}

		public void setModuleName(String moduleName) {
			this.moduleName = moduleName;
		}

		public String getConfigValue() {
			return this.configValue;
		}

		public void setConfigValue(String configValue) {
			this.configValue = configValue;
		}
	}

	@Override
	public Class<UpdateClusterConfigsResponse> getResponseClass() {
		return UpdateClusterConfigsResponse.class;
	}

}
