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
		queryDomainByDomainNameResponse.setUserId(_ctx.stringValue("QueryDomainByDomainNameResponse.UserId"));
		queryDomainByDomainNameResponse.setDomainName(_ctx.stringValue("QueryDomainByDomainNameResponse.DomainName"));
		queryDomainByDomainNameResponse.setInstanceId(_ctx.stringValue("QueryDomainByDomainNameResponse.InstanceId"));
		queryDomainByDomainNameResponse.setRegistrationDate(_ctx.stringValue("QueryDomainByDomainNameResponse.RegistrationDate"));
		queryDomainByDomainNameResponse.setExpirationDate(_ctx.stringValue("QueryDomainByDomainNameResponse.ExpirationDate"));
		queryDomainByDomainNameResponse.setRegistrantOrganization(_ctx.stringValue("QueryDomainByDomainNameResponse.RegistrantOrganization"));
		queryDomainByDomainNameResponse.setRegistrantName(_ctx.stringValue("QueryDomainByDomainNameResponse.RegistrantName"));
		queryDomainByDomainNameResponse.setEmail(_ctx.stringValue("QueryDomainByDomainNameResponse.Email"));
		queryDomainByDomainNameResponse.setUpdateProhibitionLock(_ctx.stringValue("QueryDomainByDomainNameResponse.UpdateProhibitionLock"));
		queryDomainByDomainNameResponse.setTransferProhibitionLock(_ctx.stringValue("QueryDomainByDomainNameResponse.TransferProhibitionLock"));
		queryDomainByDomainNameResponse.setDomainNameProxyService(_ctx.booleanValue("QueryDomainByDomainNameResponse.DomainNameProxyService"));
		queryDomainByDomainNameResponse.setPremium(_ctx.booleanValue("QueryDomainByDomainNameResponse.Premium"));
		queryDomainByDomainNameResponse.setEmailVerificationStatus(_ctx.integerValue("QueryDomainByDomainNameResponse.EmailVerificationStatus"));
		queryDomainByDomainNameResponse.setEmailVerificationClientHold(_ctx.booleanValue("QueryDomainByDomainNameResponse.EmailVerificationClientHold"));
		queryDomainByDomainNameResponse.setRealNameStatus(_ctx.stringValue("QueryDomainByDomainNameResponse.RealNameStatus"));
		queryDomainByDomainNameResponse.setRegistrantUpdatingStatus(_ctx.stringValue("QueryDomainByDomainNameResponse.RegistrantUpdatingStatus"));
		queryDomainByDomainNameResponse.setTransferOutStatus(_ctx.stringValue("QueryDomainByDomainNameResponse.TransferOutStatus"));
		queryDomainByDomainNameResponse.setRegistrantType(_ctx.stringValue("QueryDomainByDomainNameResponse.RegistrantType"));
		queryDomainByDomainNameResponse.setDomainNameVerificationStatus(_ctx.stringValue("QueryDomainByDomainNameResponse.DomainNameVerificationStatus"));
		queryDomainByDomainNameResponse.setZhRegistrantOrganization(_ctx.stringValue("QueryDomainByDomainNameResponse.ZhRegistrantOrganization"));
		queryDomainByDomainNameResponse.setZhRegistrantName(_ctx.stringValue("QueryDomainByDomainNameResponse.ZhRegistrantName"));
		queryDomainByDomainNameResponse.setRegistrationDateLong(_ctx.longValue("QueryDomainByDomainNameResponse.RegistrationDateLong"));
		queryDomainByDomainNameResponse.setExpirationDateLong(_ctx.longValue("QueryDomainByDomainNameResponse.ExpirationDateLong"));

		List<String> dnsList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryDomainByDomainNameResponse.DnsList.Length"); i++) {
			dnsList.add(_ctx.stringValue("QueryDomainByDomainNameResponse.DnsList["+ i +"]"));
		}
		queryDomainByDomainNameResponse.setDnsList(dnsList);
	 
	 	return queryDomainByDomainNameResponse;
	}
}