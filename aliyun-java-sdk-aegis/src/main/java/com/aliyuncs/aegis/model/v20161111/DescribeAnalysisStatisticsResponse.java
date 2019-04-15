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

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeAnalysisStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAnalysisStatisticsResponse extends AcsResponse {

	private String requestId;

	private Statistics statistics;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Statistics getStatistics() {
		return this.statistics;
	}

	public void setStatistics(Statistics statistics) {
		this.statistics = statistics;
	}

	public static class Statistics {

		private Integer total;

		private Integer serious;

		private Integer suspicious;

		private Integer remind;

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public Integer getSerious() {
			return this.serious;
		}

		public void setSerious(Integer serious) {
			this.serious = serious;
		}

		public Integer getSuspicious() {
			return this.suspicious;
		}

		public void setSuspicious(Integer suspicious) {
			this.suspicious = suspicious;
		}

		public Integer getRemind() {
			return this.remind;
		}

		public void setRemind(Integer remind) {
			this.remind = remind;
		}
	}

	@Override
	public DescribeAnalysisStatisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAnalysisStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
