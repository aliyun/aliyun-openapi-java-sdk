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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.GetPrivacyNumberAccountResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetPrivacyNumberAccountResponse.PrivacyNumberAccount;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPrivacyNumberAccountResponseUnmarshaller {

	public static GetPrivacyNumberAccountResponse unmarshall(GetPrivacyNumberAccountResponse getPrivacyNumberAccountResponse, UnmarshallerContext context) {
		
		getPrivacyNumberAccountResponse.setRequestId(context.stringValue("GetPrivacyNumberAccountResponse.RequestId"));
		getPrivacyNumberAccountResponse.setSuccess(context.booleanValue("GetPrivacyNumberAccountResponse.Success"));
		getPrivacyNumberAccountResponse.setCode(context.stringValue("GetPrivacyNumberAccountResponse.Code"));
		getPrivacyNumberAccountResponse.setMessage(context.stringValue("GetPrivacyNumberAccountResponse.Message"));
		getPrivacyNumberAccountResponse.setHttpStatusCode(context.integerValue("GetPrivacyNumberAccountResponse.HttpStatusCode"));

		PrivacyNumberAccount privacyNumberAccount = new PrivacyNumberAccount();
		privacyNumberAccount.setProviderId(context.stringValue("GetPrivacyNumberAccountResponse.PrivacyNumberAccount.ProviderId"));
		privacyNumberAccount.setAccountId(context.stringValue("GetPrivacyNumberAccountResponse.PrivacyNumberAccount.AccountId"));
		privacyNumberAccount.setAuthToken(context.stringValue("GetPrivacyNumberAccountResponse.PrivacyNumberAccount.AuthToken"));
		privacyNumberAccount.setAliyunUid(context.longValue("GetPrivacyNumberAccountResponse.PrivacyNumberAccount.AliyunUid"));
		getPrivacyNumberAccountResponse.setPrivacyNumberAccount(privacyNumberAccount);
	 
	 	return getPrivacyNumberAccountResponse;
	}
}