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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class ModifyResourcePoolRequest extends RpcAcsRequest<ModifyResourcePoolResponse> {
	
	public ModifyResourcePoolRequest() {
		super("Emr", "2016-04-08", "ModifyResourcePool");
	}

	private Long resourceOwnerId;

	private String name;

	private Boolean active;

	private String id;

	private String clusterId;

	private String yarnsiteconfig;

	private List<Config> configs;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
		if(active != null){
			putQueryParameter("Active", active.toString());
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getYarnsiteconfig() {
		return this.yarnsiteconfig;
	}

	public void setYarnsiteconfig(String yarnsiteconfig) {
		this.yarnsiteconfig = yarnsiteconfig;
		if(yarnsiteconfig != null){
			putQueryParameter("Yarnsiteconfig", yarnsiteconfig);
		}
	}

	public List<Config> getConfigs() {
		return this.configs;
	}

	public void setConfigs(List<Config> configs) {
		this.configs = configs;	
		if (configs != null) {
			for (int depth1 = 0; depth1 < configs.size(); depth1++) {
				putQueryParameter("Config." + (depth1 + 1) + ".Id" , configs.get(depth1).getId());
				putQueryParameter("Config." + (depth1 + 1) + ".ConfigKey" , configs.get(depth1).getConfigKey());
				putQueryParameter("Config." + (depth1 + 1) + ".ConfigValue" , configs.get(depth1).getConfigValue());
				putQueryParameter("Config." + (depth1 + 1) + ".Category" , configs.get(depth1).getCategory());
				putQueryParameter("Config." + (depth1 + 1) + ".Note" , configs.get(depth1).getNote());
			}
		}	
	}

	public static class Config {

		private String id;

		private String configKey;

		private String configValue;

		private String category;

		private String note;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getConfigKey() {
			return this.configKey;
		}

		public void setConfigKey(String configKey) {
			this.configKey = configKey;
		}

		public String getConfigValue() {
			return this.configValue;
		}

		public void setConfigValue(String configValue) {
			this.configValue = configValue;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getNote() {
			return this.note;
		}

		public void setNote(String note) {
			this.note = note;
		}
	}

	@Override
	public Class<ModifyResourcePoolResponse> getResponseClass() {
		return ModifyResourcePoolResponse.class;
	}

}
