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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeOnceTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOnceTaskResponse extends AcsResponse {

	private String requestId;

	private List<TaskManageResponse> taskManageResponseList;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<TaskManageResponse> getTaskManageResponseList() {
		return this.taskManageResponseList;
	}

	public void setTaskManageResponseList(List<TaskManageResponse> taskManageResponseList) {
		this.taskManageResponseList = taskManageResponseList;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class TaskManageResponse {

		private String taskType;

		private String progress;

		private Integer taskStatus;

		private String detailData;

		private String taskStatusText;

		private String taskName;

		private Long taskStartTime;

		private Long taskEndTime;

		private String taskId;

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public String getProgress() {
			return this.progress;
		}

		public void setProgress(String progress) {
			this.progress = progress;
		}

		public Integer getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(Integer taskStatus) {
			this.taskStatus = taskStatus;
		}

		public String getDetailData() {
			return this.detailData;
		}

		public void setDetailData(String detailData) {
			this.detailData = detailData;
		}

		public String getTaskStatusText() {
			return this.taskStatusText;
		}

		public void setTaskStatusText(String taskStatusText) {
			this.taskStatusText = taskStatusText;
		}

		public String getTaskName() {
			return this.taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public Long getTaskStartTime() {
			return this.taskStartTime;
		}

		public void setTaskStartTime(Long taskStartTime) {
			this.taskStartTime = taskStartTime;
		}

		public Long getTaskEndTime() {
			return this.taskEndTime;
		}

		public void setTaskEndTime(Long taskEndTime) {
			this.taskEndTime = taskEndTime;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}
	}

	public static class PageInfo {

		private Integer currentPage;

		private Integer pageSize;

		private Integer totalCount;

		private Integer count;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
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

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}
	}

	@Override
	public DescribeOnceTaskResponse getInstance(UnmarshallerContext context) {
		return	DescribeOnceTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
