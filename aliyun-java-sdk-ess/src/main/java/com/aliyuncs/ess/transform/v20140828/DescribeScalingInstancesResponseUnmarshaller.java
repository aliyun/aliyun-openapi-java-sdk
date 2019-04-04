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

import com.aliyuncs.ess.model.v20140828.DescribeScalingInstancesResponse;
import com.aliyuncs.ess.model.v20140828.DescribeScalingInstancesResponse.ScalingInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScalingInstancesResponseUnmarshaller {

	public static DescribeScalingInstancesResponse unmarshall(DescribeScalingInstancesResponse describeScalingInstancesResponse, UnmarshallerContext context) {
		
		describeScalingInstancesResponse.setRequestId(context.stringValue("DescribeScalingInstancesResponse.RequestId"));
		describeScalingInstancesResponse.setTotalCount(context.integerValue("DescribeScalingInstancesResponse.TotalCount"));
		describeScalingInstancesResponse.setPageNumber(context.integerValue("DescribeScalingInstancesResponse.PageNumber"));
		describeScalingInstancesResponse.setPageSize(context.integerValue("DescribeScalingInstancesResponse.PageSize"));

		List<ScalingInstance> scalingInstances = new ArrayList<ScalingInstance>();
		for (int i = 0; i < context.lengthValue("DescribeScalingInstancesResponse.ScalingInstances.Length"); i++) {
			ScalingInstance scalingInstance = new ScalingInstance();
			scalingInstance.setInstanceId(context.stringValue("DescribeScalingInstancesResponse.ScalingInstances["+ i +"].InstanceId"));
			scalingInstance.setScalingConfigurationId(context.stringValue("DescribeScalingInstancesResponse.ScalingInstances["+ i +"].ScalingConfigurationId"));
			scalingInstance.setScalingGroupId(context.stringValue("DescribeScalingInstancesResponse.ScalingInstances["+ i +"].ScalingGroupId"));
			scalingInstance.setHealthStatus(context.stringValue("DescribeScalingInstancesResponse.ScalingInstances["+ i +"].HealthStatus"));
			scalingInstance.setLoadBalancerWeight(context.integerValue("DescribeScalingInstancesResponse.ScalingInstances["+ i +"].LoadBalancerWeight"));
			scalingInstance.setLifecycleState(context.stringValue("DescribeScalingInstancesResponse.ScalingInstances["+ i +"].LifecycleState"));
			scalingInstance.setCreationTime(context.stringValue("DescribeScalingInstancesResponse.ScalingInstances["+ i +"].CreationTime"));
			scalingInstance.setCreationType(context.stringValue("DescribeScalingInstancesResponse.ScalingInstances["+ i +"].CreationType"));
			scalingInstance.setLaunchTemplateId(context.stringValue("DescribeScalingInstancesResponse.ScalingInstances["+ i +"].LaunchTemplateId"));
			scalingInstance.setLaunchTemplateVersion(context.stringValue("DescribeScalingInstancesResponse.ScalingInstances["+ i +"].LaunchTemplateVersion"));
			scalingInstance.setWarmupState(context.stringValue("DescribeScalingInstancesResponse.ScalingInstances["+ i +"].WarmupState"));

			scalingInstances.add(scalingInstance);
		}
		describeScalingInstancesResponse.setScalingInstances(scalingInstances);
	 
	 	return describeScalingInstancesResponse;
	}
}