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

package com.aliyuncs.bailianchatbot.model.v20241105;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SseChatRequest extends RpcAcsRequest<SseChatResponse> {
	   

	private String sessionId;

	private String command;

	private String vendorParam;

	private String senderId;

	private String appId;

	private String senderNick;

	private String utterance;

	private String workspaceId;
	public SseChatRequest() {
		super("BailianChatBot", "2024-11-05", "SseChat");
		setMethod(MethodType.POST);
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

	public String getCommand() {
		return this.command;
	}

	public void setCommand(String command) {
		this.command = command;
		if(command != null){
			putQueryParameter("Command", command);
		}
	}

	public String getVendorParam() {
		return this.vendorParam;
	}

	public void setVendorParam(String vendorParam) {
		this.vendorParam = vendorParam;
		if(vendorParam != null){
			putQueryParameter("VendorParam", vendorParam);
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

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
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

	public String getUtterance() {
		return this.utterance;
	}

	public void setUtterance(String utterance) {
		this.utterance = utterance;
		if(utterance != null){
			putQueryParameter("Utterance", utterance);
		}
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putQueryParameter("WorkspaceId", workspaceId);
		}
	}

	@Override
	public Class<SseChatResponse> getResponseClass() {
		return SseChatResponse.class;
	}

}
