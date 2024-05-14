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

import com.aliyuncs.waf_openapi.model.v20190910.DescribeRulesResponse;
import com.aliyuncs.waf_openapi.model.v20190910.DescribeRulesResponse.RulesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRulesResponseUnmarshaller {

	public static DescribeRulesResponse unmarshall(DescribeRulesResponse describeRulesResponse, UnmarshallerContext _ctx) {
		
		describeRulesResponse.setRequestId(_ctx.stringValue("DescribeRulesResponse.RequestId"));
		describeRulesResponse.setRuleGroupTemplateId(_ctx.stringValue("DescribeRulesResponse.RuleGroupTemplateId"));
		describeRulesResponse.setRuleGroupName(_ctx.stringValue("DescribeRulesResponse.RuleGroupName"));
		describeRulesResponse.setTotalCount(_ctx.integerValue("DescribeRulesResponse.TotalCount"));
		describeRulesResponse.setRuleGroupTemplateName(_ctx.stringValue("DescribeRulesResponse.RuleGroupTemplateName"));
		describeRulesResponse.setIsSubscribe(_ctx.longValue("DescribeRulesResponse.IsSubscribe"));

		List<RulesItem> rules = new ArrayList<RulesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRulesResponse.Rules.Length"); i++) {
			RulesItem rulesItem = new RulesItem();
			rulesItem.setRiskLevel(_ctx.integerValue("DescribeRulesResponse.Rules["+ i +"].RiskLevel"));
			rulesItem.setUpdateTime(_ctx.longValue("DescribeRulesResponse.Rules["+ i +"].UpdateTime"));
			rulesItem.setDescription(_ctx.stringValue("DescribeRulesResponse.Rules["+ i +"].Description"));
			rulesItem.setCveUrl(_ctx.stringValue("DescribeRulesResponse.Rules["+ i +"].CveUrl"));
			rulesItem.setApplicationType(_ctx.integerValue("DescribeRulesResponse.Rules["+ i +"].ApplicationType"));
			rulesItem.setCveId(_ctx.stringValue("DescribeRulesResponse.Rules["+ i +"].CveId"));
			rulesItem.setProtectionType(_ctx.integerValue("DescribeRulesResponse.Rules["+ i +"].ProtectionType"));
			rulesItem.setRuleName(_ctx.stringValue("DescribeRulesResponse.Rules["+ i +"].RuleName"));
			rulesItem.setRuleId(_ctx.longValue("DescribeRulesResponse.Rules["+ i +"].RuleId"));

			rules.add(rulesItem);
		}
		describeRulesResponse.setRules(rules);
	 
	 	return describeRulesResponse;
	}
}