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

package com.aliyuncs.dyvmsapi.model.v20170525;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dyvmsapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CloseSipAccountRequest extends RpcAcsRequest<CloseSipAccountResponse> {
	   

	private Long resourceOwnerId;

	private Long partnerId;

	private String resourceOwnerAccount;

	private Long ownerId;

	private String sipAccountID;
	public CloseSipAccountRequest() {
		super("Dyvmsapi", "2017-05-25", "CloseSipAccount", "dyvms");
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

	public Long getPartnerId() {
		return this.partnerId;
	}

	public void setPartnerId(Long partnerId) {
		this.partnerId = partnerId;
		if(partnerId != null){
			putQueryParameter("PartnerId", partnerId.toString());
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getSipAccountID() {
		return this.sipAccountID;
	}

	public void setSipAccountID(String sipAccountID) {
		this.sipAccountID = sipAccountID;
		if(sipAccountID != null){
			putQueryParameter("SipAccountID", sipAccountID);
		}
	}

	@Override
	public Class<CloseSipAccountResponse> getResponseClass() {
		return CloseSipAccountResponse.class;
	}

}
