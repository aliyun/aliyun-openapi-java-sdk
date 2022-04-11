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

package com.aliyuncs.vod.transform.v20170321;

import com.aliyuncs.vod.model.v20170321.GetMessageCallbackResponse;
import com.aliyuncs.vod.model.v20170321.GetMessageCallbackResponse.MessageCallback;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMessageCallbackResponseUnmarshaller {

	public static GetMessageCallbackResponse unmarshall(GetMessageCallbackResponse getMessageCallbackResponse, UnmarshallerContext _ctx) {
		
		getMessageCallbackResponse.setRequestId(_ctx.stringValue("GetMessageCallbackResponse.RequestId"));

		MessageCallback messageCallback = new MessageCallback();
		messageCallback.setCallbackType(_ctx.stringValue("GetMessageCallbackResponse.MessageCallback.CallbackType"));
		messageCallback.setCallbackURL(_ctx.stringValue("GetMessageCallbackResponse.MessageCallback.CallbackURL"));
		messageCallback.setEventTypeList(_ctx.stringValue("GetMessageCallbackResponse.MessageCallback.EventTypeList"));
		messageCallback.setAppId(_ctx.stringValue("GetMessageCallbackResponse.MessageCallback.AppId"));
		messageCallback.setMnsQueueName(_ctx.stringValue("GetMessageCallbackResponse.MessageCallback.MnsQueueName"));
		messageCallback.setAuthKey(_ctx.stringValue("GetMessageCallbackResponse.MessageCallback.AuthKey"));
		messageCallback.setAuthSwitch(_ctx.stringValue("GetMessageCallbackResponse.MessageCallback.AuthSwitch"));
		messageCallback.setMnsEndpoint(_ctx.stringValue("GetMessageCallbackResponse.MessageCallback.MnsEndpoint"));
		getMessageCallbackResponse.setMessageCallback(messageCallback);
	 
	 	return getMessageCallbackResponse;
	}
}