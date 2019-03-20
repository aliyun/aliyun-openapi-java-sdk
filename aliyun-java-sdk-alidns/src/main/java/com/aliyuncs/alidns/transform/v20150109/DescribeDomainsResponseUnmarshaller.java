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

package com.aliyuncs.alidns.transform.v20150109;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.DescribeDomainsResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeDomainsResponse.Domain;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainsResponseUnmarshaller {

	public static DescribeDomainsResponse unmarshall(DescribeDomainsResponse describeDomainsResponse, UnmarshallerContext context) {
		
		describeDomainsResponse.setRequestId(context.stringValue("DescribeDomainsResponse.RequestId"));
		describeDomainsResponse.setTotalCount(context.longValue("DescribeDomainsResponse.TotalCount"));
		describeDomainsResponse.setPageNumber(context.longValue("DescribeDomainsResponse.PageNumber"));
		describeDomainsResponse.setPageSize(context.longValue("DescribeDomainsResponse.PageSize"));

		List<Domain> domains = new ArrayList<Domain>();
		for (int i = 0; i < context.lengthValue("DescribeDomainsResponse.Domains.Length"); i++) {
			Domain domain = new Domain();
			domain.setDomainId(context.stringValue("DescribeDomainsResponse.Domains["+ i +"].DomainId"));
			domain.setDomainName(context.stringValue("DescribeDomainsResponse.Domains["+ i +"].DomainName"));
			domain.setPunyCode(context.stringValue("DescribeDomainsResponse.Domains["+ i +"].PunyCode"));
			domain.setAliDomain(context.booleanValue("DescribeDomainsResponse.Domains["+ i +"].AliDomain"));
			domain.setRecordCount(context.longValue("DescribeDomainsResponse.Domains["+ i +"].RecordCount"));
			domain.setRegistrantEmail(context.stringValue("DescribeDomainsResponse.Domains["+ i +"].RegistrantEmail"));
			domain.setRemark(context.stringValue("DescribeDomainsResponse.Domains["+ i +"].Remark"));
			domain.setGroupId(context.stringValue("DescribeDomainsResponse.Domains["+ i +"].GroupId"));
			domain.setGroupName(context.stringValue("DescribeDomainsResponse.Domains["+ i +"].GroupName"));
			domain.setInstanceId(context.stringValue("DescribeDomainsResponse.Domains["+ i +"].InstanceId"));
			domain.setVersionCode(context.stringValue("DescribeDomainsResponse.Domains["+ i +"].VersionCode"));
			domain.setVersionName(context.stringValue("DescribeDomainsResponse.Domains["+ i +"].VersionName"));
			domain.setInstanceEndTime(context.stringValue("DescribeDomainsResponse.Domains["+ i +"].InstanceEndTime"));
			domain.setInstanceExpired(context.booleanValue("DescribeDomainsResponse.Domains["+ i +"].InstanceExpired"));

			List<String> dnsServers = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeDomainsResponse.Domains["+ i +"].DnsServers.Length"); j++) {
				dnsServers.add(context.stringValue("DescribeDomainsResponse.Domains["+ i +"].DnsServers["+ j +"]"));
			}
			domain.setDnsServers(dnsServers);

			domains.add(domain);
		}
		describeDomainsResponse.setDomains(domains);
	 
	 	return describeDomainsResponse;
	}
}