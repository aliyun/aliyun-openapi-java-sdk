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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstancesResponse extends AcsResponse {

	private String nextToken;

	private Integer pageSize;

	private Integer pageNumber;

	private String requestId;

	private Integer totalCount;

	private List<Instance> instances;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

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

	public List<Instance> getInstances() {
		return this.instances;
	}

	public void setInstances(List<Instance> instances) {
		this.instances = instances;
	}

	public static class Instance {

		private String creationTime;

		private String serialNumber;

		private String status;

		private String deploymentSetId;

		private String keyPairName;

		private String saleCycle;

		private String spotStrategy;

		private Boolean deviceAvailable;

		private Long localStorageCapacity;

		private String description;

		private Integer spotDuration;

		private String instanceNetworkType;

		private String instanceName;

		private String oSNameEn;

		private String hpcClusterId;

		private Float spotPriceLimit;

		private Integer memory;

		private String oSName;

		private Integer deploymentSetGroupNo;

		private String imageId;

		private String vlanId;

		private String clusterId;

		private String gPUSpec;

		private String autoReleaseTime;

		private Boolean deletionProtection;

		private String stoppedMode;

		private Integer gPUAmount;

		private String hostName;

		private String instanceId;

		private Integer internetMaxBandwidthOut;

		private Integer internetMaxBandwidthIn;

		private String instanceType;

		private String instanceChargeType;

		private String regionId;

		private Boolean ioOptimized;

		private String startTime;

		private Integer cpu;

		private Integer localStorageAmount;

		private String expiredTime;

		private String resourceGroupId;

		private String internetChargeType;

		private String zoneId;

		private Boolean recyclable;

		private String iSP;

		private String creditSpecification;

		private String instanceTypeFamily;

		private String oSType;

		private List<NetworkInterface> networkInterfaces;

		private List<LockReason> operationLocks;

		private List<Tag> tags;

		private List<String> rdmaIpAddress;

		private List<String> securityGroupIds;

		private List<String> publicIpAddress;

		private List<String> innerIpAddress;

		private VpcAttributes vpcAttributes;

		private EipAddress eipAddress;

		private HibernationOptions hibernationOptions;

		private DedicatedHostAttribute dedicatedHostAttribute;

		private EcsCapacityReservationAttr ecsCapacityReservationAttr;

		private DedicatedInstanceAttribute dedicatedInstanceAttribute;

		private CpuOptions cpuOptions;

		private MetadataOptions metadataOptions;

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

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDeploymentSetId() {
			return this.deploymentSetId;
		}

		public void setDeploymentSetId(String deploymentSetId) {
			this.deploymentSetId = deploymentSetId;
		}

		public String getKeyPairName() {
			return this.keyPairName;
		}

		public void setKeyPairName(String keyPairName) {
			this.keyPairName = keyPairName;
		}

		public String getSaleCycle() {
			return this.saleCycle;
		}

		public void setSaleCycle(String saleCycle) {
			this.saleCycle = saleCycle;
		}

		public String getSpotStrategy() {
			return this.spotStrategy;
		}

		public void setSpotStrategy(String spotStrategy) {
			this.spotStrategy = spotStrategy;
		}

		public Boolean getDeviceAvailable() {
			return this.deviceAvailable;
		}

		public void setDeviceAvailable(Boolean deviceAvailable) {
			this.deviceAvailable = deviceAvailable;
		}

		public Long getLocalStorageCapacity() {
			return this.localStorageCapacity;
		}

		public void setLocalStorageCapacity(Long localStorageCapacity) {
			this.localStorageCapacity = localStorageCapacity;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getSpotDuration() {
			return this.spotDuration;
		}

		public void setSpotDuration(Integer spotDuration) {
			this.spotDuration = spotDuration;
		}

		public String getInstanceNetworkType() {
			return this.instanceNetworkType;
		}

		public void setInstanceNetworkType(String instanceNetworkType) {
			this.instanceNetworkType = instanceNetworkType;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getOSNameEn() {
			return this.oSNameEn;
		}

		public void setOSNameEn(String oSNameEn) {
			this.oSNameEn = oSNameEn;
		}

		public String getHpcClusterId() {
			return this.hpcClusterId;
		}

		public void setHpcClusterId(String hpcClusterId) {
			this.hpcClusterId = hpcClusterId;
		}

		public Float getSpotPriceLimit() {
			return this.spotPriceLimit;
		}

		public void setSpotPriceLimit(Float spotPriceLimit) {
			this.spotPriceLimit = spotPriceLimit;
		}

		public Integer getMemory() {
			return this.memory;
		}

		public void setMemory(Integer memory) {
			this.memory = memory;
		}

		public String getOSName() {
			return this.oSName;
		}

		public void setOSName(String oSName) {
			this.oSName = oSName;
		}

		public Integer getDeploymentSetGroupNo() {
			return this.deploymentSetGroupNo;
		}

		public void setDeploymentSetGroupNo(Integer deploymentSetGroupNo) {
			this.deploymentSetGroupNo = deploymentSetGroupNo;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getVlanId() {
			return this.vlanId;
		}

		public void setVlanId(String vlanId) {
			this.vlanId = vlanId;
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

		public String getAutoReleaseTime() {
			return this.autoReleaseTime;
		}

		public void setAutoReleaseTime(String autoReleaseTime) {
			this.autoReleaseTime = autoReleaseTime;
		}

		public Boolean getDeletionProtection() {
			return this.deletionProtection;
		}

		public void setDeletionProtection(Boolean deletionProtection) {
			this.deletionProtection = deletionProtection;
		}

		public String getStoppedMode() {
			return this.stoppedMode;
		}

		public void setStoppedMode(String stoppedMode) {
			this.stoppedMode = stoppedMode;
		}

		public Integer getGPUAmount() {
			return this.gPUAmount;
		}

		public void setGPUAmount(Integer gPUAmount) {
			this.gPUAmount = gPUAmount;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getInternetMaxBandwidthOut() {
			return this.internetMaxBandwidthOut;
		}

		public void setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
			this.internetMaxBandwidthOut = internetMaxBandwidthOut;
		}

		public Integer getInternetMaxBandwidthIn() {
			return this.internetMaxBandwidthIn;
		}

		public void setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
			this.internetMaxBandwidthIn = internetMaxBandwidthIn;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getInstanceChargeType() {
			return this.instanceChargeType;
		}

		public void setInstanceChargeType(String instanceChargeType) {
			this.instanceChargeType = instanceChargeType;
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

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public Integer getCpu() {
			return this.cpu;
		}

		public void setCpu(Integer cpu) {
			this.cpu = cpu;
		}

		public Integer getLocalStorageAmount() {
			return this.localStorageAmount;
		}

		public void setLocalStorageAmount(Integer localStorageAmount) {
			this.localStorageAmount = localStorageAmount;
		}

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getInternetChargeType() {
			return this.internetChargeType;
		}

		public void setInternetChargeType(String internetChargeType) {
			this.internetChargeType = internetChargeType;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public Boolean getRecyclable() {
			return this.recyclable;
		}

		public void setRecyclable(Boolean recyclable) {
			this.recyclable = recyclable;
		}

		public String getISP() {
			return this.iSP;
		}

		public void setISP(String iSP) {
			this.iSP = iSP;
		}

		public String getCreditSpecification() {
			return this.creditSpecification;
		}

		public void setCreditSpecification(String creditSpecification) {
			this.creditSpecification = creditSpecification;
		}

		public String getInstanceTypeFamily() {
			return this.instanceTypeFamily;
		}

		public void setInstanceTypeFamily(String instanceTypeFamily) {
			this.instanceTypeFamily = instanceTypeFamily;
		}

		public String getOSType() {
			return this.oSType;
		}

		public void setOSType(String oSType) {
			this.oSType = oSType;
		}

		public List<NetworkInterface> getNetworkInterfaces() {
			return this.networkInterfaces;
		}

		public void setNetworkInterfaces(List<NetworkInterface> networkInterfaces) {
			this.networkInterfaces = networkInterfaces;
		}

		public List<LockReason> getOperationLocks() {
			return this.operationLocks;
		}

		public void setOperationLocks(List<LockReason> operationLocks) {
			this.operationLocks = operationLocks;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<String> getRdmaIpAddress() {
			return this.rdmaIpAddress;
		}

		public void setRdmaIpAddress(List<String> rdmaIpAddress) {
			this.rdmaIpAddress = rdmaIpAddress;
		}

		public List<String> getSecurityGroupIds() {
			return this.securityGroupIds;
		}

		public void setSecurityGroupIds(List<String> securityGroupIds) {
			this.securityGroupIds = securityGroupIds;
		}

		public List<String> getPublicIpAddress() {
			return this.publicIpAddress;
		}

		public void setPublicIpAddress(List<String> publicIpAddress) {
			this.publicIpAddress = publicIpAddress;
		}

		public List<String> getInnerIpAddress() {
			return this.innerIpAddress;
		}

		public void setInnerIpAddress(List<String> innerIpAddress) {
			this.innerIpAddress = innerIpAddress;
		}

		public VpcAttributes getVpcAttributes() {
			return this.vpcAttributes;
		}

		public void setVpcAttributes(VpcAttributes vpcAttributes) {
			this.vpcAttributes = vpcAttributes;
		}

		public EipAddress getEipAddress() {
			return this.eipAddress;
		}

		public void setEipAddress(EipAddress eipAddress) {
			this.eipAddress = eipAddress;
		}

		public HibernationOptions getHibernationOptions() {
			return this.hibernationOptions;
		}

		public void setHibernationOptions(HibernationOptions hibernationOptions) {
			this.hibernationOptions = hibernationOptions;
		}

		public DedicatedHostAttribute getDedicatedHostAttribute() {
			return this.dedicatedHostAttribute;
		}

		public void setDedicatedHostAttribute(DedicatedHostAttribute dedicatedHostAttribute) {
			this.dedicatedHostAttribute = dedicatedHostAttribute;
		}

		public EcsCapacityReservationAttr getEcsCapacityReservationAttr() {
			return this.ecsCapacityReservationAttr;
		}

		public void setEcsCapacityReservationAttr(EcsCapacityReservationAttr ecsCapacityReservationAttr) {
			this.ecsCapacityReservationAttr = ecsCapacityReservationAttr;
		}

		public DedicatedInstanceAttribute getDedicatedInstanceAttribute() {
			return this.dedicatedInstanceAttribute;
		}

		public void setDedicatedInstanceAttribute(DedicatedInstanceAttribute dedicatedInstanceAttribute) {
			this.dedicatedInstanceAttribute = dedicatedInstanceAttribute;
		}

		public CpuOptions getCpuOptions() {
			return this.cpuOptions;
		}

		public void setCpuOptions(CpuOptions cpuOptions) {
			this.cpuOptions = cpuOptions;
		}

		public MetadataOptions getMetadataOptions() {
			return this.metadataOptions;
		}

		public void setMetadataOptions(MetadataOptions metadataOptions) {
			this.metadataOptions = metadataOptions;
		}

		public static class NetworkInterface {

			private String type;

			private String macAddress;

			private String primaryIpAddress;

			private String networkInterfaceId;

			private List<PrivateIpSet> privateIpSets;

			private List<Ipv6Set> ipv6Sets;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getMacAddress() {
				return this.macAddress;
			}

			public void setMacAddress(String macAddress) {
				this.macAddress = macAddress;
			}

			public String getPrimaryIpAddress() {
				return this.primaryIpAddress;
			}

			public void setPrimaryIpAddress(String primaryIpAddress) {
				this.primaryIpAddress = primaryIpAddress;
			}

			public String getNetworkInterfaceId() {
				return this.networkInterfaceId;
			}

			public void setNetworkInterfaceId(String networkInterfaceId) {
				this.networkInterfaceId = networkInterfaceId;
			}

			public List<PrivateIpSet> getPrivateIpSets() {
				return this.privateIpSets;
			}

			public void setPrivateIpSets(List<PrivateIpSet> privateIpSets) {
				this.privateIpSets = privateIpSets;
			}

			public List<Ipv6Set> getIpv6Sets() {
				return this.ipv6Sets;
			}

			public void setIpv6Sets(List<Ipv6Set> ipv6Sets) {
				this.ipv6Sets = ipv6Sets;
			}

			public static class PrivateIpSet {

				private String privateIpAddress;

				private Boolean primary;

				public String getPrivateIpAddress() {
					return this.privateIpAddress;
				}

				public void setPrivateIpAddress(String privateIpAddress) {
					this.privateIpAddress = privateIpAddress;
				}

				public Boolean getPrimary() {
					return this.primary;
				}

				public void setPrimary(Boolean primary) {
					this.primary = primary;
				}
			}

			public static class Ipv6Set {

				private String ipv6Address;

				public String getIpv6Address() {
					return this.ipv6Address;
				}

				public void setIpv6Address(String ipv6Address) {
					this.ipv6Address = ipv6Address;
				}
			}
		}

		public static class LockReason {

			private String lockMsg;

			private String lockReason;

			public String getLockMsg() {
				return this.lockMsg;
			}

			public void setLockMsg(String lockMsg) {
				this.lockMsg = lockMsg;
			}

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

		public static class VpcAttributes {

			private String vpcId;

			private String natIpAddress;

			private String vSwitchId;

			private List<String> privateIpAddress;

			public String getVpcId() {
				return this.vpcId;
			}

			public void setVpcId(String vpcId) {
				this.vpcId = vpcId;
			}

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

			public List<String> getPrivateIpAddress() {
				return this.privateIpAddress;
			}

			public void setPrivateIpAddress(List<String> privateIpAddress) {
				this.privateIpAddress = privateIpAddress;
			}
		}

		public static class EipAddress {

			private Boolean isSupportUnassociate;

			private String internetChargeType;

			private String ipAddress;

			private Integer bandwidth;

			private String allocationId;

			public Boolean getIsSupportUnassociate() {
				return this.isSupportUnassociate;
			}

			public void setIsSupportUnassociate(Boolean isSupportUnassociate) {
				this.isSupportUnassociate = isSupportUnassociate;
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

			public Integer getBandwidth() {
				return this.bandwidth;
			}

			public void setBandwidth(Integer bandwidth) {
				this.bandwidth = bandwidth;
			}

			public String getAllocationId() {
				return this.allocationId;
			}

			public void setAllocationId(String allocationId) {
				this.allocationId = allocationId;
			}
		}

		public static class HibernationOptions {

			private Boolean configured;

			public Boolean getConfigured() {
				return this.configured;
			}

			public void setConfigured(Boolean configured) {
				this.configured = configured;
			}
		}

		public static class DedicatedHostAttribute {

			private String dedicatedHostId;

			private String dedicatedHostName;

			private String dedicatedHostClusterId;

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

			public String getDedicatedHostClusterId() {
				return this.dedicatedHostClusterId;
			}

			public void setDedicatedHostClusterId(String dedicatedHostClusterId) {
				this.dedicatedHostClusterId = dedicatedHostClusterId;
			}
		}

		public static class EcsCapacityReservationAttr {

			private String capacityReservationPreference;

			private String capacityReservationId;

			public String getCapacityReservationPreference() {
				return this.capacityReservationPreference;
			}

			public void setCapacityReservationPreference(String capacityReservationPreference) {
				this.capacityReservationPreference = capacityReservationPreference;
			}

			public String getCapacityReservationId() {
				return this.capacityReservationId;
			}

			public void setCapacityReservationId(String capacityReservationId) {
				this.capacityReservationId = capacityReservationId;
			}
		}

		public static class DedicatedInstanceAttribute {

			private String affinity;

			private String tenancy;

			public String getAffinity() {
				return this.affinity;
			}

			public void setAffinity(String affinity) {
				this.affinity = affinity;
			}

			public String getTenancy() {
				return this.tenancy;
			}

			public void setTenancy(String tenancy) {
				this.tenancy = tenancy;
			}
		}

		public static class CpuOptions {

			private String numa;

			private Integer coreCount;

			private Integer threadsPerCore;

			public String getNuma() {
				return this.numa;
			}

			public void setNuma(String numa) {
				this.numa = numa;
			}

			public Integer getCoreCount() {
				return this.coreCount;
			}

			public void setCoreCount(Integer coreCount) {
				this.coreCount = coreCount;
			}

			public Integer getThreadsPerCore() {
				return this.threadsPerCore;
			}

			public void setThreadsPerCore(Integer threadsPerCore) {
				this.threadsPerCore = threadsPerCore;
			}
		}

		public static class MetadataOptions {

			private String httpEndpoint;

			private Integer httpPutResponseHopLimit;

			private String httpTokens;

			public String getHttpEndpoint() {
				return this.httpEndpoint;
			}

			public void setHttpEndpoint(String httpEndpoint) {
				this.httpEndpoint = httpEndpoint;
			}

			public Integer getHttpPutResponseHopLimit() {
				return this.httpPutResponseHopLimit;
			}

			public void setHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
				this.httpPutResponseHopLimit = httpPutResponseHopLimit;
			}

			public String getHttpTokens() {
				return this.httpTokens;
			}

			public void setHttpTokens(String httpTokens) {
				this.httpTokens = httpTokens;
			}
		}
	}

	@Override
	public DescribeInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
