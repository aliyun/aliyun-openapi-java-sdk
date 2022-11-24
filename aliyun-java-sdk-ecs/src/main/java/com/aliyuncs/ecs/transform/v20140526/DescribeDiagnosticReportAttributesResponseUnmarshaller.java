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

import com.aliyuncs.ecs.model.v20140526.DescribeDiagnosticReportAttributesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeDiagnosticReportAttributesResponse.MetricResult;
import com.aliyuncs.ecs.model.v20140526.DescribeDiagnosticReportAttributesResponse.MetricResult.Issue;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDiagnosticReportAttributesResponseUnmarshaller {

	public static DescribeDiagnosticReportAttributesResponse unmarshall(DescribeDiagnosticReportAttributesResponse describeDiagnosticReportAttributesResponse, UnmarshallerContext _ctx) {
		
		describeDiagnosticReportAttributesResponse.setRequestId(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.RequestId"));
		describeDiagnosticReportAttributesResponse.setResourceId(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.ResourceId"));
		describeDiagnosticReportAttributesResponse.setResourceType(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.ResourceType"));
		describeDiagnosticReportAttributesResponse.setReportId(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.ReportId"));
		describeDiagnosticReportAttributesResponse.setStatus(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.Status"));
		describeDiagnosticReportAttributesResponse.setCreationTime(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.CreationTime"));
		describeDiagnosticReportAttributesResponse.setFinishedTime(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.FinishedTime"));
		describeDiagnosticReportAttributesResponse.setStartTime(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.StartTime"));
		describeDiagnosticReportAttributesResponse.setEndTime(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.EndTime"));
		describeDiagnosticReportAttributesResponse.setSeverity(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.Severity"));
		describeDiagnosticReportAttributesResponse.setMetricSetId(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.MetricSetId"));

		List<MetricResult> metricResults = new ArrayList<MetricResult>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDiagnosticReportAttributesResponse.MetricResults.Length"); i++) {
			MetricResult metricResult = new MetricResult();
			metricResult.setMetricId(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.MetricResults["+ i +"].MetricId"));
			metricResult.setMetricCategory(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.MetricResults["+ i +"].MetricCategory"));
			metricResult.setSeverity(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.MetricResults["+ i +"].Severity"));
			metricResult.setStatus(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.MetricResults["+ i +"].Status"));

			List<Issue> issues = new ArrayList<Issue>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDiagnosticReportAttributesResponse.MetricResults["+ i +"].Issues.Length"); j++) {
				Issue issue = new Issue();
				issue.setIssueId(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.MetricResults["+ i +"].Issues["+ j +"].IssueId"));
				issue.setSeverity(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.MetricResults["+ i +"].Issues["+ j +"].Severity"));
				issue.setAdditional(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.MetricResults["+ i +"].Issues["+ j +"].Additional"));
				issue.setOccurrenceTime(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.MetricResults["+ i +"].Issues["+ j +"].OccurrenceTime"));

				issues.add(issue);
			}
			metricResult.setIssues(issues);

			metricResults.add(metricResult);
		}
		describeDiagnosticReportAttributesResponse.setMetricResults(metricResults);
	 
	 	return describeDiagnosticReportAttributesResponse;
	}
}