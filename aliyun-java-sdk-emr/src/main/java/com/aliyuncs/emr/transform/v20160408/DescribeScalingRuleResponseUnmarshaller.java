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
import com.aliyuncs.emr.model.v20160408.DescribeScalingRuleResponse.CloudWatchTrigger;
import com.aliyuncs.emr.model.v20160408.DescribeScalingRuleResponse.SchedulerTrigger;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScalingRuleResponseUnmarshaller {

	public static DescribeScalingRuleResponse unmarshall(DescribeScalingRuleResponse describeScalingRuleResponse, UnmarshallerContext context) {
		
		describeScalingRuleResponse.setRequestId(context.stringValue("DescribeScalingRuleResponse.RequestId"));
		describeScalingRuleResponse.setId(context.stringValue("DescribeScalingRuleResponse.Id"));
		describeScalingRuleResponse.setGmtCreate(context.stringValue("DescribeScalingRuleResponse.GmtCreate"));
		describeScalingRuleResponse.setGmtModified(context.stringValue("DescribeScalingRuleResponse.GmtModified"));
		describeScalingRuleResponse.setRuleName(context.stringValue("DescribeScalingRuleResponse.RuleName"));
		describeScalingRuleResponse.setRuleCategory(context.stringValue("DescribeScalingRuleResponse.RuleCategory"));
		describeScalingRuleResponse.setAdjustmentType(context.stringValue("DescribeScalingRuleResponse.AdjustmentType"));
		describeScalingRuleResponse.setAdjustmentValue(context.integerValue("DescribeScalingRuleResponse.AdjustmentValue"));
		describeScalingRuleResponse.setCooldown(context.integerValue("DescribeScalingRuleResponse.Cooldown"));
		describeScalingRuleResponse.setStatus(context.stringValue("DescribeScalingRuleResponse.Status"));

		SchedulerTrigger schedulerTrigger = new SchedulerTrigger();
		schedulerTrigger.setLaunchTime(context.longValue("DescribeScalingRuleResponse.SchedulerTrigger.LaunchTime"));
		schedulerTrigger.setLaunchExpirationTime(context.integerValue("DescribeScalingRuleResponse.SchedulerTrigger.LaunchExpirationTime"));
		schedulerTrigger.setRecurrenceType(context.stringValue("DescribeScalingRuleResponse.SchedulerTrigger.RecurrenceType"));
		schedulerTrigger.setRecurrenceValue(context.stringValue("DescribeScalingRuleResponse.SchedulerTrigger.RecurrenceValue"));
		schedulerTrigger.setRecurrenceEndTime(context.longValue("DescribeScalingRuleResponse.SchedulerTrigger.RecurrenceEndTime"));
		describeScalingRuleResponse.setSchedulerTrigger(schedulerTrigger);

		CloudWatchTrigger cloudWatchTrigger = new CloudWatchTrigger();
		cloudWatchTrigger.setMetricName(context.stringValue("DescribeScalingRuleResponse.CloudWatchTrigger.MetricName"));
		cloudWatchTrigger.setPeriod(context.integerValue("DescribeScalingRuleResponse.CloudWatchTrigger.Period"));
		cloudWatchTrigger.setStatistics(context.stringValue("DescribeScalingRuleResponse.CloudWatchTrigger.Statistics"));
		cloudWatchTrigger.setComparisonOperator(context.stringValue("DescribeScalingRuleResponse.CloudWatchTrigger.ComparisonOperator"));
		cloudWatchTrigger.setThreshold(context.stringValue("DescribeScalingRuleResponse.CloudWatchTrigger.Threshold"));
		cloudWatchTrigger.setEvaluationCount(context.stringValue("DescribeScalingRuleResponse.CloudWatchTrigger.EvaluationCount"));
		cloudWatchTrigger.setUnit(context.stringValue("DescribeScalingRuleResponse.CloudWatchTrigger.Unit"));
		cloudWatchTrigger.setMetricDisplayName(context.stringValue("DescribeScalingRuleResponse.CloudWatchTrigger.MetricDisplayName"));
		describeScalingRuleResponse.setCloudWatchTrigger(cloudWatchTrigger);
	 
	 	return describeScalingRuleResponse;
	}
}