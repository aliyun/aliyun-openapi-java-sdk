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
public class DeleteTransitRouterRouteEntryRequest extends RpcAcsRequest<DeleteTransitRouterRouteEntryResponse> {
	   

	private String transitRouterRouteEntryId;

	private Long resourceOwnerId;

	private String clientToken;

	private String transitRouterRouteEntryNextHopType;

	private String transitRouterRouteEntryDestinationCidrBlock;

	private String transitRouterRouteTableId;

	private String transitRouterRouteEntryNextHopId;

	private Boolean dryRun;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;
	public DeleteTransitRouterRouteEntryRequest() {
		super("Cbn", "2017-09-12", "DeleteTransitRouterRouteEntry", "cbn");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTransitRouterRouteEntryId() {
		return this.transitRouterRouteEntryId;
	}

	public void setTransitRouterRouteEntryId(String transitRouterRouteEntryId) {
		this.transitRouterRouteEntryId = transitRouterRouteEntryId;
		if(transitRouterRouteEntryId != null){
			putQueryParameter("TransitRouterRouteEntryId", transitRouterRouteEntryId);
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

	public String getTransitRouterRouteEntryNextHopType() {
		return this.transitRouterRouteEntryNextHopType;
	}

	public void setTransitRouterRouteEntryNextHopType(String transitRouterRouteEntryNextHopType) {
		this.transitRouterRouteEntryNextHopType = transitRouterRouteEntryNextHopType;
		if(transitRouterRouteEntryNextHopType != null){
			putQueryParameter("TransitRouterRouteEntryNextHopType", transitRouterRouteEntryNextHopType);
		}
	}

	public String getTransitRouterRouteEntryDestinationCidrBlock() {
		return this.transitRouterRouteEntryDestinationCidrBlock;
	}

	public void setTransitRouterRouteEntryDestinationCidrBlock(String transitRouterRouteEntryDestinationCidrBlock) {
		this.transitRouterRouteEntryDestinationCidrBlock = transitRouterRouteEntryDestinationCidrBlock;
		if(transitRouterRouteEntryDestinationCidrBlock != null){
			putQueryParameter("TransitRouterRouteEntryDestinationCidrBlock", transitRouterRouteEntryDestinationCidrBlock);
		}
	}

	public String getTransitRouterRouteTableId() {
		return this.transitRouterRouteTableId;
	}

	public void setTransitRouterRouteTableId(String transitRouterRouteTableId) {
		this.transitRouterRouteTableId = transitRouterRouteTableId;
		if(transitRouterRouteTableId != null){
			putQueryParameter("TransitRouterRouteTableId", transitRouterRouteTableId);
		}
	}

	public String getTransitRouterRouteEntryNextHopId() {
		return this.transitRouterRouteEntryNextHopId;
	}

	public void setTransitRouterRouteEntryNextHopId(String transitRouterRouteEntryNextHopId) {
		this.transitRouterRouteEntryNextHopId = transitRouterRouteEntryNextHopId;
		if(transitRouterRouteEntryNextHopId != null){
			putQueryParameter("TransitRouterRouteEntryNextHopId", transitRouterRouteEntryNextHopId);
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
	public Class<DeleteTransitRouterRouteEntryResponse> getResponseClass() {
		return DeleteTransitRouterRouteEntryResponse.class;
	}

}
