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

	private String errorMessage;

	private String errorCode;

	private Integer pageNumber;

	private String message;

	private Integer pageSize;

	private String dynamicCode;

	private String code;

	private String dynamicMessage;

	private Integer totalCount;

	private String requestId;

	private Boolean success;

	private List<ItemInfo> items;

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<ItemInfo> getItems() {
		return this.items;
	}

	public void setItems(List<ItemInfo> items) {
		this.items = items;
	}

	public static class ItemInfo {

		private String categoryName;

		private String energyEfficiency;

		private String customizeFeatureO;

		private String manufacturer;

		private String customizeFeatureM;

		private String customizeFeatureN;

		private String customizeFeatureK;

		private String customizeFeatureL;

		private String promotionEnd;

		private Integer originalPrice;

		private String customizeFeatureI;

		private String itemTitle;

		private String customizeFeatureJ;

		private String customizeFeatureG;

		private String saleSpec;

		private String customizeFeatureH;

		private String customizeFeatureE;

		private String customizeFeatureF;

		private String customizeFeatureC;

		private String customizeFeatureD;

		private String customizeFeatureA;

		private String customizeFeatureB;

		private String taxFee;

		private String promotionText;

		private Integer memberPrice;

		private String supplierName;

		private String forestFirstId;

		private String modelNumber;

		private String itemShortTitle;

		private String material;

		private Boolean bePromotion;

		private String forestSecondId;

		private Boolean beSourceCode;

		private Integer salesPrice;

		private String itemPicUrl;

		private String skuId;

		private Integer suggestPrice;

		private String rank;

		private String sourceCode;

		private String productionPlace;

		private Integer itemInfoIndex;

		private String inventoryStatus;

		private String priceUnit;

		private Integer actionPrice;

		private String brandName;

		private String itemQrCode;

		private String promotionReason;

		private String itemBarCode;

		private String itemId;

		private String promotionStart;

		private String gmtCreate;

		private String gmtModified;

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

		public String getCustomizeFeatureO() {
			return this.customizeFeatureO;
		}

		public void setCustomizeFeatureO(String customizeFeatureO) {
			this.customizeFeatureO = customizeFeatureO;
		}

		public String getManufacturer() {
			return this.manufacturer;
		}

		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
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

		public String getPromotionEnd() {
			return this.promotionEnd;
		}

		public void setPromotionEnd(String promotionEnd) {
			this.promotionEnd = promotionEnd;
		}

		public Integer getOriginalPrice() {
			return this.originalPrice;
		}

		public void setOriginalPrice(Integer originalPrice) {
			this.originalPrice = originalPrice;
		}

		public String getCustomizeFeatureI() {
			return this.customizeFeatureI;
		}

		public void setCustomizeFeatureI(String customizeFeatureI) {
			this.customizeFeatureI = customizeFeatureI;
		}

		public String getItemTitle() {
			return this.itemTitle;
		}

		public void setItemTitle(String itemTitle) {
			this.itemTitle = itemTitle;
		}

		public String getCustomizeFeatureJ() {
			return this.customizeFeatureJ;
		}

		public void setCustomizeFeatureJ(String customizeFeatureJ) {
			this.customizeFeatureJ = customizeFeatureJ;
		}

		public String getCustomizeFeatureG() {
			return this.customizeFeatureG;
		}

		public void setCustomizeFeatureG(String customizeFeatureG) {
			this.customizeFeatureG = customizeFeatureG;
		}

		public String getSaleSpec() {
			return this.saleSpec;
		}

		public void setSaleSpec(String saleSpec) {
			this.saleSpec = saleSpec;
		}

		public String getCustomizeFeatureH() {
			return this.customizeFeatureH;
		}

		public void setCustomizeFeatureH(String customizeFeatureH) {
			this.customizeFeatureH = customizeFeatureH;
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

		public String getTaxFee() {
			return this.taxFee;
		}

		public void setTaxFee(String taxFee) {
			this.taxFee = taxFee;
		}

		public String getPromotionText() {
			return this.promotionText;
		}

		public void setPromotionText(String promotionText) {
			this.promotionText = promotionText;
		}

		public Integer getMemberPrice() {
			return this.memberPrice;
		}

		public void setMemberPrice(Integer memberPrice) {
			this.memberPrice = memberPrice;
		}

		public String getSupplierName() {
			return this.supplierName;
		}

		public void setSupplierName(String supplierName) {
			this.supplierName = supplierName;
		}

		public String getForestFirstId() {
			return this.forestFirstId;
		}

		public void setForestFirstId(String forestFirstId) {
			this.forestFirstId = forestFirstId;
		}

		public String getModelNumber() {
			return this.modelNumber;
		}

		public void setModelNumber(String modelNumber) {
			this.modelNumber = modelNumber;
		}

		public String getItemShortTitle() {
			return this.itemShortTitle;
		}

		public void setItemShortTitle(String itemShortTitle) {
			this.itemShortTitle = itemShortTitle;
		}

		public String getMaterial() {
			return this.material;
		}

		public void setMaterial(String material) {
			this.material = material;
		}

		public Boolean getBePromotion() {
			return this.bePromotion;
		}

		public void setBePromotion(Boolean bePromotion) {
			this.bePromotion = bePromotion;
		}

		public String getForestSecondId() {
			return this.forestSecondId;
		}

		public void setForestSecondId(String forestSecondId) {
			this.forestSecondId = forestSecondId;
		}

		public Boolean getBeSourceCode() {
			return this.beSourceCode;
		}

		public void setBeSourceCode(Boolean beSourceCode) {
			this.beSourceCode = beSourceCode;
		}

		public Integer getSalesPrice() {
			return this.salesPrice;
		}

		public void setSalesPrice(Integer salesPrice) {
			this.salesPrice = salesPrice;
		}

		public String getItemPicUrl() {
			return this.itemPicUrl;
		}

		public void setItemPicUrl(String itemPicUrl) {
			this.itemPicUrl = itemPicUrl;
		}

		public String getSkuId() {
			return this.skuId;
		}

		public void setSkuId(String skuId) {
			this.skuId = skuId;
		}

		public Integer getSuggestPrice() {
			return this.suggestPrice;
		}

		public void setSuggestPrice(Integer suggestPrice) {
			this.suggestPrice = suggestPrice;
		}

		public String getRank() {
			return this.rank;
		}

		public void setRank(String rank) {
			this.rank = rank;
		}

		public String getSourceCode() {
			return this.sourceCode;
		}

		public void setSourceCode(String sourceCode) {
			this.sourceCode = sourceCode;
		}

		public String getProductionPlace() {
			return this.productionPlace;
		}

		public void setProductionPlace(String productionPlace) {
			this.productionPlace = productionPlace;
		}

		public Integer getItemInfoIndex() {
			return this.itemInfoIndex;
		}

		public void setItemInfoIndex(Integer itemInfoIndex) {
			this.itemInfoIndex = itemInfoIndex;
		}

		public String getInventoryStatus() {
			return this.inventoryStatus;
		}

		public void setInventoryStatus(String inventoryStatus) {
			this.inventoryStatus = inventoryStatus;
		}

		public String getPriceUnit() {
			return this.priceUnit;
		}

		public void setPriceUnit(String priceUnit) {
			this.priceUnit = priceUnit;
		}

		public Integer getActionPrice() {
			return this.actionPrice;
		}

		public void setActionPrice(Integer actionPrice) {
			this.actionPrice = actionPrice;
		}

		public String getBrandName() {
			return this.brandName;
		}

		public void setBrandName(String brandName) {
			this.brandName = brandName;
		}

		public String getItemQrCode() {
			return this.itemQrCode;
		}

		public void setItemQrCode(String itemQrCode) {
			this.itemQrCode = itemQrCode;
		}

		public String getPromotionReason() {
			return this.promotionReason;
		}

		public void setPromotionReason(String promotionReason) {
			this.promotionReason = promotionReason;
		}

		public String getItemBarCode() {
			return this.itemBarCode;
		}

		public void setItemBarCode(String itemBarCode) {
			this.itemBarCode = itemBarCode;
		}

		public String getItemId() {
			return this.itemId;
		}

		public void setItemId(String itemId) {
			this.itemId = itemId;
		}

		public String getPromotionStart() {
			return this.promotionStart;
		}

		public void setPromotionStart(String promotionStart) {
			this.promotionStart = promotionStart;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
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
