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

	public static QueryDomainByDomainNameResponse unmarshall(QueryDomainByDomainNameResponse queryDomainByDomainNameResponse, UnmarshallerContext context) {
		
		queryDomainByDomainNameResponse.setRequestId(context.stringValue("QueryDomainByDomainNameResponse.RequestId"));
		queryDomainByDomainNameResponse.setUserId(context.stringValue("QueryDomainByDomainNameResponse.UserId"));
		queryDomainByDomainNameResponse.setDomainName(context.stringValue("QueryDomainByDomainNameResponse.DomainName"));
		queryDomainByDomainNameResponse.setInstanceId(context.stringValue("QueryDomainByDomainNameResponse.InstanceId"));
		queryDomainByDomainNameResponse.setRegistrationDate(context.stringValue("QueryDomainByDomainNameResponse.RegistrationDate"));
		queryDomainByDomainNameResponse.setExpirationDate(context.stringValue("QueryDomainByDomainNameResponse.ExpirationDate"));
		queryDomainByDomainNameResponse.setRegistrantOrganization(context.stringValue("QueryDomainByDomainNameResponse.RegistrantOrganization"));
		queryDomainByDomainNameResponse.setRegistrantName(context.stringValue("QueryDomainByDomainNameResponse.RegistrantName"));
		queryDomainByDomainNameResponse.setEmail(context.stringValue("QueryDomainByDomainNameResponse.Email"));
		queryDomainByDomainNameResponse.setUpdateProhibitionLock(context.stringValue("QueryDomainByDomainNameResponse.UpdateProhibitionLock"));
		queryDomainByDomainNameResponse.setTransferProhibitionLock(context.stringValue("QueryDomainByDomainNameResponse.TransferProhibitionLock"));
		queryDomainByDomainNameResponse.setDomainNameProxyService(context.booleanValue("QueryDomainByDomainNameResponse.DomainNameProxyService"));
		queryDomainByDomainNameResponse.setPremium(context.booleanValue("QueryDomainByDomainNameResponse.Premium"));
		queryDomainByDomainNameResponse.setEmailVerificationStatus(context.integerValue("QueryDomainByDomainNameResponse.EmailVerificationStatus"));
		queryDomainByDomainNameResponse.setEmailVerificationClientHold(context.booleanValue("QueryDomainByDomainNameResponse.EmailVerificationClientHold"));
		queryDomainByDomainNameResponse.setRealNameStatus(context.stringValue("QueryDomainByDomainNameResponse.RealNameStatus"));
		queryDomainByDomainNameResponse.setRegistrantUpdatingStatus(context.stringValue("QueryDomainByDomainNameResponse.RegistrantUpdatingStatus"));
		queryDomainByDomainNameResponse.setTransferOutStatus(context.stringValue("QueryDomainByDomainNameResponse.TransferOutStatus"));
		queryDomainByDomainNameResponse.setRegistrantType(context.stringValue("QueryDomainByDomainNameResponse.RegistrantType"));
		queryDomainByDomainNameResponse.setDomainNameVerificationStatus(context.stringValue("QueryDomainByDomainNameResponse.DomainNameVerificationStatus"));
		queryDomainByDomainNameResponse.setZhRegistrantOrganization(context.stringValue("QueryDomainByDomainNameResponse.ZhRegistrantOrganization"));
		queryDomainByDomainNameResponse.setZhRegistrantName(context.stringValue("QueryDomainByDomainNameResponse.ZhRegistrantName"));
		queryDomainByDomainNameResponse.setRegistrationDateLong(context.longValue("QueryDomainByDomainNameResponse.RegistrationDateLong"));
		queryDomainByDomainNameResponse.setExpirationDateLong(context.longValue("QueryDomainByDomainNameResponse.ExpirationDateLong"));

		List<String> dnsList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryDomainByDomainNameResponse.DnsList.Length"); i++) {
			dnsList.add(context.stringValue("QueryDomainByDomainNameResponse.DnsList["+ i +"]"));
		}
		queryDomainByDomainNameResponse.setDnsList(dnsList);
	 
	 	return queryDomainByDomainNameResponse;
	}
}