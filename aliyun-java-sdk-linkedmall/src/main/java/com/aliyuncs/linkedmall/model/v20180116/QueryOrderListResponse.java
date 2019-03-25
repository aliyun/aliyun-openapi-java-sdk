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
import com.aliyuncs.linkedmall.transform.v20180116.QueryOrderListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryOrderListResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Long totalCount;

	private List<LmOrderListItem> lmOrderList;

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

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<LmOrderListItem> getLmOrderList() {
		return this.lmOrderList;
	}

	public void setLmOrderList(List<LmOrderListItem> lmOrderList) {
		this.lmOrderList = lmOrderList;
	}

	public static class LmOrderListItem {

		private String createDate;

		private Long lmOrderId;

		private Long orderAmount;

		private Integer orderStatus;

		private String extJson;

		private String shopName;

		private List<FundStructureModelsItem> fundStructureModels;

		private List<SubOrderListItem> subOrderList;

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public Long getLmOrderId() {
			return this.lmOrderId;
		}

		public void setLmOrderId(Long lmOrderId) {
			this.lmOrderId = lmOrderId;
		}

		public Long getOrderAmount() {
			return this.orderAmount;
		}

		public void setOrderAmount(Long orderAmount) {
			this.orderAmount = orderAmount;
		}

		public Integer getOrderStatus() {
			return this.orderStatus;
		}

		public void setOrderStatus(Integer orderStatus) {
			this.orderStatus = orderStatus;
		}

		public String getExtJson() {
			return this.extJson;
		}

		public void setExtJson(String extJson) {
			this.extJson = extJson;
		}

		public String getShopName() {
			return this.shopName;
		}

		public void setShopName(String shopName) {
			this.shopName = shopName;
		}

		public List<FundStructureModelsItem> getFundStructureModels() {
			return this.fundStructureModels;
		}

		public void setFundStructureModels(List<FundStructureModelsItem> fundStructureModels) {
			this.fundStructureModels = fundStructureModels;
		}

		public List<SubOrderListItem> getSubOrderList() {
			return this.subOrderList;
		}

		public void setSubOrderList(List<SubOrderListItem> subOrderList) {
			this.subOrderList = subOrderList;
		}

		public static class FundStructureModelsItem {

			private Long fundAmount;

			private Long fundAmountMoney;

			private String fundType;

			public Long getFundAmount() {
				return this.fundAmount;
			}

			public void setFundAmount(Long fundAmount) {
				this.fundAmount = fundAmount;
			}

			public Long getFundAmountMoney() {
				return this.fundAmountMoney;
			}

			public void setFundAmountMoney(Long fundAmountMoney) {
				this.fundAmountMoney = fundAmountMoney;
			}

			public String getFundType() {
				return this.fundType;
			}

			public void setFundType(String fundType) {
				this.fundType = fundType;
			}
		}

		public static class SubOrderListItem {

			private Long itemId;

			private String itemPic;

			private String itemTitle;

			private Long number;

			private Long skuId;

			private String skuName;

			private Long lmOrderId;

			private List<ItemPriceListItem> itemPriceList;

			public Long getItemId() {
				return this.itemId;
			}

			public void setItemId(Long itemId) {
				this.itemId = itemId;
			}

			public String getItemPic() {
				return this.itemPic;
			}

			public void setItemPic(String itemPic) {
				this.itemPic = itemPic;
			}

			public String getItemTitle() {
				return this.itemTitle;
			}

			public void setItemTitle(String itemTitle) {
				this.itemTitle = itemTitle;
			}

			public Long getNumber() {
				return this.number;
			}

			public void setNumber(Long number) {
				this.number = number;
			}

			public Long getSkuId() {
				return this.skuId;
			}

			public void setSkuId(Long skuId) {
				this.skuId = skuId;
			}

			public String getSkuName() {
				return this.skuName;
			}

			public void setSkuName(String skuName) {
				this.skuName = skuName;
			}

			public Long getLmOrderId() {
				return this.lmOrderId;
			}

			public void setLmOrderId(Long lmOrderId) {
				this.lmOrderId = lmOrderId;
			}

			public List<ItemPriceListItem> getItemPriceList() {
				return this.itemPriceList;
			}

			public void setItemPriceList(List<ItemPriceListItem> itemPriceList) {
				this.itemPriceList = itemPriceList;
			}

			public static class ItemPriceListItem {

				private Long fundAmount;

				private Long fundAmountMoney;

				private Integer fundType;

				public Long getFundAmount() {
					return this.fundAmount;
				}

				public void setFundAmount(Long fundAmount) {
					this.fundAmount = fundAmount;
				}

				public Long getFundAmountMoney() {
					return this.fundAmountMoney;
				}

				public void setFundAmountMoney(Long fundAmountMoney) {
					this.fundAmountMoney = fundAmountMoney;
				}

				public Integer getFundType() {
					return this.fundType;
				}

				public void setFundType(Integer fundType) {
					this.fundType = fundType;
				}
			}
		}
	}

	@Override
	public QueryOrderListResponse getInstance(UnmarshallerContext context) {
		return	QueryOrderListResponseUnmarshaller.unmarshall(this, context);
	}
}
