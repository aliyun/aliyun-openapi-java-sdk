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

package com.aliyuncs.uis.model.v20180821;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateUisNodeRequest extends RpcAcsRequest<CreateUisNodeResponse> {
	
	public CreateUisNodeRequest() {
		super("Uis", "2018-08-21", "CreateUisNode", "uis");
	}

	private Long resourceOwnerId;

	private Integer uisNodeBandwidth;

	private String resourceOwnerAccount;

	private String uisNodeAreaId;

	private String ownerAccount;

	private String uisId;

	private String name;

	private String description;

	private Integer ipAddrsNum;

	private Long ownerId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public Integer getUisNodeBandwidth() {
		return this.uisNodeBandwidth;
	}

	public void setUisNodeBandwidth(Integer uisNodeBandwidth) {
		this.uisNodeBandwidth = uisNodeBandwidth;
		if(uisNodeBandwidth != null){
			putQueryParameter("UisNodeBandwidth", uisNodeBandwidth.toString());
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

	public String getUisNodeAreaId() {
		return this.uisNodeAreaId;
	}

	public void setUisNodeAreaId(String uisNodeAreaId) {
		this.uisNodeAreaId = uisNodeAreaId;
		if(uisNodeAreaId != null){
			putQueryParameter("UisNodeAreaId", uisNodeAreaId);
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

	public String getUisId() {
		return this.uisId;
	}

	public void setUisId(String uisId) {
		this.uisId = uisId;
		if(uisId != null){
			putQueryParameter("UisId", uisId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
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

	public Integer getIpAddrsNum() {
		return this.ipAddrsNum;
	}

	public void setIpAddrsNum(Integer ipAddrsNum) {
		this.ipAddrsNum = ipAddrsNum;
		if(ipAddrsNum != null){
			putQueryParameter("IpAddrsNum", ipAddrsNum.toString());
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
	public Class<CreateUisNodeResponse> getResponseClass() {
		return CreateUisNodeResponse.class;
	}

}
