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

package com.aliyuncs.market.model.v20151101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.market.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateOrderRequest extends RpcAcsRequest<CreateOrderResponse> {
	   

	private String orderSouce;

	private String commodity;

	private String clientToken;

	private String ownerId;

	private String paymentType;

	private String orderType;
	public CreateOrderRequest() {
		super("Market", "2015-11-01", "CreateOrder", "yunmarket");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOrderSouce() {
		return this.orderSouce;
	}

	public void setOrderSouce(String orderSouce) {
		this.orderSouce = orderSouce;
		if(orderSouce != null){
			putQueryParameter("OrderSouce", orderSouce);
		}
	}

	public String getCommodity() {
		return this.commodity;
	}

	public void setCommodity(String commodity) {
		this.commodity = commodity;
		if(commodity != null){
			putQueryParameter("Commodity", commodity);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
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

	public String getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
		if(paymentType != null){
			putQueryParameter("PaymentType", paymentType);
		}
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
		if(orderType != null){
			putQueryParameter("OrderType", orderType);
		}
	}

	@Override
	public Class<CreateOrderResponse> getResponseClass() {
		return CreateOrderResponse.class;
	}

}
