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

package com.aliyuncs.r_kvstore.model.v20150101;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyReplicaRecoveryModeRequest extends RpcAcsRequest<ModifyReplicaRecoveryModeResponse> {
	
	public ModifyReplicaRecoveryModeRequest() {
		super("R-kvstore", "2015-01-01", "ModifyReplicaRecoveryMode", "redisa");
	}

	private Long resourceOwnerId;

	private String securityToken;

	private String resourceOwnerAccount;

	private String recoveryMode;

	private String ownerAccount;

	private String replicaId;

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

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
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

	public String getRecoveryMode() {
		return this.recoveryMode;
	}

	public void setRecoveryMode(String recoveryMode) {
		this.recoveryMode = recoveryMode;
		if(recoveryMode != null){
			putQueryParameter("RecoveryMode", recoveryMode);
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

	public String getReplicaId() {
		return this.replicaId;
	}

	public void setReplicaId(String replicaId) {
		this.replicaId = replicaId;
		if(replicaId != null){
			putQueryParameter("ReplicaId", replicaId);
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
	public Class<ModifyReplicaRecoveryModeResponse> getResponseClass() {
		return ModifyReplicaRecoveryModeResponse.class;
	}

}
