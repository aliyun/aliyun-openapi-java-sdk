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

package com.aliyuncs.eds_aic.model.v20230930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eds_aic.transform.v20230930.DescribeMetricLastResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMetricLastResponse extends AcsResponse {

	private String requestId;

	private Integer count;

	private String nextToken;

	private List<Data> metricTotalModel;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<Data> getMetricTotalModel() {
		return this.metricTotalModel;
	}

	public void setMetricTotalModel(List<Data> metricTotalModel) {
		this.metricTotalModel = metricTotalModel;
	}

	public static class Data {

		private String androidInstanceId;

		private List<MetricModelListItem> metricModelList;

		public String getAndroidInstanceId() {
			return this.androidInstanceId;
		}

		public void setAndroidInstanceId(String androidInstanceId) {
			this.androidInstanceId = androidInstanceId;
		}

		public List<MetricModelListItem> getMetricModelList() {
			return this.metricModelList;
		}

		public void setMetricModelList(List<MetricModelListItem> metricModelList) {
			this.metricModelList = metricModelList;
		}

		public static class MetricModelListItem {

			private String metricName;

			private List<DataPointsItem> dataPoints;

			private List<ProcessLastInfosItem> processLastInfos;

			public String getMetricName() {
				return this.metricName;
			}

			public void setMetricName(String metricName) {
				this.metricName = metricName;
			}

			public List<DataPointsItem> getDataPoints() {
				return this.dataPoints;
			}

			public void setDataPoints(List<DataPointsItem> dataPoints) {
				this.dataPoints = dataPoints;
			}

			public List<ProcessLastInfosItem> getProcessLastInfos() {
				return this.processLastInfos;
			}

			public void setProcessLastInfos(List<ProcessLastInfosItem> processLastInfos) {
				this.processLastInfos = processLastInfos;
			}

			public static class DataPointsItem {

				private Long timestamp;

				private Double minimum;

				private Double average;

				private Double maximum;

				public Long getTimestamp() {
					return this.timestamp;
				}

				public void setTimestamp(Long timestamp) {
					this.timestamp = timestamp;
				}

				public Double getMinimum() {
					return this.minimum;
				}

				public void setMinimum(Double minimum) {
					this.minimum = minimum;
				}

				public Double getAverage() {
					return this.average;
				}

				public void setAverage(Double average) {
					this.average = average;
				}

				public Double getMaximum() {
					return this.maximum;
				}

				public void setMaximum(Double maximum) {
					this.maximum = maximum;
				}
			}

			public static class ProcessLastInfosItem {

				private Long timestamp;

				private String name;

				private Double memoryUsage;

				private Double cpuUsage;

				private List<Integer> processIds;

				public Long getTimestamp() {
					return this.timestamp;
				}

				public void setTimestamp(Long timestamp) {
					this.timestamp = timestamp;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Double getMemoryUsage() {
					return this.memoryUsage;
				}

				public void setMemoryUsage(Double memoryUsage) {
					this.memoryUsage = memoryUsage;
				}

				public Double getCpuUsage() {
					return this.cpuUsage;
				}

				public void setCpuUsage(Double cpuUsage) {
					this.cpuUsage = cpuUsage;
				}

				public List<Integer> getProcessIds() {
					return this.processIds;
				}

				public void setProcessIds(List<Integer> processIds) {
					this.processIds = processIds;
				}
			}
		}
	}

	@Override
	public DescribeMetricLastResponse getInstance(UnmarshallerContext context) {
		return	DescribeMetricLastResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
