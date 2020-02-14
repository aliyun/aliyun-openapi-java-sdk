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

package com.aliyuncs.cloudesl.model.v20190801;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudesl.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BatchInsertItemsRequest extends RpcAcsRequest<BatchInsertItemsResponse> {
	   

	private String storeId;

	private List<ItemInfo> itemInfos;
	public BatchInsertItemsRequest() {
		super("cloudesl", "2019-08-01", "BatchInsertItems", "cloudesl");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getStoreId() {
		return this.storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
		if(storeId != null){
			putBodyParameter("StoreId", storeId);
		}
	}

	public List<ItemInfo> getItemInfos() {
		return this.itemInfos;
	}

	public void setItemInfos(List<ItemInfo> itemInfos) {
		this.itemInfos = itemInfos;	
		if (itemInfos != null) {
			for (int depth1 = 0; depth1 < itemInfos.size(); depth1++) {
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".MemberPrice" , itemInfos.get(depth1).getMemberPrice());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".ActionPrice" , itemInfos.get(depth1).getActionPrice());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".ProductionPlace" , itemInfos.get(depth1).getProductionPlace());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".BeSourceCode" , itemInfos.get(depth1).getBeSourceCode());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".StoreId" , itemInfos.get(depth1).getStoreId());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".BrandName" , itemInfos.get(depth1).getBrandName());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".PromotionStart" , itemInfos.get(depth1).getPromotionStart());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".SourceCode" , itemInfos.get(depth1).getSourceCode());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".ExtraAttribute" , itemInfos.get(depth1).getExtraAttribute());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".ItemId" , itemInfos.get(depth1).getItemId());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CompanyId" , itemInfos.get(depth1).getCompanyId());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".PriceUnit" , itemInfos.get(depth1).getPriceUnit());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".Rank" , itemInfos.get(depth1).getRank());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".ItemInfoIndex" , itemInfos.get(depth1).getItemInfoIndex());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".ItemBarCode" , itemInfos.get(depth1).getItemBarCode());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".BePromotion" , itemInfos.get(depth1).getBePromotion());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".PromotionEnd" , itemInfos.get(depth1).getPromotionEnd());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".ItemTitle" , itemInfos.get(depth1).getItemTitle());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".OriginalPrice" , itemInfos.get(depth1).getOriginalPrice());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".ItemShortTitle" , itemInfos.get(depth1).getItemShortTitle());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CustomizeFeatureC" , itemInfos.get(depth1).getCustomizeFeatureC());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".ItemQrCode" , itemInfos.get(depth1).getItemQrCode());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CustomizeFeatureD" , itemInfos.get(depth1).getCustomizeFeatureD());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".PromotionReason" , itemInfos.get(depth1).getPromotionReason());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CustomizeFeatureE" , itemInfos.get(depth1).getCustomizeFeatureE());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CustomizeFeatureF" , itemInfos.get(depth1).getCustomizeFeatureF());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".ForestSecondId" , itemInfos.get(depth1).getForestSecondId());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CustomizeFeatureG" , itemInfos.get(depth1).getCustomizeFeatureG());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CustomizeFeatureH" , itemInfos.get(depth1).getCustomizeFeatureH());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CustomizeFeatureI" , itemInfos.get(depth1).getCustomizeFeatureI());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CustomizeFeatureJ" , itemInfos.get(depth1).getCustomizeFeatureJ());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".OptionGroups" , itemInfos.get(depth1).getOptionGroups());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".ModelNumber" , itemInfos.get(depth1).getModelNumber());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".SaleSpec" , itemInfos.get(depth1).getSaleSpec());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CustomizeFeatureA" , itemInfos.get(depth1).getCustomizeFeatureA());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CustomizeFeatureB" , itemInfos.get(depth1).getCustomizeFeatureB());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".SuggestPrice" , itemInfos.get(depth1).getSuggestPrice());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".ForestFirstId" , itemInfos.get(depth1).getForestFirstId());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CategoryName" , itemInfos.get(depth1).getCategoryName());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".EnergyEfficiency" , itemInfos.get(depth1).getEnergyEfficiency());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".PromotionText" , itemInfos.get(depth1).getPromotionText());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".SkuId" , itemInfos.get(depth1).getSkuId());
			}
		}	
	}

	public static class ItemInfo {

		private Integer memberPrice;

		private Integer actionPrice;

		private String productionPlace;

		private Boolean beSourceCode;

		private String storeId;

		private String brandName;

		private String promotionStart;

		private String sourceCode;

		private String extraAttribute;

		private Long itemId;

		private String companyId;

		private String priceUnit;

		private String rank;

		private Integer itemInfoIndex;

		private String itemBarCode;

		private Boolean bePromotion;

		private String promotionEnd;

		private String itemTitle;

		private Integer originalPrice;

		private String itemShortTitle;

		private String customizeFeatureC;

		private String itemQrCode;

		private String customizeFeatureD;

		private String promotionReason;

		private String customizeFeatureE;

		private String customizeFeatureF;

		private String forestSecondId;

		private String customizeFeatureG;

		private String customizeFeatureH;

		private String customizeFeatureI;

		private String customizeFeatureJ;

		private String optionGroups;

		private String modelNumber;

		private String saleSpec;

		private String customizeFeatureA;

		private String customizeFeatureB;

		private Integer suggestPrice;

		private String forestFirstId;

		private String categoryName;

		private String energyEfficiency;

		private String promotionText;

		private String skuId;

		public Integer getMemberPrice() {
			return this.memberPrice;
		}

		public void setMemberPrice(Integer memberPrice) {
			this.memberPrice = memberPrice;
		}

		public Integer getActionPrice() {
			return this.actionPrice;
		}

		public void setActionPrice(Integer actionPrice) {
			this.actionPrice = actionPrice;
		}

		public String getProductionPlace() {
			return this.productionPlace;
		}

		public void setProductionPlace(String productionPlace) {
			this.productionPlace = productionPlace;
		}

		public Boolean getBeSourceCode() {
			return this.beSourceCode;
		}

		public void setBeSourceCode(Boolean beSourceCode) {
			this.beSourceCode = beSourceCode;
		}

		public String getStoreId() {
			return this.storeId;
		}

		public void setStoreId(String storeId) {
			this.storeId = storeId;
		}

		public String getBrandName() {
			return this.brandName;
		}

		public void setBrandName(String brandName) {
			this.brandName = brandName;
		}

		public String getPromotionStart() {
			return this.promotionStart;
		}

		public void setPromotionStart(String promotionStart) {
			this.promotionStart = promotionStart;
		}

		public String getSourceCode() {
			return this.sourceCode;
		}

		public void setSourceCode(String sourceCode) {
			this.sourceCode = sourceCode;
		}

		public String getExtraAttribute() {
			return this.extraAttribute;
		}

		public void setExtraAttribute(String extraAttribute) {
			this.extraAttribute = extraAttribute;
		}

		public Long getItemId() {
			return this.itemId;
		}

		public void setItemId(Long itemId) {
			this.itemId = itemId;
		}

		public String getCompanyId() {
			return this.companyId;
		}

		public void setCompanyId(String companyId) {
			this.companyId = companyId;
		}

		public String getPriceUnit() {
			return this.priceUnit;
		}

		public void setPriceUnit(String priceUnit) {
			this.priceUnit = priceUnit;
		}

		public String getRank() {
			return this.rank;
		}

		public void setRank(String rank) {
			this.rank = rank;
		}

		public Integer getItemInfoIndex() {
			return this.itemInfoIndex;
		}

		public void setItemInfoIndex(Integer itemInfoIndex) {
			this.itemInfoIndex = itemInfoIndex;
		}

		public String getItemBarCode() {
			return this.itemBarCode;
		}

		public void setItemBarCode(String itemBarCode) {
			this.itemBarCode = itemBarCode;
		}

		public Boolean getBePromotion() {
			return this.bePromotion;
		}

		public void setBePromotion(Boolean bePromotion) {
			this.bePromotion = bePromotion;
		}

		public String getPromotionEnd() {
			return this.promotionEnd;
		}

		public void setPromotionEnd(String promotionEnd) {
			this.promotionEnd = promotionEnd;
		}

		public String getItemTitle() {
			return this.itemTitle;
		}

		public void setItemTitle(String itemTitle) {
			this.itemTitle = itemTitle;
		}

		public Integer getOriginalPrice() {
			return this.originalPrice;
		}

		public void setOriginalPrice(Integer originalPrice) {
			this.originalPrice = originalPrice;
		}

		public String getItemShortTitle() {
			return this.itemShortTitle;
		}

		public void setItemShortTitle(String itemShortTitle) {
			this.itemShortTitle = itemShortTitle;
		}

		public String getCustomizeFeatureC() {
			return this.customizeFeatureC;
		}

		public void setCustomizeFeatureC(String customizeFeatureC) {
			this.customizeFeatureC = customizeFeatureC;
		}

		public String getItemQrCode() {
			return this.itemQrCode;
		}

		public void setItemQrCode(String itemQrCode) {
			this.itemQrCode = itemQrCode;
		}

		public String getCustomizeFeatureD() {
			return this.customizeFeatureD;
		}

		public void setCustomizeFeatureD(String customizeFeatureD) {
			this.customizeFeatureD = customizeFeatureD;
		}

		public String getPromotionReason() {
			return this.promotionReason;
		}

		public void setPromotionReason(String promotionReason) {
			this.promotionReason = promotionReason;
		}

		public String getCustomizeFeatureE() {
			return this.customizeFeatureE;
		}

		public void setCustomizeFeatureE(String customizeFeatureE) {
			this.customizeFeatureE = customizeFeatureE;
		}

		public String getCustomizeFeatureF() {
			return this.customizeFeatureF;
		}

		public void setCustomizeFeatureF(String customizeFeatureF) {
			this.customizeFeatureF = customizeFeatureF;
		}

		public String getForestSecondId() {
			return this.forestSecondId;
		}

		public void setForestSecondId(String forestSecondId) {
			this.forestSecondId = forestSecondId;
		}

		public String getCustomizeFeatureG() {
			return this.customizeFeatureG;
		}

		public void setCustomizeFeatureG(String customizeFeatureG) {
			this.customizeFeatureG = customizeFeatureG;
		}

		public String getCustomizeFeatureH() {
			return this.customizeFeatureH;
		}

		public void setCustomizeFeatureH(String customizeFeatureH) {
			this.customizeFeatureH = customizeFeatureH;
		}

		public String getCustomizeFeatureI() {
			return this.customizeFeatureI;
		}

		public void setCustomizeFeatureI(String customizeFeatureI) {
			this.customizeFeatureI = customizeFeatureI;
		}

		public String getCustomizeFeatureJ() {
			return this.customizeFeatureJ;
		}

		public void setCustomizeFeatureJ(String customizeFeatureJ) {
			this.customizeFeatureJ = customizeFeatureJ;
		}

		public String getOptionGroups() {
			return this.optionGroups;
		}

		public void setOptionGroups(String optionGroups) {
			this.optionGroups = optionGroups;
		}

		public String getModelNumber() {
			return this.modelNumber;
		}

		public void setModelNumber(String modelNumber) {
			this.modelNumber = modelNumber;
		}

		public String getSaleSpec() {
			return this.saleSpec;
		}

		public void setSaleSpec(String saleSpec) {
			this.saleSpec = saleSpec;
		}

		public String getCustomizeFeatureA() {
			return this.customizeFeatureA;
		}

		public void setCustomizeFeatureA(String customizeFeatureA) {
			this.customizeFeatureA = customizeFeatureA;
		}

		public String getCustomizeFeatureB() {
			return this.customizeFeatureB;
		}

		public void setCustomizeFeatureB(String customizeFeatureB) {
			this.customizeFeatureB = customizeFeatureB;
		}

		public Integer getSuggestPrice() {
			return this.suggestPrice;
		}

		public void setSuggestPrice(Integer suggestPrice) {
			this.suggestPrice = suggestPrice;
		}

		public String getForestFirstId() {
			return this.forestFirstId;
		}

		public void setForestFirstId(String forestFirstId) {
			this.forestFirstId = forestFirstId;
		}

		public String getCategoryName() {
			return this.categoryName;
		}

		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}

		public String getEnergyEfficiency() {
			return this.energyEfficiency;
		}

		public void setEnergyEfficiency(String energyEfficiency) {
			this.energyEfficiency = energyEfficiency;
		}

		public String getPromotionText() {
			return this.promotionText;
		}

		public void setPromotionText(String promotionText) {
			this.promotionText = promotionText;
		}

		public String getSkuId() {
			return this.skuId;
		}

		public void setSkuId(String skuId) {
			this.skuId = skuId;
		}
	}

	@Override
	public Class<BatchInsertItemsResponse> getResponseClass() {
		return BatchInsertItemsResponse.class;
	}

}
