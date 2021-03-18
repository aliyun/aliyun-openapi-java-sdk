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
public class UpdateDhcpOptionsSetAttributeRequest extends RpcAcsRequest<UpdateDhcpOptionsSetAttributeResponse> {
	   

	private String bootFileName;

	private Long resourceOwnerId;

	private String clientToken;

	private String tFTPServerName;

	private String domainNameServers;

	private String dhcpOptionsSetDescription;

	private Boolean dryRun;

	private String dhcpOptionsSetId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String domainName;

	private Long ownerId;

	private String dhcpOptionsSetName;
	public UpdateDhcpOptionsSetAttributeRequest() {
		super("Vpc", "2016-04-28", "UpdateDhcpOptionsSetAttribute", "vpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBootFileName() {
		return this.bootFileName;
	}

	public void setBootFileName(String bootFileName) {
		this.bootFileName = bootFileName;
		if(bootFileName != null){
			putQueryParameter("BootFileName", bootFileName);
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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getTFTPServerName() {
		return this.tFTPServerName;
	}

	public void setTFTPServerName(String tFTPServerName) {
		this.tFTPServerName = tFTPServerName;
		if(tFTPServerName != null){
			putQueryParameter("TFTPServerName", tFTPServerName);
		}
	}

	public String getDomainNameServers() {
		return this.domainNameServers;
	}

	public void setDomainNameServers(String domainNameServers) {
		this.domainNameServers = domainNameServers;
		if(domainNameServers != null){
			putQueryParameter("DomainNameServers", domainNameServers);
		}
	}

	public String getDhcpOptionsSetDescription() {
		return this.dhcpOptionsSetDescription;
	}

	public void setDhcpOptionsSetDescription(String dhcpOptionsSetDescription) {
		this.dhcpOptionsSetDescription = dhcpOptionsSetDescription;
		if(dhcpOptionsSetDescription != null){
			putQueryParameter("DhcpOptionsSetDescription", dhcpOptionsSetDescription);
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

	public String getDhcpOptionsSetId() {
		return this.dhcpOptionsSetId;
	}

	public void setDhcpOptionsSetId(String dhcpOptionsSetId) {
		this.dhcpOptionsSetId = dhcpOptionsSetId;
		if(dhcpOptionsSetId != null){
			putQueryParameter("DhcpOptionsSetId", dhcpOptionsSetId);
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

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
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

	public String getDhcpOptionsSetName() {
		return this.dhcpOptionsSetName;
	}

	public void setDhcpOptionsSetName(String dhcpOptionsSetName) {
		this.dhcpOptionsSetName = dhcpOptionsSetName;
		if(dhcpOptionsSetName != null){
			putQueryParameter("DhcpOptionsSetName", dhcpOptionsSetName);
		}
	}

	@Override
	public Class<UpdateDhcpOptionsSetAttributeResponse> getResponseClass() {
		return UpdateDhcpOptionsSetAttributeResponse.class;
	}

}
