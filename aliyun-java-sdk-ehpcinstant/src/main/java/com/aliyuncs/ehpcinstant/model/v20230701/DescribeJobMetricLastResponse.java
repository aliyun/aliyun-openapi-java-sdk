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

package com.aliyuncs.ehpcinstant.model.v20230701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpcinstant.transform.v20230701.DescribeJobMetricLastResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeJobMetricLastResponse extends AcsResponse {

	private String requestId;

	private List<MetricInfo> metrics;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<MetricInfo> getMetrics() {
		return this.metrics;
	}

	public void setMetrics(List<MetricInfo> metrics) {
		this.metrics = metrics;
	}

	public static class MetricInfo {

		private Integer arrayIndex;

		private String metric;

		public Integer getArrayIndex() {
			return this.arrayIndex;
		}

		public void setArrayIndex(Integer arrayIndex) {
			this.arrayIndex = arrayIndex;
		}

		public String getMetric() {
			return this.metric;
		}

		public void setMetric(String metric) {
			this.metric = metric;
		}
	}

	@Override
	public DescribeJobMetricLastResponse getInstance(UnmarshallerContext context) {
		return	DescribeJobMetricLastResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
