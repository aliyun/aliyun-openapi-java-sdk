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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnWafDomainsResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnWafDomainsResponse.DomainItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnWafDomainsResponseUnmarshaller {

	public static DescribeDcdnWafDomainsResponse unmarshall(DescribeDcdnWafDomainsResponse describeDcdnWafDomainsResponse, UnmarshallerContext _ctx) {
		
		describeDcdnWafDomainsResponse.setRequestId(_ctx.stringValue("DescribeDcdnWafDomainsResponse.RequestId"));
		describeDcdnWafDomainsResponse.setPageSize(_ctx.integerValue("DescribeDcdnWafDomainsResponse.PageSize"));
		describeDcdnWafDomainsResponse.setPageNumber(_ctx.integerValue("DescribeDcdnWafDomainsResponse.PageNumber"));
		describeDcdnWafDomainsResponse.setTotalCount(_ctx.integerValue("DescribeDcdnWafDomainsResponse.TotalCount"));

		List<DomainItem> domains = new ArrayList<DomainItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnWafDomainsResponse.Domains.Length"); i++) {
			DomainItem domainItem = new DomainItem();
			domainItem.setPolicyCount(_ctx.integerValue("DescribeDcdnWafDomainsResponse.Domains["+ i +"].PolicyCount"));
			domainItem.setClientIpTag(_ctx.stringValue("DescribeDcdnWafDomainsResponse.Domains["+ i +"].ClientIpTag"));
			domainItem.setDomainName(_ctx.stringValue("DescribeDcdnWafDomainsResponse.Domains["+ i +"].DomainName"));

			domains.add(domainItem);
		}
		describeDcdnWafDomainsResponse.setDomains(domains);
	 
	 	return describeDcdnWafDomainsResponse;
	}
}