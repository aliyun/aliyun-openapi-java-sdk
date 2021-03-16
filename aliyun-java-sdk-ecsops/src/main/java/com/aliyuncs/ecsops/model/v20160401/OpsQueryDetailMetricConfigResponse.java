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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryDetailMetricConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryDetailMetricConfigResponse extends AcsResponse {

	private String requestId;

	private List<MetricConfig> metricConfigs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<MetricConfig> getMetricConfigs() {
		return this.metricConfigs;
	}

	public void setMetricConfigs(List<MetricConfig> metricConfigs) {
		this.metricConfigs = metricConfigs;
	}

	public static class MetricConfig {

		private String metricName;

		private String metricTarget;

		private String metricDescription;

		private String metricLogStore;

		private String metricSlsConfigName;

		private Integer metricInterval;

		private String metricAnalyse;

		private String metricQuery;

		private List<AggregationDimension> aggregationDimensions;

		private List<String> metricRegions;

		public String getMetricName() {
			return this.metricName;
		}

		public void setMetricName(String metricName) {
			this.metricName = metricName;
		}

		public String getMetricTarget() {
			return this.metricTarget;
		}

		public void setMetricTarget(String metricTarget) {
			this.metricTarget = metricTarget;
		}

		public String getMetricDescription() {
			return this.metricDescription;
		}

		public void setMetricDescription(String metricDescription) {
			this.metricDescription = metricDescription;
		}

		public String getMetricLogStore() {
			return this.metricLogStore;
		}

		public void setMetricLogStore(String metricLogStore) {
			this.metricLogStore = metricLogStore;
		}

		public String getMetricSlsConfigName() {
			return this.metricSlsConfigName;
		}

		public void setMetricSlsConfigName(String metricSlsConfigName) {
			this.metricSlsConfigName = metricSlsConfigName;
		}

		public Integer getMetricInterval() {
			return this.metricInterval;
		}

		public void setMetricInterval(Integer metricInterval) {
			this.metricInterval = metricInterval;
		}

		public String getMetricAnalyse() {
			return this.metricAnalyse;
		}

		public void setMetricAnalyse(String metricAnalyse) {
			this.metricAnalyse = metricAnalyse;
		}

		public String getMetricQuery() {
			return this.metricQuery;
		}

		public void setMetricQuery(String metricQuery) {
			this.metricQuery = metricQuery;
		}

		public List<AggregationDimension> getAggregationDimensions() {
			return this.aggregationDimensions;
		}

		public void setAggregationDimensions(List<AggregationDimension> aggregationDimensions) {
			this.aggregationDimensions = aggregationDimensions;
		}

		public List<String> getMetricRegions() {
			return this.metricRegions;
		}

		public void setMetricRegions(List<String> metricRegions) {
			this.metricRegions = metricRegions;
		}

		public static class AggregationDimension {

			private Integer aggregationMaxCnt;

			private String aggregationIndex;

			private String aggregationType;

			public Integer getAggregationMaxCnt() {
				return this.aggregationMaxCnt;
			}

			public void setAggregationMaxCnt(Integer aggregationMaxCnt) {
				this.aggregationMaxCnt = aggregationMaxCnt;
			}

			public String getAggregationIndex() {
				return this.aggregationIndex;
			}

			public void setAggregationIndex(String aggregationIndex) {
				this.aggregationIndex = aggregationIndex;
			}

			public String getAggregationType() {
				return this.aggregationType;
			}

			public void setAggregationType(String aggregationType) {
				this.aggregationType = aggregationType;
			}
		}
	}

	@Override
	public OpsQueryDetailMetricConfigResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryDetailMetricConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
