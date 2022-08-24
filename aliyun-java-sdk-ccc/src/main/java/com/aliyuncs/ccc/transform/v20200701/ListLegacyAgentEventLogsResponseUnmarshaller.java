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

import com.aliyuncs.ccc.model.v20200701.ListLegacyAgentEventLogsResponse;
import com.aliyuncs.ccc.model.v20200701.ListLegacyAgentEventLogsResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListLegacyAgentEventLogsResponse.Data.AgentEventLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLegacyAgentEventLogsResponseUnmarshaller {

	public static ListLegacyAgentEventLogsResponse unmarshall(ListLegacyAgentEventLogsResponse listLegacyAgentEventLogsResponse, UnmarshallerContext _ctx) {
		
		listLegacyAgentEventLogsResponse.setRequestId(_ctx.stringValue("ListLegacyAgentEventLogsResponse.RequestId"));
		listLegacyAgentEventLogsResponse.setHttpStatusCode(_ctx.integerValue("ListLegacyAgentEventLogsResponse.HttpStatusCode"));
		listLegacyAgentEventLogsResponse.setCode(_ctx.stringValue("ListLegacyAgentEventLogsResponse.Code"));
		listLegacyAgentEventLogsResponse.setMessage(_ctx.stringValue("ListLegacyAgentEventLogsResponse.Message"));
		listLegacyAgentEventLogsResponse.setSuccess(_ctx.booleanValue("ListLegacyAgentEventLogsResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListLegacyAgentEventLogsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListLegacyAgentEventLogsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListLegacyAgentEventLogsResponse.Data.TotalCount"));

		List<AgentEventLog> list = new ArrayList<AgentEventLog>();
		for (int i = 0; i < _ctx.lengthValue("ListLegacyAgentEventLogsResponse.Data.List.Length"); i++) {
			AgentEventLog agentEventLog = new AgentEventLog();
			agentEventLog.setTargetSelect(_ctx.stringValue("ListLegacyAgentEventLogsResponse.Data.List["+ i +"].TargetSelect"));
			agentEventLog.setTargetRequest(_ctx.stringValue("ListLegacyAgentEventLogsResponse.Data.List["+ i +"].TargetRequest"));
			agentEventLog.setStatisticDate(_ctx.stringValue("ListLegacyAgentEventLogsResponse.Data.List["+ i +"].StatisticDate"));
			agentEventLog.setPhoneNo(_ctx.stringValue("ListLegacyAgentEventLogsResponse.Data.List["+ i +"].PhoneNo"));
			agentEventLog.setGroupNo(_ctx.stringValue("ListLegacyAgentEventLogsResponse.Data.List["+ i +"].GroupNo"));
			agentEventLog.setEvent(_ctx.stringValue("ListLegacyAgentEventLogsResponse.Data.List["+ i +"].Event"));
			agentEventLog.setConnId(_ctx.stringValue("ListLegacyAgentEventLogsResponse.Data.List["+ i +"].ConnId"));
			agentEventLog.setCallType(_ctx.stringValue("ListLegacyAgentEventLogsResponse.Data.List["+ i +"].CallType"));
			agentEventLog.setCallId(_ctx.stringValue("ListLegacyAgentEventLogsResponse.Data.List["+ i +"].CallId"));
			agentEventLog.setCallerId(_ctx.stringValue("ListLegacyAgentEventLogsResponse.Data.List["+ i +"].CallerId"));
			agentEventLog.setCalleeId(_ctx.stringValue("ListLegacyAgentEventLogsResponse.Data.List["+ i +"].CalleeId"));
			agentEventLog.setAgentNo(_ctx.stringValue("ListLegacyAgentEventLogsResponse.Data.List["+ i +"].AgentNo"));
			agentEventLog.setAgentDropCall(_ctx.stringValue("ListLegacyAgentEventLogsResponse.Data.List["+ i +"].AgentDropCall"));
			agentEventLog.setTransferNumber(_ctx.stringValue("ListLegacyAgentEventLogsResponse.Data.List["+ i +"].TransferNumber"));
			agentEventLog.setCallDir(_ctx.stringValue("ListLegacyAgentEventLogsResponse.Data.List["+ i +"].CallDir"));
			agentEventLog.setCallMode(_ctx.stringValue("ListLegacyAgentEventLogsResponse.Data.List["+ i +"].CallMode"));
			agentEventLog.setTenantId(_ctx.stringValue("ListLegacyAgentEventLogsResponse.Data.List["+ i +"].TenantId"));
			agentEventLog.setOutboundScenario(_ctx.booleanValue("ListLegacyAgentEventLogsResponse.Data.List["+ i +"].OutboundScenario"));

			list.add(agentEventLog);
		}
		data.setList(list);
		listLegacyAgentEventLogsResponse.setData(data);
	 
	 	return listLegacyAgentEventLogsResponse;
	}
}