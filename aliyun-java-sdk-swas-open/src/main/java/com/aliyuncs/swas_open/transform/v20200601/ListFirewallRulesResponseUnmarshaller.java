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
import com.aliyuncs.swas_open.model.v20200601.ListFirewallRulesResponse.FirewallRulesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFirewallRulesResponseUnmarshaller {

	public static ListFirewallRulesResponse unmarshall(ListFirewallRulesResponse listFirewallRulesResponse, UnmarshallerContext _ctx) {
		
		listFirewallRulesResponse.setRequestId(_ctx.stringValue("ListFirewallRulesResponse.RequestId"));
		listFirewallRulesResponse.setPageNumber(_ctx.integerValue("ListFirewallRulesResponse.PageNumber"));
		listFirewallRulesResponse.setPageSize(_ctx.integerValue("ListFirewallRulesResponse.PageSize"));
		listFirewallRulesResponse.setTotalCount(_ctx.integerValue("ListFirewallRulesResponse.TotalCount"));

		List<FirewallRulesItem> firewallRules = new ArrayList<FirewallRulesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFirewallRulesResponse.FirewallRules.Length"); i++) {
			FirewallRulesItem firewallRulesItem = new FirewallRulesItem();
			firewallRulesItem.setRuleId(_ctx.stringValue("ListFirewallRulesResponse.FirewallRules["+ i +"].RuleId"));
			firewallRulesItem.setRuleProtocol(_ctx.stringValue("ListFirewallRulesResponse.FirewallRules["+ i +"].RuleProtocol"));
			firewallRulesItem.setPort(_ctx.stringValue("ListFirewallRulesResponse.FirewallRules["+ i +"].Port"));

			firewallRules.add(firewallRulesItem);
		}
		listFirewallRulesResponse.setFirewallRules(firewallRules);
	 
	 	return listFirewallRulesResponse;
	}
}