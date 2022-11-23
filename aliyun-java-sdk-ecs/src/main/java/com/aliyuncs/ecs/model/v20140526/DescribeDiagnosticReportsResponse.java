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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeDiagnosticReportsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDiagnosticReportsResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private List<Report> reports;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<Report> getReports() {
		return this.reports;
	}

	public void setReports(List<Report> reports) {
		this.reports = reports;
	}

	public static class Report {

		private String resourceId;

		private String resourceType;

		private String metricSetId;

		private String startTime;

		private String endTime;

		private String reportId;

		private String status;

		private String creationTime;

		private String finishedTime;

		private String severity;

		private List<Issue> issues;

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getMetricSetId() {
			return this.metricSetId;
		}

		public void setMetricSetId(String metricSetId) {
			this.metricSetId = metricSetId;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getReportId() {
			return this.reportId;
		}

		public void setReportId(String reportId) {
			this.reportId = reportId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getFinishedTime() {
			return this.finishedTime;
		}

		public void setFinishedTime(String finishedTime) {
			this.finishedTime = finishedTime;
		}

		public String getSeverity() {
			return this.severity;
		}

		public void setSeverity(String severity) {
			this.severity = severity;
		}

		public List<Issue> getIssues() {
			return this.issues;
		}

		public void setIssues(List<Issue> issues) {
			this.issues = issues;
		}

		public static class Issue {

			private String metricId;

			private String metricCategory;

			private String issueId;

			private String severity;

			public String getMetricId() {
				return this.metricId;
			}

			public void setMetricId(String metricId) {
				this.metricId = metricId;
			}

			public String getMetricCategory() {
				return this.metricCategory;
			}

			public void setMetricCategory(String metricCategory) {
				this.metricCategory = metricCategory;
			}

			public String getIssueId() {
				return this.issueId;
			}

			public void setIssueId(String issueId) {
				this.issueId = issueId;
			}

			public String getSeverity() {
				return this.severity;
			}

			public void setSeverity(String severity) {
				this.severity = severity;
			}
		}
	}

	@Override
	public DescribeDiagnosticReportsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDiagnosticReportsResponseUnmarshaller.unmarshall(this, context);
	}
}
