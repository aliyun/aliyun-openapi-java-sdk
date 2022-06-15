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

import com.aliyuncs.ccc.model.v20200701.ListSkillGroupSummaryReportsSinceMidnightResponse;
import com.aliyuncs.ccc.model.v20200701.ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport;
import com.aliyuncs.ccc.model.v20200701.ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.SkillGroupSummaryReport;
import com.aliyuncs.ccc.model.v20200701.ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.SkillGroupSummaryReport.Inbound;
import com.aliyuncs.ccc.model.v20200701.ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.SkillGroupSummaryReport.Outbound;
import com.aliyuncs.ccc.model.v20200701.ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.SkillGroupSummaryReport.Overall;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSkillGroupSummaryReportsSinceMidnightResponseUnmarshaller {

	public static ListSkillGroupSummaryReportsSinceMidnightResponse unmarshall(ListSkillGroupSummaryReportsSinceMidnightResponse listSkillGroupSummaryReportsSinceMidnightResponse, UnmarshallerContext _ctx) {
		
		listSkillGroupSummaryReportsSinceMidnightResponse.setRequestId(_ctx.stringValue("ListSkillGroupSummaryReportsSinceMidnightResponse.RequestId"));
		listSkillGroupSummaryReportsSinceMidnightResponse.setHttpStatusCode(_ctx.integerValue("ListSkillGroupSummaryReportsSinceMidnightResponse.HttpStatusCode"));
		listSkillGroupSummaryReportsSinceMidnightResponse.setCode(_ctx.stringValue("ListSkillGroupSummaryReportsSinceMidnightResponse.Code"));
		listSkillGroupSummaryReportsSinceMidnightResponse.setMessage(_ctx.stringValue("ListSkillGroupSummaryReportsSinceMidnightResponse.Message"));
		listSkillGroupSummaryReportsSinceMidnightResponse.setSuccess(_ctx.booleanValue("ListSkillGroupSummaryReportsSinceMidnightResponse.Success"));

		PagedSkillGroupSummaryReport pagedSkillGroupSummaryReport = new PagedSkillGroupSummaryReport();
		pagedSkillGroupSummaryReport.setPageNumber(_ctx.integerValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.PageNumber"));
		pagedSkillGroupSummaryReport.setPageSize(_ctx.integerValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.PageSize"));
		pagedSkillGroupSummaryReport.setTotalCount(_ctx.integerValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.TotalCount"));

		List<SkillGroupSummaryReport> list = new ArrayList<SkillGroupSummaryReport>();
		for (int i = 0; i < _ctx.lengthValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List.Length"); i++) {
			SkillGroupSummaryReport skillGroupSummaryReport = new SkillGroupSummaryReport();
			skillGroupSummaryReport.setTimestamp(_ctx.stringValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Timestamp"));
			skillGroupSummaryReport.setInstanceId(_ctx.stringValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].InstanceId"));
			skillGroupSummaryReport.setSkillGroupName(_ctx.stringValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].SkillGroupName"));
			skillGroupSummaryReport.setSkillGroupId(_ctx.stringValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].SkillGroupId"));

			Overall overall = new Overall();
			overall.setTotalLoggedInTime(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.TotalLoggedInTime"));
			overall.setTotalTalkTime(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.TotalTalkTime"));
			overall.setOccupancyRate(_ctx.floatValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.OccupancyRate"));
			overall.setTotalWorkTime(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.TotalWorkTime"));
			overall.setMaxWorkTime(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.MaxWorkTime"));
			overall.setAverageWorkTime(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.AverageWorkTime"));
			overall.setAverageTalkTime(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.AverageTalkTime"));
			overall.setSatisfactionIndex(_ctx.floatValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.SatisfactionIndex"));
			overall.setSatisfactionSurveysOffered(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.SatisfactionSurveysOffered"));
			overall.setSatisfactionSurveysResponded(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.SatisfactionSurveysResponded"));
			overall.setMaxReadyTime(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.MaxReadyTime"));
			overall.setAverageReadyTime(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.AverageReadyTime"));
			overall.setTotalBreakTime(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.TotalBreakTime"));
			overall.setTotalReadyTime(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.TotalReadyTime"));
			overall.setMaxTalkTime(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.MaxTalkTime"));
			overall.setTotalCalls(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.TotalCalls"));
			skillGroupSummaryReport.setOverall(overall);

			Inbound inbound = new Inbound();
			inbound.setAverageRingTime(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.AverageRingTime"));
			inbound.setCallsHandled(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.CallsHandled"));
			inbound.setTotalWorkTime(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.TotalWorkTime"));
			inbound.setMaxWorkTime(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.MaxWorkTime"));
			inbound.setQueueMaxWaitTimeDuration(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.QueueMaxWaitTimeDuration"));
			inbound.setAverageWorkTime(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.AverageWorkTime"));
			inbound.setSatisfactionIndex(_ctx.floatValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.SatisfactionIndex"));
			inbound.setAnsweredByAgentOfQueueWaitTimeDuration(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.AnsweredByAgentOfQueueWaitTimeDuration"));
			inbound.setTotalRingTime(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.TotalRingTime"));
			inbound.setInComingQueueOfQueueCount(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.InComingQueueOfQueueCount"));
			inbound.setMaxTalkTime(_ctx.stringValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.MaxTalkTime"));
			inbound.setMaxRingTime(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.MaxRingTime"));
			inbound.setTotalTalkTime(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.TotalTalkTime"));
			inbound.setCallsOffered(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.CallsOffered"));
			inbound.setAbandonedInQueueOfQueueCount(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.AbandonedInQueueOfQueueCount"));
			inbound.setOverFlowInQueueOfQueueCount(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.OverFlowInQueueOfQueueCount"));
			inbound.setAnsweredByAgentOfQueueMaxWaitTimeDuration(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.AnsweredByAgentOfQueueMaxWaitTimeDuration"));
			inbound.setServiceLevel20(_ctx.floatValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.ServiceLevel20"));
			inbound.setAverageTalkTime(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.AverageTalkTime"));
			inbound.setAnsweredByAgentOfQueueCount(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.AnsweredByAgentOfQueueCount"));
			inbound.setSatisfactionSurveysOffered(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.SatisfactionSurveysOffered"));
			inbound.setHandleRate(_ctx.floatValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.HandleRate"));
			inbound.setSatisfactionSurveysResponded(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.SatisfactionSurveysResponded"));
			inbound.setGiveUpByAgentOfQueueCount(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.GiveUpByAgentOfQueueCount"));
			inbound.setQueueWaitTimeDuration(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.QueueWaitTimeDuration"));
			inbound.setCallsServiceLevel20(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.CallsServiceLevel20"));
			inbound.setCallsServiceLevel30(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.CallsServiceLevel30"));
			inbound.setCallsServiceLevel10(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.CallsServiceLevel10"));
			inbound.setCallsAttendedTransferOut(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.CallsAttendedTransferOut"));
			inbound.setCallsBlindTransferOut(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.CallsBlindTransferOut"));
			skillGroupSummaryReport.setInbound(inbound);

			Outbound outbound = new Outbound();
			outbound.setTotalTalkTime(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.TotalTalkTime"));
			outbound.setMaxDialingTime(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.MaxDialingTime"));
			outbound.setCallsDialed(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.CallsDialed"));
			outbound.setCallsAnswered(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.CallsAnswered"));
			outbound.setAnswerRate(_ctx.floatValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.AnswerRate"));
			outbound.setTotalWorkTime(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.TotalWorkTime"));
			outbound.setMaxWorkTime(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.MaxWorkTime"));
			outbound.setTotalDialingTime(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.TotalDialingTime"));
			outbound.setAverageTalkTime(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.AverageTalkTime"));
			outbound.setAverageWorkTime(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.AverageWorkTime"));
			outbound.setSatisfactionIndex(_ctx.floatValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.SatisfactionIndex"));
			outbound.setSatisfactionSurveysOffered(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.SatisfactionSurveysOffered"));
			outbound.setSatisfactionSurveysResponded(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.SatisfactionSurveysResponded"));
			outbound.setMaxTalkTime(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.MaxTalkTime"));
			outbound.setAverageDialingTime(_ctx.longValue("ListSkillGroupSummaryReportsSinceMidnightResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.AverageDialingTime"));
			skillGroupSummaryReport.setOutbound(outbound);

			list.add(skillGroupSummaryReport);
		}
		pagedSkillGroupSummaryReport.setList(list);
		listSkillGroupSummaryReportsSinceMidnightResponse.setPagedSkillGroupSummaryReport(pagedSkillGroupSummaryReport);
	 
	 	return listSkillGroupSummaryReportsSinceMidnightResponse;
	}
}