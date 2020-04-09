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

import com.aliyuncs.waf_openapi.model.v20190910.DescribeProtectionModuleRulesResponse;
import com.aliyuncs.waf_openapi.model.v20190910.DescribeProtectionModuleRulesResponse.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeProtectionModuleRulesResponseUnmarshaller {

	public static DescribeProtectionModuleRulesResponse unmarshall(DescribeProtectionModuleRulesResponse describeProtectionModuleRulesResponse, UnmarshallerContext _ctx) {
		
		describeProtectionModuleRulesResponse.setRequestId(_ctx.stringValue("DescribeProtectionModuleRulesResponse.RequestId"));
		describeProtectionModuleRulesResponse.setTotalCount(_ctx.integerValue("DescribeProtectionModuleRulesResponse.TotalCount"));

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeProtectionModuleRulesResponse.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleId(_ctx.longValue("DescribeProtectionModuleRulesResponse.Rules["+ i +"].RuleId"));
			rule.setVersion(_ctx.longValue("DescribeProtectionModuleRulesResponse.Rules["+ i +"].Version"));
			rule.setContent(_ctx.stringValue("DescribeProtectionModuleRulesResponse.Rules["+ i +"].Content"));
			rule.setTime(_ctx.longValue("DescribeProtectionModuleRulesResponse.Rules["+ i +"].Time"));
			rule.setStatus(_ctx.longValue("DescribeProtectionModuleRulesResponse.Rules["+ i +"].Status"));

			rules.add(rule);
		}
		describeProtectionModuleRulesResponse.setRules(rules);
	 
	 	return describeProtectionModuleRulesResponse;
	}
}