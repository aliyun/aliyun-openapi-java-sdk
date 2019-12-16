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
public class ModifyExpressCloudConnectionAttributeRequest extends RpcAcsRequest<ModifyExpressCloudConnectionAttributeResponse> {
	   

	private Long resourceOwnerId;

	private String description;

	private String eccId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String ceIp;

	private String bgpAs;

	private String peIp;

	private Long ownerId;

	private String name;
	public ModifyExpressCloudConnectionAttributeRequest() {
		super("Vpc", "2016-04-28", "ModifyExpressCloudConnectionAttribute", "Vpc");
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getEccId() {
		return this.eccId;
	}

	public void setEccId(String eccId) {
		this.eccId = eccId;
		if(eccId != null){
			putQueryParameter("EccId", eccId);
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

	public String getCeIp() {
		return this.ceIp;
	}

	public void setCeIp(String ceIp) {
		this.ceIp = ceIp;
		if(ceIp != null){
			putQueryParameter("CeIp", ceIp);
		}
	}

	public String getBgpAs() {
		return this.bgpAs;
	}

	public void setBgpAs(String bgpAs) {
		this.bgpAs = bgpAs;
		if(bgpAs != null){
			putQueryParameter("BgpAs", bgpAs);
		}
	}

	public String getPeIp() {
		return this.peIp;
	}

	public void setPeIp(String peIp) {
		this.peIp = peIp;
		if(peIp != null){
			putQueryParameter("PeIp", peIp);
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
	public Class<ModifyExpressCloudConnectionAttributeResponse> getResponseClass() {
		return ModifyExpressCloudConnectionAttributeResponse.class;
	}

}
