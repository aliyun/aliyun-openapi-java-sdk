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

package com.aliyuncs.dytnsapi.model.v20200217;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dytnsapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class InvalidPhoneNumberFilterRequest extends RpcAcsRequest<InvalidPhoneNumberFilterResponse> {
	   

	private Long resourceOwnerId;

	private String mask;

	private String resourceOwnerAccount;

	private Long ownerId;

	private String authCode;

	private String inputNumber;
	public InvalidPhoneNumberFilterRequest() {
		super("Dytnsapi", "2020-02-17", "InvalidPhoneNumberFilter");
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

	public String getMask() {
		return this.mask;
	}

	public void setMask(String mask) {
		this.mask = mask;
		if(mask != null){
			putQueryParameter("Mask", mask);
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

	public String getAuthCode() {
		return this.authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
		if(authCode != null){
			putQueryParameter("AuthCode", authCode);
		}
	}

	public String getInputNumber() {
		return this.inputNumber;
	}

	public void setInputNumber(String inputNumber) {
		this.inputNumber = inputNumber;
		if(inputNumber != null){
			putQueryParameter("InputNumber", inputNumber);
		}
	}

	@Override
	public Class<InvalidPhoneNumberFilterResponse> getResponseClass() {
		return InvalidPhoneNumberFilterResponse.class;
	}

}
