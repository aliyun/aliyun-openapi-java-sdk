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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeWebPreciseAccessRuleResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeWebPreciseAccessRuleResponse.PreciseAccessConfig;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeWebPreciseAccessRuleResponse.PreciseAccessConfig.Rule;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeWebPreciseAccessRuleResponse.PreciseAccessConfig.Rule.Condition;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWebPreciseAccessRuleResponseUnmarshaller {

	public static DescribeWebPreciseAccessRuleResponse unmarshall(DescribeWebPreciseAccessRuleResponse describeWebPreciseAccessRuleResponse, UnmarshallerContext _ctx) {
		
		describeWebPreciseAccessRuleResponse.setRequestId(_ctx.stringValue("DescribeWebPreciseAccessRuleResponse.RequestId"));

		List<PreciseAccessConfig> preciseAccessConfigList = new ArrayList<PreciseAccessConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWebPreciseAccessRuleResponse.PreciseAccessConfigList.Length"); i++) {
			PreciseAccessConfig preciseAccessConfig = new PreciseAccessConfig();
			preciseAccessConfig.setDomain(_ctx.stringValue("DescribeWebPreciseAccessRuleResponse.PreciseAccessConfigList["+ i +"].Domain"));

			List<Rule> ruleList = new ArrayList<Rule>();
			for (int j = 0; j < _ctx.lengthValue("DescribeWebPreciseAccessRuleResponse.PreciseAccessConfigList["+ i +"].RuleList.Length"); j++) {
				Rule rule = new Rule();
				rule.setOwner(_ctx.stringValue("DescribeWebPreciseAccessRuleResponse.PreciseAccessConfigList["+ i +"].RuleList["+ j +"].Owner"));
				rule.setExpires(_ctx.longValue("DescribeWebPreciseAccessRuleResponse.PreciseAccessConfigList["+ i +"].RuleList["+ j +"].Expires"));
				rule.setName(_ctx.stringValue("DescribeWebPreciseAccessRuleResponse.PreciseAccessConfigList["+ i +"].RuleList["+ j +"].Name"));
				rule.setAction(_ctx.stringValue("DescribeWebPreciseAccessRuleResponse.PreciseAccessConfigList["+ i +"].RuleList["+ j +"].Action"));

				List<Condition> conditionList = new ArrayList<Condition>();
				for (int k = 0; k < _ctx.lengthValue("DescribeWebPreciseAccessRuleResponse.PreciseAccessConfigList["+ i +"].RuleList["+ j +"].ConditionList.Length"); k++) {
					Condition condition = new Condition();
					condition.setMatchMethod(_ctx.stringValue("DescribeWebPreciseAccessRuleResponse.PreciseAccessConfigList["+ i +"].RuleList["+ j +"].ConditionList["+ k +"].MatchMethod"));
					condition.setField(_ctx.stringValue("DescribeWebPreciseAccessRuleResponse.PreciseAccessConfigList["+ i +"].RuleList["+ j +"].ConditionList["+ k +"].Field"));
					condition.setHeaderName(_ctx.stringValue("DescribeWebPreciseAccessRuleResponse.PreciseAccessConfigList["+ i +"].RuleList["+ j +"].ConditionList["+ k +"].HeaderName"));
					condition.setContent(_ctx.stringValue("DescribeWebPreciseAccessRuleResponse.PreciseAccessConfigList["+ i +"].RuleList["+ j +"].ConditionList["+ k +"].Content"));

					conditionList.add(condition);
				}
				rule.setConditionList(conditionList);

				ruleList.add(rule);
			}
			preciseAccessConfig.setRuleList(ruleList);

			preciseAccessConfigList.add(preciseAccessConfig);
		}
		describeWebPreciseAccessRuleResponse.setPreciseAccessConfigList(preciseAccessConfigList);
	 
	 	return describeWebPreciseAccessRuleResponse;
	}
}