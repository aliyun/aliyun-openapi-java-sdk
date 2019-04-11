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

	public static GetMessageCallbackResponse unmarshall(GetMessageCallbackResponse getMessageCallbackResponse, UnmarshallerContext context) {
		
		getMessageCallbackResponse.setRequestId(context.stringValue("GetMessageCallbackResponse.RequestId"));

		MessageCallback messageCallback = new MessageCallback();
		messageCallback.setCallbackType(context.stringValue("GetMessageCallbackResponse.MessageCallback.CallbackType"));
		messageCallback.setCallbackURL(context.stringValue("GetMessageCallbackResponse.MessageCallback.CallbackURL"));
		messageCallback.setEventTypeList(context.stringValue("GetMessageCallbackResponse.MessageCallback.EventTypeList"));
		messageCallback.setAuthSwitch(context.stringValue("GetMessageCallbackResponse.MessageCallback.AuthSwitch"));
		messageCallback.setAuthKey(context.stringValue("GetMessageCallbackResponse.MessageCallback.AuthKey"));
		messageCallback.setMnsEndpoint(context.stringValue("GetMessageCallbackResponse.MessageCallback.MnsEndpoint"));
		messageCallback.setMnsQueueName(context.stringValue("GetMessageCallbackResponse.MessageCallback.MnsQueueName"));
		messageCallback.setAppId(context.stringValue("GetMessageCallbackResponse.MessageCallback.AppId"));
		getMessageCallbackResponse.setMessageCallback(messageCallback);
	 
	 	return getMessageCallbackResponse;
	}
}