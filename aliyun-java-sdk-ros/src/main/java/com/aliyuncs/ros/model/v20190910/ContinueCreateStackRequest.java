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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ros.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ContinueCreateStackRequest extends RpcAcsRequest<ContinueCreateStackResponse> {
	   

	private String stackId;

	private String ramRoleName;

	private List<String> recreatingResourcess;
	public ContinueCreateStackRequest() {
		super("ROS", "2019-09-10", "ContinueCreateStack", "ROS");
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

	public String getRamRoleName() {
		return this.ramRoleName;
	}

	public void setRamRoleName(String ramRoleName) {
		this.ramRoleName = ramRoleName;
		if(ramRoleName != null){
			putQueryParameter("RamRoleName", ramRoleName);
		}
	}

	public List<String> getRecreatingResourcess() {
		return this.recreatingResourcess;
	}

	public void setRecreatingResourcess(List<String> recreatingResourcess) {
		this.recreatingResourcess = recreatingResourcess;	
		if (recreatingResourcess != null) {
			for (int i = 0; i < recreatingResourcess.size(); i++) {
				putQueryParameter("RecreatingResources." + (i + 1) , recreatingResourcess.get(i));
			}
		}	
	}

	@Override
	public Class<ContinueCreateStackResponse> getResponseClass() {
		return ContinueCreateStackResponse.class;
	}

}
