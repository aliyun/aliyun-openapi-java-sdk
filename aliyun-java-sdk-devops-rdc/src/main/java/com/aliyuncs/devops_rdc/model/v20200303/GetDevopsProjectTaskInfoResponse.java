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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops_rdc.transform.v20200303.GetDevopsProjectTaskInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDevopsProjectTaskInfoResponse extends AcsResponse {

	private Boolean successful;

	private String errorCode;

	private String errorMsg;

	private String requestId;

	private Object object;

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

	public Object getObject() {
		return this.object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public static class Object {

		private String tasklistId;

		private String taskflowstatusId;

		private String taskType;

		private Boolean isDeleted;

		private String creatorId;

		private Boolean isTopInProject;

		private String executorId;

		private String storyPoint;

		private String created;

		private String organizationId;

		private Boolean isDone;

		private String id;

		private String updated;

		private String sprintId;

		private String projectId;

		private String content;

		private String note;

		private String dueDate;

		private String startDate;

		private String visible;

		private String priority;

		private List<String> involveMembers;

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

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public Boolean getIsDeleted() {
			return this.isDeleted;
		}

		public void setIsDeleted(Boolean isDeleted) {
			this.isDeleted = isDeleted;
		}

		public String getCreatorId() {
			return this.creatorId;
		}

		public void setCreatorId(String creatorId) {
			this.creatorId = creatorId;
		}

		public Boolean getIsTopInProject() {
			return this.isTopInProject;
		}

		public void setIsTopInProject(Boolean isTopInProject) {
			this.isTopInProject = isTopInProject;
		}

		public String getExecutorId() {
			return this.executorId;
		}

		public void setExecutorId(String executorId) {
			this.executorId = executorId;
		}

		public String getStoryPoint() {
			return this.storyPoint;
		}

		public void setStoryPoint(String storyPoint) {
			this.storyPoint = storyPoint;
		}

		public String getCreated() {
			return this.created;
		}

		public void setCreated(String created) {
			this.created = created;
		}

		public String getOrganizationId() {
			return this.organizationId;
		}

		public void setOrganizationId(String organizationId) {
			this.organizationId = organizationId;
		}

		public Boolean getIsDone() {
			return this.isDone;
		}

		public void setIsDone(Boolean isDone) {
			this.isDone = isDone;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getUpdated() {
			return this.updated;
		}

		public void setUpdated(String updated) {
			this.updated = updated;
		}

		public String getSprintId() {
			return this.sprintId;
		}

		public void setSprintId(String sprintId) {
			this.sprintId = sprintId;
		}

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getNote() {
			return this.note;
		}

		public void setNote(String note) {
			this.note = note;
		}

		public String getDueDate() {
			return this.dueDate;
		}

		public void setDueDate(String dueDate) {
			this.dueDate = dueDate;
		}

		public String getStartDate() {
			return this.startDate;
		}

		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}

		public String getVisible() {
			return this.visible;
		}

		public void setVisible(String visible) {
			this.visible = visible;
		}

		public String getPriority() {
			return this.priority;
		}

		public void setPriority(String priority) {
			this.priority = priority;
		}

		public List<String> getInvolveMembers() {
			return this.involveMembers;
		}

		public void setInvolveMembers(List<String> involveMembers) {
			this.involveMembers = involveMembers;
		}
	}

	@Override
	public GetDevopsProjectTaskInfoResponse getInstance(UnmarshallerContext context) {
		return	GetDevopsProjectTaskInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
