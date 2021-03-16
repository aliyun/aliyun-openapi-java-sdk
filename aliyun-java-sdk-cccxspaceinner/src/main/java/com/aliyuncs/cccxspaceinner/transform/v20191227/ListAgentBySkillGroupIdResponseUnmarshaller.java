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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cccxspaceinner.model.v20191227.ListAgentBySkillGroupIdResponse;
import com.aliyuncs.cccxspaceinner.model.v20191227.ListAgentBySkillGroupIdResponse.Agents;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAgentBySkillGroupIdResponseUnmarshaller {

	public static ListAgentBySkillGroupIdResponse unmarshall(ListAgentBySkillGroupIdResponse listAgentBySkillGroupIdResponse, UnmarshallerContext _ctx) {
		
		listAgentBySkillGroupIdResponse.setRequestId(_ctx.stringValue("ListAgentBySkillGroupIdResponse.RequestId"));
		listAgentBySkillGroupIdResponse.setSuccess(_ctx.booleanValue("ListAgentBySkillGroupIdResponse.Success"));
		listAgentBySkillGroupIdResponse.setCode(_ctx.stringValue("ListAgentBySkillGroupIdResponse.Code"));
		listAgentBySkillGroupIdResponse.setMessage(_ctx.stringValue("ListAgentBySkillGroupIdResponse.Message"));

		List<Agents> data = new ArrayList<Agents>();
		for (int i = 0; i < _ctx.lengthValue("ListAgentBySkillGroupIdResponse.Data.Length"); i++) {
			Agents agents = new Agents();
			agents.setTenantId(_ctx.longValue("ListAgentBySkillGroupIdResponse.Data["+ i +"].TenantId"));
			agents.setAgentId(_ctx.longValue("ListAgentBySkillGroupIdResponse.Data["+ i +"].AgentId"));
			agents.setAccountName(_ctx.stringValue("ListAgentBySkillGroupIdResponse.Data["+ i +"].AccountName"));
			agents.setDisplayName(_ctx.stringValue("ListAgentBySkillGroupIdResponse.Data["+ i +"].DisplayName"));
			agents.setStatus(_ctx.integerValue("ListAgentBySkillGroupIdResponse.Data["+ i +"].Status"));

			data.add(agents);
		}
		listAgentBySkillGroupIdResponse.setData(data);
	 
	 	return listAgentBySkillGroupIdResponse;
	}
}