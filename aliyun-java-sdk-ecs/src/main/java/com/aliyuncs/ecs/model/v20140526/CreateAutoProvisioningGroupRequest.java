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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateAutoProvisioningGroupRequest extends RpcAcsRequest<CreateAutoProvisioningGroupResponse> {
	   

	private List<LaunchConfigurationDataDisk> launchConfigurationDataDisks;

	private Long resourceOwnerId;

	private String launchConfigurationSystemDiskCategory;

	private String autoProvisioningGroupType;

	private String launchConfigurationSystemDiskPerformanceLevel;

	private List<String> launchConfigurationHostNamess;

	private List<String> launchConfigurationSecurityGroupIdss;

	private String resourceGroupId;

	private String launchConfigurationImageId;

	private String launchConfigurationResourceGroupId;

	private String launchConfigurationPassword;

	private String launchConfigurationAutoReleaseTime;

	private String payAsYouGoAllocationStrategy;

	private String defaultTargetCapacityType;

	private List<Tag> tags;

	private String launchConfigurationKeyPairName;

	private List<SystemDiskConfig> systemDiskConfigs;

	private List<DataDiskConfig> dataDiskConfigs;

	private String validUntil;

	private String launchTemplateId;

	private PrePaidOptions prePaidOptions;

	private Long ownerId;

	private String launchConfigurationImageFamily;

	private Integer launchConfigurationSystemDiskSize;

	private Integer launchConfigurationInternetMaxBandwidthOut;

	private String launchConfigurationHostName;

	private String minTargetCapacity;

	private String executionMode;

	private Float maxSpotPrice;

	private LaunchConfiguration launchConfiguration;

	private List<LaunchConfigurationArn> launchConfigurationArns;

	private Boolean launchConfigurationPasswordInherit;

	private String clientToken;

	private String launchConfigurationSecurityGroupId;

	private String description;

	private Boolean terminateInstancesWithExpiration;

	private String launchConfigurationUserData;

	private String launchConfigurationCreditSpecification;

	private LaunchConfigurationSystemDisk launchConfigurationSystemDisk;

	private String launchConfigurationInstanceName;

	private String launchConfigurationInstanceDescription;

	private String spotAllocationStrategy;

	@SerializedName("resourcePoolOptions")
	private ResourcePoolOptions resourcePoolOptions;

	private Boolean terminateInstances;

	private String launchConfigurationSystemDiskName;

	private String launchConfigurationSystemDiskDescription;

	private String excessCapacityTerminationPolicy;

	private List<LaunchTemplateConfig> launchTemplateConfigs;

	private String launchConfigurationRamRoleName;

	private Integer launchConfigurationInternetMaxBandwidthIn;

	private String spotInstanceInterruptionBehavior;

	private String launchConfigurationSecurityEnhancementStrategy;

	private List<LaunchConfigurationTag> launchConfigurationTags;

	private String launchConfigurationDeploymentSetId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Integer spotInstancePoolsToUseCount;

	private String launchConfigurationInternetChargeType;

	private String launchTemplateVersion;

	private String launchConfigurationIoOptimized;

	private String payAsYouGoTargetCapacity;

	private Boolean hibernationOptionsConfigured;

	private String totalTargetCapacity;

	private String spotTargetCapacity;

	private String validFrom;

	private String autoProvisioningGroupName;
	public CreateAutoProvisioningGroupRequest() {
		super("Ecs", "2014-05-26", "CreateAutoProvisioningGroup", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<LaunchConfigurationDataDisk> getLaunchConfigurationDataDisks() {
		return this.launchConfigurationDataDisks;
	}

	public void setLaunchConfigurationDataDisks(List<LaunchConfigurationDataDisk> launchConfigurationDataDisks) {
		this.launchConfigurationDataDisks = launchConfigurationDataDisks;	
		if (launchConfigurationDataDisks != null) {
			for (int depth1 = 0; depth1 < launchConfigurationDataDisks.size(); depth1++) {
				putQueryParameter("LaunchConfiguration.DataDisk." + (depth1 + 1) + ".PerformanceLevel" , launchConfigurationDataDisks.get(depth1).getPerformanceLevel());
				putQueryParameter("LaunchConfiguration.DataDisk." + (depth1 + 1) + ".KmsKeyId" , launchConfigurationDataDisks.get(depth1).getKmsKeyId());
				putQueryParameter("LaunchConfiguration.DataDisk." + (depth1 + 1) + ".Description" , launchConfigurationDataDisks.get(depth1).getDescription());
				putQueryParameter("LaunchConfiguration.DataDisk." + (depth1 + 1) + ".SnapshotId" , launchConfigurationDataDisks.get(depth1).getSnapshotId());
				putQueryParameter("LaunchConfiguration.DataDisk." + (depth1 + 1) + ".Size" , launchConfigurationDataDisks.get(depth1).getSize());
				putQueryParameter("LaunchConfiguration.DataDisk." + (depth1 + 1) + ".Device" , launchConfigurationDataDisks.get(depth1).getDevice());
				putQueryParameter("LaunchConfiguration.DataDisk." + (depth1 + 1) + ".DiskName" , launchConfigurationDataDisks.get(depth1).getDiskName());
				putQueryParameter("LaunchConfiguration.DataDisk." + (depth1 + 1) + ".Category" , launchConfigurationDataDisks.get(depth1).getCategory());
				putQueryParameter("LaunchConfiguration.DataDisk." + (depth1 + 1) + ".DeleteWithInstance" , launchConfigurationDataDisks.get(depth1).getDeleteWithInstance());
				putQueryParameter("LaunchConfiguration.DataDisk." + (depth1 + 1) + ".Encrypted" , launchConfigurationDataDisks.get(depth1).getEncrypted());
				putQueryParameter("LaunchConfiguration.DataDisk." + (depth1 + 1) + ".EncryptAlgorithm" , launchConfigurationDataDisks.get(depth1).getEncryptAlgorithm());
				putQueryParameter("LaunchConfiguration.DataDisk." + (depth1 + 1) + ".ProvisionedIops" , launchConfigurationDataDisks.get(depth1).getProvisionedIops());
				putQueryParameter("LaunchConfiguration.DataDisk." + (depth1 + 1) + ".BurstingEnabled" , launchConfigurationDataDisks.get(depth1).getBurstingEnabled());
				putQueryParameter("LaunchConfiguration.DataDisk." + (depth1 + 1) + ".AutoSnapshotPolicyId" , launchConfigurationDataDisks.get(depth1).getAutoSnapshotPolicyId());
			}
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

	public String getLaunchConfigurationSystemDiskCategory() {
		return this.launchConfigurationSystemDiskCategory;
	}

	public void setLaunchConfigurationSystemDiskCategory(String launchConfigurationSystemDiskCategory) {
		this.launchConfigurationSystemDiskCategory = launchConfigurationSystemDiskCategory;
		if(launchConfigurationSystemDiskCategory != null){
			putQueryParameter("LaunchConfiguration.SystemDiskCategory", launchConfigurationSystemDiskCategory);
		}
	}

	public String getAutoProvisioningGroupType() {
		return this.autoProvisioningGroupType;
	}

	public void setAutoProvisioningGroupType(String autoProvisioningGroupType) {
		this.autoProvisioningGroupType = autoProvisioningGroupType;
		if(autoProvisioningGroupType != null){
			putQueryParameter("AutoProvisioningGroupType", autoProvisioningGroupType);
		}
	}

	public String getLaunchConfigurationSystemDiskPerformanceLevel() {
		return this.launchConfigurationSystemDiskPerformanceLevel;
	}

	public void setLaunchConfigurationSystemDiskPerformanceLevel(String launchConfigurationSystemDiskPerformanceLevel) {
		this.launchConfigurationSystemDiskPerformanceLevel = launchConfigurationSystemDiskPerformanceLevel;
		if(launchConfigurationSystemDiskPerformanceLevel != null){
			putQueryParameter("LaunchConfiguration.SystemDiskPerformanceLevel", launchConfigurationSystemDiskPerformanceLevel);
		}
	}

	public List<String> getLaunchConfigurationHostNamess() {
		return this.launchConfigurationHostNamess;
	}

	public void setLaunchConfigurationHostNamess(List<String> launchConfigurationHostNamess) {
		this.launchConfigurationHostNamess = launchConfigurationHostNamess;	
		if (launchConfigurationHostNamess != null) {
			for (int i = 0; i < launchConfigurationHostNamess.size(); i++) {
				putQueryParameter("LaunchConfiguration.HostNames." + (i + 1) , launchConfigurationHostNamess.get(i));
			}
		}	
	}

	public List<String> getLaunchConfigurationSecurityGroupIdss() {
		return this.launchConfigurationSecurityGroupIdss;
	}

	public void setLaunchConfigurationSecurityGroupIdss(List<String> launchConfigurationSecurityGroupIdss) {
		this.launchConfigurationSecurityGroupIdss = launchConfigurationSecurityGroupIdss;	
		if (launchConfigurationSecurityGroupIdss != null) {
			for (int i = 0; i < launchConfigurationSecurityGroupIdss.size(); i++) {
				putQueryParameter("LaunchConfiguration.SecurityGroupIds." + (i + 1) , launchConfigurationSecurityGroupIdss.get(i));
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

	public String getLaunchConfigurationImageId() {
		return this.launchConfigurationImageId;
	}

	public void setLaunchConfigurationImageId(String launchConfigurationImageId) {
		this.launchConfigurationImageId = launchConfigurationImageId;
		if(launchConfigurationImageId != null){
			putQueryParameter("LaunchConfiguration.ImageId", launchConfigurationImageId);
		}
	}

	public String getLaunchConfigurationResourceGroupId() {
		return this.launchConfigurationResourceGroupId;
	}

	public void setLaunchConfigurationResourceGroupId(String launchConfigurationResourceGroupId) {
		this.launchConfigurationResourceGroupId = launchConfigurationResourceGroupId;
		if(launchConfigurationResourceGroupId != null){
			putQueryParameter("LaunchConfiguration.ResourceGroupId", launchConfigurationResourceGroupId);
		}
	}

	public String getLaunchConfigurationPassword() {
		return this.launchConfigurationPassword;
	}

	public void setLaunchConfigurationPassword(String launchConfigurationPassword) {
		this.launchConfigurationPassword = launchConfigurationPassword;
		if(launchConfigurationPassword != null){
			putQueryParameter("LaunchConfiguration.Password", launchConfigurationPassword);
		}
	}

	public String getLaunchConfigurationAutoReleaseTime() {
		return this.launchConfigurationAutoReleaseTime;
	}

	public void setLaunchConfigurationAutoReleaseTime(String launchConfigurationAutoReleaseTime) {
		this.launchConfigurationAutoReleaseTime = launchConfigurationAutoReleaseTime;
		if(launchConfigurationAutoReleaseTime != null){
			putQueryParameter("LaunchConfiguration.AutoReleaseTime", launchConfigurationAutoReleaseTime);
		}
	}

	public String getPayAsYouGoAllocationStrategy() {
		return this.payAsYouGoAllocationStrategy;
	}

	public void setPayAsYouGoAllocationStrategy(String payAsYouGoAllocationStrategy) {
		this.payAsYouGoAllocationStrategy = payAsYouGoAllocationStrategy;
		if(payAsYouGoAllocationStrategy != null){
			putQueryParameter("PayAsYouGoAllocationStrategy", payAsYouGoAllocationStrategy);
		}
	}

	public String getDefaultTargetCapacityType() {
		return this.defaultTargetCapacityType;
	}

	public void setDefaultTargetCapacityType(String defaultTargetCapacityType) {
		this.defaultTargetCapacityType = defaultTargetCapacityType;
		if(defaultTargetCapacityType != null){
			putQueryParameter("DefaultTargetCapacityType", defaultTargetCapacityType);
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

	public String getLaunchConfigurationKeyPairName() {
		return this.launchConfigurationKeyPairName;
	}

	public void setLaunchConfigurationKeyPairName(String launchConfigurationKeyPairName) {
		this.launchConfigurationKeyPairName = launchConfigurationKeyPairName;
		if(launchConfigurationKeyPairName != null){
			putQueryParameter("LaunchConfiguration.KeyPairName", launchConfigurationKeyPairName);
		}
	}

	public List<SystemDiskConfig> getSystemDiskConfigs() {
		return this.systemDiskConfigs;
	}

	public void setSystemDiskConfigs(List<SystemDiskConfig> systemDiskConfigs) {
		this.systemDiskConfigs = systemDiskConfigs;	
		if (systemDiskConfigs != null) {
			for (int depth1 = 0; depth1 < systemDiskConfigs.size(); depth1++) {
				putQueryParameter("SystemDiskConfig." + (depth1 + 1) + ".DiskCategory" , systemDiskConfigs.get(depth1).getDiskCategory());
			}
		}	
	}

	public List<DataDiskConfig> getDataDiskConfigs() {
		return this.dataDiskConfigs;
	}

	public void setDataDiskConfigs(List<DataDiskConfig> dataDiskConfigs) {
		this.dataDiskConfigs = dataDiskConfigs;	
		if (dataDiskConfigs != null) {
			for (int depth1 = 0; depth1 < dataDiskConfigs.size(); depth1++) {
				putQueryParameter("DataDiskConfig." + (depth1 + 1) + ".DiskCategory" , dataDiskConfigs.get(depth1).getDiskCategory());
			}
		}	
	}

	public String getValidUntil() {
		return this.validUntil;
	}

	public void setValidUntil(String validUntil) {
		this.validUntil = validUntil;
		if(validUntil != null){
			putQueryParameter("ValidUntil", validUntil);
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

	public PrePaidOptions getPrePaidOptions() {
		return this.prePaidOptions;
	}

	public void setPrePaidOptions(PrePaidOptions prePaidOptions) {
		this.prePaidOptions = prePaidOptions;	
		if (prePaidOptions != null) {
			
				if (prePaidOptions.getSpecifyCapacityDistribution() != null) {
					for (int depth1 = 0; depth1 < prePaidOptions.getSpecifyCapacityDistribution().size(); depth1++) {
						if (prePaidOptions.getSpecifyCapacityDistribution().get(depth1) != null) {
							
								if (prePaidOptions.getSpecifyCapacityDistribution().get(depth1).getInstanceTypes() != null) {
									for (int depth2 = 0; depth2 < prePaidOptions.getSpecifyCapacityDistribution().get(depth1).getInstanceTypes().size(); depth2++) {
										putQueryParameter("PrePaidOptions.SpecifyCapacityDistribution." + (depth1 + 1) + ".InstanceTypes." + (depth2 + 1) , prePaidOptions.getSpecifyCapacityDistribution().get(depth1).getInstanceTypes().get(depth2));
									}
								}
								putQueryParameter("PrePaidOptions.SpecifyCapacityDistribution." + (depth1 + 1) + ".MinTargetCapacity" , prePaidOptions.getSpecifyCapacityDistribution().get(depth1).getMinTargetCapacity());
						}
					}
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

	public String getLaunchConfigurationImageFamily() {
		return this.launchConfigurationImageFamily;
	}

	public void setLaunchConfigurationImageFamily(String launchConfigurationImageFamily) {
		this.launchConfigurationImageFamily = launchConfigurationImageFamily;
		if(launchConfigurationImageFamily != null){
			putQueryParameter("LaunchConfiguration.ImageFamily", launchConfigurationImageFamily);
		}
	}

	public Integer getLaunchConfigurationSystemDiskSize() {
		return this.launchConfigurationSystemDiskSize;
	}

	public void setLaunchConfigurationSystemDiskSize(Integer launchConfigurationSystemDiskSize) {
		this.launchConfigurationSystemDiskSize = launchConfigurationSystemDiskSize;
		if(launchConfigurationSystemDiskSize != null){
			putQueryParameter("LaunchConfiguration.SystemDiskSize", launchConfigurationSystemDiskSize.toString());
		}
	}

	public Integer getLaunchConfigurationInternetMaxBandwidthOut() {
		return this.launchConfigurationInternetMaxBandwidthOut;
	}

	public void setLaunchConfigurationInternetMaxBandwidthOut(Integer launchConfigurationInternetMaxBandwidthOut) {
		this.launchConfigurationInternetMaxBandwidthOut = launchConfigurationInternetMaxBandwidthOut;
		if(launchConfigurationInternetMaxBandwidthOut != null){
			putQueryParameter("LaunchConfiguration.InternetMaxBandwidthOut", launchConfigurationInternetMaxBandwidthOut.toString());
		}
	}

	public String getLaunchConfigurationHostName() {
		return this.launchConfigurationHostName;
	}

	public void setLaunchConfigurationHostName(String launchConfigurationHostName) {
		this.launchConfigurationHostName = launchConfigurationHostName;
		if(launchConfigurationHostName != null){
			putQueryParameter("LaunchConfiguration.HostName", launchConfigurationHostName);
		}
	}

	public String getMinTargetCapacity() {
		return this.minTargetCapacity;
	}

	public void setMinTargetCapacity(String minTargetCapacity) {
		this.minTargetCapacity = minTargetCapacity;
		if(minTargetCapacity != null){
			putQueryParameter("MinTargetCapacity", minTargetCapacity);
		}
	}

	public String getExecutionMode() {
		return this.executionMode;
	}

	public void setExecutionMode(String executionMode) {
		this.executionMode = executionMode;
		if(executionMode != null){
			putQueryParameter("ExecutionMode", executionMode);
		}
	}

	public Float getMaxSpotPrice() {
		return this.maxSpotPrice;
	}

	public void setMaxSpotPrice(Float maxSpotPrice) {
		this.maxSpotPrice = maxSpotPrice;
		if(maxSpotPrice != null){
			putQueryParameter("MaxSpotPrice", maxSpotPrice.toString());
		}
	}

	public LaunchConfiguration getLaunchConfiguration() {
		return this.launchConfiguration;
	}

	public void setLaunchConfiguration(LaunchConfiguration launchConfiguration) {
		this.launchConfiguration = launchConfiguration;	
		if (launchConfiguration != null) {
			
				putQueryParameter("LaunchConfiguration.Period" , launchConfiguration.getPeriod());
				putQueryParameter("LaunchConfiguration.PeriodUnit" , launchConfiguration.getPeriodUnit());
				putQueryParameter("LaunchConfiguration.AutoRenew" , launchConfiguration.getAutoRenew());
				putQueryParameter("LaunchConfiguration.AutoRenewPeriod" , launchConfiguration.getAutoRenewPeriod());
				putQueryParameter("LaunchConfiguration.SpotDuration" , launchConfiguration.getSpotDuration());
				putQueryParameter("LaunchConfiguration.SpotInterruptionBehavior" , launchConfiguration.getSpotInterruptionBehavior());
				if (launchConfiguration.getImageOptions() != null) {
					
						putQueryParameter("LaunchConfiguration.ImageOptions.LoginAsNonRoot" , launchConfiguration.getImageOptions().getLoginAsNonRoot());
				}
				if (launchConfiguration.getSchedulerOptions() != null) {
					
						putQueryParameter("LaunchConfiguration.SchedulerOptions.DedicatedHostId" , launchConfiguration.getSchedulerOptions().getDedicatedHostId());
						putQueryParameter("LaunchConfiguration.SchedulerOptions.DedicatedHostClusterId" , launchConfiguration.getSchedulerOptions().getDedicatedHostClusterId());
				}
				if (launchConfiguration.getSecurityOptions() != null) {
					
						putQueryParameter("LaunchConfiguration.SecurityOptions.TrustedSystemMode" , launchConfiguration.getSecurityOptions().getTrustedSystemMode());
				}
				if (launchConfiguration.getCpuOptions() != null) {
					
						putQueryParameter("LaunchConfiguration.CpuOptions.Core" , launchConfiguration.getCpuOptions().getCore());
						putQueryParameter("LaunchConfiguration.CpuOptions.ThreadsPerCore" , launchConfiguration.getCpuOptions().getThreadsPerCore());
				}
		}	
	}

	public List<LaunchConfigurationArn> getLaunchConfigurationArns() {
		return this.launchConfigurationArns;
	}

	public void setLaunchConfigurationArns(List<LaunchConfigurationArn> launchConfigurationArns) {
		this.launchConfigurationArns = launchConfigurationArns;	
		if (launchConfigurationArns != null) {
			for (int depth1 = 0; depth1 < launchConfigurationArns.size(); depth1++) {
				putQueryParameter("LaunchConfiguration.Arn." + (depth1 + 1) + ".Rolearn" , launchConfigurationArns.get(depth1).getRolearn());
				putQueryParameter("LaunchConfiguration.Arn." + (depth1 + 1) + ".RoleType" , launchConfigurationArns.get(depth1).getRoleType());
				putQueryParameter("LaunchConfiguration.Arn." + (depth1 + 1) + ".AssumeRoleFor" , launchConfigurationArns.get(depth1).getAssumeRoleFor());
			}
		}	
	}

	public Boolean getLaunchConfigurationPasswordInherit() {
		return this.launchConfigurationPasswordInherit;
	}

	public void setLaunchConfigurationPasswordInherit(Boolean launchConfigurationPasswordInherit) {
		this.launchConfigurationPasswordInherit = launchConfigurationPasswordInherit;
		if(launchConfigurationPasswordInherit != null){
			putQueryParameter("LaunchConfiguration.PasswordInherit", launchConfigurationPasswordInherit.toString());
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

	public String getLaunchConfigurationSecurityGroupId() {
		return this.launchConfigurationSecurityGroupId;
	}

	public void setLaunchConfigurationSecurityGroupId(String launchConfigurationSecurityGroupId) {
		this.launchConfigurationSecurityGroupId = launchConfigurationSecurityGroupId;
		if(launchConfigurationSecurityGroupId != null){
			putQueryParameter("LaunchConfiguration.SecurityGroupId", launchConfigurationSecurityGroupId);
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

	public Boolean getTerminateInstancesWithExpiration() {
		return this.terminateInstancesWithExpiration;
	}

	public void setTerminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
		this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
		if(terminateInstancesWithExpiration != null){
			putQueryParameter("TerminateInstancesWithExpiration", terminateInstancesWithExpiration.toString());
		}
	}

	public String getLaunchConfigurationUserData() {
		return this.launchConfigurationUserData;
	}

	public void setLaunchConfigurationUserData(String launchConfigurationUserData) {
		this.launchConfigurationUserData = launchConfigurationUserData;
		if(launchConfigurationUserData != null){
			putQueryParameter("LaunchConfiguration.UserData", launchConfigurationUserData);
		}
	}

	public String getLaunchConfigurationCreditSpecification() {
		return this.launchConfigurationCreditSpecification;
	}

	public void setLaunchConfigurationCreditSpecification(String launchConfigurationCreditSpecification) {
		this.launchConfigurationCreditSpecification = launchConfigurationCreditSpecification;
		if(launchConfigurationCreditSpecification != null){
			putQueryParameter("LaunchConfiguration.CreditSpecification", launchConfigurationCreditSpecification);
		}
	}

	public LaunchConfigurationSystemDisk getLaunchConfigurationSystemDisk() {
		return this.launchConfigurationSystemDisk;
	}

	public void setLaunchConfigurationSystemDisk(LaunchConfigurationSystemDisk launchConfigurationSystemDisk) {
		this.launchConfigurationSystemDisk = launchConfigurationSystemDisk;	
		if (launchConfigurationSystemDisk != null) {
			
				putQueryParameter("LaunchConfiguration.SystemDisk.Encrypted" , launchConfigurationSystemDisk.getEncrypted());
				putQueryParameter("LaunchConfiguration.SystemDisk.KMSKeyId" , launchConfigurationSystemDisk.getKMSKeyId());
				putQueryParameter("LaunchConfiguration.SystemDisk.EncryptAlgorithm" , launchConfigurationSystemDisk.getEncryptAlgorithm());
				putQueryParameter("LaunchConfiguration.SystemDisk.ProvisionedIops" , launchConfigurationSystemDisk.getProvisionedIops());
				putQueryParameter("LaunchConfiguration.SystemDisk.BurstingEnabled" , launchConfigurationSystemDisk.getBurstingEnabled());
				putQueryParameter("LaunchConfiguration.SystemDisk.AutoSnapshotPolicyId" , launchConfigurationSystemDisk.getAutoSnapshotPolicyId());
		}	
	}

	public String getLaunchConfigurationInstanceName() {
		return this.launchConfigurationInstanceName;
	}

	public void setLaunchConfigurationInstanceName(String launchConfigurationInstanceName) {
		this.launchConfigurationInstanceName = launchConfigurationInstanceName;
		if(launchConfigurationInstanceName != null){
			putQueryParameter("LaunchConfiguration.InstanceName", launchConfigurationInstanceName);
		}
	}

	public String getLaunchConfigurationInstanceDescription() {
		return this.launchConfigurationInstanceDescription;
	}

	public void setLaunchConfigurationInstanceDescription(String launchConfigurationInstanceDescription) {
		this.launchConfigurationInstanceDescription = launchConfigurationInstanceDescription;
		if(launchConfigurationInstanceDescription != null){
			putQueryParameter("LaunchConfiguration.InstanceDescription", launchConfigurationInstanceDescription);
		}
	}

	public String getSpotAllocationStrategy() {
		return this.spotAllocationStrategy;
	}

	public void setSpotAllocationStrategy(String spotAllocationStrategy) {
		this.spotAllocationStrategy = spotAllocationStrategy;
		if(spotAllocationStrategy != null){
			putQueryParameter("SpotAllocationStrategy", spotAllocationStrategy);
		}
	}

	public ResourcePoolOptions getResourcePoolOptions() {
		return this.resourcePoolOptions;
	}

	public void setResourcePoolOptions(ResourcePoolOptions resourcePoolOptions) {
		this.resourcePoolOptions = resourcePoolOptions;	
		if (resourcePoolOptions != null) {
			putQueryParameter("ResourcePoolOptions" , new Gson().toJson(resourcePoolOptions));
		}	
	}

	public Boolean getTerminateInstances() {
		return this.terminateInstances;
	}

	public void setTerminateInstances(Boolean terminateInstances) {
		this.terminateInstances = terminateInstances;
		if(terminateInstances != null){
			putQueryParameter("TerminateInstances", terminateInstances.toString());
		}
	}

	public String getLaunchConfigurationSystemDiskName() {
		return this.launchConfigurationSystemDiskName;
	}

	public void setLaunchConfigurationSystemDiskName(String launchConfigurationSystemDiskName) {
		this.launchConfigurationSystemDiskName = launchConfigurationSystemDiskName;
		if(launchConfigurationSystemDiskName != null){
			putQueryParameter("LaunchConfiguration.SystemDiskName", launchConfigurationSystemDiskName);
		}
	}

	public String getLaunchConfigurationSystemDiskDescription() {
		return this.launchConfigurationSystemDiskDescription;
	}

	public void setLaunchConfigurationSystemDiskDescription(String launchConfigurationSystemDiskDescription) {
		this.launchConfigurationSystemDiskDescription = launchConfigurationSystemDiskDescription;
		if(launchConfigurationSystemDiskDescription != null){
			putQueryParameter("LaunchConfiguration.SystemDiskDescription", launchConfigurationSystemDiskDescription);
		}
	}

	public String getExcessCapacityTerminationPolicy() {
		return this.excessCapacityTerminationPolicy;
	}

	public void setExcessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
		this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
		if(excessCapacityTerminationPolicy != null){
			putQueryParameter("ExcessCapacityTerminationPolicy", excessCapacityTerminationPolicy);
		}
	}

	public List<LaunchTemplateConfig> getLaunchTemplateConfigs() {
		return this.launchTemplateConfigs;
	}

	public void setLaunchTemplateConfigs(List<LaunchTemplateConfig> launchTemplateConfigs) {
		this.launchTemplateConfigs = launchTemplateConfigs;	
		if (launchTemplateConfigs != null) {
			for (int depth1 = 0; depth1 < launchTemplateConfigs.size(); depth1++) {
				putQueryParameter("LaunchTemplateConfig." + (depth1 + 1) + ".VSwitchId" , launchTemplateConfigs.get(depth1).getVSwitchId());
				putQueryParameter("LaunchTemplateConfig." + (depth1 + 1) + ".MaxPrice" , launchTemplateConfigs.get(depth1).getMaxPrice());
				putQueryParameter("LaunchTemplateConfig." + (depth1 + 1) + ".Priority" , launchTemplateConfigs.get(depth1).getPriority());
				putQueryParameter("LaunchTemplateConfig." + (depth1 + 1) + ".InstanceType" , launchTemplateConfigs.get(depth1).getInstanceType());
				putQueryParameter("LaunchTemplateConfig." + (depth1 + 1) + ".WeightedCapacity" , launchTemplateConfigs.get(depth1).getWeightedCapacity());
				putQueryParameter("LaunchTemplateConfig." + (depth1 + 1) + ".MaxQuantity" , launchTemplateConfigs.get(depth1).getMaxQuantity());
				if (launchTemplateConfigs.get(depth1).getCoress() != null) {
					for (int i = 0; i < launchTemplateConfigs.get(depth1).getCoress().size(); i++) {
						putQueryParameter("LaunchTemplateConfig." + (depth1 + 1) + ".Cores." + (i + 1) , launchTemplateConfigs.get(depth1).getCoress().get(i));
					}
				}
				if (launchTemplateConfigs.get(depth1).getMemoriess() != null) {
					for (int i = 0; i < launchTemplateConfigs.get(depth1).getMemoriess().size(); i++) {
						putQueryParameter("LaunchTemplateConfig." + (depth1 + 1) + ".Memories." + (i + 1) , launchTemplateConfigs.get(depth1).getMemoriess().get(i));
					}
				}
				putQueryParameter("LaunchTemplateConfig." + (depth1 + 1) + ".InstanceFamilyLevel" , launchTemplateConfigs.get(depth1).getInstanceFamilyLevel());
				if (launchTemplateConfigs.get(depth1).getExcludedInstanceTypess() != null) {
					for (int i = 0; i < launchTemplateConfigs.get(depth1).getExcludedInstanceTypess().size(); i++) {
						putQueryParameter("LaunchTemplateConfig." + (depth1 + 1) + ".ExcludedInstanceTypes." + (i + 1) , launchTemplateConfigs.get(depth1).getExcludedInstanceTypess().get(i));
					}
				}
				if (launchTemplateConfigs.get(depth1).getArchitecturess() != null) {
					for (int i = 0; i < launchTemplateConfigs.get(depth1).getArchitecturess().size(); i++) {
						putQueryParameter("LaunchTemplateConfig." + (depth1 + 1) + ".Architectures." + (i + 1) , launchTemplateConfigs.get(depth1).getArchitecturess().get(i));
					}
				}
				putQueryParameter("LaunchTemplateConfig." + (depth1 + 1) + ".BurstablePerformance" , launchTemplateConfigs.get(depth1).getBurstablePerformance());
				if (launchTemplateConfigs.get(depth1).getSecondaryNetworkInterfaces() != null) {
					for (int depth2 = 0; depth2 < launchTemplateConfigs.get(depth1).getSecondaryNetworkInterfaces().size(); depth2++) {
						putQueryParameter("LaunchTemplateConfig." + (depth1 + 1) + ".SecondaryNetworkInterface." + (depth2 + 1) + ".VSwitchId" , launchTemplateConfigs.get(depth1).getSecondaryNetworkInterfaces().get(depth2).getVSwitchId());
					}
				}
				putQueryParameter("LaunchTemplateConfig." + (depth1 + 1) + ".ImageId" , launchTemplateConfigs.get(depth1).getImageId());
			}
		}	
	}

	public String getLaunchConfigurationRamRoleName() {
		return this.launchConfigurationRamRoleName;
	}

	public void setLaunchConfigurationRamRoleName(String launchConfigurationRamRoleName) {
		this.launchConfigurationRamRoleName = launchConfigurationRamRoleName;
		if(launchConfigurationRamRoleName != null){
			putQueryParameter("LaunchConfiguration.RamRoleName", launchConfigurationRamRoleName);
		}
	}

	public Integer getLaunchConfigurationInternetMaxBandwidthIn() {
		return this.launchConfigurationInternetMaxBandwidthIn;
	}

	public void setLaunchConfigurationInternetMaxBandwidthIn(Integer launchConfigurationInternetMaxBandwidthIn) {
		this.launchConfigurationInternetMaxBandwidthIn = launchConfigurationInternetMaxBandwidthIn;
		if(launchConfigurationInternetMaxBandwidthIn != null){
			putQueryParameter("LaunchConfiguration.InternetMaxBandwidthIn", launchConfigurationInternetMaxBandwidthIn.toString());
		}
	}

	public String getSpotInstanceInterruptionBehavior() {
		return this.spotInstanceInterruptionBehavior;
	}

	public void setSpotInstanceInterruptionBehavior(String spotInstanceInterruptionBehavior) {
		this.spotInstanceInterruptionBehavior = spotInstanceInterruptionBehavior;
		if(spotInstanceInterruptionBehavior != null){
			putQueryParameter("SpotInstanceInterruptionBehavior", spotInstanceInterruptionBehavior);
		}
	}

	public String getLaunchConfigurationSecurityEnhancementStrategy() {
		return this.launchConfigurationSecurityEnhancementStrategy;
	}

	public void setLaunchConfigurationSecurityEnhancementStrategy(String launchConfigurationSecurityEnhancementStrategy) {
		this.launchConfigurationSecurityEnhancementStrategy = launchConfigurationSecurityEnhancementStrategy;
		if(launchConfigurationSecurityEnhancementStrategy != null){
			putQueryParameter("LaunchConfiguration.SecurityEnhancementStrategy", launchConfigurationSecurityEnhancementStrategy);
		}
	}

	public List<LaunchConfigurationTag> getLaunchConfigurationTags() {
		return this.launchConfigurationTags;
	}

	public void setLaunchConfigurationTags(List<LaunchConfigurationTag> launchConfigurationTags) {
		this.launchConfigurationTags = launchConfigurationTags;	
		if (launchConfigurationTags != null) {
			for (int depth1 = 0; depth1 < launchConfigurationTags.size(); depth1++) {
				putQueryParameter("LaunchConfiguration.Tag." + (depth1 + 1) + ".Key" , launchConfigurationTags.get(depth1).getKey());
				putQueryParameter("LaunchConfiguration.Tag." + (depth1 + 1) + ".Value" , launchConfigurationTags.get(depth1).getValue());
			}
		}	
	}

	public String getLaunchConfigurationDeploymentSetId() {
		return this.launchConfigurationDeploymentSetId;
	}

	public void setLaunchConfigurationDeploymentSetId(String launchConfigurationDeploymentSetId) {
		this.launchConfigurationDeploymentSetId = launchConfigurationDeploymentSetId;
		if(launchConfigurationDeploymentSetId != null){
			putQueryParameter("LaunchConfiguration.DeploymentSetId", launchConfigurationDeploymentSetId);
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

	public Integer getSpotInstancePoolsToUseCount() {
		return this.spotInstancePoolsToUseCount;
	}

	public void setSpotInstancePoolsToUseCount(Integer spotInstancePoolsToUseCount) {
		this.spotInstancePoolsToUseCount = spotInstancePoolsToUseCount;
		if(spotInstancePoolsToUseCount != null){
			putQueryParameter("SpotInstancePoolsToUseCount", spotInstancePoolsToUseCount.toString());
		}
	}

	public String getLaunchConfigurationInternetChargeType() {
		return this.launchConfigurationInternetChargeType;
	}

	public void setLaunchConfigurationInternetChargeType(String launchConfigurationInternetChargeType) {
		this.launchConfigurationInternetChargeType = launchConfigurationInternetChargeType;
		if(launchConfigurationInternetChargeType != null){
			putQueryParameter("LaunchConfiguration.InternetChargeType", launchConfigurationInternetChargeType);
		}
	}

	public String getLaunchTemplateVersion() {
		return this.launchTemplateVersion;
	}

	public void setLaunchTemplateVersion(String launchTemplateVersion) {
		this.launchTemplateVersion = launchTemplateVersion;
		if(launchTemplateVersion != null){
			putQueryParameter("LaunchTemplateVersion", launchTemplateVersion);
		}
	}

	public String getLaunchConfigurationIoOptimized() {
		return this.launchConfigurationIoOptimized;
	}

	public void setLaunchConfigurationIoOptimized(String launchConfigurationIoOptimized) {
		this.launchConfigurationIoOptimized = launchConfigurationIoOptimized;
		if(launchConfigurationIoOptimized != null){
			putQueryParameter("LaunchConfiguration.IoOptimized", launchConfigurationIoOptimized);
		}
	}

	public String getPayAsYouGoTargetCapacity() {
		return this.payAsYouGoTargetCapacity;
	}

	public void setPayAsYouGoTargetCapacity(String payAsYouGoTargetCapacity) {
		this.payAsYouGoTargetCapacity = payAsYouGoTargetCapacity;
		if(payAsYouGoTargetCapacity != null){
			putQueryParameter("PayAsYouGoTargetCapacity", payAsYouGoTargetCapacity);
		}
	}

	public Boolean getHibernationOptionsConfigured() {
		return this.hibernationOptionsConfigured;
	}

	public void setHibernationOptionsConfigured(Boolean hibernationOptionsConfigured) {
		this.hibernationOptionsConfigured = hibernationOptionsConfigured;
		if(hibernationOptionsConfigured != null){
			putQueryParameter("HibernationOptionsConfigured", hibernationOptionsConfigured.toString());
		}
	}

	public String getTotalTargetCapacity() {
		return this.totalTargetCapacity;
	}

	public void setTotalTargetCapacity(String totalTargetCapacity) {
		this.totalTargetCapacity = totalTargetCapacity;
		if(totalTargetCapacity != null){
			putQueryParameter("TotalTargetCapacity", totalTargetCapacity);
		}
	}

	public String getSpotTargetCapacity() {
		return this.spotTargetCapacity;
	}

	public void setSpotTargetCapacity(String spotTargetCapacity) {
		this.spotTargetCapacity = spotTargetCapacity;
		if(spotTargetCapacity != null){
			putQueryParameter("SpotTargetCapacity", spotTargetCapacity);
		}
	}

	public String getValidFrom() {
		return this.validFrom;
	}

	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
		if(validFrom != null){
			putQueryParameter("ValidFrom", validFrom);
		}
	}

	public String getAutoProvisioningGroupName() {
		return this.autoProvisioningGroupName;
	}

	public void setAutoProvisioningGroupName(String autoProvisioningGroupName) {
		this.autoProvisioningGroupName = autoProvisioningGroupName;
		if(autoProvisioningGroupName != null){
			putQueryParameter("AutoProvisioningGroupName", autoProvisioningGroupName);
		}
	}

	public static class LaunchConfigurationDataDisk {

		private String performanceLevel;

		private String kmsKeyId;

		private String description;

		private String snapshotId;

		private Integer size;

		private String device;

		private String diskName;

		private String category;

		private Boolean deleteWithInstance;

		private Boolean encrypted;

		private String encryptAlgorithm;

		private Long provisionedIops;

		private Boolean burstingEnabled;

		private String autoSnapshotPolicyId;

		public String getPerformanceLevel() {
			return this.performanceLevel;
		}

		public void setPerformanceLevel(String performanceLevel) {
			this.performanceLevel = performanceLevel;
		}

		public String getKmsKeyId() {
			return this.kmsKeyId;
		}

		public void setKmsKeyId(String kmsKeyId) {
			this.kmsKeyId = kmsKeyId;
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

		public Boolean getEncrypted() {
			return this.encrypted;
		}

		public void setEncrypted(Boolean encrypted) {
			this.encrypted = encrypted;
		}

		public String getEncryptAlgorithm() {
			return this.encryptAlgorithm;
		}

		public void setEncryptAlgorithm(String encryptAlgorithm) {
			this.encryptAlgorithm = encryptAlgorithm;
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

		public String getAutoSnapshotPolicyId() {
			return this.autoSnapshotPolicyId;
		}

		public void setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
			this.autoSnapshotPolicyId = autoSnapshotPolicyId;
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

	public static class SystemDiskConfig {

		private String diskCategory;

		public String getDiskCategory() {
			return this.diskCategory;
		}

		public void setDiskCategory(String diskCategory) {
			this.diskCategory = diskCategory;
		}
	}

	public static class DataDiskConfig {

		private String diskCategory;

		public String getDiskCategory() {
			return this.diskCategory;
		}

		public void setDiskCategory(String diskCategory) {
			this.diskCategory = diskCategory;
		}
	}

	public static class PrePaidOptions {

		private List<SpecifyCapacityDistributionItem> specifyCapacityDistribution;

		public List<SpecifyCapacityDistributionItem> getSpecifyCapacityDistribution() {
			return this.specifyCapacityDistribution;
		}

		public void setSpecifyCapacityDistribution(List<SpecifyCapacityDistributionItem> specifyCapacityDistribution) {
			this.specifyCapacityDistribution = specifyCapacityDistribution;
		}

		public static class SpecifyCapacityDistributionItem {

			private List<String> instanceTypes;

			private Integer minTargetCapacity;

			public List<String> getInstanceTypes() {
				return this.instanceTypes;
			}

			public void setInstanceTypes(List<String> instanceTypes) {
				this.instanceTypes = instanceTypes;
			}

			public Integer getMinTargetCapacity() {
				return this.minTargetCapacity;
			}

			public void setMinTargetCapacity(Integer minTargetCapacity) {
				this.minTargetCapacity = minTargetCapacity;
			}
		}
	}

	public static class LaunchConfiguration {

		private Integer period;

		private String periodUnit;

		private Boolean autoRenew;

		private Integer autoRenewPeriod;

		private Integer spotDuration;

		private String spotInterruptionBehavior;

		private ImageOptions imageOptions;

		private SchedulerOptions schedulerOptions;

		private SecurityOptions securityOptions;

		private CpuOptions cpuOptions;

		public Integer getPeriod() {
			return this.period;
		}

		public void setPeriod(Integer period) {
			this.period = period;
		}

		public String getPeriodUnit() {
			return this.periodUnit;
		}

		public void setPeriodUnit(String periodUnit) {
			this.periodUnit = periodUnit;
		}

		public Boolean getAutoRenew() {
			return this.autoRenew;
		}

		public void setAutoRenew(Boolean autoRenew) {
			this.autoRenew = autoRenew;
		}

		public Integer getAutoRenewPeriod() {
			return this.autoRenewPeriod;
		}

		public void setAutoRenewPeriod(Integer autoRenewPeriod) {
			this.autoRenewPeriod = autoRenewPeriod;
		}

		public Integer getSpotDuration() {
			return this.spotDuration;
		}

		public void setSpotDuration(Integer spotDuration) {
			this.spotDuration = spotDuration;
		}

		public String getSpotInterruptionBehavior() {
			return this.spotInterruptionBehavior;
		}

		public void setSpotInterruptionBehavior(String spotInterruptionBehavior) {
			this.spotInterruptionBehavior = spotInterruptionBehavior;
		}

		public ImageOptions getImageOptions() {
			return this.imageOptions;
		}

		public void setImageOptions(ImageOptions imageOptions) {
			this.imageOptions = imageOptions;
		}

		public SchedulerOptions getSchedulerOptions() {
			return this.schedulerOptions;
		}

		public void setSchedulerOptions(SchedulerOptions schedulerOptions) {
			this.schedulerOptions = schedulerOptions;
		}

		public SecurityOptions getSecurityOptions() {
			return this.securityOptions;
		}

		public void setSecurityOptions(SecurityOptions securityOptions) {
			this.securityOptions = securityOptions;
		}

		public CpuOptions getCpuOptions() {
			return this.cpuOptions;
		}

		public void setCpuOptions(CpuOptions cpuOptions) {
			this.cpuOptions = cpuOptions;
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

		public static class SchedulerOptions {

			private String dedicatedHostId;

			private String dedicatedHostClusterId;

			public String getDedicatedHostId() {
				return this.dedicatedHostId;
			}

			public void setDedicatedHostId(String dedicatedHostId) {
				this.dedicatedHostId = dedicatedHostId;
			}

			public String getDedicatedHostClusterId() {
				return this.dedicatedHostClusterId;
			}

			public void setDedicatedHostClusterId(String dedicatedHostClusterId) {
				this.dedicatedHostClusterId = dedicatedHostClusterId;
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

		public static class CpuOptions {

			private Integer core;

			private Integer threadsPerCore;

			public Integer getCore() {
				return this.core;
			}

			public void setCore(Integer core) {
				this.core = core;
			}

			public Integer getThreadsPerCore() {
				return this.threadsPerCore;
			}

			public void setThreadsPerCore(Integer threadsPerCore) {
				this.threadsPerCore = threadsPerCore;
			}
		}
	}

	public static class LaunchConfigurationArn {

		private String rolearn;

		private String roleType;

		private Long assumeRoleFor;

		public String getRolearn() {
			return this.rolearn;
		}

		public void setRolearn(String rolearn) {
			this.rolearn = rolearn;
		}

		public String getRoleType() {
			return this.roleType;
		}

		public void setRoleType(String roleType) {
			this.roleType = roleType;
		}

		public Long getAssumeRoleFor() {
			return this.assumeRoleFor;
		}

		public void setAssumeRoleFor(Long assumeRoleFor) {
			this.assumeRoleFor = assumeRoleFor;
		}
	}

	public static class LaunchConfigurationSystemDisk {

		private String encrypted;

		private String kMSKeyId;

		private String encryptAlgorithm;

		private Long provisionedIops;

		private Boolean burstingEnabled;

		private String autoSnapshotPolicyId;

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

		public String getEncryptAlgorithm() {
			return this.encryptAlgorithm;
		}

		public void setEncryptAlgorithm(String encryptAlgorithm) {
			this.encryptAlgorithm = encryptAlgorithm;
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

		public String getAutoSnapshotPolicyId() {
			return this.autoSnapshotPolicyId;
		}

		public void setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
			this.autoSnapshotPolicyId = autoSnapshotPolicyId;
		}
	}

	public static class ResourcePoolOptions {

		@SerializedName("Strategy")
		private String strategy;

		@SerializedName("PrivatePoolIds")
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

	public static class LaunchTemplateConfig {

		private String vSwitchId;

		private Double maxPrice;

		private Integer priority;

		private String instanceType;

		private Double weightedCapacity;

		private Integer maxQuantity;

		private List<Integer> coress;

		private List<Float> memoriess;

		private String instanceFamilyLevel;

		private List<String> excludedInstanceTypess;

		private List<String> architecturess;

		private String burstablePerformance;

		private List<SecondaryNetworkInterface> secondaryNetworkInterfaces;

		private String imageId;

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public Double getMaxPrice() {
			return this.maxPrice;
		}

		public void setMaxPrice(Double maxPrice) {
			this.maxPrice = maxPrice;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public Double getWeightedCapacity() {
			return this.weightedCapacity;
		}

		public void setWeightedCapacity(Double weightedCapacity) {
			this.weightedCapacity = weightedCapacity;
		}

		public Integer getMaxQuantity() {
			return this.maxQuantity;
		}

		public void setMaxQuantity(Integer maxQuantity) {
			this.maxQuantity = maxQuantity;
		}

		public List<Integer> getCoress() {
			return this.coress;
		}

		public void setCoress(List<Integer> coress) {
			this.coress = coress;
		}

		public List<Float> getMemoriess() {
			return this.memoriess;
		}

		public void setMemoriess(List<Float> memoriess) {
			this.memoriess = memoriess;
		}

		public String getInstanceFamilyLevel() {
			return this.instanceFamilyLevel;
		}

		public void setInstanceFamilyLevel(String instanceFamilyLevel) {
			this.instanceFamilyLevel = instanceFamilyLevel;
		}

		public List<String> getExcludedInstanceTypess() {
			return this.excludedInstanceTypess;
		}

		public void setExcludedInstanceTypess(List<String> excludedInstanceTypess) {
			this.excludedInstanceTypess = excludedInstanceTypess;
		}

		public List<String> getArchitecturess() {
			return this.architecturess;
		}

		public void setArchitecturess(List<String> architecturess) {
			this.architecturess = architecturess;
		}

		public String getBurstablePerformance() {
			return this.burstablePerformance;
		}

		public void setBurstablePerformance(String burstablePerformance) {
			this.burstablePerformance = burstablePerformance;
		}

		public List<SecondaryNetworkInterface> getSecondaryNetworkInterfaces() {
			return this.secondaryNetworkInterfaces;
		}

		public void setSecondaryNetworkInterfaces(List<SecondaryNetworkInterface> secondaryNetworkInterfaces) {
			this.secondaryNetworkInterfaces = secondaryNetworkInterfaces;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public static class SecondaryNetworkInterface {

			private String vSwitchId;

			public String getVSwitchId() {
				return this.vSwitchId;
			}

			public void setVSwitchId(String vSwitchId) {
				this.vSwitchId = vSwitchId;
			}
		}
	}

	public static class LaunchConfigurationTag {

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

	@Override
	public Class<CreateAutoProvisioningGroupResponse> getResponseClass() {
		return CreateAutoProvisioningGroupResponse.class;
	}

}
