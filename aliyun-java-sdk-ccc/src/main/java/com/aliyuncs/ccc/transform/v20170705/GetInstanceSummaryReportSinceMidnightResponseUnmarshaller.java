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

import com.aliyuncs.ccc.model.v20170705.GetInstanceSummaryReportSinceMidnightResponse;
import com.aliyuncs.ccc.model.v20170705.GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport;
import com.aliyuncs.ccc.model.v20170705.GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound;
import com.aliyuncs.ccc.model.v20170705.GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Outbound;
import com.aliyuncs.ccc.model.v20170705.GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Overall;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceSummaryReportSinceMidnightResponseUnmarshaller {

	public static GetInstanceSummaryReportSinceMidnightResponse unmarshall(GetInstanceSummaryReportSinceMidnightResponse getInstanceSummaryReportSinceMidnightResponse, UnmarshallerContext context) {
		
		getInstanceSummaryReportSinceMidnightResponse.setRequestId(context.stringValue("GetInstanceSummaryReportSinceMidnightResponse.RequestId"));
		getInstanceSummaryReportSinceMidnightResponse.setSuccess(context.booleanValue("GetInstanceSummaryReportSinceMidnightResponse.Success"));
		getInstanceSummaryReportSinceMidnightResponse.setCode(context.stringValue("GetInstanceSummaryReportSinceMidnightResponse.Code"));
		getInstanceSummaryReportSinceMidnightResponse.setMessage(context.stringValue("GetInstanceSummaryReportSinceMidnightResponse.Message"));
		getInstanceSummaryReportSinceMidnightResponse.setHttpStatusCode(context.integerValue("GetInstanceSummaryReportSinceMidnightResponse.HttpStatusCode"));

		InstanceSummaryReport instanceSummaryReport = new InstanceSummaryReport();
		instanceSummaryReport.setTimestamp(context.stringValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Timestamp"));
		instanceSummaryReport.setInstanceId(context.stringValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.InstanceId"));

		Overall overall = new Overall();
		overall.setTotalCalls(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Overall.TotalCalls"));
		overall.setTotalLoggedInTime(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Overall.TotalLoggedInTime"));
		overall.setTotalBreakTime(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Overall.TotalBreakTime"));
		overall.setOccupancyRate(context.floatValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Overall.OccupancyRate"));
		overall.setTotalReadyTime(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Overall.TotalReadyTime"));
		overall.setMaxReadyTime(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Overall.MaxReadyTime"));
		overall.setAverageReadyTime(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Overall.AverageReadyTime"));
		overall.setTotalTalkTime(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Overall.TotalTalkTime"));
		overall.setMaxTalkTime(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Overall.MaxTalkTime"));
		overall.setAverageTalkTime(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Overall.AverageTalkTime"));
		overall.setTotalWorkTime(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Overall.TotalWorkTime"));
		overall.setMaxWorkTime(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Overall.MaxWorkTime"));
		overall.setAverageWorkTime(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Overall.AverageWorkTime"));
		overall.setSatisfactionIndex(context.floatValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Overall.SatisfactionIndex"));
		overall.setSatisfactionSurveysOffered(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Overall.SatisfactionSurveysOffered"));
		overall.setSatisfactionSurveysResponded(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Overall.SatisfactionSurveysResponded"));
		instanceSummaryReport.setOverall(overall);

		Inbound inbound = new Inbound();
		inbound.setCallsIncomingLine(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.CallsIncomingLine"));
		inbound.setCallsIncomingIVR(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.CallsIncomingIVR"));
		inbound.setCallsAbandonedInIVR(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.CallsAbandonedInIVR"));
		inbound.setCallsIncomingQueue(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.CallsIncomingQueue"));
		inbound.setCallsAbandonedInQueue(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.CallsAbandonedInQueue"));
		inbound.setCallsOffered(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.CallsOffered"));
		inbound.setCallsHandled(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.CallsHandled"));
		inbound.setHandleRate(context.floatValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.HandleRate"));
		inbound.setTotalRingTime(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.TotalRingTime"));
		inbound.setMaxRingTime(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.MaxRingTime"));
		inbound.setAverageRingTime(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.AverageRingTime"));
		inbound.setServiceLevel20(context.floatValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.ServiceLevel20"));
		inbound.setTotalTalkTime(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.TotalTalkTime"));
		inbound.setMaxTalkTime(context.stringValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.MaxTalkTime"));
		inbound.setAverageTalkTime(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.AverageTalkTime"));
		inbound.setTotalWorkTime(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.TotalWorkTime"));
		inbound.setMaxWorkTime(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.MaxWorkTime"));
		inbound.setAverageWorkTime(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.AverageWorkTime"));
		inbound.setSatisfactionIndex(context.floatValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.SatisfactionIndex"));
		inbound.setSatisfactionSurveysOffered(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.SatisfactionSurveysOffered"));
		inbound.setSatisfactionSurveysResponded(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Inbound.SatisfactionSurveysResponded"));
		instanceSummaryReport.setInbound(inbound);

		Outbound outbound = new Outbound();
		outbound.setCallsDialed(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Outbound.CallsDialed"));
		outbound.setCallsAnswered(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Outbound.CallsAnswered"));
		outbound.setAnswerRate(context.floatValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Outbound.AnswerRate"));
		outbound.setTotalDialingTime(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Outbound.TotalDialingTime"));
		outbound.setMaxDialingTime(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Outbound.MaxDialingTime"));
		outbound.setAverageDialingTime(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Outbound.AverageDialingTime"));
		outbound.setTotalTalkTime(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Outbound.TotalTalkTime"));
		outbound.setMaxTalkTime(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Outbound.MaxTalkTime"));
		outbound.setAverageTalkTime(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Outbound.AverageTalkTime"));
		outbound.setTotalWorkTime(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Outbound.TotalWorkTime"));
		outbound.setMaxWorkTime(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Outbound.MaxWorkTime"));
		outbound.setAverageWorkTime(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Outbound.AverageWorkTime"));
		outbound.setSatisfactionIndex(context.floatValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Outbound.SatisfactionIndex"));
		outbound.setSatisfactionSurveysOffered(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Outbound.SatisfactionSurveysOffered"));
		outbound.setSatisfactionSurveysResponded(context.longValue("GetInstanceSummaryReportSinceMidnightResponse.InstanceSummaryReport.Outbound.SatisfactionSurveysResponded"));
		instanceSummaryReport.setOutbound(outbound);
		getInstanceSummaryReportSinceMidnightResponse.setInstanceSummaryReport(instanceSummaryReport);
	 
	 	return getInstanceSummaryReportSinceMidnightResponse;
	}
}