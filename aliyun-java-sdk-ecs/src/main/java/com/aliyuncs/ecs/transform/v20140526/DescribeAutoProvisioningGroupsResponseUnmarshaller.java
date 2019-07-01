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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeAutoProvisioningGroupsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroup;
import com.aliyuncs.ecs.model.v20140526.DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroup.LaunchTemplateConfig;
import com.aliyuncs.ecs.model.v20140526.DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroup.PayAsYouGoOptions;
import com.aliyuncs.ecs.model.v20140526.DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroup.SpotOptions;
import com.aliyuncs.ecs.model.v20140526.DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroup.TargetCapacitySpecification;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAutoProvisioningGroupsResponseUnmarshaller {

	public static DescribeAutoProvisioningGroupsResponse unmarshall(DescribeAutoProvisioningGroupsResponse describeAutoProvisioningGroupsResponse, UnmarshallerContext context) {
		
		describeAutoProvisioningGroupsResponse.setRequestId(context.stringValue("DescribeAutoProvisioningGroupsResponse.RequestId"));
		describeAutoProvisioningGroupsResponse.setTotalCount(context.integerValue("DescribeAutoProvisioningGroupsResponse.TotalCount"));
		describeAutoProvisioningGroupsResponse.setPageNumber(context.integerValue("DescribeAutoProvisioningGroupsResponse.PageNumber"));
		describeAutoProvisioningGroupsResponse.setPageSize(context.integerValue("DescribeAutoProvisioningGroupsResponse.PageSize"));

		List<AutoProvisioningGroup> autoProvisioningGroups = new ArrayList<AutoProvisioningGroup>();
		for (int i = 0; i < context.lengthValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups.Length"); i++) {
			AutoProvisioningGroup autoProvisioningGroup = new AutoProvisioningGroup();
			autoProvisioningGroup.setAutoProvisioningGroupId(context.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].AutoProvisioningGroupId"));
			autoProvisioningGroup.setAutoProvisioningGroupName(context.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].AutoProvisioningGroupName"));
			autoProvisioningGroup.setAutoProvisioningGroupType(context.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].AutoProvisioningGroupType"));
			autoProvisioningGroup.setStatus(context.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].Status"));
			autoProvisioningGroup.setState(context.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].State"));
			autoProvisioningGroup.setRegionId(context.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].RegionId"));
			autoProvisioningGroup.setValidFrom(context.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].ValidFrom"));
			autoProvisioningGroup.setValidUntil(context.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].ValidUntil"));
			autoProvisioningGroup.setExcessCapacityTerminationPolicy(context.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].ExcessCapacityTerminationPolicy"));
			autoProvisioningGroup.setMaxSpotPrice(context.floatValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].MaxSpotPrice"));
			autoProvisioningGroup.setLaunchTemplateId(context.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].LaunchTemplateId"));
			autoProvisioningGroup.setLaunchTemplateVersion(context.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].LaunchTemplateVersion"));
			autoProvisioningGroup.setTerminateInstances(context.booleanValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].TerminateInstances"));
			autoProvisioningGroup.setTerminateInstancesWithExpiration(context.booleanValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].TerminateInstancesWithExpiration"));
			autoProvisioningGroup.setCreationTime(context.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].CreationTime"));

			SpotOptions spotOptions = new SpotOptions();
			spotOptions.setAllocationStrategy(context.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].SpotOptions.AllocationStrategy"));
			spotOptions.setInstanceInterruptionBehavior(context.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].SpotOptions.InstanceInterruptionBehavior"));
			spotOptions.setInstancePoolsToUseCount(context.integerValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].SpotOptions.InstancePoolsToUseCount"));
			autoProvisioningGroup.setSpotOptions(spotOptions);

			PayAsYouGoOptions payAsYouGoOptions = new PayAsYouGoOptions();
			payAsYouGoOptions.setAllocationStrategy(context.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].PayAsYouGoOptions.AllocationStrategy"));
			autoProvisioningGroup.setPayAsYouGoOptions(payAsYouGoOptions);

			TargetCapacitySpecification targetCapacitySpecification = new TargetCapacitySpecification();
			targetCapacitySpecification.setTotalTargetCapacity(context.floatValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].TargetCapacitySpecification.TotalTargetCapacity"));
			targetCapacitySpecification.setPayAsYouGoTargetCapacity(context.floatValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].TargetCapacitySpecification.PayAsYouGoTargetCapacity"));
			targetCapacitySpecification.setSpotTargetCapacity(context.floatValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].TargetCapacitySpecification.SpotTargetCapacity"));
			targetCapacitySpecification.setDefaultTargetCapacityType(context.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].TargetCapacitySpecification.DefaultTargetCapacityType"));
			autoProvisioningGroup.setTargetCapacitySpecification(targetCapacitySpecification);

			List<LaunchTemplateConfig> launchTemplateConfigs = new ArrayList<LaunchTemplateConfig>();
			for (int j = 0; j < context.lengthValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].LaunchTemplateConfigs.Length"); j++) {
				LaunchTemplateConfig launchTemplateConfig = new LaunchTemplateConfig();
				launchTemplateConfig.setInstanceType(context.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].LaunchTemplateConfigs["+ j +"].InstanceType"));
				launchTemplateConfig.setMaxPrice(context.floatValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].LaunchTemplateConfigs["+ j +"].MaxPrice"));
				launchTemplateConfig.setVSwitchId(context.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].LaunchTemplateConfigs["+ j +"].VSwitchId"));
				launchTemplateConfig.setWeightedCapacity(context.floatValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].LaunchTemplateConfigs["+ j +"].WeightedCapacity"));
				launchTemplateConfig.setPriority(context.floatValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].LaunchTemplateConfigs["+ j +"].Priority"));

				launchTemplateConfigs.add(launchTemplateConfig);
			}
			autoProvisioningGroup.setLaunchTemplateConfigs(launchTemplateConfigs);

			autoProvisioningGroups.add(autoProvisioningGroup);
		}
		describeAutoProvisioningGroupsResponse.setAutoProvisioningGroups(autoProvisioningGroups);
	 
	 	return describeAutoProvisioningGroupsResponse;
	}
}