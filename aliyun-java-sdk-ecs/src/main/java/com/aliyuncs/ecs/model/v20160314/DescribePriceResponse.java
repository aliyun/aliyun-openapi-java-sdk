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

package com.aliyuncs.ecs.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.DescribePriceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePriceResponse extends AcsResponse {

	private String requestId;

	private PriceInfo priceInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PriceInfo getPriceInfo() {
		return this.priceInfo;
	}

	public void setPriceInfo(PriceInfo priceInfo) {
		this.priceInfo = priceInfo;
	}

	public static class PriceInfo {

		private List<Rule> rules;

		private List<String> orderParams;

		private Order order;

		private PriceWarning priceWarning;

		public List<Rule> getRules() {
			return this.rules;
		}

		public void setRules(List<Rule> rules) {
			this.rules = rules;
		}

		public List<String> getOrderParams() {
			return this.orderParams;
		}

		public void setOrderParams(List<String> orderParams) {
			this.orderParams = orderParams;
		}

		public Order getOrder() {
			return this.order;
		}

		public void setOrder(Order order) {
			this.order = order;
		}

		public PriceWarning getPriceWarning() {
			return this.priceWarning;
		}

		public void setPriceWarning(PriceWarning priceWarning) {
			this.priceWarning = priceWarning;
		}

		public static class Rule {

			private String title;

			private String name;

			private Long ruleId;

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Long getRuleId() {
				return this.ruleId;
			}

			public void setRuleId(Long ruleId) {
				this.ruleId = ruleId;
			}
		}

		public static class Order {

			private Float discountPrice;

			private Float tradePrice;

			private Float originalPrice;

			private Float spotInstanceTypePrice;

			private String currency;

			private Float spotInstanceTypeOriginalPrice;

			private List<Coupon> coupons;

			private List<ResourcePriceModel> detailInfos;

			private List<SubOrder> subOrders;

			private List<String> ruleIdSet;

			public Float getDiscountPrice() {
				return this.discountPrice;
			}

			public void setDiscountPrice(Float discountPrice) {
				this.discountPrice = discountPrice;
			}

			public Float getTradePrice() {
				return this.tradePrice;
			}

			public void setTradePrice(Float tradePrice) {
				this.tradePrice = tradePrice;
			}

			public Float getOriginalPrice() {
				return this.originalPrice;
			}

			public void setOriginalPrice(Float originalPrice) {
				this.originalPrice = originalPrice;
			}

			public Float getSpotInstanceTypePrice() {
				return this.spotInstanceTypePrice;
			}

			public void setSpotInstanceTypePrice(Float spotInstanceTypePrice) {
				this.spotInstanceTypePrice = spotInstanceTypePrice;
			}

			public String getCurrency() {
				return this.currency;
			}

			public void setCurrency(String currency) {
				this.currency = currency;
			}

			public Float getSpotInstanceTypeOriginalPrice() {
				return this.spotInstanceTypeOriginalPrice;
			}

			public void setSpotInstanceTypeOriginalPrice(Float spotInstanceTypeOriginalPrice) {
				this.spotInstanceTypeOriginalPrice = spotInstanceTypeOriginalPrice;
			}

			public List<Coupon> getCoupons() {
				return this.coupons;
			}

			public void setCoupons(List<Coupon> coupons) {
				this.coupons = coupons;
			}

			public List<ResourcePriceModel> getDetailInfos() {
				return this.detailInfos;
			}

			public void setDetailInfos(List<ResourcePriceModel> detailInfos) {
				this.detailInfos = detailInfos;
			}

			public List<SubOrder> getSubOrders() {
				return this.subOrders;
			}

			public void setSubOrders(List<SubOrder> subOrders) {
				this.subOrders = subOrders;
			}

			public List<String> getRuleIdSet() {
				return this.ruleIdSet;
			}

			public void setRuleIdSet(List<String> ruleIdSet) {
				this.ruleIdSet = ruleIdSet;
			}

			public static class Coupon {

				private Boolean isSelected;

				private String couponNo;

				private String description;

				private String name;

				private Float discountOff;

				private String optionCode;

				private List<Long> ruleIds;

				public Boolean getIsSelected() {
					return this.isSelected;
				}

				public void setIsSelected(Boolean isSelected) {
					this.isSelected = isSelected;
				}

				public String getCouponNo() {
					return this.couponNo;
				}

				public void setCouponNo(String couponNo) {
					this.couponNo = couponNo;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Float getDiscountOff() {
					return this.discountOff;
				}

				public void setDiscountOff(Float discountOff) {
					this.discountOff = discountOff;
				}

				public String getOptionCode() {
					return this.optionCode;
				}

				public void setOptionCode(String optionCode) {
					this.optionCode = optionCode;
				}

				public List<Long> getRuleIds() {
					return this.ruleIds;
				}

				public void setRuleIds(List<Long> ruleIds) {
					this.ruleIds = ruleIds;
				}
			}

			public static class ResourcePriceModel {

				private String resource;

				private Float originalPrice;

				private Float discountPrice;

				private Float tradePrice;

				private List<Rule1> subRules;

				public String getResource() {
					return this.resource;
				}

				public void setResource(String resource) {
					this.resource = resource;
				}

				public Float getOriginalPrice() {
					return this.originalPrice;
				}

				public void setOriginalPrice(Float originalPrice) {
					this.originalPrice = originalPrice;
				}

				public Float getDiscountPrice() {
					return this.discountPrice;
				}

				public void setDiscountPrice(Float discountPrice) {
					this.discountPrice = discountPrice;
				}

				public Float getTradePrice() {
					return this.tradePrice;
				}

				public void setTradePrice(Float tradePrice) {
					this.tradePrice = tradePrice;
				}

				public List<Rule1> getSubRules() {
					return this.subRules;
				}

				public void setSubRules(List<Rule1> subRules) {
					this.subRules = subRules;
				}

				public static class Rule1 {

					private String title;

					private String name;

					private Long ruleId;

					public String getTitle() {
						return this.title;
					}

					public void setTitle(String title) {
						this.title = title;
					}

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public Long getRuleId() {
						return this.ruleId;
					}

					public void setRuleId(Long ruleId) {
						this.ruleId = ruleId;
					}
				}
			}

			public static class SubOrder {

				private Float originalPrice;

				private String instanceId;

				private Float discountPrice;

				private Float tradePrice;

				private List<String> ruleIdSet2;

				public Float getOriginalPrice() {
					return this.originalPrice;
				}

				public void setOriginalPrice(Float originalPrice) {
					this.originalPrice = originalPrice;
				}

				public String getInstanceId() {
					return this.instanceId;
				}

				public void setInstanceId(String instanceId) {
					this.instanceId = instanceId;
				}

				public Float getDiscountPrice() {
					return this.discountPrice;
				}

				public void setDiscountPrice(Float discountPrice) {
					this.discountPrice = discountPrice;
				}

				public Float getTradePrice() {
					return this.tradePrice;
				}

				public void setTradePrice(Float tradePrice) {
					this.tradePrice = tradePrice;
				}

				public List<String> getRuleIdSet2() {
					return this.ruleIdSet2;
				}

				public void setRuleIdSet2(List<String> ruleIdSet2) {
					this.ruleIdSet2 = ruleIdSet2;
				}
			}
		}

		public static class PriceWarning {

			private String msg;

			private String code;

			public String getMsg() {
				return this.msg;
			}

			public void setMsg(String msg) {
				this.msg = msg;
			}

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}
		}
	}

	@Override
	public DescribePriceResponse getInstance(UnmarshallerContext context) {
		return	DescribePriceResponseUnmarshaller.unmarshall(this, context);
	}
}
