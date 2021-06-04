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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyPrefixListRequest extends RpcAcsRequest<ModifyPrefixListResponse> {
	   

	private Long resourceOwnerId;

	private String description;

	private String prefixListId;

	private List<AddEntry> addEntrys;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String prefixListName;

	private List<RemoveEntry> removeEntrys;
	public ModifyPrefixListRequest() {
		super("Ecs", "2014-05-26", "ModifyPrefixList", "ecs");
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getPrefixListId() {
		return this.prefixListId;
	}

	public void setPrefixListId(String prefixListId) {
		this.prefixListId = prefixListId;
		if(prefixListId != null){
			putQueryParameter("PrefixListId", prefixListId);
		}
	}

	public List<AddEntry> getAddEntrys() {
		return this.addEntrys;
	}

	public void setAddEntrys(List<AddEntry> addEntrys) {
		this.addEntrys = addEntrys;	
		if (addEntrys != null) {
			for (int depth1 = 0; depth1 < addEntrys.size(); depth1++) {
				putQueryParameter("AddEntry." + (depth1 + 1) + ".Cidr" , addEntrys.get(depth1).getCidr());
				putQueryParameter("AddEntry." + (depth1 + 1) + ".Description" , addEntrys.get(depth1).getDescription());
			}
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

	public String getPrefixListName() {
		return this.prefixListName;
	}

	public void setPrefixListName(String prefixListName) {
		this.prefixListName = prefixListName;
		if(prefixListName != null){
			putQueryParameter("PrefixListName", prefixListName);
		}
	}

	public List<RemoveEntry> getRemoveEntrys() {
		return this.removeEntrys;
	}

	public void setRemoveEntrys(List<RemoveEntry> removeEntrys) {
		this.removeEntrys = removeEntrys;	
		if (removeEntrys != null) {
			for (int depth1 = 0; depth1 < removeEntrys.size(); depth1++) {
				putQueryParameter("RemoveEntry." + (depth1 + 1) + ".Cidr" , removeEntrys.get(depth1).getCidr());
			}
		}	
	}

	public static class AddEntry {

		private String cidr;

		private String description;

		public String getCidr() {
			return this.cidr;
		}

		public void setCidr(String cidr) {
			this.cidr = cidr;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	public static class RemoveEntry {

		private String cidr;

		public String getCidr() {
			return this.cidr;
		}

		public void setCidr(String cidr) {
			this.cidr = cidr;
		}
	}

	@Override
	public Class<ModifyPrefixListResponse> getResponseClass() {
		return ModifyPrefixListResponse.class;
	}

}
