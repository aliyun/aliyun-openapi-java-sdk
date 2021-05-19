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

package com.aliyuncs.cccxspaceinner.transform.v20191227;

import com.aliyuncs.cccxspaceinner.model.v20191227.GetAgentByAgentIdResponse;
import com.aliyuncs.cccxspaceinner.model.v20191227.GetAgentByAgentIdResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAgentByAgentIdResponseUnmarshaller {

	public static GetAgentByAgentIdResponse unmarshall(GetAgentByAgentIdResponse getAgentByAgentIdResponse, UnmarshallerContext _ctx) {
		
		getAgentByAgentIdResponse.setMessage(_ctx.stringValue("GetAgentByAgentIdResponse.Message"));
		getAgentByAgentIdResponse.setCode(_ctx.stringValue("GetAgentByAgentIdResponse.Code"));
		getAgentByAgentIdResponse.setSuccess(_ctx.booleanValue("GetAgentByAgentIdResponse.Success"));

		Data data = new Data();
		data.setStatus(_ctx.integerValue("GetAgentByAgentIdResponse.Data.Status"));
		data.setBuId(_ctx.longValue("GetAgentByAgentIdResponse.Data.BuId"));
		data.setShowName(_ctx.stringValue("GetAgentByAgentIdResponse.Data.ShowName"));
		data.setAgentId(_ctx.longValue("GetAgentByAgentIdResponse.Data.AgentId"));
		data.setDepartmentId(_ctx.longValue("GetAgentByAgentIdResponse.Data.DepartmentId"));
		data.setAgentName(_ctx.stringValue("GetAgentByAgentIdResponse.Data.AgentName"));
		data.setAgentType(_ctx.integerValue("GetAgentByAgentIdResponse.Data.AgentType"));
		getAgentByAgentIdResponse.setData(data);
	 
	 	return getAgentByAgentIdResponse;
	}
}