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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.CreateAgentProfileResponse;
import com.aliyuncs.outboundbot.model.v20191226.CreateAgentProfileResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAgentProfileResponseUnmarshaller {

	public static CreateAgentProfileResponse unmarshall(CreateAgentProfileResponse createAgentProfileResponse, UnmarshallerContext _ctx) {
		
		createAgentProfileResponse.setRequestId(_ctx.stringValue("CreateAgentProfileResponse.RequestId"));
		createAgentProfileResponse.setSuccess(_ctx.booleanValue("CreateAgentProfileResponse.Success"));
		createAgentProfileResponse.setCode(_ctx.stringValue("CreateAgentProfileResponse.Code"));
		createAgentProfileResponse.setMessage(_ctx.stringValue("CreateAgentProfileResponse.Message"));
		createAgentProfileResponse.setHttpStatusCode(_ctx.integerValue("CreateAgentProfileResponse.HttpStatusCode"));

		Data data = new Data();
		data.setCreateTime(_ctx.stringValue("CreateAgentProfileResponse.Data.CreateTime"));
		data.setUpdateTime(_ctx.stringValue("CreateAgentProfileResponse.Data.UpdateTime"));
		data.setAgentProfileId(_ctx.stringValue("CreateAgentProfileResponse.Data.AgentProfileId"));
		data.setInstanceId(_ctx.stringValue("CreateAgentProfileResponse.Data.InstanceId"));
		data.setScriptId(_ctx.stringValue("CreateAgentProfileResponse.Data.ScriptId"));
		data.setAgentType(_ctx.stringValue("CreateAgentProfileResponse.Data.AgentType"));
		data.setPromptJson(_ctx.stringValue("CreateAgentProfileResponse.Data.PromptJson"));
		data.setPrompt(_ctx.stringValue("CreateAgentProfileResponse.Data.Prompt"));
		data.setAgentProfileTemplateId(_ctx.stringValue("CreateAgentProfileResponse.Data.AgentProfileTemplateId"));
		data.setModel(_ctx.stringValue("CreateAgentProfileResponse.Data.Model"));
		data.setModelConfig(_ctx.stringValue("CreateAgentProfileResponse.Data.ModelConfig"));
		data.setSystem(_ctx.booleanValue("CreateAgentProfileResponse.Data.System"));
		data.setLabelsJson(_ctx.stringValue("CreateAgentProfileResponse.Data.LabelsJson"));
		data.setVariablesJson(_ctx.stringValue("CreateAgentProfileResponse.Data.VariablesJson"));
		data.setScenario(_ctx.stringValue("CreateAgentProfileResponse.Data.Scenario"));
		data.setDescription(_ctx.stringValue("CreateAgentProfileResponse.Data.Description"));
		data.setInstructionJson(_ctx.stringValue("CreateAgentProfileResponse.Data.InstructionJson"));
		createAgentProfileResponse.setData(data);
	 
	 	return createAgentProfileResponse;
	}
}