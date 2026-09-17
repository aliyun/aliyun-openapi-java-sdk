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

package com.aliyuncs.swas_open.model.v20200601;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateOrderRequest extends RpcAcsRequest<CreateOrderResponse> {
	   

	private Commodity commodity;

	private String fromApp;

	private String couponNo;

	private BusinessInfo businessInfo;

	private String orderType;
	public CreateOrderRequest() {
		super("SWAS-OPEN", "2020-06-01", "CreateOrder", "SimpleApplicationServer");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Commodity getCommodity() {
		return this.commodity;
	}

	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;	
		if (commodity != null) {
			
				putQueryParameter("Commodity.AutoRenewPeriod" , commodity.getAutoRenewPeriod());
				putQueryParameter("Commodity.PlanId" , commodity.getPlanId());
				putQueryParameter("Commodity.Amount" , commodity.getAmount());
				putQueryParameter("Commodity.AutoRenew" , commodity.getAutoRenew());
				putQueryParameter("Commodity.ImageId" , commodity.getImageId());
				putQueryParameter("Commodity.Period" , commodity.getPeriod());
				putQueryParameter("Commodity.PayType" , commodity.getPayType());
				putQueryParameter("Commodity.DataDiskSize" , commodity.getDataDiskSize());
				putQueryParameter("Commodity.AutoPay" , commodity.getAutoPay());
				if (commodity.getInstanceIds() != null) {
					for (int depth1 = 0; depth1 < commodity.getInstanceIds().size(); depth1++) {
						putQueryParameter("Commodity.InstanceIds." + (depth1 + 1) , commodity.getInstanceIds().get(depth1));
					}
				}
				putQueryParameter("Commodity.CommodityType" , commodity.getCommodityType());
				putQueryParameter("Commodity.PeriodUnit" , commodity.getPeriodUnit());
		}	
	}

	public String getFromApp() {
		return this.fromApp;
	}

	public void setFromApp(String fromApp) {
		this.fromApp = fromApp;
		if(fromApp != null){
			putQueryParameter("FromApp", fromApp);
		}
	}

	public String getCouponNo() {
		return this.couponNo;
	}

	public void setCouponNo(String couponNo) {
		this.couponNo = couponNo;
		if(couponNo != null){
			putQueryParameter("CouponNo", couponNo);
		}
	}

	public BusinessInfo getBusinessInfo() {
		return this.businessInfo;
	}

	public void setBusinessInfo(BusinessInfo businessInfo) {
		this.businessInfo = businessInfo;	
		if (businessInfo != null) {
			
				putQueryParameter("BusinessInfo.UseCoupon" , businessInfo.getUseCoupon());
				putQueryParameter("BusinessInfo.WeChatProType" , businessInfo.getWeChatProType());
				if (businessInfo.getPromotionOptions() != null) {
					
						if (businessInfo.getPromotionOptions().getPromotionFilter() != null) {
							
								putQueryParameter("BusinessInfo.PromotionOptions.PromotionFilter.UseCoupon" , businessInfo.getPromotionOptions().getPromotionFilter().getUseCoupon());
						}
						putQueryParameter("BusinessInfo.PromotionOptions.PromotionOptionNo" , businessInfo.getPromotionOptions().getPromotionOptionNo());
						putQueryParameter("BusinessInfo.PromotionOptions.ActivityId" , businessInfo.getPromotionOptions().getActivityId());
						putQueryParameter("BusinessInfo.PromotionOptions.PromotionOptionCode" , businessInfo.getPromotionOptions().getPromotionOptionCode());
				}
				putQueryParameter("BusinessInfo.AliyunLang" , businessInfo.getAliyunLang());
				putQueryParameter("BusinessInfo.OrderSource" , businessInfo.getOrderSource());
				putQueryParameter("BusinessInfo.lx_channel_cookie_value" , businessInfo.getLx_channel_cookie_value());
		}	
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
		if(orderType != null){
			putQueryParameter("OrderType", orderType);
		}
	}

	public static class Commodity {

		private Integer autoRenewPeriod;

		private String planId;

		private Integer amount;

		private Boolean autoRenew;

		private String imageId;

		private Integer period;

		private String payType;

		private Integer dataDiskSize;

		private Boolean autoPay;

		private List<String> instanceIds;

		private String commodityType;

		private String periodUnit;

		public Integer getAutoRenewPeriod() {
			return this.autoRenewPeriod;
		}

		public void setAutoRenewPeriod(Integer autoRenewPeriod) {
			this.autoRenewPeriod = autoRenewPeriod;
		}

		public String getPlanId() {
			return this.planId;
		}

		public void setPlanId(String planId) {
			this.planId = planId;
		}

		public Integer getAmount() {
			return this.amount;
		}

		public void setAmount(Integer amount) {
			this.amount = amount;
		}

		public Boolean getAutoRenew() {
			return this.autoRenew;
		}

		public void setAutoRenew(Boolean autoRenew) {
			this.autoRenew = autoRenew;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public Integer getPeriod() {
			return this.period;
		}

		public void setPeriod(Integer period) {
			this.period = period;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public Integer getDataDiskSize() {
			return this.dataDiskSize;
		}

		public void setDataDiskSize(Integer dataDiskSize) {
			this.dataDiskSize = dataDiskSize;
		}

		public Boolean getAutoPay() {
			return this.autoPay;
		}

		public void setAutoPay(Boolean autoPay) {
			this.autoPay = autoPay;
		}

		public List<String> getInstanceIds() {
			return this.instanceIds;
		}

		public void setInstanceIds(List<String> instanceIds) {
			this.instanceIds = instanceIds;
		}

		public String getCommodityType() {
			return this.commodityType;
		}

		public void setCommodityType(String commodityType) {
			this.commodityType = commodityType;
		}

		public String getPeriodUnit() {
			return this.periodUnit;
		}

		public void setPeriodUnit(String periodUnit) {
			this.periodUnit = periodUnit;
		}
	}

	public static class BusinessInfo {

		private Boolean useCoupon;

		private String weChatProType;

		private PromotionOptions promotionOptions;

		private String aliyunLang;

		private String orderSource;

		private String lx_channel_cookie_value;

		public Boolean getUseCoupon() {
			return this.useCoupon;
		}

		public void setUseCoupon(Boolean useCoupon) {
			this.useCoupon = useCoupon;
		}

		public String getWeChatProType() {
			return this.weChatProType;
		}

		public void setWeChatProType(String weChatProType) {
			this.weChatProType = weChatProType;
		}

		public PromotionOptions getPromotionOptions() {
			return this.promotionOptions;
		}

		public void setPromotionOptions(PromotionOptions promotionOptions) {
			this.promotionOptions = promotionOptions;
		}

		public String getAliyunLang() {
			return this.aliyunLang;
		}

		public void setAliyunLang(String aliyunLang) {
			this.aliyunLang = aliyunLang;
		}

		public String getOrderSource() {
			return this.orderSource;
		}

		public void setOrderSource(String orderSource) {
			this.orderSource = orderSource;
		}

		public String getLx_channel_cookie_value() {
			return this.lx_channel_cookie_value;
		}

		public void setLx_channel_cookie_value(String lx_channel_cookie_value) {
			this.lx_channel_cookie_value = lx_channel_cookie_value;
		}

		public static class PromotionOptions {

			private PromotionFilter promotionFilter;

			private String promotionOptionNo;

			private String activityId;

			private String promotionOptionCode;

			public PromotionFilter getPromotionFilter() {
				return this.promotionFilter;
			}

			public void setPromotionFilter(PromotionFilter promotionFilter) {
				this.promotionFilter = promotionFilter;
			}

			public String getPromotionOptionNo() {
				return this.promotionOptionNo;
			}

			public void setPromotionOptionNo(String promotionOptionNo) {
				this.promotionOptionNo = promotionOptionNo;
			}

			public String getActivityId() {
				return this.activityId;
			}

			public void setActivityId(String activityId) {
				this.activityId = activityId;
			}

			public String getPromotionOptionCode() {
				return this.promotionOptionCode;
			}

			public void setPromotionOptionCode(String promotionOptionCode) {
				this.promotionOptionCode = promotionOptionCode;
			}

			public static class PromotionFilter {

				private Boolean useCoupon;

				public Boolean getUseCoupon() {
					return this.useCoupon;
				}

				public void setUseCoupon(Boolean useCoupon) {
					this.useCoupon = useCoupon;
				}
			}
		}
	}

	@Override
	public Class<CreateOrderResponse> getResponseClass() {
		return CreateOrderResponse.class;
	}

}
