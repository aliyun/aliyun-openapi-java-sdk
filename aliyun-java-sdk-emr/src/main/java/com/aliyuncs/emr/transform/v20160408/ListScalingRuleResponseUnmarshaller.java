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

import com.aliyuncs.emr.model.v20160408.ListScalingRuleResponse;
import com.aliyuncs.emr.model.v20160408.ListScalingRuleResponse.Rule;
import com.aliyuncs.emr.model.v20160408.ListScalingRuleResponse.Rule.CloudWatchTrigger;
import com.aliyuncs.emr.model.v20160408.ListScalingRuleResponse.Rule.SchedulerTrigger;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListScalingRuleResponseUnmarshaller {

	public static ListScalingRuleResponse unmarshall(ListScalingRuleResponse listScalingRuleResponse, UnmarshallerContext context) {
		
		listScalingRuleResponse.setRequestId(context.stringValue("ListScalingRuleResponse.RequestId"));
		listScalingRuleResponse.setPageNumber(context.integerValue("ListScalingRuleResponse.PageNumber"));
		listScalingRuleResponse.setPageSize(context.integerValue("ListScalingRuleResponse.PageSize"));
		listScalingRuleResponse.setTotal(context.integerValue("ListScalingRuleResponse.Total"));

		List<Rule> ruleList = new ArrayList<Rule>();
		for (int i = 0; i < context.lengthValue("ListScalingRuleResponse.RuleList.Length"); i++) {
			Rule rule = new Rule();
			rule.setId(context.stringValue("ListScalingRuleResponse.RuleList["+ i +"].Id"));
			rule.setGmtCreate(context.longValue("ListScalingRuleResponse.RuleList["+ i +"].GmtCreate"));
			rule.setGmtModified(context.longValue("ListScalingRuleResponse.RuleList["+ i +"].GmtModified"));
			rule.setRuleName(context.stringValue("ListScalingRuleResponse.RuleList["+ i +"].RuleName"));
			rule.setRuleCategory(context.stringValue("ListScalingRuleResponse.RuleList["+ i +"].RuleCategory"));
			rule.setAdjustmentType(context.stringValue("ListScalingRuleResponse.RuleList["+ i +"].AdjustmentType"));
			rule.setAdjustmentValue(context.integerValue("ListScalingRuleResponse.RuleList["+ i +"].AdjustmentValue"));
			rule.setCooldown(context.integerValue("ListScalingRuleResponse.RuleList["+ i +"].Cooldown"));
			rule.setStatus(context.stringValue("ListScalingRuleResponse.RuleList["+ i +"].Status"));

			SchedulerTrigger schedulerTrigger = new SchedulerTrigger();
			schedulerTrigger.setLaunchTime(context.longValue("ListScalingRuleResponse.RuleList["+ i +"].SchedulerTrigger.LaunchTime"));
			schedulerTrigger.setLaunchExpirationTime(context.integerValue("ListScalingRuleResponse.RuleList["+ i +"].SchedulerTrigger.LaunchExpirationTime"));
			schedulerTrigger.setRecurrenceType(context.stringValue("ListScalingRuleResponse.RuleList["+ i +"].SchedulerTrigger.RecurrenceType"));
			schedulerTrigger.setRecurrenceValue(context.stringValue("ListScalingRuleResponse.RuleList["+ i +"].SchedulerTrigger.RecurrenceValue"));
			schedulerTrigger.setRecurrenceEndTime(context.longValue("ListScalingRuleResponse.RuleList["+ i +"].SchedulerTrigger.RecurrenceEndTime"));
			rule.setSchedulerTrigger(schedulerTrigger);

			CloudWatchTrigger cloudWatchTrigger = new CloudWatchTrigger();
			cloudWatchTrigger.setMetricName(context.stringValue("ListScalingRuleResponse.RuleList["+ i +"].CloudWatchTrigger.MetricName"));
			cloudWatchTrigger.setPeriod(context.integerValue("ListScalingRuleResponse.RuleList["+ i +"].CloudWatchTrigger.Period"));
			cloudWatchTrigger.setStatistics(context.stringValue("ListScalingRuleResponse.RuleList["+ i +"].CloudWatchTrigger.Statistics"));
			cloudWatchTrigger.setComparisonOperator(context.stringValue("ListScalingRuleResponse.RuleList["+ i +"].CloudWatchTrigger.ComparisonOperator"));
			cloudWatchTrigger.setThreshold(context.stringValue("ListScalingRuleResponse.RuleList["+ i +"].CloudWatchTrigger.Threshold"));
			cloudWatchTrigger.setEvaluationCount(context.stringValue("ListScalingRuleResponse.RuleList["+ i +"].CloudWatchTrigger.EvaluationCount"));
			cloudWatchTrigger.setUnit(context.stringValue("ListScalingRuleResponse.RuleList["+ i +"].CloudWatchTrigger.Unit"));
			cloudWatchTrigger.setMetricDisplayName(context.stringValue("ListScalingRuleResponse.RuleList["+ i +"].CloudWatchTrigger.MetricDisplayName"));
			rule.setCloudWatchTrigger(cloudWatchTrigger);

			ruleList.add(rule);
		}
		listScalingRuleResponse.setRuleList(ruleList);
	 
	 	return listScalingRuleResponse;
	}
}