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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeDiagnosticReportsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeDiagnosticReportsResponse.Report;
import com.aliyuncs.ecs.model.v20140526.DescribeDiagnosticReportsResponse.Report.Issue;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDiagnosticReportsResponseUnmarshaller {

	public static DescribeDiagnosticReportsResponse unmarshall(DescribeDiagnosticReportsResponse describeDiagnosticReportsResponse, UnmarshallerContext _ctx) {
		
		describeDiagnosticReportsResponse.setRequestId(_ctx.stringValue("DescribeDiagnosticReportsResponse.RequestId"));
		describeDiagnosticReportsResponse.setNextToken(_ctx.stringValue("DescribeDiagnosticReportsResponse.NextToken"));

		List<Report> reports = new ArrayList<Report>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDiagnosticReportsResponse.Reports.Length"); i++) {
			Report report = new Report();
			report.setResourceId(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].ResourceId"));
			report.setResourceType(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].ResourceType"));
			report.setMetricSetId(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].MetricSetId"));
			report.setStartTime(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].StartTime"));
			report.setEndTime(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].EndTime"));
			report.setReportId(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].ReportId"));
			report.setStatus(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].Status"));
			report.setCreationTime(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].CreationTime"));
			report.setFinishedTime(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].FinishedTime"));
			report.setSeverity(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].Severity"));

			List<Issue> issues = new ArrayList<Issue>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].Issues.Length"); j++) {
				Issue issue = new Issue();
				issue.setMetricId(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].Issues["+ j +"].MetricId"));
				issue.setMetricCategory(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].Issues["+ j +"].MetricCategory"));
				issue.setIssueId(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].Issues["+ j +"].IssueId"));
				issue.setSeverity(_ctx.stringValue("DescribeDiagnosticReportsResponse.Reports["+ i +"].Issues["+ j +"].Severity"));

				issues.add(issue);
			}
			report.setIssues(issues);

			reports.add(report);
		}
		describeDiagnosticReportsResponse.setReports(reports);
	 
	 	return describeDiagnosticReportsResponse;
	}
}