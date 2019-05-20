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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.GetInstanceSummaryReportResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetInstanceSummaryReportResponse.InstanceSummaryReport;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetInstanceSummaryReportResponse.InstanceSummaryReport.Outbound;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetInstanceSummaryReportResponse.InstanceSummaryReport.Overall;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceSummaryReportResponseUnmarshaller {

	public static GetInstanceSummaryReportResponse unmarshall(GetInstanceSummaryReportResponse getInstanceSummaryReportResponse, UnmarshallerContext context) {
		
		getInstanceSummaryReportResponse.setRequestId(context.stringValue("GetInstanceSummaryReportResponse.RequestId"));
		getInstanceSummaryReportResponse.setSuccess(context.booleanValue("GetInstanceSummaryReportResponse.Success"));
		getInstanceSummaryReportResponse.setCode(context.stringValue("GetInstanceSummaryReportResponse.Code"));
		getInstanceSummaryReportResponse.setMessage(context.stringValue("GetInstanceSummaryReportResponse.Message"));
		getInstanceSummaryReportResponse.setHttpStatusCode(context.integerValue("GetInstanceSummaryReportResponse.HttpStatusCode"));

		InstanceSummaryReport instanceSummaryReport = new InstanceSummaryReport();
		instanceSummaryReport.setInstanceId(context.stringValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.InstanceId"));

		Overall overall = new Overall();
		overall.setTotalCalls(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Overall.TotalCalls"));
		overall.setTotalLoggedInTime(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Overall.TotalLoggedInTime"));
		overall.setTotalBreakTime(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Overall.TotalBreakTime"));
		overall.setOccupancyRate(context.floatValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Overall.OccupancyRate"));
		overall.setTotalReadyTime(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Overall.TotalReadyTime"));
		overall.setMaxReadyTime(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Overall.MaxReadyTime"));
		overall.setAverageReadyTime(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Overall.AverageReadyTime"));
		overall.setTotalTalkTime(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Overall.TotalTalkTime"));
		overall.setMaxTalkTime(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Overall.MaxTalkTime"));
		overall.setAverageTalkTime(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Overall.AverageTalkTime"));
		overall.setTotalWorkTime(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Overall.TotalWorkTime"));
		overall.setMaxWorkTime(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Overall.MaxWorkTime"));
		overall.setAverageWorkTime(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Overall.AverageWorkTime"));
		overall.setSatisfactionIndex(context.floatValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Overall.SatisfactionIndex"));
		overall.setSatisfactionSurveysOffered(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Overall.SatisfactionSurveysOffered"));
		overall.setSatisfactionSurveysResponded(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Overall.SatisfactionSurveysResponded"));
		instanceSummaryReport.setOverall(overall);

		Inbound inbound = new Inbound();
		inbound.setCallsIncomingLine(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.CallsIncomingLine"));
		inbound.setCallsIncomingIVR(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.CallsIncomingIVR"));
		inbound.setCallsAbandonedInIVR(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.CallsAbandonedInIVR"));
		inbound.setCallsIncomingQueue(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.CallsIncomingQueue"));
		inbound.setCallsAbandonedInQueue(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.CallsAbandonedInQueue"));
		inbound.setCallsOffered(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.CallsOffered"));
		inbound.setCallsHandled(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.CallsHandled"));
		inbound.setHandleRate(context.floatValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.HandleRate"));
		inbound.setTotalRingTime(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.TotalRingTime"));
		inbound.setMaxRingTime(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.MaxRingTime"));
		inbound.setAverageRingTime(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.AverageRingTime"));
		inbound.setServiceLevel20(context.floatValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.ServiceLevel20"));
		inbound.setTotalTalkTime(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.TotalTalkTime"));
		inbound.setMaxTalkTime(context.stringValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.MaxTalkTime"));
		inbound.setAverageTalkTime(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.AverageTalkTime"));
		inbound.setTotalWorkTime(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.TotalWorkTime"));
		inbound.setMaxWorkTime(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.MaxWorkTime"));
		inbound.setAverageWorkTime(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.AverageWorkTime"));
		inbound.setSatisfactionIndex(context.floatValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.SatisfactionIndex"));
		inbound.setSatisfactionSurveysOffered(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.SatisfactionSurveysOffered"));
		inbound.setSatisfactionSurveysResponded(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Inbound.SatisfactionSurveysResponded"));
		instanceSummaryReport.setInbound(inbound);

		Outbound outbound = new Outbound();
		outbound.setCallsDialed(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Outbound.CallsDialed"));
		outbound.setCallsAnswered(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Outbound.CallsAnswered"));
		outbound.setAnswerRate(context.floatValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Outbound.AnswerRate"));
		outbound.setTotalDialingTime(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Outbound.TotalDialingTime"));
		outbound.setMaxDialingTime(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Outbound.MaxDialingTime"));
		outbound.setAverageDialingTime(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Outbound.AverageDialingTime"));
		outbound.setTotalTalkTime(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Outbound.TotalTalkTime"));
		outbound.setMaxTalkTime(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Outbound.MaxTalkTime"));
		outbound.setAverageTalkTime(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Outbound.AverageTalkTime"));
		outbound.setTotalWorkTime(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Outbound.TotalWorkTime"));
		outbound.setMaxWorkTime(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Outbound.MaxWorkTime"));
		outbound.setAverageWorkTime(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Outbound.AverageWorkTime"));
		outbound.setSatisfactionIndex(context.floatValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Outbound.SatisfactionIndex"));
		outbound.setSatisfactionSurveysOffered(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Outbound.SatisfactionSurveysOffered"));
		outbound.setSatisfactionSurveysResponded(context.longValue("GetInstanceSummaryReportResponse.InstanceSummaryReport.Outbound.SatisfactionSurveysResponded"));
		instanceSummaryReport.setOutbound(outbound);
		getInstanceSummaryReportResponse.setInstanceSummaryReport(instanceSummaryReport);
	 
	 	return getInstanceSummaryReportResponse;
	}
}