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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dyplsapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QuerySoundRecordRequest extends RpcAcsRequest<QuerySoundRecordResponse> {
	   

	private String callId;

	private Long resourceOwnerId;

	private Long callerParentId;

	private String reqId;

	private String customerPoolKey;

	private String resourceOwnerAccount;

	private Long ownerId;
	public QuerySoundRecordRequest() {
		super("Dyplsapi", "2017-05-25", "QuerySoundRecord", "dypls");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCallId() {
		return this.callId;
	}

	public void setCallId(String callId) {
		this.callId = callId;
		if(callId != null){
			putQueryParameter("CallId", callId);
		}
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

	public Long getCallerParentId() {
		return this.callerParentId;
	}

	public void setCallerParentId(Long callerParentId) {
		this.callerParentId = callerParentId;
		if(callerParentId != null){
			putQueryParameter("CallerParentId", callerParentId.toString());
		}
	}

	public String getReqId() {
		return this.reqId;
	}

	public void setReqId(String reqId) {
		this.reqId = reqId;
		if(reqId != null){
			putQueryParameter("ReqId", reqId);
		}
	}

	public String getCustomerPoolKey() {
		return this.customerPoolKey;
	}

	public void setCustomerPoolKey(String customerPoolKey) {
		this.customerPoolKey = customerPoolKey;
		if(customerPoolKey != null){
			putQueryParameter("CustomerPoolKey", customerPoolKey);
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

	@Override
	public Class<QuerySoundRecordResponse> getResponseClass() {
		return QuerySoundRecordResponse.class;
	}

}
