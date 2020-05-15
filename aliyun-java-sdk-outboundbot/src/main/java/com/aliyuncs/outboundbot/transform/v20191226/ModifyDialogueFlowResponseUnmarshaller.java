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

import com.aliyuncs.outboundbot.model.v20191226.ModifyDialogueFlowResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyDialogueFlowResponseUnmarshaller {

	public static ModifyDialogueFlowResponse unmarshall(ModifyDialogueFlowResponse modifyDialogueFlowResponse, UnmarshallerContext _ctx) {
		
		modifyDialogueFlowResponse.setRequestId(_ctx.stringValue("ModifyDialogueFlowResponse.RequestId"));
		modifyDialogueFlowResponse.setSuccess(_ctx.booleanValue("ModifyDialogueFlowResponse.Success"));
		modifyDialogueFlowResponse.setCode(_ctx.stringValue("ModifyDialogueFlowResponse.Code"));
		modifyDialogueFlowResponse.setMessage(_ctx.stringValue("ModifyDialogueFlowResponse.Message"));
		modifyDialogueFlowResponse.setHttpStatusCode(_ctx.integerValue("ModifyDialogueFlowResponse.HttpStatusCode"));
		modifyDialogueFlowResponse.setDialogueFlowId(_ctx.stringValue("ModifyDialogueFlowResponse.DialogueFlowId"));
		modifyDialogueFlowResponse.setDialogueFlowDefinition(_ctx.stringValue("ModifyDialogueFlowResponse.DialogueFlowDefinition"));
	 
	 	return modifyDialogueFlowResponse;
	}
}