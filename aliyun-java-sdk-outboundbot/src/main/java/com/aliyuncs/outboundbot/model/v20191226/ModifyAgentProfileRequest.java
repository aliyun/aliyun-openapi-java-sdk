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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.outboundbot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyAgentProfileRequest extends RpcAcsRequest<ModifyAgentProfileResponse> {
	   

	private String modelConfig;

	private String description;

	private String variablesJson;

	private String instructionJson;

	private String scenario;

	private String apiPluginJson;

	private String model;

	private String labelsJson;

	private String agentProfileId;

	@SerializedName("faqCategoryIds")
	private List<Long> faqCategoryIds;

	private String instanceId;

	private String promptJson;

	private String prompt;
	public ModifyAgentProfileRequest() {
		super("OutboundBot", "2019-12-26", "ModifyAgentProfile", "outboundbot");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getModelConfig() {
		return this.modelConfig;
	}

	public void setModelConfig(String modelConfig) {
		this.modelConfig = modelConfig;
		if(modelConfig != null){
			putBodyParameter("ModelConfig", modelConfig);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getVariablesJson() {
		return this.variablesJson;
	}

	public void setVariablesJson(String variablesJson) {
		this.variablesJson = variablesJson;
		if(variablesJson != null){
			putBodyParameter("VariablesJson", variablesJson);
		}
	}

	public String getInstructionJson() {
		return this.instructionJson;
	}

	public void setInstructionJson(String instructionJson) {
		this.instructionJson = instructionJson;
		if(instructionJson != null){
			putBodyParameter("InstructionJson", instructionJson);
		}
	}

	public String getScenario() {
		return this.scenario;
	}

	public void setScenario(String scenario) {
		this.scenario = scenario;
		if(scenario != null){
			putBodyParameter("Scenario", scenario);
		}
	}

	public String getApiPluginJson() {
		return this.apiPluginJson;
	}

	public void setApiPluginJson(String apiPluginJson) {
		this.apiPluginJson = apiPluginJson;
		if(apiPluginJson != null){
			putBodyParameter("ApiPluginJson", apiPluginJson);
		}
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
		if(model != null){
			putBodyParameter("Model", model);
		}
	}

	public String getLabelsJson() {
		return this.labelsJson;
	}

	public void setLabelsJson(String labelsJson) {
		this.labelsJson = labelsJson;
		if(labelsJson != null){
			putBodyParameter("LabelsJson", labelsJson);
		}
	}

	public String getAgentProfileId() {
		return this.agentProfileId;
	}

	public void setAgentProfileId(String agentProfileId) {
		this.agentProfileId = agentProfileId;
		if(agentProfileId != null){
			putBodyParameter("AgentProfileId", agentProfileId);
		}
	}

	public List<Long> getFaqCategoryIds() {
		return this.faqCategoryIds;
	}

	public void setFaqCategoryIds(List<Long> faqCategoryIds) {
		this.faqCategoryIds = faqCategoryIds;	
		if (faqCategoryIds != null) {
			putBodyParameter("FaqCategoryIds" , new Gson().toJson(faqCategoryIds));
		}	
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getPromptJson() {
		return this.promptJson;
	}

	public void setPromptJson(String promptJson) {
		this.promptJson = promptJson;
		if(promptJson != null){
			putBodyParameter("PromptJson", promptJson);
		}
	}

	public String getPrompt() {
		return this.prompt;
	}

	public void setPrompt(String prompt) {
		this.prompt = prompt;
		if(prompt != null){
			putBodyParameter("Prompt", prompt);
		}
	}

	@Override
	public Class<ModifyAgentProfileResponse> getResponseClass() {
		return ModifyAgentProfileResponse.class;
	}

}
