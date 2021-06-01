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

package com.aliyuncs.workbench_ide.model.v20210121;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateEnvironmentResourceConfigRequest extends RpcAcsRequest<UpdateEnvironmentResourceConfigResponse> {
	   

	private String currentOrgId;

	private List<ConfigList> configLists;

	private Long envId;

	private String cloudServiceName;
	public UpdateEnvironmentResourceConfigRequest() {
		super("Workbench-ide", "2021-01-21", "UpdateEnvironmentResourceConfig");
		setMethod(MethodType.POST);
	}

	public String getCurrentOrgId() {
		return this.currentOrgId;
	}

	public void setCurrentOrgId(String currentOrgId) {
		this.currentOrgId = currentOrgId;
		if(currentOrgId != null){
			putQueryParameter("CurrentOrgId", currentOrgId);
		}
	}

	public List<ConfigList> getConfigLists() {
		return this.configLists;
	}

	public void setConfigLists(List<ConfigList> configLists) {
		this.configLists = configLists;	
		if (configLists != null) {
			for (int depth1 = 0; depth1 < configLists.size(); depth1++) {
				putQueryParameter("ConfigList." + (depth1 + 1) + ".InstanceId" , configLists.get(depth1).getInstanceId());
				putQueryParameter("ConfigList." + (depth1 + 1) + ".ConfigName" , configLists.get(depth1).getConfigName());
				putQueryParameter("ConfigList." + (depth1 + 1) + ".ConfigDescription" , configLists.get(depth1).getConfigDescription());
				putQueryParameter("ConfigList." + (depth1 + 1) + ".ConfigValue" , configLists.get(depth1).getConfigValue());
			}
		}	
	}

	public Long getEnvId() {
		return this.envId;
	}

	public void setEnvId(Long envId) {
		this.envId = envId;
		if(envId != null){
			putQueryParameter("EnvId", envId.toString());
		}
	}

	public String getCloudServiceName() {
		return this.cloudServiceName;
	}

	public void setCloudServiceName(String cloudServiceName) {
		this.cloudServiceName = cloudServiceName;
		if(cloudServiceName != null){
			putQueryParameter("CloudServiceName", cloudServiceName);
		}
	}

	public static class ConfigList {

		private String instanceId;

		private String configName;

		private String configDescription;

		private String configValue;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getConfigName() {
			return this.configName;
		}

		public void setConfigName(String configName) {
			this.configName = configName;
		}

		public String getConfigDescription() {
			return this.configDescription;
		}

		public void setConfigDescription(String configDescription) {
			this.configDescription = configDescription;
		}

		public String getConfigValue() {
			return this.configValue;
		}

		public void setConfigValue(String configValue) {
			this.configValue = configValue;
		}
	}

	@Override
	public Class<UpdateEnvironmentResourceConfigResponse> getResponseClass() {
		return UpdateEnvironmentResourceConfigResponse.class;
	}

}
