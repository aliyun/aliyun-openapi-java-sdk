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

package com.aliyuncs.dbfs.model.v20200418;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dbfs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateTaskRequest extends RpcAcsRequest<UpdateTaskResponse> {
	   

	private Integer taskProgress;

	private String taskIds;
	public UpdateTaskRequest() {
		super("DBFS", "2020-04-18", "UpdateTask", "dbfs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getTaskProgress() {
		return this.taskProgress;
	}

	public void setTaskProgress(Integer taskProgress) {
		this.taskProgress = taskProgress;
		if(taskProgress != null){
			putQueryParameter("TaskProgress", taskProgress.toString());
		}
	}

	public String getTaskIds() {
		return this.taskIds;
	}

	public void setTaskIds(String taskIds) {
		this.taskIds = taskIds;
		if(taskIds != null){
			putQueryParameter("TaskIds", taskIds);
		}
	}

	@Override
	public Class<UpdateTaskResponse> getResponseClass() {
		return UpdateTaskResponse.class;
	}

}
