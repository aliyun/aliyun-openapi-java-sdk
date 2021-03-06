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

package com.aliyuncs.dataworks_public.model.v20180601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20180601.ListTablePartitionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTablePartitionsResponse extends AcsResponse {

	private String errorCode;

	private String errorMessage;

	private String requestId;

	private Data data;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageSize;

		private Integer totalCount;

		private List<TablePartitions> pagedData;

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

		public List<TablePartitions> getPagedData() {
			return this.pagedData;
		}

		public void setPagedData(List<TablePartitions> pagedData) {
			this.pagedData = pagedData;
		}

		public static class TablePartitions {

			private Long gmtCreate;

			private Long gmtModified;

			private String location;

			private String partitionName;

			private String partitionPath;

			private String partitionType;

			private String partitionComment;

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Long getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(Long gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getLocation() {
				return this.location;
			}

			public void setLocation(String location) {
				this.location = location;
			}

			public String getPartitionName() {
				return this.partitionName;
			}

			public void setPartitionName(String partitionName) {
				this.partitionName = partitionName;
			}

			public String getPartitionPath() {
				return this.partitionPath;
			}

			public void setPartitionPath(String partitionPath) {
				this.partitionPath = partitionPath;
			}

			public String getPartitionType() {
				return this.partitionType;
			}

			public void setPartitionType(String partitionType) {
				this.partitionType = partitionType;
			}

			public String getPartitionComment() {
				return this.partitionComment;
			}

			public void setPartitionComment(String partitionComment) {
				this.partitionComment = partitionComment;
			}
		}
	}

	@Override
	public ListTablePartitionsResponse getInstance(UnmarshallerContext context) {
		return	ListTablePartitionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
