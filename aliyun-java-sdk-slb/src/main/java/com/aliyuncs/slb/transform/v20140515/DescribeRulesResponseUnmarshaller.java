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

import com.aliyuncs.slb.model.v20140515.DescribeRulesResponse;
import com.aliyuncs.slb.model.v20140515.DescribeRulesResponse.Rule;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRulesResponseUnmarshaller {

	public static DescribeRulesResponse unmarshall(DescribeRulesResponse describeRulesResponse, UnmarshallerContext context) {
		
		describeRulesResponse.setRequestId(context.stringValue("DescribeRulesResponse.RequestId"));

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < context.lengthValue("DescribeRulesResponse.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleId(context.stringValue("DescribeRulesResponse.Rules["+ i +"].RuleId"));
			rule.setRuleName(context.stringValue("DescribeRulesResponse.Rules["+ i +"].RuleName"));
			rule.setDomain(context.stringValue("DescribeRulesResponse.Rules["+ i +"].Domain"));
			rule.setUrl(context.stringValue("DescribeRulesResponse.Rules["+ i +"].Url"));
			rule.setVServerGroupId(context.stringValue("DescribeRulesResponse.Rules["+ i +"].VServerGroupId"));
			rule.setListenerSync(context.stringValue("DescribeRulesResponse.Rules["+ i +"].ListenerSync"));
			rule.setScheduler(context.stringValue("DescribeRulesResponse.Rules["+ i +"].Scheduler"));
			rule.setStickySession(context.stringValue("DescribeRulesResponse.Rules["+ i +"].StickySession"));
			rule.setStickySessionType(context.stringValue("DescribeRulesResponse.Rules["+ i +"].StickySessionType"));
			rule.setCookieTimeout(context.integerValue("DescribeRulesResponse.Rules["+ i +"].CookieTimeout"));
			rule.setCookie(context.stringValue("DescribeRulesResponse.Rules["+ i +"].Cookie"));
			rule.setHealthCheck(context.stringValue("DescribeRulesResponse.Rules["+ i +"].HealthCheck"));
			rule.setHealthCheckDomain(context.stringValue("DescribeRulesResponse.Rules["+ i +"].HealthCheckDomain"));
			rule.setHealthCheckURI(context.stringValue("DescribeRulesResponse.Rules["+ i +"].HealthCheckURI"));
			rule.setHealthyThreshold(context.integerValue("DescribeRulesResponse.Rules["+ i +"].HealthyThreshold"));
			rule.setUnhealthyThreshold(context.integerValue("DescribeRulesResponse.Rules["+ i +"].UnhealthyThreshold"));
			rule.setHealthCheckTimeout(context.integerValue("DescribeRulesResponse.Rules["+ i +"].HealthCheckTimeout"));
			rule.setHealthCheckInterval(context.integerValue("DescribeRulesResponse.Rules["+ i +"].HealthCheckInterval"));
			rule.setHealthCheckConnectPort(context.integerValue("DescribeRulesResponse.Rules["+ i +"].HealthCheckConnectPort"));
			rule.setHealthCheckHttpCode(context.stringValue("DescribeRulesResponse.Rules["+ i +"].HealthCheckHttpCode"));

			rules.add(rule);
		}
		describeRulesResponse.setRules(rules);
	 
	 	return describeRulesResponse;
	}
}