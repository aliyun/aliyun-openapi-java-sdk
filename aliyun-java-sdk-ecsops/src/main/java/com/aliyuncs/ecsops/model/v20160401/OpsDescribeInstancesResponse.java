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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeInstancesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Instance> instances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
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

		private String description;

		private String regionId;

		private String zoneId;

		private String clusterId;

		private String bid;

		private String resourceOwnerId;

		private String hostname;

		private String status;

		private String businessStatus;

		private String houyiStatus;

		private String innerIpAddress;

		private String publicIpAddress;

		private String imageId;

		private String imageName;

		private String oSName;

		private String oSType;

		private Integer cpu;

		private Integer memory;

		private Integer intranetRx;

		private Integer intranetTx;

		private Integer internetRx;

		private Integer internetTx;

		private String systemDeviceCategory;

		private String createdTime;

		private String vpcId;

		private String vswId;

		private String natIp;

		private String eipAddress;

		private String eipAllocationId;

		private Integer eipBandwidth;

		private String instanceNetworkType;

		private Boolean ioOptimized;

		private Boolean deviceAvailable;

		private String vlanId;

		private String ncId;

		private String ncIp;

		private String rackId;

		private String vncHost;

		private Integer vncPort;

		private Integer gPUAmount;

		private String gPUSpec;

		private String platform;

		private Integer spotStrategy;

		private Integer instanceChargeType;

		private Integer internetChargeType;

		private List<Disk> disks;

		private List<String> securityGroupIds;

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

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
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

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getBid() {
			return this.bid;
		}

		public void setBid(String bid) {
			this.bid = bid;
		}

		public String getResourceOwnerId() {
			return this.resourceOwnerId;
		}

		public void setResourceOwnerId(String resourceOwnerId) {
			this.resourceOwnerId = resourceOwnerId;
		}

		public String getHostname() {
			return this.hostname;
		}

		public void setHostname(String hostname) {
			this.hostname = hostname;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getBusinessStatus() {
			return this.businessStatus;
		}

		public void setBusinessStatus(String businessStatus) {
			this.businessStatus = businessStatus;
		}

		public String getHouyiStatus() {
			return this.houyiStatus;
		}

		public void setHouyiStatus(String houyiStatus) {
			this.houyiStatus = houyiStatus;
		}

		public String getInnerIpAddress() {
			return this.innerIpAddress;
		}

		public void setInnerIpAddress(String innerIpAddress) {
			this.innerIpAddress = innerIpAddress;
		}

		public String getPublicIpAddress() {
			return this.publicIpAddress;
		}

		public void setPublicIpAddress(String publicIpAddress) {
			this.publicIpAddress = publicIpAddress;
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

		public String getOSName() {
			return this.oSName;
		}

		public void setOSName(String oSName) {
			this.oSName = oSName;
		}

		public String getOSType() {
			return this.oSType;
		}

		public void setOSType(String oSType) {
			this.oSType = oSType;
		}

		public Integer getCpu() {
			return this.cpu;
		}

		public void setCpu(Integer cpu) {
			this.cpu = cpu;
		}

		public Integer getMemory() {
			return this.memory;
		}

		public void setMemory(Integer memory) {
			this.memory = memory;
		}

		public Integer getIntranetRx() {
			return this.intranetRx;
		}

		public void setIntranetRx(Integer intranetRx) {
			this.intranetRx = intranetRx;
		}

		public Integer getIntranetTx() {
			return this.intranetTx;
		}

		public void setIntranetTx(Integer intranetTx) {
			this.intranetTx = intranetTx;
		}

		public Integer getInternetRx() {
			return this.internetRx;
		}

		public void setInternetRx(Integer internetRx) {
			this.internetRx = internetRx;
		}

		public Integer getInternetTx() {
			return this.internetTx;
		}

		public void setInternetTx(Integer internetTx) {
			this.internetTx = internetTx;
		}

		public String getSystemDeviceCategory() {
			return this.systemDeviceCategory;
		}

		public void setSystemDeviceCategory(String systemDeviceCategory) {
			this.systemDeviceCategory = systemDeviceCategory;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVswId() {
			return this.vswId;
		}

		public void setVswId(String vswId) {
			this.vswId = vswId;
		}

		public String getNatIp() {
			return this.natIp;
		}

		public void setNatIp(String natIp) {
			this.natIp = natIp;
		}

		public String getEipAddress() {
			return this.eipAddress;
		}

		public void setEipAddress(String eipAddress) {
			this.eipAddress = eipAddress;
		}

		public String getEipAllocationId() {
			return this.eipAllocationId;
		}

		public void setEipAllocationId(String eipAllocationId) {
			this.eipAllocationId = eipAllocationId;
		}

		public Integer getEipBandwidth() {
			return this.eipBandwidth;
		}

		public void setEipBandwidth(Integer eipBandwidth) {
			this.eipBandwidth = eipBandwidth;
		}

		public String getInstanceNetworkType() {
			return this.instanceNetworkType;
		}

		public void setInstanceNetworkType(String instanceNetworkType) {
			this.instanceNetworkType = instanceNetworkType;
		}

		public Boolean getIoOptimized() {
			return this.ioOptimized;
		}

		public void setIoOptimized(Boolean ioOptimized) {
			this.ioOptimized = ioOptimized;
		}

		public Boolean getDeviceAvailable() {
			return this.deviceAvailable;
		}

		public void setDeviceAvailable(Boolean deviceAvailable) {
			this.deviceAvailable = deviceAvailable;
		}

		public String getVlanId() {
			return this.vlanId;
		}

		public void setVlanId(String vlanId) {
			this.vlanId = vlanId;
		}

		public String getNcId() {
			return this.ncId;
		}

		public void setNcId(String ncId) {
			this.ncId = ncId;
		}

		public String getNcIp() {
			return this.ncIp;
		}

		public void setNcIp(String ncIp) {
			this.ncIp = ncIp;
		}

		public String getRackId() {
			return this.rackId;
		}

		public void setRackId(String rackId) {
			this.rackId = rackId;
		}

		public String getVncHost() {
			return this.vncHost;
		}

		public void setVncHost(String vncHost) {
			this.vncHost = vncHost;
		}

		public Integer getVncPort() {
			return this.vncPort;
		}

		public void setVncPort(Integer vncPort) {
			this.vncPort = vncPort;
		}

		public Integer getGPUAmount() {
			return this.gPUAmount;
		}

		public void setGPUAmount(Integer gPUAmount) {
			this.gPUAmount = gPUAmount;
		}

		public String getGPUSpec() {
			return this.gPUSpec;
		}

		public void setGPUSpec(String gPUSpec) {
			this.gPUSpec = gPUSpec;
		}

		public String getPlatform() {
			return this.platform;
		}

		public void setPlatform(String platform) {
			this.platform = platform;
		}

		public Integer getSpotStrategy() {
			return this.spotStrategy;
		}

		public void setSpotStrategy(Integer spotStrategy) {
			this.spotStrategy = spotStrategy;
		}

		public Integer getInstanceChargeType() {
			return this.instanceChargeType;
		}

		public void setInstanceChargeType(Integer instanceChargeType) {
			this.instanceChargeType = instanceChargeType;
		}

		public Integer getInternetChargeType() {
			return this.internetChargeType;
		}

		public void setInternetChargeType(Integer internetChargeType) {
			this.internetChargeType = internetChargeType;
		}

		public List<Disk> getDisks() {
			return this.disks;
		}

		public void setDisks(List<Disk> disks) {
			this.disks = disks;
		}

		public List<String> getSecurityGroupIds() {
			return this.securityGroupIds;
		}

		public void setSecurityGroupIds(List<String> securityGroupIds) {
			this.securityGroupIds = securityGroupIds;
		}

		public static class Disk {

			private Long resourceOwnerId;

			private String bid;

			private String diskId;

			private String houyiDiskId;

			private String diskType;

			private String diskCategory;

			private String status;

			private String regionId;

			private String zoneId;

			private String clusterId;

			private String diskName;

			private String diskDesc;

			private Integer diskSize;

			private Boolean active;

			private Boolean bootable;

			private Boolean portable;

			private String imageId;

			private String snapshotId;

			private String instanceId;

			private String device;

			private Boolean deleteWithInstance;

			private Boolean deleteAutoSnapshot;

			private Boolean enableAutoSnapshot;

			private String businessStatus;

			private Integer iopsSize;

			private String productCode;

			public Long getResourceOwnerId() {
				return this.resourceOwnerId;
			}

			public void setResourceOwnerId(Long resourceOwnerId) {
				this.resourceOwnerId = resourceOwnerId;
			}

			public String getBid() {
				return this.bid;
			}

			public void setBid(String bid) {
				this.bid = bid;
			}

			public String getDiskId() {
				return this.diskId;
			}

			public void setDiskId(String diskId) {
				this.diskId = diskId;
			}

			public String getHouyiDiskId() {
				return this.houyiDiskId;
			}

			public void setHouyiDiskId(String houyiDiskId) {
				this.houyiDiskId = houyiDiskId;
			}

			public String getDiskType() {
				return this.diskType;
			}

			public void setDiskType(String diskType) {
				this.diskType = diskType;
			}

			public String getDiskCategory() {
				return this.diskCategory;
			}

			public void setDiskCategory(String diskCategory) {
				this.diskCategory = diskCategory;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
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

			public String getClusterId() {
				return this.clusterId;
			}

			public void setClusterId(String clusterId) {
				this.clusterId = clusterId;
			}

			public String getDiskName() {
				return this.diskName;
			}

			public void setDiskName(String diskName) {
				this.diskName = diskName;
			}

			public String getDiskDesc() {
				return this.diskDesc;
			}

			public void setDiskDesc(String diskDesc) {
				this.diskDesc = diskDesc;
			}

			public Integer getDiskSize() {
				return this.diskSize;
			}

			public void setDiskSize(Integer diskSize) {
				this.diskSize = diskSize;
			}

			public Boolean getActive() {
				return this.active;
			}

			public void setActive(Boolean active) {
				this.active = active;
			}

			public Boolean getBootable() {
				return this.bootable;
			}

			public void setBootable(Boolean bootable) {
				this.bootable = bootable;
			}

			public Boolean getPortable() {
				return this.portable;
			}

			public void setPortable(Boolean portable) {
				this.portable = portable;
			}

			public String getImageId() {
				return this.imageId;
			}

			public void setImageId(String imageId) {
				this.imageId = imageId;
			}

			public String getSnapshotId() {
				return this.snapshotId;
			}

			public void setSnapshotId(String snapshotId) {
				this.snapshotId = snapshotId;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getDevice() {
				return this.device;
			}

			public void setDevice(String device) {
				this.device = device;
			}

			public Boolean getDeleteWithInstance() {
				return this.deleteWithInstance;
			}

			public void setDeleteWithInstance(Boolean deleteWithInstance) {
				this.deleteWithInstance = deleteWithInstance;
			}

			public Boolean getDeleteAutoSnapshot() {
				return this.deleteAutoSnapshot;
			}

			public void setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
				this.deleteAutoSnapshot = deleteAutoSnapshot;
			}

			public Boolean getEnableAutoSnapshot() {
				return this.enableAutoSnapshot;
			}

			public void setEnableAutoSnapshot(Boolean enableAutoSnapshot) {
				this.enableAutoSnapshot = enableAutoSnapshot;
			}

			public String getBusinessStatus() {
				return this.businessStatus;
			}

			public void setBusinessStatus(String businessStatus) {
				this.businessStatus = businessStatus;
			}

			public Integer getIopsSize() {
				return this.iopsSize;
			}

			public void setIopsSize(Integer iopsSize) {
				this.iopsSize = iopsSize;
			}

			public String getProductCode() {
				return this.productCode;
			}

			public void setProductCode(String productCode) {
				this.productCode = productCode;
			}
		}
	}

	@Override
	public OpsDescribeInstancesResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
