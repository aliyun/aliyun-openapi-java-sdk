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

import com.aliyuncs.ccc.model.v20170705.ListSkillGroupSummaryReportsByIntervalResponse;
import com.aliyuncs.ccc.model.v20170705.ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport;
import com.aliyuncs.ccc.model.v20170705.ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.SkillGroupTimeIntervalReport;
import com.aliyuncs.ccc.model.v20170705.ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.SkillGroupTimeIntervalReport.SkillGroupSummaryReport;
import com.aliyuncs.ccc.model.v20170705.ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.SkillGroupTimeIntervalReport.SkillGroupSummaryReport.Inbound;
import com.aliyuncs.ccc.model.v20170705.ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.SkillGroupTimeIntervalReport.SkillGroupSummaryReport.Outbound;
import com.aliyuncs.ccc.model.v20170705.ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.SkillGroupTimeIntervalReport.SkillGroupSummaryReport.Overall;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSkillGroupSummaryReportsByIntervalResponseUnmarshaller {

	public static ListSkillGroupSummaryReportsByIntervalResponse unmarshall(ListSkillGroupSummaryReportsByIntervalResponse listSkillGroupSummaryReportsByIntervalResponse, UnmarshallerContext context) {
		
		listSkillGroupSummaryReportsByIntervalResponse.setRequestId(context.stringValue("ListSkillGroupSummaryReportsByIntervalResponse.RequestId"));
		listSkillGroupSummaryReportsByIntervalResponse.setSuccess(context.booleanValue("ListSkillGroupSummaryReportsByIntervalResponse.Success"));
		listSkillGroupSummaryReportsByIntervalResponse.setCode(context.stringValue("ListSkillGroupSummaryReportsByIntervalResponse.Code"));
		listSkillGroupSummaryReportsByIntervalResponse.setMessage(context.stringValue("ListSkillGroupSummaryReportsByIntervalResponse.Message"));
		listSkillGroupSummaryReportsByIntervalResponse.setHttpStatusCode(context.integerValue("ListSkillGroupSummaryReportsByIntervalResponse.HttpStatusCode"));

		PagedSkillGroupSummaryReport pagedSkillGroupSummaryReport = new PagedSkillGroupSummaryReport();
		pagedSkillGroupSummaryReport.setTotalCount(context.integerValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.TotalCount"));
		pagedSkillGroupSummaryReport.setPageNumber(context.integerValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.PageNumber"));
		pagedSkillGroupSummaryReport.setPageSize(context.integerValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.PageSize"));

		List<SkillGroupTimeIntervalReport> list = new ArrayList<SkillGroupTimeIntervalReport>();
		for (int i = 0; i < context.lengthValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List.Length"); i++) {
			SkillGroupTimeIntervalReport skillGroupTimeIntervalReport = new SkillGroupTimeIntervalReport();
			skillGroupTimeIntervalReport.setSkillGroupId(context.stringValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].SkillGroupId"));

			List<SkillGroupSummaryReport> intervalList = new ArrayList<SkillGroupSummaryReport>();
			for (int j = 0; j < context.lengthValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList.Length"); j++) {
				SkillGroupSummaryReport skillGroupSummaryReport = new SkillGroupSummaryReport();
				skillGroupSummaryReport.setTimestamp(context.stringValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Timestamp"));
				skillGroupSummaryReport.setInstanceId(context.stringValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].InstanceId"));
				skillGroupSummaryReport.setSkillGroupId(context.stringValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].SkillGroupId"));
				skillGroupSummaryReport.setSkillGroupName(context.stringValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].SkillGroupName"));

				Overall overall = new Overall();
				overall.setTotalCalls(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.TotalCalls"));
				overall.setTotalLoggedInTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.TotalLoggedInTime"));
				overall.setTotalBreakTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.TotalBreakTime"));
				overall.setOccupancyRate(context.floatValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.OccupancyRate"));
				overall.setTotalReadyTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.TotalReadyTime"));
				overall.setMaxReadyTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.MaxReadyTime"));
				overall.setAverageReadyTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.AverageReadyTime"));
				overall.setTotalTalkTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.TotalTalkTime"));
				overall.setMaxTalkTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.MaxTalkTime"));
				overall.setAverageTalkTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.AverageTalkTime"));
				overall.setTotalWorkTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.TotalWorkTime"));
				overall.setMaxWorkTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.MaxWorkTime"));
				overall.setAverageWorkTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.AverageWorkTime"));
				overall.setSatisfactionIndex(context.floatValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.SatisfactionIndex"));
				overall.setSatisfactionSurveysOffered(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.SatisfactionSurveysOffered"));
				overall.setSatisfactionSurveysResponded(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Overall.SatisfactionSurveysResponded"));
				skillGroupSummaryReport.setOverall(overall);

				Inbound inbound = new Inbound();
				inbound.setCallsOffered(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.CallsOffered"));
				inbound.setCallsHandled(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.CallsHandled"));
				inbound.setHandleRate(context.floatValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.HandleRate"));
				inbound.setTotalRingTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.TotalRingTime"));
				inbound.setMaxRingTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.MaxRingTime"));
				inbound.setAverageRingTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.AverageRingTime"));
				inbound.setServiceLevel20(context.floatValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.ServiceLevel20"));
				inbound.setTotalTalkTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.TotalTalkTime"));
				inbound.setMaxTalkTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.MaxTalkTime"));
				inbound.setAverageTalkTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.AverageTalkTime"));
				inbound.setTotalWorkTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.TotalWorkTime"));
				inbound.setMaxWorkTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.MaxWorkTime"));
				inbound.setAverageWorkTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.AverageWorkTime"));
				inbound.setSatisfactionIndex(context.floatValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.SatisfactionIndex"));
				inbound.setSatisfactionSurveysOffered(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.SatisfactionSurveysOffered"));
				inbound.setSatisfactionSurveysResponded(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.SatisfactionSurveysResponded"));
				inbound.setInComingQueueOfQueueCount(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.InComingQueueOfQueueCount"));
				inbound.setAnsweredByAgentOfQueueCount(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.AnsweredByAgentOfQueueCount"));
				inbound.setGiveUpByAgentOfQueueCount(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.GiveUpByAgentOfQueueCount"));
				inbound.setAbandonedInQueueOfQueueCount(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.AbandonedInQueueOfQueueCount"));
				inbound.setOverFlowInQueueOfQueueCount(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.OverFlowInQueueOfQueueCount"));
				inbound.setQueueWaitTimeDuration(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.QueueWaitTimeDuration"));
				inbound.setAnsweredByAgentOfQueueWaitTimeDuration(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.AnsweredByAgentOfQueueWaitTimeDuration"));
				inbound.setQueueMaxWaitTimeDuration(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.QueueMaxWaitTimeDuration"));
				inbound.setAnsweredByAgentOfQueueMaxWaitTimeDuration(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Inbound.AnsweredByAgentOfQueueMaxWaitTimeDuration"));
				skillGroupSummaryReport.setInbound(inbound);

				Outbound outbound = new Outbound();
				outbound.setCallsDialed(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.CallsDialed"));
				outbound.setCallsAnswered(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.CallsAnswered"));
				outbound.setAnswerRate(context.floatValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.AnswerRate"));
				outbound.setTotalDialingTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.TotalDialingTime"));
				outbound.setMaxDialingTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.MaxDialingTime"));
				outbound.setAverageDialingTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.AverageDialingTime"));
				outbound.setTotalTalkTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.TotalTalkTime"));
				outbound.setMaxTalkTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.MaxTalkTime"));
				outbound.setAverageTalkTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.AverageTalkTime"));
				outbound.setTotalWorkTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.TotalWorkTime"));
				outbound.setMaxWorkTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.MaxWorkTime"));
				outbound.setAverageWorkTime(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.AverageWorkTime"));
				outbound.setSatisfactionIndex(context.floatValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.SatisfactionIndex"));
				outbound.setSatisfactionSurveysOffered(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.SatisfactionSurveysOffered"));
				outbound.setSatisfactionSurveysResponded(context.longValue("ListSkillGroupSummaryReportsByIntervalResponse.PagedSkillGroupSummaryReport.List["+ i +"].IntervalList["+ j +"].Outbound.SatisfactionSurveysResponded"));
				skillGroupSummaryReport.setOutbound(outbound);

				intervalList.add(skillGroupSummaryReport);
			}
			skillGroupTimeIntervalReport.setIntervalList(intervalList);

			list.add(skillGroupTimeIntervalReport);
		}
		pagedSkillGroupSummaryReport.setList(list);
		listSkillGroupSummaryReportsByIntervalResponse.setPagedSkillGroupSummaryReport(pagedSkillGroupSummaryReport);
	 
	 	return listSkillGroupSummaryReportsByIntervalResponse;
	}
}