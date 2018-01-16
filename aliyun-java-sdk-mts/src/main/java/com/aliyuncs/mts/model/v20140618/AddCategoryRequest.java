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
package com.aliyuncs.mts.model.v20140618;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class AddCategoryRequest extends RpcAcsRequest<AddCategoryResponse> {
	
	public AddCategoryRequest() {
		super("Mts", "2014-06-18", "AddCategory", "mts");
	}

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private Long parentId;

	private String cateName;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public Long getParentId() {
		return this.parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
		if(parentId != null){
			putQueryParameter("ParentId", parentId.toString());
		}
	}

	public String getCateName() {
		return this.cateName;
	}

	public void setCateName(String cateName) {
		this.cateName = cateName;
		if(cateName != null){
			putQueryParameter("CateName", cateName);
		}
	}

	@Override
	public Class<AddCategoryResponse> getResponseClass() {
		return AddCategoryResponse.class;
	}

}
