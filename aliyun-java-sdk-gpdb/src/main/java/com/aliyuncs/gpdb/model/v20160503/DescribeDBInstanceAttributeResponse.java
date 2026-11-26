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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.DescribeDBInstanceAttributeResponseUnmarshaller;
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

		private Integer masterNodeNum;

		private String standbyZoneId;

		private Integer cpuCoresPerNode;

		private Long dBInstanceMemory;

		private String resourceGroupId;

		private String port;

		private Integer segNodeNum;

		private Integer memoryPerNode;

		private String dBInstanceGroupCount;

		private String instanceNetworkType;

		private String masterAISpec;

		private String dBInstanceClassType;

		private String dBInstanceCategory;

		private String deployMode;

		private String dBInstanceId;

		private Long dBInstanceStorage;

		private Integer serverlessResource;

		private String lockReason;

		private String availabilityValue;

		private String primaryDBInstanceId;

		private String dBInstanceDescription;

		private String engine;

		private String cacheStorageSize;

		private String encryptionType;

		private Integer segmentCounts;

		private Long dBInstanceDiskMBPS;

		private String serverlessMode;

		private String engineVersion;

		private String storageType;

		private String dBInstanceStatus;

		private Integer maxConnections;

		private String dBInstanceClass;

		private Integer dBInstanceCpuCores;

		private String prodType;

		private String graphEngineStatus;

		private String vSwitchId;

		private String startTime;

		private String coreVersion;

		private String lockMode;

		private String payType;

		private Integer masterCU;

		private String vpcId;

		private String connectionMode;

		private Integer cpuCores;

		private String creationTime;

		private String readDelayTime;

		private String connectionString;

		private String expireTime;

		private String segDiskPerformanceLevel;

		private String instanceSpec;

		private String dBInstanceNetType;

		private Integer idleTime;

		private String encryptionKey;

		private Boolean supportRestore;

		private String hostType;

		private String maintainEndTime;

		private String segmentAISpec;

		private String vectorConfigurationStatus;

		private String securityIPList;

		private String segmentDiskLockThreshold;

		private String instanceType;

		private String maintainStartTime;

		private Long memorySize;

		private String memoryUnit;

		private String zoneId;

		private String minorVersion;

		private Long storageSize;

		private String storageUnit;

		private String diskNotifyThreshold;

		private String masterDiskLockThreshold;

		private Integer storagePerNode;

		private String dBInstanceMode;

		private String regionId;

		private String runningTime;

		private List<Tag> tags;

		public Integer getMasterNodeNum() {
			return this.masterNodeNum;
		}

		public void setMasterNodeNum(Integer masterNodeNum) {
			this.masterNodeNum = masterNodeNum;
		}

		public String getStandbyZoneId() {
			return this.standbyZoneId;
		}

		public void setStandbyZoneId(String standbyZoneId) {
			this.standbyZoneId = standbyZoneId;
		}

		public Integer getCpuCoresPerNode() {
			return this.cpuCoresPerNode;
		}

		public void setCpuCoresPerNode(Integer cpuCoresPerNode) {
			this.cpuCoresPerNode = cpuCoresPerNode;
		}

		public Long getDBInstanceMemory() {
			return this.dBInstanceMemory;
		}

		public void setDBInstanceMemory(Long dBInstanceMemory) {
			this.dBInstanceMemory = dBInstanceMemory;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}

		public Integer getSegNodeNum() {
			return this.segNodeNum;
		}

		public void setSegNodeNum(Integer segNodeNum) {
			this.segNodeNum = segNodeNum;
		}

		public Integer getMemoryPerNode() {
			return this.memoryPerNode;
		}

		public void setMemoryPerNode(Integer memoryPerNode) {
			this.memoryPerNode = memoryPerNode;
		}

		public String getDBInstanceGroupCount() {
			return this.dBInstanceGroupCount;
		}

		public void setDBInstanceGroupCount(String dBInstanceGroupCount) {
			this.dBInstanceGroupCount = dBInstanceGroupCount;
		}

		public String getInstanceNetworkType() {
			return this.instanceNetworkType;
		}

		public void setInstanceNetworkType(String instanceNetworkType) {
			this.instanceNetworkType = instanceNetworkType;
		}

		public String getMasterAISpec() {
			return this.masterAISpec;
		}

		public void setMasterAISpec(String masterAISpec) {
			this.masterAISpec = masterAISpec;
		}

		public String getDBInstanceClassType() {
			return this.dBInstanceClassType;
		}

		public void setDBInstanceClassType(String dBInstanceClassType) {
			this.dBInstanceClassType = dBInstanceClassType;
		}

		public String getDBInstanceCategory() {
			return this.dBInstanceCategory;
		}

		public void setDBInstanceCategory(String dBInstanceCategory) {
			this.dBInstanceCategory = dBInstanceCategory;
		}

		public String getDeployMode() {
			return this.deployMode;
		}

		public void setDeployMode(String deployMode) {
			this.deployMode = deployMode;
		}

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public Long getDBInstanceStorage() {
			return this.dBInstanceStorage;
		}

		public void setDBInstanceStorage(Long dBInstanceStorage) {
			this.dBInstanceStorage = dBInstanceStorage;
		}

		public Integer getServerlessResource() {
			return this.serverlessResource;
		}

		public void setServerlessResource(Integer serverlessResource) {
			this.serverlessResource = serverlessResource;
		}

		public String getLockReason() {
			return this.lockReason;
		}

		public void setLockReason(String lockReason) {
			this.lockReason = lockReason;
		}

		public String getAvailabilityValue() {
			return this.availabilityValue;
		}

		public void setAvailabilityValue(String availabilityValue) {
			this.availabilityValue = availabilityValue;
		}

		public String getPrimaryDBInstanceId() {
			return this.primaryDBInstanceId;
		}

		public void setPrimaryDBInstanceId(String primaryDBInstanceId) {
			this.primaryDBInstanceId = primaryDBInstanceId;
		}

		public String getDBInstanceDescription() {
			return this.dBInstanceDescription;
		}

		public void setDBInstanceDescription(String dBInstanceDescription) {
			this.dBInstanceDescription = dBInstanceDescription;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getCacheStorageSize() {
			return this.cacheStorageSize;
		}

		public void setCacheStorageSize(String cacheStorageSize) {
			this.cacheStorageSize = cacheStorageSize;
		}

		public String getEncryptionType() {
			return this.encryptionType;
		}

		public void setEncryptionType(String encryptionType) {
			this.encryptionType = encryptionType;
		}

		public Integer getSegmentCounts() {
			return this.segmentCounts;
		}

		public void setSegmentCounts(Integer segmentCounts) {
			this.segmentCounts = segmentCounts;
		}

		public Long getDBInstanceDiskMBPS() {
			return this.dBInstanceDiskMBPS;
		}

		public void setDBInstanceDiskMBPS(Long dBInstanceDiskMBPS) {
			this.dBInstanceDiskMBPS = dBInstanceDiskMBPS;
		}

		public String getServerlessMode() {
			return this.serverlessMode;
		}

		public void setServerlessMode(String serverlessMode) {
			this.serverlessMode = serverlessMode;
		}

		public String getEngineVersion() {
			return this.engineVersion;
		}

		public void setEngineVersion(String engineVersion) {
			this.engineVersion = engineVersion;
		}

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}

		public String getDBInstanceStatus() {
			return this.dBInstanceStatus;
		}

		public void setDBInstanceStatus(String dBInstanceStatus) {
			this.dBInstanceStatus = dBInstanceStatus;
		}

		public Integer getMaxConnections() {
			return this.maxConnections;
		}

		public void setMaxConnections(Integer maxConnections) {
			this.maxConnections = maxConnections;
		}

		public String getDBInstanceClass() {
			return this.dBInstanceClass;
		}

		public void setDBInstanceClass(String dBInstanceClass) {
			this.dBInstanceClass = dBInstanceClass;
		}

		public Integer getDBInstanceCpuCores() {
			return this.dBInstanceCpuCores;
		}

		public void setDBInstanceCpuCores(Integer dBInstanceCpuCores) {
			this.dBInstanceCpuCores = dBInstanceCpuCores;
		}

		public String getProdType() {
			return this.prodType;
		}

		public void setProdType(String prodType) {
			this.prodType = prodType;
		}

		public String getGraphEngineStatus() {
			return this.graphEngineStatus;
		}

		public void setGraphEngineStatus(String graphEngineStatus) {
			this.graphEngineStatus = graphEngineStatus;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getCoreVersion() {
			return this.coreVersion;
		}

		public void setCoreVersion(String coreVersion) {
			this.coreVersion = coreVersion;
		}

		public String getLockMode() {
			return this.lockMode;
		}

		public void setLockMode(String lockMode) {
			this.lockMode = lockMode;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public Integer getMasterCU() {
			return this.masterCU;
		}

		public void setMasterCU(Integer masterCU) {
			this.masterCU = masterCU;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getConnectionMode() {
			return this.connectionMode;
		}

		public void setConnectionMode(String connectionMode) {
			this.connectionMode = connectionMode;
		}

		public Integer getCpuCores() {
			return this.cpuCores;
		}

		public void setCpuCores(Integer cpuCores) {
			this.cpuCores = cpuCores;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getReadDelayTime() {
			return this.readDelayTime;
		}

		public void setReadDelayTime(String readDelayTime) {
			this.readDelayTime = readDelayTime;
		}

		public String getConnectionString() {
			return this.connectionString;
		}

		public void setConnectionString(String connectionString) {
			this.connectionString = connectionString;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getSegDiskPerformanceLevel() {
			return this.segDiskPerformanceLevel;
		}

		public void setSegDiskPerformanceLevel(String segDiskPerformanceLevel) {
			this.segDiskPerformanceLevel = segDiskPerformanceLevel;
		}

		public String getInstanceSpec() {
			return this.instanceSpec;
		}

		public void setInstanceSpec(String instanceSpec) {
			this.instanceSpec = instanceSpec;
		}

		public String getDBInstanceNetType() {
			return this.dBInstanceNetType;
		}

		public void setDBInstanceNetType(String dBInstanceNetType) {
			this.dBInstanceNetType = dBInstanceNetType;
		}

		public Integer getIdleTime() {
			return this.idleTime;
		}

		public void setIdleTime(Integer idleTime) {
			this.idleTime = idleTime;
		}

		public String getEncryptionKey() {
			return this.encryptionKey;
		}

		public void setEncryptionKey(String encryptionKey) {
			this.encryptionKey = encryptionKey;
		}

		public Boolean getSupportRestore() {
			return this.supportRestore;
		}

		public void setSupportRestore(Boolean supportRestore) {
			this.supportRestore = supportRestore;
		}

		public String getHostType() {
			return this.hostType;
		}

		public void setHostType(String hostType) {
			this.hostType = hostType;
		}

		public String getMaintainEndTime() {
			return this.maintainEndTime;
		}

		public void setMaintainEndTime(String maintainEndTime) {
			this.maintainEndTime = maintainEndTime;
		}

		public String getSegmentAISpec() {
			return this.segmentAISpec;
		}

		public void setSegmentAISpec(String segmentAISpec) {
			this.segmentAISpec = segmentAISpec;
		}

		public String getVectorConfigurationStatus() {
			return this.vectorConfigurationStatus;
		}

		public void setVectorConfigurationStatus(String vectorConfigurationStatus) {
			this.vectorConfigurationStatus = vectorConfigurationStatus;
		}

		public String getSecurityIPList() {
			return this.securityIPList;
		}

		public void setSecurityIPList(String securityIPList) {
			this.securityIPList = securityIPList;
		}

		public String getSegmentDiskLockThreshold() {
			return this.segmentDiskLockThreshold;
		}

		public void setSegmentDiskLockThreshold(String segmentDiskLockThreshold) {
			this.segmentDiskLockThreshold = segmentDiskLockThreshold;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getMaintainStartTime() {
			return this.maintainStartTime;
		}

		public void setMaintainStartTime(String maintainStartTime) {
			this.maintainStartTime = maintainStartTime;
		}

		public Long getMemorySize() {
			return this.memorySize;
		}

		public void setMemorySize(Long memorySize) {
			this.memorySize = memorySize;
		}

		public String getMemoryUnit() {
			return this.memoryUnit;
		}

		public void setMemoryUnit(String memoryUnit) {
			this.memoryUnit = memoryUnit;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getMinorVersion() {
			return this.minorVersion;
		}

		public void setMinorVersion(String minorVersion) {
			this.minorVersion = minorVersion;
		}

		public Long getStorageSize() {
			return this.storageSize;
		}

		public void setStorageSize(Long storageSize) {
			this.storageSize = storageSize;
		}

		public String getStorageUnit() {
			return this.storageUnit;
		}

		public void setStorageUnit(String storageUnit) {
			this.storageUnit = storageUnit;
		}

		public String getDiskNotifyThreshold() {
			return this.diskNotifyThreshold;
		}

		public void setDiskNotifyThreshold(String diskNotifyThreshold) {
			this.diskNotifyThreshold = diskNotifyThreshold;
		}

		public String getMasterDiskLockThreshold() {
			return this.masterDiskLockThreshold;
		}

		public void setMasterDiskLockThreshold(String masterDiskLockThreshold) {
			this.masterDiskLockThreshold = masterDiskLockThreshold;
		}

		public Integer getStoragePerNode() {
			return this.storagePerNode;
		}

		public void setStoragePerNode(Integer storagePerNode) {
			this.storagePerNode = storagePerNode;
		}

		public String getDBInstanceMode() {
			return this.dBInstanceMode;
		}

		public void setDBInstanceMode(String dBInstanceMode) {
			this.dBInstanceMode = dBInstanceMode;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getRunningTime() {
			return this.runningTime;
		}

		public void setRunningTime(String runningTime) {
			this.runningTime = runningTime;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public static class Tag {

			private String value;

			private String key;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}
		}
	}

	@Override
	public DescribeDBInstanceAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
