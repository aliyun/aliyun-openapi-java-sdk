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
import com.aliyuncs.selectdb.transform.v20230522.DescribeDBInstanceAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceAttributeResponse extends AcsResponse {

	private String requestId;

	private String status;

	private String subDomain;

	private String gmtModified;

	private Long lockMode;

	private String lockReason;

	private Long resourceCpu;

	private Long storageSize;

	private Long objectStoreSize;

	private String maintainStarttime;

	private String maintainEndtime;

	private String engine;

	private String engineVersion;

	private String engineMinorVersion;

	private String dBInstanceId;

	private String description;

	private String createTime;

	private String chargeType;

	private String expireTime;

	private String resourceGroupId;

	private String regionId;

	private String zoneId;

	private String vpcId;

	private List<DbClusterListItem> dBClusterList;

	private List<TagsItem> tags;

	private List<String> canUpgradeVersions;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubDomain() {
		return this.subDomain;
	}

	public void setSubDomain(String subDomain) {
		this.subDomain = subDomain;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
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

	public Long getResourceCpu() {
		return this.resourceCpu;
	}

	public void setResourceCpu(Long resourceCpu) {
		this.resourceCpu = resourceCpu;
	}

	public Long getStorageSize() {
		return this.storageSize;
	}

	public void setStorageSize(Long storageSize) {
		this.storageSize = storageSize;
	}

	public Long getObjectStoreSize() {
		return this.objectStoreSize;
	}

	public void setObjectStoreSize(Long objectStoreSize) {
		this.objectStoreSize = objectStoreSize;
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

	public String getEngineMinorVersion() {
		return this.engineMinorVersion;
	}

	public void setEngineMinorVersion(String engineMinorVersion) {
		this.engineMinorVersion = engineMinorVersion;
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

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public String getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
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

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
	}

	public List<DbClusterListItem> getDBClusterList() {
		return this.dBClusterList;
	}

	public void setDBClusterList(List<DbClusterListItem> dBClusterList) {
		this.dBClusterList = dBClusterList;
	}

	public List<TagsItem> getTags() {
		return this.tags;
	}

	public void setTags(List<TagsItem> tags) {
		this.tags = tags;
	}

	public List<String> getCanUpgradeVersions() {
		return this.canUpgradeVersions;
	}

	public void setCanUpgradeVersions(List<String> canUpgradeVersions) {
		this.canUpgradeVersions = canUpgradeVersions;
	}

	public static class DbClusterListItem {

		private String dbInstanceName;

		private String dbClusterId;

		private String dbClusterName;

		private String status;

		private String createdTime;

		private String dbClusterClass;

		private Long cpuCores;

		private Long memory;

		private String cacheStorageType;

		private String performanceLevel;

		private String cacheStorageSizeGB;

		private String startTime;

		private String chargeType;

		private String modifiedTime;

		private Boolean scalingRulesEnable;

		public String getDbInstanceName() {
			return this.dbInstanceName;
		}

		public void setDbInstanceName(String dbInstanceName) {
			this.dbInstanceName = dbInstanceName;
		}

		public String getDbClusterId() {
			return this.dbClusterId;
		}

		public void setDbClusterId(String dbClusterId) {
			this.dbClusterId = dbClusterId;
		}

		public String getDbClusterName() {
			return this.dbClusterName;
		}

		public void setDbClusterName(String dbClusterName) {
			this.dbClusterName = dbClusterName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getDbClusterClass() {
			return this.dbClusterClass;
		}

		public void setDbClusterClass(String dbClusterClass) {
			this.dbClusterClass = dbClusterClass;
		}

		public Long getCpuCores() {
			return this.cpuCores;
		}

		public void setCpuCores(Long cpuCores) {
			this.cpuCores = cpuCores;
		}

		public Long getMemory() {
			return this.memory;
		}

		public void setMemory(Long memory) {
			this.memory = memory;
		}

		public String getCacheStorageType() {
			return this.cacheStorageType;
		}

		public void setCacheStorageType(String cacheStorageType) {
			this.cacheStorageType = cacheStorageType;
		}

		public String getPerformanceLevel() {
			return this.performanceLevel;
		}

		public void setPerformanceLevel(String performanceLevel) {
			this.performanceLevel = performanceLevel;
		}

		public String getCacheStorageSizeGB() {
			return this.cacheStorageSizeGB;
		}

		public void setCacheStorageSizeGB(String cacheStorageSizeGB) {
			this.cacheStorageSizeGB = cacheStorageSizeGB;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public Boolean getScalingRulesEnable() {
			return this.scalingRulesEnable;
		}

		public void setScalingRulesEnable(Boolean scalingRulesEnable) {
			this.scalingRulesEnable = scalingRulesEnable;
		}
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

	@Override
	public DescribeDBInstanceAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceAttributeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
