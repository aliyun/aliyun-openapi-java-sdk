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

/**
 * @author auto create
 * @version 
 */
public class CreateOrderRequest extends RpcAcsRequest<CreateOrderResponse> {
	
	public CreateOrderRequest() {
		super("linkedmall", "2018-01-16", "CreateOrder", "linkedmall");
	}

	private String bizId;

	private String bizUid;

	private String outTradeId;

	private Long itemId;

	private Long quantity;

	private Long totalAmount;

	private String extJson;

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
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

	public String getOutTradeId() {
		return this.outTradeId;
	}

	public void setOutTradeId(String outTradeId) {
		this.outTradeId = outTradeId;
		if(outTradeId != null){
			putQueryParameter("OutTradeId", outTradeId);
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

	public Long getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
		if(quantity != null){
			putQueryParameter("Quantity", quantity.toString());
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

	public String getExtJson() {
		return this.extJson;
	}

	public void setExtJson(String extJson) {
		this.extJson = extJson;
		if(extJson != null){
			putQueryParameter("ExtJson", extJson);
		}
	}

	@Override
	public Class<CreateOrderResponse> getResponseClass() {
		return CreateOrderResponse.class;
	}

}
