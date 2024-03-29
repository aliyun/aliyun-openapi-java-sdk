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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateVirtualBorderRouterRequest extends RpcAcsRequest<CreateVirtualBorderRouterResponse> {
	   

	private Long resourceOwnerId;

	private String circuitCode;

	private Integer vlanId;

	private String clientToken;

	private Boolean enableIpv6;

	private String description;

	private String peerGatewayIp;

	private String peerIpv6GatewayIp;

	private String resourceGroupId;

	private String peeringSubnetMask;

	private String localGatewayIp;

	private String peeringIpv6SubnetMask;

	private String resourceOwnerAccount;

	private Long bandwidth;

	private String ownerAccount;

	private Long ownerId;

	private List<Tags> tagss;

	private String physicalConnectionId;

	private String localIpv6GatewayIp;

	private String name;

	private Long vbrOwnerId;
	public CreateVirtualBorderRouterRequest() {
		super("Vpc", "2016-04-28", "CreateVirtualBorderRouter", "vpc");
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

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
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

	public Long getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Long bandwidth) {
		this.bandwidth = bandwidth;
		if(bandwidth != null){
			putQueryParameter("Bandwidth", bandwidth.toString());
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

	public List<Tags> getTagss() {
		return this.tagss;
	}

	public void setTagss(List<Tags> tagss) {
		this.tagss = tagss;	
		if (tagss != null) {
			for (int depth1 = 0; depth1 < tagss.size(); depth1++) {
				putQueryParameter("Tags." + (depth1 + 1) + ".Value" , tagss.get(depth1).getValue());
				putQueryParameter("Tags." + (depth1 + 1) + ".Key" , tagss.get(depth1).getKey());
			}
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

	public Long getVbrOwnerId() {
		return this.vbrOwnerId;
	}

	public void setVbrOwnerId(Long vbrOwnerId) {
		this.vbrOwnerId = vbrOwnerId;
		if(vbrOwnerId != null){
			putQueryParameter("VbrOwnerId", vbrOwnerId.toString());
		}
	}

	public static class Tags {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<CreateVirtualBorderRouterResponse> getResponseClass() {
		return CreateVirtualBorderRouterResponse.class;
	}

}
