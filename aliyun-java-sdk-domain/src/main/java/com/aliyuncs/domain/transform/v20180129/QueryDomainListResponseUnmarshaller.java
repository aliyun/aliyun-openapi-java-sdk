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

package com.aliyuncs.domain.transform.v20180129;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain.model.v20180129.QueryDomainListResponse;
import com.aliyuncs.domain.model.v20180129.QueryDomainListResponse.Domain;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDomainListResponseUnmarshaller {

	public static QueryDomainListResponse unmarshall(QueryDomainListResponse queryDomainListResponse, UnmarshallerContext _ctx) {
		
		queryDomainListResponse.setRequestId(_ctx.stringValue("QueryDomainListResponse.RequestId"));
		queryDomainListResponse.setTotalItemNum(_ctx.integerValue("QueryDomainListResponse.TotalItemNum"));
		queryDomainListResponse.setCurrentPageNum(_ctx.integerValue("QueryDomainListResponse.CurrentPageNum"));
		queryDomainListResponse.setTotalPageNum(_ctx.integerValue("QueryDomainListResponse.TotalPageNum"));
		queryDomainListResponse.setPageSize(_ctx.integerValue("QueryDomainListResponse.PageSize"));
		queryDomainListResponse.setPrePage(_ctx.booleanValue("QueryDomainListResponse.PrePage"));
		queryDomainListResponse.setNextPage(_ctx.booleanValue("QueryDomainListResponse.NextPage"));

		List<Domain> data = new ArrayList<Domain>();
		for (int i = 0; i < _ctx.lengthValue("QueryDomainListResponse.Data.Length"); i++) {
			Domain domain = new Domain();
			domain.setDomainName(_ctx.stringValue("QueryDomainListResponse.Data["+ i +"].DomainName"));
			domain.setInstanceId(_ctx.stringValue("QueryDomainListResponse.Data["+ i +"].InstanceId"));
			domain.setExpirationDate(_ctx.stringValue("QueryDomainListResponse.Data["+ i +"].ExpirationDate"));
			domain.setRegistrationDate(_ctx.stringValue("QueryDomainListResponse.Data["+ i +"].RegistrationDate"));
			domain.setDomainType(_ctx.stringValue("QueryDomainListResponse.Data["+ i +"].DomainType"));
			domain.setDomainStatus(_ctx.stringValue("QueryDomainListResponse.Data["+ i +"].DomainStatus"));
			domain.setProductId(_ctx.stringValue("QueryDomainListResponse.Data["+ i +"].ProductId"));
			domain.setExpirationDateLong(_ctx.longValue("QueryDomainListResponse.Data["+ i +"].ExpirationDateLong"));
			domain.setRegistrationDateLong(_ctx.longValue("QueryDomainListResponse.Data["+ i +"].RegistrationDateLong"));
			domain.setPremium(_ctx.booleanValue("QueryDomainListResponse.Data["+ i +"].Premium"));
			domain.setDomainAuditStatus(_ctx.stringValue("QueryDomainListResponse.Data["+ i +"].DomainAuditStatus"));
			domain.setExpirationDateStatus(_ctx.stringValue("QueryDomainListResponse.Data["+ i +"].ExpirationDateStatus"));
			domain.setRegistrantType(_ctx.stringValue("QueryDomainListResponse.Data["+ i +"].RegistrantType"));
			domain.setDomainGroupId(_ctx.stringValue("QueryDomainListResponse.Data["+ i +"].DomainGroupId"));
			domain.setRemark(_ctx.stringValue("QueryDomainListResponse.Data["+ i +"].Remark"));
			domain.setDomainGroupName(_ctx.stringValue("QueryDomainListResponse.Data["+ i +"].DomainGroupName"));
			domain.setExpirationCurrDateDiff(_ctx.integerValue("QueryDomainListResponse.Data["+ i +"].ExpirationCurrDateDiff"));

			data.add(domain);
		}
		queryDomainListResponse.setData(data);
	 
	 	return queryDomainListResponse;
	}
}