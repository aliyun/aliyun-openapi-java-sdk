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

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long totalCount;

	private Long pageSize;

	private Long currentPage;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String appId;

		private Boolean autoRenew;

		private Long autoRenewPeriod;

		private Long bandwidth;

		private Boolean commonImage;

		private Long cpu;

		private Boolean cpuShared;

		private String creationTime;

		private String deployMode;

		private String description;

		private String elasticIp;

		private String expiredTime;

		private String iaasId;

		private String iaasStatus;

		private String iaasType;

		private String id;

		private String imageIaasId;

		private String imageId;

		private String imageName;

		private Boolean initialized;

		private String instanceChargeType;

		private Boolean ioOptimized;

		private String lastOpsOrderId;

		private String lastOpsType;

		private Long memory;

		private String name;

		private String networkType;

		private String os;

		private Long osBit;

		private String osVersion;

		private String paasStatus;

		private String password;

		private String privateIp;

		private String providerId;

		private String publicIp;

		private String regionId;

		private String serialNumber;

		private String specIaasId;

		private String status;

		private String tenantId;

		private String tenantId2;

		private Long threadsPerCore;

		private String utcCreate;

		private String utcModified;

		private String vpcId;

		private String vSwitchIaasId;

		private String workspaceId;

		private String zoneId;

		private List<DataDisksItem> dataDisks;

		private List<OptionsItem> options;

		private List<TagsItem> tags;

		private List<String> appServiceIds;

		private List<String> assignedAppServiceIds;

		private SystemDisk systemDisk;

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public Boolean getAutoRenew() {
			return this.autoRenew;
		}

		public void setAutoRenew(Boolean autoRenew) {
			this.autoRenew = autoRenew;
		}

		public Long getAutoRenewPeriod() {
			return this.autoRenewPeriod;
		}

		public void setAutoRenewPeriod(Long autoRenewPeriod) {
			this.autoRenewPeriod = autoRenewPeriod;
		}

		public Long getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Long bandwidth) {
			this.bandwidth = bandwidth;
		}

		public Boolean getCommonImage() {
			return this.commonImage;
		}

		public void setCommonImage(Boolean commonImage) {
			this.commonImage = commonImage;
		}

		public Long getCpu() {
			return this.cpu;
		}

		public void setCpu(Long cpu) {
			this.cpu = cpu;
		}

		public Boolean getCpuShared() {
			return this.cpuShared;
		}

		public void setCpuShared(Boolean cpuShared) {
			this.cpuShared = cpuShared;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getDeployMode() {
			return this.deployMode;
		}

		public void setDeployMode(String deployMode) {
			this.deployMode = deployMode;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
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

		public String getIaasId() {
			return this.iaasId;
		}

		public void setIaasId(String iaasId) {
			this.iaasId = iaasId;
		}

		public String getIaasStatus() {
			return this.iaasStatus;
		}

		public void setIaasStatus(String iaasStatus) {
			this.iaasStatus = iaasStatus;
		}

		public String getIaasType() {
			return this.iaasType;
		}

		public void setIaasType(String iaasType) {
			this.iaasType = iaasType;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
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

		public String getImageName() {
			return this.imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}

		public Boolean getInitialized() {
			return this.initialized;
		}

		public void setInitialized(Boolean initialized) {
			this.initialized = initialized;
		}

		public String getInstanceChargeType() {
			return this.instanceChargeType;
		}

		public void setInstanceChargeType(String instanceChargeType) {
			this.instanceChargeType = instanceChargeType;
		}

		public Boolean getIoOptimized() {
			return this.ioOptimized;
		}

		public void setIoOptimized(Boolean ioOptimized) {
			this.ioOptimized = ioOptimized;
		}

		public String getLastOpsOrderId() {
			return this.lastOpsOrderId;
		}

		public void setLastOpsOrderId(String lastOpsOrderId) {
			this.lastOpsOrderId = lastOpsOrderId;
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

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public String getOs() {
			return this.os;
		}

		public void setOs(String os) {
			this.os = os;
		}

		public Long getOsBit() {
			return this.osBit;
		}

		public void setOsBit(Long osBit) {
			this.osBit = osBit;
		}

		public String getOsVersion() {
			return this.osVersion;
		}

		public void setOsVersion(String osVersion) {
			this.osVersion = osVersion;
		}

		public String getPaasStatus() {
			return this.paasStatus;
		}

		public void setPaasStatus(String paasStatus) {
			this.paasStatus = paasStatus;
		}

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getPrivateIp() {
			return this.privateIp;
		}

		public void setPrivateIp(String privateIp) {
			this.privateIp = privateIp;
		}

		public String getProviderId() {
			return this.providerId;
		}

		public void setProviderId(String providerId) {
			this.providerId = providerId;
		}

		public String getPublicIp() {
			return this.publicIp;
		}

		public void setPublicIp(String publicIp) {
			this.publicIp = publicIp;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getSerialNumber() {
			return this.serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}

		public String getSpecIaasId() {
			return this.specIaasId;
		}

		public void setSpecIaasId(String specIaasId) {
			this.specIaasId = specIaasId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getTenantId2() {
			return this.tenantId2;
		}

		public void setTenantId2(String tenantId2) {
			this.tenantId2 = tenantId2;
		}

		public Long getThreadsPerCore() {
			return this.threadsPerCore;
		}

		public void setThreadsPerCore(Long threadsPerCore) {
			this.threadsPerCore = threadsPerCore;
		}

		public String getUtcCreate() {
			return this.utcCreate;
		}

		public void setUtcCreate(String utcCreate) {
			this.utcCreate = utcCreate;
		}

		public String getUtcModified() {
			return this.utcModified;
		}

		public void setUtcModified(String utcModified) {
			this.utcModified = utcModified;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
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

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
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

		public List<String> getAppServiceIds() {
			return this.appServiceIds;
		}

		public void setAppServiceIds(List<String> appServiceIds) {
			this.appServiceIds = appServiceIds;
		}

		public List<String> getAssignedAppServiceIds() {
			return this.assignedAppServiceIds;
		}

		public void setAssignedAppServiceIds(List<String> assignedAppServiceIds) {
			this.assignedAppServiceIds = assignedAppServiceIds;
		}

		public SystemDisk getSystemDisk() {
			return this.systemDisk;
		}

		public void setSystemDisk(SystemDisk systemDisk) {
			this.systemDisk = systemDisk;
		}

		public static class DataDisksItem {

			private String category;

			private Boolean deleteAutoSnapshot;

			private Boolean deleteWithComputer;

			private String device;

			private Boolean enableAutoSnapshot;

			private String iaasId;

			private String id;

			private String imageId;

			private String name;

			private Boolean portable;

			private String providerId;

			private String regionId;

			private Long size;

			private String status;

			private String tenantId;

			private String type;

			private String utcCreate;

			private String utcModified;

			private String workspaceId;

			private String zoneId;

			private Computer computer;

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public Boolean getDeleteAutoSnapshot() {
				return this.deleteAutoSnapshot;
			}

			public void setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
				this.deleteAutoSnapshot = deleteAutoSnapshot;
			}

			public Boolean getDeleteWithComputer() {
				return this.deleteWithComputer;
			}

			public void setDeleteWithComputer(Boolean deleteWithComputer) {
				this.deleteWithComputer = deleteWithComputer;
			}

			public String getDevice() {
				return this.device;
			}

			public void setDevice(String device) {
				this.device = device;
			}

			public Boolean getEnableAutoSnapshot() {
				return this.enableAutoSnapshot;
			}

			public void setEnableAutoSnapshot(Boolean enableAutoSnapshot) {
				this.enableAutoSnapshot = enableAutoSnapshot;
			}

			public String getIaasId() {
				return this.iaasId;
			}

			public void setIaasId(String iaasId) {
				this.iaasId = iaasId;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getImageId() {
				return this.imageId;
			}

			public void setImageId(String imageId) {
				this.imageId = imageId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Boolean getPortable() {
				return this.portable;
			}

			public void setPortable(Boolean portable) {
				this.portable = portable;
			}

			public String getProviderId() {
				return this.providerId;
			}

			public void setProviderId(String providerId) {
				this.providerId = providerId;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public Long getSize() {
				return this.size;
			}

			public void setSize(Long size) {
				this.size = size;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(String tenantId) {
				this.tenantId = tenantId;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getUtcCreate() {
				return this.utcCreate;
			}

			public void setUtcCreate(String utcCreate) {
				this.utcCreate = utcCreate;
			}

			public String getUtcModified() {
				return this.utcModified;
			}

			public void setUtcModified(String utcModified) {
				this.utcModified = utcModified;
			}

			public String getWorkspaceId() {
				return this.workspaceId;
			}

			public void setWorkspaceId(String workspaceId) {
				this.workspaceId = workspaceId;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public Computer getComputer() {
				return this.computer;
			}

			public void setComputer(Computer computer) {
				this.computer = computer;
			}

			public static class Computer {

				private String name;

				private String id;

				private String iaasId;

				private String status;

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

				public String getIaasId() {
					return this.iaasId;
				}

				public void setIaasId(String iaasId) {
					this.iaasId = iaasId;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
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

			private String category;

			private Boolean deleteAutoSnapshot;

			private Boolean deleteWithComputer;

			private String device;

			private Boolean enableAutoSnapshot;

			private String iaasId;

			private String id;

			private String imageId;

			private String name;

			private Boolean portable;

			private String providerId;

			private String regionId;

			private Long size;

			private String status;

			private String tenantId;

			private String type;

			private String utcCreate;

			private String utcModified;

			private String workspaceId;

			private String zoneId;

			private Computer1 computer1;

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public Boolean getDeleteAutoSnapshot() {
				return this.deleteAutoSnapshot;
			}

			public void setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
				this.deleteAutoSnapshot = deleteAutoSnapshot;
			}

			public Boolean getDeleteWithComputer() {
				return this.deleteWithComputer;
			}

			public void setDeleteWithComputer(Boolean deleteWithComputer) {
				this.deleteWithComputer = deleteWithComputer;
			}

			public String getDevice() {
				return this.device;
			}

			public void setDevice(String device) {
				this.device = device;
			}

			public Boolean getEnableAutoSnapshot() {
				return this.enableAutoSnapshot;
			}

			public void setEnableAutoSnapshot(Boolean enableAutoSnapshot) {
				this.enableAutoSnapshot = enableAutoSnapshot;
			}

			public String getIaasId() {
				return this.iaasId;
			}

			public void setIaasId(String iaasId) {
				this.iaasId = iaasId;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getImageId() {
				return this.imageId;
			}

			public void setImageId(String imageId) {
				this.imageId = imageId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Boolean getPortable() {
				return this.portable;
			}

			public void setPortable(Boolean portable) {
				this.portable = portable;
			}

			public String getProviderId() {
				return this.providerId;
			}

			public void setProviderId(String providerId) {
				this.providerId = providerId;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public Long getSize() {
				return this.size;
			}

			public void setSize(Long size) {
				this.size = size;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(String tenantId) {
				this.tenantId = tenantId;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getUtcCreate() {
				return this.utcCreate;
			}

			public void setUtcCreate(String utcCreate) {
				this.utcCreate = utcCreate;
			}

			public String getUtcModified() {
				return this.utcModified;
			}

			public void setUtcModified(String utcModified) {
				this.utcModified = utcModified;
			}

			public String getWorkspaceId() {
				return this.workspaceId;
			}

			public void setWorkspaceId(String workspaceId) {
				this.workspaceId = workspaceId;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public Computer1 getComputer1() {
				return this.computer1;
			}

			public void setComputer1(Computer1 computer1) {
				this.computer1 = computer1;
			}

			public static class Computer1 {

				private String name;

				private String id;

				private String iaasId;

				private String status;

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

				public String getIaasId() {
					return this.iaasId;
				}

				public void setIaasId(String iaasId) {
					this.iaasId = iaasId;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
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
