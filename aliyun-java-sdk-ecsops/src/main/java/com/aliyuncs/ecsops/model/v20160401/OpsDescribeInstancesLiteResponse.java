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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeInstancesLiteResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeInstancesLiteResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private List<Instance> instances;

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

	public List<Instance> getInstances() {
		return this.instances;
	}

	public void setInstances(List<Instance> instances) {
		this.instances = instances;
	}

	public static class Instance {

		private String vpcId;

		private String serialNumber;

		private String natIp;

		private Integer vncPort;

		private Integer intranetTx;

		private Integer spotStrategy;

		private Boolean deviceAvailable;

		private String publicIpAddress;

		private String eipAddress;

		private String ncId;

		private String instanceName;

		private String instanceNetworkType;

		private Integer internetRx;

		private String platform;

		private Integer eipBandwidth;

		private String oSName;

		private String imageId;

		private String clusterId;

		private String gPUSpec;

		private String innerIpAddress;

		private Integer gPUAmount;

		private String instanceId;

		private String eipAllocationId;

		private String resourceOwnerId;

		private String imageName;

		private String zoneId;

		private String vswId;

		private String businessStatus;

		private String oSType;

		private String status;

		private String systemDeviceCategory;

		private Integer internetTx;

		private String vncHost;

		private String ncIp;

		private String bid;

		private String description;

		private String rackId;

		private Integer memory;

		private String createdTime;

		private String vlanId;

		private String hostname;

		private String regionId;

		private Boolean ioOptimized;

		private Integer cpu;

		private String houyiStatus;

		private Integer intranetRx;

		private List<Disk> disks;

		private List<String> securityGroupIds;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getSerialNumber() {
			return this.serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}

		public String getNatIp() {
			return this.natIp;
		}

		public void setNatIp(String natIp) {
			this.natIp = natIp;
		}

		public Integer getVncPort() {
			return this.vncPort;
		}

		public void setVncPort(Integer vncPort) {
			this.vncPort = vncPort;
		}

		public Integer getIntranetTx() {
			return this.intranetTx;
		}

		public void setIntranetTx(Integer intranetTx) {
			this.intranetTx = intranetTx;
		}

		public Integer getSpotStrategy() {
			return this.spotStrategy;
		}

		public void setSpotStrategy(Integer spotStrategy) {
			this.spotStrategy = spotStrategy;
		}

		public Boolean getDeviceAvailable() {
			return this.deviceAvailable;
		}

		public void setDeviceAvailable(Boolean deviceAvailable) {
			this.deviceAvailable = deviceAvailable;
		}

		public String getPublicIpAddress() {
			return this.publicIpAddress;
		}

		public void setPublicIpAddress(String publicIpAddress) {
			this.publicIpAddress = publicIpAddress;
		}

		public String getEipAddress() {
			return this.eipAddress;
		}

		public void setEipAddress(String eipAddress) {
			this.eipAddress = eipAddress;
		}

		public String getNcId() {
			return this.ncId;
		}

		public void setNcId(String ncId) {
			this.ncId = ncId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getInstanceNetworkType() {
			return this.instanceNetworkType;
		}

		public void setInstanceNetworkType(String instanceNetworkType) {
			this.instanceNetworkType = instanceNetworkType;
		}

		public Integer getInternetRx() {
			return this.internetRx;
		}

		public void setInternetRx(Integer internetRx) {
			this.internetRx = internetRx;
		}

		public String getPlatform() {
			return this.platform;
		}

		public void setPlatform(String platform) {
			this.platform = platform;
		}

		public Integer getEipBandwidth() {
			return this.eipBandwidth;
		}

		public void setEipBandwidth(Integer eipBandwidth) {
			this.eipBandwidth = eipBandwidth;
		}

		public String getOSName() {
			return this.oSName;
		}

		public void setOSName(String oSName) {
			this.oSName = oSName;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getGPUSpec() {
			return this.gPUSpec;
		}

		public void setGPUSpec(String gPUSpec) {
			this.gPUSpec = gPUSpec;
		}

		public String getInnerIpAddress() {
			return this.innerIpAddress;
		}

		public void setInnerIpAddress(String innerIpAddress) {
			this.innerIpAddress = innerIpAddress;
		}

		public Integer getGPUAmount() {
			return this.gPUAmount;
		}

		public void setGPUAmount(Integer gPUAmount) {
			this.gPUAmount = gPUAmount;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getEipAllocationId() {
			return this.eipAllocationId;
		}

		public void setEipAllocationId(String eipAllocationId) {
			this.eipAllocationId = eipAllocationId;
		}

		public String getResourceOwnerId() {
			return this.resourceOwnerId;
		}

		public void setResourceOwnerId(String resourceOwnerId) {
			this.resourceOwnerId = resourceOwnerId;
		}

		public String getImageName() {
			return this.imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getVswId() {
			return this.vswId;
		}

		public void setVswId(String vswId) {
			this.vswId = vswId;
		}

		public String getBusinessStatus() {
			return this.businessStatus;
		}

		public void setBusinessStatus(String businessStatus) {
			this.businessStatus = businessStatus;
		}

		public String getOSType() {
			return this.oSType;
		}

		public void setOSType(String oSType) {
			this.oSType = oSType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getSystemDeviceCategory() {
			return this.systemDeviceCategory;
		}

		public void setSystemDeviceCategory(String systemDeviceCategory) {
			this.systemDeviceCategory = systemDeviceCategory;
		}

		public Integer getInternetTx() {
			return this.internetTx;
		}

		public void setInternetTx(Integer internetTx) {
			this.internetTx = internetTx;
		}

		public String getVncHost() {
			return this.vncHost;
		}

		public void setVncHost(String vncHost) {
			this.vncHost = vncHost;
		}

		public String getNcIp() {
			return this.ncIp;
		}

		public void setNcIp(String ncIp) {
			this.ncIp = ncIp;
		}

		public String getBid() {
			return this.bid;
		}

		public void setBid(String bid) {
			this.bid = bid;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getRackId() {
			return this.rackId;
		}

		public void setRackId(String rackId) {
			this.rackId = rackId;
		}

		public Integer getMemory() {
			return this.memory;
		}

		public void setMemory(Integer memory) {
			this.memory = memory;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getVlanId() {
			return this.vlanId;
		}

		public void setVlanId(String vlanId) {
			this.vlanId = vlanId;
		}

		public String getHostname() {
			return this.hostname;
		}

		public void setHostname(String hostname) {
			this.hostname = hostname;
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

		public Integer getCpu() {
			return this.cpu;
		}

		public void setCpu(Integer cpu) {
			this.cpu = cpu;
		}

		public String getHouyiStatus() {
			return this.houyiStatus;
		}

		public void setHouyiStatus(String houyiStatus) {
			this.houyiStatus = houyiStatus;
		}

		public Integer getIntranetRx() {
			return this.intranetRx;
		}

		public void setIntranetRx(Integer intranetRx) {
			this.intranetRx = intranetRx;
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

			private String status;

			private Boolean active;

			private String houyiDiskId;

			private Boolean enableAutoSnapshot;

			private String diskType;

			private Boolean bootable;

			private String diskId;

			private String bid;

			private Boolean deleteAutoSnapshot;

			private String diskDesc;

			private String diskCategory;

			private String device;

			private String diskName;

			private Boolean portable;

			private String imageId;

			private Boolean deleteWithInstance;

			private String clusterId;

			private Integer diskSize;

			private String instanceId;

			private Integer iopsSize;

			private String regionId;

			private Long resourceOwnerId;

			private String snapshotId;

			private String zoneId;

			private String businessStatus;

			private String productCode;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Boolean getActive() {
				return this.active;
			}

			public void setActive(Boolean active) {
				this.active = active;
			}

			public String getHouyiDiskId() {
				return this.houyiDiskId;
			}

			public void setHouyiDiskId(String houyiDiskId) {
				this.houyiDiskId = houyiDiskId;
			}

			public Boolean getEnableAutoSnapshot() {
				return this.enableAutoSnapshot;
			}

			public void setEnableAutoSnapshot(Boolean enableAutoSnapshot) {
				this.enableAutoSnapshot = enableAutoSnapshot;
			}

			public String getDiskType() {
				return this.diskType;
			}

			public void setDiskType(String diskType) {
				this.diskType = diskType;
			}

			public Boolean getBootable() {
				return this.bootable;
			}

			public void setBootable(Boolean bootable) {
				this.bootable = bootable;
			}

			public String getDiskId() {
				return this.diskId;
			}

			public void setDiskId(String diskId) {
				this.diskId = diskId;
			}

			public String getBid() {
				return this.bid;
			}

			public void setBid(String bid) {
				this.bid = bid;
			}

			public Boolean getDeleteAutoSnapshot() {
				return this.deleteAutoSnapshot;
			}

			public void setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
				this.deleteAutoSnapshot = deleteAutoSnapshot;
			}

			public String getDiskDesc() {
				return this.diskDesc;
			}

			public void setDiskDesc(String diskDesc) {
				this.diskDesc = diskDesc;
			}

			public String getDiskCategory() {
				return this.diskCategory;
			}

			public void setDiskCategory(String diskCategory) {
				this.diskCategory = diskCategory;
			}

			public String getDevice() {
				return this.device;
			}

			public void setDevice(String device) {
				this.device = device;
			}

			public String getDiskName() {
				return this.diskName;
			}

			public void setDiskName(String diskName) {
				this.diskName = diskName;
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

			public Boolean getDeleteWithInstance() {
				return this.deleteWithInstance;
			}

			public void setDeleteWithInstance(Boolean deleteWithInstance) {
				this.deleteWithInstance = deleteWithInstance;
			}

			public String getClusterId() {
				return this.clusterId;
			}

			public void setClusterId(String clusterId) {
				this.clusterId = clusterId;
			}

			public Integer getDiskSize() {
				return this.diskSize;
			}

			public void setDiskSize(Integer diskSize) {
				this.diskSize = diskSize;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public Integer getIopsSize() {
				return this.iopsSize;
			}

			public void setIopsSize(Integer iopsSize) {
				this.iopsSize = iopsSize;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public Long getResourceOwnerId() {
				return this.resourceOwnerId;
			}

			public void setResourceOwnerId(Long resourceOwnerId) {
				this.resourceOwnerId = resourceOwnerId;
			}

			public String getSnapshotId() {
				return this.snapshotId;
			}

			public void setSnapshotId(String snapshotId) {
				this.snapshotId = snapshotId;
			}

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public String getBusinessStatus() {
				return this.businessStatus;
			}

			public void setBusinessStatus(String businessStatus) {
				this.businessStatus = businessStatus;
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
	public OpsDescribeInstancesLiteResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeInstancesLiteResponseUnmarshaller.unmarshall(this, context);
	}
}
