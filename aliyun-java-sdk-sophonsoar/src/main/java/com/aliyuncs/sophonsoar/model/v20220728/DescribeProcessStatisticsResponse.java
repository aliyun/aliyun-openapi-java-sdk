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
import com.aliyuncs.sophonsoar.transform.v20220728.DescribeProcessStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeProcessStatisticsResponse extends AcsResponse {

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

		private Integer taskNum;

		private Integer banIpNum;

		private Integer banFileNum;

		private Integer banProcessNum;

		public Integer getTaskNum() {
			return this.taskNum;
		}

		public void setTaskNum(Integer taskNum) {
			this.taskNum = taskNum;
		}

		public Integer getBanIpNum() {
			return this.banIpNum;
		}

		public void setBanIpNum(Integer banIpNum) {
			this.banIpNum = banIpNum;
		}

		public Integer getBanFileNum() {
			return this.banFileNum;
		}

		public void setBanFileNum(Integer banFileNum) {
			this.banFileNum = banFileNum;
		}

		public Integer getBanProcessNum() {
			return this.banProcessNum;
		}

		public void setBanProcessNum(Integer banProcessNum) {
			this.banProcessNum = banProcessNum;
		}
	}

	@Override
	public DescribeProcessStatisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribeProcessStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
