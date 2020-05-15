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

import com.aliyuncs.waf_openapi.model.v20190910.DescribeProtectionModuleRulesByIdListResponse;
import com.aliyuncs.waf_openapi.model.v20190910.DescribeProtectionModuleRulesByIdListResponse.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeProtectionModuleRulesByIdListResponseUnmarshaller {

	public static DescribeProtectionModuleRulesByIdListResponse unmarshall(DescribeProtectionModuleRulesByIdListResponse describeProtectionModuleRulesByIdListResponse, UnmarshallerContext _ctx) {
		
		describeProtectionModuleRulesByIdListResponse.setRequestId(_ctx.stringValue("DescribeProtectionModuleRulesByIdListResponse.RequestId"));
		describeProtectionModuleRulesByIdListResponse.setTotalCount(_ctx.integerValue("DescribeProtectionModuleRulesByIdListResponse.TotalCount"));

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeProtectionModuleRulesByIdListResponse.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleId(_ctx.longValue("DescribeProtectionModuleRulesByIdListResponse.Rules["+ i +"].RuleId"));
			rule.setName(_ctx.stringValue("DescribeProtectionModuleRulesByIdListResponse.Rules["+ i +"].Name"));
			rule.setEnabled(_ctx.integerValue("DescribeProtectionModuleRulesByIdListResponse.Rules["+ i +"].Enabled"));
			rule.setVersion(_ctx.longValue("DescribeProtectionModuleRulesByIdListResponse.Rules["+ i +"].Version"));
			rule.setContent(_ctx.stringValue("DescribeProtectionModuleRulesByIdListResponse.Rules["+ i +"].Content"));
			rule.setTime(_ctx.longValue("DescribeProtectionModuleRulesByIdListResponse.Rules["+ i +"].Time"));
			rule.setStatus(_ctx.longValue("DescribeProtectionModuleRulesByIdListResponse.Rules["+ i +"].Status"));
			rule.setOrigin(_ctx.stringValue("DescribeProtectionModuleRulesByIdListResponse.Rules["+ i +"].Origin"));
			rule.setScene(_ctx.stringValue("DescribeProtectionModuleRulesByIdListResponse.Rules["+ i +"].Scene"));

			rules.add(rule);
		}
		describeProtectionModuleRulesByIdListResponse.setRules(rules);
	 
	 	return describeProtectionModuleRulesByIdListResponse;
	}
}