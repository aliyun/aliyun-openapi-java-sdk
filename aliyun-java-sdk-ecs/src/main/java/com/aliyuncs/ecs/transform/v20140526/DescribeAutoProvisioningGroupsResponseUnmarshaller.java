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
import com.aliyuncs.ecs.model.v20140526.DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroup.CandidateOptions;
import com.aliyuncs.ecs.model.v20140526.DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroup.CapacitySpecification;
import com.aliyuncs.ecs.model.v20140526.DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroup.LaunchTemplateConfig;
import com.aliyuncs.ecs.model.v20140526.DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroup.PayAsYouGoOptions;
import com.aliyuncs.ecs.model.v20140526.DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroup.SpotOptions;
import com.aliyuncs.ecs.model.v20140526.DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroup.Tag;
import com.aliyuncs.ecs.model.v20140526.DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroup.TargetCapacitySpecification;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAutoProvisioningGroupsResponseUnmarshaller {

	public static DescribeAutoProvisioningGroupsResponse unmarshall(DescribeAutoProvisioningGroupsResponse describeAutoProvisioningGroupsResponse, UnmarshallerContext _ctx) {
		
		describeAutoProvisioningGroupsResponse.setRequestId(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.RequestId"));
		describeAutoProvisioningGroupsResponse.setTotalCount(_ctx.integerValue("DescribeAutoProvisioningGroupsResponse.TotalCount"));
		describeAutoProvisioningGroupsResponse.setPageSize(_ctx.integerValue("DescribeAutoProvisioningGroupsResponse.PageSize"));
		describeAutoProvisioningGroupsResponse.setPageNumber(_ctx.integerValue("DescribeAutoProvisioningGroupsResponse.PageNumber"));

		List<AutoProvisioningGroup> autoProvisioningGroups = new ArrayList<AutoProvisioningGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups.Length"); i++) {
			AutoProvisioningGroup autoProvisioningGroup = new AutoProvisioningGroup();
			autoProvisioningGroup.setStatus(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].Status"));
			autoProvisioningGroup.setAutoProvisioningGroupName(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].AutoProvisioningGroupName"));
			autoProvisioningGroup.setExcessCapacityTerminationPolicy(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].ExcessCapacityTerminationPolicy"));
			autoProvisioningGroup.setResourceGroupId(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].ResourceGroupId"));
			autoProvisioningGroup.setLaunchTemplateId(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].LaunchTemplateId"));
			autoProvisioningGroup.setAutoProvisioningGroupType(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].AutoProvisioningGroupType"));
			autoProvisioningGroup.setTerminateInstancesWithExpiration(_ctx.booleanValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].TerminateInstancesWithExpiration"));
			autoProvisioningGroup.setValidUntil(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].ValidUntil"));
			autoProvisioningGroup.setState(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].State"));
			autoProvisioningGroup.setAutoProvisioningGroupId(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].AutoProvisioningGroupId"));
			autoProvisioningGroup.setCreationTime(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].CreationTime"));
			autoProvisioningGroup.setLaunchTemplateVersion(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].LaunchTemplateVersion"));
			autoProvisioningGroup.setValidFrom(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].ValidFrom"));
			autoProvisioningGroup.setMaxSpotPrice(_ctx.floatValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].MaxSpotPrice"));
			autoProvisioningGroup.setRegionId(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].RegionId"));
			autoProvisioningGroup.setTerminateInstances(_ctx.booleanValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].TerminateInstances"));

			List<String> suspendedProcesses = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].SuspendedProcesses.Length"); j++) {
				suspendedProcesses.add(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].SuspendedProcesses["+ j +"]"));
			}
			autoProvisioningGroup.setSuspendedProcesses(suspendedProcesses);

			TargetCapacitySpecification targetCapacitySpecification = new TargetCapacitySpecification();
			targetCapacitySpecification.setDefaultTargetCapacityType(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].TargetCapacitySpecification.DefaultTargetCapacityType"));
			targetCapacitySpecification.setTotalTargetCapacity(_ctx.floatValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].TargetCapacitySpecification.TotalTargetCapacity"));
			targetCapacitySpecification.setSpotTargetCapacity(_ctx.floatValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].TargetCapacitySpecification.SpotTargetCapacity"));
			targetCapacitySpecification.setPayAsYouGoTargetCapacity(_ctx.floatValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].TargetCapacitySpecification.PayAsYouGoTargetCapacity"));
			autoProvisioningGroup.setTargetCapacitySpecification(targetCapacitySpecification);

			PayAsYouGoOptions payAsYouGoOptions = new PayAsYouGoOptions();
			payAsYouGoOptions.setAllocationStrategy(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].PayAsYouGoOptions.AllocationStrategy"));
			autoProvisioningGroup.setPayAsYouGoOptions(payAsYouGoOptions);

			SpotOptions spotOptions = new SpotOptions();
			spotOptions.setAllocationStrategy(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].SpotOptions.AllocationStrategy"));
			spotOptions.setInstanceInterruptionBehavior(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].SpotOptions.InstanceInterruptionBehavior"));
			spotOptions.setInstancePoolsToUseCount(_ctx.integerValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].SpotOptions.InstancePoolsToUseCount"));
			autoProvisioningGroup.setSpotOptions(spotOptions);

			CandidateOptions candidateOptions = new CandidateOptions();
			candidateOptions.setTimeoutMinutes(_ctx.integerValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].CandidateOptions.TimeoutMinutes"));
			autoProvisioningGroup.setCandidateOptions(candidateOptions);

			CapacitySpecification capacitySpecification = new CapacitySpecification();
			capacitySpecification.setPrePaidCapacity(_ctx.floatValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].CapacitySpecification.PrePaidCapacity"));
			capacitySpecification.setPayAsYouGoCapacity(_ctx.floatValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].CapacitySpecification.PayAsYouGoCapacity"));
			capacitySpecification.setTotalCapacity(_ctx.floatValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].CapacitySpecification.TotalCapacity"));
			capacitySpecification.setSpotCapacity(_ctx.floatValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].CapacitySpecification.SpotCapacity"));
			autoProvisioningGroup.setCapacitySpecification(capacitySpecification);

			List<LaunchTemplateConfig> launchTemplateConfigs = new ArrayList<LaunchTemplateConfig>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].LaunchTemplateConfigs.Length"); j++) {
				LaunchTemplateConfig launchTemplateConfig = new LaunchTemplateConfig();
				launchTemplateConfig.setWeightedCapacity(_ctx.floatValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].LaunchTemplateConfigs["+ j +"].WeightedCapacity"));
				launchTemplateConfig.setPriority(_ctx.floatValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].LaunchTemplateConfigs["+ j +"].Priority"));
				launchTemplateConfig.setVSwitchId(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].LaunchTemplateConfigs["+ j +"].VSwitchId"));
				launchTemplateConfig.setMaxPrice(_ctx.floatValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].LaunchTemplateConfigs["+ j +"].MaxPrice"));
				launchTemplateConfig.setInstanceType(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].LaunchTemplateConfigs["+ j +"].InstanceType"));

				launchTemplateConfigs.add(launchTemplateConfig);
			}
			autoProvisioningGroup.setLaunchTemplateConfigs(launchTemplateConfigs);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagKey(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].Tags["+ j +"].TagKey"));
				tag.setTagValue(_ctx.stringValue("DescribeAutoProvisioningGroupsResponse.AutoProvisioningGroups["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tag);
			}
			autoProvisioningGroup.setTags(tags);

			autoProvisioningGroups.add(autoProvisioningGroup);
		}
		describeAutoProvisioningGroupsResponse.setAutoProvisioningGroups(autoProvisioningGroups);
	 
	 	return describeAutoProvisioningGroupsResponse;
	}
}