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

package com.aliyuncs.devops_rdc.model.v20200303;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops_rdc.transform.v20200303.CreateDevopsProjectTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateDevopsProjectTaskResponse extends AcsResponse {

	private String errorMsg;

	private String requestId;

	private Boolean successful;

	private String errorCode;

	private Object object;

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccessful() {
		return this.successful;
	}

	public void setSuccessful(Boolean successful) {
		this.successful = successful;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Object getObject() {
		return this.object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public static class Object {

		private String executorId;

		private String projectId;

		private Integer priority;

		private String scenarioFieldConfigId;

		private String ancestorIds;

		private String taskType;

		private String tasklistId;

		private String taskflowstatusId;

		private String note;

		private String updated;

		private Integer uniqueId;

		private String content;

		private Integer rating;

		private Integer pos;

		private String storyPoint;

		private String startDate;

		private String creatorId;

		private String source;

		private String organizationId;

		private String visible;

		private Boolean isDone;

		private String sprintId;

		private String dueDate;

		private String created;

		private String id;

		public String getExecutorId() {
			return this.executorId;
		}

		public void setExecutorId(String executorId) {
			this.executorId = executorId;
		}

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getScenarioFieldConfigId() {
			return this.scenarioFieldConfigId;
		}

		public void setScenarioFieldConfigId(String scenarioFieldConfigId) {
			this.scenarioFieldConfigId = scenarioFieldConfigId;
		}

		public String getAncestorIds() {
			return this.ancestorIds;
		}

		public void setAncestorIds(String ancestorIds) {
			this.ancestorIds = ancestorIds;
		}

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public String getTasklistId() {
			return this.tasklistId;
		}

		public void setTasklistId(String tasklistId) {
			this.tasklistId = tasklistId;
		}

		public String getTaskflowstatusId() {
			return this.taskflowstatusId;
		}

		public void setTaskflowstatusId(String taskflowstatusId) {
			this.taskflowstatusId = taskflowstatusId;
		}

		public String getNote() {
			return this.note;
		}

		public void setNote(String note) {
			this.note = note;
		}

		public String getUpdated() {
			return this.updated;
		}

		public void setUpdated(String updated) {
			this.updated = updated;
		}

		public Integer getUniqueId() {
			return this.uniqueId;
		}

		public void setUniqueId(Integer uniqueId) {
			this.uniqueId = uniqueId;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public Integer getRating() {
			return this.rating;
		}

		public void setRating(Integer rating) {
			this.rating = rating;
		}

		public Integer getPos() {
			return this.pos;
		}

		public void setPos(Integer pos) {
			this.pos = pos;
		}

		public String getStoryPoint() {
			return this.storyPoint;
		}

		public void setStoryPoint(String storyPoint) {
			this.storyPoint = storyPoint;
		}

		public String getStartDate() {
			return this.startDate;
		}

		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}

		public String getCreatorId() {
			return this.creatorId;
		}

		public void setCreatorId(String creatorId) {
			this.creatorId = creatorId;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getOrganizationId() {
			return this.organizationId;
		}

		public void setOrganizationId(String organizationId) {
			this.organizationId = organizationId;
		}

		public String getVisible() {
			return this.visible;
		}

		public void setVisible(String visible) {
			this.visible = visible;
		}

		public Boolean getIsDone() {
			return this.isDone;
		}

		public void setIsDone(Boolean isDone) {
			this.isDone = isDone;
		}

		public String getSprintId() {
			return this.sprintId;
		}

		public void setSprintId(String sprintId) {
			this.sprintId = sprintId;
		}

		public String getDueDate() {
			return this.dueDate;
		}

		public void setDueDate(String dueDate) {
			this.dueDate = dueDate;
		}

		public String getCreated() {
			return this.created;
		}

		public void setCreated(String created) {
			this.created = created;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}
	}

	@Override
	public CreateDevopsProjectTaskResponse getInstance(UnmarshallerContext context) {
		return	CreateDevopsProjectTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
