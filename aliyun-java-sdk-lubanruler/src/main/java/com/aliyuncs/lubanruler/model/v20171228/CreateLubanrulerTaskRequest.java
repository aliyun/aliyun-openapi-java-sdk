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

package com.aliyuncs.lubanruler.model.v20171228;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateLubanrulerTaskRequest extends RpcAcsRequest<CreateLubanrulerTaskResponse> {
	
	public CreateLubanrulerTaskRequest() {
		super("Lubanruler", "2017-12-28", "CreateLubanrulerTask", "lubanruler");
		setMethod(MethodType.POST);
	}

	private String taskDO;

	private String token;

	public String getTaskDO() {
		return this.taskDO;
	}

	public void setTaskDO(String taskDO) {
		this.taskDO = taskDO;
		if(taskDO != null){
			putBodyParameter("TaskDO", taskDO);
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putBodyParameter("Token", token);
		}
	}

	@Override
	public Class<CreateLubanrulerTaskResponse> getResponseClass() {
		return CreateLubanrulerTaskResponse.class;
	}

}
