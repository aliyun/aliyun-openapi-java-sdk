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
		describeAutoProvisioningGroupsResponse.setPageSize(_ctx.integerValue("DescribeAutoProvisioningGroupsResponse.PageSize"));
		describeAutoProvisioningGroupsResponse.setPageNumber(_ctx.integerValue("DescribeAutoProvisioningGroupsResponse.PageNumber"));
		describeAutoProvisioningGroupsResponse.setTotalCount(_ctx.integerValue("DescribeAutoProvisioningGroupsResponse.TotalCount"));

		List<AutoProvisioningGroup> autoProvisioningGroups = new ArrayList<AutoProvisioningGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups.Length"); i++) {
			AutoProvisioningGroup autoProvisioningGroup = new AutoProvisioningGroup();
			autoProvisioningGroup.setCreationTime(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].CreationTime"));
			autoProvisioningGroup.setAutoProvisioningGroupName(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].AutoProvisioningGroupName"));
			autoProvisioningGroup.setStatus(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].Status"));
			autoProvisioningGroup.setTerminateInstances(_ctx.booleanValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].TerminateInstances"));
			autoProvisioningGroup.setMaxSpotPrice(_ctx.floatValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].MaxSpotPrice"));
			autoProvisioningGroup.setState(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].State"));
			autoProvisioningGroup.setLaunchTemplateId(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].LaunchTemplateId"));
			autoProvisioningGroup.setValidFrom(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].ValidFrom"));
			autoProvisioningGroup.setLaunchTemplateVersion(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].LaunchTemplateVersion"));
			autoProvisioningGroup.setTerminateInstancesWithExpiration(_ctx.booleanValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].TerminateInstancesWithExpiration"));
			autoProvisioningGroup.setRegionId(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].RegionId"));
			autoProvisioningGroup.setValidUntil(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].ValidUntil"));
			autoProvisioningGroup.setAutoProvisioningGroupType(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].AutoProvisioningGroupType"));
			autoProvisioningGroup.setAutoProvisioningGroupId(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].AutoProvisioningGroupId"));
			autoProvisioningGroup.setExcessCapacityTerminationPolicy(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].ExcessCapacityTerminationPolicy"));

			SpotOptions spotOptions = new SpotOptions();
			spotOptions.setInstancePoolsToUseCount(_ctx.integerValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].SpotOptions.InstancePoolsToUseCount"));
			spotOptions.setAllocationStrategy(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].SpotOptions.AllocationStrategy"));
			spotOptions.setInstanceInterruptionBehavior(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].SpotOptions.InstanceInterruptionBehavior"));
			autoProvisioningGroup.setSpotOptions(spotOptions);

			PayAsYouGoOptions payAsYouGoOptions = new PayAsYouGoOptions();
			payAsYouGoOptions.setAllocationStrategy(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].PayAsYouGoOptions.AllocationStrategy"));
			autoProvisioningGroup.setPayAsYouGoOptions(payAsYouGoOptions);

			TargetCapacitySpecification targetCapacitySpecification = new TargetCapacitySpecification();
			targetCapacitySpecification.setSpotTargetCapacity(_ctx.floatValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].TargetCapacitySpecification.SpotTargetCapacity"));
			targetCapacitySpecification.setPayAsYouGoTargetCapacity(_ctx.floatValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].TargetCapacitySpecification.PayAsYouGoTargetCapacity"));
			targetCapacitySpecification.setDefaultTargetCapacityType(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].TargetCapacitySpecification.DefaultTargetCapacityType"));
			targetCapacitySpecification.setTotalTargetCapacity(_ctx.floatValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].TargetCapacitySpecification.TotalTargetCapacity"));
			autoProvisioningGroup.setTargetCapacitySpecification(targetCapacitySpecification);

			List<LaunchTemplateConfig> launchTemplateConfigs = new ArrayList<LaunchTemplateConfig>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].LaunchTemplateConfigs.Length"); j++) {
				LaunchTemplateConfig launchTemplateConfig = new LaunchTemplateConfig();
				launchTemplateConfig.setMaxPrice(_ctx.floatValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].LaunchTemplateConfigs["+ j +"].MaxPrice"));
				launchTemplateConfig.setPriority(_ctx.floatValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].LaunchTemplateConfigs["+ j +"].Priority"));
				launchTemplateConfig.setVSwitchId(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].LaunchTemplateConfigs["+ j +"].VSwitchId"));
				launchTemplateConfig.setWeightedCapacity(_ctx.floatValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].LaunchTemplateConfigs["+ j +"].WeightedCapacity"));
				launchTemplateConfig.setInstanceType(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].LaunchTemplateConfigs["+ j +"].InstanceType"));

				launchTemplateConfigs.add(launchTemplateConfig);
			}
			autoProvisioningGroup.setLaunchTemplateConfigs(launchTemplateConfigs);

			autoProvisioningGroups.add(autoProvisioningGroup);
		}
		describeAutoProvisioningGroupsResponse.setAutoProvisioningGroups(autoProvisioningGroups);
	 
	 	return describeAutoProvisioningGroupsResponse;
	}
}