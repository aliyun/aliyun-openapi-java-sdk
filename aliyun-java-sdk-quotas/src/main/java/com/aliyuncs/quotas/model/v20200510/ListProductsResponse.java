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

package com.aliyuncs.quotas.model.v20200510;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quotas.transform.v20200510.ListProductsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListProductsResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private String nextToken;

	private Integer maxResults;

	private List<ProductInfos> productInfo;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public List<ProductInfos> getProductInfo() {
		return this.productInfo;
	}

	public void setProductInfo(List<ProductInfos> productInfo) {
		this.productInfo = productInfo;
	}

	public static class ProductInfos {

		private String secondCategoryNameEn;

		private Boolean dynamic;

		private String commonQuotaSupport;

		private String productName;

		private String productCode;

		private String secondCategoryName;

		private String flowControlSupport;

		private Long secondCategoryId;

		private String productNameEn;

		public String getSecondCategoryNameEn() {
			return this.secondCategoryNameEn;
		}

		public void setSecondCategoryNameEn(String secondCategoryNameEn) {
			this.secondCategoryNameEn = secondCategoryNameEn;
		}

		public Boolean getDynamic() {
			return this.dynamic;
		}

		public void setDynamic(Boolean dynamic) {
			this.dynamic = dynamic;
		}

		public String getCommonQuotaSupport() {
			return this.commonQuotaSupport;
		}

		public void setCommonQuotaSupport(String commonQuotaSupport) {
			this.commonQuotaSupport = commonQuotaSupport;
		}

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public String getSecondCategoryName() {
			return this.secondCategoryName;
		}

		public void setSecondCategoryName(String secondCategoryName) {
			this.secondCategoryName = secondCategoryName;
		}

		public String getFlowControlSupport() {
			return this.flowControlSupport;
		}

		public void setFlowControlSupport(String flowControlSupport) {
			this.flowControlSupport = flowControlSupport;
		}

		public Long getSecondCategoryId() {
			return this.secondCategoryId;
		}

		public void setSecondCategoryId(Long secondCategoryId) {
			this.secondCategoryId = secondCategoryId;
		}

		public String getProductNameEn() {
			return this.productNameEn;
		}

		public void setProductNameEn(String productNameEn) {
			this.productNameEn = productNameEn;
		}
	}

	@Override
	public ListProductsResponse getInstance(UnmarshallerContext context) {
		return	ListProductsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
