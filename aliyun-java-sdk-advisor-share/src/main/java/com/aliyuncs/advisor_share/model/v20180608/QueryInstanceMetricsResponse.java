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

package com.aliyuncs.advisor_share.model.v20180608;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.advisor_share.transform.v20180608.QueryInstanceMetricsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryInstanceMetricsResponse extends AcsResponse {

	private Boolean success;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<MetricsItem> metrics;

		public List<MetricsItem> getMetrics() {
			return this.metrics;
		}

		public void setMetrics(List<MetricsItem> metrics) {
			this.metrics = metrics;
		}

		public static class MetricsItem {

			private String metricName;

			private List<MetricItemsItem> metricItems;

			public String getMetricName() {
				return this.metricName;
			}

			public void setMetricName(String metricName) {
				this.metricName = metricName;
			}

			public List<MetricItemsItem> getMetricItems() {
				return this.metricItems;
			}

			public void setMetricItems(List<MetricItemsItem> metricItems) {
				this.metricItems = metricItems;
			}

			public static class MetricItemsItem {

				private Double data;

				private String time;

				public Double getData() {
					return this.data;
				}

				public void setData(Double data) {
					this.data = data;
				}

				public String getTime() {
					return this.time;
				}

				public void setTime(String time) {
					this.time = time;
				}
			}
		}
	}

	@Override
	public QueryInstanceMetricsResponse getInstance(UnmarshallerContext context) {
		return	QueryInstanceMetricsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
