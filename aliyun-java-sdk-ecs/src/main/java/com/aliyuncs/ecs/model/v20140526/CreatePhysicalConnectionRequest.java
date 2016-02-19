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
public class CreatePhysicalConnectionRequest extends RpcAcsRequest<CreatePhysicalConnectionResponse> {
	
	public CreatePhysicalConnectionRequest() {
		super("Ecs", "2014-05-26", "CreatePhysicalConnection");
	}

	private String accessPointId;

	private String type;

	private String lineOperator;

	private Integer bandwidth;

	private String peerLocation;

	private String portType;

	private String redundantPhysicalConnectionId;

	private String description;

	private String name;

	private String circuitCode;

	private String clientToken;

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private String ownerAccount;

	private String userCidr;

	public String getAccessPointId() {
		return this.accessPointId;
	}

	public void setAccessPointId(String accessPointId) {
		this.accessPointId = accessPointId;
		putQueryParameter("AccessPointId", accessPointId);
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		putQueryParameter("Type", type);
	}

	public String getLineOperator() {
		return this.lineOperator;
	}

	public void setLineOperator(String lineOperator) {
		this.lineOperator = lineOperator;
		putQueryParameter("LineOperator", lineOperator);
	}

	public Integer getbandwidth() {
		return this.bandwidth;
	}

	public void setbandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
		putQueryParameter("bandwidth", bandwidth);
	}

	public String getPeerLocation() {
		return this.peerLocation;
	}

	public void setPeerLocation(String peerLocation) {
		this.peerLocation = peerLocation;
		putQueryParameter("PeerLocation", peerLocation);
	}

	public String getPortType() {
		return this.portType;
	}

	public void setPortType(String portType) {
		this.portType = portType;
		putQueryParameter("PortType", portType);
	}

	public String getRedundantPhysicalConnectionId() {
		return this.redundantPhysicalConnectionId;
	}

	public void setRedundantPhysicalConnectionId(String redundantPhysicalConnectionId) {
		this.redundantPhysicalConnectionId = redundantPhysicalConnectionId;
		putQueryParameter("RedundantPhysicalConnectionId", redundantPhysicalConnectionId);
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

	public String getCircuitCode() {
		return this.circuitCode;
	}

	public void setCircuitCode(String circuitCode) {
		this.circuitCode = circuitCode;
		putQueryParameter("CircuitCode", circuitCode);
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
	public Class<CreatePhysicalConnectionResponse> getResponseClass() {
		return CreatePhysicalConnectionResponse.class;
	}

}
