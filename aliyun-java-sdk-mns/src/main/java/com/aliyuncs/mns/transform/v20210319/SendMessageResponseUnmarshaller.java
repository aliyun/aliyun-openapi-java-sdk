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

package com.aliyuncs.mns.transform.v20210319;

import com.aliyuncs.mns.model.v20210319.SendMessageResponse;
import com.aliyuncs.mns.model.v20210319.SendMessageResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SendMessageResponseUnmarshaller {

	public static SendMessageResponse unmarshall(SendMessageResponse sendMessageResponse, UnmarshallerContext _ctx) {
		
		sendMessageResponse.setRequestId(_ctx.stringValue("SendMessageResponse.RequestId"));
		sendMessageResponse.setCode(_ctx.longValue("SendMessageResponse.Code"));
		sendMessageResponse.setStatus(_ctx.stringValue("SendMessageResponse.Status"));
		sendMessageResponse.setMessage(_ctx.stringValue("SendMessageResponse.Message"));
		sendMessageResponse.setSuccess(_ctx.booleanValue("SendMessageResponse.Success"));

		Data data = new Data();
		data.setMessageBodyMd5(_ctx.stringValue("SendMessageResponse.Data.MessageBodyMd5"));
		data.setMessageId(_ctx.stringValue("SendMessageResponse.Data.MessageId"));
		sendMessageResponse.setData(data);
	 
	 	return sendMessageResponse;
	}
}