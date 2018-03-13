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
package com.aliyuncs.cf.transform.v20151208;

import com.aliyuncs.cf.model.v20151208.AuthenticateResponse;
import com.aliyuncs.cf.model.v20151208.AuthenticateResponse.SigAuthenticateResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class AuthenticateResponseUnmarshaller {

	public static AuthenticateResponse unmarshall(AuthenticateResponse authenticateResponse, UnmarshallerContext context) {
		
		authenticateResponse.setRequestId(context.stringValue("AuthenticateResponse.RequestId"));
		authenticateResponse.setSuccess(context.booleanValue("AuthenticateResponse.Success"));
		authenticateResponse.setMsg(context.stringValue("AuthenticateResponse.Msg"));
		authenticateResponse.setCode(context.integerValue("AuthenticateResponse.Code"));

		SigAuthenticateResult sigAuthenticateResult = new SigAuthenticateResult();
		sigAuthenticateResult.setTimestamp(context.longValue("AuthenticateResponse.SigAuthenticateResult.Timestamp"));
		sigAuthenticateResult.setCode(context.integerValue("AuthenticateResponse.SigAuthenticateResult.Code"));
		sigAuthenticateResult.setMsg(context.stringValue("AuthenticateResponse.SigAuthenticateResult.Msg"));
		sigAuthenticateResult.setRisklevel(context.stringValue("AuthenticateResponse.SigAuthenticateResult.Risklevel"));
		authenticateResponse.setSigAuthenticateResult(sigAuthenticateResult);
	 
	 	return authenticateResponse;
	}
}