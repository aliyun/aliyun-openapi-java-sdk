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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.alidns.transform.v20150109.DescribePdnsAccountSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePdnsAccountSummaryResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long totalCount;

		private Long threatCount;

		private Long userId;

		private Long httpsCount;

		private Long httpCount;

		private Long subDomainCount;

		private Long domainCount;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public Long getThreatCount() {
			return this.threatCount;
		}

		public void setThreatCount(Long threatCount) {
			this.threatCount = threatCount;
		}

		public Long getUserId() {
			return this.userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
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

		public Long getSubDomainCount() {
			return this.subDomainCount;
		}

		public void setSubDomainCount(Long subDomainCount) {
			this.subDomainCount = subDomainCount;
		}

		public Long getDomainCount() {
			return this.domainCount;
		}

		public void setDomainCount(Long domainCount) {
			this.domainCount = domainCount;
		}
	}

	@Override
	public DescribePdnsAccountSummaryResponse getInstance(UnmarshallerContext context) {
		return	DescribePdnsAccountSummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
