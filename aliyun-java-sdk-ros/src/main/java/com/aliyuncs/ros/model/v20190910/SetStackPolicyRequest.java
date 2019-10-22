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
public class SetStackPolicyRequest extends RpcAcsRequest<SetStackPolicyResponse> {
	   

	private String stackId;

	private String stackPolicyBody;

	private String stackPolicyURL;
	public SetStackPolicyRequest() {
		super("ROS", "2019-09-10", "SetStackPolicy");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getStackPolicyBody() {
		return this.stackPolicyBody;
	}

	public void setStackPolicyBody(String stackPolicyBody) {
		this.stackPolicyBody = stackPolicyBody;
		if(stackPolicyBody != null){
			putQueryParameter("StackPolicyBody", stackPolicyBody);
		}
	}

	public String getStackPolicyURL() {
		return this.stackPolicyURL;
	}

	public void setStackPolicyURL(String stackPolicyURL) {
		this.stackPolicyURL = stackPolicyURL;
		if(stackPolicyURL != null){
			putQueryParameter("StackPolicyURL", stackPolicyURL);
		}
	}

	@Override
	public Class<SetStackPolicyResponse> getResponseClass() {
		return SetStackPolicyResponse.class;
	}

}
