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

package com.aliyuncs.slb.model.v20140515;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyVServerGroupBackendServersRequest extends RpcAcsRequest<ModifyVServerGroupBackendServersResponse> {
	
	public ModifyVServerGroupBackendServersRequest() {
		super("Slb", "2014-05-15", "ModifyVServerGroupBackendServers", "slb");
	}

	private String vServerGroupId;

	private Long resourceOwnerId;

	private String oldBackendServers;

	private String resourceOwnerAccount;

	private String newBackendServers;

	private String ownerAccount;

	private Long ownerId;

	private String tags;

	public String getVServerGroupId() {
		return this.vServerGroupId;
	}

	public void setVServerGroupId(String vServerGroupId) {
		this.vServerGroupId = vServerGroupId;
		if(vServerGroupId != null){
			putQueryParameter("VServerGroupId", vServerGroupId);
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

	public String getOldBackendServers() {
		return this.oldBackendServers;
	}

	public void setOldBackendServers(String oldBackendServers) {
		this.oldBackendServers = oldBackendServers;
		if(oldBackendServers != null){
			putQueryParameter("OldBackendServers", oldBackendServers);
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

	public String getNewBackendServers() {
		return this.newBackendServers;
	}

	public void setNewBackendServers(String newBackendServers) {
		this.newBackendServers = newBackendServers;
		if(newBackendServers != null){
			putQueryParameter("NewBackendServers", newBackendServers);
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

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
		if(tags != null){
			putQueryParameter("Tags", tags);
		}
	}

	@Override
	public Class<ModifyVServerGroupBackendServersResponse> getResponseClass() {
		return ModifyVServerGroupBackendServersResponse.class;
	}

}
