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

package com.aliyuncs.account_crm.transform.v20160606;

import com.aliyuncs.account_crm.model.v20160606.QueryEncryptedAccountProfileInfoResponse;
import com.aliyuncs.account_crm.model.v20160606.QueryEncryptedAccountProfileInfoResponse.EncryptedProfileInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryEncryptedAccountProfileInfoResponseUnmarshaller {

	public static QueryEncryptedAccountProfileInfoResponse unmarshall(QueryEncryptedAccountProfileInfoResponse queryEncryptedAccountProfileInfoResponse, UnmarshallerContext _ctx) {
		
		queryEncryptedAccountProfileInfoResponse.setRequestId(_ctx.stringValue("QueryEncryptedAccountProfileInfoResponse.RequestId"));

		EncryptedProfileInfo encryptedProfileInfo = new EncryptedProfileInfo();
		encryptedProfileInfo.setIsAliyunIdAnEmail(_ctx.booleanValue("QueryEncryptedAccountProfileInfoResponse.EncryptedProfileInfo.IsAliyunIdAnEmail"));
		encryptedProfileInfo.setEncryptedAliyunID(_ctx.stringValue("QueryEncryptedAccountProfileInfoResponse.EncryptedProfileInfo.EncryptedAliyunID"));
		encryptedProfileInfo.setEncryptedEmail(_ctx.stringValue("QueryEncryptedAccountProfileInfoResponse.EncryptedProfileInfo.EncryptedEmail"));
		encryptedProfileInfo.setEncryptedMobile(_ctx.stringValue("QueryEncryptedAccountProfileInfoResponse.EncryptedProfileInfo.EncryptedMobile"));
		encryptedProfileInfo.setEncryptedSecurityMobile(_ctx.stringValue("QueryEncryptedAccountProfileInfoResponse.EncryptedProfileInfo.EncryptedSecurityMobile"));
		encryptedProfileInfo.setPk(_ctx.stringValue("QueryEncryptedAccountProfileInfoResponse.EncryptedProfileInfo.pk"));
		queryEncryptedAccountProfileInfoResponse.setEncryptedProfileInfo(encryptedProfileInfo);
	 
	 	return queryEncryptedAccountProfileInfoResponse;
	}
}