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
public class ModifyFullNatEntryAttributeRequest extends RpcAcsRequest<ModifyFullNatEntryAttributeResponse> {
	   

	private String fullNatEntryDescription;

	private Long resourceOwnerId;

	private String accessIp;

	private String clientToken;

	private String accessDomain;

	private String fullNatEntryId;

	private String natIpPort;

	private String fullNatTableId;

	private String accessPort;

	private Boolean dryRun;

	private String resourceOwnerAccount;

	private String ipProtocol;

	private String ownerAccount;

	private Long ownerId;

	private String fullNatEntryName;

	private String natIp;

	private String networkInterfaceId;
	public ModifyFullNatEntryAttributeRequest() {
		super("Vpc", "2016-04-28", "ModifyFullNatEntryAttribute", "vpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFullNatEntryDescription() {
		return this.fullNatEntryDescription;
	}

	public void setFullNatEntryDescription(String fullNatEntryDescription) {
		this.fullNatEntryDescription = fullNatEntryDescription;
		if(fullNatEntryDescription != null){
			putQueryParameter("FullNatEntryDescription", fullNatEntryDescription);
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

	public String getAccessIp() {
		return this.accessIp;
	}

	public void setAccessIp(String accessIp) {
		this.accessIp = accessIp;
		if(accessIp != null){
			putQueryParameter("AccessIp", accessIp);
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

	public String getAccessDomain() {
		return this.accessDomain;
	}

	public void setAccessDomain(String accessDomain) {
		this.accessDomain = accessDomain;
		if(accessDomain != null){
			putQueryParameter("AccessDomain", accessDomain);
		}
	}

	public String getFullNatEntryId() {
		return this.fullNatEntryId;
	}

	public void setFullNatEntryId(String fullNatEntryId) {
		this.fullNatEntryId = fullNatEntryId;
		if(fullNatEntryId != null){
			putQueryParameter("FullNatEntryId", fullNatEntryId);
		}
	}

	public String getNatIpPort() {
		return this.natIpPort;
	}

	public void setNatIpPort(String natIpPort) {
		this.natIpPort = natIpPort;
		if(natIpPort != null){
			putQueryParameter("NatIpPort", natIpPort);
		}
	}

	public String getFullNatTableId() {
		return this.fullNatTableId;
	}

	public void setFullNatTableId(String fullNatTableId) {
		this.fullNatTableId = fullNatTableId;
		if(fullNatTableId != null){
			putQueryParameter("FullNatTableId", fullNatTableId);
		}
	}

	public String getAccessPort() {
		return this.accessPort;
	}

	public void setAccessPort(String accessPort) {
		this.accessPort = accessPort;
		if(accessPort != null){
			putQueryParameter("AccessPort", accessPort);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
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

	public String getIpProtocol() {
		return this.ipProtocol;
	}

	public void setIpProtocol(String ipProtocol) {
		this.ipProtocol = ipProtocol;
		if(ipProtocol != null){
			putQueryParameter("IpProtocol", ipProtocol);
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

	public String getFullNatEntryName() {
		return this.fullNatEntryName;
	}

	public void setFullNatEntryName(String fullNatEntryName) {
		this.fullNatEntryName = fullNatEntryName;
		if(fullNatEntryName != null){
			putQueryParameter("FullNatEntryName", fullNatEntryName);
		}
	}

	public String getNatIp() {
		return this.natIp;
	}

	public void setNatIp(String natIp) {
		this.natIp = natIp;
		if(natIp != null){
			putQueryParameter("NatIp", natIp);
		}
	}

	public String getNetworkInterfaceId() {
		return this.networkInterfaceId;
	}

	public void setNetworkInterfaceId(String networkInterfaceId) {
		this.networkInterfaceId = networkInterfaceId;
		if(networkInterfaceId != null){
			putQueryParameter("NetworkInterfaceId", networkInterfaceId);
		}
	}

	@Override
	public Class<ModifyFullNatEntryAttributeResponse> getResponseClass() {
		return ModifyFullNatEntryAttributeResponse.class;
	}

}
