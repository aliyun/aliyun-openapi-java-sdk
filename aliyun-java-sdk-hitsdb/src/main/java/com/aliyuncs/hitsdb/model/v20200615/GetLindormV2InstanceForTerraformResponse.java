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

package com.aliyuncs.hitsdb.model.v20200615;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hitsdb.transform.v20200615.GetLindormV2InstanceForTerraformResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLindormV2InstanceForTerraformResponse extends AcsResponse {

	private String vpcId;

	private String vswitchId;

	private String payType;

	private String networkType;

	private String diskUsage;

	private String diskCategory;

	private String requestId;

	private Integer coldStorage;

	private Long expiredMilliseconds;

	private Boolean autoRenew;

	private String deletionProtection;

	private Long aliUid;

	private String instanceId;

	private String instanceType;

	private String regionId;

	private Long createMilliseconds;

	private String instanceAlias;

	private String zoneId;

	private String instanceStatus;

	private String primaryZoneId;

	private String primaryVSwitchId;

	private String standbyZoneId;

	private String standbyVSwitchId;

	private String arbiterZoneId;

	private String arbiterVSwitchId;

	private String resourceGroupId;

	private String serviceType;

	private Map<Object,Object> zoneEngineInfoMap;

	private String initialRootPassword;

	private String diskThreshold;

	private Boolean enableCompute;

	private String maintainStartTime;

	private String maintainEndTime;

	private Long cloudStorageSize;

	private List<EngineInfo> engineList;

	private List<WhiteIpListItem> whiteIpList;

	private StorageUsage storageUsage;

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

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}

	public String getDiskUsage() {
		return this.diskUsage;
	}

	public void setDiskUsage(String diskUsage) {
		this.diskUsage = diskUsage;
	}

	public String getDiskCategory() {
		return this.diskCategory;
	}

	public void setDiskCategory(String diskCategory) {
		this.diskCategory = diskCategory;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getColdStorage() {
		return this.coldStorage;
	}

	public void setColdStorage(Integer coldStorage) {
		this.coldStorage = coldStorage;
	}

	public Long getExpiredMilliseconds() {
		return this.expiredMilliseconds;
	}

	public void setExpiredMilliseconds(Long expiredMilliseconds) {
		this.expiredMilliseconds = expiredMilliseconds;
	}

	public Boolean getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(Boolean autoRenew) {
		this.autoRenew = autoRenew;
	}

	public String getDeletionProtection() {
		return this.deletionProtection;
	}

	public void setDeletionProtection(String deletionProtection) {
		this.deletionProtection = deletionProtection;
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
	}

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

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public Long getCreateMilliseconds() {
		return this.createMilliseconds;
	}

	public void setCreateMilliseconds(Long createMilliseconds) {
		this.createMilliseconds = createMilliseconds;
	}

	public String getInstanceAlias() {
		return this.instanceAlias;
	}

	public void setInstanceAlias(String instanceAlias) {
		this.instanceAlias = instanceAlias;
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	public String getInstanceStatus() {
		return this.instanceStatus;
	}

	public void setInstanceStatus(String instanceStatus) {
		this.instanceStatus = instanceStatus;
	}

	public String getPrimaryZoneId() {
		return this.primaryZoneId;
	}

	public void setPrimaryZoneId(String primaryZoneId) {
		this.primaryZoneId = primaryZoneId;
	}

	public String getPrimaryVSwitchId() {
		return this.primaryVSwitchId;
	}

	public void setPrimaryVSwitchId(String primaryVSwitchId) {
		this.primaryVSwitchId = primaryVSwitchId;
	}

	public String getStandbyZoneId() {
		return this.standbyZoneId;
	}

	public void setStandbyZoneId(String standbyZoneId) {
		this.standbyZoneId = standbyZoneId;
	}

	public String getStandbyVSwitchId() {
		return this.standbyVSwitchId;
	}

	public void setStandbyVSwitchId(String standbyVSwitchId) {
		this.standbyVSwitchId = standbyVSwitchId;
	}

	public String getArbiterZoneId() {
		return this.arbiterZoneId;
	}

	public void setArbiterZoneId(String arbiterZoneId) {
		this.arbiterZoneId = arbiterZoneId;
	}

	public String getArbiterVSwitchId() {
		return this.arbiterVSwitchId;
	}

	public void setArbiterVSwitchId(String arbiterVSwitchId) {
		this.arbiterVSwitchId = arbiterVSwitchId;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public String getServiceType() {
		return this.serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public Map<Object,Object> getZoneEngineInfoMap() {
		return this.zoneEngineInfoMap;
	}

	public void setZoneEngineInfoMap(Map<Object,Object> zoneEngineInfoMap) {
		this.zoneEngineInfoMap = zoneEngineInfoMap;
	}

	public String getInitialRootPassword() {
		return this.initialRootPassword;
	}

	public void setInitialRootPassword(String initialRootPassword) {
		this.initialRootPassword = initialRootPassword;
	}

	public String getDiskThreshold() {
		return this.diskThreshold;
	}

	public void setDiskThreshold(String diskThreshold) {
		this.diskThreshold = diskThreshold;
	}

	public Boolean getEnableCompute() {
		return this.enableCompute;
	}

	public void setEnableCompute(Boolean enableCompute) {
		this.enableCompute = enableCompute;
	}

	public String getMaintainStartTime() {
		return this.maintainStartTime;
	}

	public void setMaintainStartTime(String maintainStartTime) {
		this.maintainStartTime = maintainStartTime;
	}

	public String getMaintainEndTime() {
		return this.maintainEndTime;
	}

	public void setMaintainEndTime(String maintainEndTime) {
		this.maintainEndTime = maintainEndTime;
	}

	public Long getCloudStorageSize() {
		return this.cloudStorageSize;
	}

	public void setCloudStorageSize(Long cloudStorageSize) {
		this.cloudStorageSize = cloudStorageSize;
	}

	public List<EngineInfo> getEngineList() {
		return this.engineList;
	}

	public void setEngineList(List<EngineInfo> engineList) {
		this.engineList = engineList;
	}

	public List<WhiteIpListItem> getWhiteIpList() {
		return this.whiteIpList;
	}

	public void setWhiteIpList(List<WhiteIpListItem> whiteIpList) {
		this.whiteIpList = whiteIpList;
	}

	public StorageUsage getStorageUsage() {
		return this.storageUsage;
	}

	public void setStorageUsage(StorageUsage storageUsage) {
		this.storageUsage = storageUsage;
	}

	public static class EngineInfo {

		private String version;

		private String engine;

		private Boolean isLastVersion;

		private String latestVersion;

		private List<ConnectAddress> connectAddressList;

		private List<NodeGroupItem> nodeGroup;

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public Boolean getIsLastVersion() {
			return this.isLastVersion;
		}

		public void setIsLastVersion(Boolean isLastVersion) {
			this.isLastVersion = isLastVersion;
		}

		public String getLatestVersion() {
			return this.latestVersion;
		}

		public void setLatestVersion(String latestVersion) {
			this.latestVersion = latestVersion;
		}

		public List<ConnectAddress> getConnectAddressList() {
			return this.connectAddressList;
		}

		public void setConnectAddressList(List<ConnectAddress> connectAddressList) {
			this.connectAddressList = connectAddressList;
		}

		public List<NodeGroupItem> getNodeGroup() {
			return this.nodeGroup;
		}

		public void setNodeGroup(List<NodeGroupItem> nodeGroup) {
			this.nodeGroup = nodeGroup;
		}

		public static class ConnectAddress {

			private String address;

			private String type;

			private String port;

			public String getAddress() {
				return this.address;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getPort() {
				return this.port;
			}

			public void setPort(String port) {
				this.port = port;
			}
		}

		public static class NodeGroupItem {

			private String nodeSpec;

			private Boolean enableAttachLocalDisk;

			private String localDiskCategory;

			private Long localDiskCapacity;

			private Integer cpuCoreCount;

			private Integer memorySizeGiB;

			private Integer quantity;

			private String category;

			private String resourceGroupName;

			private String specId;

			private String status;

			public String getNodeSpec() {
				return this.nodeSpec;
			}

			public void setNodeSpec(String nodeSpec) {
				this.nodeSpec = nodeSpec;
			}

			public Boolean getEnableAttachLocalDisk() {
				return this.enableAttachLocalDisk;
			}

			public void setEnableAttachLocalDisk(Boolean enableAttachLocalDisk) {
				this.enableAttachLocalDisk = enableAttachLocalDisk;
			}

			public String getLocalDiskCategory() {
				return this.localDiskCategory;
			}

			public void setLocalDiskCategory(String localDiskCategory) {
				this.localDiskCategory = localDiskCategory;
			}

			public Long getLocalDiskCapacity() {
				return this.localDiskCapacity;
			}

			public void setLocalDiskCapacity(Long localDiskCapacity) {
				this.localDiskCapacity = localDiskCapacity;
			}

			public Integer getCpuCoreCount() {
				return this.cpuCoreCount;
			}

			public void setCpuCoreCount(Integer cpuCoreCount) {
				this.cpuCoreCount = cpuCoreCount;
			}

			public Integer getMemorySizeGiB() {
				return this.memorySizeGiB;
			}

			public void setMemorySizeGiB(Integer memorySizeGiB) {
				this.memorySizeGiB = memorySizeGiB;
			}

			public Integer getQuantity() {
				return this.quantity;
			}

			public void setQuantity(Integer quantity) {
				this.quantity = quantity;
			}

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public String getResourceGroupName() {
				return this.resourceGroupName;
			}

			public void setResourceGroupName(String resourceGroupName) {
				this.resourceGroupName = resourceGroupName;
			}

			public String getSpecId() {
				return this.specId;
			}

			public void setSpecId(String specId) {
				this.specId = specId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}
	}

	public static class WhiteIpListItem {

		private String groupName;

		private String ipList;

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getIpList() {
			return this.ipList;
		}

		public void setIpList(String ipList) {
			this.ipList = ipList;
		}
	}

	public static class StorageUsage {

		private Map<Object,Object> engineUsage;

		private List<Map<Object,Object>> capacityByDiskCategory;

		public Map<Object,Object> getEngineUsage() {
			return this.engineUsage;
		}

		public void setEngineUsage(Map<Object,Object> engineUsage) {
			this.engineUsage = engineUsage;
		}

		public List<Map<Object,Object>> getCapacityByDiskCategory() {
			return this.capacityByDiskCategory;
		}

		public void setCapacityByDiskCategory(List<Map<Object,Object>> capacityByDiskCategory) {
			this.capacityByDiskCategory = capacityByDiskCategory;
		}
	}

	@Override
	public GetLindormV2InstanceForTerraformResponse getInstance(UnmarshallerContext context) {
		return	GetLindormV2InstanceForTerraformResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
