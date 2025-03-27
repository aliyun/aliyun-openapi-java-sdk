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

import com.aliyuncs.outboundbot.model.v20191226.GetAgentProfileTemplateResponse;
import com.aliyuncs.outboundbot.model.v20191226.GetAgentProfileTemplateResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAgentProfileTemplateResponseUnmarshaller {

	public static GetAgentProfileTemplateResponse unmarshall(GetAgentProfileTemplateResponse getAgentProfileTemplateResponse, UnmarshallerContext _ctx) {
		
		getAgentProfileTemplateResponse.setRequestId(_ctx.stringValue("GetAgentProfileTemplateResponse.RequestId"));
		getAgentProfileTemplateResponse.setSuccess(_ctx.booleanValue("GetAgentProfileTemplateResponse.Success"));
		getAgentProfileTemplateResponse.setCode(_ctx.stringValue("GetAgentProfileTemplateResponse.Code"));
		getAgentProfileTemplateResponse.setMessage(_ctx.stringValue("GetAgentProfileTemplateResponse.Message"));
		getAgentProfileTemplateResponse.setHttpStatusCode(_ctx.integerValue("GetAgentProfileTemplateResponse.HttpStatusCode"));

		Data data = new Data();
		data.setCreateTime(_ctx.stringValue("GetAgentProfileTemplateResponse.Data.CreateTime"));
		data.setUpdateTime(_ctx.stringValue("GetAgentProfileTemplateResponse.Data.UpdateTime"));
		data.setAgentProfileTemplateId(_ctx.stringValue("GetAgentProfileTemplateResponse.Data.AgentProfileTemplateId"));
		data.setName(_ctx.stringValue("GetAgentProfileTemplateResponse.Data.Name"));
		data.setDescription(_ctx.stringValue("GetAgentProfileTemplateResponse.Data.Description"));
		data.setPromptSchema(_ctx.stringValue("GetAgentProfileTemplateResponse.Data.PromptSchema"));
		getAgentProfileTemplateResponse.setData(data);
	 
	 	return getAgentProfileTemplateResponse;
	}
}