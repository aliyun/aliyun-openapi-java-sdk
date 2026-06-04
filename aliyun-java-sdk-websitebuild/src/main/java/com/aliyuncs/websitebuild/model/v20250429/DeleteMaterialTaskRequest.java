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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteMaterialTaskRequest extends RpcAcsRequest<DeleteMaterialTaskResponse> {
	   

	@SerializedName("taskIds")
	private List<String> taskIds;
	public DeleteMaterialTaskRequest() {
		super("WebsiteBuild", "2025-04-29", "DeleteMaterialTask");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public List<String> getTaskIds() {
		return this.taskIds;
	}

	public void setTaskIds(List<String> taskIds) {
		this.taskIds = taskIds;	
		if (taskIds != null) {
			putQueryParameter("TaskIds" , new Gson().toJson(taskIds));
		}	
	}

	@Override
	public Class<DeleteMaterialTaskResponse> getResponseClass() {
		return DeleteMaterialTaskResponse.class;
	}

}
