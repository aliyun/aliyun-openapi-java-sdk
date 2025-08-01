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

package com.aliyuncs.eds_aic.model.v20230930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeTasksRequest extends RpcAcsRequest<DescribeTasksResponse> {
	   

	private List<String> taskIdss;

	private String taskStatus;

	private String param;

	private String nextToken;

	private String invokeId;

	private String taskType;

	private Integer level;

	private List<String> taskTypess;

	private String parentTaskId;

	private String instanceId;

	private String instanceName;

	private Integer maxResults;

	private List<String> taskStatusess;

	private List<String> resourceIdss;
	public DescribeTasksRequest() {
		super("eds-aic", "2023-09-30", "DescribeTasks");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public List<String> getTaskIdss() {
		return this.taskIdss;
	}

	public void setTaskIdss(List<String> taskIdss) {
		this.taskIdss = taskIdss;	
		if (taskIdss != null) {
			for (int i = 0; i < taskIdss.size(); i++) {
				putQueryParameter("TaskIds." + (i + 1) , taskIdss.get(i));
			}
		}	
	}

	public String getTaskStatus() {
		return this.taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
		if(taskStatus != null){
			putQueryParameter("TaskStatus", taskStatus);
		}
	}

	public String getParam() {
		return this.param;
	}

	public void setParam(String param) {
		this.param = param;
		if(param != null){
			putQueryParameter("Param", param);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public String getInvokeId() {
		return this.invokeId;
	}

	public void setInvokeId(String invokeId) {
		this.invokeId = invokeId;
		if(invokeId != null){
			putQueryParameter("InvokeId", invokeId);
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

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
		if(level != null){
			putQueryParameter("Level", level.toString());
		}
	}

	public List<String> getTaskTypess() {
		return this.taskTypess;
	}

	public void setTaskTypess(List<String> taskTypess) {
		this.taskTypess = taskTypess;	
		if (taskTypess != null) {
			for (int i = 0; i < taskTypess.size(); i++) {
				putQueryParameter("TaskTypes." + (i + 1) , taskTypess.get(i));
			}
		}	
	}

	public String getParentTaskId() {
		return this.parentTaskId;
	}

	public void setParentTaskId(String parentTaskId) {
		this.parentTaskId = parentTaskId;
		if(parentTaskId != null){
			putQueryParameter("ParentTaskId", parentTaskId);
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

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putQueryParameter("InstanceName", instanceName);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public List<String> getTaskStatusess() {
		return this.taskStatusess;
	}

	public void setTaskStatusess(List<String> taskStatusess) {
		this.taskStatusess = taskStatusess;	
		if (taskStatusess != null) {
			for (int i = 0; i < taskStatusess.size(); i++) {
				putQueryParameter("TaskStatuses." + (i + 1) , taskStatusess.get(i));
			}
		}	
	}

	public List<String> getResourceIdss() {
		return this.resourceIdss;
	}

	public void setResourceIdss(List<String> resourceIdss) {
		this.resourceIdss = resourceIdss;	
		if (resourceIdss != null) {
			for (int i = 0; i < resourceIdss.size(); i++) {
				putQueryParameter("ResourceIds." + (i + 1) , resourceIdss.get(i));
			}
		}	
	}

	@Override
	public Class<DescribeTasksResponse> getResponseClass() {
		return DescribeTasksResponse.class;
	}

}
