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

package com.aliyuncs.websitebuild.model.v20250429;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ReconnectAppChatRequest extends RpcAcsRequest<ReconnectAppChatResponse> {
	   

	private String chatId;

	private String conversationId;

	private Integer lastEventId;
	public ReconnectAppChatRequest() {
		super("WebsiteBuild", "2025-04-29", "ReconnectAppChat");
		setMethod(MethodType.POST);
	}

	public String getChatId() {
		return this.chatId;
	}

	public void setChatId(String chatId) {
		this.chatId = chatId;
		if(chatId != null){
			putQueryParameter("ChatId", chatId);
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

	public Integer getLastEventId() {
		return this.lastEventId;
	}

	public void setLastEventId(Integer lastEventId) {
		this.lastEventId = lastEventId;
		if(lastEventId != null){
			putQueryParameter("LastEventId", lastEventId.toString());
		}
	}

	@Override
	public Class<ReconnectAppChatResponse> getResponseClass() {
		return ReconnectAppChatResponse.class;
	}

}
