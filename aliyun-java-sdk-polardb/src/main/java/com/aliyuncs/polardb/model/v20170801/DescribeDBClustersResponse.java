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

		private String expireTime;

		private String expired;

		private Integer dBNodeNumber;

		private String createTime;

		private String payType;

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

		private String dBClusterNetworkType;

		private String dBClusterDescription;

		private String zoneId;

		private String engine;

		private String category;

		private List<Tag> tags;

		private List<DBNode> dBNodes;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
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
		}
	}

	@Override
	public DescribeDBClustersResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBClustersResponseUnmarshaller.unmarshall(this, context);
	}
}
