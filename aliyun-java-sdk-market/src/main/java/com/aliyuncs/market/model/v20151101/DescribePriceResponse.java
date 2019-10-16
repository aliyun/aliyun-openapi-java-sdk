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

	private String productCode;

	private Float originalPrice;

	private Float tradePrice;

	private Float discountPrice;

	private Boolean cuxiao;

	private Integer duration;

	private String cycle;

	private String infoTitle;

	private String expressionCode;

	private String currency;

	private List<PromotionRule> promotionRules;

	private List<Coupon> coupons;

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
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

	public Float getDiscountPrice() {
		return this.discountPrice;
	}

	public void setDiscountPrice(Float discountPrice) {
		this.discountPrice = discountPrice;
	}

	public Boolean getCuxiao() {
		return this.cuxiao;
	}

	public void setCuxiao(Boolean cuxiao) {
		this.cuxiao = cuxiao;
	}

	public Integer getDuration() {
		return this.duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getCycle() {
		return this.cycle;
	}

	public void setCycle(String cycle) {
		this.cycle = cycle;
	}

	public String getInfoTitle() {
		return this.infoTitle;
	}

	public void setInfoTitle(String infoTitle) {
		this.infoTitle = infoTitle;
	}

	public String getExpressionCode() {
		return this.expressionCode;
	}

	public void setExpressionCode(String expressionCode) {
		this.expressionCode = expressionCode;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
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

		private String ruleId;

		private String name;

		private String title;

		public String getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(String ruleId) {
			this.ruleId = ruleId;
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

	public static class Coupon {

		private String couponOptionCode;

		private String couponOptionNo;

		private String couponName;

		private String couponDesc;

		private Float canPromFee;

		private Boolean isSelected;

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

		public Float getCanPromFee() {
			return this.canPromFee;
		}

		public void setCanPromFee(Float canPromFee) {
			this.canPromFee = canPromFee;
		}

		public Boolean getIsSelected() {
			return this.isSelected;
		}

		public void setIsSelected(Boolean isSelected) {
			this.isSelected = isSelected;
		}
	}

	@Override
	public DescribePriceResponse getInstance(UnmarshallerContext context) {
		return	DescribePriceResponseUnmarshaller.unmarshall(this, context);
	}
}
