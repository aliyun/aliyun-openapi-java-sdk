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

import com.aliyuncs.cloudcallcenter.model.v20170705.ListSkillGroupSummaryReportsResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListSkillGroupSummaryReportsResponse.Data;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListSkillGroupSummaryReportsResponse.Data.SkillGroupReport;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListSkillGroupSummaryReportsResponse.Data.SkillGroupReport.Inbound;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListSkillGroupSummaryReportsResponse.Data.SkillGroupReport.Outbound;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListSkillGroupSummaryReportsResponse.Data.SkillGroupReport.Overall;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListSkillGroupSummaryReportsResponse.Data.SkillGroupReport.RealTimeQueueIndicators;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListSkillGroupSummaryReportsResponse.Data.SkillGroupReport.RealTimeSkillGroupIndicators;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSkillGroupSummaryReportsResponseUnmarshaller {

	public static ListSkillGroupSummaryReportsResponse unmarshall(ListSkillGroupSummaryReportsResponse listSkillGroupSummaryReportsResponse, UnmarshallerContext context) {
		
		listSkillGroupSummaryReportsResponse.setRequestId(context.stringValue("ListSkillGroupSummaryReportsResponse.RequestId"));
		listSkillGroupSummaryReportsResponse.setSuccess(context.booleanValue("ListSkillGroupSummaryReportsResponse.Success"));
		listSkillGroupSummaryReportsResponse.setCode(context.stringValue("ListSkillGroupSummaryReportsResponse.Code"));
		listSkillGroupSummaryReportsResponse.setMessage(context.stringValue("ListSkillGroupSummaryReportsResponse.Message"));
		listSkillGroupSummaryReportsResponse.setHttpStatusCode(context.integerValue("ListSkillGroupSummaryReportsResponse.HttpStatusCode"));

		Data data = new Data();
		data.setTotalCount(context.integerValue("ListSkillGroupSummaryReportsResponse.Data.TotalCount"));
		data.setPageNumber(context.integerValue("ListSkillGroupSummaryReportsResponse.Data.PageNumber"));
		data.setPageSize(context.integerValue("ListSkillGroupSummaryReportsResponse.Data.PageSize"));

		List<SkillGroupReport> list = new ArrayList<SkillGroupReport>();
		for (int i = 0; i < context.lengthValue("ListSkillGroupSummaryReportsResponse.Data.List.Length"); i++) {
			SkillGroupReport skillGroupReport = new SkillGroupReport();
			skillGroupReport.setInstanceId(context.stringValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].InstanceId"));
			skillGroupReport.setSkillGroupId(context.stringValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].SkillGroupId"));
			skillGroupReport.setSkillGroupName(context.stringValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].SkillGroupName"));

			Overall overall = new Overall();
			overall.setTotalCalls(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Overall.TotalCalls"));
			overall.setTotalLoggedInTime(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Overall.TotalLoggedInTime"));
			overall.setTotalBreakTime(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Overall.TotalBreakTime"));
			overall.setOccupancyRate(context.floatValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Overall.OccupancyRate"));
			overall.setTotalReadyTime(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Overall.TotalReadyTime"));
			overall.setMaxReadyTime(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Overall.MaxReadyTime"));
			overall.setAverageReadyTime(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Overall.AverageReadyTime"));
			overall.setTotalTalkTime(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Overall.TotalTalkTime"));
			overall.setMaxTalkTime(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Overall.MaxTalkTime"));
			overall.setAverageTalkTime(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Overall.AverageTalkTime"));
			overall.setTotalWorkTime(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Overall.TotalWorkTime"));
			overall.setMaxWorkTime(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Overall.MaxWorkTime"));
			overall.setAverageWorkTime(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Overall.AverageWorkTime"));
			overall.setSatisfactionIndex(context.floatValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Overall.SatisfactionIndex"));
			overall.setSatisfactionSurveysOffered(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Overall.SatisfactionSurveysOffered"));
			overall.setSatisfactionSurveysResponded(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Overall.SatisfactionSurveysResponded"));
			skillGroupReport.setOverall(overall);

			Inbound inbound = new Inbound();
			inbound.setCallsOffered(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Inbound.CallsOffered"));
			inbound.setCallsHandled(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Inbound.CallsHandled"));
			inbound.setHandleRate(context.floatValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Inbound.HandleRate"));
			inbound.setTotalRingTime(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Inbound.TotalRingTime"));
			inbound.setMaxRingTime(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Inbound.MaxRingTime"));
			inbound.setAverageRingTime(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Inbound.AverageRingTime"));
			inbound.setServiceLevel20(context.floatValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Inbound.ServiceLevel20"));
			inbound.setTotalTalkTime(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Inbound.TotalTalkTime"));
			inbound.setMaxTalkTime(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Inbound.MaxTalkTime"));
			inbound.setAverageTalkTime(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Inbound.AverageTalkTime"));
			inbound.setTotalWorkTime(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Inbound.TotalWorkTime"));
			inbound.setMaxWorkTime(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Inbound.MaxWorkTime"));
			inbound.setAverageWorkTime(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Inbound.AverageWorkTime"));
			inbound.setSatisfactionIndex(context.floatValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Inbound.SatisfactionIndex"));
			inbound.setSatisfactionSurveysOffered(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Inbound.SatisfactionSurveysOffered"));
			inbound.setSatisfactionSurveysResponded(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Inbound.SatisfactionSurveysResponded"));
			skillGroupReport.setInbound(inbound);

			Outbound outbound = new Outbound();
			outbound.setCallsDialed(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Outbound.CallsDialed"));
			outbound.setCallsAnswered(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Outbound.CallsAnswered"));
			outbound.setAnswerRate(context.floatValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Outbound.AnswerRate"));
			outbound.setTotalDialingTime(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Outbound.TotalDialingTime"));
			outbound.setMaxDialingTime(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Outbound.MaxDialingTime"));
			outbound.setAverageDialingTime(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Outbound.AverageDialingTime"));
			outbound.setTotalTalkTime(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Outbound.TotalTalkTime"));
			outbound.setMaxTalkTime(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Outbound.MaxTalkTime"));
			outbound.setAverageTalkTime(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Outbound.AverageTalkTime"));
			outbound.setTotalWorkTime(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Outbound.TotalWorkTime"));
			outbound.setMaxWorkTime(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Outbound.MaxWorkTime"));
			outbound.setAverageWorkTime(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Outbound.AverageWorkTime"));
			outbound.setSatisfactionIndex(context.floatValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Outbound.SatisfactionIndex"));
			outbound.setSatisfactionSurveysOffered(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Outbound.SatisfactionSurveysOffered"));
			outbound.setSatisfactionSurveysResponded(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].Outbound.SatisfactionSurveysResponded"));
			skillGroupReport.setOutbound(outbound);

			RealTimeQueueIndicators realTimeQueueIndicators = new RealTimeQueueIndicators();
			realTimeQueueIndicators.setWaitingCalls(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].RealTimeQueueIndicators.WaitingCalls"));
			realTimeQueueIndicators.setLongestCall(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].RealTimeQueueIndicators.LongestCall"));
			skillGroupReport.setRealTimeQueueIndicators(realTimeQueueIndicators);

			RealTimeSkillGroupIndicators realTimeSkillGroupIndicators = new RealTimeSkillGroupIndicators();
			realTimeSkillGroupIndicators.setLoggedInAgents(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].RealTimeSkillGroupIndicators.LoggedInAgents"));
			realTimeSkillGroupIndicators.setReadyAgents(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].RealTimeSkillGroupIndicators.ReadyAgents"));
			realTimeSkillGroupIndicators.setBreakingAgents(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].RealTimeSkillGroupIndicators.BreakingAgents"));
			realTimeSkillGroupIndicators.setTalkingAgents(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].RealTimeSkillGroupIndicators.TalkingAgents"));
			realTimeSkillGroupIndicators.setWorkingAgents(context.longValue("ListSkillGroupSummaryReportsResponse.Data.List["+ i +"].RealTimeSkillGroupIndicators.WorkingAgents"));
			skillGroupReport.setRealTimeSkillGroupIndicators(realTimeSkillGroupIndicators);

			list.add(skillGroupReport);
		}
		data.setList(list);
		listSkillGroupSummaryReportsResponse.setData(data);
	 
	 	return listSkillGroupSummaryReportsResponse;
	}
}