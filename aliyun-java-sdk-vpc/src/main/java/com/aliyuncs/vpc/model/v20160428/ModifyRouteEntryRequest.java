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
public class ModifyRouteEntryRequest extends RpcAcsRequest<ModifyRouteEntryResponse> {
	   

	private Long resourceOwnerId;

	private String routeEntryName;

	private String description;

	private String newNextHopId;

	private String routeTableId;

	private Boolean dryRun;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String destinationCidrBlock;

	private Long ownerId;

	private String newNextHopType;

	private String routeEntryId;
	public ModifyRouteEntryRequest() {
		super("Vpc", "2016-04-28", "ModifyRouteEntry", "vpc");
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

	public String getRouteEntryName() {
		return this.routeEntryName;
	}

	public void setRouteEntryName(String routeEntryName) {
		this.routeEntryName = routeEntryName;
		if(routeEntryName != null){
			putQueryParameter("RouteEntryName", routeEntryName);
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

	public String getNewNextHopId() {
		return this.newNextHopId;
	}

	public void setNewNextHopId(String newNextHopId) {
		this.newNextHopId = newNextHopId;
		if(newNextHopId != null){
			putQueryParameter("NewNextHopId", newNextHopId);
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

	public String getDestinationCidrBlock() {
		return this.destinationCidrBlock;
	}

	public void setDestinationCidrBlock(String destinationCidrBlock) {
		this.destinationCidrBlock = destinationCidrBlock;
		if(destinationCidrBlock != null){
			putQueryParameter("DestinationCidrBlock", destinationCidrBlock);
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

	public String getNewNextHopType() {
		return this.newNextHopType;
	}

	public void setNewNextHopType(String newNextHopType) {
		this.newNextHopType = newNextHopType;
		if(newNextHopType != null){
			putQueryParameter("NewNextHopType", newNextHopType);
		}
	}

	public String getRouteEntryId() {
		return this.routeEntryId;
	}

	public void setRouteEntryId(String routeEntryId) {
		this.routeEntryId = routeEntryId;
		if(routeEntryId != null){
			putQueryParameter("RouteEntryId", routeEntryId);
		}
	}

	@Override
	public Class<ModifyRouteEntryResponse> getResponseClass() {
		return ModifyRouteEntryResponse.class;
	}

}
