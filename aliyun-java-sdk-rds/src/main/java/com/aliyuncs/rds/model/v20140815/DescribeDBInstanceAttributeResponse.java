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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeDBInstanceAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceAttributeResponse extends AcsResponse {

	private String requestId;

	private List<DBInstanceAttribute> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DBInstanceAttribute> getItems() {
		return this.items;
	}

	public void setItems(List<DBInstanceAttribute> items) {
		this.items = items;
	}

	public static class DBInstanceAttribute {

		private String vpcId;

		private String creationTime;

		private String incrementSourceDBInstanceId;

		private String maintainTime;

		private String payType;

		private String availabilityValue;

		private String accountType;

		private String engineVersion;

		private String dedicatedHostGroupId;

		private Integer insId;

		private String connectionString;

		private String superPermissionMode;

		private String instanceNetworkType;

		private String masterInstanceId;

		private String tempUpgradeRecoveryMaxConnections;

		private String autoUpgradeMinorVersion;

		private Boolean multipleTempUpgrade;

		private String expireTime;

		private Integer accountMaxQuantity;

		private String supportCreateSuperAccount;

		private String masterZone;

		private String guardDBInstanceId;

		private Integer dBInstanceStorage;

		private String timeZone;

		private Boolean canTempUpgrade;

		private String latestKernelVersion;

		private Integer tipsLevel;

		private String zoneId;

		private Integer maxConnections;

		private String dBInstanceId;

		private String tempUpgradeRecoveryTime;

		private String dispenseMode;

		private Integer tempUpgradeRecoveryMemory;

		private String replicateId;

		private String tempDBInstanceId;

		private String supportUpgradeAccountType;

		private String advancedFeatures;

		private String dBInstanceStorageType;

		private Long dBInstanceMemory;

		private String iPType;

		private String readDelayTime;

		private String consoleVersion;

		private String connectionMode;

		private String port;

		private String lockMode;

		private String generalGroupName;

		private String originConfiguration;

		private String vpcCloudInstanceId;

		private String collation;

		private Integer maxIOPS;

		private Integer maxIOMBPS;

		private String tips;

		private String securityIPList;

		private String securityIPMode;

		private String dBInstanceClassType;

		private String guardDBInstanceName;

		private String dBInstanceDiskUsed;

		private Integer proxyType;

		private String currentKernelVersion;

		private String dBInstanceDescription;

		private String tempUpgradeRecoveryClass;

		private String tempUpgradeTimeStart;

		private String dBInstanceCPU;

		private String dBInstanceNetType;

		private String dBInstanceType;

		private String tempUpgradeRecoveryMaxIOPS;

		private String lockReason;

		private String dBInstanceStatus;

		private Integer dBMaxQuantity;

		private String regionId;

		private String readonlyInstanceSQLDelayedTime;

		private String tempUpgradeTimeEnd;

		private String vSwitchId;

		private String resourceGroupId;

		private String category;

		private Integer tempUpgradeRecoveryCpu;

		private String dBInstanceClass;

		private String engine;

		private Boolean deletionProtection;

		private List<SlaveZone> slaveZones;

		private List<ReadOnlyDBInstanceId> readOnlyDBInstanceIds;

		private Extra extra;

		private ServerlessConfig serverlessConfig;

		private BabelfishConfig babelfishConfig;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getIncrementSourceDBInstanceId() {
			return this.incrementSourceDBInstanceId;
		}

		public void setIncrementSourceDBInstanceId(String incrementSourceDBInstanceId) {
			this.incrementSourceDBInstanceId = incrementSourceDBInstanceId;
		}

		public String getMaintainTime() {
			return this.maintainTime;
		}

		public void setMaintainTime(String maintainTime) {
			this.maintainTime = maintainTime;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getAvailabilityValue() {
			return this.availabilityValue;
		}

		public void setAvailabilityValue(String availabilityValue) {
			this.availabilityValue = availabilityValue;
		}

		public String getAccountType() {
			return this.accountType;
		}

		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}

		public String getEngineVersion() {
			return this.engineVersion;
		}

		public void setEngineVersion(String engineVersion) {
			this.engineVersion = engineVersion;
		}

		public String getDedicatedHostGroupId() {
			return this.dedicatedHostGroupId;
		}

		public void setDedicatedHostGroupId(String dedicatedHostGroupId) {
			this.dedicatedHostGroupId = dedicatedHostGroupId;
		}

		public Integer getInsId() {
			return this.insId;
		}

		public void setInsId(Integer insId) {
			this.insId = insId;
		}

		public String getConnectionString() {
			return this.connectionString;
		}

		public void setConnectionString(String connectionString) {
			this.connectionString = connectionString;
		}

		public String getSuperPermissionMode() {
			return this.superPermissionMode;
		}

		public void setSuperPermissionMode(String superPermissionMode) {
			this.superPermissionMode = superPermissionMode;
		}

		public String getInstanceNetworkType() {
			return this.instanceNetworkType;
		}

		public void setInstanceNetworkType(String instanceNetworkType) {
			this.instanceNetworkType = instanceNetworkType;
		}

		public String getMasterInstanceId() {
			return this.masterInstanceId;
		}

		public void setMasterInstanceId(String masterInstanceId) {
			this.masterInstanceId = masterInstanceId;
		}

		public String getTempUpgradeRecoveryMaxConnections() {
			return this.tempUpgradeRecoveryMaxConnections;
		}

		public void setTempUpgradeRecoveryMaxConnections(String tempUpgradeRecoveryMaxConnections) {
			this.tempUpgradeRecoveryMaxConnections = tempUpgradeRecoveryMaxConnections;
		}

		public String getAutoUpgradeMinorVersion() {
			return this.autoUpgradeMinorVersion;
		}

		public void setAutoUpgradeMinorVersion(String autoUpgradeMinorVersion) {
			this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
		}

		public Boolean getMultipleTempUpgrade() {
			return this.multipleTempUpgrade;
		}

		public void setMultipleTempUpgrade(Boolean multipleTempUpgrade) {
			this.multipleTempUpgrade = multipleTempUpgrade;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public Integer getAccountMaxQuantity() {
			return this.accountMaxQuantity;
		}

		public void setAccountMaxQuantity(Integer accountMaxQuantity) {
			this.accountMaxQuantity = accountMaxQuantity;
		}

		public String getSupportCreateSuperAccount() {
			return this.supportCreateSuperAccount;
		}

		public void setSupportCreateSuperAccount(String supportCreateSuperAccount) {
			this.supportCreateSuperAccount = supportCreateSuperAccount;
		}

		public String getMasterZone() {
			return this.masterZone;
		}

		public void setMasterZone(String masterZone) {
			this.masterZone = masterZone;
		}

		public String getGuardDBInstanceId() {
			return this.guardDBInstanceId;
		}

		public void setGuardDBInstanceId(String guardDBInstanceId) {
			this.guardDBInstanceId = guardDBInstanceId;
		}

		public Integer getDBInstanceStorage() {
			return this.dBInstanceStorage;
		}

		public void setDBInstanceStorage(Integer dBInstanceStorage) {
			this.dBInstanceStorage = dBInstanceStorage;
		}

		public String getTimeZone() {
			return this.timeZone;
		}

		public void setTimeZone(String timeZone) {
			this.timeZone = timeZone;
		}

		public Boolean getCanTempUpgrade() {
			return this.canTempUpgrade;
		}

		public void setCanTempUpgrade(Boolean canTempUpgrade) {
			this.canTempUpgrade = canTempUpgrade;
		}

		public String getLatestKernelVersion() {
			return this.latestKernelVersion;
		}

		public void setLatestKernelVersion(String latestKernelVersion) {
			this.latestKernelVersion = latestKernelVersion;
		}

		public Integer getTipsLevel() {
			return this.tipsLevel;
		}

		public void setTipsLevel(Integer tipsLevel) {
			this.tipsLevel = tipsLevel;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public Integer getMaxConnections() {
			return this.maxConnections;
		}

		public void setMaxConnections(Integer maxConnections) {
			this.maxConnections = maxConnections;
		}

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public String getTempUpgradeRecoveryTime() {
			return this.tempUpgradeRecoveryTime;
		}

		public void setTempUpgradeRecoveryTime(String tempUpgradeRecoveryTime) {
			this.tempUpgradeRecoveryTime = tempUpgradeRecoveryTime;
		}

		public String getDispenseMode() {
			return this.dispenseMode;
		}

		public void setDispenseMode(String dispenseMode) {
			this.dispenseMode = dispenseMode;
		}

		public Integer getTempUpgradeRecoveryMemory() {
			return this.tempUpgradeRecoveryMemory;
		}

		public void setTempUpgradeRecoveryMemory(Integer tempUpgradeRecoveryMemory) {
			this.tempUpgradeRecoveryMemory = tempUpgradeRecoveryMemory;
		}

		public String getReplicateId() {
			return this.replicateId;
		}

		public void setReplicateId(String replicateId) {
			this.replicateId = replicateId;
		}

		public String getTempDBInstanceId() {
			return this.tempDBInstanceId;
		}

		public void setTempDBInstanceId(String tempDBInstanceId) {
			this.tempDBInstanceId = tempDBInstanceId;
		}

		public String getSupportUpgradeAccountType() {
			return this.supportUpgradeAccountType;
		}

		public void setSupportUpgradeAccountType(String supportUpgradeAccountType) {
			this.supportUpgradeAccountType = supportUpgradeAccountType;
		}

		public String getAdvancedFeatures() {
			return this.advancedFeatures;
		}

		public void setAdvancedFeatures(String advancedFeatures) {
			this.advancedFeatures = advancedFeatures;
		}

		public String getDBInstanceStorageType() {
			return this.dBInstanceStorageType;
		}

		public void setDBInstanceStorageType(String dBInstanceStorageType) {
			this.dBInstanceStorageType = dBInstanceStorageType;
		}

		public Long getDBInstanceMemory() {
			return this.dBInstanceMemory;
		}

		public void setDBInstanceMemory(Long dBInstanceMemory) {
			this.dBInstanceMemory = dBInstanceMemory;
		}

		public String getIPType() {
			return this.iPType;
		}

		public void setIPType(String iPType) {
			this.iPType = iPType;
		}

		public String getReadDelayTime() {
			return this.readDelayTime;
		}

		public void setReadDelayTime(String readDelayTime) {
			this.readDelayTime = readDelayTime;
		}

		public String getConsoleVersion() {
			return this.consoleVersion;
		}

		public void setConsoleVersion(String consoleVersion) {
			this.consoleVersion = consoleVersion;
		}

		public String getConnectionMode() {
			return this.connectionMode;
		}

		public void setConnectionMode(String connectionMode) {
			this.connectionMode = connectionMode;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public String getLockMode() {
			return this.lockMode;
		}

		public void setLockMode(String lockMode) {
			this.lockMode = lockMode;
		}

		public String getGeneralGroupName() {
			return this.generalGroupName;
		}

		public void setGeneralGroupName(String generalGroupName) {
			this.generalGroupName = generalGroupName;
		}

		public String getOriginConfiguration() {
			return this.originConfiguration;
		}

		public void setOriginConfiguration(String originConfiguration) {
			this.originConfiguration = originConfiguration;
		}

		public String getVpcCloudInstanceId() {
			return this.vpcCloudInstanceId;
		}

		public void setVpcCloudInstanceId(String vpcCloudInstanceId) {
			this.vpcCloudInstanceId = vpcCloudInstanceId;
		}

		public String getCollation() {
			return this.collation;
		}

		public void setCollation(String collation) {
			this.collation = collation;
		}

		public Integer getMaxIOPS() {
			return this.maxIOPS;
		}

		public void setMaxIOPS(Integer maxIOPS) {
			this.maxIOPS = maxIOPS;
		}

		public Integer getMaxIOMBPS() {
			return this.maxIOMBPS;
		}

		public void setMaxIOMBPS(Integer maxIOMBPS) {
			this.maxIOMBPS = maxIOMBPS;
		}

		public String getTips() {
			return this.tips;
		}

		public void setTips(String tips) {
			this.tips = tips;
		}

		public String getSecurityIPList() {
			return this.securityIPList;
		}

		public void setSecurityIPList(String securityIPList) {
			this.securityIPList = securityIPList;
		}

		public String getSecurityIPMode() {
			return this.securityIPMode;
		}

		public void setSecurityIPMode(String securityIPMode) {
			this.securityIPMode = securityIPMode;
		}

		public String getDBInstanceClassType() {
			return this.dBInstanceClassType;
		}

		public void setDBInstanceClassType(String dBInstanceClassType) {
			this.dBInstanceClassType = dBInstanceClassType;
		}

		public String getGuardDBInstanceName() {
			return this.guardDBInstanceName;
		}

		public void setGuardDBInstanceName(String guardDBInstanceName) {
			this.guardDBInstanceName = guardDBInstanceName;
		}

		public String getDBInstanceDiskUsed() {
			return this.dBInstanceDiskUsed;
		}

		public void setDBInstanceDiskUsed(String dBInstanceDiskUsed) {
			this.dBInstanceDiskUsed = dBInstanceDiskUsed;
		}

		public Integer getProxyType() {
			return this.proxyType;
		}

		public void setProxyType(Integer proxyType) {
			this.proxyType = proxyType;
		}

		public String getCurrentKernelVersion() {
			return this.currentKernelVersion;
		}

		public void setCurrentKernelVersion(String currentKernelVersion) {
			this.currentKernelVersion = currentKernelVersion;
		}

		public String getDBInstanceDescription() {
			return this.dBInstanceDescription;
		}

		public void setDBInstanceDescription(String dBInstanceDescription) {
			this.dBInstanceDescription = dBInstanceDescription;
		}

		public String getTempUpgradeRecoveryClass() {
			return this.tempUpgradeRecoveryClass;
		}

		public void setTempUpgradeRecoveryClass(String tempUpgradeRecoveryClass) {
			this.tempUpgradeRecoveryClass = tempUpgradeRecoveryClass;
		}

		public String getTempUpgradeTimeStart() {
			return this.tempUpgradeTimeStart;
		}

		public void setTempUpgradeTimeStart(String tempUpgradeTimeStart) {
			this.tempUpgradeTimeStart = tempUpgradeTimeStart;
		}

		public String getDBInstanceCPU() {
			return this.dBInstanceCPU;
		}

		public void setDBInstanceCPU(String dBInstanceCPU) {
			this.dBInstanceCPU = dBInstanceCPU;
		}

		public String getDBInstanceNetType() {
			return this.dBInstanceNetType;
		}

		public void setDBInstanceNetType(String dBInstanceNetType) {
			this.dBInstanceNetType = dBInstanceNetType;
		}

		public String getDBInstanceType() {
			return this.dBInstanceType;
		}

		public void setDBInstanceType(String dBInstanceType) {
			this.dBInstanceType = dBInstanceType;
		}

		public String getTempUpgradeRecoveryMaxIOPS() {
			return this.tempUpgradeRecoveryMaxIOPS;
		}

		public void setTempUpgradeRecoveryMaxIOPS(String tempUpgradeRecoveryMaxIOPS) {
			this.tempUpgradeRecoveryMaxIOPS = tempUpgradeRecoveryMaxIOPS;
		}

		public String getLockReason() {
			return this.lockReason;
		}

		public void setLockReason(String lockReason) {
			this.lockReason = lockReason;
		}

		public String getDBInstanceStatus() {
			return this.dBInstanceStatus;
		}

		public void setDBInstanceStatus(String dBInstanceStatus) {
			this.dBInstanceStatus = dBInstanceStatus;
		}

		public Integer getDBMaxQuantity() {
			return this.dBMaxQuantity;
		}

		public void setDBMaxQuantity(Integer dBMaxQuantity) {
			this.dBMaxQuantity = dBMaxQuantity;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getReadonlyInstanceSQLDelayedTime() {
			return this.readonlyInstanceSQLDelayedTime;
		}

		public void setReadonlyInstanceSQLDelayedTime(String readonlyInstanceSQLDelayedTime) {
			this.readonlyInstanceSQLDelayedTime = readonlyInstanceSQLDelayedTime;
		}

		public String getTempUpgradeTimeEnd() {
			return this.tempUpgradeTimeEnd;
		}

		public void setTempUpgradeTimeEnd(String tempUpgradeTimeEnd) {
			this.tempUpgradeTimeEnd = tempUpgradeTimeEnd;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public Integer getTempUpgradeRecoveryCpu() {
			return this.tempUpgradeRecoveryCpu;
		}

		public void setTempUpgradeRecoveryCpu(Integer tempUpgradeRecoveryCpu) {
			this.tempUpgradeRecoveryCpu = tempUpgradeRecoveryCpu;
		}

		public String getDBInstanceClass() {
			return this.dBInstanceClass;
		}

		public void setDBInstanceClass(String dBInstanceClass) {
			this.dBInstanceClass = dBInstanceClass;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public Boolean getDeletionProtection() {
			return this.deletionProtection;
		}

		public void setDeletionProtection(Boolean deletionProtection) {
			this.deletionProtection = deletionProtection;
		}

		public List<SlaveZone> getSlaveZones() {
			return this.slaveZones;
		}

		public void setSlaveZones(List<SlaveZone> slaveZones) {
			this.slaveZones = slaveZones;
		}

		public List<ReadOnlyDBInstanceId> getReadOnlyDBInstanceIds() {
			return this.readOnlyDBInstanceIds;
		}

		public void setReadOnlyDBInstanceIds(List<ReadOnlyDBInstanceId> readOnlyDBInstanceIds) {
			this.readOnlyDBInstanceIds = readOnlyDBInstanceIds;
		}

		public Extra getExtra() {
			return this.extra;
		}

		public void setExtra(Extra extra) {
			this.extra = extra;
		}

		public ServerlessConfig getServerlessConfig() {
			return this.serverlessConfig;
		}

		public void setServerlessConfig(ServerlessConfig serverlessConfig) {
			this.serverlessConfig = serverlessConfig;
		}

		public BabelfishConfig getBabelfishConfig() {
			return this.babelfishConfig;
		}

		public void setBabelfishConfig(BabelfishConfig babelfishConfig) {
			this.babelfishConfig = babelfishConfig;
		}

		public static class SlaveZone {

			private String zoneId;

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}
		}

		public static class ReadOnlyDBInstanceId {

			private String dBInstanceId;

			public String getDBInstanceId() {
				return this.dBInstanceId;
			}

			public void setDBInstanceId(String dBInstanceId) {
				this.dBInstanceId = dBInstanceId;
			}
		}

		public static class Extra {

			private String replicaGroupStatus;

			private String activeReplicaDBInstanceID;

			private String replicaGroupID;

			private List<String> dBInstanceIds;

			public String getReplicaGroupStatus() {
				return this.replicaGroupStatus;
			}

			public void setReplicaGroupStatus(String replicaGroupStatus) {
				this.replicaGroupStatus = replicaGroupStatus;
			}

			public String getActiveReplicaDBInstanceID() {
				return this.activeReplicaDBInstanceID;
			}

			public void setActiveReplicaDBInstanceID(String activeReplicaDBInstanceID) {
				this.activeReplicaDBInstanceID = activeReplicaDBInstanceID;
			}

			public String getReplicaGroupID() {
				return this.replicaGroupID;
			}

			public void setReplicaGroupID(String replicaGroupID) {
				this.replicaGroupID = replicaGroupID;
			}

			public List<String> getDBInstanceIds() {
				return this.dBInstanceIds;
			}

			public void setDBInstanceIds(List<String> dBInstanceIds) {
				this.dBInstanceIds = dBInstanceIds;
			}
		}

		public static class ServerlessConfig {

			private Double scaleMin;

			private Double scaleMax;

			public Double getScaleMin() {
				return this.scaleMin;
			}

			public void setScaleMin(Double scaleMin) {
				this.scaleMin = scaleMin;
			}

			public Double getScaleMax() {
				return this.scaleMax;
			}

			public void setScaleMax(Double scaleMax) {
				this.scaleMax = scaleMax;
			}
		}

		public static class BabelfishConfig {

			private String babelfishEnabled;

			private String migrationMode;

			public String getBabelfishEnabled() {
				return this.babelfishEnabled;
			}

			public void setBabelfishEnabled(String babelfishEnabled) {
				this.babelfishEnabled = babelfishEnabled;
			}

			public String getMigrationMode() {
				return this.migrationMode;
			}

			public void setMigrationMode(String migrationMode) {
				this.migrationMode = migrationMode;
			}
		}
	}

	@Override
	public DescribeDBInstanceAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
