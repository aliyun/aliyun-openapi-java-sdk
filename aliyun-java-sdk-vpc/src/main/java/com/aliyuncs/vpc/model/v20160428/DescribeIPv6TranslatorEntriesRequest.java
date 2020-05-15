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
public class DescribeIPv6TranslatorEntriesRequest extends RpcAcsRequest<DescribeIPv6TranslatorEntriesResponse> {
	   

	private Integer backendIpv4Port;

	private Long resourceOwnerId;

	private String entryName;

	private String clientToken;

	private String aclStatus;

	private Integer pageNumber;

	private String aclType;

	private Integer allocateIpv6Port;

	private Integer pageSize;

	private String backendIpv4Addr;

	private String aclId;

	private String ipv6TranslatorEntryId;

	private String resourceOwnerAccount;

	private String allocateIpv6Addr;

	private String ownerAccount;

	private Long ownerId;

	private String transProtocol;

	private String ipv6TranslatorId;
	public DescribeIPv6TranslatorEntriesRequest() {
		super("Vpc", "2016-04-28", "DescribeIPv6TranslatorEntries", "vpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
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

	public String getAllocateIpv6Addr() {
		return this.allocateIpv6Addr;
	}

	public void setAllocateIpv6Addr(String allocateIpv6Addr) {
		this.allocateIpv6Addr = allocateIpv6Addr;
		if(allocateIpv6Addr != null){
			putQueryParameter("AllocateIpv6Addr", allocateIpv6Addr);
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

	public String getIpv6TranslatorId() {
		return this.ipv6TranslatorId;
	}

	public void setIpv6TranslatorId(String ipv6TranslatorId) {
		this.ipv6TranslatorId = ipv6TranslatorId;
		if(ipv6TranslatorId != null){
			putQueryParameter("Ipv6TranslatorId", ipv6TranslatorId);
		}
	}

	@Override
	public Class<DescribeIPv6TranslatorEntriesResponse> getResponseClass() {
		return DescribeIPv6TranslatorEntriesResponse.class;
	}

}
