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
import com.aliyuncs.alidns.transform.v20150109.DescribePdnsRequestStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePdnsRequestStatisticsResponse extends AcsResponse {

	private Long totalCount;

	private String requestId;

	private Long pageSize;

	private Long pageNumber;

	private List<StatisticItem> data;

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
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

		private String domainName;

		private Long v6HttpCount;

		private Long v4Count;

		private Long httpsCount;

		private Long v4HttpsCount;

		private Long v6Count;

		private String subDomain;

		private Long totalCount;

		private Long v4HttpCount;

		private Long threatCount;

		private String maxThreatLevel;

		private Long httpCount;

		private Long v6HttpsCount;

		private Long dohTotalCount;

		private List<ThreatItem> threatInfo;

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

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
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

		public Long getV4HttpsCount() {
			return this.v4HttpsCount;
		}

		public void setV4HttpsCount(Long v4HttpsCount) {
			this.v4HttpsCount = v4HttpsCount;
		}

		public Long getV6Count() {
			return this.v6Count;
		}

		public void setV6Count(Long v6Count) {
			this.v6Count = v6Count;
		}

		public String getSubDomain() {
			return this.subDomain;
		}

		public void setSubDomain(String subDomain) {
			this.subDomain = subDomain;
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

		public Long getThreatCount() {
			return this.threatCount;
		}

		public void setThreatCount(Long threatCount) {
			this.threatCount = threatCount;
		}

		public String getMaxThreatLevel() {
			return this.maxThreatLevel;
		}

		public void setMaxThreatLevel(String maxThreatLevel) {
			this.maxThreatLevel = maxThreatLevel;
		}

		public Long getHttpCount() {
			return this.httpCount;
		}

		public void setHttpCount(Long httpCount) {
			this.httpCount = httpCount;
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

		public List<ThreatItem> getThreatInfo() {
			return this.threatInfo;
		}

		public void setThreatInfo(List<ThreatItem> threatInfo) {
			this.threatInfo = threatInfo;
		}

		public static class ThreatItem {

			private String threatLevel;

			private String threatType;

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
		}
	}

	@Override
	public DescribePdnsRequestStatisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribePdnsRequestStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
