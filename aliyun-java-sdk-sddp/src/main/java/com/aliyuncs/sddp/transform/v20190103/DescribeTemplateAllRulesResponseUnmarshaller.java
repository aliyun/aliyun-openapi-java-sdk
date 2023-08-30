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

package com.aliyuncs.sddp.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sddp.model.v20190103.DescribeTemplateAllRulesResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeTemplateAllRulesResponse.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTemplateAllRulesResponseUnmarshaller {

	public static DescribeTemplateAllRulesResponse unmarshall(DescribeTemplateAllRulesResponse describeTemplateAllRulesResponse, UnmarshallerContext _ctx) {
		
		describeTemplateAllRulesResponse.setRequestId(_ctx.stringValue("DescribeTemplateAllRulesResponse.RequestId"));

		List<Rule> ruleList = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTemplateAllRulesResponse.RuleList.Length"); i++) {
			Rule rule = new Rule();
			rule.setName(_ctx.stringValue("DescribeTemplateAllRulesResponse.RuleList["+ i +"].Name"));
			rule.setId(_ctx.longValue("DescribeTemplateAllRulesResponse.RuleList["+ i +"].Id"));

			ruleList.add(rule);
		}
		describeTemplateAllRulesResponse.setRuleList(ruleList);
	 
	 	return describeTemplateAllRulesResponse;
	}
}