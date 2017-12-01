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

	private String redundantPhysicalConnectionId;

	private String peerLocation;

	private Long resourceOwnerId;

	private String portType;

	private String circuitCode;

	private Integer bandwidth;

	private String clientToken;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String description;

	private String type;

	private Long ownerId;

	private String lineOperator;

	private String name;

	private String userCidr;

	public String getAccessPointId() {
		return this.accessPointId;
	}

	public void setAccessPointId(String accessPointId) {
		this.accessPointId = accessPointId;
		if(accessPointId != null){
			putQueryParameter("AccessPointId", accessPointId);
		}
	}

	public String getRedundantPhysicalConnectionId() {
		return this.redundantPhysicalConnectionId;
	}

	public void setRedundantPhysicalConnectionId(String redundantPhysicalConnectionId) {
		this.redundantPhysicalConnectionId = redundantPhysicalConnectionId;
		if(redundantPhysicalConnectionId != null){
			putQueryParameter("RedundantPhysicalConnectionId", redundantPhysicalConnectionId);
		}
	}

	public String getPeerLocation() {
		return this.peerLocation;
	}

	public void setPeerLocation(String peerLocation) {
		this.peerLocation = peerLocation;
		if(peerLocation != null){
			putQueryParameter("PeerLocation", peerLocation);
		}
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

	public String getPortType() {
		return this.portType;
	}

	public void setPortType(String portType) {
		this.portType = portType;
		if(portType != null){
			putQueryParameter("PortType", portType);
		}
	}

	public String getCircuitCode() {
		return this.circuitCode;
	}

	public void setCircuitCode(String circuitCode) {
		this.circuitCode = circuitCode;
		if(circuitCode != null){
			putQueryParameter("CircuitCode", circuitCode);
		}
	}

	public Integer getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
		this.bandwidth = bandwidth;
		if(bandwidth != null){
			putQueryParameter("bandwidth", bandwidth.toString());
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
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

	public String getLineOperator() {
		return this.lineOperator;
	}

	public void setLineOperator(String lineOperator) {
		this.lineOperator = lineOperator;
		if(lineOperator != null){
			putQueryParameter("LineOperator", lineOperator);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getUserCidr() {
		return this.userCidr;
	}

	public void setUserCidr(String userCidr) {
		this.userCidr = userCidr;
		if(userCidr != null){
			putQueryParameter("UserCidr", userCidr);
		}
	}

	@Override
	public Class<CreatePhysicalConnectionResponse> getResponseClass() {
		return CreatePhysicalConnectionResponse.class;
	}

}
