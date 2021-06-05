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

package com.aliyuncs.workorder.model.v20210510;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.workorder.transform.v20210510.ListProductsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListProductsResponse extends AcsResponse {

	private Integer code;

	private String requestId;

	private String message;

	private Boolean success;

	private List<DataItem> data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String topCategoryName;

		private Long topCategoryId;

		private Integer orderNumber;

		private List<RootsItem> roots;

		public String getTopCategoryName() {
			return this.topCategoryName;
		}

		public void setTopCategoryName(String topCategoryName) {
			this.topCategoryName = topCategoryName;
		}

		public Long getTopCategoryId() {
			return this.topCategoryId;
		}

		public void setTopCategoryId(Long topCategoryId) {
			this.topCategoryId = topCategoryId;
		}

		public Integer getOrderNumber() {
			return this.orderNumber;
		}

		public void setOrderNumber(Integer orderNumber) {
			this.orderNumber = orderNumber;
		}

		public List<RootsItem> getRoots() {
			return this.roots;
		}

		public void setRoots(List<RootsItem> roots) {
			this.roots = roots;
		}

		public static class RootsItem {

			private Long categoryId;

			private String categoryName;

			public Long getCategoryId() {
				return this.categoryId;
			}

			public void setCategoryId(Long categoryId) {
				this.categoryId = categoryId;
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
	public ListProductsResponse getInstance(UnmarshallerContext context) {
		return	ListProductsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
