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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateVpcPrefixListRequest extends RpcAcsRequest<CreateVpcPrefixListResponse> {
	   

	private List<PrefixListEntrys> prefixListEntryss;

	private Long resourceOwnerId;

	private String clientToken;

	private Integer maxEntries;

	private String ipVersion;

	private Boolean dryRun;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String prefixListName;

	private String prefixListDescription;
	public CreateVpcPrefixListRequest() {
		super("Vpc", "2016-04-28", "CreateVpcPrefixList", "vpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<PrefixListEntrys> getPrefixListEntryss() {
		return this.prefixListEntryss;
	}

	public void setPrefixListEntryss(List<PrefixListEntrys> prefixListEntryss) {
		this.prefixListEntryss = prefixListEntryss;	
		if (prefixListEntryss != null) {
			for (int depth1 = 0; depth1 < prefixListEntryss.size(); depth1++) {
				putQueryParameter("PrefixListEntrys." + (depth1 + 1) + ".Cidr" , prefixListEntryss.get(depth1).getCidr());
				putQueryParameter("PrefixListEntrys." + (depth1 + 1) + ".Description" , prefixListEntryss.get(depth1).getDescription());
			}
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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
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

	public String getIpVersion() {
		return this.ipVersion;
	}

	public void setIpVersion(String ipVersion) {
		this.ipVersion = ipVersion;
		if(ipVersion != null){
			putQueryParameter("IpVersion", ipVersion);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
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

	public String getPrefixListDescription() {
		return this.prefixListDescription;
	}

	public void setPrefixListDescription(String prefixListDescription) {
		this.prefixListDescription = prefixListDescription;
		if(prefixListDescription != null){
			putQueryParameter("PrefixListDescription", prefixListDescription);
		}
	}

	public static class PrefixListEntrys {

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
	public Class<CreateVpcPrefixListResponse> getResponseClass() {
		return CreateVpcPrefixListResponse.class;
	}

}
