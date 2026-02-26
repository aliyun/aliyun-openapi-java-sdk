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
import com.aliyuncs.hbase.transform.v20190101.DescribeInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceResponse extends AcsResponse {

	private String vpcId;

	private String status;

	private String encryptionType;

	private Integer moduleId;

	private String vswitchId;

	private String backupStatus;

	private String payType;

	private String coreDiskType;

	private Integer masterNodeCount;

	private String networkType;

	private String createdTimeUTC;

	private Integer coldStorageSize;

	private String parentId;

	private Boolean isLatestVersion;

	private String expireTimeUTC;

	private String requestId;

	private String instanceName;

	private String masterInstanceType;

	private String coreInstanceType;

	private String encryptionKey;

	private String createdTime;

	private Integer coreDiskSize;

	private String clusterId;

	private String expireTime;

	private String maintainStartTime;

	private String confirmMaintainTime;

	private Boolean isHa;

	private String maintainEndTime;

	private String instanceId;

	private String coldStorageStatus;

	private Boolean isDeletionProtection;

	private String minorVersion;

	private String regionId;

	private Integer masterDiskSize;

	private String masterDiskType;

	private Boolean needUpgrade;

	private Boolean isMultiModel;

	private Boolean autoRenewal;

	private String clusterType;

	private String resourceGroupId;

	private String clusterName;

	private String zoneId;

	private Integer duration;

	private String moduleStackVersion;

	private String engine;

	private String majorVersion;

	private String coreDiskCount;

	private String taskProgress;

	private String taskStatus;

	private Integer coreNodeCount;

	private Boolean enableHbaseProxy;

	private String lproxyMinorVersion;

	private List<Tag> tags;

	private List<String> needUpgradeComps;

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String getVswitchId() {
		return this.vswitchId;
	}

	public void setVswitchId(String vswitchId) {
		this.vswitchId = vswitchId;
	}

	public String getBackupStatus() {
		return this.backupStatus;
	}

	public void setBackupStatus(String backupStatus) {
		this.backupStatus = backupStatus;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getCoreDiskType() {
		return this.coreDiskType;
	}

	public void setCoreDiskType(String coreDiskType) {
		this.coreDiskType = coreDiskType;
	}

	public Integer getMasterNodeCount() {
		return this.masterNodeCount;
	}

	public void setMasterNodeCount(Integer masterNodeCount) {
		this.masterNodeCount = masterNodeCount;
	}

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}

	public String getCreatedTimeUTC() {
		return this.createdTimeUTC;
	}

	public void setCreatedTimeUTC(String createdTimeUTC) {
		this.createdTimeUTC = createdTimeUTC;
	}

	public Integer getColdStorageSize() {
		return this.coldStorageSize;
	}

	public void setColdStorageSize(Integer coldStorageSize) {
		this.coldStorageSize = coldStorageSize;
	}

	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public Boolean getIsLatestVersion() {
		return this.isLatestVersion;
	}

	public void setIsLatestVersion(Boolean isLatestVersion) {
		this.isLatestVersion = isLatestVersion;
	}

	public String getExpireTimeUTC() {
		return this.expireTimeUTC;
	}

	public void setExpireTimeUTC(String expireTimeUTC) {
		this.expireTimeUTC = expireTimeUTC;
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

	public String getMasterInstanceType() {
		return this.masterInstanceType;
	}

	public void setMasterInstanceType(String masterInstanceType) {
		this.masterInstanceType = masterInstanceType;
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

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public String getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getMaintainStartTime() {
		return this.maintainStartTime;
	}

	public void setMaintainStartTime(String maintainStartTime) {
		this.maintainStartTime = maintainStartTime;
	}

	public String getConfirmMaintainTime() {
		return this.confirmMaintainTime;
	}

	public void setConfirmMaintainTime(String confirmMaintainTime) {
		this.confirmMaintainTime = confirmMaintainTime;
	}

	public Boolean getIsHa() {
		return this.isHa;
	}

	public void setIsHa(Boolean isHa) {
		this.isHa = isHa;
	}

	public String getMaintainEndTime() {
		return this.maintainEndTime;
	}

	public void setMaintainEndTime(String maintainEndTime) {
		this.maintainEndTime = maintainEndTime;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getColdStorageStatus() {
		return this.coldStorageStatus;
	}

	public void setColdStorageStatus(String coldStorageStatus) {
		this.coldStorageStatus = coldStorageStatus;
	}

	public Boolean getIsDeletionProtection() {
		return this.isDeletionProtection;
	}

	public void setIsDeletionProtection(Boolean isDeletionProtection) {
		this.isDeletionProtection = isDeletionProtection;
	}

	public String getMinorVersion() {
		return this.minorVersion;
	}

	public void setMinorVersion(String minorVersion) {
		this.minorVersion = minorVersion;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
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

	public Boolean getNeedUpgrade() {
		return this.needUpgrade;
	}

	public void setNeedUpgrade(Boolean needUpgrade) {
		this.needUpgrade = needUpgrade;
	}

	public Boolean getIsMultiModel() {
		return this.isMultiModel;
	}

	public void setIsMultiModel(Boolean isMultiModel) {
		this.isMultiModel = isMultiModel;
	}

	public Boolean getAutoRenewal() {
		return this.autoRenewal;
	}

	public void setAutoRenewal(Boolean autoRenewal) {
		this.autoRenewal = autoRenewal;
	}

	public String getClusterType() {
		return this.clusterType;
	}

	public void setClusterType(String clusterType) {
		this.clusterType = clusterType;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public String getClusterName() {
		return this.clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
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

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
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

	public Boolean getEnableHbaseProxy() {
		return this.enableHbaseProxy;
	}

	public void setEnableHbaseProxy(Boolean enableHbaseProxy) {
		this.enableHbaseProxy = enableHbaseProxy;
	}

	public String getLproxyMinorVersion() {
		return this.lproxyMinorVersion;
	}

	public void setLproxyMinorVersion(String lproxyMinorVersion) {
		this.lproxyMinorVersion = lproxyMinorVersion;
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public List<String> getNeedUpgradeComps() {
		return this.needUpgradeComps;
	}

	public void setNeedUpgradeComps(List<String> needUpgradeComps) {
		this.needUpgradeComps = needUpgradeComps;
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
	public DescribeInstanceResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceResponseUnmarshaller.unmarshall(this, context);
	}
}
