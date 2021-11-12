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

package com.aliyuncs.uisplus.model.v20200707;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.uisplus.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateUisRequest extends RpcAcsRequest<CreateUisResponse> {
	   

	private String clientToken;

	private String uisName;

	private Integer singletonCount;

	private String description;

	private String spec;

	private String networkMode;

	private String resourceGroupId;

	private String resourceMode;
	public CreateUisRequest() {
		super("Uisplus", "2020-07-07", "CreateUis", "uisplus");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getUisName() {
		return this.uisName;
	}

	public void setUisName(String uisName) {
		this.uisName = uisName;
		if(uisName != null){
			putQueryParameter("UisName", uisName);
		}
	}

	public Integer getSingletonCount() {
		return this.singletonCount;
	}

	public void setSingletonCount(Integer singletonCount) {
		this.singletonCount = singletonCount;
		if(singletonCount != null){
			putQueryParameter("SingletonCount", singletonCount.toString());
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getSpec() {
		return this.spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
		if(spec != null){
			putQueryParameter("Spec", spec);
		}
	}

	public String getNetworkMode() {
		return this.networkMode;
	}

	public void setNetworkMode(String networkMode) {
		this.networkMode = networkMode;
		if(networkMode != null){
			putQueryParameter("NetworkMode", networkMode);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getResourceMode() {
		return this.resourceMode;
	}

	public void setResourceMode(String resourceMode) {
		this.resourceMode = resourceMode;
		if(resourceMode != null){
			putQueryParameter("ResourceMode", resourceMode);
		}
	}

	@Override
	public Class<CreateUisResponse> getResponseClass() {
		return CreateUisResponse.class;
	}

}
