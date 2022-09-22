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

package com.aliyuncs.ga.model.v20191120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ga.transform.v20191120.ListListenerCertificatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListListenerCertificatesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private String nextToken;

	private Integer maxResults;

	private List<CertificatesItem> certificates;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<CertificatesItem> getCertificates() {
		return this.certificates;
	}

	public void setCertificates(List<CertificatesItem> certificates) {
		this.certificates = certificates;
	}

	public static class CertificatesItem {

		private String certificateId;

		private Boolean isDefault;

		private String domain;

		public String getCertificateId() {
			return this.certificateId;
		}

		public void setCertificateId(String certificateId) {
			this.certificateId = certificateId;
		}

		public Boolean getIsDefault() {
			return this.isDefault;
		}

		public void setIsDefault(Boolean isDefault) {
			this.isDefault = isDefault;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}
	}

	@Override
	public ListListenerCertificatesResponse getInstance(UnmarshallerContext context) {
		return	ListListenerCertificatesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
