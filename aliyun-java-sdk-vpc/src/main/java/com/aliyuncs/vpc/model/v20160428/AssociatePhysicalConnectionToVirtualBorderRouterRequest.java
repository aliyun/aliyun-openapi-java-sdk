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

/**
 * @author auto create
 * @version 
 */
public class AssociatePhysicalConnectionToVirtualBorderRouterRequest extends RpcAcsRequest<AssociatePhysicalConnectionToVirtualBorderRouterResponse> {
	
	public AssociatePhysicalConnectionToVirtualBorderRouterRequest() {
		super("Vpc", "2016-04-28", "AssociatePhysicalConnectionToVirtualBorderRouter", "vpc");
	}

	private Long resourceOwnerId;

	private String circuitCode;

	private String vlanId;

	private String resourceOwnerAccount;

	private String clientToken;

	private String ownerAccount;

	private String vbrId;

	private Long ownerId;

	private String peerGatewayIp;

	private String peeringSubnetMask;

	private String physicalConnectionId;

	private String localGatewayIp;

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

	public String getVlanId() {
		return this.vlanId;
	}

	public void setVlanId(String vlanId) {
		this.vlanId = vlanId;
		if(vlanId != null){
			putQueryParameter("VlanId", vlanId);
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

	public String getPhysicalConnectionId() {
		return this.physicalConnectionId;
	}

	public void setPhysicalConnectionId(String physicalConnectionId) {
		this.physicalConnectionId = physicalConnectionId;
		if(physicalConnectionId != null){
			putQueryParameter("PhysicalConnectionId", physicalConnectionId);
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

	@Override
	public Class<AssociatePhysicalConnectionToVirtualBorderRouterResponse> getResponseClass() {
		return AssociatePhysicalConnectionToVirtualBorderRouterResponse.class;
	}

}
