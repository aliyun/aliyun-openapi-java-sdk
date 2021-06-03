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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateTaskDetailRequest extends RpcAcsRequest<UpdateTaskDetailResponse> {
	   

	private String note;

	private String executorId;

	private String startDate;

	private String delInvolvers;

	private String content;

	private String sprintId;

	private String customFieldId;

	private String projectId;

	private String taskId;

	private String taskFlowStatusId;

	private String tagIds;

	private String addInvolvers;

	private Long priority;

	private String orgId;

	private String dueDate;

	private Long workTimes;

	private String storyPoint;

	private String customFieldValues;
	public UpdateTaskDetailRequest() {
		super("devops-rdc", "2020-03-03", "UpdateTaskDetail", "1.9.6");
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

	public String getExecutorId() {
		return this.executorId;
	}

	public void setExecutorId(String executorId) {
		this.executorId = executorId;
		if(executorId != null){
			putBodyParameter("ExecutorId", executorId);
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

	public String getDelInvolvers() {
		return this.delInvolvers;
	}

	public void setDelInvolvers(String delInvolvers) {
		this.delInvolvers = delInvolvers;
		if(delInvolvers != null){
			putBodyParameter("DelInvolvers", delInvolvers);
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

	public String getCustomFieldId() {
		return this.customFieldId;
	}

	public void setCustomFieldId(String customFieldId) {
		this.customFieldId = customFieldId;
		if(customFieldId != null){
			putBodyParameter("CustomFieldId", customFieldId);
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

	public String getTaskFlowStatusId() {
		return this.taskFlowStatusId;
	}

	public void setTaskFlowStatusId(String taskFlowStatusId) {
		this.taskFlowStatusId = taskFlowStatusId;
		if(taskFlowStatusId != null){
			putBodyParameter("TaskFlowStatusId", taskFlowStatusId);
		}
	}

	public String getTagIds() {
		return this.tagIds;
	}

	public void setTagIds(String tagIds) {
		this.tagIds = tagIds;
		if(tagIds != null){
			putBodyParameter("TagIds", tagIds);
		}
	}

	public String getAddInvolvers() {
		return this.addInvolvers;
	}

	public void setAddInvolvers(String addInvolvers) {
		this.addInvolvers = addInvolvers;
		if(addInvolvers != null){
			putBodyParameter("AddInvolvers", addInvolvers);
		}
	}

	public Long getPriority() {
		return this.priority;
	}

	public void setPriority(Long priority) {
		this.priority = priority;
		if(priority != null){
			putBodyParameter("Priority", priority.toString());
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

	public String getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
		if(dueDate != null){
			putBodyParameter("DueDate", dueDate);
		}
	}

	public Long getWorkTimes() {
		return this.workTimes;
	}

	public void setWorkTimes(Long workTimes) {
		this.workTimes = workTimes;
		if(workTimes != null){
			putBodyParameter("WorkTimes", workTimes.toString());
		}
	}

	public String getStoryPoint() {
		return this.storyPoint;
	}

	public void setStoryPoint(String storyPoint) {
		this.storyPoint = storyPoint;
		if(storyPoint != null){
			putBodyParameter("StoryPoint", storyPoint);
		}
	}

	public String getCustomFieldValues() {
		return this.customFieldValues;
	}

	public void setCustomFieldValues(String customFieldValues) {
		this.customFieldValues = customFieldValues;
		if(customFieldValues != null){
			putBodyParameter("CustomFieldValues", customFieldValues);
		}
	}

	@Override
	public Class<UpdateTaskDetailResponse> getResponseClass() {
		return UpdateTaskDetailResponse.class;
	}

}
