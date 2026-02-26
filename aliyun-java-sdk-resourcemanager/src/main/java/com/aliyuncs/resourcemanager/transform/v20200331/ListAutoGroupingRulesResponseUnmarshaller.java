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

package com.aliyuncs.resourcemanager.transform.v20200331;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.resourcemanager.model.v20200331.ListAutoGroupingRulesResponse;
import com.aliyuncs.resourcemanager.model.v20200331.ListAutoGroupingRulesResponse.Rule;
import com.aliyuncs.resourcemanager.model.v20200331.ListAutoGroupingRulesResponse.Rule.RuleContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAutoGroupingRulesResponseUnmarshaller {

	public static ListAutoGroupingRulesResponse unmarshall(ListAutoGroupingRulesResponse listAutoGroupingRulesResponse, UnmarshallerContext _ctx) {
		
		listAutoGroupingRulesResponse.setRequestId(_ctx.stringValue("ListAutoGroupingRulesResponse.RequestId"));
		listAutoGroupingRulesResponse.setNextToken(_ctx.stringValue("ListAutoGroupingRulesResponse.NextToken"));
		listAutoGroupingRulesResponse.setMaxResults(_ctx.integerValue("ListAutoGroupingRulesResponse.MaxResults"));

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("ListAutoGroupingRulesResponse.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setCreateTime(_ctx.stringValue("ListAutoGroupingRulesResponse.Rules["+ i +"].CreateTime"));
			rule.setExcludeRegionIdsScope(_ctx.stringValue("ListAutoGroupingRulesResponse.Rules["+ i +"].ExcludeRegionIdsScope"));
			rule.setExcludeResourceGroupIdsScope(_ctx.stringValue("ListAutoGroupingRulesResponse.Rules["+ i +"].ExcludeResourceGroupIdsScope"));
			rule.setExcludeResourceIdsScope(_ctx.stringValue("ListAutoGroupingRulesResponse.Rules["+ i +"].ExcludeResourceIdsScope"));
			rule.setExcludeResourceTypesScope(_ctx.stringValue("ListAutoGroupingRulesResponse.Rules["+ i +"].ExcludeResourceTypesScope"));
			rule.setModifyTime(_ctx.stringValue("ListAutoGroupingRulesResponse.Rules["+ i +"].ModifyTime"));
			rule.setRegionIdsScope(_ctx.stringValue("ListAutoGroupingRulesResponse.Rules["+ i +"].RegionIdsScope"));
			rule.setResourceGroupIdsScope(_ctx.stringValue("ListAutoGroupingRulesResponse.Rules["+ i +"].ResourceGroupIdsScope"));
			rule.setResourceIdsScope(_ctx.stringValue("ListAutoGroupingRulesResponse.Rules["+ i +"].ResourceIdsScope"));
			rule.setResourceTypesScope(_ctx.stringValue("ListAutoGroupingRulesResponse.Rules["+ i +"].ResourceTypesScope"));
			rule.setRuleDesc(_ctx.stringValue("ListAutoGroupingRulesResponse.Rules["+ i +"].RuleDesc"));
			rule.setRuleId(_ctx.stringValue("ListAutoGroupingRulesResponse.Rules["+ i +"].RuleId"));
			rule.setRuleName(_ctx.stringValue("ListAutoGroupingRulesResponse.Rules["+ i +"].RuleName"));
			rule.setRuleType(_ctx.stringValue("ListAutoGroupingRulesResponse.Rules["+ i +"].RuleType"));

			List<RuleContent> ruleContents = new ArrayList<RuleContent>();
			for (int j = 0; j < _ctx.lengthValue("ListAutoGroupingRulesResponse.Rules["+ i +"].RuleContents.Length"); j++) {
				RuleContent ruleContent = new RuleContent();
				ruleContent.setAutoGroupingScopeCondition(_ctx.stringValue("ListAutoGroupingRulesResponse.Rules["+ i +"].RuleContents["+ j +"].AutoGroupingScopeCondition"));
				ruleContent.setRuleContentId(_ctx.stringValue("ListAutoGroupingRulesResponse.Rules["+ i +"].RuleContents["+ j +"].RuleContentId"));
				ruleContent.setTargetResourceGroupCondition(_ctx.stringValue("ListAutoGroupingRulesResponse.Rules["+ i +"].RuleContents["+ j +"].TargetResourceGroupCondition"));

				ruleContents.add(ruleContent);
			}
			rule.setRuleContents(ruleContents);

			rules.add(rule);
		}
		listAutoGroupingRulesResponse.setRules(rules);
	 
	 	return listAutoGroupingRulesResponse;
	}
}