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
public class CreateOrderRequest extends RpcAcsRequest<CreateOrderResponse> {
	   

	private String accountDomain;

	private String itemId;

	private Long settlementPrice;

	private Long amount;

	private Long originPrice;

	private String idempotentCode;

	private String buyerAccountId;

	private String skuId;
	public CreateOrderRequest() {
		super("CloudGameAPI", "2020-07-28", "CreateOrder");
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

	public String getItemId() {
		return this.itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
		if(itemId != null){
			putQueryParameter("ItemId", itemId);
		}
	}

	public Long getSettlementPrice() {
		return this.settlementPrice;
	}

	public void setSettlementPrice(Long settlementPrice) {
		this.settlementPrice = settlementPrice;
		if(settlementPrice != null){
			putQueryParameter("SettlementPrice", settlementPrice.toString());
		}
	}

	public Long getAmount() {
		return this.amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
		if(amount != null){
			putQueryParameter("Amount", amount.toString());
		}
	}

	public Long getOriginPrice() {
		return this.originPrice;
	}

	public void setOriginPrice(Long originPrice) {
		this.originPrice = originPrice;
		if(originPrice != null){
			putQueryParameter("OriginPrice", originPrice.toString());
		}
	}

	public String getIdempotentCode() {
		return this.idempotentCode;
	}

	public void setIdempotentCode(String idempotentCode) {
		this.idempotentCode = idempotentCode;
		if(idempotentCode != null){
			putQueryParameter("IdempotentCode", idempotentCode);
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

	public String getSkuId() {
		return this.skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
		if(skuId != null){
			putQueryParameter("SkuId", skuId);
		}
	}

	@Override
	public Class<CreateOrderResponse> getResponseClass() {
		return CreateOrderResponse.class;
	}

}
