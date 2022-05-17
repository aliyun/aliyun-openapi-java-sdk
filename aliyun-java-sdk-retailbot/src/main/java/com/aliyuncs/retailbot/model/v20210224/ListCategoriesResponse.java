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

package com.aliyuncs.retailbot.model.v20210224;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailbot.transform.v20210224.ListCategoriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCategoriesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private List<Category> categories;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Category> getCategories() {
		return this.categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public static class Category {

		private Long categoryId;

		private Long parentCategoryId;

		private String categoryName;

		private List<Category1> children;

		public Long getCategoryId() {
			return this.categoryId;
		}

		public void setCategoryId(Long categoryId) {
			this.categoryId = categoryId;
		}

		public Long getParentCategoryId() {
			return this.parentCategoryId;
		}

		public void setParentCategoryId(Long parentCategoryId) {
			this.parentCategoryId = parentCategoryId;
		}

		public String getCategoryName() {
			return this.categoryName;
		}

		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}

		public List<Category1> getChildren() {
			return this.children;
		}

		public void setChildren(List<Category1> children) {
			this.children = children;
		}

		public static class Category1 {

			private Long categoryId;

			private Long parentCategoryId;

			private String categoryName;

			public Long getCategoryId() {
				return this.categoryId;
			}

			public void setCategoryId(Long categoryId) {
				this.categoryId = categoryId;
			}

			public Long getParentCategoryId() {
				return this.parentCategoryId;
			}

			public void setParentCategoryId(Long parentCategoryId) {
				this.parentCategoryId = parentCategoryId;
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
	public ListCategoriesResponse getInstance(UnmarshallerContext context) {
		return	ListCategoriesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
