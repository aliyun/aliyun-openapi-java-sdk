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

package com.aliyuncs.dbfs.model.v20200418;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dbfs.transform.v20200418.ListTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTaskResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<TasksItem> tasks;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public List<TasksItem> getTasks() {
		return this.tasks;
	}

	public void setTasks(List<TasksItem> tasks) {
		this.tasks = tasks;
	}

	public static class TasksItem {

		private Integer id;

		private String taskName;

		private String taskType;

		private String taskOwner;

		private String taskAdder;

		private String taskRunner;

		private Integer taskProgress;

		private String taskProgressDescription;

		private String taskStatus;

		private String clientToken;

		private String createdTime;

		private String completionTime;

		private String priority;

		private Integer maxRetry;

		private String nextExecutionTime;

		private Integer taskExecutionCounts;

		private String taskErrorReason;

		private Integer taskStatusCode;

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getTaskName() {
			return this.taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public String getTaskOwner() {
			return this.taskOwner;
		}

		public void setTaskOwner(String taskOwner) {
			this.taskOwner = taskOwner;
		}

		public String getTaskAdder() {
			return this.taskAdder;
		}

		public void setTaskAdder(String taskAdder) {
			this.taskAdder = taskAdder;
		}

		public String getTaskRunner() {
			return this.taskRunner;
		}

		public void setTaskRunner(String taskRunner) {
			this.taskRunner = taskRunner;
		}

		public Integer getTaskProgress() {
			return this.taskProgress;
		}

		public void setTaskProgress(Integer taskProgress) {
			this.taskProgress = taskProgress;
		}

		public String getTaskProgressDescription() {
			return this.taskProgressDescription;
		}

		public void setTaskProgressDescription(String taskProgressDescription) {
			this.taskProgressDescription = taskProgressDescription;
		}

		public String getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(String taskStatus) {
			this.taskStatus = taskStatus;
		}

		public String getClientToken() {
			return this.clientToken;
		}

		public void setClientToken(String clientToken) {
			this.clientToken = clientToken;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}

		public String getCompletionTime() {
			return this.completionTime;
		}

		public void setCompletionTime(String completionTime) {
			this.completionTime = completionTime;
		}

		public String getPriority() {
			return this.priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

		public Integer getMaxRetry() {
			return this.maxRetry;
		}

		public void setMaxRetry(Integer maxRetry) {
			this.maxRetry = maxRetry;
		}

		public String getNextExecutionTime() {
			return this.nextExecutionTime;
		}

		public void setNextExecutionTime(String nextExecutionTime) {
			this.nextExecutionTime = nextExecutionTime;
		}

		public Integer getTaskExecutionCounts() {
			return this.taskExecutionCounts;
		}

		public void setTaskExecutionCounts(Integer taskExecutionCounts) {
			this.taskExecutionCounts = taskExecutionCounts;
		}

		public String getTaskErrorReason() {
			return this.taskErrorReason;
		}

		public void setTaskErrorReason(String taskErrorReason) {
			this.taskErrorReason = taskErrorReason;
		}

		public Integer getTaskStatusCode() {
			return this.taskStatusCode;
		}

		public void setTaskStatusCode(Integer taskStatusCode) {
			this.taskStatusCode = taskStatusCode;
		}
	}

	@Override
	public ListTaskResponse getInstance(UnmarshallerContext context) {
		return	ListTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
