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

package com.aliyuncs.paielasticdatasetaccelerator.model.v20220801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.paielasticdatasetaccelerator.transform.v20220801.QuerySlotMetricsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySlotMetricsResponse extends AcsResponse {

	private String requestId;

	private String period;

	private List<MetricsItem> metrics;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getPeriod() {
		return this.period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public List<MetricsItem> getMetrics() {
		return this.metrics;
	}

	public void setMetrics(List<MetricsItem> metrics) {
		this.metrics = metrics;
	}

	public static class MetricsItem {

		private String timestamp;

		private Double value;

		public String getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}

		public Double getValue() {
			return this.value;
		}

		public void setValue(Double value) {
			this.value = value;
		}
	}

	@Override
	public QuerySlotMetricsResponse getInstance(UnmarshallerContext context) {
		return	QuerySlotMetricsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
