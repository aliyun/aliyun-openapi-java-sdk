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

package com.aliyuncs.polardbx.model.v20200202;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardbx.transform.v20200202.DescribeDBInstanceAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceAttributeResponse extends AcsResponse {

	private String requestId;

	private DBInstance dBInstance;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DBInstance getDBInstance() {
		return this.dBInstance;
	}

	public void setDBInstance(DBInstance dBInstance) {
		this.dBInstance = dBInstance;
	}

	public static class DBInstance {

		private String status;

		private String description;

		private String zoneId;

		private String vPCId;

		private String createTime;

		private String expired;

		private String payType;

		private String dBType;

		private String lockMode;

		private String storageUsed;

		private String dBVersion;

		private String network;

		private String regionId;

		private String engine;

		private String id;

		private String connectionString;

		private String port;

		private String minorVersion;

		private String latestMinorVersion;

		private Integer dBNodeCount;

		private String dBInstanceType;

		private String maintainStartTime;

		private String maintainEndTime;

		private String vSwitchId;

		private String commodityCode;

		private String expireDate;

		private String type;

		private String dBNodeClass;

		private List<DBNode> dBNodes;

		private List<ConnAddr> connAddrs;

		private List<String> readDBInstances;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getVPCId() {
			return this.vPCId;
		}

		public void setVPCId(String vPCId) {
			this.vPCId = vPCId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getExpired() {
			return this.expired;
		}

		public void setExpired(String expired) {
			this.expired = expired;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getDBType() {
			return this.dBType;
		}

		public void setDBType(String dBType) {
			this.dBType = dBType;
		}

		public String getLockMode() {
			return this.lockMode;
		}

		public void setLockMode(String lockMode) {
			this.lockMode = lockMode;
		}

		public String getStorageUsed() {
			return this.storageUsed;
		}

		public void setStorageUsed(String storageUsed) {
			this.storageUsed = storageUsed;
		}

		public String getDBVersion() {
			return this.dBVersion;
		}

		public void setDBVersion(String dBVersion) {
			this.dBVersion = dBVersion;
		}

		public String getNetwork() {
			return this.network;
		}

		public void setNetwork(String network) {
			this.network = network;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
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

		public String getMinorVersion() {
			return this.minorVersion;
		}

		public void setMinorVersion(String minorVersion) {
			this.minorVersion = minorVersion;
		}

		public String getLatestMinorVersion() {
			return this.latestMinorVersion;
		}

		public void setLatestMinorVersion(String latestMinorVersion) {
			this.latestMinorVersion = latestMinorVersion;
		}

		public Integer getDBNodeCount() {
			return this.dBNodeCount;
		}

		public void setDBNodeCount(Integer dBNodeCount) {
			this.dBNodeCount = dBNodeCount;
		}

		public String getDBInstanceType() {
			return this.dBInstanceType;
		}

		public void setDBInstanceType(String dBInstanceType) {
			this.dBInstanceType = dBInstanceType;
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

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}

		public String getExpireDate() {
			return this.expireDate;
		}

		public void setExpireDate(String expireDate) {
			this.expireDate = expireDate;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getDBNodeClass() {
			return this.dBNodeClass;
		}

		public void setDBNodeClass(String dBNodeClass) {
			this.dBNodeClass = dBNodeClass;
		}

		public List<DBNode> getDBNodes() {
			return this.dBNodes;
		}

		public void setDBNodes(List<DBNode> dBNodes) {
			this.dBNodes = dBNodes;
		}

		public List<ConnAddr> getConnAddrs() {
			return this.connAddrs;
		}

		public void setConnAddrs(List<ConnAddr> connAddrs) {
			this.connAddrs = connAddrs;
		}

		public List<String> getReadDBInstances() {
			return this.readDBInstances;
		}

		public void setReadDBInstances(List<String> readDBInstances) {
			this.readDBInstances = readDBInstances;
		}

		public static class DBNode {

			private String id;

			private String nodeClass;

			private String regionId;

			private String zoneId;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getNodeClass() {
				return this.nodeClass;
			}

			public void setNodeClass(String nodeClass) {
				this.nodeClass = nodeClass;
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
		}

		public static class ConnAddr {

			private String connectionString;

			private String port;

			private String type;

			private String vPCId;

			private String vSwitchId;

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

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
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
	}

	@Override
	public DescribeDBInstanceAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceAttributeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
