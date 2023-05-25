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
import com.aliyuncs.ecs.transform.v20140526.DescribeDiagnosticMetricSetsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDiagnosticMetricSetsResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private List<MetricSet> metricSets;

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

	public List<MetricSet> getMetricSets() {
		return this.metricSets;
	}

	public void setMetricSets(List<MetricSet> metricSets) {
		this.metricSets = metricSets;
	}

	public static class MetricSet {

		private String metricSetId;

		private String metricSetName;

		private String description;

		private String type;

		private String resourceType;

		private List<String> metricIds;

		public String getMetricSetId() {
			return this.metricSetId;
		}

		public void setMetricSetId(String metricSetId) {
			this.metricSetId = metricSetId;
		}

		public String getMetricSetName() {
			return this.metricSetName;
		}

		public void setMetricSetName(String metricSetName) {
			this.metricSetName = metricSetName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public List<String> getMetricIds() {
			return this.metricIds;
		}

		public void setMetricIds(List<String> metricIds) {
			this.metricIds = metricIds;
		}
	}

	@Override
	public DescribeDiagnosticMetricSetsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDiagnosticMetricSetsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
