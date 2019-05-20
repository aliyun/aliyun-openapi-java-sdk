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

import com.aliyuncs.cloudcallcenter.model.v20170705.ListAgentSummaryReportsByIntervalResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListAgentSummaryReportsByIntervalResponse.Data;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListAgentSummaryReportsByIntervalResponse.Data.AgentReport;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListAgentSummaryReportsByIntervalResponse.Data.AgentReport.AgentReportByInterval;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListAgentSummaryReportsByIntervalResponse.Data.AgentReport.AgentReportByInterval.Inbound;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListAgentSummaryReportsByIntervalResponse.Data.AgentReport.AgentReportByInterval.Outbound;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListAgentSummaryReportsByIntervalResponse.Data.AgentReport.AgentReportByInterval.Overall;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAgentSummaryReportsByIntervalResponseUnmarshaller {

	public static ListAgentSummaryReportsByIntervalResponse unmarshall(ListAgentSummaryReportsByIntervalResponse listAgentSummaryReportsByIntervalResponse, UnmarshallerContext context) {
		
		listAgentSummaryReportsByIntervalResponse.setRequestId(context.stringValue("ListAgentSummaryReportsByIntervalResponse.RequestId"));
		listAgentSummaryReportsByIntervalResponse.setSuccess(context.booleanValue("ListAgentSummaryReportsByIntervalResponse.Success"));
		listAgentSummaryReportsByIntervalResponse.setCode(context.stringValue("ListAgentSummaryReportsByIntervalResponse.Code"));
		listAgentSummaryReportsByIntervalResponse.setMessage(context.stringValue("ListAgentSummaryReportsByIntervalResponse.Message"));
		listAgentSummaryReportsByIntervalResponse.setHttpStatusCode(context.integerValue("ListAgentSummaryReportsByIntervalResponse.HttpStatusCode"));

		Data data = new Data();
		data.setTotalCount(context.integerValue("ListAgentSummaryReportsByIntervalResponse.Data.TotalCount"));
		data.setPageNumber(context.integerValue("ListAgentSummaryReportsByIntervalResponse.Data.PageNumber"));
		data.setPageSize(context.integerValue("ListAgentSummaryReportsByIntervalResponse.Data.PageSize"));

		List<AgentReport> list = new ArrayList<AgentReport>();
		for (int i = 0; i < context.lengthValue("ListAgentSummaryReportsByIntervalResponse.Data.List.Length"); i++) {
			AgentReport agentReport = new AgentReport();
			agentReport.setObjectId(context.stringValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].ObjectId"));

			List<AgentReportByInterval> intervalList = new ArrayList<AgentReportByInterval>();
			for (int j = 0; j < context.lengthValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList.Length"); j++) {
				AgentReportByInterval agentReportByInterval = new AgentReportByInterval();
				agentReportByInterval.setRecordDate(context.stringValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].RecordDate"));
				agentReportByInterval.setInstanceId(context.stringValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].InstanceId"));
				agentReportByInterval.setAgentId(context.stringValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].AgentId"));
				agentReportByInterval.setLoginName(context.stringValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].LoginName"));
				agentReportByInterval.setAgentName(context.stringValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].AgentName"));
				agentReportByInterval.setSkillGroupIds(context.stringValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].SkillGroupIds"));
				agentReportByInterval.setSkillGroupNames(context.stringValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].SkillGroupNames"));
				agentReportByInterval.setState(context.stringValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].State"));

				Overall overall = new Overall();
				overall.setTotalCalls(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Overall.TotalCalls"));
				overall.setTotalTalkTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Overall.TotalTalkTime"));
				overall.setMaxTalkTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Overall.MaxTalkTime"));
				overall.setAverageTalkTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Overall.AverageTalkTime"));
				overall.setTotalWorkTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Overall.TotalWorkTime"));
				overall.setMaxWorkTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Overall.MaxWorkTime"));
				overall.setAverageWorkTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Overall.AverageWorkTime"));
				overall.setSatisfactionIndex(context.floatValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Overall.SatisfactionIndex"));
				overall.setSatisfactionSurveysOffered(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Overall.SatisfactionSurveysOffered"));
				overall.setSatisfactionSurveysResponded(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Overall.SatisfactionSurveysResponded"));
				overall.setFirstLoggedInTimestamp(context.stringValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Overall.FirstLoggedInTimestamp"));
				overall.setLastLoggedOutTimestamp(context.stringValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Overall.LastLoggedOutTimestamp"));
				overall.setTotalLoggedInTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Overall.TotalLoggedInTime"));
				overall.setTotalBreakTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Overall.TotalBreakTime"));
				overall.setOccupancyRate(context.floatValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Overall.OccupancyRate"));
				overall.setTotalReadyTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Overall.TotalReadyTime"));
				overall.setMaxReadyTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Overall.MaxReadyTime"));
				overall.setAverageReadyTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Overall.AverageReadyTime"));
				agentReportByInterval.setOverall(overall);

				Inbound inbound = new Inbound();
				inbound.setCallsOffered(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Inbound.CallsOffered"));
				inbound.setCallsHandled(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Inbound.CallsHandled"));
				inbound.setHandleRate(context.floatValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Inbound.HandleRate"));
				inbound.setTotalRingTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Inbound.TotalRingTime"));
				inbound.setMaxRingTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Inbound.MaxRingTime"));
				inbound.setAverageRingTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Inbound.AverageRingTime"));
				inbound.setServiceLevel20(context.floatValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Inbound.ServiceLevel20"));
				inbound.setTotalTalkTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Inbound.TotalTalkTime"));
				inbound.setMaxTalkTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Inbound.MaxTalkTime"));
				inbound.setAverageTalkTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Inbound.AverageTalkTime"));
				inbound.setTotalWorkTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Inbound.TotalWorkTime"));
				inbound.setMaxWorkTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Inbound.MaxWorkTime"));
				inbound.setAverageWorkTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Inbound.AverageWorkTime"));
				inbound.setSatisfactionIndex(context.floatValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Inbound.SatisfactionIndex"));
				inbound.setSatisfactionSurveysOffered(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Inbound.SatisfactionSurveysOffered"));
				inbound.setSatisfactionSurveysResponded(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Inbound.SatisfactionSurveysResponded"));
				agentReportByInterval.setInbound(inbound);

				Outbound outbound = new Outbound();
				outbound.setCallsDialed(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Outbound.CallsDialed"));
				outbound.setCallsAnswered(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Outbound.CallsAnswered"));
				outbound.setAnswerRate(context.floatValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Outbound.AnswerRate"));
				outbound.setTotalDialingTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Outbound.TotalDialingTime"));
				outbound.setMaxDialingTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Outbound.MaxDialingTime"));
				outbound.setAverageDialingTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Outbound.AverageDialingTime"));
				outbound.setTotalTalkTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Outbound.TotalTalkTime"));
				outbound.setMaxTalkTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Outbound.MaxTalkTime"));
				outbound.setAverageTalkTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Outbound.AverageTalkTime"));
				outbound.setTotalWorkTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Outbound.TotalWorkTime"));
				outbound.setMaxWorkTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Outbound.MaxWorkTime"));
				outbound.setAverageWorkTime(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Outbound.AverageWorkTime"));
				outbound.setSatisfactionIndex(context.floatValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Outbound.SatisfactionIndex"));
				outbound.setSatisfactionSurveysOffered(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Outbound.SatisfactionSurveysOffered"));
				outbound.setSatisfactionSurveysResponded(context.longValue("ListAgentSummaryReportsByIntervalResponse.Data.List["+ i +"].IntervalList["+ j +"].Outbound.SatisfactionSurveysResponded"));
				agentReportByInterval.setOutbound(outbound);

				intervalList.add(agentReportByInterval);
			}
			agentReport.setIntervalList(intervalList);

			list.add(agentReport);
		}
		data.setList(list);
		listAgentSummaryReportsByIntervalResponse.setData(data);
	 
	 	return listAgentSummaryReportsByIntervalResponse;
	}
}