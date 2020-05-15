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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ros.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetStackInstanceRequest extends RpcAcsRequest<GetStackInstanceResponse> {
	   

	private String stackGroupName;

	private String stackInstanceRegionId;

	private String stackInstanceAccountId;
	public GetStackInstanceRequest() {
		super("ROS", "2019-09-10", "GetStackInstance", "ROS");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getStackGroupName() {
		return this.stackGroupName;
	}

	public void setStackGroupName(String stackGroupName) {
		this.stackGroupName = stackGroupName;
		if(stackGroupName != null){
			putQueryParameter("StackGroupName", stackGroupName);
		}
	}

	public String getStackInstanceRegionId() {
		return this.stackInstanceRegionId;
	}

	public void setStackInstanceRegionId(String stackInstanceRegionId) {
		this.stackInstanceRegionId = stackInstanceRegionId;
		if(stackInstanceRegionId != null){
			putQueryParameter("StackInstanceRegionId", stackInstanceRegionId);
		}
	}

	public String getStackInstanceAccountId() {
		return this.stackInstanceAccountId;
	}

	public void setStackInstanceAccountId(String stackInstanceAccountId) {
		this.stackInstanceAccountId = stackInstanceAccountId;
		if(stackInstanceAccountId != null){
			putQueryParameter("StackInstanceAccountId", stackInstanceAccountId);
		}
	}

	@Override
	public Class<GetStackInstanceResponse> getResponseClass() {
		return GetStackInstanceResponse.class;
	}

}
