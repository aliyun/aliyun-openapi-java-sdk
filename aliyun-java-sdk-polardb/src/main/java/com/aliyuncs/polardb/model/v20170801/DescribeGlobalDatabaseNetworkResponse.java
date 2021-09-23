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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeGlobalDatabaseNetworkResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGlobalDatabaseNetworkResponse extends AcsResponse {

	private String gDNStatus;

	private String dBVersion;

	private String requestId;

	private String gDNId;

	private String createTime;

	private String dBType;

	private String gDNDescription;

	private List<Connection> connections;

	private List<DBCluster> dBClusters;

	public String getGDNStatus() {
		return this.gDNStatus;
	}

	public void setGDNStatus(String gDNStatus) {
		this.gDNStatus = gDNStatus;
	}

	public String getDBVersion() {
		return this.dBVersion;
	}

	public void setDBVersion(String dBVersion) {
		this.dBVersion = dBVersion;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getGDNId() {
		return this.gDNId;
	}

	public void setGDNId(String gDNId) {
		this.gDNId = gDNId;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getDBType() {
		return this.dBType;
	}

	public void setDBType(String dBType) {
		this.dBType = dBType;
	}

	public String getGDNDescription() {
		return this.gDNDescription;
	}

	public void setGDNDescription(String gDNDescription) {
		this.gDNDescription = gDNDescription;
	}

	public List<Connection> getConnections() {
		return this.connections;
	}

	public void setConnections(List<Connection> connections) {
		this.connections = connections;
	}

	public List<DBCluster> getDBClusters() {
		return this.dBClusters;
	}

	public void setDBClusters(List<DBCluster> dBClusters) {
		this.dBClusters = dBClusters;
	}

	public static class Connection {

		private String connectionString;

		private String netType;

		private String port;

		public String getConnectionString() {
			return this.connectionString;
		}

		public void setConnectionString(String connectionString) {
			this.connectionString = connectionString;
		}

		public String getNetType() {
			return this.netType;
		}

		public void setNetType(String netType) {
			this.netType = netType;
		}

		public String getPort() {
			return this.port;
		}

		public void setPort(String port) {
			this.port = port;
		}
	}

	public static class DBCluster {

		private String replicaLag;

		private String expireTime;

		private String expired;

		private String dBNodeClass;

		private String payType;

		private String dBType;

		private String regionId;

		private String dBVersion;

		private String dBClusterId;

		private String dBClusterStatus;

		private String storageUsed;

		private String dBClusterDescription;

		private String role;

		private List<DBNode> dBNodes;

		public String getReplicaLag() {
			return this.replicaLag;
		}

		public void setReplicaLag(String replicaLag) {
			this.replicaLag = replicaLag;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getExpired() {
			return this.expired;
		}

		public void setExpired(String expired) {
			this.expired = expired;
		}

		public String getDBNodeClass() {
			return this.dBNodeClass;
		}

		public void setDBNodeClass(String dBNodeClass) {
			this.dBNodeClass = dBNodeClass;
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

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getDBVersion() {
			return this.dBVersion;
		}

		public void setDBVersion(String dBVersion) {
			this.dBVersion = dBVersion;
		}

		public String getDBClusterId() {
			return this.dBClusterId;
		}

		public void setDBClusterId(String dBClusterId) {
			this.dBClusterId = dBClusterId;
		}

		public String getDBClusterStatus() {
			return this.dBClusterStatus;
		}

		public void setDBClusterStatus(String dBClusterStatus) {
			this.dBClusterStatus = dBClusterStatus;
		}

		public String getStorageUsed() {
			return this.storageUsed;
		}

		public void setStorageUsed(String storageUsed) {
			this.storageUsed = storageUsed;
		}

		public String getDBClusterDescription() {
			return this.dBClusterDescription;
		}

		public void setDBClusterDescription(String dBClusterDescription) {
			this.dBClusterDescription = dBClusterDescription;
		}

		public String getRole() {
			return this.role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public List<DBNode> getDBNodes() {
			return this.dBNodes;
		}

		public void setDBNodes(List<DBNode> dBNodes) {
			this.dBNodes = dBNodes;
		}

		public static class DBNode {

			private String dBNodeClass;

			private String zoneId;

			private String creationTime;

			private String dBNodeRole;

			private String dBNodeStatus;

			private Integer failoverPriority;

			private Integer maxConnections;

			private Integer maxIOPS;

			private String dBNodeId;

			public String getDBNodeClass() {
				return this.dBNodeClass;
			}

			public void setDBNodeClass(String dBNodeClass) {
				this.dBNodeClass = dBNodeClass;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public String getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(String creationTime) {
				this.creationTime = creationTime;
			}

			public String getDBNodeRole() {
				return this.dBNodeRole;
			}

			public void setDBNodeRole(String dBNodeRole) {
				this.dBNodeRole = dBNodeRole;
			}

			public String getDBNodeStatus() {
				return this.dBNodeStatus;
			}

			public void setDBNodeStatus(String dBNodeStatus) {
				this.dBNodeStatus = dBNodeStatus;
			}

			public Integer getFailoverPriority() {
				return this.failoverPriority;
			}

			public void setFailoverPriority(Integer failoverPriority) {
				this.failoverPriority = failoverPriority;
			}

			public Integer getMaxConnections() {
				return this.maxConnections;
			}

			public void setMaxConnections(Integer maxConnections) {
				this.maxConnections = maxConnections;
			}

			public Integer getMaxIOPS() {
				return this.maxIOPS;
			}

			public void setMaxIOPS(Integer maxIOPS) {
				this.maxIOPS = maxIOPS;
			}

			public String getDBNodeId() {
				return this.dBNodeId;
			}

			public void setDBNodeId(String dBNodeId) {
				this.dBNodeId = dBNodeId;
			}
		}
	}

	@Override
	public DescribeGlobalDatabaseNetworkResponse getInstance(UnmarshallerContext context) {
		return	DescribeGlobalDatabaseNetworkResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
