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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAgentSummaryReportsByIntervalResponseUnmarshaller {

	public static ListAgentSummaryReportsByIntervalResponse unmarshall(ListAgentSummaryReportsByIntervalResponse listAgentSummaryReportsByIntervalResponse, UnmarshallerContext context) {
		
		listAgentSummaryReportsByIntervalResponse.setRequestId(context.stringValue("ListAgentSummaryReportsByIntervalResponse.RequestId"));
		listAgentSummaryReportsByIntervalResponse.setSuccess(context.booleanValue("ListAgentSummaryReportsByIntervalResponse.Success"));
		listAgentSummaryReportsByIntervalResponse.setCode(context.stringValue("ListAgentSummaryReportsByIntervalResponse.Code"));
		listAgentSummaryReportsByIntervalResponse.setMessage(context.stringValue("ListAgentSummaryReportsByIntervalResponse.Message"));
		listAgentSummaryReportsByIntervalResponse.setHttpStatusCode(context.integerValue("ListAgentSummaryReportsByIntervalResponse.HttpStatusCode"));

		PagedAgentSummaryReport pagedAgentSummaryReport = new PagedAgentSummaryReport();
		pagedAgentSummaryReport.setTotalCount(context.integerValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.TotalCount"));
		pagedAgentSummaryReport.setPageNumber(context.integerValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.PageNumber"));
		pagedAgentSummaryReport.setPageSize(context.integerValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.PageSize"));

		List<AgentTimeIntervalReport> list = new ArrayList<AgentTimeIntervalReport>();
		for (int i = 0; i < context.lengthValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List.Length"); i++) {
			AgentTimeIntervalReport agentTimeIntervalReport = new AgentTimeIntervalReport();
			agentTimeIntervalReport.setAgentId(context.stringValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].AgentId"));

			List<AgentSummaryReport> intervalList = new ArrayList<AgentSummaryReport>();
			for (int j = 0; j < context.lengthValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList.Length"); j++) {
				AgentSummaryReport agentSummaryReport = new AgentSummaryReport();
				agentSummaryReport.setTimestamp(context.stringValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Timestamp"));
				agentSummaryReport.setInstanceId(context.stringValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].InstanceId"));
				agentSummaryReport.setAgentId(context.stringValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].AgentId"));
				agentSummaryReport.setLoginName(context.stringValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].LoginName"));
				agentSummaryReport.setAgentName(context.stringValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].AgentName"));
				agentSummaryReport.setSkillGroupIds(context.stringValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].SkillGroupIds"));
				agentSummaryReport.setSkillGroupNames(context.stringValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].SkillGroupNames"));

				Overall overall = new Overall();
				overall.setTotalCalls(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.TotalCalls"));
				overall.setTotalLoggedInTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.TotalLoggedInTime"));
				overall.setTotalBreakTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.TotalBreakTime"));
				overall.setOccupancyRate(context.floatValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.OccupancyRate"));
				overall.setTotalReadyTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.TotalReadyTime"));
				overall.setMaxReadyTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.MaxReadyTime"));
				overall.setAverageReadyTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.AverageReadyTime"));
				overall.setTotalTalkTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.TotalTalkTime"));
				overall.setMaxTalkTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.MaxTalkTime"));
				overall.setAverageTalkTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.AverageTalkTime"));
				overall.setTotalWorkTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.TotalWorkTime"));
				overall.setMaxWorkTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.MaxWorkTime"));
				overall.setAverageWorkTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.AverageWorkTime"));
				overall.setSatisfactionIndex(context.floatValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.SatisfactionIndex"));
				overall.setSatisfactionSurveysOffered(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.SatisfactionSurveysOffered"));
				overall.setSatisfactionSurveysResponded(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.SatisfactionSurveysResponded"));
				agentSummaryReport.setOverall(overall);

				Inbound inbound = new Inbound();
				inbound.setCallsOffered(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.CallsOffered"));
				inbound.setCallsHandled(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.CallsHandled"));
				inbound.setHandleRate(context.floatValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.HandleRate"));
				inbound.setTotalRingTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.TotalRingTime"));
				inbound.setMaxRingTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.MaxRingTime"));
				inbound.setAverageRingTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.AverageRingTime"));
				inbound.setServiceLevel20(context.floatValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.ServiceLevel20"));
				inbound.setTotalTalkTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.TotalTalkTime"));
				inbound.setMaxTalkTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.MaxTalkTime"));
				inbound.setAverageTalkTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.AverageTalkTime"));
				inbound.setTotalWorkTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.TotalWorkTime"));
				inbound.setMaxWorkTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.MaxWorkTime"));
				inbound.setAverageWorkTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.AverageWorkTime"));
				inbound.setSatisfactionIndex(context.floatValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.SatisfactionIndex"));
				inbound.setSatisfactionSurveysOffered(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.SatisfactionSurveysOffered"));
				inbound.setSatisfactionSurveysResponded(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.SatisfactionSurveysResponded"));
				agentSummaryReport.setInbound(inbound);

				Outbound outbound = new Outbound();
				outbound.setCallsDialed(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.CallsDialed"));
				outbound.setCallsAnswered(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.CallsAnswered"));
				outbound.setAnswerRate(context.floatValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.AnswerRate"));
				outbound.setTotalDialingTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.TotalDialingTime"));
				outbound.setMaxDialingTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.MaxDialingTime"));
				outbound.setAverageDialingTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.AverageDialingTime"));
				outbound.setTotalTalkTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.TotalTalkTime"));
				outbound.setMaxTalkTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.MaxTalkTime"));
				outbound.setAverageTalkTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.AverageTalkTime"));
				outbound.setTotalWorkTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.TotalWorkTime"));
				outbound.setMaxWorkTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.MaxWorkTime"));
				outbound.setAverageWorkTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.AverageWorkTime"));
				outbound.setSatisfactionIndex(context.floatValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.SatisfactionIndex"));
				outbound.setSatisfactionSurveysOffered(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.SatisfactionSurveysOffered"));
				outbound.setSatisfactionSurveysResponded(context.longValue("ListAgentSummaryReportsByIntervalResponse.PagedAgentSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.SatisfactionSurveysResponded"));
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