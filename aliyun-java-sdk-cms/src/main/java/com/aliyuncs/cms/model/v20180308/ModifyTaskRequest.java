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

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyTaskRequest extends RpcAcsRequest<ModifyTaskResponse> {
	
	public ModifyTaskRequest() {
		super("Cms", "2018-03-08", "ModifyTask", "cms");
	}

	private String reportProject;

	private String taskType;

	private String address;

	private String alertName;

	private String ip;

	private String agentGroup;

	private String taskName;

	private String endTime;

	private String taskState;

	private String clientIds;

	private String alertInfo;

	private String agentType;

	private String ispCity;

	private String options;

	private String interval;

	private String alertRule;

	private String taskId;

	public String getReportProject() {
		return this.reportProject;
	}

	public void setReportProject(String reportProject) {
		this.reportProject = reportProject;
		if(reportProject != null){
			putQueryParameter("ReportProject", reportProject);
		}
	}

	public String getTaskType() {
		return this.taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
		if(taskType != null){
			putQueryParameter("TaskType", taskType);
		}
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
		if(address != null){
			putQueryParameter("Address", address);
		}
	}

	public String getAlertName() {
		return this.alertName;
	}

	public void setAlertName(String alertName) {
		this.alertName = alertName;
		if(alertName != null){
			putQueryParameter("AlertName", alertName);
		}
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
		if(ip != null){
			putQueryParameter("Ip", ip);
		}
	}

	public String getAgentGroup() {
		return this.agentGroup;
	}

	public void setAgentGroup(String agentGroup) {
		this.agentGroup = agentGroup;
		if(agentGroup != null){
			putQueryParameter("AgentGroup", agentGroup);
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

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public String getTaskState() {
		return this.taskState;
	}

	public void setTaskState(String taskState) {
		this.taskState = taskState;
		if(taskState != null){
			putQueryParameter("TaskState", taskState);
		}
	}

	public String getClientIds() {
		return this.clientIds;
	}

	public void setClientIds(String clientIds) {
		this.clientIds = clientIds;
		if(clientIds != null){
			putQueryParameter("ClientIds", clientIds);
		}
	}

	public String getAlertInfo() {
		return this.alertInfo;
	}

	public void setAlertInfo(String alertInfo) {
		this.alertInfo = alertInfo;
		if(alertInfo != null){
			putQueryParameter("AlertInfo", alertInfo);
		}
	}

	public String getAgentType() {
		return this.agentType;
	}

	public void setAgentType(String agentType) {
		this.agentType = agentType;
		if(agentType != null){
			putQueryParameter("AgentType", agentType);
		}
	}

	public String getIspCity() {
		return this.ispCity;
	}

	public void setIspCity(String ispCity) {
		this.ispCity = ispCity;
		if(ispCity != null){
			putQueryParameter("IspCity", ispCity);
		}
	}

	public String getOptions() {
		return this.options;
	}

	public void setOptions(String options) {
		this.options = options;
		if(options != null){
			putQueryParameter("Options", options);
		}
	}

	public String getInterval() {
		return this.interval;
	}

	public void setInterval(String interval) {
		this.interval = interval;
		if(interval != null){
			putQueryParameter("Interval", interval);
		}
	}

	public String getAlertRule() {
		return this.alertRule;
	}

	public void setAlertRule(String alertRule) {
		this.alertRule = alertRule;
		if(alertRule != null){
			putQueryParameter("AlertRule", alertRule);
		}
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putQueryParameter("TaskId", taskId);
		}
	}

	@Override
	public Class<ModifyTaskResponse> getResponseClass() {
		return ModifyTaskResponse.class;
	}

}
