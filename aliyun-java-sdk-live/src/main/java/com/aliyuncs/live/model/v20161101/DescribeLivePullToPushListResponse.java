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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeLivePullToPushListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLivePullToPushListResponse extends AcsResponse {

	private String requestId;

	private Integer total;

	private Integer pageNumber;

	private Integer pageSize;

	private List<TaskListItem> taskList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
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

	public List<TaskListItem> getTaskList() {
		return this.taskList;
	}

	public void setTaskList(List<TaskListItem> taskList) {
		this.taskList = taskList;
	}

	public static class TaskListItem {

		private String taskId;

		private Integer taskStatus;

		private String taskInvalidReason;

		private Integer taskExitTime;

		private String taskExitReason;

		private Integer currentOffset;

		private Integer currentFileIndex;

		private TaskInfo taskInfo;

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public Integer getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(Integer taskStatus) {
			this.taskStatus = taskStatus;
		}

		public String getTaskInvalidReason() {
			return this.taskInvalidReason;
		}

		public void setTaskInvalidReason(String taskInvalidReason) {
			this.taskInvalidReason = taskInvalidReason;
		}

		public Integer getTaskExitTime() {
			return this.taskExitTime;
		}

		public void setTaskExitTime(Integer taskExitTime) {
			this.taskExitTime = taskExitTime;
		}

		public String getTaskExitReason() {
			return this.taskExitReason;
		}

		public void setTaskExitReason(String taskExitReason) {
			this.taskExitReason = taskExitReason;
		}

		public Integer getCurrentOffset() {
			return this.currentOffset;
		}

		public void setCurrentOffset(Integer currentOffset) {
			this.currentOffset = currentOffset;
		}

		public Integer getCurrentFileIndex() {
			return this.currentFileIndex;
		}

		public void setCurrentFileIndex(Integer currentFileIndex) {
			this.currentFileIndex = currentFileIndex;
		}

		public TaskInfo getTaskInfo() {
			return this.taskInfo;
		}

		public void setTaskInfo(TaskInfo taskInfo) {
			this.taskInfo = taskInfo;
		}

		public static class TaskInfo {

			private String taskId;

			private String taskName;

			private String startTime;

			private String endTime;

			private String sourceType;

			private String sourceProtocol;

			private String dstUrl;

			private String callbackURL;

			private Integer offset;

			private Integer fileIndex;

			private Integer retryCount;

			private Integer retryInterval;

			private List<String> sourceUrls;

			public String getTaskId() {
				return this.taskId;
			}

			public void setTaskId(String taskId) {
				this.taskId = taskId;
			}

			public String getTaskName() {
				return this.taskName;
			}

			public void setTaskName(String taskName) {
				this.taskName = taskName;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public String getSourceType() {
				return this.sourceType;
			}

			public void setSourceType(String sourceType) {
				this.sourceType = sourceType;
			}

			public String getSourceProtocol() {
				return this.sourceProtocol;
			}

			public void setSourceProtocol(String sourceProtocol) {
				this.sourceProtocol = sourceProtocol;
			}

			public String getDstUrl() {
				return this.dstUrl;
			}

			public void setDstUrl(String dstUrl) {
				this.dstUrl = dstUrl;
			}

			public String getCallbackURL() {
				return this.callbackURL;
			}

			public void setCallbackURL(String callbackURL) {
				this.callbackURL = callbackURL;
			}

			public Integer getOffset() {
				return this.offset;
			}

			public void setOffset(Integer offset) {
				this.offset = offset;
			}

			public Integer getFileIndex() {
				return this.fileIndex;
			}

			public void setFileIndex(Integer fileIndex) {
				this.fileIndex = fileIndex;
			}

			public Integer getRetryCount() {
				return this.retryCount;
			}

			public void setRetryCount(Integer retryCount) {
				this.retryCount = retryCount;
			}

			public Integer getRetryInterval() {
				return this.retryInterval;
			}

			public void setRetryInterval(Integer retryInterval) {
				this.retryInterval = retryInterval;
			}

			public List<String> getSourceUrls() {
				return this.sourceUrls;
			}

			public void setSourceUrls(List<String> sourceUrls) {
				this.sourceUrls = sourceUrls;
			}
		}
	}

	@Override
	public DescribeLivePullToPushListResponse getInstance(UnmarshallerContext context) {
		return	DescribeLivePullToPushListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
