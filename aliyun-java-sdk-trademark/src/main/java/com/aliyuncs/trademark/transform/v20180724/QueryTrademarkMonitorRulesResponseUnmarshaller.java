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

	public static QueryTrademarkMonitorRulesResponse unmarshall(QueryTrademarkMonitorRulesResponse queryTrademarkMonitorRulesResponse, UnmarshallerContext _ctx) {
		
		queryTrademarkMonitorRulesResponse.setRequestId(_ctx.stringValue("QueryTrademarkMonitorRulesResponse.RequestId"));
		queryTrademarkMonitorRulesResponse.setTotalItemNum(_ctx.integerValue("QueryTrademarkMonitorRulesResponse.TotalItemNum"));
		queryTrademarkMonitorRulesResponse.setCurrentPageNum(_ctx.integerValue("QueryTrademarkMonitorRulesResponse.CurrentPageNum"));
		queryTrademarkMonitorRulesResponse.setPageSize(_ctx.integerValue("QueryTrademarkMonitorRulesResponse.PageSize"));
		queryTrademarkMonitorRulesResponse.setTotalPageNum(_ctx.integerValue("QueryTrademarkMonitorRulesResponse.TotalPageNum"));
		queryTrademarkMonitorRulesResponse.setPrePage(_ctx.booleanValue("QueryTrademarkMonitorRulesResponse.PrePage"));
		queryTrademarkMonitorRulesResponse.setNextPage(_ctx.booleanValue("QueryTrademarkMonitorRulesResponse.NextPage"));

		List<TmMonitorRule> data = new ArrayList<TmMonitorRule>();
		for (int i = 0; i < _ctx.lengthValue("QueryTrademarkMonitorRulesResponse.Data.Length"); i++) {
			TmMonitorRule tmMonitorRule = new TmMonitorRule();
			tmMonitorRule.setId(_ctx.stringValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].Id"));
			tmMonitorRule.setUserId(_ctx.stringValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].UserId"));
			tmMonitorRule.setRuleStatus(_ctx.stringValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].RuleStatus"));
			tmMonitorRule.setRuleSource(_ctx.stringValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].RuleSource"));
			tmMonitorRule.setRuleName(_ctx.stringValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].RuleName"));
			tmMonitorRule.setRuleType(_ctx.integerValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].RuleType"));
			tmMonitorRule.setRuleKeyword(_ctx.stringValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].RuleKeyword"));
			tmMonitorRule.setRuleDetail(_ctx.stringValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].RuleDetail"));
			tmMonitorRule.setNotifyUpdate(_ctx.integerValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].NotifyUpdate"));
			tmMonitorRule.setVersion(_ctx.integerValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].Version"));
			tmMonitorRule.setStartTime(_ctx.stringValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].StartTime"));
			tmMonitorRule.setEndTime(_ctx.stringValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].EndTime"));
			tmMonitorRule.setLastRunTime(_ctx.stringValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].LastRunTime"));
			tmMonitorRule.setLastFinishTime(_ctx.stringValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].LastFinishTime"));
			tmMonitorRule.setLastUpdateTime(_ctx.stringValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].LastUpdateTime"));
			tmMonitorRule.setEnv(_ctx.stringValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].Env"));
			tmMonitorRule.setRuleExtend(_ctx.stringValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].RuleExtend"));
			tmMonitorRule.setCreateTime(_ctx.stringValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].CreateTime"));
			tmMonitorRule.setUpdateTime(_ctx.stringValue("QueryTrademarkMonitorRulesResponse.Data["+ i +"].UpdateTime"));

			data.add(tmMonitorRule);
		}
		queryTrademarkMonitorRulesResponse.setData(data);
	 
	 	return queryTrademarkMonitorRulesResponse;
	}
}