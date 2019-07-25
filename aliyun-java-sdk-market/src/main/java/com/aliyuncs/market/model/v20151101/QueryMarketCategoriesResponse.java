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
import com.aliyuncs.market.transform.v20151101.QueryMarketCategoriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMarketCategoriesResponse extends AcsResponse {

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private String requestId;

	private List<Category> categories;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Category> getCategories() {
		return this.categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public static class Category {

		private Long id;

		private String categoryCode;

		private String categoryName;

		private List<ChildCategory> childCategories;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getCategoryCode() {
			return this.categoryCode;
		}

		public void setCategoryCode(String categoryCode) {
			this.categoryCode = categoryCode;
		}

		public String getCategoryName() {
			return this.categoryName;
		}

		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}

		public List<ChildCategory> getChildCategories() {
			return this.childCategories;
		}

		public void setChildCategories(List<ChildCategory> childCategories) {
			this.childCategories = childCategories;
		}

		public static class ChildCategory {

			private Long id;

			private String categoryCode;

			private String categoryName;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getCategoryCode() {
				return this.categoryCode;
			}

			public void setCategoryCode(String categoryCode) {
				this.categoryCode = categoryCode;
			}

			public String getCategoryName() {
				return this.categoryName;
			}

			public void setCategoryName(String categoryName) {
				this.categoryName = categoryName;
			}
		}
	}

	@Override
	public QueryMarketCategoriesResponse getInstance(UnmarshallerContext context) {
		return	QueryMarketCategoriesResponseUnmarshaller.unmarshall(this, context);
	}
}
