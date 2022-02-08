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

package com.aliyuncs.market.model.v20151101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.market.transform.v20151101.DescribePriceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePriceResponse extends AcsResponse {

	private String expressionCode;

	private Boolean cuxiao;

	private Float discountPrice;

	private String cycle;

	private Float tradePrice;

	private Float originalPrice;

	private Integer duration;

	private String currency;

	private String expressionMessage;

	private String infoTitle;

	private String productCode;

	private List<PromotionRule> promotionRules;

	private List<Coupon> coupons;

	public String getExpressionCode() {
		return this.expressionCode;
	}

	public void setExpressionCode(String expressionCode) {
		this.expressionCode = expressionCode;
	}

	public Boolean getCuxiao() {
		return this.cuxiao;
	}

	public void setCuxiao(Boolean cuxiao) {
		this.cuxiao = cuxiao;
	}

	public Float getDiscountPrice() {
		return this.discountPrice;
	}

	public void setDiscountPrice(Float discountPrice) {
		this.discountPrice = discountPrice;
	}

	public String getCycle() {
		return this.cycle;
	}

	public void setCycle(String cycle) {
		this.cycle = cycle;
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

	public Integer getDuration() {
		return this.duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getExpressionMessage() {
		return this.expressionMessage;
	}

	public void setExpressionMessage(String expressionMessage) {
		this.expressionMessage = expressionMessage;
	}

	public String getInfoTitle() {
		return this.infoTitle;
	}

	public void setInfoTitle(String infoTitle) {
		this.infoTitle = infoTitle;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public List<PromotionRule> getPromotionRules() {
		return this.promotionRules;
	}

	public void setPromotionRules(List<PromotionRule> promotionRules) {
		this.promotionRules = promotionRules;
	}

	public List<Coupon> getCoupons() {
		return this.coupons;
	}

	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}

	public static class PromotionRule {

		private String title;

		private String name;

		private String ruleId;

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

		public String getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(String ruleId) {
			this.ruleId = ruleId;
		}
	}

	public static class Coupon {

		private String couponOptionCode;

		private String couponOptionNo;

		private String couponName;

		private String couponDesc;

		private Boolean isSelected;

		private Float canPromFee;

		public String getCouponOptionCode() {
			return this.couponOptionCode;
		}

		public void setCouponOptionCode(String couponOptionCode) {
			this.couponOptionCode = couponOptionCode;
		}

		public String getCouponOptionNo() {
			return this.couponOptionNo;
		}

		public void setCouponOptionNo(String couponOptionNo) {
			this.couponOptionNo = couponOptionNo;
		}

		public String getCouponName() {
			return this.couponName;
		}

		public void setCouponName(String couponName) {
			this.couponName = couponName;
		}

		public String getCouponDesc() {
			return this.couponDesc;
		}

		public void setCouponDesc(String couponDesc) {
			this.couponDesc = couponDesc;
		}

		public Boolean getIsSelected() {
			return this.isSelected;
		}

		public void setIsSelected(Boolean isSelected) {
			this.isSelected = isSelected;
		}

		public Float getCanPromFee() {
			return this.canPromFee;
		}

		public void setCanPromFee(Float canPromFee) {
			this.canPromFee = canPromFee;
		}
	}

	@Override
	public DescribePriceResponse getInstance(UnmarshallerContext context) {
		return	DescribePriceResponseUnmarshaller.unmarshall(this, context);
	}
}
