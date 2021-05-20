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

import com.aliyuncs.ccc.model.v20170705.ListCallMeasureSummaryReportsResponse;
import com.aliyuncs.ccc.model.v20170705.ListCallMeasureSummaryReportsResponse.CallMeasureSummaryReport;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCallMeasureSummaryReportsResponseUnmarshaller {

	public static ListCallMeasureSummaryReportsResponse unmarshall(ListCallMeasureSummaryReportsResponse listCallMeasureSummaryReportsResponse, UnmarshallerContext _ctx) {
		
		listCallMeasureSummaryReportsResponse.setRequestId(_ctx.stringValue("ListCallMeasureSummaryReportsResponse.RequestId"));
		listCallMeasureSummaryReportsResponse.setSuccess(_ctx.booleanValue("ListCallMeasureSummaryReportsResponse.Success"));
		listCallMeasureSummaryReportsResponse.setCode(_ctx.stringValue("ListCallMeasureSummaryReportsResponse.Code"));
		listCallMeasureSummaryReportsResponse.setMessage(_ctx.stringValue("ListCallMeasureSummaryReportsResponse.Message"));
		listCallMeasureSummaryReportsResponse.setHttpStatusCode(_ctx.integerValue("ListCallMeasureSummaryReportsResponse.HttpStatusCode"));

		List<CallMeasureSummaryReport> callMeasureSummaryReportList = new ArrayList<CallMeasureSummaryReport>();
		for (int i = 0; i < _ctx.lengthValue("ListCallMeasureSummaryReportsResponse.CallMeasureSummaryReportList.Length"); i++) {
			CallMeasureSummaryReport callMeasureSummaryReport = new CallMeasureSummaryReport();
			callMeasureSummaryReport.setYear(_ctx.stringValue("ListCallMeasureSummaryReportsResponse.CallMeasureSummaryReportList["+ i +"].Year"));
			callMeasureSummaryReport.setMonth(_ctx.stringValue("ListCallMeasureSummaryReportsResponse.CallMeasureSummaryReportList["+ i +"].Month"));
			callMeasureSummaryReport.setDay(_ctx.stringValue("ListCallMeasureSummaryReportsResponse.CallMeasureSummaryReportList["+ i +"].Day"));
			callMeasureSummaryReport.setInboundCount(_ctx.longValue("ListCallMeasureSummaryReportsResponse.CallMeasureSummaryReportList["+ i +"].InboundCount"));
			callMeasureSummaryReport.setOutboundCount(_ctx.longValue("ListCallMeasureSummaryReportsResponse.CallMeasureSummaryReportList["+ i +"].OutboundCount"));
			callMeasureSummaryReport.setOutboundDurationByMinute(_ctx.longValue("ListCallMeasureSummaryReportsResponse.CallMeasureSummaryReportList["+ i +"].OutboundDurationByMinute"));
			callMeasureSummaryReport.setInboundDurationByMinute(_ctx.longValue("ListCallMeasureSummaryReportsResponse.CallMeasureSummaryReportList["+ i +"].InboundDurationByMinute"));

			callMeasureSummaryReportList.add(callMeasureSummaryReport);
		}
		listCallMeasureSummaryReportsResponse.setCallMeasureSummaryReportList(callMeasureSummaryReportList);
	 
	 	return listCallMeasureSummaryReportsResponse;
	}
}