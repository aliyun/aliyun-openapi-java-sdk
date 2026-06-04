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
import java.util.List;
import java.util.Map;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateAIStaffChatRequest extends RpcAcsRequest<CreateAIStaffChatResponse> {
	   

	private Map<String,String> metaData;

	private String chatId;

	private String conversationId;

	private String bizId;

	private List<Messages> messagess;
	public CreateAIStaffChatRequest() {
		super("WebsiteBuild", "2025-04-29", "CreateAIStaffChat");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Map<String,String> getMetaData() {
		return this.metaData;
	}

	public void setMetaData(Map<String,String> metaData) {
		this.metaData = metaData;	
		if (metaData != null) {
			for (String key1: metaData.keySet() ) {
				putBodyParameter("MetaData.#" + key1.length() + "#" + key1 , metaData.get(key1));
			}
		}	
	}

	public String getChatId() {
		return this.chatId;
	}

	public void setChatId(String chatId) {
		this.chatId = chatId;
		if(chatId != null){
			putBodyParameter("ChatId", chatId);
		}
	}

	public String getConversationId() {
		return this.conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
		if(conversationId != null){
			putBodyParameter("ConversationId", conversationId);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putBodyParameter("BizId", bizId);
		}
	}

	public List<Messages> getMessagess() {
		return this.messagess;
	}

	public void setMessagess(List<Messages> messagess) {
		this.messagess = messagess;	
		if (messagess != null) {
			for (int depth1 = 0; depth1 < messagess.size(); depth1++) {
				putBodyParameter("Messages." + (depth1 + 1) + ".MetaData" , messagess.get(depth1).getMetaData());
				putBodyParameter("Messages." + (depth1 + 1) + ".Role" , messagess.get(depth1).getRole());
				putBodyParameter("Messages." + (depth1 + 1) + ".Type" , messagess.get(depth1).getType());
				putBodyParameter("Messages." + (depth1 + 1) + ".Content" , messagess.get(depth1).getContent());
				putBodyParameter("Messages." + (depth1 + 1) + ".ContentType" , messagess.get(depth1).getContentType());
			}
		}	
	}

	public static class Messages {

		private Map<String, Object> metaData;

		private String role;

		private String type;

		private String content;

		private String contentType;

		public Map<String, Object> getMetaData() {
			return this.metaData;
		}

		public void setMetaData(Map<String, Object> metaData) {
			this.metaData = metaData;
		}

		public String getRole() {
			return this.role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getContentType() {
			return this.contentType;
		}

		public void setContentType(String contentType) {
			this.contentType = contentType;
		}
	}

	@Override
	public Class<CreateAIStaffChatResponse> getResponseClass() {
		return CreateAIStaffChatResponse.class;
	}

}
