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
import com.aliyuncs.linkedmall.transform.v20180116.QueryOrderDetailInnerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryOrderDetailInnerResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Model model;

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

	public Model getModel() {
		return this.model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public static class Model {

		private Order order;

		public Order getOrder() {
			return this.order;
		}

		public void setOrder(Order order) {
			this.order = order;
		}

		public static class Order {

			private Long lmOrderId;

			private String channelCode;

			private String channelOrderId;

			private String channelBizType;

			private String orderPayInfo;

			private Long sellerId;

			private String sellerNick;

			private String shopName;

			private String createDate;

			private Integer payStatus;

			private Integer payWaterStatus;

			private Integer refundStatus;

			private Integer logisticsStatus;

			private String logisticsStatusDesc;

			private String logisticsAddress;

			private String logisticsUserName;

			private String logisticsMobilePhone;

			private String logisticsNo;

			private Long orderAmount;

			private String logisticsCompName;

			private String resExtInfo;

			private Long endTime;

			private String shipping;

			private Boolean eticket;

			private Integer enableStatus;

			private String tbOrderId;

			private Map<Object,Object> extInfo;

			private List<SubItemOrder> subItemOrderList;

			private List<FundStructure> fundStructureModels;

			private PostFee postFee;

			public Long getLmOrderId() {
				return this.lmOrderId;
			}

			public void setLmOrderId(Long lmOrderId) {
				this.lmOrderId = lmOrderId;
			}

			public String getChannelCode() {
				return this.channelCode;
			}

			public void setChannelCode(String channelCode) {
				this.channelCode = channelCode;
			}

			public String getChannelOrderId() {
				return this.channelOrderId;
			}

			public void setChannelOrderId(String channelOrderId) {
				this.channelOrderId = channelOrderId;
			}

			public String getChannelBizType() {
				return this.channelBizType;
			}

			public void setChannelBizType(String channelBizType) {
				this.channelBizType = channelBizType;
			}

			public String getOrderPayInfo() {
				return this.orderPayInfo;
			}

			public void setOrderPayInfo(String orderPayInfo) {
				this.orderPayInfo = orderPayInfo;
			}

			public Long getSellerId() {
				return this.sellerId;
			}

			public void setSellerId(Long sellerId) {
				this.sellerId = sellerId;
			}

			public String getSellerNick() {
				return this.sellerNick;
			}

			public void setSellerNick(String sellerNick) {
				this.sellerNick = sellerNick;
			}

			public String getShopName() {
				return this.shopName;
			}

			public void setShopName(String shopName) {
				this.shopName = shopName;
			}

			public String getCreateDate() {
				return this.createDate;
			}

			public void setCreateDate(String createDate) {
				this.createDate = createDate;
			}

			public Integer getPayStatus() {
				return this.payStatus;
			}

			public void setPayStatus(Integer payStatus) {
				this.payStatus = payStatus;
			}

			public Integer getPayWaterStatus() {
				return this.payWaterStatus;
			}

			public void setPayWaterStatus(Integer payWaterStatus) {
				this.payWaterStatus = payWaterStatus;
			}

			public Integer getRefundStatus() {
				return this.refundStatus;
			}

			public void setRefundStatus(Integer refundStatus) {
				this.refundStatus = refundStatus;
			}

			public Integer getLogisticsStatus() {
				return this.logisticsStatus;
			}

			public void setLogisticsStatus(Integer logisticsStatus) {
				this.logisticsStatus = logisticsStatus;
			}

			public String getLogisticsStatusDesc() {
				return this.logisticsStatusDesc;
			}

			public void setLogisticsStatusDesc(String logisticsStatusDesc) {
				this.logisticsStatusDesc = logisticsStatusDesc;
			}

			public String getLogisticsAddress() {
				return this.logisticsAddress;
			}

			public void setLogisticsAddress(String logisticsAddress) {
				this.logisticsAddress = logisticsAddress;
			}

			public String getLogisticsUserName() {
				return this.logisticsUserName;
			}

			public void setLogisticsUserName(String logisticsUserName) {
				this.logisticsUserName = logisticsUserName;
			}

			public String getLogisticsMobilePhone() {
				return this.logisticsMobilePhone;
			}

			public void setLogisticsMobilePhone(String logisticsMobilePhone) {
				this.logisticsMobilePhone = logisticsMobilePhone;
			}

			public String getLogisticsNo() {
				return this.logisticsNo;
			}

			public void setLogisticsNo(String logisticsNo) {
				this.logisticsNo = logisticsNo;
			}

			public Long getOrderAmount() {
				return this.orderAmount;
			}

			public void setOrderAmount(Long orderAmount) {
				this.orderAmount = orderAmount;
			}

			public String getLogisticsCompName() {
				return this.logisticsCompName;
			}

			public void setLogisticsCompName(String logisticsCompName) {
				this.logisticsCompName = logisticsCompName;
			}

			public String getResExtInfo() {
				return this.resExtInfo;
			}

			public void setResExtInfo(String resExtInfo) {
				this.resExtInfo = resExtInfo;
			}

			public Long getEndTime() {
				return this.endTime;
			}

			public void setEndTime(Long endTime) {
				this.endTime = endTime;
			}

			public String getShipping() {
				return this.shipping;
			}

			public void setShipping(String shipping) {
				this.shipping = shipping;
			}

			public Boolean getEticket() {
				return this.eticket;
			}

			public void setEticket(Boolean eticket) {
				this.eticket = eticket;
			}

			public Integer getEnableStatus() {
				return this.enableStatus;
			}

			public void setEnableStatus(Integer enableStatus) {
				this.enableStatus = enableStatus;
			}

			public String getTbOrderId() {
				return this.tbOrderId;
			}

			public void setTbOrderId(String tbOrderId) {
				this.tbOrderId = tbOrderId;
			}

			public Map<Object,Object> getExtInfo() {
				return this.extInfo;
			}

			public void setExtInfo(Map<Object,Object> extInfo) {
				this.extInfo = extInfo;
			}

			public List<SubItemOrder> getSubItemOrderList() {
				return this.subItemOrderList;
			}

			public void setSubItemOrderList(List<SubItemOrder> subItemOrderList) {
				this.subItemOrderList = subItemOrderList;
			}

			public List<FundStructure> getFundStructureModels() {
				return this.fundStructureModels;
			}

			public void setFundStructureModels(List<FundStructure> fundStructureModels) {
				this.fundStructureModels = fundStructureModels;
			}

			public PostFee getPostFee() {
				return this.postFee;
			}

			public void setPostFee(PostFee postFee) {
				this.postFee = postFee;
			}

			public static class SubItemOrder {

				private Integer payStatus;

				private String itemTitle;

				private String lmItemId;

				private Long itemId;

				private String itemPic;

				private String itemPriceInfo;

				private Integer number;

				private Long tbSubOrderId;

				private Long lmOrderId;

				private String skuName;

				private Long skuId;

				private String totalPaymentInfo;

				private String channelCode;

				private List<ItemPrice> itemPriceList;

				public Integer getPayStatus() {
					return this.payStatus;
				}

				public void setPayStatus(Integer payStatus) {
					this.payStatus = payStatus;
				}

				public String getItemTitle() {
					return this.itemTitle;
				}

				public void setItemTitle(String itemTitle) {
					this.itemTitle = itemTitle;
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

				public String getItemPic() {
					return this.itemPic;
				}

				public void setItemPic(String itemPic) {
					this.itemPic = itemPic;
				}

				public String getItemPriceInfo() {
					return this.itemPriceInfo;
				}

				public void setItemPriceInfo(String itemPriceInfo) {
					this.itemPriceInfo = itemPriceInfo;
				}

				public Integer getNumber() {
					return this.number;
				}

				public void setNumber(Integer number) {
					this.number = number;
				}

				public Long getTbSubOrderId() {
					return this.tbSubOrderId;
				}

				public void setTbSubOrderId(Long tbSubOrderId) {
					this.tbSubOrderId = tbSubOrderId;
				}

				public Long getLmOrderId() {
					return this.lmOrderId;
				}

				public void setLmOrderId(Long lmOrderId) {
					this.lmOrderId = lmOrderId;
				}

				public String getSkuName() {
					return this.skuName;
				}

				public void setSkuName(String skuName) {
					this.skuName = skuName;
				}

				public Long getSkuId() {
					return this.skuId;
				}

				public void setSkuId(Long skuId) {
					this.skuId = skuId;
				}

				public String getTotalPaymentInfo() {
					return this.totalPaymentInfo;
				}

				public void setTotalPaymentInfo(String totalPaymentInfo) {
					this.totalPaymentInfo = totalPaymentInfo;
				}

				public String getChannelCode() {
					return this.channelCode;
				}

				public void setChannelCode(String channelCode) {
					this.channelCode = channelCode;
				}

				public List<ItemPrice> getItemPriceList() {
					return this.itemPriceList;
				}

				public void setItemPriceList(List<ItemPrice> itemPriceList) {
					this.itemPriceList = itemPriceList;
				}

				public static class ItemPrice {

					private Long tbOrderId;

					private Long tbSubOrderId;

					private String fundType;

					private Long fundAmount;

					private Long fundAmountMoney;

					public Long getTbOrderId() {
						return this.tbOrderId;
					}

					public void setTbOrderId(Long tbOrderId) {
						this.tbOrderId = tbOrderId;
					}

					public Long getTbSubOrderId() {
						return this.tbSubOrderId;
					}

					public void setTbSubOrderId(Long tbSubOrderId) {
						this.tbSubOrderId = tbSubOrderId;
					}

					public String getFundType() {
						return this.fundType;
					}

					public void setFundType(String fundType) {
						this.fundType = fundType;
					}

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
				}
			}

			public static class FundStructure {

				private Long lmOrderId;

				private Long tbSubOrderId;

				private String fundType;

				private Long fundAmount;

				private Long fundAmountMoney;

				public Long getLmOrderId() {
					return this.lmOrderId;
				}

				public void setLmOrderId(Long lmOrderId) {
					this.lmOrderId = lmOrderId;
				}

				public Long getTbSubOrderId() {
					return this.tbSubOrderId;
				}

				public void setTbSubOrderId(Long tbSubOrderId) {
					this.tbSubOrderId = tbSubOrderId;
				}

				public String getFundType() {
					return this.fundType;
				}

				public void setFundType(String fundType) {
					this.fundType = fundType;
				}

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
			}

			public static class PostFee {

				private Long lmOrderId;

				private Long tbSubOrderId;

				private String fundType;

				private Long fundAmount;

				private Long fundAmountMoney;

				public Long getLmOrderId() {
					return this.lmOrderId;
				}

				public void setLmOrderId(Long lmOrderId) {
					this.lmOrderId = lmOrderId;
				}

				public Long getTbSubOrderId() {
					return this.tbSubOrderId;
				}

				public void setTbSubOrderId(Long tbSubOrderId) {
					this.tbSubOrderId = tbSubOrderId;
				}

				public String getFundType() {
					return this.fundType;
				}

				public void setFundType(String fundType) {
					this.fundType = fundType;
				}

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
			}
		}
	}

	@Override
	public QueryOrderDetailInnerResponse getInstance(UnmarshallerContext context) {
		return	QueryOrderDetailInnerResponseUnmarshaller.unmarshall(this, context);
	}
}
