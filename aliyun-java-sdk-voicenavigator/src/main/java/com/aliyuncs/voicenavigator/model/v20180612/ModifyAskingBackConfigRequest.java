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

package com.aliyuncs.voicenavigator.model.v20180612;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.voicenavigator.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyAskingBackConfigRequest extends RpcAcsRequest<ModifyAskingBackConfigResponse> {
	   

	private String negativeFeedbackPrompt;

	private String negativeFeedbackAction;

	private Boolean enabled;

	private Boolean enableNegativeFeedback;

	private String instanceId;

	private String prompt;

	private List<String> negativeFeedbackUtterancess;

	private String negativeFeedbackActionParams;
	public ModifyAskingBackConfigRequest() {
		super("VoiceNavigator", "2018-06-12", "ModifyAskingBackConfig", "voicebot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNegativeFeedbackPrompt() {
		return this.negativeFeedbackPrompt;
	}

	public void setNegativeFeedbackPrompt(String negativeFeedbackPrompt) {
		this.negativeFeedbackPrompt = negativeFeedbackPrompt;
		if(negativeFeedbackPrompt != null){
			putQueryParameter("NegativeFeedbackPrompt", negativeFeedbackPrompt);
		}
	}

	public String getNegativeFeedbackAction() {
		return this.negativeFeedbackAction;
	}

	public void setNegativeFeedbackAction(String negativeFeedbackAction) {
		this.negativeFeedbackAction = negativeFeedbackAction;
		if(negativeFeedbackAction != null){
			putQueryParameter("NegativeFeedbackAction", negativeFeedbackAction);
		}
	}

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		if(enabled != null){
			putQueryParameter("Enabled", enabled.toString());
		}
	}

	public Boolean getEnableNegativeFeedback() {
		return this.enableNegativeFeedback;
	}

	public void setEnableNegativeFeedback(Boolean enableNegativeFeedback) {
		this.enableNegativeFeedback = enableNegativeFeedback;
		if(enableNegativeFeedback != null){
			putQueryParameter("EnableNegativeFeedback", enableNegativeFeedback.toString());
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

	public String getPrompt() {
		return this.prompt;
	}

	public void setPrompt(String prompt) {
		this.prompt = prompt;
		if(prompt != null){
			putQueryParameter("Prompt", prompt);
		}
	}

	public List<String> getNegativeFeedbackUtterancess() {
		return this.negativeFeedbackUtterancess;
	}

	public void setNegativeFeedbackUtterancess(List<String> negativeFeedbackUtterancess) {
		this.negativeFeedbackUtterancess = negativeFeedbackUtterancess;	
		if (negativeFeedbackUtterancess != null) {
			for (int i = 0; i < negativeFeedbackUtterancess.size(); i++) {
				putQueryParameter("NegativeFeedbackUtterances." + (i + 1) , negativeFeedbackUtterancess.get(i));
			}
		}	
	}

	public String getNegativeFeedbackActionParams() {
		return this.negativeFeedbackActionParams;
	}

	public void setNegativeFeedbackActionParams(String negativeFeedbackActionParams) {
		this.negativeFeedbackActionParams = negativeFeedbackActionParams;
		if(negativeFeedbackActionParams != null){
			putQueryParameter("NegativeFeedbackActionParams", negativeFeedbackActionParams);
		}
	}

	@Override
	public Class<ModifyAskingBackConfigResponse> getResponseClass() {
		return ModifyAskingBackConfigResponse.class;
	}

}
