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

package com.aliyuncs.scsp.transform.v20200702;

import com.aliyuncs.scsp.model.v20200702.GetHotlineAgentDetailResponse;
import com.aliyuncs.scsp.model.v20200702.GetHotlineAgentDetailResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHotlineAgentDetailResponseUnmarshaller {

	public static GetHotlineAgentDetailResponse unmarshall(GetHotlineAgentDetailResponse getHotlineAgentDetailResponse, UnmarshallerContext _ctx) {
		
		getHotlineAgentDetailResponse.setRequestId(_ctx.stringValue("GetHotlineAgentDetailResponse.RequestId"));
		getHotlineAgentDetailResponse.setMessage(_ctx.stringValue("GetHotlineAgentDetailResponse.Message"));
		getHotlineAgentDetailResponse.setCode(_ctx.stringValue("GetHotlineAgentDetailResponse.Code"));
		getHotlineAgentDetailResponse.setSuccess(_ctx.booleanValue("GetHotlineAgentDetailResponse.Success"));

		Data data = new Data();
		data.setAssigned(_ctx.booleanValue("GetHotlineAgentDetailResponse.Data.Assigned"));
		data.setTenantId(_ctx.longValue("GetHotlineAgentDetailResponse.Data.TenantId"));
		data.setAgentStatus(_ctx.integerValue("GetHotlineAgentDetailResponse.Data.AgentStatus"));
		data.setRestType(_ctx.integerValue("GetHotlineAgentDetailResponse.Data.RestType"));
		data.setAgentStatusCode(_ctx.stringValue("GetHotlineAgentDetailResponse.Data.AgentStatusCode"));
		data.setToken(_ctx.stringValue("GetHotlineAgentDetailResponse.Data.Token"));
		data.setAgentId(_ctx.longValue("GetHotlineAgentDetailResponse.Data.AgentId"));
		getHotlineAgentDetailResponse.setData(data);
	 
	 	return getHotlineAgentDetailResponse;
	}
}