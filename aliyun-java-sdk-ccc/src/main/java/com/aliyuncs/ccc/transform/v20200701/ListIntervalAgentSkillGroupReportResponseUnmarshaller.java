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

import com.aliyuncs.ccc.model.v20200701.ListIntervalAgentSkillGroupReportResponse;
import com.aliyuncs.ccc.model.v20200701.ListIntervalAgentSkillGroupReportResponse.DataItem;
import com.aliyuncs.ccc.model.v20200701.ListIntervalAgentSkillGroupReportResponse.DataItem.Back2Back;
import com.aliyuncs.ccc.model.v20200701.ListIntervalAgentSkillGroupReportResponse.DataItem.Inbound;
import com.aliyuncs.ccc.model.v20200701.ListIntervalAgentSkillGroupReportResponse.DataItem.Internal;
import com.aliyuncs.ccc.model.v20200701.ListIntervalAgentSkillGroupReportResponse.DataItem.Outbound;
import com.aliyuncs.ccc.model.v20200701.ListIntervalAgentSkillGroupReportResponse.DataItem.Overall;
import com.aliyuncs.ccc.model.v20200701.ListIntervalAgentSkillGroupReportResponse.DataItem.Overall.BreakCodeDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIntervalAgentSkillGroupReportResponseUnmarshaller {

	public static ListIntervalAgentSkillGroupReportResponse unmarshall(ListIntervalAgentSkillGroupReportResponse listIntervalAgentSkillGroupReportResponse, UnmarshallerContext _ctx) {
		
		listIntervalAgentSkillGroupReportResponse.setRequestId(_ctx.stringValue("ListIntervalAgentSkillGroupReportResponse.RequestId"));
		listIntervalAgentSkillGroupReportResponse.setCode(_ctx.stringValue("ListIntervalAgentSkillGroupReportResponse.Code"));
		listIntervalAgentSkillGroupReportResponse.setHttpStatusCode(_ctx.integerValue("ListIntervalAgentSkillGroupReportResponse.HttpStatusCode"));
		listIntervalAgentSkillGroupReportResponse.setMessage(_ctx.stringValue("ListIntervalAgentSkillGroupReportResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListIntervalAgentSkillGroupReportResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setStatsTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].StatsTime"));

			Inbound inbound = new Inbound();
			inbound.setAverageRingTime(_ctx.floatValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Inbound.AverageRingTime"));
			inbound.setCallsHandled(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Inbound.CallsHandled"));
			inbound.setTotalWorkTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Inbound.TotalWorkTime"));
			inbound.setCallsAttendedTransferOut(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Inbound.CallsAttendedTransferOut"));
			inbound.setMaxWorkTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Inbound.MaxWorkTime"));
			inbound.setTotalHoldTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Inbound.TotalHoldTime"));
			inbound.setAverageWorkTime(_ctx.floatValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Inbound.AverageWorkTime"));
			inbound.setCallsBlindTransferIn(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Inbound.CallsBlindTransferIn"));
			inbound.setSatisfactionIndex(_ctx.floatValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Inbound.SatisfactionIndex"));
			inbound.setCallsRinged(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Inbound.CallsRinged"));
			inbound.setCallsAttendedTransferIn(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Inbound.CallsAttendedTransferIn"));
			inbound.setCallsBlindTransferOut(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Inbound.CallsBlindTransferOut"));
			inbound.setTotalRingTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Inbound.TotalRingTime"));
			inbound.setMaxTalkTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Inbound.MaxTalkTime"));
			inbound.setMaxRingTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Inbound.MaxRingTime"));
			inbound.setTotalTalkTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Inbound.TotalTalkTime"));
			inbound.setCallsOffered(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Inbound.CallsOffered"));
			inbound.setMaxHoldTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Inbound.MaxHoldTime"));
			inbound.setAverageTalkTime(_ctx.floatValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Inbound.AverageTalkTime"));
			inbound.setSatisfactionRate(_ctx.floatValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Inbound.SatisfactionRate"));
			inbound.setCallsHold(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Inbound.CallsHold"));
			inbound.setSatisfactionSurveysOffered(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Inbound.SatisfactionSurveysOffered"));
			inbound.setHandleRate(_ctx.floatValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Inbound.HandleRate"));
			inbound.setSatisfactionSurveysResponded(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Inbound.SatisfactionSurveysResponded"));
			inbound.setAverageHoldTime(_ctx.floatValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Inbound.AverageHoldTime"));
			dataItem.setInbound(inbound);

			Outbound outbound = new Outbound();
			outbound.setAverageRingTime(_ctx.floatValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Outbound.AverageRingTime"));
			outbound.setCallsDialed(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Outbound.CallsDialed"));
			outbound.setCallsAnswered(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Outbound.CallsAnswered"));
			outbound.setTotalWorkTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Outbound.TotalWorkTime"));
			outbound.setCallsAttendedTransferOut(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Outbound.CallsAttendedTransferOut"));
			outbound.setMaxWorkTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Outbound.MaxWorkTime"));
			outbound.setTotalDialingTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Outbound.TotalDialingTime"));
			outbound.setTotalHoldTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Outbound.TotalHoldTime"));
			outbound.setAverageWorkTime(_ctx.floatValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Outbound.AverageWorkTime"));
			outbound.setCallsBlindTransferIn(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Outbound.CallsBlindTransferIn"));
			outbound.setSatisfactionIndex(_ctx.floatValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Outbound.SatisfactionIndex"));
			outbound.setCallsRinged(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Outbound.CallsRinged"));
			outbound.setCallsAttendedTransferIn(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Outbound.CallsAttendedTransferIn"));
			outbound.setCallsBlindTransferOut(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Outbound.CallsBlindTransferOut"));
			outbound.setTotalRingTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Outbound.TotalRingTime"));
			outbound.setMaxTalkTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Outbound.MaxTalkTime"));
			outbound.setMaxRingTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Outbound.MaxRingTime"));
			outbound.setTotalTalkTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Outbound.TotalTalkTime"));
			outbound.setMaxDialingTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Outbound.MaxDialingTime"));
			outbound.setAnswerRate(_ctx.floatValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Outbound.AnswerRate"));
			outbound.setMaxHoldTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Outbound.MaxHoldTime"));
			outbound.setAverageTalkTime(_ctx.floatValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Outbound.AverageTalkTime"));
			outbound.setSatisfactionRate(_ctx.floatValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Outbound.SatisfactionRate"));
			outbound.setCallsHold(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Outbound.CallsHold"));
			outbound.setSatisfactionSurveysOffered(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Outbound.SatisfactionSurveysOffered"));
			outbound.setSatisfactionSurveysResponded(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Outbound.SatisfactionSurveysResponded"));
			outbound.setAverageHoldTime(_ctx.floatValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Outbound.AverageHoldTime"));
			outbound.setAverageDialingTime(_ctx.floatValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Outbound.AverageDialingTime"));
			dataItem.setOutbound(outbound);

			Overall overall = new Overall();
			overall.setOccupancyRate(_ctx.floatValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Overall.OccupancyRate"));
			overall.setTotalWorkTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Overall.TotalWorkTime"));
			overall.setMaxWorkTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Overall.MaxWorkTime"));
			overall.setTotalHoldTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Overall.TotalHoldTime"));
			overall.setAverageWorkTime(_ctx.floatValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Overall.AverageWorkTime"));
			overall.setMaxBreakTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Overall.MaxBreakTime"));
			overall.setSatisfactionIndex(_ctx.floatValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Overall.SatisfactionIndex"));
			overall.setMaxReadyTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Overall.MaxReadyTime"));
			overall.setMaxTalkTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Overall.MaxTalkTime"));
			overall.setTotalReadyTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Overall.TotalReadyTime"));
			overall.setLastCheckoutTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Overall.LastCheckoutTime"));
			overall.setTotalCalls(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Overall.TotalCalls"));
			overall.setTotalLoggedInTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Overall.TotalLoggedInTime"));
			overall.setTotalTalkTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Overall.TotalTalkTime"));
			overall.setMaxHoldTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Overall.MaxHoldTime"));
			overall.setAverageBreakTime(_ctx.floatValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Overall.AverageBreakTime"));
			overall.setAverageTalkTime(_ctx.floatValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Overall.AverageTalkTime"));
			overall.setSatisfactionRate(_ctx.floatValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Overall.SatisfactionRate"));
			overall.setSatisfactionSurveysOffered(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Overall.SatisfactionSurveysOffered"));
			overall.setFirstCheckInTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Overall.FirstCheckInTime"));
			overall.setSatisfactionSurveysResponded(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Overall.SatisfactionSurveysResponded"));
			overall.setAverageHoldTime(_ctx.floatValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Overall.AverageHoldTime"));
			overall.setAverageReadyTime(_ctx.floatValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Overall.AverageReadyTime"));
			overall.setTotalBreakTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Overall.TotalBreakTime"));
			overall.setTotalOutboundScenarioTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Overall.TotalOutboundScenarioTime"));
			overall.setTotalOutboundScenarioReadyTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Overall.TotalOutboundScenarioReadyTime"));

			List<BreakCodeDetail> breakCodeDetailList = new ArrayList<BreakCodeDetail>();
			for (int j = 0; j < _ctx.lengthValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Overall.BreakCodeDetailList.Length"); j++) {
				BreakCodeDetail breakCodeDetail = new BreakCodeDetail();
				breakCodeDetail.setBreakCode(_ctx.stringValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Overall.BreakCodeDetailList["+ j +"].BreakCode"));
				breakCodeDetail.setCount(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Overall.BreakCodeDetailList["+ j +"].Count"));
				breakCodeDetail.setDuration(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Overall.BreakCodeDetailList["+ j +"].Duration"));

				breakCodeDetailList.add(breakCodeDetail);
			}
			overall.setBreakCodeDetailList(breakCodeDetailList);
			dataItem.setOverall(overall);

			Internal internal = new Internal();
			internal.setTotalTalkTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Internal.TotalTalkTime"));
			internal.setAverageTalkTime(_ctx.floatValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Internal.AverageTalkTime"));
			internal.setMaxTalkTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Internal.MaxTalkTime"));
			internal.setCallsOffered(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Internal.CallsOffered"));
			internal.setCallsHandled(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Internal.CallsHandled"));
			internal.setCallsTalk(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Internal.CallsTalk"));
			internal.setCallsDialed(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Internal.CallsDialed"));
			internal.setCallsAnswered(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Internal.CallsAnswered"));
			dataItem.setInternal(internal);

			Back2Back back2Back = new Back2Back();
			back2Back.setCallsDialed(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Back2Back.CallsDialed"));
			back2Back.setAnswerRate(_ctx.floatValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Back2Back.AnswerRate"));
			back2Back.setCallsAnswered(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Back2Back.CallsAnswered"));
			back2Back.setAgentAnswerRate(_ctx.floatValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Back2Back.AgentAnswerRate"));
			back2Back.setCallsCustomerHandled(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Back2Back.CallsCustomerHandled"));
			back2Back.setCustomerHandleRate(_ctx.floatValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Back2Back.CustomerHandleRate"));
			back2Back.setTotalTalkTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Back2Back.TotalTalkTime"));
			back2Back.setMaxTalkTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Back2Back.MaxTalkTime"));
			back2Back.setAverageTalkTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Back2Back.AverageTalkTime"));
			back2Back.setTotalRingTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Back2Back.TotalRingTime"));
			back2Back.setMaxRingTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Back2Back.MaxRingTime"));
			back2Back.setAverageRingTime(_ctx.floatValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Back2Back.AverageRingTime"));
			back2Back.setTotalCustomerRingTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Back2Back.TotalCustomerRingTime"));
			back2Back.setMaxCustomerRingTime(_ctx.longValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Back2Back.MaxCustomerRingTime"));
			back2Back.setAverageCustomerRingTime(_ctx.floatValue("ListIntervalAgentSkillGroupReportResponse.Data["+ i +"].Back2Back.AverageCustomerRingTime"));
			dataItem.setBack2Back(back2Back);

			data.add(dataItem);
		}
		listIntervalAgentSkillGroupReportResponse.setData(data);
	 
	 	return listIntervalAgentSkillGroupReportResponse;
	}
}