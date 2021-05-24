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

import com.aliyuncs.ccc.model.v20200701.ListIntervalSkillGroupReportResponse;
import com.aliyuncs.ccc.model.v20200701.ListIntervalSkillGroupReportResponse.DataItem;
import com.aliyuncs.ccc.model.v20200701.ListIntervalSkillGroupReportResponse.DataItem.Inbound;
import com.aliyuncs.ccc.model.v20200701.ListIntervalSkillGroupReportResponse.DataItem.Outbound;
import com.aliyuncs.ccc.model.v20200701.ListIntervalSkillGroupReportResponse.DataItem.Overall;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIntervalSkillGroupReportResponseUnmarshaller {

	public static ListIntervalSkillGroupReportResponse unmarshall(ListIntervalSkillGroupReportResponse listIntervalSkillGroupReportResponse, UnmarshallerContext _ctx) {
		
		listIntervalSkillGroupReportResponse.setRequestId(_ctx.stringValue("ListIntervalSkillGroupReportResponse.RequestId"));
		listIntervalSkillGroupReportResponse.setCode(_ctx.stringValue("ListIntervalSkillGroupReportResponse.Code"));
		listIntervalSkillGroupReportResponse.setHttpStatusCode(_ctx.integerValue("ListIntervalSkillGroupReportResponse.HttpStatusCode"));
		listIntervalSkillGroupReportResponse.setMessage(_ctx.stringValue("ListIntervalSkillGroupReportResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListIntervalSkillGroupReportResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setStatsTime(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].StatsTime"));

			Inbound inbound = new Inbound();
			inbound.setAbandonRate(_ctx.floatValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.AbandonRate"));
			inbound.setAverageAbandonTime(_ctx.floatValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.AverageAbandonTime"));
			inbound.setAverageAbandonedInQueueTime(_ctx.floatValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.AverageAbandonedInQueueTime"));
			inbound.setAverageAbandonedInRingTime(_ctx.floatValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.AverageAbandonedInRingTime"));
			inbound.setAverageRingTime(_ctx.floatValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.AverageRingTime"));
			inbound.setAverageTalkTime(_ctx.floatValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.AverageTalkTime"));
			inbound.setAverageWaitTime(_ctx.floatValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.AverageWaitTime"));
			inbound.setAverageWorkTime(_ctx.floatValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.AverageWorkTime"));
			inbound.setCallsAbandoned(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.CallsAbandoned"));
			inbound.setCallsAbandonedInQueue(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.CallsAbandonedInQueue"));
			inbound.setCallsAbandonedInRinging(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.CallsAbandonedInRinging"));
			inbound.setCallsConsulted(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.CallsConsulted"));
			inbound.setCallsHandled(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.CallsHandled"));
			inbound.setCallsHold(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.CallsHold"));
			inbound.setCallsOffered(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.CallsOffered"));
			inbound.setCallsQueued(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.CallsQueued"));
			inbound.setCallsRinged(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.CallsRinged"));
			inbound.setCallsTransferred(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.CallsTransferred"));
			inbound.setHandleRate(_ctx.floatValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.HandleRate"));
			inbound.setMaxAbandonTime(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.MaxAbandonTime"));
			inbound.setMaxAbandonedInQueueTime(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.MaxAbandonedInQueueTime"));
			inbound.setMaxAbandonedInRingTime(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.MaxAbandonedInRingTime"));
			inbound.setMaxRingTime(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.MaxRingTime"));
			inbound.setMaxTalkTime(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.MaxTalkTime"));
			inbound.setMaxWaitTime(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.MaxWaitTime"));
			inbound.setMaxWorkTime(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.MaxWorkTime"));
			inbound.setSatisfactionIndex(_ctx.floatValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.SatisfactionIndex"));
			inbound.setSatisfactionSurveysOffered(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.SatisfactionSurveysOffered"));
			inbound.setSatisfactionSurveysResponded(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.SatisfactionSurveysResponded"));
			inbound.setServiceLevel20(_ctx.floatValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.ServiceLevel20"));
			inbound.setTotalAbandonTime(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.TotalAbandonTime"));
			inbound.setTotalAbandonedInQueueTime(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.TotalAbandonedInQueueTime"));
			inbound.setTotalAbandonedInRingTime(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.TotalAbandonedInRingTime"));
			inbound.setTotalHoldTime(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.TotalHoldTime"));
			inbound.setTotalRingTime(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.TotalRingTime"));
			inbound.setTotalTalkTime(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.TotalTalkTime"));
			inbound.setTotalWaitTime(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.TotalWaitTime"));
			inbound.setTotalWorkTime(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Inbound.TotalWorkTime"));
			dataItem.setInbound(inbound);

			Outbound outbound = new Outbound();
			outbound.setAnswerRate(_ctx.floatValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Outbound.AnswerRate"));
			outbound.setAverageDialingTime(_ctx.floatValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Outbound.AverageDialingTime"));
			outbound.setAverageTalkTime(_ctx.floatValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Outbound.AverageTalkTime"));
			outbound.setAverageWorkTime(_ctx.floatValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Outbound.AverageWorkTime"));
			outbound.setCallsAnswered(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Outbound.CallsAnswered"));
			outbound.setCallsDialed(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Outbound.CallsDialed"));
			outbound.setMaxDialingTime(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Outbound.MaxDialingTime"));
			outbound.setMaxTalkTime(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Outbound.MaxTalkTime"));
			outbound.setMaxWorkTime(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Outbound.MaxWorkTime"));
			outbound.setSatisfactionIndex(_ctx.floatValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Outbound.SatisfactionIndex"));
			outbound.setSatisfactionSurveysOffered(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Outbound.SatisfactionSurveysOffered"));
			outbound.setSatisfactionSurveysResponded(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Outbound.SatisfactionSurveysResponded"));
			outbound.setTotalDialingTime(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Outbound.TotalDialingTime"));
			outbound.setTotalHoldTime(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Outbound.TotalHoldTime"));
			outbound.setTotalTalkTime(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Outbound.TotalTalkTime"));
			outbound.setTotalWorkTime(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Outbound.TotalWorkTime"));
			dataItem.setOutbound(outbound);

			Overall overall = new Overall();
			overall.setAverageBreakTime(_ctx.floatValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Overall.AverageBreakTime"));
			overall.setAverageReadyTime(_ctx.floatValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Overall.AverageReadyTime"));
			overall.setAverageTalkTime(_ctx.floatValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Overall.AverageTalkTime"));
			overall.setAverageWorkTime(_ctx.floatValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Overall.AverageWorkTime"));
			overall.setMaxBreakTime(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Overall.MaxBreakTime"));
			overall.setMaxReadyTime(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Overall.MaxReadyTime"));
			overall.setMaxTalkTime(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Overall.MaxTalkTime"));
			overall.setMaxWorkTime(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Overall.MaxWorkTime"));
			overall.setOccupancyRate(_ctx.floatValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Overall.OccupancyRate"));
			overall.setSatisfactionIndex(_ctx.floatValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Overall.SatisfactionIndex"));
			overall.setSatisfactionSurveysOffered(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Overall.SatisfactionSurveysOffered"));
			overall.setSatisfactionSurveysResponded(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Overall.SatisfactionSurveysResponded"));
			overall.setTotalBreakTime(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Overall.TotalBreakTime"));
			overall.setTotalCalls(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Overall.TotalCalls"));
			overall.setTotalHoldTime(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Overall.TotalHoldTime"));
			overall.setTotalLoggedInTime(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Overall.TotalLoggedInTime"));
			overall.setTotalReadyTime(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Overall.TotalReadyTime"));
			overall.setTotalTalkTime(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Overall.TotalTalkTime"));
			overall.setTotalWorkTime(_ctx.longValue("ListIntervalSkillGroupReportResponse.Data["+ i +"].Overall.TotalWorkTime"));
			dataItem.setOverall(overall);

			data.add(dataItem);
		}
		listIntervalSkillGroupReportResponse.setData(data);
	 
	 	return listIntervalSkillGroupReportResponse;
	}
}