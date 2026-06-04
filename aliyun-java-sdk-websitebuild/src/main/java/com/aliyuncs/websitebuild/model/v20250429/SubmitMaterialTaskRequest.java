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

package com.aliyuncs.websitebuild.model.v20250429;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SubmitMaterialTaskRequest extends RpcAcsRequest<SubmitMaterialTaskResponse> {
	   

	private String taskType;

	private String taskParam;
	public SubmitMaterialTaskRequest() {
		super("WebsiteBuild", "2025-04-29", "SubmitMaterialTask");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
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

	@Override
	public Class<SubmitMaterialTaskResponse> getResponseClass() {
		return SubmitMaterialTaskResponse.class;
	}

}
