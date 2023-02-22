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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.ListSystemClientRulesResponse;
import com.aliyuncs.sas.model.v20181203.ListSystemClientRulesResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.ListSystemClientRulesResponse.Rule;
import com.aliyuncs.sas.model.v20181203.ListSystemClientRulesResponse.Rule.Policy;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSystemClientRulesResponseUnmarshaller {

	public static ListSystemClientRulesResponse unmarshall(ListSystemClientRulesResponse listSystemClientRulesResponse, UnmarshallerContext _ctx) {
		
		listSystemClientRulesResponse.setRequestId(_ctx.stringValue("ListSystemClientRulesResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListSystemClientRulesResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListSystemClientRulesResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("ListSystemClientRulesResponse.PageInfo.TotalCount"));
		listSystemClientRulesResponse.setPageInfo(pageInfo);

		List<Rule> ruleList = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("ListSystemClientRulesResponse.RuleList.Length"); i++) {
			Rule rule = new Rule();
			rule.setStatus(_ctx.integerValue("ListSystemClientRulesResponse.RuleList["+ i +"].Status"));
			rule.setRuleType(_ctx.integerValue("ListSystemClientRulesResponse.RuleList["+ i +"].RuleType"));
			rule.setPlatform(_ctx.stringValue("ListSystemClientRulesResponse.RuleList["+ i +"].Platform"));
			rule.setSwitchId(_ctx.stringValue("ListSystemClientRulesResponse.RuleList["+ i +"].SwitchId"));
			rule.setRuleId(_ctx.longValue("ListSystemClientRulesResponse.RuleList["+ i +"].RuleId"));
			rule.setRuleName(_ctx.stringValue("ListSystemClientRulesResponse.RuleList["+ i +"].RuleName"));
			rule.setAggregationName(_ctx.stringValue("ListSystemClientRulesResponse.RuleList["+ i +"].AggregationName"));
			rule.setDescription(_ctx.stringValue("ListSystemClientRulesResponse.RuleList["+ i +"].Description"));

			List<Policy> policies = new ArrayList<Policy>();
			for (int j = 0; j < _ctx.lengthValue("ListSystemClientRulesResponse.RuleList["+ i +"].Policies.Length"); j++) {
				Policy policy = new Policy();
				policy.setPolicyName(_ctx.stringValue("ListSystemClientRulesResponse.RuleList["+ i +"].Policies["+ j +"].PolicyName"));
				policy.setPolicyKey(_ctx.stringValue("ListSystemClientRulesResponse.RuleList["+ i +"].Policies["+ j +"].PolicyKey"));

				policies.add(policy);
			}
			rule.setPolicies(policies);

			ruleList.add(rule);
		}
		listSystemClientRulesResponse.setRuleList(ruleList);
	 
	 	return listSystemClientRulesResponse;
	}
}