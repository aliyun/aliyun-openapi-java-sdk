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

package com.aliyuncs.iotcc.transform.v20210513;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iotcc.model.v20210513.ListGroupDNSServiceRulesResponse;
import com.aliyuncs.iotcc.model.v20210513.ListGroupDNSServiceRulesResponse.DNSServiceRulesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGroupDNSServiceRulesResponseUnmarshaller {

	public static ListGroupDNSServiceRulesResponse unmarshall(ListGroupDNSServiceRulesResponse listGroupDNSServiceRulesResponse, UnmarshallerContext _ctx) {
		
		listGroupDNSServiceRulesResponse.setRequestId(_ctx.stringValue("ListGroupDNSServiceRulesResponse.RequestId"));
		listGroupDNSServiceRulesResponse.setTotalCount(_ctx.integerValue("ListGroupDNSServiceRulesResponse.TotalCount"));
		listGroupDNSServiceRulesResponse.setNextToken(_ctx.stringValue("ListGroupDNSServiceRulesResponse.NextToken"));
		listGroupDNSServiceRulesResponse.setMaxResults(_ctx.integerValue("ListGroupDNSServiceRulesResponse.MaxResults"));

		List<DNSServiceRulesItem> dNSServiceRules = new ArrayList<DNSServiceRulesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListGroupDNSServiceRulesResponse.DNSServiceRules.Length"); i++) {
			DNSServiceRulesItem dNSServiceRulesItem = new DNSServiceRulesItem();
			dNSServiceRulesItem.setIoTCloudConnectorGroupId(_ctx.stringValue("ListGroupDNSServiceRulesResponse.DNSServiceRules["+ i +"].IoTCloudConnectorGroupId"));
			dNSServiceRulesItem.setDNSServiceRuleStatus(_ctx.stringValue("ListGroupDNSServiceRulesResponse.DNSServiceRules["+ i +"].DNSServiceRuleStatus"));
			dNSServiceRulesItem.setSource(_ctx.stringValue("ListGroupDNSServiceRulesResponse.DNSServiceRules["+ i +"].Source"));
			dNSServiceRulesItem.setServiceType(_ctx.stringValue("ListGroupDNSServiceRulesResponse.DNSServiceRules["+ i +"].ServiceType"));
			dNSServiceRulesItem.setDestination(_ctx.stringValue("ListGroupDNSServiceRulesResponse.DNSServiceRules["+ i +"].Destination"));
			dNSServiceRulesItem.setDNSServiceRuleName(_ctx.stringValue("ListGroupDNSServiceRulesResponse.DNSServiceRules["+ i +"].DNSServiceRuleName"));
			dNSServiceRulesItem.setDNSServiceRuleDescription(_ctx.stringValue("ListGroupDNSServiceRulesResponse.DNSServiceRules["+ i +"].DNSServiceRuleDescription"));
			dNSServiceRulesItem.setDNSServiceRuleId(_ctx.stringValue("ListGroupDNSServiceRulesResponse.DNSServiceRules["+ i +"].DNSServiceRuleId"));

			dNSServiceRules.add(dNSServiceRulesItem);
		}
		listGroupDNSServiceRulesResponse.setDNSServiceRules(dNSServiceRules);
	 
	 	return listGroupDNSServiceRulesResponse;
	}
}