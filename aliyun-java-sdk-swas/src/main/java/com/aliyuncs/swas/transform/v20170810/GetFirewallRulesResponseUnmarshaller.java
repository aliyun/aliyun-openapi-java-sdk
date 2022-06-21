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

package com.aliyuncs.swas.transform.v20170810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas.model.v20170810.GetFirewallRulesResponse;
import com.aliyuncs.swas.model.v20170810.GetFirewallRulesResponse.FirewallRulesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFirewallRulesResponseUnmarshaller {

	public static GetFirewallRulesResponse unmarshall(GetFirewallRulesResponse getFirewallRulesResponse, UnmarshallerContext _ctx) {
		
		getFirewallRulesResponse.setRequestId(_ctx.stringValue("GetFirewallRulesResponse.RequestId"));
		getFirewallRulesResponse.setIsSuccess(_ctx.booleanValue("GetFirewallRulesResponse.IsSuccess"));
		getFirewallRulesResponse.setTotalCount(_ctx.integerValue("GetFirewallRulesResponse.TotalCount"));
		getFirewallRulesResponse.setPageSize(_ctx.integerValue("GetFirewallRulesResponse.PageSize"));
		getFirewallRulesResponse.setPageNo(_ctx.integerValue("GetFirewallRulesResponse.PageNo"));
		getFirewallRulesResponse.setCode(_ctx.stringValue("GetFirewallRulesResponse.Code"));

		List<FirewallRulesItem> firewallRules = new ArrayList<FirewallRulesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFirewallRulesResponse.FirewallRules.Length"); i++) {
			FirewallRulesItem firewallRulesItem = new FirewallRulesItem();
			firewallRulesItem.setFirewallRuleUid(_ctx.stringValue("GetFirewallRulesResponse.FirewallRules["+ i +"].FirewallRuleUid"));
			firewallRulesItem.setRemark(_ctx.stringValue("GetFirewallRulesResponse.FirewallRules["+ i +"].Remark"));
			firewallRulesItem.setBizProtocol(_ctx.stringValue("GetFirewallRulesResponse.FirewallRules["+ i +"].Protocol"));
			firewallRulesItem.setAppType(_ctx.stringValue("GetFirewallRulesResponse.FirewallRules["+ i +"].AppType"));
			firewallRulesItem.setPort(_ctx.stringValue("GetFirewallRulesResponse.FirewallRules["+ i +"].Port"));
			firewallRulesItem.setSourceCidrIp(_ctx.stringValue("GetFirewallRulesResponse.FirewallRules["+ i +"].SourceCidrIp"));
			firewallRulesItem.setPolicy(_ctx.stringValue("GetFirewallRulesResponse.FirewallRules["+ i +"].Policy"));

			firewallRules.add(firewallRulesItem);
		}
		getFirewallRulesResponse.setFirewallRules(firewallRules);
	 
	 	return getFirewallRulesResponse;
	}
}