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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.GetFileVersionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetFileVersionResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorCode;

	private String errorMessage;

	private Integer httpStatusCode;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer fileVersion;

		private String fileContent;

		private String filePropertyContent;

		private String nodeContent;

		private String comment;

		private Long nodeId;

		private Boolean isCurrentProd;

		private String changeType;

		private String status;

		private String fileName;

		private String commitUser;

		private Long commitTime;

		private String useType;

		public Integer getFileVersion() {
			return this.fileVersion;
		}

		public void setFileVersion(Integer fileVersion) {
			this.fileVersion = fileVersion;
		}

		public String getFileContent() {
			return this.fileContent;
		}

		public void setFileContent(String fileContent) {
			this.fileContent = fileContent;
		}

		public String getFilePropertyContent() {
			return this.filePropertyContent;
		}

		public void setFilePropertyContent(String filePropertyContent) {
			this.filePropertyContent = filePropertyContent;
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

		public Long getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(Long nodeId) {
			this.nodeId = nodeId;
		}

		public Boolean getIsCurrentProd() {
			return this.isCurrentProd;
		}

		public void setIsCurrentProd(Boolean isCurrentProd) {
			this.isCurrentProd = isCurrentProd;
		}

		public String getChangeType() {
			return this.changeType;
		}

		public void setChangeType(String changeType) {
			this.changeType = changeType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getFileName() {
			return this.fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getCommitUser() {
			return this.commitUser;
		}

		public void setCommitUser(String commitUser) {
			this.commitUser = commitUser;
		}

		public Long getCommitTime() {
			return this.commitTime;
		}

		public void setCommitTime(Long commitTime) {
			this.commitTime = commitTime;
		}

		public String getUseType() {
			return this.useType;
		}

		public void setUseType(String useType) {
			this.useType = useType;
		}
	}

	@Override
	public GetFileVersionResponse getInstance(UnmarshallerContext context) {
		return	GetFileVersionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
