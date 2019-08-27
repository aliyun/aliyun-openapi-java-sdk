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

package com.aliyuncs.slb.transform.v20140515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.slb.model.v20140515.CreateRulesResponse;
import com.aliyuncs.slb.model.v20140515.CreateRulesResponse.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRulesResponseUnmarshaller {

	public static CreateRulesResponse unmarshall(CreateRulesResponse createRulesResponse, UnmarshallerContext _ctx) {
		
		createRulesResponse.setRequestId(_ctx.stringValue("CreateRulesResponse.RequestId"));

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("CreateRulesResponse.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleId(_ctx.stringValue("CreateRulesResponse.Rules["+ i +"].RuleId"));
			rule.setRuleName(_ctx.stringValue("CreateRulesResponse.Rules["+ i +"].RuleName"));

			rules.add(rule);
		}
		createRulesResponse.setRules(rules);
	 
	 	return createRulesResponse;
	}
}