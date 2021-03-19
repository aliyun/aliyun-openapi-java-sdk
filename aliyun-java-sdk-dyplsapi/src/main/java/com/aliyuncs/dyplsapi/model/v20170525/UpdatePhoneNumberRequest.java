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

package com.aliyuncs.dyplsapi.model.v20170525;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dyplsapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdatePhoneNumberRequest extends RpcAcsRequest<UpdatePhoneNumberResponse> {
	   

	private Long resourceOwnerId;

	private Long subsId;

	private String secretNo;

	private String resourceOwnerAccount;

	private String bindToken;

	private Long ownerId;

	private String poolKey;

	private String newPhoneNo;
	public UpdatePhoneNumberRequest() {
		super("Dyplsapi", "2017-05-25", "UpdatePhoneNumber", "dyplsapi");
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

	public Long getSubsId() {
		return this.subsId;
	}

	public void setSubsId(Long subsId) {
		this.subsId = subsId;
		if(subsId != null){
			putQueryParameter("SubsId", subsId.toString());
		}
	}

	public String getSecretNo() {
		return this.secretNo;
	}

	public void setSecretNo(String secretNo) {
		this.secretNo = secretNo;
		if(secretNo != null){
			putQueryParameter("SecretNo", secretNo);
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

	public String getBindToken() {
		return this.bindToken;
	}

	public void setBindToken(String bindToken) {
		this.bindToken = bindToken;
		if(bindToken != null){
			putQueryParameter("BindToken", bindToken);
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

	public String getPoolKey() {
		return this.poolKey;
	}

	public void setPoolKey(String poolKey) {
		this.poolKey = poolKey;
		if(poolKey != null){
			putQueryParameter("PoolKey", poolKey);
		}
	}

	public String getNewPhoneNo() {
		return this.newPhoneNo;
	}

	public void setNewPhoneNo(String newPhoneNo) {
		this.newPhoneNo = newPhoneNo;
		if(newPhoneNo != null){
			putQueryParameter("NewPhoneNo", newPhoneNo);
		}
	}

	@Override
	public Class<UpdatePhoneNumberResponse> getResponseClass() {
		return UpdatePhoneNumberResponse.class;
	}

}
