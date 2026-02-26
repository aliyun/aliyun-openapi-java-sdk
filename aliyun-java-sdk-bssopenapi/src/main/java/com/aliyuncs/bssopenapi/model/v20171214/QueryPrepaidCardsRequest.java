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
public class QueryPrepaidCardsRequest extends RpcAcsRequest<QueryPrepaidCardsResponse> {
	   

	private String expiryTimeEnd;

	private String expiryTimeStart;

	private Boolean effectiveOrNot;
	public QueryPrepaidCardsRequest() {
		super("BssOpenApi", "2017-12-14", "QueryPrepaidCards", "bssopenapi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExpiryTimeEnd() {
		return this.expiryTimeEnd;
	}

	public void setExpiryTimeEnd(String expiryTimeEnd) {
		this.expiryTimeEnd = expiryTimeEnd;
		if(expiryTimeEnd != null){
			putQueryParameter("ExpiryTimeEnd", expiryTimeEnd);
		}
	}

	public String getExpiryTimeStart() {
		return this.expiryTimeStart;
	}

	public void setExpiryTimeStart(String expiryTimeStart) {
		this.expiryTimeStart = expiryTimeStart;
		if(expiryTimeStart != null){
			putQueryParameter("ExpiryTimeStart", expiryTimeStart);
		}
	}

	public Boolean getEffectiveOrNot() {
		return this.effectiveOrNot;
	}

	public void setEffectiveOrNot(Boolean effectiveOrNot) {
		this.effectiveOrNot = effectiveOrNot;
		if(effectiveOrNot != null){
			putQueryParameter("EffectiveOrNot", effectiveOrNot.toString());
		}
	}

	@Override
	public Class<QueryPrepaidCardsResponse> getResponseClass() {
		return QueryPrepaidCardsResponse.class;
	}

}
