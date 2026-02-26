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

package com.aliyuncs.anytrans.model.v20250707;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetImageTranslateTaskRequest extends RoaAcsRequest<GetImageTranslateTaskResponse> {
	   

	private String taskId;

	private String workspaceId;
	public GetImageTranslateTaskRequest() {
		super("AnyTrans", "2025-07-07", "GetImageTranslateTask");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/anytrans/translate/image/get");
		setMethod(MethodType.POST);
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putBodyParameter("taskId", taskId);
		}
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putBodyParameter("workspaceId", workspaceId);
		}
	}

	@Override
	public Class<GetImageTranslateTaskResponse> getResponseClass() {
		return GetImageTranslateTaskResponse.class;
	}

}
