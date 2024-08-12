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

package com.aliyuncs.wyota.model.v20210420;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.wyota.transform.v20210420.ListUserFbAcIssuesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUserFbAcIssuesResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long totalCount;

		private List<IssueDataListItem> issueDataList;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<IssueDataListItem> getIssueDataList() {
			return this.issueDataList;
		}

		public void setIssueDataList(List<IssueDataListItem> issueDataList) {
			this.issueDataList = issueDataList;
		}

		public static class IssueDataListItem {

			private Long issueId;

			private String instanceId;

			private String account;

			private String userEmail;

			private String clientVersion;

			private String label;

			private String errorMessage;

			private String reservedA;

			private String reservedB;

			private String gmtCreated;

			private String gmtModified;

			private List<FileListItem> fileList;

			public Long getIssueId() {
				return this.issueId;
			}

			public void setIssueId(Long issueId) {
				this.issueId = issueId;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getAccount() {
				return this.account;
			}

			public void setAccount(String account) {
				this.account = account;
			}

			public String getUserEmail() {
				return this.userEmail;
			}

			public void setUserEmail(String userEmail) {
				this.userEmail = userEmail;
			}

			public String getClientVersion() {
				return this.clientVersion;
			}

			public void setClientVersion(String clientVersion) {
				this.clientVersion = clientVersion;
			}

			public String getLabel() {
				return this.label;
			}

			public void setLabel(String label) {
				this.label = label;
			}

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}

			public String getReservedA() {
				return this.reservedA;
			}

			public void setReservedA(String reservedA) {
				this.reservedA = reservedA;
			}

			public String getReservedB() {
				return this.reservedB;
			}

			public void setReservedB(String reservedB) {
				this.reservedB = reservedB;
			}

			public String getGmtCreated() {
				return this.gmtCreated;
			}

			public void setGmtCreated(String gmtCreated) {
				this.gmtCreated = gmtCreated;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public List<FileListItem> getFileList() {
				return this.fileList;
			}

			public void setFileList(List<FileListItem> fileList) {
				this.fileList = fileList;
			}

			public static class FileListItem {

				private String sessionId;

				private String fileName;

				private Integer fileType;

				private Integer fileSize;

				public String getSessionId() {
					return this.sessionId;
				}

				public void setSessionId(String sessionId) {
					this.sessionId = sessionId;
				}

				public String getFileName() {
					return this.fileName;
				}

				public void setFileName(String fileName) {
					this.fileName = fileName;
				}

				public Integer getFileType() {
					return this.fileType;
				}

				public void setFileType(Integer fileType) {
					this.fileType = fileType;
				}

				public Integer getFileSize() {
					return this.fileSize;
				}

				public void setFileSize(Integer fileSize) {
					this.fileSize = fileSize;
				}
			}
		}
	}

	@Override
	public ListUserFbAcIssuesResponse getInstance(UnmarshallerContext context) {
		return	ListUserFbAcIssuesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
