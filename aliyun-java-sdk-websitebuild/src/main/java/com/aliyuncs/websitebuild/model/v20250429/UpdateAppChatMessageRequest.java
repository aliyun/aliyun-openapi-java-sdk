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
public class UpdateAppChatMessageRequest extends RpcAcsRequest<UpdateAppChatMessageResponse> {
	   

	private String conversationId;

	private String messageId;

	private String addedMetaData;

	private String content;
	public UpdateAppChatMessageRequest() {
		super("WebsiteBuild", "2025-04-29", "UpdateAppChatMessage");
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

	public String getMessageId() {
		return this.messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
		if(messageId != null){
			putQueryParameter("MessageId", messageId);
		}
	}

	public String getAddedMetaData() {
		return this.addedMetaData;
	}

	public void setAddedMetaData(String addedMetaData) {
		this.addedMetaData = addedMetaData;
		if(addedMetaData != null){
			putQueryParameter("AddedMetaData", addedMetaData);
		}
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putQueryParameter("Content", content);
		}
	}

	@Override
	public Class<UpdateAppChatMessageResponse> getResponseClass() {
		return UpdateAppChatMessageResponse.class;
	}

}
