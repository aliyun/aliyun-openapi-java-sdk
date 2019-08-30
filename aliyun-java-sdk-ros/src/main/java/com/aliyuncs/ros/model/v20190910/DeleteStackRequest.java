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

package com.aliyuncs.ros.model.v20190910;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DeleteStackRequest extends RpcAcsRequest<DeleteStackResponse> {
	
	public DeleteStackRequest() {
		super("ROS", "2019-09-10", "DeleteStack", "ROS");
	}

	private Boolean retainAllResources;

	private String stackId;

	public Boolean getRetainAllResources() {
		return this.retainAllResources;
	}

	public void setRetainAllResources(Boolean retainAllResources) {
		this.retainAllResources = retainAllResources;
		if(retainAllResources != null){
			putQueryParameter("RetainAllResources", retainAllResources.toString());
		}
	}

	public String getStackId() {
		return this.stackId;
	}

	public void setStackId(String stackId) {
		this.stackId = stackId;
		if(stackId != null){
			putQueryParameter("StackId", stackId);
		}
	}

	@Override
	public Class<DeleteStackResponse> getResponseClass() {
		return DeleteStackResponse.class;
	}

}
