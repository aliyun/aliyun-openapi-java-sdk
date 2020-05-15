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

	private String requestId;

	private Long totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Instance> instances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<Instance> getInstances() {
		return this.instances;
	}

	public void setInstances(List<Instance> instances) {
		this.instances = instances;
	}

	public static class Instance {

		private String instanceId;

		private String instanceName;

		private String status;

		private String payType;

		private String createdTime;

		private String expireTime;

		private String majorVersion;

		private String engine;

		private Boolean isHa;

		private String networkType;

		private String vpcId;

		private String vswitchId;

		private String masterInstanceType;

		private Integer masterNodeCount;

		private String masterDiskType;

		private Integer masterDiskSize;

		private String coreInstanceType;

		private Integer coreNodeCount;

		private String coreDiskType;

		private Integer coreDiskSize;

		private String regionId;

		private String zoneId;

		private String coldStorageStatus;

		private String backupStatus;

		private String clusterType;

		private String createdTimeUTC;

		private String expireTimeUTC;

		private String clusterId;

		private String clusterName;

		private Boolean isDeletionProtection;

		private String parentId;

		private Integer moduleId;

		private String moduleStackVersion;

		private List<Tag> tags;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getMajorVersion() {
			return this.majorVersion;
		}

		public void setMajorVersion(String majorVersion) {
			this.majorVersion = majorVersion;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public Boolean getIsHa() {
			return this.isHa;
		}

		public void setIsHa(Boolean isHa) {
			this.isHa = isHa;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
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

		public String getMasterInstanceType() {
			return this.masterInstanceType;
		}

		public void setMasterInstanceType(String masterInstanceType) {
			this.masterInstanceType = masterInstanceType;
		}

		public Integer getMasterNodeCount() {
			return this.masterNodeCount;
		}

		public void setMasterNodeCount(Integer masterNodeCount) {
			this.masterNodeCount = masterNodeCount;
		}

		public String getMasterDiskType() {
			return this.masterDiskType;
		}

		public void setMasterDiskType(String masterDiskType) {
			this.masterDiskType = masterDiskType;
		}

		public Integer getMasterDiskSize() {
			return this.masterDiskSize;
		}

		public void setMasterDiskSize(Integer masterDiskSize) {
			this.masterDiskSize = masterDiskSize;
		}

		public String getCoreInstanceType() {
			return this.coreInstanceType;
		}

		public void setCoreInstanceType(String coreInstanceType) {
			this.coreInstanceType = coreInstanceType;
		}

		public Integer getCoreNodeCount() {
			return this.coreNodeCount;
		}

		public void setCoreNodeCount(Integer coreNodeCount) {
			this.coreNodeCount = coreNodeCount;
		}

		public String getCoreDiskType() {
			return this.coreDiskType;
		}

		public void setCoreDiskType(String coreDiskType) {
			this.coreDiskType = coreDiskType;
		}

		public Integer getCoreDiskSize() {
			return this.coreDiskSize;
		}

		public void setCoreDiskSize(Integer coreDiskSize) {
			this.coreDiskSize = coreDiskSize;
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

		public String getColdStorageStatus() {
			return this.coldStorageStatus;
		}

		public void setColdStorageStatus(String coldStorageStatus) {
			this.coldStorageStatus = coldStorageStatus;
		}

		public String getBackupStatus() {
			return this.backupStatus;
		}

		public void setBackupStatus(String backupStatus) {
			this.backupStatus = backupStatus;
		}

		public String getClusterType() {
			return this.clusterType;
		}

		public void setClusterType(String clusterType) {
			this.clusterType = clusterType;
		}

		public String getCreatedTimeUTC() {
			return this.createdTimeUTC;
		}

		public void setCreatedTimeUTC(String createdTimeUTC) {
			this.createdTimeUTC = createdTimeUTC;
		}

		public String getExpireTimeUTC() {
			return this.expireTimeUTC;
		}

		public void setExpireTimeUTC(String expireTimeUTC) {
			this.expireTimeUTC = expireTimeUTC;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public Boolean getIsDeletionProtection() {
			return this.isDeletionProtection;
		}

		public void setIsDeletionProtection(Boolean isDeletionProtection) {
			this.isDeletionProtection = isDeletionProtection;
		}

		public String getParentId() {
			return this.parentId;
		}

		public void setParentId(String parentId) {
			this.parentId = parentId;
		}

		public Integer getModuleId() {
			return this.moduleId;
		}

		public void setModuleId(Integer moduleId) {
			this.moduleId = moduleId;
		}

		public String getModuleStackVersion() {
			return this.moduleStackVersion;
		}

		public void setModuleStackVersion(String moduleStackVersion) {
			this.moduleStackVersion = moduleStackVersion;
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
