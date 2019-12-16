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
public class DescribeRouteEntryListRequest extends RpcAcsRequest<DescribeRouteEntryListResponse> {
	   

	private Long resourceOwnerId;

	private String routeEntryName;

	private String nextToken;

	private String routeEntryType;

	private String ipVersion;

	private String nextHopId;

	private String nextHopType;

	private String routeTableId;

	private String resourceOwnerAccount;

	private String destinationCidrBlock;

	private String ownerAccount;

	private Long ownerId;

	private Integer maxResult;

	private String routeEntryId;
	public DescribeRouteEntryListRequest() {
		super("Vpc", "2016-04-28", "DescribeRouteEntryList", "Vpc");
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

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public String getRouteEntryType() {
		return this.routeEntryType;
	}

	public void setRouteEntryType(String routeEntryType) {
		this.routeEntryType = routeEntryType;
		if(routeEntryType != null){
			putQueryParameter("RouteEntryType", routeEntryType);
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

	public Integer getMaxResult() {
		return this.maxResult;
	}

	public void setMaxResult(Integer maxResult) {
		this.maxResult = maxResult;
		if(maxResult != null){
			putQueryParameter("MaxResult", maxResult.toString());
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
	public Class<DescribeRouteEntryListResponse> getResponseClass() {
		return DescribeRouteEntryListResponse.class;
	}

}
