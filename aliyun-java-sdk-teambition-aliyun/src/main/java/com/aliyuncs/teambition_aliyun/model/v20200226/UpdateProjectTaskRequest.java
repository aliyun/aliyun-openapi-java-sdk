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

package com.aliyuncs.teambition_aliyun.model.v20200226;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateProjectTaskRequest extends RpcAcsRequest<UpdateProjectTaskResponse> {
	   

	private String note;

	private String visible;

	private String executorId;

	private String taskFlowStatusId;

	private String scenarioFiieldConfigId;

	private String startDate;

	private Integer priority;

	private String parentTaskId;

	private String orgId;

	private String content;

	private String sprintId;

	private String dueDate;

	private String projectId;

	private String taskId;
	public UpdateProjectTaskRequest() {
		super("teambition-aliyun", "2020-02-26", "UpdateProjectTask");
		setMethod(MethodType.POST);
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
		if(note != null){
			putBodyParameter("Note", note);
		}
	}

	public String getVisible() {
		return this.visible;
	}

	public void setVisible(String visible) {
		this.visible = visible;
		if(visible != null){
			putBodyParameter("Visible", visible);
		}
	}

	public String getExecutorId() {
		return this.executorId;
	}

	public void setExecutorId(String executorId) {
		this.executorId = executorId;
		if(executorId != null){
			putBodyParameter("ExecutorId", executorId);
		}
	}

	public String getTaskFlowStatusId() {
		return this.taskFlowStatusId;
	}

	public void setTaskFlowStatusId(String taskFlowStatusId) {
		this.taskFlowStatusId = taskFlowStatusId;
		if(taskFlowStatusId != null){
			putBodyParameter("TaskFlowStatusId", taskFlowStatusId);
		}
	}

	public String getScenarioFiieldConfigId() {
		return this.scenarioFiieldConfigId;
	}

	public void setScenarioFiieldConfigId(String scenarioFiieldConfigId) {
		this.scenarioFiieldConfigId = scenarioFiieldConfigId;
		if(scenarioFiieldConfigId != null){
			putBodyParameter("ScenarioFiieldConfigId", scenarioFiieldConfigId);
		}
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
		if(startDate != null){
			putBodyParameter("StartDate", startDate);
		}
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
		if(priority != null){
			putBodyParameter("Priority", priority.toString());
		}
	}

	public String getParentTaskId() {
		return this.parentTaskId;
	}

	public void setParentTaskId(String parentTaskId) {
		this.parentTaskId = parentTaskId;
		if(parentTaskId != null){
			putBodyParameter("ParentTaskId", parentTaskId);
		}
	}

	public String getOrgId() {
		return this.orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
		if(orgId != null){
			putBodyParameter("OrgId", orgId);
		}
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putBodyParameter("Content", content);
		}
	}

	public String getSprintId() {
		return this.sprintId;
	}

	public void setSprintId(String sprintId) {
		this.sprintId = sprintId;
		if(sprintId != null){
			putBodyParameter("SprintId", sprintId);
		}
	}

	public String getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
		if(dueDate != null){
			putBodyParameter("DueDate", dueDate);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId);
		}
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putBodyParameter("TaskId", taskId);
		}
	}

	@Override
	public Class<UpdateProjectTaskResponse> getResponseClass() {
		return UpdateProjectTaskResponse.class;
	}

}
