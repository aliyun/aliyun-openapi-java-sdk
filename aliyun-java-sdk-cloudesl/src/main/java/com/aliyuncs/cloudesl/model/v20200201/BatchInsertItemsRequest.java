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

package com.aliyuncs.cloudesl.model.v20200201;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudesl.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BatchInsertItemsRequest extends RpcAcsRequest<BatchInsertItemsResponse> {
	   

	private String extraParams;

	private String storeId;

	private Boolean syncByItemId;

	private List<ItemInfo> itemInfos;
	public BatchInsertItemsRequest() {
		super("cloudesl", "2020-02-01", "BatchInsertItems");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExtraParams() {
		return this.extraParams;
	}

	public void setExtraParams(String extraParams) {
		this.extraParams = extraParams;
		if(extraParams != null){
			putBodyParameter("ExtraParams", extraParams);
		}
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

	public Boolean getSyncByItemId() {
		return this.syncByItemId;
	}

	public void setSyncByItemId(Boolean syncByItemId) {
		this.syncByItemId = syncByItemId;
		if(syncByItemId != null){
			putBodyParameter("SyncByItemId", syncByItemId.toString());
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
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".BeSourceCode" , itemInfos.get(depth1).getBeSourceCode());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".BrandName" , itemInfos.get(depth1).getBrandName());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".PromotionStart" , itemInfos.get(depth1).getPromotionStart());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".PriceUnit" , itemInfos.get(depth1).getPriceUnit());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".Rank" , itemInfos.get(depth1).getRank());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".ItemInfoIndex" , itemInfos.get(depth1).getItemInfoIndex());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".ItemBarCode" , itemInfos.get(depth1).getItemBarCode());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CustomizeFeatureK" , itemInfos.get(depth1).getCustomizeFeatureK());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CustomizeFeatureL" , itemInfos.get(depth1).getCustomizeFeatureL());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CustomizeFeatureM" , itemInfos.get(depth1).getCustomizeFeatureM());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CustomizeFeatureN" , itemInfos.get(depth1).getCustomizeFeatureN());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".BePromotion" , itemInfos.get(depth1).getBePromotion());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CustomizeFeatureO" , itemInfos.get(depth1).getCustomizeFeatureO());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CustomizeFeatureP" , itemInfos.get(depth1).getCustomizeFeatureP());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".PromotionEnd" , itemInfos.get(depth1).getPromotionEnd());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".ItemTitle" , itemInfos.get(depth1).getItemTitle());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CustomizeFeatureQ" , itemInfos.get(depth1).getCustomizeFeatureQ());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CustomizeFeatureR" , itemInfos.get(depth1).getCustomizeFeatureR());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CustomizeFeatureC" , itemInfos.get(depth1).getCustomizeFeatureC());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CustomizeFeatureD" , itemInfos.get(depth1).getCustomizeFeatureD());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".ItemQrCode" , itemInfos.get(depth1).getItemQrCode());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CustomizeFeatureE" , itemInfos.get(depth1).getCustomizeFeatureE());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".PromotionReason" , itemInfos.get(depth1).getPromotionReason());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".InventoryStatus" , itemInfos.get(depth1).getInventoryStatus());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CustomizeFeatureF" , itemInfos.get(depth1).getCustomizeFeatureF());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CustomizeFeatureG" , itemInfos.get(depth1).getCustomizeFeatureG());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CustomizeFeatureH" , itemInfos.get(depth1).getCustomizeFeatureH());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CustomizeFeatureI" , itemInfos.get(depth1).getCustomizeFeatureI());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CustomizeFeatureJ" , itemInfos.get(depth1).getCustomizeFeatureJ());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CustomizeFeatureA" , itemInfos.get(depth1).getCustomizeFeatureA());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CustomizeFeatureB" , itemInfos.get(depth1).getCustomizeFeatureB());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".SuggestPrice" , itemInfos.get(depth1).getSuggestPrice());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".ForestFirstId" , itemInfos.get(depth1).getForestFirstId());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".ProductionPlace" , itemInfos.get(depth1).getProductionPlace());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".SourceCode" , itemInfos.get(depth1).getSourceCode());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".Manufacturer" , itemInfos.get(depth1).getManufacturer());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".ItemId" , itemInfos.get(depth1).getItemId());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".BeMember" , itemInfos.get(depth1).getBeMember());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CustomizeFeatureS" , itemInfos.get(depth1).getCustomizeFeatureS());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CustomizeFeatureT" , itemInfos.get(depth1).getCustomizeFeatureT());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CustomizeFeatureU" , itemInfos.get(depth1).getCustomizeFeatureU());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".TemplateSceneId" , itemInfos.get(depth1).getTemplateSceneId());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CustomizeFeatureV" , itemInfos.get(depth1).getCustomizeFeatureV());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CustomizeFeatureW" , itemInfos.get(depth1).getCustomizeFeatureW());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CustomizeFeatureX" , itemInfos.get(depth1).getCustomizeFeatureX());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CustomizeFeatureY" , itemInfos.get(depth1).getCustomizeFeatureY());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CustomizeFeatureZ" , itemInfos.get(depth1).getCustomizeFeatureZ());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".SalesPrice" , itemInfos.get(depth1).getSalesPrice());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".OriginalPrice" , itemInfos.get(depth1).getOriginalPrice());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".ItemShortTitle" , itemInfos.get(depth1).getItemShortTitle());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".ItemPicUrl" , itemInfos.get(depth1).getItemPicUrl());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".ForestSecondId" , itemInfos.get(depth1).getForestSecondId());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".SupplierName" , itemInfos.get(depth1).getSupplierName());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".BeClearance" , itemInfos.get(depth1).getBeClearance());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".Material" , itemInfos.get(depth1).getMaterial());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".ModelNumber" , itemInfos.get(depth1).getModelNumber());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".SaleSpec" , itemInfos.get(depth1).getSaleSpec());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".CategoryName" , itemInfos.get(depth1).getCategoryName());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".TaxFee" , itemInfos.get(depth1).getTaxFee());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".EnergyEfficiency" , itemInfos.get(depth1).getEnergyEfficiency());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".PromotionText" , itemInfos.get(depth1).getPromotionText());
				putBodyParameter("ItemInfo." + (depth1 + 1) + ".SkuId" , itemInfos.get(depth1).getSkuId());
			}
		}	
	}

	public static class ItemInfo {

		private Integer memberPrice;

		private Integer actionPrice;

		private Boolean beSourceCode;

		private String brandName;

		private String promotionStart;

		private String priceUnit;

		private String rank;

		private Integer itemInfoIndex;

		private String itemBarCode;

		private String customizeFeatureK;

		private String customizeFeatureL;

		private String customizeFeatureM;

		private String customizeFeatureN;

		private Boolean bePromotion;

		private String customizeFeatureO;

		private String customizeFeatureP;

		private String promotionEnd;

		private String itemTitle;

		private String customizeFeatureQ;

		private String customizeFeatureR;

		private String customizeFeatureC;

		private String customizeFeatureD;

		private String itemQrCode;

		private String customizeFeatureE;

		private String promotionReason;

		private String inventoryStatus;

		private String customizeFeatureF;

		private String customizeFeatureG;

		private String customizeFeatureH;

		private String customizeFeatureI;

		private String customizeFeatureJ;

		private String customizeFeatureA;

		private String customizeFeatureB;

		private Integer suggestPrice;

		private String forestFirstId;

		private String productionPlace;

		private String sourceCode;

		private String manufacturer;

		private String itemId;

		private Boolean beMember;

		private String customizeFeatureS;

		private String customizeFeatureT;

		private String customizeFeatureU;

		private String templateSceneId;

		private String customizeFeatureV;

		private String customizeFeatureW;

		private String customizeFeatureX;

		private String customizeFeatureY;

		private String customizeFeatureZ;

		private Integer salesPrice;

		private Integer originalPrice;

		private String itemShortTitle;

		private String itemPicUrl;

		private String forestSecondId;

		private String supplierName;

		private Boolean beClearance;

		private String material;

		private String modelNumber;

		private String saleSpec;

		private String categoryName;

		private String taxFee;

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

		public Boolean getBeSourceCode() {
			return this.beSourceCode;
		}

		public void setBeSourceCode(Boolean beSourceCode) {
			this.beSourceCode = beSourceCode;
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

		public String getCustomizeFeatureK() {
			return this.customizeFeatureK;
		}

		public void setCustomizeFeatureK(String customizeFeatureK) {
			this.customizeFeatureK = customizeFeatureK;
		}

		public String getCustomizeFeatureL() {
			return this.customizeFeatureL;
		}

		public void setCustomizeFeatureL(String customizeFeatureL) {
			this.customizeFeatureL = customizeFeatureL;
		}

		public String getCustomizeFeatureM() {
			return this.customizeFeatureM;
		}

		public void setCustomizeFeatureM(String customizeFeatureM) {
			this.customizeFeatureM = customizeFeatureM;
		}

		public String getCustomizeFeatureN() {
			return this.customizeFeatureN;
		}

		public void setCustomizeFeatureN(String customizeFeatureN) {
			this.customizeFeatureN = customizeFeatureN;
		}

		public Boolean getBePromotion() {
			return this.bePromotion;
		}

		public void setBePromotion(Boolean bePromotion) {
			this.bePromotion = bePromotion;
		}

		public String getCustomizeFeatureO() {
			return this.customizeFeatureO;
		}

		public void setCustomizeFeatureO(String customizeFeatureO) {
			this.customizeFeatureO = customizeFeatureO;
		}

		public String getCustomizeFeatureP() {
			return this.customizeFeatureP;
		}

		public void setCustomizeFeatureP(String customizeFeatureP) {
			this.customizeFeatureP = customizeFeatureP;
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

		public String getCustomizeFeatureQ() {
			return this.customizeFeatureQ;
		}

		public void setCustomizeFeatureQ(String customizeFeatureQ) {
			this.customizeFeatureQ = customizeFeatureQ;
		}

		public String getCustomizeFeatureR() {
			return this.customizeFeatureR;
		}

		public void setCustomizeFeatureR(String customizeFeatureR) {
			this.customizeFeatureR = customizeFeatureR;
		}

		public String getCustomizeFeatureC() {
			return this.customizeFeatureC;
		}

		public void setCustomizeFeatureC(String customizeFeatureC) {
			this.customizeFeatureC = customizeFeatureC;
		}

		public String getCustomizeFeatureD() {
			return this.customizeFeatureD;
		}

		public void setCustomizeFeatureD(String customizeFeatureD) {
			this.customizeFeatureD = customizeFeatureD;
		}

		public String getItemQrCode() {
			return this.itemQrCode;
		}

		public void setItemQrCode(String itemQrCode) {
			this.itemQrCode = itemQrCode;
		}

		public String getCustomizeFeatureE() {
			return this.customizeFeatureE;
		}

		public void setCustomizeFeatureE(String customizeFeatureE) {
			this.customizeFeatureE = customizeFeatureE;
		}

		public String getPromotionReason() {
			return this.promotionReason;
		}

		public void setPromotionReason(String promotionReason) {
			this.promotionReason = promotionReason;
		}

		public String getInventoryStatus() {
			return this.inventoryStatus;
		}

		public void setInventoryStatus(String inventoryStatus) {
			this.inventoryStatus = inventoryStatus;
		}

		public String getCustomizeFeatureF() {
			return this.customizeFeatureF;
		}

		public void setCustomizeFeatureF(String customizeFeatureF) {
			this.customizeFeatureF = customizeFeatureF;
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

		public String getProductionPlace() {
			return this.productionPlace;
		}

		public void setProductionPlace(String productionPlace) {
			this.productionPlace = productionPlace;
		}

		public String getSourceCode() {
			return this.sourceCode;
		}

		public void setSourceCode(String sourceCode) {
			this.sourceCode = sourceCode;
		}

		public String getManufacturer() {
			return this.manufacturer;
		}

		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}

		public String getItemId() {
			return this.itemId;
		}

		public void setItemId(String itemId) {
			this.itemId = itemId;
		}

		public Boolean getBeMember() {
			return this.beMember;
		}

		public void setBeMember(Boolean beMember) {
			this.beMember = beMember;
		}

		public String getCustomizeFeatureS() {
			return this.customizeFeatureS;
		}

		public void setCustomizeFeatureS(String customizeFeatureS) {
			this.customizeFeatureS = customizeFeatureS;
		}

		public String getCustomizeFeatureT() {
			return this.customizeFeatureT;
		}

		public void setCustomizeFeatureT(String customizeFeatureT) {
			this.customizeFeatureT = customizeFeatureT;
		}

		public String getCustomizeFeatureU() {
			return this.customizeFeatureU;
		}

		public void setCustomizeFeatureU(String customizeFeatureU) {
			this.customizeFeatureU = customizeFeatureU;
		}

		public String getTemplateSceneId() {
			return this.templateSceneId;
		}

		public void setTemplateSceneId(String templateSceneId) {
			this.templateSceneId = templateSceneId;
		}

		public String getCustomizeFeatureV() {
			return this.customizeFeatureV;
		}

		public void setCustomizeFeatureV(String customizeFeatureV) {
			this.customizeFeatureV = customizeFeatureV;
		}

		public String getCustomizeFeatureW() {
			return this.customizeFeatureW;
		}

		public void setCustomizeFeatureW(String customizeFeatureW) {
			this.customizeFeatureW = customizeFeatureW;
		}

		public String getCustomizeFeatureX() {
			return this.customizeFeatureX;
		}

		public void setCustomizeFeatureX(String customizeFeatureX) {
			this.customizeFeatureX = customizeFeatureX;
		}

		public String getCustomizeFeatureY() {
			return this.customizeFeatureY;
		}

		public void setCustomizeFeatureY(String customizeFeatureY) {
			this.customizeFeatureY = customizeFeatureY;
		}

		public String getCustomizeFeatureZ() {
			return this.customizeFeatureZ;
		}

		public void setCustomizeFeatureZ(String customizeFeatureZ) {
			this.customizeFeatureZ = customizeFeatureZ;
		}

		public Integer getSalesPrice() {
			return this.salesPrice;
		}

		public void setSalesPrice(Integer salesPrice) {
			this.salesPrice = salesPrice;
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

		public String getItemPicUrl() {
			return this.itemPicUrl;
		}

		public void setItemPicUrl(String itemPicUrl) {
			this.itemPicUrl = itemPicUrl;
		}

		public String getForestSecondId() {
			return this.forestSecondId;
		}

		public void setForestSecondId(String forestSecondId) {
			this.forestSecondId = forestSecondId;
		}

		public String getSupplierName() {
			return this.supplierName;
		}

		public void setSupplierName(String supplierName) {
			this.supplierName = supplierName;
		}

		public Boolean getBeClearance() {
			return this.beClearance;
		}

		public void setBeClearance(Boolean beClearance) {
			this.beClearance = beClearance;
		}

		public String getMaterial() {
			return this.material;
		}

		public void setMaterial(String material) {
			this.material = material;
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

		public String getCategoryName() {
			return this.categoryName;
		}

		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}

		public String getTaxFee() {
			return this.taxFee;
		}

		public void setTaxFee(String taxFee) {
			this.taxFee = taxFee;
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
