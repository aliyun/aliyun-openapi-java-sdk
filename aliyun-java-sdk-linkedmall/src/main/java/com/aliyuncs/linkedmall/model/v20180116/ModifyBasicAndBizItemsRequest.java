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
public class ModifyBasicAndBizItemsRequest extends RpcAcsRequest<ModifyBasicAndBizItemsResponse> {
	   

	private String bizId;

	private List<ItemList> itemLists;

	private String subBizId;
	public ModifyBasicAndBizItemsRequest() {
		super("linkedmall", "2018-01-16", "ModifyBasicAndBizItems");
		setMethod(MethodType.POST);
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
				putBodyParameter("ItemList." + (depth1 + 1) + ".ItemId" , itemLists.get(depth1).getItemId());
				if (itemLists.get(depth1).getSkuLists() != null) {
					for (int depth2 = 0; depth2 < itemLists.get(depth1).getSkuLists().size(); depth2++) {
						putBodyParameter("ItemList." + (depth1 + 1) + ".SkuList." + (depth2 + 1) + ".StatusAction" , itemLists.get(depth1).getSkuLists().get(depth2).getStatusAction());
						putBodyParameter("ItemList." + (depth1 + 1) + ".SkuList." + (depth2 + 1) + ".PriceCent" , itemLists.get(depth1).getSkuLists().get(depth2).getPriceCent());
						putBodyParameter("ItemList." + (depth1 + 1) + ".SkuList." + (depth2 + 1) + ".PointsAmount" , itemLists.get(depth1).getSkuLists().get(depth2).getPointsAmount());
						putBodyParameter("ItemList." + (depth1 + 1) + ".SkuList." + (depth2 + 1) + ".Quantity" , itemLists.get(depth1).getSkuLists().get(depth2).getQuantity());
						putBodyParameter("ItemList." + (depth1 + 1) + ".SkuList." + (depth2 + 1) + ".BenefitId" , itemLists.get(depth1).getSkuLists().get(depth2).getBenefitId());
						putBodyParameter("ItemList." + (depth1 + 1) + ".SkuList." + (depth2 + 1) + ".SkuId" , itemLists.get(depth1).getSkuLists().get(depth2).getSkuId());
						putBodyParameter("ItemList." + (depth1 + 1) + ".SkuList." + (depth2 + 1) + ".SupplierPrice" , itemLists.get(depth1).getSkuLists().get(depth2).getSupplierPrice());
						putBodyParameter("ItemList." + (depth1 + 1) + ".SkuList." + (depth2 + 1) + ".Points" , itemLists.get(depth1).getSkuLists().get(depth2).getPoints());
					}
				}
			}
		}	
	}

	public String getSubBizId() {
		return this.subBizId;
	}

	public void setSubBizId(String subBizId) {
		this.subBizId = subBizId;
		if(subBizId != null){
			putQueryParameter("SubBizId", subBizId);
		}
	}

	public static class ItemList {

		private Long itemId;

		private List<SkuList> skuLists;

		public Long getItemId() {
			return this.itemId;
		}

		public void setItemId(Long itemId) {
			this.itemId = itemId;
		}

		public List<SkuList> getSkuLists() {
			return this.skuLists;
		}

		public void setSkuLists(List<SkuList> skuLists) {
			this.skuLists = skuLists;
		}

		public static class SkuList {

			private Long statusAction;

			private Long priceCent;

			private Long pointsAmount;

			private Integer quantity;

			private String benefitId;

			private Long skuId;

			private Long supplierPrice;

			private Long points;

			public Long getStatusAction() {
				return this.statusAction;
			}

			public void setStatusAction(Long statusAction) {
				this.statusAction = statusAction;
			}

			public Long getPriceCent() {
				return this.priceCent;
			}

			public void setPriceCent(Long priceCent) {
				this.priceCent = priceCent;
			}

			public Long getPointsAmount() {
				return this.pointsAmount;
			}

			public void setPointsAmount(Long pointsAmount) {
				this.pointsAmount = pointsAmount;
			}

			public Integer getQuantity() {
				return this.quantity;
			}

			public void setQuantity(Integer quantity) {
				this.quantity = quantity;
			}

			public String getBenefitId() {
				return this.benefitId;
			}

			public void setBenefitId(String benefitId) {
				this.benefitId = benefitId;
			}

			public Long getSkuId() {
				return this.skuId;
			}

			public void setSkuId(Long skuId) {
				this.skuId = skuId;
			}

			public Long getSupplierPrice() {
				return this.supplierPrice;
			}

			public void setSupplierPrice(Long supplierPrice) {
				this.supplierPrice = supplierPrice;
			}

			public Long getPoints() {
				return this.points;
			}

			public void setPoints(Long points) {
				this.points = points;
			}
		}
	}

	@Override
	public Class<ModifyBasicAndBizItemsResponse> getResponseClass() {
		return ModifyBasicAndBizItemsResponse.class;
	}

}
