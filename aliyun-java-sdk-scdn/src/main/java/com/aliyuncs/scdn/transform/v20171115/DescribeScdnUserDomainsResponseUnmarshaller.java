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

package com.aliyuncs.scdn.transform.v20171115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.scdn.model.v20171115.DescribeScdnUserDomainsResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnUserDomainsResponse.PageData;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnUserDomainsResponse.PageData.Source;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnUserDomainsResponseUnmarshaller {

	public static DescribeScdnUserDomainsResponse unmarshall(DescribeScdnUserDomainsResponse describeScdnUserDomainsResponse, UnmarshallerContext _ctx) {
		
		describeScdnUserDomainsResponse.setRequestId(_ctx.stringValue("DescribeScdnUserDomainsResponse.RequestId"));
		describeScdnUserDomainsResponse.setPageNumber(_ctx.longValue("DescribeScdnUserDomainsResponse.PageNumber"));
		describeScdnUserDomainsResponse.setPageSize(_ctx.longValue("DescribeScdnUserDomainsResponse.PageSize"));
		describeScdnUserDomainsResponse.setTotalCount(_ctx.longValue("DescribeScdnUserDomainsResponse.TotalCount"));

		List<PageData> domains = new ArrayList<PageData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScdnUserDomainsResponse.Domains.Length"); i++) {
			PageData pageData = new PageData();
			pageData.setDomainName(_ctx.stringValue("DescribeScdnUserDomainsResponse.Domains["+ i +"].DomainName"));
			pageData.setCname(_ctx.stringValue("DescribeScdnUserDomainsResponse.Domains["+ i +"].Cname"));
			pageData.setDomainStatus(_ctx.stringValue("DescribeScdnUserDomainsResponse.Domains["+ i +"].DomainStatus"));
			pageData.setGmtCreated(_ctx.stringValue("DescribeScdnUserDomainsResponse.Domains["+ i +"].GmtCreated"));
			pageData.setGmtModified(_ctx.stringValue("DescribeScdnUserDomainsResponse.Domains["+ i +"].GmtModified"));
			pageData.setDescription(_ctx.stringValue("DescribeScdnUserDomainsResponse.Domains["+ i +"].Description"));
			pageData.setSSLProtocol(_ctx.stringValue("DescribeScdnUserDomainsResponse.Domains["+ i +"].SSLProtocol"));
			pageData.setResourceGroupId(_ctx.stringValue("DescribeScdnUserDomainsResponse.Domains["+ i +"].ResourceGroupId"));
			pageData.setSandbox(_ctx.stringValue("DescribeScdnUserDomainsResponse.Domains["+ i +"].Sandbox"));

			List<Source> sources = new ArrayList<Source>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScdnUserDomainsResponse.Domains["+ i +"].Sources.Length"); j++) {
				Source source = new Source();
				source.setType(_ctx.stringValue("DescribeScdnUserDomainsResponse.Domains["+ i +"].Sources["+ j +"].Type"));
				source.setContent(_ctx.stringValue("DescribeScdnUserDomainsResponse.Domains["+ i +"].Sources["+ j +"].Content"));
				source.setPort(_ctx.integerValue("DescribeScdnUserDomainsResponse.Domains["+ i +"].Sources["+ j +"].Port"));
				source.setPriority(_ctx.stringValue("DescribeScdnUserDomainsResponse.Domains["+ i +"].Sources["+ j +"].Priority"));

				sources.add(source);
			}
			pageData.setSources(sources);

			domains.add(pageData);
		}
		describeScdnUserDomainsResponse.setDomains(domains);
	 
	 	return describeScdnUserDomainsResponse;
	}
}