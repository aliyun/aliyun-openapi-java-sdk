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
public class DeleteStackRequest extends RpcAcsRequest<DeleteStackResponse> {
	   

	private String stackId;

	private List<String> retainResourcess;

	private Boolean retainAllResources;

	private String ramRoleName;
	public DeleteStackRequest() {
		super("ROS", "2019-09-10", "DeleteStack", "ros");
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

	public List<String> getRetainResourcess() {
		return this.retainResourcess;
	}

	public void setRetainResourcess(List<String> retainResourcess) {
		this.retainResourcess = retainResourcess;	
		if (retainResourcess != null) {
			for (int i = 0; i < retainResourcess.size(); i++) {
				putQueryParameter("RetainResources." + (i + 1) , retainResourcess.get(i));
			}
		}	
	}

	public Boolean getRetainAllResources() {
		return this.retainAllResources;
	}

	public void setRetainAllResources(Boolean retainAllResources) {
		this.retainAllResources = retainAllResources;
		if(retainAllResources != null){
			putQueryParameter("RetainAllResources", retainAllResources.toString());
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

	@Override
	public Class<DeleteStackResponse> getResponseClass() {
		return DeleteStackResponse.class;
	}

}
