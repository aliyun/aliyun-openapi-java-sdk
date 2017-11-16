/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeRouteTableListRequest extends RpcAcsRequest<DescribeRouteTableListResponse> {
	
	public DescribeRouteTableListRequest() {
		super("Vpc", "2016-04-28", "DescribeRouteTableList", "vpc");
	}

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private String bandwidth;

	private String ownerAccount;

	private Long ownerId;

	private Integer pageNumber;

	private String routerType;

	private String kbpsBandwidth;

	private String routeTableName;

	private String routerId;

	private String vpcId;

	private Long resourceUid;

	private Integer pageSize;

	private String resourceBid;

	private String routeTableId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public String getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(String bandwidth) {
		this.bandwidth = bandwidth;
		if(bandwidth != null){
			putQueryParameter("Bandwidth", bandwidth);
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
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

	public String getKbpsBandwidth() {
		return this.kbpsBandwidth;
	}

	public void setKbpsBandwidth(String kbpsBandwidth) {
		this.kbpsBandwidth = kbpsBandwidth;
		if(kbpsBandwidth != null){
			putQueryParameter("KbpsBandwidth", kbpsBandwidth);
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

	public String getRouterId() {
		return this.routerId;
	}

	public void setRouterId(String routerId) {
		this.routerId = routerId;
		if(routerId != null){
			putQueryParameter("RouterId", routerId);
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	public Long getResourceUid() {
		return this.resourceUid;
	}

	public void setResourceUid(Long resourceUid) {
		this.resourceUid = resourceUid;
		if(resourceUid != null){
			putQueryParameter("ResourceUid", resourceUid.toString());
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

	public String getResourceBid() {
		return this.resourceBid;
	}

	public void setResourceBid(String resourceBid) {
		this.resourceBid = resourceBid;
		if(resourceBid != null){
			putQueryParameter("ResourceBid", resourceBid);
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

	@Override
	public Class<DescribeRouteTableListResponse> getResponseClass() {
		return DescribeRouteTableListResponse.class;
	}

}
