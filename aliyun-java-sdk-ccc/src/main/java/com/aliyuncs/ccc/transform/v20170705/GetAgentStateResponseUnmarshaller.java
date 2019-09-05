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

package com.aliyuncs.ccc.transform.v20170705;

import com.aliyuncs.ccc.model.v20170705.GetAgentStateResponse;
import com.aliyuncs.ccc.model.v20170705.GetAgentStateResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAgentStateResponseUnmarshaller {

	public static GetAgentStateResponse unmarshall(GetAgentStateResponse getAgentStateResponse, UnmarshallerContext _ctx) {
		
		getAgentStateResponse.setRequestId(_ctx.stringValue("GetAgentStateResponse.RequestId"));
		getAgentStateResponse.setSuccess(_ctx.booleanValue("GetAgentStateResponse.Success"));
		getAgentStateResponse.setCode(_ctx.stringValue("GetAgentStateResponse.Code"));
		getAgentStateResponse.setMessage(_ctx.stringValue("GetAgentStateResponse.Message"));
		getAgentStateResponse.setHttpStatusCode(_ctx.integerValue("GetAgentStateResponse.HttpStatusCode"));

		Data data = new Data();
		data.setInstanceId(_ctx.stringValue("GetAgentStateResponse.Data.InstanceId"));
		data.setAgentId(_ctx.stringValue("GetAgentStateResponse.Data.AgentId"));
		data.setLoginName(_ctx.stringValue("GetAgentStateResponse.Data.LoginName"));
		data.setAgentName(_ctx.stringValue("GetAgentStateResponse.Data.AgentName"));
		data.setState(_ctx.stringValue("GetAgentStateResponse.Data.State"));
		data.setDn(_ctx.stringValue("GetAgentStateResponse.Data.Dn"));
		data.setStateDuration(_ctx.stringValue("GetAgentStateResponse.Data.StateDuration"));
		getAgentStateResponse.setData(data);
	 
	 	return getAgentStateResponse;
	}
}