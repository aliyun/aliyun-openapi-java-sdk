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

package com.aliyuncs.eds_user.model.v20210308;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.eds_user.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateResourceGroupRequest extends RpcAcsRequest<CreateResourceGroupResponse> {
	   

	private String resourceGroupName;

	private String platform;

	private Long isResourceGroupWithOfficeSite;
	public CreateResourceGroupRequest() {
		super("eds-user", "2021-03-08", "CreateResourceGroup", "eds-user");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getResourceGroupName() {
		return this.resourceGroupName;
	}

	public void setResourceGroupName(String resourceGroupName) {
		this.resourceGroupName = resourceGroupName;
		if(resourceGroupName != null){
			putQueryParameter("ResourceGroupName", resourceGroupName);
		}
	}

	public String getPlatform() {
		return this.platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
		if(platform != null){
			putQueryParameter("Platform", platform);
		}
	}

	public Long getIsResourceGroupWithOfficeSite() {
		return this.isResourceGroupWithOfficeSite;
	}

	public void setIsResourceGroupWithOfficeSite(Long isResourceGroupWithOfficeSite) {
		this.isResourceGroupWithOfficeSite = isResourceGroupWithOfficeSite;
		if(isResourceGroupWithOfficeSite != null){
			putQueryParameter("IsResourceGroupWithOfficeSite", isResourceGroupWithOfficeSite.toString());
		}
	}

	@Override
	public Class<CreateResourceGroupResponse> getResponseClass() {
		return CreateResourceGroupResponse.class;
	}

}
