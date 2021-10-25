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

import com.aliyuncs.emr.model.v20160408.DescribeScalingCommonConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScalingCommonConfigResponseUnmarshaller {

	public static DescribeScalingCommonConfigResponse unmarshall(DescribeScalingCommonConfigResponse describeScalingCommonConfigResponse, UnmarshallerContext _ctx) {
		
		describeScalingCommonConfigResponse.setRequestId(_ctx.stringValue("DescribeScalingCommonConfigResponse.RequestId"));
		describeScalingCommonConfigResponse.setAutoScalingHookHeartbeatDefaultTime(_ctx.integerValue("DescribeScalingCommonConfigResponse.AutoScalingHookHeartbeatDefaultTime"));
		describeScalingCommonConfigResponse.setAutoScalingCoolDownTime(_ctx.integerValue("DescribeScalingCommonConfigResponse.AutoScalingCoolDownTime"));
		describeScalingCommonConfigResponse.setAutoScalingMNSScalingThreadSleepTime(_ctx.longValue("DescribeScalingCommonConfigResponse.AutoScalingMNSScalingThreadSleepTime"));
		describeScalingCommonConfigResponse.setAutoScalingGroupMinSizeLimit(_ctx.integerValue("DescribeScalingCommonConfigResponse.AutoScalingGroupMinSizeLimit"));
		describeScalingCommonConfigResponse.setAutoScalingGroupMaxSizeLimit(_ctx.integerValue("DescribeScalingCommonConfigResponse.AutoScalingGroupMaxSizeLimit"));
		describeScalingCommonConfigResponse.setAutoScalingRuleMinDelayLimit(_ctx.integerValue("DescribeScalingCommonConfigResponse.AutoScalingRuleMinDelayLimit"));
		describeScalingCommonConfigResponse.setAutoScalingRuleAlarmDelayLimit(_ctx.integerValue("DescribeScalingCommonConfigResponse.AutoScalingRuleAlarmDelayLimit"));
		describeScalingCommonConfigResponse.setAutoScalingRuleAlarmSilentTime(_ctx.integerValue("DescribeScalingCommonConfigResponse.AutoScalingRuleAlarmSilentTime"));
		describeScalingCommonConfigResponse.setAutoScalingConfigSystemDiskSize(_ctx.integerValue("DescribeScalingCommonConfigResponse.AutoScalingConfigSystemDiskSize"));
		describeScalingCommonConfigResponse.setAutoScalingConfigDecommissionQueryInterval(_ctx.longValue("DescribeScalingCommonConfigResponse.AutoScalingConfigDecommissionQueryInterval"));
	 
	 	return describeScalingCommonConfigResponse;
	}
}