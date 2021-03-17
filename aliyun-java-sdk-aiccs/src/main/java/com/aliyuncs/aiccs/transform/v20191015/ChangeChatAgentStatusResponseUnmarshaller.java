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

package com.aliyuncs.aiccs.transform.v20191015;

import com.aliyuncs.aiccs.model.v20191015.ChangeChatAgentStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ChangeChatAgentStatusResponseUnmarshaller {

	public static ChangeChatAgentStatusResponse unmarshall(ChangeChatAgentStatusResponse changeChatAgentStatusResponse, UnmarshallerContext _ctx) {
		
		changeChatAgentStatusResponse.setRequestId(_ctx.stringValue("ChangeChatAgentStatusResponse.RequestId"));
		changeChatAgentStatusResponse.setMessage(_ctx.stringValue("ChangeChatAgentStatusResponse.Message"));
		changeChatAgentStatusResponse.setHttpStatusCode(_ctx.integerValue("ChangeChatAgentStatusResponse.HttpStatusCode"));
		changeChatAgentStatusResponse.setData(_ctx.stringValue("ChangeChatAgentStatusResponse.Data"));
		changeChatAgentStatusResponse.setCode(_ctx.stringValue("ChangeChatAgentStatusResponse.Code"));
		changeChatAgentStatusResponse.setSuccess(_ctx.booleanValue("ChangeChatAgentStatusResponse.Success"));
	 
	 	return changeChatAgentStatusResponse;
	}
}