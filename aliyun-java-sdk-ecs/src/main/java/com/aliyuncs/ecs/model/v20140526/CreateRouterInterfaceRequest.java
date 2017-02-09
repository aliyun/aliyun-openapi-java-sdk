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
package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateRouterInterfaceRequest extends RpcAcsRequest<CreateRouterInterfaceResponse> {
	
	public CreateRouterInterfaceRequest() {
		super("Ecs", "2014-05-26", "CreateRouterInterface", "ecs");
	}

	private String role;

	private String oppositeRegionId;

	private String spec;

	private String routerType;

	private String routerId;

	private String oppositeInterfaceId;

	private String oppositeRouterId;

	private String oppositeRouterType;

	private String oppositeInterfaceOwnerId;

	private String healthCheckSourceIp;

	private String healthCheckTargetIp;

	private String accessPointId;

	private String oppositeAccessPointId;

	private String description;

	private String name;

	private String clientToken;

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private String ownerAccount;

	private String userCidr;

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
		putQueryParameter("Role", role);
	}

	public String getOppositeRegionId() {
		return this.oppositeRegionId;
	}

	public void setOppositeRegionId(String oppositeRegionId) {
		this.oppositeRegionId = oppositeRegionId;
		putQueryParameter("OppositeRegionId", oppositeRegionId);
	}

	public String getSpec() {
		return this.spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
		putQueryParameter("Spec", spec);
	}

	public String getRouterType() {
		return this.routerType;
	}

	public void setRouterType(String routerType) {
		this.routerType = routerType;
		putQueryParameter("RouterType", routerType);
	}

	public String getRouterId() {
		return this.routerId;
	}

	public void setRouterId(String routerId) {
		this.routerId = routerId;
		putQueryParameter("RouterId", routerId);
	}

	public String getOppositeInterfaceId() {
		return this.oppositeInterfaceId;
	}

	public void setOppositeInterfaceId(String oppositeInterfaceId) {
		this.oppositeInterfaceId = oppositeInterfaceId;
		putQueryParameter("OppositeInterfaceId", oppositeInterfaceId);
	}

	public String getOppositeRouterId() {
		return this.oppositeRouterId;
	}

	public void setOppositeRouterId(String oppositeRouterId) {
		this.oppositeRouterId = oppositeRouterId;
		putQueryParameter("OppositeRouterId", oppositeRouterId);
	}

	public String getOppositeRouterType() {
		return this.oppositeRouterType;
	}

	public void setOppositeRouterType(String oppositeRouterType) {
		this.oppositeRouterType = oppositeRouterType;
		putQueryParameter("OppositeRouterType", oppositeRouterType);
	}

	public String getOppositeInterfaceOwnerId() {
		return this.oppositeInterfaceOwnerId;
	}

	public void setOppositeInterfaceOwnerId(String oppositeInterfaceOwnerId) {
		this.oppositeInterfaceOwnerId = oppositeInterfaceOwnerId;
		putQueryParameter("OppositeInterfaceOwnerId", oppositeInterfaceOwnerId);
	}

	public String getHealthCheckSourceIp() {
		return this.healthCheckSourceIp;
	}

	public void setHealthCheckSourceIp(String healthCheckSourceIp) {
		this.healthCheckSourceIp = healthCheckSourceIp;
		putQueryParameter("HealthCheckSourceIp", healthCheckSourceIp);
	}

	public String getHealthCheckTargetIp() {
		return this.healthCheckTargetIp;
	}

	public void setHealthCheckTargetIp(String healthCheckTargetIp) {
		this.healthCheckTargetIp = healthCheckTargetIp;
		putQueryParameter("HealthCheckTargetIp", healthCheckTargetIp);
	}

	public String getAccessPointId() {
		return this.accessPointId;
	}

	public void setAccessPointId(String accessPointId) {
		this.accessPointId = accessPointId;
		putQueryParameter("AccessPointId", accessPointId);
	}

	public String getOppositeAccessPointId() {
		return this.oppositeAccessPointId;
	}

	public void setOppositeAccessPointId(String oppositeAccessPointId) {
		this.oppositeAccessPointId = oppositeAccessPointId;
		putQueryParameter("OppositeAccessPointId", oppositeAccessPointId);
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		putQueryParameter("Description", description);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		putQueryParameter("Name", name);
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		putQueryParameter("ClientToken", clientToken);
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		putQueryParameter("OwnerId", ownerId);
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		putQueryParameter("ResourceOwnerId", resourceOwnerId);
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		putQueryParameter("OwnerAccount", ownerAccount);
	}

	public String getUserCidr() {
		return this.userCidr;
	}

	public void setUserCidr(String userCidr) {
		this.userCidr = userCidr;
		putQueryParameter("UserCidr", userCidr);
	}

	@Override
	public Class<CreateRouterInterfaceResponse> getResponseClass() {
		return CreateRouterInterfaceResponse.class;
	}

}
