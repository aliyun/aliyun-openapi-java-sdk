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

package com.aliyuncs.dts.model.v20200101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifySubscriptionObjectRequest extends RpcAcsRequest<ModifySubscriptionObjectResponse> {
	   

	private String subscriptionInstanceId;

	private String ownerId;

	private String accountId;

	private String subscriptionObject;
	public ModifySubscriptionObjectRequest() {
		super("Dts", "2020-01-01", "ModifySubscriptionObject", "dts");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSubscriptionInstanceId() {
		return this.subscriptionInstanceId;
	}

	public void setSubscriptionInstanceId(String subscriptionInstanceId) {
		this.subscriptionInstanceId = subscriptionInstanceId;
		if(subscriptionInstanceId != null){
			putQueryParameter("SubscriptionInstanceId", subscriptionInstanceId);
		}
	}

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId);
		}
	}

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
		if(accountId != null){
			putQueryParameter("AccountId", accountId);
		}
	}

	public String getSubscriptionObject() {
		return this.subscriptionObject;
	}

	public void setSubscriptionObject(String subscriptionObject) {
		this.subscriptionObject = subscriptionObject;
		if(subscriptionObject != null){
			putQueryParameter("SubscriptionObject", subscriptionObject);
		}
	}

	@Override
	public Class<ModifySubscriptionObjectResponse> getResponseClass() {
		return ModifySubscriptionObjectResponse.class;
	}

}
