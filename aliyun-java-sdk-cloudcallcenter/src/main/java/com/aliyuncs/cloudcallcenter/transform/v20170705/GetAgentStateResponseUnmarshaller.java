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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.GetAgentStateResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetAgentStateResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAgentStateResponseUnmarshaller {

	public static GetAgentStateResponse unmarshall(GetAgentStateResponse getAgentStateResponse, UnmarshallerContext context) {
		
		getAgentStateResponse.setRequestId(context.stringValue("GetAgentStateResponse.RequestId"));
		getAgentStateResponse.setSuccess(context.booleanValue("GetAgentStateResponse.Success"));
		getAgentStateResponse.setCode(context.stringValue("GetAgentStateResponse.Code"));
		getAgentStateResponse.setMessage(context.stringValue("GetAgentStateResponse.Message"));
		getAgentStateResponse.setHttpStatusCode(context.integerValue("GetAgentStateResponse.HttpStatusCode"));

		Data data = new Data();
		data.setInstanceId(context.stringValue("GetAgentStateResponse.Data.InstanceId"));
		data.setAgentId(context.stringValue("GetAgentStateResponse.Data.AgentId"));
		data.setLoginName(context.stringValue("GetAgentStateResponse.Data.LoginName"));
		data.setAgentName(context.stringValue("GetAgentStateResponse.Data.AgentName"));
		data.setState(context.stringValue("GetAgentStateResponse.Data.State"));
		data.setDn(context.stringValue("GetAgentStateResponse.Data.Dn"));
		data.setStateDuration(context.stringValue("GetAgentStateResponse.Data.StateDuration"));
		getAgentStateResponse.setData(data);
	 
	 	return getAgentStateResponse;
	}
}