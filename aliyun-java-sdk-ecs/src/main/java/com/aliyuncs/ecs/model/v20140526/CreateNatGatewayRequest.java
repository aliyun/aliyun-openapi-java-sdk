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
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class CreateNatGatewayRequest extends RpcAcsRequest<CreateNatGatewayResponse> {
	
	public CreateNatGatewayRequest() {
		super("Ecs", "2014-05-26", "CreateNatGateway", "ecs");
	}

	private List<BandwidthPackage> bandwidthPackages;

	private String clientToken;

	private String resourceOwnerAccount;

	private String description;

	private String name;

	private Long resourceOwnerId;

	private String vpcId;

	private String ownerAccount;

	private Long ownerId;

	public List<BandwidthPackage> getBandwidthPackages() {
		return this.bandwidthPackages;
	}

	public void setBandwidthPackages(List<BandwidthPackage> bandwidthPackage) {
		this.bandwidthPackages = bandwidthPackage;	
		for (int i = 0; i < bandwidthPackage.size(); i++) {
			putQueryParameter("BandwidthPackage." + (i + 1) + ".IpCount" , bandwidthPackage.get(i).getIpCount());
			putQueryParameter("BandwidthPackage." + (i + 1) + ".Bandwidth" , bandwidthPackage.get(i).getBandwidth());
			putQueryParameter("BandwidthPackage." + (i + 1) + ".Zone" , bandwidthPackage.get(i).getZone());
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
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

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public static class BandwidthPackage {

		private Integer ipCount;

		private Integer bandwidth;

		private String zone;

		public Integer getIpCount() {
			return this.ipCount;
		}

		public void setIpCount(Integer ipCount) {
			this.ipCount = ipCount;
		}

		public Integer getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Integer bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getZone() {
			return this.zone;
		}

		public void setZone(String zone) {
			this.zone = zone;
		}
	}

	@Override
	public Class<CreateNatGatewayResponse> getResponseClass() {
		return CreateNatGatewayResponse.class;
	}

}
