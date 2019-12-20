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
import com.aliyuncs.linkedmall.transform.v20180116.QueryItemDetailInnerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryItemDetailInnerResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

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

		private Map<Object,Object> properties;

		private Boolean canSell;

		private Boolean sellerPayPostfee;

		private Long categoryId;

		private Long sellerId;

		private String tbShopName;

		private String lmItemCategory;

		private Boolean centerInventory;

		private String province;

		private String city;

		private String descOption;

		private String sellerNick;

		private Long lmShopId;

		private List<Sku> skus;

		private List<SkuProperty> skuPropertys;

		private List<Map<Object,Object>> iforestProps;

		private List<String> itemImages;

		private List<Long> categoryIds;

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

		public Map<Object,Object> getProperties() {
			return this.properties;
		}

		public void setProperties(Map<Object,Object> properties) {
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

		public String getProvince() {
			return this.province;
		}

		public void setProvince(String province) {
			this.province = province;
		}

		public String getCity() {
			return this.city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getDescOption() {
			return this.descOption;
		}

		public void setDescOption(String descOption) {
			this.descOption = descOption;
		}

		public String getSellerNick() {
			return this.sellerNick;
		}

		public void setSellerNick(String sellerNick) {
			this.sellerNick = sellerNick;
		}

		public Long getLmShopId() {
			return this.lmShopId;
		}

		public void setLmShopId(Long lmShopId) {
			this.lmShopId = lmShopId;
		}

		public List<Sku> getSkus() {
			return this.skus;
		}

		public void setSkus(List<Sku> skus) {
			this.skus = skus;
		}

		public List<SkuProperty> getSkuPropertys() {
			return this.skuPropertys;
		}

		public void setSkuPropertys(List<SkuProperty> skuPropertys) {
			this.skuPropertys = skuPropertys;
		}

		public List<Map<Object,Object>> getIforestProps() {
			return this.iforestProps;
		}

		public void setIforestProps(List<Map<Object,Object>> iforestProps) {
			this.iforestProps = iforestProps;
		}

		public List<String> getItemImages() {
			return this.itemImages;
		}

		public void setItemImages(List<String> itemImages) {
			this.itemImages = itemImages;
		}

		public List<Long> getCategoryIds() {
			return this.categoryIds;
		}

		public void setCategoryIds(List<Long> categoryIds) {
			this.categoryIds = categoryIds;
		}

		public static class Sku {

			private String extJson;

			private Long itemId;

			private Long skuId;

			private String skuPvs;

			private String skuPicUrl;

			private String skuTitle;

			private Integer quantity;

			private Long priceCent;

			private Long points;

			private Long pointsAmount;

			private Long pointPrice;

			private Long reservePrice;

			private Integer status;

			private String lmItemId;

			private String skuDesc;

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

			public String getSkuPvs() {
				return this.skuPvs;
			}

			public void setSkuPvs(String skuPvs) {
				this.skuPvs = skuPvs;
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

			public Long getReservePrice() {
				return this.reservePrice;
			}

			public void setReservePrice(Long reservePrice) {
				this.reservePrice = reservePrice;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getLmItemId() {
				return this.lmItemId;
			}

			public void setLmItemId(String lmItemId) {
				this.lmItemId = lmItemId;
			}

			public String getSkuDesc() {
				return this.skuDesc;
			}

			public void setSkuDesc(String skuDesc) {
				this.skuDesc = skuDesc;
			}
		}

		public static class SkuProperty {

			private Long id;

			private String text;

			private List<Value> values;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public List<Value> getValues() {
				return this.values;
			}

			public void setValues(List<Value> values) {
				this.values = values;
			}

			public static class Value {

				private Long id;

				private String text;

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getText() {
					return this.text;
				}

				public void setText(String text) {
					this.text = text;
				}
			}
		}
	}

	@Override
	public QueryItemDetailInnerResponse getInstance(UnmarshallerContext context) {
		return	QueryItemDetailInnerResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
