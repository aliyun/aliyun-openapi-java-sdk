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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.DescribeCasComputersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCasComputersResponse extends AcsResponse {

	private Long currentPage;

	private String requestId;

	private String resultMessage;

	private String resultCode;

	private Long pageSize;

	private Long totalCount;

	private List<DataItem> data;

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String creationTime;

		private String serialNumber;

		private String vpcId;

		private String privateIp;

		private String utcCreate;

		private String providerId;

		private String imageIaasId;

		private String imageId;

		private String specIaasId;

		private String deployMode;

		private String iaasId;

		private Boolean initialized;

		private Long autoRenewPeriod;

		private String paasStatus;

		private String instanceChargeType;

		private String vSwitchIaasId;

		private String workspaceId;

		private String imageName;

		private String publicIp;

		private String zoneId;

		private Boolean cpuShared;

		private String iaasType;

		private String status;

		private Long osBit;

		private String iaasStatus;

		private String networkType;

		private String password;

		private Long bandwidth;

		private String description;

		private String utcModified;

		private String appId;

		private String osVersion;

		private String lastOpsType;

		private Long memory;

		private String name;

		private Boolean commonImage;

		private Boolean autoRenew;

		private String tenantId2;

		private String os;

		private String regionId;

		private Boolean ioOptimized;

		private Long cpu;

		private String elasticIp;

		private String expiredTime;

		private Long threadsPerCore;

		private String id;

		private String lastOpsOrderId;

		private String tenantId;

		private List<DataDisksItem> dataDisks;

		private List<OptionsItem> options;

		private List<TagsItem> tags;

		private List<String> assignedAppServiceIds;

		private List<String> appServiceIds;

		private SystemDisk systemDisk;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getSerialNumber() {
			return this.serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getPrivateIp() {
			return this.privateIp;
		}

		public void setPrivateIp(String privateIp) {
			this.privateIp = privateIp;
		}

		public String getUtcCreate() {
			return this.utcCreate;
		}

		public void setUtcCreate(String utcCreate) {
			this.utcCreate = utcCreate;
		}

		public String getProviderId() {
			return this.providerId;
		}

		public void setProviderId(String providerId) {
			this.providerId = providerId;
		}

		public String getImageIaasId() {
			return this.imageIaasId;
		}

		public void setImageIaasId(String imageIaasId) {
			this.imageIaasId = imageIaasId;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getSpecIaasId() {
			return this.specIaasId;
		}

		public void setSpecIaasId(String specIaasId) {
			this.specIaasId = specIaasId;
		}

		public String getDeployMode() {
			return this.deployMode;
		}

		public void setDeployMode(String deployMode) {
			this.deployMode = deployMode;
		}

		public String getIaasId() {
			return this.iaasId;
		}

		public void setIaasId(String iaasId) {
			this.iaasId = iaasId;
		}

		public Boolean getInitialized() {
			return this.initialized;
		}

		public void setInitialized(Boolean initialized) {
			this.initialized = initialized;
		}

		public Long getAutoRenewPeriod() {
			return this.autoRenewPeriod;
		}

		public void setAutoRenewPeriod(Long autoRenewPeriod) {
			this.autoRenewPeriod = autoRenewPeriod;
		}

		public String getPaasStatus() {
			return this.paasStatus;
		}

		public void setPaasStatus(String paasStatus) {
			this.paasStatus = paasStatus;
		}

		public String getInstanceChargeType() {
			return this.instanceChargeType;
		}

		public void setInstanceChargeType(String instanceChargeType) {
			this.instanceChargeType = instanceChargeType;
		}

		public String getVSwitchIaasId() {
			return this.vSwitchIaasId;
		}

		public void setVSwitchIaasId(String vSwitchIaasId) {
			this.vSwitchIaasId = vSwitchIaasId;
		}

		public String getWorkspaceId() {
			return this.workspaceId;
		}

		public void setWorkspaceId(String workspaceId) {
			this.workspaceId = workspaceId;
		}

		public String getImageName() {
			return this.imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}

		public String getPublicIp() {
			return this.publicIp;
		}

		public void setPublicIp(String publicIp) {
			this.publicIp = publicIp;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public Boolean getCpuShared() {
			return this.cpuShared;
		}

		public void setCpuShared(Boolean cpuShared) {
			this.cpuShared = cpuShared;
		}

		public String getIaasType() {
			return this.iaasType;
		}

		public void setIaasType(String iaasType) {
			this.iaasType = iaasType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getOsBit() {
			return this.osBit;
		}

		public void setOsBit(Long osBit) {
			this.osBit = osBit;
		}

		public String getIaasStatus() {
			return this.iaasStatus;
		}

		public void setIaasStatus(String iaasStatus) {
			this.iaasStatus = iaasStatus;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Long getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Long bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getUtcModified() {
			return this.utcModified;
		}

		public void setUtcModified(String utcModified) {
			this.utcModified = utcModified;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getOsVersion() {
			return this.osVersion;
		}

		public void setOsVersion(String osVersion) {
			this.osVersion = osVersion;
		}

		public String getLastOpsType() {
			return this.lastOpsType;
		}

		public void setLastOpsType(String lastOpsType) {
			this.lastOpsType = lastOpsType;
		}

		public Long getMemory() {
			return this.memory;
		}

		public void setMemory(Long memory) {
			this.memory = memory;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getCommonImage() {
			return this.commonImage;
		}

		public void setCommonImage(Boolean commonImage) {
			this.commonImage = commonImage;
		}

		public Boolean getAutoRenew() {
			return this.autoRenew;
		}

		public void setAutoRenew(Boolean autoRenew) {
			this.autoRenew = autoRenew;
		}

		public String getTenantId2() {
			return this.tenantId2;
		}

		public void setTenantId2(String tenantId2) {
			this.tenantId2 = tenantId2;
		}

		public String getOs() {
			return this.os;
		}

		public void setOs(String os) {
			this.os = os;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Boolean getIoOptimized() {
			return this.ioOptimized;
		}

		public void setIoOptimized(Boolean ioOptimized) {
			this.ioOptimized = ioOptimized;
		}

		public Long getCpu() {
			return this.cpu;
		}

		public void setCpu(Long cpu) {
			this.cpu = cpu;
		}

		public String getElasticIp() {
			return this.elasticIp;
		}

		public void setElasticIp(String elasticIp) {
			this.elasticIp = elasticIp;
		}

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public Long getThreadsPerCore() {
			return this.threadsPerCore;
		}

		public void setThreadsPerCore(Long threadsPerCore) {
			this.threadsPerCore = threadsPerCore;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getLastOpsOrderId() {
			return this.lastOpsOrderId;
		}

		public void setLastOpsOrderId(String lastOpsOrderId) {
			this.lastOpsOrderId = lastOpsOrderId;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public List<DataDisksItem> getDataDisks() {
			return this.dataDisks;
		}

		public void setDataDisks(List<DataDisksItem> dataDisks) {
			this.dataDisks = dataDisks;
		}

		public List<OptionsItem> getOptions() {
			return this.options;
		}

		public void setOptions(List<OptionsItem> options) {
			this.options = options;
		}

		public List<TagsItem> getTags() {
			return this.tags;
		}

		public void setTags(List<TagsItem> tags) {
			this.tags = tags;
		}

		public List<String> getAssignedAppServiceIds() {
			return this.assignedAppServiceIds;
		}

		public void setAssignedAppServiceIds(List<String> assignedAppServiceIds) {
			this.assignedAppServiceIds = assignedAppServiceIds;
		}

		public List<String> getAppServiceIds() {
			return this.appServiceIds;
		}

		public void setAppServiceIds(List<String> appServiceIds) {
			this.appServiceIds = appServiceIds;
		}

		public SystemDisk getSystemDisk() {
			return this.systemDisk;
		}

		public void setSystemDisk(SystemDisk systemDisk) {
			this.systemDisk = systemDisk;
		}

		public static class DataDisksItem {

			private String type;

			private String status;

			private Boolean enableAutoSnapshot;

			private String utcCreate;

			private String iaasId;

			private String providerId;

			private Boolean deleteAutoSnapshot;

			private String regionId;

			private String workspaceId;

			private String utcModified;

			private Long size;

			private String device;

			private String zoneId;

			private Boolean portable;

			private String category;

			private String name;

			private String imageId;

			private Boolean deleteWithComputer;

			private String id;

			private String tenantId;

			private Computer computer;

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

			public Boolean getEnableAutoSnapshot() {
				return this.enableAutoSnapshot;
			}

			public void setEnableAutoSnapshot(Boolean enableAutoSnapshot) {
				this.enableAutoSnapshot = enableAutoSnapshot;
			}

			public String getUtcCreate() {
				return this.utcCreate;
			}

			public void setUtcCreate(String utcCreate) {
				this.utcCreate = utcCreate;
			}

			public String getIaasId() {
				return this.iaasId;
			}

			public void setIaasId(String iaasId) {
				this.iaasId = iaasId;
			}

			public String getProviderId() {
				return this.providerId;
			}

			public void setProviderId(String providerId) {
				this.providerId = providerId;
			}

			public Boolean getDeleteAutoSnapshot() {
				return this.deleteAutoSnapshot;
			}

			public void setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
				this.deleteAutoSnapshot = deleteAutoSnapshot;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getWorkspaceId() {
				return this.workspaceId;
			}

			public void setWorkspaceId(String workspaceId) {
				this.workspaceId = workspaceId;
			}

			public String getUtcModified() {
				return this.utcModified;
			}

			public void setUtcModified(String utcModified) {
				this.utcModified = utcModified;
			}

			public Long getSize() {
				return this.size;
			}

			public void setSize(Long size) {
				this.size = size;
			}

			public String getDevice() {
				return this.device;
			}

			public void setDevice(String device) {
				this.device = device;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public Boolean getPortable() {
				return this.portable;
			}

			public void setPortable(Boolean portable) {
				this.portable = portable;
			}

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getImageId() {
				return this.imageId;
			}

			public void setImageId(String imageId) {
				this.imageId = imageId;
			}

			public Boolean getDeleteWithComputer() {
				return this.deleteWithComputer;
			}

			public void setDeleteWithComputer(Boolean deleteWithComputer) {
				this.deleteWithComputer = deleteWithComputer;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(String tenantId) {
				this.tenantId = tenantId;
			}

			public Computer getComputer() {
				return this.computer;
			}

			public void setComputer(Computer computer) {
				this.computer = computer;
			}

			public static class Computer {

				private String status;

				private String iaasId;

				private String name;

				private String id;

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getIaasId() {
					return this.iaasId;
				}

				public void setIaasId(String iaasId) {
					this.iaasId = iaasId;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}
			}
		}

		public static class OptionsItem {

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

		public static class TagsItem {

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

		public static class SystemDisk {

			private String type;

			private String status;

			private Boolean enableAutoSnapshot;

			private String utcCreate;

			private String iaasId;

			private String providerId;

			private Boolean deleteAutoSnapshot;

			private String regionId;

			private String workspaceId;

			private String utcModified;

			private Long size;

			private String device;

			private String zoneId;

			private Boolean portable;

			private String category;

			private String name;

			private String imageId;

			private Boolean deleteWithComputer;

			private String id;

			private String tenantId;

			private Computer1 computer1;

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

			public Boolean getEnableAutoSnapshot() {
				return this.enableAutoSnapshot;
			}

			public void setEnableAutoSnapshot(Boolean enableAutoSnapshot) {
				this.enableAutoSnapshot = enableAutoSnapshot;
			}

			public String getUtcCreate() {
				return this.utcCreate;
			}

			public void setUtcCreate(String utcCreate) {
				this.utcCreate = utcCreate;
			}

			public String getIaasId() {
				return this.iaasId;
			}

			public void setIaasId(String iaasId) {
				this.iaasId = iaasId;
			}

			public String getProviderId() {
				return this.providerId;
			}

			public void setProviderId(String providerId) {
				this.providerId = providerId;
			}

			public Boolean getDeleteAutoSnapshot() {
				return this.deleteAutoSnapshot;
			}

			public void setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
				this.deleteAutoSnapshot = deleteAutoSnapshot;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getWorkspaceId() {
				return this.workspaceId;
			}

			public void setWorkspaceId(String workspaceId) {
				this.workspaceId = workspaceId;
			}

			public String getUtcModified() {
				return this.utcModified;
			}

			public void setUtcModified(String utcModified) {
				this.utcModified = utcModified;
			}

			public Long getSize() {
				return this.size;
			}

			public void setSize(Long size) {
				this.size = size;
			}

			public String getDevice() {
				return this.device;
			}

			public void setDevice(String device) {
				this.device = device;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public Boolean getPortable() {
				return this.portable;
			}

			public void setPortable(Boolean portable) {
				this.portable = portable;
			}

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getImageId() {
				return this.imageId;
			}

			public void setImageId(String imageId) {
				this.imageId = imageId;
			}

			public Boolean getDeleteWithComputer() {
				return this.deleteWithComputer;
			}

			public void setDeleteWithComputer(Boolean deleteWithComputer) {
				this.deleteWithComputer = deleteWithComputer;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(String tenantId) {
				this.tenantId = tenantId;
			}

			public Computer1 getComputer1() {
				return this.computer1;
			}

			public void setComputer1(Computer1 computer1) {
				this.computer1 = computer1;
			}

			public static class Computer1 {

				private String status;

				private String iaasId;

				private String name;

				private String id;

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getIaasId() {
					return this.iaasId;
				}

				public void setIaasId(String iaasId) {
					this.iaasId = iaasId;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}
			}
		}
	}

	@Override
	public DescribeCasComputersResponse getInstance(UnmarshallerContext context) {
		return	DescribeCasComputersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
