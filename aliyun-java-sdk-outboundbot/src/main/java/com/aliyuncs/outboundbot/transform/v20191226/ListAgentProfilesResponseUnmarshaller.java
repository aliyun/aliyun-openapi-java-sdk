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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.ListAgentProfilesResponse;
import com.aliyuncs.outboundbot.model.v20191226.ListAgentProfilesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAgentProfilesResponseUnmarshaller {

	public static ListAgentProfilesResponse unmarshall(ListAgentProfilesResponse listAgentProfilesResponse, UnmarshallerContext _ctx) {
		
		listAgentProfilesResponse.setRequestId(_ctx.stringValue("ListAgentProfilesResponse.RequestId"));
		listAgentProfilesResponse.setSuccess(_ctx.booleanValue("ListAgentProfilesResponse.Success"));
		listAgentProfilesResponse.setCode(_ctx.stringValue("ListAgentProfilesResponse.Code"));
		listAgentProfilesResponse.setMessage(_ctx.stringValue("ListAgentProfilesResponse.Message"));
		listAgentProfilesResponse.setHttpStatusCode(_ctx.integerValue("ListAgentProfilesResponse.HttpStatusCode"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAgentProfilesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCreateTime(_ctx.stringValue("ListAgentProfilesResponse.Data["+ i +"].CreateTime"));
			dataItem.setUpdateTime(_ctx.stringValue("ListAgentProfilesResponse.Data["+ i +"].UpdateTime"));
			dataItem.setAgentProfileId(_ctx.stringValue("ListAgentProfilesResponse.Data["+ i +"].AgentProfileId"));
			dataItem.setInstanceId(_ctx.stringValue("ListAgentProfilesResponse.Data["+ i +"].InstanceId"));
			dataItem.setScriptId(_ctx.stringValue("ListAgentProfilesResponse.Data["+ i +"].ScriptId"));
			dataItem.setAgentType(_ctx.stringValue("ListAgentProfilesResponse.Data["+ i +"].AgentType"));
			dataItem.setPromptJson(_ctx.stringValue("ListAgentProfilesResponse.Data["+ i +"].PromptJson"));
			dataItem.setPrompt(_ctx.stringValue("ListAgentProfilesResponse.Data["+ i +"].Prompt"));
			dataItem.setAgentProfileTemplateId(_ctx.stringValue("ListAgentProfilesResponse.Data["+ i +"].AgentProfileTemplateId"));
			dataItem.setModel(_ctx.stringValue("ListAgentProfilesResponse.Data["+ i +"].Model"));
			dataItem.setModelConfig(_ctx.stringValue("ListAgentProfilesResponse.Data["+ i +"].ModelConfig"));
			dataItem.setSystem(_ctx.booleanValue("ListAgentProfilesResponse.Data["+ i +"].System"));
			dataItem.setLabelsJson(_ctx.stringValue("ListAgentProfilesResponse.Data["+ i +"].LabelsJson"));
			dataItem.setVariablesJson(_ctx.stringValue("ListAgentProfilesResponse.Data["+ i +"].VariablesJson"));
			dataItem.setScenario(_ctx.stringValue("ListAgentProfilesResponse.Data["+ i +"].Scenario"));
			dataItem.setDescription(_ctx.stringValue("ListAgentProfilesResponse.Data["+ i +"].Description"));
			dataItem.setInstructionJson(_ctx.stringValue("ListAgentProfilesResponse.Data["+ i +"].InstructionJson"));

			data.add(dataItem);
		}
		listAgentProfilesResponse.setData(data);
	 
	 	return listAgentProfilesResponse;
	}
}