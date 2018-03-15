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

package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyVRouterAttributeRequest extends RpcAcsRequest<ModifyVRouterAttributeResponse> {
	
	public ModifyVRouterAttributeRequest() {
		super("Vpc", "2016-04-28", "ModifyVRouterAttribute", "vpc");
	}

	private String vRouterName;

	private Long resourceOwnerId;

	private String vRouterId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String description;

	private Long ownerId;

	public String getVRouterName() {
		return this.vRouterName;
	}

	public void setVRouterName(String vRouterName) {
		this.vRouterName = vRouterName;
		if(vRouterName != null){
			putQueryParameter("VRouterName", vRouterName);
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

	public String getVRouterId() {
		return this.vRouterId;
	}

	public void setVRouterId(String vRouterId) {
		this.vRouterId = vRouterId;
		if(vRouterId != null){
			putQueryParameter("VRouterId", vRouterId);
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
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

	@Override
	public Class<ModifyVRouterAttributeResponse> getResponseClass() {
		return ModifyVRouterAttributeResponse.class;
	}

}
