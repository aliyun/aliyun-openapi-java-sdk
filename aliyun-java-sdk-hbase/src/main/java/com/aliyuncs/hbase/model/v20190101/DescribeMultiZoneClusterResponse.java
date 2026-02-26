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

	private String vpcId;

	private String encryptionType;

	private Integer moduleId;

	private String payType;

	private String arbiterVSwitchIds;

	private Integer masterNodeCount;

	private String requestId;

	private String instanceName;

	private String coreInstanceType;

	private String encryptionKey;

	private String clusterId;

	private Integer logNodeCount;

	private String expireTime;

	private String multiZoneCombination;

	private String instanceId;

	private Boolean isDeletionProtection;

	private Integer masterDiskSize;

	private Boolean autoRenewal;

	private String clusterName;

	private Integer duration;

	private String moduleStackVersion;

	private String majorVersion;

	private String coreDiskCount;

	private String status;

	private String logInstanceType;

	private Integer logDiskSize;

	private String coreDiskType;

	private String standbyZoneId;

	private String networkType;

	private String primaryVSwitchIds;

	private String createdTimeUTC;

	private String parentId;

	private String expireTimeUTC;

	private String logDiskType;

	private String masterInstanceType;

	private String createdTime;

	private Integer coreDiskSize;

	private String logDiskCount;

	private String standbyVSwitchIds;

	private String maintainStartTime;

	private String primaryZoneId;

	private String maintainEndTime;

	private String arbiterZoneId;

	private String masterDiskType;

	private String regionId;

	private String resourceGroupId;

	private String engine;

	private String taskProgress;

	private String taskStatus;

	private Integer coreNodeCount;

	private Integer coldStorageSize;

	private List<MultiZoneInstanceModel> multiZoneInstanceModels;

	private List<Tag> tags;

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public String getEncryptionType() {
		return this.encryptionType;
	}

	public void setEncryptionType(String encryptionType) {
		this.encryptionType = encryptionType;
	}

	public Integer getModuleId() {
		return this.moduleId;
	}

	public void setModuleId(Integer moduleId) {
		this.moduleId = moduleId;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getArbiterVSwitchIds() {
		return this.arbiterVSwitchIds;
	}

	public void setArbiterVSwitchIds(String arbiterVSwitchIds) {
		this.arbiterVSwitchIds = arbiterVSwitchIds;
	}

	public Integer getMasterNodeCount() {
		return this.masterNodeCount;
	}

	public void setMasterNodeCount(Integer masterNodeCount) {
		this.masterNodeCount = masterNodeCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}

	public String getCoreInstanceType() {
		return this.coreInstanceType;
	}

	public void setCoreInstanceType(String coreInstanceType) {
		this.coreInstanceType = coreInstanceType;
	}

	public String getEncryptionKey() {
		return this.encryptionKey;
	}

	public void setEncryptionKey(String encryptionKey) {
		this.encryptionKey = encryptionKey;
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public Integer getLogNodeCount() {
		return this.logNodeCount;
	}

	public void setLogNodeCount(Integer logNodeCount) {
		this.logNodeCount = logNodeCount;
	}

	public String getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getMultiZoneCombination() {
		return this.multiZoneCombination;
	}

	public void setMultiZoneCombination(String multiZoneCombination) {
		this.multiZoneCombination = multiZoneCombination;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public Boolean getIsDeletionProtection() {
		return this.isDeletionProtection;
	}

	public void setIsDeletionProtection(Boolean isDeletionProtection) {
		this.isDeletionProtection = isDeletionProtection;
	}

	public Integer getMasterDiskSize() {
		return this.masterDiskSize;
	}

	public void setMasterDiskSize(Integer masterDiskSize) {
		this.masterDiskSize = masterDiskSize;
	}

	public Boolean getAutoRenewal() {
		return this.autoRenewal;
	}

	public void setAutoRenewal(Boolean autoRenewal) {
		this.autoRenewal = autoRenewal;
	}

	public String getClusterName() {
		return this.clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}

	public Integer getDuration() {
		return this.duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getModuleStackVersion() {
		return this.moduleStackVersion;
	}

	public void setModuleStackVersion(String moduleStackVersion) {
		this.moduleStackVersion = moduleStackVersion;
	}

	public String getMajorVersion() {
		return this.majorVersion;
	}

	public void setMajorVersion(String majorVersion) {
		this.majorVersion = majorVersion;
	}

	public String getCoreDiskCount() {
		return this.coreDiskCount;
	}

	public void setCoreDiskCount(String coreDiskCount) {
		this.coreDiskCount = coreDiskCount;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLogInstanceType() {
		return this.logInstanceType;
	}

	public void setLogInstanceType(String logInstanceType) {
		this.logInstanceType = logInstanceType;
	}

	public Integer getLogDiskSize() {
		return this.logDiskSize;
	}

	public void setLogDiskSize(Integer logDiskSize) {
		this.logDiskSize = logDiskSize;
	}

	public String getCoreDiskType() {
		return this.coreDiskType;
	}

	public void setCoreDiskType(String coreDiskType) {
		this.coreDiskType = coreDiskType;
	}

	public String getStandbyZoneId() {
		return this.standbyZoneId;
	}

	public void setStandbyZoneId(String standbyZoneId) {
		this.standbyZoneId = standbyZoneId;
	}

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}

	public String getPrimaryVSwitchIds() {
		return this.primaryVSwitchIds;
	}

	public void setPrimaryVSwitchIds(String primaryVSwitchIds) {
		this.primaryVSwitchIds = primaryVSwitchIds;
	}

	public String getCreatedTimeUTC() {
		return this.createdTimeUTC;
	}

	public void setCreatedTimeUTC(String createdTimeUTC) {
		this.createdTimeUTC = createdTimeUTC;
	}

	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getExpireTimeUTC() {
		return this.expireTimeUTC;
	}

	public void setExpireTimeUTC(String expireTimeUTC) {
		this.expireTimeUTC = expireTimeUTC;
	}

	public String getLogDiskType() {
		return this.logDiskType;
	}

	public void setLogDiskType(String logDiskType) {
		this.logDiskType = logDiskType;
	}

	public String getMasterInstanceType() {
		return this.masterInstanceType;
	}

	public void setMasterInstanceType(String masterInstanceType) {
		this.masterInstanceType = masterInstanceType;
	}

	public String getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}

	public Integer getCoreDiskSize() {
		return this.coreDiskSize;
	}

	public void setCoreDiskSize(Integer coreDiskSize) {
		this.coreDiskSize = coreDiskSize;
	}

	public String getLogDiskCount() {
		return this.logDiskCount;
	}

	public void setLogDiskCount(String logDiskCount) {
		this.logDiskCount = logDiskCount;
	}

	public String getStandbyVSwitchIds() {
		return this.standbyVSwitchIds;
	}

	public void setStandbyVSwitchIds(String standbyVSwitchIds) {
		this.standbyVSwitchIds = standbyVSwitchIds;
	}

	public String getMaintainStartTime() {
		return this.maintainStartTime;
	}

	public void setMaintainStartTime(String maintainStartTime) {
		this.maintainStartTime = maintainStartTime;
	}

	public String getPrimaryZoneId() {
		return this.primaryZoneId;
	}

	public void setPrimaryZoneId(String primaryZoneId) {
		this.primaryZoneId = primaryZoneId;
	}

	public String getMaintainEndTime() {
		return this.maintainEndTime;
	}

	public void setMaintainEndTime(String maintainEndTime) {
		this.maintainEndTime = maintainEndTime;
	}

	public String getArbiterZoneId() {
		return this.arbiterZoneId;
	}

	public void setArbiterZoneId(String arbiterZoneId) {
		this.arbiterZoneId = arbiterZoneId;
	}

	public String getMasterDiskType() {
		return this.masterDiskType;
	}

	public void setMasterDiskType(String masterDiskType) {
		this.masterDiskType = masterDiskType;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getTaskProgress() {
		return this.taskProgress;
	}

	public void setTaskProgress(String taskProgress) {
		this.taskProgress = taskProgress;
	}

	public String getTaskStatus() {
		return this.taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public Integer getCoreNodeCount() {
		return this.coreNodeCount;
	}

	public void setCoreNodeCount(Integer coreNodeCount) {
		this.coreNodeCount = coreNodeCount;
	}

	public Integer getColdStorageSize() {
		return this.coldStorageSize;
	}

	public void setColdStorageSize(Integer coldStorageSize) {
		this.coldStorageSize = coldStorageSize;
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

		private String status;

		private Boolean isLatestVersion;

		private String role;

		private String insName;

		private String minorVersion;

		private String latestMinorVersion;

		private String hdfsMinorVersion;

		private String latestHdfsMinorVersion;

		private String isHdfsLatestVersion;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Boolean getIsLatestVersion() {
			return this.isLatestVersion;
		}

		public void setIsLatestVersion(Boolean isLatestVersion) {
			this.isLatestVersion = isLatestVersion;
		}

		public String getRole() {
			return this.role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getInsName() {
			return this.insName;
		}

		public void setInsName(String insName) {
			this.insName = insName;
		}

		public String getMinorVersion() {
			return this.minorVersion;
		}

		public void setMinorVersion(String minorVersion) {
			this.minorVersion = minorVersion;
		}

		public String getLatestMinorVersion() {
			return this.latestMinorVersion;
		}

		public void setLatestMinorVersion(String latestMinorVersion) {
			this.latestMinorVersion = latestMinorVersion;
		}

		public String getHdfsMinorVersion() {
			return this.hdfsMinorVersion;
		}

		public void setHdfsMinorVersion(String hdfsMinorVersion) {
			this.hdfsMinorVersion = hdfsMinorVersion;
		}

		public String getLatestHdfsMinorVersion() {
			return this.latestHdfsMinorVersion;
		}

		public void setLatestHdfsMinorVersion(String latestHdfsMinorVersion) {
			this.latestHdfsMinorVersion = latestHdfsMinorVersion;
		}

		public String getIsHdfsLatestVersion() {
			return this.isHdfsLatestVersion;
		}

		public void setIsHdfsLatestVersion(String isHdfsLatestVersion) {
			this.isHdfsLatestVersion = isHdfsLatestVersion;
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
