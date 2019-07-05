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

import com.aliyuncs.domain.model.v20180129.QueryDomainByInstanceIdResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDomainByInstanceIdResponseUnmarshaller {

	public static QueryDomainByInstanceIdResponse unmarshall(QueryDomainByInstanceIdResponse queryDomainByInstanceIdResponse, UnmarshallerContext _ctx) {
		
		queryDomainByInstanceIdResponse.setRequestId(_ctx.stringValue("QueryDomainByInstanceIdResponse.RequestId"));
		queryDomainByInstanceIdResponse.setUserId(_ctx.stringValue("QueryDomainByInstanceIdResponse.UserId"));
		queryDomainByInstanceIdResponse.setDomainName(_ctx.stringValue("QueryDomainByInstanceIdResponse.DomainName"));
		queryDomainByInstanceIdResponse.setInstanceId(_ctx.stringValue("QueryDomainByInstanceIdResponse.InstanceId"));
		queryDomainByInstanceIdResponse.setRegistrationDate(_ctx.stringValue("QueryDomainByInstanceIdResponse.RegistrationDate"));
		queryDomainByInstanceIdResponse.setExpirationDate(_ctx.stringValue("QueryDomainByInstanceIdResponse.ExpirationDate"));
		queryDomainByInstanceIdResponse.setRegistrantOrganization(_ctx.stringValue("QueryDomainByInstanceIdResponse.RegistrantOrganization"));
		queryDomainByInstanceIdResponse.setRegistrantName(_ctx.stringValue("QueryDomainByInstanceIdResponse.RegistrantName"));
		queryDomainByInstanceIdResponse.setEmail(_ctx.stringValue("QueryDomainByInstanceIdResponse.Email"));
		queryDomainByInstanceIdResponse.setUpdateProhibitionLock(_ctx.stringValue("QueryDomainByInstanceIdResponse.UpdateProhibitionLock"));
		queryDomainByInstanceIdResponse.setTransferProhibitionLock(_ctx.stringValue("QueryDomainByInstanceIdResponse.TransferProhibitionLock"));
		queryDomainByInstanceIdResponse.setDomainNameProxyService(_ctx.booleanValue("QueryDomainByInstanceIdResponse.DomainNameProxyService"));
		queryDomainByInstanceIdResponse.setPremium(_ctx.booleanValue("QueryDomainByInstanceIdResponse.Premium"));
		queryDomainByInstanceIdResponse.setEmailVerificationStatus(_ctx.integerValue("QueryDomainByInstanceIdResponse.EmailVerificationStatus"));
		queryDomainByInstanceIdResponse.setEmailVerificationClientHold(_ctx.booleanValue("QueryDomainByInstanceIdResponse.EmailVerificationClientHold"));
		queryDomainByInstanceIdResponse.setRealNameStatus(_ctx.stringValue("QueryDomainByInstanceIdResponse.RealNameStatus"));
		queryDomainByInstanceIdResponse.setRegistrantUpdatingStatus(_ctx.stringValue("QueryDomainByInstanceIdResponse.RegistrantUpdatingStatus"));
		queryDomainByInstanceIdResponse.setTransferOutStatus(_ctx.stringValue("QueryDomainByInstanceIdResponse.TransferOutStatus"));
		queryDomainByInstanceIdResponse.setRegistrantType(_ctx.stringValue("QueryDomainByInstanceIdResponse.RegistrantType"));
		queryDomainByInstanceIdResponse.setDomainNameVerificationStatus(_ctx.stringValue("QueryDomainByInstanceIdResponse.DomainNameVerificationStatus"));
		queryDomainByInstanceIdResponse.setZhRegistrantOrganization(_ctx.stringValue("QueryDomainByInstanceIdResponse.ZhRegistrantOrganization"));
		queryDomainByInstanceIdResponse.setZhRegistrantName(_ctx.stringValue("QueryDomainByInstanceIdResponse.ZhRegistrantName"));
		queryDomainByInstanceIdResponse.setRegistrationDateLong(_ctx.longValue("QueryDomainByInstanceIdResponse.RegistrationDateLong"));
		queryDomainByInstanceIdResponse.setExpirationDateLong(_ctx.longValue("QueryDomainByInstanceIdResponse.ExpirationDateLong"));

		List<String> dnsList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryDomainByInstanceIdResponse.DnsList.Length"); i++) {
			dnsList.add(_ctx.stringValue("QueryDomainByInstanceIdResponse.DnsList["+ i +"]"));
		}
		queryDomainByInstanceIdResponse.setDnsList(dnsList);
	 
	 	return queryDomainByInstanceIdResponse;
	}
}