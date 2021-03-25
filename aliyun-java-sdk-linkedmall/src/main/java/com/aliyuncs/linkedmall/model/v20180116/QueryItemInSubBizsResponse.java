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
import com.aliyuncs.linkedmall.transform.v20180116.QueryItemInSubBizsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryItemInSubBizsResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private List<ItemBiz> itemBizList;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ItemBiz> getItemBizList() {
		return this.itemBizList;
	}

	public void setItemBizList(List<ItemBiz> itemBizList) {
		this.itemBizList = itemBizList;
	}

	public static class ItemBiz {

		private Long itemId;

		private String lmItemId;

		private String subBizId;

		private Long quantity;

		private String itemTitle;

		private String mainPicUrl;

		private String descOption;

		private String propertiesJson;

		private Long sellerId;

		private Long categoryId;

		private String tbShopName;

		private Long reservePrice;

		private Boolean canSell;

		private List<Sku> skuList;

		private List<String> itemImages;

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

		public String getSubBizId() {
			return this.subBizId;
		}

		public void setSubBizId(String subBizId) {
			this.subBizId = subBizId;
		}

		public Long getQuantity() {
			return this.quantity;
		}

		public void setQuantity(Long quantity) {
			this.quantity = quantity;
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

		public String getDescOption() {
			return this.descOption;
		}

		public void setDescOption(String descOption) {
			this.descOption = descOption;
		}

		public String getPropertiesJson() {
			return this.propertiesJson;
		}

		public void setPropertiesJson(String propertiesJson) {
			this.propertiesJson = propertiesJson;
		}

		public Long getSellerId() {
			return this.sellerId;
		}

		public void setSellerId(Long sellerId) {
			this.sellerId = sellerId;
		}

		public Long getCategoryId() {
			return this.categoryId;
		}

		public void setCategoryId(Long categoryId) {
			this.categoryId = categoryId;
		}

		public String getTbShopName() {
			return this.tbShopName;
		}

		public void setTbShopName(String tbShopName) {
			this.tbShopName = tbShopName;
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

		public List<Sku> getSkuList() {
			return this.skuList;
		}

		public void setSkuList(List<Sku> skuList) {
			this.skuList = skuList;
		}

		public List<String> getItemImages() {
			return this.itemImages;
		}

		public void setItemImages(List<String> itemImages) {
			this.itemImages = itemImages;
		}

		public static class Sku {

			private Long skuId;

			private String skuPicUrl;

			private String skuTitle;

			private Long priceCent;

			private Long points;

			private Long pointsAmount;

			private String benefitId;

			private Long reservePrice;

			private String skuProperties;

			private String skuPropertiesJson;

			private Map<Object,Object> customizedAttributeMap;

			private Boolean canSell;

			private Long pointPrice;

			public Long getSkuId() {
				return this.skuId;
			}

			public void setSkuId(Long skuId) {
				this.skuId = skuId;
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

			public String getBenefitId() {
				return this.benefitId;
			}

			public void setBenefitId(String benefitId) {
				this.benefitId = benefitId;
			}

			public Long getReservePrice() {
				return this.reservePrice;
			}

			public void setReservePrice(Long reservePrice) {
				this.reservePrice = reservePrice;
			}

			public String getSkuProperties() {
				return this.skuProperties;
			}

			public void setSkuProperties(String skuProperties) {
				this.skuProperties = skuProperties;
			}

			public String getSkuPropertiesJson() {
				return this.skuPropertiesJson;
			}

			public void setSkuPropertiesJson(String skuPropertiesJson) {
				this.skuPropertiesJson = skuPropertiesJson;
			}

			public Map<Object,Object> getCustomizedAttributeMap() {
				return this.customizedAttributeMap;
			}

			public void setCustomizedAttributeMap(Map<Object,Object> customizedAttributeMap) {
				this.customizedAttributeMap = customizedAttributeMap;
			}

			public Boolean getCanSell() {
				return this.canSell;
			}

			public void setCanSell(Boolean canSell) {
				this.canSell = canSell;
			}

			public Long getPointPrice() {
				return this.pointPrice;
			}

			public void setPointPrice(Long pointPrice) {
				this.pointPrice = pointPrice;
			}
		}
	}

	@Override
	public QueryItemInSubBizsResponse getInstance(UnmarshallerContext context) {
		return	QueryItemInSubBizsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
