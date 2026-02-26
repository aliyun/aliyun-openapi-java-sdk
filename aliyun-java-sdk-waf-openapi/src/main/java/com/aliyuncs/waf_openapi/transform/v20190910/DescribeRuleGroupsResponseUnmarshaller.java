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

package com.aliyuncs.waf_openapi.transform.v20190910;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.waf_openapi.model.v20190910.DescribeRuleGroupsResponse;
import com.aliyuncs.waf_openapi.model.v20190910.DescribeRuleGroupsResponse.RuleGroupsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRuleGroupsResponseUnmarshaller {

	public static DescribeRuleGroupsResponse unmarshall(DescribeRuleGroupsResponse describeRuleGroupsResponse, UnmarshallerContext _ctx) {
		
		describeRuleGroupsResponse.setRequestId(_ctx.stringValue("DescribeRuleGroupsResponse.RequestId"));
		describeRuleGroupsResponse.setTaskStatus(_ctx.integerValue("DescribeRuleGroupsResponse.TaskStatus"));
		describeRuleGroupsResponse.setTotal(_ctx.integerValue("DescribeRuleGroupsResponse.Total"));
		describeRuleGroupsResponse.setWafTaskId(_ctx.stringValue("DescribeRuleGroupsResponse.WafTaskId"));

		List<RuleGroupsItem> ruleGroups = new ArrayList<RuleGroupsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRuleGroupsResponse.RuleGroups.Length"); i++) {
			RuleGroupsItem ruleGroupsItem = new RuleGroupsItem();
			ruleGroupsItem.setType(_ctx.integerValue("DescribeRuleGroupsResponse.RuleGroups["+ i +"].Type"));
			ruleGroupsItem.setRuleCnt(_ctx.integerValue("DescribeRuleGroupsResponse.RuleGroups["+ i +"].RuleCnt"));
			ruleGroupsItem.setRuleGroupUpdateTime(_ctx.longValue("DescribeRuleGroupsResponse.RuleGroups["+ i +"].RuleGroupUpdateTime"));
			ruleGroupsItem.setPolicyId(_ctx.longValue("DescribeRuleGroupsResponse.RuleGroups["+ i +"].PolicyId"));
			ruleGroupsItem.setName(_ctx.stringValue("DescribeRuleGroupsResponse.RuleGroups["+ i +"].Name"));
			ruleGroupsItem.setTemplatePolicyId(_ctx.longValue("DescribeRuleGroupsResponse.RuleGroups["+ i +"].TemplatePolicyId"));
			ruleGroupsItem.setRuleGroupTemplateName(_ctx.stringValue("DescribeRuleGroupsResponse.RuleGroups["+ i +"].RuleGroupTemplateName"));
			ruleGroupsItem.setDesc(_ctx.stringValue("DescribeRuleGroupsResponse.RuleGroups["+ i +"].Desc"));
			ruleGroupsItem.setWafVersion(_ctx.longValue("DescribeRuleGroupsResponse.RuleGroups["+ i +"].WafVersion"));

			List<String> domainList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRuleGroupsResponse.RuleGroups["+ i +"].DomainList.Length"); j++) {
				domainList.add(_ctx.stringValue("DescribeRuleGroupsResponse.RuleGroups["+ i +"].DomainList["+ j +"]"));
			}
			ruleGroupsItem.setDomainList(domainList);

			ruleGroups.add(ruleGroupsItem);
		}
		describeRuleGroupsResponse.setRuleGroups(ruleGroups);
	 
	 	return describeRuleGroupsResponse;
	}
}