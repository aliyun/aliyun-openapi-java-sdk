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

/**
 * @author auto create
 * @version 
 */
public class ModifyImageSharePermissionRequest extends RpcAcsRequest<ModifyImageSharePermissionResponse> {
	
	public ModifyImageSharePermissionRequest() {
		super("Ecs", "2014-05-26", "ModifyImageSharePermission");
	}

	private String addAccount1;

	private Long resourceOwnerId;

	private String imageId;

	private String addAccount9;

	private String addAccount8;

	private String addAccount7;

	private String addAccount6;

	private String addAccount5;

	private String addAccount10;

	private String addAccount4;

	private String addAccount3;

	private String addAccount2;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String removeAccount1;

	private String removeAccount2;

	private String removeAccount3;

	private String removeAccount4;

	private Long ownerId;

	private String removeAccount9;

	private String removeAccount5;

	private String removeAccount6;

	private String removeAccount7;

	private String removeAccount8;

	private String removeAccount10;

	public String getAddAccount1() {
		return this.addAccount1;
	}

	public void setAddAccount1(String addAccount1) {
		this.addAccount1 = addAccount1;
		if(addAccount1 != null){
			putQueryParameter("AddAccount.1", addAccount1);
		}
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

	public String getAddAccount9() {
		return this.addAccount9;
	}

	public void setAddAccount9(String addAccount9) {
		this.addAccount9 = addAccount9;
		if(addAccount9 != null){
			putQueryParameter("AddAccount.9", addAccount9);
		}
	}

	public String getAddAccount8() {
		return this.addAccount8;
	}

	public void setAddAccount8(String addAccount8) {
		this.addAccount8 = addAccount8;
		if(addAccount8 != null){
			putQueryParameter("AddAccount.8", addAccount8);
		}
	}

	public String getAddAccount7() {
		return this.addAccount7;
	}

	public void setAddAccount7(String addAccount7) {
		this.addAccount7 = addAccount7;
		if(addAccount7 != null){
			putQueryParameter("AddAccount.7", addAccount7);
		}
	}

	public String getAddAccount6() {
		return this.addAccount6;
	}

	public void setAddAccount6(String addAccount6) {
		this.addAccount6 = addAccount6;
		if(addAccount6 != null){
			putQueryParameter("AddAccount.6", addAccount6);
		}
	}

	public String getAddAccount5() {
		return this.addAccount5;
	}

	public void setAddAccount5(String addAccount5) {
		this.addAccount5 = addAccount5;
		if(addAccount5 != null){
			putQueryParameter("AddAccount.5", addAccount5);
		}
	}

	public String getAddAccount10() {
		return this.addAccount10;
	}

	public void setAddAccount10(String addAccount10) {
		this.addAccount10 = addAccount10;
		if(addAccount10 != null){
			putQueryParameter("AddAccount.10", addAccount10);
		}
	}

	public String getAddAccount4() {
		return this.addAccount4;
	}

	public void setAddAccount4(String addAccount4) {
		this.addAccount4 = addAccount4;
		if(addAccount4 != null){
			putQueryParameter("AddAccount.4", addAccount4);
		}
	}

	public String getAddAccount3() {
		return this.addAccount3;
	}

	public void setAddAccount3(String addAccount3) {
		this.addAccount3 = addAccount3;
		if(addAccount3 != null){
			putQueryParameter("AddAccount.3", addAccount3);
		}
	}

	public String getAddAccount2() {
		return this.addAccount2;
	}

	public void setAddAccount2(String addAccount2) {
		this.addAccount2 = addAccount2;
		if(addAccount2 != null){
			putQueryParameter("AddAccount.2", addAccount2);
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

	public String getRemoveAccount1() {
		return this.removeAccount1;
	}

	public void setRemoveAccount1(String removeAccount1) {
		this.removeAccount1 = removeAccount1;
		if(removeAccount1 != null){
			putQueryParameter("RemoveAccount.1", removeAccount1);
		}
	}

	public String getRemoveAccount2() {
		return this.removeAccount2;
	}

	public void setRemoveAccount2(String removeAccount2) {
		this.removeAccount2 = removeAccount2;
		if(removeAccount2 != null){
			putQueryParameter("RemoveAccount.2", removeAccount2);
		}
	}

	public String getRemoveAccount3() {
		return this.removeAccount3;
	}

	public void setRemoveAccount3(String removeAccount3) {
		this.removeAccount3 = removeAccount3;
		if(removeAccount3 != null){
			putQueryParameter("RemoveAccount.3", removeAccount3);
		}
	}

	public String getRemoveAccount4() {
		return this.removeAccount4;
	}

	public void setRemoveAccount4(String removeAccount4) {
		this.removeAccount4 = removeAccount4;
		if(removeAccount4 != null){
			putQueryParameter("RemoveAccount.4", removeAccount4);
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

	public String getRemoveAccount9() {
		return this.removeAccount9;
	}

	public void setRemoveAccount9(String removeAccount9) {
		this.removeAccount9 = removeAccount9;
		if(removeAccount9 != null){
			putQueryParameter("RemoveAccount.9", removeAccount9);
		}
	}

	public String getRemoveAccount5() {
		return this.removeAccount5;
	}

	public void setRemoveAccount5(String removeAccount5) {
		this.removeAccount5 = removeAccount5;
		if(removeAccount5 != null){
			putQueryParameter("RemoveAccount.5", removeAccount5);
		}
	}

	public String getRemoveAccount6() {
		return this.removeAccount6;
	}

	public void setRemoveAccount6(String removeAccount6) {
		this.removeAccount6 = removeAccount6;
		if(removeAccount6 != null){
			putQueryParameter("RemoveAccount.6", removeAccount6);
		}
	}

	public String getRemoveAccount7() {
		return this.removeAccount7;
	}

	public void setRemoveAccount7(String removeAccount7) {
		this.removeAccount7 = removeAccount7;
		if(removeAccount7 != null){
			putQueryParameter("RemoveAccount.7", removeAccount7);
		}
	}

	public String getRemoveAccount8() {
		return this.removeAccount8;
	}

	public void setRemoveAccount8(String removeAccount8) {
		this.removeAccount8 = removeAccount8;
		if(removeAccount8 != null){
			putQueryParameter("RemoveAccount.8", removeAccount8);
		}
	}

	public String getRemoveAccount10() {
		return this.removeAccount10;
	}

	public void setRemoveAccount10(String removeAccount10) {
		this.removeAccount10 = removeAccount10;
		if(removeAccount10 != null){
			putQueryParameter("RemoveAccount.10", removeAccount10);
		}
	}

	@Override
	public Class<ModifyImageSharePermissionResponse> getResponseClass() {
		return ModifyImageSharePermissionResponse.class;
	}

}
