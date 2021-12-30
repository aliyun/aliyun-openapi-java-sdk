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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.ListAgentEventsResponse;
import com.aliyuncs.ccc.model.v20170705.ListAgentEventsResponse.AgentEvent;
import com.aliyuncs.ccc.model.v20170705.ListAgentEventsResponse.AgentEvent.SkillGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAgentEventsResponseUnmarshaller {

	public static ListAgentEventsResponse unmarshall(ListAgentEventsResponse listAgentEventsResponse, UnmarshallerContext _ctx) {
		
		listAgentEventsResponse.setRequestId(_ctx.stringValue("ListAgentEventsResponse.RequestId"));
		listAgentEventsResponse.setSuccess(_ctx.booleanValue("ListAgentEventsResponse.Success"));
		listAgentEventsResponse.setCode(_ctx.stringValue("ListAgentEventsResponse.Code"));
		listAgentEventsResponse.setMessage(_ctx.stringValue("ListAgentEventsResponse.Message"));
		listAgentEventsResponse.setHttpStatusCode(_ctx.integerValue("ListAgentEventsResponse.HttpStatusCode"));

		List<AgentEvent> agentEventList = new ArrayList<AgentEvent>();
		for (int i = 0; i < _ctx.lengthValue("ListAgentEventsResponse.AgentEventList.Length"); i++) {
			AgentEvent agentEvent = new AgentEvent();
			agentEvent.setInstanceId(_ctx.stringValue("ListAgentEventsResponse.AgentEventList["+ i +"].InstanceId"));
			agentEvent.setRamId(_ctx.longValue("ListAgentEventsResponse.AgentEventList["+ i +"].RamId"));
			agentEvent.setLoginName(_ctx.stringValue("ListAgentEventsResponse.AgentEventList["+ i +"].LoginName"));
			agentEvent.setEvent(_ctx.stringValue("ListAgentEventsResponse.AgentEventList["+ i +"].Event"));
			agentEvent.setEventTime(_ctx.longValue("ListAgentEventsResponse.AgentEventList["+ i +"].EventTime"));

			List<SkillGroup> skillGroupIds = new ArrayList<SkillGroup>();
			for (int j = 0; j < _ctx.lengthValue("ListAgentEventsResponse.AgentEventList["+ i +"].SkillGroupIds.Length"); j++) {
				SkillGroup skillGroup = new SkillGroup();
				skillGroup.setSkillGroupId(_ctx.stringValue("ListAgentEventsResponse.AgentEventList["+ i +"].SkillGroupIds["+ j +"].SkillGroupId"));
				skillGroup.setSkillGroupName(_ctx.stringValue("ListAgentEventsResponse.AgentEventList["+ i +"].SkillGroupIds["+ j +"].SkillGroupName"));

				skillGroupIds.add(skillGroup);
			}
			agentEvent.setSkillGroupIds(skillGroupIds);

			agentEventList.add(agentEvent);
		}
		listAgentEventsResponse.setAgentEventList(agentEventList);
	 
	 	return listAgentEventsResponse;
	}
}