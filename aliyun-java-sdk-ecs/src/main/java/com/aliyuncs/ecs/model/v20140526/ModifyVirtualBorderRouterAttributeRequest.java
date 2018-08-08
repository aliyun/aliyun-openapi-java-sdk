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

/**
 * @author auto create
 * @version 
 */
public class ModifyVirtualBorderRouterAttributeRequest extends RpcAcsRequest<ModifyVirtualBorderRouterAttributeResponse> {
	
	public ModifyVirtualBorderRouterAttributeRequest() {
		super("Ecs", "2014-05-26", "ModifyVirtualBorderRouterAttribute");
	}

	private Long resourceOwnerId;

	private String circuitCode;

	private Integer vlanId;

	private String resourceOwnerAccount;

	private String clientToken;

	private String ownerAccount;

	private String description;

	private String vbrId;

	private Long ownerId;

	private String peerGatewayIp;

	private String peeringSubnetMask;

	private String name;

	private String localGatewayIp;

	private String userCidr;

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

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
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

	public String getVbrId() {
		return this.vbrId;
	}

	public void setVbrId(String vbrId) {
		this.vbrId = vbrId;
		if(vbrId != null){
			putQueryParameter("VbrId", vbrId);
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
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

	@Override
	public Class<ModifyVirtualBorderRouterAttributeResponse> getResponseClass() {
		return ModifyVirtualBorderRouterAttributeResponse.class;
	}

}
