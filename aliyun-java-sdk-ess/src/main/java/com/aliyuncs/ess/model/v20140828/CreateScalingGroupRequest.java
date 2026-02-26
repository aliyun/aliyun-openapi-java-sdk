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
public class CreateScalingGroupRequest extends RpcAcsRequest<CreateScalingGroupResponse> {
	   

	private Boolean azBalance;

	private List<String> vSwitchIdss;

	private Integer maxInstanceLifetime;

	private Boolean spotInstanceRemedy;

	private String resourceGroupId;

	private String groupType;

	private String customPolicyARN;

	private List<Tag> tags;

	private Integer stopInstanceTimeout;

	private Integer defaultCooldown;

	private List<String> healthCheckTypess;

	private String containerGroupId;

	private String multiAZPolicy;

	private String dBInstanceIds;

	private String launchTemplateId;

	private Integer desiredCapacity;

	private List<ServerGroup> serverGroups;

	private List<LaunchTemplateOverride> launchTemplateOverrides;

	private Boolean compensateWithOnDemand;

	private CapacityOptions capacityOptions;

	private Integer minSize;

	private Long ownerId;

	private List<AlbServerGroup> albServerGroups;

	private String vSwitchId;

	private String instanceId;

	private Integer maxSize;

	private List<LifecycleHook> lifecycleHooks;

	private String loadBalancerIds;

	private String clientToken;

	private List<LoadBalancerConfig> loadBalancerConfigs;

	private Integer onDemandBaseCapacity;

	private Integer onDemandPercentageAboveBaseCapacity;

	private String spotAllocationStrategy;

	private String removalPolicy1;

	private String removalPolicy2;

	private String removalPolicy3;

	private String healthCheckType;

	private String resourceOwnerAccount;

	private String scalingGroupName;

	private String ownerAccount;

	private Integer spotInstancePools;

	private List<DBInstance> dBInstances;

	private Boolean groupDeletionProtection;

	private String launchTemplateVersion;

	private String scalingPolicy;

	private String allocationStrategy;

	private List<VServerGroup> vServerGroups;
	public CreateScalingGroupRequest() {
		super("Ess", "2014-08-28", "CreateScalingGroup", "ess");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Boolean getSpotInstanceRemedy() {
		return this.spotInstanceRemedy;
	}

	public void setSpotInstanceRemedy(Boolean spotInstanceRemedy) {
		this.spotInstanceRemedy = spotInstanceRemedy;
		if(spotInstanceRemedy != null){
			putQueryParameter("SpotInstanceRemedy", spotInstanceRemedy.toString());
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

	public String getGroupType() {
		return this.groupType;
	}

	public void setGroupType(String groupType) {
		this.groupType = groupType;
		if(groupType != null){
			putQueryParameter("GroupType", groupType);
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

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Propagate" , tags.get(depth1).getPropagate());
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
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

	public String getContainerGroupId() {
		return this.containerGroupId;
	}

	public void setContainerGroupId(String containerGroupId) {
		this.containerGroupId = containerGroupId;
		if(containerGroupId != null){
			putQueryParameter("ContainerGroupId", containerGroupId);
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

	public String getDBInstanceIds() {
		return this.dBInstanceIds;
	}

	public void setDBInstanceIds(String dBInstanceIds) {
		this.dBInstanceIds = dBInstanceIds;
		if(dBInstanceIds != null){
			putQueryParameter("DBInstanceIds", dBInstanceIds);
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

	public List<ServerGroup> getServerGroups() {
		return this.serverGroups;
	}

	public void setServerGroups(List<ServerGroup> serverGroups) {
		this.serverGroups = serverGroups;	
		if (serverGroups != null) {
			for (int depth1 = 0; depth1 < serverGroups.size(); depth1++) {
				putQueryParameter("ServerGroup." + (depth1 + 1) + ".ServerGroupId" , serverGroups.get(depth1).getServerGroupId());
				putQueryParameter("ServerGroup." + (depth1 + 1) + ".Port" , serverGroups.get(depth1).getPort());
				putQueryParameter("ServerGroup." + (depth1 + 1) + ".Weight" , serverGroups.get(depth1).getWeight());
				putQueryParameter("ServerGroup." + (depth1 + 1) + ".Type" , serverGroups.get(depth1).getType());
			}
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

	public List<AlbServerGroup> getAlbServerGroups() {
		return this.albServerGroups;
	}

	public void setAlbServerGroups(List<AlbServerGroup> albServerGroups) {
		this.albServerGroups = albServerGroups;	
		if (albServerGroups != null) {
			for (int depth1 = 0; depth1 < albServerGroups.size(); depth1++) {
				putQueryParameter("AlbServerGroup." + (depth1 + 1) + ".AlbServerGroupId" , albServerGroups.get(depth1).getAlbServerGroupId());
				putQueryParameter("AlbServerGroup." + (depth1 + 1) + ".Port" , albServerGroups.get(depth1).getPort());
				putQueryParameter("AlbServerGroup." + (depth1 + 1) + ".Weight" , albServerGroups.get(depth1).getWeight());
			}
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

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
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

	public List<LifecycleHook> getLifecycleHooks() {
		return this.lifecycleHooks;
	}

	public void setLifecycleHooks(List<LifecycleHook> lifecycleHooks) {
		this.lifecycleHooks = lifecycleHooks;	
		if (lifecycleHooks != null) {
			for (int depth1 = 0; depth1 < lifecycleHooks.size(); depth1++) {
				putQueryParameter("LifecycleHook." + (depth1 + 1) + ".DefaultResult" , lifecycleHooks.get(depth1).getDefaultResult());
				putQueryParameter("LifecycleHook." + (depth1 + 1) + ".LifecycleHookName" , lifecycleHooks.get(depth1).getLifecycleHookName());
				putQueryParameter("LifecycleHook." + (depth1 + 1) + ".HeartbeatTimeout" , lifecycleHooks.get(depth1).getHeartbeatTimeout());
				putQueryParameter("LifecycleHook." + (depth1 + 1) + ".NotificationArn" , lifecycleHooks.get(depth1).getNotificationArn());
				putQueryParameter("LifecycleHook." + (depth1 + 1) + ".NotificationMetadata" , lifecycleHooks.get(depth1).getNotificationMetadata());
				putQueryParameter("LifecycleHook." + (depth1 + 1) + ".LifecycleTransition" , lifecycleHooks.get(depth1).getLifecycleTransition());
			}
		}	
	}

	public String getLoadBalancerIds() {
		return this.loadBalancerIds;
	}

	public void setLoadBalancerIds(String loadBalancerIds) {
		this.loadBalancerIds = loadBalancerIds;
		if(loadBalancerIds != null){
			putQueryParameter("LoadBalancerIds", loadBalancerIds);
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

	public List<LoadBalancerConfig> getLoadBalancerConfigs() {
		return this.loadBalancerConfigs;
	}

	public void setLoadBalancerConfigs(List<LoadBalancerConfig> loadBalancerConfigs) {
		this.loadBalancerConfigs = loadBalancerConfigs;	
		if (loadBalancerConfigs != null) {
			for (int depth1 = 0; depth1 < loadBalancerConfigs.size(); depth1++) {
				putQueryParameter("LoadBalancerConfig." + (depth1 + 1) + ".LoadBalancerId" , loadBalancerConfigs.get(depth1).getLoadBalancerId());
				putQueryParameter("LoadBalancerConfig." + (depth1 + 1) + ".Weight" , loadBalancerConfigs.get(depth1).getWeight());
			}
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

	public List<DBInstance> getDBInstances() {
		return this.dBInstances;
	}

	public void setDBInstances(List<DBInstance> dBInstances) {
		this.dBInstances = dBInstances;	
		if (dBInstances != null) {
			for (int depth1 = 0; depth1 < dBInstances.size(); depth1++) {
				putQueryParameter("DBInstance." + (depth1 + 1) + ".DBInstanceId" , dBInstances.get(depth1).getDBInstanceId());
				putQueryParameter("DBInstance." + (depth1 + 1) + ".Type" , dBInstances.get(depth1).getType());
				putQueryParameter("DBInstance." + (depth1 + 1) + ".AttachMode" , dBInstances.get(depth1).getAttachMode());
			}
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

	public List<VServerGroup> getVServerGroups() {
		return this.vServerGroups;
	}

	public void setVServerGroups(List<VServerGroup> vServerGroups) {
		this.vServerGroups = vServerGroups;	
		if (vServerGroups != null) {
			for (int depth1 = 0; depth1 < vServerGroups.size(); depth1++) {
				putQueryParameter("VServerGroup." + (depth1 + 1) + ".LoadBalancerId" , vServerGroups.get(depth1).getLoadBalancerId());
				if (vServerGroups.get(depth1).getVServerGroupAttributes() != null) {
					for (int depth2 = 0; depth2 < vServerGroups.get(depth1).getVServerGroupAttributes().size(); depth2++) {
						putQueryParameter("VServerGroup." + (depth1 + 1) + ".VServerGroupAttribute." + (depth2 + 1) + ".VServerGroupId" , vServerGroups.get(depth1).getVServerGroupAttributes().get(depth2).getVServerGroupId());
						putQueryParameter("VServerGroup." + (depth1 + 1) + ".VServerGroupAttribute." + (depth2 + 1) + ".Port" , vServerGroups.get(depth1).getVServerGroupAttributes().get(depth2).getPort());
						putQueryParameter("VServerGroup." + (depth1 + 1) + ".VServerGroupAttribute." + (depth2 + 1) + ".Weight" , vServerGroups.get(depth1).getVServerGroupAttributes().get(depth2).getWeight());
					}
				}
			}
		}	
	}

	public static class Tag {

		private Boolean propagate;

		private String value;

		private String key;

		public Boolean getPropagate() {
			return this.propagate;
		}

		public void setPropagate(Boolean propagate) {
			this.propagate = propagate;
		}

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

	public static class ServerGroup {

		private String serverGroupId;

		private Integer port;

		private Integer weight;

		private String type;

		public String getServerGroupId() {
			return this.serverGroupId;
		}

		public void setServerGroupId(String serverGroupId) {
			this.serverGroupId = serverGroupId;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public Integer getWeight() {
			return this.weight;
		}

		public void setWeight(Integer weight) {
			this.weight = weight;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
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

	public static class AlbServerGroup {

		private String albServerGroupId;

		private Integer port;

		private Integer weight;

		public String getAlbServerGroupId() {
			return this.albServerGroupId;
		}

		public void setAlbServerGroupId(String albServerGroupId) {
			this.albServerGroupId = albServerGroupId;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public Integer getWeight() {
			return this.weight;
		}

		public void setWeight(Integer weight) {
			this.weight = weight;
		}
	}

	public static class LifecycleHook {

		private String defaultResult;

		private String lifecycleHookName;

		private Integer heartbeatTimeout;

		private String notificationArn;

		private String notificationMetadata;

		private String lifecycleTransition;

		public String getDefaultResult() {
			return this.defaultResult;
		}

		public void setDefaultResult(String defaultResult) {
			this.defaultResult = defaultResult;
		}

		public String getLifecycleHookName() {
			return this.lifecycleHookName;
		}

		public void setLifecycleHookName(String lifecycleHookName) {
			this.lifecycleHookName = lifecycleHookName;
		}

		public Integer getHeartbeatTimeout() {
			return this.heartbeatTimeout;
		}

		public void setHeartbeatTimeout(Integer heartbeatTimeout) {
			this.heartbeatTimeout = heartbeatTimeout;
		}

		public String getNotificationArn() {
			return this.notificationArn;
		}

		public void setNotificationArn(String notificationArn) {
			this.notificationArn = notificationArn;
		}

		public String getNotificationMetadata() {
			return this.notificationMetadata;
		}

		public void setNotificationMetadata(String notificationMetadata) {
			this.notificationMetadata = notificationMetadata;
		}

		public String getLifecycleTransition() {
			return this.lifecycleTransition;
		}

		public void setLifecycleTransition(String lifecycleTransition) {
			this.lifecycleTransition = lifecycleTransition;
		}
	}

	public static class LoadBalancerConfig {

		private String loadBalancerId;

		private Integer weight;

		public String getLoadBalancerId() {
			return this.loadBalancerId;
		}

		public void setLoadBalancerId(String loadBalancerId) {
			this.loadBalancerId = loadBalancerId;
		}

		public Integer getWeight() {
			return this.weight;
		}

		public void setWeight(Integer weight) {
			this.weight = weight;
		}
	}

	public static class DBInstance {

		private String dBInstanceId;

		private String type;

		private String attachMode;

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getAttachMode() {
			return this.attachMode;
		}

		public void setAttachMode(String attachMode) {
			this.attachMode = attachMode;
		}
	}

	public static class VServerGroup {

		private String loadBalancerId;

		private List<VServerGroupAttribute> vServerGroupAttributes;

		public String getLoadBalancerId() {
			return this.loadBalancerId;
		}

		public void setLoadBalancerId(String loadBalancerId) {
			this.loadBalancerId = loadBalancerId;
		}

		public List<VServerGroupAttribute> getVServerGroupAttributes() {
			return this.vServerGroupAttributes;
		}

		public void setVServerGroupAttributes(List<VServerGroupAttribute> vServerGroupAttributes) {
			this.vServerGroupAttributes = vServerGroupAttributes;
		}

		public static class VServerGroupAttribute {

			private String vServerGroupId;

			private Integer port;

			private Integer weight;

			public String getVServerGroupId() {
				return this.vServerGroupId;
			}

			public void setVServerGroupId(String vServerGroupId) {
				this.vServerGroupId = vServerGroupId;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}

			public Integer getWeight() {
				return this.weight;
			}

			public void setWeight(Integer weight) {
				this.weight = weight;
			}
		}
	}

	@Override
	public Class<CreateScalingGroupResponse> getResponseClass() {
		return CreateScalingGroupResponse.class;
	}

}
