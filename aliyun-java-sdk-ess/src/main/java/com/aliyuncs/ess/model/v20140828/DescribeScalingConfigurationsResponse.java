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

package com.aliyuncs.ess.model.v20140828;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ess.transform.v20140828.DescribeScalingConfigurationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeScalingConfigurationsResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private List<ScalingConfiguration> scalingConfigurations;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public List<ScalingConfiguration> getScalingConfigurations() {
		return this.scalingConfigurations;
	}

	public void setScalingConfigurations(List<ScalingConfiguration> scalingConfigurations) {
		this.scalingConfigurations = scalingConfigurations;
	}

	public static class ScalingConfiguration {

		private String scalingConfigurationName;

		private String dedicatedHostId;

		private String resourceGroupId;

		private String systemDiskDescription;

		private Integer memory;

		private Boolean systemDiskBurstingEnabled;

		private Integer cpu;

		private String ramRoleName;

		private Long systemDiskProvisionedIops;

		private String systemDiskPerformanceLevel;

		private String systemDiskEncryptAlgorithm;

		private String imageId;

		private Boolean systemDiskEncrypted;

		private String storageSetId;

		private String hostName;

		private Integer loadBalancerWeight;

		private String scalingGroupId;

		private String imageFamily;

		private Boolean deletionProtection;

		private String httpEndpoint;

		private String internetChargeType;

		private String deploymentSetId;

		private String instanceName;

		private String spotInterruptionBehavior;

		private Integer internetMaxBandwidthOut;

		private String creationTime;

		private String affinity;

		private String privatePoolOptionsMatchCriteria;

		private String scalingConfigurationId;

		private String securityEnhancementStrategy;

		private String dedicatedHostClusterId;

		private String tenancy;

		private String imageOwnerAlias;

		private Integer systemDiskSize;

		private String userData;

		private Integer spotDuration;

		private String lifecycleState;

		private Integer storageSetPartitionNumber;

		private String systemDiskAutoSnapshotPolicyId;

		private String systemDiskName;

		private Integer ipv6AddressCount;

		private Boolean imageOptionsLoginAsNonRoot;

		private String instanceType;

		private String spotStrategy;

		private Boolean passwordInherit;

		private String secondaryEniVSwitchConstraint;

		private String keyPairName;

		private String ioOptimized;

		private String systemDiskKMSKeyId;

		private String zoneId;

		private String hpcClusterId;

		private Boolean passwordSetted;

		private String securityGroupId;

		private String privatePoolOptionsId;

		private String systemDiskCategory;

		private String imageName;

		private String httpTokens;

		private Integer internetMaxBandwidthIn;

		private String instanceGeneration;

		private String instanceDescription;

		private String creditSpecification;

		private List<DataDisk> dataDisks;

		private List<Tag> tags;

		private List<InstancePatternInfo> instancePatternInfos;

		private List<CustomPriority> customPriorities;

		private List<NetworkInterface> networkInterfaces;

		private List<SpotPriceModel> spotPriceLimit;

		private List<String> weightedCapacities;

		private List<String> securityGroupIds;

		private List<String> systemDiskCategories;

		private List<String> instanceTypes;

		private CpuOptions cpuOptions;

		private SecurityOptions securityOptions;

		private SchedulerOptions schedulerOptions;

		private ResourcePoolOptions resourcePoolOptions;

		public String getScalingConfigurationName() {
			return this.scalingConfigurationName;
		}

		public void setScalingConfigurationName(String scalingConfigurationName) {
			this.scalingConfigurationName = scalingConfigurationName;
		}

		public String getDedicatedHostId() {
			return this.dedicatedHostId;
		}

		public void setDedicatedHostId(String dedicatedHostId) {
			this.dedicatedHostId = dedicatedHostId;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getSystemDiskDescription() {
			return this.systemDiskDescription;
		}

		public void setSystemDiskDescription(String systemDiskDescription) {
			this.systemDiskDescription = systemDiskDescription;
		}

		public Integer getMemory() {
			return this.memory;
		}

		public void setMemory(Integer memory) {
			this.memory = memory;
		}

		public Boolean getSystemDiskBurstingEnabled() {
			return this.systemDiskBurstingEnabled;
		}

		public void setSystemDiskBurstingEnabled(Boolean systemDiskBurstingEnabled) {
			this.systemDiskBurstingEnabled = systemDiskBurstingEnabled;
		}

		public Integer getCpu() {
			return this.cpu;
		}

		public void setCpu(Integer cpu) {
			this.cpu = cpu;
		}

		public String getRamRoleName() {
			return this.ramRoleName;
		}

		public void setRamRoleName(String ramRoleName) {
			this.ramRoleName = ramRoleName;
		}

		public Long getSystemDiskProvisionedIops() {
			return this.systemDiskProvisionedIops;
		}

		public void setSystemDiskProvisionedIops(Long systemDiskProvisionedIops) {
			this.systemDiskProvisionedIops = systemDiskProvisionedIops;
		}

		public String getSystemDiskPerformanceLevel() {
			return this.systemDiskPerformanceLevel;
		}

		public void setSystemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
			this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
		}

		public String getSystemDiskEncryptAlgorithm() {
			return this.systemDiskEncryptAlgorithm;
		}

		public void setSystemDiskEncryptAlgorithm(String systemDiskEncryptAlgorithm) {
			this.systemDiskEncryptAlgorithm = systemDiskEncryptAlgorithm;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public Boolean getSystemDiskEncrypted() {
			return this.systemDiskEncrypted;
		}

		public void setSystemDiskEncrypted(Boolean systemDiskEncrypted) {
			this.systemDiskEncrypted = systemDiskEncrypted;
		}

		public String getStorageSetId() {
			return this.storageSetId;
		}

		public void setStorageSetId(String storageSetId) {
			this.storageSetId = storageSetId;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public Integer getLoadBalancerWeight() {
			return this.loadBalancerWeight;
		}

		public void setLoadBalancerWeight(Integer loadBalancerWeight) {
			this.loadBalancerWeight = loadBalancerWeight;
		}

		public String getScalingGroupId() {
			return this.scalingGroupId;
		}

		public void setScalingGroupId(String scalingGroupId) {
			this.scalingGroupId = scalingGroupId;
		}

		public String getImageFamily() {
			return this.imageFamily;
		}

		public void setImageFamily(String imageFamily) {
			this.imageFamily = imageFamily;
		}

		public Boolean getDeletionProtection() {
			return this.deletionProtection;
		}

		public void setDeletionProtection(Boolean deletionProtection) {
			this.deletionProtection = deletionProtection;
		}

		public String getHttpEndpoint() {
			return this.httpEndpoint;
		}

		public void setHttpEndpoint(String httpEndpoint) {
			this.httpEndpoint = httpEndpoint;
		}

		public String getInternetChargeType() {
			return this.internetChargeType;
		}

		public void setInternetChargeType(String internetChargeType) {
			this.internetChargeType = internetChargeType;
		}

		public String getDeploymentSetId() {
			return this.deploymentSetId;
		}

		public void setDeploymentSetId(String deploymentSetId) {
			this.deploymentSetId = deploymentSetId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getSpotInterruptionBehavior() {
			return this.spotInterruptionBehavior;
		}

		public void setSpotInterruptionBehavior(String spotInterruptionBehavior) {
			this.spotInterruptionBehavior = spotInterruptionBehavior;
		}

		public Integer getInternetMaxBandwidthOut() {
			return this.internetMaxBandwidthOut;
		}

		public void setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
			this.internetMaxBandwidthOut = internetMaxBandwidthOut;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getAffinity() {
			return this.affinity;
		}

		public void setAffinity(String affinity) {
			this.affinity = affinity;
		}

		public String getPrivatePoolOptionsMatchCriteria() {
			return this.privatePoolOptionsMatchCriteria;
		}

		public void setPrivatePoolOptionsMatchCriteria(String privatePoolOptionsMatchCriteria) {
			this.privatePoolOptionsMatchCriteria = privatePoolOptionsMatchCriteria;
		}

		public String getScalingConfigurationId() {
			return this.scalingConfigurationId;
		}

		public void setScalingConfigurationId(String scalingConfigurationId) {
			this.scalingConfigurationId = scalingConfigurationId;
		}

		public String getSecurityEnhancementStrategy() {
			return this.securityEnhancementStrategy;
		}

		public void setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
			this.securityEnhancementStrategy = securityEnhancementStrategy;
		}

		public String getDedicatedHostClusterId() {
			return this.dedicatedHostClusterId;
		}

		public void setDedicatedHostClusterId(String dedicatedHostClusterId) {
			this.dedicatedHostClusterId = dedicatedHostClusterId;
		}

		public String getTenancy() {
			return this.tenancy;
		}

		public void setTenancy(String tenancy) {
			this.tenancy = tenancy;
		}

		public String getImageOwnerAlias() {
			return this.imageOwnerAlias;
		}

		public void setImageOwnerAlias(String imageOwnerAlias) {
			this.imageOwnerAlias = imageOwnerAlias;
		}

		public Integer getSystemDiskSize() {
			return this.systemDiskSize;
		}

		public void setSystemDiskSize(Integer systemDiskSize) {
			this.systemDiskSize = systemDiskSize;
		}

		public String getUserData() {
			return this.userData;
		}

		public void setUserData(String userData) {
			this.userData = userData;
		}

		public Integer getSpotDuration() {
			return this.spotDuration;
		}

		public void setSpotDuration(Integer spotDuration) {
			this.spotDuration = spotDuration;
		}

		public String getLifecycleState() {
			return this.lifecycleState;
		}

		public void setLifecycleState(String lifecycleState) {
			this.lifecycleState = lifecycleState;
		}

		public Integer getStorageSetPartitionNumber() {
			return this.storageSetPartitionNumber;
		}

		public void setStorageSetPartitionNumber(Integer storageSetPartitionNumber) {
			this.storageSetPartitionNumber = storageSetPartitionNumber;
		}

		public String getSystemDiskAutoSnapshotPolicyId() {
			return this.systemDiskAutoSnapshotPolicyId;
		}

		public void setSystemDiskAutoSnapshotPolicyId(String systemDiskAutoSnapshotPolicyId) {
			this.systemDiskAutoSnapshotPolicyId = systemDiskAutoSnapshotPolicyId;
		}

		public String getSystemDiskName() {
			return this.systemDiskName;
		}

		public void setSystemDiskName(String systemDiskName) {
			this.systemDiskName = systemDiskName;
		}

		public Integer getIpv6AddressCount() {
			return this.ipv6AddressCount;
		}

		public void setIpv6AddressCount(Integer ipv6AddressCount) {
			this.ipv6AddressCount = ipv6AddressCount;
		}

		public Boolean getImageOptionsLoginAsNonRoot() {
			return this.imageOptionsLoginAsNonRoot;
		}

		public void setImageOptionsLoginAsNonRoot(Boolean imageOptionsLoginAsNonRoot) {
			this.imageOptionsLoginAsNonRoot = imageOptionsLoginAsNonRoot;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getSpotStrategy() {
			return this.spotStrategy;
		}

		public void setSpotStrategy(String spotStrategy) {
			this.spotStrategy = spotStrategy;
		}

		public Boolean getPasswordInherit() {
			return this.passwordInherit;
		}

		public void setPasswordInherit(Boolean passwordInherit) {
			this.passwordInherit = passwordInherit;
		}

		public String getSecondaryEniVSwitchConstraint() {
			return this.secondaryEniVSwitchConstraint;
		}

		public void setSecondaryEniVSwitchConstraint(String secondaryEniVSwitchConstraint) {
			this.secondaryEniVSwitchConstraint = secondaryEniVSwitchConstraint;
		}

		public String getKeyPairName() {
			return this.keyPairName;
		}

		public void setKeyPairName(String keyPairName) {
			this.keyPairName = keyPairName;
		}

		public String getIoOptimized() {
			return this.ioOptimized;
		}

		public void setIoOptimized(String ioOptimized) {
			this.ioOptimized = ioOptimized;
		}

		public String getSystemDiskKMSKeyId() {
			return this.systemDiskKMSKeyId;
		}

		public void setSystemDiskKMSKeyId(String systemDiskKMSKeyId) {
			this.systemDiskKMSKeyId = systemDiskKMSKeyId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getHpcClusterId() {
			return this.hpcClusterId;
		}

		public void setHpcClusterId(String hpcClusterId) {
			this.hpcClusterId = hpcClusterId;
		}

		public Boolean getPasswordSetted() {
			return this.passwordSetted;
		}

		public void setPasswordSetted(Boolean passwordSetted) {
			this.passwordSetted = passwordSetted;
		}

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}

		public String getPrivatePoolOptionsId() {
			return this.privatePoolOptionsId;
		}

		public void setPrivatePoolOptionsId(String privatePoolOptionsId) {
			this.privatePoolOptionsId = privatePoolOptionsId;
		}

		public String getSystemDiskCategory() {
			return this.systemDiskCategory;
		}

		public void setSystemDiskCategory(String systemDiskCategory) {
			this.systemDiskCategory = systemDiskCategory;
		}

		public String getImageName() {
			return this.imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}

		public String getHttpTokens() {
			return this.httpTokens;
		}

		public void setHttpTokens(String httpTokens) {
			this.httpTokens = httpTokens;
		}

		public Integer getInternetMaxBandwidthIn() {
			return this.internetMaxBandwidthIn;
		}

		public void setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
			this.internetMaxBandwidthIn = internetMaxBandwidthIn;
		}

		public String getInstanceGeneration() {
			return this.instanceGeneration;
		}

		public void setInstanceGeneration(String instanceGeneration) {
			this.instanceGeneration = instanceGeneration;
		}

		public String getInstanceDescription() {
			return this.instanceDescription;
		}

		public void setInstanceDescription(String instanceDescription) {
			this.instanceDescription = instanceDescription;
		}

		public String getCreditSpecification() {
			return this.creditSpecification;
		}

		public void setCreditSpecification(String creditSpecification) {
			this.creditSpecification = creditSpecification;
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

		public List<InstancePatternInfo> getInstancePatternInfos() {
			return this.instancePatternInfos;
		}

		public void setInstancePatternInfos(List<InstancePatternInfo> instancePatternInfos) {
			this.instancePatternInfos = instancePatternInfos;
		}

		public List<CustomPriority> getCustomPriorities() {
			return this.customPriorities;
		}

		public void setCustomPriorities(List<CustomPriority> customPriorities) {
			this.customPriorities = customPriorities;
		}

		public List<NetworkInterface> getNetworkInterfaces() {
			return this.networkInterfaces;
		}

		public void setNetworkInterfaces(List<NetworkInterface> networkInterfaces) {
			this.networkInterfaces = networkInterfaces;
		}

		public List<SpotPriceModel> getSpotPriceLimit() {
			return this.spotPriceLimit;
		}

		public void setSpotPriceLimit(List<SpotPriceModel> spotPriceLimit) {
			this.spotPriceLimit = spotPriceLimit;
		}

		public List<String> getWeightedCapacities() {
			return this.weightedCapacities;
		}

		public void setWeightedCapacities(List<String> weightedCapacities) {
			this.weightedCapacities = weightedCapacities;
		}

		public List<String> getSecurityGroupIds() {
			return this.securityGroupIds;
		}

		public void setSecurityGroupIds(List<String> securityGroupIds) {
			this.securityGroupIds = securityGroupIds;
		}

		public List<String> getSystemDiskCategories() {
			return this.systemDiskCategories;
		}

		public void setSystemDiskCategories(List<String> systemDiskCategories) {
			this.systemDiskCategories = systemDiskCategories;
		}

		public List<String> getInstanceTypes() {
			return this.instanceTypes;
		}

		public void setInstanceTypes(List<String> instanceTypes) {
			this.instanceTypes = instanceTypes;
		}

		public CpuOptions getCpuOptions() {
			return this.cpuOptions;
		}

		public void setCpuOptions(CpuOptions cpuOptions) {
			this.cpuOptions = cpuOptions;
		}

		public SecurityOptions getSecurityOptions() {
			return this.securityOptions;
		}

		public void setSecurityOptions(SecurityOptions securityOptions) {
			this.securityOptions = securityOptions;
		}

		public SchedulerOptions getSchedulerOptions() {
			return this.schedulerOptions;
		}

		public void setSchedulerOptions(SchedulerOptions schedulerOptions) {
			this.schedulerOptions = schedulerOptions;
		}

		public ResourcePoolOptions getResourcePoolOptions() {
			return this.resourcePoolOptions;
		}

		public void setResourcePoolOptions(ResourcePoolOptions resourcePoolOptions) {
			this.resourcePoolOptions = resourcePoolOptions;
		}

		public static class DataDisk {

			private Boolean burstingEnabled;

			private String description;

			private String category;

			private String kMSKeyId;

			private String performanceLevel;

			private String device;

			private Integer size;

			private String encrypted;

			private Boolean deleteWithInstance;

			private String autoSnapshotPolicyId;

			private String diskName;

			private Long provisionedIops;

			private String snapshotId;

			private List<String> categories;

			public Boolean getBurstingEnabled() {
				return this.burstingEnabled;
			}

			public void setBurstingEnabled(Boolean burstingEnabled) {
				this.burstingEnabled = burstingEnabled;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public String getKMSKeyId() {
				return this.kMSKeyId;
			}

			public void setKMSKeyId(String kMSKeyId) {
				this.kMSKeyId = kMSKeyId;
			}

			public String getPerformanceLevel() {
				return this.performanceLevel;
			}

			public void setPerformanceLevel(String performanceLevel) {
				this.performanceLevel = performanceLevel;
			}

			public String getDevice() {
				return this.device;
			}

			public void setDevice(String device) {
				this.device = device;
			}

			public Integer getSize() {
				return this.size;
			}

			public void setSize(Integer size) {
				this.size = size;
			}

			public String getEncrypted() {
				return this.encrypted;
			}

			public void setEncrypted(String encrypted) {
				this.encrypted = encrypted;
			}

			public Boolean getDeleteWithInstance() {
				return this.deleteWithInstance;
			}

			public void setDeleteWithInstance(Boolean deleteWithInstance) {
				this.deleteWithInstance = deleteWithInstance;
			}

			public String getAutoSnapshotPolicyId() {
				return this.autoSnapshotPolicyId;
			}

			public void setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
				this.autoSnapshotPolicyId = autoSnapshotPolicyId;
			}

			public String getDiskName() {
				return this.diskName;
			}

			public void setDiskName(String diskName) {
				this.diskName = diskName;
			}

			public Long getProvisionedIops() {
				return this.provisionedIops;
			}

			public void setProvisionedIops(Long provisionedIops) {
				this.provisionedIops = provisionedIops;
			}

			public String getSnapshotId() {
				return this.snapshotId;
			}

			public void setSnapshotId(String snapshotId) {
				this.snapshotId = snapshotId;
			}

			public List<String> getCategories() {
				return this.categories;
			}

			public void setCategories(List<String> categories) {
				this.categories = categories;
			}
		}

		public static class Tag {

			private String value;

			private String key;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}
		}

		public static class InstancePatternInfo {

			private Float memory;

			private Integer minimumEniQuantity;

			private Integer minimumBaselineCredit;

			private Float maximumMemorySize;

			private Integer cores;

			private Integer minimumCpuCoreCount;

			private Integer maximumCpuCoreCount;

			private Integer minimumEniPrivateIpAddressQuantity;

			private String instanceFamilyLevel;

			private Integer maximumGpuAmount;

			private Float minimumMemorySize;

			private Integer minimumEniIpv6AddressQuantity;

			private Integer minimumGpuAmount;

			private Float maxPrice;

			private String burstablePerformance;

			private Integer minimumInitialCredit;

			private List<String> physicalProcessorModels;

			private List<String> excludedInstanceTypes;

			private List<String> cpuArchitectures;

			private List<String> gpuSpecs;

			private List<String> instanceCategories;

			private List<String> instanceTypeFamilies;

			private List<String> architectures;

			public Float getMemory() {
				return this.memory;
			}

			public void setMemory(Float memory) {
				this.memory = memory;
			}

			public Integer getMinimumEniQuantity() {
				return this.minimumEniQuantity;
			}

			public void setMinimumEniQuantity(Integer minimumEniQuantity) {
				this.minimumEniQuantity = minimumEniQuantity;
			}

			public Integer getMinimumBaselineCredit() {
				return this.minimumBaselineCredit;
			}

			public void setMinimumBaselineCredit(Integer minimumBaselineCredit) {
				this.minimumBaselineCredit = minimumBaselineCredit;
			}

			public Float getMaximumMemorySize() {
				return this.maximumMemorySize;
			}

			public void setMaximumMemorySize(Float maximumMemorySize) {
				this.maximumMemorySize = maximumMemorySize;
			}

			public Integer getCores() {
				return this.cores;
			}

			public void setCores(Integer cores) {
				this.cores = cores;
			}

			public Integer getMinimumCpuCoreCount() {
				return this.minimumCpuCoreCount;
			}

			public void setMinimumCpuCoreCount(Integer minimumCpuCoreCount) {
				this.minimumCpuCoreCount = minimumCpuCoreCount;
			}

			public Integer getMaximumCpuCoreCount() {
				return this.maximumCpuCoreCount;
			}

			public void setMaximumCpuCoreCount(Integer maximumCpuCoreCount) {
				this.maximumCpuCoreCount = maximumCpuCoreCount;
			}

			public Integer getMinimumEniPrivateIpAddressQuantity() {
				return this.minimumEniPrivateIpAddressQuantity;
			}

			public void setMinimumEniPrivateIpAddressQuantity(Integer minimumEniPrivateIpAddressQuantity) {
				this.minimumEniPrivateIpAddressQuantity = minimumEniPrivateIpAddressQuantity;
			}

			public String getInstanceFamilyLevel() {
				return this.instanceFamilyLevel;
			}

			public void setInstanceFamilyLevel(String instanceFamilyLevel) {
				this.instanceFamilyLevel = instanceFamilyLevel;
			}

			public Integer getMaximumGpuAmount() {
				return this.maximumGpuAmount;
			}

			public void setMaximumGpuAmount(Integer maximumGpuAmount) {
				this.maximumGpuAmount = maximumGpuAmount;
			}

			public Float getMinimumMemorySize() {
				return this.minimumMemorySize;
			}

			public void setMinimumMemorySize(Float minimumMemorySize) {
				this.minimumMemorySize = minimumMemorySize;
			}

			public Integer getMinimumEniIpv6AddressQuantity() {
				return this.minimumEniIpv6AddressQuantity;
			}

			public void setMinimumEniIpv6AddressQuantity(Integer minimumEniIpv6AddressQuantity) {
				this.minimumEniIpv6AddressQuantity = minimumEniIpv6AddressQuantity;
			}

			public Integer getMinimumGpuAmount() {
				return this.minimumGpuAmount;
			}

			public void setMinimumGpuAmount(Integer minimumGpuAmount) {
				this.minimumGpuAmount = minimumGpuAmount;
			}

			public Float getMaxPrice() {
				return this.maxPrice;
			}

			public void setMaxPrice(Float maxPrice) {
				this.maxPrice = maxPrice;
			}

			public String getBurstablePerformance() {
				return this.burstablePerformance;
			}

			public void setBurstablePerformance(String burstablePerformance) {
				this.burstablePerformance = burstablePerformance;
			}

			public Integer getMinimumInitialCredit() {
				return this.minimumInitialCredit;
			}

			public void setMinimumInitialCredit(Integer minimumInitialCredit) {
				this.minimumInitialCredit = minimumInitialCredit;
			}

			public List<String> getPhysicalProcessorModels() {
				return this.physicalProcessorModels;
			}

			public void setPhysicalProcessorModels(List<String> physicalProcessorModels) {
				this.physicalProcessorModels = physicalProcessorModels;
			}

			public List<String> getExcludedInstanceTypes() {
				return this.excludedInstanceTypes;
			}

			public void setExcludedInstanceTypes(List<String> excludedInstanceTypes) {
				this.excludedInstanceTypes = excludedInstanceTypes;
			}

			public List<String> getCpuArchitectures() {
				return this.cpuArchitectures;
			}

			public void setCpuArchitectures(List<String> cpuArchitectures) {
				this.cpuArchitectures = cpuArchitectures;
			}

			public List<String> getGpuSpecs() {
				return this.gpuSpecs;
			}

			public void setGpuSpecs(List<String> gpuSpecs) {
				this.gpuSpecs = gpuSpecs;
			}

			public List<String> getInstanceCategories() {
				return this.instanceCategories;
			}

			public void setInstanceCategories(List<String> instanceCategories) {
				this.instanceCategories = instanceCategories;
			}

			public List<String> getInstanceTypeFamilies() {
				return this.instanceTypeFamilies;
			}

			public void setInstanceTypeFamilies(List<String> instanceTypeFamilies) {
				this.instanceTypeFamilies = instanceTypeFamilies;
			}

			public List<String> getArchitectures() {
				return this.architectures;
			}

			public void setArchitectures(List<String> architectures) {
				this.architectures = architectures;
			}
		}

		public static class CustomPriority {

			private String instanceType;

			private String vswitchId;

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public String getVswitchId() {
				return this.vswitchId;
			}

			public void setVswitchId(String vswitchId) {
				this.vswitchId = vswitchId;
			}
		}

		public static class NetworkInterface {

			private String networkInterfaceTrafficMode;

			private Integer secondaryPrivateIpAddressCount;

			private Integer ipv6AddressCount;

			private String instanceType;

			private List<String> vSwitchIds;

			private List<String> securityGroupIds1;

			public String getNetworkInterfaceTrafficMode() {
				return this.networkInterfaceTrafficMode;
			}

			public void setNetworkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
				this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
			}

			public Integer getSecondaryPrivateIpAddressCount() {
				return this.secondaryPrivateIpAddressCount;
			}

			public void setSecondaryPrivateIpAddressCount(Integer secondaryPrivateIpAddressCount) {
				this.secondaryPrivateIpAddressCount = secondaryPrivateIpAddressCount;
			}

			public Integer getIpv6AddressCount() {
				return this.ipv6AddressCount;
			}

			public void setIpv6AddressCount(Integer ipv6AddressCount) {
				this.ipv6AddressCount = ipv6AddressCount;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public List<String> getVSwitchIds() {
				return this.vSwitchIds;
			}

			public void setVSwitchIds(List<String> vSwitchIds) {
				this.vSwitchIds = vSwitchIds;
			}

			public List<String> getSecurityGroupIds1() {
				return this.securityGroupIds1;
			}

			public void setSecurityGroupIds1(List<String> securityGroupIds1) {
				this.securityGroupIds1 = securityGroupIds1;
			}
		}

		public static class SpotPriceModel {

			private Float priceLimit;

			private String instanceType;

			public Float getPriceLimit() {
				return this.priceLimit;
			}

			public void setPriceLimit(Float priceLimit) {
				this.priceLimit = priceLimit;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}
		}

		public static class CpuOptions {

			private String nestedVirtualization;

			public String getNestedVirtualization() {
				return this.nestedVirtualization;
			}

			public void setNestedVirtualization(String nestedVirtualization) {
				this.nestedVirtualization = nestedVirtualization;
			}
		}

		public static class SecurityOptions {

			private String confidentialComputingMode;

			public String getConfidentialComputingMode() {
				return this.confidentialComputingMode;
			}

			public void setConfidentialComputingMode(String confidentialComputingMode) {
				this.confidentialComputingMode = confidentialComputingMode;
			}
		}

		public static class SchedulerOptions {

			private String managedPrivateSpaceId;

			public String getManagedPrivateSpaceId() {
				return this.managedPrivateSpaceId;
			}

			public void setManagedPrivateSpaceId(String managedPrivateSpaceId) {
				this.managedPrivateSpaceId = managedPrivateSpaceId;
			}
		}

		public static class ResourcePoolOptions {

			private String strategy;

			private List<PrivatePoolTag> privatePoolTags;

			private List<String> privatePoolIds;

			public String getStrategy() {
				return this.strategy;
			}

			public void setStrategy(String strategy) {
				this.strategy = strategy;
			}

			public List<PrivatePoolTag> getPrivatePoolTags() {
				return this.privatePoolTags;
			}

			public void setPrivatePoolTags(List<PrivatePoolTag> privatePoolTags) {
				this.privatePoolTags = privatePoolTags;
			}

			public List<String> getPrivatePoolIds() {
				return this.privatePoolIds;
			}

			public void setPrivatePoolIds(List<String> privatePoolIds) {
				this.privatePoolIds = privatePoolIds;
			}

			public static class PrivatePoolTag {

				private String value;

				private String key;

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}
			}
		}
	}

	@Override
	public DescribeScalingConfigurationsResponse getInstance(UnmarshallerContext context) {
		return	DescribeScalingConfigurationsResponseUnmarshaller.unmarshall(this, context);
	}
}
