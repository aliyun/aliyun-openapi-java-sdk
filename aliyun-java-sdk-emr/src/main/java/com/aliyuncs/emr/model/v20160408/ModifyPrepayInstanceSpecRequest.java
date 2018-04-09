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
public class ModifyPrepayInstanceSpecRequest extends RpcAcsRequest<ModifyPrepayInstanceSpecResponse> {
	
	public ModifyPrepayInstanceSpecRequest() {
		super("Emr", "2016-04-08", "ModifyPrepayInstanceSpec");
	}

	private List<InstanceTypeConfig> instanceTypeConfigs;

	private Long resourceOwnerId;

	private String clusterId;

	public List<InstanceTypeConfig> getInstanceTypeConfigs() {
		return this.instanceTypeConfigs;
	}

	public void setInstanceTypeConfigs(List<InstanceTypeConfig> instanceTypeConfigs) {
		this.instanceTypeConfigs = instanceTypeConfigs;	
		if (instanceTypeConfigs != null) {
			for (int depth1 = 0; depth1 < instanceTypeConfigs.size(); depth1++) {
				putQueryParameter("InstanceTypeConfig." + (depth1 + 1) + ".HostGroupId" , instanceTypeConfigs.get(depth1).getHostGroupId());
				putQueryParameter("InstanceTypeConfig." + (depth1 + 1) + ".InstanceType" , instanceTypeConfigs.get(depth1).getInstanceType());
			}
		}	
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public static class InstanceTypeConfig {

		private String hostGroupId;

		private String instanceType;

		public String getHostGroupId() {
			return this.hostGroupId;
		}

		public void setHostGroupId(String hostGroupId) {
			this.hostGroupId = hostGroupId;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}
	}

	@Override
	public Class<ModifyPrepayInstanceSpecResponse> getResponseClass() {
		return ModifyPrepayInstanceSpecResponse.class;
	}

}
