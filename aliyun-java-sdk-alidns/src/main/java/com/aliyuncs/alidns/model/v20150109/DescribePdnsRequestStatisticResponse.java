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
import com.aliyuncs.alidns.transform.v20150109.DescribePdnsRequestStatisticResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePdnsRequestStatisticResponse extends AcsResponse {

	private String requestId;

	private List<StatisticItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<StatisticItem> getData() {
		return this.data;
	}

	public void setData(List<StatisticItem> data) {
		this.data = data;
	}

	public static class StatisticItem {

		private Long udpTotalCount;

		private Long ipCount;

		private Long totalCount;

		private Long v4HttpCount;

		private Long v6HttpCount;

		private Long v4Count;

		private Long httpsCount;

		private Long httpCount;

		private Long v4HttpsCount;

		private Long timestamp;

		private Long v6HttpsCount;

		private Long dohTotalCount;

		private Long v6Count;

		public Long getUdpTotalCount() {
			return this.udpTotalCount;
		}

		public void setUdpTotalCount(Long udpTotalCount) {
			this.udpTotalCount = udpTotalCount;
		}

		public Long getIpCount() {
			return this.ipCount;
		}

		public void setIpCount(Long ipCount) {
			this.ipCount = ipCount;
		}

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
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

		public Long getV4Count() {
			return this.v4Count;
		}

		public void setV4Count(Long v4Count) {
			this.v4Count = v4Count;
		}

		public Long getHttpsCount() {
			return this.httpsCount;
		}

		public void setHttpsCount(Long httpsCount) {
			this.httpsCount = httpsCount;
		}

		public Long getHttpCount() {
			return this.httpCount;
		}

		public void setHttpCount(Long httpCount) {
			this.httpCount = httpCount;
		}

		public Long getV4HttpsCount() {
			return this.v4HttpsCount;
		}

		public void setV4HttpsCount(Long v4HttpsCount) {
			this.v4HttpsCount = v4HttpsCount;
		}

		public Long getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(Long timestamp) {
			this.timestamp = timestamp;
		}

		public Long getV6HttpsCount() {
			return this.v6HttpsCount;
		}

		public void setV6HttpsCount(Long v6HttpsCount) {
			this.v6HttpsCount = v6HttpsCount;
		}

		public Long getDohTotalCount() {
			return this.dohTotalCount;
		}

		public void setDohTotalCount(Long dohTotalCount) {
			this.dohTotalCount = dohTotalCount;
		}

		public Long getV6Count() {
			return this.v6Count;
		}

		public void setV6Count(Long v6Count) {
			this.v6Count = v6Count;
		}
	}

	@Override
	public DescribePdnsRequestStatisticResponse getInstance(UnmarshallerContext context) {
		return	DescribePdnsRequestStatisticResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
