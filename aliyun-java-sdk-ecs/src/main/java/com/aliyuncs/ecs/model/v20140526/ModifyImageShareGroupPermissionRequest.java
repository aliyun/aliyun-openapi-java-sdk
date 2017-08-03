/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyImageShareGroupPermissionRequest extends RpcAcsRequest<ModifyImageShareGroupPermissionResponse> {
	
	public ModifyImageShareGroupPermissionRequest() {
		super("Ecs", "2014-05-26", "ModifyImageShareGroupPermission", "ecs");
	}

	private String removeGroup1;

	private String resourceOwnerAccount;

	private String addGroup1;

	private Long resourceOwnerId;

	private String ownerAccount;

	private Long ownerId;

	private String imageId;

	public String getRemoveGroup1() {
		return this.removeGroup1;
	}

	public void setRemoveGroup1(String removeGroup1) {
		this.removeGroup1 = removeGroup1;
		if(removeGroup1 != null){
			putQueryParameter("RemoveGroup.1", removeGroup1);
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

	public String getAddGroup1() {
		return this.addGroup1;
	}

	public void setAddGroup1(String addGroup1) {
		this.addGroup1 = addGroup1;
		if(addGroup1 != null){
			putQueryParameter("AddGroup.1", addGroup1);
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

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("ImageId", imageId);
		}
	}

	@Override
	public Class<ModifyImageShareGroupPermissionResponse> getResponseClass() {
		return ModifyImageShareGroupPermissionResponse.class;
	}

}
