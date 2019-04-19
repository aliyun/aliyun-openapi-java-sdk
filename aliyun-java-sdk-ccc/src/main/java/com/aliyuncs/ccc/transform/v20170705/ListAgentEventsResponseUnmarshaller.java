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

	public static ListAgentEventsResponse unmarshall(ListAgentEventsResponse listAgentEventsResponse, UnmarshallerContext context) {
		
		listAgentEventsResponse.setRequestId(context.stringValue("ListAgentEventsResponse.RequestId"));
		listAgentEventsResponse.setSuccess(context.booleanValue("ListAgentEventsResponse.Success"));
		listAgentEventsResponse.setCode(context.stringValue("ListAgentEventsResponse.Code"));
		listAgentEventsResponse.setMessage(context.stringValue("ListAgentEventsResponse.Message"));
		listAgentEventsResponse.setHttpStatusCode(context.integerValue("ListAgentEventsResponse.HttpStatusCode"));

		List<AgentEvent> agentEventList = new ArrayList<AgentEvent>();
		for (int i = 0; i < context.lengthValue("ListAgentEventsResponse.AgentEventList.Length"); i++) {
			AgentEvent agentEvent = new AgentEvent();
			agentEvent.setInstanceId(context.stringValue("ListAgentEventsResponse.AgentEventList["+ i +"].InstanceId"));
			agentEvent.setRamId(context.longValue("ListAgentEventsResponse.AgentEventList["+ i +"].RamId"));
			agentEvent.setLoginName(context.stringValue("ListAgentEventsResponse.AgentEventList["+ i +"].LoginName"));
			agentEvent.setEvent(context.stringValue("ListAgentEventsResponse.AgentEventList["+ i +"].Event"));
			agentEvent.setEventTime(context.longValue("ListAgentEventsResponse.AgentEventList["+ i +"].EventTime"));

			List<SkillGroup> skillGroupIds = new ArrayList<SkillGroup>();
			for (int j = 0; j < context.lengthValue("ListAgentEventsResponse.AgentEventList["+ i +"].SkillGroupIds.Length"); j++) {
				SkillGroup skillGroup = new SkillGroup();
				skillGroup.setSkillGroupId(context.stringValue("ListAgentEventsResponse.AgentEventList["+ i +"].SkillGroupIds["+ j +"].SkillGroupId"));
				skillGroup.setSkillGroupName(context.stringValue("ListAgentEventsResponse.AgentEventList["+ i +"].SkillGroupIds["+ j +"].SkillGroupName"));

				skillGroupIds.add(skillGroup);
			}
			agentEvent.setSkillGroupIds(skillGroupIds);

			agentEventList.add(agentEvent);
		}
		listAgentEventsResponse.setAgentEventList(agentEventList);
	 
	 	return listAgentEventsResponse;
	}
}