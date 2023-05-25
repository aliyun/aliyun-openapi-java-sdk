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
import com.aliyuncs.ecs.transform.v20140526.DescribeDiagnosticMetricsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDiagnosticMetricsResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private List<Metric> metrics;

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

	public List<Metric> getMetrics() {
		return this.metrics;
	}

	public void setMetrics(List<Metric> metrics) {
		this.metrics = metrics;
	}

	public static class Metric {

		private String metricId;

		private String metricName;

		private String metricCategory;

		private String description;

		private String resourceType;

		private Boolean guestMetric;

		private String supportedOperatingSystem;

		public String getMetricId() {
			return this.metricId;
		}

		public void setMetricId(String metricId) {
			this.metricId = metricId;
		}

		public String getMetricName() {
			return this.metricName;
		}

		public void setMetricName(String metricName) {
			this.metricName = metricName;
		}

		public String getMetricCategory() {
			return this.metricCategory;
		}

		public void setMetricCategory(String metricCategory) {
			this.metricCategory = metricCategory;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public Boolean getGuestMetric() {
			return this.guestMetric;
		}

		public void setGuestMetric(Boolean guestMetric) {
			this.guestMetric = guestMetric;
		}

		public String getSupportedOperatingSystem() {
			return this.supportedOperatingSystem;
		}

		public void setSupportedOperatingSystem(String supportedOperatingSystem) {
			this.supportedOperatingSystem = supportedOperatingSystem;
		}
	}

	@Override
	public DescribeDiagnosticMetricsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDiagnosticMetricsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
