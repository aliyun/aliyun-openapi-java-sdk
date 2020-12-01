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
public class GetTaskListFilterRequest extends RpcAcsRequest<GetTaskListFilterResponse> {
	   

	private String involveMembers;

	private String executorId;

	private String orderCondition;

	private String sprintId;

	private String extra;

	private Integer pageSize;

	private String scenarioFieldConfigId;

	private Boolean isDone;

	private String objectType;

	private String projectId;

	private String pageToken;

	private String order;

	private String tagId;

	private String taskFlowStatusId;

	private String dueDateStart;

	private String creatorId;

	private String priority;

	private String dueDateEnd;

	private String orgId;

	private String name;
	public GetTaskListFilterRequest() {
		super("devops-rdc", "2020-03-03", "GetTaskListFilter");
		setMethod(MethodType.POST);
	}

	public String getInvolveMembers() {
		return this.involveMembers;
	}

	public void setInvolveMembers(String involveMembers) {
		this.involveMembers = involveMembers;
		if(involveMembers != null){
			putBodyParameter("InvolveMembers", involveMembers);
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

	public String getOrderCondition() {
		return this.orderCondition;
	}

	public void setOrderCondition(String orderCondition) {
		this.orderCondition = orderCondition;
		if(orderCondition != null){
			putBodyParameter("OrderCondition", orderCondition);
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

	public String getExtra() {
		return this.extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
		if(extra != null){
			putBodyParameter("Extra", extra);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getScenarioFieldConfigId() {
		return this.scenarioFieldConfigId;
	}

	public void setScenarioFieldConfigId(String scenarioFieldConfigId) {
		this.scenarioFieldConfigId = scenarioFieldConfigId;
		if(scenarioFieldConfigId != null){
			putBodyParameter("ScenarioFieldConfigId", scenarioFieldConfigId);
		}
	}

	public Boolean getIsDone() {
		return this.isDone;
	}

	public void setIsDone(Boolean isDone) {
		this.isDone = isDone;
		if(isDone != null){
			putBodyParameter("IsDone", isDone.toString());
		}
	}

	public String getObjectType() {
		return this.objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
		if(objectType != null){
			putBodyParameter("ObjectType", objectType);
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

	public String getPageToken() {
		return this.pageToken;
	}

	public void setPageToken(String pageToken) {
		this.pageToken = pageToken;
		if(pageToken != null){
			putBodyParameter("PageToken", pageToken);
		}
	}

	public String getOrder() {
		return this.order;
	}

	public void setOrder(String order) {
		this.order = order;
		if(order != null){
			putBodyParameter("Order", order);
		}
	}

	public String getTagId() {
		return this.tagId;
	}

	public void setTagId(String tagId) {
		this.tagId = tagId;
		if(tagId != null){
			putBodyParameter("TagId", tagId);
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

	public String getDueDateStart() {
		return this.dueDateStart;
	}

	public void setDueDateStart(String dueDateStart) {
		this.dueDateStart = dueDateStart;
		if(dueDateStart != null){
			putBodyParameter("DueDateStart", dueDateStart);
		}
	}

	public String getCreatorId() {
		return this.creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
		if(creatorId != null){
			putBodyParameter("CreatorId", creatorId);
		}
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
		if(priority != null){
			putBodyParameter("Priority", priority);
		}
	}

	public String getDueDateEnd() {
		return this.dueDateEnd;
	}

	public void setDueDateEnd(String dueDateEnd) {
		this.dueDateEnd = dueDateEnd;
		if(dueDateEnd != null){
			putBodyParameter("DueDateEnd", dueDateEnd);
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	@Override
	public Class<GetTaskListFilterResponse> getResponseClass() {
		return GetTaskListFilterResponse.class;
	}

}
