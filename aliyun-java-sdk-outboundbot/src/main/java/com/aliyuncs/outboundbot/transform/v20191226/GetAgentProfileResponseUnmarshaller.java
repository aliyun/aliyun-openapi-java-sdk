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

import com.aliyuncs.outboundbot.model.v20191226.GetAgentProfileResponse;
import com.aliyuncs.outboundbot.model.v20191226.GetAgentProfileResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAgentProfileResponseUnmarshaller {

	public static GetAgentProfileResponse unmarshall(GetAgentProfileResponse getAgentProfileResponse, UnmarshallerContext _ctx) {
		
		getAgentProfileResponse.setRequestId(_ctx.stringValue("GetAgentProfileResponse.RequestId"));
		getAgentProfileResponse.setSuccess(_ctx.booleanValue("GetAgentProfileResponse.Success"));
		getAgentProfileResponse.setCode(_ctx.stringValue("GetAgentProfileResponse.Code"));
		getAgentProfileResponse.setMessage(_ctx.stringValue("GetAgentProfileResponse.Message"));
		getAgentProfileResponse.setHttpStatusCode(_ctx.integerValue("GetAgentProfileResponse.HttpStatusCode"));

		Data data = new Data();
		data.setCreateTime(_ctx.stringValue("GetAgentProfileResponse.Data.CreateTime"));
		data.setUpdateTime(_ctx.stringValue("GetAgentProfileResponse.Data.UpdateTime"));
		data.setAgentProfileId(_ctx.stringValue("GetAgentProfileResponse.Data.AgentProfileId"));
		data.setInstanceId(_ctx.stringValue("GetAgentProfileResponse.Data.InstanceId"));
		data.setScriptId(_ctx.stringValue("GetAgentProfileResponse.Data.ScriptId"));
		data.setAgentType(_ctx.stringValue("GetAgentProfileResponse.Data.AgentType"));
		data.setPromptJson(_ctx.stringValue("GetAgentProfileResponse.Data.PromptJson"));
		data.setPrompt(_ctx.stringValue("GetAgentProfileResponse.Data.Prompt"));
		data.setAgentProfileTemplateId(_ctx.stringValue("GetAgentProfileResponse.Data.AgentProfileTemplateId"));
		data.setModel(_ctx.stringValue("GetAgentProfileResponse.Data.Model"));
		data.setModelConfig(_ctx.stringValue("GetAgentProfileResponse.Data.ModelConfig"));
		data.setSystem(_ctx.booleanValue("GetAgentProfileResponse.Data.System"));
		data.setLabelsJson(_ctx.stringValue("GetAgentProfileResponse.Data.LabelsJson"));
		data.setVariablesJson(_ctx.stringValue("GetAgentProfileResponse.Data.VariablesJson"));
		data.setScenario(_ctx.stringValue("GetAgentProfileResponse.Data.Scenario"));
		data.setDescription(_ctx.stringValue("GetAgentProfileResponse.Data.Description"));
		data.setInstructionJson(_ctx.stringValue("GetAgentProfileResponse.Data.InstructionJson"));
		data.setApiPluginJson(_ctx.stringValue("GetAgentProfileResponse.Data.ApiPluginJson"));
		data.setNluConfigJson(_ctx.stringValue("GetAgentProfileResponse.Data.NluConfigJson"));
		getAgentProfileResponse.setData(data);
	 
	 	return getAgentProfileResponse;
	}
}