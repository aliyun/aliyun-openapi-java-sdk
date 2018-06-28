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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScalingGroupsResponseUnmarshaller {

	public static DescribeScalingGroupsResponse unmarshall(DescribeScalingGroupsResponse describeScalingGroupsResponse, UnmarshallerContext context) {
		
		describeScalingGroupsResponse.setRequestId(context.stringValue("DescribeScalingGroupsResponse.RequestId"));
		describeScalingGroupsResponse.setTotalCount(context.integerValue("DescribeScalingGroupsResponse.TotalCount"));
		describeScalingGroupsResponse.setPageNumber(context.integerValue("DescribeScalingGroupsResponse.PageNumber"));
		describeScalingGroupsResponse.setPageSize(context.integerValue("DescribeScalingGroupsResponse.PageSize"));

		List<ScalingGroup> scalingGroups = new ArrayList<ScalingGroup>();
		for (int i = 0; i < context.lengthValue("DescribeScalingGroupsResponse.ScalingGroups.Length"); i++) {
			ScalingGroup scalingGroup = new ScalingGroup();
			scalingGroup.setDefaultCooldown(context.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].DefaultCooldown"));
			scalingGroup.setMaxSize(context.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].MaxSize"));
			scalingGroup.setPendingWaitCapacity(context.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].PendingWaitCapacity"));
			scalingGroup.setRemovingWaitCapacity(context.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].RemovingWaitCapacity"));
			scalingGroup.setPendingCapacity(context.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].PendingCapacity"));
			scalingGroup.setRemovingCapacity(context.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].RemovingCapacity"));
			scalingGroup.setScalingGroupName(context.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].ScalingGroupName"));
			scalingGroup.setActiveCapacity(context.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].ActiveCapacity"));
			scalingGroup.setStandbyCapacity(context.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].StandbyCapacity"));
			scalingGroup.setProtectedCapacity(context.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].ProtectedCapacity"));
			scalingGroup.setActiveScalingConfigurationId(context.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].ActiveScalingConfigurationId"));
			scalingGroup.setScalingGroupId(context.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].ScalingGroupId"));
			scalingGroup.setRegionId(context.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].RegionId"));
			scalingGroup.setTotalCapacity(context.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].TotalCapacity"));
			scalingGroup.setMinSize(context.integerValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].MinSize"));
			scalingGroup.setLifecycleState(context.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].LifecycleState"));
			scalingGroup.setCreationTime(context.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].CreationTime"));
			scalingGroup.setModificationTime(context.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].ModificationTime"));
			scalingGroup.setVpcId(context.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].VpcId"));
			scalingGroup.setVSwitchId(context.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].VSwitchId"));
			scalingGroup.setMultiAZPolicy(context.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].MultiAZPolicy"));
			scalingGroup.setHealthCheckType(context.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].HealthCheckType"));

			List<String> vSwitchIds = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].VSwitchIds.Length"); j++) {
				vSwitchIds.add(context.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].VSwitchIds["+ j +"]"));
			}
			scalingGroup.setVSwitchIds(vSwitchIds);

			List<String> removalPolicies = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].RemovalPolicies.Length"); j++) {
				removalPolicies.add(context.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].RemovalPolicies["+ j +"]"));
			}
			scalingGroup.setRemovalPolicies(removalPolicies);

			List<String> dBInstanceIds = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].DBInstanceIds.Length"); j++) {
				dBInstanceIds.add(context.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].DBInstanceIds["+ j +"]"));
			}
			scalingGroup.setDBInstanceIds(dBInstanceIds);

			List<String> loadBalancerIds = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].LoadBalancerIds.Length"); j++) {
				loadBalancerIds.add(context.stringValue("DescribeScalingGroupsResponse.ScalingGroups["+ i +"].LoadBalancerIds["+ j +"]"));
			}
			scalingGroup.setLoadBalancerIds(loadBalancerIds);

			scalingGroups.add(scalingGroup);
		}
		describeScalingGroupsResponse.setScalingGroups(scalingGroups);
	 
	 	return describeScalingGroupsResponse;
	}
}