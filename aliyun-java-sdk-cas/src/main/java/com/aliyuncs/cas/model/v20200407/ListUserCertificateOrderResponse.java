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
import com.aliyuncs.cas.transform.v20200407.ListUserCertificateOrderResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUserCertificateOrderResponse extends AcsResponse {

	private Long showSize;

	private Long currentPage;

	private Long totalCount;

	private String requestId;

	private List<CertificateOrderListItem> certificateOrderList;

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

	public List<CertificateOrderListItem> getCertificateOrderList() {
		return this.certificateOrderList;
	}

	public void setCertificateOrderList(List<CertificateOrderListItem> certificateOrderList) {
		this.certificateOrderList = certificateOrderList;
	}

	public static class CertificateOrderListItem {

		private String algorithm;

		private Long aliyunOrderId;

		private Long buyDate;

		private Long certEndTime;

		private Long certStartTime;

		private String certType;

		private String domain;

		private Long domainCount;

		private String domainType;

		private String instanceId;

		private Long orderId;

		private String partnerOrderId;

		private String productCode;

		private String productName;

		private String rootBrand;

		private String sourceType;

		private String status;

		private String trusteeStatus;

		private Long wildDomainCount;

		private Long certificateId;

		private String name;

		private String commonName;

		private String fingerprint;

		private String sha2;

		private String serialNo;

		private String issuer;

		private String orgName;

		private String province;

		private String city;

		private String country;

		private String sans;

		private Boolean expired;

		private Boolean upload;

		private String startDate;

		private String endDate;

		public String getAlgorithm() {
			return this.algorithm;
		}

		public void setAlgorithm(String algorithm) {
			this.algorithm = algorithm;
		}

		public Long getAliyunOrderId() {
			return this.aliyunOrderId;
		}

		public void setAliyunOrderId(Long aliyunOrderId) {
			this.aliyunOrderId = aliyunOrderId;
		}

		public Long getBuyDate() {
			return this.buyDate;
		}

		public void setBuyDate(Long buyDate) {
			this.buyDate = buyDate;
		}

		public Long getCertEndTime() {
			return this.certEndTime;
		}

		public void setCertEndTime(Long certEndTime) {
			this.certEndTime = certEndTime;
		}

		public Long getCertStartTime() {
			return this.certStartTime;
		}

		public void setCertStartTime(Long certStartTime) {
			this.certStartTime = certStartTime;
		}

		public String getCertType() {
			return this.certType;
		}

		public void setCertType(String certType) {
			this.certType = certType;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public Long getDomainCount() {
			return this.domainCount;
		}

		public void setDomainCount(Long domainCount) {
			this.domainCount = domainCount;
		}

		public String getDomainType() {
			return this.domainType;
		}

		public void setDomainType(String domainType) {
			this.domainType = domainType;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getOrderId() {
			return this.orderId;
		}

		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}

		public String getPartnerOrderId() {
			return this.partnerOrderId;
		}

		public void setPartnerOrderId(String partnerOrderId) {
			this.partnerOrderId = partnerOrderId;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getRootBrand() {
			return this.rootBrand;
		}

		public void setRootBrand(String rootBrand) {
			this.rootBrand = rootBrand;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTrusteeStatus() {
			return this.trusteeStatus;
		}

		public void setTrusteeStatus(String trusteeStatus) {
			this.trusteeStatus = trusteeStatus;
		}

		public Long getWildDomainCount() {
			return this.wildDomainCount;
		}

		public void setWildDomainCount(Long wildDomainCount) {
			this.wildDomainCount = wildDomainCount;
		}

		public Long getCertificateId() {
			return this.certificateId;
		}

		public void setCertificateId(Long certificateId) {
			this.certificateId = certificateId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCommonName() {
			return this.commonName;
		}

		public void setCommonName(String commonName) {
			this.commonName = commonName;
		}

		public String getFingerprint() {
			return this.fingerprint;
		}

		public void setFingerprint(String fingerprint) {
			this.fingerprint = fingerprint;
		}

		public String getSha2() {
			return this.sha2;
		}

		public void setSha2(String sha2) {
			this.sha2 = sha2;
		}

		public String getSerialNo() {
			return this.serialNo;
		}

		public void setSerialNo(String serialNo) {
			this.serialNo = serialNo;
		}

		public String getIssuer() {
			return this.issuer;
		}

		public void setIssuer(String issuer) {
			this.issuer = issuer;
		}

		public String getOrgName() {
			return this.orgName;
		}

		public void setOrgName(String orgName) {
			this.orgName = orgName;
		}

		public String getProvince() {
			return this.province;
		}

		public void setProvince(String province) {
			this.province = province;
		}

		public String getCity() {
			return this.city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getCountry() {
			return this.country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getSans() {
			return this.sans;
		}

		public void setSans(String sans) {
			this.sans = sans;
		}

		public Boolean getExpired() {
			return this.expired;
		}

		public void setExpired(Boolean expired) {
			this.expired = expired;
		}

		public Boolean getUpload() {
			return this.upload;
		}

		public void setUpload(Boolean upload) {
			this.upload = upload;
		}

		public String getStartDate() {
			return this.startDate;
		}

		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}

		public String getEndDate() {
			return this.endDate;
		}

		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}
	}

	@Override
	public ListUserCertificateOrderResponse getInstance(UnmarshallerContext context) {
		return	ListUserCertificateOrderResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
