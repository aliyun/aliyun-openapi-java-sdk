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

package com.aliyuncs.netana.model.v20181018;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.netana.transform.v20181018.DescribeNetworkQuotaRequestResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNetworkQuotaRequestResultResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<QuotaRequest> quotaRequests;

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

	public List<QuotaRequest> getQuotaRequests() {
		return this.quotaRequests;
	}

	public void setQuotaRequests(List<QuotaRequest> quotaRequests) {
		this.quotaRequests = quotaRequests;
	}

	public static class QuotaRequest {

		private String regionId;

		private String product;

		private String resourceType;

		private String quotaPublicityName;

		private String requestReason;

		private String mobilePhone;

		private String email;

		private String requestResult;

		private String resultQuantity;

		private String resultReason;

		private String requestId;

		private String createTime;

		private String requestQuantity;

		public String getBizRegionId() {
			return this.regionId;
		}

		public void setBizRegionId(String regionId) {
			this.regionId = regionId;
		}

		/**
		 * @deprecated use getBizRegionId instead of this.
		 */
		@Deprecated
		public String getRegionId() {
			return this.regionId;
		}

		/**
		 * @deprecated use setBizRegionId instead of this.
		 */
		@Deprecated
		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getBizProduct() {
			return this.product;
		}

		public void setBizProduct(String product) {
			this.product = product;
		}

		/**
		 * @deprecated use getBizProduct instead of this.
		 */
		@Deprecated
		public String getProduct() {
			return this.product;
		}

		/**
		 * @deprecated use setBizProduct instead of this.
		 */
		@Deprecated
		public void setProduct(String product) {
			this.product = product;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getQuotaPublicityName() {
			return this.quotaPublicityName;
		}

		public void setQuotaPublicityName(String quotaPublicityName) {
			this.quotaPublicityName = quotaPublicityName;
		}

		public String getRequestReason() {
			return this.requestReason;
		}

		public void setRequestReason(String requestReason) {
			this.requestReason = requestReason;
		}

		public String getMobilePhone() {
			return this.mobilePhone;
		}

		public void setMobilePhone(String mobilePhone) {
			this.mobilePhone = mobilePhone;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getRequestResult() {
			return this.requestResult;
		}

		public void setRequestResult(String requestResult) {
			this.requestResult = requestResult;
		}

		public String getResultQuantity() {
			return this.resultQuantity;
		}

		public void setResultQuantity(String resultQuantity) {
			this.resultQuantity = resultQuantity;
		}

		public String getResultReason() {
			return this.resultReason;
		}

		public void setResultReason(String resultReason) {
			this.resultReason = resultReason;
		}

		public String getRequestId() {
			return this.requestId;
		}

		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getRequestQuantity() {
			return this.requestQuantity;
		}

		public void setRequestQuantity(String requestQuantity) {
			this.requestQuantity = requestQuantity;
		}
	}

	@Override
	public DescribeNetworkQuotaRequestResultResponse getInstance(UnmarshallerContext context) {
		return	DescribeNetworkQuotaRequestResultResponseUnmarshaller.unmarshall(this, context);
	}
}
