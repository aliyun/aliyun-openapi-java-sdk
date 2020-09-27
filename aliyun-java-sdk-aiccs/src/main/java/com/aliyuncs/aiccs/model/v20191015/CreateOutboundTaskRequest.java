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

package com.aliyuncs.aiccs.model.v20191015;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.aiccs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateOutboundTaskRequest extends RpcAcsRequest<CreateOutboundTaskResponse> {
	   

	private Integer taskType;

	private String extAttrs;

	private Long departmentId;

	private String taskName;

	private String description;

	private String endTime;

	private String startTime;

	private String startDate;

	private String groupName;

	private Long skillGroup;

	private Integer retryInterval;

	private String endDate;

	private String instanceId;

	private String callInfos;

	private Integer model;

	private String ani;

	private Integer retryTime;
	public CreateOutboundTaskRequest() {
		super("aiccs", "2019-10-15", "CreateOutboundTask", "aiccs-service");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getTaskType() {
		return this.taskType;
	}

	public void setTaskType(Integer taskType) {
		this.taskType = taskType;
		if(taskType != null){
			putQueryParameter("TaskType", taskType.toString());
		}
	}

	public String getExtAttrs() {
		return this.extAttrs;
	}

	public void setExtAttrs(String extAttrs) {
		this.extAttrs = extAttrs;
		if(extAttrs != null){
			putQueryParameter("ExtAttrs", extAttrs);
		}
	}

	public Long getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
		if(departmentId != null){
			putQueryParameter("DepartmentId", departmentId.toString());
		}
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
		if(taskName != null){
			putQueryParameter("TaskName", taskName);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
		if(startDate != null){
			putQueryParameter("StartDate", startDate);
		}
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
		if(groupName != null){
			putQueryParameter("GroupName", groupName);
		}
	}

	public Long getSkillGroup() {
		return this.skillGroup;
	}

	public void setSkillGroup(Long skillGroup) {
		this.skillGroup = skillGroup;
		if(skillGroup != null){
			putQueryParameter("SkillGroup", skillGroup.toString());
		}
	}

	public Integer getRetryInterval() {
		return this.retryInterval;
	}

	public void setRetryInterval(Integer retryInterval) {
		this.retryInterval = retryInterval;
		if(retryInterval != null){
			putQueryParameter("RetryInterval", retryInterval.toString());
		}
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
		if(endDate != null){
			putQueryParameter("EndDate", endDate);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getCallInfos() {
		return this.callInfos;
	}

	public void setCallInfos(String callInfos) {
		this.callInfos = callInfos;
		if(callInfos != null){
			putQueryParameter("CallInfos", callInfos);
		}
	}

	public Integer getModel() {
		return this.model;
	}

	public void setModel(Integer model) {
		this.model = model;
		if(model != null){
			putQueryParameter("Model", model.toString());
		}
	}

	public String getAni() {
		return this.ani;
	}

	public void setAni(String ani) {
		this.ani = ani;
		if(ani != null){
			putQueryParameter("Ani", ani);
		}
	}

	public Integer getRetryTime() {
		return this.retryTime;
	}

	public void setRetryTime(Integer retryTime) {
		this.retryTime = retryTime;
		if(retryTime != null){
			putQueryParameter("RetryTime", retryTime.toString());
		}
	}

	@Override
	public Class<CreateOutboundTaskResponse> getResponseClass() {
		return CreateOutboundTaskResponse.class;
	}

}
