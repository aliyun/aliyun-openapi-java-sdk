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

package com.aliyuncs.cloudphone.model.v20201230;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateImageAttributeRequest extends RpcAcsRequest<UpdateImageAttributeResponse> {
	   

	private Long resourceOwnerId;

	private String imageId;

	private String description;

	private String imageName;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private List<String> addAccounts;

	private List<String> removeAccounts;
	public UpdateImageAttributeRequest() {
		super("cloudphone", "2020-12-30", "UpdateImageAttribute", "cloudphone");
		setMethod(MethodType.POST);
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getImageName() {
		return this.imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
		if(imageName != null){
			putQueryParameter("ImageName", imageName);
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
	public Class<UpdateImageAttributeResponse> getResponseClass() {
		return UpdateImageAttributeResponse.class;
	}

}
