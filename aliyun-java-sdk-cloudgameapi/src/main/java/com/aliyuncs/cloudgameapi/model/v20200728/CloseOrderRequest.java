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

package com.aliyuncs.cloudgameapi.model.v20200728;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudgameapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CloseOrderRequest extends RpcAcsRequest<CloseOrderResponse> {
	   

	private String accountDomain;

	private String orderId;

	private String buyerAccountId;
	public CloseOrderRequest() {
		super("CloudGameAPI", "2020-07-28", "CloseOrder", "CloudGameAPI");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAccountDomain() {
		return this.accountDomain;
	}

	public void setAccountDomain(String accountDomain) {
		this.accountDomain = accountDomain;
		if(accountDomain != null){
			putQueryParameter("AccountDomain", accountDomain);
		}
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
		if(orderId != null){
			putQueryParameter("OrderId", orderId);
		}
	}

	public String getBuyerAccountId() {
		return this.buyerAccountId;
	}

	public void setBuyerAccountId(String buyerAccountId) {
		this.buyerAccountId = buyerAccountId;
		if(buyerAccountId != null){
			putQueryParameter("BuyerAccountId", buyerAccountId);
		}
	}

	@Override
	public Class<CloseOrderResponse> getResponseClass() {
		return CloseOrderResponse.class;
	}

}
