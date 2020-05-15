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

package com.aliyuncs.gdb.model.v20190903;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gdb.transform.v20190903.DescribeDBInstancePerformanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstancePerformanceResponse extends AcsResponse {

	private String requestId;

	private String dBInstanceId;

	private String engine;

	private String startTime;

	private String endTime;

	private List<PerformanceItem> performanceKeys;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
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

	public List<PerformanceItem> getPerformanceKeys() {
		return this.performanceKeys;
	}

	public void setPerformanceKeys(List<PerformanceItem> performanceKeys) {
		this.performanceKeys = performanceKeys;
	}

	public static class PerformanceItem {

		private String metricName;

		private String measurement;

		private List<PerformanceItemValue> points;

		public String getMetricName() {
			return this.metricName;
		}

		public void setMetricName(String metricName) {
			this.metricName = metricName;
		}

		public String getMeasurement() {
			return this.measurement;
		}

		public void setMeasurement(String measurement) {
			this.measurement = measurement;
		}

		public List<PerformanceItemValue> getPoints() {
			return this.points;
		}

		public void setPoints(List<PerformanceItemValue> points) {
			this.points = points;
		}

		public static class PerformanceItemValue {

			private String value;

			private Long timestamp;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public Long getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(Long timestamp) {
				this.timestamp = timestamp;
			}
		}
	}

	@Override
	public DescribeDBInstancePerformanceResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstancePerformanceResponseUnmarshaller.unmarshall(this, context);
	}
}
