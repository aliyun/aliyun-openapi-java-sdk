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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeDiagnosticReportListResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDiagnosticReportListResponse.Report;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDiagnosticReportListResponseUnmarshaller {

	public static DescribeDiagnosticReportListResponse unmarshall(DescribeDiagnosticReportListResponse describeDiagnosticReportListResponse, UnmarshallerContext _ctx) {
		
		describeDiagnosticReportListResponse.setRequestId(_ctx.stringValue("DescribeDiagnosticReportListResponse.RequestId"));

		List<Report> reportList = new ArrayList<Report>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDiagnosticReportListResponse.ReportList.Length"); i++) {
			Report report = new Report();
			report.setDiagnosticTime(_ctx.stringValue("DescribeDiagnosticReportListResponse.ReportList["+ i +"].DiagnosticTime"));
			report.setScore(_ctx.integerValue("DescribeDiagnosticReportListResponse.ReportList["+ i +"].Score"));
			report.setStartTime(_ctx.stringValue("DescribeDiagnosticReportListResponse.ReportList["+ i +"].StartTime"));
			report.setEndTime(_ctx.stringValue("DescribeDiagnosticReportListResponse.ReportList["+ i +"].EndTime"));
			report.setDownloadURL(_ctx.stringValue("DescribeDiagnosticReportListResponse.ReportList["+ i +"].DownloadURL"));

			reportList.add(report);
		}
		describeDiagnosticReportListResponse.setReportList(reportList);
	 
	 	return describeDiagnosticReportListResponse;
	}
}