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

import com.aliyuncs.ccc.model.v20170705.ListAgentSummaryReportsSinceMidnightResponse;
import com.aliyuncs.ccc.model.v20170705.ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport;
import com.aliyuncs.ccc.model.v20170705.ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.AgentSummaryReport;
import com.aliyuncs.ccc.model.v20170705.ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.AgentSummaryReport.Inbound;
import com.aliyuncs.ccc.model.v20170705.ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.AgentSummaryReport.Outbound;
import com.aliyuncs.ccc.model.v20170705.ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.AgentSummaryReport.Overall;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAgentSummaryReportsSinceMidnightResponseUnmarshaller {

	public static ListAgentSummaryReportsSinceMidnightResponse unmarshall(ListAgentSummaryReportsSinceMidnightResponse listAgentSummaryReportsSinceMidnightResponse, UnmarshallerContext _ctx) {
		
		listAgentSummaryReportsSinceMidnightResponse.setRequestId(_ctx.stringValue("ListAgentSummaryReportsSinceMidnightResponse.RequestId"));
		listAgentSummaryReportsSinceMidnightResponse.setHttpStatusCode(_ctx.integerValue("ListAgentSummaryReportsSinceMidnightResponse.HttpStatusCode"));
		listAgentSummaryReportsSinceMidnightResponse.setCode(_ctx.stringValue("ListAgentSummaryReportsSinceMidnightResponse.Code"));
		listAgentSummaryReportsSinceMidnightResponse.setMessage(_ctx.stringValue("ListAgentSummaryReportsSinceMidnightResponse.Message"));
		listAgentSummaryReportsSinceMidnightResponse.setSuccess(_ctx.booleanValue("ListAgentSummaryReportsSinceMidnightResponse.Success"));

		PagedAgentSummaryReport pagedAgentSummaryReport = new PagedAgentSummaryReport();
		pagedAgentSummaryReport.setPageNumber(_ctx.integerValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.PageNumber"));
		pagedAgentSummaryReport.setPageSize(_ctx.integerValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.PageSize"));
		pagedAgentSummaryReport.setTotalCount(_ctx.integerValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.TotalCount"));

		List<AgentSummaryReport> list = new ArrayList<AgentSummaryReport>();
		for (int i = 0; i < _ctx.lengthValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List.Length"); i++) {
			AgentSummaryReport agentSummaryReport = new AgentSummaryReport();
			agentSummaryReport.setLoginName(_ctx.stringValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].LoginName"));
			agentSummaryReport.setAgentId(_ctx.stringValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].AgentId"));
			agentSummaryReport.setAgentName(_ctx.stringValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].AgentName"));
			agentSummaryReport.setSkillGroupNames(_ctx.stringValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].SkillGroupNames"));
			agentSummaryReport.setTimestamp(_ctx.stringValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Timestamp"));
			agentSummaryReport.setInstanceId(_ctx.stringValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].InstanceId"));
			agentSummaryReport.setSkillGroupIds(_ctx.stringValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].SkillGroupIds"));

			Overall overall = new Overall();
			overall.setTotalTalkTime(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Overall.TotalTalkTime"));
			overall.setTotalLoggedInTime(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Overall.TotalLoggedInTime"));
			overall.setOccupancyRate(_ctx.floatValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Overall.OccupancyRate"));
			overall.setTotalWorkTime(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Overall.TotalWorkTime"));
			overall.setMaxWorkTime(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Overall.MaxWorkTime"));
			overall.setAverageWorkTime(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Overall.AverageWorkTime"));
			overall.setAverageTalkTime(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Overall.AverageTalkTime"));
			overall.setSatisfactionIndex(_ctx.floatValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Overall.SatisfactionIndex"));
			overall.setSatisfactionSurveysOffered(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Overall.SatisfactionSurveysOffered"));
			overall.setSatisfactionSurveysResponded(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Overall.SatisfactionSurveysResponded"));
			overall.setAverageReadyTime(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Overall.AverageReadyTime"));
			overall.setMaxReadyTime(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Overall.MaxReadyTime"));
			overall.setOneTransferCalls(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Overall.OneTransferCalls"));
			overall.setMaxTalkTime(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Overall.MaxTalkTime"));
			overall.setTotalReadyTime(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Overall.TotalReadyTime"));
			overall.setTotalBreakTime(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Overall.TotalBreakTime"));
			overall.setTotalCalls(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Overall.TotalCalls"));
			agentSummaryReport.setOverall(overall);

			Inbound inbound = new Inbound();
			inbound.setTotalTalkTime(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Inbound.TotalTalkTime"));
			inbound.setCallsOffered(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Inbound.CallsOffered"));
			inbound.setAverageRingTime(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Inbound.AverageRingTime"));
			inbound.setCallsHandled(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Inbound.CallsHandled"));
			inbound.setServiceLevel20(_ctx.floatValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Inbound.ServiceLevel20"));
			inbound.setTotalWorkTime(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Inbound.TotalWorkTime"));
			inbound.setMaxWorkTime(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Inbound.MaxWorkTime"));
			inbound.setAverageWorkTime(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Inbound.AverageWorkTime"));
			inbound.setAverageTalkTime(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Inbound.AverageTalkTime"));
			inbound.setSatisfactionIndex(_ctx.floatValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Inbound.SatisfactionIndex"));
			inbound.setSatisfactionSurveysOffered(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Inbound.SatisfactionSurveysOffered"));
			inbound.setHandleRate(_ctx.floatValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Inbound.HandleRate"));
			inbound.setSatisfactionSurveysResponded(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Inbound.SatisfactionSurveysResponded"));
			inbound.setTotalRingTime(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Inbound.TotalRingTime"));
			inbound.setMaxTalkTime(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Inbound.MaxTalkTime"));
			inbound.setMaxRingTime(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Inbound.MaxRingTime"));
			agentSummaryReport.setInbound(inbound);

			Outbound outbound = new Outbound();
			outbound.setTotalTalkTime(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Outbound.TotalTalkTime"));
			outbound.setMaxDialingTime(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Outbound.MaxDialingTime"));
			outbound.setCallsDialed(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Outbound.CallsDialed"));
			outbound.setCallsAnswered(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Outbound.CallsAnswered"));
			outbound.setAnswerRate(_ctx.floatValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Outbound.AnswerRate"));
			outbound.setTotalWorkTime(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Outbound.TotalWorkTime"));
			outbound.setMaxWorkTime(_ctx.stringValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Outbound.MaxWorkTime"));
			outbound.setTotalDialingTime(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Outbound.TotalDialingTime"));
			outbound.setAverageTalkTime(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Outbound.AverageTalkTime"));
			outbound.setAverageWorkTime(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Outbound.AverageWorkTime"));
			outbound.setSatisfactionIndex(_ctx.floatValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Outbound.SatisfactionIndex"));
			outbound.setSatisfactionSurveysOffered(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Outbound.SatisfactionSurveysOffered"));
			outbound.setSatisfactionSurveysResponded(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Outbound.SatisfactionSurveysResponded"));
			outbound.setMaxTalkTime(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Outbound.MaxTalkTime"));
			outbound.setAverageDialingTime(_ctx.longValue("ListAgentSummaryReportsSinceMidnightResponse.PagedAgentSummaryReport.List["+ i +"].Outbound.AverageDialingTime"));
			agentSummaryReport.setOutbound(outbound);

			list.add(agentSummaryReport);
		}
		pagedAgentSummaryReport.setList(list);
		listAgentSummaryReportsSinceMidnightResponse.setPagedAgentSummaryReport(pagedAgentSummaryReport);
	 
	 	return listAgentSummaryReportsSinceMidnightResponse;
	}
}