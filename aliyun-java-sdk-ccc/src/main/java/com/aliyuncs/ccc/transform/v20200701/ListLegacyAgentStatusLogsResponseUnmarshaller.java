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

import com.aliyuncs.ccc.model.v20200701.ListLegacyAgentStatusLogsResponse;
import com.aliyuncs.ccc.model.v20200701.ListLegacyAgentStatusLogsResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListLegacyAgentStatusLogsResponse.Data.AgentStatusLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLegacyAgentStatusLogsResponseUnmarshaller {

	public static ListLegacyAgentStatusLogsResponse unmarshall(ListLegacyAgentStatusLogsResponse listLegacyAgentStatusLogsResponse, UnmarshallerContext _ctx) {
		
		listLegacyAgentStatusLogsResponse.setRequestId(_ctx.stringValue("ListLegacyAgentStatusLogsResponse.RequestId"));
		listLegacyAgentStatusLogsResponse.setHttpStatusCode(_ctx.integerValue("ListLegacyAgentStatusLogsResponse.HttpStatusCode"));
		listLegacyAgentStatusLogsResponse.setCode(_ctx.stringValue("ListLegacyAgentStatusLogsResponse.Code"));
		listLegacyAgentStatusLogsResponse.setMessage(_ctx.stringValue("ListLegacyAgentStatusLogsResponse.Message"));
		listLegacyAgentStatusLogsResponse.setSuccess(_ctx.booleanValue("ListLegacyAgentStatusLogsResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListLegacyAgentStatusLogsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListLegacyAgentStatusLogsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListLegacyAgentStatusLogsResponse.Data.TotalCount"));

		List<AgentStatusLog> list = new ArrayList<AgentStatusLog>();
		for (int i = 0; i < _ctx.lengthValue("ListLegacyAgentStatusLogsResponse.Data.List.Length"); i++) {
			AgentStatusLog agentStatusLog = new AgentStatusLog();
			agentStatusLog.setTransferNo(_ctx.stringValue("ListLegacyAgentStatusLogsResponse.Data.List["+ i +"].TransferNo"));
			agentStatusLog.setTargetSelect(_ctx.stringValue("ListLegacyAgentStatusLogsResponse.Data.List["+ i +"].TargetSelect"));
			agentStatusLog.setTargetRequest(_ctx.stringValue("ListLegacyAgentStatusLogsResponse.Data.List["+ i +"].TargetRequest"));
			agentStatusLog.setStatus(_ctx.stringValue("ListLegacyAgentStatusLogsResponse.Data.List["+ i +"].Status"));
			agentStatusLog.setStatisticDate(_ctx.stringValue("ListLegacyAgentStatusLogsResponse.Data.List["+ i +"].StatisticDate"));
			agentStatusLog.setStatisticTime(_ctx.integerValue("ListLegacyAgentStatusLogsResponse.Data.List["+ i +"].StatisticTime"));
			agentStatusLog.setPhoneNo(_ctx.stringValue("ListLegacyAgentStatusLogsResponse.Data.List["+ i +"].PhoneNo"));
			agentStatusLog.setMonitedAgentPhoneNo(_ctx.stringValue("ListLegacyAgentStatusLogsResponse.Data.List["+ i +"].MonitedAgentPhoneNo"));
			agentStatusLog.setMonitedAgentNo(_ctx.stringValue("ListLegacyAgentStatusLogsResponse.Data.List["+ i +"].MonitedAgentNo"));
			agentStatusLog.setGroupNo(_ctx.stringValue("ListLegacyAgentStatusLogsResponse.Data.List["+ i +"].GroupNo"));
			agentStatusLog.setConnId(_ctx.stringValue("ListLegacyAgentStatusLogsResponse.Data.List["+ i +"].ConnId"));
			agentStatusLog.setCallType(_ctx.stringValue("ListLegacyAgentStatusLogsResponse.Data.List["+ i +"].CallType"));
			agentStatusLog.setCallId(_ctx.stringValue("ListLegacyAgentStatusLogsResponse.Data.List["+ i +"].CallId"));
			agentStatusLog.setCallerId(_ctx.stringValue("ListLegacyAgentStatusLogsResponse.Data.List["+ i +"].CallerId"));
			agentStatusLog.setCalleeId(_ctx.stringValue("ListLegacyAgentStatusLogsResponse.Data.List["+ i +"].CalleeId"));
			agentStatusLog.setCallDir(_ctx.stringValue("ListLegacyAgentStatusLogsResponse.Data.List["+ i +"].CallDir"));
			agentStatusLog.setAgentNo(_ctx.stringValue("ListLegacyAgentStatusLogsResponse.Data.List["+ i +"].AgentNo"));
			agentStatusLog.setAgentDropCall(_ctx.stringValue("ListLegacyAgentStatusLogsResponse.Data.List["+ i +"].AgentDropCall"));
			agentStatusLog.setAliHangupCause(_ctx.stringValue("ListLegacyAgentStatusLogsResponse.Data.List["+ i +"].AliHangupCause"));
			agentStatusLog.setTransferNumber(_ctx.stringValue("ListLegacyAgentStatusLogsResponse.Data.List["+ i +"].TransferNumber"));
			agentStatusLog.setExtend1(_ctx.stringValue("ListLegacyAgentStatusLogsResponse.Data.List["+ i +"].Extend1"));
			agentStatusLog.setExtend2(_ctx.stringValue("ListLegacyAgentStatusLogsResponse.Data.List["+ i +"].Extend2"));
			agentStatusLog.setExtend3(_ctx.stringValue("ListLegacyAgentStatusLogsResponse.Data.List["+ i +"].Extend3"));
			agentStatusLog.setExtend4(_ctx.stringValue("ListLegacyAgentStatusLogsResponse.Data.List["+ i +"].Extend4"));
			agentStatusLog.setTenantId(_ctx.stringValue("ListLegacyAgentStatusLogsResponse.Data.List["+ i +"].TenantId"));
			agentStatusLog.setOutboundScenario(_ctx.booleanValue("ListLegacyAgentStatusLogsResponse.Data.List["+ i +"].OutboundScenario"));

			list.add(agentStatusLog);
		}
		data.setList(list);
		listLegacyAgentStatusLogsResponse.setData(data);
	 
	 	return listLegacyAgentStatusLogsResponse;
	}
}