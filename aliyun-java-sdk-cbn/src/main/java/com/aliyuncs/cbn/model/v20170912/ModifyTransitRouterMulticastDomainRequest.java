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

package com.aliyuncs.cbn.model.v20170912;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cbn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyTransitRouterMulticastDomainRequest extends RpcAcsRequest<ModifyTransitRouterMulticastDomainResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String transitRouterMulticastDomainId;

	private String transitRouterMulticastDomainDescription;

	private String transitRouterMulticastDomainName;

	private Boolean dryRun;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;
	public ModifyTransitRouterMulticastDomainRequest() {
		super("Cbn", "2017-09-12", "ModifyTransitRouterMulticastDomain");
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

	public String getTransitRouterMulticastDomainId() {
		return this.transitRouterMulticastDomainId;
	}

	public void setTransitRouterMulticastDomainId(String transitRouterMulticastDomainId) {
		this.transitRouterMulticastDomainId = transitRouterMulticastDomainId;
		if(transitRouterMulticastDomainId != null){
			putQueryParameter("TransitRouterMulticastDomainId", transitRouterMulticastDomainId);
		}
	}

	public String getTransitRouterMulticastDomainDescription() {
		return this.transitRouterMulticastDomainDescription;
	}

	public void setTransitRouterMulticastDomainDescription(String transitRouterMulticastDomainDescription) {
		this.transitRouterMulticastDomainDescription = transitRouterMulticastDomainDescription;
		if(transitRouterMulticastDomainDescription != null){
			putQueryParameter("TransitRouterMulticastDomainDescription", transitRouterMulticastDomainDescription);
		}
	}

	public String getTransitRouterMulticastDomainName() {
		return this.transitRouterMulticastDomainName;
	}

	public void setTransitRouterMulticastDomainName(String transitRouterMulticastDomainName) {
		this.transitRouterMulticastDomainName = transitRouterMulticastDomainName;
		if(transitRouterMulticastDomainName != null){
			putQueryParameter("TransitRouterMulticastDomainName", transitRouterMulticastDomainName);
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

	@Override
	public Class<ModifyTransitRouterMulticastDomainResponse> getResponseClass() {
		return ModifyTransitRouterMulticastDomainResponse.class;
	}

}
