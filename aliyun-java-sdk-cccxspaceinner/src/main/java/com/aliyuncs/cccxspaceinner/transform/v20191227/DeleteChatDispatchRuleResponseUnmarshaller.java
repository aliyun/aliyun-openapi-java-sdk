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

import com.aliyuncs.cccxspaceinner.model.v20191227.DeleteChatDispatchRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteChatDispatchRuleResponseUnmarshaller {

	public static DeleteChatDispatchRuleResponse unmarshall(DeleteChatDispatchRuleResponse deleteChatDispatchRuleResponse, UnmarshallerContext _ctx) {
		
		deleteChatDispatchRuleResponse.setRequestId(_ctx.stringValue("DeleteChatDispatchRuleResponse.RequestId"));
		deleteChatDispatchRuleResponse.setMessage(_ctx.stringValue("DeleteChatDispatchRuleResponse.Message"));
		deleteChatDispatchRuleResponse.setData(_ctx.longValue("DeleteChatDispatchRuleResponse.Data"));
		deleteChatDispatchRuleResponse.setCode(_ctx.stringValue("DeleteChatDispatchRuleResponse.Code"));
		deleteChatDispatchRuleResponse.setSuccess(_ctx.booleanValue("DeleteChatDispatchRuleResponse.Success"));
	 
	 	return deleteChatDispatchRuleResponse;
	}
}