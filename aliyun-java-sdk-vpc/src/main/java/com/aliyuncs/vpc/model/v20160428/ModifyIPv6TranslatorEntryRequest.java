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
public class ModifyIPv6TranslatorEntryRequest extends RpcAcsRequest<ModifyIPv6TranslatorEntryResponse> {
	
	public ModifyIPv6TranslatorEntryRequest() {
		super("Vpc", "2016-04-28", "ModifyIPv6TranslatorEntry", "vpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Integer backendIpv4Port;

	private Long resourceOwnerId;

	private String entryName;

	private String aclStatus;

	private Integer entryBandwidth;

	private String aclType;

	private Integer allocateIpv6Port;

	private String entryDescription;

	private String backendIpv4Addr;

	private String aclId;

	private String ipv6TranslatorEntryId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String transProtocol;

	public Integer getBackendIpv4Port() {
		return this.backendIpv4Port;
	}

	public void setBackendIpv4Port(Integer backendIpv4Port) {
		this.backendIpv4Port = backendIpv4Port;
		if(backendIpv4Port != null){
			putQueryParameter("BackendIpv4Port", backendIpv4Port.toString());
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

	public String getEntryName() {
		return this.entryName;
	}

	public void setEntryName(String entryName) {
		this.entryName = entryName;
		if(entryName != null){
			putQueryParameter("EntryName", entryName);
		}
	}

	public String getAclStatus() {
		return this.aclStatus;
	}

	public void setAclStatus(String aclStatus) {
		this.aclStatus = aclStatus;
		if(aclStatus != null){
			putQueryParameter("AclStatus", aclStatus);
		}
	}

	public Integer getEntryBandwidth() {
		return this.entryBandwidth;
	}

	public void setEntryBandwidth(Integer entryBandwidth) {
		this.entryBandwidth = entryBandwidth;
		if(entryBandwidth != null){
			putQueryParameter("EntryBandwidth", entryBandwidth.toString());
		}
	}

	public String getAclType() {
		return this.aclType;
	}

	public void setAclType(String aclType) {
		this.aclType = aclType;
		if(aclType != null){
			putQueryParameter("AclType", aclType);
		}
	}

	public Integer getAllocateIpv6Port() {
		return this.allocateIpv6Port;
	}

	public void setAllocateIpv6Port(Integer allocateIpv6Port) {
		this.allocateIpv6Port = allocateIpv6Port;
		if(allocateIpv6Port != null){
			putQueryParameter("AllocateIpv6Port", allocateIpv6Port.toString());
		}
	}

	public String getEntryDescription() {
		return this.entryDescription;
	}

	public void setEntryDescription(String entryDescription) {
		this.entryDescription = entryDescription;
		if(entryDescription != null){
			putQueryParameter("EntryDescription", entryDescription);
		}
	}

	public String getBackendIpv4Addr() {
		return this.backendIpv4Addr;
	}

	public void setBackendIpv4Addr(String backendIpv4Addr) {
		this.backendIpv4Addr = backendIpv4Addr;
		if(backendIpv4Addr != null){
			putQueryParameter("BackendIpv4Addr", backendIpv4Addr);
		}
	}

	public String getAclId() {
		return this.aclId;
	}

	public void setAclId(String aclId) {
		this.aclId = aclId;
		if(aclId != null){
			putQueryParameter("AclId", aclId);
		}
	}

	public String getIpv6TranslatorEntryId() {
		return this.ipv6TranslatorEntryId;
	}

	public void setIpv6TranslatorEntryId(String ipv6TranslatorEntryId) {
		this.ipv6TranslatorEntryId = ipv6TranslatorEntryId;
		if(ipv6TranslatorEntryId != null){
			putQueryParameter("Ipv6TranslatorEntryId", ipv6TranslatorEntryId);
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

	public String getTransProtocol() {
		return this.transProtocol;
	}

	public void setTransProtocol(String transProtocol) {
		this.transProtocol = transProtocol;
		if(transProtocol != null){
			putQueryParameter("TransProtocol", transProtocol);
		}
	}

	@Override
	public Class<ModifyIPv6TranslatorEntryResponse> getResponseClass() {
		return ModifyIPv6TranslatorEntryResponse.class;
	}

}
