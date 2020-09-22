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

import com.aliyuncs.emr.model.v20160408.DescribeScalingGroupInstanceV2Response;
import com.aliyuncs.emr.model.v20160408.DescribeScalingGroupInstanceV2Response.ScalingConfig;
import com.aliyuncs.emr.model.v20160408.DescribeScalingGroupInstanceV2Response.ScalingConfig.SpotPriceLimit;
import com.aliyuncs.emr.model.v20160408.DescribeScalingGroupInstanceV2Response.ScalingRule;
import com.aliyuncs.emr.model.v20160408.DescribeScalingGroupInstanceV2Response.ScalingRule.CloudWatchTrigger;
import com.aliyuncs.emr.model.v20160408.DescribeScalingGroupInstanceV2Response.ScalingRule.SchedulerTrigger;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScalingGroupInstanceV2ResponseUnmarshaller {

	public static DescribeScalingGroupInstanceV2Response unmarshall(DescribeScalingGroupInstanceV2Response describeScalingGroupInstanceV2Response, UnmarshallerContext _ctx) {
		
		describeScalingGroupInstanceV2Response.setRequestId(_ctx.stringValue("DescribeScalingGroupInstanceV2Response.RequestId"));
		describeScalingGroupInstanceV2Response.setHostGroupId(_ctx.stringValue("DescribeScalingGroupInstanceV2Response.HostGroupId"));
		describeScalingGroupInstanceV2Response.setScalingGroupId(_ctx.stringValue("DescribeScalingGroupInstanceV2Response.ScalingGroupId"));
		describeScalingGroupInstanceV2Response.setMinSize(_ctx.integerValue("DescribeScalingGroupInstanceV2Response.MinSize"));
		describeScalingGroupInstanceV2Response.setMaxSize(_ctx.integerValue("DescribeScalingGroupInstanceV2Response.MaxSize"));
		describeScalingGroupInstanceV2Response.setDefaultCooldown(_ctx.integerValue("DescribeScalingGroupInstanceV2Response.DefaultCooldown"));
		describeScalingGroupInstanceV2Response.setActiveRuleCategory(_ctx.stringValue("DescribeScalingGroupInstanceV2Response.ActiveRuleCategory"));
		describeScalingGroupInstanceV2Response.setWithGrace(_ctx.booleanValue("DescribeScalingGroupInstanceV2Response.WithGrace"));
		describeScalingGroupInstanceV2Response.setTimeoutWithGrace(_ctx.longValue("DescribeScalingGroupInstanceV2Response.TimeoutWithGrace"));
		describeScalingGroupInstanceV2Response.setMultiAvailablePolicy(_ctx.stringValue("DescribeScalingGroupInstanceV2Response.MultiAvailablePolicy"));
		describeScalingGroupInstanceV2Response.setMultiAvailablePolicyParam(_ctx.stringValue("DescribeScalingGroupInstanceV2Response.MultiAvailablePolicyParam"));

		ScalingConfig scalingConfig = new ScalingConfig();
		scalingConfig.setSpotStrategy(_ctx.stringValue("DescribeScalingGroupInstanceV2Response.ScalingConfig.SpotStrategy"));
		scalingConfig.setPayType(_ctx.stringValue("DescribeScalingGroupInstanceV2Response.ScalingConfig.PayType"));
		scalingConfig.setDataDiskCategory(_ctx.stringValue("DescribeScalingGroupInstanceV2Response.ScalingConfig.DataDiskCategory"));
		scalingConfig.setDataDiskSize(_ctx.integerValue("DescribeScalingGroupInstanceV2Response.ScalingConfig.DataDiskSize"));
		scalingConfig.setDataDiskCount(_ctx.integerValue("DescribeScalingGroupInstanceV2Response.ScalingConfig.DataDiskCount"));
		scalingConfig.setSysDiskCategory(_ctx.stringValue("DescribeScalingGroupInstanceV2Response.ScalingConfig.SysDiskCategory"));
		scalingConfig.setSysDiskSize(_ctx.integerValue("DescribeScalingGroupInstanceV2Response.ScalingConfig.SysDiskSize"));

		List<String> instanceTypeList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScalingGroupInstanceV2Response.ScalingConfig.InstanceTypeList.Length"); i++) {
			instanceTypeList.add(_ctx.stringValue("DescribeScalingGroupInstanceV2Response.ScalingConfig.InstanceTypeList["+ i +"]"));
		}
		scalingConfig.setInstanceTypeList(instanceTypeList);

		List<SpotPriceLimit> spotPriceLimits = new ArrayList<SpotPriceLimit>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScalingGroupInstanceV2Response.ScalingConfig.SpotPriceLimits.Length"); i++) {
			SpotPriceLimit spotPriceLimit = new SpotPriceLimit();
			spotPriceLimit.setInstanceType(_ctx.stringValue("DescribeScalingGroupInstanceV2Response.ScalingConfig.SpotPriceLimits["+ i +"].InstanceType"));
			spotPriceLimit.setPriceLimit(_ctx.floatValue("DescribeScalingGroupInstanceV2Response.ScalingConfig.SpotPriceLimits["+ i +"].PriceLimit"));

			spotPriceLimits.add(spotPriceLimit);
		}
		scalingConfig.setSpotPriceLimits(spotPriceLimits);
		describeScalingGroupInstanceV2Response.setScalingConfig(scalingConfig);

		List<ScalingRule> scalingRuleList = new ArrayList<ScalingRule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScalingGroupInstanceV2Response.ScalingRuleList.Length"); i++) {
			ScalingRule scalingRule = new ScalingRule();
			scalingRule.setRuleCategory(_ctx.stringValue("DescribeScalingGroupInstanceV2Response.ScalingRuleList["+ i +"].RuleCategory"));
			scalingRule.setEssScalingRuleId(_ctx.stringValue("DescribeScalingGroupInstanceV2Response.ScalingRuleList["+ i +"].EssScalingRuleId"));
			scalingRule.setScalingGroupId(_ctx.longValue("DescribeScalingGroupInstanceV2Response.ScalingRuleList["+ i +"].ScalingGroupId"));
			scalingRule.setRuleName(_ctx.stringValue("DescribeScalingGroupInstanceV2Response.ScalingRuleList["+ i +"].RuleName"));
			scalingRule.setAdjustmentType(_ctx.stringValue("DescribeScalingGroupInstanceV2Response.ScalingRuleList["+ i +"].AdjustmentType"));
			scalingRule.setAdjustmentValue(_ctx.integerValue("DescribeScalingGroupInstanceV2Response.ScalingRuleList["+ i +"].AdjustmentValue"));
			scalingRule.setCooldown(_ctx.integerValue("DescribeScalingGroupInstanceV2Response.ScalingRuleList["+ i +"].Cooldown"));
			scalingRule.setStatus(_ctx.stringValue("DescribeScalingGroupInstanceV2Response.ScalingRuleList["+ i +"].Status"));
			scalingRule.setLaunchTime(_ctx.stringValue("DescribeScalingGroupInstanceV2Response.ScalingRuleList["+ i +"].LaunchTime"));
			scalingRule.setLaunchExpirationTime(_ctx.integerValue("DescribeScalingGroupInstanceV2Response.ScalingRuleList["+ i +"].LaunchExpirationTime"));
			scalingRule.setRecurrenceType(_ctx.stringValue("DescribeScalingGroupInstanceV2Response.ScalingRuleList["+ i +"].RecurrenceType"));
			scalingRule.setRecurrenceValue(_ctx.stringValue("DescribeScalingGroupInstanceV2Response.ScalingRuleList["+ i +"].RecurrenceValue"));
			scalingRule.setRecurrenceEndTime(_ctx.stringValue("DescribeScalingGroupInstanceV2Response.ScalingRuleList["+ i +"].RecurrenceEndTime"));
			scalingRule.setWithGrace(_ctx.booleanValue("DescribeScalingGroupInstanceV2Response.ScalingRuleList["+ i +"].WithGrace"));
			scalingRule.setTimeoutWithGrace(_ctx.longValue("DescribeScalingGroupInstanceV2Response.ScalingRuleList["+ i +"].TimeoutWithGrace"));

			SchedulerTrigger schedulerTrigger = new SchedulerTrigger();
			schedulerTrigger.setLaunchTime(_ctx.longValue("DescribeScalingGroupInstanceV2Response.ScalingRuleList["+ i +"].SchedulerTrigger.LaunchTime"));
			schedulerTrigger.setLaunchExpirationTime(_ctx.integerValue("DescribeScalingGroupInstanceV2Response.ScalingRuleList["+ i +"].SchedulerTrigger.LaunchExpirationTime"));
			schedulerTrigger.setRecurrenceType(_ctx.stringValue("DescribeScalingGroupInstanceV2Response.ScalingRuleList["+ i +"].SchedulerTrigger.RecurrenceType"));
			schedulerTrigger.setRecurrenceValue(_ctx.stringValue("DescribeScalingGroupInstanceV2Response.ScalingRuleList["+ i +"].SchedulerTrigger.RecurrenceValue"));
			schedulerTrigger.setRecurrenceEndTime(_ctx.longValue("DescribeScalingGroupInstanceV2Response.ScalingRuleList["+ i +"].SchedulerTrigger.RecurrenceEndTime"));
			scalingRule.setSchedulerTrigger(schedulerTrigger);

			CloudWatchTrigger cloudWatchTrigger = new CloudWatchTrigger();
			cloudWatchTrigger.setMetricName(_ctx.stringValue("DescribeScalingGroupInstanceV2Response.ScalingRuleList["+ i +"].CloudWatchTrigger.MetricName"));
			cloudWatchTrigger.setPeriod(_ctx.integerValue("DescribeScalingGroupInstanceV2Response.ScalingRuleList["+ i +"].CloudWatchTrigger.Period"));
			cloudWatchTrigger.setStatistics(_ctx.stringValue("DescribeScalingGroupInstanceV2Response.ScalingRuleList["+ i +"].CloudWatchTrigger.Statistics"));
			cloudWatchTrigger.setComparisonOperator(_ctx.stringValue("DescribeScalingGroupInstanceV2Response.ScalingRuleList["+ i +"].CloudWatchTrigger.ComparisonOperator"));
			cloudWatchTrigger.setThreshold(_ctx.stringValue("DescribeScalingGroupInstanceV2Response.ScalingRuleList["+ i +"].CloudWatchTrigger.Threshold"));
			cloudWatchTrigger.setEvaluationCount(_ctx.stringValue("DescribeScalingGroupInstanceV2Response.ScalingRuleList["+ i +"].CloudWatchTrigger.EvaluationCount"));
			cloudWatchTrigger.setUnit(_ctx.stringValue("DescribeScalingGroupInstanceV2Response.ScalingRuleList["+ i +"].CloudWatchTrigger.Unit"));
			cloudWatchTrigger.setMetricDisplayName(_ctx.stringValue("DescribeScalingGroupInstanceV2Response.ScalingRuleList["+ i +"].CloudWatchTrigger.MetricDisplayName"));
			scalingRule.setCloudWatchTrigger(cloudWatchTrigger);

			scalingRuleList.add(scalingRule);
		}
		describeScalingGroupInstanceV2Response.setScalingRuleList(scalingRuleList);
	 
	 	return describeScalingGroupInstanceV2Response;
	}
}