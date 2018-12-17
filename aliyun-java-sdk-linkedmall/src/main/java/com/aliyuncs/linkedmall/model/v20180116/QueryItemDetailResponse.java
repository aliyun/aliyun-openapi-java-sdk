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

		private Map<Object,Object> properties;

		private List<Sku> skus;

		private List<String> iforestProps;

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

		public Map<Object,Object> getProperties() {
			return this.properties;
		}

		public void setProperties(Map<Object,Object> properties) {
			this.properties = properties;
		}

		public List<Sku> getSkus() {
			return this.skus;
		}

		public void setSkus(List<Sku> skus) {
			this.skus = skus;
		}

		public List<String> getIforestProps() {
			return this.iforestProps;
		}

		public void setIforestProps(List<String> iforestProps) {
			this.iforestProps = iforestProps;
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

			private Map<Object,Object> skuProperties;

			private String skuPicUrl;

			private String skuTitle;

			private Integer quantity;

			private Long priceCent;

			private Long points;

			private Long pointsAmount;

			private Long pointPrice;

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

			public Map<Object,Object> getSkuProperties() {
				return this.skuProperties;
			}

			public void setSkuProperties(Map<Object,Object> skuProperties) {
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
		}
	}

	@Override
	public QueryItemDetailResponse getInstance(UnmarshallerContext context) {
		return	QueryItemDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
