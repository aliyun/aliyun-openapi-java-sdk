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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnUserDomainsResponseUnmarshaller {

	public static DescribeDcdnUserDomainsResponse unmarshall(DescribeDcdnUserDomainsResponse describeDcdnUserDomainsResponse, UnmarshallerContext context) {
		
		describeDcdnUserDomainsResponse.setRequestId(context.stringValue("DescribeDcdnUserDomainsResponse.RequestId"));
		describeDcdnUserDomainsResponse.setPageNumber(context.longValue("DescribeDcdnUserDomainsResponse.PageNumber"));
		describeDcdnUserDomainsResponse.setPageSize(context.longValue("DescribeDcdnUserDomainsResponse.PageSize"));
		describeDcdnUserDomainsResponse.setTotalCount(context.longValue("DescribeDcdnUserDomainsResponse.TotalCount"));

		List<PageData> domains = new ArrayList<PageData>();
		for (int i = 0; i < context.lengthValue("DescribeDcdnUserDomainsResponse.Domains.Length"); i++) {
			PageData pageData = new PageData();
			pageData.setDomainName(context.stringValue("DescribeDcdnUserDomainsResponse.Domains["+ i +"].DomainName"));
			pageData.setCname(context.stringValue("DescribeDcdnUserDomainsResponse.Domains["+ i +"].Cname"));
			pageData.setDomainStatus(context.stringValue("DescribeDcdnUserDomainsResponse.Domains["+ i +"].DomainStatus"));
			pageData.setGmtCreated(context.stringValue("DescribeDcdnUserDomainsResponse.Domains["+ i +"].GmtCreated"));
			pageData.setGmtModified(context.stringValue("DescribeDcdnUserDomainsResponse.Domains["+ i +"].GmtModified"));
			pageData.setDescription(context.stringValue("DescribeDcdnUserDomainsResponse.Domains["+ i +"].Description"));
			pageData.setSSLProtocol(context.stringValue("DescribeDcdnUserDomainsResponse.Domains["+ i +"].SSLProtocol"));
			pageData.setResourceGroupId(context.stringValue("DescribeDcdnUserDomainsResponse.Domains["+ i +"].ResourceGroupId"));
			pageData.setSandbox(context.stringValue("DescribeDcdnUserDomainsResponse.Domains["+ i +"].Sandbox"));

			List<Source> sources = new ArrayList<Source>();
			for (int j = 0; j < context.lengthValue("DescribeDcdnUserDomainsResponse.Domains["+ i +"].Sources.Length"); j++) {
				Source source = new Source();
				source.setType(context.stringValue("DescribeDcdnUserDomainsResponse.Domains["+ i +"].Sources["+ j +"].Type"));
				source.setContent(context.stringValue("DescribeDcdnUserDomainsResponse.Domains["+ i +"].Sources["+ j +"].Content"));
				source.setPort(context.integerValue("DescribeDcdnUserDomainsResponse.Domains["+ i +"].Sources["+ j +"].Port"));
				source.setPriority(context.stringValue("DescribeDcdnUserDomainsResponse.Domains["+ i +"].Sources["+ j +"].Priority"));
				source.setWeight(context.stringValue("DescribeDcdnUserDomainsResponse.Domains["+ i +"].Sources["+ j +"].Weight"));

				sources.add(source);
			}
			pageData.setSources(sources);

			domains.add(pageData);
		}
		describeDcdnUserDomainsResponse.setDomains(domains);
	 
	 	return describeDcdnUserDomainsResponse;
	}
}