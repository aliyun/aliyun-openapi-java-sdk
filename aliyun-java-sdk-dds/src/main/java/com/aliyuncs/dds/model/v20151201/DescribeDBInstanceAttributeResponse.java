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

		private String dBInstanceId;

		private String dBInstanceDescription;

		private String regionId;

		private String zoneId;

		private String engine;

		private String engineVersion;

		private String storageEngine;

		private String dBInstanceClass;

		private Integer dBInstanceStorage;

		private String replacateId;

		private String vPCId;

		private String vSwitchId;

		private String vPCCloudInstanceIds;

		private String dBInstanceStatus;

		private String lockMode;

		private String chargeType;

		private String creationTime;

		private String replicaSetName;

		private String networkType;

		private String expireTime;

		private String maintainStartTime;

		private String maintainEndTime;

		private String dBInstanceType;

		private Integer lastDowngradeTime;

		private String replicationFactor;

		private Integer maxIOPS;

		private Integer maxConnections;

		private String currentKernelVersion;

		private List<MongosAttribute> mongosList;

		private List<ShardAttribute> shardList;

		private List<ReplicaSet> replicaSets;

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public String getDBInstanceDescription() {
			return this.dBInstanceDescription;
		}

		public void setDBInstanceDescription(String dBInstanceDescription) {
			this.dBInstanceDescription = dBInstanceDescription;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
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

		public String getStorageEngine() {
			return this.storageEngine;
		}

		public void setStorageEngine(String storageEngine) {
			this.storageEngine = storageEngine;
		}

		public String getDBInstanceClass() {
			return this.dBInstanceClass;
		}

		public void setDBInstanceClass(String dBInstanceClass) {
			this.dBInstanceClass = dBInstanceClass;
		}

		public Integer getDBInstanceStorage() {
			return this.dBInstanceStorage;
		}

		public void setDBInstanceStorage(Integer dBInstanceStorage) {
			this.dBInstanceStorage = dBInstanceStorage;
		}

		public String getReplacateId() {
			return this.replacateId;
		}

		public void setReplacateId(String replacateId) {
			this.replacateId = replacateId;
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

		public String getVPCCloudInstanceIds() {
			return this.vPCCloudInstanceIds;
		}

		public void setVPCCloudInstanceIds(String vPCCloudInstanceIds) {
			this.vPCCloudInstanceIds = vPCCloudInstanceIds;
		}

		public String getDBInstanceStatus() {
			return this.dBInstanceStatus;
		}

		public void setDBInstanceStatus(String dBInstanceStatus) {
			this.dBInstanceStatus = dBInstanceStatus;
		}

		public String getLockMode() {
			return this.lockMode;
		}

		public void setLockMode(String lockMode) {
			this.lockMode = lockMode;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getReplicaSetName() {
			return this.replicaSetName;
		}

		public void setReplicaSetName(String replicaSetName) {
			this.replicaSetName = replicaSetName;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
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

		public String getMaintainEndTime() {
			return this.maintainEndTime;
		}

		public void setMaintainEndTime(String maintainEndTime) {
			this.maintainEndTime = maintainEndTime;
		}

		public String getDBInstanceType() {
			return this.dBInstanceType;
		}

		public void setDBInstanceType(String dBInstanceType) {
			this.dBInstanceType = dBInstanceType;
		}

		public Integer getLastDowngradeTime() {
			return this.lastDowngradeTime;
		}

		public void setLastDowngradeTime(Integer lastDowngradeTime) {
			this.lastDowngradeTime = lastDowngradeTime;
		}

		public String getReplicationFactor() {
			return this.replicationFactor;
		}

		public void setReplicationFactor(String replicationFactor) {
			this.replicationFactor = replicationFactor;
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

		public String getCurrentKernelVersion() {
			return this.currentKernelVersion;
		}

		public void setCurrentKernelVersion(String currentKernelVersion) {
			this.currentKernelVersion = currentKernelVersion;
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

		public List<ReplicaSet> getReplicaSets() {
			return this.replicaSets;
		}

		public void setReplicaSets(List<ReplicaSet> replicaSets) {
			this.replicaSets = replicaSets;
		}

		public static class MongosAttribute {

			private String nodeId;

			private String nodeDescription;

			private String nodeClass;

			private String connectSting;

			private Integer maxIOPS;

			private Integer maxConnections;

			private Integer port;

			private String vpcCloudInstanceId;

			private String vPCId;

			private String vSwitchId;

			public String getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(String nodeId) {
				this.nodeId = nodeId;
			}

			public String getNodeDescription() {
				return this.nodeDescription;
			}

			public void setNodeDescription(String nodeDescription) {
				this.nodeDescription = nodeDescription;
			}

			public String getNodeClass() {
				return this.nodeClass;
			}

			public void setNodeClass(String nodeClass) {
				this.nodeClass = nodeClass;
			}

			public String getConnectSting() {
				return this.connectSting;
			}

			public void setConnectSting(String connectSting) {
				this.connectSting = connectSting;
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

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}

			public String getVpcCloudInstanceId() {
				return this.vpcCloudInstanceId;
			}

			public void setVpcCloudInstanceId(String vpcCloudInstanceId) {
				this.vpcCloudInstanceId = vpcCloudInstanceId;
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
		}

		public static class ShardAttribute {

			private String nodeId;

			private String nodeDescription;

			private String nodeClass;

			private Integer nodeStorage;

			private Integer maxIOPS;

			private Integer maxConnections;

			public String getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(String nodeId) {
				this.nodeId = nodeId;
			}

			public String getNodeDescription() {
				return this.nodeDescription;
			}

			public void setNodeDescription(String nodeDescription) {
				this.nodeDescription = nodeDescription;
			}

			public String getNodeClass() {
				return this.nodeClass;
			}

			public void setNodeClass(String nodeClass) {
				this.nodeClass = nodeClass;
			}

			public Integer getNodeStorage() {
				return this.nodeStorage;
			}

			public void setNodeStorage(Integer nodeStorage) {
				this.nodeStorage = nodeStorage;
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
		}

		public static class ReplicaSet {

			private String replicaSetRole;

			private String connectionDomain;

			private String connectionPort;

			private String vPCCloudInstanceId;

			private String vPCId;

			private String vSwitchId;

			private String networkType;

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

			public String getConnectionPort() {
				return this.connectionPort;
			}

			public void setConnectionPort(String connectionPort) {
				this.connectionPort = connectionPort;
			}

			public String getVPCCloudInstanceId() {
				return this.vPCCloudInstanceId;
			}

			public void setVPCCloudInstanceId(String vPCCloudInstanceId) {
				this.vPCCloudInstanceId = vPCCloudInstanceId;
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

			public String getNetworkType() {
				return this.networkType;
			}

			public void setNetworkType(String networkType) {
				this.networkType = networkType;
			}
		}
	}

	@Override
	public DescribeDBInstanceAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
