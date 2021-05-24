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

import com.aliyuncs.ccc.model.v20200701.ListIntervalAgentReportResponse;
import com.aliyuncs.ccc.model.v20200701.ListIntervalAgentReportResponse.DataItem;
import com.aliyuncs.ccc.model.v20200701.ListIntervalAgentReportResponse.DataItem.Inbound;
import com.aliyuncs.ccc.model.v20200701.ListIntervalAgentReportResponse.DataItem.Outbound;
import com.aliyuncs.ccc.model.v20200701.ListIntervalAgentReportResponse.DataItem.Overall;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIntervalAgentReportResponseUnmarshaller {

	public static ListIntervalAgentReportResponse unmarshall(ListIntervalAgentReportResponse listIntervalAgentReportResponse, UnmarshallerContext _ctx) {
		
		listIntervalAgentReportResponse.setRequestId(_ctx.stringValue("ListIntervalAgentReportResponse.RequestId"));
		listIntervalAgentReportResponse.setCode(_ctx.stringValue("ListIntervalAgentReportResponse.Code"));
		listIntervalAgentReportResponse.setHttpStatusCode(_ctx.integerValue("ListIntervalAgentReportResponse.HttpStatusCode"));
		listIntervalAgentReportResponse.setMessage(_ctx.stringValue("ListIntervalAgentReportResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListIntervalAgentReportResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setStatsTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].StatsTime"));

			Inbound inbound = new Inbound();
			inbound.setAverageRingTime(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.AverageRingTime"));
			inbound.setAverageTalkTime(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.AverageTalkTime"));
			inbound.setAverageWorkTime(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.AverageWorkTime"));
			inbound.setCallsConsulted(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.CallsConsulted"));
			inbound.setCallsHandled(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.CallsHandled"));
			inbound.setCallsHold(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.CallsHold"));
			inbound.setCallsOffered(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.CallsOffered"));
			inbound.setCallsTransferred(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.CallsTransferred"));
			inbound.setHandleRate(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.HandleRate"));
			inbound.setMaxRingTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.MaxRingTime"));
			inbound.setMaxTalkTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.MaxTalkTime"));
			inbound.setMaxWorkTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.MaxWorkTime"));
			inbound.setSatisfactionIndex(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.SatisfactionIndex"));
			inbound.setSatisfactionSurveysOffered(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.SatisfactionSurveysOffered"));
			inbound.setSatisfactionSurveysResponded(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.SatisfactionSurveysResponded"));
			inbound.setTotalHoldTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.TotalHoldTime"));
			inbound.setTotalRingTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.TotalRingTime"));
			inbound.setTotalTalkTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.TotalTalkTime"));
			inbound.setTotalWorkTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Inbound.TotalWorkTime"));
			dataItem.setInbound(inbound);

			Outbound outbound = new Outbound();
			outbound.setAnswerRate(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.AnswerRate"));
			outbound.setAverageDialingTime(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.AverageDialingTime"));
			outbound.setAverageTalkTime(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.AverageTalkTime"));
			outbound.setAverageWorkTime(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.AverageWorkTime"));
			outbound.setCallsAnswered(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.CallsAnswered"));
			outbound.setCallsDialed(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.CallsDialed"));
			outbound.setMaxDialingTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.MaxDialingTime"));
			outbound.setMaxTalkTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.MaxTalkTime"));
			outbound.setMaxWorkTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.MaxWorkTime"));
			outbound.setSatisfactionIndex(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.SatisfactionIndex"));
			outbound.setSatisfactionSurveysOffered(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.SatisfactionSurveysOffered"));
			outbound.setSatisfactionSurveysResponded(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.SatisfactionSurveysResponded"));
			outbound.setTotalDialingTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.TotalDialingTime"));
			outbound.setTotalHoldTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.TotalHoldTime"));
			outbound.setTotalTalkTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.TotalTalkTime"));
			outbound.setTotalWorkTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Outbound.TotalWorkTime"));
			dataItem.setOutbound(outbound);

			Overall overall = new Overall();
			overall.setAverageBreakTime(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.AverageBreakTime"));
			overall.setAverageReadyTime(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.AverageReadyTime"));
			overall.setAverageTalkTime(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.AverageTalkTime"));
			overall.setAverageWorkTime(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.AverageWorkTime"));
			overall.setFirstCheckInTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.FirstCheckInTime"));
			overall.setLastCheckoutTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.LastCheckoutTime"));
			overall.setMaxBreakTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.MaxBreakTime"));
			overall.setMaxReadyTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.MaxReadyTime"));
			overall.setMaxTalkTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.MaxTalkTime"));
			overall.setMaxWorkTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.MaxWorkTime"));
			overall.setOccupancyRate(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.OccupancyRate"));
			overall.setSatisfactionIndex(_ctx.floatValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.SatisfactionIndex"));
			overall.setSatisfactionSurveysOffered(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.SatisfactionSurveysOffered"));
			overall.setSatisfactionSurveysResponded(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.SatisfactionSurveysResponded"));
			overall.setTotalBreakTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.TotalBreakTime"));
			overall.setTotalCalls(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.TotalCalls"));
			overall.setTotalHoldTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.TotalHoldTime"));
			overall.setTotalLoggedInTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.TotalLoggedInTime"));
			overall.setTotalReadyTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.TotalReadyTime"));
			overall.setTotalTalkTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.TotalTalkTime"));
			overall.setTotalWorkTime(_ctx.longValue("ListIntervalAgentReportResponse.Data["+ i +"].Overall.TotalWorkTime"));
			dataItem.setOverall(overall);

			data.add(dataItem);
		}
		listIntervalAgentReportResponse.setData(data);
	 
	 	return listIntervalAgentReportResponse;
	}
}