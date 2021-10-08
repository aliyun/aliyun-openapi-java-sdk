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

package com.aliyuncs.cdn.transform.v20180510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20180510.DescribeCdnDeletedDomainsResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeCdnDeletedDomainsResponse.PageData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCdnDeletedDomainsResponseUnmarshaller {

	public static DescribeCdnDeletedDomainsResponse unmarshall(DescribeCdnDeletedDomainsResponse describeCdnDeletedDomainsResponse, UnmarshallerContext _ctx) {
		
		describeCdnDeletedDomainsResponse.setRequestId(_ctx.stringValue("DescribeCdnDeletedDomainsResponse.RequestId"));
		describeCdnDeletedDomainsResponse.setPageNumber(_ctx.longValue("DescribeCdnDeletedDomainsResponse.PageNumber"));
		describeCdnDeletedDomainsResponse.setPageSize(_ctx.longValue("DescribeCdnDeletedDomainsResponse.PageSize"));
		describeCdnDeletedDomainsResponse.setTotalCount(_ctx.longValue("DescribeCdnDeletedDomainsResponse.TotalCount"));

		List<PageData> domains = new ArrayList<PageData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCdnDeletedDomainsResponse.Domains.Length"); i++) {
			PageData pageData = new PageData();
			pageData.setDomainName(_ctx.stringValue("DescribeCdnDeletedDomainsResponse.Domains["+ i +"].DomainName"));
			pageData.setGmtModified(_ctx.stringValue("DescribeCdnDeletedDomainsResponse.Domains["+ i +"].GmtModified"));

			domains.add(pageData);
		}
		describeCdnDeletedDomainsResponse.setDomains(domains);
	 
	 	return describeCdnDeletedDomainsResponse;
	}
}