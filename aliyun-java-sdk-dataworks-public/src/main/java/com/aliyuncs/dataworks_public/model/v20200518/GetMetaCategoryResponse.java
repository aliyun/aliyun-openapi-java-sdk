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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.GetMetaCategoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMetaCategoryResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Integer httpStatusCode;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageNum;

		private Integer pageSize;

		private Long totalCount;

		private List<DataEntityListItem> dataEntityList;

		public Integer getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Integer pageNum) {
			this.pageNum = pageNum;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<DataEntityListItem> getDataEntityList() {
			return this.dataEntityList;
		}

		public void setDataEntityList(List<DataEntityListItem> dataEntityList) {
			this.dataEntityList = dataEntityList;
		}

		public static class DataEntityListItem {

			private Long categoryId;

			private String name;

			private Long createTime;

			private Long modifiedTime;

			private String comment;

			private String ownerId;

			private String lastOperatorId;

			private Long parentCategoryId;

			private Integer depth;

			public Long getCategoryId() {
				return this.categoryId;
			}

			public void setCategoryId(Long categoryId) {
				this.categoryId = categoryId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public Long getModifiedTime() {
				return this.modifiedTime;
			}

			public void setModifiedTime(Long modifiedTime) {
				this.modifiedTime = modifiedTime;
			}

			public String getComment() {
				return this.comment;
			}

			public void setComment(String comment) {
				this.comment = comment;
			}

			public String getOwnerId() {
				return this.ownerId;
			}

			public void setOwnerId(String ownerId) {
				this.ownerId = ownerId;
			}

			public String getLastOperatorId() {
				return this.lastOperatorId;
			}

			public void setLastOperatorId(String lastOperatorId) {
				this.lastOperatorId = lastOperatorId;
			}

			public Long getParentCategoryId() {
				return this.parentCategoryId;
			}

			public void setParentCategoryId(Long parentCategoryId) {
				this.parentCategoryId = parentCategoryId;
			}

			public Integer getDepth() {
				return this.depth;
			}

			public void setDepth(Integer depth) {
				this.depth = depth;
			}
		}
	}

	@Override
	public GetMetaCategoryResponse getInstance(UnmarshallerContext context) {
		return	GetMetaCategoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
