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

package com.aliyuncs.schedulerx3.model.v20240624;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OperateRetryJobExecutionRequest extends RpcAcsRequest<OperateRetryJobExecutionResponse> {
	   

	private String appName;

	private String jobExecutionId;

	private String clusterId;

	@SerializedName("taskList")
	private List<String> taskList;
	public OperateRetryJobExecutionRequest() {
		super("SchedulerX3", "2024-06-24", "OperateRetryJobExecution");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public String getJobExecutionId() {
		return this.jobExecutionId;
	}

	public void setJobExecutionId(String jobExecutionId) {
		this.jobExecutionId = jobExecutionId;
		if(jobExecutionId != null){
			putQueryParameter("JobExecutionId", jobExecutionId);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public List<String> getTaskList() {
		return this.taskList;
	}

	public void setTaskList(List<String> taskList) {
		this.taskList = taskList;	
		if (taskList != null) {
			putQueryParameter("TaskList" , new Gson().toJson(taskList));
		}	
	}

	@Override
	public Class<OperateRetryJobExecutionResponse> getResponseClass() {
		return OperateRetryJobExecutionResponse.class;
	}

}
