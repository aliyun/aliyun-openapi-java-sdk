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

package com.aliyuncs.cams.model.v20200606;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cams.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddChatappPhoneNumberRequest extends RpcAcsRequest<AddChatappPhoneNumberResponse> {
	   

	private Long resourceOwnerId;

	private String preValidateId;

	private String verifiedName;

	private String phoneNumber;

	private String cc;

	private String resourceOwnerAccount;

	private Long ownerId;

	private String custSpaceId;
	public AddChatappPhoneNumberRequest() {
		super("cams", "2020-06-06", "AddChatappPhoneNumber", "cams");
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

	public String getPreValidateId() {
		return this.preValidateId;
	}

	public void setPreValidateId(String preValidateId) {
		this.preValidateId = preValidateId;
		if(preValidateId != null){
			putQueryParameter("PreValidateId", preValidateId);
		}
	}

	public String getVerifiedName() {
		return this.verifiedName;
	}

	public void setVerifiedName(String verifiedName) {
		this.verifiedName = verifiedName;
		if(verifiedName != null){
			putQueryParameter("VerifiedName", verifiedName);
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

	public String getCc() {
		return this.cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
		if(cc != null){
			putQueryParameter("Cc", cc);
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

	public String getCustSpaceId() {
		return this.custSpaceId;
	}

	public void setCustSpaceId(String custSpaceId) {
		this.custSpaceId = custSpaceId;
		if(custSpaceId != null){
			putQueryParameter("CustSpaceId", custSpaceId);
		}
	}

	@Override
	public Class<AddChatappPhoneNumberResponse> getResponseClass() {
		return AddChatappPhoneNumberResponse.class;
	}

}
