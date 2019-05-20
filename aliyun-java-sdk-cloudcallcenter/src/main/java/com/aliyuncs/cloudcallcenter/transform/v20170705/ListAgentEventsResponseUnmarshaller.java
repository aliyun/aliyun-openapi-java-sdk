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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.ListAgentEventsResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListAgentEventsResponse.Data;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListAgentEventsResponse.Data.AgentEvent;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListAgentEventsResponse.Data.AgentEvent.SkillGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAgentEventsResponseUnmarshaller {

	public static ListAgentEventsResponse unmarshall(ListAgentEventsResponse listAgentEventsResponse, UnmarshallerContext context) {
		
		listAgentEventsResponse.setRequestId(context.stringValue("ListAgentEventsResponse.RequestId"));
		listAgentEventsResponse.setSuccess(context.booleanValue("ListAgentEventsResponse.Success"));
		listAgentEventsResponse.setCode(context.stringValue("ListAgentEventsResponse.Code"));
		listAgentEventsResponse.setMessage(context.stringValue("ListAgentEventsResponse.Message"));
		listAgentEventsResponse.setHttpStatusCode(context.integerValue("ListAgentEventsResponse.HttpStatusCode"));

		Data data = new Data();
		data.setTotalCount(context.integerValue("ListAgentEventsResponse.Data.TotalCount"));
		data.setPageNumber(context.integerValue("ListAgentEventsResponse.Data.PageNumber"));
		data.setPageSize(context.integerValue("ListAgentEventsResponse.Data.PageSize"));

		List<AgentEvent> list = new ArrayList<AgentEvent>();
		for (int i = 0; i < context.lengthValue("ListAgentEventsResponse.Data.List.Length"); i++) {
			AgentEvent agentEvent = new AgentEvent();
			agentEvent.setInstanceId(context.stringValue("ListAgentEventsResponse.Data.List["+ i +"].InstanceId"));
			agentEvent.setRamId(context.longValue("ListAgentEventsResponse.Data.List["+ i +"].RamId"));
			agentEvent.setLoginName(context.stringValue("ListAgentEventsResponse.Data.List["+ i +"].LoginName"));
			agentEvent.setEvent(context.stringValue("ListAgentEventsResponse.Data.List["+ i +"].Event"));
			agentEvent.setEventTime(context.longValue("ListAgentEventsResponse.Data.List["+ i +"].EventTime"));

			List<SkillGroup> skillGroupIds = new ArrayList<SkillGroup>();
			for (int j = 0; j < context.lengthValue("ListAgentEventsResponse.Data.List["+ i +"].SkillGroupIds.Length"); j++) {
				SkillGroup skillGroup = new SkillGroup();
				skillGroup.setSkillGroupId(context.stringValue("ListAgentEventsResponse.Data.List["+ i +"].SkillGroupIds["+ j +"].SkillGroupId"));
				skillGroup.setSkillGroupName(context.stringValue("ListAgentEventsResponse.Data.List["+ i +"].SkillGroupIds["+ j +"].SkillGroupName"));

				skillGroupIds.add(skillGroup);
			}
			agentEvent.setSkillGroupIds(skillGroupIds);

			list.add(agentEvent);
		}
		data.setList(list);
		listAgentEventsResponse.setData(data);
	 
	 	return listAgentEventsResponse;
	}
}