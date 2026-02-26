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

import com.aliyuncs.aimath.model.v20241114.CreateRelatedConversationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRelatedConversationResponseUnmarshaller {

	public static CreateRelatedConversationResponse unmarshall(CreateRelatedConversationResponse createRelatedConversationResponse, UnmarshallerContext _ctx) {
		
		createRelatedConversationResponse.setRequestId(_ctx.stringValue("CreateRelatedConversationResponse.RequestId"));
		createRelatedConversationResponse.setConversationId(_ctx.stringValue("CreateRelatedConversationResponse.ConversationId"));
		createRelatedConversationResponse.setErrCode(_ctx.stringValue("CreateRelatedConversationResponse.ErrCode"));
		createRelatedConversationResponse.setErrMsg(_ctx.stringValue("CreateRelatedConversationResponse.ErrMsg"));
		createRelatedConversationResponse.setSuccess(_ctx.booleanValue("CreateRelatedConversationResponse.Success"));
	 
	 	return createRelatedConversationResponse;
	}
}