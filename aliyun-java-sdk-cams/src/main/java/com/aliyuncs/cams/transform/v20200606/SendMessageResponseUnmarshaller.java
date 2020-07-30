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

import com.aliyuncs.cams.model.v20200606.SendMessageResponse;
import com.aliyuncs.cams.model.v20200606.SendMessageResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class SendMessageResponseUnmarshaller {

	public static SendMessageResponse unmarshall(SendMessageResponse sendMessageResponse, UnmarshallerContext _ctx) {
		
		sendMessageResponse.setRequestId(_ctx.stringValue("SendMessageResponse.RequestId"));
		sendMessageResponse.setResultCode(_ctx.stringValue("SendMessageResponse.ResultCode"));
		sendMessageResponse.setResultMessage(_ctx.stringValue("SendMessageResponse.ResultMessage"));

		Module module = new Module();
		module.setFromId(_ctx.stringValue("SendMessageResponse.Module.FromId"));
		module.setToId(_ctx.stringValue("SendMessageResponse.Module.ToId"));
		module.setMessageId(_ctx.stringValue("SendMessageResponse.Module.MessageId"));
		sendMessageResponse.setModule(module);
	 
	 	return sendMessageResponse;
	}
}