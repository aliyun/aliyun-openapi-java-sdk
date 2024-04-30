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
import com.aliyuncs.rds.transform.v20140815.DescribePriceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePriceResponse extends AcsResponse {

	private String orderParams;

	private String requestId;

	private Boolean showDiscount;

	private Float tradeMaxRCUAmount;

	private Float tradeMinRCUAmount;

	private List<Rule> rules;

	private PriceInfo priceInfo;

	private ServerlessPrice serverlessPrice;

	public String getOrderParams() {
		return this.orderParams;
	}

	public void setOrderParams(String orderParams) {
		this.orderParams = orderParams;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getShowDiscount() {
		return this.showDiscount;
	}

	public void setShowDiscount(Boolean showDiscount) {
		this.showDiscount = showDiscount;
	}

	public Float getTradeMaxRCUAmount() {
		return this.tradeMaxRCUAmount;
	}

	public void setTradeMaxRCUAmount(Float tradeMaxRCUAmount) {
		this.tradeMaxRCUAmount = tradeMaxRCUAmount;
	}

	public Float getTradeMinRCUAmount() {
		return this.tradeMinRCUAmount;
	}

	public void setTradeMinRCUAmount(Float tradeMinRCUAmount) {
		this.tradeMinRCUAmount = tradeMinRCUAmount;
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

	public ServerlessPrice getServerlessPrice() {
		return this.serverlessPrice;
	}

	public void setServerlessPrice(ServerlessPrice serverlessPrice) {
		this.serverlessPrice = serverlessPrice;
	}

	public static class Rule {

		private String name;

		private String description;

		private Long ruleId;

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

		public Long getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(Long ruleId) {
			this.ruleId = ruleId;
		}
	}

	public static class PriceInfo {

		private Float originalPrice;

		private Float discountPrice;

		private String currency;

		private Float tradePrice;

		private Float tradeMinRCUAmount;

		private Float tradeMaxRCUAmount;

		private String orderLines;

		private List<Coupon> coupons;

		private List<String> ruleIds;

		private ActivityInfo activityInfo;

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

		public String getCurrency() {
			return this.currency;
		}

		public void setCurrency(String currency) {
			this.currency = currency;
		}

		public Float getTradePrice() {
			return this.tradePrice;
		}

		public void setTradePrice(Float tradePrice) {
			this.tradePrice = tradePrice;
		}

		public Float getTradeMinRCUAmount() {
			return this.tradeMinRCUAmount;
		}

		public void setTradeMinRCUAmount(Float tradeMinRCUAmount) {
			this.tradeMinRCUAmount = tradeMinRCUAmount;
		}

		public Float getTradeMaxRCUAmount() {
			return this.tradeMaxRCUAmount;
		}

		public void setTradeMaxRCUAmount(Float tradeMaxRCUAmount) {
			this.tradeMaxRCUAmount = tradeMaxRCUAmount;
		}

		public String getOrderLines() {
			return this.orderLines;
		}

		public void setOrderLines(String orderLines) {
			this.orderLines = orderLines;
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

			private String isSelected;

			private String couponNo;

			private String name;

			private String description;

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

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
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

	public static class ServerlessPrice {

		private Float totalOriginalMinAmount;

		private Float totalOriginalMaxAmount;

		private Float rCUOriginalMinAmount;

		private Float rCUOriginalMaxAmount;

		private Float rCUDiscountMinAmount;

		private Float rCUDiscountMaxAmount;

		private Float tradeMinRCUAmount;

		private Float tradeMaxRCUAmount;

		private Float storageOriginalAmount;

		private Float storageDiscountAmount;

		public Float getTotalOriginalMinAmount() {
			return this.totalOriginalMinAmount;
		}

		public void setTotalOriginalMinAmount(Float totalOriginalMinAmount) {
			this.totalOriginalMinAmount = totalOriginalMinAmount;
		}

		public Float getTotalOriginalMaxAmount() {
			return this.totalOriginalMaxAmount;
		}

		public void setTotalOriginalMaxAmount(Float totalOriginalMaxAmount) {
			this.totalOriginalMaxAmount = totalOriginalMaxAmount;
		}

		public Float getRCUOriginalMinAmount() {
			return this.rCUOriginalMinAmount;
		}

		public void setRCUOriginalMinAmount(Float rCUOriginalMinAmount) {
			this.rCUOriginalMinAmount = rCUOriginalMinAmount;
		}

		public Float getRCUOriginalMaxAmount() {
			return this.rCUOriginalMaxAmount;
		}

		public void setRCUOriginalMaxAmount(Float rCUOriginalMaxAmount) {
			this.rCUOriginalMaxAmount = rCUOriginalMaxAmount;
		}

		public Float getRCUDiscountMinAmount() {
			return this.rCUDiscountMinAmount;
		}

		public void setRCUDiscountMinAmount(Float rCUDiscountMinAmount) {
			this.rCUDiscountMinAmount = rCUDiscountMinAmount;
		}

		public Float getRCUDiscountMaxAmount() {
			return this.rCUDiscountMaxAmount;
		}

		public void setRCUDiscountMaxAmount(Float rCUDiscountMaxAmount) {
			this.rCUDiscountMaxAmount = rCUDiscountMaxAmount;
		}

		public Float getTradeMinRCUAmount() {
			return this.tradeMinRCUAmount;
		}

		public void setTradeMinRCUAmount(Float tradeMinRCUAmount) {
			this.tradeMinRCUAmount = tradeMinRCUAmount;
		}

		public Float getTradeMaxRCUAmount() {
			return this.tradeMaxRCUAmount;
		}

		public void setTradeMaxRCUAmount(Float tradeMaxRCUAmount) {
			this.tradeMaxRCUAmount = tradeMaxRCUAmount;
		}

		public Float getStorageOriginalAmount() {
			return this.storageOriginalAmount;
		}

		public void setStorageOriginalAmount(Float storageOriginalAmount) {
			this.storageOriginalAmount = storageOriginalAmount;
		}

		public Float getStorageDiscountAmount() {
			return this.storageDiscountAmount;
		}

		public void setStorageDiscountAmount(Float storageDiscountAmount) {
			this.storageDiscountAmount = storageDiscountAmount;
		}
	}

	@Override
	public DescribePriceResponse getInstance(UnmarshallerContext context) {
		return	DescribePriceResponseUnmarshaller.unmarshall(this, context);
	}
}
