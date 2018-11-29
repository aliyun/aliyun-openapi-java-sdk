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
public class CreateUisConnectionRequest extends RpcAcsRequest<CreateUisConnectionResponse> {
	
	public CreateUisConnectionRequest() {
		super("Uis", "2018-08-21", "CreateUisConnection", "uis");
	}

	private Long resourceOwnerId;

	private String uisNodeId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String name;

	private String description;

	private String uisProtocol;

	private String sslConfig;

	private Long ownerId;

	private String greConfig;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getUisNodeId() {
		return this.uisNodeId;
	}

	public void setUisNodeId(String uisNodeId) {
		this.uisNodeId = uisNodeId;
		if(uisNodeId != null){
			putQueryParameter("UisNodeId", uisNodeId);
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

	public String getUisProtocol() {
		return this.uisProtocol;
	}

	public void setUisProtocol(String uisProtocol) {
		this.uisProtocol = uisProtocol;
		if(uisProtocol != null){
			putQueryParameter("UisProtocol", uisProtocol);
		}
	}

	public String getSslConfig() {
		return this.sslConfig;
	}

	public void setSslConfig(String sslConfig) {
		this.sslConfig = sslConfig;
		if(sslConfig != null){
			putQueryParameter("SslConfig", sslConfig);
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

	public String getGreConfig() {
		return this.greConfig;
	}

	public void setGreConfig(String greConfig) {
		this.greConfig = greConfig;
		if(greConfig != null){
			putQueryParameter("GreConfig", greConfig);
		}
	}

	@Override
	public Class<CreateUisConnectionResponse> getResponseClass() {
		return CreateUisConnectionResponse.class;
	}

}
