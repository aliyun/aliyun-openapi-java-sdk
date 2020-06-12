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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.QuerySceneRuleResponse;
import com.aliyuncs.iot.model.v20180120.QuerySceneRuleResponse.Data;
import com.aliyuncs.iot.model.v20180120.QuerySceneRuleResponse.Data.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySceneRuleResponseUnmarshaller {

	public static QuerySceneRuleResponse unmarshall(QuerySceneRuleResponse querySceneRuleResponse, UnmarshallerContext _ctx) {
		
		querySceneRuleResponse.setRequestId(_ctx.stringValue("QuerySceneRuleResponse.RequestId"));
		querySceneRuleResponse.setSuccess(_ctx.booleanValue("QuerySceneRuleResponse.Success"));
		querySceneRuleResponse.setCode(_ctx.stringValue("QuerySceneRuleResponse.Code"));
		querySceneRuleResponse.setErrorMessage(_ctx.stringValue("QuerySceneRuleResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QuerySceneRuleResponse.Data.Total"));
		data.setPageSize(_ctx.integerValue("QuerySceneRuleResponse.Data.PageSize"));
		data.setCurrentPage(_ctx.integerValue("QuerySceneRuleResponse.Data.CurrentPage"));

		List<Rule> ruleList = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("QuerySceneRuleResponse.Data.RuleList.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleId(_ctx.stringValue("QuerySceneRuleResponse.Data.RuleList["+ i +"].RuleId"));
			rule.setGmtCreate(_ctx.longValue("QuerySceneRuleResponse.Data.RuleList["+ i +"].GmtCreate"));
			rule.setGmtModified(_ctx.longValue("QuerySceneRuleResponse.Data.RuleList["+ i +"].GmtModified"));
			rule.setRuleName(_ctx.stringValue("QuerySceneRuleResponse.Data.RuleList["+ i +"].RuleName"));
			rule.setRuleDescription(_ctx.stringValue("QuerySceneRuleResponse.Data.RuleList["+ i +"].RuleDescription"));
			rule.setRuleStatus(_ctx.integerValue("QuerySceneRuleResponse.Data.RuleList["+ i +"].RuleStatus"));

			ruleList.add(rule);
		}
		data.setRuleList(ruleList);
		querySceneRuleResponse.setData(data);
	 
	 	return querySceneRuleResponse;
	}
}