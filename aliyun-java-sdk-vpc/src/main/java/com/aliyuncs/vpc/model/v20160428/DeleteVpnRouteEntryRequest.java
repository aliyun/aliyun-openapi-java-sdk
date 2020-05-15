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
public class DeleteVpnRouteEntryRequest extends RpcAcsRequest<DeleteVpnRouteEntryResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Integer weight;

	private String vpnGatewayId;

	private Long ownerId;

	private String routeDest;

	private String nextHop;

	private String overlayMode;
	public DeleteVpnRouteEntryRequest() {
		super("Vpc", "2016-04-28", "DeleteVpnRouteEntry", "vpc");
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

	public Integer getWeight() {
		return this.weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
		if(weight != null){
			putQueryParameter("Weight", weight.toString());
		}
	}

	public String getVpnGatewayId() {
		return this.vpnGatewayId;
	}

	public void setVpnGatewayId(String vpnGatewayId) {
		this.vpnGatewayId = vpnGatewayId;
		if(vpnGatewayId != null){
			putQueryParameter("VpnGatewayId", vpnGatewayId);
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

	public String getRouteDest() {
		return this.routeDest;
	}

	public void setRouteDest(String routeDest) {
		this.routeDest = routeDest;
		if(routeDest != null){
			putQueryParameter("RouteDest", routeDest);
		}
	}

	public String getNextHop() {
		return this.nextHop;
	}

	public void setNextHop(String nextHop) {
		this.nextHop = nextHop;
		if(nextHop != null){
			putQueryParameter("NextHop", nextHop);
		}
	}

	public String getOverlayMode() {
		return this.overlayMode;
	}

	public void setOverlayMode(String overlayMode) {
		this.overlayMode = overlayMode;
		if(overlayMode != null){
			putQueryParameter("OverlayMode", overlayMode);
		}
	}

	@Override
	public Class<DeleteVpnRouteEntryResponse> getResponseClass() {
		return DeleteVpnRouteEntryResponse.class;
	}

}
