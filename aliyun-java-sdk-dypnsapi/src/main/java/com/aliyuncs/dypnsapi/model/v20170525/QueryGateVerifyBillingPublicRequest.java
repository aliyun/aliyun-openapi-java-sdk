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

package com.aliyuncs.dypnsapi.model.v20170525;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dypnsapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryGateVerifyBillingPublicRequest extends RpcAcsRequest<QueryGateVerifyBillingPublicResponse> {
	   

	private Integer authenticationType;

	private String resourceOwnerAccount;

	private Long ownerId;

	private String month;
	public QueryGateVerifyBillingPublicRequest() {
		super("Dypnsapi", "2017-05-25", "QueryGateVerifyBillingPublic");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getAuthenticationType() {
		return this.authenticationType;
	}

	public void setAuthenticationType(Integer authenticationType) {
		this.authenticationType = authenticationType;
		if(authenticationType != null){
			putQueryParameter("AuthenticationType", authenticationType.toString());
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

	public String getMonth() {
		return this.month;
	}

	public void setMonth(String month) {
		this.month = month;
		if(month != null){
			putQueryParameter("Month", month);
		}
	}

	@Override
	public Class<QueryGateVerifyBillingPublicResponse> getResponseClass() {
		return QueryGateVerifyBillingPublicResponse.class;
	}

}
