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

import com.aliyuncs.emr.model.v20160408.DescribeScalingActivityResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScalingActivityResponseUnmarshaller {

	public static DescribeScalingActivityResponse unmarshall(DescribeScalingActivityResponse describeScalingActivityResponse, UnmarshallerContext _ctx) {
		
		describeScalingActivityResponse.setRequestId(_ctx.stringValue("DescribeScalingActivityResponse.RequestId"));
		describeScalingActivityResponse.setBizId(_ctx.stringValue("DescribeScalingActivityResponse.BizId"));
		describeScalingActivityResponse.setStartTime(_ctx.longValue("DescribeScalingActivityResponse.StartTime"));
		describeScalingActivityResponse.setEndTime(_ctx.longValue("DescribeScalingActivityResponse.EndTime"));
		describeScalingActivityResponse.setInstanceIds(_ctx.stringValue("DescribeScalingActivityResponse.InstanceIds"));
		describeScalingActivityResponse.setTotalCapacity(_ctx.integerValue("DescribeScalingActivityResponse.TotalCapacity"));
		describeScalingActivityResponse.setCause(_ctx.stringValue("DescribeScalingActivityResponse.Cause"));
		describeScalingActivityResponse.setDescription(_ctx.stringValue("DescribeScalingActivityResponse.Description"));
		describeScalingActivityResponse.setStatus(_ctx.stringValue("DescribeScalingActivityResponse.Status"));
		describeScalingActivityResponse.setTransition(_ctx.stringValue("DescribeScalingActivityResponse.Transition"));
		describeScalingActivityResponse.setScalingRuleId(_ctx.stringValue("DescribeScalingActivityResponse.ScalingRuleId"));
		describeScalingActivityResponse.setExpectNum(_ctx.integerValue("DescribeScalingActivityResponse.ExpectNum"));
	 
	 	return describeScalingActivityResponse;
	}
}