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

package com.aliyuncs.nis.model.v20211216;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.nis.transform.v20211216.GetNisNetworkMetricsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetNisNetworkMetricsResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String unit;

		private List<MetricsItem> metrics;

		public String getUnit() {
			return this.unit;
		}

		public void setUnit(String unit) {
			this.unit = unit;
		}

		public List<MetricsItem> getMetrics() {
			return this.metrics;
		}

		public void setMetrics(List<MetricsItem> metrics) {
			this.metrics = metrics;
		}

		public static class MetricsItem {

			private Long timeStamp;

			private Double value;

			public Long getTimeStamp() {
				return this.timeStamp;
			}

			public void setTimeStamp(Long timeStamp) {
				this.timeStamp = timeStamp;
			}

			public Double getValue() {
				return this.value;
			}

			public void setValue(Double value) {
				this.value = value;
			}
		}
	}

	@Override
	public GetNisNetworkMetricsResponse getInstance(UnmarshallerContext context) {
		return	GetNisNetworkMetricsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
