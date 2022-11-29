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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cas.transform.v20200630.DescribeCACertificateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCACertificateResponse extends AcsResponse {

	private String requestId;

	private Integer years;

	private Certificate certificate;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getYears() {
		return this.years;
	}

	public void setYears(Integer years) {
		this.years = years;
	}

	public Certificate getCertificate() {
		return this.certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}

	public static class Certificate {

		private String certificateType;

		private String x509Certificate;

		private String identifier;

		private String serialNumber;

		private String subjectDN;

		private String commonName;

		private String organizationUnit;

		private String organization;

		private String locality;

		private String state;

		private String countryCode;

		private String sans;

		private String status;

		private String algorithm;

		private Integer keySize;

		private String signAlgorithm;

		private Long beforeDate;

		private Long afterDate;

		private String parentIdentifier;

		private String sha2;

		private String md5;

		private String crlStatus;

		private String crlUrl;

		public String getCertificateType() {
			return this.certificateType;
		}

		public void setCertificateType(String certificateType) {
			this.certificateType = certificateType;
		}

		public String getX509Certificate() {
			return this.x509Certificate;
		}

		public void setX509Certificate(String x509Certificate) {
			this.x509Certificate = x509Certificate;
		}

		public String getIdentifier() {
			return this.identifier;
		}

		public void setIdentifier(String identifier) {
			this.identifier = identifier;
		}

		public String getSerialNumber() {
			return this.serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}

		public String getSubjectDN() {
			return this.subjectDN;
		}

		public void setSubjectDN(String subjectDN) {
			this.subjectDN = subjectDN;
		}

		public String getCommonName() {
			return this.commonName;
		}

		public void setCommonName(String commonName) {
			this.commonName = commonName;
		}

		public String getOrganizationUnit() {
			return this.organizationUnit;
		}

		public void setOrganizationUnit(String organizationUnit) {
			this.organizationUnit = organizationUnit;
		}

		public String getOrganization() {
			return this.organization;
		}

		public void setOrganization(String organization) {
			this.organization = organization;
		}

		public String getLocality() {
			return this.locality;
		}

		public void setLocality(String locality) {
			this.locality = locality;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getCountryCode() {
			return this.countryCode;
		}

		public void setCountryCode(String countryCode) {
			this.countryCode = countryCode;
		}

		public String getSans() {
			return this.sans;
		}

		public void setSans(String sans) {
			this.sans = sans;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getAlgorithm() {
			return this.algorithm;
		}

		public void setAlgorithm(String algorithm) {
			this.algorithm = algorithm;
		}

		public Integer getKeySize() {
			return this.keySize;
		}

		public void setKeySize(Integer keySize) {
			this.keySize = keySize;
		}

		public String getSignAlgorithm() {
			return this.signAlgorithm;
		}

		public void setSignAlgorithm(String signAlgorithm) {
			this.signAlgorithm = signAlgorithm;
		}

		public Long getBeforeDate() {
			return this.beforeDate;
		}

		public void setBeforeDate(Long beforeDate) {
			this.beforeDate = beforeDate;
		}

		public Long getAfterDate() {
			return this.afterDate;
		}

		public void setAfterDate(Long afterDate) {
			this.afterDate = afterDate;
		}

		public String getParentIdentifier() {
			return this.parentIdentifier;
		}

		public void setParentIdentifier(String parentIdentifier) {
			this.parentIdentifier = parentIdentifier;
		}

		public String getSha2() {
			return this.sha2;
		}

		public void setSha2(String sha2) {
			this.sha2 = sha2;
		}

		public String getMd5() {
			return this.md5;
		}

		public void setMd5(String md5) {
			this.md5 = md5;
		}

		public String getCrlStatus() {
			return this.crlStatus;
		}

		public void setCrlStatus(String crlStatus) {
			this.crlStatus = crlStatus;
		}

		public String getCrlUrl() {
			return this.crlUrl;
		}

		public void setCrlUrl(String crlUrl) {
			this.crlUrl = crlUrl;
		}
	}

	@Override
	public DescribeCACertificateResponse getInstance(UnmarshallerContext context) {
		return	DescribeCACertificateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
