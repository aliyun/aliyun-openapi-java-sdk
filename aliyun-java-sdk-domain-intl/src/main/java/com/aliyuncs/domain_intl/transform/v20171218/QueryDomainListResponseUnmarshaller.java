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

package com.aliyuncs.domain_intl.transform.v20171218;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain_intl.model.v20171218.QueryDomainListResponse;
import com.aliyuncs.domain_intl.model.v20171218.QueryDomainListResponse.Domain;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDomainListResponseUnmarshaller {

	public static QueryDomainListResponse unmarshall(QueryDomainListResponse queryDomainListResponse, UnmarshallerContext context) {
		
		queryDomainListResponse.setRequestId(context.stringValue("QueryDomainListResponse.RequestId"));
		queryDomainListResponse.setTotalItemNum(context.integerValue("QueryDomainListResponse.TotalItemNum"));
		queryDomainListResponse.setCurrentPageNum(context.integerValue("QueryDomainListResponse.CurrentPageNum"));
		queryDomainListResponse.setTotalPageNum(context.integerValue("QueryDomainListResponse.TotalPageNum"));
		queryDomainListResponse.setPageSize(context.integerValue("QueryDomainListResponse.PageSize"));
		queryDomainListResponse.setPrePage(context.booleanValue("QueryDomainListResponse.PrePage"));
		queryDomainListResponse.setNextPage(context.booleanValue("QueryDomainListResponse.NextPage"));

		List<Domain> data = new ArrayList<Domain>();
		for (int i = 0; i < context.lengthValue("QueryDomainListResponse.Data.Length"); i++) {
			Domain domain = new Domain();
			domain.setDomainName(context.stringValue("QueryDomainListResponse.Data["+ i +"].DomainName"));
			domain.setInstanceId(context.stringValue("QueryDomainListResponse.Data["+ i +"].InstanceId"));
			domain.setExpirationDate(context.stringValue("QueryDomainListResponse.Data["+ i +"].ExpirationDate"));
			domain.setRegistrationDate(context.stringValue("QueryDomainListResponse.Data["+ i +"].RegistrationDate"));
			domain.setDomainType(context.stringValue("QueryDomainListResponse.Data["+ i +"].DomainType"));
			domain.setDomainStatus(context.stringValue("QueryDomainListResponse.Data["+ i +"].DomainStatus"));
			domain.setProductId(context.stringValue("QueryDomainListResponse.Data["+ i +"].ProductId"));
			domain.setExpirationDateLong(context.longValue("QueryDomainListResponse.Data["+ i +"].ExpirationDateLong"));
			domain.setRegistrationDateLong(context.longValue("QueryDomainListResponse.Data["+ i +"].RegistrationDateLong"));
			domain.setPremium(context.booleanValue("QueryDomainListResponse.Data["+ i +"].Premium"));

			data.add(domain);
		}
		queryDomainListResponse.setData(data);
	 
	 	return queryDomainListResponse;
	}
}