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

import com.aliyuncs.ccc.model.v20170705.ListAgentSummaryReportsResponse;
import com.aliyuncs.ccc.model.v20170705.ListAgentSummaryReportsResponse.PagedAgentSummaryReport;
import com.aliyuncs.ccc.model.v20170705.ListAgentSummaryReportsResponse.PagedAgentSummaryReport.AgentSummaryReport;
import com.aliyuncs.ccc.model.v20170705.ListAgentSummaryReportsResponse.PagedAgentSummaryReport.AgentSummaryReport.Inbound;
import com.aliyuncs.ccc.model.v20170705.ListAgentSummaryReportsResponse.PagedAgentSummaryReport.AgentSummaryReport.Outbound;
import com.aliyuncs.ccc.model.v20170705.ListAgentSummaryReportsResponse.PagedAgentSummaryReport.AgentSummaryReport.Overall;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAgentSummaryReportsResponseUnmarshaller {

	public static ListAgentSummaryReportsResponse unmarshall(ListAgentSummaryReportsResponse listAgentSummaryReportsResponse, UnmarshallerContext context) {
		
		listAgentSummaryReportsResponse.setRequestId(context.stringValue("ListAgentSummaryReportsResponse.RequestId"));
		listAgentSummaryReportsResponse.setSuccess(context.booleanValue("ListAgentSummaryReportsResponse.Success"));
		listAgentSummaryReportsResponse.setCode(context.stringValue("ListAgentSummaryReportsResponse.Code"));
		listAgentSummaryReportsResponse.setMessage(context.stringValue("ListAgentSummaryReportsResponse.Message"));
		listAgentSummaryReportsResponse.setHttpStatusCode(context.integerValue("ListAgentSummaryReportsResponse.HttpStatusCode"));

		PagedAgentSummaryReport pagedAgentSummaryReport = new PagedAgentSummaryReport();
		pagedAgentSummaryReport.setTotalCount(context.integerValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.TotalCount"));
		pagedAgentSummaryReport.setPageNumber(context.integerValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.PageNumber"));
		pagedAgentSummaryReport.setPageSize(context.integerValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.PageSize"));

		List<AgentSummaryReport> list = new ArrayList<AgentSummaryReport>();
		for (int i = 0; i < context.lengthValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List.Length"); i++) {
			AgentSummaryReport agentSummaryReport = new AgentSummaryReport();
			agentSummaryReport.setInstanceId(context.stringValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].InstanceId"));
			agentSummaryReport.setAgentId(context.stringValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].AgentId"));
			agentSummaryReport.setLoginName(context.stringValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].LoginName"));
			agentSummaryReport.setAgentName(context.stringValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].AgentName"));
			agentSummaryReport.setSkillGroupIds(context.stringValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].SkillGroupIds"));
			agentSummaryReport.setSkillGroupNames(context.stringValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].SkillGroupNames"));

			Overall overall = new Overall();
			overall.setTotalCalls(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Overall.TotalCalls"));
			overall.setTotalLoggedInTime(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Overall.TotalLoggedInTime"));
			overall.setTotalBreakTime(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Overall.TotalBreakTime"));
			overall.setOccupancyRate(context.floatValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Overall.OccupancyRate"));
			overall.setTotalReadyTime(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Overall.TotalReadyTime"));
			overall.setMaxReadyTime(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Overall.MaxReadyTime"));
			overall.setAverageReadyTime(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Overall.AverageReadyTime"));
			overall.setTotalTalkTime(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Overall.TotalTalkTime"));
			overall.setMaxTalkTime(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Overall.MaxTalkTime"));
			overall.setAverageTalkTime(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Overall.AverageTalkTime"));
			overall.setTotalWorkTime(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Overall.TotalWorkTime"));
			overall.setMaxWorkTime(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Overall.MaxWorkTime"));
			overall.setAverageWorkTime(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Overall.AverageWorkTime"));
			overall.setSatisfactionIndex(context.floatValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Overall.SatisfactionIndex"));
			overall.setSatisfactionSurveysOffered(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Overall.SatisfactionSurveysOffered"));
			overall.setSatisfactionSurveysResponded(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Overall.SatisfactionSurveysResponded"));
			agentSummaryReport.setOverall(overall);

			Inbound inbound = new Inbound();
			inbound.setCallsOffered(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Inbound.CallsOffered"));
			inbound.setCallsHandled(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Inbound.CallsHandled"));
			inbound.setHandleRate(context.floatValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Inbound.HandleRate"));
			inbound.setTotalRingTime(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Inbound.TotalRingTime"));
			inbound.setMaxRingTime(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Inbound.MaxRingTime"));
			inbound.setAverageRingTime(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Inbound.AverageRingTime"));
			inbound.setServiceLevel20(context.floatValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Inbound.ServiceLevel20"));
			inbound.setTotalTalkTime(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Inbound.TotalTalkTime"));
			inbound.setMaxTalkTime(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Inbound.MaxTalkTime"));
			inbound.setAverageTalkTime(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Inbound.AverageTalkTime"));
			inbound.setTotalWorkTime(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Inbound.TotalWorkTime"));
			inbound.setMaxWorkTime(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Inbound.MaxWorkTime"));
			inbound.setAverageWorkTime(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Inbound.AverageWorkTime"));
			inbound.setSatisfactionIndex(context.floatValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Inbound.SatisfactionIndex"));
			inbound.setSatisfactionSurveysOffered(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Inbound.SatisfactionSurveysOffered"));
			inbound.setSatisfactionSurveysResponded(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Inbound.SatisfactionSurveysResponded"));
			agentSummaryReport.setInbound(inbound);

			Outbound outbound = new Outbound();
			outbound.setCallsDialed(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Outbound.CallsDialed"));
			outbound.setCallsAnswered(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Outbound.CallsAnswered"));
			outbound.setAnswerRate(context.floatValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Outbound.AnswerRate"));
			outbound.setTotalDialingTime(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Outbound.TotalDialingTime"));
			outbound.setMaxDialingTime(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Outbound.MaxDialingTime"));
			outbound.setAverageDialingTime(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Outbound.AverageDialingTime"));
			outbound.setTotalTalkTime(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Outbound.TotalTalkTime"));
			outbound.setMaxTalkTime(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Outbound.MaxTalkTime"));
			outbound.setAverageTalkTime(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Outbound.AverageTalkTime"));
			outbound.setTotalWorkTime(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Outbound.TotalWorkTime"));
			outbound.setMaxWorkTime(context.stringValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Outbound.MaxWorkTime"));
			outbound.setAverageWorkTime(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Outbound.AverageWorkTime"));
			outbound.setSatisfactionIndex(context.floatValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Outbound.SatisfactionIndex"));
			outbound.setSatisfactionSurveysOffered(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Outbound.SatisfactionSurveysOffered"));
			outbound.setSatisfactionSurveysResponded(context.longValue("ListAgentSummaryReportsResponse.PagedAgentSummaryReport.List["+ i +"].Outbound.SatisfactionSurveysResponded"));
			agentSummaryReport.setOutbound(outbound);

			list.add(agentSummaryReport);
		}
		pagedAgentSummaryReport.setList(list);
		listAgentSummaryReportsResponse.setPagedAgentSummaryReport(pagedAgentSummaryReport);
	 
	 	return listAgentSummaryReportsResponse;
	}
}