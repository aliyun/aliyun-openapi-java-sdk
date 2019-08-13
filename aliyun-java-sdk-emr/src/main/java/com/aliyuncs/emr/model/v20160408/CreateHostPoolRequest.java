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
public class CreateHostPoolRequest extends RpcAcsRequest<CreateHostPoolResponse> {
	
	public CreateHostPoolRequest() {
		super("Emr", "2016-04-08", "CreateHostPool", "emr");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long resourceOwnerId;

	private String name;

	private String description;

	private List<KubeClusterInfo> kubeClusterInfos;

	private String type;

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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public List<KubeClusterInfo> getKubeClusterInfos() {
		return this.kubeClusterInfos;
	}

	public void setKubeClusterInfos(List<KubeClusterInfo> kubeClusterInfos) {
		this.kubeClusterInfos = kubeClusterInfos;	
		if (kubeClusterInfos != null) {
			for (int depth1 = 0; depth1 < kubeClusterInfos.size(); depth1++) {
				putQueryParameter("KubeClusterInfo." + (depth1 + 1) + ".ExternalKey" , kubeClusterInfos.get(depth1).getExternalKey());
				putQueryParameter("KubeClusterInfo." + (depth1 + 1) + ".InternalConfig" , kubeClusterInfos.get(depth1).getInternalConfig());
				putQueryParameter("KubeClusterInfo." + (depth1 + 1) + ".PublicConfig" , kubeClusterInfos.get(depth1).getPublicConfig());
				putQueryParameter("KubeClusterInfo." + (depth1 + 1) + ".SshConfig" , kubeClusterInfos.get(depth1).getSshConfig());
			}
		}	
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public static class KubeClusterInfo {

		private String externalKey;

		private String internalConfig;

		private String publicConfig;

		private String sshConfig;

		public String getExternalKey() {
			return this.externalKey;
		}

		public void setExternalKey(String externalKey) {
			this.externalKey = externalKey;
		}

		public String getInternalConfig() {
			return this.internalConfig;
		}

		public void setInternalConfig(String internalConfig) {
			this.internalConfig = internalConfig;
		}

		public String getPublicConfig() {
			return this.publicConfig;
		}

		public void setPublicConfig(String publicConfig) {
			this.publicConfig = publicConfig;
		}

		public String getSshConfig() {
			return this.sshConfig;
		}

		public void setSshConfig(String sshConfig) {
			this.sshConfig = sshConfig;
		}
	}

	@Override
	public Class<CreateHostPoolResponse> getResponseClass() {
		return CreateHostPoolResponse.class;
	}

}
