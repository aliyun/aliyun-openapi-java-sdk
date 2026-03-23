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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeAIDBClusterTaskMetricsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAIDBClusterTaskMetricsResponse extends AcsResponse {

	private Integer pageRecordCount;

	private String requestId;

	private Long pageSize;

	private Long pageNumber;

	private String startTime;

	private String endTime;

	private String metricType;

	private String dBClusterId;

	private String relativeDbClusterId;

	private Items items;

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
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

	public String getMetricType() {
		return this.metricType;
	}

	public void setMetricType(String metricType) {
		this.metricType = metricType;
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
	}

	public String getRelativeDbClusterId() {
		return this.relativeDbClusterId;
	}

	public void setRelativeDbClusterId(String relativeDbClusterId) {
		this.relativeDbClusterId = relativeDbClusterId;
	}

	public Items getItems() {
		return this.items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	public static class Items {

		private List<SlsMetricsItem> slsMetricsItems;

		public List<SlsMetricsItem> getSlsMetricsItems() {
			return this.slsMetricsItems;
		}

		public void setSlsMetricsItems(List<SlsMetricsItem> slsMetricsItems) {
			this.slsMetricsItems = slsMetricsItems;
		}

		public static class SlsMetricsItem {

			private String timestamp;

			private String logTime;

			private Integer currentStep;

			private Integer globalStep;

			private Double epoch;

			private String metricType;

			private Map<Object,Object> metric;

			public String getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(String timestamp) {
				this.timestamp = timestamp;
			}

			public String getLogTime() {
				return this.logTime;
			}

			public void setLogTime(String logTime) {
				this.logTime = logTime;
			}

			public Integer getCurrentStep() {
				return this.currentStep;
			}

			public void setCurrentStep(Integer currentStep) {
				this.currentStep = currentStep;
			}

			public Integer getGlobalStep() {
				return this.globalStep;
			}

			public void setGlobalStep(Integer globalStep) {
				this.globalStep = globalStep;
			}

			public Double getEpoch() {
				return this.epoch;
			}

			public void setEpoch(Double epoch) {
				this.epoch = epoch;
			}

			public String getMetricType() {
				return this.metricType;
			}

			public void setMetricType(String metricType) {
				this.metricType = metricType;
			}

			public Map<Object,Object> getMetric() {
				return this.metric;
			}

			public void setMetric(Map<Object,Object> metric) {
				this.metric = metric;
			}
		}
	}

	@Override
	public DescribeAIDBClusterTaskMetricsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAIDBClusterTaskMetricsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
