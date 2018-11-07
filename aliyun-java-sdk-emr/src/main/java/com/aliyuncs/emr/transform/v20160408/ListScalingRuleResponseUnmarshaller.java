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
import java.util.Map;
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
			rule.setAdjustmentType(context.stringValue("ListScalingRuleResponse.RuleList["+ i +"].AdjustmentType"));
			rule.setAdjustmentValue(context.integerValue("ListScalingRuleResponse.RuleList["+ i +"].AdjustmentValue"));
			rule.setCooldown(context.integerValue("ListScalingRuleResponse.RuleList["+ i +"].Cooldown"));
			rule.setStatus(context.stringValue("ListScalingRuleResponse.RuleList["+ i +"].Status"));
			rule.setLaunchTime(context.stringValue("ListScalingRuleResponse.RuleList["+ i +"].LaunchTime"));
			rule.setLaunchExpirationTime(context.integerValue("ListScalingRuleResponse.RuleList["+ i +"].LaunchExpirationTime"));
			rule.setRecurrenceType(context.stringValue("ListScalingRuleResponse.RuleList["+ i +"].RecurrenceType"));
			rule.setRecurrenceValue(context.stringValue("ListScalingRuleResponse.RuleList["+ i +"].RecurrenceValue"));
			rule.setRecurrenceEndTime(context.stringValue("ListScalingRuleResponse.RuleList["+ i +"].RecurrenceEndTime"));

			ruleList.add(rule);
		}
		listScalingRuleResponse.setRuleList(ruleList);
	 
	 	return listScalingRuleResponse;
	}
}