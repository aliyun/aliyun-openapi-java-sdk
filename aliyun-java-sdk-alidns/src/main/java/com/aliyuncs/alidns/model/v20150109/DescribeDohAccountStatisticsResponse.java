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

package com.aliyuncs.alidns.model.v20150109;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alidns.transform.v20150109.DescribeDohAccountStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDohAccountStatisticsResponse extends AcsResponse {

	private String requestId;

	private List<Statistic> statistics;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Statistic> getStatistics() {
		return this.statistics;
	}

	public void setStatistics(List<Statistic> statistics) {
		this.statistics = statistics;
	}

	public static class Statistic {

		private Long timestamp;

		private Long v4HttpCount;

		private Long v6HttpCount;

		private Long v4HttpsCount;

		private Long v6HttpsCount;

		private Long totalCount;

		public Long getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(Long timestamp) {
			this.timestamp = timestamp;
		}

		public Long getV4HttpCount() {
			return this.v4HttpCount;
		}

		public void setV4HttpCount(Long v4HttpCount) {
			this.v4HttpCount = v4HttpCount;
		}

		public Long getV6HttpCount() {
			return this.v6HttpCount;
		}

		public void setV6HttpCount(Long v6HttpCount) {
			this.v6HttpCount = v6HttpCount;
		}

		public Long getV4HttpsCount() {
			return this.v4HttpsCount;
		}

		public void setV4HttpsCount(Long v4HttpsCount) {
			this.v4HttpsCount = v4HttpsCount;
		}

		public Long getV6HttpsCount() {
			return this.v6HttpsCount;
		}

		public void setV6HttpsCount(Long v6HttpsCount) {
			this.v6HttpsCount = v6HttpsCount;
		}

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}
	}

	@Override
	public DescribeDohAccountStatisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDohAccountStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
