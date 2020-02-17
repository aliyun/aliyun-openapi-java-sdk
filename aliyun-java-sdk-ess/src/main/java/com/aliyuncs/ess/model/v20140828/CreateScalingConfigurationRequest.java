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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateScalingConfigurationRequest extends RpcAcsRequest<CreateScalingConfigurationResponse> {
	   

	private String hpcClusterId;

	private String securityEnhancementStrategy;

	private String keyPairName;

	private List<SpotPriceLimit> spotPriceLimits;

	private String resourceGroupId;

	private String hostName;

	private String password;

	private String instanceDescription;

	private String systemDiskAutoSnapshotPolicyId;

	private Integer ipv6AddressCount;

	private Integer cpu;

	private Long ownerId;

	private String scalingConfigurationName;

	private String tags;

	private String spotStrategy;

	private String instanceName;

	private String internetChargeType;

	private Integer internetMaxBandwidthIn;

	private String imageId;

	private Integer memory;

	private String clientToken;

	private String scalingGroupId;

	private List<String> instanceTypes;

	private String ioOptimized;

	private String securityGroupId;

	private Integer internetMaxBandwidthOut;

	private String systemDiskCategory;

	private String userData;

	private Boolean passwordInherit;

	private String imageName;

	private String instanceType;

	private String deploymentSetId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String systemDiskDiskName;

	private String ramRoleName;

	private List<String> securityGroupIds;

	private List<DataDisk> dataDisks;

	private Integer loadBalancerWeight;

	private Integer systemDiskSize;

	private String systemDiskDescription;
	public CreateScalingConfigurationRequest() {
		super("Ess", "2014-08-28", "CreateScalingConfiguration", "ess");
		setMethod(MethodType.POST);
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

	public String getSecurityEnhancementStrategy() {
		return this.securityEnhancementStrategy;
	}

	public void setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
		this.securityEnhancementStrategy = securityEnhancementStrategy;
		if(securityEnhancementStrategy != null){
			putQueryParameter("SecurityEnhancementStrategy", securityEnhancementStrategy);
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

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
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

	public String getSystemDiskAutoSnapshotPolicyId() {
		return this.systemDiskAutoSnapshotPolicyId;
	}

	public void setSystemDiskAutoSnapshotPolicyId(String systemDiskAutoSnapshotPolicyId) {
		this.systemDiskAutoSnapshotPolicyId = systemDiskAutoSnapshotPolicyId;
		if(systemDiskAutoSnapshotPolicyId != null){
			putQueryParameter("SystemDisk.AutoSnapshotPolicyId", systemDiskAutoSnapshotPolicyId);
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

	public String getSpotStrategy() {
		return this.spotStrategy;
	}

	public void setSpotStrategy(String spotStrategy) {
		this.spotStrategy = spotStrategy;
		if(spotStrategy != null){
			putQueryParameter("SpotStrategy", spotStrategy);
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

	public Integer getInternetMaxBandwidthIn() {
		return this.internetMaxBandwidthIn;
	}

	public void setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
		this.internetMaxBandwidthIn = internetMaxBandwidthIn;
		if(internetMaxBandwidthIn != null){
			putQueryParameter("InternetMaxBandwidthIn", internetMaxBandwidthIn.toString());
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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getScalingGroupId() {
		return this.scalingGroupId;
	}

	public void setScalingGroupId(String scalingGroupId) {
		this.scalingGroupId = scalingGroupId;
		if(scalingGroupId != null){
			putQueryParameter("ScalingGroupId", scalingGroupId);
		}
	}

	public List<String> getInstanceTypes() {
		return this.instanceTypes;
	}

	public void setInstanceTypes(List<String> instanceTypes) {
		this.instanceTypes = instanceTypes;
		if (instanceTypes != null) {
			for (int i = 0; i < instanceTypes.size(); i++) {
				putQueryParameter("InstanceTypes." + (i + 1) , instanceTypes.get(i));
			}
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

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
		if(securityGroupId != null){
			putQueryParameter("SecurityGroupId", securityGroupId);
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

	public String getSystemDiskCategory() {
		return this.systemDiskCategory;
	}

	public void setSystemDiskCategory(String systemDiskCategory) {
		this.systemDiskCategory = systemDiskCategory;
		if(systemDiskCategory != null){
			putQueryParameter("SystemDisk.Category", systemDiskCategory);
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

	public String getImageName() {
		return this.imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
		if(imageName != null){
			putQueryParameter("ImageName", imageName);
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
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

	public List<String> getSecurityGroupIds() {
		return this.securityGroupIds;
	}

	public void setSecurityGroupIds(List<String> securityGroupIds) {
		this.securityGroupIds = securityGroupIds;
		if (securityGroupIds != null) {
			for (int i = 0; i < securityGroupIds.size(); i++) {
				putQueryParameter("SecurityGroupIds." + (i + 1) , securityGroupIds.get(i));
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
				putQueryParameter("DataDisk." + (depth1 + 1) + ".DiskName" , dataDisks.get(depth1).getDiskName());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".SnapshotId" , dataDisks.get(depth1).getSnapshotId());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".Size" , dataDisks.get(depth1).getSize());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".Encrypted" , dataDisks.get(depth1).getEncrypted());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".AutoSnapshotPolicyId" , dataDisks.get(depth1).getAutoSnapshotPolicyId());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".Description" , dataDisks.get(depth1).getDescription());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".Category" , dataDisks.get(depth1).getCategory());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".KMSKeyId" , dataDisks.get(depth1).getKMSKeyId());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".Device" , dataDisks.get(depth1).getDevice());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".DeleteWithInstance" , dataDisks.get(depth1).getDeleteWithInstance());
			}
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

	public Integer getSystemDiskSize() {
		return this.systemDiskSize;
	}

	public void setSystemDiskSize(Integer systemDiskSize) {
		this.systemDiskSize = systemDiskSize;
		if(systemDiskSize != null){
			putQueryParameter("SystemDisk.Size", systemDiskSize.toString());
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

	public static class DataDisk {

		private String diskName;

		private String snapshotId;

		private Integer size;

		private String encrypted;

		private String autoSnapshotPolicyId;

		private String description;

		private String category;

		private String kMSKeyId;

		private String device;

		private Boolean deleteWithInstance;

		public String getDiskName() {
			return this.diskName;
		}

		public void setDiskName(String diskName) {
			this.diskName = diskName;
		}

		public String getSnapshotId() {
			return this.snapshotId;
		}

		public void setSnapshotId(String snapshotId) {
			this.snapshotId = snapshotId;
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

	@Override
	public Class<CreateScalingConfigurationResponse> getResponseClass() {
		return CreateScalingConfigurationResponse.class;
	}

}
