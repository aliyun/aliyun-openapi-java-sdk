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

import com.aliyuncs.ccc.model.v20200701.ListHistoricalAgentSkillGroupReportResponse;
import com.aliyuncs.ccc.model.v20200701.ListHistoricalAgentSkillGroupReportResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListHistoricalAgentSkillGroupReportResponse.Data.ReportItem;
import com.aliyuncs.ccc.model.v20200701.ListHistoricalAgentSkillGroupReportResponse.Data.ReportItem.Back2Back;
import com.aliyuncs.ccc.model.v20200701.ListHistoricalAgentSkillGroupReportResponse.Data.ReportItem.Inbound;
import com.aliyuncs.ccc.model.v20200701.ListHistoricalAgentSkillGroupReportResponse.Data.ReportItem.Internal;
import com.aliyuncs.ccc.model.v20200701.ListHistoricalAgentSkillGroupReportResponse.Data.ReportItem.Outbound;
import com.aliyuncs.ccc.model.v20200701.ListHistoricalAgentSkillGroupReportResponse.Data.ReportItem.Overall;
import com.aliyuncs.ccc.model.v20200701.ListHistoricalAgentSkillGroupReportResponse.Data.ReportItem.Overall.BreakCodeDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListHistoricalAgentSkillGroupReportResponseUnmarshaller {

	public static ListHistoricalAgentSkillGroupReportResponse unmarshall(ListHistoricalAgentSkillGroupReportResponse listHistoricalAgentSkillGroupReportResponse, UnmarshallerContext _ctx) {
		
		listHistoricalAgentSkillGroupReportResponse.setRequestId(_ctx.stringValue("ListHistoricalAgentSkillGroupReportResponse.RequestId"));
		listHistoricalAgentSkillGroupReportResponse.setCode(_ctx.stringValue("ListHistoricalAgentSkillGroupReportResponse.Code"));
		listHistoricalAgentSkillGroupReportResponse.setHttpStatusCode(_ctx.integerValue("ListHistoricalAgentSkillGroupReportResponse.HttpStatusCode"));
		listHistoricalAgentSkillGroupReportResponse.setMessage(_ctx.stringValue("ListHistoricalAgentSkillGroupReportResponse.Message"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListHistoricalAgentSkillGroupReportResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListHistoricalAgentSkillGroupReportResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListHistoricalAgentSkillGroupReportResponse.Data.TotalCount"));

		List<ReportItem> list = new ArrayList<ReportItem>();
		for (int i = 0; i < _ctx.lengthValue("ListHistoricalAgentSkillGroupReportResponse.Data.List.Length"); i++) {
			ReportItem reportItem = new ReportItem();
			reportItem.setAgentName(_ctx.stringValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].AgentName"));
			reportItem.setAgentId(_ctx.stringValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].AgentId"));
			reportItem.setDisplayId(_ctx.stringValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].DisplayId"));
			reportItem.setSkillGroupName(_ctx.stringValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].SkillGroupName"));
			reportItem.setSkillGroupId(_ctx.stringValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].SkillGroupId"));

			Inbound inbound = new Inbound();
			inbound.setAverageRingTime(_ctx.floatValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Inbound.AverageRingTime"));
			inbound.setCallsHandled(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Inbound.CallsHandled"));
			inbound.setTotalWorkTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Inbound.TotalWorkTime"));
			inbound.setCallsAttendedTransferOut(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Inbound.CallsAttendedTransferOut"));
			inbound.setMaxWorkTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Inbound.MaxWorkTime"));
			inbound.setTotalHoldTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Inbound.TotalHoldTime"));
			inbound.setAverageWorkTime(_ctx.floatValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Inbound.AverageWorkTime"));
			inbound.setCallsBlindTransferIn(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Inbound.CallsBlindTransferIn"));
			inbound.setSatisfactionIndex(_ctx.floatValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Inbound.SatisfactionIndex"));
			inbound.setCallsRinged(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Inbound.CallsRinged"));
			inbound.setCallsAttendedTransferIn(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Inbound.CallsAttendedTransferIn"));
			inbound.setCallsBlindTransferOut(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Inbound.CallsBlindTransferOut"));
			inbound.setTotalRingTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Inbound.TotalRingTime"));
			inbound.setMaxTalkTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Inbound.MaxTalkTime"));
			inbound.setMaxRingTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Inbound.MaxRingTime"));
			inbound.setTotalTalkTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Inbound.TotalTalkTime"));
			inbound.setCallsOffered(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Inbound.CallsOffered"));
			inbound.setMaxHoldTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Inbound.MaxHoldTime"));
			inbound.setAverageTalkTime(_ctx.floatValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Inbound.AverageTalkTime"));
			inbound.setSatisfactionRate(_ctx.floatValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Inbound.SatisfactionRate"));
			inbound.setCallsHold(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Inbound.CallsHold"));
			inbound.setSatisfactionSurveysOffered(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Inbound.SatisfactionSurveysOffered"));
			inbound.setHandleRate(_ctx.floatValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Inbound.HandleRate"));
			inbound.setSatisfactionSurveysResponded(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Inbound.SatisfactionSurveysResponded"));
			inbound.setAverageHoldTime(_ctx.floatValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Inbound.AverageHoldTime"));
			reportItem.setInbound(inbound);

			Outbound outbound = new Outbound();
			outbound.setAverageRingTime(_ctx.floatValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Outbound.AverageRingTime"));
			outbound.setCallsDialed(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Outbound.CallsDialed"));
			outbound.setCallsAnswered(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Outbound.CallsAnswered"));
			outbound.setTotalWorkTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Outbound.TotalWorkTime"));
			outbound.setCallsAttendedTransferOut(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Outbound.CallsAttendedTransferOut"));
			outbound.setMaxWorkTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Outbound.MaxWorkTime"));
			outbound.setTotalDialingTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Outbound.TotalDialingTime"));
			outbound.setTotalHoldTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Outbound.TotalHoldTime"));
			outbound.setAverageWorkTime(_ctx.floatValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Outbound.AverageWorkTime"));
			outbound.setCallsBlindTransferIn(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Outbound.CallsBlindTransferIn"));
			outbound.setSatisfactionIndex(_ctx.floatValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Outbound.SatisfactionIndex"));
			outbound.setCallsRinged(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Outbound.CallsRinged"));
			outbound.setCallsAttendedTransferIn(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Outbound.CallsAttendedTransferIn"));
			outbound.setCallsBlindTransferOut(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Outbound.CallsBlindTransferOut"));
			outbound.setTotalRingTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Outbound.TotalRingTime"));
			outbound.setMaxTalkTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Outbound.MaxTalkTime"));
			outbound.setMaxRingTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Outbound.MaxRingTime"));
			outbound.setTotalTalkTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Outbound.TotalTalkTime"));
			outbound.setMaxDialingTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Outbound.MaxDialingTime"));
			outbound.setAnswerRate(_ctx.floatValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Outbound.AnswerRate"));
			outbound.setMaxHoldTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Outbound.MaxHoldTime"));
			outbound.setAverageTalkTime(_ctx.floatValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Outbound.AverageTalkTime"));
			outbound.setSatisfactionRate(_ctx.floatValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Outbound.SatisfactionRate"));
			outbound.setCallsHold(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Outbound.CallsHold"));
			outbound.setSatisfactionSurveysOffered(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Outbound.SatisfactionSurveysOffered"));
			outbound.setSatisfactionSurveysResponded(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Outbound.SatisfactionSurveysResponded"));
			outbound.setAverageHoldTime(_ctx.floatValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Outbound.AverageHoldTime"));
			outbound.setAverageDialingTime(_ctx.floatValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Outbound.AverageDialingTime"));
			reportItem.setOutbound(outbound);

			Overall overall = new Overall();
			overall.setTotalTalkTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Overall.TotalTalkTime"));
			overall.setTotalLoggedInTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Overall.TotalLoggedInTime"));
			overall.setOccupancyRate(_ctx.floatValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Overall.OccupancyRate"));
			overall.setTotalWorkTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Overall.TotalWorkTime"));
			overall.setMaxHoldTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Overall.MaxHoldTime"));
			overall.setMaxWorkTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Overall.MaxWorkTime"));
			overall.setAverageBreakTime(_ctx.floatValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Overall.AverageBreakTime"));
			overall.setTotalHoldTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Overall.TotalHoldTime"));
			overall.setSatisfactionRate(_ctx.floatValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Overall.SatisfactionRate"));
			overall.setMaxBreakTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Overall.MaxBreakTime"));
			overall.setAverageWorkTime(_ctx.floatValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Overall.AverageWorkTime"));
			overall.setAverageTalkTime(_ctx.floatValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Overall.AverageTalkTime"));
			overall.setSatisfactionIndex(_ctx.floatValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Overall.SatisfactionIndex"));
			overall.setSatisfactionSurveysOffered(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Overall.SatisfactionSurveysOffered"));
			overall.setSatisfactionSurveysResponded(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Overall.SatisfactionSurveysResponded"));
			overall.setMaxReadyTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Overall.MaxReadyTime"));
			overall.setAverageReadyTime(_ctx.floatValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Overall.AverageReadyTime"));
			overall.setAverageHoldTime(_ctx.floatValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Overall.AverageHoldTime"));
			overall.setTotalReadyTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Overall.TotalReadyTime"));
			overall.setTotalBreakTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Overall.TotalBreakTime"));
			overall.setMaxTalkTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Overall.MaxTalkTime"));
			overall.setTotalCalls(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Overall.TotalCalls"));
			overall.setFirstCheckInTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Overall.FirstCheckInTime"));
			overall.setLastCheckOutTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Overall.LastCheckOutTime"));
			overall.setTotalOutboundScenarioTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Overall.TotalOutboundScenarioTime"));
			overall.setTotalOutboundScenarioReadyTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Overall.TotalOutboundScenarioReadyTime"));

			List<BreakCodeDetail> breakCodeDetailList = new ArrayList<BreakCodeDetail>();
			for (int j = 0; j < _ctx.lengthValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Overall.BreakCodeDetailList.Length"); j++) {
				BreakCodeDetail breakCodeDetail = new BreakCodeDetail();
				breakCodeDetail.setBreakCode(_ctx.stringValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Overall.BreakCodeDetailList["+ j +"].BreakCode"));
				breakCodeDetail.setCount(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Overall.BreakCodeDetailList["+ j +"].Count"));
				breakCodeDetail.setDuration(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Overall.BreakCodeDetailList["+ j +"].Duration"));

				breakCodeDetailList.add(breakCodeDetail);
			}
			overall.setBreakCodeDetailList(breakCodeDetailList);
			reportItem.setOverall(overall);

			Internal internal = new Internal();
			internal.setTotalTalkTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Internal.TotalTalkTime"));
			internal.setAverageTalkTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Internal.AverageTalkTime"));
			internal.setMaxTalkTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Internal.MaxTalkTime"));
			internal.setCallsOffered(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Internal.CallsOffered"));
			internal.setCallsHandled(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Internal.CallsHandled"));
			internal.setCallsTalk(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Internal.CallsTalk"));
			internal.setCallsDialed(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Internal.CallsDialed"));
			internal.setCallsAnswered(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Internal.CallsAnswered"));
			reportItem.setInternal(internal);

			Back2Back back2Back = new Back2Back();
			back2Back.setCallsDialed(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Back2Back.CallsDialed"));
			back2Back.setAnswerRate(_ctx.floatValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Back2Back.AnswerRate"));
			back2Back.setCallsAnswered(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Back2Back.CallsAnswered"));
			back2Back.setAgentAnswerRate(_ctx.floatValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Back2Back.AgentAnswerRate"));
			back2Back.setCallsCustomerHandled(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Back2Back.CallsCustomerHandled"));
			back2Back.setCustomerHandleRate(_ctx.floatValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Back2Back.CustomerHandleRate"));
			back2Back.setTotalTalkTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Back2Back.TotalTalkTime"));
			back2Back.setMaxTalkTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Back2Back.MaxTalkTime"));
			back2Back.setAverageTalkTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Back2Back.AverageTalkTime"));
			back2Back.setTotalRingTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Back2Back.TotalRingTime"));
			back2Back.setMaxRingTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Back2Back.MaxRingTime"));
			back2Back.setAverageRingTime(_ctx.floatValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Back2Back.AverageRingTime"));
			back2Back.setTotalCustomerRingTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Back2Back.TotalCustomerRingTime"));
			back2Back.setMaxCustomerRingTime(_ctx.longValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Back2Back.MaxCustomerRingTime"));
			back2Back.setAverageCustomerRingTime(_ctx.floatValue("ListHistoricalAgentSkillGroupReportResponse.Data.List["+ i +"].Back2Back.AverageCustomerRingTime"));
			reportItem.setBack2Back(back2Back);

			list.add(reportItem);
		}
		data.setList(list);
		listHistoricalAgentSkillGroupReportResponse.setData(data);
	 
	 	return listHistoricalAgentSkillGroupReportResponse;
	}
}