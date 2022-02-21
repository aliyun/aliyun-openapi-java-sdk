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
import com.aliyuncs.dds.transform.v20151201.DescribeDBInstancesOverviewResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstancesOverviewResponse extends AcsResponse {

	private String totalCount;

	private String requestId;

	private List<DBInstance> dBInstances;

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

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

		private String creationTime;

		private String expireTime;

		private String lastDowngradeTime;

		private String dBInstanceType;

		private String destroyTime;

		private String chargeType;

		private String capacityUnit;

		private String vpcAuthMode;

		private String dBInstanceStatus;

		private String networkType;

		private String lockMode;

		private String engineVersion;

		private String regionId;

		private Integer dBInstanceStorage;

		private String resourceGroupId;

		private String zoneId;

		private String dBInstanceId;

		private String dBInstanceClass;

		private String engine;

		private String replicationFactor;

		private String dBInstanceDescription;

		private String kindCode;

		private List<Tag> tags;

		private List<ShardAttribute> shardList;

		private List<MongosAttribute> mongosList;

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

		public String getLastDowngradeTime() {
			return this.lastDowngradeTime;
		}

		public void setLastDowngradeTime(String lastDowngradeTime) {
			this.lastDowngradeTime = lastDowngradeTime;
		}

		public String getDBInstanceType() {
			return this.dBInstanceType;
		}

		public void setDBInstanceType(String dBInstanceType) {
			this.dBInstanceType = dBInstanceType;
		}

		public String getDestroyTime() {
			return this.destroyTime;
		}

		public void setDestroyTime(String destroyTime) {
			this.destroyTime = destroyTime;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getCapacityUnit() {
			return this.capacityUnit;
		}

		public void setCapacityUnit(String capacityUnit) {
			this.capacityUnit = capacityUnit;
		}

		public String getVpcAuthMode() {
			return this.vpcAuthMode;
		}

		public void setVpcAuthMode(String vpcAuthMode) {
			this.vpcAuthMode = vpcAuthMode;
		}

		public String getDBInstanceStatus() {
			return this.dBInstanceStatus;
		}

		public void setDBInstanceStatus(String dBInstanceStatus) {
			this.dBInstanceStatus = dBInstanceStatus;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public String getLockMode() {
			return this.lockMode;
		}

		public void setLockMode(String lockMode) {
			this.lockMode = lockMode;
		}

		public String getEngineVersion() {
			return this.engineVersion;
		}

		public void setEngineVersion(String engineVersion) {
			this.engineVersion = engineVersion;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Integer getDBInstanceStorage() {
			return this.dBInstanceStorage;
		}

		public void setDBInstanceStorage(Integer dBInstanceStorage) {
			this.dBInstanceStorage = dBInstanceStorage;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
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

		public String getReplicationFactor() {
			return this.replicationFactor;
		}

		public void setReplicationFactor(String replicationFactor) {
			this.replicationFactor = replicationFactor;
		}

		public String getDBInstanceDescription() {
			return this.dBInstanceDescription;
		}

		public void setDBInstanceDescription(String dBInstanceDescription) {
			this.dBInstanceDescription = dBInstanceDescription;
		}

		public String getKindCode() {
			return this.kindCode;
		}

		public void setKindCode(String kindCode) {
			this.kindCode = kindCode;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<ShardAttribute> getShardList() {
			return this.shardList;
		}

		public void setShardList(List<ShardAttribute> shardList) {
			this.shardList = shardList;
		}

		public List<MongosAttribute> getMongosList() {
			return this.mongosList;
		}

		public void setMongosList(List<MongosAttribute> mongosList) {
			this.mongosList = mongosList;
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

		public static class ShardAttribute {

			private String nodeClass;

			private String nodeDescription;

			private Integer nodeStorage;

			private String nodeId;

			private Integer readonlyReplicas;

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

			public Integer getNodeStorage() {
				return this.nodeStorage;
			}

			public void setNodeStorage(Integer nodeStorage) {
				this.nodeStorage = nodeStorage;
			}

			public String getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(String nodeId) {
				this.nodeId = nodeId;
			}

			public Integer getReadonlyReplicas() {
				return this.readonlyReplicas;
			}

			public void setReadonlyReplicas(Integer readonlyReplicas) {
				this.readonlyReplicas = readonlyReplicas;
			}
		}

		public static class MongosAttribute {

			private String nodeClass;

			private String nodeDescription;

			private String nodeId;

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

			public String getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(String nodeId) {
				this.nodeId = nodeId;
			}
		}
	}

	@Override
	public DescribeDBInstancesOverviewResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstancesOverviewResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
