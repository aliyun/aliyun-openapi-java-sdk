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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ess.transform.v20140828.DescribeScalingGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeScalingGroupsResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<ScalingGroup> scalingGroups;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ScalingGroup> getScalingGroups() {
		return this.scalingGroups;
	}

	public void setScalingGroups(List<ScalingGroup> scalingGroups) {
		this.scalingGroups = scalingGroups;
	}

	public static class ScalingGroup {

		private String vpcId;

		private String creationTime;

		private Integer totalInstanceCount;

		private String scalingGroupName;

		private Boolean weighted;

		private Integer spotInstancePools;

		private Integer stoppedCapacity;

		private Integer onDemandPercentageAboveBaseCapacity;

		private String modificationTime;

		private Integer minSize;

		private String scalingGroupId;

		private Boolean compensateWithOnDemand;

		private String scalingPolicy;

		private Integer removingWaitCapacity;

		private Integer activeCapacity;

		private Integer onDemandBaseCapacity;

		private Integer protectedCapacity;

		private String healthCheckType;

		private String lifecycleState;

		private Boolean groupDeletionProtection;

		private String activeScalingConfigurationId;

		private String groupType;

		private String multiAZPolicy;

		private Integer removingCapacity;

		private Integer pendingWaitCapacity;

		private Integer standbyCapacity;

		private String currentHostName;

		private Integer pendingCapacity;

		private String launchTemplateId;

		private Integer totalCapacity;

		private Integer desiredCapacity;

		private Boolean spotInstanceRemedy;

		private String launchTemplateVersion;

		private String regionId;

		private String vSwitchId;

		private Integer maxSize;

		private Boolean scaleOutAmountCheck;

		private Integer defaultCooldown;

		private Boolean systemSuspended;

		private Boolean isElasticStrengthInAlarm;

		private String monitorGroupId;

		private Boolean azBalance;

		private String allocationStrategy;

		private String spotAllocationStrategy;

		private Integer maxInstanceLifetime;

		private String customPolicyARN;

		private Integer initCapacity;

		private String resourceGroupId;

		private Boolean enableDesiredCapacity;

		private Integer spotCapacity;

		private Integer stopInstanceTimeout;

		private List<VServerGroup> vServerGroups;

		private List<LaunchTemplateOverride> launchTemplateOverrides;

		private List<AlbServerGroup> albServerGroups;

		private List<ServerGroup> serverGroups;

		private List<LoadBalancerConfig> loadBalancerConfigs;

		private List<Tag> tags;

		private List<DBInstance> dBInstances;

		private List<String> removalPolicies;

		private List<String> dBInstanceIds;

		private List<String> loadBalancerIds;

		private List<String> vSwitchIds;

		private List<String> suspendedProcesses;

		private List<String> healthCheckTypes;

		private CapacityOptions capacityOptions;

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public Integer getTotalInstanceCount() {
			return this.totalInstanceCount;
		}

		public void setTotalInstanceCount(Integer totalInstanceCount) {
			this.totalInstanceCount = totalInstanceCount;
		}

		public String getScalingGroupName() {
			return this.scalingGroupName;
		}

		public void setScalingGroupName(String scalingGroupName) {
			this.scalingGroupName = scalingGroupName;
		}

		public Boolean getWeighted() {
			return this.weighted;
		}

		public void setWeighted(Boolean weighted) {
			this.weighted = weighted;
		}

		public Integer getSpotInstancePools() {
			return this.spotInstancePools;
		}

		public void setSpotInstancePools(Integer spotInstancePools) {
			this.spotInstancePools = spotInstancePools;
		}

		public Integer getStoppedCapacity() {
			return this.stoppedCapacity;
		}

		public void setStoppedCapacity(Integer stoppedCapacity) {
			this.stoppedCapacity = stoppedCapacity;
		}

		public Integer getOnDemandPercentageAboveBaseCapacity() {
			return this.onDemandPercentageAboveBaseCapacity;
		}

		public void setOnDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
			this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
		}

		public String getModificationTime() {
			return this.modificationTime;
		}

		public void setModificationTime(String modificationTime) {
			this.modificationTime = modificationTime;
		}

		public Integer getMinSize() {
			return this.minSize;
		}

		public void setMinSize(Integer minSize) {
			this.minSize = minSize;
		}

		public String getScalingGroupId() {
			return this.scalingGroupId;
		}

		public void setScalingGroupId(String scalingGroupId) {
			this.scalingGroupId = scalingGroupId;
		}

		public Boolean getCompensateWithOnDemand() {
			return this.compensateWithOnDemand;
		}

		public void setCompensateWithOnDemand(Boolean compensateWithOnDemand) {
			this.compensateWithOnDemand = compensateWithOnDemand;
		}

		public String getScalingPolicy() {
			return this.scalingPolicy;
		}

		public void setScalingPolicy(String scalingPolicy) {
			this.scalingPolicy = scalingPolicy;
		}

		public Integer getRemovingWaitCapacity() {
			return this.removingWaitCapacity;
		}

		public void setRemovingWaitCapacity(Integer removingWaitCapacity) {
			this.removingWaitCapacity = removingWaitCapacity;
		}

		public Integer getActiveCapacity() {
			return this.activeCapacity;
		}

		public void setActiveCapacity(Integer activeCapacity) {
			this.activeCapacity = activeCapacity;
		}

		public Integer getOnDemandBaseCapacity() {
			return this.onDemandBaseCapacity;
		}

		public void setOnDemandBaseCapacity(Integer onDemandBaseCapacity) {
			this.onDemandBaseCapacity = onDemandBaseCapacity;
		}

		public Integer getProtectedCapacity() {
			return this.protectedCapacity;
		}

		public void setProtectedCapacity(Integer protectedCapacity) {
			this.protectedCapacity = protectedCapacity;
		}

		public String getHealthCheckType() {
			return this.healthCheckType;
		}

		public void setHealthCheckType(String healthCheckType) {
			this.healthCheckType = healthCheckType;
		}

		public String getLifecycleState() {
			return this.lifecycleState;
		}

		public void setLifecycleState(String lifecycleState) {
			this.lifecycleState = lifecycleState;
		}

		public Boolean getGroupDeletionProtection() {
			return this.groupDeletionProtection;
		}

		public void setGroupDeletionProtection(Boolean groupDeletionProtection) {
			this.groupDeletionProtection = groupDeletionProtection;
		}

		public String getActiveScalingConfigurationId() {
			return this.activeScalingConfigurationId;
		}

		public void setActiveScalingConfigurationId(String activeScalingConfigurationId) {
			this.activeScalingConfigurationId = activeScalingConfigurationId;
		}

		public String getGroupType() {
			return this.groupType;
		}

		public void setGroupType(String groupType) {
			this.groupType = groupType;
		}

		public String getMultiAZPolicy() {
			return this.multiAZPolicy;
		}

		public void setMultiAZPolicy(String multiAZPolicy) {
			this.multiAZPolicy = multiAZPolicy;
		}

		public Integer getRemovingCapacity() {
			return this.removingCapacity;
		}

		public void setRemovingCapacity(Integer removingCapacity) {
			this.removingCapacity = removingCapacity;
		}

		public Integer getPendingWaitCapacity() {
			return this.pendingWaitCapacity;
		}

		public void setPendingWaitCapacity(Integer pendingWaitCapacity) {
			this.pendingWaitCapacity = pendingWaitCapacity;
		}

		public Integer getStandbyCapacity() {
			return this.standbyCapacity;
		}

		public void setStandbyCapacity(Integer standbyCapacity) {
			this.standbyCapacity = standbyCapacity;
		}

		public String getCurrentHostName() {
			return this.currentHostName;
		}

		public void setCurrentHostName(String currentHostName) {
			this.currentHostName = currentHostName;
		}

		public Integer getPendingCapacity() {
			return this.pendingCapacity;
		}

		public void setPendingCapacity(Integer pendingCapacity) {
			this.pendingCapacity = pendingCapacity;
		}

		public String getLaunchTemplateId() {
			return this.launchTemplateId;
		}

		public void setLaunchTemplateId(String launchTemplateId) {
			this.launchTemplateId = launchTemplateId;
		}

		public Integer getTotalCapacity() {
			return this.totalCapacity;
		}

		public void setTotalCapacity(Integer totalCapacity) {
			this.totalCapacity = totalCapacity;
		}

		public Integer getDesiredCapacity() {
			return this.desiredCapacity;
		}

		public void setDesiredCapacity(Integer desiredCapacity) {
			this.desiredCapacity = desiredCapacity;
		}

		public Boolean getSpotInstanceRemedy() {
			return this.spotInstanceRemedy;
		}

		public void setSpotInstanceRemedy(Boolean spotInstanceRemedy) {
			this.spotInstanceRemedy = spotInstanceRemedy;
		}

		public String getLaunchTemplateVersion() {
			return this.launchTemplateVersion;
		}

		public void setLaunchTemplateVersion(String launchTemplateVersion) {
			this.launchTemplateVersion = launchTemplateVersion;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public Integer getMaxSize() {
			return this.maxSize;
		}

		public void setMaxSize(Integer maxSize) {
			this.maxSize = maxSize;
		}

		public Boolean getScaleOutAmountCheck() {
			return this.scaleOutAmountCheck;
		}

		public void setScaleOutAmountCheck(Boolean scaleOutAmountCheck) {
			this.scaleOutAmountCheck = scaleOutAmountCheck;
		}

		public Integer getDefaultCooldown() {
			return this.defaultCooldown;
		}

		public void setDefaultCooldown(Integer defaultCooldown) {
			this.defaultCooldown = defaultCooldown;
		}

		public Boolean getSystemSuspended() {
			return this.systemSuspended;
		}

		public void setSystemSuspended(Boolean systemSuspended) {
			this.systemSuspended = systemSuspended;
		}

		public Boolean getIsElasticStrengthInAlarm() {
			return this.isElasticStrengthInAlarm;
		}

		public void setIsElasticStrengthInAlarm(Boolean isElasticStrengthInAlarm) {
			this.isElasticStrengthInAlarm = isElasticStrengthInAlarm;
		}

		public String getMonitorGroupId() {
			return this.monitorGroupId;
		}

		public void setMonitorGroupId(String monitorGroupId) {
			this.monitorGroupId = monitorGroupId;
		}

		public Boolean getAzBalance() {
			return this.azBalance;
		}

		public void setAzBalance(Boolean azBalance) {
			this.azBalance = azBalance;
		}

		public String getAllocationStrategy() {
			return this.allocationStrategy;
		}

		public void setAllocationStrategy(String allocationStrategy) {
			this.allocationStrategy = allocationStrategy;
		}

		public String getSpotAllocationStrategy() {
			return this.spotAllocationStrategy;
		}

		public void setSpotAllocationStrategy(String spotAllocationStrategy) {
			this.spotAllocationStrategy = spotAllocationStrategy;
		}

		public Integer getMaxInstanceLifetime() {
			return this.maxInstanceLifetime;
		}

		public void setMaxInstanceLifetime(Integer maxInstanceLifetime) {
			this.maxInstanceLifetime = maxInstanceLifetime;
		}

		public String getCustomPolicyARN() {
			return this.customPolicyARN;
		}

		public void setCustomPolicyARN(String customPolicyARN) {
			this.customPolicyARN = customPolicyARN;
		}

		public Integer getInitCapacity() {
			return this.initCapacity;
		}

		public void setInitCapacity(Integer initCapacity) {
			this.initCapacity = initCapacity;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public Boolean getEnableDesiredCapacity() {
			return this.enableDesiredCapacity;
		}

		public void setEnableDesiredCapacity(Boolean enableDesiredCapacity) {
			this.enableDesiredCapacity = enableDesiredCapacity;
		}

		public Integer getSpotCapacity() {
			return this.spotCapacity;
		}

		public void setSpotCapacity(Integer spotCapacity) {
			this.spotCapacity = spotCapacity;
		}

		public Integer getStopInstanceTimeout() {
			return this.stopInstanceTimeout;
		}

		public void setStopInstanceTimeout(Integer stopInstanceTimeout) {
			this.stopInstanceTimeout = stopInstanceTimeout;
		}

		public List<VServerGroup> getVServerGroups() {
			return this.vServerGroups;
		}

		public void setVServerGroups(List<VServerGroup> vServerGroups) {
			this.vServerGroups = vServerGroups;
		}

		public List<LaunchTemplateOverride> getLaunchTemplateOverrides() {
			return this.launchTemplateOverrides;
		}

		public void setLaunchTemplateOverrides(List<LaunchTemplateOverride> launchTemplateOverrides) {
			this.launchTemplateOverrides = launchTemplateOverrides;
		}

		public List<AlbServerGroup> getAlbServerGroups() {
			return this.albServerGroups;
		}

		public void setAlbServerGroups(List<AlbServerGroup> albServerGroups) {
			this.albServerGroups = albServerGroups;
		}

		public List<ServerGroup> getServerGroups() {
			return this.serverGroups;
		}

		public void setServerGroups(List<ServerGroup> serverGroups) {
			this.serverGroups = serverGroups;
		}

		public List<LoadBalancerConfig> getLoadBalancerConfigs() {
			return this.loadBalancerConfigs;
		}

		public void setLoadBalancerConfigs(List<LoadBalancerConfig> loadBalancerConfigs) {
			this.loadBalancerConfigs = loadBalancerConfigs;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<DBInstance> getDBInstances() {
			return this.dBInstances;
		}

		public void setDBInstances(List<DBInstance> dBInstances) {
			this.dBInstances = dBInstances;
		}

		public List<String> getRemovalPolicies() {
			return this.removalPolicies;
		}

		public void setRemovalPolicies(List<String> removalPolicies) {
			this.removalPolicies = removalPolicies;
		}

		public List<String> getDBInstanceIds() {
			return this.dBInstanceIds;
		}

		public void setDBInstanceIds(List<String> dBInstanceIds) {
			this.dBInstanceIds = dBInstanceIds;
		}

		public List<String> getLoadBalancerIds() {
			return this.loadBalancerIds;
		}

		public void setLoadBalancerIds(List<String> loadBalancerIds) {
			this.loadBalancerIds = loadBalancerIds;
		}

		public List<String> getVSwitchIds() {
			return this.vSwitchIds;
		}

		public void setVSwitchIds(List<String> vSwitchIds) {
			this.vSwitchIds = vSwitchIds;
		}

		public List<String> getSuspendedProcesses() {
			return this.suspendedProcesses;
		}

		public void setSuspendedProcesses(List<String> suspendedProcesses) {
			this.suspendedProcesses = suspendedProcesses;
		}

		public List<String> getHealthCheckTypes() {
			return this.healthCheckTypes;
		}

		public void setHealthCheckTypes(List<String> healthCheckTypes) {
			this.healthCheckTypes = healthCheckTypes;
		}

		public CapacityOptions getCapacityOptions() {
			return this.capacityOptions;
		}

		public void setCapacityOptions(CapacityOptions capacityOptions) {
			this.capacityOptions = capacityOptions;
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

				private Integer weight;

				private Integer port;

				public String getVServerGroupId() {
					return this.vServerGroupId;
				}

				public void setVServerGroupId(String vServerGroupId) {
					this.vServerGroupId = vServerGroupId;
				}

				public Integer getWeight() {
					return this.weight;
				}

				public void setWeight(Integer weight) {
					this.weight = weight;
				}

				public Integer getPort() {
					return this.port;
				}

				public void setPort(Integer port) {
					this.port = port;
				}
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

		public static class AlbServerGroup {

			private String albServerGroupId;

			private Integer weight;

			private Integer port;

			public String getAlbServerGroupId() {
				return this.albServerGroupId;
			}

			public void setAlbServerGroupId(String albServerGroupId) {
				this.albServerGroupId = albServerGroupId;
			}

			public Integer getWeight() {
				return this.weight;
			}

			public void setWeight(Integer weight) {
				this.weight = weight;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}
		}

		public static class ServerGroup {

			private String serverGroupId;

			private String type;

			private Integer weight;

			private Integer port;

			public String getServerGroupId() {
				return this.serverGroupId;
			}

			public void setServerGroupId(String serverGroupId) {
				this.serverGroupId = serverGroupId;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Integer getWeight() {
				return this.weight;
			}

			public void setWeight(Integer weight) {
				this.weight = weight;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
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

		public static class Tag {

			private String tagKey;

			private String tagValue;

			private Boolean propagate;

			public String getTagKey() {
				return this.tagKey;
			}

			public void setTagKey(String tagKey) {
				this.tagKey = tagKey;
			}

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}

			public Boolean getPropagate() {
				return this.propagate;
			}

			public void setPropagate(Boolean propagate) {
				this.propagate = propagate;
			}
		}

		public static class DBInstance {

			private String dBInstanceId;

			private String type;

			private List<String> securityGroupIds;

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

			public List<String> getSecurityGroupIds() {
				return this.securityGroupIds;
			}

			public void setSecurityGroupIds(List<String> securityGroupIds) {
				this.securityGroupIds = securityGroupIds;
			}
		}

		public static class CapacityOptions {

			private Integer onDemandBaseCapacity;

			private Integer onDemandPercentageAboveBaseCapacity;

			private Boolean compensateWithOnDemand;

			private Boolean spotAutoReplaceOnDemand;

			private String priceComparisonMode;

			public Integer getOnDemandBaseCapacity() {
				return this.onDemandBaseCapacity;
			}

			public void setOnDemandBaseCapacity(Integer onDemandBaseCapacity) {
				this.onDemandBaseCapacity = onDemandBaseCapacity;
			}

			public Integer getOnDemandPercentageAboveBaseCapacity() {
				return this.onDemandPercentageAboveBaseCapacity;
			}

			public void setOnDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
				this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
			}

			public Boolean getCompensateWithOnDemand() {
				return this.compensateWithOnDemand;
			}

			public void setCompensateWithOnDemand(Boolean compensateWithOnDemand) {
				this.compensateWithOnDemand = compensateWithOnDemand;
			}

			public Boolean getSpotAutoReplaceOnDemand() {
				return this.spotAutoReplaceOnDemand;
			}

			public void setSpotAutoReplaceOnDemand(Boolean spotAutoReplaceOnDemand) {
				this.spotAutoReplaceOnDemand = spotAutoReplaceOnDemand;
			}

			public String getPriceComparisonMode() {
				return this.priceComparisonMode;
			}

			public void setPriceComparisonMode(String priceComparisonMode) {
				this.priceComparisonMode = priceComparisonMode;
			}
		}
	}

	@Override
	public DescribeScalingGroupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeScalingGroupsResponseUnmarshaller.unmarshall(this, context);
	}
}
