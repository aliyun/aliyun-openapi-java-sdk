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

package com.aliyuncs.avatar.transform.v20220130;

import com.aliyuncs.avatar.model.v20220130.SendMessageResponse;
import com.aliyuncs.avatar.model.v20220130.SendMessageResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SendMessageResponseUnmarshaller {

	public static SendMessageResponse unmarshall(SendMessageResponse sendMessageResponse, UnmarshallerContext _ctx) {
		
		sendMessageResponse.setCode(_ctx.stringValue("SendMessageResponse.Code"));
		sendMessageResponse.setMessage(_ctx.stringValue("SendMessageResponse.Message"));
		sendMessageResponse.setSuccess(_ctx.booleanValue("SendMessageResponse.Success"));

		Data data = new Data();
		data.setRequestId(_ctx.stringValue("SendMessageResponse.Data.RequestId"));
		data.setSessionId(_ctx.stringValue("SendMessageResponse.Data.SessionId"));
		sendMessageResponse.setData(data);
	 
	 	return sendMessageResponse;
	}
}