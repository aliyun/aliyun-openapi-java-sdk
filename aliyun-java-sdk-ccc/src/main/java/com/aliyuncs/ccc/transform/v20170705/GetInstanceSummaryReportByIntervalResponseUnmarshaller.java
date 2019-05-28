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

	public static GetInstanceSummaryReportByIntervalResponse unmarshall(GetInstanceSummaryReportByIntervalResponse getInstanceSummaryReportByIntervalResponse, UnmarshallerContext context) {
		
		getInstanceSummaryReportByIntervalResponse.setRequestId(context.stringValue("GetInstanceSummaryReportByIntervalResponse.RequestId"));
		getInstanceSummaryReportByIntervalResponse.setSuccess(context.booleanValue("GetInstanceSummaryReportByIntervalResponse.Success"));
		getInstanceSummaryReportByIntervalResponse.setCode(context.stringValue("GetInstanceSummaryReportByIntervalResponse.Code"));
		getInstanceSummaryReportByIntervalResponse.setMessage(context.stringValue("GetInstanceSummaryReportByIntervalResponse.Message"));
		getInstanceSummaryReportByIntervalResponse.setHttpStatusCode(context.integerValue("GetInstanceSummaryReportByIntervalResponse.HttpStatusCode"));

		InstanceTimeIntervalReport instanceTimeIntervalReport = new InstanceTimeIntervalReport();
		instanceTimeIntervalReport.setInstanceId(context.stringValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.InstanceId"));

		List<InstanceSummaryReport> intervalList = new ArrayList<InstanceSummaryReport>();
		for (int i = 0; i < context.lengthValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList.Length"); i++) {
			InstanceSummaryReport instanceSummaryReport = new InstanceSummaryReport();
			instanceSummaryReport.setTimestamp(context.stringValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Timestamp"));
			instanceSummaryReport.setInstanceId(context.stringValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].InstanceId"));

			Overall overall = new Overall();
			overall.setTotalCalls(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.TotalCalls"));
			overall.setTotalLoggedInTime(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.TotalLoggedInTime"));
			overall.setTotalBreakTime(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.TotalBreakTime"));
			overall.setOccupancyRate(context.floatValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.OccupancyRate"));
			overall.setTotalReadyTime(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.TotalReadyTime"));
			overall.setMaxReadyTime(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.MaxReadyTime"));
			overall.setAverageReadyTime(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.AverageReadyTime"));
			overall.setTotalTalkTime(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.TotalTalkTime"));
			overall.setMaxTalkTime(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.MaxTalkTime"));
			overall.setAverageTalkTime(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.AverageTalkTime"));
			overall.setTotalWorkTime(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.TotalWorkTime"));
			overall.setMaxWorkTime(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.MaxWorkTime"));
			overall.setAverageWorkTime(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.AverageWorkTime"));
			overall.setSatisfactionIndex(context.floatValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.SatisfactionIndex"));
			overall.setSatisfactionSurveysOffered(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.SatisfactionSurveysOffered"));
			overall.setSatisfactionSurveysResponded(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Overall.SatisfactionSurveysResponded"));
			instanceSummaryReport.setOverall(overall);

			Inbound inbound = new Inbound();
			inbound.setCallsIncomingLine(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.CallsIncomingLine"));
			inbound.setCallsIncomingIVR(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.CallsIncomingIVR"));
			inbound.setCallsAbandonedInIVR(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.CallsAbandonedInIVR"));
			inbound.setCallsIncomingQueue(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.CallsIncomingQueue"));
			inbound.setCallsAbandonedInQueue(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.CallsAbandonedInQueue"));
			inbound.setCallsOffered(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.CallsOffered"));
			inbound.setCallsHandled(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.CallsHandled"));
			inbound.setHandleRate(context.floatValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.HandleRate"));
			inbound.setTotalRingTime(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.TotalRingTime"));
			inbound.setMaxRingTime(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.MaxRingTime"));
			inbound.setAverageRingTime(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.AverageRingTime"));
			inbound.setServiceLevel20(context.floatValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.ServiceLevel20"));
			inbound.setTotalTalkTime(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.TotalTalkTime"));
			inbound.setMaxTalkTime(context.stringValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.MaxTalkTime"));
			inbound.setAverageTalkTime(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.AverageTalkTime"));
			inbound.setTotalWorkTime(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.TotalWorkTime"));
			inbound.setMaxWorkTime(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.MaxWorkTime"));
			inbound.setAverageWorkTime(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.AverageWorkTime"));
			inbound.setSatisfactionIndex(context.floatValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.SatisfactionIndex"));
			inbound.setSatisfactionSurveysOffered(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.SatisfactionSurveysOffered"));
			inbound.setSatisfactionSurveysResponded(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Inbound.SatisfactionSurveysResponded"));
			instanceSummaryReport.setInbound(inbound);

			Outbound outbound = new Outbound();
			outbound.setCallsDialed(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.CallsDialed"));
			outbound.setCallsAnswered(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.CallsAnswered"));
			outbound.setAnswerRate(context.floatValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.AnswerRate"));
			outbound.setTotalDialingTime(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.TotalDialingTime"));
			outbound.setMaxDialingTime(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.MaxDialingTime"));
			outbound.setAverageDialingTime(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.AverageDialingTime"));
			outbound.setTotalTalkTime(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.TotalTalkTime"));
			outbound.setMaxTalkTime(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.MaxTalkTime"));
			outbound.setAverageTalkTime(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.AverageTalkTime"));
			outbound.setTotalWorkTime(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.TotalWorkTime"));
			outbound.setMaxWorkTime(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.MaxWorkTime"));
			outbound.setAverageWorkTime(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.AverageWorkTime"));
			outbound.setSatisfactionIndex(context.floatValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.SatisfactionIndex"));
			outbound.setSatisfactionSurveysOffered(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.SatisfactionSurveysOffered"));
			outbound.setSatisfactionSurveysResponded(context.longValue("GetInstanceSummaryReportByIntervalResponse.InstanceTimeIntervalReport.IntervalList["+ i +"].Outbound.SatisfactionSurveysResponded"));
			instanceSummaryReport.setOutbound(outbound);

			intervalList.add(instanceSummaryReport);
		}
		instanceTimeIntervalReport.setIntervalList(intervalList);
		getInstanceSummaryReportByIntervalResponse.setInstanceTimeIntervalReport(instanceTimeIntervalReport);
	 
	 	return getInstanceSummaryReportByIntervalResponse;
	}
}