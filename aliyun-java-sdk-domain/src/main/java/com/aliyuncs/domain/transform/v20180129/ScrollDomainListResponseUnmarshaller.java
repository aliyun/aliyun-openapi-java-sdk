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

import com.aliyuncs.domain.model.v20180129.ScrollDomainListResponse;
import com.aliyuncs.domain.model.v20180129.ScrollDomainListResponse.Domain;
import com.aliyuncs.transform.UnmarshallerContext;


public class ScrollDomainListResponseUnmarshaller {

	public static ScrollDomainListResponse unmarshall(ScrollDomainListResponse scrollDomainListResponse, UnmarshallerContext context) {
		
		scrollDomainListResponse.setRequestId(context.stringValue("ScrollDomainListResponse.RequestId"));
		scrollDomainListResponse.setTotalItemNum(context.integerValue("ScrollDomainListResponse.TotalItemNum"));
		scrollDomainListResponse.setPageSize(context.integerValue("ScrollDomainListResponse.PageSize"));
		scrollDomainListResponse.setScrollId(context.stringValue("ScrollDomainListResponse.ScrollId"));

		List<Domain> data = new ArrayList<Domain>();
		for (int i = 0; i < context.lengthValue("ScrollDomainListResponse.Data.Length"); i++) {
			Domain domain = new Domain();
			domain.setDomainName(context.stringValue("ScrollDomainListResponse.Data["+ i +"].DomainName"));
			domain.setInstanceId(context.stringValue("ScrollDomainListResponse.Data["+ i +"].InstanceId"));
			domain.setExpirationDate(context.stringValue("ScrollDomainListResponse.Data["+ i +"].ExpirationDate"));
			domain.setRegistrationDate(context.stringValue("ScrollDomainListResponse.Data["+ i +"].RegistrationDate"));
			domain.setDomainType(context.stringValue("ScrollDomainListResponse.Data["+ i +"].DomainType"));
			domain.setDomainStatus(context.stringValue("ScrollDomainListResponse.Data["+ i +"].DomainStatus"));
			domain.setProductId(context.stringValue("ScrollDomainListResponse.Data["+ i +"].ProductId"));
			domain.setExpirationDateLong(context.longValue("ScrollDomainListResponse.Data["+ i +"].ExpirationDateLong"));
			domain.setRegistrationDateLong(context.longValue("ScrollDomainListResponse.Data["+ i +"].RegistrationDateLong"));
			domain.setPremium(context.booleanValue("ScrollDomainListResponse.Data["+ i +"].Premium"));
			domain.setDomainAuditStatus(context.stringValue("ScrollDomainListResponse.Data["+ i +"].DomainAuditStatus"));
			domain.setExpirationDateStatus(context.stringValue("ScrollDomainListResponse.Data["+ i +"].ExpirationDateStatus"));
			domain.setRegistrantType(context.stringValue("ScrollDomainListResponse.Data["+ i +"].RegistrantType"));
			domain.setDomainGroupId(context.stringValue("ScrollDomainListResponse.Data["+ i +"].DomainGroupId"));
			domain.setRemark(context.stringValue("ScrollDomainListResponse.Data["+ i +"].Remark"));
			domain.setDomainGroupName(context.stringValue("ScrollDomainListResponse.Data["+ i +"].DomainGroupName"));
			domain.setExpirationCurrDateDiff(context.integerValue("ScrollDomainListResponse.Data["+ i +"].ExpirationCurrDateDiff"));
			domain.setEmail(context.stringValue("ScrollDomainListResponse.Data["+ i +"].Email"));
			domain.setZhRegistrantOrganization(context.stringValue("ScrollDomainListResponse.Data["+ i +"].ZhRegistrantOrganization"));
			domain.setRegistrantOrganization(context.stringValue("ScrollDomainListResponse.Data["+ i +"].RegistrantOrganization"));

			List<String> dnsList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ScrollDomainListResponse.Data["+ i +"].DnsList.Length"); j++) {
				dnsList.add(context.stringValue("ScrollDomainListResponse.Data["+ i +"].DnsList["+ j +"]"));
			}
			domain.setDnsList(dnsList);

			data.add(domain);
		}
		scrollDomainListResponse.setData(data);
	 
	 	return scrollDomainListResponse;
	}
}