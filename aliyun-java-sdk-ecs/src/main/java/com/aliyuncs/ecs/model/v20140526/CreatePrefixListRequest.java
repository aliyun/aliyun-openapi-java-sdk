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
public class CreatePrefixListRequest extends RpcAcsRequest<CreatePrefixListResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String description;

	private Integer maxEntries;

	private String addressFamily;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String prefixListName;

	private List<Entry> entrys;
	public CreatePrefixListRequest() {
		super("Ecs", "2014-05-26", "CreatePrefixList", "ecs");
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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
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

	public Integer getMaxEntries() {
		return this.maxEntries;
	}

	public void setMaxEntries(Integer maxEntries) {
		this.maxEntries = maxEntries;
		if(maxEntries != null){
			putQueryParameter("MaxEntries", maxEntries.toString());
		}
	}

	public String getAddressFamily() {
		return this.addressFamily;
	}

	public void setAddressFamily(String addressFamily) {
		this.addressFamily = addressFamily;
		if(addressFamily != null){
			putQueryParameter("AddressFamily", addressFamily);
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

	public List<Entry> getEntrys() {
		return this.entrys;
	}

	public void setEntrys(List<Entry> entrys) {
		this.entrys = entrys;	
		if (entrys != null) {
			for (int depth1 = 0; depth1 < entrys.size(); depth1++) {
				putQueryParameter("Entry." + (depth1 + 1) + ".Cidr" , entrys.get(depth1).getCidr());
				putQueryParameter("Entry." + (depth1 + 1) + ".Description" , entrys.get(depth1).getDescription());
			}
		}	
	}

	public static class Entry {

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

	@Override
	public Class<CreatePrefixListResponse> getResponseClass() {
		return CreatePrefixListResponse.class;
	}

}
