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
import com.aliyuncs.linkedmall.transform.v20180116.QueryBizItemsWithActivityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryBizItemsWithActivityResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private List<Item> itemList;

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

	public List<Item> getItemList() {
		return this.itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	public static class Item {

		private Long itemId;

		private String lmItemId;

		private String itemTitle;

		private String picUrl;

		private Long reservePrice;

		private Long categoryId;

		private String taobaoShopName;

		private Long sellerId;

		private Long quantity;

		private Integer maxAllowedCount;

		private Integer totalSoldQuantity;

		private List<Sku> skuList;

		private List<Activity> activities;

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

		public String getItemTitle() {
			return this.itemTitle;
		}

		public void setItemTitle(String itemTitle) {
			this.itemTitle = itemTitle;
		}

		public String getPicUrl() {
			return this.picUrl;
		}

		public void setPicUrl(String picUrl) {
			this.picUrl = picUrl;
		}

		public Long getReservePrice() {
			return this.reservePrice;
		}

		public void setReservePrice(Long reservePrice) {
			this.reservePrice = reservePrice;
		}

		public Long getCategoryId() {
			return this.categoryId;
		}

		public void setCategoryId(Long categoryId) {
			this.categoryId = categoryId;
		}

		public String getTaobaoShopName() {
			return this.taobaoShopName;
		}

		public void setTaobaoShopName(String taobaoShopName) {
			this.taobaoShopName = taobaoShopName;
		}

		public Long getSellerId() {
			return this.sellerId;
		}

		public void setSellerId(Long sellerId) {
			this.sellerId = sellerId;
		}

		public Long getQuantity() {
			return this.quantity;
		}

		public void setQuantity(Long quantity) {
			this.quantity = quantity;
		}

		public Integer getMaxAllowedCount() {
			return this.maxAllowedCount;
		}

		public void setMaxAllowedCount(Integer maxAllowedCount) {
			this.maxAllowedCount = maxAllowedCount;
		}

		public Integer getTotalSoldQuantity() {
			return this.totalSoldQuantity;
		}

		public void setTotalSoldQuantity(Integer totalSoldQuantity) {
			this.totalSoldQuantity = totalSoldQuantity;
		}

		public List<Sku> getSkuList() {
			return this.skuList;
		}

		public void setSkuList(List<Sku> skuList) {
			this.skuList = skuList;
		}

		public List<Activity> getActivities() {
			return this.activities;
		}

		public void setActivities(List<Activity> activities) {
			this.activities = activities;
		}

		public static class Sku {

			private Long skuId;

			private Long priceCent;

			private Long points;

			private Long pointsAmount;

			private Long status;

			private String pointsKey;

			private String pointsInfo;

			private Integer maxAllowedCount;

			private Long quantity;

			public Long getSkuId() {
				return this.skuId;
			}

			public void setSkuId(Long skuId) {
				this.skuId = skuId;
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

			public Long getStatus() {
				return this.status;
			}

			public void setStatus(Long status) {
				this.status = status;
			}

			public String getPointsKey() {
				return this.pointsKey;
			}

			public void setPointsKey(String pointsKey) {
				this.pointsKey = pointsKey;
			}

			public String getPointsInfo() {
				return this.pointsInfo;
			}

			public void setPointsInfo(String pointsInfo) {
				this.pointsInfo = pointsInfo;
			}

			public Integer getMaxAllowedCount() {
				return this.maxAllowedCount;
			}

			public void setMaxAllowedCount(Integer maxAllowedCount) {
				this.maxAllowedCount = maxAllowedCount;
			}

			public Long getQuantity() {
				return this.quantity;
			}

			public void setQuantity(Long quantity) {
				this.quantity = quantity;
			}
		}

		public static class Activity {

			private Long lmActivityId;

			private String title;

			private String description;

			private Long startDate;

			private Long endDate;

			private List<ActivitySession> activitySessions;

			private ActivityItem activityItem;

			public Long getLmActivityId() {
				return this.lmActivityId;
			}

			public void setLmActivityId(Long lmActivityId) {
				this.lmActivityId = lmActivityId;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Long getStartDate() {
				return this.startDate;
			}

			public void setStartDate(Long startDate) {
				this.startDate = startDate;
			}

			public Long getEndDate() {
				return this.endDate;
			}

			public void setEndDate(Long endDate) {
				this.endDate = endDate;
			}

			public List<ActivitySession> getActivitySessions() {
				return this.activitySessions;
			}

			public void setActivitySessions(List<ActivitySession> activitySessions) {
				this.activitySessions = activitySessions;
			}

			public ActivityItem getActivityItem() {
				return this.activityItem;
			}

			public void setActivityItem(ActivityItem activityItem) {
				this.activityItem = activityItem;
			}

			public static class ActivitySession {

				private Long lmSessionId;

				private String title;

				private String description;

				private String subBizCode;

				private Long displayDate;

				private Long startDate;

				private Long endDate;

				private ActivitySessionItem activitySessionItem;

				public Long getLmSessionId() {
					return this.lmSessionId;
				}

				public void setLmSessionId(Long lmSessionId) {
					this.lmSessionId = lmSessionId;
				}

				public String getTitle() {
					return this.title;
				}

				public void setTitle(String title) {
					this.title = title;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public String getSubBizCode() {
					return this.subBizCode;
				}

				public void setSubBizCode(String subBizCode) {
					this.subBizCode = subBizCode;
				}

				public Long getDisplayDate() {
					return this.displayDate;
				}

				public void setDisplayDate(Long displayDate) {
					this.displayDate = displayDate;
				}

				public Long getStartDate() {
					return this.startDate;
				}

				public void setStartDate(Long startDate) {
					this.startDate = startDate;
				}

				public Long getEndDate() {
					return this.endDate;
				}

				public void setEndDate(Long endDate) {
					this.endDate = endDate;
				}

				public ActivitySessionItem getActivitySessionItem() {
					return this.activitySessionItem;
				}

				public void setActivitySessionItem(ActivitySessionItem activitySessionItem) {
					this.activitySessionItem = activitySessionItem;
				}

				public static class ActivitySessionItem {

					private Long sessionQuantity;

					private Long limitQuantityForPerson;

					private Long saleableQuantity;

					private ActivitySessionItemSkuList activitySessionItemSkuList;

					public Long getSessionQuantity() {
						return this.sessionQuantity;
					}

					public void setSessionQuantity(Long sessionQuantity) {
						this.sessionQuantity = sessionQuantity;
					}

					public Long getLimitQuantityForPerson() {
						return this.limitQuantityForPerson;
					}

					public void setLimitQuantityForPerson(Long limitQuantityForPerson) {
						this.limitQuantityForPerson = limitQuantityForPerson;
					}

					public Long getSaleableQuantity() {
						return this.saleableQuantity;
					}

					public void setSaleableQuantity(Long saleableQuantity) {
						this.saleableQuantity = saleableQuantity;
					}

					public ActivitySessionItemSkuList getActivitySessionItemSkuList() {
						return this.activitySessionItemSkuList;
					}

					public void setActivitySessionItemSkuList(ActivitySessionItemSkuList activitySessionItemSkuList) {
						this.activitySessionItemSkuList = activitySessionItemSkuList;
					}

					public static class ActivitySessionItemSkuList {

						private Long skuId;

						private Long priceCent;

						private Long points;

						private Long pointsAmount;

						public Long getSkuId() {
							return this.skuId;
						}

						public void setSkuId(Long skuId) {
							this.skuId = skuId;
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
					}
				}
			}

			public static class ActivityItem {

				private Long activityQuantity;

				private Long limitQuantityForPerson;

				private List<ActivityItemSku> activityItemSkuList;

				public Long getActivityQuantity() {
					return this.activityQuantity;
				}

				public void setActivityQuantity(Long activityQuantity) {
					this.activityQuantity = activityQuantity;
				}

				public Long getLimitQuantityForPerson() {
					return this.limitQuantityForPerson;
				}

				public void setLimitQuantityForPerson(Long limitQuantityForPerson) {
					this.limitQuantityForPerson = limitQuantityForPerson;
				}

				public List<ActivityItemSku> getActivityItemSkuList() {
					return this.activityItemSkuList;
				}

				public void setActivityItemSkuList(List<ActivityItemSku> activityItemSkuList) {
					this.activityItemSkuList = activityItemSkuList;
				}

				public static class ActivityItemSku {

					private Long skuId;

					private Long activityPrice;

					public Long getSkuId() {
						return this.skuId;
					}

					public void setSkuId(Long skuId) {
						this.skuId = skuId;
					}

					public Long getActivityPrice() {
						return this.activityPrice;
					}

					public void setActivityPrice(Long activityPrice) {
						this.activityPrice = activityPrice;
					}
				}
			}
		}
	}

	@Override
	public QueryBizItemsWithActivityResponse getInstance(UnmarshallerContext context) {
		return	QueryBizItemsWithActivityResponseUnmarshaller.unmarshall(this, context);
	}
}
