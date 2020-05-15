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
public class QueryPhoneNoAByTrackNoRequest extends RpcAcsRequest<QueryPhoneNoAByTrackNoResponse> {
	   

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private Long ownerId;

	private String trackNo;

	private String phoneNoX;
	public QueryPhoneNoAByTrackNoRequest() {
		super("Dyplsapi", "2017-05-25", "QueryPhoneNoAByTrackNo", "dypls");
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

	public String getTrackNo() {
		return this.trackNo;
	}

	public void setTrackNo(String trackNo) {
		this.trackNo = trackNo;
		if(trackNo != null){
			putQueryParameter("trackNo", trackNo);
		}
	}

	public String getPhoneNoX() {
		return this.phoneNoX;
	}

	public void setPhoneNoX(String phoneNoX) {
		this.phoneNoX = phoneNoX;
		if(phoneNoX != null){
			putQueryParameter("PhoneNoX", phoneNoX);
		}
	}

	@Override
	public Class<QueryPhoneNoAByTrackNoResponse> getResponseClass() {
		return QueryPhoneNoAByTrackNoResponse.class;
	}

}
