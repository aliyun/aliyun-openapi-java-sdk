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

	private String status;

	private String requestId;

	private String endTime;

	private String metricSetId;

	private String startTime;

	private String attributes;

	private String reportId;

	private String resourceType;

	private String severity;

	private String finishedTime;

	private String resourceId;

	private String creationTime;

	private List<MetricResult> metricResults;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
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

	public String getAttributes() {
		return this.attributes;
	}

	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

	public String getReportId() {
		return this.reportId;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public String getSeverity() {
		return this.severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getFinishedTime() {
		return this.finishedTime;
	}

	public void setFinishedTime(String finishedTime) {
		this.finishedTime = finishedTime;
	}

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getCreationTime() {
		return this.creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public List<MetricResult> getMetricResults() {
		return this.metricResults;
	}

	public void setMetricResults(List<MetricResult> metricResults) {
		this.metricResults = metricResults;
	}

	public static class MetricResult {

		private String status;

		private String metricId;

		private String severity;

		private String metricCategory;

		private List<Issue> issues;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getMetricId() {
			return this.metricId;
		}

		public void setMetricId(String metricId) {
			this.metricId = metricId;
		}

		public String getSeverity() {
			return this.severity;
		}

		public void setSeverity(String severity) {
			this.severity = severity;
		}

		public String getMetricCategory() {
			return this.metricCategory;
		}

		public void setMetricCategory(String metricCategory) {
			this.metricCategory = metricCategory;
		}

		public List<Issue> getIssues() {
			return this.issues;
		}

		public void setIssues(List<Issue> issues) {
			this.issues = issues;
		}

		public static class Issue {

			private String occurrenceTime;

			private Boolean repairable;

			private String additional;

			private String severity;

			private String repairStatus;

			private String issueId;

			public String getOccurrenceTime() {
				return this.occurrenceTime;
			}

			public void setOccurrenceTime(String occurrenceTime) {
				this.occurrenceTime = occurrenceTime;
			}

			public Boolean getRepairable() {
				return this.repairable;
			}

			public void setRepairable(Boolean repairable) {
				this.repairable = repairable;
			}

			public String getAdditional() {
				return this.additional;
			}

			public void setAdditional(String additional) {
				this.additional = additional;
			}

			public String getSeverity() {
				return this.severity;
			}

			public void setSeverity(String severity) {
				this.severity = severity;
			}

			public String getRepairStatus() {
				return this.repairStatus;
			}

			public void setRepairStatus(String repairStatus) {
				this.repairStatus = repairStatus;
			}

			public String getIssueId() {
				return this.issueId;
			}

			public void setIssueId(String issueId) {
				this.issueId = issueId;
			}
		}
	}

	@Override
	public DescribeDiagnosticReportAttributesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDiagnosticReportAttributesResponseUnmarshaller.unmarshall(this, context);
	}
}
