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

package com.aliyuncs.mts.model.v20140618;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class RegisterMediaDetailPersonRequest extends RpcAcsRequest<RegisterMediaDetailPersonResponse> {
	
	public RegisterMediaDetailPersonRequest() {
		super("Mts", "2014-06-18", "RegisterMediaDetailPerson", "mts");
	}

	private Long resourceOwnerId;

	private String images;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String personLib;

	private Long ownerId;

	private String category;

	private String personName;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getImages() {
		return this.images;
	}

	public void setImages(String images) {
		this.images = images;
		if(images != null){
			putQueryParameter("Images", images);
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

	public String getPersonLib() {
		return this.personLib;
	}

	public void setPersonLib(String personLib) {
		this.personLib = personLib;
		if(personLib != null){
			putQueryParameter("PersonLib", personLib);
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

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
		if(category != null){
			putQueryParameter("Category", category);
		}
	}

	public String getPersonName() {
		return this.personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
		if(personName != null){
			putQueryParameter("PersonName", personName);
		}
	}

	@Override
	public Class<RegisterMediaDetailPersonResponse> getResponseClass() {
		return RegisterMediaDetailPersonResponse.class;
	}

}
