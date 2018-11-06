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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeRuleListResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeRuleListResponse.PageInfo;
import com.aliyuncs.aegis.model.v20161111.DescribeRuleListResponse.RulesItem;
import com.aliyuncs.aegis.model.v20161111.DescribeRuleListResponse.RulesItem.RuleGroup;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRuleListResponseUnmarshaller {

	public static DescribeRuleListResponse unmarshall(DescribeRuleListResponse describeRuleListResponse, UnmarshallerContext context) {
		
		describeRuleListResponse.setRequestId(context.stringValue("DescribeRuleListResponse.RequestId"));
		describeRuleListResponse.setSuccess(context.booleanValue("DescribeRuleListResponse.Success"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setPageSize(context.integerValue("DescribeRuleListResponse.PageInfo.PageSize"));
		pageInfo.setCurrentPage(context.integerValue("DescribeRuleListResponse.PageInfo.CurrentPage"));
		pageInfo.setTotalCount(context.integerValue("DescribeRuleListResponse.PageInfo.TotalCount"));
		describeRuleListResponse.setPageInfo(pageInfo);

		List<RulesItem> rules = new ArrayList<RulesItem>();
		for (int i = 0; i < context.lengthValue("DescribeRuleListResponse.Rules.Length"); i++) {
			RulesItem rulesItem = new RulesItem();
			rulesItem.setWarnLevel(context.stringValue("DescribeRuleListResponse.Rules["+ i +"].WarnLevel"));
			rulesItem.setModified(context.longValue("DescribeRuleListResponse.Rules["+ i +"].Modified"));
			rulesItem.setCreate(context.longValue("DescribeRuleListResponse.Rules["+ i +"].Create"));
			rulesItem.setRuleName(context.stringValue("DescribeRuleListResponse.Rules["+ i +"].RuleName"));
			rulesItem.setDescription(context.stringValue("DescribeRuleListResponse.Rules["+ i +"].Description"));
			rulesItem.setId(context.integerValue("DescribeRuleListResponse.Rules["+ i +"].Id"));
			rulesItem.setDataSourceId(context.integerValue("DescribeRuleListResponse.Rules["+ i +"].DataSourceId"));
			rulesItem.setExpressions(context.stringValue("DescribeRuleListResponse.Rules["+ i +"].Expressions"));

			List<RuleGroup> ruleGroups = new ArrayList<RuleGroup>();
			for (int j = 0; j < context.lengthValue("DescribeRuleListResponse.Rules["+ i +"].RuleGroups.Length"); j++) {
				RuleGroup ruleGroup = new RuleGroup();
				ruleGroup.setGroupName(context.stringValue("DescribeRuleListResponse.Rules["+ i +"].RuleGroups["+ j +"].GroupName"));
				ruleGroup.setRuleNum(context.integerValue("DescribeRuleListResponse.Rules["+ i +"].RuleGroups["+ j +"].RuleNum"));
				ruleGroup.setModified(context.longValue("DescribeRuleListResponse.Rules["+ i +"].RuleGroups["+ j +"].Modified"));
				ruleGroup.setCreate(context.longValue("DescribeRuleListResponse.Rules["+ i +"].RuleGroups["+ j +"].Create"));
				ruleGroup.setDescription(context.stringValue("DescribeRuleListResponse.Rules["+ i +"].RuleGroups["+ j +"].Description"));
				ruleGroup.setId(context.integerValue("DescribeRuleListResponse.Rules["+ i +"].RuleGroups["+ j +"].Id"));
				ruleGroup.setAliUid(context.integerValue("DescribeRuleListResponse.Rules["+ i +"].RuleGroups["+ j +"].AliUid"));

				ruleGroups.add(ruleGroup);
			}
			rulesItem.setRuleGroups(ruleGroups);

			rules.add(rulesItem);
		}
		describeRuleListResponse.setRules(rules);
	 
	 	return describeRuleListResponse;
	}
}