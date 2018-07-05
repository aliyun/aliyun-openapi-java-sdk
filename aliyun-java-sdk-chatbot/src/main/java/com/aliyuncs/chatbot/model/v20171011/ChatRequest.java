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

package com.aliyuncs.chatbot.model.v20171011;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class ChatRequest extends RpcAcsRequest<ChatResponse> {
	
	public ChatRequest() {
		super("Chatbot", "2017-10-11", "Chat", "beebot");
	}

	private String knowledgeId;

	private String senderId;

	private String instanceId;

	private String senderNick;

	private List<String> perspectives;

	private String sessionId;

	private String tag;

	private String utterance;

	public String getKnowledgeId() {
		return this.knowledgeId;
	}

	public void setKnowledgeId(String knowledgeId) {
		this.knowledgeId = knowledgeId;
		if(knowledgeId != null){
			putQueryParameter("KnowledgeId", knowledgeId);
		}
	}

	public String getSenderId() {
		return this.senderId;
	}

	public void setSenderId(String senderId) {
		this.senderId = senderId;
		if(senderId != null){
			putQueryParameter("SenderId", senderId);
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

	public String getSenderNick() {
		return this.senderNick;
	}

	public void setSenderNick(String senderNick) {
		this.senderNick = senderNick;
		if(senderNick != null){
			putQueryParameter("SenderNick", senderNick);
		}
	}

	public List<String> getPerspectives() {
		return this.perspectives;
	}

	public void setPerspectives(List<String> perspectives) {
		this.perspectives = perspectives;	
		if (perspectives != null) {
			for (int i = 0; i < perspectives.size(); i++) {
				putQueryParameter("Perspective." + (i + 1) , perspectives.get(i));
			}
		}	
	}

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
		if(sessionId != null){
			putQueryParameter("SessionId", sessionId);
		}
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
		if(tag != null){
			putQueryParameter("Tag", tag);
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
	public Class<ChatResponse> getResponseClass() {
		return ChatResponse.class;
	}

}
