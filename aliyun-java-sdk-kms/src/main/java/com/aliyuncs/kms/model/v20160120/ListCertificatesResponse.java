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

package com.aliyuncs.kms.model.v20160120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.kms.transform.v20160120.ListCertificatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCertificatesResponse extends AcsResponse {

	private String requestId;

	private Integer totalSize;

	private Integer pageNumber;

	private Integer pageSize;

	private List<CertificateSummary> certificateSummaryList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalSize() {
		return this.totalSize;
	}

	public void setTotalSize(Integer totalSize) {
		this.totalSize = totalSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<CertificateSummary> getCertificateSummaryList() {
		return this.certificateSummaryList;
	}

	public void setCertificateSummaryList(List<CertificateSummary> certificateSummaryList) {
		this.certificateSummaryList = certificateSummaryList;
	}

	public static class CertificateSummary {

		private String certificateId;

		private String subject;

		private String issuer;

		private String keySpec;

		private String protectionLevel;

		private String notBefore;

		private String notAfter;

		private String status;

		public String getCertificateId() {
			return this.certificateId;
		}

		public void setCertificateId(String certificateId) {
			this.certificateId = certificateId;
		}

		public String getSubject() {
			return this.subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

		public String getIssuer() {
			return this.issuer;
		}

		public void setIssuer(String issuer) {
			this.issuer = issuer;
		}

		public String getKeySpec() {
			return this.keySpec;
		}

		public void setKeySpec(String keySpec) {
			this.keySpec = keySpec;
		}

		public String getProtectionLevel() {
			return this.protectionLevel;
		}

		public void setProtectionLevel(String protectionLevel) {
			this.protectionLevel = protectionLevel;
		}

		public String getNotBefore() {
			return this.notBefore;
		}

		public void setNotBefore(String notBefore) {
			this.notBefore = notBefore;
		}

		public String getNotAfter() {
			return this.notAfter;
		}

		public void setNotAfter(String notAfter) {
			this.notAfter = notAfter;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public ListCertificatesResponse getInstance(UnmarshallerContext context) {
		return	ListCertificatesResponseUnmarshaller.unmarshall(this, context);
	}
}
