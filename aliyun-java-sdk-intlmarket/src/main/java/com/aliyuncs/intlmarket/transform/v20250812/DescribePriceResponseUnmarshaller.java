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

package com.aliyuncs.intlmarket.transform.v20250812;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.intlmarket.model.v20250812.DescribePriceResponse;
import com.aliyuncs.intlmarket.model.v20250812.DescribePriceResponse.Coupon;
import com.aliyuncs.intlmarket.model.v20250812.DescribePriceResponse.PromotionRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePriceResponseUnmarshaller {

	public static DescribePriceResponse unmarshall(DescribePriceResponse describePriceResponse, UnmarshallerContext _ctx) {
		
		describePriceResponse.setRequestId(_ctx.stringValue("DescribePriceResponse.RequestId"));
		describePriceResponse.setExpressionCode(_ctx.stringValue("DescribePriceResponse.ExpressionCode"));
		describePriceResponse.setOriginalPrice(_ctx.floatValue("DescribePriceResponse.OriginalPrice"));
		describePriceResponse.setProductCode(_ctx.stringValue("DescribePriceResponse.ProductCode"));
		describePriceResponse.setDuration(_ctx.integerValue("DescribePriceResponse.Duration"));
		describePriceResponse.setCuxiao(_ctx.booleanValue("DescribePriceResponse.Cuxiao"));
		describePriceResponse.setTradePrice(_ctx.floatValue("DescribePriceResponse.TradePrice"));
		describePriceResponse.setCycle(_ctx.stringValue("DescribePriceResponse.Cycle"));
		describePriceResponse.setInfoTitle(_ctx.stringValue("DescribePriceResponse.InfoTitle"));
		describePriceResponse.setDiscountPrice(_ctx.floatValue("DescribePriceResponse.DiscountPrice"));
		describePriceResponse.setCurrency(_ctx.stringValue("DescribePriceResponse.Currency"));
		describePriceResponse.setExpressionMessage(_ctx.stringValue("DescribePriceResponse.ExpressionMessage"));
		describePriceResponse.setCode(_ctx.stringValue("DescribePriceResponse.Code"));
		describePriceResponse.setMessage(_ctx.stringValue("DescribePriceResponse.Message"));

		List<PromotionRule> promotionRules = new ArrayList<PromotionRule>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.PromotionRules.Length"); i++) {
			PromotionRule promotionRule = new PromotionRule();
			promotionRule.setRuleId(_ctx.stringValue("DescribePriceResponse.PromotionRules["+ i +"].RuleId"));
			promotionRule.setTitle(_ctx.stringValue("DescribePriceResponse.PromotionRules["+ i +"].Title"));
			promotionRule.setName(_ctx.stringValue("DescribePriceResponse.PromotionRules["+ i +"].Name"));

			promotionRules.add(promotionRule);
		}
		describePriceResponse.setPromotionRules(promotionRules);

		List<Coupon> coupons = new ArrayList<Coupon>();
		for (int i = 0; i < _ctx.lengthValue("DescribePriceResponse.Coupons.Length"); i++) {
			Coupon coupon = new Coupon();
			coupon.setCouponOptionNo(_ctx.stringValue("DescribePriceResponse.Coupons["+ i +"].CouponOptionNo"));
			coupon.setPromotionDesc(_ctx.stringValue("DescribePriceResponse.Coupons["+ i +"].PromotionDesc"));
			coupon.setCouponName(_ctx.stringValue("DescribePriceResponse.Coupons["+ i +"].CouponName"));
			coupon.setCanPromFee(_ctx.longValue("DescribePriceResponse.Coupons["+ i +"].CanPromFee"));
			coupon.setCouponDesc(_ctx.stringValue("DescribePriceResponse.Coupons["+ i +"].CouponDesc"));
			coupon.setIsSelected(_ctx.booleanValue("DescribePriceResponse.Coupons["+ i +"].IsSelected"));
			coupon.setCouponOptionCode(_ctx.stringValue("DescribePriceResponse.Coupons["+ i +"].CouponOptionCode"));

			coupons.add(coupon);
		}
		describePriceResponse.setCoupons(coupons);
	 
	 	return describePriceResponse;
	}
}