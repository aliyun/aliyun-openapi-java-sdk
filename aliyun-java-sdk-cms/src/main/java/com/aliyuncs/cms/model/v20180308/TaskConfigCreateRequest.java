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
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class TaskConfigCreateRequest extends RpcAcsRequest<TaskConfigCreateResponse> {
	
	public TaskConfigCreateRequest() {
		super("Cms", "2018-03-08", "TaskConfigCreate", "cms");
	}

	private List<String> instanceLists;

	private String jsonData;

	private String taskType;

	private String taskScope;

	private String alertConfig;

	private Long groupId;

	private String taskName;

	private String groupName;

	public List<String> getInstanceLists() {
		return this.instanceLists;
	}

	public void setInstanceLists(List<String> instanceLists) {
		this.instanceLists = instanceLists;	
		if (instanceLists != null) {
			for (int i = 0; i < instanceLists.size(); i++) {
				putQueryParameter("InstanceList." + (i + 1) , instanceLists.get(i));
			}
		}	
	}

	public String getJsonData() {
		return this.jsonData;
	}

	public void setJsonData(String jsonData) {
		this.jsonData = jsonData;
		if(jsonData != null){
			putQueryParameter("JsonData", jsonData);
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

	public String getTaskScope() {
		return this.taskScope;
	}

	public void setTaskScope(String taskScope) {
		this.taskScope = taskScope;
		if(taskScope != null){
			putQueryParameter("TaskScope", taskScope);
		}
	}

	public String getAlertConfig() {
		return this.alertConfig;
	}

	public void setAlertConfig(String alertConfig) {
		this.alertConfig = alertConfig;
		if(alertConfig != null){
			putQueryParameter("AlertConfig", alertConfig);
		}
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId.toString());
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

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
		if(groupName != null){
			putQueryParameter("GroupName", groupName);
		}
	}

	@Override
	public Class<TaskConfigCreateResponse> getResponseClass() {
		return TaskConfigCreateResponse.class;
	}

}
