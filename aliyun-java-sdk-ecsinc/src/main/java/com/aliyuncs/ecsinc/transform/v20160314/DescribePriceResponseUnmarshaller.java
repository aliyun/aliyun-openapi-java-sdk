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

package com.aliyuncs.ecsinc.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsinc.model.v20160314.DescribePriceResponse;
import com.aliyuncs.ecsinc.model.v20160314.DescribePriceResponse.PriceInfo;
import com.aliyuncs.ecsinc.model.v20160314.DescribePriceResponse.PriceInfo.Order;
import com.aliyuncs.ecsinc.model.v20160314.DescribePriceResponse.PriceInfo.Order.Coupon;
import com.aliyuncs.ecsinc.model.v20160314.DescribePriceResponse.PriceInfo.PriceWarning;
import com.aliyuncs.ecsinc.model.v20160314.DescribePriceResponse.PriceInfo.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePriceResponseUnmarshaller {

	public static DescribePriceResponse unmarshall(DescribePriceResponse describePriceResponse, UnmarshallerContext context) {
		
		describePriceResponse.setRequestId(context.stringValue("DescribePriceResponse.RequestId"));

		PriceInfo priceInfo = new PriceInfo();

		Order order = new Order();
		order.setOriginalPrice(context.floatValue("DescribePriceResponse.PriceInfo.Order.OriginalPrice"));
		order.setDiscountPrice(context.floatValue("DescribePriceResponse.PriceInfo.Order.DiscountPrice"));
		order.setSpotInstanceTypePrice(context.floatValue("DescribePriceResponse.PriceInfo.Order.SpotInstanceTypePrice"));
		order.setSpotInstanceTypeOriginalPrice(context.floatValue("DescribePriceResponse.PriceInfo.Order.SpotInstanceTypeOriginalPrice"));
		order.setTradePrice(context.floatValue("DescribePriceResponse.PriceInfo.Order.TradePrice"));
		order.setReservedInstanceHourPrice(context.floatValue("DescribePriceResponse.PriceInfo.Order.ReservedInstanceHourPrice"));
		order.setCurrency(context.stringValue("DescribePriceResponse.PriceInfo.Order.Currency"));

		List<String> ruleIdSet = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribePriceResponse.PriceInfo.Order.RuleIdSet.Length"); i++) {
			ruleIdSet.add(context.stringValue("DescribePriceResponse.PriceInfo.Order.RuleIdSet["+ i +"]"));
		}
		order.setRuleIdSet(ruleIdSet);

		List<Coupon> coupons = new ArrayList<Coupon>();
		for (int i = 0; i < context.lengthValue("DescribePriceResponse.PriceInfo.Order.Coupons.Length"); i++) {
			Coupon coupon = new Coupon();
			coupon.setCouponNo(context.stringValue("DescribePriceResponse.PriceInfo.Order.Coupons["+ i +"].CouponNo"));
			coupon.setName(context.stringValue("DescribePriceResponse.PriceInfo.Order.Coupons["+ i +"].Name"));
			coupon.setDescription(context.stringValue("DescribePriceResponse.PriceInfo.Order.Coupons["+ i +"].Description"));
			coupon.setDiscountOff(context.floatValue("DescribePriceResponse.PriceInfo.Order.Coupons["+ i +"].DiscountOff"));
			coupon.setIsSelected(context.booleanValue("DescribePriceResponse.PriceInfo.Order.Coupons["+ i +"].IsSelected"));

			List<String> ruleIdSet1 = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribePriceResponse.PriceInfo.Order.Coupons["+ i +"].RuleIdSet.Length"); j++) {
				ruleIdSet1.add(context.stringValue("DescribePriceResponse.PriceInfo.Order.Coupons["+ i +"].RuleIdSet["+ j +"]"));
			}
			coupon.setRuleIdSet1(ruleIdSet1);

			coupons.add(coupon);
		}
		order.setCoupons(coupons);
		priceInfo.setOrder(order);

		PriceWarning priceWarning = new PriceWarning();
		priceWarning.setCode(context.stringValue("DescribePriceResponse.PriceInfo.PriceWarning.Code"));
		priceWarning.setMsg(context.stringValue("DescribePriceResponse.PriceInfo.PriceWarning.Msg"));
		priceInfo.setPriceWarning(priceWarning);

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < context.lengthValue("DescribePriceResponse.PriceInfo.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleId(context.longValue("DescribePriceResponse.PriceInfo.Rules["+ i +"].RuleId"));
			rule.setTitle(context.stringValue("DescribePriceResponse.PriceInfo.Rules["+ i +"].Title"));
			rule.setName(context.stringValue("DescribePriceResponse.PriceInfo.Rules["+ i +"].Name"));

			rules.add(rule);
		}
		priceInfo.setRules(rules);
		describePriceResponse.setPriceInfo(priceInfo);
	 
	 	return describePriceResponse;
	}
}