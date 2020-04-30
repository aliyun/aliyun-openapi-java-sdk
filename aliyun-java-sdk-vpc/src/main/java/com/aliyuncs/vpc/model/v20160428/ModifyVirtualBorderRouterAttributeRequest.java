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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyVirtualBorderRouterAttributeRequest extends RpcAcsRequest<ModifyVirtualBorderRouterAttributeResponse> {
	   

	private Long resourceOwnerId;

	private String circuitCode;

	private String associatedPhysicalConnections;

	private Integer vlanId;

	private String clientToken;

	private Boolean enableIpv6;

	private String description;

	private String vbrId;

	private String peerGatewayIp;

	private String peerIpv6GatewayIp;

	private Long detectMultiplier;

	private String peeringSubnetMask;

	private String localGatewayIp;

	private Long minTxInterval;

	private String peeringIpv6SubnetMask;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private Long minRxInterval;

	private String localIpv6GatewayIp;

	private String name;
	public ModifyVirtualBorderRouterAttributeRequest() {
		super("Vpc", "2016-04-28", "ModifyVirtualBorderRouterAttribute", "vpc");
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

	public String getAssociatedPhysicalConnections() {
		return this.associatedPhysicalConnections;
	}

	public void setAssociatedPhysicalConnections(String associatedPhysicalConnections) {
		this.associatedPhysicalConnections = associatedPhysicalConnections;
		if(associatedPhysicalConnections != null){
			putQueryParameter("AssociatedPhysicalConnections", associatedPhysicalConnections);
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

	public Boolean getEnableIpv6() {
		return this.enableIpv6;
	}

	public void setEnableIpv6(Boolean enableIpv6) {
		this.enableIpv6 = enableIpv6;
		if(enableIpv6 != null){
			putQueryParameter("EnableIpv6", enableIpv6.toString());
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

	public String getPeerGatewayIp() {
		return this.peerGatewayIp;
	}

	public void setPeerGatewayIp(String peerGatewayIp) {
		this.peerGatewayIp = peerGatewayIp;
		if(peerGatewayIp != null){
			putQueryParameter("PeerGatewayIp", peerGatewayIp);
		}
	}

	public String getPeerIpv6GatewayIp() {
		return this.peerIpv6GatewayIp;
	}

	public void setPeerIpv6GatewayIp(String peerIpv6GatewayIp) {
		this.peerIpv6GatewayIp = peerIpv6GatewayIp;
		if(peerIpv6GatewayIp != null){
			putQueryParameter("PeerIpv6GatewayIp", peerIpv6GatewayIp);
		}
	}

	public Long getDetectMultiplier() {
		return this.detectMultiplier;
	}

	public void setDetectMultiplier(Long detectMultiplier) {
		this.detectMultiplier = detectMultiplier;
		if(detectMultiplier != null){
			putQueryParameter("DetectMultiplier", detectMultiplier.toString());
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

	public Long getMinTxInterval() {
		return this.minTxInterval;
	}

	public void setMinTxInterval(Long minTxInterval) {
		this.minTxInterval = minTxInterval;
		if(minTxInterval != null){
			putQueryParameter("MinTxInterval", minTxInterval.toString());
		}
	}

	public String getPeeringIpv6SubnetMask() {
		return this.peeringIpv6SubnetMask;
	}

	public void setPeeringIpv6SubnetMask(String peeringIpv6SubnetMask) {
		this.peeringIpv6SubnetMask = peeringIpv6SubnetMask;
		if(peeringIpv6SubnetMask != null){
			putQueryParameter("PeeringIpv6SubnetMask", peeringIpv6SubnetMask);
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

	public Long getMinRxInterval() {
		return this.minRxInterval;
	}

	public void setMinRxInterval(Long minRxInterval) {
		this.minRxInterval = minRxInterval;
		if(minRxInterval != null){
			putQueryParameter("MinRxInterval", minRxInterval.toString());
		}
	}

	public String getLocalIpv6GatewayIp() {
		return this.localIpv6GatewayIp;
	}

	public void setLocalIpv6GatewayIp(String localIpv6GatewayIp) {
		this.localIpv6GatewayIp = localIpv6GatewayIp;
		if(localIpv6GatewayIp != null){
			putQueryParameter("LocalIpv6GatewayIp", localIpv6GatewayIp);
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

	@Override
	public Class<ModifyVirtualBorderRouterAttributeResponse> getResponseClass() {
		return ModifyVirtualBorderRouterAttributeResponse.class;
	}

}
