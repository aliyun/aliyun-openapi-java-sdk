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
import com.aliyuncs.polardb.transform.v20170801.DescribeDBClustersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBClustersResponse extends AcsResponse {

	private Integer totalRecordCount;

	private Integer pageRecordCount;

	private String requestId;

	private Integer pageNumber;

	private List<DBCluster> items;

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<DBCluster> getItems() {
		return this.items;
	}

	public void setItems(List<DBCluster> items) {
		this.items = items;
	}

	public static class DBCluster {

		private String vpcId;

		private String vswitchId;

		private String expireTime;

		private String expired;

		private Integer dBNodeNumber;

		private String createTime;

		private String payType;

		private String storagePayType;

		private String serverlessType;

		private String strictConsistency;

		private String dBNodeClass;

		private String dBType;

		private String lockMode;

		private String regionId;

		private Integer deletionLock;

		private String dBVersion;

		private String dBClusterId;

		private String dBClusterStatus;

		private String resourceGroupId;

		private Long storageUsed;

		private Long compressStorageUsed;

		private Long storageSpace;

		private String dBClusterNetworkType;

		private String dBClusterDescription;

		private String zoneId;

		private String engine;

		private String category;

		private String aiType;

		private String cpuCores;

		private String memorySize;

		private String remoteMemorySize;

		private String cpuArch;

		private String deployUnit;

		private String storageType;

		private String hotStandbyCluster;

		private String engineMigrationStatus;

		private Integer cnNodeCount;

		private Integer dnNodeCount;

		private String cnClass;

		private String dnClass;

		private String cloudInstanceIp;

		private String subCategory;

		private List<Tag> tags;

		private List<DBNode> dBNodes;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVswitchId() {
			return this.vswitchId;
		}

		public void setVswitchId(String vswitchId) {
			this.vswitchId = vswitchId;
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

		public Integer getDBNodeNumber() {
			return this.dBNodeNumber;
		}

		public void setDBNodeNumber(Integer dBNodeNumber) {
			this.dBNodeNumber = dBNodeNumber;
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

		public String getStoragePayType() {
			return this.storagePayType;
		}

		public void setStoragePayType(String storagePayType) {
			this.storagePayType = storagePayType;
		}

		public String getServerlessType() {
			return this.serverlessType;
		}

		public void setServerlessType(String serverlessType) {
			this.serverlessType = serverlessType;
		}

		public String getStrictConsistency() {
			return this.strictConsistency;
		}

		public void setStrictConsistency(String strictConsistency) {
			this.strictConsistency = strictConsistency;
		}

		public String getDBNodeClass() {
			return this.dBNodeClass;
		}

		public void setDBNodeClass(String dBNodeClass) {
			this.dBNodeClass = dBNodeClass;
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

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Integer getDeletionLock() {
			return this.deletionLock;
		}

		public void setDeletionLock(Integer deletionLock) {
			this.deletionLock = deletionLock;
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

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public Long getStorageUsed() {
			return this.storageUsed;
		}

		public void setStorageUsed(Long storageUsed) {
			this.storageUsed = storageUsed;
		}

		public Long getCompressStorageUsed() {
			return this.compressStorageUsed;
		}

		public void setCompressStorageUsed(Long compressStorageUsed) {
			this.compressStorageUsed = compressStorageUsed;
		}

		public Long getStorageSpace() {
			return this.storageSpace;
		}

		public void setStorageSpace(Long storageSpace) {
			this.storageSpace = storageSpace;
		}

		public String getDBClusterNetworkType() {
			return this.dBClusterNetworkType;
		}

		public void setDBClusterNetworkType(String dBClusterNetworkType) {
			this.dBClusterNetworkType = dBClusterNetworkType;
		}

		public String getDBClusterDescription() {
			return this.dBClusterDescription;
		}

		public void setDBClusterDescription(String dBClusterDescription) {
			this.dBClusterDescription = dBClusterDescription;
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

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getAiType() {
			return this.aiType;
		}

		public void setAiType(String aiType) {
			this.aiType = aiType;
		}

		public String getCpuCores() {
			return this.cpuCores;
		}

		public void setCpuCores(String cpuCores) {
			this.cpuCores = cpuCores;
		}

		public String getMemorySize() {
			return this.memorySize;
		}

		public void setMemorySize(String memorySize) {
			this.memorySize = memorySize;
		}

		public String getRemoteMemorySize() {
			return this.remoteMemorySize;
		}

		public void setRemoteMemorySize(String remoteMemorySize) {
			this.remoteMemorySize = remoteMemorySize;
		}

		public String getCpuArch() {
			return this.cpuArch;
		}

		public void setCpuArch(String cpuArch) {
			this.cpuArch = cpuArch;
		}

		public String getDeployUnit() {
			return this.deployUnit;
		}

		public void setDeployUnit(String deployUnit) {
			this.deployUnit = deployUnit;
		}

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}

		public String getHotStandbyCluster() {
			return this.hotStandbyCluster;
		}

		public void setHotStandbyCluster(String hotStandbyCluster) {
			this.hotStandbyCluster = hotStandbyCluster;
		}

		public String getEngineMigrationStatus() {
			return this.engineMigrationStatus;
		}

		public void setEngineMigrationStatus(String engineMigrationStatus) {
			this.engineMigrationStatus = engineMigrationStatus;
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

		public String getCnClass() {
			return this.cnClass;
		}

		public void setCnClass(String cnClass) {
			this.cnClass = cnClass;
		}

		public String getDnClass() {
			return this.dnClass;
		}

		public void setDnClass(String dnClass) {
			this.dnClass = dnClass;
		}

		public String getCloudInstanceIp() {
			return this.cloudInstanceIp;
		}

		public void setCloudInstanceIp(String cloudInstanceIp) {
			this.cloudInstanceIp = cloudInstanceIp;
		}

		public String getSubCategory() {
			return this.subCategory;
		}

		public void setSubCategory(String subCategory) {
			this.subCategory = subCategory;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<DBNode> getDBNodes() {
			return this.dBNodes;
		}

		public void setDBNodes(List<DBNode> dBNodes) {
			this.dBNodes = dBNodes;
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

		public static class DBNode {

			private String dBNodeClass;

			private String zoneId;

			private String dBNodeRole;

			private String dBNodeId;

			private String regionId;

			private String serverless;

			private String imciSwitch;

			private String hotReplicaMode;

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

			public String getDBNodeRole() {
				return this.dBNodeRole;
			}

			public void setDBNodeRole(String dBNodeRole) {
				this.dBNodeRole = dBNodeRole;
			}

			public String getDBNodeId() {
				return this.dBNodeId;
			}

			public void setDBNodeId(String dBNodeId) {
				this.dBNodeId = dBNodeId;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getServerless() {
				return this.serverless;
			}

			public void setServerless(String serverless) {
				this.serverless = serverless;
			}

			public String getImciSwitch() {
				return this.imciSwitch;
			}

			public void setImciSwitch(String imciSwitch) {
				this.imciSwitch = imciSwitch;
			}

			public String getHotReplicaMode() {
				return this.hotReplicaMode;
			}

			public void setHotReplicaMode(String hotReplicaMode) {
				this.hotReplicaMode = hotReplicaMode;
			}
		}
	}

	@Override
	public DescribeDBClustersResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBClustersResponseUnmarshaller.unmarshall(this, context);
	}
}
