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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.CreateDialogueFlowResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDialogueFlowResponseUnmarshaller {

	public static CreateDialogueFlowResponse unmarshall(CreateDialogueFlowResponse createDialogueFlowResponse, UnmarshallerContext _ctx) {
		
		createDialogueFlowResponse.setRequestId(_ctx.stringValue("CreateDialogueFlowResponse.RequestId"));
		createDialogueFlowResponse.setSuccess(_ctx.booleanValue("CreateDialogueFlowResponse.Success"));
		createDialogueFlowResponse.setCode(_ctx.stringValue("CreateDialogueFlowResponse.Code"));
		createDialogueFlowResponse.setMessage(_ctx.stringValue("CreateDialogueFlowResponse.Message"));
		createDialogueFlowResponse.setHttpStatusCode(_ctx.integerValue("CreateDialogueFlowResponse.HttpStatusCode"));
		createDialogueFlowResponse.setDialogueFlowId(_ctx.stringValue("CreateDialogueFlowResponse.DialogueFlowId"));
	 
	 	return createDialogueFlowResponse;
	}
}