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

package com.aliyuncs.ccc.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.GetInstanceSummaryReportByIntervalResponse;
import com.aliyuncs.ccc.model.v20170705.GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport;
import com.aliyuncs.ccc.model.v20170705.GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.InstanceSummaryReport;
import com.aliyuncs.ccc.model.v20170705.GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.InstanceSummaryReport.Inbound;
import com.aliyuncs.ccc.model.v20170705.GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.InstanceSummaryReport.Outbound;
import com.aliyuncs.ccc.model.v20170705.GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.InstanceSummaryReport.Overall;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceSummaryReportByIntervalResponseUnmarshaller {

	public static GetInstanceSummaryReportByIntervalResponse unmarshall(GetInstanceSummaryReportByIntervalResponse getInstanceSummaryReportByIntervalResponse, UnmarshallerContext _ctx) {
		
		getInstanceSummaryReportByIntervalResponse.setRequestId(_ctx.stringValue("GetInstanceSummaryReportByIntervalResponse.RequestId"));
		getInstanceSummaryReportByIntervalResponse.setHttpStatusCode(_ctx.integerValue("GetInstanceSummaryReportByIntervalResponse.HttpStatusCode"));
		getInstanceSummaryReportByIntervalResponse.setCode(_ctx.stringValue("GetInstanceSummaryReportByIntervalResponse.Code"));
		getInstanceSummaryReportByIntervalResponse.setMessage(_ctx.stringValue("GetInstanceSummaryReportByIntervalResponse.Message"));
		getInstanceSummaryReportByIntervalResponse.setSuccess(_ctx.booleanValue("GetInstanceSummaryReportByIntervalResponse.Success"));

		InstanceTimeIntervalReport instanceTimeIntervalReport = new InstanceTimeIntervalReport();
		instanceTimeIntervalReport.setInstanceId(_ctx.stringValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.InstanceId"));

		List<InstanceSummaryReport> intervalList = new ArrayList<InstanceSummaryReport>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList.Length"); i++) {
			InstanceSummaryReport instanceSummaryReport = new InstanceSummaryReport();
			instanceSummaryReport.setInstanceId(_ctx.stringValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].InstanceId"));
			instanceSummaryReport.setTimestamp(_ctx.stringValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Timestamp"));

			Overall overall = new Overall();
			overall.setTotalLoggedInTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.TotalLoggedInTime"));
			overall.setTotalTalkTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.TotalTalkTime"));
			overall.setOccupancyRate(_ctx.floatValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.OccupancyRate"));
			overall.setTotalWorkTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.TotalWorkTime"));
			overall.setMaxWorkTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.MaxWorkTime"));
			overall.setAverageWorkTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.AverageWorkTime"));
			overall.setAverageTalkTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.AverageTalkTime"));
			overall.setSatisfactionIndex(_ctx.floatValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.SatisfactionIndex"));
			overall.setSatisfactionSurveysOffered(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.SatisfactionSurveysOffered"));
			overall.setSatisfactionSurveysResponded(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.SatisfactionSurveysResponded"));
			overall.setMaxReadyTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.MaxReadyTime"));
			overall.setAverageReadyTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.AverageReadyTime"));
			overall.setTotalBreakTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.TotalBreakTime"));
			overall.setTotalReadyTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.TotalReadyTime"));
			overall.setMaxTalkTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.MaxTalkTime"));
			overall.setTotalCalls(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.TotalCalls"));
			instanceSummaryReport.setOverall(overall);

			Inbound inbound = new Inbound();
			inbound.setCallsIncomingLine(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.CallsIncomingLine"));
			inbound.setAverageRingTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.AverageRingTime"));
			inbound.setCallsHandled(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.CallsHandled"));
			inbound.setTotalWorkTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.TotalWorkTime"));
			inbound.setCallsAbandonedInIVR(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.CallsAbandonedInIVR"));
			inbound.setMaxWorkTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.MaxWorkTime"));
			inbound.setAverageWaitTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.AverageWaitTime"));
			inbound.setCallsIncomingQueue(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.CallsIncomingQueue"));
			inbound.setAverageWorkTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.AverageWorkTime"));
			inbound.setSatisfactionIndex(_ctx.floatValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.SatisfactionIndex"));
			inbound.setTotalWaitTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.TotalWaitTime"));
			inbound.setTotalRingTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.TotalRingTime"));
			inbound.setMaxTalkTime(_ctx.stringValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.MaxTalkTime"));
			inbound.setMaxRingTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.MaxRingTime"));
			inbound.setCallsIncomingIVR(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.CallsIncomingIVR"));
			inbound.setTotalTalkTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.TotalTalkTime"));
			inbound.setCallsOffered(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.CallsOffered"));
			inbound.setMaxWaitTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.MaxWaitTime"));
			inbound.setServiceLevel20(_ctx.floatValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.ServiceLevel20"));
			inbound.setAverageTalkTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.AverageTalkTime"));
			inbound.setSatisfactionSurveysOffered(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.SatisfactionSurveysOffered"));
			inbound.setHandleRate(_ctx.floatValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.HandleRate"));
			inbound.setSatisfactionSurveysResponded(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.SatisfactionSurveysResponded"));
			inbound.setCallsAbandonedInQueue(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.CallsAbandonedInQueue"));
			instanceSummaryReport.setInbound(inbound);

			Outbound outbound = new Outbound();
			outbound.setTotalTalkTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.TotalTalkTime"));
			outbound.setMaxDialingTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.MaxDialingTime"));
			outbound.setCallsDialed(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.CallsDialed"));
			outbound.setCallsAnswered(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.CallsAnswered"));
			outbound.setAnswerRate(_ctx.floatValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.AnswerRate"));
			outbound.setTotalWorkTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.TotalWorkTime"));
			outbound.setMaxWorkTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.MaxWorkTime"));
			outbound.setTotalDialingTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.TotalDialingTime"));
			outbound.setAverageTalkTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.AverageTalkTime"));
			outbound.setAverageWorkTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.AverageWorkTime"));
			outbound.setSatisfactionIndex(_ctx.floatValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.SatisfactionIndex"));
			outbound.setSatisfactionSurveysOffered(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.SatisfactionSurveysOffered"));
			outbound.setSatisfactionSurveysResponded(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.SatisfactionSurveysResponded"));
			outbound.setMaxTalkTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.MaxTalkTime"));
			outbound.setAverageDialingTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.AverageDialingTime"));
			instanceSummaryReport.setOutbound(outbound);

			intervalList.add(instanceSummaryReport);
		}
		instanceTimeIntervalReport.setIntervalList(intervalList);
		getInstanceSummaryReportByIntervalResponse.setInstanceTimeIntervalReport(instanceTimeIntervalReport);
	 
	 	return getInstanceSummaryReportByIntervalResponse;
	}
}