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

import com.aliyuncs.outboundbot.model.v20191226.ModifyAgentProfileResponse;
import com.aliyuncs.outboundbot.model.v20191226.ModifyAgentProfileResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyAgentProfileResponseUnmarshaller {

	public static ModifyAgentProfileResponse unmarshall(ModifyAgentProfileResponse modifyAgentProfileResponse, UnmarshallerContext _ctx) {
		
		modifyAgentProfileResponse.setRequestId(_ctx.stringValue("ModifyAgentProfileResponse.RequestId"));
		modifyAgentProfileResponse.setSuccess(_ctx.booleanValue("ModifyAgentProfileResponse.Success"));
		modifyAgentProfileResponse.setCode(_ctx.stringValue("ModifyAgentProfileResponse.Code"));
		modifyAgentProfileResponse.setMessage(_ctx.stringValue("ModifyAgentProfileResponse.Message"));
		modifyAgentProfileResponse.setHttpStatusCode(_ctx.integerValue("ModifyAgentProfileResponse.HttpStatusCode"));

		Data data = new Data();
		data.setCreateTime(_ctx.stringValue("ModifyAgentProfileResponse.Data.CreateTime"));
		data.setUpdateTime(_ctx.stringValue("ModifyAgentProfileResponse.Data.UpdateTime"));
		data.setAgentProfileId(_ctx.stringValue("ModifyAgentProfileResponse.Data.AgentProfileId"));
		data.setInstanceId(_ctx.stringValue("ModifyAgentProfileResponse.Data.InstanceId"));
		data.setScriptId(_ctx.stringValue("ModifyAgentProfileResponse.Data.ScriptId"));
		data.setAgentType(_ctx.stringValue("ModifyAgentProfileResponse.Data.AgentType"));
		data.setPromptJson(_ctx.stringValue("ModifyAgentProfileResponse.Data.PromptJson"));
		data.setPrompt(_ctx.stringValue("ModifyAgentProfileResponse.Data.Prompt"));
		data.setAgentProfileTemplateId(_ctx.stringValue("ModifyAgentProfileResponse.Data.AgentProfileTemplateId"));
		data.setModel(_ctx.stringValue("ModifyAgentProfileResponse.Data.Model"));
		data.setModelConfig(_ctx.stringValue("ModifyAgentProfileResponse.Data.ModelConfig"));
		data.setSystem(_ctx.booleanValue("ModifyAgentProfileResponse.Data.System"));
		data.setLabelsJson(_ctx.stringValue("ModifyAgentProfileResponse.Data.LabelsJson"));
		data.setVariablesJson(_ctx.stringValue("ModifyAgentProfileResponse.Data.VariablesJson"));
		data.setScenario(_ctx.stringValue("ModifyAgentProfileResponse.Data.Scenario"));
		data.setDescription(_ctx.stringValue("ModifyAgentProfileResponse.Data.Description"));
		data.setInstructionJson(_ctx.stringValue("ModifyAgentProfileResponse.Data.InstructionJson"));
		data.setApiPluginJson(_ctx.stringValue("ModifyAgentProfileResponse.Data.ApiPluginJson"));
		data.setNluConfigJson(_ctx.stringValue("ModifyAgentProfileResponse.Data.NluConfigJson"));
		modifyAgentProfileResponse.setData(data);
	 
	 	return modifyAgentProfileResponse;
	}
}