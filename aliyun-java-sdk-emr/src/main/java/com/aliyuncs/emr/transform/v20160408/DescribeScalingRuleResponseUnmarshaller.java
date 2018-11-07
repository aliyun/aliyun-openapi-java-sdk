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

import com.aliyuncs.emr.model.v20160408.DescribeScalingRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScalingRuleResponseUnmarshaller {

	public static DescribeScalingRuleResponse unmarshall(DescribeScalingRuleResponse describeScalingRuleResponse, UnmarshallerContext context) {
		
		describeScalingRuleResponse.setRequestId(context.stringValue("DescribeScalingRuleResponse.RequestId"));
		describeScalingRuleResponse.setId(context.stringValue("DescribeScalingRuleResponse.Id"));
		describeScalingRuleResponse.setGmtCreate(context.stringValue("DescribeScalingRuleResponse.GmtCreate"));
		describeScalingRuleResponse.setGmtModified(context.stringValue("DescribeScalingRuleResponse.GmtModified"));
		describeScalingRuleResponse.setRuleName(context.stringValue("DescribeScalingRuleResponse.RuleName"));
		describeScalingRuleResponse.setAdjustmentType(context.stringValue("DescribeScalingRuleResponse.AdjustmentType"));
		describeScalingRuleResponse.setAdjustmentValue(context.integerValue("DescribeScalingRuleResponse.AdjustmentValue"));
		describeScalingRuleResponse.setCooldown(context.integerValue("DescribeScalingRuleResponse.Cooldown"));
		describeScalingRuleResponse.setStatus(context.stringValue("DescribeScalingRuleResponse.Status"));
		describeScalingRuleResponse.setLaunchTime(context.stringValue("DescribeScalingRuleResponse.LaunchTime"));
		describeScalingRuleResponse.setLaunchExpirationTime(context.integerValue("DescribeScalingRuleResponse.LaunchExpirationTime"));
		describeScalingRuleResponse.setRecurrenceType(context.stringValue("DescribeScalingRuleResponse.RecurrenceType"));
		describeScalingRuleResponse.setRecurrenceValue(context.stringValue("DescribeScalingRuleResponse.RecurrenceValue"));
		describeScalingRuleResponse.setRecurrenceEndTime(context.stringValue("DescribeScalingRuleResponse.RecurrenceEndTime"));
	 
	 	return describeScalingRuleResponse;
	}
}