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

import com.aliyuncs.avatar.model.v20220130.SendCommandResponse;
import com.aliyuncs.avatar.model.v20220130.SendCommandResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SendCommandResponseUnmarshaller {

	public static SendCommandResponse unmarshall(SendCommandResponse sendCommandResponse, UnmarshallerContext _ctx) {
		
		sendCommandResponse.setRequestId(_ctx.stringValue("SendCommandResponse.RequestId"));
		sendCommandResponse.setCode(_ctx.stringValue("SendCommandResponse.Code"));
		sendCommandResponse.setMessage(_ctx.stringValue("SendCommandResponse.Message"));
		sendCommandResponse.setSuccess(_ctx.booleanValue("SendCommandResponse.Success"));

		Data data = new Data();
		data.setSessionId(_ctx.stringValue("SendCommandResponse.Data.SessionId"));
		data.setUniqueCode(_ctx.stringValue("SendCommandResponse.Data.UniqueCode"));
		sendCommandResponse.setData(data);
	 
	 	return sendCommandResponse;
	}
}