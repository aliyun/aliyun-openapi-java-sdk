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

import com.aliyuncs.domain.model.v20180129.QueryDomainByDomainNameResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDomainByDomainNameResponseUnmarshaller {

	public static QueryDomainByDomainNameResponse unmarshall(QueryDomainByDomainNameResponse queryDomainByDomainNameResponse, UnmarshallerContext _ctx) {
		
		queryDomainByDomainNameResponse.setRequestId(_ctx.stringValue("QueryDomainByDomainNameResponse.RequestId"));
		queryDomainByDomainNameResponse.setEmail(_ctx.stringValue("QueryDomainByDomainNameResponse.Email"));
		queryDomainByDomainNameResponse.setRegistrationDate(_ctx.stringValue("QueryDomainByDomainNameResponse.RegistrationDate"));
		queryDomainByDomainNameResponse.setRegistrationDateLong(_ctx.longValue("QueryDomainByDomainNameResponse.RegistrationDateLong"));
		queryDomainByDomainNameResponse.setRealNameStatus(_ctx.stringValue("QueryDomainByDomainNameResponse.RealNameStatus"));
		queryDomainByDomainNameResponse.setPremium(_ctx.booleanValue("QueryDomainByDomainNameResponse.Premium"));
		queryDomainByDomainNameResponse.setDomainNameVerificationStatus(_ctx.stringValue("QueryDomainByDomainNameResponse.DomainNameVerificationStatus"));
		queryDomainByDomainNameResponse.setExpirationDateLong(_ctx.longValue("QueryDomainByDomainNameResponse.ExpirationDateLong"));
		queryDomainByDomainNameResponse.setTransferOutStatus(_ctx.stringValue("QueryDomainByDomainNameResponse.TransferOutStatus"));
		queryDomainByDomainNameResponse.setZhRegistrantOrganization(_ctx.stringValue("QueryDomainByDomainNameResponse.ZhRegistrantOrganization"));
		queryDomainByDomainNameResponse.setEmailVerificationClientHold(_ctx.booleanValue("QueryDomainByDomainNameResponse.EmailVerificationClientHold"));
		queryDomainByDomainNameResponse.setEmailVerificationStatus(_ctx.integerValue("QueryDomainByDomainNameResponse.EmailVerificationStatus"));
		queryDomainByDomainNameResponse.setRegistrantOrganization(_ctx.stringValue("QueryDomainByDomainNameResponse.RegistrantOrganization"));
		queryDomainByDomainNameResponse.setTransferProhibitionLock(_ctx.stringValue("QueryDomainByDomainNameResponse.TransferProhibitionLock"));
		queryDomainByDomainNameResponse.setDomainNameProxyService(_ctx.booleanValue("QueryDomainByDomainNameResponse.DomainNameProxyService"));
		queryDomainByDomainNameResponse.setRegistrantType(_ctx.stringValue("QueryDomainByDomainNameResponse.RegistrantType"));
		queryDomainByDomainNameResponse.setRegistrantUpdatingStatus(_ctx.stringValue("QueryDomainByDomainNameResponse.RegistrantUpdatingStatus"));
		queryDomainByDomainNameResponse.setDomainName(_ctx.stringValue("QueryDomainByDomainNameResponse.DomainName"));
		queryDomainByDomainNameResponse.setInstanceId(_ctx.stringValue("QueryDomainByDomainNameResponse.InstanceId"));
		queryDomainByDomainNameResponse.setZhRegistrantName(_ctx.stringValue("QueryDomainByDomainNameResponse.ZhRegistrantName"));
		queryDomainByDomainNameResponse.setExpirationDate(_ctx.stringValue("QueryDomainByDomainNameResponse.ExpirationDate"));
		queryDomainByDomainNameResponse.setRegistrantName(_ctx.stringValue("QueryDomainByDomainNameResponse.RegistrantName"));
		queryDomainByDomainNameResponse.setUserId(_ctx.stringValue("QueryDomainByDomainNameResponse.UserId"));
		queryDomainByDomainNameResponse.setUpdateProhibitionLock(_ctx.stringValue("QueryDomainByDomainNameResponse.UpdateProhibitionLock"));
		queryDomainByDomainNameResponse.setDomainGroupId(_ctx.longValue("QueryDomainByDomainNameResponse.DomainGroupId"));
		queryDomainByDomainNameResponse.setRemark(_ctx.stringValue("QueryDomainByDomainNameResponse.Remark"));
		queryDomainByDomainNameResponse.setDomainGroupName(_ctx.stringValue("QueryDomainByDomainNameResponse.DomainGroupName"));
		queryDomainByDomainNameResponse.setExpirationDateStatus(_ctx.stringValue("QueryDomainByDomainNameResponse.ExpirationDateStatus"));
		queryDomainByDomainNameResponse.setExpirationCurrDateDiff(_ctx.integerValue("QueryDomainByDomainNameResponse.ExpirationCurrDateDiff"));
		queryDomainByDomainNameResponse.setDomainType(_ctx.stringValue("QueryDomainByDomainNameResponse.DomainType"));
		queryDomainByDomainNameResponse.setDomainStatus(_ctx.stringValue("QueryDomainByDomainNameResponse.DomainStatus"));
		queryDomainByDomainNameResponse.setResourceGroupId(_ctx.stringValue("QueryDomainByDomainNameResponse.ResourceGroupId"));

		List<String> dnsList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryDomainByDomainNameResponse.DnsList.Length"); i++) {
			dnsList.add(_ctx.stringValue("QueryDomainByDomainNameResponse.DnsList["+ i +"]"));
		}
		queryDomainByDomainNameResponse.setDnsList(dnsList);
	 
	 	return queryDomainByDomainNameResponse;
	}
}