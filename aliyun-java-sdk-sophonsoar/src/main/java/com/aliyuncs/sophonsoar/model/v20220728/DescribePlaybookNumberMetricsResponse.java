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

package com.aliyuncs.sophonsoar.model.v20220728;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sophonsoar.transform.v20220728.DescribePlaybookNumberMetricsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePlaybookNumberMetricsResponse extends AcsResponse {

	private String requestId;

	private Metrics metrics;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Metrics getMetrics() {
		return this.metrics;
	}

	public void setMetrics(Metrics metrics) {
		this.metrics = metrics;
	}

	public static class Metrics {

		private Integer totalNum;

		private Integer startUpNum;

		public Integer getTotalNum() {
			return this.totalNum;
		}

		public void setTotalNum(Integer totalNum) {
			this.totalNum = totalNum;
		}

		public Integer getStartUpNum() {
			return this.startUpNum;
		}

		public void setStartUpNum(Integer startUpNum) {
			this.startUpNum = startUpNum;
		}
	}

	@Override
	public DescribePlaybookNumberMetricsResponse getInstance(UnmarshallerContext context) {
		return	DescribePlaybookNumberMetricsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
