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
		describeDiagnosticReportAttributesResponse.setStatus(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.Status"));
		describeDiagnosticReportAttributesResponse.setEndTime(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.EndTime"));
		describeDiagnosticReportAttributesResponse.setMetricSetId(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.MetricSetId"));
		describeDiagnosticReportAttributesResponse.setStartTime(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.StartTime"));
		describeDiagnosticReportAttributesResponse.setAttributes(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.Attributes"));
		describeDiagnosticReportAttributesResponse.setReportId(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.ReportId"));
		describeDiagnosticReportAttributesResponse.setResourceType(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.ResourceType"));
		describeDiagnosticReportAttributesResponse.setSeverity(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.Severity"));
		describeDiagnosticReportAttributesResponse.setFinishedTime(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.FinishedTime"));
		describeDiagnosticReportAttributesResponse.setResourceId(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.ResourceId"));
		describeDiagnosticReportAttributesResponse.setCreationTime(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.CreationTime"));

		List<MetricResult> metricResults = new ArrayList<MetricResult>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDiagnosticReportAttributesResponse.MetricResults.Length"); i++) {
			MetricResult metricResult = new MetricResult();
			metricResult.setStatus(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.MetricResults["+ i +"].Status"));
			metricResult.setMetricId(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.MetricResults["+ i +"].MetricId"));
			metricResult.setSeverity(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.MetricResults["+ i +"].Severity"));
			metricResult.setMetricCategory(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.MetricResults["+ i +"].MetricCategory"));

			List<Issue> issues = new ArrayList<Issue>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDiagnosticReportAttributesResponse.MetricResults["+ i +"].Issues.Length"); j++) {
				Issue issue = new Issue();
				issue.setOccurrenceTime(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.MetricResults["+ i +"].Issues["+ j +"].OccurrenceTime"));
				issue.setRepairable(_ctx.booleanValue("DescribeDiagnosticReportAttributesResponse.MetricResults["+ i +"].Issues["+ j +"].Repairable"));
				issue.setAdditional(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.MetricResults["+ i +"].Issues["+ j +"].Additional"));
				issue.setSeverity(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.MetricResults["+ i +"].Issues["+ j +"].Severity"));
				issue.setRepairStatus(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.MetricResults["+ i +"].Issues["+ j +"].RepairStatus"));
				issue.setIssueId(_ctx.stringValue("DescribeDiagnosticReportAttributesResponse.MetricResults["+ i +"].Issues["+ j +"].IssueId"));

				issues.add(issue);
			}
			metricResult.setIssues(issues);

			metricResults.add(metricResult);
		}
		describeDiagnosticReportAttributesResponse.setMetricResults(metricResults);
	 
	 	return describeDiagnosticReportAttributesResponse;
	}
}