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
public class ModifyScalingGroupRequest extends RpcAcsRequest<ModifyScalingGroupResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String scalingGroupId;

	private List<String> vSwitchIds;

	private String activeScalingConfigurationId;

	private Integer onDemandBaseCapacity;

	private Integer onDemandPercentageAboveBaseCapacity;

	private String costOptimizedMode;

	private Boolean spotInstanceRemedy;

	private Integer defaultCooldown;

	private String removalPolicy1;

	private String removalPolicy2;

	private String healthCheckType;

	private String launchTemplateId;

	private Integer desiredCapacity;

	private String resourceOwnerAccount;

	private String scalingGroupName;

	private List<LaunchTemplateOverride> launchTemplateOverrides;

	private String ownerAccount;

	private Integer spotInstancePools;

	private Integer minSize;

	private Boolean groupDeletionProtection;

	private Long ownerId;

	private String launchTemplateVersion;

	private Integer maxSize;
	public ModifyScalingGroupRequest() {
		super("Ess", "2014-08-28", "ModifyScalingGroup", "ess");
		setMethod(MethodType.POST);
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

	public List<String> getVSwitchIds() {
		return this.vSwitchIds;
	}

	public void setVSwitchIds(List<String> vSwitchIds) {
		this.vSwitchIds = vSwitchIds;
		if (vSwitchIds != null) {
			for (int i = 0; i < vSwitchIds.size(); i++) {
				putQueryParameter("VSwitchIds." + (i + 1) , vSwitchIds.get(i));
			}
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

	public String getCostOptimizedMode() {
		return this.costOptimizedMode;
	}

	public void setCostOptimizedMode(String costOptimizedMode) {
		this.costOptimizedMode = costOptimizedMode;
		if(costOptimizedMode != null){
			putQueryParameter("CostOptimizedMode", costOptimizedMode);
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

	public Integer getDefaultCooldown() {
		return this.defaultCooldown;
	}

	public void setDefaultCooldown(Integer defaultCooldown) {
		this.defaultCooldown = defaultCooldown;
		if(defaultCooldown != null){
			putQueryParameter("DefaultCooldown", defaultCooldown.toString());
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

	public String getHealthCheckType() {
		return this.healthCheckType;
	}

	public void setHealthCheckType(String healthCheckType) {
		this.healthCheckType = healthCheckType;
		if(healthCheckType != null){
			putQueryParameter("HealthCheckType", healthCheckType);
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

	public List<LaunchTemplateOverride> getLaunchTemplateOverrides() {
		return this.launchTemplateOverrides;
	}

	public void setLaunchTemplateOverrides(List<LaunchTemplateOverride> launchTemplateOverrides) {
		this.launchTemplateOverrides = launchTemplateOverrides;	
		if (launchTemplateOverrides != null) {
			for (int depth1 = 0; depth1 < launchTemplateOverrides.size(); depth1++) {
				putQueryParameter("LaunchTemplateOverride." + (depth1 + 1) + ".InstanceType" , launchTemplateOverrides.get(depth1).getInstanceType());
			}
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

	public Integer getMinSize() {
		return this.minSize;
	}

	public void setMinSize(Integer minSize) {
		this.minSize = minSize;
		if(minSize != null){
			putQueryParameter("MinSize", minSize.toString());
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
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

	public Integer getMaxSize() {
		return this.maxSize;
	}

	public void setMaxSize(Integer maxSize) {
		this.maxSize = maxSize;
		if(maxSize != null){
			putQueryParameter("MaxSize", maxSize.toString());
		}
	}

	public static class LaunchTemplateOverride {

		private String instanceType;

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}
	}

	@Override
	public Class<ModifyScalingGroupResponse> getResponseClass() {
		return ModifyScalingGroupResponse.class;
	}

}
