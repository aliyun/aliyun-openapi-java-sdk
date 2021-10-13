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

package com.aliyuncs.idaas_doraemon.transform.v20210520;

import com.aliyuncs.idaas_doraemon.model.v20210520.GetAuthenticatorResponse;
import com.aliyuncs.idaas_doraemon.model.v20210520.GetAuthenticatorResponse.Authenticator;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAuthenticatorResponseUnmarshaller {

	public static GetAuthenticatorResponse unmarshall(GetAuthenticatorResponse getAuthenticatorResponse, UnmarshallerContext _ctx) {
		
		getAuthenticatorResponse.setRequestId(_ctx.stringValue("GetAuthenticatorResponse.RequestId"));

		Authenticator authenticator = new Authenticator();
		authenticator.setAuthenticatorUuid(_ctx.stringValue("GetAuthenticatorResponse.Authenticator.AuthenticatorUuid"));
		authenticator.setCredentialId(_ctx.stringValue("GetAuthenticatorResponse.Authenticator.CredentialId"));
		authenticator.setType(_ctx.stringValue("GetAuthenticatorResponse.Authenticator.Type"));
		authenticator.setAuthenticatorName(_ctx.stringValue("GetAuthenticatorResponse.Authenticator.AuthenticatorName"));
		authenticator.setRegisterTime(_ctx.longValue("GetAuthenticatorResponse.Authenticator.RegisterTime"));
		authenticator.setLastVerifyTime(_ctx.longValue("GetAuthenticatorResponse.Authenticator.LastVerifyTime"));
		authenticator.setRegisterSourceIp(_ctx.stringValue("GetAuthenticatorResponse.Authenticator.RegisterSourceIp"));
		authenticator.setLastVerifySourceIp(_ctx.stringValue("GetAuthenticatorResponse.Authenticator.LastVerifySourceIp"));
		authenticator.setLastVerifyUserAgent(_ctx.stringValue("GetAuthenticatorResponse.Authenticator.LastVerifyUserAgent"));
		authenticator.setCustomAuthenticator(_ctx.stringValue("GetAuthenticatorResponse.Authenticator.CustomAuthenticator"));
		getAuthenticatorResponse.setAuthenticator(authenticator);
	 
	 	return getAuthenticatorResponse;
	}
}