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
import com.aliyuncs.dataworks_public.transform.v20200518.GetMetaTablePartitionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMetaTablePartitionResponse extends AcsResponse {

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

		private Integer pageNumber;

		private Integer pageSize;

		private Long totalCount;

		private List<DataEntityListItem> dataEntityList;

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

			private String partitionPath;

			private Long dataSize;

			private String partitionName;

			private String comment;

			private Long modifiedTime;

			private Long createTime;

			private Long recordCount;

			private String partitionType;

			private String partitionGuid;

			private String partitionLocation;

			private String tableGuid;

			public String getPartitionPath() {
				return this.partitionPath;
			}

			public void setPartitionPath(String partitionPath) {
				this.partitionPath = partitionPath;
			}

			public Long getDataSize() {
				return this.dataSize;
			}

			public void setDataSize(Long dataSize) {
				this.dataSize = dataSize;
			}

			public String getPartitionName() {
				return this.partitionName;
			}

			public void setPartitionName(String partitionName) {
				this.partitionName = partitionName;
			}

			public String getComment() {
				return this.comment;
			}

			public void setComment(String comment) {
				this.comment = comment;
			}

			public Long getModifiedTime() {
				return this.modifiedTime;
			}

			public void setModifiedTime(Long modifiedTime) {
				this.modifiedTime = modifiedTime;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public Long getRecordCount() {
				return this.recordCount;
			}

			public void setRecordCount(Long recordCount) {
				this.recordCount = recordCount;
			}

			public String getPartitionType() {
				return this.partitionType;
			}

			public void setPartitionType(String partitionType) {
				this.partitionType = partitionType;
			}

			public String getPartitionGuid() {
				return this.partitionGuid;
			}

			public void setPartitionGuid(String partitionGuid) {
				this.partitionGuid = partitionGuid;
			}

			public String getPartitionLocation() {
				return this.partitionLocation;
			}

			public void setPartitionLocation(String partitionLocation) {
				this.partitionLocation = partitionLocation;
			}

			public String getTableGuid() {
				return this.tableGuid;
			}

			public void setTableGuid(String tableGuid) {
				this.tableGuid = tableGuid;
			}
		}
	}

	@Override
	public GetMetaTablePartitionResponse getInstance(UnmarshallerContext context) {
		return	GetMetaTablePartitionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
