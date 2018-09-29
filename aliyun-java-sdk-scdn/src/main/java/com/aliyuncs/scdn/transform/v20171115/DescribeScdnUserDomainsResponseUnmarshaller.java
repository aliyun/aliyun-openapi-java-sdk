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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnUserDomainsResponseUnmarshaller {

	public static DescribeScdnUserDomainsResponse unmarshall(DescribeScdnUserDomainsResponse describeScdnUserDomainsResponse, UnmarshallerContext context) {
		
		describeScdnUserDomainsResponse.setRequestId(context.stringValue("DescribeScdnUserDomainsResponse.RequestId"));
		describeScdnUserDomainsResponse.setPageNumber(context.longValue("DescribeScdnUserDomainsResponse.PageNumber"));
		describeScdnUserDomainsResponse.setPageSize(context.longValue("DescribeScdnUserDomainsResponse.PageSize"));
		describeScdnUserDomainsResponse.setTotalCount(context.longValue("DescribeScdnUserDomainsResponse.TotalCount"));

		List<PageData> domains = new ArrayList<PageData>();
		for (int i = 0; i < context.lengthValue("DescribeScdnUserDomainsResponse.Domains.Length"); i++) {
			PageData pageData = new PageData();
			pageData.setDomainName(context.stringValue("DescribeScdnUserDomainsResponse.Domains["+ i +"].DomainName"));
			pageData.setCname(context.stringValue("DescribeScdnUserDomainsResponse.Domains["+ i +"].Cname"));
			pageData.setDomainStatus(context.stringValue("DescribeScdnUserDomainsResponse.Domains["+ i +"].DomainStatus"));
			pageData.setGmtCreated(context.stringValue("DescribeScdnUserDomainsResponse.Domains["+ i +"].GmtCreated"));
			pageData.setGmtModified(context.stringValue("DescribeScdnUserDomainsResponse.Domains["+ i +"].GmtModified"));
			pageData.setDescription(context.stringValue("DescribeScdnUserDomainsResponse.Domains["+ i +"].Description"));
			pageData.setSSLProtocol(context.stringValue("DescribeScdnUserDomainsResponse.Domains["+ i +"].SSLProtocol"));
			pageData.setResourceGroupId(context.stringValue("DescribeScdnUserDomainsResponse.Domains["+ i +"].ResourceGroupId"));
			pageData.setSandbox(context.stringValue("DescribeScdnUserDomainsResponse.Domains["+ i +"].Sandbox"));

			List<Source> sources = new ArrayList<Source>();
			for (int j = 0; j < context.lengthValue("DescribeScdnUserDomainsResponse.Domains["+ i +"].Sources.Length"); j++) {
				Source source = new Source();
				source.setType(context.stringValue("DescribeScdnUserDomainsResponse.Domains["+ i +"].Sources["+ j +"].Type"));
				source.setContent(context.stringValue("DescribeScdnUserDomainsResponse.Domains["+ i +"].Sources["+ j +"].Content"));
				source.setPort(context.integerValue("DescribeScdnUserDomainsResponse.Domains["+ i +"].Sources["+ j +"].Port"));
				source.setPriority(context.stringValue("DescribeScdnUserDomainsResponse.Domains["+ i +"].Sources["+ j +"].Priority"));

				sources.add(source);
			}
			pageData.setSources(sources);

			domains.add(pageData);
		}
		describeScdnUserDomainsResponse.setDomains(domains);
	 
	 	return describeScdnUserDomainsResponse;
	}
}