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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeLiveUserDomainsResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveUserDomainsResponse.PageData;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveUserDomainsResponseUnmarshaller {

	public static DescribeLiveUserDomainsResponse unmarshall(DescribeLiveUserDomainsResponse describeLiveUserDomainsResponse, UnmarshallerContext context) {
		
		describeLiveUserDomainsResponse.setRequestId(context.stringValue("DescribeLiveUserDomainsResponse.RequestId"));
		describeLiveUserDomainsResponse.setPageNumber(context.longValue("DescribeLiveUserDomainsResponse.PageNumber"));
		describeLiveUserDomainsResponse.setPageSize(context.longValue("DescribeLiveUserDomainsResponse.PageSize"));
		describeLiveUserDomainsResponse.setTotalCount(context.longValue("DescribeLiveUserDomainsResponse.TotalCount"));

		List<PageData> domains = new ArrayList<PageData>();
		for (int i = 0; i < context.lengthValue("DescribeLiveUserDomainsResponse.Domains.Length"); i++) {
			PageData pageData = new PageData();
			pageData.setDomainName(context.stringValue("DescribeLiveUserDomainsResponse.Domains["+ i +"].DomainName"));
			pageData.setCname(context.stringValue("DescribeLiveUserDomainsResponse.Domains["+ i +"].Cname"));
			pageData.setLiveDomainType(context.stringValue("DescribeLiveUserDomainsResponse.Domains["+ i +"].LiveDomainType"));
			pageData.setGmtCreated(context.stringValue("DescribeLiveUserDomainsResponse.Domains["+ i +"].GmtCreated"));
			pageData.setGmtModified(context.stringValue("DescribeLiveUserDomainsResponse.Domains["+ i +"].GmtModified"));
			pageData.setDescription(context.stringValue("DescribeLiveUserDomainsResponse.Domains["+ i +"].Description"));
			pageData.setLiveDomainStatus(context.stringValue("DescribeLiveUserDomainsResponse.Domains["+ i +"].LiveDomainStatus"));
			pageData.setRegionName(context.stringValue("DescribeLiveUserDomainsResponse.Domains["+ i +"].RegionName"));

			domains.add(pageData);
		}
		describeLiveUserDomainsResponse.setDomains(domains);
	 
	 	return describeLiveUserDomainsResponse;
	}
}