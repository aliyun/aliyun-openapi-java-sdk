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

package com.aliyuncs.outboundbot.model.v20191226;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.outboundbot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDialogueFlowRequest extends RpcAcsRequest<ModifyDialogueFlowResponse> {
	   

	private String scriptId;

	private String instanceId;

	private String dialogueFlowDefinition;

	private String dialogueFlowId;
	public ModifyDialogueFlowRequest() {
		super("OutboundBot", "2019-12-26", "ModifyDialogueFlow", "outboundbot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getScriptId() {
		return this.scriptId;
	}

	public void setScriptId(String scriptId) {
		this.scriptId = scriptId;
		if(scriptId != null){
			putQueryParameter("ScriptId", scriptId);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getDialogueFlowDefinition() {
		return this.dialogueFlowDefinition;
	}

	public void setDialogueFlowDefinition(String dialogueFlowDefinition) {
		this.dialogueFlowDefinition = dialogueFlowDefinition;
		if(dialogueFlowDefinition != null){
			putQueryParameter("DialogueFlowDefinition", dialogueFlowDefinition);
		}
	}

	public String getDialogueFlowId() {
		return this.dialogueFlowId;
	}

	public void setDialogueFlowId(String dialogueFlowId) {
		this.dialogueFlowId = dialogueFlowId;
		if(dialogueFlowId != null){
			putQueryParameter("DialogueFlowId", dialogueFlowId);
		}
	}

	@Override
	public Class<ModifyDialogueFlowResponse> getResponseClass() {
		return ModifyDialogueFlowResponse.class;
	}

}
