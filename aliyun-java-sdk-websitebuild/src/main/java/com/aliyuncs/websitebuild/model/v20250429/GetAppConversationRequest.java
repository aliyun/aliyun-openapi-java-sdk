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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetAppConversationRequest extends RpcAcsRequest<GetAppConversationResponse> {
	   

	private String conversationId;

	private String botId;
	public GetAppConversationRequest() {
		super("WebsiteBuild", "2025-04-29", "GetAppConversation");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
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

	public String getBotId() {
		return this.botId;
	}

	public void setBotId(String botId) {
		this.botId = botId;
		if(botId != null){
			putQueryParameter("BotId", botId);
		}
	}

	@Override
	public Class<GetAppConversationResponse> getResponseClass() {
		return GetAppConversationResponse.class;
	}

}
