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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.ListDialogueFlowsResponse;
import com.aliyuncs.outboundbot.model.v20191226.ListDialogueFlowsResponse.DialogueFlow;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDialogueFlowsResponseUnmarshaller {

	public static ListDialogueFlowsResponse unmarshall(ListDialogueFlowsResponse listDialogueFlowsResponse, UnmarshallerContext _ctx) {
		
		listDialogueFlowsResponse.setRequestId(_ctx.stringValue("ListDialogueFlowsResponse.RequestId"));
		listDialogueFlowsResponse.setSuccess(_ctx.booleanValue("ListDialogueFlowsResponse.Success"));
		listDialogueFlowsResponse.setCode(_ctx.stringValue("ListDialogueFlowsResponse.Code"));
		listDialogueFlowsResponse.setMessage(_ctx.stringValue("ListDialogueFlowsResponse.Message"));
		listDialogueFlowsResponse.setHttpStatusCode(_ctx.integerValue("ListDialogueFlowsResponse.HttpStatusCode"));

		List<DialogueFlow> dialogueFlows = new ArrayList<DialogueFlow>();
		for (int i = 0; i < _ctx.lengthValue("ListDialogueFlowsResponse.DialogueFlows.Length"); i++) {
			DialogueFlow dialogueFlow = new DialogueFlow();
			dialogueFlow.setDialogueFlowId(_ctx.stringValue("ListDialogueFlowsResponse.DialogueFlows["+ i +"].DialogueFlowId"));
			dialogueFlow.setDialogueFlowName(_ctx.stringValue("ListDialogueFlowsResponse.DialogueFlows["+ i +"].DialogueFlowName"));
			dialogueFlow.setScriptId(_ctx.stringValue("ListDialogueFlowsResponse.DialogueFlows["+ i +"].ScriptId"));
			dialogueFlow.setScriptVersion(_ctx.stringValue("ListDialogueFlowsResponse.DialogueFlows["+ i +"].ScriptVersion"));
			dialogueFlow.setDialogueFlowType(_ctx.stringValue("ListDialogueFlowsResponse.DialogueFlows["+ i +"].DialogueFlowType"));
			dialogueFlow.setDialogueFlowDefinition(_ctx.stringValue("ListDialogueFlowsResponse.DialogueFlows["+ i +"].DialogueFlowDefinition"));

			dialogueFlows.add(dialogueFlow);
		}
		listDialogueFlowsResponse.setDialogueFlows(dialogueFlows);
	 
	 	return listDialogueFlowsResponse;
	}
}