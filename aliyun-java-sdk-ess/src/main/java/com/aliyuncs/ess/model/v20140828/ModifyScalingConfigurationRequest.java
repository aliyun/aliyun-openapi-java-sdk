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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ess.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyScalingConfigurationRequest extends RpcAcsRequest<ModifyScalingConfigurationResponse> {
	   

	private String hpcClusterId;

	private SecurityOptions securityOptions;

	private String keyPairName;

	private List<SpotPriceLimit> spotPriceLimits;

	private Boolean deletionProtection;

	private String resourceGroupId;

	private String privatePoolOptionsMatchCriteria;

	private String hostName;

	private String password;

	private String instanceDescription;

	private Integer storageSetPartitionNumber;

	private List<CustomPriorities> customPrioritiess;

	private String systemDiskAutoSnapshotPolicyId;

	private String privatePoolOptionsId;

	private Boolean imageOptionsLoginAsNonRoot;

	private Integer ipv6AddressCount;

	private Integer cpu;

	private List<String> systemDiskCategoriess;

	private Long ownerId;

	private String scalingConfigurationName;

	private String tags;

	private String scalingConfigurationId;

	private String spotStrategy;

	private Boolean systemDiskBurstingEnabled;

	private String instanceName;

	private String internetChargeType;

	private String zoneId;

	private Integer internetMaxBandwidthIn;

	private List<InstancePatternInfo> instancePatternInfos;

	private String affinity;

	private List<NetworkInterfaces> networkInterfacess;

	private String imageId;

	private Integer memory;

	private String spotInterruptionBehavior;

	private String ioOptimized;

	private List<String> instanceTypess;

	private Integer internetMaxBandwidthOut;

	private String securityGroupId;

	private String systemDiskKMSKeyId;

	private String systemDiskCategory;

	private String systemDiskPerformanceLevel;

	private String userData;

	private Boolean passwordInherit;

	private ResourcePoolOptions resourcePoolOptions;

	private String imageName;

	private String httpEndpoint;

	private String dedicatedHostClusterId;

	private Boolean override;

	private Map<Object,Object> schedulerOptions;

	private String deploymentSetId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String tenancy;

	private String systemDiskDiskName;

	private String ramRoleName;

	private String systemDiskEncryptAlgorithm;

	private String dedicatedHostId;

	private String creditSpecification;

	private Integer spotDuration;

	private List<String> securityGroupIdss;

	private List<DataDisk> dataDisks;

	private List<InstanceTypeOverride> instanceTypeOverrides;

	private Long systemDiskProvisionedIops;

	private Integer loadBalancerWeight;

	private String storageSetId;

	private Integer systemDiskSize;

	private String imageFamily;

	private String httpTokens;

	private String systemDiskDescription;

	private Boolean systemDiskEncrypted;
	public ModifyScalingConfigurationRequest() {
		super("Ess", "2014-08-28", "ModifyScalingConfiguration", "ess");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getHpcClusterId() {
		return this.hpcClusterId;
	}

	public void setHpcClusterId(String hpcClusterId) {
		this.hpcClusterId = hpcClusterId;
		if(hpcClusterId != null){
			putQueryParameter("HpcClusterId", hpcClusterId);
		}
	}

	public SecurityOptions getSecurityOptions() {
		return this.securityOptions;
	}

	public void setSecurityOptions(SecurityOptions securityOptions) {
		this.securityOptions = securityOptions;	
		if (securityOptions != null) {
			
				putQueryParameter("SecurityOptions.ConfidentialComputingMode" , securityOptions.getConfidentialComputingMode());
		}	
	}

	public String getKeyPairName() {
		return this.keyPairName;
	}

	public void setKeyPairName(String keyPairName) {
		this.keyPairName = keyPairName;
		if(keyPairName != null){
			putQueryParameter("KeyPairName", keyPairName);
		}
	}

	public List<SpotPriceLimit> getSpotPriceLimits() {
		return this.spotPriceLimits;
	}

	public void setSpotPriceLimits(List<SpotPriceLimit> spotPriceLimits) {
		this.spotPriceLimits = spotPriceLimits;	
		if (spotPriceLimits != null) {
			for (int depth1 = 0; depth1 < spotPriceLimits.size(); depth1++) {
				putQueryParameter("SpotPriceLimit." + (depth1 + 1) + ".InstanceType" , spotPriceLimits.get(depth1).getInstanceType());
				putQueryParameter("SpotPriceLimit." + (depth1 + 1) + ".PriceLimit" , spotPriceLimits.get(depth1).getPriceLimit());
			}
		}	
	}

	public Boolean getDeletionProtection() {
		return this.deletionProtection;
	}

	public void setDeletionProtection(Boolean deletionProtection) {
		this.deletionProtection = deletionProtection;
		if(deletionProtection != null){
			putQueryParameter("DeletionProtection", deletionProtection.toString());
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getPrivatePoolOptionsMatchCriteria() {
		return this.privatePoolOptionsMatchCriteria;
	}

	public void setPrivatePoolOptionsMatchCriteria(String privatePoolOptionsMatchCriteria) {
		this.privatePoolOptionsMatchCriteria = privatePoolOptionsMatchCriteria;
		if(privatePoolOptionsMatchCriteria != null){
			putQueryParameter("PrivatePoolOptions.MatchCriteria", privatePoolOptionsMatchCriteria);
		}
	}

	public String getHostName() {
		return this.hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
		if(hostName != null){
			putQueryParameter("HostName", hostName);
		}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putQueryParameter("Password", password);
		}
	}

	public String getInstanceDescription() {
		return this.instanceDescription;
	}

	public void setInstanceDescription(String instanceDescription) {
		this.instanceDescription = instanceDescription;
		if(instanceDescription != null){
			putQueryParameter("InstanceDescription", instanceDescription);
		}
	}

	public Integer getStorageSetPartitionNumber() {
		return this.storageSetPartitionNumber;
	}

	public void setStorageSetPartitionNumber(Integer storageSetPartitionNumber) {
		this.storageSetPartitionNumber = storageSetPartitionNumber;
		if(storageSetPartitionNumber != null){
			putQueryParameter("StorageSetPartitionNumber", storageSetPartitionNumber.toString());
		}
	}

	public List<CustomPriorities> getCustomPrioritiess() {
		return this.customPrioritiess;
	}

	public void setCustomPrioritiess(List<CustomPriorities> customPrioritiess) {
		this.customPrioritiess = customPrioritiess;	
		if (customPrioritiess != null) {
			for (int depth1 = 0; depth1 < customPrioritiess.size(); depth1++) {
				putQueryParameter("CustomPriorities." + (depth1 + 1) + ".VswitchId" , customPrioritiess.get(depth1).getVswitchId());
				putQueryParameter("CustomPriorities." + (depth1 + 1) + ".InstanceType" , customPrioritiess.get(depth1).getInstanceType());
			}
		}	
	}

	public String getSystemDiskAutoSnapshotPolicyId() {
		return this.systemDiskAutoSnapshotPolicyId;
	}

	public void setSystemDiskAutoSnapshotPolicyId(String systemDiskAutoSnapshotPolicyId) {
		this.systemDiskAutoSnapshotPolicyId = systemDiskAutoSnapshotPolicyId;
		if(systemDiskAutoSnapshotPolicyId != null){
			putQueryParameter("SystemDisk.AutoSnapshotPolicyId", systemDiskAutoSnapshotPolicyId);
		}
	}

	public String getPrivatePoolOptionsId() {
		return this.privatePoolOptionsId;
	}

	public void setPrivatePoolOptionsId(String privatePoolOptionsId) {
		this.privatePoolOptionsId = privatePoolOptionsId;
		if(privatePoolOptionsId != null){
			putQueryParameter("PrivatePoolOptions.Id", privatePoolOptionsId);
		}
	}

	public Boolean getImageOptionsLoginAsNonRoot() {
		return this.imageOptionsLoginAsNonRoot;
	}

	public void setImageOptionsLoginAsNonRoot(Boolean imageOptionsLoginAsNonRoot) {
		this.imageOptionsLoginAsNonRoot = imageOptionsLoginAsNonRoot;
		if(imageOptionsLoginAsNonRoot != null){
			putQueryParameter("ImageOptions.LoginAsNonRoot", imageOptionsLoginAsNonRoot.toString());
		}
	}

	public Integer getIpv6AddressCount() {
		return this.ipv6AddressCount;
	}

	public void setIpv6AddressCount(Integer ipv6AddressCount) {
		this.ipv6AddressCount = ipv6AddressCount;
		if(ipv6AddressCount != null){
			putQueryParameter("Ipv6AddressCount", ipv6AddressCount.toString());
		}
	}

	public Integer getCpu() {
		return this.cpu;
	}

	public void setCpu(Integer cpu) {
		this.cpu = cpu;
		if(cpu != null){
			putQueryParameter("Cpu", cpu.toString());
		}
	}

	public List<String> getSystemDiskCategoriess() {
		return this.systemDiskCategoriess;
	}

	public void setSystemDiskCategoriess(List<String> systemDiskCategoriess) {
		this.systemDiskCategoriess = systemDiskCategoriess;	
		if (systemDiskCategoriess != null) {
			for (int i = 0; i < systemDiskCategoriess.size(); i++) {
				putQueryParameter("SystemDiskCategories." + (i + 1) , systemDiskCategoriess.get(i));
			}
		}	
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getScalingConfigurationName() {
		return this.scalingConfigurationName;
	}

	public void setScalingConfigurationName(String scalingConfigurationName) {
		this.scalingConfigurationName = scalingConfigurationName;
		if(scalingConfigurationName != null){
			putQueryParameter("ScalingConfigurationName", scalingConfigurationName);
		}
	}

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
		if(tags != null){
			putQueryParameter("Tags", tags);
		}
	}

	public String getScalingConfigurationId() {
		return this.scalingConfigurationId;
	}

	public void setScalingConfigurationId(String scalingConfigurationId) {
		this.scalingConfigurationId = scalingConfigurationId;
		if(scalingConfigurationId != null){
			putQueryParameter("ScalingConfigurationId", scalingConfigurationId);
		}
	}

	public String getSpotStrategy() {
		return this.spotStrategy;
	}

	public void setSpotStrategy(String spotStrategy) {
		this.spotStrategy = spotStrategy;
		if(spotStrategy != null){
			putQueryParameter("SpotStrategy", spotStrategy);
		}
	}

	public Boolean getSystemDiskBurstingEnabled() {
		return this.systemDiskBurstingEnabled;
	}

	public void setSystemDiskBurstingEnabled(Boolean systemDiskBurstingEnabled) {
		this.systemDiskBurstingEnabled = systemDiskBurstingEnabled;
		if(systemDiskBurstingEnabled != null){
			putQueryParameter("SystemDisk.BurstingEnabled", systemDiskBurstingEnabled.toString());
		}
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putQueryParameter("InstanceName", instanceName);
		}
	}

	public String getInternetChargeType() {
		return this.internetChargeType;
	}

	public void setInternetChargeType(String internetChargeType) {
		this.internetChargeType = internetChargeType;
		if(internetChargeType != null){
			putQueryParameter("InternetChargeType", internetChargeType);
		}
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public Integer getInternetMaxBandwidthIn() {
		return this.internetMaxBandwidthIn;
	}

	public void setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
		this.internetMaxBandwidthIn = internetMaxBandwidthIn;
		if(internetMaxBandwidthIn != null){
			putQueryParameter("InternetMaxBandwidthIn", internetMaxBandwidthIn.toString());
		}
	}

	public List<InstancePatternInfo> getInstancePatternInfos() {
		return this.instancePatternInfos;
	}

	public void setInstancePatternInfos(List<InstancePatternInfo> instancePatternInfos) {
		this.instancePatternInfos = instancePatternInfos;	
		if (instancePatternInfos != null) {
			for (int depth1 = 0; depth1 < instancePatternInfos.size(); depth1++) {
				if (instancePatternInfos.get(depth1).getInstanceCategoriess() != null) {
					for (int i = 0; i < instancePatternInfos.get(depth1).getInstanceCategoriess().size(); i++) {
						putQueryParameter("InstancePatternInfo." + (depth1 + 1) + ".InstanceCategories." + (i + 1) , instancePatternInfos.get(depth1).getInstanceCategoriess().get(i));
					}
				}
				putQueryParameter("InstancePatternInfo." + (depth1 + 1) + ".Memory" , instancePatternInfos.get(depth1).getMemory());
				putQueryParameter("InstancePatternInfo." + (depth1 + 1) + ".MaximumCpuCoreCount" , instancePatternInfos.get(depth1).getMaximumCpuCoreCount());
				putQueryParameter("InstancePatternInfo." + (depth1 + 1) + ".MaxPrice" , instancePatternInfos.get(depth1).getMaxPrice());
				putQueryParameter("InstancePatternInfo." + (depth1 + 1) + ".MinimumGpuAmount" , instancePatternInfos.get(depth1).getMinimumGpuAmount());
				putQueryParameter("InstancePatternInfo." + (depth1 + 1) + ".MaximumGpuAmount" , instancePatternInfos.get(depth1).getMaximumGpuAmount());
				putQueryParameter("InstancePatternInfo." + (depth1 + 1) + ".MaximumMemorySize" , instancePatternInfos.get(depth1).getMaximumMemorySize());
				putQueryParameter("InstancePatternInfo." + (depth1 + 1) + ".MinimumInitialCredit" , instancePatternInfos.get(depth1).getMinimumInitialCredit());
				if (instancePatternInfos.get(depth1).getExcludedInstanceTypes() != null) {
					for (int i = 0; i < instancePatternInfos.get(depth1).getExcludedInstanceTypes().size(); i++) {
						putQueryParameter("InstancePatternInfo." + (depth1 + 1) + ".ExcludedInstanceType." + (i + 1) , instancePatternInfos.get(depth1).getExcludedInstanceTypes().get(i));
					}
				}
				putQueryParameter("InstancePatternInfo." + (depth1 + 1) + ".MinimumEniIpv6AddressQuantity" , instancePatternInfos.get(depth1).getMinimumEniIpv6AddressQuantity());
				putQueryParameter("InstancePatternInfo." + (depth1 + 1) + ".MinimumEniPrivateIpAddressQuantity" , instancePatternInfos.get(depth1).getMinimumEniPrivateIpAddressQuantity());
				putQueryParameter("InstancePatternInfo." + (depth1 + 1) + ".BurstablePerformance" , instancePatternInfos.get(depth1).getBurstablePerformance());
				if (instancePatternInfos.get(depth1).getPhysicalProcessorModelss() != null) {
					for (int i = 0; i < instancePatternInfos.get(depth1).getPhysicalProcessorModelss().size(); i++) {
						putQueryParameter("InstancePatternInfo." + (depth1 + 1) + ".PhysicalProcessorModels." + (i + 1) , instancePatternInfos.get(depth1).getPhysicalProcessorModelss().get(i));
					}
				}
				putQueryParameter("InstancePatternInfo." + (depth1 + 1) + ".MinimumCpuCoreCount" , instancePatternInfos.get(depth1).getMinimumCpuCoreCount());
				if (instancePatternInfos.get(depth1).getGpuSpecss() != null) {
					for (int i = 0; i < instancePatternInfos.get(depth1).getGpuSpecss().size(); i++) {
						putQueryParameter("InstancePatternInfo." + (depth1 + 1) + ".GpuSpecs." + (i + 1) , instancePatternInfos.get(depth1).getGpuSpecss().get(i));
					}
				}
				putQueryParameter("InstancePatternInfo." + (depth1 + 1) + ".MinimumEniQuantity" , instancePatternInfos.get(depth1).getMinimumEniQuantity());
				putQueryParameter("InstancePatternInfo." + (depth1 + 1) + ".MinimumMemorySize" , instancePatternInfos.get(depth1).getMinimumMemorySize());
				putQueryParameter("InstancePatternInfo." + (depth1 + 1) + ".Cores" , instancePatternInfos.get(depth1).getCores());
				putQueryParameter("InstancePatternInfo." + (depth1 + 1) + ".InstanceFamilyLevel" , instancePatternInfos.get(depth1).getInstanceFamilyLevel());
				if (instancePatternInfos.get(depth1).getInstanceTypeFamiliess() != null) {
					for (int i = 0; i < instancePatternInfos.get(depth1).getInstanceTypeFamiliess().size(); i++) {
						putQueryParameter("InstancePatternInfo." + (depth1 + 1) + ".InstanceTypeFamilies." + (i + 1) , instancePatternInfos.get(depth1).getInstanceTypeFamiliess().get(i));
					}
				}
				putQueryParameter("InstancePatternInfo." + (depth1 + 1) + ".MinimumBaselineCredit" , instancePatternInfos.get(depth1).getMinimumBaselineCredit());
				if (instancePatternInfos.get(depth1).getCpuArchitecturess() != null) {
					for (int i = 0; i < instancePatternInfos.get(depth1).getCpuArchitecturess().size(); i++) {
						putQueryParameter("InstancePatternInfo." + (depth1 + 1) + ".CpuArchitectures." + (i + 1) , instancePatternInfos.get(depth1).getCpuArchitecturess().get(i));
					}
				}
				if (instancePatternInfos.get(depth1).getArchitectures() != null) {
					for (int i = 0; i < instancePatternInfos.get(depth1).getArchitectures().size(); i++) {
						putQueryParameter("InstancePatternInfo." + (depth1 + 1) + ".Architecture." + (i + 1) , instancePatternInfos.get(depth1).getArchitectures().get(i));
					}
				}
			}
		}	
	}

	public String getAffinity() {
		return this.affinity;
	}

	public void setAffinity(String affinity) {
		this.affinity = affinity;
		if(affinity != null){
			putQueryParameter("Affinity", affinity);
		}
	}

	public List<NetworkInterfaces> getNetworkInterfacess() {
		return this.networkInterfacess;
	}

	public void setNetworkInterfacess(List<NetworkInterfaces> networkInterfacess) {
		this.networkInterfacess = networkInterfacess;	
		if (networkInterfacess != null) {
			for (int depth1 = 0; depth1 < networkInterfacess.size(); depth1++) {
				putQueryParameter("NetworkInterfaces." + (depth1 + 1) + ".Ipv6AddressCount" , networkInterfacess.get(depth1).getIpv6AddressCount());
				putQueryParameter("NetworkInterfaces." + (depth1 + 1) + ".InstanceType" , networkInterfacess.get(depth1).getInstanceType());
				if (networkInterfacess.get(depth1).getSecurityGroupIdss() != null) {
					for (int i = 0; i < networkInterfacess.get(depth1).getSecurityGroupIdss().size(); i++) {
						putQueryParameter("NetworkInterfaces." + (depth1 + 1) + ".SecurityGroupIds." + (i + 1) , networkInterfacess.get(depth1).getSecurityGroupIdss().get(i));
					}
				}
				putQueryParameter("NetworkInterfaces." + (depth1 + 1) + ".NetworkInterfaceTrafficMode" , networkInterfacess.get(depth1).getNetworkInterfaceTrafficMode());
			}
		}	
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("ImageId", imageId);
		}
	}

	public Integer getMemory() {
		return this.memory;
	}

	public void setMemory(Integer memory) {
		this.memory = memory;
		if(memory != null){
			putQueryParameter("Memory", memory.toString());
		}
	}

	public String getSpotInterruptionBehavior() {
		return this.spotInterruptionBehavior;
	}

	public void setSpotInterruptionBehavior(String spotInterruptionBehavior) {
		this.spotInterruptionBehavior = spotInterruptionBehavior;
		if(spotInterruptionBehavior != null){
			putQueryParameter("SpotInterruptionBehavior", spotInterruptionBehavior);
		}
	}

	public String getIoOptimized() {
		return this.ioOptimized;
	}

	public void setIoOptimized(String ioOptimized) {
		this.ioOptimized = ioOptimized;
		if(ioOptimized != null){
			putQueryParameter("IoOptimized", ioOptimized);
		}
	}

	public List<String> getInstanceTypess() {
		return this.instanceTypess;
	}

	public void setInstanceTypess(List<String> instanceTypess) {
		this.instanceTypess = instanceTypess;	
		if (instanceTypess != null) {
			for (int i = 0; i < instanceTypess.size(); i++) {
				putQueryParameter("InstanceTypes." + (i + 1) , instanceTypess.get(i));
			}
		}	
	}

	public Integer getInternetMaxBandwidthOut() {
		return this.internetMaxBandwidthOut;
	}

	public void setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
		this.internetMaxBandwidthOut = internetMaxBandwidthOut;
		if(internetMaxBandwidthOut != null){
			putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut.toString());
		}
	}

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
		if(securityGroupId != null){
			putQueryParameter("SecurityGroupId", securityGroupId);
		}
	}

	public String getSystemDiskKMSKeyId() {
		return this.systemDiskKMSKeyId;
	}

	public void setSystemDiskKMSKeyId(String systemDiskKMSKeyId) {
		this.systemDiskKMSKeyId = systemDiskKMSKeyId;
		if(systemDiskKMSKeyId != null){
			putQueryParameter("SystemDisk.KMSKeyId", systemDiskKMSKeyId);
		}
	}

	public String getSystemDiskCategory() {
		return this.systemDiskCategory;
	}

	public void setSystemDiskCategory(String systemDiskCategory) {
		this.systemDiskCategory = systemDiskCategory;
		if(systemDiskCategory != null){
			putQueryParameter("SystemDisk.Category", systemDiskCategory);
		}
	}

	public String getSystemDiskPerformanceLevel() {
		return this.systemDiskPerformanceLevel;
	}

	public void setSystemDiskPerformanceLevel(String systemDiskPerformanceLevel) {
		this.systemDiskPerformanceLevel = systemDiskPerformanceLevel;
		if(systemDiskPerformanceLevel != null){
			putQueryParameter("SystemDisk.PerformanceLevel", systemDiskPerformanceLevel);
		}
	}

	public String getUserData() {
		return this.userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
		if(userData != null){
			putQueryParameter("UserData", userData);
		}
	}

	public Boolean getPasswordInherit() {
		return this.passwordInherit;
	}

	public void setPasswordInherit(Boolean passwordInherit) {
		this.passwordInherit = passwordInherit;
		if(passwordInherit != null){
			putQueryParameter("PasswordInherit", passwordInherit.toString());
		}
	}

	public ResourcePoolOptions getResourcePoolOptions() {
		return this.resourcePoolOptions;
	}

	public void setResourcePoolOptions(ResourcePoolOptions resourcePoolOptions) {
		this.resourcePoolOptions = resourcePoolOptions;	
		if (resourcePoolOptions != null) {
			
				putQueryParameter("ResourcePoolOptions.Strategy" , resourcePoolOptions.getStrategy());
				if (resourcePoolOptions.getPrivatePoolIds() != null) {
					for (int depth1 = 0; depth1 < resourcePoolOptions.getPrivatePoolIds().size(); depth1++) {
						putQueryParameter("ResourcePoolOptions.PrivatePoolIds." + (depth1 + 1) , resourcePoolOptions.getPrivatePoolIds().get(depth1));
					}
				}
		}	
	}

	public String getImageName() {
		return this.imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
		if(imageName != null){
			putQueryParameter("ImageName", imageName);
		}
	}

	public String getHttpEndpoint() {
		return this.httpEndpoint;
	}

	public void setHttpEndpoint(String httpEndpoint) {
		this.httpEndpoint = httpEndpoint;
		if(httpEndpoint != null){
			putQueryParameter("HttpEndpoint", httpEndpoint);
		}
	}

	public String getDedicatedHostClusterId() {
		return this.dedicatedHostClusterId;
	}

	public void setDedicatedHostClusterId(String dedicatedHostClusterId) {
		this.dedicatedHostClusterId = dedicatedHostClusterId;
		if(dedicatedHostClusterId != null){
			putQueryParameter("DedicatedHostClusterId", dedicatedHostClusterId);
		}
	}

	public Boolean getOverride() {
		return this.override;
	}

	public void setOverride(Boolean override) {
		this.override = override;
		if(override != null){
			putQueryParameter("Override", override.toString());
		}
	}

	public Map<Object,Object> getSchedulerOptions() {
		return this.schedulerOptions;
	}

	public void setSchedulerOptions(Map<Object,Object> schedulerOptions) {
		this.schedulerOptions = schedulerOptions;
		if(schedulerOptions != null){
			putQueryParameter("SchedulerOptions", new Gson().toJson(schedulerOptions));
		}
	}

	public String getDeploymentSetId() {
		return this.deploymentSetId;
	}

	public void setDeploymentSetId(String deploymentSetId) {
		this.deploymentSetId = deploymentSetId;
		if(deploymentSetId != null){
			putQueryParameter("DeploymentSetId", deploymentSetId);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getTenancy() {
		return this.tenancy;
	}

	public void setTenancy(String tenancy) {
		this.tenancy = tenancy;
		if(tenancy != null){
			putQueryParameter("Tenancy", tenancy);
		}
	}

	public String getSystemDiskDiskName() {
		return this.systemDiskDiskName;
	}

	public void setSystemDiskDiskName(String systemDiskDiskName) {
		this.systemDiskDiskName = systemDiskDiskName;
		if(systemDiskDiskName != null){
			putQueryParameter("SystemDisk.DiskName", systemDiskDiskName);
		}
	}

	public String getRamRoleName() {
		return this.ramRoleName;
	}

	public void setRamRoleName(String ramRoleName) {
		this.ramRoleName = ramRoleName;
		if(ramRoleName != null){
			putQueryParameter("RamRoleName", ramRoleName);
		}
	}

	public String getSystemDiskEncryptAlgorithm() {
		return this.systemDiskEncryptAlgorithm;
	}

	public void setSystemDiskEncryptAlgorithm(String systemDiskEncryptAlgorithm) {
		this.systemDiskEncryptAlgorithm = systemDiskEncryptAlgorithm;
		if(systemDiskEncryptAlgorithm != null){
			putQueryParameter("SystemDisk.EncryptAlgorithm", systemDiskEncryptAlgorithm);
		}
	}

	public String getDedicatedHostId() {
		return this.dedicatedHostId;
	}

	public void setDedicatedHostId(String dedicatedHostId) {
		this.dedicatedHostId = dedicatedHostId;
		if(dedicatedHostId != null){
			putQueryParameter("DedicatedHostId", dedicatedHostId);
		}
	}

	public String getCreditSpecification() {
		return this.creditSpecification;
	}

	public void setCreditSpecification(String creditSpecification) {
		this.creditSpecification = creditSpecification;
		if(creditSpecification != null){
			putQueryParameter("CreditSpecification", creditSpecification);
		}
	}

	public Integer getSpotDuration() {
		return this.spotDuration;
	}

	public void setSpotDuration(Integer spotDuration) {
		this.spotDuration = spotDuration;
		if(spotDuration != null){
			putQueryParameter("SpotDuration", spotDuration.toString());
		}
	}

	public List<String> getSecurityGroupIdss() {
		return this.securityGroupIdss;
	}

	public void setSecurityGroupIdss(List<String> securityGroupIdss) {
		this.securityGroupIdss = securityGroupIdss;	
		if (securityGroupIdss != null) {
			for (int i = 0; i < securityGroupIdss.size(); i++) {
				putQueryParameter("SecurityGroupIds." + (i + 1) , securityGroupIdss.get(i));
			}
		}	
	}

	public List<DataDisk> getDataDisks() {
		return this.dataDisks;
	}

	public void setDataDisks(List<DataDisk> dataDisks) {
		this.dataDisks = dataDisks;	
		if (dataDisks != null) {
			for (int depth1 = 0; depth1 < dataDisks.size(); depth1++) {
				putQueryParameter("DataDisk." + (depth1 + 1) + ".SnapshotId" , dataDisks.get(depth1).getSnapshotId());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".PerformanceLevel" , dataDisks.get(depth1).getPerformanceLevel());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".AutoSnapshotPolicyId" , dataDisks.get(depth1).getAutoSnapshotPolicyId());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".Description" , dataDisks.get(depth1).getDescription());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".BurstingEnabled" , dataDisks.get(depth1).getBurstingEnabled());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".DiskName" , dataDisks.get(depth1).getDiskName());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".ProvisionedIops" , dataDisks.get(depth1).getProvisionedIops());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".Encrypted" , dataDisks.get(depth1).getEncrypted());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".Size" , dataDisks.get(depth1).getSize());
				if (dataDisks.get(depth1).getCategoriess() != null) {
					for (int i = 0; i < dataDisks.get(depth1).getCategoriess().size(); i++) {
						putQueryParameter("DataDisk." + (depth1 + 1) + ".Categories." + (i + 1) , dataDisks.get(depth1).getCategoriess().get(i));
					}
				}
				putQueryParameter("DataDisk." + (depth1 + 1) + ".Category" , dataDisks.get(depth1).getCategory());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".KMSKeyId" , dataDisks.get(depth1).getKMSKeyId());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".Device" , dataDisks.get(depth1).getDevice());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".DeleteWithInstance" , dataDisks.get(depth1).getDeleteWithInstance());
			}
		}	
	}

	public List<InstanceTypeOverride> getInstanceTypeOverrides() {
		return this.instanceTypeOverrides;
	}

	public void setInstanceTypeOverrides(List<InstanceTypeOverride> instanceTypeOverrides) {
		this.instanceTypeOverrides = instanceTypeOverrides;	
		if (instanceTypeOverrides != null) {
			for (int depth1 = 0; depth1 < instanceTypeOverrides.size(); depth1++) {
				putQueryParameter("InstanceTypeOverride." + (depth1 + 1) + ".WeightedCapacity" , instanceTypeOverrides.get(depth1).getWeightedCapacity());
				putQueryParameter("InstanceTypeOverride." + (depth1 + 1) + ".InstanceType" , instanceTypeOverrides.get(depth1).getInstanceType());
			}
		}	
	}

	public Long getSystemDiskProvisionedIops() {
		return this.systemDiskProvisionedIops;
	}

	public void setSystemDiskProvisionedIops(Long systemDiskProvisionedIops) {
		this.systemDiskProvisionedIops = systemDiskProvisionedIops;
		if(systemDiskProvisionedIops != null){
			putQueryParameter("SystemDisk.ProvisionedIops", systemDiskProvisionedIops.toString());
		}
	}

	public Integer getLoadBalancerWeight() {
		return this.loadBalancerWeight;
	}

	public void setLoadBalancerWeight(Integer loadBalancerWeight) {
		this.loadBalancerWeight = loadBalancerWeight;
		if(loadBalancerWeight != null){
			putQueryParameter("LoadBalancerWeight", loadBalancerWeight.toString());
		}
	}

	public String getStorageSetId() {
		return this.storageSetId;
	}

	public void setStorageSetId(String storageSetId) {
		this.storageSetId = storageSetId;
		if(storageSetId != null){
			putQueryParameter("StorageSetId", storageSetId);
		}
	}

	public Integer getSystemDiskSize() {
		return this.systemDiskSize;
	}

	public void setSystemDiskSize(Integer systemDiskSize) {
		this.systemDiskSize = systemDiskSize;
		if(systemDiskSize != null){
			putQueryParameter("SystemDisk.Size", systemDiskSize.toString());
		}
	}

	public String getImageFamily() {
		return this.imageFamily;
	}

	public void setImageFamily(String imageFamily) {
		this.imageFamily = imageFamily;
		if(imageFamily != null){
			putQueryParameter("ImageFamily", imageFamily);
		}
	}

	public String getHttpTokens() {
		return this.httpTokens;
	}

	public void setHttpTokens(String httpTokens) {
		this.httpTokens = httpTokens;
		if(httpTokens != null){
			putQueryParameter("HttpTokens", httpTokens);
		}
	}

	public String getSystemDiskDescription() {
		return this.systemDiskDescription;
	}

	public void setSystemDiskDescription(String systemDiskDescription) {
		this.systemDiskDescription = systemDiskDescription;
		if(systemDiskDescription != null){
			putQueryParameter("SystemDisk.Description", systemDiskDescription);
		}
	}

	public Boolean getSystemDiskEncrypted() {
		return this.systemDiskEncrypted;
	}

	public void setSystemDiskEncrypted(Boolean systemDiskEncrypted) {
		this.systemDiskEncrypted = systemDiskEncrypted;
		if(systemDiskEncrypted != null){
			putQueryParameter("SystemDisk.Encrypted", systemDiskEncrypted.toString());
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

	public static class SpotPriceLimit {

		private String instanceType;

		private Float priceLimit;

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public Float getPriceLimit() {
			return this.priceLimit;
		}

		public void setPriceLimit(Float priceLimit) {
			this.priceLimit = priceLimit;
		}
	}

	public static class CustomPriorities {

		private String vswitchId;

		private String instanceType;

		public String getVswitchId() {
			return this.vswitchId;
		}

		public void setVswitchId(String vswitchId) {
			this.vswitchId = vswitchId;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}
	}

	public static class InstancePatternInfo {

		private List<String> instanceCategoriess;

		private Float memory;

		private Integer maximumCpuCoreCount;

		private Float maxPrice;

		private Integer minimumGpuAmount;

		private Integer maximumGpuAmount;

		private Float maximumMemorySize;

		private Integer minimumInitialCredit;

		private List<String> excludedInstanceTypes;

		private Integer minimumEniIpv6AddressQuantity;

		private Integer minimumEniPrivateIpAddressQuantity;

		private String burstablePerformance;

		private List<String> physicalProcessorModelss;

		private Integer minimumCpuCoreCount;

		private List<String> gpuSpecss;

		private Integer minimumEniQuantity;

		private Float minimumMemorySize;

		private Integer cores;

		private String instanceFamilyLevel;

		private List<String> instanceTypeFamiliess;

		private Integer minimumBaselineCredit;

		private List<String> cpuArchitecturess;

		private List<String> architectures;

		public List<String> getInstanceCategoriess() {
			return this.instanceCategoriess;
		}

		public void setInstanceCategoriess(List<String> instanceCategoriess) {
			this.instanceCategoriess = instanceCategoriess;
		}

		public Float getMemory() {
			return this.memory;
		}

		public void setMemory(Float memory) {
			this.memory = memory;
		}

		public Integer getMaximumCpuCoreCount() {
			return this.maximumCpuCoreCount;
		}

		public void setMaximumCpuCoreCount(Integer maximumCpuCoreCount) {
			this.maximumCpuCoreCount = maximumCpuCoreCount;
		}

		public Float getMaxPrice() {
			return this.maxPrice;
		}

		public void setMaxPrice(Float maxPrice) {
			this.maxPrice = maxPrice;
		}

		public Integer getMinimumGpuAmount() {
			return this.minimumGpuAmount;
		}

		public void setMinimumGpuAmount(Integer minimumGpuAmount) {
			this.minimumGpuAmount = minimumGpuAmount;
		}

		public Integer getMaximumGpuAmount() {
			return this.maximumGpuAmount;
		}

		public void setMaximumGpuAmount(Integer maximumGpuAmount) {
			this.maximumGpuAmount = maximumGpuAmount;
		}

		public Float getMaximumMemorySize() {
			return this.maximumMemorySize;
		}

		public void setMaximumMemorySize(Float maximumMemorySize) {
			this.maximumMemorySize = maximumMemorySize;
		}

		public Integer getMinimumInitialCredit() {
			return this.minimumInitialCredit;
		}

		public void setMinimumInitialCredit(Integer minimumInitialCredit) {
			this.minimumInitialCredit = minimumInitialCredit;
		}

		public List<String> getExcludedInstanceTypes() {
			return this.excludedInstanceTypes;
		}

		public void setExcludedInstanceTypes(List<String> excludedInstanceTypes) {
			this.excludedInstanceTypes = excludedInstanceTypes;
		}

		public Integer getMinimumEniIpv6AddressQuantity() {
			return this.minimumEniIpv6AddressQuantity;
		}

		public void setMinimumEniIpv6AddressQuantity(Integer minimumEniIpv6AddressQuantity) {
			this.minimumEniIpv6AddressQuantity = minimumEniIpv6AddressQuantity;
		}

		public Integer getMinimumEniPrivateIpAddressQuantity() {
			return this.minimumEniPrivateIpAddressQuantity;
		}

		public void setMinimumEniPrivateIpAddressQuantity(Integer minimumEniPrivateIpAddressQuantity) {
			this.minimumEniPrivateIpAddressQuantity = minimumEniPrivateIpAddressQuantity;
		}

		public String getBurstablePerformance() {
			return this.burstablePerformance;
		}

		public void setBurstablePerformance(String burstablePerformance) {
			this.burstablePerformance = burstablePerformance;
		}

		public List<String> getPhysicalProcessorModelss() {
			return this.physicalProcessorModelss;
		}

		public void setPhysicalProcessorModelss(List<String> physicalProcessorModelss) {
			this.physicalProcessorModelss = physicalProcessorModelss;
		}

		public Integer getMinimumCpuCoreCount() {
			return this.minimumCpuCoreCount;
		}

		public void setMinimumCpuCoreCount(Integer minimumCpuCoreCount) {
			this.minimumCpuCoreCount = minimumCpuCoreCount;
		}

		public List<String> getGpuSpecss() {
			return this.gpuSpecss;
		}

		public void setGpuSpecss(List<String> gpuSpecss) {
			this.gpuSpecss = gpuSpecss;
		}

		public Integer getMinimumEniQuantity() {
			return this.minimumEniQuantity;
		}

		public void setMinimumEniQuantity(Integer minimumEniQuantity) {
			this.minimumEniQuantity = minimumEniQuantity;
		}

		public Float getMinimumMemorySize() {
			return this.minimumMemorySize;
		}

		public void setMinimumMemorySize(Float minimumMemorySize) {
			this.minimumMemorySize = minimumMemorySize;
		}

		public Integer getCores() {
			return this.cores;
		}

		public void setCores(Integer cores) {
			this.cores = cores;
		}

		public String getInstanceFamilyLevel() {
			return this.instanceFamilyLevel;
		}

		public void setInstanceFamilyLevel(String instanceFamilyLevel) {
			this.instanceFamilyLevel = instanceFamilyLevel;
		}

		public List<String> getInstanceTypeFamiliess() {
			return this.instanceTypeFamiliess;
		}

		public void setInstanceTypeFamiliess(List<String> instanceTypeFamiliess) {
			this.instanceTypeFamiliess = instanceTypeFamiliess;
		}

		public Integer getMinimumBaselineCredit() {
			return this.minimumBaselineCredit;
		}

		public void setMinimumBaselineCredit(Integer minimumBaselineCredit) {
			this.minimumBaselineCredit = minimumBaselineCredit;
		}

		public List<String> getCpuArchitecturess() {
			return this.cpuArchitecturess;
		}

		public void setCpuArchitecturess(List<String> cpuArchitecturess) {
			this.cpuArchitecturess = cpuArchitecturess;
		}

		public List<String> getArchitectures() {
			return this.architectures;
		}

		public void setArchitectures(List<String> architectures) {
			this.architectures = architectures;
		}
	}

	public static class NetworkInterfaces {

		private Integer ipv6AddressCount;

		private String instanceType;

		private List<String> securityGroupIdss;

		private String networkInterfaceTrafficMode;

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

		public List<String> getSecurityGroupIdss() {
			return this.securityGroupIdss;
		}

		public void setSecurityGroupIdss(List<String> securityGroupIdss) {
			this.securityGroupIdss = securityGroupIdss;
		}

		public String getNetworkInterfaceTrafficMode() {
			return this.networkInterfaceTrafficMode;
		}

		public void setNetworkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
			this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
		}
	}

	public static class ResourcePoolOptions {

		private String strategy;

		private List<String> privatePoolIds;

		public String getStrategy() {
			return this.strategy;
		}

		public void setStrategy(String strategy) {
			this.strategy = strategy;
		}

		public List<String> getPrivatePoolIds() {
			return this.privatePoolIds;
		}

		public void setPrivatePoolIds(List<String> privatePoolIds) {
			this.privatePoolIds = privatePoolIds;
		}
	}

	public static class DataDisk {

		private String snapshotId;

		private String performanceLevel;

		private String autoSnapshotPolicyId;

		private String description;

		private Boolean burstingEnabled;

		private String diskName;

		private Long provisionedIops;

		private String encrypted;

		private Integer size;

		private List<String> categoriess;

		private String category;

		private String kMSKeyId;

		private String device;

		private Boolean deleteWithInstance;

		public String getSnapshotId() {
			return this.snapshotId;
		}

		public void setSnapshotId(String snapshotId) {
			this.snapshotId = snapshotId;
		}

		public String getPerformanceLevel() {
			return this.performanceLevel;
		}

		public void setPerformanceLevel(String performanceLevel) {
			this.performanceLevel = performanceLevel;
		}

		public String getAutoSnapshotPolicyId() {
			return this.autoSnapshotPolicyId;
		}

		public void setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
			this.autoSnapshotPolicyId = autoSnapshotPolicyId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Boolean getBurstingEnabled() {
			return this.burstingEnabled;
		}

		public void setBurstingEnabled(Boolean burstingEnabled) {
			this.burstingEnabled = burstingEnabled;
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

		public String getEncrypted() {
			return this.encrypted;
		}

		public void setEncrypted(String encrypted) {
			this.encrypted = encrypted;
		}

		public Integer getSize() {
			return this.size;
		}

		public void setSize(Integer size) {
			this.size = size;
		}

		public List<String> getCategoriess() {
			return this.categoriess;
		}

		public void setCategoriess(List<String> categoriess) {
			this.categoriess = categoriess;
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
	}

	public static class InstanceTypeOverride {

		private Integer weightedCapacity;

		private String instanceType;

		public Integer getWeightedCapacity() {
			return this.weightedCapacity;
		}

		public void setWeightedCapacity(Integer weightedCapacity) {
			this.weightedCapacity = weightedCapacity;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}
	}

	@Override
	public Class<ModifyScalingConfigurationResponse> getResponseClass() {
		return ModifyScalingConfigurationResponse.class;
	}

}
