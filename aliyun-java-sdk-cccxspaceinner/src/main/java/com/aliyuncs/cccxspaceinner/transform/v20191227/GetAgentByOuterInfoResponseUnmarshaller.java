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

import com.aliyuncs.cccxspaceinner.model.v20191227.GetAgentByOuterInfoResponse;
import com.aliyuncs.cccxspaceinner.model.v20191227.GetAgentByOuterInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAgentByOuterInfoResponseUnmarshaller {

	public static GetAgentByOuterInfoResponse unmarshall(GetAgentByOuterInfoResponse getAgentByOuterInfoResponse, UnmarshallerContext _ctx) {
		
		getAgentByOuterInfoResponse.setSuccess(_ctx.booleanValue("GetAgentByOuterInfoResponse.Success"));
		getAgentByOuterInfoResponse.setCode(_ctx.stringValue("GetAgentByOuterInfoResponse.Code"));
		getAgentByOuterInfoResponse.setMessage(_ctx.stringValue("GetAgentByOuterInfoResponse.Message"));

		Data data = new Data();
		data.setBuId(_ctx.longValue("GetAgentByOuterInfoResponse.Data.BuId"));
		data.setAgentId(_ctx.longValue("GetAgentByOuterInfoResponse.Data.AgentId"));
		data.setAgentName(_ctx.stringValue("GetAgentByOuterInfoResponse.Data.AgentName"));
		data.setShowName(_ctx.stringValue("GetAgentByOuterInfoResponse.Data.ShowName"));
		data.setAgentType(_ctx.integerValue("GetAgentByOuterInfoResponse.Data.AgentType"));
		data.setStatus(_ctx.integerValue("GetAgentByOuterInfoResponse.Data.Status"));
		data.setDepartmentId(_ctx.longValue("GetAgentByOuterInfoResponse.Data.DepartmentId"));
		getAgentByOuterInfoResponse.setData(data);
	 
	 	return getAgentByOuterInfoResponse;
	}
}