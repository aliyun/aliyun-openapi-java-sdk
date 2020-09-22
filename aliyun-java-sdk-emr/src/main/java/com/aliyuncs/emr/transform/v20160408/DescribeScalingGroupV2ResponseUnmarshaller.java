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

package com.aliyuncs.emr.transform.v20160408;

import com.aliyuncs.emr.model.v20160408.DescribeScalingGroupV2Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScalingGroupV2ResponseUnmarshaller {

	public static DescribeScalingGroupV2Response unmarshall(DescribeScalingGroupV2Response describeScalingGroupV2Response, UnmarshallerContext _ctx) {
		
		describeScalingGroupV2Response.setRequestId(_ctx.stringValue("DescribeScalingGroupV2Response.RequestId"));
		describeScalingGroupV2Response.setScalingGroupId(_ctx.stringValue("DescribeScalingGroupV2Response.ScalingGroupId"));
		describeScalingGroupV2Response.setName(_ctx.stringValue("DescribeScalingGroupV2Response.Name"));
		describeScalingGroupV2Response.setDescription(_ctx.stringValue("DescribeScalingGroupV2Response.Description"));
		describeScalingGroupV2Response.setActiveStatus(_ctx.stringValue("DescribeScalingGroupV2Response.ActiveStatus"));
		describeScalingGroupV2Response.setHostGroupBizId(_ctx.stringValue("DescribeScalingGroupV2Response.HostGroupBizId"));
		describeScalingGroupV2Response.setScalingInMode(_ctx.stringValue("DescribeScalingGroupV2Response.ScalingInMode"));
		describeScalingGroupV2Response.setScalingMinSize(_ctx.integerValue("DescribeScalingGroupV2Response.ScalingMinSize"));
		describeScalingGroupV2Response.setScalingMaxSize(_ctx.integerValue("DescribeScalingGroupV2Response.ScalingMaxSize"));
		describeScalingGroupV2Response.setConfigState(_ctx.stringValue("DescribeScalingGroupV2Response.ConfigState"));
	 
	 	return describeScalingGroupV2Response;
	}
}