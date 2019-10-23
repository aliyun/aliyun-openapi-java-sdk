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

package com.aliyuncs.vod.model.v20170321;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vod.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DetachAppPolicyFromIdentityRequest extends RpcAcsRequest<DetachAppPolicyFromIdentityResponse> {
	   

	private Long resourceOwnerId;

	private String policyNames;

	private String identityName;

	private String identityType;

	private String resourceOwnerAccount;

	private Long ownerId;

	private String appId;
	public DetachAppPolicyFromIdentityRequest() {
		super("vod", "2017-03-21", "DetachAppPolicyFromIdentity", "vod");
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

	public String getPolicyNames() {
		return this.policyNames;
	}

	public void setPolicyNames(String policyNames) {
		this.policyNames = policyNames;
		if(policyNames != null){
			putQueryParameter("PolicyNames", policyNames);
		}
	}

	public String getIdentityName() {
		return this.identityName;
	}

	public void setIdentityName(String identityName) {
		this.identityName = identityName;
		if(identityName != null){
			putQueryParameter("IdentityName", identityName);
		}
	}

	public String getIdentityType() {
		return this.identityType;
	}

	public void setIdentityType(String identityType) {
		this.identityType = identityType;
		if(identityType != null){
			putQueryParameter("IdentityType", identityType);
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

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	@Override
	public Class<DetachAppPolicyFromIdentityResponse> getResponseClass() {
		return DetachAppPolicyFromIdentityResponse.class;
	}

}
