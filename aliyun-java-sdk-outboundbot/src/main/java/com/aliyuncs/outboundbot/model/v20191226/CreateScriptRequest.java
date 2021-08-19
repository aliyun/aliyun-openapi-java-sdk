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
public class CreateScriptRequest extends RpcAcsRequest<CreateScriptResponse> {
	   

	private String ttsConfig;

	private String industry;

	private String scriptName;

	private String scene;

	private String chatbotId;

	private String instanceId;

	private List<String> scriptWaveforms;

	private String asrConfig;

	private String scriptDescription;

	private List<String> scriptContents;
	public CreateScriptRequest() {
		super("OutboundBot", "2019-12-26", "CreateScript", "outboundbot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getScene() {
		return this.scene;
	}

	public void setScene(String scene) {
		this.scene = scene;
		if(scene != null){
			putQueryParameter("Scene", scene);
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

	public String getScriptDescription() {
		return this.scriptDescription;
	}

	public void setScriptDescription(String scriptDescription) {
		this.scriptDescription = scriptDescription;
		if(scriptDescription != null){
			putQueryParameter("ScriptDescription", scriptDescription);
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
	public Class<CreateScriptResponse> getResponseClass() {
		return CreateScriptResponse.class;
	}

}
