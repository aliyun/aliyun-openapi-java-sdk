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

package com.aliyuncs.linkedmall.model.v20180116;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkedmall.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateOrderV2Request extends RpcAcsRequest<CreateOrderV2Response> {
	   

	private Long quantity;

	private String bizUid;

	private String extJson;

	private String accountType;

	private Boolean useAnonymousTbAccount;

	private Long orderExpireTime;

	private String lmItemId;

	private List<ItemList> itemLists;

	private Long itemId;

	private Long totalAmount;

	private String thirdPartyUserId;

	private String bizId;

	private String outTradeId;

	private String deliveryAddress;
	public CreateOrderV2Request() {
		super("linkedmall", "2018-01-16", "CreateOrderV2", "linkedmall");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
		if(quantity != null){
			putQueryParameter("Quantity", quantity.toString());
		}
	}

	public String getBizUid() {
		return this.bizUid;
	}

	public void setBizUid(String bizUid) {
		this.bizUid = bizUid;
		if(bizUid != null){
			putQueryParameter("BizUid", bizUid);
		}
	}

	public String getExtJson() {
		return this.extJson;
	}

	public void setExtJson(String extJson) {
		this.extJson = extJson;
		if(extJson != null){
			putQueryParameter("ExtJson", extJson);
		}
	}

	public String getAccountType() {
		return this.accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
		if(accountType != null){
			putQueryParameter("AccountType", accountType);
		}
	}

	public Boolean getUseAnonymousTbAccount() {
		return this.useAnonymousTbAccount;
	}

	public void setUseAnonymousTbAccount(Boolean useAnonymousTbAccount) {
		this.useAnonymousTbAccount = useAnonymousTbAccount;
		if(useAnonymousTbAccount != null){
			putQueryParameter("UseAnonymousTbAccount", useAnonymousTbAccount.toString());
		}
	}

	public Long getOrderExpireTime() {
		return this.orderExpireTime;
	}

	public void setOrderExpireTime(Long orderExpireTime) {
		this.orderExpireTime = orderExpireTime;
		if(orderExpireTime != null){
			putQueryParameter("OrderExpireTime", orderExpireTime.toString());
		}
	}

	public String getLmItemId() {
		return this.lmItemId;
	}

	public void setLmItemId(String lmItemId) {
		this.lmItemId = lmItemId;
		if(lmItemId != null){
			putQueryParameter("LmItemId", lmItemId);
		}
	}

	public List<ItemList> getItemLists() {
		return this.itemLists;
	}

	public void setItemLists(List<ItemList> itemLists) {
		this.itemLists = itemLists;	
		if (itemLists != null) {
			for (int depth1 = 0; depth1 < itemLists.size(); depth1++) {
				putQueryParameter("ItemList." + (depth1 + 1) + ".ItemId" , itemLists.get(depth1).getItemId());
				putQueryParameter("ItemList." + (depth1 + 1) + ".Quantity" , itemLists.get(depth1).getQuantity());
				putQueryParameter("ItemList." + (depth1 + 1) + ".LmItemId" , itemLists.get(depth1).getLmItemId());
				putQueryParameter("ItemList." + (depth1 + 1) + ".SkuId" , itemLists.get(depth1).getSkuId());
			}
		}	
	}

	public Long getItemId() {
		return this.itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
		if(itemId != null){
			putQueryParameter("ItemId", itemId.toString());
		}
	}

	public Long getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
		if(totalAmount != null){
			putQueryParameter("TotalAmount", totalAmount.toString());
		}
	}

	public String getThirdPartyUserId() {
		return this.thirdPartyUserId;
	}

	public void setThirdPartyUserId(String thirdPartyUserId) {
		this.thirdPartyUserId = thirdPartyUserId;
		if(thirdPartyUserId != null){
			putQueryParameter("ThirdPartyUserId", thirdPartyUserId);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	public String getOutTradeId() {
		return this.outTradeId;
	}

	public void setOutTradeId(String outTradeId) {
		this.outTradeId = outTradeId;
		if(outTradeId != null){
			putQueryParameter("OutTradeId", outTradeId);
		}
	}

	public String getDeliveryAddress() {
		return this.deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
		if(deliveryAddress != null){
			putQueryParameter("DeliveryAddress", deliveryAddress);
		}
	}

	public static class ItemList {

		private Long itemId;

		private Integer quantity;

		private String lmItemId;

		private Long skuId;

		public Long getItemId() {
			return this.itemId;
		}

		public void setItemId(Long itemId) {
			this.itemId = itemId;
		}

		public Integer getQuantity() {
			return this.quantity;
		}

		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}

		public String getLmItemId() {
			return this.lmItemId;
		}

		public void setLmItemId(String lmItemId) {
			this.lmItemId = lmItemId;
		}

		public Long getSkuId() {
			return this.skuId;
		}

		public void setSkuId(Long skuId) {
			this.skuId = skuId;
		}
	}

	@Override
	public Class<CreateOrderV2Response> getResponseClass() {
		return CreateOrderV2Response.class;
	}

}
