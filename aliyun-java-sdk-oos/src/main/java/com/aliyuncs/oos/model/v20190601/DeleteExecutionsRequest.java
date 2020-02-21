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

package com.aliyuncs.oos.model.v20190601;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteExecutionsRequest extends RpcAcsRequest<DeleteExecutionsResponse> {
	   

	private String executionIds;
	public DeleteExecutionsRequest() {
		super("oos", "2019-06-01", "DeleteExecutions", "oos");
		setMethod(MethodType.POST);
	}

	public String getExecutionIds() {
		return this.executionIds;
	}

	public void setExecutionIds(String executionIds) {
		this.executionIds = executionIds;
		if(executionIds != null){
			putQueryParameter("ExecutionIds", executionIds);
		}
	}

	@Override
	public Class<DeleteExecutionsResponse> getResponseClass() {
		return DeleteExecutionsResponse.class;
	}

}
