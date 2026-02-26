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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDeletedDomainsResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDeletedDomainsResponse.PageData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDeletedDomainsResponseUnmarshaller {

	public static DescribeDcdnDeletedDomainsResponse unmarshall(DescribeDcdnDeletedDomainsResponse describeDcdnDeletedDomainsResponse, UnmarshallerContext _ctx) {
		
		describeDcdnDeletedDomainsResponse.setRequestId(_ctx.stringValue("DescribeDcdnDeletedDomainsResponse.RequestId"));
		describeDcdnDeletedDomainsResponse.setPageNumber(_ctx.longValue("DescribeDcdnDeletedDomainsResponse.PageNumber"));
		describeDcdnDeletedDomainsResponse.setPageSize(_ctx.longValue("DescribeDcdnDeletedDomainsResponse.PageSize"));
		describeDcdnDeletedDomainsResponse.setTotalCount(_ctx.longValue("DescribeDcdnDeletedDomainsResponse.TotalCount"));

		List<PageData> domains = new ArrayList<PageData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDeletedDomainsResponse.Domains.Length"); i++) {
			PageData pageData = new PageData();
			pageData.setGmtModified(_ctx.stringValue("DescribeDcdnDeletedDomainsResponse.Domains["+ i +"].GmtModified"));
			pageData.setDomainName(_ctx.stringValue("DescribeDcdnDeletedDomainsResponse.Domains["+ i +"].DomainName"));

			domains.add(pageData);
		}
		describeDcdnDeletedDomainsResponse.setDomains(domains);
	 
	 	return describeDcdnDeletedDomainsResponse;
	}
}