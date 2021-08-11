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

package com.aliyuncs.workorder.model.v20210610;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.workorder.transform.v20210610.ListProductsResponseUnmarshaller;
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

		private String directoryName;

		private Long directoryId;

		private List<ProductListItem> productList;

		public String getDirectoryName() {
			return this.directoryName;
		}

		public void setDirectoryName(String directoryName) {
			this.directoryName = directoryName;
		}

		public Long getDirectoryId() {
			return this.directoryId;
		}

		public void setDirectoryId(Long directoryId) {
			this.directoryId = directoryId;
		}

		public List<ProductListItem> getProductList() {
			return this.productList;
		}

		public void setProductList(List<ProductListItem> productList) {
			this.productList = productList;
		}

		public static class ProductListItem {

			private Long productId;

			private String productName;

			public Long getProductId() {
				return this.productId;
			}

			public void setProductId(Long productId) {
				this.productId = productId;
			}

			public String getProductName() {
				return this.productName;
			}

			public void setProductName(String productName) {
				this.productName = productName;
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
