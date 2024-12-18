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

package com.aliyuncs.selectdb.model.v20230522;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.selectdb.transform.v20230522.DescribeDBInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstancesResponse extends AcsResponse {

	private String requestId;

	private Long pageNumber;

	private Long pageSize;

	private Long totalRecordCount;

	private List<DBInstance> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Long totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public List<DBInstance> getItems() {
		return this.items;
	}

	public void setItems(List<DBInstance> items) {
		this.items = items;
	}

	public static class DBInstance {

		private String connectionString;

		private String dBInstanceId;

		private String description;

		private String engine;

		private String engineVersion;

		private String instanceUsedType;

		private String regionId;

		private String zoneId;

		private String chargeType;

		private String category;

		private String status;

		private String vpcId;

		private String vswitchId;

		private Long resourceCpu;

		private Long resourceMemory;

		private Long scaleMin;

		private Long scaleMax;

		private Long scaleReplica;

		private Long storageSize;

		private String storageType;

		private Long objectStoreSize;

		private String expireTime;

		private Long lockMode;

		private String lockReason;

		private Boolean isDeleted;

		private String maintainStarttime;

		private String maintainEndtime;

		private String gmtCreated;

		private String gmtModified;

		private String parentInstance;

		private String resourceGroupId;

		private String maintainStartTimeStr;

		private String maintainEndTimeStr;

		private String tenantClusterId;

		private String tenantToken;

		private String tenantUserId;

		private Integer clusterCount;

		private List<TagsItem> tags;

		public String getConnectionString() {
			return this.connectionString;
		}

		public void setConnectionString(String connectionString) {
			this.connectionString = connectionString;
		}

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
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

		public String getInstanceUsedType() {
			return this.instanceUsedType;
		}

		public void setInstanceUsedType(String instanceUsedType) {
			this.instanceUsedType = instanceUsedType;
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

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

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

		public Long getResourceCpu() {
			return this.resourceCpu;
		}

		public void setResourceCpu(Long resourceCpu) {
			this.resourceCpu = resourceCpu;
		}

		public Long getResourceMemory() {
			return this.resourceMemory;
		}

		public void setResourceMemory(Long resourceMemory) {
			this.resourceMemory = resourceMemory;
		}

		public Long getScaleMin() {
			return this.scaleMin;
		}

		public void setScaleMin(Long scaleMin) {
			this.scaleMin = scaleMin;
		}

		public Long getScaleMax() {
			return this.scaleMax;
		}

		public void setScaleMax(Long scaleMax) {
			this.scaleMax = scaleMax;
		}

		public Long getScaleReplica() {
			return this.scaleReplica;
		}

		public void setScaleReplica(Long scaleReplica) {
			this.scaleReplica = scaleReplica;
		}

		public Long getStorageSize() {
			return this.storageSize;
		}

		public void setStorageSize(Long storageSize) {
			this.storageSize = storageSize;
		}

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}

		public Long getObjectStoreSize() {
			return this.objectStoreSize;
		}

		public void setObjectStoreSize(Long objectStoreSize) {
			this.objectStoreSize = objectStoreSize;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public Long getLockMode() {
			return this.lockMode;
		}

		public void setLockMode(Long lockMode) {
			this.lockMode = lockMode;
		}

		public String getLockReason() {
			return this.lockReason;
		}

		public void setLockReason(String lockReason) {
			this.lockReason = lockReason;
		}

		public Boolean getIsDeleted() {
			return this.isDeleted;
		}

		public void setIsDeleted(Boolean isDeleted) {
			this.isDeleted = isDeleted;
		}

		public String getMaintainStarttime() {
			return this.maintainStarttime;
		}

		public void setMaintainStarttime(String maintainStarttime) {
			this.maintainStarttime = maintainStarttime;
		}

		public String getMaintainEndtime() {
			return this.maintainEndtime;
		}

		public void setMaintainEndtime(String maintainEndtime) {
			this.maintainEndtime = maintainEndtime;
		}

		public String getGmtCreated() {
			return this.gmtCreated;
		}

		public void setGmtCreated(String gmtCreated) {
			this.gmtCreated = gmtCreated;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getParentInstance() {
			return this.parentInstance;
		}

		public void setParentInstance(String parentInstance) {
			this.parentInstance = parentInstance;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getMaintainStartTimeStr() {
			return this.maintainStartTimeStr;
		}

		public void setMaintainStartTimeStr(String maintainStartTimeStr) {
			this.maintainStartTimeStr = maintainStartTimeStr;
		}

		public String getMaintainEndTimeStr() {
			return this.maintainEndTimeStr;
		}

		public void setMaintainEndTimeStr(String maintainEndTimeStr) {
			this.maintainEndTimeStr = maintainEndTimeStr;
		}

		public String getTenantClusterId() {
			return this.tenantClusterId;
		}

		public void setTenantClusterId(String tenantClusterId) {
			this.tenantClusterId = tenantClusterId;
		}

		public String getTenantToken() {
			return this.tenantToken;
		}

		public void setTenantToken(String tenantToken) {
			this.tenantToken = tenantToken;
		}

		public String getTenantUserId() {
			return this.tenantUserId;
		}

		public void setTenantUserId(String tenantUserId) {
			this.tenantUserId = tenantUserId;
		}

		public Integer getClusterCount() {
			return this.clusterCount;
		}

		public void setClusterCount(Integer clusterCount) {
			this.clusterCount = clusterCount;
		}

		public List<TagsItem> getTags() {
			return this.tags;
		}

		public void setTags(List<TagsItem> tags) {
			this.tags = tags;
		}

		public static class TagsItem {

			private String tagKey;

			private String tagValue;

			public String getTagKey() {
				return this.tagKey;
			}

			public void setTagKey(String tagKey) {
				this.tagKey = tagKey;
			}

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}
		}
	}

	@Override
	public DescribeDBInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
