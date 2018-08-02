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

package com.aliyuncs.petadata.model.v20160101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.petadata.transform.v20160101.DescribeInstancePerformanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstancePerformanceResponse extends AcsResponse {

	private String requestId;

	private List<MonitorData> monitorDatas;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<MonitorData> getMonitorDatas() {
		return this.monitorDatas;
	}

	public void setMonitorDatas(List<MonitorData> monitorDatas) {
		this.monitorDatas = monitorDatas;
	}

	public static class MonitorData {

		private String key;

		private String unit;

		private List<PerformanceValue> performanceValues;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getUnit() {
			return this.unit;
		}

		public void setUnit(String unit) {
			this.unit = unit;
		}

		public List<PerformanceValue> getPerformanceValues() {
			return this.performanceValues;
		}

		public void setPerformanceValues(List<PerformanceValue> performanceValues) {
			this.performanceValues = performanceValues;
		}

		public static class PerformanceValue {

			private String value;

			private String date;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getDate() {
				return this.date;
			}

			public void setDate(String date) {
				this.date = date;
			}
		}
	}

	@Override
	public DescribeInstancePerformanceResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstancePerformanceResponseUnmarshaller.unmarshall(this, context);
	}
}
