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

import com.aliyuncs.ccc.model.v20200701.ListIntervalInstanceReportResponse;
import com.aliyuncs.ccc.model.v20200701.ListIntervalInstanceReportResponse.DataItem;
import com.aliyuncs.ccc.model.v20200701.ListIntervalInstanceReportResponse.DataItem.Inbound;
import com.aliyuncs.ccc.model.v20200701.ListIntervalInstanceReportResponse.DataItem.Outbound;
import com.aliyuncs.ccc.model.v20200701.ListIntervalInstanceReportResponse.DataItem.Overall;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIntervalInstanceReportResponseUnmarshaller {

	public static ListIntervalInstanceReportResponse unmarshall(ListIntervalInstanceReportResponse listIntervalInstanceReportResponse, UnmarshallerContext _ctx) {
		
		listIntervalInstanceReportResponse.setRequestId(_ctx.stringValue("ListIntervalInstanceReportResponse.RequestId"));
		listIntervalInstanceReportResponse.setCode(_ctx.stringValue("ListIntervalInstanceReportResponse.Code"));
		listIntervalInstanceReportResponse.setHttpStatusCode(_ctx.integerValue("ListIntervalInstanceReportResponse.HttpStatusCode"));
		listIntervalInstanceReportResponse.setMessage(_ctx.stringValue("ListIntervalInstanceReportResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListIntervalInstanceReportResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setStatsTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].StatsTime"));

			Inbound inbound = new Inbound();
			inbound.setAbandonedRate(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.AbandonedRate"));
			inbound.setAverageAbandonTime(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.AverageAbandonTime"));
			inbound.setAverageAbandonedInIVRTime(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.AverageAbandonedInIVRTime"));
			inbound.setAverageAbandonedInQueueTime(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.AverageAbandonedInQueueTime"));
			inbound.setAverageAbandonedInRingTime(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.AverageAbandonedInRingTime"));
			inbound.setAverageHoldTime(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.AverageHoldTime"));
			inbound.setAverageRingTime(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.AverageRingTime"));
			inbound.setAverageTalkTime(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.AverageTalkTime"));
			inbound.setAverageWaitTime(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.AverageWaitTime"));
			inbound.setAverageWorkTime(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.AverageWorkTime"));
			inbound.setCallsAbandoned(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.CallsAbandoned"));
			inbound.setCallsAbandonedInIVR(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.CallsAbandonedInIVR"));
			inbound.setCallsAbandonedInQueue(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.CallsAbandonedInQueue"));
			inbound.setCallsAbandonedInRinging(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.CallsAbandonedInRinging"));
			inbound.setCallsConsulted(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.CallsConsulted"));
			inbound.setCallsHandled(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.CallsHandled"));
			inbound.setCallsHold(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.CallsHold"));
			inbound.setCallsOffered(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.CallsOffered"));
			inbound.setCallsQueued(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.CallsQueued"));
			inbound.setCallsRinged(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.CallsRinged"));
			inbound.setCallsTransferred(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.CallsTransferred"));
			inbound.setHandleRate(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.HandleRate"));
			inbound.setMaxAbandonTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.MaxAbandonTime"));
			inbound.setMaxAbandonedInIVRTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.MaxAbandonedInIVRTime"));
			inbound.setMaxAbandonedInQueueTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.MaxAbandonedInQueueTime"));
			inbound.setMaxAbandonedInRingTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.MaxAbandonedInRingTime"));
			inbound.setMaxHoldTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.MaxHoldTime"));
			inbound.setMaxRingTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.MaxRingTime"));
			inbound.setMaxTalkTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.MaxTalkTime"));
			inbound.setMaxWaitTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.MaxWaitTime"));
			inbound.setMaxWorkTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.MaxWorkTime"));
			inbound.setSatisfactionIndex(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.SatisfactionIndex"));
			inbound.setSatisfactionSurveysOffered(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.SatisfactionSurveysOffered"));
			inbound.setSatisfactionSurveysResponded(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.SatisfactionSurveysResponded"));
			inbound.setServiceLevel20(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.ServiceLevel20"));
			inbound.setTotalAbandonTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.TotalAbandonTime"));
			inbound.setTotalAbandonedInIVRTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.TotalAbandonedInIVRTime"));
			inbound.setTotalAbandonedInQueueTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.TotalAbandonedInQueueTime"));
			inbound.setTotalAbandonedInRingTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.TotalAbandonedInRingTime"));
			inbound.setTotalHoldTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.TotalHoldTime"));
			inbound.setTotalRingTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.TotalRingTime"));
			inbound.setTotalTalkTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.TotalTalkTime"));
			inbound.setTotalWaitTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.TotalWaitTime"));
			inbound.setTotalWorkTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.TotalWorkTime"));
			dataItem.setInbound(inbound);

			Outbound outbound = new Outbound();
			outbound.setAnswerRate(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.AnswerRate"));
			outbound.setAverageDialingTime(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.AverageDialingTime"));
			outbound.setAverageTalkTime(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.AverageTalkTime"));
			outbound.setAverageWorkTime(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.AverageWorkTime"));
			outbound.setCallsAnswered(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.CallsAnswered"));
			outbound.setCallsDialed(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.CallsDialed"));
			outbound.setCallsDialedSuccess(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.CallsDialedSuccess"));
			outbound.setMaxDialingTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.MaxDialingTime"));
			outbound.setMaxTalkTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.MaxTalkTime"));
			outbound.setMaxWorkTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.MaxWorkTime"));
			outbound.setSatisfactionIndex(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.SatisfactionIndex"));
			outbound.setSatisfactionSurveysOffered(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.SatisfactionSurveysOffered"));
			outbound.setSatisfactionSurveysResponded(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.SatisfactionSurveysResponded"));
			outbound.setTotalDialingTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.TotalDialingTime"));
			outbound.setTotalHoldTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.TotalHoldTime"));
			outbound.setTotalTalkTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.TotalTalkTime"));
			outbound.setTotalWorkTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.TotalWorkTime"));
			dataItem.setOutbound(outbound);

			Overall overall = new Overall();
			overall.setAverageBreakTime(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.AverageBreakTime"));
			overall.setAverageHoldTime(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.AverageHoldTime"));
			overall.setAverageReadyTime(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.AverageReadyTime"));
			overall.setAverageTalkTime(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.AverageTalkTime"));
			overall.setAverageWorkTime(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.AverageWorkTime"));
			overall.setMaxBreakTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.MaxBreakTime"));
			overall.setMaxHoldTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.MaxHoldTime"));
			overall.setMaxReadyTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.MaxReadyTime"));
			overall.setMaxTalkTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.MaxTalkTime"));
			overall.setMaxWorkTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.MaxWorkTime"));
			overall.setOccupancyRate(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.OccupancyRate"));
			overall.setSatisfactionIndex(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.SatisfactionIndex"));
			overall.setSatisfactionSurveysOffered(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.SatisfactionSurveysOffered"));
			overall.setSatisfactionSurveysResponded(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.SatisfactionSurveysResponded"));
			overall.setTotalBreakTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.TotalBreakTime"));
			overall.setTotalCalls(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.TotalCalls"));
			overall.setTotalHoldTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.TotalHoldTime"));
			overall.setTotalLoggedInTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.TotalLoggedInTime"));
			overall.setTotalReadyTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.TotalReadyTime"));
			overall.setTotalTalkTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.TotalTalkTime"));
			overall.setTotalWorkTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.TotalWorkTime"));
			dataItem.setOverall(overall);

			data.add(dataItem);
		}
		listIntervalInstanceReportResponse.setData(data);
	 
	 	return listIntervalInstanceReportResponse;
	}
}