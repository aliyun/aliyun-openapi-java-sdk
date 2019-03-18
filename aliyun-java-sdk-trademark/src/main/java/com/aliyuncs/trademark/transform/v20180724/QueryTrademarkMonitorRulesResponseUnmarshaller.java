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

package com.aliyuncs.trademark.transform.v20180724;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20180724.QueryTrademarkMonitorRulesResponse;
import com.aliyuncs.trademark.model.v20180724.QueryTrademarkMonitorRulesResponse.TmMonitorRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTrademarkMonitorRulesResponseUnmarshaller {

	public static QueryTrademarkMonitorRulesResponse unmarshall(QueryTrademarkMonitorRulesResponse queryTrademarkMonitorRulesResponse, UnmarshallerContext context) {
		
		queryTrademarkMonitorRulesResponse.setRequestId(context.stringValue("QueryTrademarkMonitorRulesResponse.RequestId"));
		queryTrademarkMonitorRulesResponse.setTotalItemNum(context.integerValue("QueryTrademarkMonitorRulesResponse.TotalItemNum"));
		queryTrademarkMonitorRulesResponse.setCurrentPageNum(context.integerValue("QueryTrademarkMonitorRulesResponse.CurrentPageNum"));
		queryTrademarkMonitorRulesResponse.setPageSize(context.integerValue("QueryTrademarkMonitorRulesResponse.PageSize"));
		queryTrademarkMonitorRulesResponse.setTotalPageNum(context.integerValue("QueryTrademarkMonitorRulesResponse.TotalPageNum"));
		queryTrademarkMonitorRulesResponse.setPrePage(context.booleanValue("QueryTrademarkMonitorRulesResponse.PrePage"));
		queryTrademarkMonitorRulesResponse.setNextPage(context.booleanValue("QueryTrademarkMonitorRulesResponse.NextPage"));

		List<TmMonitorRule> data = new ArrayList<TmMonitorRule>();
		for (int i = 0; i < context.lengthValue("QueryTrademarkMonitorRulesResponse.Data.Length"); i++) {
			TmMonitorRule tmMonitorRule = new TmMonitorRule();
			tmMonitorRule.setId(context.stringValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].Id"));
			tmMonitorRule.setUserId(context.stringValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].UserId"));
			tmMonitorRule.setRuleStatus(context.stringValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].RuleStatus"));
			tmMonitorRule.setRuleSource(context.stringValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].RuleSource"));
			tmMonitorRule.setRuleName(context.stringValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].RuleName"));
			tmMonitorRule.setRuleType(context.integerValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].RuleType"));
			tmMonitorRule.setRuleKeyword(context.stringValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].RuleKeyword"));
			tmMonitorRule.setRuleDetail(context.stringValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].RuleDetail"));
			tmMonitorRule.setNotifyUpdate(context.integerValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].NotifyUpdate"));
			tmMonitorRule.setVersion(context.integerValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].Version"));
			tmMonitorRule.setStartTime(context.stringValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].StartTime"));
			tmMonitorRule.setEndTime(context.stringValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].EndTime"));
			tmMonitorRule.setLastRunTime(context.stringValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].LastRunTime"));
			tmMonitorRule.setLastFinishTime(context.stringValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].LastFinishTime"));
			tmMonitorRule.setLastUpdateTime(context.stringValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].LastUpdateTime"));
			tmMonitorRule.setEnv(context.stringValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].Env"));
			tmMonitorRule.setRuleExtend(context.stringValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].RuleExtend"));
			tmMonitorRule.setCreateTime(context.stringValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].CreateTime"));
			tmMonitorRule.setUpdateTime(context.stringValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].UpdateTime"));

			data.add(tmMonitorRule);
		}
		queryTrademarkMonitorRulesResponse.setData(data);
	 
	 	return queryTrademarkMonitorRulesResponse;
	}
}