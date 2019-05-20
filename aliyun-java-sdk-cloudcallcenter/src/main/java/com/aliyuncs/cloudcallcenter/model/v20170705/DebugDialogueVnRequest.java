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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DebugDialogueVnRequest extends RpcAcsRequest<DebugDialogueVnResponse> {
	
	public DebugDialogueVnRequest() {
		super("CloudCallCenter", "2017-07-05", "DebugDialogueVn", "CloudCallCenter", "innerAPI");
	}

	private String instanceId;

	private String additionalContext;

	private String conversationId;

	private String utterance;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getAdditionalContext() {
		return this.additionalContext;
	}

	public void setAdditionalContext(String additionalContext) {
		this.additionalContext = additionalContext;
		if(additionalContext != null){
			putQueryParameter("AdditionalContext", additionalContext);
		}
	}

	public String getConversationId() {
		return this.conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
		if(conversationId != null){
			putQueryParameter("ConversationId", conversationId);
		}
	}

	public String getUtterance() {
		return this.utterance;
	}

	public void setUtterance(String utterance) {
		this.utterance = utterance;
		if(utterance != null){
			putQueryParameter("Utterance", utterance);
		}
	}

	@Override
	public Class<DebugDialogueVnResponse> getResponseClass() {
		return DebugDialogueVnResponse.class;
	}

}
