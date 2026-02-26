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

import com.aliyuncs.resourcemanager.model.v20200331.GetAutoGroupingRuleResponse;
import com.aliyuncs.resourcemanager.model.v20200331.GetAutoGroupingRuleResponse.Rule;
import com.aliyuncs.resourcemanager.model.v20200331.GetAutoGroupingRuleResponse.Rule.RuleContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAutoGroupingRuleResponseUnmarshaller {

	public static GetAutoGroupingRuleResponse unmarshall(GetAutoGroupingRuleResponse getAutoGroupingRuleResponse, UnmarshallerContext _ctx) {
		
		getAutoGroupingRuleResponse.setRequestId(_ctx.stringValue("GetAutoGroupingRuleResponse.RequestId"));

		Rule rule = new Rule();
		rule.setCreateTime(_ctx.stringValue("GetAutoGroupingRuleResponse.Rule.CreateTime"));
		rule.setExcludeRegionIdsScope(_ctx.stringValue("GetAutoGroupingRuleResponse.Rule.ExcludeRegionIdsScope"));
		rule.setExcludeResourceGroupIdsScope(_ctx.stringValue("GetAutoGroupingRuleResponse.Rule.ExcludeResourceGroupIdsScope"));
		rule.setExcludeResourceIdsScope(_ctx.stringValue("GetAutoGroupingRuleResponse.Rule.ExcludeResourceIdsScope"));
		rule.setExcludeResourceTypesScope(_ctx.stringValue("GetAutoGroupingRuleResponse.Rule.ExcludeResourceTypesScope"));
		rule.setModifyTime(_ctx.stringValue("GetAutoGroupingRuleResponse.Rule.ModifyTime"));
		rule.setRegionIdsScope(_ctx.stringValue("GetAutoGroupingRuleResponse.Rule.RegionIdsScope"));
		rule.setResourceGroupIdsScope(_ctx.stringValue("GetAutoGroupingRuleResponse.Rule.ResourceGroupIdsScope"));
		rule.setResourceIdsScope(_ctx.stringValue("GetAutoGroupingRuleResponse.Rule.ResourceIdsScope"));
		rule.setResourceTypesScope(_ctx.stringValue("GetAutoGroupingRuleResponse.Rule.ResourceTypesScope"));
		rule.setRuleDesc(_ctx.stringValue("GetAutoGroupingRuleResponse.Rule.RuleDesc"));
		rule.setRuleId(_ctx.stringValue("GetAutoGroupingRuleResponse.Rule.RuleId"));
		rule.setRuleName(_ctx.stringValue("GetAutoGroupingRuleResponse.Rule.RuleName"));
		rule.setRuleType(_ctx.stringValue("GetAutoGroupingRuleResponse.Rule.RuleType"));

		List<RuleContent> ruleContents = new ArrayList<RuleContent>();
		for (int i = 0; i < _ctx.lengthValue("GetAutoGroupingRuleResponse.Rule.RuleContents.Length"); i++) {
			RuleContent ruleContent = new RuleContent();
			ruleContent.setAutoGroupingScopeCondition(_ctx.stringValue("GetAutoGroupingRuleResponse.Rule.RuleContents["+ i +"].AutoGroupingScopeCondition"));
			ruleContent.setRuleContentId(_ctx.stringValue("GetAutoGroupingRuleResponse.Rule.RuleContents["+ i +"].RuleContentId"));
			ruleContent.setTargetResourceGroupCondition(_ctx.stringValue("GetAutoGroupingRuleResponse.Rule.RuleContents["+ i +"].TargetResourceGroupCondition"));

			ruleContents.add(ruleContent);
		}
		rule.setRuleContents(ruleContents);
		getAutoGroupingRuleResponse.setRule(rule);
	 
	 	return getAutoGroupingRuleResponse;
	}
}