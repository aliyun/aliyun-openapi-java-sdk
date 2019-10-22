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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyImageSharePermissionRequest extends RpcAcsRequest<ModifyImageSharePermissionResponse> {
	   

	private Long resourceOwnerId;

	private String imageId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private List<String> addAccounts;

	private List<String> removeAccounts;
	public ModifyImageSharePermissionRequest() {
		super("Ecs", "2014-05-26", "ModifyImageSharePermission", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("ImageId", imageId);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public List<String> getAddAccounts() {
		return this.addAccounts;
	}

	public void setAddAccounts(List<String> addAccounts) {
		this.addAccounts = addAccounts;	
		if (addAccounts != null) {
			for (int i = 0; i < addAccounts.size(); i++) {
				putQueryParameter("AddAccount." + (i + 1) , addAccounts.get(i));
			}
		}	
	}

	public List<String> getRemoveAccounts() {
		return this.removeAccounts;
	}

	public void setRemoveAccounts(List<String> removeAccounts) {
		this.removeAccounts = removeAccounts;	
		if (removeAccounts != null) {
			for (int i = 0; i < removeAccounts.size(); i++) {
				putQueryParameter("RemoveAccount." + (i + 1) , removeAccounts.get(i));
			}
		}	
	}

	@Override
	public Class<ModifyImageSharePermissionResponse> getResponseClass() {
		return ModifyImageSharePermissionResponse.class;
	}

}
