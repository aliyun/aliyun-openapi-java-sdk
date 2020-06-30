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

import com.aliyuncs.ccc.model.v20170705.ListAgentStateLogsResponse;
import com.aliyuncs.ccc.model.v20170705.ListAgentStateLogsResponse.AgentStateLogPage;
import com.aliyuncs.ccc.model.v20170705.ListAgentStateLogsResponse.AgentStateLogPage.AgentStateLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAgentStateLogsResponseUnmarshaller {

	public static ListAgentStateLogsResponse unmarshall(ListAgentStateLogsResponse listAgentStateLogsResponse, UnmarshallerContext _ctx) {
		
		listAgentStateLogsResponse.setRequestId(_ctx.stringValue("ListAgentStateLogsResponse.RequestId"));
		listAgentStateLogsResponse.setSuccess(_ctx.booleanValue("ListAgentStateLogsResponse.Success"));
		listAgentStateLogsResponse.setCode(_ctx.stringValue("ListAgentStateLogsResponse.Code"));
		listAgentStateLogsResponse.setMessage(_ctx.stringValue("ListAgentStateLogsResponse.Message"));
		listAgentStateLogsResponse.setHttpStatusCode(_ctx.integerValue("ListAgentStateLogsResponse.HttpStatusCode"));

		AgentStateLogPage agentStateLogPage = new AgentStateLogPage();
		agentStateLogPage.setTotalCount(_ctx.integerValue("ListAgentStateLogsResponse.AgentStateLogPage.TotalCount"));
		agentStateLogPage.setPageNumber(_ctx.integerValue("ListAgentStateLogsResponse.AgentStateLogPage.PageNumber"));
		agentStateLogPage.setPageSize(_ctx.integerValue("ListAgentStateLogsResponse.AgentStateLogPage.PageSize"));

		List<AgentStateLog> list = new ArrayList<AgentStateLog>();
		for (int i = 0; i < _ctx.lengthValue("ListAgentStateLogsResponse.AgentStateLogPage.List.Length"); i++) {
			AgentStateLog agentStateLog = new AgentStateLog();
			agentStateLog.setInstanceId(_ctx.stringValue("ListAgentStateLogsResponse.AgentStateLogPage.List["+ i +"].InstanceId"));
			agentStateLog.setRamId(_ctx.longValue("ListAgentStateLogsResponse.AgentStateLogPage.List["+ i +"].RamId"));
			agentStateLog.setState(_ctx.stringValue("ListAgentStateLogsResponse.AgentStateLogPage.List["+ i +"].State"));
			agentStateLog.setStateCode(_ctx.stringValue("ListAgentStateLogsResponse.AgentStateLogPage.List["+ i +"].StateCode"));
			agentStateLog.setStateTime(_ctx.longValue("ListAgentStateLogsResponse.AgentStateLogPage.List["+ i +"].StateTime"));
			agentStateLog.setContactId(_ctx.stringValue("ListAgentStateLogsResponse.AgentStateLogPage.List["+ i +"].ContactId"));
			agentStateLog.setConnectId(_ctx.stringValue("ListAgentStateLogsResponse.AgentStateLogPage.List["+ i +"].ConnectId"));
			agentStateLog.setSkillGroupIds(_ctx.stringValue("ListAgentStateLogsResponse.AgentStateLogPage.List["+ i +"].SkillGroupIds"));
			agentStateLog.setCounterParty(_ctx.stringValue("ListAgentStateLogsResponse.AgentStateLogPage.List["+ i +"].CounterParty"));

			list.add(agentStateLog);
		}
		agentStateLogPage.setList(list);
		listAgentStateLogsResponse.setAgentStateLogPage(agentStateLogPage);
	 
	 	return listAgentStateLogsResponse;
	}
}