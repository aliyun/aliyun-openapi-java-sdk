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

package com.aliyuncs.smartag.model.v20180313;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class RevokeInstanceFromCbnRequest extends RpcAcsRequest<RevokeInstanceFromCbnResponse> {
	
	public RevokeInstanceFromCbnRequest() {
		super("Smartag", "2018-03-13", "RevokeInstanceFromCbn", "1.4.0");
	}

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private String cenInstanceId;

	private String ownerAccount;

	private String ccnInstanceId;

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

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getCenInstanceId() {
		return this.cenInstanceId;
	}

	public void setCenInstanceId(String cenInstanceId) {
		this.cenInstanceId = cenInstanceId;
		if(cenInstanceId != null){
			putQueryParameter("CenInstanceId", cenInstanceId);
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

	public String getCcnInstanceId() {
		return this.ccnInstanceId;
	}

	public void setCcnInstanceId(String ccnInstanceId) {
		this.ccnInstanceId = ccnInstanceId;
		if(ccnInstanceId != null){
			putQueryParameter("CcnInstanceId", ccnInstanceId);
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
	public Class<RevokeInstanceFromCbnResponse> getResponseClass() {
		return RevokeInstanceFromCbnResponse.class;
	}

}
