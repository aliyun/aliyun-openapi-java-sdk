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

package com.aliyuncs.smartag.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class UnicomOrderConfirmRequest extends RpcAcsRequest<UnicomOrderConfirmResponse> {
	
	public UnicomOrderConfirmRequest() {
		super("Smartag", "2018-03-13", "UnicomOrderConfirm", "smartag");
	}

	private String tmsCode;

	private Long resourceOwnerId;

	private List<OrderItem> orderItems;

	private String ownerUserId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long orderPostFee;

	private Long ownerId;

	private String tmsOrderCode;

	private String tradeId;

	public String getTmsCode() {
		return this.tmsCode;
	}

	public void setTmsCode(String tmsCode) {
		this.tmsCode = tmsCode;
		if(tmsCode != null){
			putQueryParameter("TmsCode", tmsCode);
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

	public List<OrderItem> getOrderItems() {
		return this.orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;	
		if (orderItems != null) {
			for (int depth1 = 0; depth1 < orderItems.size(); depth1++) {
				putQueryParameter("OrderItem." + (depth1 + 1) + ".ScItemName" , orderItems.get(depth1).getScItemName());
				putQueryParameter("OrderItem." + (depth1 + 1) + ".ItemAmount" , orderItems.get(depth1).getItemAmount());
				if (orderItems.get(depth1).getSnLists() != null) {
					for (int i = 0; i < orderItems.get(depth1).getSnLists().size(); i++) {
						putQueryParameter("OrderItem." + (depth1 + 1) + ".SnList." + (i + 1) , orderItems.get(depth1).getSnLists().get(i));
					}
				}
				putQueryParameter("OrderItem." + (depth1 + 1) + ".OrderItemId" , orderItems.get(depth1).getOrderItemId());
				putQueryParameter("OrderItem." + (depth1 + 1) + ".ScItemCode" , orderItems.get(depth1).getScItemCode());
				putQueryParameter("OrderItem." + (depth1 + 1) + ".ItemQuantity" , orderItems.get(depth1).getItemQuantity());
				putQueryParameter("OrderItem." + (depth1 + 1) + ".TradeId" , orderItems.get(depth1).getTradeId());
				putQueryParameter("OrderItem." + (depth1 + 1) + ".TradeItemId" , orderItems.get(depth1).getTradeItemId());
			}
		}	
	}

	public String getOwnerUserId() {
		return this.ownerUserId;
	}

	public void setOwnerUserId(String ownerUserId) {
		this.ownerUserId = ownerUserId;
		if(ownerUserId != null){
			putQueryParameter("OwnerUserId", ownerUserId);
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

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Long getOrderPostFee() {
		return this.orderPostFee;
	}

	public void setOrderPostFee(Long orderPostFee) {
		this.orderPostFee = orderPostFee;
		if(orderPostFee != null){
			putQueryParameter("OrderPostFee", orderPostFee.toString());
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

	public String getTmsOrderCode() {
		return this.tmsOrderCode;
	}

	public void setTmsOrderCode(String tmsOrderCode) {
		this.tmsOrderCode = tmsOrderCode;
		if(tmsOrderCode != null){
			putQueryParameter("TmsOrderCode", tmsOrderCode);
		}
	}

	public String getTradeId() {
		return this.tradeId;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
		if(tradeId != null){
			putQueryParameter("TradeId", tradeId);
		}
	}

	public static class OrderItem {

		private String scItemName;

		private String itemAmount;

		private List<String> snLists;

		private String orderItemId;

		private String scItemCode;

		private Integer itemQuantity;

		private String tradeId;

		private String tradeItemId;

		public String getScItemName() {
			return this.scItemName;
		}

		public void setScItemName(String scItemName) {
			this.scItemName = scItemName;
		}

		public String getItemAmount() {
			return this.itemAmount;
		}

		public void setItemAmount(String itemAmount) {
			this.itemAmount = itemAmount;
		}

		public List<String> getSnLists() {
			return this.snLists;
		}

		public void setSnLists(List<String> snLists) {
			this.snLists = snLists;
		}

		public String getOrderItemId() {
			return this.orderItemId;
		}

		public void setOrderItemId(String orderItemId) {
			this.orderItemId = orderItemId;
		}

		public String getScItemCode() {
			return this.scItemCode;
		}

		public void setScItemCode(String scItemCode) {
			this.scItemCode = scItemCode;
		}

		public Integer getItemQuantity() {
			return this.itemQuantity;
		}

		public void setItemQuantity(Integer itemQuantity) {
			this.itemQuantity = itemQuantity;
		}

		public String getTradeId() {
			return this.tradeId;
		}

		public void setTradeId(String tradeId) {
			this.tradeId = tradeId;
		}

		public String getTradeItemId() {
			return this.tradeItemId;
		}

		public void setTradeItemId(String tradeItemId) {
			this.tradeItemId = tradeItemId;
		}
	}

	@Override
	public Class<UnicomOrderConfirmResponse> getResponseClass() {
		return UnicomOrderConfirmResponse.class;
	}

}
