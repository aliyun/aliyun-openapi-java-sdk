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
import com.aliyuncs.dataworks_public.transform.v20200518.ListFileVersionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFileVersionsResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String errorMessage;

	private String requestId;

	private String errorCode;

	private Boolean success;

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

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
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

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<FileVersion> fileVersions;

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

		public List<FileVersion> getFileVersions() {
			return this.fileVersions;
		}

		public void setFileVersions(List<FileVersion> fileVersions) {
			this.fileVersions = fileVersions;
		}

		public static class FileVersion {

			private String fileContent;

			private String status;

			private Boolean isCurrentProd;

			private String commitUser;

			private String nodeContent;

			private String comment;

			private String filePropertyContent;

			private String fileName;

			private String useType;

			private String changeType;

			private Integer fileVersion;

			private Long commitTime;

			private Long nodeId;

			public String getFileContent() {
				return this.fileContent;
			}

			public void setFileContent(String fileContent) {
				this.fileContent = fileContent;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Boolean getIsCurrentProd() {
				return this.isCurrentProd;
			}

			public void setIsCurrentProd(Boolean isCurrentProd) {
				this.isCurrentProd = isCurrentProd;
			}

			public String getCommitUser() {
				return this.commitUser;
			}

			public void setCommitUser(String commitUser) {
				this.commitUser = commitUser;
			}

			public String getNodeContent() {
				return this.nodeContent;
			}

			public void setNodeContent(String nodeContent) {
				this.nodeContent = nodeContent;
			}

			public String getComment() {
				return this.comment;
			}

			public void setComment(String comment) {
				this.comment = comment;
			}

			public String getFilePropertyContent() {
				return this.filePropertyContent;
			}

			public void setFilePropertyContent(String filePropertyContent) {
				this.filePropertyContent = filePropertyContent;
			}

			public String getFileName() {
				return this.fileName;
			}

			public void setFileName(String fileName) {
				this.fileName = fileName;
			}

			public String getUseType() {
				return this.useType;
			}

			public void setUseType(String useType) {
				this.useType = useType;
			}

			public String getChangeType() {
				return this.changeType;
			}

			public void setChangeType(String changeType) {
				this.changeType = changeType;
			}

			public Integer getFileVersion() {
				return this.fileVersion;
			}

			public void setFileVersion(Integer fileVersion) {
				this.fileVersion = fileVersion;
			}

			public Long getCommitTime() {
				return this.commitTime;
			}

			public void setCommitTime(Long commitTime) {
				this.commitTime = commitTime;
			}

			public Long getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(Long nodeId) {
				this.nodeId = nodeId;
			}
		}
	}

	@Override
	public ListFileVersionsResponse getInstance(UnmarshallerContext context) {
		return	ListFileVersionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
