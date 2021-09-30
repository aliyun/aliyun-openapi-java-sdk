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
public class ListNatIpsRequest extends RpcAcsRequest<ListNatIpsResponse> {
	   

	private Long resourceOwnerId;

	private String natIpStatus;

	private List<String> natIpNames;

	private String clientToken;

	private String nextToken;

	private String natGatewayId;

	private List<String> natIpIdss;

	private Boolean dryRun;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String natIpCidr;

	private String maxResults;
	public ListNatIpsRequest() {
		super("Vpc", "2016-04-28", "ListNatIps", "vpc");
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

	public String getNatIpStatus() {
		return this.natIpStatus;
	}

	public void setNatIpStatus(String natIpStatus) {
		this.natIpStatus = natIpStatus;
		if(natIpStatus != null){
			putQueryParameter("NatIpStatus", natIpStatus);
		}
	}

	public List<String> getNatIpNames() {
		return this.natIpNames;
	}

	public void setNatIpNames(List<String> natIpNames) {
		this.natIpNames = natIpNames;	
		if (natIpNames != null) {
			for (int i = 0; i < natIpNames.size(); i++) {
				putQueryParameter("NatIpName." + (i + 1) , natIpNames.get(i));
			}
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

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public String getNatGatewayId() {
		return this.natGatewayId;
	}

	public void setNatGatewayId(String natGatewayId) {
		this.natGatewayId = natGatewayId;
		if(natGatewayId != null){
			putQueryParameter("NatGatewayId", natGatewayId);
		}
	}

	public List<String> getNatIpIdss() {
		return this.natIpIdss;
	}

	public void setNatIpIdss(List<String> natIpIdss) {
		this.natIpIdss = natIpIdss;	
		if (natIpIdss != null) {
			for (int i = 0; i < natIpIdss.size(); i++) {
				putQueryParameter("NatIpIds." + (i + 1) , natIpIdss.get(i));
			}
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

	public String getNatIpCidr() {
		return this.natIpCidr;
	}

	public void setNatIpCidr(String natIpCidr) {
		this.natIpCidr = natIpCidr;
		if(natIpCidr != null){
			putQueryParameter("NatIpCidr", natIpCidr);
		}
	}

	public String getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(String maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults);
		}
	}

	@Override
	public Class<ListNatIpsResponse> getResponseClass() {
		return ListNatIpsResponse.class;
	}

}
