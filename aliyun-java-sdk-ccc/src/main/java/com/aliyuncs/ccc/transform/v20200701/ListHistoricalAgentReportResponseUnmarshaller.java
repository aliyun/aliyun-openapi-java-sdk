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
			items.setAgentId(_ctx.stringValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].AgentId"));
			items.setAgentName(_ctx.stringValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].AgentName"));

			Inbound inbound = new Inbound();
			inbound.setAverageHoldTime(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.AverageHoldTime"));
			inbound.setAverageRingTime(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.AverageRingTime"));
			inbound.setAverageTalkTime(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.AverageTalkTime"));
			inbound.setAverageWorkTime(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.AverageWorkTime"));
			inbound.setCallsConsulted(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.CallsConsulted"));
			inbound.setCallsHandled(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.CallsHandled"));
			inbound.setCallsHold(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.CallsHold"));
			inbound.setCallsOffered(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.CallsOffered"));
			inbound.setCallsTransferred(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.CallsTransferred"));
			inbound.setHandleRate(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.HandleRate"));
			inbound.setMaxHoldTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.MaxHoldTime"));
			inbound.setMaxRingTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.MaxRingTime"));
			inbound.setMaxTalkTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.MaxTalkTime"));
			inbound.setMaxWorkTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.MaxWorkTime"));
			inbound.setSatisfactionIndex(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.SatisfactionIndex"));
			inbound.setSatisfactionSurveysOffered(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.SatisfactionSurveysOffered"));
			inbound.setSatisfactionSurveysResponded(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.SatisfactionSurveysResponded"));
			inbound.setTotalHoldTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.TotalHoldTime"));
			inbound.setTotalRingTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.TotalRingTime"));
			inbound.setTotalTalkTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.TotalTalkTime"));
			inbound.setTotalWorkTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Inbound.TotalWorkTime"));
			items.setInbound(inbound);

			Outbound outbound = new Outbound();
			outbound.setAnswerRate(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.AnswerRate"));
			outbound.setAverageDialingTime(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.AverageDialingTime"));
			outbound.setAverageHoldTime(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.AverageHoldTime"));
			outbound.setAverageTalkTime(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.AverageTalkTime"));
			outbound.setAverageWorkTime(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.AverageWorkTime"));
			outbound.setCallsAnswered(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.CallsAnswered"));
			outbound.setCallsDialed(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.CallsDialed"));
			outbound.setCallsDialedSuccess(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.CallsDialedSuccess"));
			outbound.setCallsHold(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.CallsHold"));
			outbound.setMaxDialingTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.MaxDialingTime"));
			outbound.setMaxHoldTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.MaxHoldTime"));
			outbound.setMaxTalkTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.MaxTalkTime"));
			outbound.setMaxWorkTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.MaxWorkTime"));
			outbound.setSatisfactionIndex(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.SatisfactionIndex"));
			outbound.setSatisfactionSurveysOffered(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.SatisfactionSurveysOffered"));
			outbound.setSatisfactionSurveysResponded(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.SatisfactionSurveysResponded"));
			outbound.setTotalDialingTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.TotalDialingTime"));
			outbound.setTotalHoldTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.TotalHoldTime"));
			outbound.setTotalTalkTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.TotalTalkTime"));
			outbound.setTotalWorkTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Outbound.TotalWorkTime"));
			items.setOutbound(outbound);

			Overall overall = new Overall();
			overall.setAverageBreakTime(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.AverageBreakTime"));
			overall.setAverageReadyTime(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.AverageReadyTime"));
			overall.setAverageTalkTime(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.AverageTalkTime"));
			overall.setAverageWorkTime(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.AverageWorkTime"));
			overall.setMaxBreakTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.MaxBreakTime"));
			overall.setMaxReadyTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.MaxReadyTime"));
			overall.setMaxTalkTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.MaxTalkTime"));
			overall.setMaxWorkTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.MaxWorkTime"));
			overall.setOccupancyRate(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.OccupancyRate"));
			overall.setSatisfactionIndex(_ctx.floatValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.SatisfactionIndex"));
			overall.setSatisfactionSurveysOffered(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.SatisfactionSurveysOffered"));
			overall.setSatisfactionSurveysResponded(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.SatisfactionSurveysResponded"));
			overall.setTotalBreakTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.TotalBreakTime"));
			overall.setTotalCalls(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.TotalCalls"));
			overall.setTotalHoldTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.TotalHoldTime"));
			overall.setTotalLoggedInTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.TotalLoggedInTime"));
			overall.setTotalReadyTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.TotalReadyTime"));
			overall.setTotalTalkTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.TotalTalkTime"));
			overall.setTotalWorkTime(_ctx.longValue("ListHistoricalAgentReportResponse.Data.List["+ i +"].Overall.TotalWorkTime"));
			items.setOverall(overall);

			list.add(items);
		}
		data.setList(list);
		listHistoricalAgentReportResponse.setData(data);
	 
	 	return listHistoricalAgentReportResponse;
	}
}