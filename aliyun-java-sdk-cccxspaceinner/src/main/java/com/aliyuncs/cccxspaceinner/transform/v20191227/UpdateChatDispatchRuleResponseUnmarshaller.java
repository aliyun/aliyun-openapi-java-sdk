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

package com.aliyuncs.cccxspaceinner.transform.v20191227;

import com.aliyuncs.cccxspaceinner.model.v20191227.UpdateChatDispatchRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateChatDispatchRuleResponseUnmarshaller {

	public static UpdateChatDispatchRuleResponse unmarshall(UpdateChatDispatchRuleResponse updateChatDispatchRuleResponse, UnmarshallerContext _ctx) {
		
		updateChatDispatchRuleResponse.setRequestId(_ctx.stringValue("UpdateChatDispatchRuleResponse.RequestId"));
		updateChatDispatchRuleResponse.setCode(_ctx.stringValue("UpdateChatDispatchRuleResponse.Code"));
		updateChatDispatchRuleResponse.setSuccess(_ctx.booleanValue("UpdateChatDispatchRuleResponse.Success"));
		updateChatDispatchRuleResponse.setMessage(_ctx.stringValue("UpdateChatDispatchRuleResponse.Message"));
		updateChatDispatchRuleResponse.setData(_ctx.stringValue("UpdateChatDispatchRuleResponse.Data"));
	 
	 	return updateChatDispatchRuleResponse;
	}
}