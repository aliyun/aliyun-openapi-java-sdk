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

package com.aliyuncs.r_kvstore.model.v20150101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribePriceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePriceResponse extends AcsResponse {

	private String requestId;

	private String orderParams;

	private List<Rule> rules;

	private List<SubOrder> subOrders;

	private Order order;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getOrderParams() {
		return this.orderParams;
	}

	public void setOrderParams(String orderParams) {
		this.orderParams = orderParams;
	}

	public List<Rule> getRules() {
		return this.rules;
	}

	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}

	public List<SubOrder> getSubOrders() {
		return this.subOrders;
	}

	public void setSubOrders(List<SubOrder> subOrders) {
		this.subOrders = subOrders;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public static class Rule {

		private Long ruleDescId;

		private String name;

		private String title;

		public Long getRuleDescId() {
			return this.ruleDescId;
		}

		public void setRuleDescId(Long ruleDescId) {
			this.ruleDescId = ruleDescId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}
	}

	public static class SubOrder {

		private String originalAmount;

		private String tradeAmount;

		private String discountAmount;

		private String instanceId;

		private List<String> ruleIds;

		public String getOriginalAmount() {
			return this.originalAmount;
		}

		public void setOriginalAmount(String originalAmount) {
			this.originalAmount = originalAmount;
		}

		public String getTradeAmount() {
			return this.tradeAmount;
		}

		public void setTradeAmount(String tradeAmount) {
			this.tradeAmount = tradeAmount;
		}

		public String getDiscountAmount() {
			return this.discountAmount;
		}

		public void setDiscountAmount(String discountAmount) {
			this.discountAmount = discountAmount;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public List<String> getRuleIds() {
			return this.ruleIds;
		}

		public void setRuleIds(List<String> ruleIds) {
			this.ruleIds = ruleIds;
		}
	}

	public static class Order {

		private String originalAmount;

		private String tradeAmount;

		private String discountAmount;

		private String currency;

		private List<Coupon> coupons;

		private List<String> ruleIds1;

		public String getOriginalAmount() {
			return this.originalAmount;
		}

		public void setOriginalAmount(String originalAmount) {
			this.originalAmount = originalAmount;
		}

		public String getTradeAmount() {
			return this.tradeAmount;
		}

		public void setTradeAmount(String tradeAmount) {
			this.tradeAmount = tradeAmount;
		}

		public String getDiscountAmount() {
			return this.discountAmount;
		}

		public void setDiscountAmount(String discountAmount) {
			this.discountAmount = discountAmount;
		}

		public String getCurrency() {
			return this.currency;
		}

		public void setCurrency(String currency) {
			this.currency = currency;
		}

		public List<Coupon> getCoupons() {
			return this.coupons;
		}

		public void setCoupons(List<Coupon> coupons) {
			this.coupons = coupons;
		}

		public List<String> getRuleIds1() {
			return this.ruleIds1;
		}

		public void setRuleIds1(List<String> ruleIds1) {
			this.ruleIds1 = ruleIds1;
		}

		public static class Coupon {

			private String couponNo;

			private String name;

			private String description;

			private String isSelected;

			public String getCouponNo() {
				return this.couponNo;
			}

			public void setCouponNo(String couponNo) {
				this.couponNo = couponNo;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getIsSelected() {
				return this.isSelected;
			}

			public void setIsSelected(String isSelected) {
				this.isSelected = isSelected;
			}
		}
	}

	@Override
	public DescribePriceResponse getInstance(UnmarshallerContext context) {
		return	DescribePriceResponseUnmarshaller.unmarshall(this, context);
	}
}
