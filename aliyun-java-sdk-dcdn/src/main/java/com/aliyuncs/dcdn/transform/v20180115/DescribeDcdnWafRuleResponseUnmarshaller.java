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

package com.aliyuncs.dcdn.transform.v20180115;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnWafRuleResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnWafRuleResponse.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnWafRuleResponseUnmarshaller {

	public static DescribeDcdnWafRuleResponse unmarshall(DescribeDcdnWafRuleResponse describeDcdnWafRuleResponse, UnmarshallerContext _ctx) {
		
		describeDcdnWafRuleResponse.setRequestId(_ctx.stringValue("DescribeDcdnWafRuleResponse.RequestId"));

		Rule rule = new Rule();
		rule.setRuleStatus(_ctx.stringValue("DescribeDcdnWafRuleResponse.Rule.RuleStatus"));
		rule.setDefenseScene(_ctx.stringValue("DescribeDcdnWafRuleResponse.Rule.DefenseScene"));
		rule.setPolicyId(_ctx.longValue("DescribeDcdnWafRuleResponse.Rule.PolicyId"));
		rule.setGmtModified(_ctx.stringValue("DescribeDcdnWafRuleResponse.Rule.GmtModified"));
		rule.setRuleId(_ctx.longValue("DescribeDcdnWafRuleResponse.Rule.RuleId"));
		rule.setRuleName(_ctx.stringValue("DescribeDcdnWafRuleResponse.Rule.RuleName"));
		rule.setRuleConfig(_ctx.stringValue("DescribeDcdnWafRuleResponse.Rule.RuleConfig"));
		describeDcdnWafRuleResponse.setRule(rule);
	 
	 	return describeDcdnWafRuleResponse;
	}
}