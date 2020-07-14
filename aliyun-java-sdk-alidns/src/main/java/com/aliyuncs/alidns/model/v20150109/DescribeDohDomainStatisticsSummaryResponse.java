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
import com.aliyuncs.alidns.transform.v20150109.DescribeDohDomainStatisticsSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDohDomainStatisticsSummaryResponse extends AcsResponse {

	private String requestId;

	private Integer totalItems;

	private Integer totalPages;

	private Integer pageSize;

	private Integer pageNumber;

	private List<Statistic> statistics;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalItems() {
		return this.totalItems;
	}

	public void setTotalItems(Integer totalItems) {
		this.totalItems = totalItems;
	}

	public Integer getTotalPages() {
		return this.totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<Statistic> getStatistics() {
		return this.statistics;
	}

	public void setStatistics(List<Statistic> statistics) {
		this.statistics = statistics;
	}

	public static class Statistic {

		private String domainName;

		private Long v4HttpCount;

		private Long v6HttpCount;

		private Long v4HttpsCount;

		private Long v6HttpsCount;

		private Long totalCount;

		private Long ipCount;

		private Long httpCount;

		private Long httpsCount;

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
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

		public Long getIpCount() {
			return this.ipCount;
		}

		public void setIpCount(Long ipCount) {
			this.ipCount = ipCount;
		}

		public Long getHttpCount() {
			return this.httpCount;
		}

		public void setHttpCount(Long httpCount) {
			this.httpCount = httpCount;
		}

		public Long getHttpsCount() {
			return this.httpsCount;
		}

		public void setHttpsCount(Long httpsCount) {
			this.httpsCount = httpsCount;
		}
	}

	@Override
	public DescribeDohDomainStatisticsSummaryResponse getInstance(UnmarshallerContext context) {
		return	DescribeDohDomainStatisticsSummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
