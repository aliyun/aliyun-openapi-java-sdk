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
import com.aliyuncs.ecs.transform.v20140526.DescribeDiagnosticReportAttributesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDiagnosticReportAttributesResponse extends AcsResponse {

	private String requestId;

	private String resourceId;

	private String resourceType;

	private String reportId;

	private String status;

	private String creationTime;

	private String finishedTime;

	private String startTime;

	private String endTime;

	private String severity;

	private String metricSetId;

	private String attributes;

	private List<MetricResult> metricResults;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public String getSeverity() {
		return this.severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getMetricSetId() {
		return this.metricSetId;
	}

	public void setMetricSetId(String metricSetId) {
		this.metricSetId = metricSetId;
	}

	public String getAttributes() {
		return this.attributes;
	}

	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

	public List<MetricResult> getMetricResults() {
		return this.metricResults;
	}

	public void setMetricResults(List<MetricResult> metricResults) {
		this.metricResults = metricResults;
	}

	public static class MetricResult {

		private String metricId;

		private String metricCategory;

		private String severity;

		private String status;

		private List<Issue> issues;

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

		public String getSeverity() {
			return this.severity;
		}

		public void setSeverity(String severity) {
			this.severity = severity;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<Issue> getIssues() {
			return this.issues;
		}

		public void setIssues(List<Issue> issues) {
			this.issues = issues;
		}

		public static class Issue {

			private String issueId;

			private String severity;

			private String additional;

			private String occurrenceTime;

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

			public String getAdditional() {
				return this.additional;
			}

			public void setAdditional(String additional) {
				this.additional = additional;
			}

			public String getOccurrenceTime() {
				return this.occurrenceTime;
			}

			public void setOccurrenceTime(String occurrenceTime) {
				this.occurrenceTime = occurrenceTime;
			}
		}
	}

	@Override
	public DescribeDiagnosticReportAttributesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDiagnosticReportAttributesResponseUnmarshaller.unmarshall(this, context);
	}
}
