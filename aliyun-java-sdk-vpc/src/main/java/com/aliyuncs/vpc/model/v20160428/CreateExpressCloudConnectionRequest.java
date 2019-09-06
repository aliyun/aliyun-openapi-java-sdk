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
public class CreateExpressCloudConnectionRequest extends RpcAcsRequest<CreateExpressCloudConnectionResponse> {
	
	public CreateExpressCloudConnectionRequest() {
		super("Vpc", "2016-04-28", "CreateExpressCloudConnection", "vpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long resourceOwnerId;

	private String portType;

	private String description;

	private String redundantEccId;

	private String peerLocation;

	private String resourceOwnerAccount;

	private Integer bandwidth;

	private String ownerAccount;

	private String peerCity;

	private String iDCardNo;

	private Long ownerId;

	private String contactMail;

	private String contactTel;

	private String idcSP;

	private String name;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getPortType() {
		return this.portType;
	}

	public void setPortType(String portType) {
		this.portType = portType;
		if(portType != null){
			putQueryParameter("PortType", portType);
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

	public String getRedundantEccId() {
		return this.redundantEccId;
	}

	public void setRedundantEccId(String redundantEccId) {
		this.redundantEccId = redundantEccId;
		if(redundantEccId != null){
			putQueryParameter("RedundantEccId", redundantEccId);
		}
	}

	public String getPeerLocation() {
		return this.peerLocation;
	}

	public void setPeerLocation(String peerLocation) {
		this.peerLocation = peerLocation;
		if(peerLocation != null){
			putQueryParameter("PeerLocation", peerLocation);
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

	public Integer getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Integer bandwidth) {
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

	public String getPeerCity() {
		return this.peerCity;
	}

	public void setPeerCity(String peerCity) {
		this.peerCity = peerCity;
		if(peerCity != null){
			putQueryParameter("PeerCity", peerCity);
		}
	}

	public String getIDCardNo() {
		return this.iDCardNo;
	}

	public void setIDCardNo(String iDCardNo) {
		this.iDCardNo = iDCardNo;
		if(iDCardNo != null){
			putQueryParameter("IDCardNo", iDCardNo);
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

	public String getContactMail() {
		return this.contactMail;
	}

	public void setContactMail(String contactMail) {
		this.contactMail = contactMail;
		if(contactMail != null){
			putQueryParameter("ContactMail", contactMail);
		}
	}

	public String getContactTel() {
		return this.contactTel;
	}

	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
		if(contactTel != null){
			putQueryParameter("ContactTel", contactTel);
		}
	}

	public String getIdcSP() {
		return this.idcSP;
	}

	public void setIdcSP(String idcSP) {
		this.idcSP = idcSP;
		if(idcSP != null){
			putQueryParameter("IdcSP", idcSP);
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
	public Class<CreateExpressCloudConnectionResponse> getResponseClass() {
		return CreateExpressCloudConnectionResponse.class;
	}

}
