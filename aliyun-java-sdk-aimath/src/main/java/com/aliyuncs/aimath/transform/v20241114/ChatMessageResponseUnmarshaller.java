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

package com.aliyuncs.aimath.transform.v20241114;

import com.aliyuncs.aimath.model.v20241114.ChatMessageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ChatMessageResponseUnmarshaller {

	public static ChatMessageResponse unmarshall(ChatMessageResponse chatMessageResponse, UnmarshallerContext _ctx) {
		
		chatMessageResponse.setRequestId(_ctx.stringValue("ChatMessageResponse.RequestId"));
		chatMessageResponse.setEventType(_ctx.stringValue("ChatMessageResponse.EventType"));
		chatMessageResponse.setContent(_ctx.stringValue("ChatMessageResponse.Content"));
		chatMessageResponse.setSuccess(_ctx.booleanValue("ChatMessageResponse.Success"));
		chatMessageResponse.setErrMsg(_ctx.stringValue("ChatMessageResponse.ErrMsg"));
		chatMessageResponse.setErrCode(_ctx.stringValue("ChatMessageResponse.ErrCode"));
	 
	 	return chatMessageResponse;
	}
}