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

import com.aliyuncs.cloudcallcenter.model.v20170705.ListWorkflowOfAgentResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListWorkflowOfAgentResponse.AgentEventLogs;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListWorkflowOfAgentResponse.AgentEventLogs.AgentEventlog;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWorkflowOfAgentResponseUnmarshaller {

	public static ListWorkflowOfAgentResponse unmarshall(ListWorkflowOfAgentResponse listWorkflowOfAgentResponse, UnmarshallerContext context) {
		
		listWorkflowOfAgentResponse.setRequestId(context.stringValue("ListWorkflowOfAgentResponse.RequestId"));
		listWorkflowOfAgentResponse.setSuccess(context.booleanValue("ListWorkflowOfAgentResponse.Success"));
		listWorkflowOfAgentResponse.setCode(context.stringValue("ListWorkflowOfAgentResponse.Code"));
		listWorkflowOfAgentResponse.setMessage(context.stringValue("ListWorkflowOfAgentResponse.Message"));
		listWorkflowOfAgentResponse.setHttpStatusCode(context.integerValue("ListWorkflowOfAgentResponse.HttpStatusCode"));

		AgentEventLogs agentEventLogs = new AgentEventLogs();
		agentEventLogs.setTotalCount(context.integerValue("ListWorkflowOfAgentResponse.AgentEventLogs.TotalCount"));
		agentEventLogs.setPageNumber(context.integerValue("ListWorkflowOfAgentResponse.AgentEventLogs.PageNumber"));
		agentEventLogs.setPageSize(context.integerValue("ListWorkflowOfAgentResponse.AgentEventLogs.PageSize"));

		List<AgentEventlog> list = new ArrayList<AgentEventlog>();
		for (int i = 0; i < context.lengthValue("ListWorkflowOfAgentResponse.AgentEventLogs.List.Length"); i++) {
			AgentEventlog agentEventlog = new AgentEventlog();
			agentEventlog.setAgentNo(context.stringValue("ListWorkflowOfAgentResponse.AgentEventLogs.List["+ i +"].AgentNo"));
			agentEventlog.setEvent(context.stringValue("ListWorkflowOfAgentResponse.AgentEventLogs.List["+ i +"].Event"));
			agentEventlog.setConnId(context.stringValue("ListWorkflowOfAgentResponse.AgentEventLogs.List["+ i +"].ConnId"));
			agentEventlog.setCallType(context.stringValue("ListWorkflowOfAgentResponse.AgentEventLogs.List["+ i +"].CallType"));
			agentEventlog.setCallingNumber(context.stringValue("ListWorkflowOfAgentResponse.AgentEventLogs.List["+ i +"].CallingNumber"));
			agentEventlog.setCalledNumber(context.stringValue("ListWorkflowOfAgentResponse.AgentEventLogs.List["+ i +"].CalledNumber"));
			agentEventlog.setStartTime(context.stringValue("ListWorkflowOfAgentResponse.AgentEventLogs.List["+ i +"].StartTime"));
			agentEventlog.setCallId(context.stringValue("ListWorkflowOfAgentResponse.AgentEventLogs.List["+ i +"].CallId"));

			list.add(agentEventlog);
		}
		agentEventLogs.setList(list);
		listWorkflowOfAgentResponse.setAgentEventLogs(agentEventLogs);
	 
	 	return listWorkflowOfAgentResponse;
	}
}