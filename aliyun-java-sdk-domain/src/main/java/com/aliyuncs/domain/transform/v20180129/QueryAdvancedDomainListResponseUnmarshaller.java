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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAdvancedDomainListResponseUnmarshaller {

	public static QueryAdvancedDomainListResponse unmarshall(QueryAdvancedDomainListResponse queryAdvancedDomainListResponse, UnmarshallerContext context) {
		
		queryAdvancedDomainListResponse.setRequestId(context.stringValue("QueryAdvancedDomainListResponse.RequestId"));
		queryAdvancedDomainListResponse.setTotalItemNum(context.integerValue("QueryAdvancedDomainListResponse.TotalItemNum"));
		queryAdvancedDomainListResponse.setCurrentPageNum(context.integerValue("QueryAdvancedDomainListResponse.CurrentPageNum"));
		queryAdvancedDomainListResponse.setTotalPageNum(context.integerValue("QueryAdvancedDomainListResponse.TotalPageNum"));
		queryAdvancedDomainListResponse.setPageSize(context.integerValue("QueryAdvancedDomainListResponse.PageSize"));
		queryAdvancedDomainListResponse.setPrePage(context.booleanValue("QueryAdvancedDomainListResponse.PrePage"));
		queryAdvancedDomainListResponse.setNextPage(context.booleanValue("QueryAdvancedDomainListResponse.NextPage"));

		List<Domain> data = new ArrayList<Domain>();
		for (int i = 0; i < context.lengthValue("QueryAdvancedDomainListResponse.Data.Length"); i++) {
			Domain domain = new Domain();
			domain.setDomainName(context.stringValue("QueryAdvancedDomainListResponse.Data["+ i +"].DomainName"));
			domain.setInstanceId(context.stringValue("QueryAdvancedDomainListResponse.Data["+ i +"].InstanceId"));
			domain.setExpirationDate(context.stringValue("QueryAdvancedDomainListResponse.Data["+ i +"].ExpirationDate"));
			domain.setRegistrationDate(context.stringValue("QueryAdvancedDomainListResponse.Data["+ i +"].RegistrationDate"));
			domain.setDomainType(context.stringValue("QueryAdvancedDomainListResponse.Data["+ i +"].DomainType"));
			domain.setDomainStatus(context.stringValue("QueryAdvancedDomainListResponse.Data["+ i +"].DomainStatus"));
			domain.setProductId(context.stringValue("QueryAdvancedDomainListResponse.Data["+ i +"].ProductId"));
			domain.setExpirationDateLong(context.longValue("QueryAdvancedDomainListResponse.Data["+ i +"].ExpirationDateLong"));
			domain.setRegistrationDateLong(context.longValue("QueryAdvancedDomainListResponse.Data["+ i +"].RegistrationDateLong"));
			domain.setPremium(context.booleanValue("QueryAdvancedDomainListResponse.Data["+ i +"].Premium"));
			domain.setDomainAuditStatus(context.stringValue("QueryAdvancedDomainListResponse.Data["+ i +"].DomainAuditStatus"));
			domain.setExpirationDateStatus(context.stringValue("QueryAdvancedDomainListResponse.Data["+ i +"].ExpirationDateStatus"));
			domain.setRegistrantType(context.stringValue("QueryAdvancedDomainListResponse.Data["+ i +"].RegistrantType"));
			domain.setDomainGroupId(context.stringValue("QueryAdvancedDomainListResponse.Data["+ i +"].DomainGroupId"));
			domain.setRemark(context.stringValue("QueryAdvancedDomainListResponse.Data["+ i +"].Remark"));
			domain.setDomainGroupName(context.stringValue("QueryAdvancedDomainListResponse.Data["+ i +"].DomainGroupName"));
			domain.setExpirationCurrDateDiff(context.integerValue("QueryAdvancedDomainListResponse.Data["+ i +"].ExpirationCurrDateDiff"));
			domain.setEmail(context.stringValue("QueryAdvancedDomainListResponse.Data["+ i +"].Email"));
			domain.setZhRegistrantOrganization(context.stringValue("QueryAdvancedDomainListResponse.Data["+ i +"].ZhRegistrantOrganization"));
			domain.setRegistrantOrganization(context.stringValue("QueryAdvancedDomainListResponse.Data["+ i +"].RegistrantOrganization"));

			List<String> dnsList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("QueryAdvancedDomainListResponse.Data["+ i +"].DnsList.Length"); j++) {
				dnsList.add(context.stringValue("QueryAdvancedDomainListResponse.Data["+ i +"].DnsList["+ j +"]"));
			}
			domain.setDnsList(dnsList);

			data.add(domain);
		}
		queryAdvancedDomainListResponse.setData(data);
	 
	 	return queryAdvancedDomainListResponse;
	}
}