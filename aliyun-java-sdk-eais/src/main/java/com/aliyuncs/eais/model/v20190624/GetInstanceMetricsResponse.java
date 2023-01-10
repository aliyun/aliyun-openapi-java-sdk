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

package com.aliyuncs.eais.model.v20190624;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eais.transform.v20190624.GetInstanceMetricsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceMetricsResponse extends AcsResponse {

	private String requestId;

	private String instanceId;

	private List<PodMetric> podMetrics;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public List<PodMetric> getPodMetrics() {
		return this.podMetrics;
	}

	public void setPodMetrics(List<PodMetric> podMetrics) {
		this.podMetrics = podMetrics;
	}

	public static class PodMetric {

		private String podId;

		private List<Metric> metrics;

		public String getPodId() {
			return this.podId;
		}

		public void setPodId(String podId) {
			this.podId = podId;
		}

		public List<Metric> getMetrics() {
			return this.metrics;
		}

		public void setMetrics(List<Metric> metrics) {
			this.metrics = metrics;
		}

		public static class Metric {

			private String time;

			private String value;

			public String getTime() {
				return this.time;
			}

			public void setTime(String time) {
				this.time = time;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public GetInstanceMetricsResponse getInstance(UnmarshallerContext context) {
		return	GetInstanceMetricsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
