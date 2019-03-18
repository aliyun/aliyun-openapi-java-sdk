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

package com.aliyuncs.trademark.transform.v20180724;

import com.aliyuncs.trademark.model.v20180724.QueryCredentialsInfoResponse;
import com.aliyuncs.trademark.model.v20180724.QueryCredentialsInfoResponse.CredentialsInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCredentialsInfoResponseUnmarshaller {

	public static QueryCredentialsInfoResponse unmarshall(QueryCredentialsInfoResponse queryCredentialsInfoResponse, UnmarshallerContext context) {
		
		queryCredentialsInfoResponse.setRequestId(context.stringValue("QueryCredentialsInfoResponse.RequestId"));

		CredentialsInfo credentialsInfo = new CredentialsInfo();
		credentialsInfo.setCardNumber(context.stringValue("QueryCredentialsInfoResponse.CredentialsInfo.CardNumber"));
		credentialsInfo.setAddress(context.stringValue("QueryCredentialsInfoResponse.CredentialsInfo.Address"));
		credentialsInfo.setCompanyName(context.stringValue("QueryCredentialsInfoResponse.CredentialsInfo.CompanyName"));
		credentialsInfo.setPersonName(context.stringValue("QueryCredentialsInfoResponse.CredentialsInfo.PersonName"));
		credentialsInfo.setProvince(context.stringValue("QueryCredentialsInfoResponse.CredentialsInfo.Province"));
		queryCredentialsInfoResponse.setCredentialsInfo(credentialsInfo);
	 
	 	return queryCredentialsInfoResponse;
	}
}