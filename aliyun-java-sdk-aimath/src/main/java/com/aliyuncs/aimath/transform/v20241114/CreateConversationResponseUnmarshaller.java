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

package com.aliyuncs.aimath.transform.v20241114;

import com.aliyuncs.aimath.model.v20241114.CreateConversationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateConversationResponseUnmarshaller {

	public static CreateConversationResponse unmarshall(CreateConversationResponse createConversationResponse, UnmarshallerContext _ctx) {
		
		createConversationResponse.setRequestId(_ctx.stringValue("CreateConversationResponse.RequestId"));
		createConversationResponse.setConversationId(_ctx.stringValue("CreateConversationResponse.ConversationId"));
		createConversationResponse.setErrCode(_ctx.stringValue("CreateConversationResponse.ErrCode"));
		createConversationResponse.setErrMsg(_ctx.stringValue("CreateConversationResponse.ErrMsg"));
		createConversationResponse.setSuccess(_ctx.booleanValue("CreateConversationResponse.Success"));
	 
	 	return createConversationResponse;
	}
}