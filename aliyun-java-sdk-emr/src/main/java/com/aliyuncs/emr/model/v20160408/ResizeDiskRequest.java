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
public class ResizeDiskRequest extends RpcAcsRequest<ResizeDiskResponse> {
	
	public ResizeDiskRequest() {
		super("Emr", "2016-04-08", "ResizeDisk");
	}

	private Long resourceOwnerId;

	private String clusterId;

	private List<DiskConfig> diskConfigs;

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

	public List<DiskConfig> getDiskConfigs() {
		return this.diskConfigs;
	}

	public void setDiskConfigs(List<DiskConfig> diskConfigs) {
		this.diskConfigs = diskConfigs;	
		if (diskConfigs != null) {
			for (int depth1 = 0; depth1 < diskConfigs.size(); depth1++) {
				putQueryParameter("DiskConfig." + (depth1 + 1) + ".HostGroupId" , diskConfigs.get(depth1).getHostGroupId());
				putQueryParameter("DiskConfig." + (depth1 + 1) + ".NewDiskSize" , diskConfigs.get(depth1).getNewDiskSize());
			}
		}	
	}

	public static class DiskConfig {

		private String hostGroupId;

		private Integer newDiskSize;

		public String getHostGroupId() {
			return this.hostGroupId;
		}

		public void setHostGroupId(String hostGroupId) {
			this.hostGroupId = hostGroupId;
		}

		public Integer getNewDiskSize() {
			return this.newDiskSize;
		}

		public void setNewDiskSize(Integer newDiskSize) {
			this.newDiskSize = newDiskSize;
		}
	}

	@Override
	public Class<ResizeDiskResponse> getResponseClass() {
		return ResizeDiskResponse.class;
	}

}
