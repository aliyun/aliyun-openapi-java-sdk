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
import com.aliyuncs.polardb.transform.v20170801.DescribeDBClusterAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBClusterAttributeResponse extends AcsResponse {

	private Integer deletionLock;

	private String category;

	private String resourceGroupId;

	private Long dataLevel1BackupChainSize;

	private String dBClusterId;

	private String dBClusterNetworkType;

	private String dBType;

	private Boolean isLatestVersion;

	private String dBVersion;

	private Long storageMax;

	private String zoneIds;

	private String maintainTime;

	private String engine;

	private String requestId;

	private String vPCId;

	private String dBClusterStatus;

	private String vSwitchId;

	private String dBClusterDescription;

	private String expired;

	private String lockMode;

	private String payType;

	private Long storageUsed;

	private String dBVersionStatus;

	private String subCategory;

	private String creationTime;

	private String regionId;

	private Long sQLSize;

	private String expireTime;

	private List<DBNode> dBNodes;

	private List<Tag> tags;

	public Integer getDeletionLock() {
		return this.deletionLock;
	}

	public void setDeletionLock(Integer deletionLock) {
		this.deletionLock = deletionLock;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public Long getDataLevel1BackupChainSize() {
		return this.dataLevel1BackupChainSize;
	}

	public void setDataLevel1BackupChainSize(Long dataLevel1BackupChainSize) {
		this.dataLevel1BackupChainSize = dataLevel1BackupChainSize;
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
	}

	public String getDBClusterNetworkType() {
		return this.dBClusterNetworkType;
	}

	public void setDBClusterNetworkType(String dBClusterNetworkType) {
		this.dBClusterNetworkType = dBClusterNetworkType;
	}

	public String getDBType() {
		return this.dBType;
	}

	public void setDBType(String dBType) {
		this.dBType = dBType;
	}

	public Boolean getIsLatestVersion() {
		return this.isLatestVersion;
	}

	public void setIsLatestVersion(Boolean isLatestVersion) {
		this.isLatestVersion = isLatestVersion;
	}

	public String getDBVersion() {
		return this.dBVersion;
	}

	public void setDBVersion(String dBVersion) {
		this.dBVersion = dBVersion;
	}

	public Long getStorageMax() {
		return this.storageMax;
	}

	public void setStorageMax(Long storageMax) {
		this.storageMax = storageMax;
	}

	public String getZoneIds() {
		return this.zoneIds;
	}

	public void setZoneIds(String zoneIds) {
		this.zoneIds = zoneIds;
	}

	public String getMaintainTime() {
		return this.maintainTime;
	}

	public void setMaintainTime(String maintainTime) {
		this.maintainTime = maintainTime;
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getVPCId() {
		return this.vPCId;
	}

	public void setVPCId(String vPCId) {
		this.vPCId = vPCId;
	}

	public String getDBClusterStatus() {
		return this.dBClusterStatus;
	}

	public void setDBClusterStatus(String dBClusterStatus) {
		this.dBClusterStatus = dBClusterStatus;
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
	}

	public String getDBClusterDescription() {
		return this.dBClusterDescription;
	}

	public void setDBClusterDescription(String dBClusterDescription) {
		this.dBClusterDescription = dBClusterDescription;
	}

	public String getExpired() {
		return this.expired;
	}

	public void setExpired(String expired) {
		this.expired = expired;
	}

	public String getLockMode() {
		return this.lockMode;
	}

	public void setLockMode(String lockMode) {
		this.lockMode = lockMode;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public Long getStorageUsed() {
		return this.storageUsed;
	}

	public void setStorageUsed(Long storageUsed) {
		this.storageUsed = storageUsed;
	}

	public String getDBVersionStatus() {
		return this.dBVersionStatus;
	}

	public void setDBVersionStatus(String dBVersionStatus) {
		this.dBVersionStatus = dBVersionStatus;
	}

	public String getSubCategory() {
		return this.subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	public String getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public Long getSQLSize() {
		return this.sQLSize;
	}

	public void setSQLSize(Long sQLSize) {
		this.sQLSize = sQLSize;
	}

	public String getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public List<DBNode> getDBNodes() {
		return this.dBNodes;
	}

	public void setDBNodes(List<DBNode> dBNodes) {
		this.dBNodes = dBNodes;
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public static class DBNode {

		private String dBNodeStatus;

		private Integer maxConnections;

		private String zoneId;

		private String dBNodeRole;

		private String creationTime;

		private String dBNodeId;

		private Integer failoverPriority;

		private String dBNodeClass;

		private Integer maxIOPS;

		public String getDBNodeStatus() {
			return this.dBNodeStatus;
		}

		public void setDBNodeStatus(String dBNodeStatus) {
			this.dBNodeStatus = dBNodeStatus;
		}

		public Integer getMaxConnections() {
			return this.maxConnections;
		}

		public void setMaxConnections(Integer maxConnections) {
			this.maxConnections = maxConnections;
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

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getDBNodeId() {
			return this.dBNodeId;
		}

		public void setDBNodeId(String dBNodeId) {
			this.dBNodeId = dBNodeId;
		}

		public Integer getFailoverPriority() {
			return this.failoverPriority;
		}

		public void setFailoverPriority(Integer failoverPriority) {
			this.failoverPriority = failoverPriority;
		}

		public String getDBNodeClass() {
			return this.dBNodeClass;
		}

		public void setDBNodeClass(String dBNodeClass) {
			this.dBNodeClass = dBNodeClass;
		}

		public Integer getMaxIOPS() {
			return this.maxIOPS;
		}

		public void setMaxIOPS(Integer maxIOPS) {
			this.maxIOPS = maxIOPS;
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

	@Override
	public DescribeDBClusterAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBClusterAttributeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
