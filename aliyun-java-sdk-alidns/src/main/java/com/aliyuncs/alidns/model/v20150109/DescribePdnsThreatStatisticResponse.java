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
import com.aliyuncs.alidns.transform.v20150109.DescribePdnsThreatStatisticResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePdnsThreatStatisticResponse extends AcsResponse {

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

		private Long totalCount;

		private String threatLevel;

		private String threatType;

		private Long timestamp;

		private Long dohTotalCount;

		public Long getUdpTotalCount() {
			return this.udpTotalCount;
		}

		public void setUdpTotalCount(Long udpTotalCount) {
			this.udpTotalCount = udpTotalCount;
		}

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public String getThreatLevel() {
			return this.threatLevel;
		}

		public void setThreatLevel(String threatLevel) {
			this.threatLevel = threatLevel;
		}

		public String getThreatType() {
			return this.threatType;
		}

		public void setThreatType(String threatType) {
			this.threatType = threatType;
		}

		public Long getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(Long timestamp) {
			this.timestamp = timestamp;
		}

		public Long getDohTotalCount() {
			return this.dohTotalCount;
		}

		public void setDohTotalCount(Long dohTotalCount) {
			this.dohTotalCount = dohTotalCount;
		}
	}

	@Override
	public DescribePdnsThreatStatisticResponse getInstance(UnmarshallerContext context) {
		return	DescribePdnsThreatStatisticResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
