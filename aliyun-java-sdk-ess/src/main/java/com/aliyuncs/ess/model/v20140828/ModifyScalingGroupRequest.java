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
import com.aliyuncs.ess.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyScalingGroupRequest extends RpcAcsRequest<ModifyScalingGroupResponse> {
	   

	private Long resourceOwnerId;

	private Boolean azBalance;

	private List<String> vSwitchIdss;

	private Integer maxInstanceLifetime;

	private String activeScalingConfigurationId;

	private Boolean spotInstanceRemedy;

	private String customPolicyARN;

	private Integer stopInstanceTimeout;

	private Integer defaultCooldown;

	private List<String> healthCheckTypess;

	private String multiAZPolicy;

	private String launchTemplateId;

	private Integer desiredCapacity;

	private List<LaunchTemplateOverride> launchTemplateOverrides;

	private Boolean compensateWithOnDemand;

	private CapacityOptions capacityOptions;

	private Integer minSize;

	private Long ownerId;

	private Integer maxSize;

	private String scalingGroupId;

	private Integer onDemandBaseCapacity;

	private Integer onDemandPercentageAboveBaseCapacity;

	private String spotAllocationStrategy;

	private Boolean disableDesiredCapacity;

	private String removalPolicy1;

	private String removalPolicy2;

	private String removalPolicy3;

	private String healthCheckType;

	private String resourceOwnerAccount;

	private String scalingGroupName;

	private String ownerAccount;

	private Integer spotInstancePools;

	private Boolean groupDeletionProtection;

	private String launchTemplateVersion;

	private String scalingPolicy;

	private String allocationStrategy;
	public ModifyScalingGroupRequest() {
		super("Ess", "2014-08-28", "ModifyScalingGroup", "ess");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Boolean getAzBalance() {
		return this.azBalance;
	}

	public void setAzBalance(Boolean azBalance) {
		this.azBalance = azBalance;
		if(azBalance != null){
			putQueryParameter("AzBalance", azBalance.toString());
		}
	}

	public List<String> getVSwitchIdss() {
		return this.vSwitchIdss;
	}

	public void setVSwitchIdss(List<String> vSwitchIdss) {
		this.vSwitchIdss = vSwitchIdss;	
		if (vSwitchIdss != null) {
			for (int i = 0; i < vSwitchIdss.size(); i++) {
				putQueryParameter("VSwitchIds." + (i + 1) , vSwitchIdss.get(i));
			}
		}	
	}

	public Integer getMaxInstanceLifetime() {
		return this.maxInstanceLifetime;
	}

	public void setMaxInstanceLifetime(Integer maxInstanceLifetime) {
		this.maxInstanceLifetime = maxInstanceLifetime;
		if(maxInstanceLifetime != null){
			putQueryParameter("MaxInstanceLifetime", maxInstanceLifetime.toString());
		}
	}

	public String getActiveScalingConfigurationId() {
		return this.activeScalingConfigurationId;
	}

	public void setActiveScalingConfigurationId(String activeScalingConfigurationId) {
		this.activeScalingConfigurationId = activeScalingConfigurationId;
		if(activeScalingConfigurationId != null){
			putQueryParameter("ActiveScalingConfigurationId", activeScalingConfigurationId);
		}
	}

	public Boolean getSpotInstanceRemedy() {
		return this.spotInstanceRemedy;
	}

	public void setSpotInstanceRemedy(Boolean spotInstanceRemedy) {
		this.spotInstanceRemedy = spotInstanceRemedy;
		if(spotInstanceRemedy != null){
			putQueryParameter("SpotInstanceRemedy", spotInstanceRemedy.toString());
		}
	}

	public String getCustomPolicyARN() {
		return this.customPolicyARN;
	}

	public void setCustomPolicyARN(String customPolicyARN) {
		this.customPolicyARN = customPolicyARN;
		if(customPolicyARN != null){
			putQueryParameter("CustomPolicyARN", customPolicyARN);
		}
	}

	public Integer getStopInstanceTimeout() {
		return this.stopInstanceTimeout;
	}

	public void setStopInstanceTimeout(Integer stopInstanceTimeout) {
		this.stopInstanceTimeout = stopInstanceTimeout;
		if(stopInstanceTimeout != null){
			putQueryParameter("StopInstanceTimeout", stopInstanceTimeout.toString());
		}
	}

	public Integer getDefaultCooldown() {
		return this.defaultCooldown;
	}

	public void setDefaultCooldown(Integer defaultCooldown) {
		this.defaultCooldown = defaultCooldown;
		if(defaultCooldown != null){
			putQueryParameter("DefaultCooldown", defaultCooldown.toString());
		}
	}

	public List<String> getHealthCheckTypess() {
		return this.healthCheckTypess;
	}

	public void setHealthCheckTypess(List<String> healthCheckTypess) {
		this.healthCheckTypess = healthCheckTypess;	
		if (healthCheckTypess != null) {
			for (int i = 0; i < healthCheckTypess.size(); i++) {
				putQueryParameter("HealthCheckTypes." + (i + 1) , healthCheckTypess.get(i));
			}
		}	
	}

	public String getMultiAZPolicy() {
		return this.multiAZPolicy;
	}

	public void setMultiAZPolicy(String multiAZPolicy) {
		this.multiAZPolicy = multiAZPolicy;
		if(multiAZPolicy != null){
			putQueryParameter("MultiAZPolicy", multiAZPolicy);
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

	public Integer getDesiredCapacity() {
		return this.desiredCapacity;
	}

	public void setDesiredCapacity(Integer desiredCapacity) {
		this.desiredCapacity = desiredCapacity;
		if(desiredCapacity != null){
			putQueryParameter("DesiredCapacity", desiredCapacity.toString());
		}
	}

	public List<LaunchTemplateOverride> getLaunchTemplateOverrides() {
		return this.launchTemplateOverrides;
	}

	public void setLaunchTemplateOverrides(List<LaunchTemplateOverride> launchTemplateOverrides) {
		this.launchTemplateOverrides = launchTemplateOverrides;	
		if (launchTemplateOverrides != null) {
			for (int depth1 = 0; depth1 < launchTemplateOverrides.size(); depth1++) {
				putQueryParameter("LaunchTemplateOverride." + (depth1 + 1) + ".WeightedCapacity" , launchTemplateOverrides.get(depth1).getWeightedCapacity());
				putQueryParameter("LaunchTemplateOverride." + (depth1 + 1) + ".InstanceType" , launchTemplateOverrides.get(depth1).getInstanceType());
				putQueryParameter("LaunchTemplateOverride." + (depth1 + 1) + ".SpotPriceLimit" , launchTemplateOverrides.get(depth1).getSpotPriceLimit());
			}
		}	
	}

	public Boolean getCompensateWithOnDemand() {
		return this.compensateWithOnDemand;
	}

	public void setCompensateWithOnDemand(Boolean compensateWithOnDemand) {
		this.compensateWithOnDemand = compensateWithOnDemand;
		if(compensateWithOnDemand != null){
			putQueryParameter("CompensateWithOnDemand", compensateWithOnDemand.toString());
		}
	}

	public CapacityOptions getCapacityOptions() {
		return this.capacityOptions;
	}

	public void setCapacityOptions(CapacityOptions capacityOptions) {
		this.capacityOptions = capacityOptions;	
		if (capacityOptions != null) {
			
				putQueryParameter("CapacityOptions.CompensateWithOnDemand" , capacityOptions.getCompensateWithOnDemand());
				putQueryParameter("CapacityOptions.PriceComparisonMode" , capacityOptions.getPriceComparisonMode());
				putQueryParameter("CapacityOptions.OnDemandBaseCapacity" , capacityOptions.getOnDemandBaseCapacity());
				putQueryParameter("CapacityOptions.SpotAutoReplaceOnDemand" , capacityOptions.getSpotAutoReplaceOnDemand());
				putQueryParameter("CapacityOptions.OnDemandPercentageAboveBaseCapacity" , capacityOptions.getOnDemandPercentageAboveBaseCapacity());
		}	
	}

	public Integer getMinSize() {
		return this.minSize;
	}

	public void setMinSize(Integer minSize) {
		this.minSize = minSize;
		if(minSize != null){
			putQueryParameter("MinSize", minSize.toString());
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

	public Integer getMaxSize() {
		return this.maxSize;
	}

	public void setMaxSize(Integer maxSize) {
		this.maxSize = maxSize;
		if(maxSize != null){
			putQueryParameter("MaxSize", maxSize.toString());
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

	public Integer getOnDemandBaseCapacity() {
		return this.onDemandBaseCapacity;
	}

	public void setOnDemandBaseCapacity(Integer onDemandBaseCapacity) {
		this.onDemandBaseCapacity = onDemandBaseCapacity;
		if(onDemandBaseCapacity != null){
			putQueryParameter("OnDemandBaseCapacity", onDemandBaseCapacity.toString());
		}
	}

	public Integer getOnDemandPercentageAboveBaseCapacity() {
		return this.onDemandPercentageAboveBaseCapacity;
	}

	public void setOnDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
		this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
		if(onDemandPercentageAboveBaseCapacity != null){
			putQueryParameter("OnDemandPercentageAboveBaseCapacity", onDemandPercentageAboveBaseCapacity.toString());
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

	public Boolean getDisableDesiredCapacity() {
		return this.disableDesiredCapacity;
	}

	public void setDisableDesiredCapacity(Boolean disableDesiredCapacity) {
		this.disableDesiredCapacity = disableDesiredCapacity;
		if(disableDesiredCapacity != null){
			putQueryParameter("DisableDesiredCapacity", disableDesiredCapacity.toString());
		}
	}

	public String getRemovalPolicy1() {
		return this.removalPolicy1;
	}

	public void setRemovalPolicy1(String removalPolicy1) {
		this.removalPolicy1 = removalPolicy1;
		if(removalPolicy1 != null){
			putQueryParameter("RemovalPolicy.1", removalPolicy1);
		}
	}

	public String getRemovalPolicy2() {
		return this.removalPolicy2;
	}

	public void setRemovalPolicy2(String removalPolicy2) {
		this.removalPolicy2 = removalPolicy2;
		if(removalPolicy2 != null){
			putQueryParameter("RemovalPolicy.2", removalPolicy2);
		}
	}

	public String getRemovalPolicy3() {
		return this.removalPolicy3;
	}

	public void setRemovalPolicy3(String removalPolicy3) {
		this.removalPolicy3 = removalPolicy3;
		if(removalPolicy3 != null){
			putQueryParameter("RemovalPolicy.3", removalPolicy3);
		}
	}

	public String getHealthCheckType() {
		return this.healthCheckType;
	}

	public void setHealthCheckType(String healthCheckType) {
		this.healthCheckType = healthCheckType;
		if(healthCheckType != null){
			putQueryParameter("HealthCheckType", healthCheckType);
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

	public String getScalingGroupName() {
		return this.scalingGroupName;
	}

	public void setScalingGroupName(String scalingGroupName) {
		this.scalingGroupName = scalingGroupName;
		if(scalingGroupName != null){
			putQueryParameter("ScalingGroupName", scalingGroupName);
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

	public Integer getSpotInstancePools() {
		return this.spotInstancePools;
	}

	public void setSpotInstancePools(Integer spotInstancePools) {
		this.spotInstancePools = spotInstancePools;
		if(spotInstancePools != null){
			putQueryParameter("SpotInstancePools", spotInstancePools.toString());
		}
	}

	public Boolean getGroupDeletionProtection() {
		return this.groupDeletionProtection;
	}

	public void setGroupDeletionProtection(Boolean groupDeletionProtection) {
		this.groupDeletionProtection = groupDeletionProtection;
		if(groupDeletionProtection != null){
			putQueryParameter("GroupDeletionProtection", groupDeletionProtection.toString());
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

	public String getScalingPolicy() {
		return this.scalingPolicy;
	}

	public void setScalingPolicy(String scalingPolicy) {
		this.scalingPolicy = scalingPolicy;
		if(scalingPolicy != null){
			putQueryParameter("ScalingPolicy", scalingPolicy);
		}
	}

	public String getAllocationStrategy() {
		return this.allocationStrategy;
	}

	public void setAllocationStrategy(String allocationStrategy) {
		this.allocationStrategy = allocationStrategy;
		if(allocationStrategy != null){
			putQueryParameter("AllocationStrategy", allocationStrategy);
		}
	}

	public static class LaunchTemplateOverride {

		private Integer weightedCapacity;

		private String instanceType;

		private Float spotPriceLimit;

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

		public Float getSpotPriceLimit() {
			return this.spotPriceLimit;
		}

		public void setSpotPriceLimit(Float spotPriceLimit) {
			this.spotPriceLimit = spotPriceLimit;
		}
	}

	public static class CapacityOptions {

		private Boolean compensateWithOnDemand;

		private String priceComparisonMode;

		private Integer onDemandBaseCapacity;

		private Boolean spotAutoReplaceOnDemand;

		private Integer onDemandPercentageAboveBaseCapacity;

		public Boolean getCompensateWithOnDemand() {
			return this.compensateWithOnDemand;
		}

		public void setCompensateWithOnDemand(Boolean compensateWithOnDemand) {
			this.compensateWithOnDemand = compensateWithOnDemand;
		}

		public String getPriceComparisonMode() {
			return this.priceComparisonMode;
		}

		public void setPriceComparisonMode(String priceComparisonMode) {
			this.priceComparisonMode = priceComparisonMode;
		}

		public Integer getOnDemandBaseCapacity() {
			return this.onDemandBaseCapacity;
		}

		public void setOnDemandBaseCapacity(Integer onDemandBaseCapacity) {
			this.onDemandBaseCapacity = onDemandBaseCapacity;
		}

		public Boolean getSpotAutoReplaceOnDemand() {
			return this.spotAutoReplaceOnDemand;
		}

		public void setSpotAutoReplaceOnDemand(Boolean spotAutoReplaceOnDemand) {
			this.spotAutoReplaceOnDemand = spotAutoReplaceOnDemand;
		}

		public Integer getOnDemandPercentageAboveBaseCapacity() {
			return this.onDemandPercentageAboveBaseCapacity;
		}

		public void setOnDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
			this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
		}
	}

	@Override
	public Class<ModifyScalingGroupResponse> getResponseClass() {
		return ModifyScalingGroupResponse.class;
	}

}
