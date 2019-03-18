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

package com.aliyuncs.cas.model.v20180813;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cas.transform.v20180813.DescribeCertificateListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCertificateListResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer showSize;

	private Integer currentPage;

	private List<Certificate> certificateList;

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

	public Integer getShowSize() {
		return this.showSize;
	}

	public void setShowSize(Integer showSize) {
		this.showSize = showSize;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public List<Certificate> getCertificateList() {
		return this.certificateList;
	}

	public void setCertificateList(List<Certificate> certificateList) {
		this.certificateList = certificateList;
	}

	public static class Certificate {

		private Long id;

		private String name;

		private String sourceType;

		private String certType;

		private String instanceId;

		private Long orderId;

		private String orderType;

		private String brandName;

		private Long beforeDate;

		private Long afterDate;

		private Integer year;

		private String domain;

		private Integer remainingDays;

		private String deploymentCloudProduct;

		private String statusCode;

		private String newBuyCertType;

		private String newBuyDomainType;

		private String newBuyBrand;

		private Integer showDeployment;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
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

		public String getOrderType() {
			return this.orderType;
		}

		public void setOrderType(String orderType) {
			this.orderType = orderType;
		}

		public String getBrandName() {
			return this.brandName;
		}

		public void setBrandName(String brandName) {
			this.brandName = brandName;
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

		public Integer getYear() {
			return this.year;
		}

		public void setYear(Integer year) {
			this.year = year;
		}

		public String getBizDomain() {
			return this.domain;
		}

		public void setBizDomain(String domain) {
			this.domain = domain;
		}

		/**
		 * @deprecated use getBizDomain instead of this.
		 */
		@Deprecated
		public String getDomain() {
			return this.domain;
		}

		/**
		 * @deprecated use setBizDomain instead of this.
		 */
		@Deprecated
		public void setDomain(String domain) {
			this.domain = domain;
		}

		public Integer getRemainingDays() {
			return this.remainingDays;
		}

		public void setRemainingDays(Integer remainingDays) {
			this.remainingDays = remainingDays;
		}

		public String getDeploymentCloudProduct() {
			return this.deploymentCloudProduct;
		}

		public void setDeploymentCloudProduct(String deploymentCloudProduct) {
			this.deploymentCloudProduct = deploymentCloudProduct;
		}

		public String getStatusCode() {
			return this.statusCode;
		}

		public void setStatusCode(String statusCode) {
			this.statusCode = statusCode;
		}

		public String getNewBuyCertType() {
			return this.newBuyCertType;
		}

		public void setNewBuyCertType(String newBuyCertType) {
			this.newBuyCertType = newBuyCertType;
		}

		public String getNewBuyDomainType() {
			return this.newBuyDomainType;
		}

		public void setNewBuyDomainType(String newBuyDomainType) {
			this.newBuyDomainType = newBuyDomainType;
		}

		public String getNewBuyBrand() {
			return this.newBuyBrand;
		}

		public void setNewBuyBrand(String newBuyBrand) {
			this.newBuyBrand = newBuyBrand;
		}

		public Integer getShowDeployment() {
			return this.showDeployment;
		}

		public void setShowDeployment(Integer showDeployment) {
			this.showDeployment = showDeployment;
		}
	}

	@Override
	public DescribeCertificateListResponse getInstance(UnmarshallerContext context) {
		return	DescribeCertificateListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
