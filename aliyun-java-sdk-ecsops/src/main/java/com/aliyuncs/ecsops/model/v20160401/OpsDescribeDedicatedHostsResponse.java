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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeDedicatedHostsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeDedicatedHostsResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private List<DedicatedHost> dedicatedHosts;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

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

	public List<DedicatedHost> getDedicatedHosts() {
		return this.dedicatedHosts;
	}

	public void setDedicatedHosts(List<DedicatedHost> dedicatedHosts) {
		this.dedicatedHosts = dedicatedHosts;
	}

	public static class DedicatedHost {

		private String creationTime;

		private String status;

		private String autoPlacement;

		private String chargeType;

		private String actionOnMaintenance;

		private Integer physicalGpus;

		private String saleCycle;

		private String description;

		private String dedicatedHostType;

		private String dedicatedHostId;

		private Integer sockets;

		private Integer cores;

		private String gPUSpec;

		private String autoReleaseTime;

		private String regionId;

		private String dedicatedHostName;

		private String expiredTime;

		private String dedicatedHostClusterId;

		private String resourceGroupId;

		private String zoneId;

		private String machineId;

		private List<OperationLock> operationLocks;

		private List<Tag> tags;

		private List<Instance> instances;

		private List<String> supportedInstanceTypesList;

		private List<String> supportedCustomInstanceTypeFamilies;

		private List<String> supportedInstanceTypeFamilies;

		private Capacity capacity;

		private NetworkAttributes networkAttributes;

		private RenewAttribute renewAttribute;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getAutoPlacement() {
			return this.autoPlacement;
		}

		public void setAutoPlacement(String autoPlacement) {
			this.autoPlacement = autoPlacement;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getActionOnMaintenance() {
			return this.actionOnMaintenance;
		}

		public void setActionOnMaintenance(String actionOnMaintenance) {
			this.actionOnMaintenance = actionOnMaintenance;
		}

		public Integer getPhysicalGpus() {
			return this.physicalGpus;
		}

		public void setPhysicalGpus(Integer physicalGpus) {
			this.physicalGpus = physicalGpus;
		}

		public String getSaleCycle() {
			return this.saleCycle;
		}

		public void setSaleCycle(String saleCycle) {
			this.saleCycle = saleCycle;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDedicatedHostType() {
			return this.dedicatedHostType;
		}

		public void setDedicatedHostType(String dedicatedHostType) {
			this.dedicatedHostType = dedicatedHostType;
		}

		public String getDedicatedHostId() {
			return this.dedicatedHostId;
		}

		public void setDedicatedHostId(String dedicatedHostId) {
			this.dedicatedHostId = dedicatedHostId;
		}

		public Integer getSockets() {
			return this.sockets;
		}

		public void setSockets(Integer sockets) {
			this.sockets = sockets;
		}

		public Integer getCores() {
			return this.cores;
		}

		public void setCores(Integer cores) {
			this.cores = cores;
		}

		public String getGPUSpec() {
			return this.gPUSpec;
		}

		public void setGPUSpec(String gPUSpec) {
			this.gPUSpec = gPUSpec;
		}

		public String getAutoReleaseTime() {
			return this.autoReleaseTime;
		}

		public void setAutoReleaseTime(String autoReleaseTime) {
			this.autoReleaseTime = autoReleaseTime;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getDedicatedHostName() {
			return this.dedicatedHostName;
		}

		public void setDedicatedHostName(String dedicatedHostName) {
			this.dedicatedHostName = dedicatedHostName;
		}

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getDedicatedHostClusterId() {
			return this.dedicatedHostClusterId;
		}

		public void setDedicatedHostClusterId(String dedicatedHostClusterId) {
			this.dedicatedHostClusterId = dedicatedHostClusterId;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getMachineId() {
			return this.machineId;
		}

		public void setMachineId(String machineId) {
			this.machineId = machineId;
		}

		public List<OperationLock> getOperationLocks() {
			return this.operationLocks;
		}

		public void setOperationLocks(List<OperationLock> operationLocks) {
			this.operationLocks = operationLocks;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<Instance> getInstances() {
			return this.instances;
		}

		public void setInstances(List<Instance> instances) {
			this.instances = instances;
		}

		public List<String> getSupportedInstanceTypesList() {
			return this.supportedInstanceTypesList;
		}

		public void setSupportedInstanceTypesList(List<String> supportedInstanceTypesList) {
			this.supportedInstanceTypesList = supportedInstanceTypesList;
		}

		public List<String> getSupportedCustomInstanceTypeFamilies() {
			return this.supportedCustomInstanceTypeFamilies;
		}

		public void setSupportedCustomInstanceTypeFamilies(List<String> supportedCustomInstanceTypeFamilies) {
			this.supportedCustomInstanceTypeFamilies = supportedCustomInstanceTypeFamilies;
		}

		public List<String> getSupportedInstanceTypeFamilies() {
			return this.supportedInstanceTypeFamilies;
		}

		public void setSupportedInstanceTypeFamilies(List<String> supportedInstanceTypeFamilies) {
			this.supportedInstanceTypeFamilies = supportedInstanceTypeFamilies;
		}

		public Capacity getCapacity() {
			return this.capacity;
		}

		public void setCapacity(Capacity capacity) {
			this.capacity = capacity;
		}

		public NetworkAttributes getNetworkAttributes() {
			return this.networkAttributes;
		}

		public void setNetworkAttributes(NetworkAttributes networkAttributes) {
			this.networkAttributes = networkAttributes;
		}

		public RenewAttribute getRenewAttribute() {
			return this.renewAttribute;
		}

		public void setRenewAttribute(RenewAttribute renewAttribute) {
			this.renewAttribute = renewAttribute;
		}

		public static class OperationLock {

			private String lockReason;

			public String getLockReason() {
				return this.lockReason;
			}

			public void setLockReason(String lockReason) {
				this.lockReason = lockReason;
			}
		}

		public static class Tag {

			private String tagValue;

			private String tagKey;

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}

			public String getTagKey() {
				return this.tagKey;
			}

			public void setTagKey(String tagKey) {
				this.tagKey = tagKey;
			}
		}

		public static class Instance {

			private String instanceId;

			private String instanceType;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}
		}

		public static class Capacity {

			private Float availableMemory;

			private String localStorageCategory;

			private Float totalMemory;

			private Integer totalLocalStorage;

			private Integer totalVcpus;

			private Integer totalVgpus;

			private Integer availableLocalStorage;

			private Integer availableVcpus;

			private Integer availableVgpus;

			private List<InstanceTypeInventory> instanceTypesInventory;

			public Float getAvailableMemory() {
				return this.availableMemory;
			}

			public void setAvailableMemory(Float availableMemory) {
				this.availableMemory = availableMemory;
			}

			public String getLocalStorageCategory() {
				return this.localStorageCategory;
			}

			public void setLocalStorageCategory(String localStorageCategory) {
				this.localStorageCategory = localStorageCategory;
			}

			public Float getTotalMemory() {
				return this.totalMemory;
			}

			public void setTotalMemory(Float totalMemory) {
				this.totalMemory = totalMemory;
			}

			public Integer getTotalLocalStorage() {
				return this.totalLocalStorage;
			}

			public void setTotalLocalStorage(Integer totalLocalStorage) {
				this.totalLocalStorage = totalLocalStorage;
			}

			public Integer getTotalVcpus() {
				return this.totalVcpus;
			}

			public void setTotalVcpus(Integer totalVcpus) {
				this.totalVcpus = totalVcpus;
			}

			public Integer getTotalVgpus() {
				return this.totalVgpus;
			}

			public void setTotalVgpus(Integer totalVgpus) {
				this.totalVgpus = totalVgpus;
			}

			public Integer getAvailableLocalStorage() {
				return this.availableLocalStorage;
			}

			public void setAvailableLocalStorage(Integer availableLocalStorage) {
				this.availableLocalStorage = availableLocalStorage;
			}

			public Integer getAvailableVcpus() {
				return this.availableVcpus;
			}

			public void setAvailableVcpus(Integer availableVcpus) {
				this.availableVcpus = availableVcpus;
			}

			public Integer getAvailableVgpus() {
				return this.availableVgpus;
			}

			public void setAvailableVgpus(Integer availableVgpus) {
				this.availableVgpus = availableVgpus;
			}

			public List<InstanceTypeInventory> getInstanceTypesInventory() {
				return this.instanceTypesInventory;
			}

			public void setInstanceTypesInventory(List<InstanceTypeInventory> instanceTypesInventory) {
				this.instanceTypesInventory = instanceTypesInventory;
			}

			public static class InstanceTypeInventory {

				private Integer availableCount;

				private String instanceType;

				public Integer getAvailableCount() {
					return this.availableCount;
				}

				public void setAvailableCount(Integer availableCount) {
					this.availableCount = availableCount;
				}

				public String getInstanceType() {
					return this.instanceType;
				}

				public void setInstanceType(String instanceType) {
					this.instanceType = instanceType;
				}
			}
		}

		public static class NetworkAttributes {

			private Integer udpTimeout;

			private Integer slbUdpTimeout;

			public Integer getUdpTimeout() {
				return this.udpTimeout;
			}

			public void setUdpTimeout(Integer udpTimeout) {
				this.udpTimeout = udpTimeout;
			}

			public Integer getSlbUdpTimeout() {
				return this.slbUdpTimeout;
			}

			public void setSlbUdpTimeout(Integer slbUdpTimeout) {
				this.slbUdpTimeout = slbUdpTimeout;
			}
		}

		public static class RenewAttribute {

			private String periodUnit;

			private Integer duration;

			private String renewalStatus;

			private Boolean autoRenewEnabled;

			public String getPeriodUnit() {
				return this.periodUnit;
			}

			public void setPeriodUnit(String periodUnit) {
				this.periodUnit = periodUnit;
			}

			public Integer getDuration() {
				return this.duration;
			}

			public void setDuration(Integer duration) {
				this.duration = duration;
			}

			public String getRenewalStatus() {
				return this.renewalStatus;
			}

			public void setRenewalStatus(String renewalStatus) {
				this.renewalStatus = renewalStatus;
			}

			public Boolean getAutoRenewEnabled() {
				return this.autoRenewEnabled;
			}

			public void setAutoRenewEnabled(Boolean autoRenewEnabled) {
				this.autoRenewEnabled = autoRenewEnabled;
			}
		}
	}

	@Override
	public OpsDescribeDedicatedHostsResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeDedicatedHostsResponseUnmarshaller.unmarshall(this, context);
	}
}
