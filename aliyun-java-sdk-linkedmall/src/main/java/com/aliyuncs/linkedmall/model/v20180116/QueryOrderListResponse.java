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

	private Integer pageSize;

	private Integer pageNumber;

	private List<LmOrderListItem> lmOrderList;

	private PostFee postFee;

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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<LmOrderListItem> getLmOrderList() {
		return this.lmOrderList;
	}

	public void setLmOrderList(List<LmOrderListItem> lmOrderList) {
		this.lmOrderList = lmOrderList;
	}

	public PostFee getPostFee() {
		return this.postFee;
	}

	public void setPostFee(PostFee postFee) {
		this.postFee = postFee;
	}

	public static class LmOrderListItem {

		private String createDate;

		private Long lmOrderId;

		private Long orderAmount;

		private Integer orderStatus;

		private String extJson;

		private String shopName;

		private Integer logisticsStatus;

		private Integer enableStatus;

		private Long tbOrderId;

		private List<FundStructureModelsItem> fundStructureModels;

		private List<SubOrderListItem> subOrderList;

		private PostFee1 postFee1;

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

		public Integer getLogisticsStatus() {
			return this.logisticsStatus;
		}

		public void setLogisticsStatus(Integer logisticsStatus) {
			this.logisticsStatus = logisticsStatus;
		}

		public Integer getEnableStatus() {
			return this.enableStatus;
		}

		public void setEnableStatus(Integer enableStatus) {
			this.enableStatus = enableStatus;
		}

		public Long getTbOrderId() {
			return this.tbOrderId;
		}

		public void setTbOrderId(Long tbOrderId) {
			this.tbOrderId = tbOrderId;
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

		public PostFee1 getPostFee1() {
			return this.postFee1;
		}

		public void setPostFee1(PostFee1 postFee1) {
			this.postFee1 = postFee1;
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

			private Integer orderStatus;

			private Integer enableStatus;

			private Long tbOrderId;

			private String lmItemId;

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

			public Integer getOrderStatus() {
				return this.orderStatus;
			}

			public void setOrderStatus(Integer orderStatus) {
				this.orderStatus = orderStatus;
			}

			public Integer getEnableStatus() {
				return this.enableStatus;
			}

			public void setEnableStatus(Integer enableStatus) {
				this.enableStatus = enableStatus;
			}

			public Long getTbOrderId() {
				return this.tbOrderId;
			}

			public void setTbOrderId(Long tbOrderId) {
				this.tbOrderId = tbOrderId;
			}

			public String getLmItemId() {
				return this.lmItemId;
			}

			public void setLmItemId(String lmItemId) {
				this.lmItemId = lmItemId;
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
		}

		public static class PostFee1 {

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
	}

	public static class PostFee {

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

	@Override
	public QueryOrderListResponse getInstance(UnmarshallerContext context) {
		return	QueryOrderListResponseUnmarshaller.unmarshall(this, context);
	}
}
