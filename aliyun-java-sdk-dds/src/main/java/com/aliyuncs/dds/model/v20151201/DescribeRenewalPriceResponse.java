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

package com.aliyuncs.dds.model.v20151201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dds.transform.v20151201.DescribeRenewalPriceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRenewalPriceResponse extends AcsResponse {

	private String requestId;

	private List<SubOrder> subOrders;

	private List<Rule> rules;

	private Order order;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SubOrder> getSubOrders() {
		return this.subOrders;
	}

	public void setSubOrders(List<SubOrder> subOrders) {
		this.subOrders = subOrders;
	}

	public List<Rule> getRules() {
		return this.rules;
	}

	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public static class SubOrder {

		private Float originalAmount;

		private Float discountAmount;

		private Float tradeAmount;

		private String instanceId;

		private List<String> ruleIds;

		public Float getOriginalAmount() {
			return this.originalAmount;
		}

		public void setOriginalAmount(Float originalAmount) {
			this.originalAmount = originalAmount;
		}

		public Float getDiscountAmount() {
			return this.discountAmount;
		}

		public void setDiscountAmount(Float discountAmount) {
			this.discountAmount = discountAmount;
		}

		public Float getTradeAmount() {
			return this.tradeAmount;
		}

		public void setTradeAmount(Float tradeAmount) {
			this.tradeAmount = tradeAmount;
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

	public static class Rule {

		private Long ruleDescId;

		private String title;

		private String name;

		public Long getRuleDescId() {
			return this.ruleDescId;
		}

		public void setRuleDescId(Long ruleDescId) {
			this.ruleDescId = ruleDescId;
		}

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
	}

	public static class Order {

		private Float originalAmount;

		private Float discountAmount;

		private Float tradeAmount;

		private String currency;

		private List<Coupon> coupons;

		private List<String> ruleIds1;

		public Float getOriginalAmount() {
			return this.originalAmount;
		}

		public void setOriginalAmount(Float originalAmount) {
			this.originalAmount = originalAmount;
		}

		public Float getDiscountAmount() {
			return this.discountAmount;
		}

		public void setDiscountAmount(Float discountAmount) {
			this.discountAmount = discountAmount;
		}

		public Float getTradeAmount() {
			return this.tradeAmount;
		}

		public void setTradeAmount(Float tradeAmount) {
			this.tradeAmount = tradeAmount;
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

			private String description;

			private String isSelected;

			private String couponNo;

			private String name;

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
		}
	}

	@Override
	public DescribeRenewalPriceResponse getInstance(UnmarshallerContext context) {
		return	DescribeRenewalPriceResponseUnmarshaller.unmarshall(this, context);
	}
}
