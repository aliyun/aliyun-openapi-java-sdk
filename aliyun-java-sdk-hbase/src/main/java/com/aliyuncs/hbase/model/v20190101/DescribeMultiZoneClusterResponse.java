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

package com.aliyuncs.hbase.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbase.transform.v20190101.DescribeMultiZoneClusterResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMultiZoneClusterResponse extends AcsResponse {

	private Boolean autoRenewal;

	private String clusterId;

	private String clusterName;

	private String createdTime;

	private String createdTimeUTC;

	private Integer duration;

	private String engine;

	private String expireTime;

	private String expireTimeUTC;

	private String instanceId;

	private String instanceName;

	private Boolean isDeletionProtection;

	private String maintainEndTime;

	private String maintainStartTime;

	private String majorVersion;

	private Integer masterDiskSize;

	private String masterDiskType;

	private String masterInstanceType;

	private Integer masterNodeCount;

	private String coreDiskCount;

	private Integer coreDiskSize;

	private String coreDiskType;

	private String coreInstanceType;

	private Integer coreNodeCount;

	private String logDiskCount;

	private Integer logDiskSize;

	private String logDiskType;

	private String logInstanceType;

	private Integer logNodeCount;

	private Integer moduleId;

	private String moduleStackVersion;

	private String networkType;

	private String parentId;

	private String payType;

	private String regionId;

	private String requestId;

	private String status;

	private String multiZoneCombination;

	private String primaryZoneId;

	private String primaryVSwitchIds;

	private String standbyZoneId;

	private String standbyVSwitchIds;

	private String arbiterZoneId;

	private String arbiterVSwitchIds;

	private String vpcId;

	private List<MultiZoneInstanceModel> multiZoneInstanceModels;

	private List<Tag> tags;

	public Boolean getAutoRenewal() {
		return this.autoRenewal;
	}

	public void setAutoRenewal(Boolean autoRenewal) {
		this.autoRenewal = autoRenewal;
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public String getClusterName() {
		return this.clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}

	public String getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public String getCreatedTimeUTC() {
		return this.createdTimeUTC;
	}

	public void setCreatedTimeUTC(String createdTimeUTC) {
		this.createdTimeUTC = createdTimeUTC;
	}

	public Integer getDuration() {
		return this.duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getExpireTimeUTC() {
		return this.expireTimeUTC;
	}

	public void setExpireTimeUTC(String expireTimeUTC) {
		this.expireTimeUTC = expireTimeUTC;
	}

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

	public Boolean getIsDeletionProtection() {
		return this.isDeletionProtection;
	}

	public void setIsDeletionProtection(Boolean isDeletionProtection) {
		this.isDeletionProtection = isDeletionProtection;
	}

	public String getMaintainEndTime() {
		return this.maintainEndTime;
	}

	public void setMaintainEndTime(String maintainEndTime) {
		this.maintainEndTime = maintainEndTime;
	}

	public String getMaintainStartTime() {
		return this.maintainStartTime;
	}

	public void setMaintainStartTime(String maintainStartTime) {
		this.maintainStartTime = maintainStartTime;
	}

	public String getMajorVersion() {
		return this.majorVersion;
	}

	public void setMajorVersion(String majorVersion) {
		this.majorVersion = majorVersion;
	}

	public Integer getMasterDiskSize() {
		return this.masterDiskSize;
	}

	public void setMasterDiskSize(Integer masterDiskSize) {
		this.masterDiskSize = masterDiskSize;
	}

	public String getMasterDiskType() {
		return this.masterDiskType;
	}

	public void setMasterDiskType(String masterDiskType) {
		this.masterDiskType = masterDiskType;
	}

	public String getMasterInstanceType() {
		return this.masterInstanceType;
	}

	public void setMasterInstanceType(String masterInstanceType) {
		this.masterInstanceType = masterInstanceType;
	}

	public Integer getMasterNodeCount() {
		return this.masterNodeCount;
	}

	public void setMasterNodeCount(Integer masterNodeCount) {
		this.masterNodeCount = masterNodeCount;
	}

	public String getCoreDiskCount() {
		return this.coreDiskCount;
	}

	public void setCoreDiskCount(String coreDiskCount) {
		this.coreDiskCount = coreDiskCount;
	}

	public Integer getCoreDiskSize() {
		return this.coreDiskSize;
	}

	public void setCoreDiskSize(Integer coreDiskSize) {
		this.coreDiskSize = coreDiskSize;
	}

	public String getCoreDiskType() {
		return this.coreDiskType;
	}

	public void setCoreDiskType(String coreDiskType) {
		this.coreDiskType = coreDiskType;
	}

	public String getCoreInstanceType() {
		return this.coreInstanceType;
	}

	public void setCoreInstanceType(String coreInstanceType) {
		this.coreInstanceType = coreInstanceType;
	}

	public Integer getCoreNodeCount() {
		return this.coreNodeCount;
	}

	public void setCoreNodeCount(Integer coreNodeCount) {
		this.coreNodeCount = coreNodeCount;
	}

	public String getLogDiskCount() {
		return this.logDiskCount;
	}

	public void setLogDiskCount(String logDiskCount) {
		this.logDiskCount = logDiskCount;
	}

	public Integer getLogDiskSize() {
		return this.logDiskSize;
	}

	public void setLogDiskSize(Integer logDiskSize) {
		this.logDiskSize = logDiskSize;
	}

	public String getLogDiskType() {
		return this.logDiskType;
	}

	public void setLogDiskType(String logDiskType) {
		this.logDiskType = logDiskType;
	}

	public String getLogInstanceType() {
		return this.logInstanceType;
	}

	public void setLogInstanceType(String logInstanceType) {
		this.logInstanceType = logInstanceType;
	}

	public Integer getLogNodeCount() {
		return this.logNodeCount;
	}

	public void setLogNodeCount(Integer logNodeCount) {
		this.logNodeCount = logNodeCount;
	}

	public Integer getModuleId() {
		return this.moduleId;
	}

	public void setModuleId(Integer moduleId) {
		this.moduleId = moduleId;
	}

	public String getModuleStackVersion() {
		return this.moduleStackVersion;
	}

	public void setModuleStackVersion(String moduleStackVersion) {
		this.moduleStackVersion = moduleStackVersion;
	}

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}

	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMultiZoneCombination() {
		return this.multiZoneCombination;
	}

	public void setMultiZoneCombination(String multiZoneCombination) {
		this.multiZoneCombination = multiZoneCombination;
	}

	public String getPrimaryZoneId() {
		return this.primaryZoneId;
	}

	public void setPrimaryZoneId(String primaryZoneId) {
		this.primaryZoneId = primaryZoneId;
	}

	public String getPrimaryVSwitchIds() {
		return this.primaryVSwitchIds;
	}

	public void setPrimaryVSwitchIds(String primaryVSwitchIds) {
		this.primaryVSwitchIds = primaryVSwitchIds;
	}

	public String getStandbyZoneId() {
		return this.standbyZoneId;
	}

	public void setStandbyZoneId(String standbyZoneId) {
		this.standbyZoneId = standbyZoneId;
	}

	public String getStandbyVSwitchIds() {
		return this.standbyVSwitchIds;
	}

	public void setStandbyVSwitchIds(String standbyVSwitchIds) {
		this.standbyVSwitchIds = standbyVSwitchIds;
	}

	public String getArbiterZoneId() {
		return this.arbiterZoneId;
	}

	public void setArbiterZoneId(String arbiterZoneId) {
		this.arbiterZoneId = arbiterZoneId;
	}

	public String getArbiterVSwitchIds() {
		return this.arbiterVSwitchIds;
	}

	public void setArbiterVSwitchIds(String arbiterVSwitchIds) {
		this.arbiterVSwitchIds = arbiterVSwitchIds;
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public List<MultiZoneInstanceModel> getMultiZoneInstanceModels() {
		return this.multiZoneInstanceModels;
	}

	public void setMultiZoneInstanceModels(List<MultiZoneInstanceModel> multiZoneInstanceModels) {
		this.multiZoneInstanceModels = multiZoneInstanceModels;
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public static class MultiZoneInstanceModel {

		private String insName;

		private Boolean isLatestVersion;

		private String minorVersion;

		private String status;

		private String role;

		public String getInsName() {
			return this.insName;
		}

		public void setInsName(String insName) {
			this.insName = insName;
		}

		public Boolean getIsLatestVersion() {
			return this.isLatestVersion;
		}

		public void setIsLatestVersion(Boolean isLatestVersion) {
			this.isLatestVersion = isLatestVersion;
		}

		public String getMinorVersion() {
			return this.minorVersion;
		}

		public void setMinorVersion(String minorVersion) {
			this.minorVersion = minorVersion;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getRole() {
			return this.role;
		}

		public void setRole(String role) {
			this.role = role;
		}
	}

	public static class Tag {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public DescribeMultiZoneClusterResponse getInstance(UnmarshallerContext context) {
		return	DescribeMultiZoneClusterResponseUnmarshaller.unmarshall(this, context);
	}
}
