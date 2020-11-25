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

package com.aliyuncs.httpdns.transform.v20160201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.httpdns.model.v20160201.ListDomainsResponse;
import com.aliyuncs.httpdns.model.v20160201.ListDomainsResponse.DomainInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDomainsResponseUnmarshaller {

	public static ListDomainsResponse unmarshall(ListDomainsResponse listDomainsResponse, UnmarshallerContext _ctx) {
		
		listDomainsResponse.setRequestId(_ctx.stringValue("ListDomainsResponse.RequestId"));
		listDomainsResponse.setTotalCount(_ctx.longValue("ListDomainsResponse.TotalCount"));
		listDomainsResponse.setPageNumber(_ctx.longValue("ListDomainsResponse.PageNumber"));
		listDomainsResponse.setPageSize(_ctx.longValue("ListDomainsResponse.PageSize"));

		List<DomainInfo> domainInfos = new ArrayList<DomainInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListDomainsResponse.DomainInfos.Length"); i++) {
			DomainInfo domainInfo = new DomainInfo();
			domainInfo.setDomainName(_ctx.stringValue("ListDomainsResponse.DomainInfos["+ i +"].DomainName"));
			domainInfo.setResolved(_ctx.longValue("ListDomainsResponse.DomainInfos["+ i +"].Resolved"));
			domainInfo.setResolvedHttps(_ctx.longValue("ListDomainsResponse.DomainInfos["+ i +"].ResolvedHttps"));
			domainInfo.setResolved6(_ctx.longValue("ListDomainsResponse.DomainInfos["+ i +"].Resolved6"));
			domainInfo.setResolvedHttps6(_ctx.longValue("ListDomainsResponse.DomainInfos["+ i +"].ResolvedHttps6"));

			domainInfos.add(domainInfo);
		}
		listDomainsResponse.setDomainInfos(domainInfos);
	 
	 	return listDomainsResponse;
	}
}