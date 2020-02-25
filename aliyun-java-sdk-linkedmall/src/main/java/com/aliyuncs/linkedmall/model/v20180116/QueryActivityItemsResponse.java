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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkedmall.transform.v20180116.QueryActivityItemsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryActivityItemsResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Long totalCount;

	private Long pageNumber;

	private Long pageSize;

	private List<LmActivityItemModel> lmActivityItemModelList;

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

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<LmActivityItemModel> getLmActivityItemModelList() {
		return this.lmActivityItemModelList;
	}

	public void setLmActivityItemModelList(List<LmActivityItemModel> lmActivityItemModelList) {
		this.lmActivityItemModelList = lmActivityItemModelList;
	}

	public static class LmActivityItemModel {

		private String lmItemId;

		private Long itemId;

		private String itemTitle;

		private Long lmActivityId;

		private String mainPicUrl;

		private Long tbSellerId;

		private Long tbShopId;

		private String lmShopId;

		private String tbShopName;

		private Integer itemActivityQuantity;

		private Integer sellableQuantity;

		private String itemActivityStatus;

		private Boolean canSell;

		private String tips;

		private List<LmActivityItemSkuModel> skuModelList;

		public String getLmItemId() {
			return this.lmItemId;
		}

		public void setLmItemId(String lmItemId) {
			this.lmItemId = lmItemId;
		}

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

		public Long getLmActivityId() {
			return this.lmActivityId;
		}

		public void setLmActivityId(Long lmActivityId) {
			this.lmActivityId = lmActivityId;
		}

		public String getMainPicUrl() {
			return this.mainPicUrl;
		}

		public void setMainPicUrl(String mainPicUrl) {
			this.mainPicUrl = mainPicUrl;
		}

		public Long getTbSellerId() {
			return this.tbSellerId;
		}

		public void setTbSellerId(Long tbSellerId) {
			this.tbSellerId = tbSellerId;
		}

		public Long getTbShopId() {
			return this.tbShopId;
		}

		public void setTbShopId(Long tbShopId) {
			this.tbShopId = tbShopId;
		}

		public String getLmShopId() {
			return this.lmShopId;
		}

		public void setLmShopId(String lmShopId) {
			this.lmShopId = lmShopId;
		}

		public String getTbShopName() {
			return this.tbShopName;
		}

		public void setTbShopName(String tbShopName) {
			this.tbShopName = tbShopName;
		}

		public Integer getItemActivityQuantity() {
			return this.itemActivityQuantity;
		}

		public void setItemActivityQuantity(Integer itemActivityQuantity) {
			this.itemActivityQuantity = itemActivityQuantity;
		}

		public Integer getSellableQuantity() {
			return this.sellableQuantity;
		}

		public void setSellableQuantity(Integer sellableQuantity) {
			this.sellableQuantity = sellableQuantity;
		}

		public String getItemActivityStatus() {
			return this.itemActivityStatus;
		}

		public void setItemActivityStatus(String itemActivityStatus) {
			this.itemActivityStatus = itemActivityStatus;
		}

		public Boolean getCanSell() {
			return this.canSell;
		}

		public void setCanSell(Boolean canSell) {
			this.canSell = canSell;
		}

		public String getTips() {
			return this.tips;
		}

		public void setTips(String tips) {
			this.tips = tips;
		}

		public List<LmActivityItemSkuModel> getSkuModelList() {
			return this.skuModelList;
		}

		public void setSkuModelList(List<LmActivityItemSkuModel> skuModelList) {
			this.skuModelList = skuModelList;
		}

		public static class LmActivityItemSkuModel {

			private String bizId;

			private Long skuId;

			private String skuTitle;

			private String skuPicUrl;

			private Long reservedPrice;

			private Long activityPrice;

			private String activityStatus;

			private String tips;

			private String lmItemId;

			private Long itemId;

			private Long lmActivityId;

			public String getBizId() {
				return this.bizId;
			}

			public void setBizId(String bizId) {
				this.bizId = bizId;
			}

			public Long getSkuId() {
				return this.skuId;
			}

			public void setSkuId(Long skuId) {
				this.skuId = skuId;
			}

			public String getSkuTitle() {
				return this.skuTitle;
			}

			public void setSkuTitle(String skuTitle) {
				this.skuTitle = skuTitle;
			}

			public String getSkuPicUrl() {
				return this.skuPicUrl;
			}

			public void setSkuPicUrl(String skuPicUrl) {
				this.skuPicUrl = skuPicUrl;
			}

			public Long getReservedPrice() {
				return this.reservedPrice;
			}

			public void setReservedPrice(Long reservedPrice) {
				this.reservedPrice = reservedPrice;
			}

			public Long getActivityPrice() {
				return this.activityPrice;
			}

			public void setActivityPrice(Long activityPrice) {
				this.activityPrice = activityPrice;
			}

			public String getActivityStatus() {
				return this.activityStatus;
			}

			public void setActivityStatus(String activityStatus) {
				this.activityStatus = activityStatus;
			}

			public String getTips() {
				return this.tips;
			}

			public void setTips(String tips) {
				this.tips = tips;
			}

			public String getLmItemId() {
				return this.lmItemId;
			}

			public void setLmItemId(String lmItemId) {
				this.lmItemId = lmItemId;
			}

			public Long getItemId() {
				return this.itemId;
			}

			public void setItemId(Long itemId) {
				this.itemId = itemId;
			}

			public Long getLmActivityId() {
				return this.lmActivityId;
			}

			public void setLmActivityId(Long lmActivityId) {
				this.lmActivityId = lmActivityId;
			}
		}
	}

	@Override
	public QueryActivityItemsResponse getInstance(UnmarshallerContext context) {
		return	QueryActivityItemsResponseUnmarshaller.unmarshall(this, context);
	}
}
