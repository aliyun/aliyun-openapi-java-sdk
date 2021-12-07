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

package com.aliyuncs.hbase.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbase.transform.v20190101.DescribeInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstancesResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Long totalCount;

	private List<Instance> instances;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
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

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<Instance> getInstances() {
		return this.instances;
	}

	public void setInstances(List<Instance> instances) {
		this.instances = instances;
	}

	public static class Instance {

		private String vpcId;

		private String status;

		private Integer moduleId;

		private String vswitchId;

		private String backupStatus;

		private String payType;

		private String coreDiskType;

		private Integer masterNodeCount;

		private String networkType;

		private String createdTimeUTC;

		private String parentId;

		private String expireTimeUTC;

		private String instanceName;

		private String masterInstanceType;

		private String coreInstanceType;

		private String createdTime;

		private Integer coreDiskSize;

		private String clusterId;

		private String expireTime;

		private Boolean isHa;

		private String instanceId;

		private String coldStorageStatus;

		private Boolean isDeletionProtection;

		private String regionId;

		private Integer masterDiskSize;

		private String masterDiskType;

		private Boolean autoRenewal;

		private String clusterType;

		private String resourceGroupId;

		private String clusterName;

		private String zoneId;

		private Integer duration;

		private String moduleStackVersion;

		private String engine;

		private String majorVersion;

		private String coreDiskCount;

		private Integer coreNodeCount;

		private List<Tag> tags;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getModuleId() {
			return this.moduleId;
		}

		public void setModuleId(Integer moduleId) {
			this.moduleId = moduleId;
		}

		public String getVswitchId() {
			return this.vswitchId;
		}

		public void setVswitchId(String vswitchId) {
			this.vswitchId = vswitchId;
		}

		public String getBackupStatus() {
			return this.backupStatus;
		}

		public void setBackupStatus(String backupStatus) {
			this.backupStatus = backupStatus;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getCoreDiskType() {
			return this.coreDiskType;
		}

		public void setCoreDiskType(String coreDiskType) {
			this.coreDiskType = coreDiskType;
		}

		public Integer getMasterNodeCount() {
			return this.masterNodeCount;
		}

		public void setMasterNodeCount(Integer masterNodeCount) {
			this.masterNodeCount = masterNodeCount;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public String getCreatedTimeUTC() {
			return this.createdTimeUTC;
		}

		public void setCreatedTimeUTC(String createdTimeUTC) {
			this.createdTimeUTC = createdTimeUTC;
		}

		public String getParentId() {
			return this.parentId;
		}

		public void setParentId(String parentId) {
			this.parentId = parentId;
		}

		public String getExpireTimeUTC() {
			return this.expireTimeUTC;
		}

		public void setExpireTimeUTC(String expireTimeUTC) {
			this.expireTimeUTC = expireTimeUTC;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getMasterInstanceType() {
			return this.masterInstanceType;
		}

		public void setMasterInstanceType(String masterInstanceType) {
			this.masterInstanceType = masterInstanceType;
		}

		public String getCoreInstanceType() {
			return this.coreInstanceType;
		}

		public void setCoreInstanceType(String coreInstanceType) {
			this.coreInstanceType = coreInstanceType;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public Integer getCoreDiskSize() {
			return this.coreDiskSize;
		}

		public void setCoreDiskSize(Integer coreDiskSize) {
			this.coreDiskSize = coreDiskSize;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public Boolean getIsHa() {
			return this.isHa;
		}

		public void setIsHa(Boolean isHa) {
			this.isHa = isHa;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getColdStorageStatus() {
			return this.coldStorageStatus;
		}

		public void setColdStorageStatus(String coldStorageStatus) {
			this.coldStorageStatus = coldStorageStatus;
		}

		public Boolean getIsDeletionProtection() {
			return this.isDeletionProtection;
		}

		public void setIsDeletionProtection(Boolean isDeletionProtection) {
			this.isDeletionProtection = isDeletionProtection;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Integer getMasterDiskSize() {
			return this.masterDiskSize;
		}

		public void setMasterDiskSize(Integer masterDiskSize) {
			this.masterDiskSize = masterDiskSize;
		}

		public String getMasterDiskType() {
			return this.masterDiskType;
		}

		public void setMasterDiskType(String masterDiskType) {
			this.masterDiskType = masterDiskType;
		}

		public Boolean getAutoRenewal() {
			return this.autoRenewal;
		}

		public void setAutoRenewal(Boolean autoRenewal) {
			this.autoRenewal = autoRenewal;
		}

		public String getClusterType() {
			return this.clusterType;
		}

		public void setClusterType(String clusterType) {
			this.clusterType = clusterType;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public Integer getDuration() {
			return this.duration;
		}

		public void setDuration(Integer duration) {
			this.duration = duration;
		}

		public String getModuleStackVersion() {
			return this.moduleStackVersion;
		}

		public void setModuleStackVersion(String moduleStackVersion) {
			this.moduleStackVersion = moduleStackVersion;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getMajorVersion() {
			return this.majorVersion;
		}

		public void setMajorVersion(String majorVersion) {
			this.majorVersion = majorVersion;
		}

		public String getCoreDiskCount() {
			return this.coreDiskCount;
		}

		public void setCoreDiskCount(String coreDiskCount) {
			this.coreDiskCount = coreDiskCount;
		}

		public Integer getCoreNodeCount() {
			return this.coreNodeCount;
		}

		public void setCoreNodeCount(Integer coreNodeCount) {
			this.coreNodeCount = coreNodeCount;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
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
	}

	@Override
	public DescribeInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
