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

package com.aliyuncs.swas_open.transform.v20200601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas_open.model.v20200601.CreateFirewallTemplateRulesResponse;
import com.aliyuncs.swas_open.model.v20200601.CreateFirewallTemplateRulesResponse.FirewallTemplateRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateFirewallTemplateRulesResponseUnmarshaller {

	public static CreateFirewallTemplateRulesResponse unmarshall(CreateFirewallTemplateRulesResponse createFirewallTemplateRulesResponse, UnmarshallerContext _ctx) {
		
		createFirewallTemplateRulesResponse.setRequestId(_ctx.stringValue("CreateFirewallTemplateRulesResponse.RequestId"));

		List<FirewallTemplateRule> firewallTemplateRules = new ArrayList<FirewallTemplateRule>();
		for (int i = 0; i < _ctx.lengthValue("CreateFirewallTemplateRulesResponse.FirewallTemplateRules.Length"); i++) {
			FirewallTemplateRule firewallTemplateRule = new FirewallTemplateRule();
			firewallTemplateRule.setFirewallTemplateRuleId(_ctx.stringValue("CreateFirewallTemplateRulesResponse.FirewallTemplateRules["+ i +"].FirewallTemplateRuleId"));
			firewallTemplateRule.setRuleProtocol(_ctx.stringValue("CreateFirewallTemplateRulesResponse.FirewallTemplateRules["+ i +"].RuleProtocol"));
			firewallTemplateRule.setPort(_ctx.stringValue("CreateFirewallTemplateRulesResponse.FirewallTemplateRules["+ i +"].Port"));
			firewallTemplateRule.setSourceCidrIp(_ctx.stringValue("CreateFirewallTemplateRulesResponse.FirewallTemplateRules["+ i +"].SourceCidrIp"));
			firewallTemplateRule.setRemark(_ctx.stringValue("CreateFirewallTemplateRulesResponse.FirewallTemplateRules["+ i +"].Remark"));

			firewallTemplateRules.add(firewallTemplateRule);
		}
		createFirewallTemplateRulesResponse.setFirewallTemplateRules(firewallTemplateRules);
	 
	 	return createFirewallTemplateRulesResponse;
	}
}