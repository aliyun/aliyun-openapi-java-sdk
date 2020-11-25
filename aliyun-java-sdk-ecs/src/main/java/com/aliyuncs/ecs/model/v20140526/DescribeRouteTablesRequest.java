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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeRouteTablesRequest extends RpcAcsRequest<DescribeRouteTablesResponse> {
	   

	private Long resourceOwnerId;

	private String vRouterId;

	private Integer pageNumber;

	private String routeTableName;

	private Integer pageSize;

	private String routeTableId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String routerType;

	private String routerId;
	public DescribeRouteTablesRequest() {
		super("Ecs", "2014-05-26", "DescribeRouteTables", "ecs");
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

	public String getVRouterId() {
		return this.vRouterId;
	}

	public void setVRouterId(String vRouterId) {
		this.vRouterId = vRouterId;
		if(vRouterId != null){
			putQueryParameter("VRouterId", vRouterId);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getRouteTableName() {
		return this.routeTableName;
	}

	public void setRouteTableName(String routeTableName) {
		this.routeTableName = routeTableName;
		if(routeTableName != null){
			putQueryParameter("RouteTableName", routeTableName);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
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

	public String getRouterType() {
		return this.routerType;
	}

	public void setRouterType(String routerType) {
		this.routerType = routerType;
		if(routerType != null){
			putQueryParameter("RouterType", routerType);
		}
	}

	public String getRouterId() {
		return this.routerId;
	}

	public void setRouterId(String routerId) {
		this.routerId = routerId;
		if(routerId != null){
			putQueryParameter("RouterId", routerId);
		}
	}

	@Override
	public Class<DescribeRouteTablesResponse> getResponseClass() {
		return DescribeRouteTablesResponse.class;
	}

}
