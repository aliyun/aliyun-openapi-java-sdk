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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListOpsOperationTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListOpsOperationTaskResponse extends AcsResponse {

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

		private Long id;

		private Long opsOperationId;

		private Long taskId;

		private String status;

		private String regionId;

		private String userId;

		private Long clusterId;

		private String externalClusterId;

		private Long hostId;

		private String startTime;

		private String endTime;

		private String commandName;

		private String hostName;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getOpsOperationId() {
			return this.opsOperationId;
		}

		public void setOpsOperationId(Long opsOperationId) {
			this.opsOperationId = opsOperationId;
		}

		public Long getTaskId() {
			return this.taskId;
		}

		public void setTaskId(Long taskId) {
			this.taskId = taskId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public Long getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(Long clusterId) {
			this.clusterId = clusterId;
		}

		public String getExternalClusterId() {
			return this.externalClusterId;
		}

		public void setExternalClusterId(String externalClusterId) {
			this.externalClusterId = externalClusterId;
		}

		public Long getHostId() {
			return this.hostId;
		}

		public void setHostId(Long hostId) {
			this.hostId = hostId;
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

		public String getCommandName() {
			return this.commandName;
		}

		public void setCommandName(String commandName) {
			this.commandName = commandName;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}
	}

	@Override
	public ListOpsOperationTaskResponse getInstance(UnmarshallerContext context) {
		return	ListOpsOperationTaskResponseUnmarshaller.unmarshall(this, context);
	}
}
