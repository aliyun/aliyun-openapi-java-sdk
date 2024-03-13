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

import com.aliyuncs.swas_open.model.v20200601.ListFirewallRulesResponse;
import com.aliyuncs.swas_open.model.v20200601.ListFirewallRulesResponse.FirewallRule;
import com.aliyuncs.swas_open.model.v20200601.ListFirewallRulesResponse.FirewallRule.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFirewallRulesResponseUnmarshaller {

	public static ListFirewallRulesResponse unmarshall(ListFirewallRulesResponse listFirewallRulesResponse, UnmarshallerContext _ctx) {
		
		listFirewallRulesResponse.setRequestId(_ctx.stringValue("ListFirewallRulesResponse.RequestId"));
		listFirewallRulesResponse.setTotalCount(_ctx.integerValue("ListFirewallRulesResponse.TotalCount"));
		listFirewallRulesResponse.setPageSize(_ctx.integerValue("ListFirewallRulesResponse.PageSize"));
		listFirewallRulesResponse.setPageNumber(_ctx.integerValue("ListFirewallRulesResponse.PageNumber"));

		List<FirewallRule> firewallRules = new ArrayList<FirewallRule>();
		for (int i = 0; i < _ctx.lengthValue("ListFirewallRulesResponse.FirewallRules.Length"); i++) {
			FirewallRule firewallRule = new FirewallRule();
			firewallRule.setRemark(_ctx.stringValue("ListFirewallRulesResponse.FirewallRules["+ i +"].Remark"));
			firewallRule.setPort(_ctx.stringValue("ListFirewallRulesResponse.FirewallRules["+ i +"].Port"));
			firewallRule.setRuleId(_ctx.stringValue("ListFirewallRulesResponse.FirewallRules["+ i +"].RuleId"));
			firewallRule.setRuleProtocol(_ctx.stringValue("ListFirewallRulesResponse.FirewallRules["+ i +"].RuleProtocol"));
			firewallRule.setPolicy(_ctx.stringValue("ListFirewallRulesResponse.FirewallRules["+ i +"].Policy"));
			firewallRule.setSourceCidrIp(_ctx.stringValue("ListFirewallRulesResponse.FirewallRules["+ i +"].SourceCidrIp"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListFirewallRulesResponse.FirewallRules["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("ListFirewallRulesResponse.FirewallRules["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("ListFirewallRulesResponse.FirewallRules["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			firewallRule.setTags(tags);

			firewallRules.add(firewallRule);
		}
		listFirewallRulesResponse.setFirewallRules(firewallRules);
	 
	 	return listFirewallRulesResponse;
	}
}