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
import com.aliyuncs.polardbx.transform.v20200202.DescribeDBInstanceTopologyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceTopologyResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private LogicInstanceTopology logicInstanceTopology;

		public LogicInstanceTopology getLogicInstanceTopology() {
			return this.logicInstanceTopology;
		}

		public void setLogicInstanceTopology(LogicInstanceTopology logicInstanceTopology) {
			this.logicInstanceTopology = logicInstanceTopology;
		}

		public static class LogicInstanceTopology {

			private String dBInstanceName;

			private String dBInstanceCreateTime;

			private String maintainStartTime;

			private String maintainEndTime;

			private String lockReason;

			private Integer dBInstanceStatus;

			private Integer lockMode;

			private String engineVersion;

			private Integer dBInstanceStorage;

			private String dBInstanceConnType;

			private String dBInstanceId;

			private String engine;

			private String dBInstanceDescription;

			private String dBInstanceStatusDescription;

			private List<ItemsItem> items;

			private List<HistoryItemsItem> historyItems;

			public String getDBInstanceName() {
				return this.dBInstanceName;
			}

			public void setDBInstanceName(String dBInstanceName) {
				this.dBInstanceName = dBInstanceName;
			}

			public String getDBInstanceCreateTime() {
				return this.dBInstanceCreateTime;
			}

			public void setDBInstanceCreateTime(String dBInstanceCreateTime) {
				this.dBInstanceCreateTime = dBInstanceCreateTime;
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

			public String getLockReason() {
				return this.lockReason;
			}

			public void setLockReason(String lockReason) {
				this.lockReason = lockReason;
			}

			public Integer getDBInstanceStatus() {
				return this.dBInstanceStatus;
			}

			public void setDBInstanceStatus(Integer dBInstanceStatus) {
				this.dBInstanceStatus = dBInstanceStatus;
			}

			public Integer getLockMode() {
				return this.lockMode;
			}

			public void setLockMode(Integer lockMode) {
				this.lockMode = lockMode;
			}

			public String getEngineVersion() {
				return this.engineVersion;
			}

			public void setEngineVersion(String engineVersion) {
				this.engineVersion = engineVersion;
			}

			public Integer getDBInstanceStorage() {
				return this.dBInstanceStorage;
			}

			public void setDBInstanceStorage(Integer dBInstanceStorage) {
				this.dBInstanceStorage = dBInstanceStorage;
			}

			public String getDBInstanceConnType() {
				return this.dBInstanceConnType;
			}

			public void setDBInstanceConnType(String dBInstanceConnType) {
				this.dBInstanceConnType = dBInstanceConnType;
			}

			public String getDBInstanceId() {
				return this.dBInstanceId;
			}

			public void setDBInstanceId(String dBInstanceId) {
				this.dBInstanceId = dBInstanceId;
			}

			public String getEngine() {
				return this.engine;
			}

			public void setEngine(String engine) {
				this.engine = engine;
			}

			public String getDBInstanceDescription() {
				return this.dBInstanceDescription;
			}

			public void setDBInstanceDescription(String dBInstanceDescription) {
				this.dBInstanceDescription = dBInstanceDescription;
			}

			public String getDBInstanceStatusDescription() {
				return this.dBInstanceStatusDescription;
			}

			public void setDBInstanceStatusDescription(String dBInstanceStatusDescription) {
				this.dBInstanceStatusDescription = dBInstanceStatusDescription;
			}

			public List<ItemsItem> getItems() {
				return this.items;
			}

			public void setItems(List<ItemsItem> items) {
				this.items = items;
			}

			public List<HistoryItemsItem> getHistoryItems() {
				return this.historyItems;
			}

			public void setHistoryItems(List<HistoryItemsItem> historyItems) {
				this.historyItems = historyItems;
			}

			public static class ItemsItem {

				private String dBInstanceCreateTime;

				private String dBInstanceName;

				private String characterType;

				private String maintainStartTime;

				private Long diskSize;

				private String maintainEndTime;

				private String lockReason;

				private Integer dBInstanceStatus;

				private Integer lockMode;

				private String engineVersion;

				private Integer dBInstanceConnType;

				private Integer maxConnections;

				private String dBInstanceId;

				private String engine;

				private Integer maxIops;

				private String dBInstanceDescription;

				private String dBInstanceStatusDescription;

				private String region;

				private String azone;

				private String role;

				private Boolean activated;

				private String status;

				private String nodeClass;

				private String version;

				private String phyInstanceName;

				private String storageUsed;

				private List<ConnectionIpItem> connectionIp;

				private List<AoneRoleMap> azoneRoleList;

				public String getDBInstanceCreateTime() {
					return this.dBInstanceCreateTime;
				}

				public void setDBInstanceCreateTime(String dBInstanceCreateTime) {
					this.dBInstanceCreateTime = dBInstanceCreateTime;
				}

				public String getDBInstanceName() {
					return this.dBInstanceName;
				}

				public void setDBInstanceName(String dBInstanceName) {
					this.dBInstanceName = dBInstanceName;
				}

				public String getCharacterType() {
					return this.characterType;
				}

				public void setCharacterType(String characterType) {
					this.characterType = characterType;
				}

				public String getMaintainStartTime() {
					return this.maintainStartTime;
				}

				public void setMaintainStartTime(String maintainStartTime) {
					this.maintainStartTime = maintainStartTime;
				}

				public Long getDiskSize() {
					return this.diskSize;
				}

				public void setDiskSize(Long diskSize) {
					this.diskSize = diskSize;
				}

				public String getMaintainEndTime() {
					return this.maintainEndTime;
				}

				public void setMaintainEndTime(String maintainEndTime) {
					this.maintainEndTime = maintainEndTime;
				}

				public String getLockReason() {
					return this.lockReason;
				}

				public void setLockReason(String lockReason) {
					this.lockReason = lockReason;
				}

				public Integer getDBInstanceStatus() {
					return this.dBInstanceStatus;
				}

				public void setDBInstanceStatus(Integer dBInstanceStatus) {
					this.dBInstanceStatus = dBInstanceStatus;
				}

				public Integer getLockMode() {
					return this.lockMode;
				}

				public void setLockMode(Integer lockMode) {
					this.lockMode = lockMode;
				}

				public String getEngineVersion() {
					return this.engineVersion;
				}

				public void setEngineVersion(String engineVersion) {
					this.engineVersion = engineVersion;
				}

				public Integer getDBInstanceConnType() {
					return this.dBInstanceConnType;
				}

				public void setDBInstanceConnType(Integer dBInstanceConnType) {
					this.dBInstanceConnType = dBInstanceConnType;
				}

				public Integer getMaxConnections() {
					return this.maxConnections;
				}

				public void setMaxConnections(Integer maxConnections) {
					this.maxConnections = maxConnections;
				}

				public String getDBInstanceId() {
					return this.dBInstanceId;
				}

				public void setDBInstanceId(String dBInstanceId) {
					this.dBInstanceId = dBInstanceId;
				}

				public String getEngine() {
					return this.engine;
				}

				public void setEngine(String engine) {
					this.engine = engine;
				}

				public Integer getMaxIops() {
					return this.maxIops;
				}

				public void setMaxIops(Integer maxIops) {
					this.maxIops = maxIops;
				}

				public String getDBInstanceDescription() {
					return this.dBInstanceDescription;
				}

				public void setDBInstanceDescription(String dBInstanceDescription) {
					this.dBInstanceDescription = dBInstanceDescription;
				}

				public String getDBInstanceStatusDescription() {
					return this.dBInstanceStatusDescription;
				}

				public void setDBInstanceStatusDescription(String dBInstanceStatusDescription) {
					this.dBInstanceStatusDescription = dBInstanceStatusDescription;
				}

				public String getRegion() {
					return this.region;
				}

				public void setRegion(String region) {
					this.region = region;
				}

				public String getAzone() {
					return this.azone;
				}

				public void setAzone(String azone) {
					this.azone = azone;
				}

				public String getRole() {
					return this.role;
				}

				public void setRole(String role) {
					this.role = role;
				}

				public Boolean getActivated() {
					return this.activated;
				}

				public void setActivated(Boolean activated) {
					this.activated = activated;
				}

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

				public String getVersion() {
					return this.version;
				}

				public void setVersion(String version) {
					this.version = version;
				}

				public String getPhyInstanceName() {
					return this.phyInstanceName;
				}

				public void setPhyInstanceName(String phyInstanceName) {
					this.phyInstanceName = phyInstanceName;
				}

				public String getStorageUsed() {
					return this.storageUsed;
				}

				public void setStorageUsed(String storageUsed) {
					this.storageUsed = storageUsed;
				}

				public List<ConnectionIpItem> getConnectionIp() {
					return this.connectionIp;
				}

				public void setConnectionIp(List<ConnectionIpItem> connectionIp) {
					this.connectionIp = connectionIp;
				}

				public List<AoneRoleMap> getAzoneRoleList() {
					return this.azoneRoleList;
				}

				public void setAzoneRoleList(List<AoneRoleMap> azoneRoleList) {
					this.azoneRoleList = azoneRoleList;
				}

				public static class ConnectionIpItem {

					private String port;

					private Integer dBInstanceNetType;

					private String connectionString;

					public String getPort() {
						return this.port;
					}

					public void setPort(String port) {
						this.port = port;
					}

					public Integer getDBInstanceNetType() {
						return this.dBInstanceNetType;
					}

					public void setDBInstanceNetType(Integer dBInstanceNetType) {
						this.dBInstanceNetType = dBInstanceNetType;
					}

					public String getConnectionString() {
						return this.connectionString;
					}

					public void setConnectionString(String connectionString) {
						this.connectionString = connectionString;
					}
				}

				public static class AoneRoleMap {

					private String azone;

					private String role;

					public String getAzone() {
						return this.azone;
					}

					public void setAzone(String azone) {
						this.azone = azone;
					}

					public String getRole() {
						return this.role;
					}

					public void setRole(String role) {
						this.role = role;
					}
				}
			}

			public static class HistoryItemsItem {

				private String characterType;

				private String role;

				private String dBInstanceName;

				private String dBInstanceId;

				private String region;

				private String azone;

				private Boolean activated;

				private String phyInstanceName;

				public String getCharacterType() {
					return this.characterType;
				}

				public void setCharacterType(String characterType) {
					this.characterType = characterType;
				}

				public String getRole() {
					return this.role;
				}

				public void setRole(String role) {
					this.role = role;
				}

				public String getDBInstanceName() {
					return this.dBInstanceName;
				}

				public void setDBInstanceName(String dBInstanceName) {
					this.dBInstanceName = dBInstanceName;
				}

				public String getDBInstanceId() {
					return this.dBInstanceId;
				}

				public void setDBInstanceId(String dBInstanceId) {
					this.dBInstanceId = dBInstanceId;
				}

				public String getRegion() {
					return this.region;
				}

				public void setRegion(String region) {
					this.region = region;
				}

				public String getAzone() {
					return this.azone;
				}

				public void setAzone(String azone) {
					this.azone = azone;
				}

				public Boolean getActivated() {
					return this.activated;
				}

				public void setActivated(Boolean activated) {
					this.activated = activated;
				}

				public String getPhyInstanceName() {
					return this.phyInstanceName;
				}

				public void setPhyInstanceName(String phyInstanceName) {
					this.phyInstanceName = phyInstanceName;
				}
			}
		}
	}

	@Override
	public DescribeDBInstanceTopologyResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceTopologyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
