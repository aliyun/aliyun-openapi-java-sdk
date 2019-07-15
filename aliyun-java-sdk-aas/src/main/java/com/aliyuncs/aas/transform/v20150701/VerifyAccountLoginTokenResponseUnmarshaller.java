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

package com.aliyuncs.aas.transform.v20150701;

import com.aliyuncs.aas.model.v20150701.VerifyAccountLoginTokenResponse;
import com.aliyuncs.aas.model.v20150701.VerifyAccountLoginTokenResponse.LoginToken;
import com.aliyuncs.transform.UnmarshallerContext;


public class VerifyAccountLoginTokenResponseUnmarshaller {

	public static VerifyAccountLoginTokenResponse unmarshall(VerifyAccountLoginTokenResponse verifyAccountLoginTokenResponse, UnmarshallerContext _ctx) {
		
		verifyAccountLoginTokenResponse.setRequestId(_ctx.stringValue("VerifyAccountLoginTokenResponse.RequestId"));

		LoginToken loginToken = new LoginToken();
		loginToken.setTargetPk(_ctx.stringValue("VerifyAccountLoginTokenResponse.LoginToken.TargetPk"));
		loginToken.setLoginTokenString(_ctx.stringValue("VerifyAccountLoginTokenResponse.LoginToken.LoginTokenString"));
		verifyAccountLoginTokenResponse.setLoginToken(loginToken);
	 
	 	return verifyAccountLoginTokenResponse;
	}
}