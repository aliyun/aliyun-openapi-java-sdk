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

import com.aliyuncs.ddoscoo.model.v20200101.DescribeSchedulerRulesResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeSchedulerRulesResponse.SchedulerRule;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeSchedulerRulesResponse.SchedulerRule.Param;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeSchedulerRulesResponse.SchedulerRule.Param.ParamData;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeSchedulerRulesResponse.SchedulerRule.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSchedulerRulesResponseUnmarshaller {

	public static DescribeSchedulerRulesResponse unmarshall(DescribeSchedulerRulesResponse describeSchedulerRulesResponse, UnmarshallerContext _ctx) {
		
		describeSchedulerRulesResponse.setRequestId(_ctx.stringValue("DescribeSchedulerRulesResponse.RequestId"));
		describeSchedulerRulesResponse.setTotalCount(_ctx.stringValue("DescribeSchedulerRulesResponse.TotalCount"));

		List<SchedulerRule> schedulerRules = new ArrayList<SchedulerRule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSchedulerRulesResponse.SchedulerRules.Length"); i++) {
			SchedulerRule schedulerRule = new SchedulerRule();
			schedulerRule.setRuleName(_ctx.stringValue("DescribeSchedulerRulesResponse.SchedulerRules["+ i +"].RuleName"));
			schedulerRule.setCname(_ctx.stringValue("DescribeSchedulerRulesResponse.SchedulerRules["+ i +"].Cname"));
			schedulerRule.setRuleType(_ctx.stringValue("DescribeSchedulerRulesResponse.SchedulerRules["+ i +"].RuleType"));

			Param param = new Param();
			param.setParamType(_ctx.stringValue("DescribeSchedulerRulesResponse.SchedulerRules["+ i +"].Param.ParamType"));

			ParamData paramData = new ParamData();
			paramData.setCloudInstanceId(_ctx.stringValue("DescribeSchedulerRulesResponse.SchedulerRules["+ i +"].Param.ParamData.CloudInstanceId"));
			param.setParamData(paramData);
			schedulerRule.setParam(param);

			List<Rule> rules = new ArrayList<Rule>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSchedulerRulesResponse.SchedulerRules["+ i +"].Rules.Length"); j++) {
				Rule rule = new Rule();
				rule.setType(_ctx.stringValue("DescribeSchedulerRulesResponse.SchedulerRules["+ i +"].Rules["+ j +"].Type"));
				rule.setValue(_ctx.stringValue("DescribeSchedulerRulesResponse.SchedulerRules["+ i +"].Rules["+ j +"].Value"));
				rule.setValueType(_ctx.integerValue("DescribeSchedulerRulesResponse.SchedulerRules["+ i +"].Rules["+ j +"].ValueType"));
				rule.setPriority(_ctx.integerValue("DescribeSchedulerRulesResponse.SchedulerRules["+ i +"].Rules["+ j +"].Priority"));
				rule.setStatus(_ctx.integerValue("DescribeSchedulerRulesResponse.SchedulerRules["+ i +"].Rules["+ j +"].Status"));
				rule.setRegionId(_ctx.stringValue("DescribeSchedulerRulesResponse.SchedulerRules["+ i +"].Rules["+ j +"].RegionId"));
				rule.setRestoreDelay(_ctx.integerValue("DescribeSchedulerRulesResponse.SchedulerRules["+ i +"].Rules["+ j +"].RestoreDelay"));

				rules.add(rule);
			}
			schedulerRule.setRules(rules);

			schedulerRules.add(schedulerRule);
		}
		describeSchedulerRulesResponse.setSchedulerRules(schedulerRules);
	 
	 	return describeSchedulerRulesResponse;
	}
}