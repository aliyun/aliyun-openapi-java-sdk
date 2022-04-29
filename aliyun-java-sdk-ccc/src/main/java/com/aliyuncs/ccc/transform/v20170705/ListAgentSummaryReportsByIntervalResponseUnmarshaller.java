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

import com.aliyuncs.ccc.model.v20170705.ListAgentSummaryReportsByIntervalResponse;
import com.aliyuncs.ccc.model.v20170705.ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport;
import com.aliyuncs.ccc.model.v20170705.ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.AgentTimeIntervalReport;
import com.aliyuncs.ccc.model.v20170705.ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.AgentTimeIntervalReport.AgentSummaryReport;
import com.aliyuncs.ccc.model.v20170705.ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.AgentTimeIntervalReport.AgentSummaryReport.Inbound;
import com.aliyuncs.ccc.model.v20170705.ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.AgentTimeIntervalReport.AgentSummaryReport.Outbound;
import com.aliyuncs.ccc.model.v20170705.ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.AgentTimeIntervalReport.AgentSummaryReport.Overall;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAgentSummaryReportsByIntervalResponseUnmarshaller {

	public static ListAgentSummaryReportsByIntervalResponse unmarshall(ListAgentSummaryReportsByIntervalResponse listAgentSummaryReportsByIntervalResponse, UnmarshallerContext _ctx) {
		
		listAgentSummaryReportsByIntervalResponse.setRequestId(_ctx.stringValue("ListAgentSummaryReportsByIntervalResponse.RequestId"));
		listAgentSummaryReportsByIntervalResponse.setHttpStatusCode(_ctx.integerValue("ListAgentSummaryReportsByIntervalResponse.HttpStatusCode"));
		listAgentSummaryReportsByIntervalResponse.setCode(_ctx.stringValue("ListAgentSummaryReportsByIntervalResponse.Code"));
		listAgentSummaryReportsByIntervalResponse.setMessage(_ctx.stringValue("ListAgentSummaryReportsByIntervalResponse.Message"));
		listAgentSummaryReportsByIntervalResponse.setSuccess(_ctx.booleanValue("ListAgentSummaryReportsByIntervalResponse.Success"));

		PagedAgentSummaryReport pagedAgentSummaryReport = new PagedAgentSummaryReport();
		pagedAgentSummaryReport.setPageNumber(_ctx.integerValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.PageNumber"));
		pagedAgentSummaryReport.setPageSize(_ctx.integerValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.PageSize"));
		pagedAgentSummaryReport.setTotalCount(_ctx.integerValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.TotalCount"));

		List<AgentTimeIntervalReport> list = new ArrayList<AgentTimeIntervalReport>();
		for (int i = 0; i < _ctx.lengthValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List.Length"); i++) {
			AgentTimeIntervalReport agentTimeIntervalReport = new AgentTimeIntervalReport();
			agentTimeIntervalReport.setAgentId(_ctx.stringValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].AgentId"));

			List<AgentSummaryReport> intervalList = new ArrayList<AgentSummaryReport>();
			for (int j = 0; j < _ctx.lengthValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList.Length"); j++) {
				AgentSummaryReport agentSummaryReport = new AgentSummaryReport();
				agentSummaryReport.setLoginName(_ctx.stringValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].LoginName"));
				agentSummaryReport.setAgentId(_ctx.stringValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].AgentId"));
				agentSummaryReport.setAgentName(_ctx.stringValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].AgentName"));
				agentSummaryReport.setSkillGroupNames(_ctx.stringValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].SkillGroupNames"));
				agentSummaryReport.setTimestamp(_ctx.stringValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Timestamp"));
				agentSummaryReport.setInstanceId(_ctx.stringValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].InstanceId"));
				agentSummaryReport.setSkillGroupIds(_ctx.stringValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].SkillGroupIds"));

				Overall overall = new Overall();
				overall.setTotalTalkTime(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.TotalTalkTime"));
				overall.setTotalLoggedInTime(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.TotalLoggedInTime"));
				overall.setOccupancyRate(_ctx.floatValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.OccupancyRate"));
				overall.setLastLogOutTime(_ctx.stringValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.LastLogOutTime"));
				overall.setFirstLogInTime(_ctx.stringValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.FirstLogInTime"));
				overall.setTotalWorkTime(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.TotalWorkTime"));
				overall.setMaxWorkTime(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.MaxWorkTime"));
				overall.setAverageWorkTime(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.AverageWorkTime"));
				overall.setAverageTalkTime(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.AverageTalkTime"));
				overall.setSatisfactionIndex(_ctx.floatValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.SatisfactionIndex"));
				overall.setSatisfactionSurveysOffered(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.SatisfactionSurveysOffered"));
				overall.setSatisfactionSurveysResponded(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.SatisfactionSurveysResponded"));
				overall.setAverageReadyTime(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.AverageReadyTime"));
				overall.setMaxReadyTime(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.MaxReadyTime"));
				overall.setOneTransferCalls(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.OneTransferCalls"));
				overall.setMaxTalkTime(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.MaxTalkTime"));
				overall.setTotalReadyTime(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.TotalReadyTime"));
				overall.setTotalBreakTime(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.TotalBreakTime"));
				overall.setTotalCalls(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.TotalCalls"));
				agentSummaryReport.setOverall(overall);

				Inbound inbound = new Inbound();
				inbound.setTotalTalkTime(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.TotalTalkTime"));
				inbound.setCallsOffered(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.CallsOffered"));
				inbound.setAverageRingTime(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.AverageRingTime"));
				inbound.setCallsHandled(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.CallsHandled"));
				inbound.setServiceLevel20(_ctx.floatValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.ServiceLevel20"));
				inbound.setTotalWorkTime(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.TotalWorkTime"));
				inbound.setMaxWorkTime(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.MaxWorkTime"));
				inbound.setAverageWorkTime(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.AverageWorkTime"));
				inbound.setAverageTalkTime(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.AverageTalkTime"));
				inbound.setSatisfactionIndex(_ctx.floatValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.SatisfactionIndex"));
				inbound.setSatisfactionSurveysOffered(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.SatisfactionSurveysOffered"));
				inbound.setHandleRate(_ctx.floatValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.HandleRate"));
				inbound.setSatisfactionSurveysResponded(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.SatisfactionSurveysResponded"));
				inbound.setTotalRingTime(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.TotalRingTime"));
				inbound.setMaxTalkTime(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.MaxTalkTime"));
				inbound.setMaxRingTime(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.MaxRingTime"));
				agentSummaryReport.setInbound(inbound);

				Outbound outbound = new Outbound();
				outbound.setTotalTalkTime(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.TotalTalkTime"));
				outbound.setMaxDialingTime(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.MaxDialingTime"));
				outbound.setCallsDialed(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.CallsDialed"));
				outbound.setCallsAnswered(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.CallsAnswered"));
				outbound.setAnswerRate(_ctx.floatValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.AnswerRate"));
				outbound.setTotalWorkTime(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.TotalWorkTime"));
				outbound.setMaxWorkTime(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.MaxWorkTime"));
				outbound.setTotalDialingTime(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.TotalDialingTime"));
				outbound.setAverageTalkTime(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.AverageTalkTime"));
				outbound.setAverageWorkTime(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.AverageWorkTime"));
				outbound.setSatisfactionIndex(_ctx.floatValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.SatisfactionIndex"));
				outbound.setSatisfactionSurveysOffered(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.SatisfactionSurveysOffered"));
				outbound.setSatisfactionSurveysResponded(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.SatisfactionSurveysResponded"));
				outbound.setMaxTalkTime(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.MaxTalkTime"));
				outbound.setAverageDialingTime(_ctx.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.AverageDialingTime"));
				agentSummaryReport.setOutbound(outbound);

				intervalList.add(agentSummaryReport);
			}
			agentTimeIntervalReport.setIntervalList(intervalList);

			list.add(agentTimeIntervalReport);
		}
		pagedAgentSummaryReport.setList(list);
		listAgentSummaryReportsByIntervalResponse.setPagedAgentSummaryReport(pagedAgentSummaryReport);
	 
	 	return listAgentSummaryReportsByIntervalResponse;
	}
}