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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTasksResponse extends AcsResponse {

	private Integer pageSize;

	private Integer pageNumber;

	private String requestId;

	private Integer totalCount;

	private String regionId;

	private List<Task> taskSet;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

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

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public List<Task> getTaskSet() {
		return this.taskSet;
	}

	public void setTaskSet(List<Task> taskSet) {
		this.taskSet = taskSet;
	}

	public static class Task {

		private String creationTime;

		private String taskStatus;

		private String finishedTime;

		private String supportCancel;

		private String taskId;

		private String taskAction;

		private String resourceId;

		private String source;

		private String failedReason;

		private String taskGroupId;

		private String failedCode;

		private List<String> resourceIds;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(String taskStatus) {
			this.taskStatus = taskStatus;
		}

		public String getFinishedTime() {
			return this.finishedTime;
		}

		public void setFinishedTime(String finishedTime) {
			this.finishedTime = finishedTime;
		}

		public String getSupportCancel() {
			return this.supportCancel;
		}

		public void setSupportCancel(String supportCancel) {
			this.supportCancel = supportCancel;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getTaskAction() {
			return this.taskAction;
		}

		public void setTaskAction(String taskAction) {
			this.taskAction = taskAction;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getFailedReason() {
			return this.failedReason;
		}

		public void setFailedReason(String failedReason) {
			this.failedReason = failedReason;
		}

		public String getTaskGroupId() {
			return this.taskGroupId;
		}

		public void setTaskGroupId(String taskGroupId) {
			this.taskGroupId = taskGroupId;
		}

		public String getFailedCode() {
			return this.failedCode;
		}

		public void setFailedCode(String failedCode) {
			this.failedCode = failedCode;
		}

		public List<String> getResourceIds() {
			return this.resourceIds;
		}

		public void setResourceIds(List<String> resourceIds) {
			this.resourceIds = resourceIds;
		}
	}

	@Override
	public DescribeTasksResponse getInstance(UnmarshallerContext context) {
		return	DescribeTasksResponseUnmarshaller.unmarshall(this, context);
	}
}
