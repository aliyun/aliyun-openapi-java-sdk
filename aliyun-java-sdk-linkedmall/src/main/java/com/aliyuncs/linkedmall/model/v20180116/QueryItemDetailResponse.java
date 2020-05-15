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

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkedmall.transform.v20180116.QueryItemDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryItemDetailResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private String subCode;

	private String subMessage;

	private Boolean success;

	private Item item;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSubCode() {
		return this.subCode;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}

	public String getSubMessage() {
		return this.subMessage;
	}

	public void setSubMessage(String subMessage) {
		this.subMessage = subMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public static class Item {

		private Long itemId;

		private String itemTitle;

		private String mainPicUrl;

		private String descPath;

		private Long minPrice;

		private Long minPoints;

		private Long reservePrice;

		private Integer quantity;

		private Boolean isSellerPayPostfee;

		private Boolean isCanSell;

		private Integer totalSoldQuantity;

		private String properties;

		private Boolean canSell;

		private Boolean sellerPayPostfee;

		private Long categoryId;

		private String extJson;

		private String propertiesJson;

		private String iforestPropsJson;

		private String descOption;

		private String iforestProps;

		private Long sellerId;

		private String tbShopName;

		private String lmItemCategory;

		private Boolean centerInventory;

		private Map<Object,Object> customizedAttributeMap;

		private String lmItemId;

		private List<Sku> skus;

		private List<String> itemImages;

		public Long getItemId() {
			return this.itemId;
		}

		public void setItemId(Long itemId) {
			this.itemId = itemId;
		}

		public String getItemTitle() {
			return this.itemTitle;
		}

		public void setItemTitle(String itemTitle) {
			this.itemTitle = itemTitle;
		}

		public String getMainPicUrl() {
			return this.mainPicUrl;
		}

		public void setMainPicUrl(String mainPicUrl) {
			this.mainPicUrl = mainPicUrl;
		}

		public String getDescPath() {
			return this.descPath;
		}

		public void setDescPath(String descPath) {
			this.descPath = descPath;
		}

		public Long getMinPrice() {
			return this.minPrice;
		}

		public void setMinPrice(Long minPrice) {
			this.minPrice = minPrice;
		}

		public Long getMinPoints() {
			return this.minPoints;
		}

		public void setMinPoints(Long minPoints) {
			this.minPoints = minPoints;
		}

		public Long getReservePrice() {
			return this.reservePrice;
		}

		public void setReservePrice(Long reservePrice) {
			this.reservePrice = reservePrice;
		}

		public Integer getQuantity() {
			return this.quantity;
		}

		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}

		public Boolean getIsSellerPayPostfee() {
			return this.isSellerPayPostfee;
		}

		public void setIsSellerPayPostfee(Boolean isSellerPayPostfee) {
			this.isSellerPayPostfee = isSellerPayPostfee;
		}

		public Boolean getIsCanSell() {
			return this.isCanSell;
		}

		public void setIsCanSell(Boolean isCanSell) {
			this.isCanSell = isCanSell;
		}

		public Integer getTotalSoldQuantity() {
			return this.totalSoldQuantity;
		}

		public void setTotalSoldQuantity(Integer totalSoldQuantity) {
			this.totalSoldQuantity = totalSoldQuantity;
		}

		public String getProperties() {
			return this.properties;
		}

		public void setProperties(String properties) {
			this.properties = properties;
		}

		public Boolean getCanSell() {
			return this.canSell;
		}

		public void setCanSell(Boolean canSell) {
			this.canSell = canSell;
		}

		public Boolean getSellerPayPostfee() {
			return this.sellerPayPostfee;
		}

		public void setSellerPayPostfee(Boolean sellerPayPostfee) {
			this.sellerPayPostfee = sellerPayPostfee;
		}

		public Long getCategoryId() {
			return this.categoryId;
		}

		public void setCategoryId(Long categoryId) {
			this.categoryId = categoryId;
		}

		public String getExtJson() {
			return this.extJson;
		}

		public void setExtJson(String extJson) {
			this.extJson = extJson;
		}

		public String getPropertiesJson() {
			return this.propertiesJson;
		}

		public void setPropertiesJson(String propertiesJson) {
			this.propertiesJson = propertiesJson;
		}

		public String getIforestPropsJson() {
			return this.iforestPropsJson;
		}

		public void setIforestPropsJson(String iforestPropsJson) {
			this.iforestPropsJson = iforestPropsJson;
		}

		public String getDescOption() {
			return this.descOption;
		}

		public void setDescOption(String descOption) {
			this.descOption = descOption;
		}

		public String getIforestProps() {
			return this.iforestProps;
		}

		public void setIforestProps(String iforestProps) {
			this.iforestProps = iforestProps;
		}

		public Long getSellerId() {
			return this.sellerId;
		}

		public void setSellerId(Long sellerId) {
			this.sellerId = sellerId;
		}

		public String getTbShopName() {
			return this.tbShopName;
		}

		public void setTbShopName(String tbShopName) {
			this.tbShopName = tbShopName;
		}

		public String getLmItemCategory() {
			return this.lmItemCategory;
		}

		public void setLmItemCategory(String lmItemCategory) {
			this.lmItemCategory = lmItemCategory;
		}

		public Boolean getCenterInventory() {
			return this.centerInventory;
		}

		public void setCenterInventory(Boolean centerInventory) {
			this.centerInventory = centerInventory;
		}

		public Map<Object,Object> getCustomizedAttributeMap() {
			return this.customizedAttributeMap;
		}

		public void setCustomizedAttributeMap(Map<Object,Object> customizedAttributeMap) {
			this.customizedAttributeMap = customizedAttributeMap;
		}

		public String getLmItemId() {
			return this.lmItemId;
		}

		public void setLmItemId(String lmItemId) {
			this.lmItemId = lmItemId;
		}

		public List<Sku> getSkus() {
			return this.skus;
		}

		public void setSkus(List<Sku> skus) {
			this.skus = skus;
		}

		public List<String> getItemImages() {
			return this.itemImages;
		}

		public void setItemImages(List<String> itemImages) {
			this.itemImages = itemImages;
		}

		public static class Sku {

			private String extJson;

			private Long itemId;

			private Long skuId;

			private String skuProperties;

			private String skuPicUrl;

			private String skuTitle;

			private Integer quantity;

			private Long priceCent;

			private Long points;

			private Long pointsAmount;

			private Long pointPrice;

			private String skuPropertiesJson;

			private Long reservePrice;

			private Boolean canSell;

			private Map<Object,Object> customizedAttributeMap;

			private String lmItemId;

			public String getExtJson() {
				return this.extJson;
			}

			public void setExtJson(String extJson) {
				this.extJson = extJson;
			}

			public Long getItemId() {
				return this.itemId;
			}

			public void setItemId(Long itemId) {
				this.itemId = itemId;
			}

			public Long getSkuId() {
				return this.skuId;
			}

			public void setSkuId(Long skuId) {
				this.skuId = skuId;
			}

			public String getSkuProperties() {
				return this.skuProperties;
			}

			public void setSkuProperties(String skuProperties) {
				this.skuProperties = skuProperties;
			}

			public String getSkuPicUrl() {
				return this.skuPicUrl;
			}

			public void setSkuPicUrl(String skuPicUrl) {
				this.skuPicUrl = skuPicUrl;
			}

			public String getSkuTitle() {
				return this.skuTitle;
			}

			public void setSkuTitle(String skuTitle) {
				this.skuTitle = skuTitle;
			}

			public Integer getQuantity() {
				return this.quantity;
			}

			public void setQuantity(Integer quantity) {
				this.quantity = quantity;
			}

			public Long getPriceCent() {
				return this.priceCent;
			}

			public void setPriceCent(Long priceCent) {
				this.priceCent = priceCent;
			}

			public Long getPoints() {
				return this.points;
			}

			public void setPoints(Long points) {
				this.points = points;
			}

			public Long getPointsAmount() {
				return this.pointsAmount;
			}

			public void setPointsAmount(Long pointsAmount) {
				this.pointsAmount = pointsAmount;
			}

			public Long getPointPrice() {
				return this.pointPrice;
			}

			public void setPointPrice(Long pointPrice) {
				this.pointPrice = pointPrice;
			}

			public String getSkuPropertiesJson() {
				return this.skuPropertiesJson;
			}

			public void setSkuPropertiesJson(String skuPropertiesJson) {
				this.skuPropertiesJson = skuPropertiesJson;
			}

			public Long getReservePrice() {
				return this.reservePrice;
			}

			public void setReservePrice(Long reservePrice) {
				this.reservePrice = reservePrice;
			}

			public Boolean getCanSell() {
				return this.canSell;
			}

			public void setCanSell(Boolean canSell) {
				this.canSell = canSell;
			}

			public Map<Object,Object> getCustomizedAttributeMap() {
				return this.customizedAttributeMap;
			}

			public void setCustomizedAttributeMap(Map<Object,Object> customizedAttributeMap) {
				this.customizedAttributeMap = customizedAttributeMap;
			}

			public String getLmItemId() {
				return this.lmItemId;
			}

			public void setLmItemId(String lmItemId) {
				this.lmItemId = lmItemId;
			}
		}
	}

	@Override
	public QueryItemDetailResponse getInstance(UnmarshallerContext context) {
		return	QueryItemDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
