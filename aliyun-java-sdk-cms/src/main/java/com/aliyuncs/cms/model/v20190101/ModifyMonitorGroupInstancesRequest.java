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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class ModifyMonitorGroupInstancesRequest extends RpcAcsRequest<ModifyMonitorGroupInstancesResponse> {
	
	public ModifyMonitorGroupInstancesRequest() {
		super("Cms", "2019-01-01", "ModifyMonitorGroupInstances", "cms");
	}

	private List<Instances> instancess;

	private Long groupId;

	public List<Instances> getInstancess() {
		return this.instancess;
	}

	public void setInstancess(List<Instances> instancess) {
		this.instancess = instancess;	
		if (instancess != null) {
			for (int depth1 = 0; depth1 < instancess.size(); depth1++) {
				putQueryParameter("Instances." + (depth1 + 1) + ".InstanceId" , instancess.get(depth1).getInstanceId());
				putQueryParameter("Instances." + (depth1 + 1) + ".InstanceName" , instancess.get(depth1).getInstanceName());
				putQueryParameter("Instances." + (depth1 + 1) + ".RegionId" , instancess.get(depth1).getRegionId());
				putQueryParameter("Instances." + (depth1 + 1) + ".Category" , instancess.get(depth1).getCategory());
			}
		}	
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId.toString());
		}
	}

	public static class Instances {

		private String instanceId;

		private String instanceName;

		private String regionId;

		private String category;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getBizRegionId() {
			return this.regionId;
		}

		public void setBizRegionId(String regionId) {
			this.regionId = regionId;
		}

		/**
		 * @deprecated use getBizRegionId instead of this.
		 */
		@Deprecated
		public String getRegionId() {
			return this.regionId;
		}

		/**
		 * @deprecated use setBizRegionId instead of this.
		 */
		@Deprecated
		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}
	}

	@Override
	public Class<ModifyMonitorGroupInstancesResponse> getResponseClass() {
		return ModifyMonitorGroupInstancesResponse.class;
	}

}
