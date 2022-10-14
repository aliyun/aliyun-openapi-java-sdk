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
public class CreateVirtualBorderRouterRequest extends RpcAcsRequest<CreateVirtualBorderRouterResponse> {
	   

	private Long resourceOwnerId;

	private String circuitCode;

	private Integer vlanId;

	private String clientToken;

	private String description;

	private String peerGatewayIp;

	private String peeringSubnetMask;

	private String localGatewayIp;

	private String userCidr;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String physicalConnectionId;

	private String name;

	private Long vbrOwnerId;
	public CreateVirtualBorderRouterRequest() {
		super("Ecs", "2014-05-26", "CreateVirtualBorderRouter", "ecs");
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

	public String getCircuitCode() {
		return this.circuitCode;
	}

	public void setCircuitCode(String circuitCode) {
		this.circuitCode = circuitCode;
		if(circuitCode != null){
			putQueryParameter("CircuitCode", circuitCode);
		}
	}

	public Integer getVlanId() {
		return this.vlanId;
	}

	public void setVlanId(Integer vlanId) {
		this.vlanId = vlanId;
		if(vlanId != null){
			putQueryParameter("VlanId", vlanId.toString());
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getPeerGatewayIp() {
		return this.peerGatewayIp;
	}

	public void setPeerGatewayIp(String peerGatewayIp) {
		this.peerGatewayIp = peerGatewayIp;
		if(peerGatewayIp != null){
			putQueryParameter("PeerGatewayIp", peerGatewayIp);
		}
	}

	public String getPeeringSubnetMask() {
		return this.peeringSubnetMask;
	}

	public void setPeeringSubnetMask(String peeringSubnetMask) {
		this.peeringSubnetMask = peeringSubnetMask;
		if(peeringSubnetMask != null){
			putQueryParameter("PeeringSubnetMask", peeringSubnetMask);
		}
	}

	public String getLocalGatewayIp() {
		return this.localGatewayIp;
	}

	public void setLocalGatewayIp(String localGatewayIp) {
		this.localGatewayIp = localGatewayIp;
		if(localGatewayIp != null){
			putQueryParameter("LocalGatewayIp", localGatewayIp);
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

	public String getPhysicalConnectionId() {
		return this.physicalConnectionId;
	}

	public void setPhysicalConnectionId(String physicalConnectionId) {
		this.physicalConnectionId = physicalConnectionId;
		if(physicalConnectionId != null){
			putQueryParameter("PhysicalConnectionId", physicalConnectionId);
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

	public Long getVbrOwnerId() {
		return this.vbrOwnerId;
	}

	public void setVbrOwnerId(Long vbrOwnerId) {
		this.vbrOwnerId = vbrOwnerId;
		if(vbrOwnerId != null){
			putQueryParameter("VbrOwnerId", vbrOwnerId.toString());
		}
	}

	@Override
	public Class<CreateVirtualBorderRouterResponse> getResponseClass() {
		return CreateVirtualBorderRouterResponse.class;
	}

}
