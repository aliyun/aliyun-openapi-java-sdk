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
public class CreateSnatEntryRequest extends RpcAcsRequest<CreateSnatEntryResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String sourceCIDR;

	private String snatIp;

	private String sourceVSwitchId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String snatTableId;

	private Long ownerId;

	private String snatEntryName;
	public CreateSnatEntryRequest() {
		super("Vpc", "2016-04-28", "CreateSnatEntry", "vpc");
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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getSourceCIDR() {
		return this.sourceCIDR;
	}

	public void setSourceCIDR(String sourceCIDR) {
		this.sourceCIDR = sourceCIDR;
		if(sourceCIDR != null){
			putQueryParameter("SourceCIDR", sourceCIDR);
		}
	}

	public String getSnatIp() {
		return this.snatIp;
	}

	public void setSnatIp(String snatIp) {
		this.snatIp = snatIp;
		if(snatIp != null){
			putQueryParameter("SnatIp", snatIp);
		}
	}

	public String getSourceVSwitchId() {
		return this.sourceVSwitchId;
	}

	public void setSourceVSwitchId(String sourceVSwitchId) {
		this.sourceVSwitchId = sourceVSwitchId;
		if(sourceVSwitchId != null){
			putQueryParameter("SourceVSwitchId", sourceVSwitchId);
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

	public String getSnatTableId() {
		return this.snatTableId;
	}

	public void setSnatTableId(String snatTableId) {
		this.snatTableId = snatTableId;
		if(snatTableId != null){
			putQueryParameter("SnatTableId", snatTableId);
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

	public String getSnatEntryName() {
		return this.snatEntryName;
	}

	public void setSnatEntryName(String snatEntryName) {
		this.snatEntryName = snatEntryName;
		if(snatEntryName != null){
			putQueryParameter("SnatEntryName", snatEntryName);
		}
	}

	@Override
	public Class<CreateSnatEntryResponse> getResponseClass() {
		return CreateSnatEntryResponse.class;
	}

}
