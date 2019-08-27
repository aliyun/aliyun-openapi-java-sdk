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

	public static ListScalingRuleResponse unmarshall(ListScalingRuleResponse listScalingRuleResponse, UnmarshallerContext _ctx) {
		
		listScalingRuleResponse.setRequestId(_ctx.stringValue("ListScalingRuleResponse.RequestId"));
		listScalingRuleResponse.setPageNumber(_ctx.integerValue("ListScalingRuleResponse.PageNumber"));
		listScalingRuleResponse.setPageSize(_ctx.integerValue("ListScalingRuleResponse.PageSize"));
		listScalingRuleResponse.setTotal(_ctx.integerValue("ListScalingRuleResponse.Total"));

		List<Rule> ruleList = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("ListScalingRuleResponse.RuleList.Length"); i++) {
			Rule rule = new Rule();
			rule.setId(_ctx.stringValue("ListScalingRuleResponse.RuleList["+ i +"].Id"));
			rule.setGmtCreate(_ctx.longValue("ListScalingRuleResponse.RuleList["+ i +"].GmtCreate"));
			rule.setGmtModified(_ctx.longValue("ListScalingRuleResponse.RuleList["+ i +"].GmtModified"));
			rule.setRuleName(_ctx.stringValue("ListScalingRuleResponse.RuleList["+ i +"].RuleName"));
			rule.setRuleCategory(_ctx.stringValue("ListScalingRuleResponse.RuleList["+ i +"].RuleCategory"));
			rule.setAdjustmentType(_ctx.stringValue("ListScalingRuleResponse.RuleList["+ i +"].AdjustmentType"));
			rule.setAdjustmentValue(_ctx.integerValue("ListScalingRuleResponse.RuleList["+ i +"].AdjustmentValue"));
			rule.setCooldown(_ctx.integerValue("ListScalingRuleResponse.RuleList["+ i +"].Cooldown"));
			rule.setStatus(_ctx.stringValue("ListScalingRuleResponse.RuleList["+ i +"].Status"));

			SchedulerTrigger schedulerTrigger = new SchedulerTrigger();
			schedulerTrigger.setLaunchTime(_ctx.longValue("ListScalingRuleResponse.RuleList["+ i +"].SchedulerTrigger.LaunchTime"));
			schedulerTrigger.setLaunchExpirationTime(_ctx.integerValue("ListScalingRuleResponse.RuleList["+ i +"].SchedulerTrigger.LaunchExpirationTime"));
			schedulerTrigger.setRecurrenceType(_ctx.stringValue("ListScalingRuleResponse.RuleList["+ i +"].SchedulerTrigger.RecurrenceType"));
			schedulerTrigger.setRecurrenceValue(_ctx.stringValue("ListScalingRuleResponse.RuleList["+ i +"].SchedulerTrigger.RecurrenceValue"));
			schedulerTrigger.setRecurrenceEndTime(_ctx.longValue("ListScalingRuleResponse.RuleList["+ i +"].SchedulerTrigger.RecurrenceEndTime"));
			rule.setSchedulerTrigger(schedulerTrigger);

			CloudWatchTrigger cloudWatchTrigger = new CloudWatchTrigger();
			cloudWatchTrigger.setMetricName(_ctx.stringValue("ListScalingRuleResponse.RuleList["+ i +"].CloudWatchTrigger.MetricName"));
			cloudWatchTrigger.setPeriod(_ctx.integerValue("ListScalingRuleResponse.RuleList["+ i +"].CloudWatchTrigger.Period"));
			cloudWatchTrigger.setStatistics(_ctx.stringValue("ListScalingRuleResponse.RuleList["+ i +"].CloudWatchTrigger.Statistics"));
			cloudWatchTrigger.setComparisonOperator(_ctx.stringValue("ListScalingRuleResponse.RuleList["+ i +"].CloudWatchTrigger.ComparisonOperator"));
			cloudWatchTrigger.setThreshold(_ctx.stringValue("ListScalingRuleResponse.RuleList["+ i +"].CloudWatchTrigger.Threshold"));
			cloudWatchTrigger.setEvaluationCount(_ctx.stringValue("ListScalingRuleResponse.RuleList["+ i +"].CloudWatchTrigger.EvaluationCount"));
			cloudWatchTrigger.setUnit(_ctx.stringValue("ListScalingRuleResponse.RuleList["+ i +"].CloudWatchTrigger.Unit"));
			cloudWatchTrigger.setMetricDisplayName(_ctx.stringValue("ListScalingRuleResponse.RuleList["+ i +"].CloudWatchTrigger.MetricDisplayName"));
			rule.setCloudWatchTrigger(cloudWatchTrigger);

			ruleList.add(rule);
		}
		listScalingRuleResponse.setRuleList(ruleList);
	 
	 	return listScalingRuleResponse;
	}
}