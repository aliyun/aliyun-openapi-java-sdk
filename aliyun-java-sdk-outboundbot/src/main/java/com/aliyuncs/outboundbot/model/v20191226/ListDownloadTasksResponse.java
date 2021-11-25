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

package com.aliyuncs.outboundbot.model.v20191226;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.outboundbot.transform.v20191226.ListDownloadTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDownloadTasksResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private DownloadTasks downloadTasks;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public DownloadTasks getDownloadTasks() {
		return this.downloadTasks;
	}

	public void setDownloadTasks(DownloadTasks downloadTasks) {
		this.downloadTasks = downloadTasks;
	}

	public static class DownloadTasks {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<DownloadTask> list;

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

		public List<DownloadTask> getList() {
			return this.list;
		}

		public void setList(List<DownloadTask> list) {
			this.list = list;
		}

		public static class DownloadTask {

			private String status;

			private String title;

			private Long expireTime;

			private String taskId;

			private List<DownloadTaskFile0> downloadTaskFiles;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public Long getExpireTime() {
				return this.expireTime;
			}

			public void setExpireTime(Long expireTime) {
				this.expireTime = expireTime;
			}

			public String getTaskId() {
				return this.taskId;
			}

			public void setTaskId(String taskId) {
				this.taskId = taskId;
			}

			public List<DownloadTaskFile0> getDownloadTaskFiles() {
				return this.downloadTaskFiles;
			}

			public void setDownloadTaskFiles(List<DownloadTaskFile0> downloadTaskFiles) {
				this.downloadTaskFiles = downloadTaskFiles;
			}

			public static class DownloadTaskFile0 {

				private String status;

				private String title;

				private Integer progress;

				private String fileId;

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getTitle() {
					return this.title;
				}

				public void setTitle(String title) {
					this.title = title;
				}

				public Integer getProgress() {
					return this.progress;
				}

				public void setProgress(Integer progress) {
					this.progress = progress;
				}

				public String getFileId() {
					return this.fileId;
				}

				public void setFileId(String fileId) {
					this.fileId = fileId;
				}
			}
		}
	}

	@Override
	public ListDownloadTasksResponse getInstance(UnmarshallerContext context) {
		return	ListDownloadTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
