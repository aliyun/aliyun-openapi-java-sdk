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
		listSkillGroupSummaryReportsResponse.setHttpStatusCode(_ctx.integerValue("ListSkillGroupSummaryReportsResponse.HttpStatusCode"));
		listSkillGroupSummaryReportsResponse.setCode(_ctx.stringValue("ListSkillGroupSummaryReportsResponse.Code"));
		listSkillGroupSummaryReportsResponse.setMessage(_ctx.stringValue("ListSkillGroupSummaryReportsResponse.Message"));
		listSkillGroupSummaryReportsResponse.setSuccess(_ctx.booleanValue("ListSkillGroupSummaryReportsResponse.Success"));

		PagedSkillGroupSummaryReport pagedSkillGroupSummaryReport = new PagedSkillGroupSummaryReport();
		pagedSkillGroupSummaryReport.setPageNumber(_ctx.integerValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.PageNumber"));
		pagedSkillGroupSummaryReport.setPageSize(_ctx.integerValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.PageSize"));
		pagedSkillGroupSummaryReport.setTotalCount(_ctx.integerValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.TotalCount"));

		List<SkillGroupSummaryReport> list = new ArrayList<SkillGroupSummaryReport>();
		for (int i = 0; i < _ctx.lengthValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List.Length"); i++) {
			SkillGroupSummaryReport skillGroupSummaryReport = new SkillGroupSummaryReport();
			skillGroupSummaryReport.setInstanceId(_ctx.stringValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].InstanceId"));
			skillGroupSummaryReport.setSkillGroupId(_ctx.stringValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].SkillGroupId"));
			skillGroupSummaryReport.setSkillGroupName(_ctx.stringValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].SkillGroupName"));

			Overall overall = new Overall();
			overall.setTotalLoggedInTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.TotalLoggedInTime"));
			overall.setTotalTalkTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.TotalTalkTime"));
			overall.setOccupancyRate(_ctx.floatValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.OccupancyRate"));
			overall.setTotalWorkTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.TotalWorkTime"));
			overall.setMaxWorkTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.MaxWorkTime"));
			overall.setAverageWorkTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.AverageWorkTime"));
			overall.setAverageTalkTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.AverageTalkTime"));
			overall.setSatisfactionIndex(_ctx.floatValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.SatisfactionIndex"));
			overall.setSatisfactionSurveysOffered(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.SatisfactionSurveysOffered"));
			overall.setSatisfactionSurveysResponded(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.SatisfactionSurveysResponded"));
			overall.setMaxReadyTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.MaxReadyTime"));
			overall.setAverageReadyTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.AverageReadyTime"));
			overall.setTotalBreakTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.TotalBreakTime"));
			overall.setTotalReadyTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.TotalReadyTime"));
			overall.setMaxTalkTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.MaxTalkTime"));
			overall.setTotalCalls(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Overall.TotalCalls"));
			skillGroupSummaryReport.setOverall(overall);

			Inbound inbound = new Inbound();
			inbound.setAverageRingTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.AverageRingTime"));
			inbound.setCallsHandled(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.CallsHandled"));
			inbound.setTotalWorkTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.TotalWorkTime"));
			inbound.setMaxWorkTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.MaxWorkTime"));
			inbound.setQueueMaxWaitTimeDuration(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.QueueMaxWaitTimeDuration"));
			inbound.setAverageWorkTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.AverageWorkTime"));
			inbound.setSatisfactionIndex(_ctx.floatValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.SatisfactionIndex"));
			inbound.setAnsweredByAgentOfQueueWaitTimeDuration(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.AnsweredByAgentOfQueueWaitTimeDuration"));
			inbound.setTotalRingTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.TotalRingTime"));
			inbound.setInComingQueueOfQueueCount(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.InComingQueueOfQueueCount"));
			inbound.setMaxTalkTime(_ctx.stringValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.MaxTalkTime"));
			inbound.setMaxRingTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.MaxRingTime"));
			inbound.setTotalTalkTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.TotalTalkTime"));
			inbound.setCallsOffered(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.CallsOffered"));
			inbound.setAbandonedInQueueOfQueueCount(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.AbandonedInQueueOfQueueCount"));
			inbound.setOverFlowInQueueOfQueueCount(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.OverFlowInQueueOfQueueCount"));
			inbound.setAnsweredByAgentOfQueueMaxWaitTimeDuration(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.AnsweredByAgentOfQueueMaxWaitTimeDuration"));
			inbound.setServiceLevel20(_ctx.floatValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.ServiceLevel20"));
			inbound.setAverageTalkTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.AverageTalkTime"));
			inbound.setAnsweredByAgentOfQueueCount(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.AnsweredByAgentOfQueueCount"));
			inbound.setSatisfactionSurveysOffered(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.SatisfactionSurveysOffered"));
			inbound.setHandleRate(_ctx.floatValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.HandleRate"));
			inbound.setSatisfactionSurveysResponded(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.SatisfactionSurveysResponded"));
			inbound.setGiveUpByAgentOfQueueCount(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.GiveUpByAgentOfQueueCount"));
			inbound.setQueueWaitTimeDuration(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Inbound.QueueWaitTimeDuration"));
			skillGroupSummaryReport.setInbound(inbound);

			Outbound outbound = new Outbound();
			outbound.setTotalTalkTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.TotalTalkTime"));
			outbound.setMaxDialingTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.MaxDialingTime"));
			outbound.setCallsDialed(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.CallsDialed"));
			outbound.setCallsAnswered(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.CallsAnswered"));
			outbound.setAnswerRate(_ctx.floatValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.AnswerRate"));
			outbound.setTotalWorkTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.TotalWorkTime"));
			outbound.setMaxWorkTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.MaxWorkTime"));
			outbound.setTotalDialingTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.TotalDialingTime"));
			outbound.setAverageTalkTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.AverageTalkTime"));
			outbound.setAverageWorkTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.AverageWorkTime"));
			outbound.setSatisfactionIndex(_ctx.floatValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.SatisfactionIndex"));
			outbound.setSatisfactionSurveysOffered(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.SatisfactionSurveysOffered"));
			outbound.setSatisfactionSurveysResponded(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.SatisfactionSurveysResponded"));
			outbound.setMaxTalkTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.MaxTalkTime"));
			outbound.setAverageDialingTime(_ctx.longValue("ListSkillGroupSummaryReportsResponse.PagedSkillGroupSummaryReport.List["+ i +"].Outbound.AverageDialingTime"));
			skillGroupSummaryReport.setOutbound(outbound);

			list.add(skillGroupSummaryReport);
		}
		pagedSkillGroupSummaryReport.setList(list);
		listSkillGroupSummaryReportsResponse.setPagedSkillGroupSummaryReport(pagedSkillGroupSummaryReport);
	 
	 	return listSkillGroupSummaryReportsResponse;
	}
}