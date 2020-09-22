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

	public static DescribeScalingRuleResponse unmarshall(DescribeScalingRuleResponse describeScalingRuleResponse, UnmarshallerContext _ctx) {
		
		describeScalingRuleResponse.setRequestId(_ctx.stringValue("DescribeScalingRuleResponse.RequestId"));
		describeScalingRuleResponse.setId(_ctx.stringValue("DescribeScalingRuleResponse.Id"));
		describeScalingRuleResponse.setGmtCreate(_ctx.stringValue("DescribeScalingRuleResponse.GmtCreate"));
		describeScalingRuleResponse.setGmtModified(_ctx.stringValue("DescribeScalingRuleResponse.GmtModified"));
		describeScalingRuleResponse.setRuleName(_ctx.stringValue("DescribeScalingRuleResponse.RuleName"));
		describeScalingRuleResponse.setRuleCategory(_ctx.stringValue("DescribeScalingRuleResponse.RuleCategory"));
		describeScalingRuleResponse.setAdjustmentType(_ctx.stringValue("DescribeScalingRuleResponse.AdjustmentType"));
		describeScalingRuleResponse.setAdjustmentValue(_ctx.integerValue("DescribeScalingRuleResponse.AdjustmentValue"));
		describeScalingRuleResponse.setCooldown(_ctx.integerValue("DescribeScalingRuleResponse.Cooldown"));
		describeScalingRuleResponse.setStatus(_ctx.stringValue("DescribeScalingRuleResponse.Status"));
		describeScalingRuleResponse.setWithGrace(_ctx.booleanValue("DescribeScalingRuleResponse.WithGrace"));
		describeScalingRuleResponse.setTimeoutWithGrace(_ctx.longValue("DescribeScalingRuleResponse.TimeoutWithGrace"));

		SchedulerTrigger schedulerTrigger = new SchedulerTrigger();
		schedulerTrigger.setLaunchTime(_ctx.longValue("DescribeScalingRuleResponse.SchedulerTrigger.LaunchTime"));
		schedulerTrigger.setLaunchExpirationTime(_ctx.integerValue("DescribeScalingRuleResponse.SchedulerTrigger.LaunchExpirationTime"));
		schedulerTrigger.setRecurrenceType(_ctx.stringValue("DescribeScalingRuleResponse.SchedulerTrigger.RecurrenceType"));
		schedulerTrigger.setRecurrenceValue(_ctx.stringValue("DescribeScalingRuleResponse.SchedulerTrigger.RecurrenceValue"));
		schedulerTrigger.setRecurrenceEndTime(_ctx.longValue("DescribeScalingRuleResponse.SchedulerTrigger.RecurrenceEndTime"));
		describeScalingRuleResponse.setSchedulerTrigger(schedulerTrigger);

		CloudWatchTrigger cloudWatchTrigger = new CloudWatchTrigger();
		cloudWatchTrigger.setMetricName(_ctx.stringValue("DescribeScalingRuleResponse.CloudWatchTrigger.MetricName"));
		cloudWatchTrigger.setPeriod(_ctx.integerValue("DescribeScalingRuleResponse.CloudWatchTrigger.Period"));
		cloudWatchTrigger.setStatistics(_ctx.stringValue("DescribeScalingRuleResponse.CloudWatchTrigger.Statistics"));
		cloudWatchTrigger.setComparisonOperator(_ctx.stringValue("DescribeScalingRuleResponse.CloudWatchTrigger.ComparisonOperator"));
		cloudWatchTrigger.setThreshold(_ctx.stringValue("DescribeScalingRuleResponse.CloudWatchTrigger.Threshold"));
		cloudWatchTrigger.setEvaluationCount(_ctx.stringValue("DescribeScalingRuleResponse.CloudWatchTrigger.EvaluationCount"));
		cloudWatchTrigger.setUnit(_ctx.stringValue("DescribeScalingRuleResponse.CloudWatchTrigger.Unit"));
		cloudWatchTrigger.setMetricDisplayName(_ctx.stringValue("DescribeScalingRuleResponse.CloudWatchTrigger.MetricDisplayName"));
		describeScalingRuleResponse.setCloudWatchTrigger(cloudWatchTrigger);
	 
	 	return describeScalingRuleResponse;
	}
}