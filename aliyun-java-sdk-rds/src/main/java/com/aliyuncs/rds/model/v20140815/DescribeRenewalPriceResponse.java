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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeRenewalPriceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRenewalPriceResponse extends AcsResponse {

	private String requestId;

	private List<Rule> rules;

	private PriceInfo priceInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Rule> getRules() {
		return this.rules;
	}

	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}

	public PriceInfo getPriceInfo() {
		return this.priceInfo;
	}

	public void setPriceInfo(PriceInfo priceInfo) {
		this.priceInfo = priceInfo;
	}

	public static class Rule {

		private String description;

		private String name;

		private Long ruleId;

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

		public Long getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(Long ruleId) {
			this.ruleId = ruleId;
		}
	}

	public static class PriceInfo {

		private String currency;

		private Float discountPrice;

		private Float originalPrice;

		private Float tradePrice;

		private List<Coupon> coupons;

		private List<String> ruleIds;

		private ActivityInfo activityInfo;

		public String getCurrency() {
			return this.currency;
		}

		public void setCurrency(String currency) {
			this.currency = currency;
		}

		public Float getDiscountPrice() {
			return this.discountPrice;
		}

		public void setDiscountPrice(Float discountPrice) {
			this.discountPrice = discountPrice;
		}

		public Float getOriginalPrice() {
			return this.originalPrice;
		}

		public void setOriginalPrice(Float originalPrice) {
			this.originalPrice = originalPrice;
		}

		public Float getTradePrice() {
			return this.tradePrice;
		}

		public void setTradePrice(Float tradePrice) {
			this.tradePrice = tradePrice;
		}

		public List<Coupon> getCoupons() {
			return this.coupons;
		}

		public void setCoupons(List<Coupon> coupons) {
			this.coupons = coupons;
		}

		public List<String> getRuleIds() {
			return this.ruleIds;
		}

		public void setRuleIds(List<String> ruleIds) {
			this.ruleIds = ruleIds;
		}

		public ActivityInfo getActivityInfo() {
			return this.activityInfo;
		}

		public void setActivityInfo(ActivityInfo activityInfo) {
			this.activityInfo = activityInfo;
		}

		public static class Coupon {

			private String couponNo;

			private String description;

			private String isSelected;

			private String name;

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

			public String getIsSelected() {
				return this.isSelected;
			}

			public void setIsSelected(String isSelected) {
				this.isSelected = isSelected;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class ActivityInfo {

			private String checkErrMsg;

			private String errorCode;

			private String success;

			public String getCheckErrMsg() {
				return this.checkErrMsg;
			}

			public void setCheckErrMsg(String checkErrMsg) {
				this.checkErrMsg = checkErrMsg;
			}

			public String getErrorCode() {
				return this.errorCode;
			}

			public void setErrorCode(String errorCode) {
				this.errorCode = errorCode;
			}

			public String getSuccess() {
				return this.success;
			}

			public void setSuccess(String success) {
				this.success = success;
			}
		}
	}

	@Override
	public DescribeRenewalPriceResponse getInstance(UnmarshallerContext context) {
		return	DescribeRenewalPriceResponseUnmarshaller.unmarshall(this, context);
	}
}
