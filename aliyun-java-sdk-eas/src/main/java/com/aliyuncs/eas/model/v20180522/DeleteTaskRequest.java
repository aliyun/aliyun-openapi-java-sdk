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

package com.aliyuncs.eas.model.v20180522;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteTaskRequest extends RoaAcsRequest<DeleteTaskResponse> {
	   

	private String task_name;

	private String region;
	public DeleteTaskRequest() {
		super("eas", "2018-05-22", "DeleteTask");
		setUriPattern("/api/tasks/[region]/[task_name]");
		setMethod(MethodType.DELETE);
	}

	public String getTask_name() {
		return this.task_name;
	}

	public void setTask_name(String task_name) {
		this.task_name = task_name;
		if(task_name != null){
			putPathParameter("task_name", task_name);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putPathParameter("region", region);
		}
	}

	@Override
	public Class<DeleteTaskResponse> getResponseClass() {
		return DeleteTaskResponse.class;
	}

}
