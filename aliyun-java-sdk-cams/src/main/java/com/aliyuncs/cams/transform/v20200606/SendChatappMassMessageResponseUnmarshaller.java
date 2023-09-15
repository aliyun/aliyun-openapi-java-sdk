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

import com.aliyuncs.cams.model.v20200606.SendChatappMassMessageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SendChatappMassMessageResponseUnmarshaller {

	public static SendChatappMassMessageResponse unmarshall(SendChatappMassMessageResponse sendChatappMassMessageResponse, UnmarshallerContext _ctx) {
		
		sendChatappMassMessageResponse.setRequestId(_ctx.stringValue("SendChatappMassMessageResponse.RequestId"));
		sendChatappMassMessageResponse.setCode(_ctx.stringValue("SendChatappMassMessageResponse.Code"));
		sendChatappMassMessageResponse.setMessage(_ctx.stringValue("SendChatappMassMessageResponse.Message"));
		sendChatappMassMessageResponse.setGroupMessageId(_ctx.stringValue("SendChatappMassMessageResponse.GroupMessageId"));
		sendChatappMassMessageResponse.setAccessDeniedDetail(_ctx.stringValue("SendChatappMassMessageResponse.AccessDeniedDetail"));
	 
	 	return sendChatappMassMessageResponse;
	}
}