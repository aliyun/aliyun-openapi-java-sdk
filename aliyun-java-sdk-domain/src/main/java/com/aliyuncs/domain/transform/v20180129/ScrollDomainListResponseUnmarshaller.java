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

	public static ScrollDomainListResponse unmarshall(ScrollDomainListResponse scrollDomainListResponse, UnmarshallerContext _ctx) {
		
		scrollDomainListResponse.setRequestId(_ctx.stringValue("ScrollDomainListResponse.RequestId"));
		scrollDomainListResponse.setTotalItemNum(_ctx.integerValue("ScrollDomainListResponse.TotalItemNum"));
		scrollDomainListResponse.setPageSize(_ctx.integerValue("ScrollDomainListResponse.PageSize"));
		scrollDomainListResponse.setScrollId(_ctx.stringValue("ScrollDomainListResponse.ScrollId"));

		List<Domain> data = new ArrayList<Domain>();
		for (int i = 0; i < _ctx.lengthValue("ScrollDomainListResponse.Data.Length"); i++) {
			Domain domain = new Domain();
			domain.setDomainName(_ctx.stringValue("ScrollDomainListResponse.Data["+ i +"].DomainName"));
			domain.setInstanceId(_ctx.stringValue("ScrollDomainListResponse.Data["+ i +"].InstanceId"));
			domain.setExpirationDate(_ctx.stringValue("ScrollDomainListResponse.Data["+ i +"].ExpirationDate"));
			domain.setRegistrationDate(_ctx.stringValue("ScrollDomainListResponse.Data["+ i +"].RegistrationDate"));
			domain.setDomainType(_ctx.stringValue("ScrollDomainListResponse.Data["+ i +"].DomainType"));
			domain.setDomainStatus(_ctx.stringValue("ScrollDomainListResponse.Data["+ i +"].DomainStatus"));
			domain.setProductId(_ctx.stringValue("ScrollDomainListResponse.Data["+ i +"].ProductId"));
			domain.setExpirationDateLong(_ctx.longValue("ScrollDomainListResponse.Data["+ i +"].ExpirationDateLong"));
			domain.setRegistrationDateLong(_ctx.longValue("ScrollDomainListResponse.Data["+ i +"].RegistrationDateLong"));
			domain.setPremium(_ctx.booleanValue("ScrollDomainListResponse.Data["+ i +"].Premium"));
			domain.setDomainAuditStatus(_ctx.stringValue("ScrollDomainListResponse.Data["+ i +"].DomainAuditStatus"));
			domain.setExpirationDateStatus(_ctx.stringValue("ScrollDomainListResponse.Data["+ i +"].ExpirationDateStatus"));
			domain.setRegistrantType(_ctx.stringValue("ScrollDomainListResponse.Data["+ i +"].RegistrantType"));
			domain.setDomainGroupId(_ctx.stringValue("ScrollDomainListResponse.Data["+ i +"].DomainGroupId"));
			domain.setRemark(_ctx.stringValue("ScrollDomainListResponse.Data["+ i +"].Remark"));
			domain.setDomainGroupName(_ctx.stringValue("ScrollDomainListResponse.Data["+ i +"].DomainGroupName"));
			domain.setExpirationCurrDateDiff(_ctx.integerValue("ScrollDomainListResponse.Data["+ i +"].ExpirationCurrDateDiff"));
			domain.setEmail(_ctx.stringValue("ScrollDomainListResponse.Data["+ i +"].Email"));
			domain.setZhRegistrantOrganization(_ctx.stringValue("ScrollDomainListResponse.Data["+ i +"].ZhRegistrantOrganization"));
			domain.setRegistrantOrganization(_ctx.stringValue("ScrollDomainListResponse.Data["+ i +"].RegistrantOrganization"));

			List<String> dnsList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ScrollDomainListResponse.Data["+ i +"].DnsList.Length"); j++) {
				dnsList.add(_ctx.stringValue("ScrollDomainListResponse.Data["+ i +"].DnsList["+ j +"]"));
			}
			domain.setDnsList(dnsList);

			data.add(domain);
		}
		scrollDomainListResponse.setData(data);
	 
	 	return scrollDomainListResponse;
	}
}