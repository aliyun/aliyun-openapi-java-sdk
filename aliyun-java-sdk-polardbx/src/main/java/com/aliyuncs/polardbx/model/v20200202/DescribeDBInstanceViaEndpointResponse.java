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
import com.aliyuncs.polardbx.transform.v20200202.DescribeDBInstanceViaEndpointResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceViaEndpointResponse extends AcsResponse {

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

		private String type;

		private String status;

		private String rightsSeparationStatus;

		private Integer dBNodeCount;

		private String expired;

		private String createTime;

		private String payType;

		private String port;

		private String lockMode;

		private String description;

		private String connectionString;

		private Long storageUsed;

		private String expireDate;

		private String commodityCode;

		private String maintainStartTime;

		private String dBInstanceType;

		private String dBNodeClass;

		private String latestMinorVersion;

		private String maintainEndTime;

		private String dBType;

		private Boolean rightsSeparationEnabled;

		private String vPCId;

		private String minorVersion;

		private String regionId;

		private String network;

		private String dBVersion;

		private String vSwitchId;

		private String zoneId;

		private String engine;

		private Integer kindCode;

		private String id;

		private String resourceGroupId;

		private Integer cnNodeCount;

		private Integer dnNodeCount;

		private String cnNodeClassCode;

		private String dnNodeClassCode;

		private String series;

		private List<DBNode> dBNodes;

		private List<ConnAddr> connAddrs;

		private List<TagSetItem> tagSet;

		private List<String> readDBInstances;

		private List<String> lTSVersions;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getRightsSeparationStatus() {
			return this.rightsSeparationStatus;
		}

		public void setRightsSeparationStatus(String rightsSeparationStatus) {
			this.rightsSeparationStatus = rightsSeparationStatus;
		}

		public Integer getDBNodeCount() {
			return this.dBNodeCount;
		}

		public void setDBNodeCount(Integer dBNodeCount) {
			this.dBNodeCount = dBNodeCount;
		}

		public String getExpired() {
			return this.expired;
		}

		public void setExpired(String expired) {
			this.expired = expired;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
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

		public String getLockMode() {
			return this.lockMode;
		}

		public void setLockMode(String lockMode) {
			this.lockMode = lockMode;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getConnectionString() {
			return this.connectionString;
		}

		public void setConnectionString(String connectionString) {
			this.connectionString = connectionString;
		}

		public Long getStorageUsed() {
			return this.storageUsed;
		}

		public void setStorageUsed(Long storageUsed) {
			this.storageUsed = storageUsed;
		}

		public String getExpireDate() {
			return this.expireDate;
		}

		public void setExpireDate(String expireDate) {
			this.expireDate = expireDate;
		}

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}

		public String getMaintainStartTime() {
			return this.maintainStartTime;
		}

		public void setMaintainStartTime(String maintainStartTime) {
			this.maintainStartTime = maintainStartTime;
		}

		public String getDBInstanceType() {
			return this.dBInstanceType;
		}

		public void setDBInstanceType(String dBInstanceType) {
			this.dBInstanceType = dBInstanceType;
		}

		public String getDBNodeClass() {
			return this.dBNodeClass;
		}

		public void setDBNodeClass(String dBNodeClass) {
			this.dBNodeClass = dBNodeClass;
		}

		public String getLatestMinorVersion() {
			return this.latestMinorVersion;
		}

		public void setLatestMinorVersion(String latestMinorVersion) {
			this.latestMinorVersion = latestMinorVersion;
		}

		public String getMaintainEndTime() {
			return this.maintainEndTime;
		}

		public void setMaintainEndTime(String maintainEndTime) {
			this.maintainEndTime = maintainEndTime;
		}

		public String getDBType() {
			return this.dBType;
		}

		public void setDBType(String dBType) {
			this.dBType = dBType;
		}

		public Boolean getRightsSeparationEnabled() {
			return this.rightsSeparationEnabled;
		}

		public void setRightsSeparationEnabled(Boolean rightsSeparationEnabled) {
			this.rightsSeparationEnabled = rightsSeparationEnabled;
		}

		public String getVPCId() {
			return this.vPCId;
		}

		public void setVPCId(String vPCId) {
			this.vPCId = vPCId;
		}

		public String getMinorVersion() {
			return this.minorVersion;
		}

		public void setMinorVersion(String minorVersion) {
			this.minorVersion = minorVersion;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getNetwork() {
			return this.network;
		}

		public void setNetwork(String network) {
			this.network = network;
		}

		public String getDBVersion() {
			return this.dBVersion;
		}

		public void setDBVersion(String dBVersion) {
			this.dBVersion = dBVersion;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
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

		public Integer getKindCode() {
			return this.kindCode;
		}

		public void setKindCode(Integer kindCode) {
			this.kindCode = kindCode;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public Integer getCnNodeCount() {
			return this.cnNodeCount;
		}

		public void setCnNodeCount(Integer cnNodeCount) {
			this.cnNodeCount = cnNodeCount;
		}

		public Integer getDnNodeCount() {
			return this.dnNodeCount;
		}

		public void setDnNodeCount(Integer dnNodeCount) {
			this.dnNodeCount = dnNodeCount;
		}

		public String getCnNodeClassCode() {
			return this.cnNodeClassCode;
		}

		public void setCnNodeClassCode(String cnNodeClassCode) {
			this.cnNodeClassCode = cnNodeClassCode;
		}

		public String getDnNodeClassCode() {
			return this.dnNodeClassCode;
		}

		public void setDnNodeClassCode(String dnNodeClassCode) {
			this.dnNodeClassCode = dnNodeClassCode;
		}

		public String getSeries() {
			return this.series;
		}

		public void setSeries(String series) {
			this.series = series;
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

		public List<TagSetItem> getTagSet() {
			return this.tagSet;
		}

		public void setTagSet(List<TagSetItem> tagSet) {
			this.tagSet = tagSet;
		}

		public List<String> getReadDBInstances() {
			return this.readDBInstances;
		}

		public void setReadDBInstances(List<String> readDBInstances) {
			this.readDBInstances = readDBInstances;
		}

		public List<String> getLTSVersions() {
			return this.lTSVersions;
		}

		public void setLTSVersions(List<String> lTSVersions) {
			this.lTSVersions = lTSVersions;
		}

		public static class DBNode {

			private String computeNodeId;

			private String nodeClass;

			private String dataNodeId;

			private String zoneId;

			private String id;

			private String regionId;

			public String getComputeNodeId() {
				return this.computeNodeId;
			}

			public void setComputeNodeId(String computeNodeId) {
				this.computeNodeId = computeNodeId;
			}

			public String getNodeClass() {
				return this.nodeClass;
			}

			public void setNodeClass(String nodeClass) {
				this.nodeClass = nodeClass;
			}

			public String getDataNodeId() {
				return this.dataNodeId;
			}

			public void setDataNodeId(String dataNodeId) {
				this.dataNodeId = dataNodeId;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}
		}

		public static class ConnAddr {

			private String type;

			private String vSwitchId;

			private Long port;

			private String vPCId;

			private String connectionString;

			private String vpcInstanceId;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(String vSwitchId) {
				this.vSwitchId = vSwitchId;
			}

			public Long getPort() {
				return this.port;
			}

			public void setPort(Long port) {
				this.port = port;
			}

			public String getVPCId() {
				return this.vPCId;
			}

			public void setVPCId(String vPCId) {
				this.vPCId = vPCId;
			}

			public String getConnectionString() {
				return this.connectionString;
			}

			public void setConnectionString(String connectionString) {
				this.connectionString = connectionString;
			}

			public String getVpcInstanceId() {
				return this.vpcInstanceId;
			}

			public void setVpcInstanceId(String vpcInstanceId) {
				this.vpcInstanceId = vpcInstanceId;
			}
		}

		public static class TagSetItem {

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
	}

	@Override
	public DescribeDBInstanceViaEndpointResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceViaEndpointResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
