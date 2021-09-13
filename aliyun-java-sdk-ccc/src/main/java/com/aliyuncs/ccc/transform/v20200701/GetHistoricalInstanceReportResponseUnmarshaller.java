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
		inbound.setAverageRingTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Inbound.AverageRingTime"));
		inbound.setCallsVoicemail(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.CallsVoicemail"));
		inbound.setMaxAbandonedInIVRTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.MaxAbandonedInIVRTime"));
		inbound.setCallsHandled(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.CallsHandled"));
		inbound.setCallsIVRException(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.CallsIVRException"));
		inbound.setCallsAbandonedInIVR(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.CallsAbandonedInIVR"));
		inbound.setMaxWorkTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.MaxWorkTime"));
		inbound.setTotalHoldTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.TotalHoldTime"));
		inbound.setMaxAbandonTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.MaxAbandonTime"));
		inbound.setAverageAbandonTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Inbound.AverageAbandonTime"));
		inbound.setCallsRinged(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.CallsRinged"));
		inbound.setCallsQueuingFailed(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.CallsQueuingFailed"));
		inbound.setTotalRingTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.TotalRingTime"));
		inbound.setAbandonRate(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Inbound.AbandonRate"));
		inbound.setTotalTalkTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.TotalTalkTime"));
		inbound.setMaxAbandonedInRingTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.MaxAbandonedInRingTime"));
		inbound.setCallsBlindTransferred(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.CallsBlindTransferred"));
		inbound.setAverageAbandonedInIVRTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Inbound.AverageAbandonedInIVRTime"));
		inbound.setAverageAbandonedInQueueTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Inbound.AverageAbandonedInQueueTime"));
		inbound.setMaxWaitTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.MaxWaitTime"));
		inbound.setAverageTalkTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Inbound.AverageTalkTime"));
		inbound.setCallsAttendedTransferred(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.CallsAttendedTransferred"));
		inbound.setTotalAbandonedInIVRTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.TotalAbandonedInIVRTime"));
		inbound.setCallsQueuingOverflow(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.CallsQueuingOverflow"));
		inbound.setCallsAbandonedInRing(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.CallsAbandonedInRing"));
		inbound.setTotalAbandonedInRingTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.TotalAbandonedInRingTime"));
		inbound.setTotalWorkTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.TotalWorkTime"));
		inbound.setAverageWaitTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Inbound.AverageWaitTime"));
		inbound.setAverageWorkTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Inbound.AverageWorkTime"));
		inbound.setCallsQueued(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.CallsQueued"));
		inbound.setAverageAbandonedInRingTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Inbound.AverageAbandonedInRingTime"));
		inbound.setSatisfactionIndex(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Inbound.SatisfactionIndex"));
		inbound.setCallsAbandoned(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.CallsAbandoned"));
		inbound.setMaxAbandonedInQueueTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.MaxAbandonedInQueueTime"));
		inbound.setCallsAbandonedInVoiceNavigator(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.CallsAbandonedInVoiceNavigator"));
		inbound.setTotalWaitTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.TotalWaitTime"));
		inbound.setMaxTalkTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.MaxTalkTime"));
		inbound.setMaxRingTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.MaxRingTime"));
		inbound.setTotalAbandonTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.TotalAbandonTime"));
		inbound.setCallsOffered(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.CallsOffered"));
		inbound.setCallsQueuingTimeout(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.CallsQueuingTimeout"));
		inbound.setServiceLevel20(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Inbound.ServiceLevel20"));
		inbound.setMaxHoldTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.MaxHoldTime"));
		inbound.setCallsForwardToOutsideNumber(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.CallsForwardToOutsideNumber"));
		inbound.setSatisfactionRate(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Inbound.SatisfactionRate"));
		inbound.setCallsHold(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.CallsHold"));
		inbound.setSatisfactionSurveysOffered(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.SatisfactionSurveysOffered"));
		inbound.setHandleRate(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Inbound.HandleRate"));
		inbound.setSatisfactionSurveysResponded(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.SatisfactionSurveysResponded"));
		inbound.setAverageHoldTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Inbound.AverageHoldTime"));
		inbound.setCallsAbandonedInQueue(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.CallsAbandonedInQueue"));
		inbound.setTotalAbandonedInQueueTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Inbound.TotalAbandonedInQueueTime"));
		data.setInbound(inbound);

		Outbound outbound = new Outbound();
		outbound.setAverageRingTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Outbound.AverageRingTime"));
		outbound.setCallsDialed(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Outbound.CallsDialed"));
		outbound.setCallsAnswered(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Outbound.CallsAnswered"));
		outbound.setTotalWorkTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Outbound.TotalWorkTime"));
		outbound.setMaxWorkTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Outbound.MaxWorkTime"));
		outbound.setTotalDialingTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Outbound.TotalDialingTime"));
		outbound.setTotalHoldTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Outbound.TotalHoldTime"));
		outbound.setAverageWorkTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Outbound.AverageWorkTime"));
		outbound.setSatisfactionIndex(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Outbound.SatisfactionIndex"));
		outbound.setCallsRinged(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Outbound.CallsRinged"));
		outbound.setTotalRingTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Outbound.TotalRingTime"));
		outbound.setMaxTalkTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Outbound.MaxTalkTime"));
		outbound.setMaxRingTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Outbound.MaxRingTime"));
		outbound.setTotalTalkTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Outbound.TotalTalkTime"));
		outbound.setMaxDialingTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Outbound.MaxDialingTime"));
		outbound.setCallsBlindTransferred(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Outbound.CallsBlindTransferred"));
		outbound.setAnswerRate(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Outbound.AnswerRate"));
		outbound.setMaxHoldTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Outbound.MaxHoldTime"));
		outbound.setAverageTalkTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Outbound.AverageTalkTime"));
		outbound.setSatisfactionRate(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Outbound.SatisfactionRate"));
		outbound.setCallsAttendedTransferred(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Outbound.CallsAttendedTransferred"));
		outbound.setCallsHold(_ctx.integerValue("GetHistoricalInstanceReportResponse.Data.Outbound.CallsHold"));
		outbound.setSatisfactionSurveysOffered(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Outbound.SatisfactionSurveysOffered"));
		outbound.setSatisfactionSurveysResponded(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Outbound.SatisfactionSurveysResponded"));
		outbound.setAverageHoldTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Outbound.AverageHoldTime"));
		outbound.setAverageDialingTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Outbound.AverageDialingTime"));
		data.setOutbound(outbound);

		Overall overall = new Overall();
		overall.setTotalTalkTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Overall.TotalTalkTime"));
		overall.setTotalLoggedInTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Overall.TotalLoggedInTime"));
		overall.setOccupancyRate(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Overall.OccupancyRate"));
		overall.setTotalWorkTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Overall.TotalWorkTime"));
		overall.setMaxHoldTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Overall.MaxHoldTime"));
		overall.setMaxWorkTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Overall.MaxWorkTime"));
		overall.setAverageBreakTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Overall.AverageBreakTime"));
		overall.setTotalHoldTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Overall.TotalHoldTime"));
		overall.setSatisfactionRate(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Overall.SatisfactionRate"));
		overall.setMaxBreakTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Overall.MaxBreakTime"));
		overall.setAverageWorkTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Overall.AverageWorkTime"));
		overall.setAverageTalkTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Overall.AverageTalkTime"));
		overall.setSatisfactionIndex(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Overall.SatisfactionIndex"));
		overall.setSatisfactionSurveysOffered(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Overall.SatisfactionSurveysOffered"));
		overall.setSatisfactionSurveysResponded(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Overall.SatisfactionSurveysResponded"));
		overall.setMaxReadyTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Overall.MaxReadyTime"));
		overall.setAverageReadyTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Overall.AverageReadyTime"));
		overall.setAverageHoldTime(_ctx.floatValue("GetHistoricalInstanceReportResponse.Data.Overall.AverageHoldTime"));
		overall.setTotalReadyTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Overall.TotalReadyTime"));
		overall.setTotalBreakTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Overall.TotalBreakTime"));
		overall.setMaxTalkTime(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Overall.MaxTalkTime"));
		overall.setTotalCalls(_ctx.longValue("GetHistoricalInstanceReportResponse.Data.Overall.TotalCalls"));
		data.setOverall(overall);
		getHistoricalInstanceReportResponse.setData(data);
	 
	 	return getHistoricalInstanceReportResponse;
	}
}