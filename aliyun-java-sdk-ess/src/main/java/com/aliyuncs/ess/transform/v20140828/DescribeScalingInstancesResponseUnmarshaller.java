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

	public static DescribeScalingInstancesResponse unmarshall(DescribeScalingInstancesResponse describeScalingInstancesResponse, UnmarshallerContext _ctx) {
		
		describeScalingInstancesResponse.setRequestId(_ctx.stringValue("DescribeScalingInstancesResponse.RequestId"));
		describeScalingInstancesResponse.setTotalCount(_ctx.integerValue("DescribeScalingInstancesResponse.TotalCount"));
		describeScalingInstancesResponse.setPageSize(_ctx.integerValue("DescribeScalingInstancesResponse.PageSize"));
		describeScalingInstancesResponse.setPageNumber(_ctx.integerValue("DescribeScalingInstancesResponse.PageNumber"));
		describeScalingInstancesResponse.setTotalSpotCount(_ctx.integerValue("DescribeScalingInstancesResponse.TotalSpotCount"));

		List<ScalingInstance> scalingInstances = new ArrayList<ScalingInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScalingInstancesResponse.ScalingInstances.Length"); i++) {
			ScalingInstance scalingInstance = new ScalingInstance();
			scalingInstance.setLoadBalancerWeight(_ctx.integerValue("DescribeScalingInstancesResponse.ScalingInstances["+ i +"].LoadBalancerWeight"));
			scalingInstance.setCreatedTime(_ctx.stringValue("DescribeScalingInstancesResponse.ScalingInstances["+ i +"].CreatedTime"));
			scalingInstance.setPrivateIpAddress(_ctx.stringValue("DescribeScalingInstancesResponse.ScalingInstances["+ i +"].PrivateIpAddress"));
			scalingInstance.setZoneId(_ctx.stringValue("DescribeScalingInstancesResponse.ScalingInstances["+ i +"].ZoneId"));
			scalingInstance.setReplaceStatus(_ctx.stringValue("DescribeScalingInstancesResponse.ScalingInstances["+ i +"].ReplaceStatus"));
			scalingInstance.setInstanceId(_ctx.stringValue("DescribeScalingInstancesResponse.ScalingInstances["+ i +"].InstanceId"));
			scalingInstance.setScalingActivityId(_ctx.stringValue("DescribeScalingInstancesResponse.ScalingInstances["+ i +"].ScalingActivityId"));
			scalingInstance.setScalingGroupId(_ctx.stringValue("DescribeScalingInstancesResponse.ScalingInstances["+ i +"].ScalingGroupId"));
			scalingInstance.setHealthStatus(_ctx.stringValue("DescribeScalingInstancesResponse.ScalingInstances["+ i +"].HealthStatus"));
			scalingInstance.setLaunchTemplateId(_ctx.stringValue("DescribeScalingInstancesResponse.ScalingInstances["+ i +"].LaunchTemplateId"));
			scalingInstance.setLifecycleState(_ctx.stringValue("DescribeScalingInstancesResponse.ScalingInstances["+ i +"].LifecycleState"));
			scalingInstance.setScalingInstanceId(_ctx.stringValue("DescribeScalingInstancesResponse.ScalingInstances["+ i +"].ScalingInstanceId"));
			scalingInstance.setCreationType(_ctx.stringValue("DescribeScalingInstancesResponse.ScalingInstances["+ i +"].CreationType"));
			scalingInstance.setWeightedCapacity(_ctx.integerValue("DescribeScalingInstancesResponse.ScalingInstances["+ i +"].WeightedCapacity"));
			scalingInstance.setWarmupState(_ctx.stringValue("DescribeScalingInstancesResponse.ScalingInstances["+ i +"].WarmupState"));
			scalingInstance.setCreationTime(_ctx.stringValue("DescribeScalingInstancesResponse.ScalingInstances["+ i +"].CreationTime"));
			scalingInstance.setLaunchTemplateVersion(_ctx.stringValue("DescribeScalingInstancesResponse.ScalingInstances["+ i +"].LaunchTemplateVersion"));
			scalingInstance.setEntrusted(_ctx.booleanValue("DescribeScalingInstancesResponse.ScalingInstances["+ i +"].Entrusted"));
			scalingInstance.setScalingConfigurationId(_ctx.stringValue("DescribeScalingInstancesResponse.ScalingInstances["+ i +"].ScalingConfigurationId"));
			scalingInstance.setInstanceType(_ctx.stringValue("DescribeScalingInstancesResponse.ScalingInstances["+ i +"].InstanceType"));
			scalingInstance.setSpotStrategy(_ctx.stringValue("DescribeScalingInstancesResponse.ScalingInstances["+ i +"].SpotStrategy"));

			scalingInstances.add(scalingInstance);
		}
		describeScalingInstancesResponse.setScalingInstances(scalingInstances);
	 
	 	return describeScalingInstancesResponse;
	}
}