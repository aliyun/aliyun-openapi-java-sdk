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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddResourceToUsersRequest extends RpcAcsRequest<AddResourceToUsersResponse> {
	
	public AddResourceToUsersRequest() {
		super("Emr", "2016-04-08", "AddResourceToUsers", "emr");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long resourceOwnerId;

	private String resourceId;

	private List<String> userIdLists;

	private String resourceType;

	private List<Long> roleIdLists;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public List<String> getUserIdLists() {
		return this.userIdLists;
	}

	public void setUserIdLists(List<String> userIdLists) {
		this.userIdLists = userIdLists;	
		if (userIdLists != null) {
			for (int i = 0; i < userIdLists.size(); i++) {
				putQueryParameter("UserIdList." + (i + 1) , userIdLists.get(i));
			}
		}	
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public List<Long> getRoleIdLists() {
		return this.roleIdLists;
	}

	public void setRoleIdLists(List<Long> roleIdLists) {
		this.roleIdLists = roleIdLists;	
		if (roleIdLists != null) {
			for (int i = 0; i < roleIdLists.size(); i++) {
				putQueryParameter("RoleIdList." + (i + 1) , roleIdLists.get(i));
			}
		}	
	}

	@Override
	public Class<AddResourceToUsersResponse> getResponseClass() {
		return AddResourceToUsersResponse.class;
	}

}
