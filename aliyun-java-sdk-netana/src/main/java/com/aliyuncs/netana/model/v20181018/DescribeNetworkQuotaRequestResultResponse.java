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

	private Integer totalCount;

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private List<QuotaRequest> quotaRequests;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<QuotaRequest> getQuotaRequests() {
		return this.quotaRequests;
	}

	public void setQuotaRequests(List<QuotaRequest> quotaRequests) {
		this.quotaRequests = quotaRequests;
	}

	public static class QuotaRequest {

		private String quotaPublicityName;

		private String resourceType;

		private String requestId;

		private String product;

		private String createTime;

		private String requestQuantity;

		private String requestReason;

		private String resultReason;

		private String requestResult;

		private String resultQuantity;

		private String regionId;

		public String getQuotaPublicityName() {
			return this.quotaPublicityName;
		}

		public void setQuotaPublicityName(String quotaPublicityName) {
			this.quotaPublicityName = quotaPublicityName;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public String getRequestId() {
			return this.requestId;
		}

		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}

		public String getProduct() {
			return this.product;
		}

		public void setProduct(String product) {
			this.product = product;
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

		public String getRequestReason() {
			return this.requestReason;
		}

		public void setRequestReason(String requestReason) {
			this.requestReason = requestReason;
		}

		public String getResultReason() {
			return this.resultReason;
		}

		public void setResultReason(String resultReason) {
			this.resultReason = resultReason;
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

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}

	@Override
	public DescribeNetworkQuotaRequestResultResponse getInstance(UnmarshallerContext context) {
		return	DescribeNetworkQuotaRequestResultResponseUnmarshaller.unmarshall(this, context);
	}
}
