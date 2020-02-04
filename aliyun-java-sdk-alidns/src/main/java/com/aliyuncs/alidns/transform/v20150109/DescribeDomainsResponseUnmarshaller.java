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

	public static DescribeDomainsResponse unmarshall(DescribeDomainsResponse describeDomainsResponse, UnmarshallerContext _ctx) {
		
		describeDomainsResponse.setRequestId(_ctx.stringValue("DescribeDomainsResponse.RequestId"));
		describeDomainsResponse.setTotalCount(_ctx.longValue("DescribeDomainsResponse.TotalCount"));
		describeDomainsResponse.setPageNumber(_ctx.longValue("DescribeDomainsResponse.PageNumber"));
		describeDomainsResponse.setPageSize(_ctx.longValue("DescribeDomainsResponse.PageSize"));

		List<Domain> domains = new ArrayList<Domain>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainsResponse.Domains.Length"); i++) {
			Domain domain = new Domain();
			domain.setDomainId(_ctx.stringValue("DescribeDomainsResponse.Domains["+ i +"].DomainId"));
			domain.setDomainName(_ctx.stringValue("DescribeDomainsResponse.Domains["+ i +"].DomainName"));
			domain.setPunyCode(_ctx.stringValue("DescribeDomainsResponse.Domains["+ i +"].PunyCode"));
			domain.setAliDomain(_ctx.booleanValue("DescribeDomainsResponse.Domains["+ i +"].AliDomain"));
			domain.setRecordCount(_ctx.longValue("DescribeDomainsResponse.Domains["+ i +"].RecordCount"));
			domain.setRegistrantEmail(_ctx.stringValue("DescribeDomainsResponse.Domains["+ i +"].RegistrantEmail"));
			domain.setRemark(_ctx.stringValue("DescribeDomainsResponse.Domains["+ i +"].Remark"));
			domain.setGroupId(_ctx.stringValue("DescribeDomainsResponse.Domains["+ i +"].GroupId"));
			domain.setGroupName(_ctx.stringValue("DescribeDomainsResponse.Domains["+ i +"].GroupName"));
			domain.setInstanceId(_ctx.stringValue("DescribeDomainsResponse.Domains["+ i +"].InstanceId"));
			domain.setVersionCode(_ctx.stringValue("DescribeDomainsResponse.Domains["+ i +"].VersionCode"));
			domain.setVersionName(_ctx.stringValue("DescribeDomainsResponse.Domains["+ i +"].VersionName"));
			domain.setInstanceEndTime(_ctx.stringValue("DescribeDomainsResponse.Domains["+ i +"].InstanceEndTime"));
			domain.setInstanceExpired(_ctx.booleanValue("DescribeDomainsResponse.Domains["+ i +"].InstanceExpired"));
			domain.setStarmark(_ctx.booleanValue("DescribeDomainsResponse.Domains["+ i +"].Starmark"));
			domain.setCreateTime(_ctx.stringValue("DescribeDomainsResponse.Domains["+ i +"].CreateTime"));
			domain.setCreateTimestamp(_ctx.longValue("DescribeDomainsResponse.Domains["+ i +"].CreateTimestamp"));

			List<String> dnsServers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDomainsResponse.Domains["+ i +"].DnsServers.Length"); j++) {
				dnsServers.add(_ctx.stringValue("DescribeDomainsResponse.Domains["+ i +"].DnsServers["+ j +"]"));
			}
			domain.setDnsServers(dnsServers);

			domains.add(domain);
		}
		describeDomainsResponse.setDomains(domains);
	 
	 	return describeDomainsResponse;
	}
}