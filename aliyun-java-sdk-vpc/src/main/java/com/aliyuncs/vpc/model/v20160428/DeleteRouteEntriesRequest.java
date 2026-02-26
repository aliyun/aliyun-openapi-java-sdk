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
public class DeleteRouteEntriesRequest extends RpcAcsRequest<DeleteRouteEntriesResponse> {
	   

	private Long resourceOwnerId;

	private Boolean dryRun;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private List<RouteEntries> routeEntriess;
	public DeleteRouteEntriesRequest() {
		super("Vpc", "2016-04-28", "DeleteRouteEntries", "vpc");
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

	public List<RouteEntries> getRouteEntriess() {
		return this.routeEntriess;
	}

	public void setRouteEntriess(List<RouteEntries> routeEntriess) {
		this.routeEntriess = routeEntriess;	
		if (routeEntriess != null) {
			for (int depth1 = 0; depth1 < routeEntriess.size(); depth1++) {
				putQueryParameter("RouteEntries." + (depth1 + 1) + ".RouteTableId" , routeEntriess.get(depth1).getRouteTableId());
				putQueryParameter("RouteEntries." + (depth1 + 1) + ".RouteEntryId" , routeEntriess.get(depth1).getRouteEntryId());
				putQueryParameter("RouteEntries." + (depth1 + 1) + ".DstCidrBlock" , routeEntriess.get(depth1).getDstCidrBlock());
				putQueryParameter("RouteEntries." + (depth1 + 1) + ".NextHop" , routeEntriess.get(depth1).getNextHop());
			}
		}	
	}

	public static class RouteEntries {

		private String routeTableId;

		private String routeEntryId;

		private String dstCidrBlock;

		private String nextHop;

		public String getRouteTableId() {
			return this.routeTableId;
		}

		public void setRouteTableId(String routeTableId) {
			this.routeTableId = routeTableId;
		}

		public String getRouteEntryId() {
			return this.routeEntryId;
		}

		public void setRouteEntryId(String routeEntryId) {
			this.routeEntryId = routeEntryId;
		}

		public String getDstCidrBlock() {
			return this.dstCidrBlock;
		}

		public void setDstCidrBlock(String dstCidrBlock) {
			this.dstCidrBlock = dstCidrBlock;
		}

		public String getNextHop() {
			return this.nextHop;
		}

		public void setNextHop(String nextHop) {
			this.nextHop = nextHop;
		}
	}

	@Override
	public Class<DeleteRouteEntriesResponse> getResponseClass() {
		return DeleteRouteEntriesResponse.class;
	}

}
