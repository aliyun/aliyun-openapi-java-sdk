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

package com.aliyuncs.linkcard.model.v20210520;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkcard.transform.v20210520.ListDirectionalDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDirectionalDetailResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private String localizedMessage;

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

	public String getLocalizedMessage() {
		return this.localizedMessage;
	}

	public void setLocalizedMessage(String localizedMessage) {
		this.localizedMessage = localizedMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long directionalGroupId;

		private String directionalName;

		private PaginationResult paginationResult;

		public Long getDirectionalGroupId() {
			return this.directionalGroupId;
		}

		public void setDirectionalGroupId(Long directionalGroupId) {
			this.directionalGroupId = directionalGroupId;
		}

		public String getDirectionalName() {
			return this.directionalName;
		}

		public void setDirectionalName(String directionalName) {
			this.directionalName = directionalName;
		}

		public PaginationResult getPaginationResult() {
			return this.paginationResult;
		}

		public void setPaginationResult(PaginationResult paginationResult) {
			this.paginationResult = paginationResult;
		}

		public static class PaginationResult {

			private Integer pageNo;

			private Integer pageSize;

			private Integer total;

			private Integer pageCount;

			private List<ListItem> list;

			public Integer getPageNo() {
				return this.pageNo;
			}

			public void setPageNo(Integer pageNo) {
				this.pageNo = pageNo;
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

			public Integer getPageCount() {
				return this.pageCount;
			}

			public void setPageCount(Integer pageCount) {
				this.pageCount = pageCount;
			}

			public List<ListItem> getList() {
				return this.list;
			}

			public void setList(List<ListItem> list) {
				this.list = list;
			}

			public static class ListItem {

				private String groupId;

				private String address;

				private String source;

				private String addressType;

				private String state;

				public String getGroupId() {
					return this.groupId;
				}

				public void setGroupId(String groupId) {
					this.groupId = groupId;
				}

				public String getAddress() {
					return this.address;
				}

				public void setAddress(String address) {
					this.address = address;
				}

				public String getSource() {
					return this.source;
				}

				public void setSource(String source) {
					this.source = source;
				}

				public String getAddressType() {
					return this.addressType;
				}

				public void setAddressType(String addressType) {
					this.addressType = addressType;
				}

				public String getState() {
					return this.state;
				}

				public void setState(String state) {
					this.state = state;
				}
			}
		}
	}

	@Override
	public ListDirectionalDetailResponse getInstance(UnmarshallerContext context) {
		return	ListDirectionalDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
