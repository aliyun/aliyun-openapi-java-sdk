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

package com.aliyuncs.ros.model.v20150901;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteStackRequest extends RoaAcsRequest<DeleteStackResponse> {
	
	public DeleteStackRequest() {
		super("ROS", "2015-09-01", "DeleteStack", "ROS");
		setUriPattern("/stacks/[StackName]/[StackId]");
		setMethod(MethodType.DELETE);
	}

	private String stackId;

	private String stackName;

	public String getStackId() {
		return this.stackId;
	}

	public void setStackId(String stackId) {
		this.stackId = stackId;
		if(stackId != null){
			putPathParameter("StackId", stackId);
		}
	}

	public String getStackName() {
		return this.stackName;
	}

	public void setStackName(String stackName) {
		this.stackName = stackName;
		if(stackName != null){
			putPathParameter("StackName", stackName);
		}
	}

	@Override
	public Class<DeleteStackResponse> getResponseClass() {
		return DeleteStackResponse.class;
	}

}
