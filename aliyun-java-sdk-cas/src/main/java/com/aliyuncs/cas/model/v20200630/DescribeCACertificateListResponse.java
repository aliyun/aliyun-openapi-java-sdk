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

package com.aliyuncs.cas.model.v20200630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cas.transform.v20200630.DescribeCACertificateListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCACertificateListResponse extends AcsResponse {

	private Integer currentPage;

	private String requestId;

	private Integer totalCount;

	private Integer pageCount;

	private Integer showSize;

	private List<Certificate> certificateList;

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

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

	public Integer getPageCount() {
		return this.pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public Integer getShowSize() {
		return this.showSize;
	}

	public void setShowSize(Integer showSize) {
		this.showSize = showSize;
	}

	public List<Certificate> getCertificateList() {
		return this.certificateList;
	}

	public void setCertificateList(List<Certificate> certificateList) {
		this.certificateList = certificateList;
	}

	public static class Certificate {

		private Integer years;

		private String status;

		private String serialNumber;

		private String certificateType;

		private String algorithm;

		private String state;

		private String organization;

		private String parentIdentifier;

		private String locality;

		private String identifier;

		private String sans;

		private Integer keySize;

		private String x509Certificate;

		private String subjectDN;

		private String signAlgorithm;

		private String organizationUnit;

		private Long afterDate;

		private String sha2;

		private String commonName;

		private String md5;

		private String countryCode;

		private Long beforeDate;

		public Integer getYears() {
			return this.years;
		}

		public void setYears(Integer years) {
			this.years = years;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getSerialNumber() {
			return this.serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}

		public String getCertificateType() {
			return this.certificateType;
		}

		public void setCertificateType(String certificateType) {
			this.certificateType = certificateType;
		}

		public String getAlgorithm() {
			return this.algorithm;
		}

		public void setAlgorithm(String algorithm) {
			this.algorithm = algorithm;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getOrganization() {
			return this.organization;
		}

		public void setOrganization(String organization) {
			this.organization = organization;
		}

		public String getParentIdentifier() {
			return this.parentIdentifier;
		}

		public void setParentIdentifier(String parentIdentifier) {
			this.parentIdentifier = parentIdentifier;
		}

		public String getLocality() {
			return this.locality;
		}

		public void setLocality(String locality) {
			this.locality = locality;
		}

		public String getIdentifier() {
			return this.identifier;
		}

		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}

		public String getSans() {
			return this.sans;
		}

		public void setSans(String sans) {
			this.sans = sans;
		}

		public Integer getKeySize() {
			return this.keySize;
		}

		public void setKeySize(Integer keySize) {
			this.keySize = keySize;
		}

		public String getX509Certificate() {
			return this.x509Certificate;
		}

		public void setX509Certificate(String x509Certificate) {
			this.x509Certificate = x509Certificate;
		}

		public String getSubjectDN() {
			return this.subjectDN;
		}

		public void setSubjectDN(String subjectDN) {
			this.subjectDN = subjectDN;
		}

		public String getSignAlgorithm() {
			return this.signAlgorithm;
		}

		public void setSignAlgorithm(String signAlgorithm) {
			this.signAlgorithm = signAlgorithm;
		}

		public String getOrganizationUnit() {
			return this.organizationUnit;
		}

		public void setOrganizationUnit(String organizationUnit) {
			this.organizationUnit = organizationUnit;
		}

		public Long getAfterDate() {
			return this.afterDate;
		}

		public void setAfterDate(Long afterDate) {
			this.afterDate = afterDate;
		}

		public String getSha2() {
			return this.sha2;
		}

		public void setSha2(String sha2) {
			this.sha2 = sha2;
		}

		public String getCommonName() {
			return this.commonName;
		}

		public void setCommonName(String commonName) {
			this.commonName = commonName;
		}

		public String getMd5() {
			return this.md5;
		}

		public void setMd5(String md5) {
			this.md5 = md5;
		}

		public String getCountryCode() {
			return this.countryCode;
		}

		public void setCountryCode(String countryCode) {
			this.countryCode = countryCode;
		}

		public Long getBeforeDate() {
			return this.beforeDate;
		}

		public void setBeforeDate(Long beforeDate) {
			this.beforeDate = beforeDate;
		}
	}

	@Override
	public DescribeCACertificateListResponse getInstance(UnmarshallerContext context) {
		return	DescribeCACertificateListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
