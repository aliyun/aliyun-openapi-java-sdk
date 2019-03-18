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
import com.aliyuncs.cas.transform.v20180813.DescribeOrderListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOrderListResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer showSize;

	private Integer currentPage;

	private List<Order> orderList;

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

	public List<Order> getOrderList() {
		return this.orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}

	public static class Order {

		private Long id;

		private String sourceType;

		private String certType;

		private String instanceId;

		private Long year;

		private Long orderId;

		private String orderType;

		private String brandName;

		private Long buyDate;

		private String statusCode;

		private String domain;

		private String productAliasName;

		private Integer domainCount;

		private Integer wildDomainCount;

		private Integer verifyStatus;

		private Long maybeIssueDate;

		private Long beforeDate;

		private Long afterDate;

		private Boolean showCancel;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
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

		public Long getYear() {
			return this.year;
		}

		public void setYear(Long year) {
			this.year = year;
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

		public Long getBuyDate() {
			return this.buyDate;
		}

		public void setBuyDate(Long buyDate) {
			this.buyDate = buyDate;
		}

		public String getStatusCode() {
			return this.statusCode;
		}

		public void setStatusCode(String statusCode) {
			this.statusCode = statusCode;
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

		public String getProductAliasName() {
			return this.productAliasName;
		}

		public void setProductAliasName(String productAliasName) {
			this.productAliasName = productAliasName;
		}

		public Integer getDomainCount() {
			return this.domainCount;
		}

		public void setDomainCount(Integer domainCount) {
			this.domainCount = domainCount;
		}

		public Integer getWildDomainCount() {
			return this.wildDomainCount;
		}

		public void setWildDomainCount(Integer wildDomainCount) {
			this.wildDomainCount = wildDomainCount;
		}

		public Integer getVerifyStatus() {
			return this.verifyStatus;
		}

		public void setVerifyStatus(Integer verifyStatus) {
			this.verifyStatus = verifyStatus;
		}

		public Long getMaybeIssueDate() {
			return this.maybeIssueDate;
		}

		public void setMaybeIssueDate(Long maybeIssueDate) {
			this.maybeIssueDate = maybeIssueDate;
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

		public Boolean getShowCancel() {
			return this.showCancel;
		}

		public void setShowCancel(Boolean showCancel) {
			this.showCancel = showCancel;
		}
	}

	@Override
	public DescribeOrderListResponse getInstance(UnmarshallerContext context) {
		return	DescribeOrderListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
