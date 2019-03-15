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
public class ModifySnatEntryRequest extends RpcAcsRequest<ModifySnatEntryResponse> {
	
	public ModifySnatEntryRequest() {
		super("Vpc", "2016-04-28", "ModifySnatEntry", "vpc");
	}

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String snatEntryName;

	private String snatTableId;

	private String snatEntryId;

	private Long ownerId;

	private String snatIp;

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

	public String getSnatEntryName() {
		return this.snatEntryName;
	}

	public void setSnatEntryName(String snatEntryName) {
		this.snatEntryName = snatEntryName;
		if(snatEntryName != null){
			putQueryParameter("SnatEntryName", snatEntryName);
		}
	}

	public String getSnatTableId() {
		return this.snatTableId;
	}

	public void setSnatTableId(String snatTableId) {
		this.snatTableId = snatTableId;
		if(snatTableId != null){
			putQueryParameter("SnatTableId", snatTableId);
		}
	}

	public String getSnatEntryId() {
		return this.snatEntryId;
	}

	public void setSnatEntryId(String snatEntryId) {
		this.snatEntryId = snatEntryId;
		if(snatEntryId != null){
			putQueryParameter("SnatEntryId", snatEntryId);
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

	public String getSnatIp() {
		return this.snatIp;
	}

	public void setSnatIp(String snatIp) {
		this.snatIp = snatIp;
		if(snatIp != null){
			putQueryParameter("SnatIp", snatIp);
		}
	}

	@Override
	public Class<ModifySnatEntryResponse> getResponseClass() {
		return ModifySnatEntryResponse.class;
	}

}
