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

package com.aliyuncs.ocs.model.v20150301;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ReplaceAuthenticIPRequest extends RpcAcsRequest<ReplaceAuthenticIPResponse> {
	
	public ReplaceAuthenticIPRequest() {
		super("Ocs", "2015-03-01", "ReplaceAuthenticIP", "ocs");
	}

	private String newAuthenticIP;

	private Long resourceOwnerId;

	private String instanceId;

	private String oldAuthenticIP;

	private String securityToken;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	public String getNewAuthenticIP() {
		return this.newAuthenticIP;
	}

	public void setNewAuthenticIP(String newAuthenticIP) {
		this.newAuthenticIP = newAuthenticIP;
		if(newAuthenticIP != null){
			putQueryParameter("NewAuthenticIP", newAuthenticIP);
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

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getOldAuthenticIP() {
		return this.oldAuthenticIP;
	}

	public void setOldAuthenticIP(String oldAuthenticIP) {
		this.oldAuthenticIP = oldAuthenticIP;
		if(oldAuthenticIP != null){
			putQueryParameter("OldAuthenticIP", oldAuthenticIP);
		}
	}

	public String getBizSecurityToken() {
		return this.securityToken;
	}

	public void setBizSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	/**
	 * @deprecated use getBizSecurityToken instead of this.
	 */
	@Deprecated
	public String getSecurityToken() {
		return this.securityToken;
	}

	/**
	 * @deprecated use setBizSecurityToken instead of this.
	 */
	@Deprecated
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

	@Override
	public Class<ReplaceAuthenticIPResponse> getResponseClass() {
		return ReplaceAuthenticIPResponse.class;
	}

}
