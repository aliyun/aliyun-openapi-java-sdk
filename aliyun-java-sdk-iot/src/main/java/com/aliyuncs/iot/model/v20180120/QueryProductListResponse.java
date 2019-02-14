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

package com.aliyuncs.iot.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.QueryProductListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryProductListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private Data data;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer currentPage;

		private Integer pageCount;

		private Integer pageSize;

		private Integer total;

		private List<ProductInfo> list;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public Integer getPageCount() {
			return this.pageCount;
		}

		public void setPageCount(Integer pageCount) {
			this.pageCount = pageCount;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public List<ProductInfo> getList() {
			return this.list;
		}

		public void setList(List<ProductInfo> list) {
			this.list = list;
		}

		public static class ProductInfo {

			private Long gmtCreate;

			private Integer dataFormat;

			private String description;

			private Integer deviceCount;

			private Integer nodeType;

			private String productKey;

			private String productName;

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Integer getDataFormat() {
				return this.dataFormat;
			}

			public void setDataFormat(Integer dataFormat) {
				this.dataFormat = dataFormat;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Integer getDeviceCount() {
				return this.deviceCount;
			}

			public void setDeviceCount(Integer deviceCount) {
				this.deviceCount = deviceCount;
			}

			public Integer getNodeType() {
				return this.nodeType;
			}

			public void setNodeType(Integer nodeType) {
				this.nodeType = nodeType;
			}

			public String getProductKey() {
				return this.productKey;
			}

			public void setProductKey(String productKey) {
				this.productKey = productKey;
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
	public QueryProductListResponse getInstance(UnmarshallerContext context) {
		return	QueryProductListResponseUnmarshaller.unmarshall(this, context);
	}
}
