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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudesl.transform.v20200201.DescribeItemsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeItemsResponse extends AcsResponse {

	private String templateSceneId;

	private String errorMessage;

	private Boolean success;

	private String message;

	private String dynamicMessage;

	private Integer totalCount;

	private String dynamicCode;

	private String requestId;

	private String errorCode;

	private String code;

	private Integer pageNumber;

	private Integer pageSize;

	private List<ItemInfo> items;

	public String getTemplateSceneId() {
		return this.templateSceneId;
	}

	public void setTemplateSceneId(String templateSceneId) {
		this.templateSceneId = templateSceneId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<ItemInfo> getItems() {
		return this.items;
	}

	public void setItems(List<ItemInfo> items) {
		this.items = items;
	}

	public static class ItemInfo {

		private Integer actionPrice;

		private String itemTitle;

		private String brandName;

		private String sourceCode;

		private String priceUnit;

		private String forestFirstId;

		private String customizeFeatureF;

		private String customizeFeatureA;

		private String customizeFeatureK;

		private String templateSceneId;

		private String customizeFeatureD;

		private Integer memberPrice;

		private String promotionStart;

		private String modelNumber;

		private String categoryName;

		private String customizeFeatureE;

		private Integer suggestPrice;

		private String saleSpec;

		private String promotionText;

		private String rank;

		private String promotionReason;

		private String customizeFeatureG;

		private Integer salesPrice;

		private String customizeFeatureH;

		private Integer originalPrice;

		private String gmtModified;

		private String customizeFeatureI;

		private String productionPlace;

		private String customizeFeatureB;

		private String itemShortTitle;

		private String customizeFeatureN;

		private Boolean beMember;

		private String taxFee;

		private String inventoryStatus;

		private String supplierName;

		private String itemPicUrl;

		private String energyEfficiency;

		private String customizeFeatureL;

		private String customizeFeatureC;

		private String itemId;

		private String manufacturer;

		private String material;

		private String customizeFeatureO;

		private String customizeFeatureP;

		private String customizeFeatureQ;

		private String customizeFeatureR;

		private String customizeFeatureS;

		private String customizeFeatureT;

		private String customizeFeatureU;

		private String customizeFeatureV;

		private String customizeFeatureW;

		private String customizeFeatureX;

		private String customizeFeatureY;

		private String customizeFeatureZ;

		private String customizeFeatureJ;

		private String gmtCreate;

		private String customizeFeatureM;

		private Boolean bePromotion;

		private String skuId;

		private Boolean beSourceCode;

		private String forestSecondId;

		private String itemQrCode;

		private Integer itemInfoIndex;

		private String promotionEnd;

		private String itemBarCode;

		public Integer getActionPrice() {
			return this.actionPrice;
		}

		public void setActionPrice(Integer actionPrice) {
			this.actionPrice = actionPrice;
		}

		public String getItemTitle() {
			return this.itemTitle;
		}

		public void setItemTitle(String itemTitle) {
			this.itemTitle = itemTitle;
		}

		public String getBrandName() {
			return this.brandName;
		}

		public void setBrandName(String brandName) {
			this.brandName = brandName;
		}

		public String getSourceCode() {
			return this.sourceCode;
		}

		public void setSourceCode(String sourceCode) {
			this.sourceCode = sourceCode;
		}

		public String getPriceUnit() {
			return this.priceUnit;
		}

		public void setPriceUnit(String priceUnit) {
			this.priceUnit = priceUnit;
		}

		public String getForestFirstId() {
			return this.forestFirstId;
		}

		public void setForestFirstId(String forestFirstId) {
			this.forestFirstId = forestFirstId;
		}

		public String getCustomizeFeatureF() {
			return this.customizeFeatureF;
		}

		public void setCustomizeFeatureF(String customizeFeatureF) {
			this.customizeFeatureF = customizeFeatureF;
		}

		public String getCustomizeFeatureA() {
			return this.customizeFeatureA;
		}

		public void setCustomizeFeatureA(String customizeFeatureA) {
			this.customizeFeatureA = customizeFeatureA;
		}

		public String getCustomizeFeatureK() {
			return this.customizeFeatureK;
		}

		public void setCustomizeFeatureK(String customizeFeatureK) {
			this.customizeFeatureK = customizeFeatureK;
		}

		public String getTemplateSceneId() {
			return this.templateSceneId;
		}

		public void setTemplateSceneId(String templateSceneId) {
			this.templateSceneId = templateSceneId;
		}

		public String getCustomizeFeatureD() {
			return this.customizeFeatureD;
		}

		public void setCustomizeFeatureD(String customizeFeatureD) {
			this.customizeFeatureD = customizeFeatureD;
		}

		public Integer getMemberPrice() {
			return this.memberPrice;
		}

		public void setMemberPrice(Integer memberPrice) {
			this.memberPrice = memberPrice;
		}

		public String getPromotionStart() {
			return this.promotionStart;
		}

		public void setPromotionStart(String promotionStart) {
			this.promotionStart = promotionStart;
		}

		public String getModelNumber() {
			return this.modelNumber;
		}

		public void setModelNumber(String modelNumber) {
			this.modelNumber = modelNumber;
		}

		public String getCategoryName() {
			return this.categoryName;
		}

		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}

		public String getCustomizeFeatureE() {
			return this.customizeFeatureE;
		}

		public void setCustomizeFeatureE(String customizeFeatureE) {
			this.customizeFeatureE = customizeFeatureE;
		}

		public Integer getSuggestPrice() {
			return this.suggestPrice;
		}

		public void setSuggestPrice(Integer suggestPrice) {
			this.suggestPrice = suggestPrice;
		}

		public String getSaleSpec() {
			return this.saleSpec;
		}

		public void setSaleSpec(String saleSpec) {
			this.saleSpec = saleSpec;
		}

		public String getPromotionText() {
			return this.promotionText;
		}

		public void setPromotionText(String promotionText) {
			this.promotionText = promotionText;
		}

		public String getRank() {
			return this.rank;
		}

		public void setRank(String rank) {
			this.rank = rank;
		}

		public String getPromotionReason() {
			return this.promotionReason;
		}

		public void setPromotionReason(String promotionReason) {
			this.promotionReason = promotionReason;
		}

		public String getCustomizeFeatureG() {
			return this.customizeFeatureG;
		}

		public void setCustomizeFeatureG(String customizeFeatureG) {
			this.customizeFeatureG = customizeFeatureG;
		}

		public Integer getSalesPrice() {
			return this.salesPrice;
		}

		public void setSalesPrice(Integer salesPrice) {
			this.salesPrice = salesPrice;
		}

		public String getCustomizeFeatureH() {
			return this.customizeFeatureH;
		}

		public void setCustomizeFeatureH(String customizeFeatureH) {
			this.customizeFeatureH = customizeFeatureH;
		}

		public Integer getOriginalPrice() {
			return this.originalPrice;
		}

		public void setOriginalPrice(Integer originalPrice) {
			this.originalPrice = originalPrice;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getCustomizeFeatureI() {
			return this.customizeFeatureI;
		}

		public void setCustomizeFeatureI(String customizeFeatureI) {
			this.customizeFeatureI = customizeFeatureI;
		}

		public String getProductionPlace() {
			return this.productionPlace;
		}

		public void setProductionPlace(String productionPlace) {
			this.productionPlace = productionPlace;
		}

		public String getCustomizeFeatureB() {
			return this.customizeFeatureB;
		}

		public void setCustomizeFeatureB(String customizeFeatureB) {
			this.customizeFeatureB = customizeFeatureB;
		}

		public String getItemShortTitle() {
			return this.itemShortTitle;
		}

		public void setItemShortTitle(String itemShortTitle) {
			this.itemShortTitle = itemShortTitle;
		}

		public String getCustomizeFeatureN() {
			return this.customizeFeatureN;
		}

		public void setCustomizeFeatureN(String customizeFeatureN) {
			this.customizeFeatureN = customizeFeatureN;
		}

		public Boolean getBeMember() {
			return this.beMember;
		}

		public void setBeMember(Boolean beMember) {
			this.beMember = beMember;
		}

		public String getTaxFee() {
			return this.taxFee;
		}

		public void setTaxFee(String taxFee) {
			this.taxFee = taxFee;
		}

		public String getInventoryStatus() {
			return this.inventoryStatus;
		}

		public void setInventoryStatus(String inventoryStatus) {
			this.inventoryStatus = inventoryStatus;
		}

		public String getSupplierName() {
			return this.supplierName;
		}

		public void setSupplierName(String supplierName) {
			this.supplierName = supplierName;
		}

		public String getItemPicUrl() {
			return this.itemPicUrl;
		}

		public void setItemPicUrl(String itemPicUrl) {
			this.itemPicUrl = itemPicUrl;
		}

		public String getEnergyEfficiency() {
			return this.energyEfficiency;
		}

		public void setEnergyEfficiency(String energyEfficiency) {
			this.energyEfficiency = energyEfficiency;
		}

		public String getCustomizeFeatureL() {
			return this.customizeFeatureL;
		}

		public void setCustomizeFeatureL(String customizeFeatureL) {
			this.customizeFeatureL = customizeFeatureL;
		}

		public String getCustomizeFeatureC() {
			return this.customizeFeatureC;
		}

		public void setCustomizeFeatureC(String customizeFeatureC) {
			this.customizeFeatureC = customizeFeatureC;
		}

		public String getItemId() {
			return this.itemId;
		}

		public void setItemId(String itemId) {
			this.itemId = itemId;
		}

		public String getManufacturer() {
			return this.manufacturer;
		}

		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}

		public String getMaterial() {
			return this.material;
		}

		public void setMaterial(String material) {
			this.material = material;
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

		public String getCustomizeFeatureJ() {
			return this.customizeFeatureJ;
		}

		public void setCustomizeFeatureJ(String customizeFeatureJ) {
			this.customizeFeatureJ = customizeFeatureJ;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getCustomizeFeatureM() {
			return this.customizeFeatureM;
		}

		public void setCustomizeFeatureM(String customizeFeatureM) {
			this.customizeFeatureM = customizeFeatureM;
		}

		public Boolean getBePromotion() {
			return this.bePromotion;
		}

		public void setBePromotion(Boolean bePromotion) {
			this.bePromotion = bePromotion;
		}

		public String getSkuId() {
			return this.skuId;
		}

		public void setSkuId(String skuId) {
			this.skuId = skuId;
		}

		public Boolean getBeSourceCode() {
			return this.beSourceCode;
		}

		public void setBeSourceCode(Boolean beSourceCode) {
			this.beSourceCode = beSourceCode;
		}

		public String getForestSecondId() {
			return this.forestSecondId;
		}

		public void setForestSecondId(String forestSecondId) {
			this.forestSecondId = forestSecondId;
		}

		public String getItemQrCode() {
			return this.itemQrCode;
		}

		public void setItemQrCode(String itemQrCode) {
			this.itemQrCode = itemQrCode;
		}

		public Integer getItemInfoIndex() {
			return this.itemInfoIndex;
		}

		public void setItemInfoIndex(Integer itemInfoIndex) {
			this.itemInfoIndex = itemInfoIndex;
		}

		public String getPromotionEnd() {
			return this.promotionEnd;
		}

		public void setPromotionEnd(String promotionEnd) {
			this.promotionEnd = promotionEnd;
		}

		public String getItemBarCode() {
			return this.itemBarCode;
		}

		public void setItemBarCode(String itemBarCode) {
			this.itemBarCode = itemBarCode;
		}
	}

	@Override
	public DescribeItemsResponse getInstance(UnmarshallerContext context) {
		return	DescribeItemsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
