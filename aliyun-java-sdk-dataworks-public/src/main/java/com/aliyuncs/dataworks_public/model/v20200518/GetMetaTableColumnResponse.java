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
import com.aliyuncs.dataworks_public.transform.v20200518.GetMetaTableColumnResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMetaTableColumnResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private String errorCode;

	private Data data;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

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

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
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

		private List<ColumnListItem> columnList;

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

		public List<ColumnListItem> getColumnList() {
			return this.columnList;
		}

		public void setColumnList(List<ColumnListItem> columnList) {
			this.columnList = columnList;
		}

		public static class ColumnListItem {

			private String columnGuid;

			private String columnName;

			private Boolean isPartitionColumn;

			private String comment;

			private String columnType;

			private Boolean isPrimaryKey;

			private Integer position;

			private String caption;

			private Boolean isForeignKey;

			private Long relationCount;

			public String getColumnGuid() {
				return this.columnGuid;
			}

			public void setColumnGuid(String columnGuid) {
				this.columnGuid = columnGuid;
			}

			public String getColumnName() {
				return this.columnName;
			}

			public void setColumnName(String columnName) {
				this.columnName = columnName;
			}

			public Boolean getIsPartitionColumn() {
				return this.isPartitionColumn;
			}

			public void setIsPartitionColumn(Boolean isPartitionColumn) {
				this.isPartitionColumn = isPartitionColumn;
			}

			public String getComment() {
				return this.comment;
			}

			public void setComment(String comment) {
				this.comment = comment;
			}

			public String getColumnType() {
				return this.columnType;
			}

			public void setColumnType(String columnType) {
				this.columnType = columnType;
			}

			public Boolean getIsPrimaryKey() {
				return this.isPrimaryKey;
			}

			public void setIsPrimaryKey(Boolean isPrimaryKey) {
				this.isPrimaryKey = isPrimaryKey;
			}

			public Integer getPosition() {
				return this.position;
			}

			public void setPosition(Integer position) {
				this.position = position;
			}

			public String getCaption() {
				return this.caption;
			}

			public void setCaption(String caption) {
				this.caption = caption;
			}

			public Boolean getIsForeignKey() {
				return this.isForeignKey;
			}

			public void setIsForeignKey(Boolean isForeignKey) {
				this.isForeignKey = isForeignKey;
			}

			public Long getRelationCount() {
				return this.relationCount;
			}

			public void setRelationCount(Long relationCount) {
				this.relationCount = relationCount;
			}
		}
	}

	@Override
	public GetMetaTableColumnResponse getInstance(UnmarshallerContext context) {
		return	GetMetaTableColumnResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
