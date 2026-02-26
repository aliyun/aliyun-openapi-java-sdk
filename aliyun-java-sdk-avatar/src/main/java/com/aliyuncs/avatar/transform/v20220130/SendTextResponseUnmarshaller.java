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

import com.aliyuncs.avatar.model.v20220130.SendTextResponse;
import com.aliyuncs.avatar.model.v20220130.SendTextResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SendTextResponseUnmarshaller {

	public static SendTextResponse unmarshall(SendTextResponse sendTextResponse, UnmarshallerContext _ctx) {
		
		sendTextResponse.setRequestId(_ctx.stringValue("SendTextResponse.RequestId"));
		sendTextResponse.setCode(_ctx.stringValue("SendTextResponse.Code"));
		sendTextResponse.setMessage(_ctx.stringValue("SendTextResponse.Message"));
		sendTextResponse.setSuccess(_ctx.booleanValue("SendTextResponse.Success"));

		Data data = new Data();
		data.setSessionId(_ctx.stringValue("SendTextResponse.Data.SessionId"));
		data.setUniqueCode(_ctx.stringValue("SendTextResponse.Data.UniqueCode"));
		sendTextResponse.setData(data);
	 
	 	return sendTextResponse;
	}
}