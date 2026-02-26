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

package com.aliyuncs.market.model.v20151101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.market.transform.v20151101.DescribeDistributionProductsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDistributionProductsResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<Result> results;

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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Result> getResults() {
		return this.results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}

	public static class Result {

		private String firstCategoryName;

		private String secondCategoryName;

		private String type;

		private String imageUrl;

		private String code;

		private String name;

		private String shortDescription;

		private String price;

		private String score;

		private String tradeCount;

		private String userCommentCount;

		private String submissionRadio;

		private String supplierName;

		private String supplierUId;

		public String getFirstCategoryName() {
			return this.firstCategoryName;
		}

		public void setFirstCategoryName(String firstCategoryName) {
			this.firstCategoryName = firstCategoryName;
		}

		public String getSecondCategoryName() {
			return this.secondCategoryName;
		}

		public void setSecondCategoryName(String secondCategoryName) {
			this.secondCategoryName = secondCategoryName;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getImageUrl() {
			return this.imageUrl;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getShortDescription() {
			return this.shortDescription;
		}

		public void setShortDescription(String shortDescription) {
			this.shortDescription = shortDescription;
		}

		public String getPrice() {
			return this.price;
		}

		public void setPrice(String price) {
			this.price = price;
		}

		public String getScore() {
			return this.score;
		}

		public void setScore(String score) {
			this.score = score;
		}

		public String getTradeCount() {
			return this.tradeCount;
		}

		public void setTradeCount(String tradeCount) {
			this.tradeCount = tradeCount;
		}

		public String getUserCommentCount() {
			return this.userCommentCount;
		}

		public void setUserCommentCount(String userCommentCount) {
			this.userCommentCount = userCommentCount;
		}

		public String getSubmissionRadio() {
			return this.submissionRadio;
		}

		public void setSubmissionRadio(String submissionRadio) {
			this.submissionRadio = submissionRadio;
		}

		public String getSupplierName() {
			return this.supplierName;
		}

		public void setSupplierName(String supplierName) {
			this.supplierName = supplierName;
		}

		public String getSupplierUId() {
			return this.supplierUId;
		}

		public void setSupplierUId(String supplierUId) {
			this.supplierUId = supplierUId;
		}
	}

	@Override
	public DescribeDistributionProductsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDistributionProductsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
