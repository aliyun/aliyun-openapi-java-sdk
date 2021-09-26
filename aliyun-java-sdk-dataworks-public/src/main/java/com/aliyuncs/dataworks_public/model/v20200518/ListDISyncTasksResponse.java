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
import com.aliyuncs.dataworks_public.transform.v20200518.ListDISyncTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDISyncTasksResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private TaskList taskList;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public TaskList getTaskList() {
		return this.taskList;
	}

	public void setTaskList(TaskList taskList) {
		this.taskList = taskList;
	}

	public static class TaskList {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<RealTimeSolutionListItem> realTimeSolutionList;

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

		public List<RealTimeSolutionListItem> getRealTimeSolutionList() {
			return this.realTimeSolutionList;
		}

		public void setRealTimeSolutionList(List<RealTimeSolutionListItem> realTimeSolutionList) {
			this.realTimeSolutionList = realTimeSolutionList;
		}

		public static class RealTimeSolutionListItem {

			private String processName;

			private String taskType;

			private Long processId;

			private String taskStatus;

			private Long createTime;

			public String getProcessName() {
				return this.processName;
			}

			public void setProcessName(String processName) {
				this.processName = processName;
			}

			public String getTaskType() {
				return this.taskType;
			}

			public void setTaskType(String taskType) {
				this.taskType = taskType;
			}

			public Long getProcessId() {
				return this.processId;
			}

			public void setProcessId(Long processId) {
				this.processId = processId;
			}

			public String getTaskStatus() {
				return this.taskStatus;
			}

			public void setTaskStatus(String taskStatus) {
				this.taskStatus = taskStatus;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}
		}
	}

	@Override
	public ListDISyncTasksResponse getInstance(UnmarshallerContext context) {
		return	ListDISyncTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
