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
public class CreateDhcpOptionsSetRequest extends RpcAcsRequest<CreateDhcpOptionsSetResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String resourceGroupId;

	private String leaseTime;

	private String domainNameServers;

	private List<Tag> tags;

	private String dhcpOptionsSetDescription;

	private Boolean dryRun;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String domainName;

	private Long ownerId;

	private String dhcpOptionsSetName;

	private String ipv6LeaseTime;
	public CreateDhcpOptionsSetRequest() {
		super("Vpc", "2016-04-28", "CreateDhcpOptionsSet", "vpc");
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

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getLeaseTime() {
		return this.leaseTime;
	}

	public void setLeaseTime(String leaseTime) {
		this.leaseTime = leaseTime;
		if(leaseTime != null){
			putQueryParameter("LeaseTime", leaseTime);
		}
	}

	public String getDomainNameServers() {
		return this.domainNameServers;
	}

	public void setDomainNameServers(String domainNameServers) {
		this.domainNameServers = domainNameServers;
		if(domainNameServers != null){
			putQueryParameter("DomainNameServers", domainNameServers);
		}
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
			}
		}	
	}

	public String getDhcpOptionsSetDescription() {
		return this.dhcpOptionsSetDescription;
	}

	public void setDhcpOptionsSetDescription(String dhcpOptionsSetDescription) {
		this.dhcpOptionsSetDescription = dhcpOptionsSetDescription;
		if(dhcpOptionsSetDescription != null){
			putQueryParameter("DhcpOptionsSetDescription", dhcpOptionsSetDescription);
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

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
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

	public String getDhcpOptionsSetName() {
		return this.dhcpOptionsSetName;
	}

	public void setDhcpOptionsSetName(String dhcpOptionsSetName) {
		this.dhcpOptionsSetName = dhcpOptionsSetName;
		if(dhcpOptionsSetName != null){
			putQueryParameter("DhcpOptionsSetName", dhcpOptionsSetName);
		}
	}

	public String getIpv6LeaseTime() {
		return this.ipv6LeaseTime;
	}

	public void setIpv6LeaseTime(String ipv6LeaseTime) {
		this.ipv6LeaseTime = ipv6LeaseTime;
		if(ipv6LeaseTime != null){
			putQueryParameter("Ipv6LeaseTime", ipv6LeaseTime);
		}
	}

	public static class Tag {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public Class<CreateDhcpOptionsSetResponse> getResponseClass() {
		return CreateDhcpOptionsSetResponse.class;
	}

}
