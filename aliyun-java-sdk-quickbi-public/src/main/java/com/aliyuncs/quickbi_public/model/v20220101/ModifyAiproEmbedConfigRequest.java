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

package com.aliyuncs.quickbi_public.model.v20220101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyAiproEmbedConfigRequest extends RpcAcsRequest<ModifyAiproEmbedConfigResponse> {
	   

	private Integer uploadEnabled;

	private String showName;

	private String aiProId;

	private Integer chatHistoryStatus;

	private Integer memoryEnabled;

	private String agentName;

	private String config;
	public ModifyAiproEmbedConfigRequest() {
		super("quickbi-public", "2022-01-01", "ModifyAiproEmbedConfig", "QuickBI");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Integer getUploadEnabled() {
		return this.uploadEnabled;
	}

	public void setUploadEnabled(Integer uploadEnabled) {
		this.uploadEnabled = uploadEnabled;
		if(uploadEnabled != null){
			putQueryParameter("UploadEnabled", uploadEnabled.toString());
		}
	}

	public String getShowName() {
		return this.showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
		if(showName != null){
			putQueryParameter("ShowName", showName);
		}
	}

	public String getAiProId() {
		return this.aiProId;
	}

	public void setAiProId(String aiProId) {
		this.aiProId = aiProId;
		if(aiProId != null){
			putQueryParameter("AiProId", aiProId);
		}
	}

	public Integer getChatHistoryStatus() {
		return this.chatHistoryStatus;
	}

	public void setChatHistoryStatus(Integer chatHistoryStatus) {
		this.chatHistoryStatus = chatHistoryStatus;
		if(chatHistoryStatus != null){
			putQueryParameter("ChatHistoryStatus", chatHistoryStatus.toString());
		}
	}

	public Integer getMemoryEnabled() {
		return this.memoryEnabled;
	}

	public void setMemoryEnabled(Integer memoryEnabled) {
		this.memoryEnabled = memoryEnabled;
		if(memoryEnabled != null){
			putQueryParameter("MemoryEnabled", memoryEnabled.toString());
		}
	}

	public String getAgentName() {
		return this.agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
		if(agentName != null){
			putQueryParameter("AgentName", agentName);
		}
	}

	public String getConfig() {
		return this.config;
	}

	public void setConfig(String config) {
		this.config = config;
		if(config != null){
			putQueryParameter("Config", config);
		}
	}

	@Override
	public Class<ModifyAiproEmbedConfigResponse> getResponseClass() {
		return ModifyAiproEmbedConfigResponse.class;
	}

}
