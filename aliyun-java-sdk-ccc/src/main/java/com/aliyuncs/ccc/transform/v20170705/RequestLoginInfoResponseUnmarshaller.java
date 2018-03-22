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

package com.aliyuncs.ccc.transform.v20170705;

import com.aliyuncs.ccc.model.v20170705.RequestLoginInfoResponse;
import com.aliyuncs.ccc.model.v20170705.RequestLoginInfoResponse.LoginInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class RequestLoginInfoResponseUnmarshaller {

	public static RequestLoginInfoResponse unmarshall(RequestLoginInfoResponse requestLoginInfoResponse, UnmarshallerContext context) {
		
		requestLoginInfoResponse.setRequestId(context.stringValue("RequestLoginInfoResponse.RequestId"));
		requestLoginInfoResponse.setSuccess(context.booleanValue("RequestLoginInfoResponse.Success"));
		requestLoginInfoResponse.setCode(context.stringValue("RequestLoginInfoResponse.Code"));
		requestLoginInfoResponse.setMessage(context.stringValue("RequestLoginInfoResponse.Message"));
		requestLoginInfoResponse.setHttpStatusCode(context.integerValue("RequestLoginInfoResponse.HttpStatusCode"));

		LoginInfo loginInfo = new LoginInfo();
		loginInfo.setUserName(context.stringValue("RequestLoginInfoResponse.LoginInfo.UserName"));
		loginInfo.setDisplayName(context.stringValue("RequestLoginInfoResponse.LoginInfo.DisplayName"));
		loginInfo.setPhoneNumber(context.stringValue("RequestLoginInfoResponse.LoginInfo.PhoneNumber"));
		loginInfo.setRegion(context.stringValue("RequestLoginInfoResponse.LoginInfo.Region"));
		loginInfo.setWebRtcUrl(context.stringValue("RequestLoginInfoResponse.LoginInfo.WebRtcUrl"));
		loginInfo.setAgentServerUrl(context.stringValue("RequestLoginInfoResponse.LoginInfo.AgentServerUrl"));
		loginInfo.setExtension(context.stringValue("RequestLoginInfoResponse.LoginInfo.Extension"));
		loginInfo.setTenantId(context.stringValue("RequestLoginInfoResponse.LoginInfo.TenantId"));
		loginInfo.setSignature(context.stringValue("RequestLoginInfoResponse.LoginInfo.Signature"));
		loginInfo.setSignData(context.stringValue("RequestLoginInfoResponse.LoginInfo.SignData"));
		requestLoginInfoResponse.setLoginInfo(loginInfo);
	 
	 	return requestLoginInfoResponse;
	}
}