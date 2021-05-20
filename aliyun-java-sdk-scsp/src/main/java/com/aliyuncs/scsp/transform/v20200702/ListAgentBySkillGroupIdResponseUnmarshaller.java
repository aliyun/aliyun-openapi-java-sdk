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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.scsp.model.v20200702.ListAgentBySkillGroupIdResponse;
import com.aliyuncs.scsp.model.v20200702.ListAgentBySkillGroupIdResponse.Agents;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAgentBySkillGroupIdResponseUnmarshaller {

	public static ListAgentBySkillGroupIdResponse unmarshall(ListAgentBySkillGroupIdResponse listAgentBySkillGroupIdResponse, UnmarshallerContext _ctx) {
		
		listAgentBySkillGroupIdResponse.setRequestId(_ctx.stringValue("ListAgentBySkillGroupIdResponse.RequestId"));
		listAgentBySkillGroupIdResponse.setMessage(_ctx.stringValue("ListAgentBySkillGroupIdResponse.Message"));
		listAgentBySkillGroupIdResponse.setCode(_ctx.stringValue("ListAgentBySkillGroupIdResponse.Code"));
		listAgentBySkillGroupIdResponse.setSuccess(_ctx.booleanValue("ListAgentBySkillGroupIdResponse.Success"));

		List<Agents> data = new ArrayList<Agents>();
		for (int i = 0; i < _ctx.lengthValue("ListAgentBySkillGroupIdResponse.Data.Length"); i++) {
			Agents agents = new Agents();
			agents.setStatus(_ctx.integerValue("ListAgentBySkillGroupIdResponse.Data["+ i +"].Status"));
			agents.setDisplayName(_ctx.stringValue("ListAgentBySkillGroupIdResponse.Data["+ i +"].DisplayName"));
			agents.setAgentId(_ctx.longValue("ListAgentBySkillGroupIdResponse.Data["+ i +"].AgentId"));
			agents.setAccountName(_ctx.stringValue("ListAgentBySkillGroupIdResponse.Data["+ i +"].AccountName"));
			agents.setTenantId(_ctx.longValue("ListAgentBySkillGroupIdResponse.Data["+ i +"].TenantId"));

			data.add(agents);
		}
		listAgentBySkillGroupIdResponse.setData(data);
	 
	 	return listAgentBySkillGroupIdResponse;
	}
}