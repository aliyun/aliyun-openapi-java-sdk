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

package com.aliyuncs.eflo_controller.model.v20221215;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ChangeResourceGroupRequest extends RpcAcsRequest<ChangeResourceGroupResponse> {
	   

	private String resourceGroupId;

	private String resourceRegionId;

	private String resourceId;
	public ChangeResourceGroupRequest() {
		super("eflo-controller", "2022-12-15", "ChangeResourceGroup");
		setMethod(MethodType.POST);
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

	public String getResourceRegionId() {
		return this.resourceRegionId;
	}

	public void setResourceRegionId(String resourceRegionId) {
		this.resourceRegionId = resourceRegionId;
		if(resourceRegionId != null){
			putQueryParameter("ResourceRegionId", resourceRegionId);
		}
	}

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
		if(resourceId != null){
			putQueryParameter("ResourceId", resourceId);
		}
	}

	@Override
	public Class<ChangeResourceGroupResponse> getResponseClass() {
		return ChangeResourceGroupResponse.class;
	}

}
