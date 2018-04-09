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
public class QueryPriceRequest extends RpcAcsRequest<QueryPriceResponse> {
	
	public QueryPriceRequest() {
		super("Emr", "2016-04-08", "QueryPrice");
	}

	private Long resourceOwnerId;

	private Integer period;

	private String taskInstanceType;

	private String taskDiskType;

	private Boolean ioOptimized;

	private String masterDiskType;

	private Integer taskInstanceQuantity;

	private String masterInstanceType;

	private Integer coreInstanceQuantity;

	private Integer duration;

	private Integer masterDiskQuantity;

	private Integer coreDiskQuantity;

	private String coreInstanceType;

	private String netType;

	private List<HostGroup> hostGroups;

	private String zoneId;

	private String coreDiskType;

	private String chargeType;

	private Integer masterInstanceQuantity;

	private Integer taskDiskQuantity;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period.toString());
		}
	}

	public String getTaskInstanceType() {
		return this.taskInstanceType;
	}

	public void setTaskInstanceType(String taskInstanceType) {
		this.taskInstanceType = taskInstanceType;
		if(taskInstanceType != null){
			putQueryParameter("TaskInstanceType", taskInstanceType);
		}
	}

	public String getTaskDiskType() {
		return this.taskDiskType;
	}

	public void setTaskDiskType(String taskDiskType) {
		this.taskDiskType = taskDiskType;
		if(taskDiskType != null){
			putQueryParameter("TaskDiskType", taskDiskType);
		}
	}

	public Boolean getIoOptimized() {
		return this.ioOptimized;
	}

	public void setIoOptimized(Boolean ioOptimized) {
		this.ioOptimized = ioOptimized;
		if(ioOptimized != null){
			putQueryParameter("IoOptimized", ioOptimized.toString());
		}
	}

	public String getMasterDiskType() {
		return this.masterDiskType;
	}

	public void setMasterDiskType(String masterDiskType) {
		this.masterDiskType = masterDiskType;
		if(masterDiskType != null){
			putQueryParameter("MasterDiskType", masterDiskType);
		}
	}

	public Integer getTaskInstanceQuantity() {
		return this.taskInstanceQuantity;
	}

	public void setTaskInstanceQuantity(Integer taskInstanceQuantity) {
		this.taskInstanceQuantity = taskInstanceQuantity;
		if(taskInstanceQuantity != null){
			putQueryParameter("TaskInstanceQuantity", taskInstanceQuantity.toString());
		}
	}

	public String getMasterInstanceType() {
		return this.masterInstanceType;
	}

	public void setMasterInstanceType(String masterInstanceType) {
		this.masterInstanceType = masterInstanceType;
		if(masterInstanceType != null){
			putQueryParameter("MasterInstanceType", masterInstanceType);
		}
	}

	public Integer getCoreInstanceQuantity() {
		return this.coreInstanceQuantity;
	}

	public void setCoreInstanceQuantity(Integer coreInstanceQuantity) {
		this.coreInstanceQuantity = coreInstanceQuantity;
		if(coreInstanceQuantity != null){
			putQueryParameter("CoreInstanceQuantity", coreInstanceQuantity.toString());
		}
	}

	public Integer getDuration() {
		return this.duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
		if(duration != null){
			putQueryParameter("Duration", duration.toString());
		}
	}

	public Integer getMasterDiskQuantity() {
		return this.masterDiskQuantity;
	}

	public void setMasterDiskQuantity(Integer masterDiskQuantity) {
		this.masterDiskQuantity = masterDiskQuantity;
		if(masterDiskQuantity != null){
			putQueryParameter("MasterDiskQuantity", masterDiskQuantity.toString());
		}
	}

	public Integer getCoreDiskQuantity() {
		return this.coreDiskQuantity;
	}

	public void setCoreDiskQuantity(Integer coreDiskQuantity) {
		this.coreDiskQuantity = coreDiskQuantity;
		if(coreDiskQuantity != null){
			putQueryParameter("CoreDiskQuantity", coreDiskQuantity.toString());
		}
	}

	public String getCoreInstanceType() {
		return this.coreInstanceType;
	}

	public void setCoreInstanceType(String coreInstanceType) {
		this.coreInstanceType = coreInstanceType;
		if(coreInstanceType != null){
			putQueryParameter("CoreInstanceType", coreInstanceType);
		}
	}

	public String getNetType() {
		return this.netType;
	}

	public void setNetType(String netType) {
		this.netType = netType;
		if(netType != null){
			putQueryParameter("NetType", netType);
		}
	}

	public List<HostGroup> getHostGroups() {
		return this.hostGroups;
	}

	public void setHostGroups(List<HostGroup> hostGroups) {
		this.hostGroups = hostGroups;	
		if (hostGroups != null) {
			for (int depth1 = 0; depth1 < hostGroups.size(); depth1++) {
				putQueryParameter("HostGroup." + (depth1 + 1) + ".HostGroupId" , hostGroups.get(depth1).getHostGroupId());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".HostGroupName" , hostGroups.get(depth1).getHostGroupName());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".HostGroupType" , hostGroups.get(depth1).getHostGroupType());
				putQueryParameter("HostGroup." + (depth1 + 1) + ".ClusterId" , hostGroups.get(depth1).getClusterId());
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
				putQueryParameter("HostGroup." + (depth1 + 1) + ".VSwitchId" , hostGroups.get(depth1).getVSwitchId());
			}
		}	
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public String getCoreDiskType() {
		return this.coreDiskType;
	}

	public void setCoreDiskType(String coreDiskType) {
		this.coreDiskType = coreDiskType;
		if(coreDiskType != null){
			putQueryParameter("CoreDiskType", coreDiskType);
		}
	}

	public String getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
		if(chargeType != null){
			putQueryParameter("ChargeType", chargeType);
		}
	}

	public Integer getMasterInstanceQuantity() {
		return this.masterInstanceQuantity;
	}

	public void setMasterInstanceQuantity(Integer masterInstanceQuantity) {
		this.masterInstanceQuantity = masterInstanceQuantity;
		if(masterInstanceQuantity != null){
			putQueryParameter("MasterInstanceQuantity", masterInstanceQuantity.toString());
		}
	}

	public Integer getTaskDiskQuantity() {
		return this.taskDiskQuantity;
	}

	public void setTaskDiskQuantity(Integer taskDiskQuantity) {
		this.taskDiskQuantity = taskDiskQuantity;
		if(taskDiskQuantity != null){
			putQueryParameter("TaskDiskQuantity", taskDiskQuantity.toString());
		}
	}

	public static class HostGroup {

		private String hostGroupId;

		private String hostGroupName;

		private String hostGroupType;

		private String clusterId;

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

		private String vSwitchId;

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

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
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

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}
	}

	@Override
	public Class<QueryPriceResponse> getResponseClass() {
		return QueryPriceResponse.class;
	}

}
