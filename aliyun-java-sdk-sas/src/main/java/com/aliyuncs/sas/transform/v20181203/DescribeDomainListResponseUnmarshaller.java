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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeDomainListResponse;
import com.aliyuncs.sas.model.v20181203.DescribeDomainListResponse.DomainResponse;
import com.aliyuncs.sas.model.v20181203.DescribeDomainListResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainListResponseUnmarshaller {

	public static DescribeDomainListResponse unmarshall(DescribeDomainListResponse describeDomainListResponse, UnmarshallerContext _ctx) {
		
		describeDomainListResponse.setRequestId(_ctx.stringValue("DescribeDomainListResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCount(_ctx.integerValue("DescribeDomainListResponse.PageInfo.Count"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeDomainListResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeDomainListResponse.PageInfo.TotalCount"));
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeDomainListResponse.PageInfo.CurrentPage"));
		describeDomainListResponse.setPageInfo(pageInfo);

		List<DomainResponse> domainListResponseList = new ArrayList<DomainResponse>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainListResponse.DomainListResponseList.Length"); i++) {
			DomainResponse domainResponse = new DomainResponse();
			domainResponse.setDomain(_ctx.stringValue("DescribeDomainListResponse.DomainListResponseList["+ i +"].Domain"));
			domainResponse.setIpList(_ctx.stringValue("DescribeDomainListResponse.DomainListResponseList["+ i +"].IpList"));

			domainListResponseList.add(domainResponse);
		}
		describeDomainListResponse.setDomainListResponseList(domainListResponseList);
	 
	 	return describeDomainListResponse;
	}
}