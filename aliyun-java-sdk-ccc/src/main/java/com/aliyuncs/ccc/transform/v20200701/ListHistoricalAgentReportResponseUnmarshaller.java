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

import com.aliyuncs.ccc.model.v20200701.ListHistoricalAgentReportResponse;
import com.aliyuncs.ccc.model.v20200701.ListHistoricalAgentReportResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListHistoricalAgentReportResponse.Data.Items;
import com.aliyuncs.ccc.model.v20200701.ListHistoricalAgentReportResponse.Data.Items.Inbound;
import com.aliyuncs.ccc.model.v20200701.ListHistoricalAgentReportResponse.Data.Items.Outbound;
import com.aliyuncs.ccc.model.v20200701.ListHistoricalAgentReportResponse.Data.Items.Overall;
import com.aliyuncs.ccc.model.v20200701.ListHistoricalAgentReportResponse.Data.Items.Overall.BreakCodeDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListHistoricalAgentReportResponseUnmarshaller {

	public static ListHistoricalAgentReportResponse unmarshall(ListHistoricalAgentReportResponse listHistoricalAgentReportResponse, UnmarshallerContext _ctx) {
		
		listHistoricalAgentReportResponse.setRequestId(_ctx.stringValue("ListHistoricalAgentReportResponse.RequestId"));
		listHistoricalAgentReportResponse.setCode(_ctx.stringValue("ListHistoricalAgentReportResponse.Code"));
		listHistoricalAgentReportResponse.setHttpStatusCode(_ctx.integerValue("ListHistoricalAgentReportResponse.HttpStatusCode"));
		listHistoricalAgentReportResponse.setMessage(_ctx.stringValue("ListHistoricalAgentReportResponse.Message"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListHistoricalAgentReportResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListHistoricalAgentReportResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListHistoricalAgentReportResponse.Data.TotalCount"));

		List<Items> list = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("ListHistoricalAgentReportResponse.Data.List.Length"); i++) {
			Items items = new Items();
			items.setAgentName(_ctx.stringValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].AgentName"));
			items.setAgentId(_ctx.stringValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].AgentId"));
			items.setDisplayId(_ctx.stringValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].DisplayId"));
			items.setSkillGroupIds(_ctx.stringValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].SkillGroupIds"));
			items.setSkillGroupNames(_ctx.stringValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].SkillGroupNames"));

			Inbound inbound = new Inbound();
			inbound.setAverageRingTime(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.AverageRingTime"));
			inbound.setCallsHandled(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.CallsHandled"));
			inbound.setTotalWorkTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.TotalWorkTime"));
			inbound.setCallsAttendedTransferOut(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.CallsAttendedTransferOut"));
			inbound.setMaxWorkTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.MaxWorkTime"));
			inbound.setTotalHoldTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.TotalHoldTime"));
			inbound.setAverageWorkTime(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.AverageWorkTime"));
			inbound.setCallsBlindTransferIn(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.CallsBlindTransferIn"));
			inbound.setSatisfactionIndex(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.SatisfactionIndex"));
			inbound.setCallsRinged(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.CallsRinged"));
			inbound.setCallsAttendedTransferIn(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.CallsAttendedTransferIn"));
			inbound.setCallsBlindTransferOut(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.CallsBlindTransferOut"));
			inbound.setTotalRingTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.TotalRingTime"));
			inbound.setMaxTalkTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.MaxTalkTime"));
			inbound.setMaxRingTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.MaxRingTime"));
			inbound.setTotalTalkTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.TotalTalkTime"));
			inbound.setCallsOffered(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.CallsOffered"));
			inbound.setMaxHoldTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.MaxHoldTime"));
			inbound.setAverageTalkTime(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.AverageTalkTime"));
			inbound.setSatisfactionRate(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.SatisfactionRate"));
			inbound.setCallsHold(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.CallsHold"));
			inbound.setSatisfactionSurveysOffered(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.SatisfactionSurveysOffered"));
			inbound.setHandleRate(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.HandleRate"));
			inbound.setSatisfactionSurveysResponded(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.SatisfactionSurveysResponded"));
			inbound.setAverageHoldTime(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.AverageHoldTime"));
			items.setInbound(inbound);

			Outbound outbound = new Outbound();
			outbound.setAverageRingTime(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.AverageRingTime"));
			outbound.setCallsDialed(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.CallsDialed"));
			outbound.setCallsAnswered(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.CallsAnswered"));
			outbound.setTotalWorkTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.TotalWorkTime"));
			outbound.setCallsAttendedTransferOut(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.CallsAttendedTransferOut"));
			outbound.setMaxWorkTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.MaxWorkTime"));
			outbound.setTotalDialingTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.TotalDialingTime"));
			outbound.setTotalHoldTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.TotalHoldTime"));
			outbound.setAverageWorkTime(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.AverageWorkTime"));
			outbound.setCallsBlindTransferIn(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.CallsBlindTransferIn"));
			outbound.setSatisfactionIndex(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.SatisfactionIndex"));
			outbound.setCallsRinged(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.CallsRinged"));
			outbound.setCallsAttendedTransferIn(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.CallsAttendedTransferIn"));
			outbound.setCallsBlindTransferOut(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.CallsBlindTransferOut"));
			outbound.setTotalRingTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.TotalRingTime"));
			outbound.setMaxTalkTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.MaxTalkTime"));
			outbound.setMaxRingTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.MaxRingTime"));
			outbound.setTotalTalkTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.TotalTalkTime"));
			outbound.setMaxDialingTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.MaxDialingTime"));
			outbound.setAnswerRate(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.AnswerRate"));
			outbound.setMaxHoldTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.MaxHoldTime"));
			outbound.setAverageTalkTime(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.AverageTalkTime"));
			outbound.setSatisfactionRate(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.SatisfactionRate"));
			outbound.setCallsHold(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.CallsHold"));
			outbound.setSatisfactionSurveysOffered(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.SatisfactionSurveysOffered"));
			outbound.setSatisfactionSurveysResponded(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.SatisfactionSurveysResponded"));
			outbound.setAverageHoldTime(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.AverageHoldTime"));
			outbound.setAverageDialingTime(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.AverageDialingTime"));
			items.setOutbound(outbound);

			Overall overall = new Overall();
			overall.setTotalTalkTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.TotalTalkTime"));
			overall.setTotalLoggedInTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.TotalLoggedInTime"));
			overall.setOccupancyRate(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.OccupancyRate"));
			overall.setTotalWorkTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.TotalWorkTime"));
			overall.setMaxHoldTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.MaxHoldTime"));
			overall.setMaxWorkTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.MaxWorkTime"));
			overall.setAverageBreakTime(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.AverageBreakTime"));
			overall.setTotalHoldTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.TotalHoldTime"));
			overall.setSatisfactionRate(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.SatisfactionRate"));
			overall.setMaxBreakTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.MaxBreakTime"));
			overall.setAverageWorkTime(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.AverageWorkTime"));
			overall.setAverageTalkTime(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.AverageTalkTime"));
			overall.setSatisfactionIndex(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.SatisfactionIndex"));
			overall.setSatisfactionSurveysOffered(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.SatisfactionSurveysOffered"));
			overall.setSatisfactionSurveysResponded(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.SatisfactionSurveysResponded"));
			overall.setMaxReadyTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.MaxReadyTime"));
			overall.setAverageReadyTime(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.AverageReadyTime"));
			overall.setAverageHoldTime(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.AverageHoldTime"));
			overall.setTotalReadyTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.TotalReadyTime"));
			overall.setTotalBreakTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.TotalBreakTime"));
			overall.setMaxTalkTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.MaxTalkTime"));
			overall.setTotalCalls(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.TotalCalls"));
			overall.setTotalOnSiteOnlineTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.TotalOnSiteOnlineTime"));
			overall.setTotalOffSiteOnlineTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.TotalOffSiteOnlineTime"));
			overall.setTotalOfficePhoneOnlineTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.TotalOfficePhoneOnlineTime"));
			overall.setFirstCheckInTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.FirstCheckInTime"));
			overall.setLastCheckOutTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.LastCheckOutTime"));
			overall.setTotalOutboundScenarioTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.TotalOutboundScenarioTime"));
			overall.setTotalOutboundScenarioReadyTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.TotalOutboundScenarioReadyTime"));

			List<BreakCodeDetail> breakCodeDetailList = new ArrayList<BreakCodeDetail>();
			for (int j = 0; j < _ctx.lengthValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.BreakCodeDetailList.Length"); j++) {
				BreakCodeDetail breakCodeDetail = new BreakCodeDetail();
				breakCodeDetail.setBreakCode(_ctx.stringValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.BreakCodeDetailList["+ j +"].BreakCode"));
				breakCodeDetail.setCount(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.BreakCodeDetailList["+ j +"].Count"));
				breakCodeDetail.setDuration(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.BreakCodeDetailList["+ j +"].Duration"));

				breakCodeDetailList.add(breakCodeDetail);
			}
			overall.setBreakCodeDetailList(breakCodeDetailList);
			items.setOverall(overall);

			list.add(items);
		}
		data.setList(list);
		listHistoricalAgentReportResponse.setData(data);
	 
	 	return listHistoricalAgentReportResponse;
	}
}