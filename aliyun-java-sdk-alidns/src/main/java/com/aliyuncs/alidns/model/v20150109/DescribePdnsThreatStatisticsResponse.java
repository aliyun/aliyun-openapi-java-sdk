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
import com.aliyuncs.alidns.transform.v20150109.DescribePdnsThreatStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePdnsThreatStatisticsResponse extends AcsResponse {

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

		private String subDomain;

		private Long udpTotalCount;

		private Long totalCount;

		private String sourceIp;

		private String threatLevel;

		private String domainName;

		private String threatType;

		private String maxThreatLevel;

		private Long latestThreatTime;

		private Long dohTotalCount;

		private Long domainCount;

		public String getSubDomain() {
			return this.subDomain;
		}

		public void setSubDomain(String subDomain) {
			this.subDomain = subDomain;
		}

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

		public String getSourceIp() {
			return this.sourceIp;
		}

		public void setSourceIp(String sourceIp) {
			this.sourceIp = sourceIp;
		}

		public String getThreatLevel() {
			return this.threatLevel;
		}

		public void setThreatLevel(String threatLevel) {
			this.threatLevel = threatLevel;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getThreatType() {
			return this.threatType;
		}

		public void setThreatType(String threatType) {
			this.threatType = threatType;
		}

		public String getMaxThreatLevel() {
			return this.maxThreatLevel;
		}

		public void setMaxThreatLevel(String maxThreatLevel) {
			this.maxThreatLevel = maxThreatLevel;
		}

		public Long getLatestThreatTime() {
			return this.latestThreatTime;
		}

		public void setLatestThreatTime(Long latestThreatTime) {
			this.latestThreatTime = latestThreatTime;
		}

		public Long getDohTotalCount() {
			return this.dohTotalCount;
		}

		public void setDohTotalCount(Long dohTotalCount) {
			this.dohTotalCount = dohTotalCount;
		}

		public Long getDomainCount() {
			return this.domainCount;
		}

		public void setDomainCount(Long domainCount) {
			this.domainCount = domainCount;
		}
	}

	@Override
	public DescribePdnsThreatStatisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribePdnsThreatStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
