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
public class AddSupplierNewItemsRequest extends RpcAcsRequest<AddSupplierNewItemsResponse> {
	   

	private String bizId;

	private List<ItemList> itemLists;
	public AddSupplierNewItemsRequest() {
		super("linkedmall", "2018-01-16", "AddSupplierNewItems", "linkedmall");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<ItemList> getItemLists() {
		return this.itemLists;
	}

	public void setItemLists(List<ItemList> itemLists) {
		this.itemLists = itemLists;	
		if (itemLists != null) {
			for (int depth1 = 0; depth1 < itemLists.size(); depth1++) {
				putQueryParameter("ItemList." + (depth1 + 1) + ".ItemId" , itemLists.get(depth1).getItemId());
				putQueryParameter("ItemList." + (depth1 + 1) + ".LmItemId" , itemLists.get(depth1).getLmItemId());
				if (itemLists.get(depth1).getSkuLists() != null) {
					for (int i = 0; i < itemLists.get(depth1).getSkuLists().size(); i++) {
						putQueryParameter("ItemList." + (depth1 + 1) + ".SkuList." + (i + 1) , itemLists.get(depth1).getSkuLists().get(i));
					}
				}
			}
		}	
	}

	public static class ItemList {

		private Long itemId;

		private String lmItemId;

		private List<Long> skuLists;

		public Long getItemId() {
			return this.itemId;
		}

		public void setItemId(Long itemId) {
			this.itemId = itemId;
		}

		public String getLmItemId() {
			return this.lmItemId;
		}

		public void setLmItemId(String lmItemId) {
			this.lmItemId = lmItemId;
		}

		public List<Long> getSkuLists() {
			return this.skuLists;
		}

		public void setSkuLists(List<Long> skuLists) {
			this.skuLists = skuLists;
		}
	}

	@Override
	public Class<AddSupplierNewItemsResponse> getResponseClass() {
		return AddSupplierNewItemsResponse.class;
	}

}
