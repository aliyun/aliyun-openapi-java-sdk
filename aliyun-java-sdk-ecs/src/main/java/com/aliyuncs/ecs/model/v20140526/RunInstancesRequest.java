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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RunInstancesRequest extends RpcAcsRequest<RunInstancesResponse> {
	   

	private String launchTemplateName;

	private Long resourceOwnerId;

	private Boolean uniqueSuffix;

	private String hpcClusterId;

	private Integer httpPutResponseHopLimit;

	private String securityEnhancementStrategy;

	private String keyPairName;

	private Integer minAmount;

	private Float spotPriceLimit;

	private Boolean deletionProtection;

	private String resourceGroupId;

	private String hostName;

	private String password;

	private Integer storageSetPartitionNumber;

	private List<Tag> tags;

	private String systemDiskAutoSnapshotPolicyId;

	private Integer autoRenewPeriod;

	private Integer cpuOptionsCore;

	private Integer period;

	private Boolean dryRun;

	private String launchTemplateId;

	private Integer ipv6AddressCount;

	private String cpuOptionsNuma;

	private Long ownerId;

	private String vSwitchId;

	private String spotStrategy;

	private String privateIpAddress;

	private String periodUnit;

	private String instanceName;

	private Boolean autoRenew;

	private String internetChargeType;

	private String zoneId;

	private List<String> ipv6Addresss;

	private Integer internetMaxBandwidthIn;

	private String affinity;

	private String imageId;

	private String spotInterruptionBehavior;

	private String clientToken;

	private String ioOptimized;

	private String securityGroupId;

	private Integer internetMaxBandwidthOut;

	private String description;

	private Integer cpuOptionsThreadsPerCore;

	private String systemDiskCategory;

	private String systemDiskPerformanceLevel;

	private String userData;

	private Boolean passwordInherit;

	private String httpEndpoint;

	private String instanceType;

	private String instanceChargeType;

	private List<NetworkInterface> networkInterfaces;

	private String deploymentSetId;

	private Integer amount;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String tenancy;

	private String systemDiskDiskName;

	private String ramRoleName;

	private String autoReleaseTime;

	private String dedicatedHostId;

	private String creditSpecification;

	private List<String> securityGroupIdss;

	private Integer spotDuration;

	private List<DataDisk> dataDisks;

	private Long launchTemplateVersion;

	private String storageSetId;

	private String systemDiskSize;

	private String imageFamily;

	private String httpTokens;

	private String systemDiskDescription;
	public RunInstancesRequest() {
		super("Ecs", "2014-05-26", "RunInstances", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getLaunchTemplateName() {
		return this.launchTemplateName;
	}

	public void setLaunchTemplateName(String launchTemplateName) {
		this.launchTemplateName = launchTemplateName;
		if(launchTemplateName != null){
			putQueryParameter("LaunchTemplateName", launchTemplateName);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public Boolean getUniqueSuffix() {
		return this.uniqueSuffix;
	}

	public void setUniqueSuffix(Boolean uniqueSuffix) {
		this.uniqueSuffix = uniqueSuffix;
		if(uniqueSuffix != null){
			putQueryParameter("UniqueSuffix", uniqueSuffix.toString());
		}
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

	public Integer getHttpPutResponseHopLimit() {
		return this.httpPutResponseHopLimit;
	}

	public void setHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
		this.httpPutResponseHopLimit = httpPutResponseHopLimit;
		if(httpPutResponseHopLimit != null){
			putQueryParameter("HttpPutResponseHopLimit", httpPutResponseHopLimit.toString());
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

	public Integer getMinAmount() {
		return this.minAmount;
	}

	public void setMinAmount(Integer minAmount) {
		this.minAmount = minAmount;
		if(minAmount != null){
			putQueryParameter("MinAmount", minAmount.toString());
		}
	}

	public Float getSpotPriceLimit() {
		return this.spotPriceLimit;
	}

	public void setSpotPriceLimit(Float spotPriceLimit) {
		this.spotPriceLimit = spotPriceLimit;
		if(spotPriceLimit != null){
			putQueryParameter("SpotPriceLimit", spotPriceLimit.toString());
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

	public Integer getStorageSetPartitionNumber() {
		return this.storageSetPartitionNumber;
	}

	public void setStorageSetPartitionNumber(Integer storageSetPartitionNumber) {
		this.storageSetPartitionNumber = storageSetPartitionNumber;
		if(storageSetPartitionNumber != null){
			putQueryParameter("StorageSetPartitionNumber", storageSetPartitionNumber.toString());
		}
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
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

	public Integer getAutoRenewPeriod() {
		return this.autoRenewPeriod;
	}

	public void setAutoRenewPeriod(Integer autoRenewPeriod) {
		this.autoRenewPeriod = autoRenewPeriod;
		if(autoRenewPeriod != null){
			putQueryParameter("AutoRenewPeriod", autoRenewPeriod.toString());
		}
	}

	public Integer getCpuOptionsCore() {
		return this.cpuOptionsCore;
	}

	public void setCpuOptionsCore(Integer cpuOptionsCore) {
		this.cpuOptionsCore = cpuOptionsCore;
		if(cpuOptionsCore != null){
			putQueryParameter("CpuOptions.Core", cpuOptionsCore.toString());
		}
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period.toString());
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public String getLaunchTemplateId() {
		return this.launchTemplateId;
	}

	public void setLaunchTemplateId(String launchTemplateId) {
		this.launchTemplateId = launchTemplateId;
		if(launchTemplateId != null){
			putQueryParameter("LaunchTemplateId", launchTemplateId);
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

	public String getCpuOptionsNuma() {
		return this.cpuOptionsNuma;
	}

	public void setCpuOptionsNuma(String cpuOptionsNuma) {
		this.cpuOptionsNuma = cpuOptionsNuma;
		if(cpuOptionsNuma != null){
			putQueryParameter("CpuOptions.Numa", cpuOptionsNuma);
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

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
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

	public String getPrivateIpAddress() {
		return this.privateIpAddress;
	}

	public void setPrivateIpAddress(String privateIpAddress) {
		this.privateIpAddress = privateIpAddress;
		if(privateIpAddress != null){
			putQueryParameter("PrivateIpAddress", privateIpAddress);
		}
	}

	public String getPeriodUnit() {
		return this.periodUnit;
	}

	public void setPeriodUnit(String periodUnit) {
		this.periodUnit = periodUnit;
		if(periodUnit != null){
			putQueryParameter("PeriodUnit", periodUnit);
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

	public Boolean getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(Boolean autoRenew) {
		this.autoRenew = autoRenew;
		if(autoRenew != null){
			putQueryParameter("AutoRenew", autoRenew.toString());
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

	public List<String> getIpv6Addresss() {
		return this.ipv6Addresss;
	}

	public void setIpv6Addresss(List<String> ipv6Addresss) {
		this.ipv6Addresss = ipv6Addresss;	
		if (ipv6Addresss != null) {
			for (int i = 0; i < ipv6Addresss.size(); i++) {
				putQueryParameter("Ipv6Address." + (i + 1) , ipv6Addresss.get(i));
			}
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

	public String getAffinity() {
		return this.affinity;
	}

	public void setAffinity(String affinity) {
		this.affinity = affinity;
		if(affinity != null){
			putQueryParameter("Affinity", affinity);
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

	public String getSpotInterruptionBehavior() {
		return this.spotInterruptionBehavior;
	}

	public void setSpotInterruptionBehavior(String spotInterruptionBehavior) {
		this.spotInterruptionBehavior = spotInterruptionBehavior;
		if(spotInterruptionBehavior != null){
			putQueryParameter("SpotInterruptionBehavior", spotInterruptionBehavior);
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Integer getCpuOptionsThreadsPerCore() {
		return this.cpuOptionsThreadsPerCore;
	}

	public void setCpuOptionsThreadsPerCore(Integer cpuOptionsThreadsPerCore) {
		this.cpuOptionsThreadsPerCore = cpuOptionsThreadsPerCore;
		if(cpuOptionsThreadsPerCore != null){
			putQueryParameter("CpuOptions.ThreadsPerCore", cpuOptionsThreadsPerCore.toString());
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

	public String getHttpEndpoint() {
		return this.httpEndpoint;
	}

	public void setHttpEndpoint(String httpEndpoint) {
		this.httpEndpoint = httpEndpoint;
		if(httpEndpoint != null){
			putQueryParameter("HttpEndpoint", httpEndpoint);
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

	public String getInstanceChargeType() {
		return this.instanceChargeType;
	}

	public void setInstanceChargeType(String instanceChargeType) {
		this.instanceChargeType = instanceChargeType;
		if(instanceChargeType != null){
			putQueryParameter("InstanceChargeType", instanceChargeType);
		}
	}

	public List<NetworkInterface> getNetworkInterfaces() {
		return this.networkInterfaces;
	}

	public void setNetworkInterfaces(List<NetworkInterface> networkInterfaces) {
		this.networkInterfaces = networkInterfaces;	
		if (networkInterfaces != null) {
			for (int depth1 = 0; depth1 < networkInterfaces.size(); depth1++) {
				putQueryParameter("NetworkInterface." + (depth1 + 1) + ".PrimaryIpAddress" , networkInterfaces.get(depth1).getPrimaryIpAddress());
				putQueryParameter("NetworkInterface." + (depth1 + 1) + ".VSwitchId" , networkInterfaces.get(depth1).getVSwitchId());
				putQueryParameter("NetworkInterface." + (depth1 + 1) + ".SecurityGroupId" , networkInterfaces.get(depth1).getSecurityGroupId());
				if (networkInterfaces.get(depth1).getSecurityGroupIdss() != null) {
					for (int i = 0; i < networkInterfaces.get(depth1).getSecurityGroupIdss().size(); i++) {
						putQueryParameter("NetworkInterface." + (depth1 + 1) + ".SecurityGroupIds." + (i + 1) , networkInterfaces.get(depth1).getSecurityGroupIdss().get(i));
					}
				}
				putQueryParameter("NetworkInterface." + (depth1 + 1) + ".NetworkInterfaceName" , networkInterfaces.get(depth1).getNetworkInterfaceName());
				putQueryParameter("NetworkInterface." + (depth1 + 1) + ".Description" , networkInterfaces.get(depth1).getDescription());
			}
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

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
		if(amount != null){
			putQueryParameter("Amount", amount.toString());
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

	public String getAutoReleaseTime() {
		return this.autoReleaseTime;
	}

	public void setAutoReleaseTime(String autoReleaseTime) {
		this.autoReleaseTime = autoReleaseTime;
		if(autoReleaseTime != null){
			putQueryParameter("AutoReleaseTime", autoReleaseTime);
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

	public Integer getSpotDuration() {
		return this.spotDuration;
	}

	public void setSpotDuration(Integer spotDuration) {
		this.spotDuration = spotDuration;
		if(spotDuration != null){
			putQueryParameter("SpotDuration", spotDuration.toString());
		}
	}

	public List<DataDisk> getDataDisks() {
		return this.dataDisks;
	}

	public void setDataDisks(List<DataDisk> dataDisks) {
		this.dataDisks = dataDisks;	
		if (dataDisks != null) {
			for (int depth1 = 0; depth1 < dataDisks.size(); depth1++) {
				putQueryParameter("DataDisk." + (depth1 + 1) + ".Size" , dataDisks.get(depth1).getSize());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".SnapshotId" , dataDisks.get(depth1).getSnapshotId());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".Category" , dataDisks.get(depth1).getCategory());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".Encrypted" , dataDisks.get(depth1).getEncrypted());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".KMSKeyId" , dataDisks.get(depth1).getKMSKeyId());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".DiskName" , dataDisks.get(depth1).getDiskName());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".Description" , dataDisks.get(depth1).getDescription());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".Device" , dataDisks.get(depth1).getDevice());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".DeleteWithInstance" , dataDisks.get(depth1).getDeleteWithInstance());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".PerformanceLevel" , dataDisks.get(depth1).getPerformanceLevel());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".AutoSnapshotPolicyId" , dataDisks.get(depth1).getAutoSnapshotPolicyId());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".EncryptAlgorithm" , dataDisks.get(depth1).getEncryptAlgorithm());
			}
		}	
	}

	public Long getLaunchTemplateVersion() {
		return this.launchTemplateVersion;
	}

	public void setLaunchTemplateVersion(Long launchTemplateVersion) {
		this.launchTemplateVersion = launchTemplateVersion;
		if(launchTemplateVersion != null){
			putQueryParameter("LaunchTemplateVersion", launchTemplateVersion.toString());
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

	public String getSystemDiskSize() {
		return this.systemDiskSize;
	}

	public void setSystemDiskSize(String systemDiskSize) {
		this.systemDiskSize = systemDiskSize;
		if(systemDiskSize != null){
			putQueryParameter("SystemDisk.Size", systemDiskSize);
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

	public static class Tag {

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

	public static class NetworkInterface {

		private String primaryIpAddress;

		private String vSwitchId;

		private String securityGroupId;

		private List<String> securityGroupIdss;

		private String networkInterfaceName;

		private String description;

		public String getPrimaryIpAddress() {
			return this.primaryIpAddress;
		}

		public void setPrimaryIpAddress(String primaryIpAddress) {
			this.primaryIpAddress = primaryIpAddress;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}

		public List<String> getSecurityGroupIdss() {
			return this.securityGroupIdss;
		}

		public void setSecurityGroupIdss(List<String> securityGroupIdss) {
			this.securityGroupIdss = securityGroupIdss;
		}

		public String getNetworkInterfaceName() {
			return this.networkInterfaceName;
		}

		public void setNetworkInterfaceName(String networkInterfaceName) {
			this.networkInterfaceName = networkInterfaceName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	public static class DataDisk {

		private Integer size;

		private String snapshotId;

		private String category;

		private String encrypted;

		private String kMSKeyId;

		private String diskName;

		private String description;

		private String device;

		private Boolean deleteWithInstance;

		private String performanceLevel;

		private String autoSnapshotPolicyId;

		private String encryptAlgorithm;

		public Integer getSize() {
			return this.size;
		}

		public void setSize(Integer size) {
			this.size = size;
		}

		public String getSnapshotId() {
			return this.snapshotId;
		}

		public void setSnapshotId(String snapshotId) {
			this.snapshotId = snapshotId;
		}

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

		public String getKMSKeyId() {
			return this.kMSKeyId;
		}

		public void setKMSKeyId(String kMSKeyId) {
			this.kMSKeyId = kMSKeyId;
		}

		public String getDiskName() {
			return this.diskName;
		}

		public void setDiskName(String diskName) {
			this.diskName = diskName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
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

		public String getEncryptAlgorithm() {
			return this.encryptAlgorithm;
		}

		public void setEncryptAlgorithm(String encryptAlgorithm) {
			this.encryptAlgorithm = encryptAlgorithm;
		}
	}

	@Override
	public Class<RunInstancesResponse> getResponseClass() {
		return RunInstancesResponse.class;
	}

}
