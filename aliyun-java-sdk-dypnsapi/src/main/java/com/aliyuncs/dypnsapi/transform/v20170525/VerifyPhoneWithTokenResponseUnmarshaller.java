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

package com.aliyuncs.dypnsapi.transform.v20170525;

import com.aliyuncs.dypnsapi.model.v20170525.VerifyPhoneWithTokenResponse;
import com.aliyuncs.dypnsapi.model.v20170525.VerifyPhoneWithTokenResponse.GateVerify;
import com.aliyuncs.transform.UnmarshallerContext;


public class VerifyPhoneWithTokenResponseUnmarshaller {

	public static VerifyPhoneWithTokenResponse unmarshall(VerifyPhoneWithTokenResponse verifyPhoneWithTokenResponse, UnmarshallerContext _ctx) {
		
		verifyPhoneWithTokenResponse.setRequestId(_ctx.stringValue("VerifyPhoneWithTokenResponse.RequestId"));
		verifyPhoneWithTokenResponse.setCode(_ctx.stringValue("VerifyPhoneWithTokenResponse.Code"));
		verifyPhoneWithTokenResponse.setMessage(_ctx.stringValue("VerifyPhoneWithTokenResponse.Message"));

		GateVerify gateVerify = new GateVerify();
		gateVerify.setVerifyResult(_ctx.stringValue("VerifyPhoneWithTokenResponse.GateVerify.VerifyResult"));
		gateVerify.setVerifyId(_ctx.stringValue("VerifyPhoneWithTokenResponse.GateVerify.VerifyId"));
		verifyPhoneWithTokenResponse.setGateVerify(gateVerify);
	 
	 	return verifyPhoneWithTokenResponse;
	}
}