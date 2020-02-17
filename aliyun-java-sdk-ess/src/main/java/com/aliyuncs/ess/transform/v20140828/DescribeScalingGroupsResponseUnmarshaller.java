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
import com.aliyuncs.ess.model.v20140828.DescribeScalingGroupsResponse.ScalingGroup.LaunchTemplateOverride;
import com.aliyuncs.ess.model.v20140828.DescribeScalingGroupsResponse.ScalingGroup.VServerGroup;
import com.aliyuncs.ess.model.v20140828.DescribeScalingGroupsResponse.ScalingGroup.VServerGroup.VServerGroupAttribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScalingGroupsResponseUnmarshaller {

	public static DescribeScalingGroupsResponse unmarshall(DescribeScalingGroupsResponse describeScalingGroupsResponse, UnmarshallerContext _ctx) {
		
		describeScalingGroupsResponse.setRequestId(_ctx.stringValue("DescribeScalingGroupsResponse.RequestId"));
		describeScalingGroupsResponse.setTotalCount(_ctx.integerValue("DescribeScalingGroupsResponse.TotalCount"));
		describeScalingGroupsResponse.setPageNumber(_ctx.integerValue("DescribeScalingGroupsResponse.PageNumber"));
		describeScalingGroupsResponse.setPageSize(_ctx.integerValue("DescribeScalingGroupsResponse.PageSize"));

		List<ScalingGroup> scalingGroups = new ArrayList<ScalingGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScalingGroupsResponse.ScalingGroups.Length"); i++) {
			ScalingGroup scalingGroup = new ScalingGroup();
			scalingGroup.setDefaultCooldown(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].DefaultCooldown"));
			scalingGroup.setMaxSize(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].MaxSize"));
			scalingGroup.setPendingWaitCapacity(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].PendingWaitCapacity"));
			scalingGroup.setRemovingWaitCapacity(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].RemovingWaitCapacity"));
			scalingGroup.setPendingCapacity(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].PendingCapacity"));
			scalingGroup.setRemovingCapacity(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].RemovingCapacity"));
			scalingGroup.setScalingGroupName(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].ScalingGroupName"));
			scalingGroup.setActiveCapacity(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].ActiveCapacity"));
			scalingGroup.setStandbyCapacity(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].StandbyCapacity"));
			scalingGroup.setProtectedCapacity(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].ProtectedCapacity"));
			scalingGroup.setActiveScalingConfigurationId(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].ActiveScalingConfigurationId"));
			scalingGroup.setLaunchTemplateId(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].LaunchTemplateId"));
			scalingGroup.setLaunchTemplateVersion(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].LaunchTemplateVersion"));
			scalingGroup.setScalingGroupId(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].ScalingGroupId"));
			scalingGroup.setRegionId(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].RegionId"));
			scalingGroup.setTotalCapacity(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].TotalCapacity"));
			scalingGroup.setMinSize(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].MinSize"));
			scalingGroup.setLifecycleState(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].LifecycleState"));
			scalingGroup.setCreationTime(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].CreationTime"));
			scalingGroup.setModificationTime(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].ModificationTime"));
			scalingGroup.setVpcId(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].VpcId"));
			scalingGroup.setVSwitchId(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].VSwitchId"));
			scalingGroup.setMultiAZPolicy(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].MultiAZPolicy"));
			scalingGroup.setHealthCheckType(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].HealthCheckType"));
			scalingGroup.setScalingPolicy(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].ScalingPolicy"));
			scalingGroup.setStoppedCapacity(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].StoppedCapacity"));
			scalingGroup.setCostOptimizedMode(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].CostOptimizedMode"));
			scalingGroup.setOnDemandBaseCapacity(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].OnDemandBaseCapacity"));
			scalingGroup.setOnDemandPercentageAboveBaseCapacity(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].OnDemandPercentageAboveBaseCapacity"));
			scalingGroup.setSpotInstanceRemedy(_ctx.booleanValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].SpotInstanceRemedy"));
			scalingGroup.setSpotInstancePools(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].SpotInstancePools"));
			scalingGroup.setDesiredCapacity(_ctx.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].DesiredCapacity"));
			scalingGroup.setGroupDeletionProtection(_ctx.booleanValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].GroupDeletionProtection"));

			List<String> vSwitchIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].VSwitchIds.Length"); j++) {
				vSwitchIds.add(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].VSwitchIds["+ j +"]"));
			}
			scalingGroup.setVSwitchIds(vSwitchIds);

			List<String> removalPolicies = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].RemovalPolicies.Length"); j++) {
				removalPolicies.add(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].RemovalPolicies["+ j +"]"));
			}
			scalingGroup.setRemovalPolicies(removalPolicies);

			List<String> dBInstanceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].DBInstanceIds.Length"); j++) {
				dBInstanceIds.add(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].DBInstanceIds["+ j +"]"));
			}
			scalingGroup.setDBInstanceIds(dBInstanceIds);

			List<String> loadBalancerIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].LoadBalancerIds.Length"); j++) {
				loadBalancerIds.add(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].LoadBalancerIds["+ j +"]"));
			}
			scalingGroup.setLoadBalancerIds(loadBalancerIds);

			List<String> suspendedProcesses = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].SuspendedProcesses.Length"); j++) {
				suspendedProcesses.add(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].SuspendedProcesses["+ j +"]"));
			}
			scalingGroup.setSuspendedProcesses(suspendedProcesses);

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

			List<LaunchTemplateOverride> launchTemplateOverrides = new ArrayList<LaunchTemplateOverride>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].LaunchTemplateOverrides.Length"); j++) {
				LaunchTemplateOverride launchTemplateOverride = new LaunchTemplateOverride();
				launchTemplateOverride.setInstanceType(_ctx.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].LaunchTemplateOverrides["+ j +"].InstanceType"));

				launchTemplateOverrides.add(launchTemplateOverride);
			}
			scalingGroup.setLaunchTemplateOverrides(launchTemplateOverrides);

			scalingGroups.add(scalingGroup);
		}
		describeScalingGroupsResponse.setScalingGroups(scalingGroups);
	 
	 	return describeScalingGroupsResponse;
	}
}