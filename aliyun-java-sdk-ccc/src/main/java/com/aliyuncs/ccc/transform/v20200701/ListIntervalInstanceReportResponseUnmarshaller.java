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
			inbound.setAverageRingTime(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.AverageRingTime"));
			inbound.setCallsVoicemail(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.CallsVoicemail"));
			inbound.setMaxAbandonedInIVRTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.MaxAbandonedInIVRTime"));
			inbound.setCallsHandled(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.CallsHandled"));
			inbound.setCallsIVRException(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.CallsIVRException"));
			inbound.setCallsAbandonedInIVR(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.CallsAbandonedInIVR"));
			inbound.setMaxWorkTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.MaxWorkTime"));
			inbound.setTotalHoldTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.TotalHoldTime"));
			inbound.setMaxAbandonTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.MaxAbandonTime"));
			inbound.setAverageAbandonTime(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.AverageAbandonTime"));
			inbound.setAbandonedRate(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.AbandonedRate"));
			inbound.setCallsRinged(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.CallsRinged"));
			inbound.setCallsQueuingFailed(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.CallsQueuingFailed"));
			inbound.setTotalRingTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.TotalRingTime"));
			inbound.setTotalTalkTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.TotalTalkTime"));
			inbound.setMaxAbandonedInRingTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.MaxAbandonedInRingTime"));
			inbound.setCallsBlindTransferred(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.CallsBlindTransferred"));
			inbound.setAverageAbandonedInIVRTime(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.AverageAbandonedInIVRTime"));
			inbound.setAverageAbandonedInQueueTime(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.AverageAbandonedInQueueTime"));
			inbound.setMaxWaitTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.MaxWaitTime"));
			inbound.setAverageTalkTime(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.AverageTalkTime"));
			inbound.setCallsAttendedTransferred(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.CallsAttendedTransferred"));
			inbound.setTotalAbandonedInIVRTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.TotalAbandonedInIVRTime"));
			inbound.setCallsQueuingOverflow(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.CallsQueuingOverflow"));
			inbound.setCallsAbandonedInRing(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.CallsAbandonedInRing"));
			inbound.setTotalAbandonedInRingTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.TotalAbandonedInRingTime"));
			inbound.setTotalWorkTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.TotalWorkTime"));
			inbound.setAverageWaitTime(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.AverageWaitTime"));
			inbound.setAverageWorkTime(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.AverageWorkTime"));
			inbound.setCallsQueued(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.CallsQueued"));
			inbound.setAverageAbandonedInRingTime(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.AverageAbandonedInRingTime"));
			inbound.setSatisfactionIndex(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.SatisfactionIndex"));
			inbound.setCallsAbandoned(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.CallsAbandoned"));
			inbound.setMaxAbandonedInQueueTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.MaxAbandonedInQueueTime"));
			inbound.setCallsAbandonedInVoiceNavigator(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.CallsAbandonedInVoiceNavigator"));
			inbound.setTotalWaitTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.TotalWaitTime"));
			inbound.setMaxTalkTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.MaxTalkTime"));
			inbound.setMaxRingTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.MaxRingTime"));
			inbound.setTotalAbandonTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.TotalAbandonTime"));
			inbound.setCallsOffered(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.CallsOffered"));
			inbound.setCallsQueuingTimeout(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.CallsQueuingTimeout"));
			inbound.setServiceLevel20(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.ServiceLevel20"));
			inbound.setMaxHoldTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.MaxHoldTime"));
			inbound.setCallsForwardToOutsideNumber(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.CallsForwardToOutsideNumber"));
			inbound.setSatisfactionRate(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.SatisfactionRate"));
			inbound.setCallsHold(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.CallsHold"));
			inbound.setSatisfactionSurveysOffered(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.SatisfactionSurveysOffered"));
			inbound.setHandleRate(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.HandleRate"));
			inbound.setSatisfactionSurveysResponded(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.SatisfactionSurveysResponded"));
			inbound.setAverageHoldTime(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.AverageHoldTime"));
			inbound.setCallsAbandonedInQueue(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.CallsAbandonedInQueue"));
			inbound.setTotalAbandonedInQueueTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Inbound.TotalAbandonedInQueueTime"));
			dataItem.setInbound(inbound);

			Outbound outbound = new Outbound();
			outbound.setAverageRingTime(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.AverageRingTime"));
			outbound.setCallsDialed(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.CallsDialed"));
			outbound.setCallsAnswered(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.CallsAnswered"));
			outbound.setTotalWorkTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.TotalWorkTime"));
			outbound.setMaxWorkTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.MaxWorkTime"));
			outbound.setTotalDialingTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.TotalDialingTime"));
			outbound.setTotalHoldTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.TotalHoldTime"));
			outbound.setAverageWorkTime(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.AverageWorkTime"));
			outbound.setSatisfactionIndex(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.SatisfactionIndex"));
			outbound.setCallsRinged(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.CallsRinged"));
			outbound.setTotalRingTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.TotalRingTime"));
			outbound.setMaxTalkTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.MaxTalkTime"));
			outbound.setMaxRingTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.MaxRingTime"));
			outbound.setTotalTalkTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.TotalTalkTime"));
			outbound.setMaxDialingTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.MaxDialingTime"));
			outbound.setCallsBlindTransferred(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.CallsBlindTransferred"));
			outbound.setAnswerRate(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.AnswerRate"));
			outbound.setMaxHoldTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.MaxHoldTime"));
			outbound.setAverageTalkTime(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.AverageTalkTime"));
			outbound.setSatisfactionRate(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.SatisfactionRate"));
			outbound.setCallsAttendedTransferred(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.CallsAttendedTransferred"));
			outbound.setCallsHold(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.CallsHold"));
			outbound.setSatisfactionSurveysOffered(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.SatisfactionSurveysOffered"));
			outbound.setSatisfactionSurveysResponded(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.SatisfactionSurveysResponded"));
			outbound.setAverageHoldTime(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.AverageHoldTime"));
			outbound.setAverageDialingTime(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Outbound.AverageDialingTime"));
			dataItem.setOutbound(outbound);

			Overall overall = new Overall();
			overall.setTotalTalkTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.TotalTalkTime"));
			overall.setTotalLoggedInTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.TotalLoggedInTime"));
			overall.setOccupancyRate(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.OccupancyRate"));
			overall.setTotalWorkTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.TotalWorkTime"));
			overall.setMaxHoldTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.MaxHoldTime"));
			overall.setMaxWorkTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.MaxWorkTime"));
			overall.setAverageBreakTime(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.AverageBreakTime"));
			overall.setTotalHoldTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.TotalHoldTime"));
			overall.setSatisfactionRate(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.SatisfactionRate"));
			overall.setMaxBreakTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.MaxBreakTime"));
			overall.setAverageWorkTime(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.AverageWorkTime"));
			overall.setAverageTalkTime(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.AverageTalkTime"));
			overall.setSatisfactionIndex(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.SatisfactionIndex"));
			overall.setSatisfactionSurveysOffered(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.SatisfactionSurveysOffered"));
			overall.setSatisfactionSurveysResponded(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.SatisfactionSurveysResponded"));
			overall.setMaxReadyTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.MaxReadyTime"));
			overall.setAverageReadyTime(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.AverageReadyTime"));
			overall.setAverageHoldTime(_ctx.floatValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.AverageHoldTime"));
			overall.setTotalReadyTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.TotalReadyTime"));
			overall.setTotalBreakTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.TotalBreakTime"));
			overall.setMaxTalkTime(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.MaxTalkTime"));
			overall.setTotalCalls(_ctx.longValue("ListIntervalInstanceReportResponse.Data["+ i +"].Overall.TotalCalls"));
			dataItem.setOverall(overall);

			data.add(dataItem);
		}
		listIntervalInstanceReportResponse.setData(data);
	 
	 	return listIntervalInstanceReportResponse;
	}
}