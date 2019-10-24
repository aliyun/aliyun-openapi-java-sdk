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

package com.aliyuncs.bssopenapi.model.v20171214;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.bssopenapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryCustomerAddressListRequest extends RpcAcsRequest<QueryCustomerAddressListResponse> {
	   

	private Long callerBid;

	private Long ownerId;

	private Long callerUid;
	public QueryCustomerAddressListRequest() {
		super("BssOpenApi", "2017-12-14", "QueryCustomerAddressList", "bssopenapi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getCallerBid() {
		return this.callerBid;
	}

	public void setCallerBid(Long callerBid) {
		this.callerBid = callerBid;
		if(callerBid != null){
			putQueryParameter("callerBid", callerBid.toString());
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

	public Long getCallerUid() {
		return this.callerUid;
	}

	public void setCallerUid(Long callerUid) {
		this.callerUid = callerUid;
		if(callerUid != null){
			putQueryParameter("callerUid", callerUid.toString());
		}
	}

	@Override
	public Class<QueryCustomerAddressListResponse> getResponseClass() {
		return QueryCustomerAddressListResponse.class;
	}

}
