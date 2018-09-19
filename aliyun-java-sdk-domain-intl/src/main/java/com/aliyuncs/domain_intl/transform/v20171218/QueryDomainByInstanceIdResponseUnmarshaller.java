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

import com.aliyuncs.domain_intl.model.v20171218.QueryDomainByInstanceIdResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDomainByInstanceIdResponseUnmarshaller {

	public static QueryDomainByInstanceIdResponse unmarshall(QueryDomainByInstanceIdResponse queryDomainByInstanceIdResponse, UnmarshallerContext context) {
		
		queryDomainByInstanceIdResponse.setUserId(context.stringValue("QueryDomainByInstanceIdResponse.UserId"));
		queryDomainByInstanceIdResponse.setDomainName(context.stringValue("QueryDomainByInstanceIdResponse.DomainName"));
		queryDomainByInstanceIdResponse.setInstanceId(context.stringValue("QueryDomainByInstanceIdResponse.InstanceId"));
		queryDomainByInstanceIdResponse.setRegistrationDate(context.stringValue("QueryDomainByInstanceIdResponse.RegistrationDate"));
		queryDomainByInstanceIdResponse.setExpirationDate(context.stringValue("QueryDomainByInstanceIdResponse.ExpirationDate"));
		queryDomainByInstanceIdResponse.setRegistrantOrganization(context.stringValue("QueryDomainByInstanceIdResponse.RegistrantOrganization"));
		queryDomainByInstanceIdResponse.setRegistrantName(context.stringValue("QueryDomainByInstanceIdResponse.RegistrantName"));
		queryDomainByInstanceIdResponse.setEmail(context.stringValue("QueryDomainByInstanceIdResponse.Email"));
		queryDomainByInstanceIdResponse.setUpdateProhibitionLock(context.stringValue("QueryDomainByInstanceIdResponse.UpdateProhibitionLock"));
		queryDomainByInstanceIdResponse.setTransferProhibitionLock(context.stringValue("QueryDomainByInstanceIdResponse.TransferProhibitionLock"));
		queryDomainByInstanceIdResponse.setDomainNameProxyService(context.booleanValue("QueryDomainByInstanceIdResponse.DomainNameProxyService"));
		queryDomainByInstanceIdResponse.setPremium(context.booleanValue("QueryDomainByInstanceIdResponse.Premium"));
		queryDomainByInstanceIdResponse.setEmailVerificationStatus(context.integerValue("QueryDomainByInstanceIdResponse.EmailVerificationStatus"));
		queryDomainByInstanceIdResponse.setEmailVerificationClientHold(context.booleanValue("QueryDomainByInstanceIdResponse.EmailVerificationClientHold"));

		List<String> dnsList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryDomainByInstanceIdResponse.DnsList.Length"); i++) {
			dnsList.add(context.stringValue("QueryDomainByInstanceIdResponse.DnsList["+ i +"]"));
		}
		queryDomainByInstanceIdResponse.setDnsList(dnsList);
	 
	 	return queryDomainByInstanceIdResponse;
	}
}