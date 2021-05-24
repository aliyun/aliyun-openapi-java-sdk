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

import com.aliyuncs.ccc.model.v20200701.GetHistoricalInstanceReportResponse;
import com.aliyuncs.ccc.model.v20200701.GetHistoricalInstanceReportResponse.Data;
import com.aliyuncs.ccc.model.v20200701.GetHistoricalInstanceReportResponse.Data.Inbound;
import com.aliyuncs.ccc.model.v20200701.GetHistoricalInstanceReportResponse.Data.Outbound;
import com.aliyuncs.ccc.model.v20200701.GetHistoricalInstanceReportResponse.Data.Overall;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHistoricalInstanceReportResponseUnmarshaller {

	public static GetHistoricalInstanceReportResponse unmarshall(GetHistoricalInstanceReportResponse getHistoricalInstanceReportResponse, UnmarshallerContext _ctx) {
		
		getHistoricalInstanceReportResponse.setRequestId(_ctx.stringValue("GetHistoricalInstanceReportResponse.RequestId"));
		getHistoricalInstanceReportResponse.setCode(_ctx.stringValue("GetHistoricalInstanceReportResponse.Code"));
		getHistoricalInstanceReportResponse.setHttpStatusCode(_ctx.integerValue("GetHistoricalInstanceReportResponse.HttpStatusCode"));
		getHistoricalInstanceReportResponse.setMessage(_ctx.stringValue("GetHistoricalInstanceReportResponse.Message"));

		Data data = new Data();

		Inbound inbound = new Inbound();
		inbound.setAbandonRate(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Inbound.AbandonRate"));
		inbound.setAverageAbandonTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Inbound.AverageAbandonTime"));
		inbound.setAverageAbandonedInIVRTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Inbound.AverageAbandonedInIVRTime"));
		inbound.setAverageAbandonedInQueueTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Inbound.AverageAbandonedInQueueTime"));
		inbound.setAverageAbandonedInRingTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Inbound.AverageAbandonedInRingTime"));
		inbound.setAverageHoldTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Inbound.AverageHoldTime"));
		inbound.setAverageRingTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Inbound.AverageRingTime"));
		inbound.setAverageTalkTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Inbound.AverageTalkTime"));
		inbound.setAverageWaitTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Inbound.AverageWaitTime"));
		inbound.setAverageWorkTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Inbound.AverageWorkTime"));
		inbound.setCallsAbandoned(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.CallsAbandoned"));
		inbound.setCallsAbandonedInIVR(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.CallsAbandonedInIVR"));
		inbound.setCallsAbandonedInQueue(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.CallsAbandonedInQueue"));
		inbound.setCallsAbandonedInRinging(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.CallsAbandonedInRinging"));
		inbound.setCallsConsulted(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.CallsConsulted"));
		inbound.setCallsHandled(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.CallsHandled"));
		inbound.setCallsHold(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.CallsHold"));
		inbound.setCallsOffered(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.CallsOffered"));
		inbound.setCallsQueued(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.CallsQueued"));
		inbound.setCallsRinged(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.CallsRinged"));
		inbound.setCallsTransferred(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.CallsTransferred"));
		inbound.setHandleRate(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Inbound.HandleRate"));
		inbound.setMaxAbandonTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.MaxAbandonTime"));
		inbound.setMaxAbandonedInIVRTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.MaxAbandonedInIVRTime"));
		inbound.setMaxAbandonedInQueueTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.MaxAbandonedInQueueTime"));
		inbound.setMaxAbandonedInRingTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.MaxAbandonedInRingTime"));
		inbound.setMaxHoldTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.MaxHoldTime"));
		inbound.setMaxRingTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.MaxRingTime"));
		inbound.setMaxTalkTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.MaxTalkTime"));
		inbound.setMaxWaitTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.MaxWaitTime"));
		inbound.setMaxWorkTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.MaxWorkTime"));
		inbound.setSatisfactionIndex(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Inbound.SatisfactionIndex"));
		inbound.setSatisfactionSurveysOffered(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.SatisfactionSurveysOffered"));
		inbound.setSatisfactionSurveysResponded(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.SatisfactionSurveysResponded"));
		inbound.setServiceLevel20(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Inbound.ServiceLevel20"));
		inbound.setTotalAbandonTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.TotalAbandonTime"));
		inbound.setTotalAbandonedInIVRTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.TotalAbandonedInIVRTime"));
		inbound.setTotalAbandonedInQueueTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.TotalAbandonedInQueueTime"));
		inbound.setTotalAbandonedInRingTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.TotalAbandonedInRingTime"));
		inbound.setTotalHoldTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.TotalHoldTime"));
		inbound.setTotalRingTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.TotalRingTime"));
		inbound.setTotalTalkTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.TotalTalkTime"));
		inbound.setTotalWaitTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.TotalWaitTime"));
		inbound.setTotalWorkTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.TotalWorkTime"));
		data.setInbound(inbound);

		Outbound outbound = new Outbound();
		outbound.setAnswerRate(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Outbound.AnswerRate"));
		outbound.setAverageDialingTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Outbound.AverageDialingTime"));
		outbound.setAverageHoldTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Outbound.AverageHoldTime"));
		outbound.setAverageTalkTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Outbound.AverageTalkTime"));
		outbound.setAverageWorkTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Outbound.AverageWorkTime"));
		outbound.setCallsAnswered(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Outbound.CallsAnswered"));
		outbound.setCallsDialed(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Outbound.CallsDialed"));
		outbound.setCallsDialedSuccess(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Outbound.CallsDialedSuccess"));
		outbound.setCallsHold(_ctx.integerValue("GetHistoricalInstanceReportResponse.Data.Outbound.CallsHold"));
		outbound.setMaxDialingTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Outbound.MaxDialingTime"));
		outbound.setMaxHoldTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Outbound.MaxHoldTime"));
		outbound.setMaxTalkTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Outbound.MaxTalkTime"));
		outbound.setMaxWorkTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Outbound.MaxWorkTime"));
		outbound.setSatisfactionIndex(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Outbound.SatisfactionIndex"));
		outbound.setSatisfactionSurveysOffered(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Outbound.SatisfactionSurveysOffered"));
		outbound.setSatisfactionSurveysResponded(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Outbound.SatisfactionSurveysResponded"));
		outbound.setTotalDialingTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Outbound.TotalDialingTime"));
		outbound.setTotalHoldTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Outbound.TotalHoldTime"));
		outbound.setTotalTalkTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Outbound.TotalTalkTime"));
		outbound.setTotalWorkTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Outbound.TotalWorkTime"));
		data.setOutbound(outbound);

		Overall overall = new Overall();
		overall.setAverageBreakTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Overall.AverageBreakTime"));
		overall.setAverageHoldTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Overall.AverageHoldTime"));
		overall.setAverageReadyTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Overall.AverageReadyTime"));
		overall.setAverageTalkTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Overall.AverageTalkTime"));
		overall.setAverageWorkTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Overall.AverageWorkTime"));
		overall.setMaxBreakTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Overall.MaxBreakTime"));
		overall.setMaxHoldTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Overall.MaxHoldTime"));
		overall.setMaxReadyTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Overall.MaxReadyTime"));
		overall.setMaxTalkTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Overall.MaxTalkTime"));
		overall.setMaxWorkTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Overall.MaxWorkTime"));
		overall.setOccupancyRate(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Overall.OccupancyRate"));
		overall.setSatisfactionIndex(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Overall.SatisfactionIndex"));
		overall.setSatisfactionSurveysOffered(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Overall.SatisfactionSurveysOffered"));
		overall.setSatisfactionSurveysResponded(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Overall.SatisfactionSurveysResponded"));
		overall.setTotalBreakTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Overall.TotalBreakTime"));
		overall.setTotalCalls(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Overall.TotalCalls"));
		overall.setTotalHoldTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Overall.TotalHoldTime"));
		overall.setTotalLoggedInTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Overall.TotalLoggedInTime"));
		overall.setTotalReadyTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Overall.TotalReadyTime"));
		overall.setTotalTalkTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Overall.TotalTalkTime"));
		overall.setTotalWorkTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Overall.TotalWorkTime"));
		data.setOverall(overall);
		getHistoricalInstanceReportResponse.setData(data);
	 
	 	return getHistoricalInstanceReportResponse;
	}
}