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

		private String iPType;

		private String dBInstanceDiskUsed;

		private String guardDBInstanceName;

		private Boolean canTempUpgrade;

		private String tempUpgradeTimeStart;

		private String tempUpgradeTimeEnd;

		private String tempUpgradeRecoveryTime;

		private String tempUpgradeRecoveryClass;

		private Integer tempUpgradeRecoveryCpu;

		private Integer tempUpgradeRecoveryMemory;

		private String tempUpgradeRecoveryMaxIOPS;

		private String tempUpgradeRecoveryMaxConnections;

		private Integer insId;

		private String dBInstanceId;

		private String payType;

		private String dBInstanceClassType;

		private String dBInstanceType;

		private String regionId;

		private String connectionString;

		private String port;

		private String engine;

		private String engineVersion;

		private String dBInstanceClass;

		private Long dBInstanceMemory;

		private Integer dBInstanceStorage;

		private String vpcCloudInstanceId;

		private String dBInstanceNetType;

		private String dBInstanceStatus;

		private String dBInstanceDescription;

		private String lockMode;

		private String lockReason;

		private String readDelayTime;

		private Integer dBMaxQuantity;

		private Integer accountMaxQuantity;

		private String creationTime;

		private String expireTime;

		private String maintainTime;

		private String availabilityValue;

		private Integer maxIOPS;

		private Integer maxConnections;

		private String masterInstanceId;

		private String dBInstanceCPU;

		private String incrementSourceDBInstanceId;

		private String guardDBInstanceId;

		private String replicateId;

		private String tempDBInstanceId;

		private String securityIPList;

		private String zoneId;

		private String instanceNetworkType;

		private String dBInstanceStorageType;

		private String advancedFeatures;

		private String category;

		private String accountType;

		private String supportUpgradeAccountType;

		private String supportCreateSuperAccount;

		private String vpcId;

		private String vSwitchId;

		private String connectionMode;

		private String currentKernelVersion;

		private String latestKernelVersion;

		private String resourceGroupId;

		private String readonlyInstanceSQLDelayedTime;

		private String securityIPMode;

		private String timeZone;

		private String collation;

		private String dispenseMode;

		private String masterZone;

		private List<SlaveZone> slaveZones;

		private List<ReadOnlyDBInstanceId> readOnlyDBInstanceIds;

		private Extra extra;

		public String getIPType() {
			return this.iPType;
		}

		public void setIPType(String iPType) {
			this.iPType = iPType;
		}

		public String getDBInstanceDiskUsed() {
			return this.dBInstanceDiskUsed;
		}

		public void setDBInstanceDiskUsed(String dBInstanceDiskUsed) {
			this.dBInstanceDiskUsed = dBInstanceDiskUsed;
		}

		public String getGuardDBInstanceName() {
			return this.guardDBInstanceName;
		}

		public void setGuardDBInstanceName(String guardDBInstanceName) {
			this.guardDBInstanceName = guardDBInstanceName;
		}

		public Boolean getCanTempUpgrade() {
			return this.canTempUpgrade;
		}

		public void setCanTempUpgrade(Boolean canTempUpgrade) {
			this.canTempUpgrade = canTempUpgrade;
		}

		public String getTempUpgradeTimeStart() {
			return this.tempUpgradeTimeStart;
		}

		public void setTempUpgradeTimeStart(String tempUpgradeTimeStart) {
			this.tempUpgradeTimeStart = tempUpgradeTimeStart;
		}

		public String getTempUpgradeTimeEnd() {
			return this.tempUpgradeTimeEnd;
		}

		public void setTempUpgradeTimeEnd(String tempUpgradeTimeEnd) {
			this.tempUpgradeTimeEnd = tempUpgradeTimeEnd;
		}

		public String getTempUpgradeRecoveryTime() {
			return this.tempUpgradeRecoveryTime;
		}

		public void setTempUpgradeRecoveryTime(String tempUpgradeRecoveryTime) {
			this.tempUpgradeRecoveryTime = tempUpgradeRecoveryTime;
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

		public Integer getTempUpgradeRecoveryMemory() {
			return this.tempUpgradeRecoveryMemory;
		}

		public void setTempUpgradeRecoveryMemory(Integer tempUpgradeRecoveryMemory) {
			this.tempUpgradeRecoveryMemory = tempUpgradeRecoveryMemory;
		}

		public String getTempUpgradeRecoveryMaxIOPS() {
			return this.tempUpgradeRecoveryMaxIOPS;
		}

		public void setTempUpgradeRecoveryMaxIOPS(String tempUpgradeRecoveryMaxIOPS) {
			this.tempUpgradeRecoveryMaxIOPS = tempUpgradeRecoveryMaxIOPS;
		}

		public String getTempUpgradeRecoveryMaxConnections() {
			return this.tempUpgradeRecoveryMaxConnections;
		}

		public void setTempUpgradeRecoveryMaxConnections(String tempUpgradeRecoveryMaxConnections) {
			this.tempUpgradeRecoveryMaxConnections = tempUpgradeRecoveryMaxConnections;
		}

		public Integer getInsId() {
			return this.insId;
		}

		public void setInsId(Integer insId) {
			this.insId = insId;
		}

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getDBInstanceClassType() {
			return this.dBInstanceClassType;
		}

		public void setDBInstanceClassType(String dBInstanceClassType) {
			this.dBInstanceClassType = dBInstanceClassType;
		}

		public String getDBInstanceType() {
			return this.dBInstanceType;
		}

		public void setDBInstanceType(String dBInstanceType) {
			this.dBInstanceType = dBInstanceType;
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

		public String getConnectionString() {
			return this.connectionString;
		}

		public void setConnectionString(String connectionString) {
			this.connectionString = connectionString;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
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

		public String getDBInstanceClass() {
			return this.dBInstanceClass;
		}

		public void setDBInstanceClass(String dBInstanceClass) {
			this.dBInstanceClass = dBInstanceClass;
		}

		public Long getDBInstanceMemory() {
			return this.dBInstanceMemory;
		}

		public void setDBInstanceMemory(Long dBInstanceMemory) {
			this.dBInstanceMemory = dBInstanceMemory;
		}

		public Integer getDBInstanceStorage() {
			return this.dBInstanceStorage;
		}

		public void setDBInstanceStorage(Integer dBInstanceStorage) {
			this.dBInstanceStorage = dBInstanceStorage;
		}

		public String getVpcCloudInstanceId() {
			return this.vpcCloudInstanceId;
		}

		public void setVpcCloudInstanceId(String vpcCloudInstanceId) {
			this.vpcCloudInstanceId = vpcCloudInstanceId;
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

		public String getDBInstanceDescription() {
			return this.dBInstanceDescription;
		}

		public void setDBInstanceDescription(String dBInstanceDescription) {
			this.dBInstanceDescription = dBInstanceDescription;
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

		public String getReadDelayTime() {
			return this.readDelayTime;
		}

		public void setReadDelayTime(String readDelayTime) {
			this.readDelayTime = readDelayTime;
		}

		public Integer getDBMaxQuantity() {
			return this.dBMaxQuantity;
		}

		public void setDBMaxQuantity(Integer dBMaxQuantity) {
			this.dBMaxQuantity = dBMaxQuantity;
		}

		public Integer getAccountMaxQuantity() {
			return this.accountMaxQuantity;
		}

		public void setAccountMaxQuantity(Integer accountMaxQuantity) {
			this.accountMaxQuantity = accountMaxQuantity;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getMaintainTime() {
			return this.maintainTime;
		}

		public void setMaintainTime(String maintainTime) {
			this.maintainTime = maintainTime;
		}

		public String getAvailabilityValue() {
			return this.availabilityValue;
		}

		public void setAvailabilityValue(String availabilityValue) {
			this.availabilityValue = availabilityValue;
		}

		public Integer getMaxIOPS() {
			return this.maxIOPS;
		}

		public void setMaxIOPS(Integer maxIOPS) {
			this.maxIOPS = maxIOPS;
		}

		public Integer getMaxConnections() {
			return this.maxConnections;
		}

		public void setMaxConnections(Integer maxConnections) {
			this.maxConnections = maxConnections;
		}

		public String getMasterInstanceId() {
			return this.masterInstanceId;
		}

		public void setMasterInstanceId(String masterInstanceId) {
			this.masterInstanceId = masterInstanceId;
		}

		public String getDBInstanceCPU() {
			return this.dBInstanceCPU;
		}

		public void setDBInstanceCPU(String dBInstanceCPU) {
			this.dBInstanceCPU = dBInstanceCPU;
		}

		public String getIncrementSourceDBInstanceId() {
			return this.incrementSourceDBInstanceId;
		}

		public void setIncrementSourceDBInstanceId(String incrementSourceDBInstanceId) {
			this.incrementSourceDBInstanceId = incrementSourceDBInstanceId;
		}

		public String getGuardDBInstanceId() {
			return this.guardDBInstanceId;
		}

		public void setGuardDBInstanceId(String guardDBInstanceId) {
			this.guardDBInstanceId = guardDBInstanceId;
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

		public String getSecurityIPList() {
			return this.securityIPList;
		}

		public void setSecurityIPList(String securityIPList) {
			this.securityIPList = securityIPList;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getInstanceNetworkType() {
			return this.instanceNetworkType;
		}

		public void setInstanceNetworkType(String instanceNetworkType) {
			this.instanceNetworkType = instanceNetworkType;
		}

		public String getDBInstanceStorageType() {
			return this.dBInstanceStorageType;
		}

		public void setDBInstanceStorageType(String dBInstanceStorageType) {
			this.dBInstanceStorageType = dBInstanceStorageType;
		}

		public String getAdvancedFeatures() {
			return this.advancedFeatures;
		}

		public void setAdvancedFeatures(String advancedFeatures) {
			this.advancedFeatures = advancedFeatures;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getAccountType() {
			return this.accountType;
		}

		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}

		public String getSupportUpgradeAccountType() {
			return this.supportUpgradeAccountType;
		}

		public void setSupportUpgradeAccountType(String supportUpgradeAccountType) {
			this.supportUpgradeAccountType = supportUpgradeAccountType;
		}

		public String getSupportCreateSuperAccount() {
			return this.supportCreateSuperAccount;
		}

		public void setSupportCreateSuperAccount(String supportCreateSuperAccount) {
			this.supportCreateSuperAccount = supportCreateSuperAccount;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getConnectionMode() {
			return this.connectionMode;
		}

		public void setConnectionMode(String connectionMode) {
			this.connectionMode = connectionMode;
		}

		public String getCurrentKernelVersion() {
			return this.currentKernelVersion;
		}

		public void setCurrentKernelVersion(String currentKernelVersion) {
			this.currentKernelVersion = currentKernelVersion;
		}

		public String getLatestKernelVersion() {
			return this.latestKernelVersion;
		}

		public void setLatestKernelVersion(String latestKernelVersion) {
			this.latestKernelVersion = latestKernelVersion;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getReadonlyInstanceSQLDelayedTime() {
			return this.readonlyInstanceSQLDelayedTime;
		}

		public void setReadonlyInstanceSQLDelayedTime(String readonlyInstanceSQLDelayedTime) {
			this.readonlyInstanceSQLDelayedTime = readonlyInstanceSQLDelayedTime;
		}

		public String getSecurityIPMode() {
			return this.securityIPMode;
		}

		public void setSecurityIPMode(String securityIPMode) {
			this.securityIPMode = securityIPMode;
		}

		public String getTimeZone() {
			return this.timeZone;
		}

		public void setTimeZone(String timeZone) {
			this.timeZone = timeZone;
		}

		public String getCollation() {
			return this.collation;
		}

		public void setCollation(String collation) {
			this.collation = collation;
		}

		public String getDispenseMode() {
			return this.dispenseMode;
		}

		public void setDispenseMode(String dispenseMode) {
			this.dispenseMode = dispenseMode;
		}

		public String getMasterZone() {
			return this.masterZone;
		}

		public void setMasterZone(String masterZone) {
			this.masterZone = masterZone;
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

			private String replicaGroupID;

			private String replicaGroupStatus;

			private String activeReplicaDBInstanceID;

			private List<String> dBInstanceId;

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

			public String getActiveReplicaDBInstanceID() {
				return this.activeReplicaDBInstanceID;
			}

			public void setActiveReplicaDBInstanceID(String activeReplicaDBInstanceID) {
				this.activeReplicaDBInstanceID = activeReplicaDBInstanceID;
			}

			public List<String> getDBInstanceId() {
				return this.dBInstanceId;
			}

			public void setDBInstanceId(List<String> dBInstanceId) {
				this.dBInstanceId = dBInstanceId;
			}
		}
	}

	@Override
	public DescribeDBInstanceAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
