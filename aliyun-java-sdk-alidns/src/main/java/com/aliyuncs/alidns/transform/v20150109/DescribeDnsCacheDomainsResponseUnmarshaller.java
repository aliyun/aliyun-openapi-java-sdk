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

import com.aliyuncs.alidns.model.v20150109.DescribeDnsCacheDomainsResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeDnsCacheDomainsResponse.Domain;
import com.aliyuncs.alidns.model.v20150109.DescribeDnsCacheDomainsResponse.Domain.SourceDnsServer;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDnsCacheDomainsResponseUnmarshaller {

	public static DescribeDnsCacheDomainsResponse unmarshall(DescribeDnsCacheDomainsResponse describeDnsCacheDomainsResponse, UnmarshallerContext _ctx) {
		
		describeDnsCacheDomainsResponse.setRequestId(_ctx.stringValue("DescribeDnsCacheDomainsResponse.RequestId"));
		describeDnsCacheDomainsResponse.setTotalCount(_ctx.longValue("DescribeDnsCacheDomainsResponse.TotalCount"));
		describeDnsCacheDomainsResponse.setPageNumber(_ctx.longValue("DescribeDnsCacheDomainsResponse.PageNumber"));
		describeDnsCacheDomainsResponse.setPageSize(_ctx.longValue("DescribeDnsCacheDomainsResponse.PageSize"));

		List<Domain> domains = new ArrayList<Domain>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDnsCacheDomainsResponse.Domains.Length"); i++) {
			Domain domain = new Domain();
			domain.setDomainId(_ctx.stringValue("DescribeDnsCacheDomainsResponse.Domains["+ i +"].DomainId"));
			domain.setDomainName(_ctx.stringValue("DescribeDnsCacheDomainsResponse.Domains["+ i +"].DomainName"));
			domain.setInstanceId(_ctx.stringValue("DescribeDnsCacheDomainsResponse.Domains["+ i +"].InstanceId"));
			domain.setVersionCode(_ctx.stringValue("DescribeDnsCacheDomainsResponse.Domains["+ i +"].VersionCode"));
			domain.setRemark(_ctx.stringValue("DescribeDnsCacheDomainsResponse.Domains["+ i +"].Remark"));
			domain.setUpdateTime(_ctx.stringValue("DescribeDnsCacheDomainsResponse.Domains["+ i +"].UpdateTime"));
			domain.setUpdateTimestamp(_ctx.longValue("DescribeDnsCacheDomainsResponse.Domains["+ i +"].UpdateTimestamp"));
			domain.setCreateTime(_ctx.stringValue("DescribeDnsCacheDomainsResponse.Domains["+ i +"].CreateTime"));
			domain.setCreateTimestamp(_ctx.longValue("DescribeDnsCacheDomainsResponse.Domains["+ i +"].CreateTimestamp"));
			domain.setCacheTtlMin(_ctx.integerValue("DescribeDnsCacheDomainsResponse.Domains["+ i +"].CacheTtlMin"));
			domain.setCacheTtlMax(_ctx.integerValue("DescribeDnsCacheDomainsResponse.Domains["+ i +"].CacheTtlMax"));
			domain.setSourceProtocol(_ctx.stringValue("DescribeDnsCacheDomainsResponse.Domains["+ i +"].SourceProtocol"));
			domain.setSourceEdns(_ctx.stringValue("DescribeDnsCacheDomainsResponse.Domains["+ i +"].SourceEdns"));
			domain.setExpireTime(_ctx.stringValue("DescribeDnsCacheDomainsResponse.Domains["+ i +"].ExpireTime"));
			domain.setExpireTimestamp(_ctx.longValue("DescribeDnsCacheDomainsResponse.Domains["+ i +"].ExpireTimestamp"));

			List<SourceDnsServer> sourceDnsServers = new ArrayList<SourceDnsServer>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDnsCacheDomainsResponse.Domains["+ i +"].SourceDnsServers.Length"); j++) {
				SourceDnsServer sourceDnsServer = new SourceDnsServer();
				sourceDnsServer.setHost(_ctx.stringValue("DescribeDnsCacheDomainsResponse.Domains["+ i +"].SourceDnsServers["+ j +"].Host"));
				sourceDnsServer.setPort(_ctx.stringValue("DescribeDnsCacheDomainsResponse.Domains["+ i +"].SourceDnsServers["+ j +"].Port"));

				sourceDnsServers.add(sourceDnsServer);
			}
			domain.setSourceDnsServers(sourceDnsServers);

			domains.add(domain);
		}
		describeDnsCacheDomainsResponse.setDomains(domains);
	 
	 	return describeDnsCacheDomainsResponse;
	}
}