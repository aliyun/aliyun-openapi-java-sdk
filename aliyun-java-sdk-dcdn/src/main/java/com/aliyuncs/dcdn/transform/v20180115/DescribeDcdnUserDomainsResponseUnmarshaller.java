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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnUserDomainsResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnUserDomainsResponse.PageData;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnUserDomainsResponse.PageData.Source;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnUserDomainsResponseUnmarshaller {

	public static DescribeDcdnUserDomainsResponse unmarshall(DescribeDcdnUserDomainsResponse describeDcdnUserDomainsResponse, UnmarshallerContext _ctx) {
		
		describeDcdnUserDomainsResponse.setRequestId(_ctx.stringValue("DescribeDcdnUserDomainsResponse.RequestId"));
		describeDcdnUserDomainsResponse.setPageNumber(_ctx.longValue("DescribeDcdnUserDomainsResponse.PageNumber"));
		describeDcdnUserDomainsResponse.setPageSize(_ctx.longValue("DescribeDcdnUserDomainsResponse.PageSize"));
		describeDcdnUserDomainsResponse.setTotalCount(_ctx.longValue("DescribeDcdnUserDomainsResponse.TotalCount"));

		List<PageData> domains = new ArrayList<PageData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnUserDomainsResponse.Domains.Length"); i++) {
			PageData pageData = new PageData();
			pageData.setGmtCreated(_ctx.stringValue("DescribeDcdnUserDomainsResponse.Domains["+ i +"].GmtCreated"));
			pageData.setDescription(_ctx.stringValue("DescribeDcdnUserDomainsResponse.Domains["+ i +"].Description"));
			pageData.setSSLProtocol(_ctx.stringValue("DescribeDcdnUserDomainsResponse.Domains["+ i +"].SSLProtocol"));
			pageData.setResourceGroupId(_ctx.stringValue("DescribeDcdnUserDomainsResponse.Domains["+ i +"].ResourceGroupId"));
			pageData.setSandbox(_ctx.stringValue("DescribeDcdnUserDomainsResponse.Domains["+ i +"].Sandbox"));
			pageData.setDomainStatus(_ctx.stringValue("DescribeDcdnUserDomainsResponse.Domains["+ i +"].DomainStatus"));
			pageData.setCname(_ctx.stringValue("DescribeDcdnUserDomainsResponse.Domains["+ i +"].Cname"));
			pageData.setGmtModified(_ctx.stringValue("DescribeDcdnUserDomainsResponse.Domains["+ i +"].GmtModified"));
			pageData.setDomainName(_ctx.stringValue("DescribeDcdnUserDomainsResponse.Domains["+ i +"].DomainName"));
			pageData.setDomainId(_ctx.longValue("DescribeDcdnUserDomainsResponse.Domains["+ i +"].DomainId"));

			List<Source> sources = new ArrayList<Source>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDcdnUserDomainsResponse.Domains["+ i +"].Sources.Length"); j++) {
				Source source = new Source();
				source.setType(_ctx.stringValue("DescribeDcdnUserDomainsResponse.Domains["+ i +"].Sources["+ j +"].Type"));
				source.setWeight(_ctx.stringValue("DescribeDcdnUserDomainsResponse.Domains["+ i +"].Sources["+ j +"].Weight"));
				source.setPriority(_ctx.stringValue("DescribeDcdnUserDomainsResponse.Domains["+ i +"].Sources["+ j +"].Priority"));
				source.setPort(_ctx.integerValue("DescribeDcdnUserDomainsResponse.Domains["+ i +"].Sources["+ j +"].Port"));
				source.setContent(_ctx.stringValue("DescribeDcdnUserDomainsResponse.Domains["+ i +"].Sources["+ j +"].Content"));

				sources.add(source);
			}
			pageData.setSources(sources);

			domains.add(pageData);
		}
		describeDcdnUserDomainsResponse.setDomains(domains);
	 
	 	return describeDcdnUserDomainsResponse;
	}
}