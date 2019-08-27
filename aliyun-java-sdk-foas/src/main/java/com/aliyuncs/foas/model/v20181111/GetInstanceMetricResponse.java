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

package com.aliyuncs.foas.model.v20181111;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.foas.transform.v20181111.GetInstanceMetricResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceMetricResponse extends AcsResponse {

	private String requestId;

	private List<Metric> metrics;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Metric> getMetrics() {
		return this.metrics;
	}

	public void setMetrics(List<Metric> metrics) {
		this.metrics = metrics;
	}

	public static class Metric {

		private String metricName;

		private Map<Object,Object> dps;

		private Float summary;

		private Map<Object,Object> tags;

		public String getMetricName() {
			return this.metricName;
		}

		public void setMetricName(String metricName) {
			this.metricName = metricName;
		}

		public Map<Object,Object> getDps() {
			return this.dps;
		}

		public void setDps(Map<Object,Object> dps) {
			this.dps = dps;
		}

		public Float getSummary() {
			return this.summary;
		}

		public void setSummary(Float summary) {
			this.summary = summary;
		}

		public Map<Object,Object> getTags() {
			return this.tags;
		}

		public void setTags(Map<Object,Object> tags) {
			this.tags = tags;
		}
	}

	@Override
	public GetInstanceMetricResponse getInstance(UnmarshallerContext context) {
		return	GetInstanceMetricResponseUnmarshaller.unmarshall(this, context);
	}
}
