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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnWafRulesResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnWafRulesResponse.RuleItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnWafRulesResponseUnmarshaller {

	public static DescribeDcdnWafRulesResponse unmarshall(DescribeDcdnWafRulesResponse describeDcdnWafRulesResponse, UnmarshallerContext _ctx) {
		
		describeDcdnWafRulesResponse.setRequestId(_ctx.stringValue("DescribeDcdnWafRulesResponse.RequestId"));
		describeDcdnWafRulesResponse.setPageSize(_ctx.integerValue("DescribeDcdnWafRulesResponse.PageSize"));
		describeDcdnWafRulesResponse.setPageNumber(_ctx.integerValue("DescribeDcdnWafRulesResponse.PageNumber"));
		describeDcdnWafRulesResponse.setTotalCount(_ctx.integerValue("DescribeDcdnWafRulesResponse.TotalCount"));

		List<RuleItem> rules = new ArrayList<RuleItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnWafRulesResponse.Rules.Length"); i++) {
			RuleItem ruleItem = new RuleItem();
			ruleItem.setRuleStatus(_ctx.stringValue("DescribeDcdnWafRulesResponse.Rules["+ i +"].RuleStatus"));
			ruleItem.setDefenseScene(_ctx.stringValue("DescribeDcdnWafRulesResponse.Rules["+ i +"].DefenseScene"));
			ruleItem.setPolicyId(_ctx.longValue("DescribeDcdnWafRulesResponse.Rules["+ i +"].PolicyId"));
			ruleItem.setGmtModified(_ctx.stringValue("DescribeDcdnWafRulesResponse.Rules["+ i +"].GmtModified"));
			ruleItem.setRuleId(_ctx.longValue("DescribeDcdnWafRulesResponse.Rules["+ i +"].RuleId"));
			ruleItem.setRuleName(_ctx.stringValue("DescribeDcdnWafRulesResponse.Rules["+ i +"].RuleName"));
			ruleItem.setRuleConfig(_ctx.stringValue("DescribeDcdnWafRulesResponse.Rules["+ i +"].RuleConfig"));

			rules.add(ruleItem);
		}
		describeDcdnWafRulesResponse.setRules(rules);
	 
	 	return describeDcdnWafRulesResponse;
	}
}