/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.dds.model.v20151201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dds.transform.v20151201.DescribeDBInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstancesResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<DBInstance> dBInstances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
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

		private String dBInstanceClass;

		private Integer dBInstanceStorage;

		private String dBInstanceStatus;

		private String lockMode;

		private String chargeType;

		private String networkType;

		private String creationTime;

		private String expireTime;

		private String dBInstanceType;

		private Integer lastDowngradeTime;

		private List<MongosAttribute> mongosList;

		private List<ShardAttribute> shardList;

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

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
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

		public static class MongosAttribute {

			private String nodeId;

			private String nodeDescription;

			private String nodeClass;

			private String connectSting;

			private Integer port;

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

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}
		}

		public static class ShardAttribute {

			private String nodeId;

			private String nodeDescription;

			private String nodeClass;

			private Integer nodeStorage;

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
		}
	}

	@Override
	public DescribeDBInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
