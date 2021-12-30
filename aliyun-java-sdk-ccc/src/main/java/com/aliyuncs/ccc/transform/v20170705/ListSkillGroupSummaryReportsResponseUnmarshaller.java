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

	public static ListSkillGroupSummaryReportsResponse unmarshall(ListSkillGroupSummaryReportsResponse listSkillGroupSummaryReportsResponse, UnmarshallerContext _ctx) {
		
		listSkillGroupSummaryReportsResponse.setRequestId(_ctx.stringValue("ListSkillGroupSummaryReportsResponse.RequestId"));
		listSkillGroupSummaryReportsResponse.setSuccess(_ctx.booleanValue("ListSkillGroupSummaryReportsResponse.Success"));
		listSkillGroupSummaryReportsResponse.setCode(_ctx.stringValue("ListSkillGroupSummaryReportsResponse.Code"));
		listSkillGroupSummaryReportsResponse.setMessage(_ctx.stringValue("ListSkillGroupSummaryReportsResponse.Message"));
		listSkillGroupSummaryReportsResponse.setHttpStatusCode(_ctx.integerValue("ListSkillGroupSummaryReportsResponse.HttpStatusCode"));

		PagedSkillGroupSummaryReport pagedSkillGroupSummaryReport = new PagedSkillGroupSummaryReport();
		pagedSkillGroupSummaryReport.setTotalCount(_ctx.integerValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.TotalCount"));
		pagedSkillGroupSummaryReport.setPageNumber(_ctx.integerValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.PageNumber"));
		pagedSkillGroupSummaryReport.setPageSize(_ctx.integerValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.PageSize"));

		List<SkillGroupSummaryReport> list = new ArrayList<SkillGroupSummaryReport>();
		for (int i = 0; i < _ctx.lengthValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List.Length"); i++) {
			SkillGroupSummaryReport skillGroupSummaryReport = new SkillGroupSummaryReport();
			skillGroupSummaryReport.setInstanceId(_ctx.stringValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].InstanceId"));
			skillGroupSummaryReport.setSkillGroupId(_ctx.stringValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].SkillGroupId"));
			skillGroupSummaryReport.setSkillGroupName(_ctx.stringValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].SkillGroupName"));

			Overall overall = new Overall();
			overall.setTotalCalls(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.TotalCalls"));
			overall.setTotalLoggedInTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.TotalLoggedInTime"));
			overall.setTotalBreakTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.TotalBreakTime"));
			overall.setOccupancyRate(_ctx.floatValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.OccupancyRate"));
			overall.setTotalReadyTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.TotalReadyTime"));
			overall.setMaxReadyTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.MaxReadyTime"));
			overall.setAverageReadyTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.AverageReadyTime"));
			overall.setTotalTalkTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.TotalTalkTime"));
			overall.setMaxTalkTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.MaxTalkTime"));
			overall.setAverageTalkTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.AverageTalkTime"));
			overall.setTotalWorkTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.TotalWorkTime"));
			overall.setMaxWorkTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.MaxWorkTime"));
			overall.setAverageWorkTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.AverageWorkTime"));
			overall.setSatisfactionIndex(_ctx.floatValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.SatisfactionIndex"));
			overall.setSatisfactionSurveysOffered(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.SatisfactionSurveysOffered"));
			overall.setSatisfactionSurveysResponded(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.SatisfactionSurveysResponded"));
			skillGroupSummaryReport.setOverall(overall);

			Inbound inbound = new Inbound();
			inbound.setCallsOffered(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.CallsOffered"));
			inbound.setCallsHandled(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.CallsHandled"));
			inbound.setHandleRate(_ctx.floatValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.HandleRate"));
			inbound.setTotalRingTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.TotalRingTime"));
			inbound.setMaxRingTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.MaxRingTime"));
			inbound.setAverageRingTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.AverageRingTime"));
			inbound.setServiceLevel20(_ctx.floatValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.ServiceLevel20"));
			inbound.setTotalTalkTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.TotalTalkTime"));
			inbound.setMaxTalkTime(_ctx.stringValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.MaxTalkTime"));
			inbound.setAverageTalkTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.AverageTalkTime"));
			inbound.setTotalWorkTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.TotalWorkTime"));
			inbound.setMaxWorkTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.MaxWorkTime"));
			inbound.setAverageWorkTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.AverageWorkTime"));
			inbound.setSatisfactionIndex(_ctx.floatValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.SatisfactionIndex"));
			inbound.setSatisfactionSurveysOffered(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.SatisfactionSurveysOffered"));
			inbound.setSatisfactionSurveysResponded(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.SatisfactionSurveysResponded"));
			inbound.setInComingQueueOfQueueCount(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.InComingQueueOfQueueCount"));
			inbound.setAnsweredByAgentOfQueueCount(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.AnsweredByAgentOfQueueCount"));
			inbound.setGiveUpByAgentOfQueueCount(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.GiveUpByAgentOfQueueCount"));
			inbound.setAbandonedInQueueOfQueueCount(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.AbandonedInQueueOfQueueCount"));
			inbound.setOverFlowInQueueOfQueueCount(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.OverFlowInQueueOfQueueCount"));
			inbound.setQueueWaitTimeDuration(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.QueueWaitTimeDuration"));
			inbound.setAnsweredByAgentOfQueueWaitTimeDuration(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.AnsweredByAgentOfQueueWaitTimeDuration"));
			inbound.setQueueMaxWaitTimeDuration(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.QueueMaxWaitTimeDuration"));
			inbound.setAnsweredByAgentOfQueueMaxWaitTimeDuration(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.AnsweredByAgentOfQueueMaxWaitTimeDuration"));
			skillGroupSummaryReport.setInbound(inbound);

			Outbound outbound = new Outbound();
			outbound.setCallsDialed(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.CallsDialed"));
			outbound.setCallsAnswered(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.CallsAnswered"));
			outbound.setAnswerRate(_ctx.floatValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.AnswerRate"));
			outbound.setTotalDialingTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.TotalDialingTime"));
			outbound.setMaxDialingTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.MaxDialingTime"));
			outbound.setAverageDialingTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.AverageDialingTime"));
			outbound.setTotalTalkTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.TotalTalkTime"));
			outbound.setMaxTalkTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.MaxTalkTime"));
			outbound.setAverageTalkTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.AverageTalkTime"));
			outbound.setTotalWorkTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.TotalWorkTime"));
			outbound.setMaxWorkTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.MaxWorkTime"));
			outbound.setAverageWorkTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.AverageWorkTime"));
			outbound.setSatisfactionIndex(_ctx.floatValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.SatisfactionIndex"));
			outbound.setSatisfactionSurveysOffered(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.SatisfactionSurveysOffered"));
			outbound.setSatisfactionSurveysResponded(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.SatisfactionSurveysResponded"));
			skillGroupSummaryReport.setOutbound(outbound);

			list.add(skillGroupSummaryReport);
		}
		pagedSkillGroupSummaryReport.setList(list);
		listSkillGroupSummaryReportsResponse.setPagedSkillGroupSummaryReport(pagedSkillGroupSummaryReport);
	 
	 	return listSkillGroupSummaryReportsResponse;
	}
}