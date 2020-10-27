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

package com.aliyuncs.cloudesl.model.v20180801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudesl.transform.v20180801.DescribeItemsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeItemsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String message;

	private String errorCode;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<ItemInfo> items;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
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

		private String companyId;

		private String storeId;

		private String priceUnit;

		private Integer actionPrice;

		private String itemBarCode;

		private String itemTitle;

		private Long itemId;

		private String modelNumber;

		private String brandName;

		private String saleSpec;

		private String categoryName;

		private String rank;

		private String energyEfficiency;

		private String skuId;

		private String promotionStart;

		private String promotionEnd;

		private String promotionText;

		private String promotionReason;

		private Boolean bePromotion;

		private String itemQrCode;

		private Integer originalPrice;

		private Integer memberPrice;

		private Integer suggestPrice;

		private String itemShortTitle;

		private String optionGroups;

		private String productionPlace;

		private String positionCode;

		private String extraAttribute;

		private Boolean beSourceCode;

		private String sourceCode;

		private String forestFirstId;

		private String forestSecondId;

		private String customizeFeatureA;

		private String customizeFeatureB;

		private String customizeFeatureC;

		private String customizeFeatureD;

		private String customizeFeatureE;

		private String customizeFeatureF;

		private String customizeFeatureG;

		private String customizeFeatureH;

		private String customizeFeatureI;

		private String customizeFeatureJ;

		public String getCompanyId() {
			return this.companyId;
		}

		public void setCompanyId(String companyId) {
			this.companyId = companyId;
		}

		public String getStoreId() {
			return this.storeId;
		}

		public void setStoreId(String storeId) {
			this.storeId = storeId;
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

		public String getItemBarCode() {
			return this.itemBarCode;
		}

		public void setItemBarCode(String itemBarCode) {
			this.itemBarCode = itemBarCode;
		}

		public String getItemTitle() {
			return this.itemTitle;
		}

		public void setItemTitle(String itemTitle) {
			this.itemTitle = itemTitle;
		}

		public Long getItemId() {
			return this.itemId;
		}

		public void setItemId(Long itemId) {
			this.itemId = itemId;
		}

		public String getModelNumber() {
			return this.modelNumber;
		}

		public void setModelNumber(String modelNumber) {
			this.modelNumber = modelNumber;
		}

		public String getBrandName() {
			return this.brandName;
		}

		public void setBrandName(String brandName) {
			this.brandName = brandName;
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

		public String getRank() {
			return this.rank;
		}

		public void setRank(String rank) {
			this.rank = rank;
		}

		public String getEnergyEfficiency() {
			return this.energyEfficiency;
		}

		public void setEnergyEfficiency(String energyEfficiency) {
			this.energyEfficiency = energyEfficiency;
		}

		public String getSkuId() {
			return this.skuId;
		}

		public void setSkuId(String skuId) {
			this.skuId = skuId;
		}

		public String getPromotionStart() {
			return this.promotionStart;
		}

		public void setPromotionStart(String promotionStart) {
			this.promotionStart = promotionStart;
		}

		public String getPromotionEnd() {
			return this.promotionEnd;
		}

		public void setPromotionEnd(String promotionEnd) {
			this.promotionEnd = promotionEnd;
		}

		public String getPromotionText() {
			return this.promotionText;
		}

		public void setPromotionText(String promotionText) {
			this.promotionText = promotionText;
		}

		public String getPromotionReason() {
			return this.promotionReason;
		}

		public void setPromotionReason(String promotionReason) {
			this.promotionReason = promotionReason;
		}

		public Boolean getBePromotion() {
			return this.bePromotion;
		}

		public void setBePromotion(Boolean bePromotion) {
			this.bePromotion = bePromotion;
		}

		public String getItemQrCode() {
			return this.itemQrCode;
		}

		public void setItemQrCode(String itemQrCode) {
			this.itemQrCode = itemQrCode;
		}

		public Integer getOriginalPrice() {
			return this.originalPrice;
		}

		public void setOriginalPrice(Integer originalPrice) {
			this.originalPrice = originalPrice;
		}

		public Integer getMemberPrice() {
			return this.memberPrice;
		}

		public void setMemberPrice(Integer memberPrice) {
			this.memberPrice = memberPrice;
		}

		public Integer getSuggestPrice() {
			return this.suggestPrice;
		}

		public void setSuggestPrice(Integer suggestPrice) {
			this.suggestPrice = suggestPrice;
		}

		public String getItemShortTitle() {
			return this.itemShortTitle;
		}

		public void setItemShortTitle(String itemShortTitle) {
			this.itemShortTitle = itemShortTitle;
		}

		public String getOptionGroups() {
			return this.optionGroups;
		}

		public void setOptionGroups(String optionGroups) {
			this.optionGroups = optionGroups;
		}

		public String getProductionPlace() {
			return this.productionPlace;
		}

		public void setProductionPlace(String productionPlace) {
			this.productionPlace = productionPlace;
		}

		public String getPositionCode() {
			return this.positionCode;
		}

		public void setPositionCode(String positionCode) {
			this.positionCode = positionCode;
		}

		public String getExtraAttribute() {
			return this.extraAttribute;
		}

		public void setExtraAttribute(String extraAttribute) {
			this.extraAttribute = extraAttribute;
		}

		public Boolean getBeSourceCode() {
			return this.beSourceCode;
		}

		public void setBeSourceCode(Boolean beSourceCode) {
			this.beSourceCode = beSourceCode;
		}

		public String getSourceCode() {
			return this.sourceCode;
		}

		public void setSourceCode(String sourceCode) {
			this.sourceCode = sourceCode;
		}

		public String getForestFirstId() {
			return this.forestFirstId;
		}

		public void setForestFirstId(String forestFirstId) {
			this.forestFirstId = forestFirstId;
		}

		public String getForestSecondId() {
			return this.forestSecondId;
		}

		public void setForestSecondId(String forestSecondId) {
			this.forestSecondId = forestSecondId;
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
	}

	@Override
	public DescribeItemsResponse getInstance(UnmarshallerContext context) {
		return	DescribeItemsResponseUnmarshaller.unmarshall(this, context);
	}
}
