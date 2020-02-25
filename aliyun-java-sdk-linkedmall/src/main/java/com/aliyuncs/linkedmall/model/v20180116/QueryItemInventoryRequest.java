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

/**
 * @author auto create
 * @version 
 */
public class QueryItemInventoryRequest extends RpcAcsRequest<QueryItemInventoryResponse> {
	   

	private String divisionCode;

	private String ip;

	private String bizId;

	private List<ItemList> itemLists;
	public QueryItemInventoryRequest() {
		super("linkedmall", "2018-01-16", "QueryItemInventory");
		setMethod(MethodType.POST);
	}

	public String getDivisionCode() {
		return this.divisionCode;
	}

	public void setDivisionCode(String divisionCode) {
		this.divisionCode = divisionCode;
		if(divisionCode != null){
			putQueryParameter("DivisionCode", divisionCode);
		}
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
		if(ip != null){
			putQueryParameter("Ip", ip);
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

	public List<ItemList> getItemLists() {
		return this.itemLists;
	}

	public void setItemLists(List<ItemList> itemLists) {
		this.itemLists = itemLists;	
		if (itemLists != null) {
			for (int depth1 = 0; depth1 < itemLists.size(); depth1++) {
				putQueryParameter("ItemList." + (depth1 + 1) + ".ItemId" , itemLists.get(depth1).getItemId());
				if (itemLists.get(depth1).getSkuIdLists() != null) {
					for (int i = 0; i < itemLists.get(depth1).getSkuIdLists().size(); i++) {
						putQueryParameter("ItemList." + (depth1 + 1) + ".SkuIdList." + (i + 1) , itemLists.get(depth1).getSkuIdLists().get(i));
					}
				}
			}
		}	
	}

	public static class ItemList {

		private Long itemId;

		private List<Long> skuIdLists;

		public Long getItemId() {
			return this.itemId;
		}

		public void setItemId(Long itemId) {
			this.itemId = itemId;
		}

		public List<Long> getSkuIdLists() {
			return this.skuIdLists;
		}

		public void setSkuIdLists(List<Long> skuIdLists) {
			this.skuIdLists = skuIdLists;
		}
	}

	@Override
	public Class<QueryItemInventoryResponse> getResponseClass() {
		return QueryItemInventoryResponse.class;
	}

}
