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
public class ResizeClusterV2Request extends RpcAcsRequest<ResizeClusterV2Response> {
	
	public ResizeClusterV2Request() {
		super("Emr", "2016-04-08", "ResizeClusterV2");
	}

	private List<HostGroup> hostGroups;

	private String clusterId;

	public List<HostGroup> getHostGroups() {
		return this.hostGroups;
	}

	public void setHostGroups(List<HostGroup> hostGroups) {
		this.hostGroups = hostGroups;	
		if (hostGroups != null) {
			for (int depth1 = 0; depth1 < hostGroups.size(); depth1++) {
				putQueryParameter("HostGroup." + (depth1 + 1) + ".ClusterId" , hostGroups.get(depth1).getClusterId());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".HostGroupId" , hostGroups.get(depth1).getHostGroupId());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".HostGroupName" , hostGroups.get(depth1).getHostGroupName());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".HostGroupType" , hostGroups.get(depth1).getHostGroupType());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".Comment" , hostGroups.get(depth1).getComment());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".CreateType" , hostGroups.get(depth1).getCreateType());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".ChargeType" , hostGroups.get(depth1).getChargeType());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".Period" , hostGroups.get(depth1).getPeriod());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".NodeCount" , hostGroups.get(depth1).getNodeCount());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".InstanceType" , hostGroups.get(depth1).getInstanceType());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".DiskType" , hostGroups.get(depth1).getDiskType());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".DiskCapacity" , hostGroups.get(depth1).getDiskCapacity());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".DiskCount" , hostGroups.get(depth1).getDiskCount());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".SysDiskType" , hostGroups.get(depth1).getSysDiskType());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".SysDiskCapacity" , hostGroups.get(depth1).getSysDiskCapacity());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".AutoRenew" , hostGroups.get(depth1).getAutoRenew());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".VswitchId" , hostGroups.get(depth1).getVswitchId());
			}
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

	public static class HostGroup {

		private String clusterId;

		private String hostGroupId;

		private String hostGroupName;

		private String hostGroupType;

		private String comment;

		private String createType;

		private String chargeType;

		private Integer period;

		private Integer nodeCount;

		private String instanceType;

		private String diskType;

		private Integer diskCapacity;

		private Integer diskCount;

		private String sysDiskType;

		private Integer sysDiskCapacity;

		private Boolean autoRenew;

		private Integer vswitchId;

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getHostGroupId() {
			return this.hostGroupId;
		}

		public void setHostGroupId(String hostGroupId) {
			this.hostGroupId = hostGroupId;
		}

		public String getHostGroupName() {
			return this.hostGroupName;
		}

		public void setHostGroupName(String hostGroupName) {
			this.hostGroupName = hostGroupName;
		}

		public String getHostGroupType() {
			return this.hostGroupType;
		}

		public void setHostGroupType(String hostGroupType) {
			this.hostGroupType = hostGroupType;
		}

		public String getComment() {
			return this.comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public String getCreateType() {
			return this.createType;
		}

		public void setCreateType(String createType) {
			this.createType = createType;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public Integer getPeriod() {
			return this.period;
		}

		public void setPeriod(Integer period) {
			this.period = period;
		}

		public Integer getNodeCount() {
			return this.nodeCount;
		}

		public void setNodeCount(Integer nodeCount) {
			this.nodeCount = nodeCount;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getDiskType() {
			return this.diskType;
		}

		public void setDiskType(String diskType) {
			this.diskType = diskType;
		}

		public Integer getDiskCapacity() {
			return this.diskCapacity;
		}

		public void setDiskCapacity(Integer diskCapacity) {
			this.diskCapacity = diskCapacity;
		}

		public Integer getDiskCount() {
			return this.diskCount;
		}

		public void setDiskCount(Integer diskCount) {
			this.diskCount = diskCount;
		}

		public String getSysDiskType() {
			return this.sysDiskType;
		}

		public void setSysDiskType(String sysDiskType) {
			this.sysDiskType = sysDiskType;
		}

		public Integer getSysDiskCapacity() {
			return this.sysDiskCapacity;
		}

		public void setSysDiskCapacity(Integer sysDiskCapacity) {
			this.sysDiskCapacity = sysDiskCapacity;
		}

		public Boolean getAutoRenew() {
			return this.autoRenew;
		}

		public void setAutoRenew(Boolean autoRenew) {
			this.autoRenew = autoRenew;
		}

		public Integer getVswitchId() {
			return this.vswitchId;
		}

		public void setVswitchId(Integer vswitchId) {
			this.vswitchId = vswitchId;
		}
	}

	@Override
	public Class<ResizeClusterV2Response> getResponseClass() {
		return ResizeClusterV2Response.class;
	}

}
