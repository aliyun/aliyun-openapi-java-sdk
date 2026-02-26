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
import com.aliyuncs.wyota.transform.v20210420.ListUserFbIssuesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUserFbIssuesResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String count;

		private List<FeedbackIssueDataItem> feedbackIssueData;

		public String getCount() {
			return this.count;
		}

		public void setCount(String count) {
			this.count = count;
		}

		public List<FeedbackIssueDataItem> getFeedbackIssueData() {
			return this.feedbackIssueData;
		}

		public void setFeedbackIssueData(List<FeedbackIssueDataItem> feedbackIssueData) {
			this.feedbackIssueData = feedbackIssueData;
		}

		public static class FeedbackIssueDataItem {

			private Integer issueId;

			private Integer fbType;

			private String customerId;

			private String userId;

			private String userEmail;

			private String clientId;

			private String clientSn;

			private String clientModel;

			private String issueLabel;

			private String desktopId;

			private String appId;

			private String title;

			private String description;

			private String errorCode;

			private String errorMsg;

			private Integer status;

			private String gmtCreated;

			private List<FileListItem> fileList;

			public Integer getIssueId() {
				return this.issueId;
			}

			public void setIssueId(Integer issueId) {
				this.issueId = issueId;
			}

			public Integer getFbType() {
				return this.fbType;
			}

			public void setFbType(Integer fbType) {
				this.fbType = fbType;
			}

			public String getCustomerId() {
				return this.customerId;
			}

			public void setCustomerId(String customerId) {
				this.customerId = customerId;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getUserEmail() {
				return this.userEmail;
			}

			public void setUserEmail(String userEmail) {
				this.userEmail = userEmail;
			}

			public String getClientId() {
				return this.clientId;
			}

			public void setClientId(String clientId) {
				this.clientId = clientId;
			}

			public String getClientSn() {
				return this.clientSn;
			}

			public void setClientSn(String clientSn) {
				this.clientSn = clientSn;
			}

			public String getClientModel() {
				return this.clientModel;
			}

			public void setClientModel(String clientModel) {
				this.clientModel = clientModel;
			}

			public String getIssueLabel() {
				return this.issueLabel;
			}

			public void setIssueLabel(String issueLabel) {
				this.issueLabel = issueLabel;
			}

			public String getDesktopId() {
				return this.desktopId;
			}

			public void setDesktopId(String desktopId) {
				this.desktopId = desktopId;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getErrorCode() {
				return this.errorCode;
			}

			public void setErrorCode(String errorCode) {
				this.errorCode = errorCode;
			}

			public String getErrorMsg() {
				return this.errorMsg;
			}

			public void setErrorMsg(String errorMsg) {
				this.errorMsg = errorMsg;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getGmtCreated() {
				return this.gmtCreated;
			}

			public void setGmtCreated(String gmtCreated) {
				this.gmtCreated = gmtCreated;
			}

			public List<FileListItem> getFileList() {
				return this.fileList;
			}

			public void setFileList(List<FileListItem> fileList) {
				this.fileList = fileList;
			}

			public static class FileListItem {

				private String fileName;

				private Integer fileType;

				private Integer fileSize;

				private String ossUrl;

				private String fileMd5;

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

				public String getOssUrl() {
					return this.ossUrl;
				}

				public void setOssUrl(String ossUrl) {
					this.ossUrl = ossUrl;
				}

				public String getFileMd5() {
					return this.fileMd5;
				}

				public void setFileMd5(String fileMd5) {
					this.fileMd5 = fileMd5;
				}
			}
		}
	}

	@Override
	public ListUserFbIssuesResponse getInstance(UnmarshallerContext context) {
		return	ListUserFbIssuesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
