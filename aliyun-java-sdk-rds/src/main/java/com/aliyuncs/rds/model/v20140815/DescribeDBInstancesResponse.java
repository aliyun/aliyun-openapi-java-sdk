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
import com.aliyuncs.rds.transform.v20140815.DescribeDBInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstancesResponse extends AcsResponse {

	private String nextToken;

	private Integer pageNumber;

	private Integer pageRecordCount;

	private String requestId;

	private Integer totalRecordCount;

	private List<DBInstance> items;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public List<DBInstance> getItems() {
		return this.items;
	}

	public void setItems(List<DBInstance> items) {
		this.items = items;
	}

	public static class DBInstance {

		private String autoUpgradeMinorVersion;

		private String bpeEnabled;

		private Boolean burstingEnabled;

		private String category;

		private Boolean coldDataEnabled;

		private String connectionMode;

		private String connectionString;

		private String createTime;

		private String dBInstanceCPU;

		private String dBInstanceClass;

		private String dBInstanceDescription;

		private String dBInstanceId;

		private Integer dBInstanceMemory;

		private String dBInstanceNetType;

		private String dBInstanceStatus;

		private String dBInstanceStorageType;

		private String dBInstanceType;

		private String dedicatedHostGroupId;

		private String dedicatedHostGroupName;

		private String dedicatedHostIdForLog;

		private String dedicatedHostIdForMaster;

		private String dedicatedHostIdForSlave;

		private String dedicatedHostNameForLog;

		private String dedicatedHostNameForMaster;

		private String dedicatedHostNameForSlave;

		private String dedicatedHostZoneIdForLog;

		private String dedicatedHostZoneIdForMaster;

		private String dedicatedHostZoneIdForSlave;

		private Boolean deletionProtection;

		private String destroyTime;

		private String engine;

		private String engineVersion;

		private String expireTime;

		private String generalGroupName;

		private String guardDBInstanceId;

		private Integer insId;

		private String instanceNetworkType;

		private String ioAccelerationEnabled;

		private String lockMode;

		private String lockReason;

		private String masterInstanceId;

		private Boolean mutriORsignle;

		private String payType;

		private String regionId;

		private String replicateId;

		private String resourceGroupId;

		private Integer switchWeight;

		private String tempDBInstanceId;

		private String tips;

		private Integer tipsLevel;

		private String vSwitchId;

		private String vpcCloudInstanceId;

		private String vpcId;

		private String vpcName;

		private String zoneId;

		private String blueGreenDeploymentName;

		private String blueInstanceName;

		private String greenInstanceName;

		private List<ReadOnlyDBInstanceId> readOnlyDBInstanceIds;

		public String getAutoUpgradeMinorVersion() {
			return this.autoUpgradeMinorVersion;
		}

		public void setAutoUpgradeMinorVersion(String autoUpgradeMinorVersion) {
			this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
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

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
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

		public String getDBInstanceDescription() {
			return this.dBInstanceDescription;
		}

		public void setDBInstanceDescription(String dBInstanceDescription) {
			this.dBInstanceDescription = dBInstanceDescription;
		}

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public Integer getDBInstanceMemory() {
			return this.dBInstanceMemory;
		}

		public void setDBInstanceMemory(Integer dBInstanceMemory) {
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

		public String getDedicatedHostGroupId() {
			return this.dedicatedHostGroupId;
		}

		public void setDedicatedHostGroupId(String dedicatedHostGroupId) {
			this.dedicatedHostGroupId = dedicatedHostGroupId;
		}

		public String getDedicatedHostGroupName() {
			return this.dedicatedHostGroupName;
		}

		public void setDedicatedHostGroupName(String dedicatedHostGroupName) {
			this.dedicatedHostGroupName = dedicatedHostGroupName;
		}

		public String getDedicatedHostIdForLog() {
			return this.dedicatedHostIdForLog;
		}

		public void setDedicatedHostIdForLog(String dedicatedHostIdForLog) {
			this.dedicatedHostIdForLog = dedicatedHostIdForLog;
		}

		public String getDedicatedHostIdForMaster() {
			return this.dedicatedHostIdForMaster;
		}

		public void setDedicatedHostIdForMaster(String dedicatedHostIdForMaster) {
			this.dedicatedHostIdForMaster = dedicatedHostIdForMaster;
		}

		public String getDedicatedHostIdForSlave() {
			return this.dedicatedHostIdForSlave;
		}

		public void setDedicatedHostIdForSlave(String dedicatedHostIdForSlave) {
			this.dedicatedHostIdForSlave = dedicatedHostIdForSlave;
		}

		public String getDedicatedHostNameForLog() {
			return this.dedicatedHostNameForLog;
		}

		public void setDedicatedHostNameForLog(String dedicatedHostNameForLog) {
			this.dedicatedHostNameForLog = dedicatedHostNameForLog;
		}

		public String getDedicatedHostNameForMaster() {
			return this.dedicatedHostNameForMaster;
		}

		public void setDedicatedHostNameForMaster(String dedicatedHostNameForMaster) {
			this.dedicatedHostNameForMaster = dedicatedHostNameForMaster;
		}

		public String getDedicatedHostNameForSlave() {
			return this.dedicatedHostNameForSlave;
		}

		public void setDedicatedHostNameForSlave(String dedicatedHostNameForSlave) {
			this.dedicatedHostNameForSlave = dedicatedHostNameForSlave;
		}

		public String getDedicatedHostZoneIdForLog() {
			return this.dedicatedHostZoneIdForLog;
		}

		public void setDedicatedHostZoneIdForLog(String dedicatedHostZoneIdForLog) {
			this.dedicatedHostZoneIdForLog = dedicatedHostZoneIdForLog;
		}

		public String getDedicatedHostZoneIdForMaster() {
			return this.dedicatedHostZoneIdForMaster;
		}

		public void setDedicatedHostZoneIdForMaster(String dedicatedHostZoneIdForMaster) {
			this.dedicatedHostZoneIdForMaster = dedicatedHostZoneIdForMaster;
		}

		public String getDedicatedHostZoneIdForSlave() {
			return this.dedicatedHostZoneIdForSlave;
		}

		public void setDedicatedHostZoneIdForSlave(String dedicatedHostZoneIdForSlave) {
			this.dedicatedHostZoneIdForSlave = dedicatedHostZoneIdForSlave;
		}

		public Boolean getDeletionProtection() {
			return this.deletionProtection;
		}

		public void setDeletionProtection(Boolean deletionProtection) {
			this.deletionProtection = deletionProtection;
		}

		public String getDestroyTime() {
			return this.destroyTime;
		}

		public void setDestroyTime(String destroyTime) {
			this.destroyTime = destroyTime;
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

		public String getIoAccelerationEnabled() {
			return this.ioAccelerationEnabled;
		}

		public void setIoAccelerationEnabled(String ioAccelerationEnabled) {
			this.ioAccelerationEnabled = ioAccelerationEnabled;
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

		public String getMasterInstanceId() {
			return this.masterInstanceId;
		}

		public void setMasterInstanceId(String masterInstanceId) {
			this.masterInstanceId = masterInstanceId;
		}

		public Boolean getMutriORsignle() {
			return this.mutriORsignle;
		}

		public void setMutriORsignle(Boolean mutriORsignle) {
			this.mutriORsignle = mutriORsignle;
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

		public Integer getSwitchWeight() {
			return this.switchWeight;
		}

		public void setSwitchWeight(Integer switchWeight) {
			this.switchWeight = switchWeight;
		}

		public String getTempDBInstanceId() {
			return this.tempDBInstanceId;
		}

		public void setTempDBInstanceId(String tempDBInstanceId) {
			this.tempDBInstanceId = tempDBInstanceId;
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

		public String getVpcName() {
			return this.vpcName;
		}

		public void setVpcName(String vpcName) {
			this.vpcName = vpcName;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getBlueGreenDeploymentName() {
			return this.blueGreenDeploymentName;
		}

		public void setBlueGreenDeploymentName(String blueGreenDeploymentName) {
			this.blueGreenDeploymentName = blueGreenDeploymentName;
		}

		public String getBlueInstanceName() {
			return this.blueInstanceName;
		}

		public void setBlueInstanceName(String blueInstanceName) {
			this.blueInstanceName = blueInstanceName;
		}

		public String getGreenInstanceName() {
			return this.greenInstanceName;
		}

		public void setGreenInstanceName(String greenInstanceName) {
			this.greenInstanceName = greenInstanceName;
		}

		public List<ReadOnlyDBInstanceId> getReadOnlyDBInstanceIds() {
			return this.readOnlyDBInstanceIds;
		}

		public void setReadOnlyDBInstanceIds(List<ReadOnlyDBInstanceId> readOnlyDBInstanceIds) {
			this.readOnlyDBInstanceIds = readOnlyDBInstanceIds;
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
	}

	@Override
	public DescribeDBInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
