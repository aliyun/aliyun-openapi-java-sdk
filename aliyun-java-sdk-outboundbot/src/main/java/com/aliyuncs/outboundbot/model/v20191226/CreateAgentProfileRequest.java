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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.outboundbot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateAgentProfileRequest extends RpcAcsRequest<CreateAgentProfileResponse> {
	   

	private String modelConfig;

	private String appIp;

	private String description;

	private String agentProfileTemplateId;

	private String scriptId;

	private String variablesJson;

	private String instructionJson;

	private String scenario;

	private String model;

	private String labelsJson;

	private String faqCategoryIds;

	private String instanceId;

	private String promptJson;

	private String prompt;
	public CreateAgentProfileRequest() {
		super("OutboundBot", "2019-12-26", "CreateAgentProfile", "outboundbot");
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

	public String getAppIp() {
		return this.appIp;
	}

	public void setAppIp(String appIp) {
		this.appIp = appIp;
		if(appIp != null){
			putBodyParameter("AppIp", appIp);
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

	public String getAgentProfileTemplateId() {
		return this.agentProfileTemplateId;
	}

	public void setAgentProfileTemplateId(String agentProfileTemplateId) {
		this.agentProfileTemplateId = agentProfileTemplateId;
		if(agentProfileTemplateId != null){
			putBodyParameter("AgentProfileTemplateId", agentProfileTemplateId);
		}
	}

	public String getScriptId() {
		return this.scriptId;
	}

	public void setScriptId(String scriptId) {
		this.scriptId = scriptId;
		if(scriptId != null){
			putBodyParameter("ScriptId", scriptId);
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

	public String getFaqCategoryIds() {
		return this.faqCategoryIds;
	}

	public void setFaqCategoryIds(String faqCategoryIds) {
		this.faqCategoryIds = faqCategoryIds;
		if(faqCategoryIds != null){
			putBodyParameter("FaqCategoryIds", faqCategoryIds);
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
	public Class<CreateAgentProfileResponse> getResponseClass() {
		return CreateAgentProfileResponse.class;
	}

}
