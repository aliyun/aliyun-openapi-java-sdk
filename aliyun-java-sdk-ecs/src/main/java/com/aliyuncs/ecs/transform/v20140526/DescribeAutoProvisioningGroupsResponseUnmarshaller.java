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

	public static DescribeAutoProvisioningGroupsResponse unmarshall(DescribeAutoProvisioningGroupsResponse describeAutoProvisioningGroupsResponse, UnmarshallerContext _ctx) {
		
		describeAutoProvisioningGroupsResponse.setRequestId(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.RequestId"));
		describeAutoProvisioningGroupsResponse.setTotalCount(_ctx.integerValue("DescribeAutoProvisioningGroupsResponse.TotalCount"));
		describeAutoProvisioningGroupsResponse.setPageNumber(_ctx.integerValue("DescribeAutoProvisioningGroupsResponse.PageNumber"));
		describeAutoProvisioningGroupsResponse.setPageSize(_ctx.integerValue("DescribeAutoProvisioningGroupsResponse.PageSize"));

		List<AutoProvisioningGroup> autoProvisioningGroups = new ArrayList<AutoProvisioningGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups.Length"); i++) {
			AutoProvisioningGroup autoProvisioningGroup = new AutoProvisioningGroup();
			autoProvisioningGroup.setAutoProvisioningGroupId(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].AutoProvisioningGroupId"));
			autoProvisioningGroup.setAutoProvisioningGroupName(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].AutoProvisioningGroupName"));
			autoProvisioningGroup.setAutoProvisioningGroupType(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].AutoProvisioningGroupType"));
			autoProvisioningGroup.setStatus(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].Status"));
			autoProvisioningGroup.setState(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].State"));
			autoProvisioningGroup.setRegionId(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].RegionId"));
			autoProvisioningGroup.setValidFrom(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].ValidFrom"));
			autoProvisioningGroup.setValidUntil(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].ValidUntil"));
			autoProvisioningGroup.setExcessCapacityTerminationPolicy(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].ExcessCapacityTerminationPolicy"));
			autoProvisioningGroup.setMaxSpotPrice(_ctx.floatValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].MaxSpotPrice"));
			autoProvisioningGroup.setLaunchTemplateId(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].LaunchTemplateId"));
			autoProvisioningGroup.setLaunchTemplateVersion(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].LaunchTemplateVersion"));
			autoProvisioningGroup.setTerminateInstances(_ctx.booleanValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].TerminateInstances"));
			autoProvisioningGroup.setTerminateInstancesWithExpiration(_ctx.booleanValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].TerminateInstancesWithExpiration"));
			autoProvisioningGroup.setCreationTime(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].CreationTime"));

			SpotOptions spotOptions = new SpotOptions();
			spotOptions.setAllocationStrategy(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].SpotOptions.AllocationStrategy"));
			spotOptions.setInstanceInterruptionBehavior(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].SpotOptions.InstanceInterruptionBehavior"));
			spotOptions.setInstancePoolsToUseCount(_ctx.integerValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].SpotOptions.InstancePoolsToUseCount"));
			autoProvisioningGroup.setSpotOptions(spotOptions);

			PayAsYouGoOptions payAsYouGoOptions = new PayAsYouGoOptions();
			payAsYouGoOptions.setAllocationStrategy(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].PayAsYouGoOptions.AllocationStrategy"));
			autoProvisioningGroup.setPayAsYouGoOptions(payAsYouGoOptions);

			TargetCapacitySpecification targetCapacitySpecification = new TargetCapacitySpecification();
			targetCapacitySpecification.setTotalTargetCapacity(_ctx.floatValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].TargetCapacitySpecification.TotalTargetCapacity"));
			targetCapacitySpecification.setPayAsYouGoTargetCapacity(_ctx.floatValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].TargetCapacitySpecification.PayAsYouGoTargetCapacity"));
			targetCapacitySpecification.setSpotTargetCapacity(_ctx.floatValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].TargetCapacitySpecification.SpotTargetCapacity"));
			targetCapacitySpecification.setDefaultTargetCapacityType(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].TargetCapacitySpecification.DefaultTargetCapacityType"));
			autoProvisioningGroup.setTargetCapacitySpecification(targetCapacitySpecification);

			List<LaunchTemplateConfig> launchTemplateConfigs = new ArrayList<LaunchTemplateConfig>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].LaunchTemplateConfigs.Length"); j++) {
				LaunchTemplateConfig launchTemplateConfig = new LaunchTemplateConfig();
				launchTemplateConfig.setInstanceType(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].LaunchTemplateConfigs["+ j +"].InstanceType"));
				launchTemplateConfig.setMaxPrice(_ctx.floatValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].LaunchTemplateConfigs["+ j +"].MaxPrice"));
				launchTemplateConfig.setVSwitchId(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].LaunchTemplateConfigs["+ j +"].VSwitchId"));
				launchTemplateConfig.setWeightedCapacity(_ctx.floatValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].LaunchTemplateConfigs["+ j +"].WeightedCapacity"));
				launchTemplateConfig.setPriority(_ctx.floatValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].LaunchTemplateConfigs["+ j +"].Priority"));

				launchTemplateConfigs.add(launchTemplateConfig);
			}
			autoProvisioningGroup.setLaunchTemplateConfigs(launchTemplateConfigs);

			autoProvisioningGroups.add(autoProvisioningGroup);
		}
		describeAutoProvisioningGroupsResponse.setAutoProvisioningGroups(autoProvisioningGroups);
	 
	 	return describeAutoProvisioningGroupsResponse;
	}
}