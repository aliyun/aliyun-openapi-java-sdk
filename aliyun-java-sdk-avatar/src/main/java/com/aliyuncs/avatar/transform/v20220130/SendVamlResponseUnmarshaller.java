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

import com.aliyuncs.avatar.model.v20220130.SendVamlResponse;
import com.aliyuncs.avatar.model.v20220130.SendVamlResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SendVamlResponseUnmarshaller {

	public static SendVamlResponse unmarshall(SendVamlResponse sendVamlResponse, UnmarshallerContext _ctx) {
		
		sendVamlResponse.setRequestId(_ctx.stringValue("SendVamlResponse.RequestId"));
		sendVamlResponse.setCode(_ctx.stringValue("SendVamlResponse.Code"));
		sendVamlResponse.setMessage(_ctx.stringValue("SendVamlResponse.Message"));
		sendVamlResponse.setSuccess(_ctx.booleanValue("SendVamlResponse.Success"));

		Data data = new Data();
		data.setSessionId(_ctx.stringValue("SendVamlResponse.Data.SessionId"));
		data.setUniqueCode(_ctx.stringValue("SendVamlResponse.Data.UniqueCode"));
		sendVamlResponse.setData(data);
	 
	 	return sendVamlResponse;
	}
}