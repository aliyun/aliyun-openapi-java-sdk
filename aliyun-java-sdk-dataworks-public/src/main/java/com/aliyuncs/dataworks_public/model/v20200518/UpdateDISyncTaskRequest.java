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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateDISyncTaskRequest extends RpcAcsRequest<UpdateDISyncTaskResponse> {
	   

	private String taskType;

	private String taskParam;

	private String taskContent;

	private Long projectId;

	private String fileId;
	public UpdateDISyncTaskRequest() {
		super("dataworks-public", "2020-05-18", "UpdateDISyncTask");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getTaskParam() {
		return this.taskParam;
	}

	public void setTaskParam(String taskParam) {
		this.taskParam = taskParam;
		if(taskParam != null){
			putQueryParameter("TaskParam", taskParam);
		}
	}

	public String getTaskContent() {
		return this.taskContent;
	}

	public void setTaskContent(String taskContent) {
		this.taskContent = taskContent;
		if(taskContent != null){
			putQueryParameter("TaskContent", taskContent);
		}
	}

	public Long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId.toString());
		}
	}

	public String getFileId() {
		return this.fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
		if(fileId != null){
			putQueryParameter("FileId", fileId);
		}
	}

	@Override
	public Class<UpdateDISyncTaskResponse> getResponseClass() {
		return UpdateDISyncTaskResponse.class;
	}

}
