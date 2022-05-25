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

package com.aliyuncs.cms.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20190101.DescribeHybridMonitorDataListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHybridMonitorDataListResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private String success;

	private List<TimeSeriesItem> timeSeries;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public List<TimeSeriesItem> getTimeSeries() {
		return this.timeSeries;
	}

	public void setTimeSeries(List<TimeSeriesItem> timeSeries) {
		this.timeSeries = timeSeries;
	}

	public static class TimeSeriesItem {

		private String metricName;

		private List<Label> labels;

		private List<Value> values;

		public String getMetricName() {
			return this.metricName;
		}

		public void setMetricName(String metricName) {
			this.metricName = metricName;
		}

		public List<Label> getLabels() {
			return this.labels;
		}

		public void setLabels(List<Label> labels) {
			this.labels = labels;
		}

		public List<Value> getValues() {
			return this.values;
		}

		public void setValues(List<Value> values) {
			this.values = values;
		}

		public static class Label {

			private String k;

			private String v;

			public String getK() {
				return this.k;
			}

			public void setK(String k) {
				this.k = k;
			}

			public String getV() {
				return this.v;
			}

			public void setV(String v) {
				this.v = v;
			}
		}

		public static class Value {

			private String v;

			private String ts;

			public String getV() {
				return this.v;
			}

			public void setV(String v) {
				this.v = v;
			}

			public String getTs() {
				return this.ts;
			}

			public void setTs(String ts) {
				this.ts = ts;
			}
		}
	}

	@Override
	public DescribeHybridMonitorDataListResponse getInstance(UnmarshallerContext context) {
		return	DescribeHybridMonitorDataListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
