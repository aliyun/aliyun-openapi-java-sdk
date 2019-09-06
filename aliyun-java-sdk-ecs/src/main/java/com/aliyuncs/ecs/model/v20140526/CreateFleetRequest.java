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
public class CreateFleetRequest extends RpcAcsRequest<CreateFleetResponse> {
	
	public CreateFleetRequest() {
		super("Ecs", "2014-05-26", "CreateFleet", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long resourceOwnerId;

	private String fleetType;

	private String description;

	private Boolean terminateInstancesWithExpiration;

	private String onDemandTargetCapacity;

	private String fleetName;

	private String spotAllocationStrategy;

	private Boolean terminateInstances;

	private String defaultTargetCapacityType;

	private String excessCapacityTerminationPolicy;

	private List<LaunchTemplateConfig> launchTemplateConfigs;

	private String validUntil;

	private String fillGapWithOnDemand;

	private String spotInstanceInterruptionBehavior;

	private String launchTemplateId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Integer spotInstancePoolsToUseCount;

	private Long ownerId;

	private String launchTemplateVersion;

	private String totalTargetCapacity;

	private String onDemandAllocationStrategy;

	private String spotTargetCapacity;

	private String validFrom;

	private Float maxSpotPrice;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getFleetType() {
		return this.fleetType;
	}

	public void setFleetType(String fleetType) {
		this.fleetType = fleetType;
		if(fleetType != null){
			putQueryParameter("FleetType", fleetType);
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

	public String getOnDemandTargetCapacity() {
		return this.onDemandTargetCapacity;
	}

	public void setOnDemandTargetCapacity(String onDemandTargetCapacity) {
		this.onDemandTargetCapacity = onDemandTargetCapacity;
		if(onDemandTargetCapacity != null){
			putQueryParameter("OnDemandTargetCapacity", onDemandTargetCapacity);
		}
	}

	public String getFleetName() {
		return this.fleetName;
	}

	public void setFleetName(String fleetName) {
		this.fleetName = fleetName;
		if(fleetName != null){
			putQueryParameter("FleetName", fleetName);
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

	public Boolean getTerminateInstances() {
		return this.terminateInstances;
	}

	public void setTerminateInstances(Boolean terminateInstances) {
		this.terminateInstances = terminateInstances;
		if(terminateInstances != null){
			putQueryParameter("TerminateInstances", terminateInstances.toString());
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
				putQueryParameter("LaunchTemplateConfig." + (depth1 + 1) + ".InstanceType" , launchTemplateConfigs.get(depth1).getInstanceType());
				putQueryParameter("LaunchTemplateConfig." + (depth1 + 1) + ".MaxPrice" , launchTemplateConfigs.get(depth1).getMaxPrice());
				putQueryParameter("LaunchTemplateConfig." + (depth1 + 1) + ".VSwitchId" , launchTemplateConfigs.get(depth1).getVSwitchId());
				putQueryParameter("LaunchTemplateConfig." + (depth1 + 1) + ".WeightedCapacity" , launchTemplateConfigs.get(depth1).getWeightedCapacity());
				putQueryParameter("LaunchTemplateConfig." + (depth1 + 1) + ".Priority" , launchTemplateConfigs.get(depth1).getPriority());
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

	public String getFillGapWithOnDemand() {
		return this.fillGapWithOnDemand;
	}

	public void setFillGapWithOnDemand(String fillGapWithOnDemand) {
		this.fillGapWithOnDemand = fillGapWithOnDemand;
		if(fillGapWithOnDemand != null){
			putQueryParameter("FillGapWithOnDemand", fillGapWithOnDemand);
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

	public String getLaunchTemplateId() {
		return this.launchTemplateId;
	}

	public void setLaunchTemplateId(String launchTemplateId) {
		this.launchTemplateId = launchTemplateId;
		if(launchTemplateId != null){
			putQueryParameter("LaunchTemplateId", launchTemplateId);
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

	public String getTotalTargetCapacity() {
		return this.totalTargetCapacity;
	}

	public void setTotalTargetCapacity(String totalTargetCapacity) {
		this.totalTargetCapacity = totalTargetCapacity;
		if(totalTargetCapacity != null){
			putQueryParameter("TotalTargetCapacity", totalTargetCapacity);
		}
	}

	public String getOnDemandAllocationStrategy() {
		return this.onDemandAllocationStrategy;
	}

	public void setOnDemandAllocationStrategy(String onDemandAllocationStrategy) {
		this.onDemandAllocationStrategy = onDemandAllocationStrategy;
		if(onDemandAllocationStrategy != null){
			putQueryParameter("OnDemandAllocationStrategy", onDemandAllocationStrategy);
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

	public Float getMaxSpotPrice() {
		return this.maxSpotPrice;
	}

	public void setMaxSpotPrice(Float maxSpotPrice) {
		this.maxSpotPrice = maxSpotPrice;
		if(maxSpotPrice != null){
			putQueryParameter("MaxSpotPrice", maxSpotPrice.toString());
		}
	}

	public static class LaunchTemplateConfig {

		private String instanceType;

		private Double maxPrice;

		private String vSwitchId;

		private Double weightedCapacity;

		private Integer priority;

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public Double getMaxPrice() {
			return this.maxPrice;
		}

		public void setMaxPrice(Double maxPrice) {
			this.maxPrice = maxPrice;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public Double getWeightedCapacity() {
			return this.weightedCapacity;
		}

		public void setWeightedCapacity(Double weightedCapacity) {
			this.weightedCapacity = weightedCapacity;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}
	}

	@Override
	public Class<CreateFleetResponse> getResponseClass() {
		return CreateFleetResponse.class;
	}

}
