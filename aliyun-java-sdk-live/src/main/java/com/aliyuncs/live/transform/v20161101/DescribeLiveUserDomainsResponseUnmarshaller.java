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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveUserDomainsResponseUnmarshaller {

	public static DescribeLiveUserDomainsResponse unmarshall(DescribeLiveUserDomainsResponse describeLiveUserDomainsResponse, UnmarshallerContext _ctx) {
		
		describeLiveUserDomainsResponse.setRequestId(_ctx.stringValue("DescribeLiveUserDomainsResponse.RequestId"));
		describeLiveUserDomainsResponse.setPageNumber(_ctx.longValue("DescribeLiveUserDomainsResponse.PageNumber"));
		describeLiveUserDomainsResponse.setPageSize(_ctx.longValue("DescribeLiveUserDomainsResponse.PageSize"));
		describeLiveUserDomainsResponse.setTotalCount(_ctx.longValue("DescribeLiveUserDomainsResponse.TotalCount"));

		List<PageData> domains = new ArrayList<PageData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveUserDomainsResponse.Domains.Length"); i++) {
			PageData pageData = new PageData();
			pageData.setDomainName(_ctx.stringValue("DescribeLiveUserDomainsResponse.Domains["+ i +"].DomainName"));
			pageData.setCname(_ctx.stringValue("DescribeLiveUserDomainsResponse.Domains["+ i +"].Cname"));
			pageData.setLiveDomainType(_ctx.stringValue("DescribeLiveUserDomainsResponse.Domains["+ i +"].LiveDomainType"));
			pageData.setGmtCreated(_ctx.stringValue("DescribeLiveUserDomainsResponse.Domains["+ i +"].GmtCreated"));
			pageData.setGmtModified(_ctx.stringValue("DescribeLiveUserDomainsResponse.Domains["+ i +"].GmtModified"));
			pageData.setDescription(_ctx.stringValue("DescribeLiveUserDomainsResponse.Domains["+ i +"].Description"));
			pageData.setLiveDomainStatus(_ctx.stringValue("DescribeLiveUserDomainsResponse.Domains["+ i +"].LiveDomainStatus"));
			pageData.setRegionName(_ctx.stringValue("DescribeLiveUserDomainsResponse.Domains["+ i +"].RegionName"));

			domains.add(pageData);
		}
		describeLiveUserDomainsResponse.setDomains(domains);
	 
	 	return describeLiveUserDomainsResponse;
	}
}