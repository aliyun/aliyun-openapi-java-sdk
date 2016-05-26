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
public class CreateVirtualBorderRouterRequest extends RpcAcsRequest<CreateVirtualBorderRouterResponse> {
	
	public CreateVirtualBorderRouterRequest() {
		super("Ecs", "2014-05-26", "CreateVirtualBorderRouter", "ecs");
	}

	private String physicalConnectionId;

	private Long vbrOwnerId;

	private Integer vlanId;

	private String circuitCode;

	private String localGatewayIp;

	private String peerGatewayIp;

	private String peeringSubnetMask;

	private String description;

	private String name;

	private String clientToken;

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private String ownerAccount;

	private String userCidr;

	public String getPhysicalConnectionId() {
		return this.physicalConnectionId;
	}

	public void setPhysicalConnectionId(String physicalConnectionId) {
		this.physicalConnectionId = physicalConnectionId;
		putQueryParameter("PhysicalConnectionId", physicalConnectionId);
	}

	public Long getVbrOwnerId() {
		return this.vbrOwnerId;
	}

	public void setVbrOwnerId(Long vbrOwnerId) {
		this.vbrOwnerId = vbrOwnerId;
		putQueryParameter("VbrOwnerId", vbrOwnerId);
	}

	public Integer getVlanId() {
		return this.vlanId;
	}

	public void setVlanId(Integer vlanId) {
		this.vlanId = vlanId;
		putQueryParameter("VlanId", vlanId);
	}

	public String getCircuitCode() {
		return this.circuitCode;
	}

	public void setCircuitCode(String circuitCode) {
		this.circuitCode = circuitCode;
		putQueryParameter("CircuitCode", circuitCode);
	}

	public String getLocalGatewayIp() {
		return this.localGatewayIp;
	}

	public void setLocalGatewayIp(String localGatewayIp) {
		this.localGatewayIp = localGatewayIp;
		putQueryParameter("LocalGatewayIp", localGatewayIp);
	}

	public String getPeerGatewayIp() {
		return this.peerGatewayIp;
	}

	public void setPeerGatewayIp(String peerGatewayIp) {
		this.peerGatewayIp = peerGatewayIp;
		putQueryParameter("PeerGatewayIp", peerGatewayIp);
	}

	public String getPeeringSubnetMask() {
		return this.peeringSubnetMask;
	}

	public void setPeeringSubnetMask(String peeringSubnetMask) {
		this.peeringSubnetMask = peeringSubnetMask;
		putQueryParameter("PeeringSubnetMask", peeringSubnetMask);
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
	public Class<CreateVirtualBorderRouterResponse> getResponseClass() {
		return CreateVirtualBorderRouterResponse.class;
	}

}
