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

package com.aliyuncs.outboundbot.transform.v20191226;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.GetSummaryInfoResponse;
import com.aliyuncs.outboundbot.model.v20191226.GetSummaryInfoResponse.AgentBotInstanceSummary;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSummaryInfoResponseUnmarshaller {

	public static GetSummaryInfoResponse unmarshall(GetSummaryInfoResponse getSummaryInfoResponse, UnmarshallerContext _ctx) {
		
		getSummaryInfoResponse.setRequestId(_ctx.stringValue("GetSummaryInfoResponse.RequestId"));
		getSummaryInfoResponse.setSuccess(_ctx.booleanValue("GetSummaryInfoResponse.Success"));
		getSummaryInfoResponse.setCode(_ctx.stringValue("GetSummaryInfoResponse.Code"));
		getSummaryInfoResponse.setMessage(_ctx.stringValue("GetSummaryInfoResponse.Message"));
		getSummaryInfoResponse.setHttpStatusCode(_ctx.integerValue("GetSummaryInfoResponse.HttpStatusCode"));

		List<AgentBotInstanceSummary> agentBotInstanceSummaryList = new ArrayList<AgentBotInstanceSummary>();
		for (int i = 0; i < _ctx.lengthValue("GetSummaryInfoResponse.AgentBotInstanceSummaryList.Length"); i++) {
			AgentBotInstanceSummary agentBotInstanceSummary = new AgentBotInstanceSummary();
			agentBotInstanceSummary.setTotalCallTime(_ctx.longValue("GetSummaryInfoResponse.AgentBotInstanceSummaryList["+ i +"].TotalCallTime"));
			agentBotInstanceSummary.setTotalCallCount(_ctx.longValue("GetSummaryInfoResponse.AgentBotInstanceSummaryList["+ i +"].TotalCallCount"));
			agentBotInstanceSummary.setUsedRecordingStorageSpace(_ctx.integerValue("GetSummaryInfoResponse.AgentBotInstanceSummaryList["+ i +"].UsedRecordingStorageSpace"));
			agentBotInstanceSummary.setInstanceId(_ctx.stringValue("GetSummaryInfoResponse.AgentBotInstanceSummaryList["+ i +"].InstanceId"));

			agentBotInstanceSummaryList.add(agentBotInstanceSummary);
		}
		getSummaryInfoResponse.setAgentBotInstanceSummaryList(agentBotInstanceSummaryList);
	 
	 	return getSummaryInfoResponse;
	}
}