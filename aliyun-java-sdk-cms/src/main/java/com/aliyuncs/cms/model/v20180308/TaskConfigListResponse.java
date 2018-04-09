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

package com.aliyuncs.cms.model.v20180308;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20180308.TaskConfigListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class TaskConfigListResponse extends AcsResponse {

	private Integer errorCode;

	private String errorMessage;

	private Boolean success;

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer pageTotal;

	private Integer total;

	private List<NodeTaskConfig> taskList;

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

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

	public Integer getPageTotal() {
		return this.pageTotal;
	}

	public void setPageTotal(Integer pageTotal) {
		this.pageTotal = pageTotal;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<NodeTaskConfig> getTaskList() {
		return this.taskList;
	}

	public void setTaskList(List<NodeTaskConfig> taskList) {
		this.taskList = taskList;
	}

	public static class NodeTaskConfig {

		private Long id;

		private String taskName;

		private String taskType;

		private String taskScope;

		private Boolean disabled;

		private Long groupId;

		private String groupName;

		private String jsonData;

		private String alertConfig;

		private List<String> instanceList;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
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

		public String getTaskScope() {
			return this.taskScope;
		}

		public void setTaskScope(String taskScope) {
			this.taskScope = taskScope;
		}

		public Boolean getDisabled() {
			return this.disabled;
		}

		public void setDisabled(Boolean disabled) {
			this.disabled = disabled;
		}

		public Long getGroupId() {
			return this.groupId;
		}

		public void setGroupId(Long groupId) {
			this.groupId = groupId;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getJsonData() {
			return this.jsonData;
		}

		public void setJsonData(String jsonData) {
			this.jsonData = jsonData;
		}

		public String getAlertConfig() {
			return this.alertConfig;
		}

		public void setAlertConfig(String alertConfig) {
			this.alertConfig = alertConfig;
		}

		public List<String> getInstanceList() {
			return this.instanceList;
		}

		public void setInstanceList(List<String> instanceList) {
			this.instanceList = instanceList;
		}
	}

	@Override
	public TaskConfigListResponse getInstance(UnmarshallerContext context) {
		return	TaskConfigListResponseUnmarshaller.unmarshall(this, context);
	}
}
