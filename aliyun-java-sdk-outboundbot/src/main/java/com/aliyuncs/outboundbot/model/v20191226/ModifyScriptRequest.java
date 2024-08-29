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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.outboundbot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyScriptRequest extends RpcAcsRequest<ModifyScriptResponse> {
	   

	private String chatConfig;

	private String ttsConfig;

	private String industry;

	private String scriptName;

	private String nluEngine;

	private String scene;

	private String scriptId;

	private String nluAccessType;

	private List<String> scriptWaveforms;

	private String asrConfig;

	private Boolean agentLlm;

	private String miniPlaybackConfigListJsonString;

	private Boolean emotionEnable;

	private Long agentId;

	private String nlsConfig;

	private Boolean newBargeInEnable;

	private String agentKey;

	private Boolean miniPlaybackEnable;

	private String chatbotId;

	private String instanceId;

	private String scriptDescription;

	private Boolean longWaitEnable;

	private List<String> scriptContents;
	public ModifyScriptRequest() {
		super("OutboundBot", "2019-12-26", "ModifyScript", "outboundbot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getChatConfig() {
		return this.chatConfig;
	}

	public void setChatConfig(String chatConfig) {
		this.chatConfig = chatConfig;
		if(chatConfig != null){
			putQueryParameter("ChatConfig", chatConfig);
		}
	}

	public String getTtsConfig() {
		return this.ttsConfig;
	}

	public void setTtsConfig(String ttsConfig) {
		this.ttsConfig = ttsConfig;
		if(ttsConfig != null){
			putQueryParameter("TtsConfig", ttsConfig);
		}
	}

	public String getIndustry() {
		return this.industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
		if(industry != null){
			putQueryParameter("Industry", industry);
		}
	}

	public String getScriptName() {
		return this.scriptName;
	}

	public void setScriptName(String scriptName) {
		this.scriptName = scriptName;
		if(scriptName != null){
			putQueryParameter("ScriptName", scriptName);
		}
	}

	public String getNluEngine() {
		return this.nluEngine;
	}

	public void setNluEngine(String nluEngine) {
		this.nluEngine = nluEngine;
		if(nluEngine != null){
			putQueryParameter("NluEngine", nluEngine);
		}
	}

	public String getScene() {
		return this.scene;
	}

	public void setScene(String scene) {
		this.scene = scene;
		if(scene != null){
			putQueryParameter("Scene", scene);
		}
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

	public String getNluAccessType() {
		return this.nluAccessType;
	}

	public void setNluAccessType(String nluAccessType) {
		this.nluAccessType = nluAccessType;
		if(nluAccessType != null){
			putQueryParameter("NluAccessType", nluAccessType);
		}
	}

	public List<String> getScriptWaveforms() {
		return this.scriptWaveforms;
	}

	public void setScriptWaveforms(List<String> scriptWaveforms) {
		this.scriptWaveforms = scriptWaveforms;	
		if (scriptWaveforms != null) {
			for (int i = 0; i < scriptWaveforms.size(); i++) {
				putQueryParameter("ScriptWaveform." + (i + 1) , scriptWaveforms.get(i));
			}
		}	
	}

	public String getAsrConfig() {
		return this.asrConfig;
	}

	public void setAsrConfig(String asrConfig) {
		this.asrConfig = asrConfig;
		if(asrConfig != null){
			putQueryParameter("AsrConfig", asrConfig);
		}
	}

	public Boolean getAgentLlm() {
		return this.agentLlm;
	}

	public void setAgentLlm(Boolean agentLlm) {
		this.agentLlm = agentLlm;
		if(agentLlm != null){
			putQueryParameter("AgentLlm", agentLlm.toString());
		}
	}

	public String getMiniPlaybackConfigListJsonString() {
		return this.miniPlaybackConfigListJsonString;
	}

	public void setMiniPlaybackConfigListJsonString(String miniPlaybackConfigListJsonString) {
		this.miniPlaybackConfigListJsonString = miniPlaybackConfigListJsonString;
		if(miniPlaybackConfigListJsonString != null){
			putQueryParameter("MiniPlaybackConfigListJsonString", miniPlaybackConfigListJsonString);
		}
	}

	public Boolean getEmotionEnable() {
		return this.emotionEnable;
	}

	public void setEmotionEnable(Boolean emotionEnable) {
		this.emotionEnable = emotionEnable;
		if(emotionEnable != null){
			putQueryParameter("EmotionEnable", emotionEnable.toString());
		}
	}

	public Long getAgentId() {
		return this.agentId;
	}

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
		if(agentId != null){
			putQueryParameter("AgentId", agentId.toString());
		}
	}

	public String getNlsConfig() {
		return this.nlsConfig;
	}

	public void setNlsConfig(String nlsConfig) {
		this.nlsConfig = nlsConfig;
		if(nlsConfig != null){
			putQueryParameter("NlsConfig", nlsConfig);
		}
	}

	public Boolean getNewBargeInEnable() {
		return this.newBargeInEnable;
	}

	public void setNewBargeInEnable(Boolean newBargeInEnable) {
		this.newBargeInEnable = newBargeInEnable;
		if(newBargeInEnable != null){
			putQueryParameter("NewBargeInEnable", newBargeInEnable.toString());
		}
	}

	public String getAgentKey() {
		return this.agentKey;
	}

	public void setAgentKey(String agentKey) {
		this.agentKey = agentKey;
		if(agentKey != null){
			putQueryParameter("AgentKey", agentKey);
		}
	}

	public Boolean getMiniPlaybackEnable() {
		return this.miniPlaybackEnable;
	}

	public void setMiniPlaybackEnable(Boolean miniPlaybackEnable) {
		this.miniPlaybackEnable = miniPlaybackEnable;
		if(miniPlaybackEnable != null){
			putQueryParameter("MiniPlaybackEnable", miniPlaybackEnable.toString());
		}
	}

	public String getChatbotId() {
		return this.chatbotId;
	}

	public void setChatbotId(String chatbotId) {
		this.chatbotId = chatbotId;
		if(chatbotId != null){
			putQueryParameter("ChatbotId", chatbotId);
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

	public String getScriptDescription() {
		return this.scriptDescription;
	}

	public void setScriptDescription(String scriptDescription) {
		this.scriptDescription = scriptDescription;
		if(scriptDescription != null){
			putQueryParameter("ScriptDescription", scriptDescription);
		}
	}

	public Boolean getLongWaitEnable() {
		return this.longWaitEnable;
	}

	public void setLongWaitEnable(Boolean longWaitEnable) {
		this.longWaitEnable = longWaitEnable;
		if(longWaitEnable != null){
			putQueryParameter("LongWaitEnable", longWaitEnable.toString());
		}
	}

	public List<String> getScriptContents() {
		return this.scriptContents;
	}

	public void setScriptContents(List<String> scriptContents) {
		this.scriptContents = scriptContents;	
		if (scriptContents != null) {
			for (int i = 0; i < scriptContents.size(); i++) {
				putQueryParameter("ScriptContent." + (i + 1) , scriptContents.get(i));
			}
		}	
	}

	@Override
	public Class<ModifyScriptResponse> getResponseClass() {
		return ModifyScriptResponse.class;
	}

}
