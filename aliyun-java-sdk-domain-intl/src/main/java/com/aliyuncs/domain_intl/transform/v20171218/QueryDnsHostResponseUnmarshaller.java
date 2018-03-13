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
package com.aliyuncs.domain_intl.transform.v20171218;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain_intl.model.v20171218.QueryDnsHostResponse;
import com.aliyuncs.domain_intl.model.v20171218.QueryDnsHostResponse.DnsHost;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDnsHostResponseUnmarshaller {

	public static QueryDnsHostResponse unmarshall(QueryDnsHostResponse queryDnsHostResponse, UnmarshallerContext context) {
		
		queryDnsHostResponse.setRequestId(context.stringValue("QueryDnsHostResponse.RequestId"));

		List<DnsHost> dnsHostList = new ArrayList<DnsHost>();
		for (int i = 0; i < context.lengthValue("QueryDnsHostResponse.DnsHostList.Length"); i++) {
			DnsHost dnsHost = new DnsHost();
			dnsHost.setDnsName(context.stringValue("QueryDnsHostResponse.DnsHostList["+ i +"].DnsName"));

			List<String> ipList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("QueryDnsHostResponse.DnsHostList["+ i +"].IpList.Length"); j++) {
				ipList.add(context.stringValue("QueryDnsHostResponse.DnsHostList["+ i +"].IpList["+ j +"]"));
			}
			dnsHost.setIpList(ipList);

			dnsHostList.add(dnsHost);
		}
		queryDnsHostResponse.setDnsHostList(dnsHostList);
	 
	 	return queryDnsHostResponse;
	}
}