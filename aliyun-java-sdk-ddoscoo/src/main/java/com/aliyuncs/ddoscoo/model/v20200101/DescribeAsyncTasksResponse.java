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

package com.aliyuncs.ddoscoo.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeAsyncTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAsyncTasksResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<AsyncTask> asyncTasks;

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

	public List<AsyncTask> getAsyncTasks() {
		return this.asyncTasks;
	}

	public void setAsyncTasks(List<AsyncTask> asyncTasks) {
		this.asyncTasks = asyncTasks;
	}

	public static class AsyncTask {

		private Long taskId;

		private Long endTime;

		private Long startTime;

		private Integer taskStatus;

		private String taskResult;

		private String taskParams;

		private Integer taskType;

		public Long getTaskId() {
			return this.taskId;
		}

		public void setTaskId(Long taskId) {
			this.taskId = taskId;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Integer getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(Integer taskStatus) {
			this.taskStatus = taskStatus;
		}

		public String getTaskResult() {
			return this.taskResult;
		}

		public void setTaskResult(String taskResult) {
			this.taskResult = taskResult;
		}

		public String getTaskParams() {
			return this.taskParams;
		}

		public void setTaskParams(String taskParams) {
			this.taskParams = taskParams;
		}

		public Integer getTaskType() {
			return this.taskType;
		}

		public void setTaskType(Integer taskType) {
			this.taskType = taskType;
		}
	}

	@Override
	public DescribeAsyncTasksResponse getInstance(UnmarshallerContext context) {
		return	DescribeAsyncTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
