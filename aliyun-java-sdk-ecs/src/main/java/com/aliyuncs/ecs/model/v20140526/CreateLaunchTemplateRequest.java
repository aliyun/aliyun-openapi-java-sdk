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
public class CreateLaunchTemplateRequest extends RpcAcsRequest<CreateLaunchTemplateResponse> {
	   

	private String launchTemplateName;

	private Long resourceOwnerId;

	private Integer httpPutResponseHopLimit;

	private SecurityOptions securityOptions;

	private String securityEnhancementStrategy;

	private String networkType;

	private String keyPairName;

	private Float spotPriceLimit;

	private String imageOwnerAlias;

	private Boolean deletionProtection;

	private String resourceGroupId;

	private String hostName;

	private ImageOptions imageOptions;

	private Integer systemDiskIops;

	private List<TemplateTag> templateTags;

	private List<Tag> tags;

	private String systemDiskAutoSnapshotPolicyId;

	private Integer autoRenewPeriod;

	private Integer period;

	private Integer ipv6AddressCount;

	private String templateResourceGroupId;

	private Long ownerId;

	private String vSwitchId;

	private String spotStrategy;

	private String privateIpAddress;

	private Boolean systemDiskBurstingEnabled;

	private String periodUnit;

	private String instanceName;

	private Boolean autoRenew;

	private String internetChargeType;

	private String zoneId;

	private Integer internetMaxBandwidthIn;

	private String versionDescription;

	private Boolean systemDiskDeleteWithInstance;

	private String imageId;

	private String ioOptimized;

	private String securityGroupId;

	private Integer internetMaxBandwidthOut;

	private String description;

	private String systemDiskKMSKeyId;

	private String systemDiskCategory;

	private String systemDiskPerformanceLevel;

	private String userData;

	private Boolean passwordInherit;

	private String httpEndpoint;

	private String instanceType;

	private String instanceChargeType;

	private Boolean enableVmOsConfig;

	private String deploymentSetId;

	private List<NetworkInterface> networkInterfaces;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String systemDiskDiskName;

	private String ramRoleName;

	private String autoReleaseTime;

	private String creditSpecification;

	private Integer spotDuration;

	private List<String> securityGroupIdss;

	private List<DataDisk> dataDisks;

	private Long systemDiskProvisionedIops;

	private Integer systemDiskSize;

	private String vpcId;

	private String httpTokens;

	private String systemDiskDescription;

	private String systemDiskEncrypted;
	public CreateLaunchTemplateRequest() {
		super("Ecs", "2014-05-26", "CreateLaunchTemplate", "ecs");
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

	public Integer getHttpPutResponseHopLimit() {
		return this.httpPutResponseHopLimit;
	}

	public void setHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
		this.httpPutResponseHopLimit = httpPutResponseHopLimit;
		if(httpPutResponseHopLimit != null){
			putQueryParameter("HttpPutResponseHopLimit", httpPutResponseHopLimit.toString());
		}
	}

	public SecurityOptions getSecurityOptions() {
		return this.securityOptions;
	}

	public void setSecurityOptions(SecurityOptions securityOptions) {
		this.securityOptions = securityOptions;	
		if (securityOptions != null) {
			
				putQueryParameter("SecurityOptions.TrustedSystemMode" , securityOptions.getTrustedSystemMode());
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

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
		if(networkType != null){
			putQueryParameter("NetworkType", networkType);
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

	public Float getSpotPriceLimit() {
		return this.spotPriceLimit;
	}

	public void setSpotPriceLimit(Float spotPriceLimit) {
		this.spotPriceLimit = spotPriceLimit;
		if(spotPriceLimit != null){
			putQueryParameter("SpotPriceLimit", spotPriceLimit.toString());
		}
	}

	public String getImageOwnerAlias() {
		return this.imageOwnerAlias;
	}

	public void setImageOwnerAlias(String imageOwnerAlias) {
		this.imageOwnerAlias = imageOwnerAlias;
		if(imageOwnerAlias != null){
			putQueryParameter("ImageOwnerAlias", imageOwnerAlias);
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

	public ImageOptions getImageOptions() {
		return this.imageOptions;
	}

	public void setImageOptions(ImageOptions imageOptions) {
		this.imageOptions = imageOptions;	
		if (imageOptions != null) {
			
				putQueryParameter("ImageOptions.LoginAsNonRoot" , imageOptions.getLoginAsNonRoot());
		}	
	}

	public Integer getSystemDiskIops() {
		return this.systemDiskIops;
	}

	public void setSystemDiskIops(Integer systemDiskIops) {
		this.systemDiskIops = systemDiskIops;
		if(systemDiskIops != null){
			putQueryParameter("SystemDisk.Iops", systemDiskIops.toString());
		}
	}

	public List<TemplateTag> getTemplateTags() {
		return this.templateTags;
	}

	public void setTemplateTags(List<TemplateTag> templateTags) {
		this.templateTags = templateTags;	
		if (templateTags != null) {
			for (int depth1 = 0; depth1 < templateTags.size(); depth1++) {
				putQueryParameter("TemplateTag." + (depth1 + 1) + ".Key" , templateTags.get(depth1).getKey());
				putQueryParameter("TemplateTag." + (depth1 + 1) + ".Value" , templateTags.get(depth1).getValue());
			}
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

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period.toString());
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

	public String getTemplateResourceGroupId() {
		return this.templateResourceGroupId;
	}

	public void setTemplateResourceGroupId(String templateResourceGroupId) {
		this.templateResourceGroupId = templateResourceGroupId;
		if(templateResourceGroupId != null){
			putQueryParameter("TemplateResourceGroupId", templateResourceGroupId);
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

	public Boolean getSystemDiskBurstingEnabled() {
		return this.systemDiskBurstingEnabled;
	}

	public void setSystemDiskBurstingEnabled(Boolean systemDiskBurstingEnabled) {
		this.systemDiskBurstingEnabled = systemDiskBurstingEnabled;
		if(systemDiskBurstingEnabled != null){
			putQueryParameter("SystemDisk.BurstingEnabled", systemDiskBurstingEnabled.toString());
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

	public Integer getInternetMaxBandwidthIn() {
		return this.internetMaxBandwidthIn;
	}

	public void setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
		this.internetMaxBandwidthIn = internetMaxBandwidthIn;
		if(internetMaxBandwidthIn != null){
			putQueryParameter("InternetMaxBandwidthIn", internetMaxBandwidthIn.toString());
		}
	}

	public String getVersionDescription() {
		return this.versionDescription;
	}

	public void setVersionDescription(String versionDescription) {
		this.versionDescription = versionDescription;
		if(versionDescription != null){
			putQueryParameter("VersionDescription", versionDescription);
		}
	}

	public Boolean getSystemDiskDeleteWithInstance() {
		return this.systemDiskDeleteWithInstance;
	}

	public void setSystemDiskDeleteWithInstance(Boolean systemDiskDeleteWithInstance) {
		this.systemDiskDeleteWithInstance = systemDiskDeleteWithInstance;
		if(systemDiskDeleteWithInstance != null){
			putQueryParameter("SystemDisk.DeleteWithInstance", systemDiskDeleteWithInstance.toString());
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

	public Boolean getEnableVmOsConfig() {
		return this.enableVmOsConfig;
	}

	public void setEnableVmOsConfig(Boolean enableVmOsConfig) {
		this.enableVmOsConfig = enableVmOsConfig;
		if(enableVmOsConfig != null){
			putQueryParameter("EnableVmOsConfig", enableVmOsConfig.toString());
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

	public List<NetworkInterface> getNetworkInterfaces() {
		return this.networkInterfaces;
	}

	public void setNetworkInterfaces(List<NetworkInterface> networkInterfaces) {
		this.networkInterfaces = networkInterfaces;	
		if (networkInterfaces != null) {
			for (int depth1 = 0; depth1 < networkInterfaces.size(); depth1++) {
				putQueryParameter("NetworkInterface." + (depth1 + 1) + ".VSwitchId" , networkInterfaces.get(depth1).getVSwitchId());
				putQueryParameter("NetworkInterface." + (depth1 + 1) + ".NetworkInterfaceName" , networkInterfaces.get(depth1).getNetworkInterfaceName());
				putQueryParameter("NetworkInterface." + (depth1 + 1) + ".Description" , networkInterfaces.get(depth1).getDescription());
				putQueryParameter("NetworkInterface." + (depth1 + 1) + ".SecurityGroupId" , networkInterfaces.get(depth1).getSecurityGroupId());
				putQueryParameter("NetworkInterface." + (depth1 + 1) + ".PrimaryIpAddress" , networkInterfaces.get(depth1).getPrimaryIpAddress());
				if (networkInterfaces.get(depth1).getSecurityGroupIdss() != null) {
					for (int i = 0; i < networkInterfaces.get(depth1).getSecurityGroupIdss().size(); i++) {
						putQueryParameter("NetworkInterface." + (depth1 + 1) + ".SecurityGroupIds." + (i + 1) , networkInterfaces.get(depth1).getSecurityGroupIdss().get(i));
					}
				}
				putQueryParameter("NetworkInterface." + (depth1 + 1) + ".InstanceType" , networkInterfaces.get(depth1).getInstanceType());
				putQueryParameter("NetworkInterface." + (depth1 + 1) + ".NetworkInterfaceTrafficMode" , networkInterfaces.get(depth1).getNetworkInterfaceTrafficMode());
				putQueryParameter("NetworkInterface." + (depth1 + 1) + ".DeleteOnRelease" , networkInterfaces.get(depth1).getDeleteOnRelease());
			}
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

	public String getAutoReleaseTime() {
		return this.autoReleaseTime;
	}

	public void setAutoReleaseTime(String autoReleaseTime) {
		this.autoReleaseTime = autoReleaseTime;
		if(autoReleaseTime != null){
			putQueryParameter("AutoReleaseTime", autoReleaseTime);
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
				putQueryParameter("DataDisk." + (depth1 + 1) + ".PerformanceLevel" , dataDisks.get(depth1).getPerformanceLevel());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".Description" , dataDisks.get(depth1).getDescription());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".SnapshotId" , dataDisks.get(depth1).getSnapshotId());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".Size" , dataDisks.get(depth1).getSize());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".Device" , dataDisks.get(depth1).getDevice());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".DiskName" , dataDisks.get(depth1).getDiskName());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".Category" , dataDisks.get(depth1).getCategory());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".DeleteWithInstance" , dataDisks.get(depth1).getDeleteWithInstance());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".Encrypted" , dataDisks.get(depth1).getEncrypted());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".AutoSnapshotPolicyId" , dataDisks.get(depth1).getAutoSnapshotPolicyId());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".ProvisionedIops" , dataDisks.get(depth1).getProvisionedIops());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".BurstingEnabled" , dataDisks.get(depth1).getBurstingEnabled());
				putQueryParameter("DataDisk." + (depth1 + 1) + ".KMSKeyId" , dataDisks.get(depth1).getKMSKeyId());
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

	public Integer getSystemDiskSize() {
		return this.systemDiskSize;
	}

	public void setSystemDiskSize(Integer systemDiskSize) {
		this.systemDiskSize = systemDiskSize;
		if(systemDiskSize != null){
			putQueryParameter("SystemDisk.Size", systemDiskSize.toString());
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
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

	public String getSystemDiskEncrypted() {
		return this.systemDiskEncrypted;
	}

	public void setSystemDiskEncrypted(String systemDiskEncrypted) {
		this.systemDiskEncrypted = systemDiskEncrypted;
		if(systemDiskEncrypted != null){
			putQueryParameter("SystemDisk.Encrypted", systemDiskEncrypted);
		}
	}

	public static class SecurityOptions {

		private String trustedSystemMode;

		public String getTrustedSystemMode() {
			return this.trustedSystemMode;
		}

		public void setTrustedSystemMode(String trustedSystemMode) {
			this.trustedSystemMode = trustedSystemMode;
		}
	}

	public static class ImageOptions {

		private Boolean loginAsNonRoot;

		public Boolean getLoginAsNonRoot() {
			return this.loginAsNonRoot;
		}

		public void setLoginAsNonRoot(Boolean loginAsNonRoot) {
			this.loginAsNonRoot = loginAsNonRoot;
		}
	}

	public static class TemplateTag {

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

		private String vSwitchId;

		private String networkInterfaceName;

		private String description;

		private String securityGroupId;

		private String primaryIpAddress;

		private List<String> securityGroupIdss;

		private String instanceType;

		private String networkInterfaceTrafficMode;

		private Boolean deleteOnRelease;

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
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

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}

		public String getPrimaryIpAddress() {
			return this.primaryIpAddress;
		}

		public void setPrimaryIpAddress(String primaryIpAddress) {
			this.primaryIpAddress = primaryIpAddress;
		}

		public List<String> getSecurityGroupIdss() {
			return this.securityGroupIdss;
		}

		public void setSecurityGroupIdss(List<String> securityGroupIdss) {
			this.securityGroupIdss = securityGroupIdss;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getNetworkInterfaceTrafficMode() {
			return this.networkInterfaceTrafficMode;
		}

		public void setNetworkInterfaceTrafficMode(String networkInterfaceTrafficMode) {
			this.networkInterfaceTrafficMode = networkInterfaceTrafficMode;
		}

		public Boolean getDeleteOnRelease() {
			return this.deleteOnRelease;
		}

		public void setDeleteOnRelease(Boolean deleteOnRelease) {
			this.deleteOnRelease = deleteOnRelease;
		}
	}

	public static class DataDisk {

		private String performanceLevel;

		private String description;

		private String snapshotId;

		private Integer size;

		private String device;

		private String diskName;

		private String category;

		private Boolean deleteWithInstance;

		private String encrypted;

		private String autoSnapshotPolicyId;

		private Long provisionedIops;

		private Boolean burstingEnabled;

		private String kMSKeyId;

		public String getPerformanceLevel() {
			return this.performanceLevel;
		}

		public void setPerformanceLevel(String performanceLevel) {
			this.performanceLevel = performanceLevel;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
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

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
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

		public String getAutoSnapshotPolicyId() {
			return this.autoSnapshotPolicyId;
		}

		public void setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
			this.autoSnapshotPolicyId = autoSnapshotPolicyId;
		}

		public Long getProvisionedIops() {
			return this.provisionedIops;
		}

		public void setProvisionedIops(Long provisionedIops) {
			this.provisionedIops = provisionedIops;
		}

		public Boolean getBurstingEnabled() {
			return this.burstingEnabled;
		}

		public void setBurstingEnabled(Boolean burstingEnabled) {
			this.burstingEnabled = burstingEnabled;
		}

		public String getKMSKeyId() {
			return this.kMSKeyId;
		}

		public void setKMSKeyId(String kMSKeyId) {
			this.kMSKeyId = kMSKeyId;
		}
	}

	@Override
	public Class<CreateLaunchTemplateResponse> getResponseClass() {
		return CreateLaunchTemplateResponse.class;
	}

}
