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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.ListRealtimeAgentStatesResponse;
import com.aliyuncs.ccc.model.v20200701.ListRealtimeAgentStatesResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListRealtimeAgentStatesResponse.Data.AgentState;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRealtimeAgentStatesResponseUnmarshaller {

	public static ListRealtimeAgentStatesResponse unmarshall(ListRealtimeAgentStatesResponse listRealtimeAgentStatesResponse, UnmarshallerContext _ctx) {
		
		listRealtimeAgentStatesResponse.setRequestId(_ctx.stringValue("ListRealtimeAgentStatesResponse.RequestId"));
		listRealtimeAgentStatesResponse.setCode(_ctx.stringValue("ListRealtimeAgentStatesResponse.Code"));
		listRealtimeAgentStatesResponse.setHttpStatusCode(_ctx.integerValue("ListRealtimeAgentStatesResponse.HttpStatusCode"));
		listRealtimeAgentStatesResponse.setMessage(_ctx.stringValue("ListRealtimeAgentStatesResponse.Message"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListRealtimeAgentStatesResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListRealtimeAgentStatesResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListRealtimeAgentStatesResponse.Data.TotalCount"));

		List<AgentState> list = new ArrayList<AgentState>();
		for (int i = 0; i < _ctx.lengthValue("ListRealtimeAgentStatesResponse.Data.List.Length"); i++) {
			AgentState agentState = new AgentState();
			agentState.setAgentId(_ctx.stringValue("ListRealtimeAgentStatesResponse.Data.List["+ i +"].AgentId"));
			agentState.setAgentName(_ctx.stringValue("ListRealtimeAgentStatesResponse.Data.List["+ i +"].AgentName"));
			agentState.setCounterParty(_ctx.stringValue("ListRealtimeAgentStatesResponse.Data.List["+ i +"].CounterParty"));
			agentState.setExtension(_ctx.stringValue("ListRealtimeAgentStatesResponse.Data.List["+ i +"].Extension"));
			agentState.setInstanceId(_ctx.stringValue("ListRealtimeAgentStatesResponse.Data.List["+ i +"].InstanceId"));
			agentState.setState(_ctx.stringValue("ListRealtimeAgentStatesResponse.Data.List["+ i +"].State"));
			agentState.setStateCode(_ctx.stringValue("ListRealtimeAgentStatesResponse.Data.List["+ i +"].StateCode"));
			agentState.setStateTime(_ctx.longValue("ListRealtimeAgentStatesResponse.Data.List["+ i +"].StateTime"));

			List<String> skillGroupIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListRealtimeAgentStatesResponse.Data.List["+ i +"].SkillGroupIdList.Length"); j++) {
				skillGroupIdList.add(_ctx.stringValue("ListRealtimeAgentStatesResponse.Data.List["+ i +"].SkillGroupIdList["+ j +"]"));
			}
			agentState.setSkillGroupIdList(skillGroupIdList);

			list.add(agentState);
		}
		data.setList(list);
		listRealtimeAgentStatesResponse.setData(data);
	 
	 	return listRealtimeAgentStatesResponse;
	}
}