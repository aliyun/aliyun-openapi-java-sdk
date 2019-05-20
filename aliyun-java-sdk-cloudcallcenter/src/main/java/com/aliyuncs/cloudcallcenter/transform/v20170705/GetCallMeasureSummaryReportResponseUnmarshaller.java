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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.GetCallMeasureSummaryReportResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetCallMeasureSummaryReportResponse.NumberReports;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetCallMeasureSummaryReportResponse.NumberReports.NumberReport;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetCallMeasureSummaryReportResponse.SummaryReport;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCallMeasureSummaryReportResponseUnmarshaller {

	public static GetCallMeasureSummaryReportResponse unmarshall(GetCallMeasureSummaryReportResponse getCallMeasureSummaryReportResponse, UnmarshallerContext context) {
		
		getCallMeasureSummaryReportResponse.setRequestId(context.stringValue("GetCallMeasureSummaryReportResponse.RequestId"));
		getCallMeasureSummaryReportResponse.setSuccess(context.booleanValue("GetCallMeasureSummaryReportResponse.Success"));
		getCallMeasureSummaryReportResponse.setCode(context.stringValue("GetCallMeasureSummaryReportResponse.Code"));
		getCallMeasureSummaryReportResponse.setMessage(context.stringValue("GetCallMeasureSummaryReportResponse.Message"));
		getCallMeasureSummaryReportResponse.setHttpStatusCode(context.integerValue("GetCallMeasureSummaryReportResponse.HttpStatusCode"));

		SummaryReport summaryReport = new SummaryReport();
		summaryReport.setYear(context.integerValue("GetCallMeasureSummaryReportResponse.SummaryReport.Year"));
		summaryReport.setMonth(context.integerValue("GetCallMeasureSummaryReportResponse.SummaryReport.Month"));
		summaryReport.setDay(context.integerValue("GetCallMeasureSummaryReportResponse.SummaryReport.Day"));
		summaryReport.setInboundCount(context.longValue("GetCallMeasureSummaryReportResponse.SummaryReport.InboundCount"));
		summaryReport.setOutboundCount(context.longValue("GetCallMeasureSummaryReportResponse.SummaryReport.OutboundCount"));
		summaryReport.setOutboundDurationByMinute(context.longValue("GetCallMeasureSummaryReportResponse.SummaryReport.OutboundDurationByMinute"));
		summaryReport.setInboundDurationByMinute(context.longValue("GetCallMeasureSummaryReportResponse.SummaryReport.InboundDurationByMinute"));
		getCallMeasureSummaryReportResponse.setSummaryReport(summaryReport);

		NumberReports numberReports = new NumberReports();
		numberReports.setTotalCount(context.integerValue("GetCallMeasureSummaryReportResponse.NumberReports.TotalCount"));
		numberReports.setPageNumber(context.integerValue("GetCallMeasureSummaryReportResponse.NumberReports.PageNumber"));
		numberReports.setPageSize(context.integerValue("GetCallMeasureSummaryReportResponse.NumberReports.PageSize"));

		List<NumberReport> list = new ArrayList<NumberReport>();
		for (int i = 0; i < context.lengthValue("GetCallMeasureSummaryReportResponse.NumberReports.List.Length"); i++) {
			NumberReport numberReport = new NumberReport();
			numberReport.setNumber(context.stringValue("GetCallMeasureSummaryReportResponse.NumberReports.List["+ i +"].Number"));
			numberReport.setYear(context.integerValue("GetCallMeasureSummaryReportResponse.NumberReports.List["+ i +"].Year"));
			numberReport.setMonth(context.integerValue("GetCallMeasureSummaryReportResponse.NumberReports.List["+ i +"].Month"));
			numberReport.setDay(context.integerValue("GetCallMeasureSummaryReportResponse.NumberReports.List["+ i +"].Day"));
			numberReport.setInboundCount(context.longValue("GetCallMeasureSummaryReportResponse.NumberReports.List["+ i +"].InboundCount"));
			numberReport.setOutboundCount(context.longValue("GetCallMeasureSummaryReportResponse.NumberReports.List["+ i +"].OutboundCount"));
			numberReport.setOutboundDurationByMinute(context.longValue("GetCallMeasureSummaryReportResponse.NumberReports.List["+ i +"].OutboundDurationByMinute"));
			numberReport.setInboundDurationByMinute(context.longValue("GetCallMeasureSummaryReportResponse.NumberReports.List["+ i +"].InboundDurationByMinute"));

			list.add(numberReport);
		}
		numberReports.setList(list);
		getCallMeasureSummaryReportResponse.setNumberReports(numberReports);
	 
	 	return getCallMeasureSummaryReportResponse;
	}
}