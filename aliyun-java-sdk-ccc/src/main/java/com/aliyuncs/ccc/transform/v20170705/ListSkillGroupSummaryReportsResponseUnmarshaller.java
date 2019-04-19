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

import com.aliyuncs.ccc.model.v20170705.ListSkillGroupSummaryReportsResponse;
import com.aliyuncs.ccc.model.v20170705.ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport;
import com.aliyuncs.ccc.model.v20170705.ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.SkillGroupSummaryReport;
import com.aliyuncs.ccc.model.v20170705.ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.SkillGroupSummaryReport.Inbound;
import com.aliyuncs.ccc.model.v20170705.ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.SkillGroupSummaryReport.Outbound;
import com.aliyuncs.ccc.model.v20170705.ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.SkillGroupSummaryReport.Overall;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSkillGroupSummaryReportsResponseUnmarshaller {

	public static ListSkillGroupSummaryReportsResponse unmarshall(ListSkillGroupSummaryReportsResponse listSkillGroupSummaryReportsResponse, UnmarshallerContext context) {
		
		listSkillGroupSummaryReportsResponse.setRequestId(context.stringValue("ListSkillGroupSummaryReportsResponse.RequestId"));
		listSkillGroupSummaryReportsResponse.setSuccess(context.booleanValue("ListSkillGroupSummaryReportsResponse.Success"));
		listSkillGroupSummaryReportsResponse.setCode(context.stringValue("ListSkillGroupSummaryReportsResponse.Code"));
		listSkillGroupSummaryReportsResponse.setMessage(context.stringValue("ListSkillGroupSummaryReportsResponse.Message"));
		listSkillGroupSummaryReportsResponse.setHttpStatusCode(context.integerValue("ListSkillGroupSummaryReportsResponse.HttpStatusCode"));

		PagedSkillGroupSummaryReport pagedSkillGroupSummaryReport = new PagedSkillGroupSummaryReport();
		pagedSkillGroupSummaryReport.setTotalCount(context.integerValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.TotalCount"));
		pagedSkillGroupSummaryReport.setPageNumber(context.integerValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.PageNumber"));
		pagedSkillGroupSummaryReport.setPageSize(context.integerValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.PageSize"));

		List<SkillGroupSummaryReport> list = new ArrayList<SkillGroupSummaryReport>();
		for (int i = 0; i < context.lengthValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List.Length"); i++) {
			SkillGroupSummaryReport skillGroupSummaryReport = new SkillGroupSummaryReport();
			skillGroupSummaryReport.setInstanceId(context.stringValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].InstanceId"));
			skillGroupSummaryReport.setSkillGroupId(context.stringValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].SkillGroupId"));
			skillGroupSummaryReport.setSkillGroupName(context.stringValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].SkillGroupName"));

			Overall overall = new Overall();
			overall.setTotalCalls(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.TotalCalls"));
			overall.setTotalLoggedInTime(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.TotalLoggedInTime"));
			overall.setTotalBreakTime(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.TotalBreakTime"));
			overall.setOccupancyRate(context.floatValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.OccupancyRate"));
			overall.setTotalReadyTime(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.TotalReadyTime"));
			overall.setMaxReadyTime(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.MaxReadyTime"));
			overall.setAverageReadyTime(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.AverageReadyTime"));
			overall.setTotalTalkTime(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.TotalTalkTime"));
			overall.setMaxTalkTime(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.MaxTalkTime"));
			overall.setAverageTalkTime(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.AverageTalkTime"));
			overall.setTotalWorkTime(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.TotalWorkTime"));
			overall.setMaxWorkTime(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.MaxWorkTime"));
			overall.setAverageWorkTime(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.AverageWorkTime"));
			overall.setSatisfactionIndex(context.floatValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.SatisfactionIndex"));
			overall.setSatisfactionSurveysOffered(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.SatisfactionSurveysOffered"));
			overall.setSatisfactionSurveysResponded(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.SatisfactionSurveysResponded"));
			skillGroupSummaryReport.setOverall(overall);

			Inbound inbound = new Inbound();
			inbound.setCallsOffered(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.CallsOffered"));
			inbound.setCallsHandled(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.CallsHandled"));
			inbound.setHandleRate(context.floatValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.HandleRate"));
			inbound.setTotalRingTime(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.TotalRingTime"));
			inbound.setMaxRingTime(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.MaxRingTime"));
			inbound.setAverageRingTime(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.AverageRingTime"));
			inbound.setServiceLevel20(context.floatValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.ServiceLevel20"));
			inbound.setTotalTalkTime(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.TotalTalkTime"));
			inbound.setMaxTalkTime(context.stringValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.MaxTalkTime"));
			inbound.setAverageTalkTime(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.AverageTalkTime"));
			inbound.setTotalWorkTime(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.TotalWorkTime"));
			inbound.setMaxWorkTime(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.MaxWorkTime"));
			inbound.setAverageWorkTime(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.AverageWorkTime"));
			inbound.setSatisfactionIndex(context.floatValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.SatisfactionIndex"));
			inbound.setSatisfactionSurveysOffered(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.SatisfactionSurveysOffered"));
			inbound.setSatisfactionSurveysResponded(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.SatisfactionSurveysResponded"));
			inbound.setInComingQueueOfQueueCount(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.InComingQueueOfQueueCount"));
			inbound.setAnsweredByAgentOfQueueCount(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.AnsweredByAgentOfQueueCount"));
			inbound.setGiveUpByAgentOfQueueCount(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.GiveUpByAgentOfQueueCount"));
			inbound.setAbandonedInQueueOfQueueCount(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.AbandonedInQueueOfQueueCount"));
			inbound.setOverFlowInQueueOfQueueCount(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.OverFlowInQueueOfQueueCount"));
			inbound.setQueueWaitTimeDuration(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.QueueWaitTimeDuration"));
			inbound.setAnsweredByAgentOfQueueWaitTimeDuration(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.AnsweredByAgentOfQueueWaitTimeDuration"));
			inbound.setQueueMaxWaitTimeDuration(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.QueueMaxWaitTimeDuration"));
			inbound.setAnsweredByAgentOfQueueMaxWaitTimeDuration(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.AnsweredByAgentOfQueueMaxWaitTimeDuration"));
			skillGroupSummaryReport.setInbound(inbound);

			Outbound outbound = new Outbound();
			outbound.setCallsDialed(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.CallsDialed"));
			outbound.setCallsAnswered(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.CallsAnswered"));
			outbound.setAnswerRate(context.floatValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.AnswerRate"));
			outbound.setTotalDialingTime(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.TotalDialingTime"));
			outbound.setMaxDialingTime(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.MaxDialingTime"));
			outbound.setAverageDialingTime(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.AverageDialingTime"));
			outbound.setTotalTalkTime(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.TotalTalkTime"));
			outbound.setMaxTalkTime(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.MaxTalkTime"));
			outbound.setAverageTalkTime(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.AverageTalkTime"));
			outbound.setTotalWorkTime(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.TotalWorkTime"));
			outbound.setMaxWorkTime(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.MaxWorkTime"));
			outbound.setAverageWorkTime(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.AverageWorkTime"));
			outbound.setSatisfactionIndex(context.floatValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.SatisfactionIndex"));
			outbound.setSatisfactionSurveysOffered(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.SatisfactionSurveysOffered"));
			outbound.setSatisfactionSurveysResponded(context.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.SatisfactionSurveysResponded"));
			skillGroupSummaryReport.setOutbound(outbound);

			list.add(skillGroupSummaryReport);
		}
		pagedSkillGroupSummaryReport.setList(list);
		listSkillGroupSummaryReportsResponse.setPagedSkillGroupSummaryReport(pagedSkillGroupSummaryReport);
	 
	 	return listSkillGroupSummaryReportsResponse;
	}
}