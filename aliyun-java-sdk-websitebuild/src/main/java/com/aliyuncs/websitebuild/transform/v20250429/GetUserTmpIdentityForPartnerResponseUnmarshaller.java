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

package com.aliyuncs.websitebuild.transform.v20250429;

import com.aliyuncs.websitebuild.model.v20250429.GetUserTmpIdentityForPartnerResponse;
import com.aliyuncs.websitebuild.model.v20250429.GetUserTmpIdentityForPartnerResponse.Data;
import com.aliyuncs.websitebuild.model.v20250429.GetUserTmpIdentityForPartnerResponse.Data.Credentials;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserTmpIdentityForPartnerResponseUnmarshaller {

	public static GetUserTmpIdentityForPartnerResponse unmarshall(GetUserTmpIdentityForPartnerResponse getUserTmpIdentityForPartnerResponse, UnmarshallerContext _ctx) {
		
		getUserTmpIdentityForPartnerResponse.setRequestId(_ctx.stringValue("GetUserTmpIdentityForPartnerResponse.RequestId"));
		getUserTmpIdentityForPartnerResponse.setErrorMsg(_ctx.stringValue("GetUserTmpIdentityForPartnerResponse.ErrorMsg"));
		getUserTmpIdentityForPartnerResponse.setSuccess(_ctx.booleanValue("GetUserTmpIdentityForPartnerResponse.Success"));
		getUserTmpIdentityForPartnerResponse.setErrorCode(_ctx.stringValue("GetUserTmpIdentityForPartnerResponse.ErrorCode"));

		Data data = new Data();
		data.setHasCustomRoleAuth(_ctx.booleanValue("GetUserTmpIdentityForPartnerResponse.Data.HasCustomRoleAuth"));

		Credentials credentials = new Credentials();
		credentials.setEncryptedAccessKeyId(_ctx.stringValue("GetUserTmpIdentityForPartnerResponse.Data.Credentials.EncryptedAccessKeyId"));
		credentials.setEncryptedAccessKeySecret(_ctx.stringValue("GetUserTmpIdentityForPartnerResponse.Data.Credentials.EncryptedAccessKeySecret"));
		credentials.setEncryptedSecurityToken(_ctx.stringValue("GetUserTmpIdentityForPartnerResponse.Data.Credentials.EncryptedSecurityToken"));
		credentials.setExpiration(_ctx.stringValue("GetUserTmpIdentityForPartnerResponse.Data.Credentials.Expiration"));
		data.setCredentials(credentials);
		getUserTmpIdentityForPartnerResponse.setData(data);
	 
	 	return getUserTmpIdentityForPartnerResponse;
	}
}