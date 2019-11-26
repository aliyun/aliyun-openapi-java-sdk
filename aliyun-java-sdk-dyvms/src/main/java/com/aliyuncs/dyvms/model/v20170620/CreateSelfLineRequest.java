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

package com.aliyuncs.dyvms.model.v20170620;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dyvms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateSelfLineRequest extends RpcAcsRequest<CreateSelfLineResponse> {
	   

	private Long resourceOwnerId;

	private String dtmf;

	private String phoneNumber;

	private String sipMediaAddress;

	private String dingding;

	private String scene;

	private String sipLocation;

	private String company;

	private Long id;

	private String resourceOwnerAccount;

	private String prodCode;

	private Long ownerId;

	private String sipAddress;

	private Integer concurrencyCount;

	private String userName;
	public CreateSelfLineRequest() {
		super("Dyvms", "2017-06-20", "CreateSelfLine", "dyvms");
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

	public String getDtmf() {
		return this.dtmf;
	}

	public void setDtmf(String dtmf) {
		this.dtmf = dtmf;
		if(dtmf != null){
			putQueryParameter("Dtmf", dtmf);
		}
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		if(phoneNumber != null){
			putQueryParameter("PhoneNumber", phoneNumber);
		}
	}

	public String getSipMediaAddress() {
		return this.sipMediaAddress;
	}

	public void setSipMediaAddress(String sipMediaAddress) {
		this.sipMediaAddress = sipMediaAddress;
		if(sipMediaAddress != null){
			putQueryParameter("SipMediaAddress", sipMediaAddress);
		}
	}

	public String getDingding() {
		return this.dingding;
	}

	public void setDingding(String dingding) {
		this.dingding = dingding;
		if(dingding != null){
			putQueryParameter("Dingding", dingding);
		}
	}

	public String getScene() {
		return this.scene;
	}

	public void setScene(String scene) {
		this.scene = scene;
		if(scene != null){
			putQueryParameter("Scene", scene);
		}
	}

	public String getSipLocation() {
		return this.sipLocation;
	}

	public void setSipLocation(String sipLocation) {
		this.sipLocation = sipLocation;
		if(sipLocation != null){
			putQueryParameter("SipLocation", sipLocation);
		}
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
		if(company != null){
			putQueryParameter("Company", company);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
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

	public String getProdCode() {
		return this.prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
		if(prodCode != null){
			putQueryParameter("ProdCode", prodCode);
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

	public String getSipAddress() {
		return this.sipAddress;
	}

	public void setSipAddress(String sipAddress) {
		this.sipAddress = sipAddress;
		if(sipAddress != null){
			putQueryParameter("SipAddress", sipAddress);
		}
	}

	public Integer getConcurrencyCount() {
		return this.concurrencyCount;
	}

	public void setConcurrencyCount(Integer concurrencyCount) {
		this.concurrencyCount = concurrencyCount;
		if(concurrencyCount != null){
			putQueryParameter("ConcurrencyCount", concurrencyCount.toString());
		}
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putQueryParameter("UserName", userName);
		}
	}

	@Override
	public Class<CreateSelfLineResponse> getResponseClass() {
		return CreateSelfLineResponse.class;
	}

}
