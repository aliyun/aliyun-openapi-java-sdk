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

package com.aliyuncs.aiccs.transform.v20191015;

import com.aliyuncs.aiccs.model.v20191015.GetHotlineAgentDetailResponse;
import com.aliyuncs.aiccs.model.v20191015.GetHotlineAgentDetailResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHotlineAgentDetailResponseUnmarshaller {

	public static GetHotlineAgentDetailResponse unmarshall(GetHotlineAgentDetailResponse getHotlineAgentDetailResponse, UnmarshallerContext _ctx) {
		
		getHotlineAgentDetailResponse.setRequestId(_ctx.stringValue("GetHotlineAgentDetailResponse.RequestId"));
		getHotlineAgentDetailResponse.setSuccess(_ctx.booleanValue("GetHotlineAgentDetailResponse.Success"));
		getHotlineAgentDetailResponse.setCode(_ctx.stringValue("GetHotlineAgentDetailResponse.Code"));
		getHotlineAgentDetailResponse.setMessage(_ctx.stringValue("GetHotlineAgentDetailResponse.Message"));

		Data data = new Data();
		data.setTenantId(_ctx.longValue("GetHotlineAgentDetailResponse.Data.TenantId"));
		data.setAgentId(_ctx.longValue("GetHotlineAgentDetailResponse.Data.AgentId"));
		data.setAgentStatus(_ctx.integerValue("GetHotlineAgentDetailResponse.Data.AgentStatus"));
		data.setAssigned(_ctx.booleanValue("GetHotlineAgentDetailResponse.Data.Assigned"));
		data.setToken(_ctx.stringValue("GetHotlineAgentDetailResponse.Data.Token"));
		data.setRestType(_ctx.integerValue("GetHotlineAgentDetailResponse.Data.RestType"));
		data.setAgentStatusCode(_ctx.stringValue("GetHotlineAgentDetailResponse.Data.AgentStatusCode"));
		getHotlineAgentDetailResponse.setData(data);
	 
	 	return getHotlineAgentDetailResponse;
	}
}