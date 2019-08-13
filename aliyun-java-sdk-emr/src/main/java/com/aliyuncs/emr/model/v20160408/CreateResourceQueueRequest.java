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
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateResourceQueueRequest extends RpcAcsRequest<CreateResourceQueueResponse> {
	
	public CreateResourceQueueRequest() {
		super("Emr", "2016-04-08", "CreateResourceQueue", "emr");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long resourceOwnerId;

	private Long parentQueueId;

	private String name;

	private String qualifiedName;

	private Long resourcePoolId;

	private String clusterId;

	private Boolean leaf;

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

	public Long getParentQueueId() {
		return this.parentQueueId;
	}

	public void setParentQueueId(Long parentQueueId) {
		this.parentQueueId = parentQueueId;
		if(parentQueueId != null){
			putQueryParameter("ParentQueueId", parentQueueId.toString());
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

	public String getQualifiedName() {
		return this.qualifiedName;
	}

	public void setQualifiedName(String qualifiedName) {
		this.qualifiedName = qualifiedName;
		if(qualifiedName != null){
			putQueryParameter("QualifiedName", qualifiedName);
		}
	}

	public Long getResourcePoolId() {
		return this.resourcePoolId;
	}

	public void setResourcePoolId(Long resourcePoolId) {
		this.resourcePoolId = resourcePoolId;
		if(resourcePoolId != null){
			putQueryParameter("ResourcePoolId", resourcePoolId.toString());
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

	public Boolean getLeaf() {
		return this.leaf;
	}

	public void setLeaf(Boolean leaf) {
		this.leaf = leaf;
		if(leaf != null){
			putQueryParameter("Leaf", leaf.toString());
		}
	}

	public List<Config> getConfigs() {
		return this.configs;
	}

	public void setConfigs(List<Config> configs) {
		this.configs = configs;	
		if (configs != null) {
			for (int depth1 = 0; depth1 < configs.size(); depth1++) {
				putQueryParameter("Config." + (depth1 + 1) + ".ConfigKey" , configs.get(depth1).getConfigKey());
				putQueryParameter("Config." + (depth1 + 1) + ".Note" , configs.get(depth1).getNote());
				putQueryParameter("Config." + (depth1 + 1) + ".ConfigValue" , configs.get(depth1).getConfigValue());
				putQueryParameter("Config." + (depth1 + 1) + ".Category" , configs.get(depth1).getCategory());
			}
		}	
	}

	public static class Config {

		private String configKey;

		private String note;

		private String configValue;

		private String category;

		public String getConfigKey() {
			return this.configKey;
		}

		public void setConfigKey(String configKey) {
			this.configKey = configKey;
		}

		public String getNote() {
			return this.note;
		}

		public void setNote(String note) {
			this.note = note;
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
	}

	@Override
	public Class<CreateResourceQueueResponse> getResponseClass() {
		return CreateResourceQueueResponse.class;
	}

}
