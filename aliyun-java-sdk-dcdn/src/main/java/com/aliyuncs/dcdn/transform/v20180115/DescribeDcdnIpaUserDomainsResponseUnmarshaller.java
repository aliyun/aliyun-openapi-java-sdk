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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnIpaUserDomainsResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnIpaUserDomainsResponse.PageData;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnIpaUserDomainsResponse.PageData.Source;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnIpaUserDomainsResponseUnmarshaller {

	public static DescribeDcdnIpaUserDomainsResponse unmarshall(DescribeDcdnIpaUserDomainsResponse describeDcdnIpaUserDomainsResponse, UnmarshallerContext _ctx) {
		
		describeDcdnIpaUserDomainsResponse.setRequestId(_ctx.stringValue("DescribeDcdnIpaUserDomainsResponse.RequestId"));
		describeDcdnIpaUserDomainsResponse.setPageNumber(_ctx.longValue("DescribeDcdnIpaUserDomainsResponse.PageNumber"));
		describeDcdnIpaUserDomainsResponse.setPageSize(_ctx.longValue("DescribeDcdnIpaUserDomainsResponse.PageSize"));
		describeDcdnIpaUserDomainsResponse.setTotalCount(_ctx.longValue("DescribeDcdnIpaUserDomainsResponse.TotalCount"));

		List<PageData> domains = new ArrayList<PageData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnIpaUserDomainsResponse.Domains.Length"); i++) {
			PageData pageData = new PageData();
			pageData.setDomainName(_ctx.stringValue("DescribeDcdnIpaUserDomainsResponse.Domains["+ i +"].DomainName"));
			pageData.setCname(_ctx.stringValue("DescribeDcdnIpaUserDomainsResponse.Domains["+ i +"].Cname"));
			pageData.setDomainStatus(_ctx.stringValue("DescribeDcdnIpaUserDomainsResponse.Domains["+ i +"].DomainStatus"));
			pageData.setGmtCreated(_ctx.stringValue("DescribeDcdnIpaUserDomainsResponse.Domains["+ i +"].GmtCreated"));
			pageData.setGmtModified(_ctx.stringValue("DescribeDcdnIpaUserDomainsResponse.Domains["+ i +"].GmtModified"));
			pageData.setDescription(_ctx.stringValue("DescribeDcdnIpaUserDomainsResponse.Domains["+ i +"].Description"));
			pageData.setSSLProtocol(_ctx.stringValue("DescribeDcdnIpaUserDomainsResponse.Domains["+ i +"].SSLProtocol"));
			pageData.setResourceGroupId(_ctx.stringValue("DescribeDcdnIpaUserDomainsResponse.Domains["+ i +"].ResourceGroupId"));
			pageData.setSandbox(_ctx.stringValue("DescribeDcdnIpaUserDomainsResponse.Domains["+ i +"].Sandbox"));

			List<Source> sources = new ArrayList<Source>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDcdnIpaUserDomainsResponse.Domains["+ i +"].Sources.Length"); j++) {
				Source source = new Source();
				source.setType(_ctx.stringValue("DescribeDcdnIpaUserDomainsResponse.Domains["+ i +"].Sources["+ j +"].Type"));
				source.setContent(_ctx.stringValue("DescribeDcdnIpaUserDomainsResponse.Domains["+ i +"].Sources["+ j +"].Content"));
				source.setPort(_ctx.integerValue("DescribeDcdnIpaUserDomainsResponse.Domains["+ i +"].Sources["+ j +"].Port"));
				source.setPriority(_ctx.stringValue("DescribeDcdnIpaUserDomainsResponse.Domains["+ i +"].Sources["+ j +"].Priority"));
				source.setWeight(_ctx.stringValue("DescribeDcdnIpaUserDomainsResponse.Domains["+ i +"].Sources["+ j +"].Weight"));

				sources.add(source);
			}
			pageData.setSources(sources);

			domains.add(pageData);
		}
		describeDcdnIpaUserDomainsResponse.setDomains(domains);
	 
	 	return describeDcdnIpaUserDomainsResponse;
	}
}