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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnWafPolicyDomainsResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnWafPolicyDomainsResponse.DomainItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnWafPolicyDomainsResponseUnmarshaller {

	public static DescribeDcdnWafPolicyDomainsResponse unmarshall(DescribeDcdnWafPolicyDomainsResponse describeDcdnWafPolicyDomainsResponse, UnmarshallerContext _ctx) {
		
		describeDcdnWafPolicyDomainsResponse.setRequestId(_ctx.stringValue("DescribeDcdnWafPolicyDomainsResponse.RequestId"));
		describeDcdnWafPolicyDomainsResponse.setPageSize(_ctx.integerValue("DescribeDcdnWafPolicyDomainsResponse.PageSize"));
		describeDcdnWafPolicyDomainsResponse.setPageNumber(_ctx.integerValue("DescribeDcdnWafPolicyDomainsResponse.PageNumber"));
		describeDcdnWafPolicyDomainsResponse.setTotalCount(_ctx.integerValue("DescribeDcdnWafPolicyDomainsResponse.TotalCount"));

		List<DomainItem> domains = new ArrayList<DomainItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnWafPolicyDomainsResponse.Domains.Length"); i++) {
			DomainItem domainItem = new DomainItem();
			domainItem.setDomainName(_ctx.stringValue("DescribeDcdnWafPolicyDomainsResponse.Domains["+ i +"].DomainName"));

			domains.add(domainItem);
		}
		describeDcdnWafPolicyDomainsResponse.setDomains(domains);
	 
	 	return describeDcdnWafPolicyDomainsResponse;
	}
}