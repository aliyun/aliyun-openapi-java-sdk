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

package com.aliyuncs.advisor_share.model.v20180608;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetTaskStatusByIdRequest extends RpcAcsRequest<GetTaskStatusByIdResponse> {
	   

	private String taskId;
	public GetTaskStatusByIdRequest() {
		super("Advisor-Share", "2018-06-08", "GetTaskStatusById", "advisor");
		setMethod(MethodType.GET);
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putQueryParameter("taskId", taskId);
		}
	}

	@Override
	public Class<GetTaskStatusByIdResponse> getResponseClass() {
		return GetTaskStatusByIdResponse.class;
	}

}
