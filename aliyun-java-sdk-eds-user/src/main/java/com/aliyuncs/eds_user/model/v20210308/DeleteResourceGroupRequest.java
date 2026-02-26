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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.eds_user.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteResourceGroupRequest extends RpcAcsRequest<DeleteResourceGroupResponse> {
	   

	private String resourceGroupId;

	private List<String> resourceGroupIds;
	public DeleteResourceGroupRequest() {
		super("eds-user", "2021-03-08", "DeleteResourceGroup", "eds-user");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<String> getResourceGroupIds() {
		return this.resourceGroupIds;
	}

	public void setResourceGroupIds(List<String> resourceGroupIds) {
		this.resourceGroupIds = resourceGroupIds;	
		if (resourceGroupIds != null) {
			for (int depth1 = 0; depth1 < resourceGroupIds.size(); depth1++) {
				putQueryParameter("ResourceGroupIds." + (depth1 + 1) , resourceGroupIds.get(depth1));
			}
		}	
	}

	@Override
	public Class<DeleteResourceGroupResponse> getResponseClass() {
		return DeleteResourceGroupResponse.class;
	}

}
