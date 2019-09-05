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
		getInstanceSummaryReportByIntervalResponse.setSuccess(_ctx.booleanValue("GetInstanceSummaryReportByIntervalResponse.Success"));
		getInstanceSummaryReportByIntervalResponse.setCode(_ctx.stringValue("GetInstanceSummaryReportByIntervalResponse.Code"));
		getInstanceSummaryReportByIntervalResponse.setMessage(_ctx.stringValue("GetInstanceSummaryReportByIntervalResponse.Message"));
		getInstanceSummaryReportByIntervalResponse.setHttpStatusCode(_ctx.integerValue("GetInstanceSummaryReportByIntervalResponse.HttpStatusCode"));

		InstanceTimeIntervalReport instanceTimeIntervalReport = new InstanceTimeIntervalReport();
		instanceTimeIntervalReport.setInstanceId(_ctx.stringValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.InstanceId"));

		List<InstanceSummaryReport> intervalList = new ArrayList<InstanceSummaryReport>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList.Length"); i++) {
			InstanceSummaryReport instanceSummaryReport = new InstanceSummaryReport();
			instanceSummaryReport.setTimestamp(_ctx.stringValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Timestamp"));
			instanceSummaryReport.setInstanceId(_ctx.stringValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].InstanceId"));

			Overall overall = new Overall();
			overall.setTotalCalls(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.TotalCalls"));
			overall.setTotalLoggedInTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.TotalLoggedInTime"));
			overall.setTotalBreakTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.TotalBreakTime"));
			overall.setOccupancyRate(_ctx.floatValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.OccupancyRate"));
			overall.setTotalReadyTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.TotalReadyTime"));
			overall.setMaxReadyTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.MaxReadyTime"));
			overall.setAverageReadyTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.AverageReadyTime"));
			overall.setTotalTalkTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.TotalTalkTime"));
			overall.setMaxTalkTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.MaxTalkTime"));
			overall.setAverageTalkTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.AverageTalkTime"));
			overall.setTotalWorkTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.TotalWorkTime"));
			overall.setMaxWorkTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.MaxWorkTime"));
			overall.setAverageWorkTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.AverageWorkTime"));
			overall.setSatisfactionIndex(_ctx.floatValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.SatisfactionIndex"));
			overall.setSatisfactionSurveysOffered(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.SatisfactionSurveysOffered"));
			overall.setSatisfactionSurveysResponded(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.SatisfactionSurveysResponded"));
			instanceSummaryReport.setOverall(overall);

			Inbound inbound = new Inbound();
			inbound.setCallsIncomingLine(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.CallsIncomingLine"));
			inbound.setCallsIncomingIVR(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.CallsIncomingIVR"));
			inbound.setCallsAbandonedInIVR(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.CallsAbandonedInIVR"));
			inbound.setCallsIncomingQueue(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.CallsIncomingQueue"));
			inbound.setCallsAbandonedInQueue(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.CallsAbandonedInQueue"));
			inbound.setCallsOffered(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.CallsOffered"));
			inbound.setCallsHandled(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.CallsHandled"));
			inbound.setHandleRate(_ctx.floatValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.HandleRate"));
			inbound.setTotalRingTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.TotalRingTime"));
			inbound.setMaxRingTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.MaxRingTime"));
			inbound.setAverageRingTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.AverageRingTime"));
			inbound.setServiceLevel20(_ctx.floatValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.ServiceLevel20"));
			inbound.setTotalTalkTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.TotalTalkTime"));
			inbound.setMaxTalkTime(_ctx.stringValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.MaxTalkTime"));
			inbound.setAverageTalkTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.AverageTalkTime"));
			inbound.setTotalWorkTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.TotalWorkTime"));
			inbound.setMaxWorkTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.MaxWorkTime"));
			inbound.setAverageWorkTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.AverageWorkTime"));
			inbound.setSatisfactionIndex(_ctx.floatValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.SatisfactionIndex"));
			inbound.setSatisfactionSurveysOffered(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.SatisfactionSurveysOffered"));
			inbound.setSatisfactionSurveysResponded(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.SatisfactionSurveysResponded"));
			instanceSummaryReport.setInbound(inbound);

			Outbound outbound = new Outbound();
			outbound.setCallsDialed(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.CallsDialed"));
			outbound.setCallsAnswered(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.CallsAnswered"));
			outbound.setAnswerRate(_ctx.floatValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.AnswerRate"));
			outbound.setTotalDialingTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.TotalDialingTime"));
			outbound.setMaxDialingTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.MaxDialingTime"));
			outbound.setAverageDialingTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.AverageDialingTime"));
			outbound.setTotalTalkTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.TotalTalkTime"));
			outbound.setMaxTalkTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.MaxTalkTime"));
			outbound.setAverageTalkTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.AverageTalkTime"));
			outbound.setTotalWorkTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.TotalWorkTime"));
			outbound.setMaxWorkTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.MaxWorkTime"));
			outbound.setAverageWorkTime(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.AverageWorkTime"));
			outbound.setSatisfactionIndex(_ctx.floatValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.SatisfactionIndex"));
			outbound.setSatisfactionSurveysOffered(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.SatisfactionSurveysOffered"));
			outbound.setSatisfactionSurveysResponded(_ctx.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.SatisfactionSurveysResponded"));
			instanceSummaryReport.setOutbound(outbound);

			intervalList.add(instanceSummaryReport);
		}
		instanceTimeIntervalReport.setIntervalList(intervalList);
		getInstanceSummaryReportByIntervalResponse.setInstanceTimeIntervalReport(instanceTimeIntervalReport);
	 
	 	return getInstanceSummaryReportByIntervalResponse;
	}
}