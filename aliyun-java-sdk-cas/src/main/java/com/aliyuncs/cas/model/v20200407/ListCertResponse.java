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

package com.aliyuncs.cas.model.v20200407;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cas.transform.v20200407.ListCertResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCertResponse extends AcsResponse {

	private Long showSize;

	private Long currentPage;

	private Long totalCount;

	private String requestId;

	private List<Cert> certList;

	public Long getShowSize() {
		return this.showSize;
	}

	public void setShowSize(Long showSize) {
		this.showSize = showSize;
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

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

	public List<Cert> getCertList() {
		return this.certList;
	}

	public void setCertList(List<Cert> certList) {
		this.certList = certList;
	}

	public static class Cert {

		private Long whId;

		private String identifier;

		private String whInstanceId;

		private String status;

		private String sourceType;

		private String certType;

		private String commonName;

		private Long beforeDate;

		private String issuer;

		private Long afterDate;

		private Boolean existPrivateKey;

		private String sans;

		public Long getWhId() {
			return this.whId;
		}

		public void setWhId(Long whId) {
			this.whId = whId;
		}

		public String getIdentifier() {
			return this.identifier;
		}

		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}

		public String getWhInstanceId() {
			return this.whInstanceId;
		}

		public void setWhInstanceId(String whInstanceId) {
			this.whInstanceId = whInstanceId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public String getCertType() {
			return this.certType;
		}

		public void setCertType(String certType) {
			this.certType = certType;
		}

		public String getCommonName() {
			return this.commonName;
		}

		public void setCommonName(String commonName) {
			this.commonName = commonName;
		}

		public Long getBeforeDate() {
			return this.beforeDate;
		}

		public void setBeforeDate(Long beforeDate) {
			this.beforeDate = beforeDate;
		}

		public String getIssuer() {
			return this.issuer;
		}

		public void setIssuer(String issuer) {
			this.issuer = issuer;
		}

		public Long getAfterDate() {
			return this.afterDate;
		}

		public void setAfterDate(Long afterDate) {
			this.afterDate = afterDate;
		}

		public Boolean getExistPrivateKey() {
			return this.existPrivateKey;
		}

		public void setExistPrivateKey(Boolean existPrivateKey) {
			this.existPrivateKey = existPrivateKey;
		}

		public String getSans() {
			return this.sans;
		}

		public void setSans(String sans) {
			this.sans = sans;
		}
	}

	@Override
	public ListCertResponse getInstance(UnmarshallerContext context) {
		return	ListCertResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
