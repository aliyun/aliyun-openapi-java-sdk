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
public class CreateRouteEntryRequest extends RpcAcsRequest<CreateRouteEntryResponse> {
	
	public CreateRouteEntryRequest() {
		super("Vpc", "2016-04-28", "CreateRouteEntry", "vpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long resourceOwnerId;

	private String routeEntryName;

	private String clientToken;

	private String nextHopId;

	private String nextHopType;

	private String routeTableId;

	private String resourceOwnerAccount;

	private String destinationCidrBlock;

	private String ownerAccount;

	private Long ownerId;

	private List<NextHopList> nextHopLists;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getRouteEntryName() {
		return this.routeEntryName;
	}

	public void setRouteEntryName(String routeEntryName) {
		this.routeEntryName = routeEntryName;
		if(routeEntryName != null){
			putQueryParameter("RouteEntryName", routeEntryName);
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

	public String getNextHopId() {
		return this.nextHopId;
	}

	public void setNextHopId(String nextHopId) {
		this.nextHopId = nextHopId;
		if(nextHopId != null){
			putQueryParameter("NextHopId", nextHopId);
		}
	}

	public String getNextHopType() {
		return this.nextHopType;
	}

	public void setNextHopType(String nextHopType) {
		this.nextHopType = nextHopType;
		if(nextHopType != null){
			putQueryParameter("NextHopType", nextHopType);
		}
	}

	public String getRouteTableId() {
		return this.routeTableId;
	}

	public void setRouteTableId(String routeTableId) {
		this.routeTableId = routeTableId;
		if(routeTableId != null){
			putQueryParameter("RouteTableId", routeTableId);
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

	public String getDestinationCidrBlock() {
		return this.destinationCidrBlock;
	}

	public void setDestinationCidrBlock(String destinationCidrBlock) {
		this.destinationCidrBlock = destinationCidrBlock;
		if(destinationCidrBlock != null){
			putQueryParameter("DestinationCidrBlock", destinationCidrBlock);
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

	public List<NextHopList> getNextHopLists() {
		return this.nextHopLists;
	}

	public void setNextHopLists(List<NextHopList> nextHopLists) {
		this.nextHopLists = nextHopLists;	
		if (nextHopLists != null) {
			for (int depth1 = 0; depth1 < nextHopLists.size(); depth1++) {
				putQueryParameter("NextHopList." + (depth1 + 1) + ".Weight" , nextHopLists.get(depth1).getWeight());
				putQueryParameter("NextHopList." + (depth1 + 1) + ".NextHopId" , nextHopLists.get(depth1).getNextHopId());
				putQueryParameter("NextHopList." + (depth1 + 1) + ".NextHopType" , nextHopLists.get(depth1).getNextHopType());
			}
		}	
	}

	public static class NextHopList {

		private Integer weight;

		private String nextHopId;

		private String nextHopType;

		public Integer getWeight() {
			return this.weight;
		}

		public void setWeight(Integer weight) {
			this.weight = weight;
		}

		public String getNextHopId() {
			return this.nextHopId;
		}

		public void setNextHopId(String nextHopId) {
			this.nextHopId = nextHopId;
		}

		public String getNextHopType() {
			return this.nextHopType;
		}

		public void setNextHopType(String nextHopType) {
			this.nextHopType = nextHopType;
		}
	}

	@Override
	public Class<CreateRouteEntryResponse> getResponseClass() {
		return CreateRouteEntryResponse.class;
	}

}
