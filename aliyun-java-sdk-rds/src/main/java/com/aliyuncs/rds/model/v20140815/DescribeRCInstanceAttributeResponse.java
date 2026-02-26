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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeRCInstanceAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRCInstanceAttributeResponse extends AcsResponse {

	private String clusterId;

	private Integer cpu;

	private String creationTime;

	private String creditSpecification;

	private String deploymentSetId;

	private String description;

	private String diskType;

	private String ecsInstanceType;

	private Boolean enableJumboFrame;

	private String expiredTime;

	private String hostName;

	private String hostType;

	private String imageId;

	private String instanceId;

	private String instanceName;

	private String instanceNetworkType;

	private String instanceType;

	private String internetChargeType;

	private Integer internetMaxBandwidthIn;

	private Integer internetMaxBandwidthOut;

	private String ioOptimized;

	private String keyPairName;

	private Integer memory;

	private String regionId;

	private String requestId;

	private String serialNumber;

	private String status;

	private String stoppedMode;

	private String vlanId;

	private String zoneId;

	private String resourceGroupId;

	private String instanceChargeType;

	private String dbType;

	private String spotStrategy;

	private Integer createMode;

	private Boolean autoRenew;

	private Boolean deletionProtection;

	private Integer gpu;

	private String gpuTypes;

	private String nodeType;

	private String userData;

	private List<DataDisk> dataDisks;

	private List<Tag> tags;

	private List<LockReason> operationLocks;

	private List<String> innerIpAddress;

	private List<String> publicIpAddress;

	private List<String> securityGroupIds;

	private DedicatedHostAttribute dedicatedHostAttribute;

	private EipAddress eipAddress;

	private VpcAttributes vpcAttributes;

	private SystemDisk systemDisk;

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public Integer getCpu() {
		return this.cpu;
	}

	public void setCpu(Integer cpu) {
		this.cpu = cpu;
	}

	public String getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public String getCreditSpecification() {
		return this.creditSpecification;
	}

	public void setCreditSpecification(String creditSpecification) {
		this.creditSpecification = creditSpecification;
	}

	public String getDeploymentSetId() {
		return this.deploymentSetId;
	}

	public void setDeploymentSetId(String deploymentSetId) {
		this.deploymentSetId = deploymentSetId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDiskType() {
		return this.diskType;
	}

	public void setDiskType(String diskType) {
		this.diskType = diskType;
	}

	public String getEcsInstanceType() {
		return this.ecsInstanceType;
	}

	public void setEcsInstanceType(String ecsInstanceType) {
		this.ecsInstanceType = ecsInstanceType;
	}

	public Boolean getEnableJumboFrame() {
		return this.enableJumboFrame;
	}

	public void setEnableJumboFrame(Boolean enableJumboFrame) {
		this.enableJumboFrame = enableJumboFrame;
	}

	public String getExpiredTime() {
		return this.expiredTime;
	}

	public void setExpiredTime(String expiredTime) {
		this.expiredTime = expiredTime;
	}

	public String getHostName() {
		return this.hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getHostType() {
		return this.hostType;
	}

	public void setHostType(String hostType) {
		this.hostType = hostType;
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

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

	public String getInstanceNetworkType() {
		return this.instanceNetworkType;
	}

	public void setInstanceNetworkType(String instanceNetworkType) {
		this.instanceNetworkType = instanceNetworkType;
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
	}

	public String getInternetChargeType() {
		return this.internetChargeType;
	}

	public void setInternetChargeType(String internetChargeType) {
		this.internetChargeType = internetChargeType;
	}

	public Integer getInternetMaxBandwidthIn() {
		return this.internetMaxBandwidthIn;
	}

	public void setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
		this.internetMaxBandwidthIn = internetMaxBandwidthIn;
	}

	public Integer getInternetMaxBandwidthOut() {
		return this.internetMaxBandwidthOut;
	}

	public void setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
		this.internetMaxBandwidthOut = internetMaxBandwidthOut;
	}

	public String getIoOptimized() {
		return this.ioOptimized;
	}

	public void setIoOptimized(String ioOptimized) {
		this.ioOptimized = ioOptimized;
	}

	public String getKeyPairName() {
		return this.keyPairName;
	}

	public void setKeyPairName(String keyPairName) {
		this.keyPairName = keyPairName;
	}

	public Integer getMemory() {
		return this.memory;
	}

	public void setMemory(Integer memory) {
		this.memory = memory;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStoppedMode() {
		return this.stoppedMode;
	}

	public void setStoppedMode(String stoppedMode) {
		this.stoppedMode = stoppedMode;
	}

	public String getVlanId() {
		return this.vlanId;
	}

	public void setVlanId(String vlanId) {
		this.vlanId = vlanId;
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public String getInstanceChargeType() {
		return this.instanceChargeType;
	}

	public void setInstanceChargeType(String instanceChargeType) {
		this.instanceChargeType = instanceChargeType;
	}

	public String getDbType() {
		return this.dbType;
	}

	public void setDbType(String dbType) {
		this.dbType = dbType;
	}

	public String getSpotStrategy() {
		return this.spotStrategy;
	}

	public void setSpotStrategy(String spotStrategy) {
		this.spotStrategy = spotStrategy;
	}

	public Integer getCreateMode() {
		return this.createMode;
	}

	public void setCreateMode(Integer createMode) {
		this.createMode = createMode;
	}

	public Boolean getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(Boolean autoRenew) {
		this.autoRenew = autoRenew;
	}

	public Boolean getDeletionProtection() {
		return this.deletionProtection;
	}

	public void setDeletionProtection(Boolean deletionProtection) {
		this.deletionProtection = deletionProtection;
	}

	public Integer getGpu() {
		return this.gpu;
	}

	public void setGpu(Integer gpu) {
		this.gpu = gpu;
	}

	public String getGpuTypes() {
		return this.gpuTypes;
	}

	public void setGpuTypes(String gpuTypes) {
		this.gpuTypes = gpuTypes;
	}

	public String getNodeType() {
		return this.nodeType;
	}

	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}

	public String getUserData() {
		return this.userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
	}

	public List<DataDisk> getDataDisks() {
		return this.dataDisks;
	}

	public void setDataDisks(List<DataDisk> dataDisks) {
		this.dataDisks = dataDisks;
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public List<LockReason> getOperationLocks() {
		return this.operationLocks;
	}

	public void setOperationLocks(List<LockReason> operationLocks) {
		this.operationLocks = operationLocks;
	}

	public List<String> getInnerIpAddress() {
		return this.innerIpAddress;
	}

	public void setInnerIpAddress(List<String> innerIpAddress) {
		this.innerIpAddress = innerIpAddress;
	}

	public List<String> getPublicIpAddress() {
		return this.publicIpAddress;
	}

	public void setPublicIpAddress(List<String> publicIpAddress) {
		this.publicIpAddress = publicIpAddress;
	}

	public List<String> getSecurityGroupIds() {
		return this.securityGroupIds;
	}

	public void setSecurityGroupIds(List<String> securityGroupIds) {
		this.securityGroupIds = securityGroupIds;
	}

	public DedicatedHostAttribute getDedicatedHostAttribute() {
		return this.dedicatedHostAttribute;
	}

	public void setDedicatedHostAttribute(DedicatedHostAttribute dedicatedHostAttribute) {
		this.dedicatedHostAttribute = dedicatedHostAttribute;
	}

	public EipAddress getEipAddress() {
		return this.eipAddress;
	}

	public void setEipAddress(EipAddress eipAddress) {
		this.eipAddress = eipAddress;
	}

	public VpcAttributes getVpcAttributes() {
		return this.vpcAttributes;
	}

	public void setVpcAttributes(VpcAttributes vpcAttributes) {
		this.vpcAttributes = vpcAttributes;
	}

	public SystemDisk getSystemDisk() {
		return this.systemDisk;
	}

	public void setSystemDisk(SystemDisk systemDisk) {
		this.systemDisk = systemDisk;
	}

	public static class DataDisk {

		private String category;

		private String encrypted;

		private String performanceLevel;

		private Long size;

		private Boolean deleteWithInstance;

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getEncrypted() {
			return this.encrypted;
		}

		public void setEncrypted(String encrypted) {
			this.encrypted = encrypted;
		}

		public String getPerformanceLevel() {
			return this.performanceLevel;
		}

		public void setPerformanceLevel(String performanceLevel) {
			this.performanceLevel = performanceLevel;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public Boolean getDeleteWithInstance() {
			return this.deleteWithInstance;
		}

		public void setDeleteWithInstance(Boolean deleteWithInstance) {
			this.deleteWithInstance = deleteWithInstance;
		}
	}

	public static class Tag {

		private String resourceId;

		private String tagKey;

		private String resourceType;

		private String tagValue;

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getTagKey() {
			return this.tagKey;
		}

		public void setTagKey(String tagKey) {
			this.tagKey = tagKey;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getTagValue() {
			return this.tagValue;
		}

		public void setTagValue(String tagValue) {
			this.tagValue = tagValue;
		}
	}

	public static class LockReason {

		private String lockReason;

		public String getLockReason() {
			return this.lockReason;
		}

		public void setLockReason(String lockReason) {
			this.lockReason = lockReason;
		}
	}

	public static class DedicatedHostAttribute {

		private String dedicatedHostId;

		private String dedicatedHostName;

		public String getDedicatedHostId() {
			return this.dedicatedHostId;
		}

		public void setDedicatedHostId(String dedicatedHostId) {
			this.dedicatedHostId = dedicatedHostId;
		}

		public String getDedicatedHostName() {
			return this.dedicatedHostName;
		}

		public void setDedicatedHostName(String dedicatedHostName) {
			this.dedicatedHostName = dedicatedHostName;
		}
	}

	public static class EipAddress {

		private String allocationId;

		private Integer bandwidth;

		private String internetChargeType;

		private String ipAddress;

		public String getAllocationId() {
			return this.allocationId;
		}

		public void setAllocationId(String allocationId) {
			this.allocationId = allocationId;
		}

		public Integer getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Integer bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getInternetChargeType() {
			return this.internetChargeType;
		}

		public void setInternetChargeType(String internetChargeType) {
			this.internetChargeType = internetChargeType;
		}

		public String getIpAddress() {
			return this.ipAddress;
		}

		public void setIpAddress(String ipAddress) {
			this.ipAddress = ipAddress;
		}
	}

	public static class VpcAttributes {

		private String natIpAddress;

		private String vSwitchId;

		private String vpcId;

		private List<String> privateIpAddress;

		public String getNatIpAddress() {
			return this.natIpAddress;
		}

		public void setNatIpAddress(String natIpAddress) {
			this.natIpAddress = natIpAddress;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public List<String> getPrivateIpAddress() {
			return this.privateIpAddress;
		}

		public void setPrivateIpAddress(List<String> privateIpAddress) {
			this.privateIpAddress = privateIpAddress;
		}
	}

	public static class SystemDisk {

		private Long systemDiskSize;

		private String systemDiskCategory;

		private String systemDiskPerformanceLevel;

		private Boolean deleteWithInstance;

		private String encrypted;

		public Long getSystemDiskSize() {
			return this.systemDiskSize;
		}

		public void setSystemDiskSize(Long systemDiskSize) {
			this.systemDiskSize = systemDiskSize;
		}

		public String getSystemDiskCategory() {
			return this.systemDiskCategory;
		}

		public void setSystemDiskCategory(String systemDiskCategory) {
			this.systemDiskCategory = systemDiskCategory;
		}

		public String getSystemDiskPerformanceLevel() {
			return this.systemDiskPerformanceLevel;
		}

		public void setSystemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
			this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
		}

		public Boolean getDeleteWithInstance() {
			return this.deleteWithInstance;
		}

		public void setDeleteWithInstance(Boolean deleteWithInstance) {
			this.deleteWithInstance = deleteWithInstance;
		}

		public String getEncrypted() {
			return this.encrypted;
		}

		public void setEncrypted(String encrypted) {
			this.encrypted = encrypted;
		}
	}

	@Override
	public DescribeRCInstanceAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeRCInstanceAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
