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

import com.aliyuncs.cloudcallcenter.model.v20170705.ListAgentSummaryReportsResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListAgentSummaryReportsResponse.Data;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListAgentSummaryReportsResponse.Data.AgentReport;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListAgentSummaryReportsResponse.Data.AgentReport.Inbound;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListAgentSummaryReportsResponse.Data.AgentReport.Outbound;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListAgentSummaryReportsResponse.Data.AgentReport.Overall;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAgentSummaryReportsResponseUnmarshaller {

	public static ListAgentSummaryReportsResponse unmarshall(ListAgentSummaryReportsResponse listAgentSummaryReportsResponse, UnmarshallerContext context) {
		
		listAgentSummaryReportsResponse.setRequestId(context.stringValue("ListAgentSummaryReportsResponse.RequestId"));
		listAgentSummaryReportsResponse.setSuccess(context.booleanValue("ListAgentSummaryReportsResponse.Success"));
		listAgentSummaryReportsResponse.setCode(context.stringValue("ListAgentSummaryReportsResponse.Code"));
		listAgentSummaryReportsResponse.setMessage(context.stringValue("ListAgentSummaryReportsResponse.Message"));
		listAgentSummaryReportsResponse.setHttpStatusCode(context.integerValue("ListAgentSummaryReportsResponse.HttpStatusCode"));

		Data data = new Data();
		data.setTotalCount(context.integerValue("ListAgentSummaryReportsResponse.Data.TotalCount"));
		data.setPageNumber(context.integerValue("ListAgentSummaryReportsResponse.Data.PageNumber"));
		data.setPageSize(context.integerValue("ListAgentSummaryReportsResponse.Data.PageSize"));

		List<AgentReport> list = new ArrayList<AgentReport>();
		for (int i = 0; i < context.lengthValue("ListAgentSummaryReportsResponse.Data.List.Length"); i++) {
			AgentReport agentReport = new AgentReport();
			agentReport.setInstanceId(context.stringValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].InstanceId"));
			agentReport.setAgentId(context.stringValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].AgentId"));
			agentReport.setLoginName(context.stringValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].LoginName"));
			agentReport.setAgentName(context.stringValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].AgentName"));
			agentReport.setSkillGroupIds(context.stringValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].SkillGroupIds"));
			agentReport.setSkillGroupNames(context.stringValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].SkillGroupNames"));
			agentReport.setState(context.stringValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].State"));

			Overall overall = new Overall();
			overall.setFirstLoggedInTimestamp(context.stringValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Overall.FirstLoggedInTimestamp"));
			overall.setLastLoggedOutTimestamp(context.stringValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Overall.LastLoggedOutTimestamp"));
			overall.setTotalLoggedInTime(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Overall.TotalLoggedInTime"));
			overall.setTotalBreakTime(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Overall.TotalBreakTime"));
			overall.setOccupancyRate(context.floatValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Overall.OccupancyRate"));
			overall.setTotalReadyTime(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Overall.TotalReadyTime"));
			overall.setMaxReadyTime(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Overall.MaxReadyTime"));
			overall.setAverageReadyTime(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Overall.AverageReadyTime"));
			overall.setTotalCalls(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Overall.TotalCalls"));
			overall.setTotalTalkTime(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Overall.TotalTalkTime"));
			overall.setMaxTalkTime(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Overall.MaxTalkTime"));
			overall.setAverageTalkTime(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Overall.AverageTalkTime"));
			overall.setTotalWorkTime(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Overall.TotalWorkTime"));
			overall.setMaxWorkTime(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Overall.MaxWorkTime"));
			overall.setAverageWorkTime(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Overall.AverageWorkTime"));
			overall.setSatisfactionIndex(context.floatValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Overall.SatisfactionIndex"));
			overall.setSatisfactionSurveysOffered(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Overall.SatisfactionSurveysOffered"));
			overall.setSatisfactionSurveysResponded(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Overall.SatisfactionSurveysResponded"));
			agentReport.setOverall(overall);

			Inbound inbound = new Inbound();
			inbound.setCallsOffered(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Inbound.CallsOffered"));
			inbound.setCallsHandled(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Inbound.CallsHandled"));
			inbound.setHandleRate(context.floatValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Inbound.HandleRate"));
			inbound.setTotalRingTime(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Inbound.TotalRingTime"));
			inbound.setMaxRingTime(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Inbound.MaxRingTime"));
			inbound.setAverageRingTime(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Inbound.AverageRingTime"));
			inbound.setServiceLevel20(context.floatValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Inbound.ServiceLevel20"));
			inbound.setTotalTalkTime(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Inbound.TotalTalkTime"));
			inbound.setMaxTalkTime(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Inbound.MaxTalkTime"));
			inbound.setAverageTalkTime(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Inbound.AverageTalkTime"));
			inbound.setTotalWorkTime(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Inbound.TotalWorkTime"));
			inbound.setMaxWorkTime(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Inbound.MaxWorkTime"));
			inbound.setAverageWorkTime(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Inbound.AverageWorkTime"));
			inbound.setSatisfactionIndex(context.floatValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Inbound.SatisfactionIndex"));
			inbound.setSatisfactionSurveysOffered(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Inbound.SatisfactionSurveysOffered"));
			inbound.setSatisfactionSurveysResponded(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Inbound.SatisfactionSurveysResponded"));
			agentReport.setInbound(inbound);

			Outbound outbound = new Outbound();
			outbound.setCallsDialed(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Outbound.CallsDialed"));
			outbound.setCallsAnswered(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Outbound.CallsAnswered"));
			outbound.setAnswerRate(context.floatValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Outbound.AnswerRate"));
			outbound.setTotalDialingTime(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Outbound.TotalDialingTime"));
			outbound.setMaxDialingTime(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Outbound.MaxDialingTime"));
			outbound.setAverageDialingTime(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Outbound.AverageDialingTime"));
			outbound.setTotalTalkTime(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Outbound.TotalTalkTime"));
			outbound.setMaxTalkTime(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Outbound.MaxTalkTime"));
			outbound.setAverageTalkTime(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Outbound.AverageTalkTime"));
			outbound.setTotalWorkTime(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Outbound.TotalWorkTime"));
			outbound.setMaxWorkTime(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Outbound.MaxWorkTime"));
			outbound.setAverageWorkTime(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Outbound.AverageWorkTime"));
			outbound.setSatisfactionIndex(context.floatValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Outbound.SatisfactionIndex"));
			outbound.setSatisfactionSurveysOffered(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Outbound.SatisfactionSurveysOffered"));
			outbound.setSatisfactionSurveysResponded(context.longValue("ListAgentSummaryReportsResponse.Data.List["+ i +"].Outbound.SatisfactionSurveysResponded"));
			agentReport.setOutbound(outbound);

			list.add(agentReport);
		}
		data.setList(list);
		listAgentSummaryReportsResponse.setData(data);
	 
	 	return listAgentSummaryReportsResponse;
	}
}