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
public class CreateScalingGroupRequest extends RpcAcsRequest<CreateScalingGroupResponse> {
	   

	private List<String> vSwitchIds;

	private String costOptimizedMode;

	private Boolean spotInstanceRemedy;

	private List<Tag> tags;

	private Integer defaultCooldown;

	private String multiAZPolicy;

	private String dBInstanceIds;

	private String launchTemplateId;

	private Integer desiredCapacity;

	private List<LaunchTemplateOverride> launchTemplateOverrides;

	private Integer minSize;

	private Long ownerId;

	private String vSwitchId;

	private String instanceId;

	private Integer maxSize;

	private List<LifecycleHook> lifecycleHooks;

	private String loadBalancerIds;

	private String clientToken;

	private Integer onDemandBaseCapacity;

	private Integer onDemandPercentageAboveBaseCapacity;

	private String removalPolicy1;

	private String removalPolicy2;

	private String healthCheckType;

	private String resourceOwnerAccount;

	private String scalingGroupName;

	private String ownerAccount;

	private Integer spotInstancePools;

	private Boolean groupDeletionProtection;

	private String launchTemplateVersion;

	private String scalingPolicy;

	private List<VServerGroup> vServerGroups;
	public CreateScalingGroupRequest() {
		super("Ess", "2014-08-28", "CreateScalingGroup", "ess");
		setMethod(MethodType.POST);
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

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
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

	public static class LaunchTemplateOverride {

		private String instanceType;

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
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
