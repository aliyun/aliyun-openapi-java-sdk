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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnWafPolicyValidDomainsResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnWafPolicyValidDomainsResponse.DomainItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnWafPolicyValidDomainsResponseUnmarshaller {

	public static DescribeDcdnWafPolicyValidDomainsResponse unmarshall(DescribeDcdnWafPolicyValidDomainsResponse describeDcdnWafPolicyValidDomainsResponse, UnmarshallerContext _ctx) {
		
		describeDcdnWafPolicyValidDomainsResponse.setRequestId(_ctx.stringValue("DescribeDcdnWafPolicyValidDomainsResponse.RequestId"));
		describeDcdnWafPolicyValidDomainsResponse.setPageSize(_ctx.integerValue("DescribeDcdnWafPolicyValidDomainsResponse.PageSize"));
		describeDcdnWafPolicyValidDomainsResponse.setPageNumber(_ctx.integerValue("DescribeDcdnWafPolicyValidDomainsResponse.PageNumber"));
		describeDcdnWafPolicyValidDomainsResponse.setTotalCount(_ctx.integerValue("DescribeDcdnWafPolicyValidDomainsResponse.TotalCount"));

		List<DomainItem> domains = new ArrayList<DomainItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnWafPolicyValidDomainsResponse.Domains.Length"); i++) {
			DomainItem domainItem = new DomainItem();
			domainItem.setPolicyName(_ctx.stringValue("DescribeDcdnWafPolicyValidDomainsResponse.Domains["+ i +"].PolicyName"));
			domainItem.setPolicyId(_ctx.longValue("DescribeDcdnWafPolicyValidDomainsResponse.Domains["+ i +"].PolicyId"));
			domainItem.setDomainName(_ctx.stringValue("DescribeDcdnWafPolicyValidDomainsResponse.Domains["+ i +"].DomainName"));
			domainItem.setPolicyType(_ctx.stringValue("DescribeDcdnWafPolicyValidDomainsResponse.Domains["+ i +"].PolicyType"));

			domains.add(domainItem);
		}
		describeDcdnWafPolicyValidDomainsResponse.setDomains(domains);
	 
	 	return describeDcdnWafPolicyValidDomainsResponse;
	}
}