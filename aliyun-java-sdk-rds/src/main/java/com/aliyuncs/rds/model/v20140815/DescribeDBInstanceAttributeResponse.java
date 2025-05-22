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

		private Integer accountMaxQuantity;

		private String accountType;

		private String advancedFeatures;

		private String autoUpgradeMinorVersion;

		private String availabilityValue;

		private String bpeEnabled;

		private Boolean burstingEnabled;

		private Boolean canTempUpgrade;

		private String category;

		private Boolean coldDataEnabled;

		private String collation;

		private String connectionMode;

		private String connectionString;

		private String consoleVersion;

		private String creationTime;

		private String currentKernelVersion;

		private String dBInstanceCPU;

		private String dBInstanceClass;

		private String dBInstanceClassType;

		private String dBInstanceDescription;

		private String dBInstanceDiskUsed;

		private String dBInstanceId;

		private Long dBInstanceMemory;

		private String dBInstanceNetType;

		private String dBInstanceStatus;

		private Integer dBInstanceStorage;

		private String dBInstanceStorageType;

		private String dBInstanceType;

		private Integer dBMaxQuantity;

		private String dedicatedHostGroupId;

		private Boolean deletionProtection;

		private String disasterRecoveryInfo;

		private String disasterRecoveryInstances;

		private String dispenseMode;

		private String engine;

		private String engineVersion;

		private String expireTime;

		private String generalGroupName;

		private String guardDBInstanceId;

		private String guardDBInstanceName;

		private String iPType;

		private String incrementSourceDBInstanceId;

		private Integer insId;

		private String instanceNetworkType;

		private String instructionSetArch;

		private String ioAccelerationEnabled;

		private String latestKernelVersion;

		private String lockMode;

		private String lockReason;

		private String maintainTime;

		private String masterInstanceId;

		private String masterZone;

		private Integer maxConnections;

		private Integer maxIOMBPS;

		private Integer maxIOPS;

		private Boolean multipleTempUpgrade;

		private String originConfiguration;

		private String pGBouncerEnabled;

		private String payType;

		private String port;

		private Integer proxyType;

		private String readDelayTime;

		private String readonlyInstanceSQLDelayedTime;

		private String regionId;

		private String replicateId;

		private String resourceGroupId;

		private String securityIPList;

		private String securityIPMode;

		private String superPermissionMode;

		private String supportCreateSuperAccount;

		private String supportUpgradeAccountType;

		private String tempDBInstanceId;

		private String tempUpgradeRecoveryClass;

		private Integer tempUpgradeRecoveryCpu;

		private String tempUpgradeRecoveryMaxConnections;

		private String tempUpgradeRecoveryMaxIOPS;

		private Integer tempUpgradeRecoveryMemory;

		private String tempUpgradeRecoveryTime;

		private String tempUpgradeTimeEnd;

		private String tempUpgradeTimeStart;

		private String timeZone;

		private String tips;

		private Integer tipsLevel;

		private String vSwitchId;

		private String vpcCloudInstanceId;

		private String vpcId;

		private String zoneId;

		private String kindCode;

		private String optimizedWritesInfo;

		private String compressionMode;

		private Boolean supportCompression;

		private String compressionRatio;

		private String blueGreenDeploymentName;

		private String greenInstanceName;

		private String blueInstanceName;

		private Boolean computeBurstEnabled;

		private String readOnlyStatus;

		private List<DBClusterNode> dBClusterNodes;

		private List<ReadOnlyDBInstanceId> readOnlyDBInstanceIds;

		private List<SlaveZone> slaveZones;

		private BabelfishConfig babelfishConfig;

		private Extra extra;

		private ServerlessConfig serverlessConfig;

		public Integer getAccountMaxQuantity() {
			return this.accountMaxQuantity;
		}

		public void setAccountMaxQuantity(Integer accountMaxQuantity) {
			this.accountMaxQuantity = accountMaxQuantity;
		}

		public String getAccountType() {
			return this.accountType;
		}

		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}

		public String getAdvancedFeatures() {
			return this.advancedFeatures;
		}

		public void setAdvancedFeatures(String advancedFeatures) {
			this.advancedFeatures = advancedFeatures;
		}

		public String getAutoUpgradeMinorVersion() {
			return this.autoUpgradeMinorVersion;
		}

		public void setAutoUpgradeMinorVersion(String autoUpgradeMinorVersion) {
			this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
		}

		public String getAvailabilityValue() {
			return this.availabilityValue;
		}

		public void setAvailabilityValue(String availabilityValue) {
			this.availabilityValue = availabilityValue;
		}

		public String getBpeEnabled() {
			return this.bpeEnabled;
		}

		public void setBpeEnabled(String bpeEnabled) {
			this.bpeEnabled = bpeEnabled;
		}

		public Boolean getBurstingEnabled() {
			return this.burstingEnabled;
		}

		public void setBurstingEnabled(Boolean burstingEnabled) {
			this.burstingEnabled = burstingEnabled;
		}

		public Boolean getCanTempUpgrade() {
			return this.canTempUpgrade;
		}

		public void setCanTempUpgrade(Boolean canTempUpgrade) {
			this.canTempUpgrade = canTempUpgrade;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public Boolean getColdDataEnabled() {
			return this.coldDataEnabled;
		}

		public void setColdDataEnabled(Boolean coldDataEnabled) {
			this.coldDataEnabled = coldDataEnabled;
		}

		public String getCollation() {
			return this.collation;
		}

		public void setCollation(String collation) {
			this.collation = collation;
		}

		public String getConnectionMode() {
			return this.connectionMode;
		}

		public void setConnectionMode(String connectionMode) {
			this.connectionMode = connectionMode;
		}

		public String getConnectionString() {
			return this.connectionString;
		}

		public void setConnectionString(String connectionString) {
			this.connectionString = connectionString;
		}

		public String getConsoleVersion() {
			return this.consoleVersion;
		}

		public void setConsoleVersion(String consoleVersion) {
			this.consoleVersion = consoleVersion;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getCurrentKernelVersion() {
			return this.currentKernelVersion;
		}

		public void setCurrentKernelVersion(String currentKernelVersion) {
			this.currentKernelVersion = currentKernelVersion;
		}

		public String getDBInstanceCPU() {
			return this.dBInstanceCPU;
		}

		public void setDBInstanceCPU(String dBInstanceCPU) {
			this.dBInstanceCPU = dBInstanceCPU;
		}

		public String getDBInstanceClass() {
			return this.dBInstanceClass;
		}

		public void setDBInstanceClass(String dBInstanceClass) {
			this.dBInstanceClass = dBInstanceClass;
		}

		public String getDBInstanceClassType() {
			return this.dBInstanceClassType;
		}

		public void setDBInstanceClassType(String dBInstanceClassType) {
			this.dBInstanceClassType = dBInstanceClassType;
		}

		public String getDBInstanceDescription() {
			return this.dBInstanceDescription;
		}

		public void setDBInstanceDescription(String dBInstanceDescription) {
			this.dBInstanceDescription = dBInstanceDescription;
		}

		public String getDBInstanceDiskUsed() {
			return this.dBInstanceDiskUsed;
		}

		public void setDBInstanceDiskUsed(String dBInstanceDiskUsed) {
			this.dBInstanceDiskUsed = dBInstanceDiskUsed;
		}

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public Long getDBInstanceMemory() {
			return this.dBInstanceMemory;
		}

		public void setDBInstanceMemory(Long dBInstanceMemory) {
			this.dBInstanceMemory = dBInstanceMemory;
		}

		public String getDBInstanceNetType() {
			return this.dBInstanceNetType;
		}

		public void setDBInstanceNetType(String dBInstanceNetType) {
			this.dBInstanceNetType = dBInstanceNetType;
		}

		public String getDBInstanceStatus() {
			return this.dBInstanceStatus;
		}

		public void setDBInstanceStatus(String dBInstanceStatus) {
			this.dBInstanceStatus = dBInstanceStatus;
		}

		public Integer getDBInstanceStorage() {
			return this.dBInstanceStorage;
		}

		public void setDBInstanceStorage(Integer dBInstanceStorage) {
			this.dBInstanceStorage = dBInstanceStorage;
		}

		public String getDBInstanceStorageType() {
			return this.dBInstanceStorageType;
		}

		public void setDBInstanceStorageType(String dBInstanceStorageType) {
			this.dBInstanceStorageType = dBInstanceStorageType;
		}

		public String getDBInstanceType() {
			return this.dBInstanceType;
		}

		public void setDBInstanceType(String dBInstanceType) {
			this.dBInstanceType = dBInstanceType;
		}

		public Integer getDBMaxQuantity() {
			return this.dBMaxQuantity;
		}

		public void setDBMaxQuantity(Integer dBMaxQuantity) {
			this.dBMaxQuantity = dBMaxQuantity;
		}

		public String getDedicatedHostGroupId() {
			return this.dedicatedHostGroupId;
		}

		public void setDedicatedHostGroupId(String dedicatedHostGroupId) {
			this.dedicatedHostGroupId = dedicatedHostGroupId;
		}

		public Boolean getDeletionProtection() {
			return this.deletionProtection;
		}

		public void setDeletionProtection(Boolean deletionProtection) {
			this.deletionProtection = deletionProtection;
		}

		public String getDisasterRecoveryInfo() {
			return this.disasterRecoveryInfo;
		}

		public void setDisasterRecoveryInfo(String disasterRecoveryInfo) {
			this.disasterRecoveryInfo = disasterRecoveryInfo;
		}

		public String getDisasterRecoveryInstances() {
			return this.disasterRecoveryInstances;
		}

		public void setDisasterRecoveryInstances(String disasterRecoveryInstances) {
			this.disasterRecoveryInstances = disasterRecoveryInstances;
		}

		public String getDispenseMode() {
			return this.dispenseMode;
		}

		public void setDispenseMode(String dispenseMode) {
			this.dispenseMode = dispenseMode;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getEngineVersion() {
			return this.engineVersion;
		}

		public void setEngineVersion(String engineVersion) {
			this.engineVersion = engineVersion;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getGeneralGroupName() {
			return this.generalGroupName;
		}

		public void setGeneralGroupName(String generalGroupName) {
			this.generalGroupName = generalGroupName;
		}

		public String getGuardDBInstanceId() {
			return this.guardDBInstanceId;
		}

		public void setGuardDBInstanceId(String guardDBInstanceId) {
			this.guardDBInstanceId = guardDBInstanceId;
		}

		public String getGuardDBInstanceName() {
			return this.guardDBInstanceName;
		}

		public void setGuardDBInstanceName(String guardDBInstanceName) {
			this.guardDBInstanceName = guardDBInstanceName;
		}

		public String getIPType() {
			return this.iPType;
		}

		public void setIPType(String iPType) {
			this.iPType = iPType;
		}

		public String getIncrementSourceDBInstanceId() {
			return this.incrementSourceDBInstanceId;
		}

		public void setIncrementSourceDBInstanceId(String incrementSourceDBInstanceId) {
			this.incrementSourceDBInstanceId = incrementSourceDBInstanceId;
		}

		public Integer getInsId() {
			return this.insId;
		}

		public void setInsId(Integer insId) {
			this.insId = insId;
		}

		public String getInstanceNetworkType() {
			return this.instanceNetworkType;
		}

		public void setInstanceNetworkType(String instanceNetworkType) {
			this.instanceNetworkType = instanceNetworkType;
		}

		public String getInstructionSetArch() {
			return this.instructionSetArch;
		}

		public void setInstructionSetArch(String instructionSetArch) {
			this.instructionSetArch = instructionSetArch;
		}

		public String getIoAccelerationEnabled() {
			return this.ioAccelerationEnabled;
		}

		public void setIoAccelerationEnabled(String ioAccelerationEnabled) {
			this.ioAccelerationEnabled = ioAccelerationEnabled;
		}

		public String getLatestKernelVersion() {
			return this.latestKernelVersion;
		}

		public void setLatestKernelVersion(String latestKernelVersion) {
			this.latestKernelVersion = latestKernelVersion;
		}

		public String getLockMode() {
			return this.lockMode;
		}

		public void setLockMode(String lockMode) {
			this.lockMode = lockMode;
		}

		public String getLockReason() {
			return this.lockReason;
		}

		public void setLockReason(String lockReason) {
			this.lockReason = lockReason;
		}

		public String getMaintainTime() {
			return this.maintainTime;
		}

		public void setMaintainTime(String maintainTime) {
			this.maintainTime = maintainTime;
		}

		public String getMasterInstanceId() {
			return this.masterInstanceId;
		}

		public void setMasterInstanceId(String masterInstanceId) {
			this.masterInstanceId = masterInstanceId;
		}

		public String getMasterZone() {
			return this.masterZone;
		}

		public void setMasterZone(String masterZone) {
			this.masterZone = masterZone;
		}

		public Integer getMaxConnections() {
			return this.maxConnections;
		}

		public void setMaxConnections(Integer maxConnections) {
			this.maxConnections = maxConnections;
		}

		public Integer getMaxIOMBPS() {
			return this.maxIOMBPS;
		}

		public void setMaxIOMBPS(Integer maxIOMBPS) {
			this.maxIOMBPS = maxIOMBPS;
		}

		public Integer getMaxIOPS() {
			return this.maxIOPS;
		}

		public void setMaxIOPS(Integer maxIOPS) {
			this.maxIOPS = maxIOPS;
		}

		public Boolean getMultipleTempUpgrade() {
			return this.multipleTempUpgrade;
		}

		public void setMultipleTempUpgrade(Boolean multipleTempUpgrade) {
			this.multipleTempUpgrade = multipleTempUpgrade;
		}

		public String getOriginConfiguration() {
			return this.originConfiguration;
		}

		public void setOriginConfiguration(String originConfiguration) {
			this.originConfiguration = originConfiguration;
		}

		public String getPGBouncerEnabled() {
			return this.pGBouncerEnabled;
		}

		public void setPGBouncerEnabled(String pGBouncerEnabled) {
			this.pGBouncerEnabled = pGBouncerEnabled;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public Integer getProxyType() {
			return this.proxyType;
		}

		public void setProxyType(Integer proxyType) {
			this.proxyType = proxyType;
		}

		public String getReadDelayTime() {
			return this.readDelayTime;
		}

		public void setReadDelayTime(String readDelayTime) {
			this.readDelayTime = readDelayTime;
		}

		public String getReadonlyInstanceSQLDelayedTime() {
			return this.readonlyInstanceSQLDelayedTime;
		}

		public void setReadonlyInstanceSQLDelayedTime(String readonlyInstanceSQLDelayedTime) {
			this.readonlyInstanceSQLDelayedTime = readonlyInstanceSQLDelayedTime;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getReplicateId() {
			return this.replicateId;
		}

		public void setReplicateId(String replicateId) {
			this.replicateId = replicateId;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
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

		public String getSuperPermissionMode() {
			return this.superPermissionMode;
		}

		public void setSuperPermissionMode(String superPermissionMode) {
			this.superPermissionMode = superPermissionMode;
		}

		public String getSupportCreateSuperAccount() {
			return this.supportCreateSuperAccount;
		}

		public void setSupportCreateSuperAccount(String supportCreateSuperAccount) {
			this.supportCreateSuperAccount = supportCreateSuperAccount;
		}

		public String getSupportUpgradeAccountType() {
			return this.supportUpgradeAccountType;
		}

		public void setSupportUpgradeAccountType(String supportUpgradeAccountType) {
			this.supportUpgradeAccountType = supportUpgradeAccountType;
		}

		public String getTempDBInstanceId() {
			return this.tempDBInstanceId;
		}

		public void setTempDBInstanceId(String tempDBInstanceId) {
			this.tempDBInstanceId = tempDBInstanceId;
		}

		public String getTempUpgradeRecoveryClass() {
			return this.tempUpgradeRecoveryClass;
		}

		public void setTempUpgradeRecoveryClass(String tempUpgradeRecoveryClass) {
			this.tempUpgradeRecoveryClass = tempUpgradeRecoveryClass;
		}

		public Integer getTempUpgradeRecoveryCpu() {
			return this.tempUpgradeRecoveryCpu;
		}

		public void setTempUpgradeRecoveryCpu(Integer tempUpgradeRecoveryCpu) {
			this.tempUpgradeRecoveryCpu = tempUpgradeRecoveryCpu;
		}

		public String getTempUpgradeRecoveryMaxConnections() {
			return this.tempUpgradeRecoveryMaxConnections;
		}

		public void setTempUpgradeRecoveryMaxConnections(String tempUpgradeRecoveryMaxConnections) {
			this.tempUpgradeRecoveryMaxConnections = tempUpgradeRecoveryMaxConnections;
		}

		public String getTempUpgradeRecoveryMaxIOPS() {
			return this.tempUpgradeRecoveryMaxIOPS;
		}

		public void setTempUpgradeRecoveryMaxIOPS(String tempUpgradeRecoveryMaxIOPS) {
			this.tempUpgradeRecoveryMaxIOPS = tempUpgradeRecoveryMaxIOPS;
		}

		public Integer getTempUpgradeRecoveryMemory() {
			return this.tempUpgradeRecoveryMemory;
		}

		public void setTempUpgradeRecoveryMemory(Integer tempUpgradeRecoveryMemory) {
			this.tempUpgradeRecoveryMemory = tempUpgradeRecoveryMemory;
		}

		public String getTempUpgradeRecoveryTime() {
			return this.tempUpgradeRecoveryTime;
		}

		public void setTempUpgradeRecoveryTime(String tempUpgradeRecoveryTime) {
			this.tempUpgradeRecoveryTime = tempUpgradeRecoveryTime;
		}

		public String getTempUpgradeTimeEnd() {
			return this.tempUpgradeTimeEnd;
		}

		public void setTempUpgradeTimeEnd(String tempUpgradeTimeEnd) {
			this.tempUpgradeTimeEnd = tempUpgradeTimeEnd;
		}

		public String getTempUpgradeTimeStart() {
			return this.tempUpgradeTimeStart;
		}

		public void setTempUpgradeTimeStart(String tempUpgradeTimeStart) {
			this.tempUpgradeTimeStart = tempUpgradeTimeStart;
		}

		public String getTimeZone() {
			return this.timeZone;
		}

		public void setTimeZone(String timeZone) {
			this.timeZone = timeZone;
		}

		public String getTips() {
			return this.tips;
		}

		public void setTips(String tips) {
			this.tips = tips;
		}

		public Integer getTipsLevel() {
			return this.tipsLevel;
		}

		public void setTipsLevel(Integer tipsLevel) {
			this.tipsLevel = tipsLevel;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getVpcCloudInstanceId() {
			return this.vpcCloudInstanceId;
		}

		public void setVpcCloudInstanceId(String vpcCloudInstanceId) {
			this.vpcCloudInstanceId = vpcCloudInstanceId;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getKindCode() {
			return this.kindCode;
		}

		public void setKindCode(String kindCode) {
			this.kindCode = kindCode;
		}

		public String getOptimizedWritesInfo() {
			return this.optimizedWritesInfo;
		}

		public void setOptimizedWritesInfo(String optimizedWritesInfo) {
			this.optimizedWritesInfo = optimizedWritesInfo;
		}

		public String getCompressionMode() {
			return this.compressionMode;
		}

		public void setCompressionMode(String compressionMode) {
			this.compressionMode = compressionMode;
		}

		public Boolean getSupportCompression() {
			return this.supportCompression;
		}

		public void setSupportCompression(Boolean supportCompression) {
			this.supportCompression = supportCompression;
		}

		public String getCompressionRatio() {
			return this.compressionRatio;
		}

		public void setCompressionRatio(String compressionRatio) {
			this.compressionRatio = compressionRatio;
		}

		public String getBlueGreenDeploymentName() {
			return this.blueGreenDeploymentName;
		}

		public void setBlueGreenDeploymentName(String blueGreenDeploymentName) {
			this.blueGreenDeploymentName = blueGreenDeploymentName;
		}

		public String getGreenInstanceName() {
			return this.greenInstanceName;
		}

		public void setGreenInstanceName(String greenInstanceName) {
			this.greenInstanceName = greenInstanceName;
		}

		public String getBlueInstanceName() {
			return this.blueInstanceName;
		}

		public void setBlueInstanceName(String blueInstanceName) {
			this.blueInstanceName = blueInstanceName;
		}

		public Boolean getComputeBurstEnabled() {
			return this.computeBurstEnabled;
		}

		public void setComputeBurstEnabled(Boolean computeBurstEnabled) {
			this.computeBurstEnabled = computeBurstEnabled;
		}

		public String getReadOnlyStatus() {
			return this.readOnlyStatus;
		}

		public void setReadOnlyStatus(String readOnlyStatus) {
			this.readOnlyStatus = readOnlyStatus;
		}

		public List<DBClusterNode> getDBClusterNodes() {
			return this.dBClusterNodes;
		}

		public void setDBClusterNodes(List<DBClusterNode> dBClusterNodes) {
			this.dBClusterNodes = dBClusterNodes;
		}

		public List<ReadOnlyDBInstanceId> getReadOnlyDBInstanceIds() {
			return this.readOnlyDBInstanceIds;
		}

		public void setReadOnlyDBInstanceIds(List<ReadOnlyDBInstanceId> readOnlyDBInstanceIds) {
			this.readOnlyDBInstanceIds = readOnlyDBInstanceIds;
		}

		public List<SlaveZone> getSlaveZones() {
			return this.slaveZones;
		}

		public void setSlaveZones(List<SlaveZone> slaveZones) {
			this.slaveZones = slaveZones;
		}

		public BabelfishConfig getBabelfishConfig() {
			return this.babelfishConfig;
		}

		public void setBabelfishConfig(BabelfishConfig babelfishConfig) {
			this.babelfishConfig = babelfishConfig;
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

		public static class DBClusterNode {

			private String classCode;

			private String classType;

			private String cpu;

			private String memory;

			private String nodeId;

			private String nodeRegionId;

			private String nodeRole;

			private String nodeZoneId;

			private String status;

			public String getClassCode() {
				return this.classCode;
			}

			public void setClassCode(String classCode) {
				this.classCode = classCode;
			}

			public String getClassType() {
				return this.classType;
			}

			public void setClassType(String classType) {
				this.classType = classType;
			}

			public String getCpu() {
				return this.cpu;
			}

			public void setCpu(String cpu) {
				this.cpu = cpu;
			}

			public String getMemory() {
				return this.memory;
			}

			public void setMemory(String memory) {
				this.memory = memory;
			}

			public String getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(String nodeId) {
				this.nodeId = nodeId;
			}

			public String getNodeRegionId() {
				return this.nodeRegionId;
			}

			public void setNodeRegionId(String nodeRegionId) {
				this.nodeRegionId = nodeRegionId;
			}

			public String getNodeRole() {
				return this.nodeRole;
			}

			public void setNodeRole(String nodeRole) {
				this.nodeRole = nodeRole;
			}

			public String getNodeZoneId() {
				return this.nodeZoneId;
			}

			public void setNodeZoneId(String nodeZoneId) {
				this.nodeZoneId = nodeZoneId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
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

		public static class SlaveZone {

			private String zoneId;

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
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

		public static class Extra {

			private String accountSecurityPolicy;

			private String activeReplicaDBInstanceID;

			private String recoveryModel;

			private String replicaGroupID;

			private String replicaGroupStatus;

			private List<String> dBInstanceIds;

			public String getAccountSecurityPolicy() {
				return this.accountSecurityPolicy;
			}

			public void setAccountSecurityPolicy(String accountSecurityPolicy) {
				this.accountSecurityPolicy = accountSecurityPolicy;
			}

			public String getActiveReplicaDBInstanceID() {
				return this.activeReplicaDBInstanceID;
			}

			public void setActiveReplicaDBInstanceID(String activeReplicaDBInstanceID) {
				this.activeReplicaDBInstanceID = activeReplicaDBInstanceID;
			}

			public String getRecoveryModel() {
				return this.recoveryModel;
			}

			public void setRecoveryModel(String recoveryModel) {
				this.recoveryModel = recoveryModel;
			}

			public String getReplicaGroupID() {
				return this.replicaGroupID;
			}

			public void setReplicaGroupID(String replicaGroupID) {
				this.replicaGroupID = replicaGroupID;
			}

			public String getReplicaGroupStatus() {
				return this.replicaGroupStatus;
			}

			public void setReplicaGroupStatus(String replicaGroupStatus) {
				this.replicaGroupStatus = replicaGroupStatus;
			}

			public List<String> getDBInstanceIds() {
				return this.dBInstanceIds;
			}

			public void setDBInstanceIds(List<String> dBInstanceIds) {
				this.dBInstanceIds = dBInstanceIds;
			}
		}

		public static class ServerlessConfig {

			private Boolean autoPause;

			private Double scaleMax;

			private Double scaleMin;

			private Boolean switchForce;

			public Boolean getAutoPause() {
				return this.autoPause;
			}

			public void setAutoPause(Boolean autoPause) {
				this.autoPause = autoPause;
			}

			public Double getScaleMax() {
				return this.scaleMax;
			}

			public void setScaleMax(Double scaleMax) {
				this.scaleMax = scaleMax;
			}

			public Double getScaleMin() {
				return this.scaleMin;
			}

			public void setScaleMin(Double scaleMin) {
				this.scaleMin = scaleMin;
			}

			public Boolean getSwitchForce() {
				return this.switchForce;
			}

			public void setSwitchForce(Boolean switchForce) {
				this.switchForce = switchForce;
			}
		}
	}

	@Override
	public DescribeDBInstanceAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
