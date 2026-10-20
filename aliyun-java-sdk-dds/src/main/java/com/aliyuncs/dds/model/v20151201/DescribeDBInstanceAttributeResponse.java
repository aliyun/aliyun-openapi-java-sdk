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

package com.aliyuncs.dds.model.v20151201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dds.transform.v20151201.DescribeDBInstanceAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceAttributeResponse extends AcsResponse {

	private String requestId;

	private List<DBInstance> dBInstances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DBInstance> getDBInstances() {
		return this.dBInstances;
	}

	public void setDBInstances(List<DBInstance> dBInstances) {
		this.dBInstances = dBInstances;
	}

	public static class DBInstance {

		private String resourceGroupId;

		private String capacityUnit;

		private String hiddenZoneId;

		private Boolean encrypted;

		private String destroyTime;

		private String dBInstanceType;

		private String replicaSetName;

		private Integer searchNodeCount;

		private String syncPercent;

		private String dBInstanceId;

		private String lastDowngradeTime;

		private Integer dBInstanceStorage;

		private Integer maxMBPS;

		private String dBInstanceDescription;

		private String engine;

		private String replacateId;

		private Boolean dBInstanceReleaseProtection;

		private String engineVersion;

		private String storageType;

		private String dBInstanceStatus;

		private Integer maxConnections;

		private String vPCId;

		private String dBInstanceClass;

		private String vSwitchId;

		private String lockMode;

		private Integer ecsBandwidth;

		private Long provisionedIops;

		private String currentKernelVersion;

		private String creationTime;

		private String expireTime;

		private String disasterRecoveryInfo;

		private Integer ebsIOPS;

		private String vPCCloudInstanceIds;

		private Integer ebsBandwidth;

		private String encryptionKey;

		private String storageEngine;

		private String maintainEndTime;

		private String networkType;

		private String paymentType;

		private String maintainStartTime;

		private Boolean burstingEnabled;

		private Boolean coldDataEnabled;

		private Boolean aIGatewayEnabled;

		private String zoneId;

		private String readonlyReplicas;

		private String replicationFactor;

		private String cloudType;

		private String dBInstanceOrderStatus;

		private Integer ecsIOPS;

		private Integer maxIOPS;

		private String secondaryZoneId;

		private Integer searchNodeStorage;

		private Boolean useClusterBackup;

		private String vpcAuthMode;

		private String protocolType;

		private String chargeType;

		private String regionId;

		private String originalStorageType;

		private String kindCode;

		private String searchNodeClass;

		private List<ReplicaSet> replicaSets;

		private List<Tag> tags;

		private List<NetworkAddress> networkAddresses;

		private List<ConfigserverAttribute> configserverList;

		private List<ShardSearchNodesItem> shardSearchNodes;

		private List<MongosAttribute> mongosList;

		private List<ShardAttribute> shardList;

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getCapacityUnit() {
			return this.capacityUnit;
		}

		public void setCapacityUnit(String capacityUnit) {
			this.capacityUnit = capacityUnit;
		}

		public String getHiddenZoneId() {
			return this.hiddenZoneId;
		}

		public void setHiddenZoneId(String hiddenZoneId) {
			this.hiddenZoneId = hiddenZoneId;
		}

		public Boolean getEncrypted() {
			return this.encrypted;
		}

		public void setEncrypted(Boolean encrypted) {
			this.encrypted = encrypted;
		}

		public String getDestroyTime() {
			return this.destroyTime;
		}

		public void setDestroyTime(String destroyTime) {
			this.destroyTime = destroyTime;
		}

		public String getDBInstanceType() {
			return this.dBInstanceType;
		}

		public void setDBInstanceType(String dBInstanceType) {
			this.dBInstanceType = dBInstanceType;
		}

		public String getReplicaSetName() {
			return this.replicaSetName;
		}

		public void setReplicaSetName(String replicaSetName) {
			this.replicaSetName = replicaSetName;
		}

		public Integer getSearchNodeCount() {
			return this.searchNodeCount;
		}

		public void setSearchNodeCount(Integer searchNodeCount) {
			this.searchNodeCount = searchNodeCount;
		}

		public String getSyncPercent() {
			return this.syncPercent;
		}

		public void setSyncPercent(String syncPercent) {
			this.syncPercent = syncPercent;
		}

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public String getLastDowngradeTime() {
			return this.lastDowngradeTime;
		}

		public void setLastDowngradeTime(String lastDowngradeTime) {
			this.lastDowngradeTime = lastDowngradeTime;
		}

		public Integer getDBInstanceStorage() {
			return this.dBInstanceStorage;
		}

		public void setDBInstanceStorage(Integer dBInstanceStorage) {
			this.dBInstanceStorage = dBInstanceStorage;
		}

		public Integer getMaxMBPS() {
			return this.maxMBPS;
		}

		public void setMaxMBPS(Integer maxMBPS) {
			this.maxMBPS = maxMBPS;
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

		public String getReplacateId() {
			return this.replacateId;
		}

		public void setReplacateId(String replacateId) {
			this.replacateId = replacateId;
		}

		public Boolean getDBInstanceReleaseProtection() {
			return this.dBInstanceReleaseProtection;
		}

		public void setDBInstanceReleaseProtection(Boolean dBInstanceReleaseProtection) {
			this.dBInstanceReleaseProtection = dBInstanceReleaseProtection;
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

		public String getVPCId() {
			return this.vPCId;
		}

		public void setVPCId(String vPCId) {
			this.vPCId = vPCId;
		}

		public String getDBInstanceClass() {
			return this.dBInstanceClass;
		}

		public void setDBInstanceClass(String dBInstanceClass) {
			this.dBInstanceClass = dBInstanceClass;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getLockMode() {
			return this.lockMode;
		}

		public void setLockMode(String lockMode) {
			this.lockMode = lockMode;
		}

		public Integer getEcsBandwidth() {
			return this.ecsBandwidth;
		}

		public void setEcsBandwidth(Integer ecsBandwidth) {
			this.ecsBandwidth = ecsBandwidth;
		}

		public Long getProvisionedIops() {
			return this.provisionedIops;
		}

		public void setProvisionedIops(Long provisionedIops) {
			this.provisionedIops = provisionedIops;
		}

		public String getCurrentKernelVersion() {
			return this.currentKernelVersion;
		}

		public void setCurrentKernelVersion(String currentKernelVersion) {
			this.currentKernelVersion = currentKernelVersion;
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

		public String getDisasterRecoveryInfo() {
			return this.disasterRecoveryInfo;
		}

		public void setDisasterRecoveryInfo(String disasterRecoveryInfo) {
			this.disasterRecoveryInfo = disasterRecoveryInfo;
		}

		public Integer getEbsIOPS() {
			return this.ebsIOPS;
		}

		public void setEbsIOPS(Integer ebsIOPS) {
			this.ebsIOPS = ebsIOPS;
		}

		public String getVPCCloudInstanceIds() {
			return this.vPCCloudInstanceIds;
		}

		public void setVPCCloudInstanceIds(String vPCCloudInstanceIds) {
			this.vPCCloudInstanceIds = vPCCloudInstanceIds;
		}

		public Integer getEbsBandwidth() {
			return this.ebsBandwidth;
		}

		public void setEbsBandwidth(Integer ebsBandwidth) {
			this.ebsBandwidth = ebsBandwidth;
		}

		public String getEncryptionKey() {
			return this.encryptionKey;
		}

		public void setEncryptionKey(String encryptionKey) {
			this.encryptionKey = encryptionKey;
		}

		public String getStorageEngine() {
			return this.storageEngine;
		}

		public void setStorageEngine(String storageEngine) {
			this.storageEngine = storageEngine;
		}

		public String getMaintainEndTime() {
			return this.maintainEndTime;
		}

		public void setMaintainEndTime(String maintainEndTime) {
			this.maintainEndTime = maintainEndTime;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public String getPaymentType() {
			return this.paymentType;
		}

		public void setPaymentType(String paymentType) {
			this.paymentType = paymentType;
		}

		public String getMaintainStartTime() {
			return this.maintainStartTime;
		}

		public void setMaintainStartTime(String maintainStartTime) {
			this.maintainStartTime = maintainStartTime;
		}

		public Boolean getBurstingEnabled() {
			return this.burstingEnabled;
		}

		public void setBurstingEnabled(Boolean burstingEnabled) {
			this.burstingEnabled = burstingEnabled;
		}

		public Boolean getColdDataEnabled() {
			return this.coldDataEnabled;
		}

		public void setColdDataEnabled(Boolean coldDataEnabled) {
			this.coldDataEnabled = coldDataEnabled;
		}

		public Boolean getAIGatewayEnabled() {
			return this.aIGatewayEnabled;
		}

		public void setAIGatewayEnabled(Boolean aIGatewayEnabled) {
			this.aIGatewayEnabled = aIGatewayEnabled;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getReadonlyReplicas() {
			return this.readonlyReplicas;
		}

		public void setReadonlyReplicas(String readonlyReplicas) {
			this.readonlyReplicas = readonlyReplicas;
		}

		public String getReplicationFactor() {
			return this.replicationFactor;
		}

		public void setReplicationFactor(String replicationFactor) {
			this.replicationFactor = replicationFactor;
		}

		public String getCloudType() {
			return this.cloudType;
		}

		public void setCloudType(String cloudType) {
			this.cloudType = cloudType;
		}

		public String getDBInstanceOrderStatus() {
			return this.dBInstanceOrderStatus;
		}

		public void setDBInstanceOrderStatus(String dBInstanceOrderStatus) {
			this.dBInstanceOrderStatus = dBInstanceOrderStatus;
		}

		public Integer getEcsIOPS() {
			return this.ecsIOPS;
		}

		public void setEcsIOPS(Integer ecsIOPS) {
			this.ecsIOPS = ecsIOPS;
		}

		public Integer getMaxIOPS() {
			return this.maxIOPS;
		}

		public void setMaxIOPS(Integer maxIOPS) {
			this.maxIOPS = maxIOPS;
		}

		public String getSecondaryZoneId() {
			return this.secondaryZoneId;
		}

		public void setSecondaryZoneId(String secondaryZoneId) {
			this.secondaryZoneId = secondaryZoneId;
		}

		public Integer getSearchNodeStorage() {
			return this.searchNodeStorage;
		}

		public void setSearchNodeStorage(Integer searchNodeStorage) {
			this.searchNodeStorage = searchNodeStorage;
		}

		public Boolean getUseClusterBackup() {
			return this.useClusterBackup;
		}

		public void setUseClusterBackup(Boolean useClusterBackup) {
			this.useClusterBackup = useClusterBackup;
		}

		public String getVpcAuthMode() {
			return this.vpcAuthMode;
		}

		public void setVpcAuthMode(String vpcAuthMode) {
			this.vpcAuthMode = vpcAuthMode;
		}

		public String getProtocolType() {
			return this.protocolType;
		}

		public void setProtocolType(String protocolType) {
			this.protocolType = protocolType;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getOriginalStorageType() {
			return this.originalStorageType;
		}

		public void setOriginalStorageType(String originalStorageType) {
			this.originalStorageType = originalStorageType;
		}

		public String getKindCode() {
			return this.kindCode;
		}

		public void setKindCode(String kindCode) {
			this.kindCode = kindCode;
		}

		public String getSearchNodeClass() {
			return this.searchNodeClass;
		}

		public void setSearchNodeClass(String searchNodeClass) {
			this.searchNodeClass = searchNodeClass;
		}

		public List<ReplicaSet> getReplicaSets() {
			return this.replicaSets;
		}

		public void setReplicaSets(List<ReplicaSet> replicaSets) {
			this.replicaSets = replicaSets;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<NetworkAddress> getNetworkAddresses() {
			return this.networkAddresses;
		}

		public void setNetworkAddresses(List<NetworkAddress> networkAddresses) {
			this.networkAddresses = networkAddresses;
		}

		public List<ConfigserverAttribute> getConfigserverList() {
			return this.configserverList;
		}

		public void setConfigserverList(List<ConfigserverAttribute> configserverList) {
			this.configserverList = configserverList;
		}

		public List<ShardSearchNodesItem> getShardSearchNodes() {
			return this.shardSearchNodes;
		}

		public void setShardSearchNodes(List<ShardSearchNodesItem> shardSearchNodes) {
			this.shardSearchNodes = shardSearchNodes;
		}

		public List<MongosAttribute> getMongosList() {
			return this.mongosList;
		}

		public void setMongosList(List<MongosAttribute> mongosList) {
			this.mongosList = mongosList;
		}

		public List<ShardAttribute> getShardList() {
			return this.shardList;
		}

		public void setShardList(List<ShardAttribute> shardList) {
			this.shardList = shardList;
		}

		public static class ReplicaSet {

			private String replicaSetRole;

			private String connectionDomain;

			private String vPCCloudInstanceId;

			private String connectionPort;

			private String vPCId;

			private String networkType;

			private String vSwitchId;

			public String getReplicaSetRole() {
				return this.replicaSetRole;
			}

			public void setReplicaSetRole(String replicaSetRole) {
				this.replicaSetRole = replicaSetRole;
			}

			public String getConnectionDomain() {
				return this.connectionDomain;
			}

			public void setConnectionDomain(String connectionDomain) {
				this.connectionDomain = connectionDomain;
			}

			public String getVPCCloudInstanceId() {
				return this.vPCCloudInstanceId;
			}

			public void setVPCCloudInstanceId(String vPCCloudInstanceId) {
				this.vPCCloudInstanceId = vPCCloudInstanceId;
			}

			public String getConnectionPort() {
				return this.connectionPort;
			}

			public void setConnectionPort(String connectionPort) {
				this.connectionPort = connectionPort;
			}

			public String getVPCId() {
				return this.vPCId;
			}

			public void setVPCId(String vPCId) {
				this.vPCId = vPCId;
			}

			public String getNetworkType() {
				return this.networkType;
			}

			public void setNetworkType(String networkType) {
				this.networkType = networkType;
			}

			public String getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(String vSwitchId) {
				this.vSwitchId = vSwitchId;
			}
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

		public static class NetworkAddress {

			private String role;

			private String networkAddress;

			private String vPCId;

			private String networkType;

			private String nodeType;

			private String vSwitchId;

			private String expiredTime;

			private String port;

			private String nodeId;

			private String iPAddress;

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}

			public String getNetworkAddress() {
				return this.networkAddress;
			}

			public void setNetworkAddress(String networkAddress) {
				this.networkAddress = networkAddress;
			}

			public String getVPCId() {
				return this.vPCId;
			}

			public void setVPCId(String vPCId) {
				this.vPCId = vPCId;
			}

			public String getNetworkType() {
				return this.networkType;
			}

			public void setNetworkType(String networkType) {
				this.networkType = networkType;
			}

			public String getNodeType() {
				return this.nodeType;
			}

			public void setNodeType(String nodeType) {
				this.nodeType = nodeType;
			}

			public String getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(String vSwitchId) {
				this.vSwitchId = vSwitchId;
			}

			public String getExpiredTime() {
				return this.expiredTime;
			}

			public void setExpiredTime(String expiredTime) {
				this.expiredTime = expiredTime;
			}

			public String getPort() {
				return this.port;
			}

			public void setPort(String port) {
				this.port = port;
			}

			public String getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(String nodeId) {
				this.nodeId = nodeId;
			}

			public String getIPAddress() {
				return this.iPAddress;
			}

			public void setIPAddress(String iPAddress) {
				this.iPAddress = iPAddress;
			}
		}

		public static class ConfigserverAttribute {

			private String status;

			private String nodeClass;

			private String nodeDescription;

			private Integer maxConnections;

			private String currentKernelVersion;

			private Integer port;

			private String nodeId;

			private Integer nodeStorage;

			private String lockMode;

			private String connectString;

			private Integer maxIOPS;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getNodeClass() {
				return this.nodeClass;
			}

			public void setNodeClass(String nodeClass) {
				this.nodeClass = nodeClass;
			}

			public String getNodeDescription() {
				return this.nodeDescription;
			}

			public void setNodeDescription(String nodeDescription) {
				this.nodeDescription = nodeDescription;
			}

			public Integer getMaxConnections() {
				return this.maxConnections;
			}

			public void setMaxConnections(Integer maxConnections) {
				this.maxConnections = maxConnections;
			}

			public String getCurrentKernelVersion() {
				return this.currentKernelVersion;
			}

			public void setCurrentKernelVersion(String currentKernelVersion) {
				this.currentKernelVersion = currentKernelVersion;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}

			public String getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(String nodeId) {
				this.nodeId = nodeId;
			}

			public Integer getNodeStorage() {
				return this.nodeStorage;
			}

			public void setNodeStorage(Integer nodeStorage) {
				this.nodeStorage = nodeStorage;
			}

			public String getLockMode() {
				return this.lockMode;
			}

			public void setLockMode(String lockMode) {
				this.lockMode = lockMode;
			}

			public String getConnectString() {
				return this.connectString;
			}

			public void setConnectString(String connectString) {
				this.connectString = connectString;
			}

			public Integer getMaxIOPS() {
				return this.maxIOPS;
			}

			public void setMaxIOPS(Integer maxIOPS) {
				this.maxIOPS = maxIOPS;
			}
		}

		public static class ShardSearchNodesItem {

			private String searchNodeCount;

			private String searchNodeId;

			private String nodeId;

			private String searchNodeClass;

			private String searchNodeStorage;

			public String getSearchNodeCount() {
				return this.searchNodeCount;
			}

			public void setSearchNodeCount(String searchNodeCount) {
				this.searchNodeCount = searchNodeCount;
			}

			public String getSearchNodeId() {
				return this.searchNodeId;
			}

			public void setSearchNodeId(String searchNodeId) {
				this.searchNodeId = searchNodeId;
			}

			public String getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(String nodeId) {
				this.nodeId = nodeId;
			}

			public String getSearchNodeClass() {
				return this.searchNodeClass;
			}

			public void setSearchNodeClass(String searchNodeClass) {
				this.searchNodeClass = searchNodeClass;
			}

			public String getSearchNodeStorage() {
				return this.searchNodeStorage;
			}

			public void setSearchNodeStorage(String searchNodeStorage) {
				this.searchNodeStorage = searchNodeStorage;
			}
		}

		public static class MongosAttribute {

			private String connectSting;

			private String status;

			private Integer maxConnections;

			private String vPCId;

			private String vSwitchId;

			private Integer port;

			private String lockMode;

			private Integer maxIOPS;

			private String nodeClass;

			private String nodeDescription;

			private String currentKernelVersion;

			private String nodeId;

			private String vpcCloudInstanceId;

			private String connectString;

			public String getConnectSting() {
				return this.connectSting;
			}

			public void setConnectSting(String connectSting) {
				this.connectSting = connectSting;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Integer getMaxConnections() {
				return this.maxConnections;
			}

			public void setMaxConnections(Integer maxConnections) {
				this.maxConnections = maxConnections;
			}

			public String getVPCId() {
				return this.vPCId;
			}

			public void setVPCId(String vPCId) {
				this.vPCId = vPCId;
			}

			public String getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(String vSwitchId) {
				this.vSwitchId = vSwitchId;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}

			public String getLockMode() {
				return this.lockMode;
			}

			public void setLockMode(String lockMode) {
				this.lockMode = lockMode;
			}

			public Integer getMaxIOPS() {
				return this.maxIOPS;
			}

			public void setMaxIOPS(Integer maxIOPS) {
				this.maxIOPS = maxIOPS;
			}

			public String getNodeClass() {
				return this.nodeClass;
			}

			public void setNodeClass(String nodeClass) {
				this.nodeClass = nodeClass;
			}

			public String getNodeDescription() {
				return this.nodeDescription;
			}

			public void setNodeDescription(String nodeDescription) {
				this.nodeDescription = nodeDescription;
			}

			public String getCurrentKernelVersion() {
				return this.currentKernelVersion;
			}

			public void setCurrentKernelVersion(String currentKernelVersion) {
				this.currentKernelVersion = currentKernelVersion;
			}

			public String getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(String nodeId) {
				this.nodeId = nodeId;
			}

			public String getVpcCloudInstanceId() {
				return this.vpcCloudInstanceId;
			}

			public void setVpcCloudInstanceId(String vpcCloudInstanceId) {
				this.vpcCloudInstanceId = vpcCloudInstanceId;
			}

			public String getConnectString() {
				return this.connectString;
			}

			public void setConnectString(String connectString) {
				this.connectString = connectString;
			}
		}

		public static class ShardAttribute {

			private String status;

			private Integer ebsIOPS;

			private Integer maxConnections;

			private Integer readonlyReplicas;

			private Integer port;

			private Integer ebsBandwidth;

			private Integer ecsIOPS;

			private String lockMode;

			private String replicaSetName;

			private Integer ecsBandwidth;

			private String maxDiskMbps;

			private Integer maxIOPS;

			private String nodeClass;

			private String nodeDescription;

			private String currentKernelVersion;

			private String nodeId;

			private Integer nodeStorage;

			private String connectString;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Integer getEbsIOPS() {
				return this.ebsIOPS;
			}

			public void setEbsIOPS(Integer ebsIOPS) {
				this.ebsIOPS = ebsIOPS;
			}

			public Integer getMaxConnections() {
				return this.maxConnections;
			}

			public void setMaxConnections(Integer maxConnections) {
				this.maxConnections = maxConnections;
			}

			public Integer getReadonlyReplicas() {
				return this.readonlyReplicas;
			}

			public void setReadonlyReplicas(Integer readonlyReplicas) {
				this.readonlyReplicas = readonlyReplicas;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}

			public Integer getEbsBandwidth() {
				return this.ebsBandwidth;
			}

			public void setEbsBandwidth(Integer ebsBandwidth) {
				this.ebsBandwidth = ebsBandwidth;
			}

			public Integer getEcsIOPS() {
				return this.ecsIOPS;
			}

			public void setEcsIOPS(Integer ecsIOPS) {
				this.ecsIOPS = ecsIOPS;
			}

			public String getLockMode() {
				return this.lockMode;
			}

			public void setLockMode(String lockMode) {
				this.lockMode = lockMode;
			}

			public String getReplicaSetName() {
				return this.replicaSetName;
			}

			public void setReplicaSetName(String replicaSetName) {
				this.replicaSetName = replicaSetName;
			}

			public Integer getEcsBandwidth() {
				return this.ecsBandwidth;
			}

			public void setEcsBandwidth(Integer ecsBandwidth) {
				this.ecsBandwidth = ecsBandwidth;
			}

			public String getMaxDiskMbps() {
				return this.maxDiskMbps;
			}

			public void setMaxDiskMbps(String maxDiskMbps) {
				this.maxDiskMbps = maxDiskMbps;
			}

			public Integer getMaxIOPS() {
				return this.maxIOPS;
			}

			public void setMaxIOPS(Integer maxIOPS) {
				this.maxIOPS = maxIOPS;
			}

			public String getNodeClass() {
				return this.nodeClass;
			}

			public void setNodeClass(String nodeClass) {
				this.nodeClass = nodeClass;
			}

			public String getNodeDescription() {
				return this.nodeDescription;
			}

			public void setNodeDescription(String nodeDescription) {
				this.nodeDescription = nodeDescription;
			}

			public String getCurrentKernelVersion() {
				return this.currentKernelVersion;
			}

			public void setCurrentKernelVersion(String currentKernelVersion) {
				this.currentKernelVersion = currentKernelVersion;
			}

			public String getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(String nodeId) {
				this.nodeId = nodeId;
			}

			public Integer getNodeStorage() {
				return this.nodeStorage;
			}

			public void setNodeStorage(Integer nodeStorage) {
				this.nodeStorage = nodeStorage;
			}

			public String getConnectString() {
				return this.connectString;
			}

			public void setConnectString(String connectString) {
				this.connectString = connectString;
			}
		}
	}

	@Override
	public DescribeDBInstanceAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
