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

import com.aliyuncs.domain.model.v20180129.QueryAdvancedDomainListResponse;
import com.aliyuncs.domain.model.v20180129.QueryAdvancedDomainListResponse.Domain;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAdvancedDomainListResponseUnmarshaller {

	public static QueryAdvancedDomainListResponse unmarshall(QueryAdvancedDomainListResponse queryAdvancedDomainListResponse, UnmarshallerContext _ctx) {
		
		queryAdvancedDomainListResponse.setRequestId(_ctx.stringValue("QueryAdvancedDomainListResponse.RequestId"));
		queryAdvancedDomainListResponse.setTotalItemNum(_ctx.integerValue("QueryAdvancedDomainListResponse.TotalItemNum"));
		queryAdvancedDomainListResponse.setCurrentPageNum(_ctx.integerValue("QueryAdvancedDomainListResponse.CurrentPageNum"));
		queryAdvancedDomainListResponse.setTotalPageNum(_ctx.integerValue("QueryAdvancedDomainListResponse.TotalPageNum"));
		queryAdvancedDomainListResponse.setPageSize(_ctx.integerValue("QueryAdvancedDomainListResponse.PageSize"));
		queryAdvancedDomainListResponse.setPrePage(_ctx.booleanValue("QueryAdvancedDomainListResponse.PrePage"));
		queryAdvancedDomainListResponse.setNextPage(_ctx.booleanValue("QueryAdvancedDomainListResponse.NextPage"));

		List<Domain> data = new ArrayList<Domain>();
		for (int i = 0; i < _ctx.lengthValue("QueryAdvancedDomainListResponse.Data.Length"); i++) {
			Domain domain = new Domain();
			domain.setDomainName(_ctx.stringValue("QueryAdvancedDomainListResponse.Data["+ i +"].DomainName"));
			domain.setInstanceId(_ctx.stringValue("QueryAdvancedDomainListResponse.Data["+ i +"].InstanceId"));
			domain.setExpirationDate(_ctx.stringValue("QueryAdvancedDomainListResponse.Data["+ i +"].ExpirationDate"));
			domain.setRegistrationDate(_ctx.stringValue("QueryAdvancedDomainListResponse.Data["+ i +"].RegistrationDate"));
			domain.setDomainType(_ctx.stringValue("QueryAdvancedDomainListResponse.Data["+ i +"].DomainType"));
			domain.setDomainStatus(_ctx.stringValue("QueryAdvancedDomainListResponse.Data["+ i +"].DomainStatus"));
			domain.setProductId(_ctx.stringValue("QueryAdvancedDomainListResponse.Data["+ i +"].ProductId"));
			domain.setExpirationDateLong(_ctx.longValue("QueryAdvancedDomainListResponse.Data["+ i +"].ExpirationDateLong"));
			domain.setRegistrationDateLong(_ctx.longValue("QueryAdvancedDomainListResponse.Data["+ i +"].RegistrationDateLong"));
			domain.setPremium(_ctx.booleanValue("QueryAdvancedDomainListResponse.Data["+ i +"].Premium"));
			domain.setDomainAuditStatus(_ctx.stringValue("QueryAdvancedDomainListResponse.Data["+ i +"].DomainAuditStatus"));
			domain.setExpirationDateStatus(_ctx.stringValue("QueryAdvancedDomainListResponse.Data["+ i +"].ExpirationDateStatus"));
			domain.setRegistrantType(_ctx.stringValue("QueryAdvancedDomainListResponse.Data["+ i +"].RegistrantType"));
			domain.setDomainGroupId(_ctx.stringValue("QueryAdvancedDomainListResponse.Data["+ i +"].DomainGroupId"));
			domain.setRemark(_ctx.stringValue("QueryAdvancedDomainListResponse.Data["+ i +"].Remark"));
			domain.setDomainGroupName(_ctx.stringValue("QueryAdvancedDomainListResponse.Data["+ i +"].DomainGroupName"));
			domain.setExpirationCurrDateDiff(_ctx.integerValue("QueryAdvancedDomainListResponse.Data["+ i +"].ExpirationCurrDateDiff"));
			domain.setEmail(_ctx.stringValue("QueryAdvancedDomainListResponse.Data["+ i +"].Email"));
			domain.setZhRegistrantOrganization(_ctx.stringValue("QueryAdvancedDomainListResponse.Data["+ i +"].ZhRegistrantOrganization"));
			domain.setRegistrantOrganization(_ctx.stringValue("QueryAdvancedDomainListResponse.Data["+ i +"].RegistrantOrganization"));

			List<String> dnsList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryAdvancedDomainListResponse.Data["+ i +"].DnsList.Length"); j++) {
				dnsList.add(_ctx.stringValue("QueryAdvancedDomainListResponse.Data["+ i +"].DnsList["+ j +"]"));
			}
			domain.setDnsList(dnsList);

			data.add(domain);
		}
		queryAdvancedDomainListResponse.setData(data);
	 
	 	return queryAdvancedDomainListResponse;
	}
}