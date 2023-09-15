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

import com.aliyuncs.cams.model.v20200606.AddChatappPhoneNumberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddChatappPhoneNumberResponseUnmarshaller {

	public static AddChatappPhoneNumberResponse unmarshall(AddChatappPhoneNumberResponse addChatappPhoneNumberResponse, UnmarshallerContext _ctx) {
		
		addChatappPhoneNumberResponse.setRequestId(_ctx.stringValue("AddChatappPhoneNumberResponse.RequestId"));
		addChatappPhoneNumberResponse.setCode(_ctx.stringValue("AddChatappPhoneNumberResponse.Code"));
		addChatappPhoneNumberResponse.setMessage(_ctx.stringValue("AddChatappPhoneNumberResponse.Message"));
		addChatappPhoneNumberResponse.setAccessDeniedDetail(_ctx.stringValue("AddChatappPhoneNumberResponse.AccessDeniedDetail"));
	 
	 	return addChatappPhoneNumberResponse;
	}
}