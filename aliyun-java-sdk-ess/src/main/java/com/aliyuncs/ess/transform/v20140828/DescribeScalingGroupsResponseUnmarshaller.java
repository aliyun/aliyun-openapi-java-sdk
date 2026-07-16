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

package com.aliyuncs.ess.transform.v20140828;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ess.model.v20140828.DescribeScalingGroupsResponse;
import com.aliyuncs.ess.model.v20140828.DescribeScalingGroupsResponse.ScalingGroup;
import com.aliyuncs.ess.model.v20140828.DescribeScalingGroupsResponse.ScalingGroup.AlbServerGroup;
import com.aliyuncs.ess.model.v20140828.DescribeScalingGroupsResponse.ScalingGroup.CapacityOptions;
import com.aliyuncs.ess.model.v20140828.DescribeScalingGroupsResponse.ScalingGroup.DBInstance;
import com.aliyuncs.ess.model.v20140828.DescribeScalingGroupsResponse.ScalingGroup.LaunchTemplateOverride;
import com.aliyuncs.ess.model.v20140828.DescribeScalingGroupsResponse.ScalingGroup.LoadBalancerConfig;
import com.aliyuncs.ess.model.v20140828.DescribeScalingGroupsResponse.ScalingGroup.ServerGroup;
import com.aliyuncs.ess.model.v20140828.DescribeScalingGroupsResponse.ScalingGroup.Tag;
import com.aliyuncs.ess.model.v20140828.DescribeScalingGroupsResponse.ScalingGroup.VServerGroup;
import com.aliyuncs.ess.model.v20140828.DescribeScalingGroupsResponse.ScalingGroup.VServerGroup.VServerGroupAttribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScalingGroupsResponseUnmarshaller {

	public static DescribeScalingGroupsResponse unmarshall(DescribeScalingGroupsResponse describeScalingGroupsResponse, UnmarshallerContext _ctx) {
		
		describeScalingGroupsResponse.setRequestId(_ctx.stringValue("DescribeScalingGroupsResponse.RequestId"));
		describeScalingGroupsResponse.setTotalCount(_ctx.integerValue("DescribeScalingGroupsResponse.TotalCount"));
		describeScalingGroupsResponse.setPageSize(_ctx.integerValue("DescribeScalingGroupsResponse.PageSize"));
		describeScalingGroupsResponse.setPageNumber(_ctx.integerValue("DescribeScalingGroupsResponse.PageNumber"));

		List<ScalingGroup> scalingGroups = new ArrayList<ScalingGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScalingGroupsResponse.ScalingGroups.Length"); i++) {
			ScalingGroup scalingGroup = new ScalingGroup();
			scalingGroup.setSpotInstanceRemedy(_ctx.booleanValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].SpotInstanceRemedy"));
			scalingGroup.setResourceGroupId(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].ResourceGroupId"));
			scalingGroup.setActiveScalingConfigurationId(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].ActiveScalingConfigurationId"));
			scalingGroup.setDesiredCapacity(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].DesiredCapacity"));
			scalingGroup.setOnDemandBaseCapacity(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].OnDemandBaseCapacity"));
			scalingGroup.setRemovingCapacity(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].RemovingCapacity"));
			scalingGroup.setScalingGroupId(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].ScalingGroupId"));
			scalingGroup.setPendingCapacity(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].PendingCapacity"));
			scalingGroup.setVSwitchId(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].VSwitchId"));
			scalingGroup.setSpotInstancePools(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].SpotInstancePools"));
			scalingGroup.setLaunchTemplateId(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].LaunchTemplateId"));
			scalingGroup.setCustomPolicyARN(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].CustomPolicyARN"));
			scalingGroup.setSpotCapacity(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].SpotCapacity"));
			scalingGroup.setScalingGroupName(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].ScalingGroupName"));
			scalingGroup.setScaleOutAmountCheck(_ctx.booleanValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].ScaleOutAmountCheck"));
			scalingGroup.setDefaultCooldown(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].DefaultCooldown"));
			scalingGroup.setVpcId(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].VpcId"));
			scalingGroup.setGroupType(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].GroupType"));
			scalingGroup.setCreationTime(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].CreationTime"));
			scalingGroup.setLaunchTemplateVersion(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].LaunchTemplateVersion"));
			scalingGroup.setMultiAZPolicy(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].MultiAZPolicy"));
			scalingGroup.setStoppedCapacity(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].StoppedCapacity"));
			scalingGroup.setCurrentHostName(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].CurrentHostName"));
			scalingGroup.setHealthCheckType(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].HealthCheckType"));
			scalingGroup.setAutoRebalance(_ctx.booleanValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].AutoRebalance"));
			scalingGroup.setCompensateWithOnDemand(_ctx.booleanValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].CompensateWithOnDemand"));
			scalingGroup.setOnDemandPercentageAboveBaseCapacity(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].OnDemandPercentageAboveBaseCapacity"));
			scalingGroup.setModificationTime(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].ModificationTime"));
			scalingGroup.setLifecycleState(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].LifecycleState"));
			scalingGroup.setTotalInstanceCount(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].TotalInstanceCount"));
			scalingGroup.setAllocationStrategy(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].AllocationStrategy"));
			scalingGroup.setWeighted(_ctx.booleanValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].Weighted"));
			scalingGroup.setInitCapacity(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].InitCapacity"));
			scalingGroup.setPendingWaitCapacity(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].PendingWaitCapacity"));
			scalingGroup.setTotalCapacity(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].TotalCapacity"));
			scalingGroup.setRemovingWaitCapacity(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].RemovingWaitCapacity"));
			scalingGroup.setIsElasticStrengthInAlarm(_ctx.booleanValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].IsElasticStrengthInAlarm"));
			scalingGroup.setSpotAllocationStrategy(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].SpotAllocationStrategy"));
			scalingGroup.setProtectedCapacity(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].ProtectedCapacity"));
			scalingGroup.setStandbyCapacity(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].StandbyCapacity"));
			scalingGroup.setScalingPolicy(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].ScalingPolicy"));
			scalingGroup.setGroupDeletionProtection(_ctx.booleanValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].GroupDeletionProtection"));
			scalingGroup.setMaxSize(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].MaxSize"));
			scalingGroup.setEnableDesiredCapacity(_ctx.booleanValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].EnableDesiredCapacity"));
			scalingGroup.setMinSize(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].MinSize"));
			scalingGroup.setActiveCapacity(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].ActiveCapacity"));
			scalingGroup.setAzBalance(_ctx.booleanValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].AzBalance"));
			scalingGroup.setBalanceMode(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].BalanceMode"));
			scalingGroup.setSystemSuspended(_ctx.booleanValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].SystemSuspended"));
			scalingGroup.setMonitorGroupId(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].MonitorGroupId"));
			scalingGroup.setRegionId(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].RegionId"));
			scalingGroup.setMaxInstanceLifetime(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].MaxInstanceLifetime"));
			scalingGroup.setStopInstanceTimeout(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].StopInstanceTimeout"));

			List<String> removalPolicies = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].RemovalPolicies.Length"); j++) {
				removalPolicies.add(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].RemovalPolicies["+ j +"]"));
			}
			scalingGroup.setRemovalPolicies(removalPolicies);

			List<String> suspendedProcesses = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].SuspendedProcesses.Length"); j++) {
				suspendedProcesses.add(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].SuspendedProcesses["+ j +"]"));
			}
			scalingGroup.setSuspendedProcesses(suspendedProcesses);

			List<String> vSwitchIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].VSwitchIds.Length"); j++) {
				vSwitchIds.add(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].VSwitchIds["+ j +"]"));
			}
			scalingGroup.setVSwitchIds(vSwitchIds);

			List<String> loadBalancerIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].LoadBalancerIds.Length"); j++) {
				loadBalancerIds.add(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].LoadBalancerIds["+ j +"]"));
			}
			scalingGroup.setLoadBalancerIds(loadBalancerIds);

			List<String> dBInstanceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].DBInstanceIds.Length"); j++) {
				dBInstanceIds.add(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].DBInstanceIds["+ j +"]"));
			}
			scalingGroup.setDBInstanceIds(dBInstanceIds);

			List<String> healthCheckTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].HealthCheckTypes.Length"); j++) {
				healthCheckTypes.add(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].HealthCheckTypes["+ j +"]"));
			}
			scalingGroup.setHealthCheckTypes(healthCheckTypes);

			CapacityOptions capacityOptions = new CapacityOptions();
			capacityOptions.setOnDemandBaseCapacity(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].CapacityOptions.OnDemandBaseCapacity"));
			capacityOptions.setCompensateWithOnDemand(_ctx.booleanValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].CapacityOptions.CompensateWithOnDemand"));
			capacityOptions.setOnDemandPercentageAboveBaseCapacity(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].CapacityOptions.OnDemandPercentageAboveBaseCapacity"));
			capacityOptions.setSpotAutoReplaceOnDemand(_ctx.booleanValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].CapacityOptions.SpotAutoReplaceOnDemand"));
			capacityOptions.setPriceComparisonMode(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].CapacityOptions.PriceComparisonMode"));
			scalingGroup.setCapacityOptions(capacityOptions);

			List<ServerGroup> serverGroups = new ArrayList<ServerGroup>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].ServerGroups.Length"); j++) {
				ServerGroup serverGroup = new ServerGroup();
				serverGroup.setType(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].ServerGroups["+ j +"].Type"));
				serverGroup.setPort(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].ServerGroups["+ j +"].Port"));
				serverGroup.setServerGroupId(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].ServerGroups["+ j +"].ServerGroupId"));
				serverGroup.setWeight(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].ServerGroups["+ j +"].Weight"));

				serverGroups.add(serverGroup);
			}
			scalingGroup.setServerGroups(serverGroups);

			List<AlbServerGroup> albServerGroups = new ArrayList<AlbServerGroup>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].AlbServerGroups.Length"); j++) {
				AlbServerGroup albServerGroup = new AlbServerGroup();
				albServerGroup.setAlbServerGroupId(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].AlbServerGroups["+ j +"].AlbServerGroupId"));
				albServerGroup.setPort(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].AlbServerGroups["+ j +"].Port"));
				albServerGroup.setWeight(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].AlbServerGroups["+ j +"].Weight"));

				albServerGroups.add(albServerGroup);
			}
			scalingGroup.setAlbServerGroups(albServerGroups);

			List<LaunchTemplateOverride> launchTemplateOverrides = new ArrayList<LaunchTemplateOverride>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].LaunchTemplateOverrides.Length"); j++) {
				LaunchTemplateOverride launchTemplateOverride = new LaunchTemplateOverride();
				launchTemplateOverride.setWeightedCapacity(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].LaunchTemplateOverrides["+ j +"].WeightedCapacity"));
				launchTemplateOverride.setSpotPriceLimit(_ctx.floatValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].LaunchTemplateOverrides["+ j +"].SpotPriceLimit"));
				launchTemplateOverride.setInstanceType(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].LaunchTemplateOverrides["+ j +"].InstanceType"));

				launchTemplateOverrides.add(launchTemplateOverride);
			}
			scalingGroup.setLaunchTemplateOverrides(launchTemplateOverrides);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].Tags["+ j +"].TagKey"));
				tag.setPropagate(_ctx.booleanValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].Tags["+ j +"].Propagate"));
				tag.setTagValue(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			scalingGroup.setTags(tags);

			List<LoadBalancerConfig> loadBalancerConfigs = new ArrayList<LoadBalancerConfig>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].LoadBalancerConfigs.Length"); j++) {
				LoadBalancerConfig loadBalancerConfig = new LoadBalancerConfig();
				loadBalancerConfig.setLoadBalancerId(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].LoadBalancerConfigs["+ j +"].LoadBalancerId"));
				loadBalancerConfig.setWeight(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].LoadBalancerConfigs["+ j +"].Weight"));

				loadBalancerConfigs.add(loadBalancerConfig);
			}
			scalingGroup.setLoadBalancerConfigs(loadBalancerConfigs);

			List<VServerGroup> vServerGroups = new ArrayList<VServerGroup>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].VServerGroups.Length"); j++) {
				VServerGroup vServerGroup = new VServerGroup();
				vServerGroup.setLoadBalancerId(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].VServerGroups["+ j +"].LoadBalancerId"));

				List<VServerGroupAttribute> vServerGroupAttributes = new ArrayList<VServerGroupAttribute>();
				for (int k = 0; k < _ctx.lengthValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].VServerGroups["+ j +"].VServerGroupAttributes.Length"); k++) {
					VServerGroupAttribute vServerGroupAttribute = new VServerGroupAttribute();
					vServerGroupAttribute.setVServerGroupId(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].VServerGroups["+ j +"].VServerGroupAttributes["+ k +"].VServerGroupId"));
					vServerGroupAttribute.setPort(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].VServerGroups["+ j +"].VServerGroupAttributes["+ k +"].Port"));
					vServerGroupAttribute.setWeight(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].VServerGroups["+ j +"].VServerGroupAttributes["+ k +"].Weight"));

					vServerGroupAttributes.add(vServerGroupAttribute);
				}
				vServerGroup.setVServerGroupAttributes(vServerGroupAttributes);

				vServerGroups.add(vServerGroup);
			}
			scalingGroup.setVServerGroups(vServerGroups);

			List<DBInstance> dBInstances = new ArrayList<DBInstance>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].DBInstances.Length"); j++) {
				DBInstance dBInstance = new DBInstance();
				dBInstance.setType(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].DBInstances["+ j +"].Type"));
				dBInstance.setDBInstanceId(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].DBInstances["+ j +"].DBInstanceId"));

				List<String> securityGroupIds = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].DBInstances["+ j +"].SecurityGroupIds.Length"); k++) {
					securityGroupIds.add(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].DBInstances["+ j +"].SecurityGroupIds["+ k +"]"));
				}
				dBInstance.setSecurityGroupIds(securityGroupIds);

				dBInstances.add(dBInstance);
			}
			scalingGroup.setDBInstances(dBInstances);

			scalingGroups.add(scalingGroup);
		}
		describeScalingGroupsResponse.setScalingGroups(scalingGroups);
	 
	 	return describeScalingGroupsResponse;
	}
}