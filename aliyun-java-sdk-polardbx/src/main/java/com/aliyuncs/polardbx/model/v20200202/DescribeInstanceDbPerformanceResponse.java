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

package com.aliyuncs.polardbx.model.v20200202;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardbx.transform.v20200202.DescribeInstanceDbPerformanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceDbPerformanceResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<PerformanceItem> performanceItems;

		public List<PerformanceItem> getPerformanceItems() {
			return this.performanceItems;
		}

		public void setPerformanceItems(List<PerformanceItem> performanceItems) {
			this.performanceItems = performanceItems;
		}

		public static class PerformanceItem {

			private String measurement;

			private String metricName;

			private List<Point> points;

			public String getMeasurement() {
				return this.measurement;
			}

			public void setMeasurement(String measurement) {
				this.measurement = measurement;
			}

			public String getMetricName() {
				return this.metricName;
			}

			public void setMetricName(String metricName) {
				this.metricName = metricName;
			}

			public List<Point> getPoints() {
				return this.points;
			}

			public void setPoints(List<Point> points) {
				this.points = points;
			}

			public static class Point {

				private Long timestamp;

				private String value;

				public Long getTimestamp() {
					return this.timestamp;
				}

				public void setTimestamp(Long timestamp) {
					this.timestamp = timestamp;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}
	}

	@Override
	public DescribeInstanceDbPerformanceResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceDbPerformanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
