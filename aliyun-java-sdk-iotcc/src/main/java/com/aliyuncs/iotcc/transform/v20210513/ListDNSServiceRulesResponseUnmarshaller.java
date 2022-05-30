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

import com.aliyuncs.iotcc.model.v20210513.ListDNSServiceRulesResponse;
import com.aliyuncs.iotcc.model.v20210513.ListDNSServiceRulesResponse.DnsServiceRuleModels;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDNSServiceRulesResponseUnmarshaller {

	public static ListDNSServiceRulesResponse unmarshall(ListDNSServiceRulesResponse listDNSServiceRulesResponse, UnmarshallerContext _ctx) {
		
		listDNSServiceRulesResponse.setRequestId(_ctx.stringValue("ListDNSServiceRulesResponse.RequestId"));
		listDNSServiceRulesResponse.setTotalCount(_ctx.integerValue("ListDNSServiceRulesResponse.TotalCount"));
		listDNSServiceRulesResponse.setNextToken(_ctx.stringValue("ListDNSServiceRulesResponse.NextToken"));
		listDNSServiceRulesResponse.setMaxResults(_ctx.integerValue("ListDNSServiceRulesResponse.MaxResults"));

		List<DnsServiceRuleModels> dNSServiceRules = new ArrayList<DnsServiceRuleModels>();
		for (int i = 0; i < _ctx.lengthValue("ListDNSServiceRulesResponse.DNSServiceRules.Length"); i++) {
			DnsServiceRuleModels dnsServiceRuleModels = new DnsServiceRuleModels();
			dnsServiceRuleModels.setIoTCloudConnectorId(_ctx.stringValue("ListDNSServiceRulesResponse.DNSServiceRules["+ i +"].IoTCloudConnectorId"));
			dnsServiceRuleModels.setServiceType(_ctx.stringValue("ListDNSServiceRulesResponse.DNSServiceRules["+ i +"].ServiceType"));
			dnsServiceRuleModels.setSource(_ctx.stringValue("ListDNSServiceRulesResponse.DNSServiceRules["+ i +"].Source"));
			dnsServiceRuleModels.setDestination(_ctx.stringValue("ListDNSServiceRulesResponse.DNSServiceRules["+ i +"].Destination"));
			dnsServiceRuleModels.setDNSServiceRuleStatus(_ctx.stringValue("ListDNSServiceRulesResponse.DNSServiceRules["+ i +"].DNSServiceRuleStatus"));
			dnsServiceRuleModels.setDNSServiceRuleName(_ctx.stringValue("ListDNSServiceRulesResponse.DNSServiceRules["+ i +"].DNSServiceRuleName"));
			dnsServiceRuleModels.setDNSServiceRuleDescription(_ctx.stringValue("ListDNSServiceRulesResponse.DNSServiceRules["+ i +"].DNSServiceRuleDescription"));
			dnsServiceRuleModels.setDNSServiceRuleId(_ctx.stringValue("ListDNSServiceRulesResponse.DNSServiceRules["+ i +"].DNSServiceRuleId"));

			dNSServiceRules.add(dnsServiceRuleModels);
		}
		listDNSServiceRulesResponse.setDNSServiceRules(dNSServiceRules);
	 
	 	return listDNSServiceRulesResponse;
	}
}