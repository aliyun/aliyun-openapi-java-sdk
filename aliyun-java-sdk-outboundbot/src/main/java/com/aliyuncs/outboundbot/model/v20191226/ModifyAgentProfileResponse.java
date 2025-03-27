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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.outboundbot.transform.v20191226.ModifyAgentProfileResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyAgentProfileResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private String requestId;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String createTime;

		private String updateTime;

		private String agentProfileId;

		private String instanceId;

		private String scriptId;

		private String agentType;

		private String promptJson;

		private String prompt;

		private String agentProfileTemplateId;

		private String model;

		private String modelConfig;

		private Boolean system;

		private String labelsJson;

		private String variablesJson;

		private String scenario;

		private String description;

		private String instructionJson;

		private String apiPluginJson;

		private String nluConfigJson;

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getAgentProfileId() {
			return this.agentProfileId;
		}

		public void setAgentProfileId(String agentProfileId) {
			this.agentProfileId = agentProfileId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getScriptId() {
			return this.scriptId;
		}

		public void setScriptId(String scriptId) {
			this.scriptId = scriptId;
		}

		public String getAgentType() {
			return this.agentType;
		}

		public void setAgentType(String agentType) {
			this.agentType = agentType;
		}

		public String getPromptJson() {
			return this.promptJson;
		}

		public void setPromptJson(String promptJson) {
			this.promptJson = promptJson;
		}

		public String getPrompt() {
			return this.prompt;
		}

		public void setPrompt(String prompt) {
			this.prompt = prompt;
		}

		public String getAgentProfileTemplateId() {
			return this.agentProfileTemplateId;
		}

		public void setAgentProfileTemplateId(String agentProfileTemplateId) {
			this.agentProfileTemplateId = agentProfileTemplateId;
		}

		public String getModel() {
			return this.model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getModelConfig() {
			return this.modelConfig;
		}

		public void setModelConfig(String modelConfig) {
			this.modelConfig = modelConfig;
		}

		public Boolean getSystem() {
			return this.system;
		}

		public void setSystem(Boolean system) {
			this.system = system;
		}

		public String getLabelsJson() {
			return this.labelsJson;
		}

		public void setLabelsJson(String labelsJson) {
			this.labelsJson = labelsJson;
		}

		public String getVariablesJson() {
			return this.variablesJson;
		}

		public void setVariablesJson(String variablesJson) {
			this.variablesJson = variablesJson;
		}

		public String getScenario() {
			return this.scenario;
		}

		public void setScenario(String scenario) {
			this.scenario = scenario;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getInstructionJson() {
			return this.instructionJson;
		}

		public void setInstructionJson(String instructionJson) {
			this.instructionJson = instructionJson;
		}

		public String getApiPluginJson() {
			return this.apiPluginJson;
		}

		public void setApiPluginJson(String apiPluginJson) {
			this.apiPluginJson = apiPluginJson;
		}

		public String getNluConfigJson() {
			return this.nluConfigJson;
		}

		public void setNluConfigJson(String nluConfigJson) {
			this.nluConfigJson = nluConfigJson;
		}
	}

	@Override
	public ModifyAgentProfileResponse getInstance(UnmarshallerContext context) {
		return	ModifyAgentProfileResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
