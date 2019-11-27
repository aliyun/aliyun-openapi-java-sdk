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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyIPv6TranslatorAclListEntryRequest extends RpcAcsRequest<ModifyIPv6TranslatorAclListEntryResponse> {
	   

	private Long resourceOwnerId;

	private String aclId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String aclEntryComment;

	private Long ownerId;

	private String aclEntryId;
	public ModifyIPv6TranslatorAclListEntryRequest() {
		super("Vpc", "2016-04-28", "ModifyIPv6TranslatorAclListEntry", "vpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getAclId() {
		return this.aclId;
	}

	public void setAclId(String aclId) {
		this.aclId = aclId;
		if(aclId != null){
			putQueryParameter("AclId", aclId);
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

	public String getAclEntryComment() {
		return this.aclEntryComment;
	}

	public void setAclEntryComment(String aclEntryComment) {
		this.aclEntryComment = aclEntryComment;
		if(aclEntryComment != null){
			putQueryParameter("AclEntryComment", aclEntryComment);
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

	public String getAclEntryId() {
		return this.aclEntryId;
	}

	public void setAclEntryId(String aclEntryId) {
		this.aclEntryId = aclEntryId;
		if(aclEntryId != null){
			putQueryParameter("AclEntryId", aclEntryId);
		}
	}

	@Override
	public Class<ModifyIPv6TranslatorAclListEntryResponse> getResponseClass() {
		return ModifyIPv6TranslatorAclListEntryResponse.class;
	}

}
