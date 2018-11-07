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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.DescribeScalingTaskGroupResponse;
import com.aliyuncs.emr.model.v20160408.DescribeScalingTaskGroupResponse.ScalingRule;
import com.aliyuncs.emr.model.v20160408.DescribeScalingTaskGroupResponse.SpotPriceLimit;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScalingTaskGroupResponseUnmarshaller {

	public static DescribeScalingTaskGroupResponse unmarshall(DescribeScalingTaskGroupResponse describeScalingTaskGroupResponse, UnmarshallerContext context) {
		
		describeScalingTaskGroupResponse.setRequestId(context.stringValue("DescribeScalingTaskGroupResponse.RequestId"));
		describeScalingTaskGroupResponse.setScalingGroupId(context.stringValue("DescribeScalingTaskGroupResponse.ScalingGroupId"));
		describeScalingTaskGroupResponse.setHostGroupId(context.stringValue("DescribeScalingTaskGroupResponse.HostGroupId"));
		describeScalingTaskGroupResponse.setMinSize(context.integerValue("DescribeScalingTaskGroupResponse.MinSize"));
		describeScalingTaskGroupResponse.setMaxSize(context.integerValue("DescribeScalingTaskGroupResponse.MaxSize"));
		describeScalingTaskGroupResponse.setDefaultCooldown(context.integerValue("DescribeScalingTaskGroupResponse.DefaultCooldown"));
		describeScalingTaskGroupResponse.setStatus(context.stringValue("DescribeScalingTaskGroupResponse.Status"));
		describeScalingTaskGroupResponse.setPayType(context.stringValue("DescribeScalingTaskGroupResponse.PayType"));
		describeScalingTaskGroupResponse.setDataDiskCategory(context.stringValue("DescribeScalingTaskGroupResponse.DataDiskCategory"));
		describeScalingTaskGroupResponse.setDataDiskSize(context.integerValue("DescribeScalingTaskGroupResponse.DataDiskSize"));
		describeScalingTaskGroupResponse.setDataDiskCount(context.integerValue("DescribeScalingTaskGroupResponse.DataDiskCount"));
		describeScalingTaskGroupResponse.setSysDiskCategory(context.stringValue("DescribeScalingTaskGroupResponse.SysDiskCategory"));
		describeScalingTaskGroupResponse.setSysDiskSize(context.integerValue("DescribeScalingTaskGroupResponse.SysDiskSize"));
		describeScalingTaskGroupResponse.setCpuCount(context.integerValue("DescribeScalingTaskGroupResponse.CpuCount"));
		describeScalingTaskGroupResponse.setMemSize(context.integerValue("DescribeScalingTaskGroupResponse.MemSize"));
		describeScalingTaskGroupResponse.setSpotStrategy(context.stringValue("DescribeScalingTaskGroupResponse.SpotStrategy"));

		List<String> instanceTypeList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeScalingTaskGroupResponse.InstanceTypeList.Length"); i++) {
			instanceTypeList.add(context.stringValue("DescribeScalingTaskGroupResponse.InstanceTypeList["+ i +"]"));
		}
		describeScalingTaskGroupResponse.setInstanceTypeList(instanceTypeList);

		List<ScalingRule> scalingRules = new ArrayList<ScalingRule>();
		for (int i = 0; i < context.lengthValue("DescribeScalingTaskGroupResponse.ScalingRules.Length"); i++) {
			ScalingRule scalingRule = new ScalingRule();
			scalingRule.setId(context.stringValue("DescribeScalingTaskGroupResponse.ScalingRules["+ i +"].Id"));
			scalingRule.setRuleCategory(context.stringValue("DescribeScalingTaskGroupResponse.ScalingRules["+ i +"].RuleCategory"));
			scalingRule.setRuleName(context.stringValue("DescribeScalingTaskGroupResponse.ScalingRules["+ i +"].RuleName"));
			scalingRule.setAdjustmentType(context.stringValue("DescribeScalingTaskGroupResponse.ScalingRules["+ i +"].AdjustmentType"));
			scalingRule.setAdjustmentValue(context.integerValue("DescribeScalingTaskGroupResponse.ScalingRules["+ i +"].AdjustmentValue"));
			scalingRule.setCooldown(context.integerValue("DescribeScalingTaskGroupResponse.ScalingRules["+ i +"].Cooldown"));
			scalingRule.setLaunchTime(context.stringValue("DescribeScalingTaskGroupResponse.ScalingRules["+ i +"].LaunchTime"));
			scalingRule.setLaunchExpirationTime(context.integerValue("DescribeScalingTaskGroupResponse.ScalingRules["+ i +"].LaunchExpirationTime"));
			scalingRule.setRecurrenceType(context.stringValue("DescribeScalingTaskGroupResponse.ScalingRules["+ i +"].RecurrenceType"));
			scalingRule.setRecurrenceValue(context.stringValue("DescribeScalingTaskGroupResponse.ScalingRules["+ i +"].RecurrenceValue"));
			scalingRule.setRecurrenceEndTime(context.stringValue("DescribeScalingTaskGroupResponse.ScalingRules["+ i +"].RecurrenceEndTime"));

			scalingRules.add(scalingRule);
		}
		describeScalingTaskGroupResponse.setScalingRules(scalingRules);

		List<SpotPriceLimit> spotPriceLimits = new ArrayList<SpotPriceLimit>();
		for (int i = 0; i < context.lengthValue("DescribeScalingTaskGroupResponse.SpotPriceLimits.Length"); i++) {
			SpotPriceLimit spotPriceLimit = new SpotPriceLimit();
			spotPriceLimit.setInstanceType(context.stringValue("DescribeScalingTaskGroupResponse.SpotPriceLimits["+ i +"].InstanceType"));
			spotPriceLimit.setPriceLimit(context.floatValue("DescribeScalingTaskGroupResponse.SpotPriceLimits["+ i +"].PriceLimit"));

			spotPriceLimits.add(spotPriceLimit);
		}
		describeScalingTaskGroupResponse.setSpotPriceLimits(spotPriceLimits);
	 
	 	return describeScalingTaskGroupResponse;
	}
}