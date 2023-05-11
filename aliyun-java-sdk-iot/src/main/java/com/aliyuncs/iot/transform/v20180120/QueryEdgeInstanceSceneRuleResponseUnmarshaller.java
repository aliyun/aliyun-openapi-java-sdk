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

import com.aliyuncs.iot.model.v20180120.QueryEdgeInstanceSceneRuleResponse;
import com.aliyuncs.iot.model.v20180120.QueryEdgeInstanceSceneRuleResponse.Data;
import com.aliyuncs.iot.model.v20180120.QueryEdgeInstanceSceneRuleResponse.Data.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryEdgeInstanceSceneRuleResponseUnmarshaller {

	public static QueryEdgeInstanceSceneRuleResponse unmarshall(QueryEdgeInstanceSceneRuleResponse queryEdgeInstanceSceneRuleResponse, UnmarshallerContext _ctx) {
		
		queryEdgeInstanceSceneRuleResponse.setRequestId(_ctx.stringValue("QueryEdgeInstanceSceneRuleResponse.RequestId"));
		queryEdgeInstanceSceneRuleResponse.setSuccess(_ctx.booleanValue("QueryEdgeInstanceSceneRuleResponse.Success"));
		queryEdgeInstanceSceneRuleResponse.setCode(_ctx.stringValue("QueryEdgeInstanceSceneRuleResponse.Code"));
		queryEdgeInstanceSceneRuleResponse.setErrorMessage(_ctx.stringValue("QueryEdgeInstanceSceneRuleResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QueryEdgeInstanceSceneRuleResponse.Data.Total"));
		data.setPageSize(_ctx.integerValue("QueryEdgeInstanceSceneRuleResponse.Data.PageSize"));
		data.setCurrentPage(_ctx.integerValue("QueryEdgeInstanceSceneRuleResponse.Data.CurrentPage"));

		List<Rule> ruleList = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("QueryEdgeInstanceSceneRuleResponse.Data.RuleList.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleId(_ctx.stringValue("QueryEdgeInstanceSceneRuleResponse.Data.RuleList["+ i +"].RuleId"));
			rule.setRuleName(_ctx.stringValue("QueryEdgeInstanceSceneRuleResponse.Data.RuleList["+ i +"].RuleName"));
			rule.setGmtCreate(_ctx.longValue("QueryEdgeInstanceSceneRuleResponse.Data.RuleList["+ i +"].GmtCreate"));
			rule.setStatus(_ctx.integerValue("QueryEdgeInstanceSceneRuleResponse.Data.RuleList["+ i +"].Status"));
			rule.setIsExisted(_ctx.integerValue("QueryEdgeInstanceSceneRuleResponse.Data.RuleList["+ i +"].IsExisted"));

			ruleList.add(rule);
		}
		data.setRuleList(ruleList);
		queryEdgeInstanceSceneRuleResponse.setData(data);
	 
	 	return queryEdgeInstanceSceneRuleResponse;
	}
}