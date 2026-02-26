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

package com.aliyuncs.cams.transform.v20200606;

import com.aliyuncs.cams.model.v20200606.ChatappPhoneNumberRegisterResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ChatappPhoneNumberRegisterResponseUnmarshaller {

	public static ChatappPhoneNumberRegisterResponse unmarshall(ChatappPhoneNumberRegisterResponse chatappPhoneNumberRegisterResponse, UnmarshallerContext _ctx) {
		
		chatappPhoneNumberRegisterResponse.setRequestId(_ctx.stringValue("ChatappPhoneNumberRegisterResponse.RequestId"));
		chatappPhoneNumberRegisterResponse.setAccessDeniedDetail(_ctx.stringValue("ChatappPhoneNumberRegisterResponse.AccessDeniedDetail"));
		chatappPhoneNumberRegisterResponse.setMessage(_ctx.stringValue("ChatappPhoneNumberRegisterResponse.Message"));
		chatappPhoneNumberRegisterResponse.setCode(_ctx.stringValue("ChatappPhoneNumberRegisterResponse.Code"));
		chatappPhoneNumberRegisterResponse.setSuccess(_ctx.booleanValue("ChatappPhoneNumberRegisterResponse.Success"));
	 
	 	return chatappPhoneNumberRegisterResponse;
	}
}